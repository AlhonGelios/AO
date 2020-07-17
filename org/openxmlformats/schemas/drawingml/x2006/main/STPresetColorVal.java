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

public interface STPresetColorVal extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPresetColorVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpresetcolorval55e8type");
   STPresetColorVal.Enum ALICE_BLUE = STPresetColorVal.Enum.forString("aliceBlue");
   STPresetColorVal.Enum ANTIQUE_WHITE = STPresetColorVal.Enum.forString("antiqueWhite");
   STPresetColorVal.Enum AQUA = STPresetColorVal.Enum.forString("aqua");
   STPresetColorVal.Enum AQUAMARINE = STPresetColorVal.Enum.forString("aquamarine");
   STPresetColorVal.Enum AZURE = STPresetColorVal.Enum.forString("azure");
   STPresetColorVal.Enum BEIGE = STPresetColorVal.Enum.forString("beige");
   STPresetColorVal.Enum BISQUE = STPresetColorVal.Enum.forString("bisque");
   STPresetColorVal.Enum BLACK = STPresetColorVal.Enum.forString("black");
   STPresetColorVal.Enum BLANCHED_ALMOND = STPresetColorVal.Enum.forString("blanchedAlmond");
   STPresetColorVal.Enum BLUE = STPresetColorVal.Enum.forString("blue");
   STPresetColorVal.Enum BLUE_VIOLET = STPresetColorVal.Enum.forString("blueViolet");
   STPresetColorVal.Enum BROWN = STPresetColorVal.Enum.forString("brown");
   STPresetColorVal.Enum BURLY_WOOD = STPresetColorVal.Enum.forString("burlyWood");
   STPresetColorVal.Enum CADET_BLUE = STPresetColorVal.Enum.forString("cadetBlue");
   STPresetColorVal.Enum CHARTREUSE = STPresetColorVal.Enum.forString("chartreuse");
   STPresetColorVal.Enum CHOCOLATE = STPresetColorVal.Enum.forString("chocolate");
   STPresetColorVal.Enum CORAL = STPresetColorVal.Enum.forString("coral");
   STPresetColorVal.Enum CORNFLOWER_BLUE = STPresetColorVal.Enum.forString("cornflowerBlue");
   STPresetColorVal.Enum CORNSILK = STPresetColorVal.Enum.forString("cornsilk");
   STPresetColorVal.Enum CRIMSON = STPresetColorVal.Enum.forString("crimson");
   STPresetColorVal.Enum CYAN = STPresetColorVal.Enum.forString("cyan");
   STPresetColorVal.Enum DK_BLUE = STPresetColorVal.Enum.forString("dkBlue");
   STPresetColorVal.Enum DK_CYAN = STPresetColorVal.Enum.forString("dkCyan");
   STPresetColorVal.Enum DK_GOLDENROD = STPresetColorVal.Enum.forString("dkGoldenrod");
   STPresetColorVal.Enum DK_GRAY = STPresetColorVal.Enum.forString("dkGray");
   STPresetColorVal.Enum DK_GREEN = STPresetColorVal.Enum.forString("dkGreen");
   STPresetColorVal.Enum DK_KHAKI = STPresetColorVal.Enum.forString("dkKhaki");
   STPresetColorVal.Enum DK_MAGENTA = STPresetColorVal.Enum.forString("dkMagenta");
   STPresetColorVal.Enum DK_OLIVE_GREEN = STPresetColorVal.Enum.forString("dkOliveGreen");
   STPresetColorVal.Enum DK_ORANGE = STPresetColorVal.Enum.forString("dkOrange");
   STPresetColorVal.Enum DK_ORCHID = STPresetColorVal.Enum.forString("dkOrchid");
   STPresetColorVal.Enum DK_RED = STPresetColorVal.Enum.forString("dkRed");
   STPresetColorVal.Enum DK_SALMON = STPresetColorVal.Enum.forString("dkSalmon");
   STPresetColorVal.Enum DK_SEA_GREEN = STPresetColorVal.Enum.forString("dkSeaGreen");
   STPresetColorVal.Enum DK_SLATE_BLUE = STPresetColorVal.Enum.forString("dkSlateBlue");
   STPresetColorVal.Enum DK_SLATE_GRAY = STPresetColorVal.Enum.forString("dkSlateGray");
   STPresetColorVal.Enum DK_TURQUOISE = STPresetColorVal.Enum.forString("dkTurquoise");
   STPresetColorVal.Enum DK_VIOLET = STPresetColorVal.Enum.forString("dkViolet");
   STPresetColorVal.Enum DEEP_PINK = STPresetColorVal.Enum.forString("deepPink");
   STPresetColorVal.Enum DEEP_SKY_BLUE = STPresetColorVal.Enum.forString("deepSkyBlue");
   STPresetColorVal.Enum DIM_GRAY = STPresetColorVal.Enum.forString("dimGray");
   STPresetColorVal.Enum DODGER_BLUE = STPresetColorVal.Enum.forString("dodgerBlue");
   STPresetColorVal.Enum FIREBRICK = STPresetColorVal.Enum.forString("firebrick");
   STPresetColorVal.Enum FLORAL_WHITE = STPresetColorVal.Enum.forString("floralWhite");
   STPresetColorVal.Enum FOREST_GREEN = STPresetColorVal.Enum.forString("forestGreen");
   STPresetColorVal.Enum FUCHSIA = STPresetColorVal.Enum.forString("fuchsia");
   STPresetColorVal.Enum GAINSBORO = STPresetColorVal.Enum.forString("gainsboro");
   STPresetColorVal.Enum GHOST_WHITE = STPresetColorVal.Enum.forString("ghostWhite");
   STPresetColorVal.Enum GOLD = STPresetColorVal.Enum.forString("gold");
   STPresetColorVal.Enum GOLDENROD = STPresetColorVal.Enum.forString("goldenrod");
   STPresetColorVal.Enum GRAY = STPresetColorVal.Enum.forString("gray");
   STPresetColorVal.Enum GREEN = STPresetColorVal.Enum.forString("green");
   STPresetColorVal.Enum GREEN_YELLOW = STPresetColorVal.Enum.forString("greenYellow");
   STPresetColorVal.Enum HONEYDEW = STPresetColorVal.Enum.forString("honeydew");
   STPresetColorVal.Enum HOT_PINK = STPresetColorVal.Enum.forString("hotPink");
   STPresetColorVal.Enum INDIAN_RED = STPresetColorVal.Enum.forString("indianRed");
   STPresetColorVal.Enum INDIGO = STPresetColorVal.Enum.forString("indigo");
   STPresetColorVal.Enum IVORY = STPresetColorVal.Enum.forString("ivory");
   STPresetColorVal.Enum KHAKI = STPresetColorVal.Enum.forString("khaki");
   STPresetColorVal.Enum LAVENDER = STPresetColorVal.Enum.forString("lavender");
   STPresetColorVal.Enum LAVENDER_BLUSH = STPresetColorVal.Enum.forString("lavenderBlush");
   STPresetColorVal.Enum LAWN_GREEN = STPresetColorVal.Enum.forString("lawnGreen");
   STPresetColorVal.Enum LEMON_CHIFFON = STPresetColorVal.Enum.forString("lemonChiffon");
   STPresetColorVal.Enum LT_BLUE = STPresetColorVal.Enum.forString("ltBlue");
   STPresetColorVal.Enum LT_CORAL = STPresetColorVal.Enum.forString("ltCoral");
   STPresetColorVal.Enum LT_CYAN = STPresetColorVal.Enum.forString("ltCyan");
   STPresetColorVal.Enum LT_GOLDENROD_YELLOW = STPresetColorVal.Enum.forString("ltGoldenrodYellow");
   STPresetColorVal.Enum LT_GRAY = STPresetColorVal.Enum.forString("ltGray");
   STPresetColorVal.Enum LT_GREEN = STPresetColorVal.Enum.forString("ltGreen");
   STPresetColorVal.Enum LT_PINK = STPresetColorVal.Enum.forString("ltPink");
   STPresetColorVal.Enum LT_SALMON = STPresetColorVal.Enum.forString("ltSalmon");
   STPresetColorVal.Enum LT_SEA_GREEN = STPresetColorVal.Enum.forString("ltSeaGreen");
   STPresetColorVal.Enum LT_SKY_BLUE = STPresetColorVal.Enum.forString("ltSkyBlue");
   STPresetColorVal.Enum LT_SLATE_GRAY = STPresetColorVal.Enum.forString("ltSlateGray");
   STPresetColorVal.Enum LT_STEEL_BLUE = STPresetColorVal.Enum.forString("ltSteelBlue");
   STPresetColorVal.Enum LT_YELLOW = STPresetColorVal.Enum.forString("ltYellow");
   STPresetColorVal.Enum LIME = STPresetColorVal.Enum.forString("lime");
   STPresetColorVal.Enum LIME_GREEN = STPresetColorVal.Enum.forString("limeGreen");
   STPresetColorVal.Enum LINEN = STPresetColorVal.Enum.forString("linen");
   STPresetColorVal.Enum MAGENTA = STPresetColorVal.Enum.forString("magenta");
   STPresetColorVal.Enum MAROON = STPresetColorVal.Enum.forString("maroon");
   STPresetColorVal.Enum MED_AQUAMARINE = STPresetColorVal.Enum.forString("medAquamarine");
   STPresetColorVal.Enum MED_BLUE = STPresetColorVal.Enum.forString("medBlue");
   STPresetColorVal.Enum MED_ORCHID = STPresetColorVal.Enum.forString("medOrchid");
   STPresetColorVal.Enum MED_PURPLE = STPresetColorVal.Enum.forString("medPurple");
   STPresetColorVal.Enum MED_SEA_GREEN = STPresetColorVal.Enum.forString("medSeaGreen");
   STPresetColorVal.Enum MED_SLATE_BLUE = STPresetColorVal.Enum.forString("medSlateBlue");
   STPresetColorVal.Enum MED_SPRING_GREEN = STPresetColorVal.Enum.forString("medSpringGreen");
   STPresetColorVal.Enum MED_TURQUOISE = STPresetColorVal.Enum.forString("medTurquoise");
   STPresetColorVal.Enum MED_VIOLET_RED = STPresetColorVal.Enum.forString("medVioletRed");
   STPresetColorVal.Enum MIDNIGHT_BLUE = STPresetColorVal.Enum.forString("midnightBlue");
   STPresetColorVal.Enum MINT_CREAM = STPresetColorVal.Enum.forString("mintCream");
   STPresetColorVal.Enum MISTY_ROSE = STPresetColorVal.Enum.forString("mistyRose");
   STPresetColorVal.Enum MOCCASIN = STPresetColorVal.Enum.forString("moccasin");
   STPresetColorVal.Enum NAVAJO_WHITE = STPresetColorVal.Enum.forString("navajoWhite");
   STPresetColorVal.Enum NAVY = STPresetColorVal.Enum.forString("navy");
   STPresetColorVal.Enum OLD_LACE = STPresetColorVal.Enum.forString("oldLace");
   STPresetColorVal.Enum OLIVE = STPresetColorVal.Enum.forString("olive");
   STPresetColorVal.Enum OLIVE_DRAB = STPresetColorVal.Enum.forString("oliveDrab");
   STPresetColorVal.Enum ORANGE = STPresetColorVal.Enum.forString("orange");
   STPresetColorVal.Enum ORANGE_RED = STPresetColorVal.Enum.forString("orangeRed");
   STPresetColorVal.Enum ORCHID = STPresetColorVal.Enum.forString("orchid");
   STPresetColorVal.Enum PALE_GOLDENROD = STPresetColorVal.Enum.forString("paleGoldenrod");
   STPresetColorVal.Enum PALE_GREEN = STPresetColorVal.Enum.forString("paleGreen");
   STPresetColorVal.Enum PALE_TURQUOISE = STPresetColorVal.Enum.forString("paleTurquoise");
   STPresetColorVal.Enum PALE_VIOLET_RED = STPresetColorVal.Enum.forString("paleVioletRed");
   STPresetColorVal.Enum PAPAYA_WHIP = STPresetColorVal.Enum.forString("papayaWhip");
   STPresetColorVal.Enum PEACH_PUFF = STPresetColorVal.Enum.forString("peachPuff");
   STPresetColorVal.Enum PERU = STPresetColorVal.Enum.forString("peru");
   STPresetColorVal.Enum PINK = STPresetColorVal.Enum.forString("pink");
   STPresetColorVal.Enum PLUM = STPresetColorVal.Enum.forString("plum");
   STPresetColorVal.Enum POWDER_BLUE = STPresetColorVal.Enum.forString("powderBlue");
   STPresetColorVal.Enum PURPLE = STPresetColorVal.Enum.forString("purple");
   STPresetColorVal.Enum RED = STPresetColorVal.Enum.forString("red");
   STPresetColorVal.Enum ROSY_BROWN = STPresetColorVal.Enum.forString("rosyBrown");
   STPresetColorVal.Enum ROYAL_BLUE = STPresetColorVal.Enum.forString("royalBlue");
   STPresetColorVal.Enum SADDLE_BROWN = STPresetColorVal.Enum.forString("saddleBrown");
   STPresetColorVal.Enum SALMON = STPresetColorVal.Enum.forString("salmon");
   STPresetColorVal.Enum SANDY_BROWN = STPresetColorVal.Enum.forString("sandyBrown");
   STPresetColorVal.Enum SEA_GREEN = STPresetColorVal.Enum.forString("seaGreen");
   STPresetColorVal.Enum SEA_SHELL = STPresetColorVal.Enum.forString("seaShell");
   STPresetColorVal.Enum SIENNA = STPresetColorVal.Enum.forString("sienna");
   STPresetColorVal.Enum SILVER = STPresetColorVal.Enum.forString("silver");
   STPresetColorVal.Enum SKY_BLUE = STPresetColorVal.Enum.forString("skyBlue");
   STPresetColorVal.Enum SLATE_BLUE = STPresetColorVal.Enum.forString("slateBlue");
   STPresetColorVal.Enum SLATE_GRAY = STPresetColorVal.Enum.forString("slateGray");
   STPresetColorVal.Enum SNOW = STPresetColorVal.Enum.forString("snow");
   STPresetColorVal.Enum SPRING_GREEN = STPresetColorVal.Enum.forString("springGreen");
   STPresetColorVal.Enum STEEL_BLUE = STPresetColorVal.Enum.forString("steelBlue");
   STPresetColorVal.Enum TAN = STPresetColorVal.Enum.forString("tan");
   STPresetColorVal.Enum TEAL = STPresetColorVal.Enum.forString("teal");
   STPresetColorVal.Enum THISTLE = STPresetColorVal.Enum.forString("thistle");
   STPresetColorVal.Enum TOMATO = STPresetColorVal.Enum.forString("tomato");
   STPresetColorVal.Enum TURQUOISE = STPresetColorVal.Enum.forString("turquoise");
   STPresetColorVal.Enum VIOLET = STPresetColorVal.Enum.forString("violet");
   STPresetColorVal.Enum WHEAT = STPresetColorVal.Enum.forString("wheat");
   STPresetColorVal.Enum WHITE = STPresetColorVal.Enum.forString("white");
   STPresetColorVal.Enum WHITE_SMOKE = STPresetColorVal.Enum.forString("whiteSmoke");
   STPresetColorVal.Enum YELLOW = STPresetColorVal.Enum.forString("yellow");
   STPresetColorVal.Enum YELLOW_GREEN = STPresetColorVal.Enum.forString("yellowGreen");
   int INT_ALICE_BLUE = 1;
   int INT_ANTIQUE_WHITE = 2;
   int INT_AQUA = 3;
   int INT_AQUAMARINE = 4;
   int INT_AZURE = 5;
   int INT_BEIGE = 6;
   int INT_BISQUE = 7;
   int INT_BLACK = 8;
   int INT_BLANCHED_ALMOND = 9;
   int INT_BLUE = 10;
   int INT_BLUE_VIOLET = 11;
   int INT_BROWN = 12;
   int INT_BURLY_WOOD = 13;
   int INT_CADET_BLUE = 14;
   int INT_CHARTREUSE = 15;
   int INT_CHOCOLATE = 16;
   int INT_CORAL = 17;
   int INT_CORNFLOWER_BLUE = 18;
   int INT_CORNSILK = 19;
   int INT_CRIMSON = 20;
   int INT_CYAN = 21;
   int INT_DK_BLUE = 22;
   int INT_DK_CYAN = 23;
   int INT_DK_GOLDENROD = 24;
   int INT_DK_GRAY = 25;
   int INT_DK_GREEN = 26;
   int INT_DK_KHAKI = 27;
   int INT_DK_MAGENTA = 28;
   int INT_DK_OLIVE_GREEN = 29;
   int INT_DK_ORANGE = 30;
   int INT_DK_ORCHID = 31;
   int INT_DK_RED = 32;
   int INT_DK_SALMON = 33;
   int INT_DK_SEA_GREEN = 34;
   int INT_DK_SLATE_BLUE = 35;
   int INT_DK_SLATE_GRAY = 36;
   int INT_DK_TURQUOISE = 37;
   int INT_DK_VIOLET = 38;
   int INT_DEEP_PINK = 39;
   int INT_DEEP_SKY_BLUE = 40;
   int INT_DIM_GRAY = 41;
   int INT_DODGER_BLUE = 42;
   int INT_FIREBRICK = 43;
   int INT_FLORAL_WHITE = 44;
   int INT_FOREST_GREEN = 45;
   int INT_FUCHSIA = 46;
   int INT_GAINSBORO = 47;
   int INT_GHOST_WHITE = 48;
   int INT_GOLD = 49;
   int INT_GOLDENROD = 50;
   int INT_GRAY = 51;
   int INT_GREEN = 52;
   int INT_GREEN_YELLOW = 53;
   int INT_HONEYDEW = 54;
   int INT_HOT_PINK = 55;
   int INT_INDIAN_RED = 56;
   int INT_INDIGO = 57;
   int INT_IVORY = 58;
   int INT_KHAKI = 59;
   int INT_LAVENDER = 60;
   int INT_LAVENDER_BLUSH = 61;
   int INT_LAWN_GREEN = 62;
   int INT_LEMON_CHIFFON = 63;
   int INT_LT_BLUE = 64;
   int INT_LT_CORAL = 65;
   int INT_LT_CYAN = 66;
   int INT_LT_GOLDENROD_YELLOW = 67;
   int INT_LT_GRAY = 68;
   int INT_LT_GREEN = 69;
   int INT_LT_PINK = 70;
   int INT_LT_SALMON = 71;
   int INT_LT_SEA_GREEN = 72;
   int INT_LT_SKY_BLUE = 73;
   int INT_LT_SLATE_GRAY = 74;
   int INT_LT_STEEL_BLUE = 75;
   int INT_LT_YELLOW = 76;
   int INT_LIME = 77;
   int INT_LIME_GREEN = 78;
   int INT_LINEN = 79;
   int INT_MAGENTA = 80;
   int INT_MAROON = 81;
   int INT_MED_AQUAMARINE = 82;
   int INT_MED_BLUE = 83;
   int INT_MED_ORCHID = 84;
   int INT_MED_PURPLE = 85;
   int INT_MED_SEA_GREEN = 86;
   int INT_MED_SLATE_BLUE = 87;
   int INT_MED_SPRING_GREEN = 88;
   int INT_MED_TURQUOISE = 89;
   int INT_MED_VIOLET_RED = 90;
   int INT_MIDNIGHT_BLUE = 91;
   int INT_MINT_CREAM = 92;
   int INT_MISTY_ROSE = 93;
   int INT_MOCCASIN = 94;
   int INT_NAVAJO_WHITE = 95;
   int INT_NAVY = 96;
   int INT_OLD_LACE = 97;
   int INT_OLIVE = 98;
   int INT_OLIVE_DRAB = 99;
   int INT_ORANGE = 100;
   int INT_ORANGE_RED = 101;
   int INT_ORCHID = 102;
   int INT_PALE_GOLDENROD = 103;
   int INT_PALE_GREEN = 104;
   int INT_PALE_TURQUOISE = 105;
   int INT_PALE_VIOLET_RED = 106;
   int INT_PAPAYA_WHIP = 107;
   int INT_PEACH_PUFF = 108;
   int INT_PERU = 109;
   int INT_PINK = 110;
   int INT_PLUM = 111;
   int INT_POWDER_BLUE = 112;
   int INT_PURPLE = 113;
   int INT_RED = 114;
   int INT_ROSY_BROWN = 115;
   int INT_ROYAL_BLUE = 116;
   int INT_SADDLE_BROWN = 117;
   int INT_SALMON = 118;
   int INT_SANDY_BROWN = 119;
   int INT_SEA_GREEN = 120;
   int INT_SEA_SHELL = 121;
   int INT_SIENNA = 122;
   int INT_SILVER = 123;
   int INT_SKY_BLUE = 124;
   int INT_SLATE_BLUE = 125;
   int INT_SLATE_GRAY = 126;
   int INT_SNOW = 127;
   int INT_SPRING_GREEN = 128;
   int INT_STEEL_BLUE = 129;
   int INT_TAN = 130;
   int INT_TEAL = 131;
   int INT_THISTLE = 132;
   int INT_TOMATO = 133;
   int INT_TURQUOISE = 134;
   int INT_VIOLET = 135;
   int INT_WHEAT = 136;
   int INT_WHITE = 137;
   int INT_WHITE_SMOKE = 138;
   int INT_YELLOW = 139;
   int INT_YELLOW_GREEN = 140;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static STPresetColorVal newValue(Object var0) {
         return (STPresetColorVal)STPresetColorVal.type.newValue(var0);
      }

      public static STPresetColorVal newInstance() {
         return (STPresetColorVal)POIXMLTypeLoader.newInstance(STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal newInstance(XmlOptions var0) {
         return (STPresetColorVal)POIXMLTypeLoader.newInstance(STPresetColorVal.type, var0);
      }

      public static STPresetColorVal parse(String var0) throws XmlException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(String var0, XmlOptions var1) throws XmlException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static STPresetColorVal parse(File var0) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static STPresetColorVal parse(URL var0) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static STPresetColorVal parse(InputStream var0) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static STPresetColorVal parse(Reader var0) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static STPresetColorVal parse(XMLStreamReader var0) throws XmlException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static STPresetColorVal parse(Node var0) throws XmlException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static STPresetColorVal parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static STPresetColorVal parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPresetColorVal)POIXMLTypeLoader.parse(var0, STPresetColorVal.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPresetColorVal.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPresetColorVal.type, var1);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_ALICE_BLUE = 1;
      static final int INT_ANTIQUE_WHITE = 2;
      static final int INT_AQUA = 3;
      static final int INT_AQUAMARINE = 4;
      static final int INT_AZURE = 5;
      static final int INT_BEIGE = 6;
      static final int INT_BISQUE = 7;
      static final int INT_BLACK = 8;
      static final int INT_BLANCHED_ALMOND = 9;
      static final int INT_BLUE = 10;
      static final int INT_BLUE_VIOLET = 11;
      static final int INT_BROWN = 12;
      static final int INT_BURLY_WOOD = 13;
      static final int INT_CADET_BLUE = 14;
      static final int INT_CHARTREUSE = 15;
      static final int INT_CHOCOLATE = 16;
      static final int INT_CORAL = 17;
      static final int INT_CORNFLOWER_BLUE = 18;
      static final int INT_CORNSILK = 19;
      static final int INT_CRIMSON = 20;
      static final int INT_CYAN = 21;
      static final int INT_DK_BLUE = 22;
      static final int INT_DK_CYAN = 23;
      static final int INT_DK_GOLDENROD = 24;
      static final int INT_DK_GRAY = 25;
      static final int INT_DK_GREEN = 26;
      static final int INT_DK_KHAKI = 27;
      static final int INT_DK_MAGENTA = 28;
      static final int INT_DK_OLIVE_GREEN = 29;
      static final int INT_DK_ORANGE = 30;
      static final int INT_DK_ORCHID = 31;
      static final int INT_DK_RED = 32;
      static final int INT_DK_SALMON = 33;
      static final int INT_DK_SEA_GREEN = 34;
      static final int INT_DK_SLATE_BLUE = 35;
      static final int INT_DK_SLATE_GRAY = 36;
      static final int INT_DK_TURQUOISE = 37;
      static final int INT_DK_VIOLET = 38;
      static final int INT_DEEP_PINK = 39;
      static final int INT_DEEP_SKY_BLUE = 40;
      static final int INT_DIM_GRAY = 41;
      static final int INT_DODGER_BLUE = 42;
      static final int INT_FIREBRICK = 43;
      static final int INT_FLORAL_WHITE = 44;
      static final int INT_FOREST_GREEN = 45;
      static final int INT_FUCHSIA = 46;
      static final int INT_GAINSBORO = 47;
      static final int INT_GHOST_WHITE = 48;
      static final int INT_GOLD = 49;
      static final int INT_GOLDENROD = 50;
      static final int INT_GRAY = 51;
      static final int INT_GREEN = 52;
      static final int INT_GREEN_YELLOW = 53;
      static final int INT_HONEYDEW = 54;
      static final int INT_HOT_PINK = 55;
      static final int INT_INDIAN_RED = 56;
      static final int INT_INDIGO = 57;
      static final int INT_IVORY = 58;
      static final int INT_KHAKI = 59;
      static final int INT_LAVENDER = 60;
      static final int INT_LAVENDER_BLUSH = 61;
      static final int INT_LAWN_GREEN = 62;
      static final int INT_LEMON_CHIFFON = 63;
      static final int INT_LT_BLUE = 64;
      static final int INT_LT_CORAL = 65;
      static final int INT_LT_CYAN = 66;
      static final int INT_LT_GOLDENROD_YELLOW = 67;
      static final int INT_LT_GRAY = 68;
      static final int INT_LT_GREEN = 69;
      static final int INT_LT_PINK = 70;
      static final int INT_LT_SALMON = 71;
      static final int INT_LT_SEA_GREEN = 72;
      static final int INT_LT_SKY_BLUE = 73;
      static final int INT_LT_SLATE_GRAY = 74;
      static final int INT_LT_STEEL_BLUE = 75;
      static final int INT_LT_YELLOW = 76;
      static final int INT_LIME = 77;
      static final int INT_LIME_GREEN = 78;
      static final int INT_LINEN = 79;
      static final int INT_MAGENTA = 80;
      static final int INT_MAROON = 81;
      static final int INT_MED_AQUAMARINE = 82;
      static final int INT_MED_BLUE = 83;
      static final int INT_MED_ORCHID = 84;
      static final int INT_MED_PURPLE = 85;
      static final int INT_MED_SEA_GREEN = 86;
      static final int INT_MED_SLATE_BLUE = 87;
      static final int INT_MED_SPRING_GREEN = 88;
      static final int INT_MED_TURQUOISE = 89;
      static final int INT_MED_VIOLET_RED = 90;
      static final int INT_MIDNIGHT_BLUE = 91;
      static final int INT_MINT_CREAM = 92;
      static final int INT_MISTY_ROSE = 93;
      static final int INT_MOCCASIN = 94;
      static final int INT_NAVAJO_WHITE = 95;
      static final int INT_NAVY = 96;
      static final int INT_OLD_LACE = 97;
      static final int INT_OLIVE = 98;
      static final int INT_OLIVE_DRAB = 99;
      static final int INT_ORANGE = 100;
      static final int INT_ORANGE_RED = 101;
      static final int INT_ORCHID = 102;
      static final int INT_PALE_GOLDENROD = 103;
      static final int INT_PALE_GREEN = 104;
      static final int INT_PALE_TURQUOISE = 105;
      static final int INT_PALE_VIOLET_RED = 106;
      static final int INT_PAPAYA_WHIP = 107;
      static final int INT_PEACH_PUFF = 108;
      static final int INT_PERU = 109;
      static final int INT_PINK = 110;
      static final int INT_PLUM = 111;
      static final int INT_POWDER_BLUE = 112;
      static final int INT_PURPLE = 113;
      static final int INT_RED = 114;
      static final int INT_ROSY_BROWN = 115;
      static final int INT_ROYAL_BLUE = 116;
      static final int INT_SADDLE_BROWN = 117;
      static final int INT_SALMON = 118;
      static final int INT_SANDY_BROWN = 119;
      static final int INT_SEA_GREEN = 120;
      static final int INT_SEA_SHELL = 121;
      static final int INT_SIENNA = 122;
      static final int INT_SILVER = 123;
      static final int INT_SKY_BLUE = 124;
      static final int INT_SLATE_BLUE = 125;
      static final int INT_SLATE_GRAY = 126;
      static final int INT_SNOW = 127;
      static final int INT_SPRING_GREEN = 128;
      static final int INT_STEEL_BLUE = 129;
      static final int INT_TAN = 130;
      static final int INT_TEAL = 131;
      static final int INT_THISTLE = 132;
      static final int INT_TOMATO = 133;
      static final int INT_TURQUOISE = 134;
      static final int INT_VIOLET = 135;
      static final int INT_WHEAT = 136;
      static final int INT_WHITE = 137;
      static final int INT_WHITE_SMOKE = 138;
      static final int INT_YELLOW = 139;
      static final int INT_YELLOW_GREEN = 140;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPresetColorVal.Enum[]{new STPresetColorVal.Enum("aliceBlue", 1), new STPresetColorVal.Enum("antiqueWhite", 2), new STPresetColorVal.Enum("aqua", 3), new STPresetColorVal.Enum("aquamarine", 4), new STPresetColorVal.Enum("azure", 5), new STPresetColorVal.Enum("beige", 6), new STPresetColorVal.Enum("bisque", 7), new STPresetColorVal.Enum("black", 8), new STPresetColorVal.Enum("blanchedAlmond", 9), new STPresetColorVal.Enum("blue", 10), new STPresetColorVal.Enum("blueViolet", 11), new STPresetColorVal.Enum("brown", 12), new STPresetColorVal.Enum("burlyWood", 13), new STPresetColorVal.Enum("cadetBlue", 14), new STPresetColorVal.Enum("chartreuse", 15), new STPresetColorVal.Enum("chocolate", 16), new STPresetColorVal.Enum("coral", 17), new STPresetColorVal.Enum("cornflowerBlue", 18), new STPresetColorVal.Enum("cornsilk", 19), new STPresetColorVal.Enum("crimson", 20), new STPresetColorVal.Enum("cyan", 21), new STPresetColorVal.Enum("dkBlue", 22), new STPresetColorVal.Enum("dkCyan", 23), new STPresetColorVal.Enum("dkGoldenrod", 24), new STPresetColorVal.Enum("dkGray", 25), new STPresetColorVal.Enum("dkGreen", 26), new STPresetColorVal.Enum("dkKhaki", 27), new STPresetColorVal.Enum("dkMagenta", 28), new STPresetColorVal.Enum("dkOliveGreen", 29), new STPresetColorVal.Enum("dkOrange", 30), new STPresetColorVal.Enum("dkOrchid", 31), new STPresetColorVal.Enum("dkRed", 32), new STPresetColorVal.Enum("dkSalmon", 33), new STPresetColorVal.Enum("dkSeaGreen", 34), new STPresetColorVal.Enum("dkSlateBlue", 35), new STPresetColorVal.Enum("dkSlateGray", 36), new STPresetColorVal.Enum("dkTurquoise", 37), new STPresetColorVal.Enum("dkViolet", 38), new STPresetColorVal.Enum("deepPink", 39), new STPresetColorVal.Enum("deepSkyBlue", 40), new STPresetColorVal.Enum("dimGray", 41), new STPresetColorVal.Enum("dodgerBlue", 42), new STPresetColorVal.Enum("firebrick", 43), new STPresetColorVal.Enum("floralWhite", 44), new STPresetColorVal.Enum("forestGreen", 45), new STPresetColorVal.Enum("fuchsia", 46), new STPresetColorVal.Enum("gainsboro", 47), new STPresetColorVal.Enum("ghostWhite", 48), new STPresetColorVal.Enum("gold", 49), new STPresetColorVal.Enum("goldenrod", 50), new STPresetColorVal.Enum("gray", 51), new STPresetColorVal.Enum("green", 52), new STPresetColorVal.Enum("greenYellow", 53), new STPresetColorVal.Enum("honeydew", 54), new STPresetColorVal.Enum("hotPink", 55), new STPresetColorVal.Enum("indianRed", 56), new STPresetColorVal.Enum("indigo", 57), new STPresetColorVal.Enum("ivory", 58), new STPresetColorVal.Enum("khaki", 59), new STPresetColorVal.Enum("lavender", 60), new STPresetColorVal.Enum("lavenderBlush", 61), new STPresetColorVal.Enum("lawnGreen", 62), new STPresetColorVal.Enum("lemonChiffon", 63), new STPresetColorVal.Enum("ltBlue", 64), new STPresetColorVal.Enum("ltCoral", 65), new STPresetColorVal.Enum("ltCyan", 66), new STPresetColorVal.Enum("ltGoldenrodYellow", 67), new STPresetColorVal.Enum("ltGray", 68), new STPresetColorVal.Enum("ltGreen", 69), new STPresetColorVal.Enum("ltPink", 70), new STPresetColorVal.Enum("ltSalmon", 71), new STPresetColorVal.Enum("ltSeaGreen", 72), new STPresetColorVal.Enum("ltSkyBlue", 73), new STPresetColorVal.Enum("ltSlateGray", 74), new STPresetColorVal.Enum("ltSteelBlue", 75), new STPresetColorVal.Enum("ltYellow", 76), new STPresetColorVal.Enum("lime", 77), new STPresetColorVal.Enum("limeGreen", 78), new STPresetColorVal.Enum("linen", 79), new STPresetColorVal.Enum("magenta", 80), new STPresetColorVal.Enum("maroon", 81), new STPresetColorVal.Enum("medAquamarine", 82), new STPresetColorVal.Enum("medBlue", 83), new STPresetColorVal.Enum("medOrchid", 84), new STPresetColorVal.Enum("medPurple", 85), new STPresetColorVal.Enum("medSeaGreen", 86), new STPresetColorVal.Enum("medSlateBlue", 87), new STPresetColorVal.Enum("medSpringGreen", 88), new STPresetColorVal.Enum("medTurquoise", 89), new STPresetColorVal.Enum("medVioletRed", 90), new STPresetColorVal.Enum("midnightBlue", 91), new STPresetColorVal.Enum("mintCream", 92), new STPresetColorVal.Enum("mistyRose", 93), new STPresetColorVal.Enum("moccasin", 94), new STPresetColorVal.Enum("navajoWhite", 95), new STPresetColorVal.Enum("navy", 96), new STPresetColorVal.Enum("oldLace", 97), new STPresetColorVal.Enum("olive", 98), new STPresetColorVal.Enum("oliveDrab", 99), new STPresetColorVal.Enum("orange", 100), new STPresetColorVal.Enum("orangeRed", 101), new STPresetColorVal.Enum("orchid", 102), new STPresetColorVal.Enum("paleGoldenrod", 103), new STPresetColorVal.Enum("paleGreen", 104), new STPresetColorVal.Enum("paleTurquoise", 105), new STPresetColorVal.Enum("paleVioletRed", 106), new STPresetColorVal.Enum("papayaWhip", 107), new STPresetColorVal.Enum("peachPuff", 108), new STPresetColorVal.Enum("peru", 109), new STPresetColorVal.Enum("pink", 110), new STPresetColorVal.Enum("plum", 111), new STPresetColorVal.Enum("powderBlue", 112), new STPresetColorVal.Enum("purple", 113), new STPresetColorVal.Enum("red", 114), new STPresetColorVal.Enum("rosyBrown", 115), new STPresetColorVal.Enum("royalBlue", 116), new STPresetColorVal.Enum("saddleBrown", 117), new STPresetColorVal.Enum("salmon", 118), new STPresetColorVal.Enum("sandyBrown", 119), new STPresetColorVal.Enum("seaGreen", 120), new STPresetColorVal.Enum("seaShell", 121), new STPresetColorVal.Enum("sienna", 122), new STPresetColorVal.Enum("silver", 123), new STPresetColorVal.Enum("skyBlue", 124), new STPresetColorVal.Enum("slateBlue", 125), new STPresetColorVal.Enum("slateGray", 126), new STPresetColorVal.Enum("snow", 127), new STPresetColorVal.Enum("springGreen", 128), new STPresetColorVal.Enum("steelBlue", 129), new STPresetColorVal.Enum("tan", 130), new STPresetColorVal.Enum("teal", 131), new STPresetColorVal.Enum("thistle", 132), new STPresetColorVal.Enum("tomato", 133), new STPresetColorVal.Enum("turquoise", 134), new STPresetColorVal.Enum("violet", 135), new STPresetColorVal.Enum("wheat", 136), new STPresetColorVal.Enum("white", 137), new STPresetColorVal.Enum("whiteSmoke", 138), new STPresetColorVal.Enum("yellow", 139), new STPresetColorVal.Enum("yellowGreen", 140)});
      private static final long serialVersionUID = 1L;


      public static STPresetColorVal.Enum forString(String var0) {
         return (STPresetColorVal.Enum)table.forString(var0);
      }

      public static STPresetColorVal.Enum forInt(int var0) {
         return (STPresetColorVal.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }
}
