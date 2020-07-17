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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.w3c.dom.Node;

public interface CTCalcCell extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCalcCell.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcalccellb960type");


   String getR();

   STCellRef xgetR();

   void setR(String var1);

   void xsetR(STCellRef var1);

   int getI();

   XmlInt xgetI();

   boolean isSetI();

   void setI(int var1);

   void xsetI(XmlInt var1);

   void unsetI();

   boolean getS();

   XmlBoolean xgetS();

   boolean isSetS();

   void setS(boolean var1);

   void xsetS(XmlBoolean var1);

   void unsetS();

   boolean getL();

   XmlBoolean xgetL();

   boolean isSetL();

   void setL(boolean var1);

   void xsetL(XmlBoolean var1);

   void unsetL();

   boolean getT();

   XmlBoolean xgetT();

   boolean isSetT();

   void setT(boolean var1);

   void xsetT(XmlBoolean var1);

   void unsetT();

   boolean getA();

   XmlBoolean xgetA();

   boolean isSetA();

   void setA(boolean var1);

   void xsetA(XmlBoolean var1);

   void unsetA();


   public static final class Factory {

      public static CTCalcCell newInstance() {
         return (CTCalcCell)POIXMLTypeLoader.newInstance(CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell newInstance(XmlOptions var0) {
         return (CTCalcCell)POIXMLTypeLoader.newInstance(CTCalcCell.type, var0);
      }

      public static CTCalcCell parse(String var0) throws XmlException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static CTCalcCell parse(File var0) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static CTCalcCell parse(URL var0) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static CTCalcCell parse(InputStream var0) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static CTCalcCell parse(Reader var0) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static CTCalcCell parse(XMLStreamReader var0) throws XmlException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static CTCalcCell parse(Node var0) throws XmlException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static CTCalcCell parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static CTCalcCell parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCalcCell)POIXMLTypeLoader.parse(var0, CTCalcCell.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCalcCell.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCalcCell.type, var1);
      }

   }
}
