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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.w3c.dom.Node;

public interface CTTextLineBreak extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextLineBreak.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextlinebreak932ftype");


   CTTextCharacterProperties getRPr();

   boolean isSetRPr();

   void setRPr(CTTextCharacterProperties var1);

   CTTextCharacterProperties addNewRPr();

   void unsetRPr();


   public static final class Factory {

      public static CTTextLineBreak newInstance() {
         return (CTTextLineBreak)POIXMLTypeLoader.newInstance(CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak newInstance(XmlOptions var0) {
         return (CTTextLineBreak)POIXMLTypeLoader.newInstance(CTTextLineBreak.type, var0);
      }

      public static CTTextLineBreak parse(String var0) throws XmlException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static CTTextLineBreak parse(File var0) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static CTTextLineBreak parse(URL var0) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static CTTextLineBreak parse(InputStream var0) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static CTTextLineBreak parse(Reader var0) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static CTTextLineBreak parse(XMLStreamReader var0) throws XmlException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static CTTextLineBreak parse(Node var0) throws XmlException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static CTTextLineBreak parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static CTTextLineBreak parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextLineBreak)POIXMLTypeLoader.parse(var0, CTTextLineBreak.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextLineBreak.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextLineBreak.type, var1);
      }

   }
}
