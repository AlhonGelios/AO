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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType;
import org.w3c.dom.Node;

public interface CTTableCellProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableCellProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablecellproperties1614type");


   CTLineProperties getLnL();

   boolean isSetLnL();

   void setLnL(CTLineProperties var1);

   CTLineProperties addNewLnL();

   void unsetLnL();

   CTLineProperties getLnR();

   boolean isSetLnR();

   void setLnR(CTLineProperties var1);

   CTLineProperties addNewLnR();

   void unsetLnR();

   CTLineProperties getLnT();

   boolean isSetLnT();

   void setLnT(CTLineProperties var1);

   CTLineProperties addNewLnT();

   void unsetLnT();

   CTLineProperties getLnB();

   boolean isSetLnB();

   void setLnB(CTLineProperties var1);

   CTLineProperties addNewLnB();

   void unsetLnB();

   CTLineProperties getLnTlToBr();

   boolean isSetLnTlToBr();

   void setLnTlToBr(CTLineProperties var1);

   CTLineProperties addNewLnTlToBr();

   void unsetLnTlToBr();

   CTLineProperties getLnBlToTr();

   boolean isSetLnBlToTr();

   void setLnBlToTr(CTLineProperties var1);

   CTLineProperties addNewLnBlToTr();

   void unsetLnBlToTr();

   CTCell3D getCell3D();

   boolean isSetCell3D();

   void setCell3D(CTCell3D var1);

   CTCell3D addNewCell3D();

   void unsetCell3D();

   CTNoFillProperties getNoFill();

   boolean isSetNoFill();

   void setNoFill(CTNoFillProperties var1);

   CTNoFillProperties addNewNoFill();

   void unsetNoFill();

   CTSolidColorFillProperties getSolidFill();

   boolean isSetSolidFill();

   void setSolidFill(CTSolidColorFillProperties var1);

   CTSolidColorFillProperties addNewSolidFill();

   void unsetSolidFill();

   CTGradientFillProperties getGradFill();

   boolean isSetGradFill();

   void setGradFill(CTGradientFillProperties var1);

   CTGradientFillProperties addNewGradFill();

   void unsetGradFill();

   CTBlipFillProperties getBlipFill();

   boolean isSetBlipFill();

   void setBlipFill(CTBlipFillProperties var1);

   CTBlipFillProperties addNewBlipFill();

   void unsetBlipFill();

   CTPatternFillProperties getPattFill();

   boolean isSetPattFill();

   void setPattFill(CTPatternFillProperties var1);

   CTPatternFillProperties addNewPattFill();

   void unsetPattFill();

   CTGroupFillProperties getGrpFill();

   boolean isSetGrpFill();

   void setGrpFill(CTGroupFillProperties var1);

   CTGroupFillProperties addNewGrpFill();

   void unsetGrpFill();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   int getMarL();

   STCoordinate32 xgetMarL();

   boolean isSetMarL();

   void setMarL(int var1);

   void xsetMarL(STCoordinate32 var1);

   void unsetMarL();

   int getMarR();

   STCoordinate32 xgetMarR();

   boolean isSetMarR();

   void setMarR(int var1);

   void xsetMarR(STCoordinate32 var1);

   void unsetMarR();

   int getMarT();

   STCoordinate32 xgetMarT();

   boolean isSetMarT();

   void setMarT(int var1);

   void xsetMarT(STCoordinate32 var1);

   void unsetMarT();

   int getMarB();

   STCoordinate32 xgetMarB();

   boolean isSetMarB();

   void setMarB(int var1);

   void xsetMarB(STCoordinate32 var1);

   void unsetMarB();

   STTextVerticalType.Enum getVert();

   STTextVerticalType xgetVert();

   boolean isSetVert();

   void setVert(STTextVerticalType.Enum var1);

   void xsetVert(STTextVerticalType var1);

   void unsetVert();

   STTextAnchoringType.Enum getAnchor();

   STTextAnchoringType xgetAnchor();

   boolean isSetAnchor();

   void setAnchor(STTextAnchoringType.Enum var1);

   void xsetAnchor(STTextAnchoringType var1);

   void unsetAnchor();

   boolean getAnchorCtr();

   XmlBoolean xgetAnchorCtr();

   boolean isSetAnchorCtr();

   void setAnchorCtr(boolean var1);

   void xsetAnchorCtr(XmlBoolean var1);

   void unsetAnchorCtr();

   STTextHorzOverflowType.Enum getHorzOverflow();

   STTextHorzOverflowType xgetHorzOverflow();

   boolean isSetHorzOverflow();

   void setHorzOverflow(STTextHorzOverflowType.Enum var1);

   void xsetHorzOverflow(STTextHorzOverflowType var1);

   void unsetHorzOverflow();


   public static final class Factory {

      public static CTTableCellProperties newInstance() {
         return (CTTableCellProperties)POIXMLTypeLoader.newInstance(CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties newInstance(XmlOptions var0) {
         return (CTTableCellProperties)POIXMLTypeLoader.newInstance(CTTableCellProperties.type, var0);
      }

      public static CTTableCellProperties parse(String var0) throws XmlException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static CTTableCellProperties parse(File var0) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static CTTableCellProperties parse(URL var0) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static CTTableCellProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static CTTableCellProperties parse(Reader var0) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static CTTableCellProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static CTTableCellProperties parse(Node var0) throws XmlException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static CTTableCellProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static CTTableCellProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableCellProperties)POIXMLTypeLoader.parse(var0, CTTableCellProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableCellProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableCellProperties.type, var1);
      }

   }
}
