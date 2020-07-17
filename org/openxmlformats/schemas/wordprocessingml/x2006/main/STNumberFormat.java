package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STNumberFormat extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STNumberFormat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stnumberformat0fb8type");
   STNumberFormat.Enum DECIMAL = STNumberFormat.Enum.forString("decimal");
   STNumberFormat.Enum UPPER_ROMAN = STNumberFormat.Enum.forString("upperRoman");
   STNumberFormat.Enum LOWER_ROMAN = STNumberFormat.Enum.forString("lowerRoman");
   STNumberFormat.Enum UPPER_LETTER = STNumberFormat.Enum.forString("upperLetter");
   STNumberFormat.Enum LOWER_LETTER = STNumberFormat.Enum.forString("lowerLetter");
   STNumberFormat.Enum ORDINAL = STNumberFormat.Enum.forString("ordinal");
   STNumberFormat.Enum CARDINAL_TEXT = STNumberFormat.Enum.forString("cardinalText");
   STNumberFormat.Enum ORDINAL_TEXT = STNumberFormat.Enum.forString("ordinalText");
   STNumberFormat.Enum HEX = STNumberFormat.Enum.forString("hex");
   STNumberFormat.Enum CHICAGO = STNumberFormat.Enum.forString("chicago");
   STNumberFormat.Enum IDEOGRAPH_DIGITAL = STNumberFormat.Enum.forString("ideographDigital");
   STNumberFormat.Enum JAPANESE_COUNTING = STNumberFormat.Enum.forString("japaneseCounting");
   STNumberFormat.Enum AIUEO = STNumberFormat.Enum.forString("aiueo");
   STNumberFormat.Enum IROHA = STNumberFormat.Enum.forString("iroha");
   STNumberFormat.Enum DECIMAL_FULL_WIDTH = STNumberFormat.Enum.forString("decimalFullWidth");
   STNumberFormat.Enum DECIMAL_HALF_WIDTH = STNumberFormat.Enum.forString("decimalHalfWidth");
   STNumberFormat.Enum JAPANESE_LEGAL = STNumberFormat.Enum.forString("japaneseLegal");
   STNumberFormat.Enum JAPANESE_DIGITAL_TEN_THOUSAND = STNumberFormat.Enum.forString("japaneseDigitalTenThousand");
   STNumberFormat.Enum DECIMAL_ENCLOSED_CIRCLE = STNumberFormat.Enum.forString("decimalEnclosedCircle");
   STNumberFormat.Enum DECIMAL_FULL_WIDTH_2 = STNumberFormat.Enum.forString("decimalFullWidth2");
   STNumberFormat.Enum AIUEO_FULL_WIDTH = STNumberFormat.Enum.forString("aiueoFullWidth");
   STNumberFormat.Enum IROHA_FULL_WIDTH = STNumberFormat.Enum.forString("irohaFullWidth");
   STNumberFormat.Enum DECIMAL_ZERO = STNumberFormat.Enum.forString("decimalZero");
   STNumberFormat.Enum BULLET = STNumberFormat.Enum.forString("bullet");
   STNumberFormat.Enum GANADA = STNumberFormat.Enum.forString("ganada");
   STNumberFormat.Enum CHOSUNG = STNumberFormat.Enum.forString("chosung");
   STNumberFormat.Enum DECIMAL_ENCLOSED_FULLSTOP = STNumberFormat.Enum.forString("decimalEnclosedFullstop");
   STNumberFormat.Enum DECIMAL_ENCLOSED_PAREN = STNumberFormat.Enum.forString("decimalEnclosedParen");
   STNumberFormat.Enum DECIMAL_ENCLOSED_CIRCLE_CHINESE = STNumberFormat.Enum.forString("decimalEnclosedCircleChinese");
   STNumberFormat.Enum IDEOGRAPH_ENCLOSED_CIRCLE = STNumberFormat.Enum.forString("ideographEnclosedCircle");
   STNumberFormat.Enum IDEOGRAPH_TRADITIONAL = STNumberFormat.Enum.forString("ideographTraditional");
   STNumberFormat.Enum IDEOGRAPH_ZODIAC = STNumberFormat.Enum.forString("ideographZodiac");
   STNumberFormat.Enum IDEOGRAPH_ZODIAC_TRADITIONAL = STNumberFormat.Enum.forString("ideographZodiacTraditional");
   STNumberFormat.Enum TAIWANESE_COUNTING = STNumberFormat.Enum.forString("taiwaneseCounting");
   STNumberFormat.Enum IDEOGRAPH_LEGAL_TRADITIONAL = STNumberFormat.Enum.forString("ideographLegalTraditional");
   STNumberFormat.Enum TAIWANESE_COUNTING_THOUSAND = STNumberFormat.Enum.forString("taiwaneseCountingThousand");
   STNumberFormat.Enum TAIWANESE_DIGITAL = STNumberFormat.Enum.forString("taiwaneseDigital");
   STNumberFormat.Enum CHINESE_COUNTING = STNumberFormat.Enum.forString("chineseCounting");
   STNumberFormat.Enum CHINESE_LEGAL_SIMPLIFIED = STNumberFormat.Enum.forString("chineseLegalSimplified");
   STNumberFormat.Enum CHINESE_COUNTING_THOUSAND = STNumberFormat.Enum.forString("chineseCountingThousand");
   STNumberFormat.Enum KOREAN_DIGITAL = STNumberFormat.Enum.forString("koreanDigital");
   STNumberFormat.Enum KOREAN_COUNTING = STNumberFormat.Enum.forString("koreanCounting");
   STNumberFormat.Enum KOREAN_LEGAL = STNumberFormat.Enum.forString("koreanLegal");
   STNumberFormat.Enum KOREAN_DIGITAL_2 = STNumberFormat.Enum.forString("koreanDigital2");
   STNumberFormat.Enum VIETNAMESE_COUNTING = STNumberFormat.Enum.forString("vietnameseCounting");
   STNumberFormat.Enum RUSSIAN_LOWER = STNumberFormat.Enum.forString("russianLower");
   STNumberFormat.Enum RUSSIAN_UPPER = STNumberFormat.Enum.forString("russianUpper");
   STNumberFormat.Enum NONE = STNumberFormat.Enum.forString("none");
   STNumberFormat.Enum NUMBER_IN_DASH = STNumberFormat.Enum.forString("numberInDash");
   STNumberFormat.Enum HEBREW_1 = STNumberFormat.Enum.forString("hebrew1");
   STNumberFormat.Enum HEBREW_2 = STNumberFormat.Enum.forString("hebrew2");
   STNumberFormat.Enum ARABIC_ALPHA = STNumberFormat.Enum.forString("arabicAlpha");
   STNumberFormat.Enum ARABIC_ABJAD = STNumberFormat.Enum.forString("arabicAbjad");
   STNumberFormat.Enum HINDI_VOWELS = STNumberFormat.Enum.forString("hindiVowels");
   STNumberFormat.Enum HINDI_CONSONANTS = STNumberFormat.Enum.forString("hindiConsonants");
   STNumberFormat.Enum HINDI_NUMBERS = STNumberFormat.Enum.forString("hindiNumbers");
   STNumberFormat.Enum HINDI_COUNTING = STNumberFormat.Enum.forString("hindiCounting");
   STNumberFormat.Enum THAI_LETTERS = STNumberFormat.Enum.forString("thaiLetters");
   STNumberFormat.Enum THAI_NUMBERS = STNumberFormat.Enum.forString("thaiNumbers");
   STNumberFormat.Enum THAI_COUNTING = STNumberFormat.Enum.forString("thaiCounting");
   int INT_DECIMAL = 1;
   int INT_UPPER_ROMAN = 2;
   int INT_LOWER_ROMAN = 3;
   int INT_UPPER_LETTER = 4;
   int INT_LOWER_LETTER = 5;
   int INT_ORDINAL = 6;
   int INT_CARDINAL_TEXT = 7;
   int INT_ORDINAL_TEXT = 8;
   int INT_HEX = 9;
   int INT_CHICAGO = 10;
   int INT_IDEOGRAPH_DIGITAL = 11;
   int INT_JAPANESE_COUNTING = 12;
   int INT_AIUEO = 13;
   int INT_IROHA = 14;
   int INT_DECIMAL_FULL_WIDTH = 15;
   int INT_DECIMAL_HALF_WIDTH = 16;
   int INT_JAPANESE_LEGAL = 17;
   int INT_JAPANESE_DIGITAL_TEN_THOUSAND = 18;
   int INT_DECIMAL_ENCLOSED_CIRCLE = 19;
   int INT_DECIMAL_FULL_WIDTH_2 = 20;
   int INT_AIUEO_FULL_WIDTH = 21;
   int INT_IROHA_FULL_WIDTH = 22;
   int INT_DECIMAL_ZERO = 23;
   int INT_BULLET = 24;
   int INT_GANADA = 25;
   int INT_CHOSUNG = 26;
   int INT_DECIMAL_ENCLOSED_FULLSTOP = 27;
   int INT_DECIMAL_ENCLOSED_PAREN = 28;
   int INT_DECIMAL_ENCLOSED_CIRCLE_CHINESE = 29;
   int INT_IDEOGRAPH_ENCLOSED_CIRCLE = 30;
   int INT_IDEOGRAPH_TRADITIONAL = 31;
   int INT_IDEOGRAPH_ZODIAC = 32;
   int INT_IDEOGRAPH_ZODIAC_TRADITIONAL = 33;
   int INT_TAIWANESE_COUNTING = 34;
   int INT_IDEOGRAPH_LEGAL_TRADITIONAL = 35;
   int INT_TAIWANESE_COUNTING_THOUSAND = 36;
   int INT_TAIWANESE_DIGITAL = 37;
   int INT_CHINESE_COUNTING = 38;
   int INT_CHINESE_LEGAL_SIMPLIFIED = 39;
   int INT_CHINESE_COUNTING_THOUSAND = 40;
   int INT_KOREAN_DIGITAL = 41;
   int INT_KOREAN_COUNTING = 42;
   int INT_KOREAN_LEGAL = 43;
   int INT_KOREAN_DIGITAL_2 = 44;
   int INT_VIETNAMESE_COUNTING = 45;
   int INT_RUSSIAN_LOWER = 46;
   int INT_RUSSIAN_UPPER = 47;
   int INT_NONE = 48;
   int INT_NUMBER_IN_DASH = 49;
   int INT_HEBREW_1 = 50;
   int INT_HEBREW_2 = 51;
   int INT_ARABIC_ALPHA = 52;
   int INT_ARABIC_ABJAD = 53;
   int INT_HINDI_VOWELS = 54;
   int INT_HINDI_CONSONANTS = 55;
   int INT_HINDI_NUMBERS = 56;
   int INT_HINDI_COUNTING = 57;
   int INT_THAI_LETTERS = 58;
   int INT_THAI_NUMBERS = 59;
   int INT_THAI_COUNTING = 60;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_DECIMAL = 1;
      static final int INT_UPPER_ROMAN = 2;
      static final int INT_LOWER_ROMAN = 3;
      static final int INT_UPPER_LETTER = 4;
      static final int INT_LOWER_LETTER = 5;
      static final int INT_ORDINAL = 6;
      static final int INT_CARDINAL_TEXT = 7;
      static final int INT_ORDINAL_TEXT = 8;
      static final int INT_HEX = 9;
      static final int INT_CHICAGO = 10;
      static final int INT_IDEOGRAPH_DIGITAL = 11;
      static final int INT_JAPANESE_COUNTING = 12;
      static final int INT_AIUEO = 13;
      static final int INT_IROHA = 14;
      static final int INT_DECIMAL_FULL_WIDTH = 15;
      static final int INT_DECIMAL_HALF_WIDTH = 16;
      static final int INT_JAPANESE_LEGAL = 17;
      static final int INT_JAPANESE_DIGITAL_TEN_THOUSAND = 18;
      static final int INT_DECIMAL_ENCLOSED_CIRCLE = 19;
      static final int INT_DECIMAL_FULL_WIDTH_2 = 20;
      static final int INT_AIUEO_FULL_WIDTH = 21;
      static final int INT_IROHA_FULL_WIDTH = 22;
      static final int INT_DECIMAL_ZERO = 23;
      static final int INT_BULLET = 24;
      static final int INT_GANADA = 25;
      static final int INT_CHOSUNG = 26;
      static final int INT_DECIMAL_ENCLOSED_FULLSTOP = 27;
      static final int INT_DECIMAL_ENCLOSED_PAREN = 28;
      static final int INT_DECIMAL_ENCLOSED_CIRCLE_CHINESE = 29;
      static final int INT_IDEOGRAPH_ENCLOSED_CIRCLE = 30;
      static final int INT_IDEOGRAPH_TRADITIONAL = 31;
      static final int INT_IDEOGRAPH_ZODIAC = 32;
      static final int INT_IDEOGRAPH_ZODIAC_TRADITIONAL = 33;
      static final int INT_TAIWANESE_COUNTING = 34;
      static final int INT_IDEOGRAPH_LEGAL_TRADITIONAL = 35;
      static final int INT_TAIWANESE_COUNTING_THOUSAND = 36;
      static final int INT_TAIWANESE_DIGITAL = 37;
      static final int INT_CHINESE_COUNTING = 38;
      static final int INT_CHINESE_LEGAL_SIMPLIFIED = 39;
      static final int INT_CHINESE_COUNTING_THOUSAND = 40;
      static final int INT_KOREAN_DIGITAL = 41;
      static final int INT_KOREAN_COUNTING = 42;
      static final int INT_KOREAN_LEGAL = 43;
      static final int INT_KOREAN_DIGITAL_2 = 44;
      static final int INT_VIETNAMESE_COUNTING = 45;
      static final int INT_RUSSIAN_LOWER = 46;
      static final int INT_RUSSIAN_UPPER = 47;
      static final int INT_NONE = 48;
      static final int INT_NUMBER_IN_DASH = 49;
      static final int INT_HEBREW_1 = 50;
      static final int INT_HEBREW_2 = 51;
      static final int INT_ARABIC_ALPHA = 52;
      static final int INT_ARABIC_ABJAD = 53;
      static final int INT_HINDI_VOWELS = 54;
      static final int INT_HINDI_CONSONANTS = 55;
      static final int INT_HINDI_NUMBERS = 56;
      static final int INT_HINDI_COUNTING = 57;
      static final int INT_THAI_LETTERS = 58;
      static final int INT_THAI_NUMBERS = 59;
      static final int INT_THAI_COUNTING = 60;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STNumberFormat.Enum[]{new STNumberFormat.Enum("decimal", 1), new STNumberFormat.Enum("upperRoman", 2), new STNumberFormat.Enum("lowerRoman", 3), new STNumberFormat.Enum("upperLetter", 4), new STNumberFormat.Enum("lowerLetter", 5), new STNumberFormat.Enum("ordinal", 6), new STNumberFormat.Enum("cardinalText", 7), new STNumberFormat.Enum("ordinalText", 8), new STNumberFormat.Enum("hex", 9), new STNumberFormat.Enum("chicago", 10), new STNumberFormat.Enum("ideographDigital", 11), new STNumberFormat.Enum("japaneseCounting", 12), new STNumberFormat.Enum("aiueo", 13), new STNumberFormat.Enum("iroha", 14), new STNumberFormat.Enum("decimalFullWidth", 15), new STNumberFormat.Enum("decimalHalfWidth", 16), new STNumberFormat.Enum("japaneseLegal", 17), new STNumberFormat.Enum("japaneseDigitalTenThousand", 18), new STNumberFormat.Enum("decimalEnclosedCircle", 19), new STNumberFormat.Enum("decimalFullWidth2", 20), new STNumberFormat.Enum("aiueoFullWidth", 21), new STNumberFormat.Enum("irohaFullWidth", 22), new STNumberFormat.Enum("decimalZero", 23), new STNumberFormat.Enum("bullet", 24), new STNumberFormat.Enum("ganada", 25), new STNumberFormat.Enum("chosung", 26), new STNumberFormat.Enum("decimalEnclosedFullstop", 27), new STNumberFormat.Enum("decimalEnclosedParen", 28), new STNumberFormat.Enum("decimalEnclosedCircleChinese", 29), new STNumberFormat.Enum("ideographEnclosedCircle", 30), new STNumberFormat.Enum("ideographTraditional", 31), new STNumberFormat.Enum("ideographZodiac", 32), new STNumberFormat.Enum("ideographZodiacTraditional", 33), new STNumberFormat.Enum("taiwaneseCounting", 34), new STNumberFormat.Enum("ideographLegalTraditional", 35), new STNumberFormat.Enum("taiwaneseCountingThousand", 36), new STNumberFormat.Enum("taiwaneseDigital", 37), new STNumberFormat.Enum("chineseCounting", 38), new STNumberFormat.Enum("chineseLegalSimplified", 39), new STNumberFormat.Enum("chineseCountingThousand", 40), new STNumberFormat.Enum("koreanDigital", 41), new STNumberFormat.Enum("koreanCounting", 42), new STNumberFormat.Enum("koreanLegal", 43), new STNumberFormat.Enum("koreanDigital2", 44), new STNumberFormat.Enum("vietnameseCounting", 45), new STNumberFormat.Enum("russianLower", 46), new STNumberFormat.Enum("russianUpper", 47), new STNumberFormat.Enum("none", 48), new STNumberFormat.Enum("numberInDash", 49), new STNumberFormat.Enum("hebrew1", 50), new STNumberFormat.Enum("hebrew2", 51), new STNumberFormat.Enum("arabicAlpha", 52), new STNumberFormat.Enum("arabicAbjad", 53), new STNumberFormat.Enum("hindiVowels", 54), new STNumberFormat.Enum("hindiConsonants", 55), new STNumberFormat.Enum("hindiNumbers", 56), new STNumberFormat.Enum("hindiCounting", 57), new STNumberFormat.Enum("thaiLetters", 58), new STNumberFormat.Enum("thaiNumbers", 59), new STNumberFormat.Enum("thaiCounting", 60)});
      private static final long serialVersionUID = 1L;


      public static STNumberFormat.Enum forString(String var0) {
         return (STNumberFormat.Enum)table.forString(var0);
      }

      public static STNumberFormat.Enum forInt(int var0) {
         return (STNumberFormat.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STNumberFormat newValue(Object var0) {
         return (STNumberFormat)STNumberFormat.type.newValue(var0);
      }

      public static STNumberFormat newInstance() {
         return (STNumberFormat)POIXMLTypeLoader.newInstance(STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat newInstance(XmlOptions var0) {
         return (STNumberFormat)POIXMLTypeLoader.newInstance(STNumberFormat.type, var0);
      }

      public static STNumberFormat parse(String var0) throws XmlException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(String var0, XmlOptions var1) throws XmlException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static STNumberFormat parse(File var0) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static STNumberFormat parse(URL var0) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static STNumberFormat parse(InputStream var0) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static STNumberFormat parse(Reader var0) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static STNumberFormat parse(XMLStreamReader var0) throws XmlException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static STNumberFormat parse(Node var0) throws XmlException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(Node var0, XmlOptions var1) throws XmlException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static STNumberFormat parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static STNumberFormat parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STNumberFormat)POIXMLTypeLoader.parse(var0, STNumberFormat.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STNumberFormat.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STNumberFormat.type, var1);
      }

   }
}
