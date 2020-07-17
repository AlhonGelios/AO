package org.apache.poi.xslf.usermodel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLFactory;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.xslf.usermodel.XSLFRelation;

public final class XSLFFactory extends POIXMLFactory {

   private static final XSLFFactory inst = new XSLFFactory();


   public static XSLFFactory getInstance() {
      return inst;
   }

   protected POIXMLRelation getDescriptor(String relationshipType) {
      return XSLFRelation.getInstance(relationshipType);
   }

   protected POIXMLDocumentPart createDocumentPart(Class cls, Class[] classes, Object[] values) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
      Constructor constructor = cls.getDeclaredConstructor(classes);
      return (POIXMLDocumentPart)constructor.newInstance(values);
   }

}
