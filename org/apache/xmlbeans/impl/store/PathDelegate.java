package org.apache.xmlbeans.impl.store;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class PathDelegate {

   private static HashMap _constructors = new HashMap();


   private static synchronized void init(String implClassName) {
      if(implClassName == null) {
         implClassName = "org.apache.xmlbeans.impl.xpath.saxon.XBeansXPath";
      }

      Class selectPathInterfaceImpl = null;
      boolean engineAvailable = true;

      try {
         selectPathInterfaceImpl = Class.forName(implClassName);
      } catch (ClassNotFoundException var5) {
         engineAvailable = false;
      } catch (NoClassDefFoundError var6) {
         engineAvailable = false;
      }

      if(engineAvailable) {
         try {
            Constructor e = selectPathInterfaceImpl.getConstructor(new Class[]{String.class, String.class, Map.class, String.class});
            _constructors.put(implClassName, e);
         } catch (Exception var4) {
            throw new RuntimeException(var4);
         }
      }

   }

   public static synchronized PathDelegate.SelectPathInterface createInstance(String implClassName, String xpath, String contextVar, Map namespaceMap) {
      if(_constructors.get(implClassName) == null) {
         init(implClassName);
      }

      if(_constructors.get(implClassName) == null) {
         return null;
      } else {
         Constructor constructor = (Constructor)_constructors.get(implClassName);

         try {
            Object e = namespaceMap.get("$xmlbeans!default_uri");
            if(e != null) {
               namespaceMap.remove("$xmlbeans!default_uri");
            }

            return (PathDelegate.SelectPathInterface)constructor.newInstance(new Object[]{xpath, contextVar, namespaceMap, (String)e});
         } catch (Exception var6) {
            throw new RuntimeException(var6);
         }
      }
   }


   public interface SelectPathInterface {

      List selectPath(Object var1);
   }
}
