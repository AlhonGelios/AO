package org.apache.poi.sl.usermodel;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public enum PresetColor {

   ActiveBorder("ActiveBorder", 0, Integer.valueOf(-4934476), 1, "activeBorder"),
   ActiveCaption("ActiveCaption", 1, Integer.valueOf(-6703919), 2, "activeCaption"),
   ActiveCaptionText("ActiveCaptionText", 2, Integer.valueOf(-16777216), 3, "captionText"),
   AppWorkspace("AppWorkspace", 3, Integer.valueOf(-5526613), 4, "appWorkspace"),
   Control("Control", 4, Integer.valueOf(-986896), 5, "btnFace"),
   ControlDark("ControlDark", 5, Integer.valueOf(-9868951), 6, "btnShadow"),
   ControlDarkDark("ControlDarkDark", 6, Integer.valueOf(-16777216), 7, "3dDkShadow"),
   ControlLight("ControlLight", 7, Integer.valueOf(-1842205), 8, "btnHighlight"),
   ControlLightLight("ControlLightLight", 8, Integer.valueOf(-1842205), 9, "3dLight"),
   ControlText("ControlText", 9, Integer.valueOf(-16777216), 10, "btnText"),
   Desktop("Desktop", 10, Integer.valueOf(-16777216), 11, "background"),
   GrayText("GrayText", 11, Integer.valueOf(-9605779), 12, "grayText"),
   Highlight("Highlight", 12, Integer.valueOf(-13395457), 13, "highlight"),
   HighlightText("HighlightText", 13, Integer.valueOf(-1), 14, "highlightText"),
   HotTrack("HotTrack", 14, Integer.valueOf(-16750900), 15, "hotLight"),
   InactiveBorder("InactiveBorder", 15, Integer.valueOf(-722948), 16, "inactiveBorder"),
   InactiveCaption("InactiveCaption", 16, Integer.valueOf(-4207141), 17, "inactiveCaption"),
   InactiveCaptionText("InactiveCaptionText", 17, Integer.valueOf(-16777216), 18, "inactiveCaptionText"),
   Info("Info", 18, Integer.valueOf(-31), 19, "infoBk"),
   InfoText("InfoText", 19, Integer.valueOf(-16777216), 20, "infoText"),
   Menu("Menu", 20, Integer.valueOf(-986896), 21, "menu"),
   MenuText("MenuText", 21, Integer.valueOf(-16777216), 22, "menuText"),
   ScrollBar("ScrollBar", 22, Integer.valueOf(-3618616), 23, "scrollBar"),
   Window("Window", 23, Integer.valueOf(-1), 24, "window"),
   WindowFrame("WindowFrame", 24, Integer.valueOf(-10197916), 25, "windowFrame"),
   WindowText("WindowText", 25, Integer.valueOf(-16777216), 26, "windowText"),
   Transparent("Transparent", 26, Integer.valueOf(16777215), 27, (String)null),
   AliceBlue("AliceBlue", 27, Integer.valueOf(-984833), 28, "aliceBlue"),
   AntiqueWhite("AntiqueWhite", 28, Integer.valueOf(-332841), 29, "antiqueWhite"),
   Aqua("Aqua", 29, Integer.valueOf(-16711681), 30, "aqua"),
   Aquamarine("Aquamarine", 30, Integer.valueOf(-8388652), 31, "aquamarine"),
   Azure("Azure", 31, Integer.valueOf(-983041), 32, "azure"),
   Beige("Beige", 32, Integer.valueOf(-657956), 33, "beige"),
   Bisque("Bisque", 33, Integer.valueOf(-6972), 34, "bisque"),
   Black("Black", 34, Integer.valueOf(-16777216), 35, "black"),
   BlanchedAlmond("BlanchedAlmond", 35, Integer.valueOf(-5171), 36, "blanchedAlmond"),
   Blue("Blue", 36, Integer.valueOf(-16776961), 37, "blue"),
   BlueViolet("BlueViolet", 37, Integer.valueOf(-7722014), 38, "blueViolet"),
   Brown("Brown", 38, Integer.valueOf(-5952982), 39, "brown"),
   BurlyWood("BurlyWood", 39, Integer.valueOf(-2180985), 40, "burlyWood"),
   CadetBlue("CadetBlue", 40, Integer.valueOf(-10510688), 41, "cadetBlue"),
   Chartreuse("Chartreuse", 41, Integer.valueOf(-8388864), 42, "chartreuse"),
   Chocolate("Chocolate", 42, Integer.valueOf(-2987746), 43, "chocolate"),
   Coral("Coral", 43, Integer.valueOf(-32944), 44, "coral"),
   CornflowerBlue("CornflowerBlue", 44, Integer.valueOf(-10185235), 45, "cornflowerBlue"),
   Cornsilk("Cornsilk", 45, Integer.valueOf(-1828), 46, "cornsilk"),
   Crimson("Crimson", 46, Integer.valueOf(-2354116), 47, "crimson"),
   Cyan("Cyan", 47, Integer.valueOf(-16711681), 48, "cyan"),
   DarkBlue("DarkBlue", 48, Integer.valueOf(-16777077), 49, "dkBlue"),
   DarkCyan("DarkCyan", 49, Integer.valueOf(-16741493), 50, "dkCyan"),
   DarkGoldenrod("DarkGoldenrod", 50, Integer.valueOf(-4684277), 51, "dkGoldenrod"),
   DarkGray("DarkGray", 51, Integer.valueOf(-5658199), 52, "dkGray"),
   DarkGreen("DarkGreen", 52, Integer.valueOf(-16751616), 53, "dkGreen"),
   DarkKhaki("DarkKhaki", 53, Integer.valueOf(-4343957), 54, "dkKhaki"),
   DarkMagenta("DarkMagenta", 54, Integer.valueOf(-7667573), 55, "dkMagenta"),
   DarkOliveGreen("DarkOliveGreen", 55, Integer.valueOf(-11179217), 56, "dkOliveGreen"),
   DarkOrange("DarkOrange", 56, Integer.valueOf(-29696), 57, "dkOrange"),
   DarkOrchid("DarkOrchid", 57, Integer.valueOf(-6737204), 58, "dkOrchid"),
   DarkRed("DarkRed", 58, Integer.valueOf(-7667712), 59, "dkRed"),
   DarkSalmon("DarkSalmon", 59, Integer.valueOf(-1468806), 60, "dkSalmon"),
   DarkSeaGreen("DarkSeaGreen", 60, Integer.valueOf(-7357301), 61, "dkSeaGreen"),
   DarkSlateBlue("DarkSlateBlue", 61, Integer.valueOf(-12042869), 62, "dkSlateBlue"),
   DarkSlateGray("DarkSlateGray", 62, Integer.valueOf(-13676721), 63, "dkSlateGray"),
   DarkTurquoise("DarkTurquoise", 63, Integer.valueOf(-16724271), 64, "dkTurquoise"),
   DarkViolet("DarkViolet", 64, Integer.valueOf(-7077677), 65, "dkViolet"),
   DeepPink("DeepPink", 65, Integer.valueOf(-60269), 66, "deepPink"),
   DeepSkyBlue("DeepSkyBlue", 66, Integer.valueOf(-16728065), 67, "deepSkyBlue"),
   DimGray("DimGray", 67, Integer.valueOf(-9868951), 68, "dimGray"),
   DodgerBlue("DodgerBlue", 68, Integer.valueOf(-14774017), 69, "dodgerBlue"),
   Firebrick("Firebrick", 69, Integer.valueOf(-5103070), 70, "firebrick"),
   FloralWhite("FloralWhite", 70, Integer.valueOf(-1296), 71, "floralWhite"),
   ForestGreen("ForestGreen", 71, Integer.valueOf(-14513374), 72, "forestGreen"),
   Fuchsia("Fuchsia", 72, Integer.valueOf(-65281), 73, "fuchsia"),
   Gainsboro("Gainsboro", 73, Integer.valueOf(-2302756), 74, "gainsboro"),
   GhostWhite("GhostWhite", 74, Integer.valueOf(-460545), 75, "ghostWhite"),
   Gold("Gold", 75, Integer.valueOf(-10496), 76, "gold"),
   Goldenrod("Goldenrod", 76, Integer.valueOf(-2448096), 77, "goldenrod"),
   Gray("Gray", 77, Integer.valueOf(-8355712), 78, "gray"),
   Green("Green", 78, Integer.valueOf(-16744448), 79, "green"),
   GreenYellow("GreenYellow", 79, Integer.valueOf(-5374161), 80, "greenYellow"),
   Honeydew("Honeydew", 80, Integer.valueOf(-983056), 81, "honeydew"),
   HotPink("HotPink", 81, Integer.valueOf(-38476), 82, "hotPink"),
   IndianRed("IndianRed", 82, Integer.valueOf(-3318692), 83, "indianRed"),
   Indigo("Indigo", 83, Integer.valueOf(-11861886), 84, "indigo"),
   Ivory("Ivory", 84, Integer.valueOf(-16), 85, "ivory"),
   Khaki("Khaki", 85, Integer.valueOf(-989556), 86, "khaki"),
   Lavender("Lavender", 86, Integer.valueOf(-1644806), 87, "lavender"),
   LavenderBlush("LavenderBlush", 87, Integer.valueOf(-3851), 88, "lavenderBlush"),
   LawnGreen("LawnGreen", 88, Integer.valueOf(-8586240), 89, "lawnGreen"),
   LemonChiffon("LemonChiffon", 89, Integer.valueOf(-1331), 90, "lemonChiffon"),
   LightBlue("LightBlue", 90, Integer.valueOf(-5383962), 91, "ltBlue"),
   LightCoral("LightCoral", 91, Integer.valueOf(-1015680), 92, "ltCoral"),
   LightCyan("LightCyan", 92, Integer.valueOf(-2031617), 93, "ltCyan"),
   LightGoldenrodYellow("LightGoldenrodYellow", 93, Integer.valueOf(-329096), 94, "ltGoldenrodYellow"),
   LightGray("LightGray", 94, Integer.valueOf(-2894893), 95, "ltGray"),
   LightGreen("LightGreen", 95, Integer.valueOf(-7278960), 96, "ltGreen"),
   LightPink("LightPink", 96, Integer.valueOf(-18751), 97, "ltPink"),
   LightSalmon("LightSalmon", 97, Integer.valueOf(-24454), 98, "ltSalmon"),
   LightSeaGreen("LightSeaGreen", 98, Integer.valueOf(-14634326), 99, "ltSeaGreen"),
   LightSkyBlue("LightSkyBlue", 99, Integer.valueOf(-7876870), 100, "ltSkyBlue"),
   LightSlateGray("LightSlateGray", 100, Integer.valueOf(-8943463), 101, "ltSlateGray"),
   LightSteelBlue("LightSteelBlue", 101, Integer.valueOf(-5192482), 102, "ltSteelBlue"),
   LightYellow("LightYellow", 102, Integer.valueOf(-32), 103, "ltYellow"),
   Lime("Lime", 103, Integer.valueOf(-16711936), 104, "lime"),
   LimeGreen("LimeGreen", 104, Integer.valueOf(-13447886), 105, "limeGreen"),
   Linen("Linen", 105, Integer.valueOf(-331546), 106, "linen"),
   Magenta("Magenta", 106, Integer.valueOf(-65281), 107, "magenta"),
   Maroon("Maroon", 107, Integer.valueOf(-8388608), 108, "maroon"),
   MediumAquamarine("MediumAquamarine", 108, Integer.valueOf(-10039894), 109, "medAquamarine"),
   MediumBlue("MediumBlue", 109, Integer.valueOf(-16777011), 110, "medBlue"),
   MediumOrchid("MediumOrchid", 110, Integer.valueOf(-4565549), 111, "medOrchid"),
   MediumPurple("MediumPurple", 111, Integer.valueOf(-7114533), 112, "medPurple"),
   MediumSeaGreen("MediumSeaGreen", 112, Integer.valueOf(-12799119), 113, "medSeaGreen"),
   MediumSlateBlue("MediumSlateBlue", 113, Integer.valueOf(-8689426), 114, "medSlateBlue"),
   MediumSpringGreen("MediumSpringGreen", 114, Integer.valueOf(-16713062), 115, "medSpringGreen"),
   MediumTurquoise("MediumTurquoise", 115, Integer.valueOf(-12004916), 116, "medTurquoise"),
   MediumVioletRed("MediumVioletRed", 116, Integer.valueOf(-3730043), 117, "medVioletRed"),
   MidnightBlue("MidnightBlue", 117, Integer.valueOf(-15132304), 118, "midnightBlue"),
   MintCream("MintCream", 118, Integer.valueOf(-655366), 119, "mintCream"),
   MistyRose("MistyRose", 119, Integer.valueOf(-6943), 120, "mistyRose"),
   Moccasin("Moccasin", 120, Integer.valueOf(-6987), 121, "moccasin"),
   NavajoWhite("NavajoWhite", 121, Integer.valueOf(-8531), 122, "navajoWhite"),
   Navy("Navy", 122, Integer.valueOf(-16777088), 123, "navy"),
   OldLace("OldLace", 123, Integer.valueOf(-133658), 124, "oldLace"),
   Olive("Olive", 124, Integer.valueOf(-8355840), 125, "olive"),
   OliveDrab("OliveDrab", 125, Integer.valueOf(-9728477), 126, "oliveDrab"),
   Orange("Orange", 126, Integer.valueOf(-23296), 127, "orange"),
   OrangeRed("OrangeRed", 127, Integer.valueOf(-47872), 128, "orangeRed"),
   Orchid("Orchid", 128, Integer.valueOf(-2461482), 129, "orchid"),
   PaleGoldenrod("PaleGoldenrod", 129, Integer.valueOf(-1120086), 130, "paleGoldenrod"),
   PaleGreen("PaleGreen", 130, Integer.valueOf(-6751336), 131, "paleGreen"),
   PaleTurquoise("PaleTurquoise", 131, Integer.valueOf(-5247250), 132, "paleTurquoise"),
   PaleVioletRed("PaleVioletRed", 132, Integer.valueOf(-2396013), 133, "paleVioletRed"),
   PapayaWhip("PapayaWhip", 133, Integer.valueOf(-4139), 134, "papayaWhip"),
   PeachPuff("PeachPuff", 134, Integer.valueOf(-9543), 135, "peachPuff"),
   Peru("Peru", 135, Integer.valueOf(-3308225), 136, "peru"),
   Pink("Pink", 136, Integer.valueOf(-16181), 137, "pink"),
   Plum("Plum", 137, Integer.valueOf(-2252579), 138, "plum"),
   PowderBlue("PowderBlue", 138, Integer.valueOf(-5185306), 139, "powderBlue"),
   Purple("Purple", 139, Integer.valueOf(-8388480), 140, "purple"),
   Red("Red", 140, Integer.valueOf(-65536), 141, "red"),
   RosyBrown("RosyBrown", 141, Integer.valueOf(-4419697), 142, "rosyBrown"),
   RoyalBlue("RoyalBlue", 142, Integer.valueOf(-12490271), 143, "royalBlue"),
   SaddleBrown("SaddleBrown", 143, Integer.valueOf(-7650029), 144, "saddleBrown"),
   Salmon("Salmon", 144, Integer.valueOf(-360334), 145, "salmon"),
   SandyBrown("SandyBrown", 145, Integer.valueOf(-744352), 146, "sandyBrown"),
   SeaGreen("SeaGreen", 146, Integer.valueOf(-13726889), 147, "seaGreen"),
   SeaShell("SeaShell", 147, Integer.valueOf(-2578), 148, "seaShell"),
   Sienna("Sienna", 148, Integer.valueOf(-6270419), 149, "sienna"),
   Silver("Silver", 149, Integer.valueOf(-4144960), 150, "silver"),
   SkyBlue("SkyBlue", 150, Integer.valueOf(-7876885), 151, "skyBlue"),
   SlateBlue("SlateBlue", 151, Integer.valueOf(-9807155), 152, "slateBlue"),
   SlateGray("SlateGray", 152, Integer.valueOf(-9404272), 153, "slateGray"),
   Snow("Snow", 153, Integer.valueOf(-1286), 154, "snow"),
   SpringGreen("SpringGreen", 154, Integer.valueOf(-16711809), 155, "springGreen"),
   SteelBlue("SteelBlue", 155, Integer.valueOf(-12156236), 156, "steelBlue"),
   Tan("Tan", 156, Integer.valueOf(-2968436), 157, "tan"),
   Teal("Teal", 157, Integer.valueOf(-16744320), 158, "teal"),
   Thistle("Thistle", 158, Integer.valueOf(-2572328), 159, "thistle"),
   Tomato("Tomato", 159, Integer.valueOf(-40121), 160, "tomato"),
   Turquoise("Turquoise", 160, Integer.valueOf(-12525360), 161, "turquoise"),
   Violet("Violet", 161, Integer.valueOf(-1146130), 162, "violet"),
   Wheat("Wheat", 162, Integer.valueOf(-663885), 163, "wheat"),
   White("White", 163, Integer.valueOf(-1), 164, "white"),
   WhiteSmoke("WhiteSmoke", 164, Integer.valueOf(-657931), 165, "whiteSmoke"),
   Yellow("Yellow", 165, Integer.valueOf(-256), 166, "yellow"),
   YellowGreen("YellowGreen", 166, Integer.valueOf(-6632142), 167, "yellowGreen"),
   ButtonFace("ButtonFace", 167, Integer.valueOf(-986896), 168, (String)null),
   ButtonHighlight("ButtonHighlight", 168, Integer.valueOf(-1), 169, (String)null),
   ButtonShadow("ButtonShadow", 169, Integer.valueOf(-6250336), 170, (String)null),
   GradientActiveCaption("GradientActiveCaption", 170, Integer.valueOf(-4599318), 171, "gradientActiveCaption"),
   GradientInactiveCaption("GradientInactiveCaption", 171, Integer.valueOf(-2628366), 172, "gradientInactiveCaption"),
   MenuBar("MenuBar", 172, Integer.valueOf(-986896), 173, "menuBar"),
   MenuHighlight("MenuHighlight", 173, Integer.valueOf(-13395457), 174, "menuHighlight");
   public final Color color;
   public final int nativeId;
   public final String ooxmlId;
   private static final Map lookupOoxmlId = new HashMap();
   // $FF: synthetic field
   private static final PresetColor[] $VALUES = new PresetColor[]{ActiveBorder, ActiveCaption, ActiveCaptionText, AppWorkspace, Control, ControlDark, ControlDarkDark, ControlLight, ControlLightLight, ControlText, Desktop, GrayText, Highlight, HighlightText, HotTrack, InactiveBorder, InactiveCaption, InactiveCaptionText, Info, InfoText, Menu, MenuText, ScrollBar, Window, WindowFrame, WindowText, Transparent, AliceBlue, AntiqueWhite, Aqua, Aquamarine, Azure, Beige, Bisque, Black, BlanchedAlmond, Blue, BlueViolet, Brown, BurlyWood, CadetBlue, Chartreuse, Chocolate, Coral, CornflowerBlue, Cornsilk, Crimson, Cyan, DarkBlue, DarkCyan, DarkGoldenrod, DarkGray, DarkGreen, DarkKhaki, DarkMagenta, DarkOliveGreen, DarkOrange, DarkOrchid, DarkRed, DarkSalmon, DarkSeaGreen, DarkSlateBlue, DarkSlateGray, DarkTurquoise, DarkViolet, DeepPink, DeepSkyBlue, DimGray, DodgerBlue, Firebrick, FloralWhite, ForestGreen, Fuchsia, Gainsboro, GhostWhite, Gold, Goldenrod, Gray, Green, GreenYellow, Honeydew, HotPink, IndianRed, Indigo, Ivory, Khaki, Lavender, LavenderBlush, LawnGreen, LemonChiffon, LightBlue, LightCoral, LightCyan, LightGoldenrodYellow, LightGray, LightGreen, LightPink, LightSalmon, LightSeaGreen, LightSkyBlue, LightSlateGray, LightSteelBlue, LightYellow, Lime, LimeGreen, Linen, Magenta, Maroon, MediumAquamarine, MediumBlue, MediumOrchid, MediumPurple, MediumSeaGreen, MediumSlateBlue, MediumSpringGreen, MediumTurquoise, MediumVioletRed, MidnightBlue, MintCream, MistyRose, Moccasin, NavajoWhite, Navy, OldLace, Olive, OliveDrab, Orange, OrangeRed, Orchid, PaleGoldenrod, PaleGreen, PaleTurquoise, PaleVioletRed, PapayaWhip, PeachPuff, Peru, Pink, Plum, PowderBlue, Purple, Red, RosyBrown, RoyalBlue, SaddleBrown, Salmon, SandyBrown, SeaGreen, SeaShell, Sienna, Silver, SkyBlue, SlateBlue, SlateGray, Snow, SpringGreen, SteelBlue, Tan, Teal, Thistle, Tomato, Turquoise, Violet, Wheat, White, WhiteSmoke, Yellow, YellowGreen, ButtonFace, ButtonHighlight, ButtonShadow, GradientActiveCaption, GradientInactiveCaption, MenuBar, MenuHighlight};


   private PresetColor(String var1, int var2, Integer rgb, int nativeId, String ooxmlId) {
      this.color = rgb == null?null:new Color(rgb.intValue(), true);
      this.nativeId = nativeId;
      this.ooxmlId = ooxmlId;
   }

   public static PresetColor valueOfOoxmlId(String ooxmlId) {
      return (PresetColor)lookupOoxmlId.get(ooxmlId);
   }

   public static PresetColor valueOfNativeId(int nativeId) {
      PresetColor[] vals = values();
      return 0 < nativeId && nativeId <= vals.length?vals[nativeId - 1]:null;
   }

   static {
      PresetColor[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         PresetColor pc = arr$[i$];
         if(pc.ooxmlId != null) {
            lookupOoxmlId.put(pc.ooxmlId, pc);
         }
      }

   }
}
