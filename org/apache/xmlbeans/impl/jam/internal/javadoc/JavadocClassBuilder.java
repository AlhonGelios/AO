package org.apache.xmlbeans.impl.jam.internal.javadoc;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.ConstructorDoc;
import com.sun.javadoc.Doc;
import com.sun.javadoc.ExecutableMemberDoc;
import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.PackageDoc;
import com.sun.javadoc.Parameter;
import com.sun.javadoc.ProgramElementDoc;
import com.sun.javadoc.RootDoc;
import com.sun.javadoc.SourcePosition;
import com.sun.javadoc.Tag;
import com.sun.javadoc.Type;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.apache.xmlbeans.impl.jam.annotation.JavadocTagParser;
import org.apache.xmlbeans.impl.jam.internal.JamServiceContextImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.ElementContext;
import org.apache.xmlbeans.impl.jam.internal.elements.PrimitiveClassImpl;
import org.apache.xmlbeans.impl.jam.internal.javadoc.JavadocRunner;
import org.apache.xmlbeans.impl.jam.internal.javadoc.JavadocTigerDelegate;
import org.apache.xmlbeans.impl.jam.mutable.MAnnotatedElement;
import org.apache.xmlbeans.impl.jam.mutable.MClass;
import org.apache.xmlbeans.impl.jam.mutable.MElement;
import org.apache.xmlbeans.impl.jam.mutable.MField;
import org.apache.xmlbeans.impl.jam.mutable.MInvokable;
import org.apache.xmlbeans.impl.jam.mutable.MMethod;
import org.apache.xmlbeans.impl.jam.mutable.MParameter;
import org.apache.xmlbeans.impl.jam.mutable.MSourcePosition;
import org.apache.xmlbeans.impl.jam.provider.JamClassBuilder;
import org.apache.xmlbeans.impl.jam.provider.JamClassPopulator;
import org.apache.xmlbeans.impl.jam.provider.JamServiceContext;

public class JavadocClassBuilder extends JamClassBuilder implements JamClassPopulator {

   public static final String ARGS_PROPERTY = "javadoc.args";
   public static final String PARSETAGS_PROPERTY = "javadoc.parsetags";
   private RootDoc mRootDoc = null;
   private JavadocTigerDelegate mTigerDelegate = null;
   private JavadocTagParser mTagParser = null;
   private boolean mParseTags = true;


   public void init(ElementContext ctx) {
      if(ctx == null) {
         throw new IllegalArgumentException("null context");
      } else {
         super.init(ctx);
         this.getLogger().verbose("init()", this);
         this.initDelegate(ctx);
         this.initJavadoc((JamServiceContext)ctx);
      }
   }

   public MClass build(String packageName, String className) {
      this.assertInitialized();
      if(this.getLogger().isVerbose((Object)this)) {
         this.getLogger().verbose("trying to build \'" + packageName + "\' \'" + className + "\'");
      }

      String loadme = packageName.trim().length() > 0?packageName + '.' + className:className;
      ClassDoc cd = this.mRootDoc.classNamed(loadme);
      if(cd == null) {
         if(this.getLogger().isVerbose((Object)this)) {
            this.getLogger().verbose("no ClassDoc for " + loadme);
         }

         return null;
      } else {
         ArrayList importSpecs = null;
         ClassDoc[] importSpecsArray = cd.importedClasses();
         int out;
         if(importSpecsArray != null) {
            importSpecs = new ArrayList();

            for(out = 0; out < importSpecsArray.length; ++out) {
               importSpecs.add(getFdFor(importSpecsArray[out]));
            }
         }

         PackageDoc[] var8 = cd.importedPackages();
         if(var8 != null) {
            if(importSpecs == null) {
               importSpecs = new ArrayList();
            }

            for(out = 0; out < var8.length; ++out) {
               importSpecs.add(var8[out].name() + ".*");
            }
         }

         String[] var9 = null;
         if(importSpecs != null) {
            var9 = new String[importSpecs.size()];
            importSpecs.toArray(var9);
         }

         MClass var10 = this.createClassToBuild(packageName, className, var9, this);
         var10.setArtifact(cd);
         return var10;
      }
   }

