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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.w3c.dom.Node;

public interface CTCellFormula extends STFormula {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCellFormula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcellformula3583type");


   STCellFormulaType.Enum getT();

   STCellFormulaType xgetT();

   boolean isSetT();

   void setT(STCellFormulaType.Enum var1);

   void xsetT(STCellFormulaType var1);

   void unsetT();

   boolean getAca();

   XmlBoolean xgetAca();

   boolean isSetAca();

   void setAca(boolean var1);

   void xsetAca(XmlBoolean var1);

   void unsetAca();

   String getRef();

   STRef xgetRef();

   boolean isSetRef();

   void setRef(String var1);

   void xsetRef(STRef var1);

   void unsetRef();

   boolean getDt2D();

   XmlBoolean xgetDt2D();

   boolean isSetDt2D();

   void setDt2D(boolean var1);

   void xsetDt2D(XmlBoolean var1);

   void unsetDt2D();

   boolean getDtr();

   XmlBoolean xgetDtr();

   boolean isSetDtr();

   void setDtr(boolean var1);

   void xsetDtr(XmlBoolean var1);

   void unsetDtr();

   boolean getDel1();

   XmlBoolean xgetDel1();

   boolean isSetDel1();

   void setDel1(boolean var1);

   void xsetDel1(XmlBoolean var1);

   void unsetDel1();

   boolean getDel2();

   XmlBoolean xgetDel2();

   boolean isSetDel2();

   void setDel2(boolean var1);

   void xsetDel2(XmlBoolean var1);

   void unsetDel2();

   String getR1();

   STCellRef xgetR1();

   boolean isSetR1();

   void setR1(String var1);

   void xsetR1(STCellRef var1);

   void unsetR1();

   String getR2();

   STCellRef xgetR2();

   boolean isSetR2();

   void setR2(String var1);

   void xsetR2(STCellRef var1);

   void unsetR2();

   boolean getCa();

   XmlBoolean xgetCa();

   boolean isSetCa();

   void setCa(boolean var1);

   void xsetCa(XmlBoolean var1);

   void unsetCa();

   long getSi();

   XmlUnsignedInt xgetSi();

   boolean isSetSi();

   void setSi(long var1);

   void xsetSi(XmlUnsignedInt var1);

   void unsetSi();

   boolean getBx();

   XmlBoolean xgetBx();

   boolean isSetBx();

   void setBx(boolean var1);

   void xsetBx(XmlBoolean var1);

   void unsetBx();


   public static final class Factory {

      public static CTCellFormula newInstance() {
         return (CTCellFormula)POIXMLTypeLoader.newInstance(CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula newInstance(XmlOptions var0) {
         return (CTCellFormula)POIXMLTypeLoader.newInstance(CTCellFormula.type, var0);
      }

      public static CTCellFormula parse(String var0) throws XmlException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static CTCellFormula parse(File var0) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static CTCellFormula parse(URL var0) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static CTCellFormula parse(InputStream var0) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static CTCellFormula parse(Reader var0) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static CTCellFormula parse(XMLStreamReader var0) throws XmlException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static CTCellFormula parse(Node var0) throws XmlException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static CTCellFormula parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static CTCellFormula parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCellFormula)POIXMLTypeLoader.parse(var0, CTCellFormula.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellFormula.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellFormula.type, var1);
      }

   }
}
