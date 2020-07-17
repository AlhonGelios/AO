package org.apache.xmlbeans.impl.jam.internal.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.xmlbeans.impl.jam.internal.elements.ElementContext;
import org.apache.xmlbeans.impl.jam.internal.reflect.ReflectTigerDelegate;
import org.apache.xmlbeans.impl.jam.mutable.MClass;
import org.apache.xmlbeans.impl.jam.mutable.MConstructor;
import org.apache.xmlbeans.impl.jam.mutable.MField;
import org.apache.xmlbeans.impl.jam.mutable.MInvokable;
import org.apache.xmlbeans.impl.jam.mutable.MMember;
import org.apache.xmlbeans.impl.jam.mutable.MMethod;
import org.apache.xmlbeans.impl.jam.mutable.MParameter;
import org.apache.xmlbeans.impl.jam.provider.JamClassBuilder;
import org.apache.xmlbeans.impl.jam.provider.JamClassPopulator;

public class ReflectClassBuilder extends JamClassBuilder implements JamClassPopulator {

   private ClassLoader mLoader;
   private ReflectTigerDelegate mTigerDelegate = null;


   public ReflectClassBuilder(ClassLoader rcl) {
      if(rcl == null) {
         throw new IllegalArgumentException("null rcl");
      } else {
         this.mLoader = rcl;
      }
   }

   public void init(ElementContext ctx) {
      super.init(ctx);
      this.initDelegate(ctx);
   }

   public MClass build(String packageName, String className) {
      this.assertInitialized();
      if(this.getLogger().isVerbose((Object)this)) {
         this.getLogger().verbose("trying to build \'" + packageName + "\' \'" + className + "\'");
      }

      Class rclass;
      try {
         String out = packageName.trim().length() > 0?packageName + '.' + className:className;
         rclass = this.mLoader.loadClass(out);
      } catch (ClassNotFoundException var5) {
         this.getLogger().verbose((Throwable)var5, this);
         return null;
      }

      MClass out1 = this.createClassToBuild(packageName, className, (String[])null, this);
      out1.setArtifact(rclass);
      return out1;
   }

   public void populate(MClass dest) {
      this.assertInitialized();
      Class src = (Class)dest.getArtifact();
      dest.setModifiers(src.getModifiers());
      dest.setIsInterface(src.isInterface());
      if(this.mTigerDelegate != null) {
         dest.setIsEnumType(this.mTigerDelegate.isEnum(src));
      }

      Class s = src.getSuperclass();
      if(s != null) {
         dest.setSuperclass(s.getName());
      }

      Class[] ints = src.getInterfaces();

      for(int fields = 0; fields < ints.length; ++fields) {
         dest.addInterface(ints[fields].getName());
      }

      Field[] var14 = null;

      try {
         var14 = src.getFields();
      } catch (Exception var13) {
         ;
      }

      if(var14 != null) {
         for(int methods = 0; methods < var14.length; ++methods) {
            this.populate(dest.addNewField(), var14[methods]);
         }
      }

      Method[] var15 = src.getDeclaredMethods();

      for(int ctors = 0; ctors < var15.length; ++ctors) {
         this.populate(dest.addNewMethod(), var15[ctors]);
      }

      if(this.mTigerDelegate != null) {
         this.mTigerDelegate.populateAnnotationTypeIfNecessary(src, dest, this);
      }

      Constructor[] var16 = src.getDeclaredConstructors();

      for(int inners = 0; inners < var16.length; ++inners) {
         this.populate(dest.addNewConstructor(), var16[inners]);
      }

      if(this.mTigerDelegate != null) {
         this.mTigerDelegate.extractAnnotations(dest, src);
      }

      Class[] var17 = src.getDeclaredClasses();
      if(var17 != null) {
         for(int i = 0; i < var17.length; ++i) {
            if(this.mTigerDelegate == null || this.mTigerDelegate.getEnclosingConstructor(var17[i]) == null && this.mTigerDelegate.getEnclosingMethod(var17[i]) == null) {
               String simpleName = var17[i].getName();
               int lastDollar = simpleName.lastIndexOf(36);
               simpleName = simpleName.substring(lastDollar + 1);
               char inner = simpleName.charAt(0);
               if(48 > inner || inner > 57) {
                  MClass var18 = dest.addNewInnerClass(simpleName);
                  var18.setArtifact(var17[i]);
                  this.populate(var18);
               }
            }
         }
      }

   }

   private void initDelegate(ElementContext ctx) {
      this.mTigerDelegate = ReflectTigerDelegate.create(ctx);
   }

   private void populate(MField dest, Field src) {
      dest.setArtifact(src);
      dest.setSimpleName(src.getName());
      dest.setType(src.getType().getName());
      dest.setModifiers(src.getModifiers());
      if(this.mTigerDelegate != null) {
         this.mTigerDelegate.extractAnnotations(dest, src);
      }

   }

   private void populate(MConstructor dest, Constructor src) {
      dest.setArtifact(src);
      dest.setSimpleName(src.getName());
      dest.setModifiers(src.getModifiers());
      Class[] exceptions = src.getExceptionTypes();
      this.addThrows(dest, exceptions);
      Class[] paramTypes = src.getParameterTypes();

      for(int i = 0; i < paramTypes.length; ++i) {
         MParameter p = this.addParameter(dest, i, paramTypes[i]);
         if(this.mTigerDelegate != null) {
            this.mTigerDelegate.extractAnnotations(p, src, i);
         }
      }

      if(this.mTigerDelegate != null) {
         this.mTigerDelegate.extractAnnotations(dest, src);
      }

   }

   private void populate(MMethod dest, Method src) {
      dest.setArtifact(src);
      dest.setSimpleName(src.getName());
      dest.setModifiers(src.getModifiers());
      dest.setReturnType(src.getReturnType().getName());
      Class[] exceptions = src.getExceptionTypes();
      this.addThrows(dest, exceptions);
      Class[] paramTypes = src.getParameterTypes();

      for(int i = 0; i < paramTypes.length; ++i) {
         MParameter p = this.addParameter(dest, i, paramTypes[i]);
         if(this.mTigerDelegate != null) {
            this.mTigerDelegate.extractAnnotations(p, src, i);
         }
      }

      if(this.mTigerDelegate != null) {
         this.mTigerDelegate.extractAnnotations((MMember)dest, src);
      }

   }

   private void addThrows(MInvokable dest, Class[] exceptionTypes) {
      for(int i = 0; i < exceptionTypes.length; ++i) {
         dest.addException(exceptionTypes[i].getName());
      }

   }

   private MParameter addParameter(MInvokable dest, int paramNum, Class paramType) {
      MParameter p = dest.addNewParameter();
      p.setSimpleName("param" + paramNum);
      p.setType(paramType.getName());
      return p;
   }
}