   public void populate(MClass dest) {
      if(dest == null) {
         throw new IllegalArgumentException("null dest");
      } else {
         this.assertInitialized();
         ClassDoc src = (ClassDoc)dest.getArtifact();
         if(src == null) {
            throw new IllegalStateException("null artifact");
         } else {
            dest.setModifiers(src.modifierSpecifier());
            dest.setIsInterface(src.isInterface());
            if(this.mTigerDelegate != null) {
               dest.setIsEnumType(this.mTigerDelegate.isEnum(src));
            }

            ClassDoc s = src.superclass();
            if(s != null) {
               dest.setSuperclass(getFdFor(s));
            }

            ClassDoc[] ints = src.interfaces();

            for(int fields = 0; fields < ints.length; ++fields) {
               dest.addInterface(getFdFor(ints[fields]));
            }

            FieldDoc[] var11 = src.fields();

            for(int ctors = 0; ctors < var11.length; ++ctors) {
               this.populate(dest.addNewField(), var11[ctors]);
            }

            ConstructorDoc[] var12 = src.constructors();

            for(int methods = 0; methods < var12.length; ++methods) {
               this.populate((MInvokable)dest.addNewConstructor(), (ExecutableMemberDoc)var12[methods]);
            }

            MethodDoc[] var13 = src.methods();

            for(int inners = 0; inners < var13.length; ++inners) {
               this.populate(dest.addNewMethod(), var13[inners]);
            }

            if(this.mTigerDelegate != null) {
               this.mTigerDelegate.populateAnnotationTypeIfNecessary(src, dest, this);
            }

            this.addAnnotations(dest, src);
            addSourcePosition(dest, (Doc)src);
            ClassDoc[] var14 = src.innerClasses();
            if(var14 != null) {
               for(int i = 0; i < var14.length; ++i) {
                  MClass inner = dest.addNewInnerClass(var14[i].typeName());
                  inner.setArtifact(var14[i]);
                  this.populate(inner);
               }
            }

         }
      }
   }

   public MMethod addMethod(MClass dest, MethodDoc doc) {
      MMethod out = dest.addNewMethod();
      this.populate(out, doc);
      return out;
   }

   private void initDelegate(ElementContext ctx) {
      this.mTigerDelegate = JavadocTigerDelegate.create(ctx);
   }

   private void initJavadoc(JamServiceContext serviceContext) {
      this.mTagParser = serviceContext.getTagParser();
      String pct = serviceContext.getProperty("javadoc.parsetags");
      if(pct != null) {
         this.mParseTags = Boolean.valueOf(pct).booleanValue();
         this.getLogger().verbose("mParseTags=" + this.mParseTags, this);
      }

      File[] files;
      try {
         files = serviceContext.getSourceFiles();
      } catch (IOException var10) {
         this.getLogger().error((Throwable)var10);
         return;
      }

      if(files != null && files.length != 0) {
         String sourcePath = serviceContext.getInputSourcepath() == null?null:serviceContext.getInputSourcepath().toString();
         String classPath = serviceContext.getInputClasspath() == null?null:serviceContext.getInputClasspath().toString();
         if(this.getLogger().isVerbose((Object)this)) {
            this.getLogger().verbose("sourcePath =" + sourcePath);
            this.getLogger().verbose("classPath =" + classPath);

            for(int jdr = 0; jdr < files.length; ++jdr) {
               this.getLogger().verbose("including \'" + files[jdr] + "\'");
            }
         }

         JavadocRunner var13 = JavadocRunner.newInstance();

         try {
            PrintWriter e = null;
            if(this.getLogger().isVerbose((Object)this)) {
               e = new PrintWriter(System.out);
            }

            this.mRootDoc = var13.run(files, e, sourcePath, classPath, this.getJavadocArgs(serviceContext), this.getLogger());
            if(this.mRootDoc == null) {
               this.getLogger().error("Javadoc returned a null root");
            } else {
               if(this.getLogger().isVerbose((Object)this)) {
                  this.getLogger().verbose(" received " + this.mRootDoc.classes().length + " ClassDocs from javadoc: ");
               }

               ClassDoc[] classes = this.mRootDoc.classes();

               for(int i = 0; i < classes.length; ++i) {
                  if(classes[i].containingClass() == null) {
                     if(this.getLogger().isVerbose((Object)this)) {
                        this.getLogger().verbose("..." + classes[i].qualifiedName());
                     }

                     ((JamServiceContextImpl)serviceContext).includeClass(getFdFor(classes[i]));
                  }
               }
            }
         } catch (FileNotFoundException var11) {
            this.getLogger().error((Throwable)var11);
         } catch (IOException var12) {
            this.getLogger().error((Throwable)var12);
         }

      } else {
         throw new IllegalArgumentException("No source files in context.");
      }
   }

