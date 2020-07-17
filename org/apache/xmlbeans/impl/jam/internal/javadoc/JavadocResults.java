package org.apache.xmlbeans.impl.jam.internal.javadoc;

import com.sun.javadoc.RootDoc;
import java.lang.reflect.Method;

public class JavadocResults {

   private static final JavadocResults INSTANCE = new JavadocResults();
   private ThreadLocal mRootsPerThread = new ThreadLocal();


   public static void prepare() {
      Thread.currentThread().setContextClassLoader(JavadocResults.class.getClassLoader());
   }

   public static void setRoot(RootDoc root) {
      try {
         Object e = getHolder();
         Method setter = e.getClass().getMethod("_setRoot", new Class[]{RootDoc.class});
         setter.invoke(e, new Object[]{root});
      } catch (Exception var3) {
         var3.printStackTrace();
         throw new IllegalStateException();
      }
   }

   public static RootDoc getRoot() {
      try {
         Object e = getHolder();
         Method getter = e.getClass().getMethod("_getRoot", new Class[0]);
         return (RootDoc)getter.invoke(e, (Object[])null);
      } catch (Exception var2) {
         var2.printStackTrace();
         throw new IllegalStateException();
      }
   }

   public void _setRoot(RootDoc root) {
      this.mRootsPerThread.set(root);
   }

   public RootDoc _getRoot() {
      return (RootDoc)this.mRootsPerThread.get();
   }

   public static JavadocResults getInstance() {
      return INSTANCE;
   }

   private static Object getHolder() throws Exception {
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      Class clazz = classLoader.loadClass(JavadocResults.class.getName());
      Method method = clazz.getMethod("getInstance", new Class[0]);
      return method.invoke((Object)null, new Object[0]);
   }

}
