package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ShapesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ShapesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("shapestypef507type");


   List getShapeList();

   ShapeSheetType[] getShapeArray();

   ShapeSheetType getShapeArray(int var1);

   int sizeOfShapeArray();

   void setShapeArray(ShapeSheetType[] var1);

   void setShapeArray(int var1, ShapeSheetType var2);

   ShapeSheetType insertNewShape(int var1);

   ShapeSheetType addNewShape();

   void removeShape(int var1);


   public static final class Factory {

      public static ShapesType newInstance() {
         return (ShapesType)POIXMLTypeLoader.newInstance(ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType newInstance(XmlOptions var0) {
         return (ShapesType)POIXMLTypeLoader.newInstance(ShapesType.type, var0);
      }

      public static ShapesType parse(String var0) throws XmlException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(String var0, XmlOptions var1) throws XmlException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static ShapesType parse(File var0) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static ShapesType parse(URL var0) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static ShapesType parse(InputStream var0) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static ShapesType parse(Reader var0) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static ShapesType parse(XMLStreamReader var0) throws XmlException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static ShapesType parse(Node var0) throws XmlException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static ShapesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, (XmlOptions)null);
      }

      public static ShapesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ShapesType)POIXMLTypeLoader.parse(var0, ShapesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ShapesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ShapesType.type, var1);
      }

   }
}
