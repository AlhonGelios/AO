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
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;
import org.w3c.dom.Node;

public interface CTTableProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttableproperties3512type");


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

   CTTableStyle getTableStyle();

   boolean isSetTableStyle();

   void setTableStyle(CTTableStyle var1);

   CTTableStyle addNewTableStyle();

   void unsetTableStyle();

   String getTableStyleId();

   STGuid xgetTableStyleId();

   boolean isSetTableStyleId();

   void setTableStyleId(String var1);

   void xsetTableStyleId(STGuid var1);

   void unsetTableStyleId();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getRtl();

   XmlBoolean xgetRtl();

   boolean isSetRtl();

   void setRtl(boolean var1);

   void xsetRtl(XmlBoolean var1);

   void unsetRtl();

   boolean getFirstRow();

   XmlBoolean xgetFirstRow();

   boolean isSetFirstRow();

   void setFirstRow(boolean var1);

   void xsetFirstRow(XmlBoolean var1);

   void unsetFirstRow();

   boolean getFirstCol();

   XmlBoolean xgetFirstCol();

   boolean isSetFirstCol();

   void setFirstCol(boolean var1);

   void xsetFirstCol(XmlBoolean var1);

   void unsetFirstCol();

   boolean getLastRow();

   XmlBoolean xgetLastRow();

   boolean isSetLastRow();

   void setLastRow(boolean var1);

   void xsetLastRow(XmlBoolean var1);

   void unsetLastRow();

   boolean getLastCol();

   XmlBoolean xgetLastCol();

   boolean isSetLastCol();

   void setLastCol(boolean var1);

   void xsetLastCol(XmlBoolean var1);

   void unsetLastCol();

   boolean getBandRow();

   XmlBoolean xgetBandRow();

   boolean isSetBandRow();

   void setBandRow(boolean var1);

   void xsetBandRow(XmlBoolean var1);

   void unsetBandRow();

   boolean getBandCol();

   XmlBoolean xgetBandCol();

   boolean isSetBandCol();

   void setBandCol(boolean var1);

   void xsetBandCol(XmlBoolean var1);

   void unsetBandCol();


   public static final class Factory {

      public static CTTableProperties newInstance() {
         return (CTTableProperties)POIXMLTypeLoader.newInstance(CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties newInstance(XmlOptions var0) {
         return (CTTableProperties)POIXMLTypeLoader.newInstance(CTTableProperties.type, var0);
      }

      public static CTTableProperties parse(String var0) throws XmlException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static CTTableProperties parse(File var0) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static CTTableProperties parse(URL var0) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static CTTableProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static CTTableProperties parse(Reader var0) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static CTTableProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static CTTableProperties parse(Node var0) throws XmlException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static CTTableProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static CTTableProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableProperties)POIXMLTypeLoader.parse(var0, CTTableProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableProperties.type, var1);
      }

   }
}
