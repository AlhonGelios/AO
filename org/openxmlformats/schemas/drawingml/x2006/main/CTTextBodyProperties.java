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
import org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.STAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType;
import org.w3c.dom.Node;

public interface CTTextBodyProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextBodyProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextbodyproperties87ddtype");


   CTPresetTextShape getPrstTxWarp();

   boolean isSetPrstTxWarp();

   void setPrstTxWarp(CTPresetTextShape var1);

   CTPresetTextShape addNewPrstTxWarp();

   void unsetPrstTxWarp();

   CTTextNoAutofit getNoAutofit();

   boolean isSetNoAutofit();

   void setNoAutofit(CTTextNoAutofit var1);

   CTTextNoAutofit addNewNoAutofit();

   void unsetNoAutofit();

   CTTextNormalAutofit getNormAutofit();

   boolean isSetNormAutofit();

   void setNormAutofit(CTTextNormalAutofit var1);

   CTTextNormalAutofit addNewNormAutofit();

   void unsetNormAutofit();

   CTTextShapeAutofit getSpAutoFit();

   boolean isSetSpAutoFit();

   void setSpAutoFit(CTTextShapeAutofit var1);

   CTTextShapeAutofit addNewSpAutoFit();

   void unsetSpAutoFit();

   CTScene3D getScene3D();

   boolean isSetScene3D();

   void setScene3D(CTScene3D var1);

   CTScene3D addNewScene3D();

   void unsetScene3D();

   CTShape3D getSp3D();

   boolean isSetSp3D();

   void setSp3D(CTShape3D var1);

   CTShape3D addNewSp3D();

   void unsetSp3D();

   CTFlatText getFlatTx();

   boolean isSetFlatTx();

   void setFlatTx(CTFlatText var1);

   CTFlatText addNewFlatTx();

   void unsetFlatTx();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   int getRot();

   STAngle xgetRot();

   boolean isSetRot();

   void setRot(int var1);

   void xsetRot(STAngle var1);

   void unsetRot();

   boolean getSpcFirstLastPara();

   XmlBoolean xgetSpcFirstLastPara();

   boolean isSetSpcFirstLastPara();

   void setSpcFirstLastPara(boolean var1);

   void xsetSpcFirstLastPara(XmlBoolean var1);

   void unsetSpcFirstLastPara();

   STTextVertOverflowType.Enum getVertOverflow();

   STTextVertOverflowType xgetVertOverflow();

   boolean isSetVertOverflow();

   void setVertOverflow(STTextVertOverflowType.Enum var1);

   void xsetVertOverflow(STTextVertOverflowType var1);

   void unsetVertOverflow();

   STTextHorzOverflowType.Enum getHorzOverflow();

   STTextHorzOverflowType xgetHorzOverflow();

   boolean isSetHorzOverflow();

   void setHorzOverflow(STTextHorzOverflowType.Enum var1);

   void xsetHorzOverflow(STTextHorzOverflowType var1);

   void unsetHorzOverflow();

   STTextVerticalType.Enum getVert();

   STTextVerticalType xgetVert();

   boolean isSetVert();

   void setVert(STTextVerticalType.Enum var1);

   void xsetVert(STTextVerticalType var1);

   void unsetVert();

   STTextWrappingType.Enum getWrap();

   STTextWrappingType xgetWrap();

   boolean isSetWrap();

   void setWrap(STTextWrappingType.Enum var1);

   void xsetWrap(STTextWrappingType var1);

   void unsetWrap();

   int getLIns();

   STCoordinate32 xgetLIns();

   boolean isSetLIns();

   void setLIns(int var1);

   void xsetLIns(STCoordinate32 var1);

   void unsetLIns();

   int getTIns();

   STCoordinate32 xgetTIns();

   boolean isSetTIns();

   void setTIns(int var1);

   void xsetTIns(STCoordinate32 var1);

   void unsetTIns();

   int getRIns();

   STCoordinate32 xgetRIns();

   boolean isSetRIns();

   void setRIns(int var1);

   void xsetRIns(STCoordinate32 var1);

   void unsetRIns();

   int getBIns();

   STCoordinate32 xgetBIns();

   boolean isSetBIns();

   void setBIns(int var1);

   void xsetBIns(STCoordinate32 var1);

   void unsetBIns();

   int getNumCol();

   STTextColumnCount xgetNumCol();

   boolean isSetNumCol();

   void setNumCol(int var1);

   void xsetNumCol(STTextColumnCount var1);

   void unsetNumCol();

   int getSpcCol();

   STPositiveCoordinate32 xgetSpcCol();

   boolean isSetSpcCol();

   void setSpcCol(int var1);

   void xsetSpcCol(STPositiveCoordinate32 var1);

   void unsetSpcCol();

   boolean getRtlCol();

   XmlBoolean xgetRtlCol();

   boolean isSetRtlCol();

   void setRtlCol(boolean var1);

   void xsetRtlCol(XmlBoolean var1);

   void unsetRtlCol();

   boolean getFromWordArt();

   XmlBoolean xgetFromWordArt();

   boolean isSetFromWordArt();

   void setFromWordArt(boolean var1);

   void xsetFromWordArt(XmlBoolean var1);

   void unsetFromWordArt();

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

   boolean getForceAA();

   XmlBoolean xgetForceAA();

   boolean isSetForceAA();

   void setForceAA(boolean var1);

   void xsetForceAA(XmlBoolean var1);

   void unsetForceAA();

   boolean getUpright();

   XmlBoolean xgetUpright();

   boolean isSetUpright();

   void setUpright(boolean var1);

   void xsetUpright(XmlBoolean var1);

   void unsetUpright();

   boolean getCompatLnSpc();

   XmlBoolean xgetCompatLnSpc();

   boolean isSetCompatLnSpc();

   void setCompatLnSpc(boolean var1);

   void xsetCompatLnSpc(XmlBoolean var1);

   void unsetCompatLnSpc();


   public static final class Factory {

      public static CTTextBodyProperties newInstance() {
         return (CTTextBodyProperties)POIXMLTypeLoader.newInstance(CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties newInstance(XmlOptions var0) {
         return (CTTextBodyProperties)POIXMLTypeLoader.newInstance(CTTextBodyProperties.type, var0);
      }

      public static CTTextBodyProperties parse(String var0) throws XmlException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static CTTextBodyProperties parse(File var0) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static CTTextBodyProperties parse(URL var0) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static CTTextBodyProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static CTTextBodyProperties parse(Reader var0) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static CTTextBodyProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static CTTextBodyProperties parse(Node var0) throws XmlException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static CTTextBodyProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static CTTextBodyProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextBodyProperties)POIXMLTypeLoader.parse(var0, CTTextBodyProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBodyProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBodyProperties.type, var1);
      }

   }
}
