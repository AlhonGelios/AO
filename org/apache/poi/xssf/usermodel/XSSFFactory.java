package org.apache.poi.xssf.usermodel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLFactory;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.xssf.usermodel.XSSFRelation;

public final class XSSFFactory extends POIXMLFactory {

   private static final XSSFFactory inst = new XSSFFactory();


   public static XSSFFactory getInstance() {
      return inst;
   }

   protected POIXMLRelation getDescriptor(String relationshipType) {
      return XSSFRelation.getInstance(relationshipType);
   }

   protected POIXMLDocumentPart createDocumentPart(Class cls, Class[] classes, Object[] values) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
      Constructor constructor = cls.getDeclaredConstructor(classes);
      return (POIXMLDocumentPart)constructor.newInstance(values);
   }

}
