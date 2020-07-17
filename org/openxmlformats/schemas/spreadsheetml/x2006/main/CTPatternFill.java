package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType;
import org.w3c.dom.Node;

public interface CTPatternFill extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPatternFill.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpatternfill7452type");


   CTColor getFgColor();

   boolean isSetFgColor();

   void setFgColor(CTColor var1);

   CTColor addNewFgColor();

   void unsetFgColor();

   CTColor getBgColor();

   boolean isSetBgColor();

   void setBgColor(CTColor var1);

   CTColor addNewBgColor();

   void unsetBgColor();

   STPatternType.Enum getPatternType();

   STPatternType xgetPatternType();

   boolean isSetPatternType();

   void setPatternType(STPatternType.Enum var1);

   void xsetPatternType(STPatternType var1);

   void unsetPatternType();


   public static final class Factory {

      public static CTPatternFill newInstance() {
         return (CTPatternFill)POIXMLTypeLoader.newInstance(CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill newInstance(XmlOptions var0) {
         return (CTPatternFill)POIXMLTypeLoader.newInstance(CTPatternFill.type, var0);
      }

      public static CTPatternFill parse(String var0) throws XmlException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static CTPatternFill parse(File var0) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static CTPatternFill parse(URL var0) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static CTPatternFill parse(InputStream var0) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static CTPatternFill parse(Reader var0) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static CTPatternFill parse(XMLStreamReader var0) throws XmlException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static CTPatternFill parse(Node var0) throws XmlException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static CTPatternFill parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static CTPatternFill parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPatternFill)POIXMLTypeLoader.parse(var0, CTPatternFill.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPatternFill.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPatternFill.type, var1);
      }

   }
}
