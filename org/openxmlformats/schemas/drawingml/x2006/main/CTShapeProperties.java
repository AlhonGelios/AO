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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode$Enum;
import org.w3c.dom.Node;

public interface CTShapeProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTShapeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshapeproperties30e5type");


   CTTransform2D getXfrm();

   boolean isSetXfrm();

   void setXfrm(CTTransform2D var1);

   CTTransform2D addNewXfrm();

   void unsetXfrm();

   CTCustomGeometry2D getCustGeom();

   boolean isSetCustGeom();

   void setCustGeom(CTCustomGeometry2D var1);

   CTCustomGeometry2D addNewCustGeom();

   void unsetCustGeom();

   CTPresetGeometry2D getPrstGeom();

   boolean isSetPrstGeom();

   void setPrstGeom(CTPresetGeometry2D var1);

   CTPresetGeometry2D addNewPrstGeom();

   void unsetPrstGeom();

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

   CTLineProperties getLn();

   boolean isSetLn();

   void setLn(CTLineProperties var1);

   CTLineProperties addNewLn();

   void unsetLn();

   CTEffectList getEffectLst();

   boolean isSetEffectLst();

   void setEffectLst(CTEffectList var1);

   CTEffectList addNewEffectLst();

   void unsetEffectLst();

   CTEffectContainer getEffectDag();

   boolean isSetEffectDag();

   void setEffectDag(CTEffectContainer var1);

   CTEffectContainer addNewEffectDag();

   void unsetEffectDag();

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

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   STBlackWhiteMode$Enum getBwMode();

   STBlackWhiteMode xgetBwMode();

   boolean isSetBwMode();

   void setBwMode(STBlackWhiteMode$Enum var1);

   void xsetBwMode(STBlackWhiteMode var1);

   void unsetBwMode();


   public static final class Factory {

      public static CTShapeProperties newInstance() {
         return (CTShapeProperties)POIXMLTypeLoader.newInstance(CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties newInstance(XmlOptions var0) {
         return (CTShapeProperties)POIXMLTypeLoader.newInstance(CTShapeProperties.type, var0);
      }

      public static CTShapeProperties parse(String var0) throws XmlException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static CTShapeProperties parse(File var0) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static CTShapeProperties parse(URL var0) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static CTShapeProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static CTShapeProperties parse(Reader var0) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static CTShapeProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static CTShapeProperties parse(Node var0) throws XmlException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static CTShapeProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static CTShapeProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTShapeProperties)POIXMLTypeLoader.parse(var0, CTShapeProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeProperties.type, var1);
      }

   }
}
