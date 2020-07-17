package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.w3c.dom.Node;

public interface CTNumLvl extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumLvl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumlvl416ctype");


   CTDecimalNumber getStartOverride();

   boolean isSetStartOverride();

   void setStartOverride(CTDecimalNumber var1);

   CTDecimalNumber addNewStartOverride();

   void unsetStartOverride();

   CTLvl getLvl();

   boolean isSetLvl();

   void setLvl(CTLvl var1);

   CTLvl addNewLvl();

   void unsetLvl();

   BigInteger getIlvl();

   STDecimalNumber xgetIlvl();

   void setIlvl(BigInteger var1);

   void xsetIlvl(STDecimalNumber var1);


   public static final class Factory {

      public static CTNumLvl newInstance() {
         return (CTNumLvl)POIXMLTypeLoader.newInstance(CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl newInstance(XmlOptions var0) {
         return (CTNumLvl)POIXMLTypeLoader.newInstance(CTNumLvl.type, var0);
      }

      public static CTNumLvl parse(String var0) throws XmlException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static CTNumLvl parse(File var0) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static CTNumLvl parse(URL var0) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static CTNumLvl parse(InputStream var0) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static CTNumLvl parse(Reader var0) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static CTNumLvl parse(XMLStreamReader var0) throws XmlException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static CTNumLvl parse(Node var0) throws XmlException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static CTNumLvl parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static CTNumLvl parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumLvl)POIXMLTypeLoader.parse(var0, CTNumLvl.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumLvl.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumLvl.type, var1);
      }

   }
}
