package org.apache.poi.xdgf.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.POIXMLException;
import org.apache.xmlbeans.XmlObject;

public class ObjectFactory {

   Map _types = new HashMap();


   public void put(String typeName, Class cls, Class ... varargs) throws NoSuchMethodException, SecurityException {
      this._types.put(typeName, cls.getDeclaredConstructor(varargs));
   }

   public Object load(String name, Object ... varargs) {
      Constructor constructor = (Constructor)this._types.get(name);
      if(constructor == null) {
         XmlObject e = (XmlObject)varargs[0];
         String typeName = e.schemaType().getName().getLocalPart();
         throw new POIXMLException("Invalid \'" + typeName + "\' name \'" + name + "\'");
      } else {
         try {
            return constructor.newInstance(varargs);
         } catch (InvocationTargetException var6) {
            throw new POIXMLException(var6.getCause());
         } catch (Exception var7) {
            throw new POIXMLException(var7);
         }
      }
   }
}
