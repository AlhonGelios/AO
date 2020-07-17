package org.apache.poi.hssf.util;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Color;

public class HSSFColor implements Color {

   private static Map indexHash;


   public static final Map getIndexHash() {
      if(indexHash == null) {
         indexHash = Collections.unmodifiableMap(createColorsByIndexMap());
      }

      return indexHash;
   }

   public static final Map getMutableIndexHash() {
      return createColorsByIndexMap();
   }

   private static Map createColorsByIndexMap() {
      HSSFColor[] colors = getAllColors();
      HashMap result = new HashMap(colors.length * 3 / 2);

      int i;
      HSSFColor color;
      Integer index2;
      for(i = 0; i < colors.length; ++i) {
         color = colors[i];
         index2 = Integer.valueOf(color.getIndex());
         if(result.containsKey(index2)) {
            HSSFColor prevColor = (HSSFColor)result.get(index2);
            throw new RuntimeException("Dup color index (" + index2 + ") for colors (" + prevColor.getClass().getName() + "),(" + color.getClass().getName() + ")");
         }

         result.put(index2, color);
      }

      for(i = 0; i < colors.length; ++i) {
         color = colors[i];
         index2 = getIndex2(color);
         if(index2 != null) {
            result.put(index2, color);
         }
      }

      return result;
   }

   private static Integer getIndex2(HSSFColor color) {
      Field f;
      try {
         f = color.getClass().getDeclaredField("index2");
      } catch (NoSuchFieldException var6) {
         return null;
      }

      Short s;
      try {
         s = (Short)f.get(color);
      } catch (IllegalArgumentException var4) {
         throw new RuntimeException(var4);
      } catch (IllegalAccessException var5) {
         throw new RuntimeException(var5);
      }

      return Integer.valueOf(s.intValue());
   }

   private static HSSFColor[] getAllColors() {
      return new HSSFColor[]{new HSSFColor.BLACK(), new HSSFColor.BROWN(), new HSSFColor.OLIVE_GREEN(), new HSSFColor.DARK_GREEN(), new HSSFColor.DARK_TEAL(), new HSSFColor.DARK_BLUE(), new HSSFColor.INDIGO(), new HSSFColor.GREY_80_PERCENT(), new HSSFColor.ORANGE(), new HSSFColor.DARK_YELLOW(), new HSSFColor.GREEN(), new HSSFColor.TEAL(), new HSSFColor.BLUE(), new HSSFColor.BLUE_GREY(), new HSSFColor.GREY_50_PERCENT(), new HSSFColor.RED(), new HSSFColor.LIGHT_ORANGE(), new HSSFColor.LIME(), new HSSFColor.SEA_GREEN(), new HSSFColor.AQUA(), new HSSFColor.LIGHT_BLUE(), new HSSFColor.VIOLET(), new HSSFColor.GREY_40_PERCENT(), new HSSFColor.PINK(), new HSSFColor.GOLD(), new HSSFColor.YELLOW(), new HSSFColor.BRIGHT_GREEN(), new HSSFColor.TURQUOISE(), new HSSFColor.DARK_RED(), new HSSFColor.SKY_BLUE(), new HSSFColor.PLUM(), new HSSFColor.GREY_25_PERCENT(), new HSSFColor.ROSE(), new HSSFColor.LIGHT_YELLOW(), new HSSFColor.LIGHT_GREEN(), new HSSFColor.LIGHT_TURQUOISE(), new HSSFColor.PALE_BLUE(), new HSSFColor.LAVENDER(), new HSSFColor.WHITE(), new HSSFColor.CORNFLOWER_BLUE(), new HSSFColor.LEMON_CHIFFON(), new HSSFColor.MAROON(), new HSSFColor.ORCHID(), new HSSFColor.CORAL(), new HSSFColor.ROYAL_BLUE(), new HSSFColor.LIGHT_CORNFLOWER_BLUE(), new HSSFColor.TAN()};
   }

   public static final Map getTripletHash() {
      return createColorsByHexStringMap();
   }