   private void populate(MField dest, FieldDoc src) {
      dest.setArtifact(src);
      dest.setSimpleName(src.name());
      dest.setType(getFdFor(src.type()));
      dest.setModifiers(src.modifierSpecifier());
      this.addAnnotations(dest, src);
      addSourcePosition(dest, (Doc)src);
   }

   private void populate(MMethod dest, MethodDoc src) {
      if(dest == null) {
         throw new IllegalArgumentException("null dest");
      } else if(src == null) {
         throw new IllegalArgumentException("null src");
      } else {
         this.populate((MInvokable)dest, (ExecutableMemberDoc)src);
         dest.setReturnType(getFdFor(src.returnType()));
      }
   }

   private void populate(MInvokable dest, ExecutableMemberDoc src) {
      if(dest == null) {
         throw new IllegalArgumentException("null dest");
      } else if(src == null) {
         throw new IllegalArgumentException("null src");
      } else {
         dest.setArtifact(src);
         dest.setSimpleName(src.name());
         dest.setModifiers(src.modifierSpecifier());
         ClassDoc[] exceptions = src.thrownExceptions();

         for(int params = 0; params < exceptions.length; ++params) {
            dest.addException(getFdFor(exceptions[params]));
         }

         Parameter[] var6 = src.parameters();

         for(int i = 0; i < var6.length; ++i) {
            this.populate(dest.addNewParameter(), src, var6[i]);
         }

         this.addAnnotations(dest, src);
         addSourcePosition(dest, (Doc)src);
      }
   }

   private void populate(MParameter dest, ExecutableMemberDoc method, Parameter src) {
      dest.setArtifact(src);
      dest.setSimpleName(src.name());
      dest.setType(getFdFor(src.type()));
      if(this.mTigerDelegate != null) {
         this.mTigerDelegate.extractAnnotations(dest, method, src);
      }

   }

   private String[] getJavadocArgs(JamServiceContext ctx) {
      String prop = ctx.getProperty("javadoc.args");
      if(prop == null) {
         return null;
      } else {
         StringTokenizer t = new StringTokenizer(prop);
         String[] out = new String[t.countTokens()];

         for(int i = 0; t.hasMoreTokens(); out[i++] = t.nextToken()) {
            ;
         }

         return out;
      }
   }

   private void addAnnotations(MAnnotatedElement dest, ProgramElementDoc src) {
      String comments = src.commentText();
      if(comments != null) {
         dest.createComment().setText(comments);
      }

      Tag[] tags = src.tags();

      for(int i = 0; i < tags.length; ++i) {
         if(this.getLogger().isVerbose((Object)this)) {
            this.getLogger().verbose("...\'" + tags[i].name() + "\' \' " + tags[i].text());
         }

         this.mTagParser.parse(dest, tags[i]);
      }

      if(this.mTigerDelegate != null) {
         this.mTigerDelegate.extractAnnotations(dest, src);
      }

   }

   public static String getFdFor(Type t) {
      if(t == null) {
         throw new IllegalArgumentException("null type");
      } else {
         String dim = t.dimension();
         if(dim != null && dim.length() != 0) {
            StringWriter var5 = new StringWriter();
            int var6 = 0;

            for(int var8 = dim.length() / 2; var6 < var8; ++var6) {
               var5.write("[");
            }

            String var7 = PrimitiveClassImpl.getPrimitiveClassForName(t.qualifiedTypeName());
            if(var7 != null) {
               var5.write(var7);
            } else {
               var5.write("L");
               if(t.asClassDoc() != null) {
                  var5.write(t.asClassDoc().qualifiedName());
               } else {
                  var5.write(t.qualifiedTypeName());
               }

               var5.write(";");
            }

            return var5.toString();
         } else {
            ClassDoc out = t.asClassDoc();
            if(out != null) {
               ClassDoc primFd = out.containingClass();
               if(primFd == null) {
                  return out.qualifiedName();
               } else {
                  String iL = out.name();
                  iL = iL.substring(iL.lastIndexOf(46) + 1);
                  return primFd.qualifiedName() + '$' + iL;
               }
            } else {
               return t.qualifiedTypeName();
            }
         }
      }
   }

   public static void addSourcePosition(MElement dest, Doc src) {
      SourcePosition pos = src.position();
      if(pos != null) {
         addSourcePosition(dest, pos);
      }

   }

   public static void addSourcePosition(MElement dest, SourcePosition pos) {
      MSourcePosition sp = dest.createSourcePosition();
      sp.setColumn(pos.column());
      sp.setLine(pos.line());
      File f = pos.file();
      if(f != null) {
         sp.setSourceURI(f.toURI());
      }

   }
}
