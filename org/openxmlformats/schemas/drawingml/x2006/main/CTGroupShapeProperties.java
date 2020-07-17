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
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode$Enum;
import org.w3c.dom.Node;

public interface CTGroupShapeProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGroupShapeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgroupshapeproperties8690type");


   CTGroupTransform2D getXfrm();

   boolean isSetXfrm();

   void setXfrm(CTGroupTransform2D var1);

   CTGroupTransform2D addNewXfrm();

   void unsetXfrm();

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

      public static CTGroupShapeProperties newInstance() {
         return (CTGroupShapeProperties)POIXMLTypeLoader.newInstance(CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties newInstance(XmlOptions var0) {
         return (CTGroupShapeProperties)POIXMLTypeLoader.newInstance(CTGroupShapeProperties.type, var0);
      }

      public static CTGroupShapeProperties parse(String var0) throws XmlException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static CTGroupShapeProperties parse(File var0) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static CTGroupShapeProperties parse(URL var0) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static CTGroupShapeProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static CTGroupShapeProperties parse(Reader var0) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static CTGroupShapeProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static CTGroupShapeProperties parse(Node var0) throws XmlException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static CTGroupShapeProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static CTGroupShapeProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGroupShapeProperties)POIXMLTypeLoader.parse(var0, CTGroupShapeProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupShapeProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupShapeProperties.type, var1);
      }

   }
}
