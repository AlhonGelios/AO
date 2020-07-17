package org.apache.poi.xwpf.usermodel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLFactory;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.xwpf.usermodel.XWPFRelation;

public final class XWPFFactory extends POIXMLFactory {

   private static final XWPFFactory inst = new XWPFFactory();


   public static XWPFFactory getInstance() {
      return inst;
   }

   protected POIXMLRelation getDescriptor(String relationshipType) {
      return XWPFRelation.getInstance(relationshipType);
   }

   protected POIXMLDocumentPart createDocumentPart(Class cls, Class[] classes, Object[] values) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
      Constructor constructor = cls.getDeclaredConstructor(classes);
      return (POIXMLDocumentPart)constructor.newInstance(values);
   }

}
