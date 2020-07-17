package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "ST_PresetColorVal",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
@XmlEnum
public enum STPresetColorVal {

   @XmlEnumValue("aliceBlue")
   ALICE_BLUE("ALICE_BLUE", 0, "aliceBlue"),
   @XmlEnumValue("antiqueWhite")
   ANTIQUE_WHITE("ANTIQUE_WHITE", 1, "antiqueWhite"),
   @XmlEnumValue("aqua")
   AQUA("AQUA", 2, "aqua"),
   @XmlEnumValue("aquamarine")
   AQUAMARINE("AQUAMARINE", 3, "aquamarine"),
   @XmlEnumValue("azure")
   AZURE("AZURE", 4, "azure"),
   @XmlEnumValue("beige")
   BEIGE("BEIGE", 5, "beige"),
   @XmlEnumValue("bisque")
   BISQUE("BISQUE", 6, "bisque"),
   @XmlEnumValue("black")
   BLACK("BLACK", 7, "black"),
   @XmlEnumValue("blanchedAlmond")
   BLANCHED_ALMOND("BLANCHED_ALMOND", 8, "blanchedAlmond"),
   @XmlEnumValue("blue")
   BLUE("BLUE", 9, "blue"),
   @XmlEnumValue("blueViolet")
   BLUE_VIOLET("BLUE_VIOLET", 10, "blueViolet"),
   @XmlEnumValue("brown")
   BROWN("BROWN", 11, "brown"),
   @XmlEnumValue("burlyWood")
   BURLY_WOOD("BURLY_WOOD", 12, "burlyWood"),
   @XmlEnumValue("cadetBlue")
   CADET_BLUE("CADET_BLUE", 13, "cadetBlue"),
   @XmlEnumValue("chartreuse")
   CHARTREUSE("CHARTREUSE", 14, "chartreuse"),
   @XmlEnumValue("chocolate")
   CHOCOLATE("CHOCOLATE", 15, "chocolate"),
   @XmlEnumValue("coral")
   CORAL("CORAL", 16, "coral"),
   @XmlEnumValue("cornflowerBlue")
   CORNFLOWER_BLUE("CORNFLOWER_BLUE", 17, "cornflowerBlue"),
   @XmlEnumValue("cornsilk")
   CORNSILK("CORNSILK", 18, "cornsilk"),
   @XmlEnumValue("crimson")
   CRIMSON("CRIMSON", 19, "crimson"),
   @XmlEnumValue("cyan")
   CYAN("CYAN", 20, "cyan"),
   @XmlEnumValue("dkBlue")
   DK_BLUE("DK_BLUE", 21, "dkBlue"),
   @XmlEnumValue("dkCyan")
   DK_CYAN("DK_CYAN", 22, "dkCyan"),
   @XmlEnumValue("dkGoldenrod")
   DK_GOLDENROD("DK_GOLDENROD", 23, "dkGoldenrod"),
   @XmlEnumValue("dkGray")
   DK_GRAY("DK_GRAY", 24, "dkGray"),
   @XmlEnumValue("dkGreen")
   DK_GREEN("DK_GREEN", 25, "dkGreen"),
   @XmlEnumValue("dkKhaki")
   DK_KHAKI("DK_KHAKI", 26, "dkKhaki"),
   @XmlEnumValue("dkMagenta")
   DK_MAGENTA("DK_MAGENTA", 27, "dkMagenta"),
   @XmlEnumValue("dkOliveGreen")
   DK_OLIVE_GREEN("DK_OLIVE_GREEN", 28, "dkOliveGreen"),
   @XmlEnumValue("dkOrange")
   DK_ORANGE("DK_ORANGE", 29, "dkOrange"),
   @XmlEnumValue("dkOrchid")
   DK_ORCHID("DK_ORCHID", 30, "dkOrchid"),
   @XmlEnumValue("dkRed")
   DK_RED("DK_RED", 31, "dkRed"),
   @XmlEnumValue("dkSalmon")
   DK_SALMON("DK_SALMON", 32, "dkSalmon"),
   @XmlEnumValue("dkSeaGreen")
   DK_SEA_GREEN("DK_SEA_GREEN", 33, "dkSeaGreen"),
   @XmlEnumValue("dkSlateBlue")
   DK_SLATE_BLUE("DK_SLATE_BLUE", 34, "dkSlateBlue"),
   @XmlEnumValue("dkSlateGray")
   DK_SLATE_GRAY("DK_SLATE_GRAY", 35, "dkSlateGray"),
   @XmlEnumValue("dkTurquoise")
   DK_TURQUOISE("DK_TURQUOISE", 36, "dkTurquoise"),
   @XmlEnumValue("dkViolet")
   DK_VIOLET("DK_VIOLET", 37, "dkViolet"),
   @XmlEnumValue("deepPink")
   DEEP_PINK("DEEP_PINK", 38, "deepPink"),
   @XmlEnumValue("deepSkyBlue")
   DEEP_SKY_BLUE("DEEP_SKY_BLUE", 39, "deepSkyBlue"),
   @XmlEnumValue("dimGray")
   DIM_GRAY("DIM_GRAY", 40, "dimGray"),
   @XmlEnumValue("dodgerBlue")
   DODGER_BLUE("DODGER_BLUE", 41, "dodgerBlue"),
   @XmlEnumValue("firebrick")
   FIREBRICK("FIREBRICK", 42, "firebrick"),
   @XmlEnumValue("floralWhite")
   FLORAL_WHITE("FLORAL_WHITE", 43, "floralWhite"),
   @XmlEnumValue("forestGreen")
   FOREST_GREEN("FOREST_GREEN", 44, "forestGreen"),
   @XmlEnumValue("fuchsia")
   FUCHSIA("FUCHSIA", 45, "fuchsia"),
   @XmlEnumValue("gainsboro")
   GAINSBORO("GAINSBORO", 46, "gainsboro"),
   @XmlEnumValue("ghostWhite")
   GHOST_WHITE("GHOST_WHITE", 47, "ghostWhite"),
   @XmlEnumValue("gold")
   GOLD("GOLD", 48, "gold"),
   @XmlEnumValue("goldenrod")
   GOLDENROD("GOLDENROD", 49, "goldenrod"),
   @XmlEnumValue("gray")
   GRAY("GRAY", 50, "gray"),
   @XmlEnumValue("green")
   GREEN("GREEN", 51, "green"),
   @XmlEnumValue("greenYellow")
   GREEN_YELLOW("GREEN_YELLOW", 52, "greenYellow"),
   @XmlEnumValue("honeydew")
   HONEYDEW("HONEYDEW", 53, "honeydew"),
   @XmlEnumValue("hotPink")
   HOT_PINK("HOT_PINK", 54, "hotPink"),
   @XmlEnumValue("indianRed")
   INDIAN_RED("INDIAN_RED", 55, "indianRed"),
   @XmlEnumValue("indigo")
   INDIGO("INDIGO", 56, "indigo"),
   @XmlEnumValue("ivory")
   IVORY("IVORY", 57, "ivory"),
   @XmlEnumValue("khaki")
   KHAKI("KHAKI", 58, "khaki"),
   @XmlEnumValue("lavender")
   LAVENDER("LAVENDER", 59, "lavender"),
   @XmlEnumValue("lavenderBlush")
   LAVENDER_BLUSH("LAVENDER_BLUSH", 60, "lavenderBlush"),
   @XmlEnumValue("lawnGreen")
   LAWN_GREEN("LAWN_GREEN", 61, "lawnGreen"),
   @XmlEnumValue("lemonChiffon")
   LEMON_CHIFFON("LEMON_CHIFFON", 62, "lemonChiffon"),
   @XmlEnumValue("ltBlue")
   LT_BLUE("LT_BLUE", 63, "ltBlue"),
   @XmlEnumValue("ltCoral")
   LT_CORAL("LT_CORAL", 64, "ltCoral"),
   @XmlEnumValue("ltCyan")
   LT_CYAN("LT_CYAN", 65, "ltCyan"),
   @XmlEnumValue("ltGoldenrodYellow")
   LT_GOLDENROD_YELLOW("LT_GOLDENROD_YELLOW", 66, "ltGoldenrodYellow"),
   @XmlEnumValue("ltGray")
   LT_GRAY("LT_GRAY", 67, "ltGray"),
   @XmlEnumValue("ltGreen")
   LT_GREEN("LT_GREEN", 68, "ltGreen"),
   @XmlEnumValue("ltPink")
   LT_PINK("LT_PINK", 69, "ltPink"),
   @XmlEnumValue("ltSalmon")
   LT_SALMON("LT_SALMON", 70, "ltSalmon"),
   @XmlEnumValue("ltSeaGreen")
   LT_SEA_GREEN("LT_SEA_GREEN", 71, "ltSeaGreen"),
   @XmlEnumValue("ltSkyBlue")
   LT_SKY_BLUE("LT_SKY_BLUE", 72, "ltSkyBlue"),
   @XmlEnumValue("ltSlateGray")
   LT_SLATE_GRAY("LT_SLATE_GRAY", 73, "ltSlateGray"),
   @XmlEnumValue("ltSteelBlue")
   LT_STEEL_BLUE("LT_STEEL_BLUE", 74, "ltSteelBlue"),
   @XmlEnumValue("ltYellow")
   LT_YELLOW("LT_YELLOW", 75, "ltYellow"),
   @XmlEnumValue("lime")
   LIME("LIME", 76, "lime"),
   @XmlEnumValue("limeGreen")
   LIME_GREEN("LIME_GREEN", 77, "limeGreen"),
   @XmlEnumValue("linen")
   LINEN("LINEN", 78, "linen"),
   @XmlEnumValue("magenta")
   MAGENTA("MAGENTA", 79, "magenta"),
   @XmlEnumValue("maroon")
   MAROON("MAROON", 80, "maroon"),
   @XmlEnumValue("medAquamarine")
   MED_AQUAMARINE("MED_AQUAMARINE", 81, "medAquamarine"),
   @XmlEnumValue("medBlue")
   MED_BLUE("MED_BLUE", 82, "medBlue"),
   @XmlEnumValue("medOrchid")
   MED_ORCHID("MED_ORCHID", 83, "medOrchid"),
   @XmlEnumValue("medPurple")
   MED_PURPLE("MED_PURPLE", 84, "medPurple"),
   @XmlEnumValue("medSeaGreen")
   MED_SEA_GREEN("MED_SEA_GREEN", 85, "medSeaGreen"),
   @XmlEnumValue("medSlateBlue")
   MED_SLATE_BLUE("MED_SLATE_BLUE", 86, "medSlateBlue"),
   @XmlEnumValue("medSpringGreen")
   MED_SPRING_GREEN("MED_SPRING_GREEN", 87, "medSpringGreen"),
   @XmlEnumValue("medTurquoise")
   MED_TURQUOISE("MED_TURQUOISE", 88, "medTurquoise"),
   @XmlEnumValue("medVioletRed")
   MED_VIOLET_RED("MED_VIOLET_RED", 89, "medVioletRed"),
   @XmlEnumValue("midnightBlue")
   MIDNIGHT_BLUE("MIDNIGHT_BLUE", 90, "midnightBlue"),
   @XmlEnumValue("mintCream")
   MINT_CREAM("MINT_CREAM", 91, "mintCream"),
   @XmlEnumValue("mistyRose")
   MISTY_ROSE("MISTY_ROSE", 92, "mistyRose"),
   @XmlEnumValue("moccasin")
   MOCCASIN("MOCCASIN", 93, "moccasin"),
   @XmlEnumValue("navajoWhite")
   NAVAJO_WHITE("NAVAJO_WHITE", 94, "navajoWhite"),
   @XmlEnumValue("navy")
   NAVY("NAVY", 95, "navy"),
   @XmlEnumValue("oldLace")
   OLD_LACE("OLD_LACE", 96, "oldLace"),
   @XmlEnumValue("olive")
   OLIVE("OLIVE", 97, "olive"),
   @XmlEnumValue("oliveDrab")
   OLIVE_DRAB("OLIVE_DRAB", 98, "oliveDrab"),
   @XmlEnumValue("orange")
   ORANGE("ORANGE", 99, "orange"),
   @XmlEnumValue("orangeRed")
   ORANGE_RED("ORANGE_RED", 100, "orangeRed"),
   @XmlEnumValue("orchid")
   ORCHID("ORCHID", 101, "orchid"),
   @XmlEnumValue("paleGoldenrod")
   PALE_GOLDENROD("PALE_GOLDENROD", 102, "paleGoldenrod"),
   @XmlEnumValue("paleGreen")
   PALE_GREEN("PALE_GREEN", 103, "paleGreen"),
   @XmlEnumValue("paleTurquoise")
   PALE_TURQUOISE("PALE_TURQUOISE", 104, "paleTurquoise"),
   @XmlEnumValue("paleVioletRed")
   PALE_VIOLET_RED("PALE_VIOLET_RED", 105, "paleVioletRed"),
   @XmlEnumValue("papayaWhip")
   PAPAYA_WHIP("PAPAYA_WHIP", 106, "papayaWhip"),
   @XmlEnumValue("peachPuff")
   PEACH_PUFF("PEACH_PUFF", 107, "peachPuff"),
   @XmlEnumValue("peru")
   PERU("PERU", 108, "peru"),
   @XmlEnumValue("pink")
   PINK("PINK", 109, "pink"),
   @XmlEnumValue("plum")
   PLUM("PLUM", 110, "plum"),
   @XmlEnumValue("powderBlue")
   POWDER_BLUE("POWDER_BLUE", 111, "powderBlue"),
   @XmlEnumValue("purple")
   PURPLE("PURPLE", 112, "purple"),
   @XmlEnumValue("red")
   RED("RED", 113, "red"),
   @XmlEnumValue("rosyBrown")
   ROSY_BROWN("ROSY_BROWN", 114, "rosyBrown"),
   @XmlEnumValue("royalBlue")
   ROYAL_BLUE("ROYAL_BLUE", 115, "royalBlue"),
   @XmlEnumValue("saddleBrown")
   SADDLE_BROWN("SADDLE_BROWN", 116, "saddleBrown"),
   @XmlEnumValue("salmon")
   SALMON("SALMON", 117, "salmon"),
   @XmlEnumValue("sandyBrown")
   SANDY_BROWN("SANDY_BROWN", 118, "sandyBrown"),
   @XmlEnumValue("seaGreen")
   SEA_GREEN("SEA_GREEN", 119, "seaGreen"),
   @XmlEnumValue("seaShell")
   SEA_SHELL("SEA_SHELL", 120, "seaShell"),
   @XmlEnumValue("sienna")
   SIENNA("SIENNA", 121, "sienna"),
   @XmlEnumValue("silver")
   SILVER("SILVER", 122, "silver"),
   @XmlEnumValue("skyBlue")
   SKY_BLUE("SKY_BLUE", 123, "skyBlue"),
   @XmlEnumValue("slateBlue")
   SLATE_BLUE("SLATE_BLUE", 124, "slateBlue"),
   @XmlEnumValue("slateGray")
   SLATE_GRAY("SLATE_GRAY", 125, "slateGray"),
   @XmlEnumValue("snow")
   SNOW("SNOW", 126, "snow"),
   @XmlEnumValue("springGreen")
   SPRING_GREEN("SPRING_GREEN", 127, "springGreen"),
   @XmlEnumValue("steelBlue")
   STEEL_BLUE("STEEL_BLUE", 128, "steelBlue"),
   @XmlEnumValue("tan")
   TAN("TAN", 129, "tan"),
   @XmlEnumValue("teal")
   TEAL("TEAL", 130, "teal"),
   @XmlEnumValue("thistle")
   THISTLE("THISTLE", 131, "thistle"),
   @XmlEnumValue("tomato")
   TOMATO("TOMATO", 132, "tomato"),
   @XmlEnumValue("turquoise")
   TURQUOISE("TURQUOISE", 133, "turquoise"),
   @XmlEnumValue("violet")
   VIOLET("VIOLET", 134, "violet"),
   @XmlEnumValue("wheat")
   WHEAT("WHEAT", 135, "wheat"),
   @XmlEnumValue("white")
   WHITE("WHITE", 136, "white"),
   @XmlEnumValue("whiteSmoke")
   WHITE_SMOKE("WHITE_SMOKE", 137, "whiteSmoke"),
   @XmlEnumValue("yellow")
   YELLOW("YELLOW", 138, "yellow"),
   @XmlEnumValue("yellowGreen")
   YELLOW_GREEN("YELLOW_GREEN", 139, "yellowGreen");
   private final String value;
   // $FF: synthetic field
   private static final STPresetColorVal[] $VALUES = new STPresetColorVal[]{ALICE_BLUE, ANTIQUE_WHITE, AQUA, AQUAMARINE, AZURE, BEIGE, BISQUE, BLACK, BLANCHED_ALMOND, BLUE, BLUE_VIOLET, BROWN, BURLY_WOOD, CADET_BLUE, CHARTREUSE, CHOCOLATE, CORAL, CORNFLOWER_BLUE, CORNSILK, CRIMSON, CYAN, DK_BLUE, DK_CYAN, DK_GOLDENROD, DK_GRAY, DK_GREEN, DK_KHAKI, DK_MAGENTA, DK_OLIVE_GREEN, DK_ORANGE, DK_ORCHID, DK_RED, DK_SALMON, DK_SEA_GREEN, DK_SLATE_BLUE, DK_SLATE_GRAY, DK_TURQUOISE, DK_VIOLET, DEEP_PINK, DEEP_SKY_BLUE, DIM_GRAY, DODGER_BLUE, FIREBRICK, FLORAL_WHITE, FOREST_GREEN, FUCHSIA, GAINSBORO, GHOST_WHITE, GOLD, GOLDENROD, GRAY, GREEN, GREEN_YELLOW, HONEYDEW, HOT_PINK, INDIAN_RED, INDIGO, IVORY, KHAKI, LAVENDER, LAVENDER_BLUSH, LAWN_GREEN, LEMON_CHIFFON, LT_BLUE, LT_CORAL, LT_CYAN, LT_GOLDENROD_YELLOW, LT_GRAY, LT_GREEN, LT_PINK, LT_SALMON, LT_SEA_GREEN, LT_SKY_BLUE, LT_SLATE_GRAY, LT_STEEL_BLUE, LT_YELLOW, LIME, LIME_GREEN, LINEN, MAGENTA, MAROON, MED_AQUAMARINE, MED_BLUE, MED_ORCHID, MED_PURPLE, MED_SEA_GREEN, MED_SLATE_BLUE, MED_SPRING_GREEN, MED_TURQUOISE, MED_VIOLET_RED, MIDNIGHT_BLUE, MINT_CREAM, MISTY_ROSE, MOCCASIN, NAVAJO_WHITE, NAVY, OLD_LACE, OLIVE, OLIVE_DRAB, ORANGE, ORANGE_RED, ORCHID, PALE_GOLDENROD, PALE_GREEN, PALE_TURQUOISE, PALE_VIOLET_RED, PAPAYA_WHIP, PEACH_PUFF, PERU, PINK, PLUM, POWDER_BLUE, PURPLE, RED, ROSY_BROWN, ROYAL_BLUE, SADDLE_BROWN, SALMON, SANDY_BROWN, SEA_GREEN, SEA_SHELL, SIENNA, SILVER, SKY_BLUE, SLATE_BLUE, SLATE_GRAY, SNOW, SPRING_GREEN, STEEL_BLUE, TAN, TEAL, THISTLE, TOMATO, TURQUOISE, VIOLET, WHEAT, WHITE, WHITE_SMOKE, YELLOW, YELLOW_GREEN};


   private STPresetColorVal(String var1, int var2, String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static STPresetColorVal fromValue(String v) {
      STPresetColorVal[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         STPresetColorVal c = arr$[i$];
         if(c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }

}