   private static Map createColorsByHexStringMap() {
      HSSFColor[] colors = getAllColors();
      HashMap result = new HashMap(colors.length * 3 / 2);

      for(int i = 0; i < colors.length; ++i) {
         HSSFColor color = colors[i];
         String hexString = color.getHexString();
         if(result.containsKey(hexString)) {
            HSSFColor other = (HSSFColor)result.get(hexString);
            throw new RuntimeException("Dup color hexString (" + hexString + ") for color (" + color.getClass().getName() + ") - " + " already taken by (" + other.getClass().getName() + ")");
         }

         result.put(hexString, color);
      }

      return result;
   }

   public short getIndex() {
      return (short)8;
   }

   public short[] getTriplet() {
      return HSSFColor.BLACK.triplet;
   }

   public String getHexString() {
      return "0:0:0";
   }

   public static HSSFColor toHSSFColor(Color color) {
      if(color != null && !(color instanceof HSSFColor)) {
         throw new IllegalArgumentException("Only HSSFColor objects are supported");
      } else {
         return (HSSFColor)color;
      }
   }

   public static final class GREY_80_PERCENT extends HSSFColor {

      public static final short index = 63;
      public static final short[] triplet = new short[]{(short)51, (short)51, (short)51};
      public static final String hexString = "3333:3333:3333";


      public short getIndex() {
         return (short)63;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "3333:3333:3333";
      }

   }

   public static final class GREY_50_PERCENT extends HSSFColor {

      public static final short index = 23;
      public static final short[] triplet = new short[]{(short)128, (short)128, (short)128};
      public static final String hexString = "8080:8080:8080";


      public short getIndex() {
         return (short)23;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "8080:8080:8080";
      }

   }

   public static class OLIVE_GREEN extends HSSFColor {

      public static final short index = 59;
      public static final short[] triplet = new short[]{(short)51, (short)51, (short)0};
      public static final String hexString = "3333:3333:0";


      public short getIndex() {
         return (short)59;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "3333:3333:0";
      }

   }

   public static final class ORCHID extends HSSFColor {

      public static final short index = 28;
      public static final short[] triplet = new short[]{(short)102, (short)0, (short)102};
      public static final String hexString = "6666:0:6666";


      public short getIndex() {
         return (short)28;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "6666:0:6666";
      }

   }

   public static final class LEMON_CHIFFON extends HSSFColor {

      public static final short index = 26;
      public static final short[] triplet = new short[]{(short)255, (short)255, (short)204};
      public static final String hexString = "FFFF:FFFF:CCCC";


      public short getIndex() {
         return (short)26;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:FFFF:CCCC";
      }

   }

   public static final class LIGHT_ORANGE extends HSSFColor {

      public static final short index = 52;
      public static final short[] triplet = new short[]{(short)255, (short)153, (short)0};
      public static final String hexString = "FFFF:9999:0";


      public short getIndex() {
         return (short)52;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:9999:0";
      }

   }

   public static final class TURQUOISE extends HSSFColor {

      public static final short index = 15;
      public static final short index2 = 35;
      public static final short[] triplet = new short[]{(short)0, (short)255, (short)255};
      public static final String hexString = "0:FFFF:FFFF";


      public short getIndex() {
         return (short)15;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:FFFF:FFFF";
      }

   }

   public static final class GREEN extends HSSFColor {

      public static final short index = 17;
      public static final short[] triplet = new short[]{(short)0, (short)128, (short)0};
      public static final String hexString = "0:8080:0";


      public short getIndex() {
         return (short)17;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:8080:0";
      }

   }

   public static final class AUTOMATIC extends HSSFColor {

      private static HSSFColor instance = new HSSFColor.AUTOMATIC();
      public static final short index = 64;


      public short getIndex() {
         return (short)64;
      }

      public short[] getTriplet() {
         return HSSFColor.BLACK.triplet;
      }

      public String getHexString() {
         return "0:0:0";
      }

      public static HSSFColor getInstance() {
         return instance;
      }

   }

   public static final class WHITE extends HSSFColor {

      public static final short index = 9;
      public static final short[] triplet = new short[]{(short)255, (short)255, (short)255};
      public static final String hexString = "FFFF:FFFF:FFFF";


