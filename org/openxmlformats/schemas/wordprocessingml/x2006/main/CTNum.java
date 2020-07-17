package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.w3c.dom.Node;

public interface CTNum extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnume94ctype");


   CTDecimalNumber getAbstractNumId();

   void setAbstractNumId(CTDecimalNumber var1);

   CTDecimalNumber addNewAbstractNumId();

   List getLvlOverrideList();

   CTNumLvl[] getLvlOverrideArray();

   CTNumLvl getLvlOverrideArray(int var1);

   int sizeOfLvlOverrideArray();

   void setLvlOverrideArray(CTNumLvl[] var1);

   void setLvlOverrideArray(int var1, CTNumLvl var2);

   CTNumLvl insertNewLvlOverride(int var1);

   CTNumLvl addNewLvlOverride();

   void removeLvlOverride(int var1);

   BigInteger getNumId();

   STDecimalNumber xgetNumId();

   void setNumId(BigInteger var1);

   void xsetNumId(STDecimalNumber var1);


   public static final class Factory {

      public static CTNum newInstance() {
         return (CTNum)POIXMLTypeLoader.newInstance(CTNum.type, (XmlOptions)null);
      }

      public static CTNum newInstance(XmlOptions var0) {
         return (CTNum)POIXMLTypeLoader.newInstance(CTNum.type, var0);
      }

      public static CTNum parse(String var0) throws XmlException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static CTNum parse(File var0) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static CTNum parse(URL var0) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static CTNum parse(InputStream var0) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static CTNum parse(Reader var0) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static CTNum parse(XMLStreamReader var0) throws XmlException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static CTNum parse(Node var0) throws XmlException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static CTNum parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, (XmlOptions)null);
      }

      public static CTNum parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNum)POIXMLTypeLoader.parse(var0, CTNum.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNum.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNum.type, var1);
      }

   }
}
