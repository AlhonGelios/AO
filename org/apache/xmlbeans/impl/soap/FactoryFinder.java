package org.apache.xmlbeans.impl.soap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import org.apache.xmlbeans.SystemProperties;
import org.apache.xmlbeans.impl.soap.SOAPException;

class FactoryFinder {

   private static Object newInstance(String factoryClassName) throws SOAPException {
      ClassLoader classloader = null;

      try {
         classloader = Thread.currentThread().getContextClassLoader();
      } catch (Exception var7) {
         throw new SOAPException(var7.toString(), var7);
      }

      try {
         Class exception = null;
         if(classloader == null) {
            exception = Class.forName(factoryClassName);
         } else {
            try {
               exception = classloader.loadClass(factoryClassName);
            } catch (ClassNotFoundException var4) {
               ;
            }
         }

         if(exception == null) {
            classloader = FactoryFinder.class.getClassLoader();
            exception = classloader.loadClass(factoryClassName);
         }

         return exception.newInstance();
      } catch (ClassNotFoundException var5) {
         throw new SOAPException("Provider " + factoryClassName + " not found", var5);
      } catch (Exception var6) {
         throw new SOAPException("Provider " + factoryClassName + " could not be instantiated: " + var6, var6);
      }
   }

   static Object find(String factoryPropertyName, String defaultFactoryClassName) throws SOAPException {
      String factoryResource;
      try {
         factoryResource = SystemProperties.getProperty(factoryPropertyName);
         if(factoryResource != null) {
            return newInstance(factoryResource);
         }
      } catch (SecurityException var9) {
         ;
      }

      try {
         factoryResource = SystemProperties.getProperty("java.home") + File.separator + "lib" + File.separator + "jaxm.properties";
         File exception2 = new File(factoryResource);
         if(exception2.exists()) {
            FileInputStream bufferedreader1 = new FileInputStream(exception2);
            Properties factoryClassName2 = new Properties();
            factoryClassName2.load(bufferedreader1);
            bufferedreader1.close();
            String factoryClassName1 = factoryClassName2.getProperty(factoryPropertyName);
            return newInstance(factoryClassName1);
         }
      } catch (Exception var8) {
         ;
      }

      factoryResource = "META-INF/services/" + factoryPropertyName;

      try {
         InputStream exception21 = getResource(factoryResource);
         if(exception21 != null) {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(exception21, "UTF-8"));
            String factoryClassName = bufferedreader.readLine();
            bufferedreader.close();
            if(factoryClassName != null && !"".equals(factoryClassName)) {
               return newInstance(factoryClassName);
            }
         }
      } catch (Exception var7) {
         ;
      }

      if(defaultFactoryClassName == null) {
         throw new SOAPException("Provider for " + factoryPropertyName + " cannot be found", (Throwable)null);
      } else {
         return newInstance(defaultFactoryClassName);
      }
   }

   private static InputStream getResource(String factoryResource) {
      ClassLoader classloader = null;

      try {
         classloader = Thread.currentThread().getContextClassLoader();
      } catch (SecurityException var3) {
         ;
      }

      InputStream inputstream;
      if(classloader == null) {
         inputstream = ClassLoader.getSystemResourceAsStream(factoryResource);
      } else {
         inputstream = classloader.getResourceAsStream(factoryResource);
      }

      if(inputstream == null) {
         inputstream = FactoryFinder.class.getClassLoader().getResourceAsStream(factoryResource);
      }

      return inputstream;
   }
}
