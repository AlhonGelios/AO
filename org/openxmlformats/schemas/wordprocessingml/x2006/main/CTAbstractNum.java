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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.w3c.dom.Node;

public interface CTAbstractNum extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAbstractNum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctabstractnum588etype");


   CTLongHexNumber getNsid();

   boolean isSetNsid();

   void setNsid(CTLongHexNumber var1);

   CTLongHexNumber addNewNsid();

   void unsetNsid();

   CTMultiLevelType getMultiLevelType();

   boolean isSetMultiLevelType();

   void setMultiLevelType(CTMultiLevelType var1);

   CTMultiLevelType addNewMultiLevelType();

   void unsetMultiLevelType();

   CTLongHexNumber getTmpl();

   boolean isSetTmpl();

   void setTmpl(CTLongHexNumber var1);

   CTLongHexNumber addNewTmpl();

   void unsetTmpl();

   CTString getName();

   boolean isSetName();

   void setName(CTString var1);

   CTString addNewName();

   void unsetName();

   CTString getStyleLink();

   boolean isSetStyleLink();

   void setStyleLink(CTString var1);

   CTString addNewStyleLink();

   void unsetStyleLink();

   CTString getNumStyleLink();

   boolean isSetNumStyleLink();

   void setNumStyleLink(CTString var1);

   CTString addNewNumStyleLink();

   void unsetNumStyleLink();

   List getLvlList();

   CTLvl[] getLvlArray();

   CTLvl getLvlArray(int var1);

   int sizeOfLvlArray();

   void setLvlArray(CTLvl[] var1);

   void setLvlArray(int var1, CTLvl var2);

   CTLvl insertNewLvl(int var1);

   CTLvl addNewLvl();

   void removeLvl(int var1);

   BigInteger getAbstractNumId();

   STDecimalNumber xgetAbstractNumId();

   void setAbstractNumId(BigInteger var1);

   void xsetAbstractNumId(STDecimalNumber var1);


   public static final class Factory {

      public static CTAbstractNum newInstance() {
         return (CTAbstractNum)POIXMLTypeLoader.newInstance(CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum newInstance(XmlOptions var0) {
         return (CTAbstractNum)POIXMLTypeLoader.newInstance(CTAbstractNum.type, var0);
      }

      public static CTAbstractNum parse(String var0) throws XmlException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static CTAbstractNum parse(File var0) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static CTAbstractNum parse(URL var0) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static CTAbstractNum parse(InputStream var0) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static CTAbstractNum parse(Reader var0) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static CTAbstractNum parse(XMLStreamReader var0) throws XmlException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static CTAbstractNum parse(Node var0) throws XmlException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static CTAbstractNum parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static CTAbstractNum parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAbstractNum)POIXMLTypeLoader.parse(var0, CTAbstractNum.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAbstractNum.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAbstractNum.type, var1);
      }

   }
}
