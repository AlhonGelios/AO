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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTCell extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCell.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcell842btype");


   CTCellFormula getF();

   boolean isSetF();

   void setF(CTCellFormula var1);

   CTCellFormula addNewF();

   void unsetF();

   String getV();

   STXstring xgetV();

   boolean isSetV();

   void setV(String var1);

   void xsetV(STXstring var1);

   void unsetV();

   CTRst getIs();

   boolean isSetIs();

   void setIs(CTRst var1);

   CTRst addNewIs();

   void unsetIs();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getR();

   STCellRef xgetR();

   boolean isSetR();

   void setR(String var1);

   void xsetR(STCellRef var1);

   void unsetR();

   long getS();

   XmlUnsignedInt xgetS();

   boolean isSetS();

   void setS(long var1);

   void xsetS(XmlUnsignedInt var1);

   void unsetS();

   STCellType.Enum getT();

   STCellType xgetT();

   boolean isSetT();

   void setT(STCellType.Enum var1);

   void xsetT(STCellType var1);

   void unsetT();

   long getCm();

   XmlUnsignedInt xgetCm();

   boolean isSetCm();

   void setCm(long var1);

   void xsetCm(XmlUnsignedInt var1);

   void unsetCm();

   long getVm();

   XmlUnsignedInt xgetVm();

   boolean isSetVm();

   void setVm(long var1);

   void xsetVm(XmlUnsignedInt var1);

   void unsetVm();

   boolean getPh();

   XmlBoolean xgetPh();

   boolean isSetPh();

   void setPh(boolean var1);

   void xsetPh(XmlBoolean var1);

   void unsetPh();


   public static final class Factory {

      public static CTCell newInstance() {
         return (CTCell)POIXMLTypeLoader.newInstance(CTCell.type, (XmlOptions)null);
      }

      public static CTCell newInstance(XmlOptions var0) {
         return (CTCell)POIXMLTypeLoader.newInstance(CTCell.type, var0);
      }

      public static CTCell parse(String var0) throws XmlException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static CTCell parse(File var0) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static CTCell parse(URL var0) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static CTCell parse(InputStream var0) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static CTCell parse(Reader var0) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static CTCell parse(XMLStreamReader var0) throws XmlException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static CTCell parse(Node var0) throws XmlException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static CTCell parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, (XmlOptions)null);
      }

      public static CTCell parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCell)POIXMLTypeLoader.parse(var0, CTCell.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCell.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCell.type, var1);
      }

   }
}
