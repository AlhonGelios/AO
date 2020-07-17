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
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin;
import org.w3c.dom.Node;

public interface CTTextParagraphProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextParagraphProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextparagraphpropertiesdd05type");


   CTTextSpacing getLnSpc();

   boolean isSetLnSpc();

   void setLnSpc(CTTextSpacing var1);

   CTTextSpacing addNewLnSpc();

   void unsetLnSpc();

   CTTextSpacing getSpcBef();

   boolean isSetSpcBef();

   void setSpcBef(CTTextSpacing var1);

   CTTextSpacing addNewSpcBef();

   void unsetSpcBef();

   CTTextSpacing getSpcAft();

   boolean isSetSpcAft();

   void setSpcAft(CTTextSpacing var1);

   CTTextSpacing addNewSpcAft();

   void unsetSpcAft();

   CTTextBulletColorFollowText getBuClrTx();

   boolean isSetBuClrTx();

   void setBuClrTx(CTTextBulletColorFollowText var1);

   CTTextBulletColorFollowText addNewBuClrTx();

   void unsetBuClrTx();

   CTColor getBuClr();

   boolean isSetBuClr();

   void setBuClr(CTColor var1);

   CTColor addNewBuClr();

   void unsetBuClr();

   CTTextBulletSizeFollowText getBuSzTx();

   boolean isSetBuSzTx();

   void setBuSzTx(CTTextBulletSizeFollowText var1);

   CTTextBulletSizeFollowText addNewBuSzTx();

   void unsetBuSzTx();

   CTTextBulletSizePercent getBuSzPct();

   boolean isSetBuSzPct();

   void setBuSzPct(CTTextBulletSizePercent var1);

   CTTextBulletSizePercent addNewBuSzPct();

   void unsetBuSzPct();

   CTTextBulletSizePoint getBuSzPts();

   boolean isSetBuSzPts();

   void setBuSzPts(CTTextBulletSizePoint var1);

   CTTextBulletSizePoint addNewBuSzPts();

   void unsetBuSzPts();

   CTTextBulletTypefaceFollowText getBuFontTx();

   boolean isSetBuFontTx();

   void setBuFontTx(CTTextBulletTypefaceFollowText var1);

   CTTextBulletTypefaceFollowText addNewBuFontTx();

   void unsetBuFontTx();

   CTTextFont getBuFont();

   boolean isSetBuFont();

   void setBuFont(CTTextFont var1);

   CTTextFont addNewBuFont();

   void unsetBuFont();

   CTTextNoBullet getBuNone();

   boolean isSetBuNone();

   void setBuNone(CTTextNoBullet var1);

   CTTextNoBullet addNewBuNone();

   void unsetBuNone();

   CTTextAutonumberBullet getBuAutoNum();

   boolean isSetBuAutoNum();

   void setBuAutoNum(CTTextAutonumberBullet var1);

   CTTextAutonumberBullet addNewBuAutoNum();

   void unsetBuAutoNum();

   CTTextCharBullet getBuChar();

   boolean isSetBuChar();

   void setBuChar(CTTextCharBullet var1);

   CTTextCharBullet addNewBuChar();

   void unsetBuChar();

   CTTextBlipBullet getBuBlip();

   boolean isSetBuBlip();

   void setBuBlip(CTTextBlipBullet var1);

   CTTextBlipBullet addNewBuBlip();

   void unsetBuBlip();

   CTTextTabStopList getTabLst();

   boolean isSetTabLst();

   void setTabLst(CTTextTabStopList var1);

   CTTextTabStopList addNewTabLst();

   void unsetTabLst();

   CTTextCharacterProperties getDefRPr();

   boolean isSetDefRPr();

   void setDefRPr(CTTextCharacterProperties var1);

   CTTextCharacterProperties addNewDefRPr();

   void unsetDefRPr();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   int getMarL();

   STTextMargin xgetMarL();

   boolean isSetMarL();

   void setMarL(int var1);

   void xsetMarL(STTextMargin var1);

   void unsetMarL();

   int getMarR();

   STTextMargin xgetMarR();

   boolean isSetMarR();

   void setMarR(int var1);

   void xsetMarR(STTextMargin var1);

   void unsetMarR();

   int getLvl();

   STTextIndentLevelType xgetLvl();

   boolean isSetLvl();

   void setLvl(int var1);

   void xsetLvl(STTextIndentLevelType var1);

   void unsetLvl();

   int getIndent();

   STTextIndent xgetIndent();

   boolean isSetIndent();

   void setIndent(int var1);

   void xsetIndent(STTextIndent var1);

   void unsetIndent();

   STTextAlignType.Enum getAlgn();

   STTextAlignType xgetAlgn();

   boolean isSetAlgn();

   void setAlgn(STTextAlignType.Enum var1);

   void xsetAlgn(STTextAlignType var1);

   void unsetAlgn();

   int getDefTabSz();

   STCoordinate32 xgetDefTabSz();

   boolean isSetDefTabSz();

   void setDefTabSz(int var1);

   void xsetDefTabSz(STCoordinate32 var1);

   void unsetDefTabSz();

   boolean getRtl();

   XmlBoolean xgetRtl();

   boolean isSetRtl();

   void setRtl(boolean var1);

   void xsetRtl(XmlBoolean var1);

   void unsetRtl();

   boolean getEaLnBrk();

   XmlBoolean xgetEaLnBrk();

   boolean isSetEaLnBrk();

   void setEaLnBrk(boolean var1);

   void xsetEaLnBrk(XmlBoolean var1);

   void unsetEaLnBrk();

   STTextFontAlignType.Enum getFontAlgn();

   STTextFontAlignType xgetFontAlgn();

   boolean isSetFontAlgn();

   void setFontAlgn(STTextFontAlignType.Enum var1);

   void xsetFontAlgn(STTextFontAlignType var1);

   void unsetFontAlgn();

   boolean getLatinLnBrk();

   XmlBoolean xgetLatinLnBrk();

   boolean isSetLatinLnBrk();

   void setLatinLnBrk(boolean var1);

   void xsetLatinLnBrk(XmlBoolean var1);

   void unsetLatinLnBrk();

   boolean getHangingPunct();

   XmlBoolean xgetHangingPunct();

   boolean isSetHangingPunct();

   void setHangingPunct(boolean var1);

   void xsetHangingPunct(XmlBoolean var1);

   void unsetHangingPunct();


   public static final class Factory {

      public static CTTextParagraphProperties newInstance() {
         return (CTTextParagraphProperties)POIXMLTypeLoader.newInstance(CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties newInstance(XmlOptions var0) {
         return (CTTextParagraphProperties)POIXMLTypeLoader.newInstance(CTTextParagraphProperties.type, var0);
      }

      public static CTTextParagraphProperties parse(String var0) throws XmlException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static CTTextParagraphProperties parse(File var0) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static CTTextParagraphProperties parse(URL var0) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static CTTextParagraphProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static CTTextParagraphProperties parse(Reader var0) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static CTTextParagraphProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static CTTextParagraphProperties parse(Node var0) throws XmlException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static CTTextParagraphProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static CTTextParagraphProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextParagraphProperties)POIXMLTypeLoader.parse(var0, CTTextParagraphProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextParagraphProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextParagraphProperties.type, var1);
      }

   }
}