      public short getIndex() {
         return (short)9;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:FFFF:FFFF";
      }

   }

   public static final class CORNFLOWER_BLUE extends HSSFColor {

      public static final short index = 24;
      public static final short[] triplet = new short[]{(short)153, (short)153, (short)255};
      public static final String hexString = "9999:9999:FFFF";


      public short getIndex() {
         return (short)24;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "9999:9999:FFFF";
      }

   }

   public static final class DARK_YELLOW extends HSSFColor {

      public static final short index = 19;
      public static final short[] triplet = new short[]{(short)128, (short)128, (short)0};
      public static final String hexString = "8080:8080:0";


      public short getIndex() {
         return (short)19;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "8080:8080:0";
      }

   }

   public static final class RED extends HSSFColor {

      public static final short index = 10;
      public static final short[] triplet = new short[]{(short)255, (short)0, (short)0};
      public static final String hexString = "FFFF:0:0";


      public short getIndex() {
         return (short)10;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:0:0";
      }

   }

   public static final class YELLOW extends HSSFColor {

      public static final short index = 13;
      public static final short index2 = 34;
      public static final short[] triplet = new short[]{(short)255, (short)255, (short)0};
      public static final String hexString = "FFFF:FFFF:0";


      public short getIndex() {
         return (short)13;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:FFFF:0";
      }

   }

   public static final class PALE_BLUE extends HSSFColor {

      public static final short index = 44;
      public static final short[] triplet = new short[]{(short)153, (short)204, (short)255};
      public static final String hexString = "9999:CCCC:FFFF";


      public short getIndex() {
         return (short)44;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "9999:CCCC:FFFF";
      }

   }

   public static final class PINK extends HSSFColor {

      public static final short index = 14;
      public static final short index2 = 33;
      public static final short[] triplet = new short[]{(short)255, (short)0, (short)255};
      public static final String hexString = "FFFF:0:FFFF";


      public short getIndex() {
         return (short)14;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:0:FFFF";
      }

   }

   public static final class LAVENDER extends HSSFColor {

      public static final short index = 46;
      public static final short[] triplet = new short[]{(short)204, (short)153, (short)255};
      public static final String hexString = "CCCC:9999:FFFF";


      public short getIndex() {
         return (short)46;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "CCCC:9999:FFFF";
      }

   }

   public static final class AQUA extends HSSFColor {

      public static final short index = 49;
      public static final short[] triplet = new short[]{(short)51, (short)204, (short)204};
      public static final String hexString = "3333:CCCC:CCCC";


      public short getIndex() {
         return (short)49;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "3333:CCCC:CCCC";
      }

   }

   public static final class SKY_BLUE extends HSSFColor {

      public static final short index = 40;
      public static final short[] triplet = new short[]{(short)0, (short)204, (short)255};
      public static final String hexString = "0:CCCC:FFFF";


      public short getIndex() {
         return (short)40;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:CCCC:FFFF";
      }

   }

   public static final class SEA_GREEN extends HSSFColor {

      public static final short index = 57;
      public static final short[] triplet = new short[]{(short)51, (short)153, (short)102};
      public static final String hexString = "3333:9999:6666";


      public short getIndex() {
         return (short)57;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "3333:9999:6666";
      }

   }

   public static final class VIOLET extends HSSFColor {

      public static final short index = 20;
      public static final short index2 = 36;
      public static final short[] triplet = new short[]{(short)128, (short)0, (short)128};
      public static final String hexString = "8080:0:8080";


      public short getIndex() {
         return (short)20;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "8080:0:8080";
      }

   }

   public static final class INDIGO extends HSSFColor {

      public static final short index = 62;
      public static final short[] triplet = new short[]{(short)51, (short)51, (short)153};
      public static final String hexString = "3333:3333:9999";


      public short getIndex() {
         return (short)62;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "3333:3333:9999";
      }

   }

   public static final class TAN extends HSSFColor {

      public static final short index = 47;
      public static final short[] triplet = new short[]{(short)255, (short)204, (short)153};
      public static final String hexString = "FFFF:CCCC:9999";


