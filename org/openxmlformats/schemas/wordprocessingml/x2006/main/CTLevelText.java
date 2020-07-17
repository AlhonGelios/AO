package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTLevelText extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLevelText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctleveltext0621type");


   String getVal();

   STString xgetVal();

   boolean isSetVal();

   void setVal(String var1);

   void xsetVal(STString var1);

   void unsetVal();

   STOnOff.Enum getNull();

   STOnOff xgetNull();

   boolean isSetNull();

   void setNull(STOnOff.Enum var1);

   void xsetNull(STOnOff var1);

   void unsetNull();


   public static final class Factory {

      public static CTLevelText newInstance() {
         return (CTLevelText)POIXMLTypeLoader.newInstance(CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText newInstance(XmlOptions var0) {
         return (CTLevelText)POIXMLTypeLoader.newInstance(CTLevelText.type, var0);
      }

      public static CTLevelText parse(String var0) throws XmlException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static CTLevelText parse(File var0) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static CTLevelText parse(URL var0) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static CTLevelText parse(InputStream var0) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static CTLevelText parse(Reader var0) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static CTLevelText parse(XMLStreamReader var0) throws XmlException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static CTLevelText parse(Node var0) throws XmlException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static CTLevelText parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static CTLevelText parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLevelText)POIXMLTypeLoader.parse(var0, CTLevelText.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLevelText.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLevelText.type, var1);
      }

   }
}
