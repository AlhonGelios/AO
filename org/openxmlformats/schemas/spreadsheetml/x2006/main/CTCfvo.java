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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfvoType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTCfvo extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCfvo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcfvo7ca5type");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   STCfvoType.Enum getType();

   STCfvoType xgetType();

   void setType(STCfvoType.Enum var1);

   void xsetType(STCfvoType var1);

   String getVal();

   STXstring xgetVal();

   boolean isSetVal();

   void setVal(String var1);

   void xsetVal(STXstring var1);

   void unsetVal();

   boolean getGte();

   XmlBoolean xgetGte();

   boolean isSetGte();

   void setGte(boolean var1);

   void xsetGte(XmlBoolean var1);

   void unsetGte();


   public static final class Factory {

      public static CTCfvo newInstance() {
         return (CTCfvo)POIXMLTypeLoader.newInstance(CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo newInstance(XmlOptions var0) {
         return (CTCfvo)POIXMLTypeLoader.newInstance(CTCfvo.type, var0);
      }

      public static CTCfvo parse(String var0) throws XmlException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static CTCfvo parse(File var0) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static CTCfvo parse(URL var0) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static CTCfvo parse(InputStream var0) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static CTCfvo parse(Reader var0) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static CTCfvo parse(XMLStreamReader var0) throws XmlException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static CTCfvo parse(Node var0) throws XmlException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static CTCfvo parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static CTCfvo parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCfvo)POIXMLTypeLoader.parse(var0, CTCfvo.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCfvo.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCfvo.type, var1);
      }

   }
}