      public short getIndex() {
         return (short)47;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:CCCC:9999";
      }

   }

   public static final class DARK_BLUE extends HSSFColor {

      public static final short index = 18;
      public static final short index2 = 32;
      public static final short[] triplet = new short[]{(short)0, (short)0, (short)128};
      public static final String hexString = "0:0:8080";


      public short getIndex() {
         return (short)18;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:0:8080";
      }

   }

   public static final class TEAL extends HSSFColor {

      public static final short index = 21;
      public static final short index2 = 38;
      public static final short[] triplet = new short[]{(short)0, (short)128, (short)128};
      public static final String hexString = "0:8080:8080";


      public short getIndex() {
         return (short)21;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:8080:8080";
      }

   }

   public static final class BLUE_GREY extends HSSFColor {

      public static final short index = 54;
      public static final short[] triplet = new short[]{(short)102, (short)102, (short)153};
      public static final String hexString = "6666:6666:9999";


      public short getIndex() {
         return (short)54;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "6666:6666:9999";
      }

   }

   public static final class GOLD extends HSSFColor {

      public static final short index = 51;
      public static final short[] triplet = new short[]{(short)255, (short)204, (short)0};
      public static final String hexString = "FFFF:CCCC:0";


      public short getIndex() {
         return (short)51;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:CCCC:0";
      }

   }

   public static final class GREY_40_PERCENT extends HSSFColor {

      public static final short index = 55;
      public static final short[] triplet = new short[]{(short)150, (short)150, (short)150};
      public static final String hexString = "9696:9696:9696";


      public short getIndex() {
         return (short)55;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "9696:9696:9696";
      }

   }

   public static final class DARK_GREEN extends HSSFColor {

      public static final short index = 58;
      public static final short[] triplet = new short[]{(short)0, (short)51, (short)0};
      public static final String hexString = "0:3333:0";


      public short getIndex() {
         return (short)58;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:3333:0";
      }

   }

   public static final class MAROON extends HSSFColor {

      public static final short index = 25;
      public static final short[] triplet = new short[]{(short)127, (short)0, (short)0};
      public static final String hexString = "8000:0:0";


      public short getIndex() {
         return (short)25;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "8000:0:0";
      }

   }

   public static final class LIGHT_TURQUOISE extends HSSFColor {

      public static final short index = 41;
      public static final short index2 = 27;
      public static final short[] triplet = new short[]{(short)204, (short)255, (short)255};
      public static final String hexString = "CCCC:FFFF:FFFF";


      public short getIndex() {
         return (short)41;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "CCCC:FFFF:FFFF";
      }

   }

   public static final class ROYAL_BLUE extends HSSFColor {

      public static final short index = 30;
      public static final short[] triplet = new short[]{(short)0, (short)102, (short)204};
      public static final String hexString = "0:6666:CCCC";


      public short getIndex() {
         return (short)30;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:6666:CCCC";
      }

   }

   public static final class LIGHT_GREEN extends HSSFColor {

      public static final short index = 42;
      public static final short[] triplet = new short[]{(short)204, (short)255, (short)204};
      public static final String hexString = "CCCC:FFFF:CCCC";


      public short getIndex() {
         return (short)42;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "CCCC:FFFF:CCCC";
      }

   }

   public static final class BRIGHT_GREEN extends HSSFColor {

      public static final short index = 11;
      public static final short index2 = 35;
      public static final short[] triplet = new short[]{(short)0, (short)255, (short)0};
      public static final String hexString = "0:FFFF:0";


      public short getIndex() {
         return (short)11;
      }

      public String getHexString() {
         return "0:FFFF:0";
      }

      public short[] getTriplet() {
         return triplet;
      }

   }

   public static final class CORAL extends HSSFColor {

      public static final short index = 29;
      public static final short[] triplet = new short[]{(short)255, (short)128, (short)128};
      public static final String hexString = "FFFF:8080:8080";


      public short getIndex() {
         return (short)29;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:8080:8080";
      }

   }

   public static final class ROSE extends HSSFColor {

