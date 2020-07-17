package org.apache.poi.ss.usermodel;


public enum IndexedColors {

   BLACK("BLACK", 0, 8),
   WHITE("WHITE", 1, 9),
   RED("RED", 2, 10),
   BRIGHT_GREEN("BRIGHT_GREEN", 3, 11),
   BLUE("BLUE", 4, 12),
   YELLOW("YELLOW", 5, 13),
   PINK("PINK", 6, 14),
   TURQUOISE("TURQUOISE", 7, 15),
   DARK_RED("DARK_RED", 8, 16),
   GREEN("GREEN", 9, 17),
   DARK_BLUE("DARK_BLUE", 10, 18),
   DARK_YELLOW("DARK_YELLOW", 11, 19),
   VIOLET("VIOLET", 12, 20),
   TEAL("TEAL", 13, 21),
   GREY_25_PERCENT("GREY_25_PERCENT", 14, 22),
   GREY_50_PERCENT("GREY_50_PERCENT", 15, 23),
   CORNFLOWER_BLUE("CORNFLOWER_BLUE", 16, 24),
   MAROON("MAROON", 17, 25),
   LEMON_CHIFFON("LEMON_CHIFFON", 18, 26),
   ORCHID("ORCHID", 19, 28),
   CORAL("CORAL", 20, 29),
   ROYAL_BLUE("ROYAL_BLUE", 21, 30),
   LIGHT_CORNFLOWER_BLUE("LIGHT_CORNFLOWER_BLUE", 22, 31),
   SKY_BLUE("SKY_BLUE", 23, 40),
   LIGHT_TURQUOISE("LIGHT_TURQUOISE", 24, 41),
   LIGHT_GREEN("LIGHT_GREEN", 25, 42),
   LIGHT_YELLOW("LIGHT_YELLOW", 26, 43),
   PALE_BLUE("PALE_BLUE", 27, 44),
   ROSE("ROSE", 28, 45),
   LAVENDER("LAVENDER", 29, 46),
   TAN("TAN", 30, 47),
   LIGHT_BLUE("LIGHT_BLUE", 31, 48),
   AQUA("AQUA", 32, 49),
   LIME("LIME", 33, 50),
   GOLD("GOLD", 34, 51),
   LIGHT_ORANGE("LIGHT_ORANGE", 35, 52),
   ORANGE("ORANGE", 36, 53),
   BLUE_GREY("BLUE_GREY", 37, 54),
   GREY_40_PERCENT("GREY_40_PERCENT", 38, 55),
   DARK_TEAL("DARK_TEAL", 39, 56),
   SEA_GREEN("SEA_GREEN", 40, 57),
   DARK_GREEN("DARK_GREEN", 41, 58),
   OLIVE_GREEN("OLIVE_GREEN", 42, 59),
   BROWN("BROWN", 43, 60),
   PLUM("PLUM", 44, 61),
   INDIGO("INDIGO", 45, 62),
   GREY_80_PERCENT("GREY_80_PERCENT", 46, 63),
   AUTOMATIC("AUTOMATIC", 47, 64);
   private static final IndexedColors[] _values = new IndexedColors[65];
   public final short index;
   // $FF: synthetic field
   private static final IndexedColors[] $VALUES = new IndexedColors[]{BLACK, WHITE, RED, BRIGHT_GREEN, BLUE, YELLOW, PINK, TURQUOISE, DARK_RED, GREEN, DARK_BLUE, DARK_YELLOW, VIOLET, TEAL, GREY_25_PERCENT, GREY_50_PERCENT, CORNFLOWER_BLUE, MAROON, LEMON_CHIFFON, ORCHID, CORAL, ROYAL_BLUE, LIGHT_CORNFLOWER_BLUE, SKY_BLUE, LIGHT_TURQUOISE, LIGHT_GREEN, LIGHT_YELLOW, PALE_BLUE, ROSE, LAVENDER, TAN, LIGHT_BLUE, AQUA, LIME, GOLD, LIGHT_ORANGE, ORANGE, BLUE_GREY, GREY_40_PERCENT, DARK_TEAL, SEA_GREEN, DARK_GREEN, OLIVE_GREEN, BROWN, PLUM, INDIGO, GREY_80_PERCENT, AUTOMATIC};


   private IndexedColors(String var1, int var2, int idx) {
      this.index = (short)idx;
   }

   public short getIndex() {
      return this.index;
   }

   public static IndexedColors fromInt(int index) {
      if(index >= 0 && index < _values.length) {
         IndexedColors color = _values[index];
         if(color == null) {
            throw new IllegalArgumentException("Illegal IndexedColor index: " + index);
         } else {
            return color;
         }
      } else {
         throw new IllegalArgumentException("Illegal IndexedColor index: " + index);
      }
   }

   static {
      IndexedColors[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         IndexedColors color = arr$[i$];
         _values[color.index] = color;
      }

   }
}
