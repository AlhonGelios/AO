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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTSym extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSym.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsym0dabtype");


   String getFont();

   STString xgetFont();

   boolean isSetFont();

   void setFont(String var1);

   void xsetFont(STString var1);

   void unsetFont();

   byte[] getChar();

   STShortHexNumber xgetChar();

   boolean isSetChar();

   void setChar(byte[] var1);

   void xsetChar(STShortHexNumber var1);

   void unsetChar();


   public static final class Factory {

      public static CTSym newInstance() {
         return (CTSym)POIXMLTypeLoader.newInstance(CTSym.type, (XmlOptions)null);
      }

      public static CTSym newInstance(XmlOptions var0) {
         return (CTSym)POIXMLTypeLoader.newInstance(CTSym.type, var0);
      }

      public static CTSym parse(String var0) throws XmlException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static CTSym parse(File var0) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static CTSym parse(URL var0) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static CTSym parse(InputStream var0) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static CTSym parse(Reader var0) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static CTSym parse(XMLStreamReader var0) throws XmlException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static CTSym parse(Node var0) throws XmlException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static CTSym parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, (XmlOptions)null);
      }

      public static CTSym parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSym)POIXMLTypeLoader.parse(var0, CTSym.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSym.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSym.type, var1);
      }

   }
}
