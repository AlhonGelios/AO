package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth;
import org.w3c.dom.Node;

public interface CTLineEndProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLineEndProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlineendproperties8acbtype");


   STLineEndType.Enum getType();

   STLineEndType xgetType();

   boolean isSetType();

   void setType(STLineEndType.Enum var1);

   void xsetType(STLineEndType var1);

   void unsetType();

   STLineEndWidth.Enum getW();

   STLineEndWidth xgetW();

   boolean isSetW();

   void setW(STLineEndWidth.Enum var1);

   void xsetW(STLineEndWidth var1);

   void unsetW();

   STLineEndLength.Enum getLen();

   STLineEndLength xgetLen();

   boolean isSetLen();

   void setLen(STLineEndLength.Enum var1);

   void xsetLen(STLineEndLength var1);

   void unsetLen();


   public static final class Factory {

      public static CTLineEndProperties newInstance() {
         return (CTLineEndProperties)POIXMLTypeLoader.newInstance(CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties newInstance(XmlOptions var0) {
         return (CTLineEndProperties)POIXMLTypeLoader.newInstance(CTLineEndProperties.type, var0);
      }

      public static CTLineEndProperties parse(String var0) throws XmlException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static CTLineEndProperties parse(File var0) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static CTLineEndProperties parse(URL var0) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static CTLineEndProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static CTLineEndProperties parse(Reader var0) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static CTLineEndProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static CTLineEndProperties parse(Node var0) throws XmlException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static CTLineEndProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static CTLineEndProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLineEndProperties)POIXMLTypeLoader.parse(var0, CTLineEndProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineEndProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineEndProperties.type, var1);
      }

   }
}
