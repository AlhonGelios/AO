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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTItem extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctitemc69ctype");


   String getN();

   STXstring xgetN();

   boolean isSetN();

   void setN(String var1);

   void xsetN(STXstring var1);

   void unsetN();

   STItemType.Enum getT();

   STItemType xgetT();

   boolean isSetT();

   void setT(STItemType.Enum var1);

   void xsetT(STItemType var1);

   void unsetT();

   boolean getH();

   XmlBoolean xgetH();

   boolean isSetH();

   void setH(boolean var1);

   void xsetH(XmlBoolean var1);

   void unsetH();

   boolean getS();

   XmlBoolean xgetS();

   boolean isSetS();

   void setS(boolean var1);

   void xsetS(XmlBoolean var1);

   void unsetS();

   boolean getSd();

   XmlBoolean xgetSd();

   boolean isSetSd();

   void setSd(boolean var1);

   void xsetSd(XmlBoolean var1);

   void unsetSd();

   boolean getF();

   XmlBoolean xgetF();

   boolean isSetF();

   void setF(boolean var1);

   void xsetF(XmlBoolean var1);

   void unsetF();

   boolean getM();

   XmlBoolean xgetM();

   boolean isSetM();

   void setM(boolean var1);

   void xsetM(XmlBoolean var1);

   void unsetM();

   boolean getC();

   XmlBoolean xgetC();

   boolean isSetC();

   void setC(boolean var1);

   void xsetC(XmlBoolean var1);

   void unsetC();

   long getX();

   XmlUnsignedInt xgetX();

   boolean isSetX();

   void setX(long var1);

   void xsetX(XmlUnsignedInt var1);

   void unsetX();

   boolean getD();

   XmlBoolean xgetD();

   boolean isSetD();

   void setD(boolean var1);

   void xsetD(XmlBoolean var1);

   void unsetD();

   boolean getE();

   XmlBoolean xgetE();

   boolean isSetE();

   void setE(boolean var1);

   void xsetE(XmlBoolean var1);

   void unsetE();


   public static final class Factory {

      public static CTItem newInstance() {
         return (CTItem)POIXMLTypeLoader.newInstance(CTItem.type, (XmlOptions)null);
      }

      public static CTItem newInstance(XmlOptions var0) {
         return (CTItem)POIXMLTypeLoader.newInstance(CTItem.type, var0);
      }

      public static CTItem parse(String var0) throws XmlException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(String var0, XmlOptions var1) throws XmlException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static CTItem parse(File var0) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static CTItem parse(URL var0) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static CTItem parse(InputStream var0) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static CTItem parse(Reader var0) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static CTItem parse(XMLStreamReader var0) throws XmlException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static CTItem parse(Node var0) throws XmlException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static CTItem parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, (XmlOptions)null);
      }

      public static CTItem parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTItem)POIXMLTypeLoader.parse(var0, CTItem.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTItem.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTItem.type, var1);
      }

   }
}
