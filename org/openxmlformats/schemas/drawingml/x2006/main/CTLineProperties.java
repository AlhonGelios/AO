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
import org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineCap;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth;
import org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment;
import org.w3c.dom.Node;

public interface CTLineProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLineProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlinepropertiesd5e2type");


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

   CTPatternFillProperties getPattFill();

   boolean isSetPattFill();

   void setPattFill(CTPatternFillProperties var1);

   CTPatternFillProperties addNewPattFill();

   void unsetPattFill();

   CTPresetLineDashProperties getPrstDash();

   boolean isSetPrstDash();

   void setPrstDash(CTPresetLineDashProperties var1);

   CTPresetLineDashProperties addNewPrstDash();

   void unsetPrstDash();

   CTDashStopList getCustDash();

   boolean isSetCustDash();

   void setCustDash(CTDashStopList var1);

   CTDashStopList addNewCustDash();

   void unsetCustDash();

   CTLineJoinRound getRound();

   boolean isSetRound();

   void setRound(CTLineJoinRound var1);

   CTLineJoinRound addNewRound();

   void unsetRound();

   CTLineJoinBevel getBevel();

   boolean isSetBevel();

   void setBevel(CTLineJoinBevel var1);

   CTLineJoinBevel addNewBevel();

   void unsetBevel();

   CTLineJoinMiterProperties getMiter();

   boolean isSetMiter();

   void setMiter(CTLineJoinMiterProperties var1);

   CTLineJoinMiterProperties addNewMiter();

   void unsetMiter();

   CTLineEndProperties getHeadEnd();

   boolean isSetHeadEnd();

   void setHeadEnd(CTLineEndProperties var1);

   CTLineEndProperties addNewHeadEnd();

   void unsetHeadEnd();

   CTLineEndProperties getTailEnd();

   boolean isSetTailEnd();

   void setTailEnd(CTLineEndProperties var1);

   CTLineEndProperties addNewTailEnd();

   void unsetTailEnd();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   int getW();

   STLineWidth xgetW();

   boolean isSetW();

   void setW(int var1);

   void xsetW(STLineWidth var1);

   void unsetW();

   STLineCap.Enum getCap();

   STLineCap xgetCap();

   boolean isSetCap();

   void setCap(STLineCap.Enum var1);

   void xsetCap(STLineCap var1);

   void unsetCap();

   STCompoundLine.Enum getCmpd();

   STCompoundLine xgetCmpd();

   boolean isSetCmpd();

   void setCmpd(STCompoundLine.Enum var1);

   void xsetCmpd(STCompoundLine var1);

   void unsetCmpd();

   STPenAlignment.Enum getAlgn();

   STPenAlignment xgetAlgn();

   boolean isSetAlgn();

   void setAlgn(STPenAlignment.Enum var1);

   void xsetAlgn(STPenAlignment var1);

   void unsetAlgn();


   public static final class Factory {

      public static CTLineProperties newInstance() {
         return (CTLineProperties)POIXMLTypeLoader.newInstance(CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties newInstance(XmlOptions var0) {
         return (CTLineProperties)POIXMLTypeLoader.newInstance(CTLineProperties.type, var0);
      }

      public static CTLineProperties parse(String var0) throws XmlException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static CTLineProperties parse(File var0) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static CTLineProperties parse(URL var0) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static CTLineProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static CTLineProperties parse(Reader var0) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static CTLineProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static CTLineProperties parse(Node var0) throws XmlException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static CTLineProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static CTLineProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLineProperties)POIXMLTypeLoader.parse(var0, CTLineProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineProperties.type, var1);
      }

   }
}