      public static final short index = 45;
      public static final short[] triplet = new short[]{(short)255, (short)153, (short)204};
      public static final String hexString = "FFFF:9999:CCCC";


      public short getIndex() {
         return (short)45;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:9999:CCCC";
      }

   }

   public static final class BLACK extends HSSFColor {

      public static final short index = 8;
      public static final short[] triplet = new short[]{(short)0, (short)0, (short)0};
      public static final String hexString = "0:0:0";


      public short getIndex() {
         return (short)8;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:0:0";
      }

   }

   public static final class LIGHT_BLUE extends HSSFColor {

      public static final short index = 48;
      public static final short[] triplet = new short[]{(short)51, (short)102, (short)255};
      public static final String hexString = "3333:6666:FFFF";


      public short getIndex() {
         return (short)48;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "3333:6666:FFFF";
      }

   }

   public static final class DARK_TEAL extends HSSFColor {

      public static final short index = 56;
      public static final short[] triplet = new short[]{(short)0, (short)51, (short)102};
      public static final String hexString = "0:3333:6666";


      public short getIndex() {
         return (short)56;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:3333:6666";
      }

   }

   public static final class LIME extends HSSFColor {

      public static final short index = 50;
      public static final short[] triplet = new short[]{(short)153, (short)204, (short)0};
      public static final String hexString = "9999:CCCC:0";


      public short getIndex() {
         return (short)50;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "9999:CCCC:0";
      }

   }

   public static final class ORANGE extends HSSFColor {

      public static final short index = 53;
      public static final short[] triplet = new short[]{(short)255, (short)102, (short)0};
      public static final String hexString = "FFFF:6666:0";


      public short getIndex() {
         return (short)53;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:6666:0";
      }

   }

   public static final class LIGHT_CORNFLOWER_BLUE extends HSSFColor {

      public static final short index = 31;
      public static final short[] triplet = new short[]{(short)204, (short)204, (short)255};
      public static final String hexString = "CCCC:CCCC:FFFF";


      public short getIndex() {
         return (short)31;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "CCCC:CCCC:FFFF";
      }

   }

   public static final class LIGHT_YELLOW extends HSSFColor {

      public static final short index = 43;
      public static final short[] triplet = new short[]{(short)255, (short)255, (short)153};
      public static final String hexString = "FFFF:FFFF:9999";


      public short getIndex() {
         return (short)43;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "FFFF:FFFF:9999";
      }

   }

   public static final class GREY_25_PERCENT extends HSSFColor {

      public static final short index = 22;
      public static final short[] triplet = new short[]{(short)192, (short)192, (short)192};
      public static final String hexString = "C0C0:C0C0:C0C0";


      public short getIndex() {
         return (short)22;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "C0C0:C0C0:C0C0";
      }

   }

   public static final class DARK_RED extends HSSFColor {

      public static final short index = 16;
      public static final short index2 = 37;
      public static final short[] triplet = new short[]{(short)128, (short)0, (short)0};
      public static final String hexString = "8080:0:0";


      public short getIndex() {
         return (short)16;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "8080:0:0";
      }

   }

   public static final class PLUM extends HSSFColor {

      public static final short index = 61;
      public static final short index2 = 25;
      public static final short[] triplet = new short[]{(short)153, (short)51, (short)102};
      public static final String hexString = "9999:3333:6666";


      public short getIndex() {
         return (short)61;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "9999:3333:6666";
      }

   }

   public static final class BLUE extends HSSFColor {

      public static final short index = 12;
      public static final short index2 = 39;
      public static final short[] triplet = new short[]{(short)0, (short)0, (short)255};
      public static final String hexString = "0:0:FFFF";


      public short getIndex() {
         return (short)12;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "0:0:FFFF";
      }

   }

   public static final class BROWN extends HSSFColor {

      public static final short index = 60;
      public static final short[] triplet = new short[]{(short)153, (short)51, (short)0};
      public static final String hexString = "9999:3333:0";


      public short getIndex() {
         return (short)60;
      }

      public short[] getTriplet() {
         return triplet;
      }

      public String getHexString() {
         return "9999:3333:0";
      }

   }
}
