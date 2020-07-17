package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STTextAutonumberScheme extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextAutonumberScheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextautonumberschemed675type");
   STTextAutonumberScheme.Enum ALPHA_LC_PAREN_BOTH = STTextAutonumberScheme.Enum.forString("alphaLcParenBoth");
   STTextAutonumberScheme.Enum ALPHA_UC_PAREN_BOTH = STTextAutonumberScheme.Enum.forString("alphaUcParenBoth");
   STTextAutonumberScheme.Enum ALPHA_LC_PAREN_R = STTextAutonumberScheme.Enum.forString("alphaLcParenR");
   STTextAutonumberScheme.Enum ALPHA_UC_PAREN_R = STTextAutonumberScheme.Enum.forString("alphaUcParenR");
   STTextAutonumberScheme.Enum ALPHA_LC_PERIOD = STTextAutonumberScheme.Enum.forString("alphaLcPeriod");
   STTextAutonumberScheme.Enum ALPHA_UC_PERIOD = STTextAutonumberScheme.Enum.forString("alphaUcPeriod");
   STTextAutonumberScheme.Enum ARABIC_PAREN_BOTH = STTextAutonumberScheme.Enum.forString("arabicParenBoth");
   STTextAutonumberScheme.Enum ARABIC_PAREN_R = STTextAutonumberScheme.Enum.forString("arabicParenR");
   STTextAutonumberScheme.Enum ARABIC_PERIOD = STTextAutonumberScheme.Enum.forString("arabicPeriod");
   STTextAutonumberScheme.Enum ARABIC_PLAIN = STTextAutonumberScheme.Enum.forString("arabicPlain");
   STTextAutonumberScheme.Enum ROMAN_LC_PAREN_BOTH = STTextAutonumberScheme.Enum.forString("romanLcParenBoth");
   STTextAutonumberScheme.Enum ROMAN_UC_PAREN_BOTH = STTextAutonumberScheme.Enum.forString("romanUcParenBoth");
   STTextAutonumberScheme.Enum ROMAN_LC_PAREN_R = STTextAutonumberScheme.Enum.forString("romanLcParenR");
   STTextAutonumberScheme.Enum ROMAN_UC_PAREN_R = STTextAutonumberScheme.Enum.forString("romanUcParenR");
   STTextAutonumberScheme.Enum ROMAN_LC_PERIOD = STTextAutonumberScheme.Enum.forString("romanLcPeriod");
   STTextAutonumberScheme.Enum ROMAN_UC_PERIOD = STTextAutonumberScheme.Enum.forString("romanUcPeriod");
   STTextAutonumberScheme.Enum CIRCLE_NUM_DB_PLAIN = STTextAutonumberScheme.Enum.forString("circleNumDbPlain");
   STTextAutonumberScheme.Enum CIRCLE_NUM_WD_BLACK_PLAIN = STTextAutonumberScheme.Enum.forString("circleNumWdBlackPlain");
   STTextAutonumberScheme.Enum CIRCLE_NUM_WD_WHITE_PLAIN = STTextAutonumberScheme.Enum.forString("circleNumWdWhitePlain");
   STTextAutonumberScheme.Enum ARABIC_DB_PERIOD = STTextAutonumberScheme.Enum.forString("arabicDbPeriod");
   STTextAutonumberScheme.Enum ARABIC_DB_PLAIN = STTextAutonumberScheme.Enum.forString("arabicDbPlain");
   STTextAutonumberScheme.Enum EA_1_CHS_PERIOD = STTextAutonumberScheme.Enum.forString("ea1ChsPeriod");
   STTextAutonumberScheme.Enum EA_1_CHS_PLAIN = STTextAutonumberScheme.Enum.forString("ea1ChsPlain");
   STTextAutonumberScheme.Enum EA_1_CHT_PERIOD = STTextAutonumberScheme.Enum.forString("ea1ChtPeriod");
   STTextAutonumberScheme.Enum EA_1_CHT_PLAIN = STTextAutonumberScheme.Enum.forString("ea1ChtPlain");
   STTextAutonumberScheme.Enum EA_1_JPN_CHS_DB_PERIOD = STTextAutonumberScheme.Enum.forString("ea1JpnChsDbPeriod");
   STTextAutonumberScheme.Enum EA_1_JPN_KOR_PLAIN = STTextAutonumberScheme.Enum.forString("ea1JpnKorPlain");
   STTextAutonumberScheme.Enum EA_1_JPN_KOR_PERIOD = STTextAutonumberScheme.Enum.forString("ea1JpnKorPeriod");
   STTextAutonumberScheme.Enum ARABIC_1_MINUS = STTextAutonumberScheme.Enum.forString("arabic1Minus");
   STTextAutonumberScheme.Enum ARABIC_2_MINUS = STTextAutonumberScheme.Enum.forString("arabic2Minus");
   STTextAutonumberScheme.Enum HEBREW_2_MINUS = STTextAutonumberScheme.Enum.forString("hebrew2Minus");
   STTextAutonumberScheme.Enum THAI_ALPHA_PERIOD = STTextAutonumberScheme.Enum.forString("thaiAlphaPeriod");
   STTextAutonumberScheme.Enum THAI_ALPHA_PAREN_R = STTextAutonumberScheme.Enum.forString("thaiAlphaParenR");
   STTextAutonumberScheme.Enum THAI_ALPHA_PAREN_BOTH = STTextAutonumberScheme.Enum.forString("thaiAlphaParenBoth");
   STTextAutonumberScheme.Enum THAI_NUM_PERIOD = STTextAutonumberScheme.Enum.forString("thaiNumPeriod");
   STTextAutonumberScheme.Enum THAI_NUM_PAREN_R = STTextAutonumberScheme.Enum.forString("thaiNumParenR");
   STTextAutonumberScheme.Enum THAI_NUM_PAREN_BOTH = STTextAutonumberScheme.Enum.forString("thaiNumParenBoth");
   STTextAutonumberScheme.Enum HINDI_ALPHA_PERIOD = STTextAutonumberScheme.Enum.forString("hindiAlphaPeriod");
   STTextAutonumberScheme.Enum HINDI_NUM_PERIOD = STTextAutonumberScheme.Enum.forString("hindiNumPeriod");
   STTextAutonumberScheme.Enum HINDI_NUM_PAREN_R = STTextAutonumberScheme.Enum.forString("hindiNumParenR");
   STTextAutonumberScheme.Enum HINDI_ALPHA_1_PERIOD = STTextAutonumberScheme.Enum.forString("hindiAlpha1Period");
   int INT_ALPHA_LC_PAREN_BOTH = 1;
   int INT_ALPHA_UC_PAREN_BOTH = 2;
   int INT_ALPHA_LC_PAREN_R = 3;
   int INT_ALPHA_UC_PAREN_R = 4;
   int INT_ALPHA_LC_PERIOD = 5;
   int INT_ALPHA_UC_PERIOD = 6;
   int INT_ARABIC_PAREN_BOTH = 7;
   int INT_ARABIC_PAREN_R = 8;
   int INT_ARABIC_PERIOD = 9;
   int INT_ARABIC_PLAIN = 10;
   int INT_ROMAN_LC_PAREN_BOTH = 11;
   int INT_ROMAN_UC_PAREN_BOTH = 12;
   int INT_ROMAN_LC_PAREN_R = 13;
   int INT_ROMAN_UC_PAREN_R = 14;
   int INT_ROMAN_LC_PERIOD = 15;
   int INT_ROMAN_UC_PERIOD = 16;
   int INT_CIRCLE_NUM_DB_PLAIN = 17;
   int INT_CIRCLE_NUM_WD_BLACK_PLAIN = 18;
   int INT_CIRCLE_NUM_WD_WHITE_PLAIN = 19;
   int INT_ARABIC_DB_PERIOD = 20;
   int INT_ARABIC_DB_PLAIN = 21;
   int INT_EA_1_CHS_PERIOD = 22;
   int INT_EA_1_CHS_PLAIN = 23;
   int INT_EA_1_CHT_PERIOD = 24;
   int INT_EA_1_CHT_PLAIN = 25;
   int INT_EA_1_JPN_CHS_DB_PERIOD = 26;
   int INT_EA_1_JPN_KOR_PLAIN = 27;
   int INT_EA_1_JPN_KOR_PERIOD = 28;
   int INT_ARABIC_1_MINUS = 29;
   int INT_ARABIC_2_MINUS = 30;
   int INT_HEBREW_2_MINUS = 31;
   int INT_THAI_ALPHA_PERIOD = 32;
   int INT_THAI_ALPHA_PAREN_R = 33;
   int INT_THAI_ALPHA_PAREN_BOTH = 34;
   int INT_THAI_NUM_PERIOD = 35;
   int INT_THAI_NUM_PAREN_R = 36;
   int INT_THAI_NUM_PAREN_BOTH = 37;
   int INT_HINDI_ALPHA_PERIOD = 38;
   int INT_HINDI_NUM_PERIOD = 39;
   int INT_HINDI_NUM_PAREN_R = 40;
   int INT_HINDI_ALPHA_1_PERIOD = 41;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STTextAutonumberScheme newValue(Object var0) {
         return (STTextAutonumberScheme)STTextAutonumberScheme.type.newValue(var0);
      }

      public static STTextAutonumberScheme newInstance() {
         return (STTextAutonumberScheme)POIXMLTypeLoader.newInstance(STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme newInstance(XmlOptions var0) {
         return (STTextAutonumberScheme)POIXMLTypeLoader.newInstance(STTextAutonumberScheme.type, var0);
      }

      public static STTextAutonumberScheme parse(String var0) throws XmlException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static STTextAutonumberScheme parse(File var0) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static STTextAutonumberScheme parse(URL var0) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static STTextAutonumberScheme parse(InputStream var0) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static STTextAutonumberScheme parse(Reader var0) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static STTextAutonumberScheme parse(XMLStreamReader var0) throws XmlException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static STTextAutonumberScheme parse(Node var0) throws XmlException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static STTextAutonumberScheme parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static STTextAutonumberScheme parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextAutonumberScheme)POIXMLTypeLoader.parse(var0, STTextAutonumberScheme.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAutonumberScheme.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextAutonumberScheme.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_ALPHA_LC_PAREN_BOTH = 1;
      static final int INT_ALPHA_UC_PAREN_BOTH = 2;
      static final int INT_ALPHA_LC_PAREN_R = 3;
      static final int INT_ALPHA_UC_PAREN_R = 4;
      static final int INT_ALPHA_LC_PERIOD = 5;
      static final int INT_ALPHA_UC_PERIOD = 6;
      static final int INT_ARABIC_PAREN_BOTH = 7;
      static final int INT_ARABIC_PAREN_R = 8;
      static final int INT_ARABIC_PERIOD = 9;
      static final int INT_ARABIC_PLAIN = 10;
      static final int INT_ROMAN_LC_PAREN_BOTH = 11;
      static final int INT_ROMAN_UC_PAREN_BOTH = 12;
      static final int INT_ROMAN_LC_PAREN_R = 13;
      static final int INT_ROMAN_UC_PAREN_R = 14;
      static final int INT_ROMAN_LC_PERIOD = 15;
      static final int INT_ROMAN_UC_PERIOD = 16;
      static final int INT_CIRCLE_NUM_DB_PLAIN = 17;
      static final int INT_CIRCLE_NUM_WD_BLACK_PLAIN = 18;
      static final int INT_CIRCLE_NUM_WD_WHITE_PLAIN = 19;
      static final int INT_ARABIC_DB_PERIOD = 20;
      static final int INT_ARABIC_DB_PLAIN = 21;
      static final int INT_EA_1_CHS_PERIOD = 22;
      static final int INT_EA_1_CHS_PLAIN = 23;
      static final int INT_EA_1_CHT_PERIOD = 24;
      static final int INT_EA_1_CHT_PLAIN = 25;
      static final int INT_EA_1_JPN_CHS_DB_PERIOD = 26;
      static final int INT_EA_1_JPN_KOR_PLAIN = 27;
      static final int INT_EA_1_JPN_KOR_PERIOD = 28;
      static final int INT_ARABIC_1_MINUS = 29;
      static final int INT_ARABIC_2_MINUS = 30;
      static final int INT_HEBREW_2_MINUS = 31;
      static final int INT_THAI_ALPHA_PERIOD = 32;
      static final int INT_THAI_ALPHA_PAREN_R = 33;
      static final int INT_THAI_ALPHA_PAREN_BOTH = 34;
      static final int INT_THAI_NUM_PERIOD = 35;
      static final int INT_THAI_NUM_PAREN_R = 36;
      static final int INT_THAI_NUM_PAREN_BOTH = 37;
      static final int INT_HINDI_ALPHA_PERIOD = 38;
      static final int INT_HINDI_NUM_PERIOD = 39;
      static final int INT_HINDI_NUM_PAREN_R = 40;
      static final int INT_HINDI_ALPHA_1_PERIOD = 41;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextAutonumberScheme.Enum[]{new STTextAutonumberScheme.Enum("alphaLcParenBoth", 1), new STTextAutonumberScheme.Enum("alphaUcParenBoth", 2), new STTextAutonumberScheme.Enum("alphaLcParenR", 3), new STTextAutonumberScheme.Enum("alphaUcParenR", 4), new STTextAutonumberScheme.Enum("alphaLcPeriod", 5), new STTextAutonumberScheme.Enum("alphaUcPeriod", 6), new STTextAutonumberScheme.Enum("arabicParenBoth", 7), new STTextAutonumberScheme.Enum("arabicParenR", 8), new STTextAutonumberScheme.Enum("arabicPeriod", 9), new STTextAutonumberScheme.Enum("arabicPlain", 10), new STTextAutonumberScheme.Enum("romanLcParenBoth", 11), new STTextAutonumberScheme.Enum("romanUcParenBoth", 12), new STTextAutonumberScheme.Enum("romanLcParenR", 13), new STTextAutonumberScheme.Enum("romanUcParenR", 14), new STTextAutonumberScheme.Enum("romanLcPeriod", 15), new STTextAutonumberScheme.Enum("romanUcPeriod", 16), new STTextAutonumberScheme.Enum("circleNumDbPlain", 17), new STTextAutonumberScheme.Enum("circleNumWdBlackPlain", 18), new STTextAutonumberScheme.Enum("circleNumWdWhitePlain", 19), new STTextAutonumberScheme.Enum("arabicDbPeriod", 20), new STTextAutonumberScheme.Enum("arabicDbPlain", 21), new STTextAutonumberScheme.Enum("ea1ChsPeriod", 22), new STTextAutonumberScheme.Enum("ea1ChsPlain", 23), new STTextAutonumberScheme.Enum("ea1ChtPeriod", 24), new STTextAutonumberScheme.Enum("ea1ChtPlain", 25), new STTextAutonumberScheme.Enum("ea1JpnChsDbPeriod", 26), new STTextAutonumberScheme.Enum("ea1JpnKorPlain", 27), new STTextAutonumberScheme.Enum("ea1JpnKorPeriod", 28), new STTextAutonumberScheme.Enum("arabic1Minus", 29), new STTextAutonumberScheme.Enum("arabic2Minus", 30), new STTextAutonumberScheme.Enum("hebrew2Minus", 31), new STTextAutonumberScheme.Enum("thaiAlphaPeriod", 32), new STTextAutonumberScheme.Enum("thaiAlphaParenR", 33), new STTextAutonumberScheme.Enum("thaiAlphaParenBoth", 34), new STTextAutonumberScheme.Enum("thaiNumPeriod", 35), new STTextAutonumberScheme.Enum("thaiNumParenR", 36), new STTextAutonumberScheme.Enum("thaiNumParenBoth", 37), new STTextAutonumberScheme.Enum("hindiAlphaPeriod", 38), new STTextAutonumberScheme.Enum("hindiNumPeriod", 39), new STTextAutonumberScheme.Enum("hindiNumParenR", 40), new STTextAutonumberScheme.Enum("hindiAlpha1Period", 41)});
      private static final long serialVersionUID = 1L;


      public static STTextAutonumberScheme.Enum forString(String var0) {
         return (STTextAutonumberScheme.Enum)table.forString(var0);
      }

      public static STTextAutonumberScheme.Enum forInt(int var0) {
         return (STTextAutonumberScheme.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
