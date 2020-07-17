package org.apache.xmlbeans.impl.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.xmlbeans.SystemProperties;
import org.xml.sax.EntityResolver;

public class ResolverUtil {

   private static EntityResolver _entityResolver = null;


   public static EntityResolver getGlobalEntityResolver() {
      return _entityResolver;
   }

   public static EntityResolver resolverForCatalog(String catalogFile) {
      if(catalogFile == null) {
         return null;
      } else {
         try {
            Class e = Class.forName("org.apache.xml.resolver.CatalogManager");
            Constructor cstrCm = e.getConstructor(new Class[0]);
            Object cmObj = cstrCm.newInstance(new Object[0]);
            Method cmMethod = e.getMethod("setCatalogFiles", new Class[]{String.class});
            cmMethod.invoke(cmObj, new String[]{catalogFile});
            Class crClass = Class.forName("org.apache.xml.resolver.tools.CatalogResolver");
            Constructor cstrCr = crClass.getConstructor(new Class[]{e});
            Object crObj = cstrCr.newInstance(new Object[]{cmObj});
            return (EntityResolver)crObj;
         } catch (Exception var8) {
            return null;
         }
      }
   }

   static {
      try {
         String e = SystemProperties.getProperty("xmlbean.entityResolver");
         if(e != null) {
            Object o = Class.forName(e).newInstance();
            _entityResolver = (EntityResolver)o;
         }
      } catch (Exception var2) {
         _entityResolver = null;
      }

   }
}
