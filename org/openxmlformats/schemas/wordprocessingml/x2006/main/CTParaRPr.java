package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun;
import org.w3c.dom.Node;

public interface CTParaRPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTParaRPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpararprd6fetype");


   CTTrackChange getIns();

   boolean isSetIns();

   void setIns(CTTrackChange var1);

   CTTrackChange addNewIns();

   void unsetIns();

   CTTrackChange getDel();

   boolean isSetDel();

   void setDel(CTTrackChange var1);

   CTTrackChange addNewDel();

   void unsetDel();

   CTTrackChange getMoveFrom();

   boolean isSetMoveFrom();

   void setMoveFrom(CTTrackChange var1);

   CTTrackChange addNewMoveFrom();

   void unsetMoveFrom();

   CTTrackChange getMoveTo();

   boolean isSetMoveTo();

   void setMoveTo(CTTrackChange var1);

   CTTrackChange addNewMoveTo();

   void unsetMoveTo();

   CTString getRStyle();

   boolean isSetRStyle();

   void setRStyle(CTString var1);

   CTString addNewRStyle();

   void unsetRStyle();

   CTFonts getRFonts();

   boolean isSetRFonts();

   void setRFonts(CTFonts var1);

   CTFonts addNewRFonts();

   void unsetRFonts();

   CTOnOff getB();

   boolean isSetB();

   void setB(CTOnOff var1);

   CTOnOff addNewB();

   void unsetB();

   CTOnOff getBCs();

   boolean isSetBCs();

   void setBCs(CTOnOff var1);

   CTOnOff addNewBCs();

   void unsetBCs();

   CTOnOff getI();

   boolean isSetI();

   void setI(CTOnOff var1);

   CTOnOff addNewI();

   void unsetI();

   CTOnOff getICs();

   boolean isSetICs();

   void setICs(CTOnOff var1);

   CTOnOff addNewICs();

   void unsetICs();

   CTOnOff getCaps();

   boolean isSetCaps();

   void setCaps(CTOnOff var1);

   CTOnOff addNewCaps();

   void unsetCaps();

   CTOnOff getSmallCaps();

   boolean isSetSmallCaps();

   void setSmallCaps(CTOnOff var1);

   CTOnOff addNewSmallCaps();

   void unsetSmallCaps();

   CTOnOff getStrike();

   boolean isSetStrike();

   void setStrike(CTOnOff var1);

   CTOnOff addNewStrike();

   void unsetStrike();

   CTOnOff getDstrike();

   boolean isSetDstrike();

   void setDstrike(CTOnOff var1);

   CTOnOff addNewDstrike();

   void unsetDstrike();

   CTOnOff getOutline();

   boolean isSetOutline();

   void setOutline(CTOnOff var1);

   CTOnOff addNewOutline();

   void unsetOutline();

   CTOnOff getShadow();

   boolean isSetShadow();

   void setShadow(CTOnOff var1);

   CTOnOff addNewShadow();

   void unsetShadow();

   CTOnOff getEmboss();

   boolean isSetEmboss();

   void setEmboss(CTOnOff var1);

   CTOnOff addNewEmboss();

   void unsetEmboss();

   CTOnOff getImprint();

   boolean isSetImprint();

   void setImprint(CTOnOff var1);

   CTOnOff addNewImprint();

   void unsetImprint();

   CTOnOff getNoProof();

   boolean isSetNoProof();

   void setNoProof(CTOnOff var1);

   CTOnOff addNewNoProof();

   void unsetNoProof();

   CTOnOff getSnapToGrid();

   boolean isSetSnapToGrid();

   void setSnapToGrid(CTOnOff var1);

   CTOnOff addNewSnapToGrid();

   void unsetSnapToGrid();

   CTOnOff getVanish();

   boolean isSetVanish();

   void setVanish(CTOnOff var1);

   CTOnOff addNewVanish();

   void unsetVanish();

   CTOnOff getWebHidden();

   boolean isSetWebHidden();

   void setWebHidden(CTOnOff var1);

   CTOnOff addNewWebHidden();

   void unsetWebHidden();

   CTColor getColor();

   boolean isSetColor();

   void setColor(CTColor var1);

   CTColor addNewColor();

   void unsetColor();

   CTSignedTwipsMeasure getSpacing();

   boolean isSetSpacing();

   void setSpacing(CTSignedTwipsMeasure var1);

   CTSignedTwipsMeasure addNewSpacing();

   void unsetSpacing();

   CTTextScale getW();

   boolean isSetW();

   void setW(CTTextScale var1);

   CTTextScale addNewW();

   void unsetW();

   CTHpsMeasure getKern();

   boolean isSetKern();

   void setKern(CTHpsMeasure var1);

   CTHpsMeasure addNewKern();

   void unsetKern();

   CTSignedHpsMeasure getPosition();

   boolean isSetPosition();

   void setPosition(CTSignedHpsMeasure var1);

   CTSignedHpsMeasure addNewPosition();

   void unsetPosition();

   CTHpsMeasure getSz();

   boolean isSetSz();

   void setSz(CTHpsMeasure var1);

   CTHpsMeasure addNewSz();

   void unsetSz();

   CTHpsMeasure getSzCs();

   boolean isSetSzCs();

   void setSzCs(CTHpsMeasure var1);

   CTHpsMeasure addNewSzCs();

   void unsetSzCs();

   CTHighlight getHighlight();

   boolean isSetHighlight();

   void setHighlight(CTHighlight var1);

   CTHighlight addNewHighlight();

   void unsetHighlight();

   CTUnderline getU();

   boolean isSetU();

   void setU(CTUnderline var1);

   CTUnderline addNewU();

   void unsetU();

   CTTextEffect getEffect();

   boolean isSetEffect();

   void setEffect(CTTextEffect var1);

   CTTextEffect addNewEffect();

   void unsetEffect();

   CTBorder getBdr();

   boolean isSetBdr();

   void setBdr(CTBorder var1);

   CTBorder addNewBdr();

   void unsetBdr();

   CTShd getShd();

   boolean isSetShd();

   void setShd(CTShd var1);

   CTShd addNewShd();

   void unsetShd();

   CTFitText getFitText();

   boolean isSetFitText();

   void setFitText(CTFitText var1);

   CTFitText addNewFitText();

   void unsetFitText();

   CTVerticalAlignRun getVertAlign();

   boolean isSetVertAlign();

   void setVertAlign(CTVerticalAlignRun var1);

   CTVerticalAlignRun addNewVertAlign();

   void unsetVertAlign();

   CTOnOff getRtl();

   boolean isSetRtl();

   void setRtl(CTOnOff var1);

   CTOnOff addNewRtl();

   void unsetRtl();

   CTOnOff getCs();

   boolean isSetCs();

   void setCs(CTOnOff var1);

   CTOnOff addNewCs();

   void unsetCs();

   CTEm getEm();

   boolean isSetEm();

   void setEm(CTEm var1);

   CTEm addNewEm();

   void unsetEm();

   CTLanguage getLang();

   boolean isSetLang();

   void setLang(CTLanguage var1);

   CTLanguage addNewLang();

   void unsetLang();

   CTEastAsianLayout getEastAsianLayout();

   boolean isSetEastAsianLayout();

   void setEastAsianLayout(CTEastAsianLayout var1);

   CTEastAsianLayout addNewEastAsianLayout();

   void unsetEastAsianLayout();

   CTOnOff getSpecVanish();

   boolean isSetSpecVanish();

   void setSpecVanish(CTOnOff var1);

   CTOnOff addNewSpecVanish();

   void unsetSpecVanish();

   CTOnOff getOMath();

   boolean isSetOMath();

   void setOMath(CTOnOff var1);

   CTOnOff addNewOMath();

   void unsetOMath();

   CTParaRPrChange getRPrChange();

   boolean isSetRPrChange();

   void setRPrChange(CTParaRPrChange var1);

   CTParaRPrChange addNewRPrChange();

   void unsetRPrChange();


   public static final class Factory {

      public static CTParaRPr newInstance() {
         return (CTParaRPr)POIXMLTypeLoader.newInstance(CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr newInstance(XmlOptions var0) {
         return (CTParaRPr)POIXMLTypeLoader.newInstance(CTParaRPr.type, var0);
      }

      public static CTParaRPr parse(String var0) throws XmlException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static CTParaRPr parse(File var0) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static CTParaRPr parse(URL var0) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static CTParaRPr parse(InputStream var0) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static CTParaRPr parse(Reader var0) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static CTParaRPr parse(XMLStreamReader var0) throws XmlException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static CTParaRPr parse(Node var0) throws XmlException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static CTParaRPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static CTParaRPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTParaRPr)POIXMLTypeLoader.parse(var0, CTParaRPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTParaRPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTParaRPr.type, var1);
      }

   }
}
