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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType;
import org.w3c.dom.Node;

public interface CTTextCharacterProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextCharacterProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextcharacterproperties76c0type");


   CTLineProperties getLn();

   boolean isSetLn();

   void setLn(CTLineProperties var1);

   CTLineProperties addNewLn();

   void unsetLn();

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

   CTColor getHighlight();

   boolean isSetHighlight();

   void setHighlight(CTColor var1);

   CTColor addNewHighlight();

   void unsetHighlight();

   CTTextUnderlineLineFollowText getULnTx();

   boolean isSetULnTx();

   void setULnTx(CTTextUnderlineLineFollowText var1);

   CTTextUnderlineLineFollowText addNewULnTx();

   void unsetULnTx();

   CTLineProperties getULn();

   boolean isSetULn();

   void setULn(CTLineProperties var1);

   CTLineProperties addNewULn();

   void unsetULn();

   CTTextUnderlineFillFollowText getUFillTx();

   boolean isSetUFillTx();

   void setUFillTx(CTTextUnderlineFillFollowText var1);

   CTTextUnderlineFillFollowText addNewUFillTx();

   void unsetUFillTx();

   CTTextUnderlineFillGroupWrapper getUFill();

   boolean isSetUFill();

   void setUFill(CTTextUnderlineFillGroupWrapper var1);

   CTTextUnderlineFillGroupWrapper addNewUFill();

   void unsetUFill();

   CTTextFont getLatin();

   boolean isSetLatin();

   void setLatin(CTTextFont var1);

   CTTextFont addNewLatin();

   void unsetLatin();

   CTTextFont getEa();

   boolean isSetEa();

   void setEa(CTTextFont var1);

   CTTextFont addNewEa();

   void unsetEa();

   CTTextFont getCs();

   boolean isSetCs();

   void setCs(CTTextFont var1);

   CTTextFont addNewCs();

   void unsetCs();

   CTTextFont getSym();

   boolean isSetSym();

   void setSym(CTTextFont var1);

   CTTextFont addNewSym();

   void unsetSym();

   CTHyperlink getHlinkClick();

   boolean isSetHlinkClick();

   void setHlinkClick(CTHyperlink var1);

   CTHyperlink addNewHlinkClick();

   void unsetHlinkClick();

   CTHyperlink getHlinkMouseOver();

   boolean isSetHlinkMouseOver();

   void setHlinkMouseOver(CTHyperlink var1);

   CTHyperlink addNewHlinkMouseOver();

   void unsetHlinkMouseOver();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getKumimoji();

   XmlBoolean xgetKumimoji();

   boolean isSetKumimoji();

   void setKumimoji(boolean var1);

   void xsetKumimoji(XmlBoolean var1);

   void unsetKumimoji();

   String getLang();

   STTextLanguageID xgetLang();

   boolean isSetLang();

   void setLang(String var1);

   void xsetLang(STTextLanguageID var1);

   void unsetLang();

   String getAltLang();

   STTextLanguageID xgetAltLang();

   boolean isSetAltLang();

   void setAltLang(String var1);

   void xsetAltLang(STTextLanguageID var1);

   void unsetAltLang();

   int getSz();

   STTextFontSize xgetSz();

   boolean isSetSz();

   void setSz(int var1);

   void xsetSz(STTextFontSize var1);

   void unsetSz();

   boolean getB();

   XmlBoolean xgetB();

   boolean isSetB();

   void setB(boolean var1);

   void xsetB(XmlBoolean var1);

   void unsetB();

   boolean getI();

   XmlBoolean xgetI();

   boolean isSetI();

   void setI(boolean var1);

   void xsetI(XmlBoolean var1);

   void unsetI();

   STTextUnderlineType.Enum getU();

   STTextUnderlineType xgetU();

   boolean isSetU();

   void setU(STTextUnderlineType.Enum var1);

   void xsetU(STTextUnderlineType var1);

   void unsetU();

   STTextStrikeType.Enum getStrike();

   STTextStrikeType xgetStrike();

   boolean isSetStrike();

   void setStrike(STTextStrikeType.Enum var1);

   void xsetStrike(STTextStrikeType var1);

   void unsetStrike();

   int getKern();

   STTextNonNegativePoint xgetKern();

   boolean isSetKern();

   void setKern(int var1);

   void xsetKern(STTextNonNegativePoint var1);

   void unsetKern();

   STTextCapsType.Enum getCap();

   STTextCapsType xgetCap();

   boolean isSetCap();

   void setCap(STTextCapsType.Enum var1);

   void xsetCap(STTextCapsType var1);

   void unsetCap();

   int getSpc();

   STTextPoint xgetSpc();

   boolean isSetSpc();

   void setSpc(int var1);

   void xsetSpc(STTextPoint var1);

   void unsetSpc();

   boolean getNormalizeH();

   XmlBoolean xgetNormalizeH();

   boolean isSetNormalizeH();

   void setNormalizeH(boolean var1);

   void xsetNormalizeH(XmlBoolean var1);

   void unsetNormalizeH();

   int getBaseline();

   STPercentage xgetBaseline();

   boolean isSetBaseline();

   void setBaseline(int var1);

   void xsetBaseline(STPercentage var1);

   void unsetBaseline();

   boolean getNoProof();

   XmlBoolean xgetNoProof();

   boolean isSetNoProof();

   void setNoProof(boolean var1);

   void xsetNoProof(XmlBoolean var1);

   void unsetNoProof();

   boolean getDirty();

   XmlBoolean xgetDirty();

   boolean isSetDirty();

   void setDirty(boolean var1);

   void xsetDirty(XmlBoolean var1);

   void unsetDirty();

   boolean getErr();

   XmlBoolean xgetErr();

   boolean isSetErr();

   void setErr(boolean var1);

   void xsetErr(XmlBoolean var1);

   void unsetErr();

   boolean getSmtClean();

   XmlBoolean xgetSmtClean();

   boolean isSetSmtClean();

   void setSmtClean(boolean var1);

   void xsetSmtClean(XmlBoolean var1);

   void unsetSmtClean();

   long getSmtId();

   XmlUnsignedInt xgetSmtId();

   boolean isSetSmtId();

   void setSmtId(long var1);

   void xsetSmtId(XmlUnsignedInt var1);

   void unsetSmtId();

   String getBmk();

   XmlString xgetBmk();

   boolean isSetBmk();

   void setBmk(String var1);

   void xsetBmk(XmlString var1);

   void unsetBmk();


   public static final class Factory {

      public static CTTextCharacterProperties newInstance() {
         return (CTTextCharacterProperties)POIXMLTypeLoader.newInstance(CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties newInstance(XmlOptions var0) {
         return (CTTextCharacterProperties)POIXMLTypeLoader.newInstance(CTTextCharacterProperties.type, var0);
      }

      public static CTTextCharacterProperties parse(String var0) throws XmlException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static CTTextCharacterProperties parse(File var0) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static CTTextCharacterProperties parse(URL var0) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static CTTextCharacterProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static CTTextCharacterProperties parse(Reader var0) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static CTTextCharacterProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static CTTextCharacterProperties parse(Node var0) throws XmlException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static CTTextCharacterProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static CTTextCharacterProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextCharacterProperties)POIXMLTypeLoader.parse(var0, CTTextCharacterProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextCharacterProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextCharacterProperties.type, var1);
      }

   }
}
