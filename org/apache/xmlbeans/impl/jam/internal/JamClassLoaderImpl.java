package org.apache.xmlbeans.impl.jam.internal;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JPackage;
import org.apache.xmlbeans.impl.jam.JamClassLoader;
import org.apache.xmlbeans.impl.jam.internal.elements.ArrayClassImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.ClassImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.ElementContext;
import org.apache.xmlbeans.impl.jam.internal.elements.PackageImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.PrimitiveClassImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.UnresolvedClassImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.VoidClassImpl;
import org.apache.xmlbeans.impl.jam.mutable.MClass;
import org.apache.xmlbeans.impl.jam.provider.JamClassBuilder;
import org.apache.xmlbeans.impl.jam.visitor.MVisitor;
import org.apache.xmlbeans.impl.jam.visitor.TraversingMVisitor;

public class JamClassLoaderImpl implements JamClassLoader {

   private Map mName2Package = new HashMap();
   private Map mFd2ClassCache = new HashMap();
   private JamClassBuilder mBuilder;
   private MVisitor mInitializer = null;
   private ElementContext mContext;
   private Stack mInitializeStack = new Stack();
   private boolean mAlreadyInitializing = false;


   public JamClassLoaderImpl(ElementContext context, JamClassBuilder builder, MVisitor initializerOrNull) {
      if(builder == null) {
         throw new IllegalArgumentException("null builder");
      } else if(context == null) {
         throw new IllegalArgumentException("null builder");
      } else {
         this.mBuilder = builder;
         this.mInitializer = initializerOrNull == null?null:new TraversingMVisitor(initializerOrNull);
         this.mContext = context;
         this.initCache();
      }
   }

   public final JClass loadClass(String fd) {
      fd = fd.trim();
      JClass out = this.cacheGet(fd);
      if(out != null) {
         return out;
      } else if(fd.indexOf(91) != -1) {
         String dot1 = ArrayClassImpl.normalizeArrayName(fd);
         out = this.cacheGet(dot1);
         if(out == null) {
            out = ArrayClassImpl.createClassForFD(dot1, this);
            this.cachePut(out, dot1);
         }

         this.cachePut(out, fd);
         return out;
      } else {
         int dot = fd.indexOf(36);
         String pkg;
         if(dot != -1) {
            pkg = fd.substring(0, dot);
            ((ClassImpl)this.loadClass(pkg)).ensureLoaded();
            Object out3 = this.cacheGet(fd);
            int name2 = fd.lastIndexOf(46);
            if(out3 == null) {
               String pkg1;
               String name1;
               if(name2 == -1) {
                  pkg1 = "";
                  name1 = fd;
               } else {
                  pkg1 = fd.substring(0, name2);
                  name1 = fd.substring(name2 + 1);
               }

               out3 = new UnresolvedClassImpl(pkg1, name1, this.mContext);
               this.mContext.warning("failed to resolve class " + fd);
               this.cachePut((JClass)out3);
            }

            return (JClass)out3;
         } else {
            dot = fd.lastIndexOf(46);
            String name;
            if(dot == -1) {
               pkg = "";
               name = fd;
            } else {
               pkg = fd.substring(0, dot);
               name = fd.substring(dot + 1);
            }

            MClass out1 = this.mBuilder.build(pkg, name);
            if(out1 == null) {
               UnresolvedClassImpl out2 = new UnresolvedClassImpl(pkg, name, this.mContext);
               this.mContext.warning("failed to resolve class " + fd);
               this.cachePut(out2);
               return out2;
            } else {
               this.cachePut(out1);
               return out1;
            }
         }
      }
   }

   public JPackage getPackage(String named) {
      Object out = (JPackage)this.mName2Package.get(named);
      if(out == null) {
         out = new PackageImpl(this.mContext, named);
         this.mName2Package.put(named, out);
      }

      return (JPackage)out;
   }

   private void initCache() {
      PrimitiveClassImpl.mapNameToPrimitive(this.mContext, this.mFd2ClassCache);
      this.mFd2ClassCache.put("void", new VoidClassImpl(this.mContext));
   }

   private void cachePut(JClass clazz) {
      this.mFd2ClassCache.put(clazz.getFieldDescriptor().trim(), new WeakReference(clazz));
   }

   private void cachePut(JClass clazz, String cachedName) {
      this.mFd2ClassCache.put(cachedName, new WeakReference(clazz));
   }

   private JClass cacheGet(String fd) {
      Object out = this.mFd2ClassCache.get(fd.trim());
      if(out == null) {
         return null;
      } else if(out instanceof JClass) {
         return (JClass)out;
      } else if(out instanceof WeakReference) {
         out = ((WeakReference)out).get();
         if(out == null) {
            this.mFd2ClassCache.remove(fd.trim());
            return null;
         } else {
            return (JClass)out;
         }
      } else {
         throw new IllegalStateException();
      }
   }

   public void initialize(ClassImpl out) {
      if(this.mInitializer != null) {
         if(this.mAlreadyInitializing) {
            this.mInitializeStack.push(out);
         } else {
            out.accept(this.mInitializer);

            while(!this.mInitializeStack.isEmpty()) {
               ClassImpl initme = (ClassImpl)this.mInitializeStack.pop();
               initme.accept(this.mInitializer);
            }

            this.mAlreadyInitializing = false;
         }
      }

   }

   public Collection getResolvedClasses() {
      return Collections.unmodifiableCollection(this.mFd2ClassCache.values());
   }

   public void addToCache(JClass c) {
      this.cachePut((MClass)c);
   }
}
