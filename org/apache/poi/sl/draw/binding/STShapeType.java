package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "ST_ShapeType",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
@XmlEnum
public enum STShapeType {

   @XmlEnumValue("line")
   LINE("LINE", 0, "line"),
   @XmlEnumValue("lineInv")
   LINE_INV("LINE_INV", 1, "lineInv"),
   @XmlEnumValue("triangle")
   TRIANGLE("TRIANGLE", 2, "triangle"),
   @XmlEnumValue("rtTriangle")
   RT_TRIANGLE("RT_TRIANGLE", 3, "rtTriangle"),
   @XmlEnumValue("rect")
   RECT("RECT", 4, "rect"),
   @XmlEnumValue("diamond")
   DIAMOND("DIAMOND", 5, "diamond"),
   @XmlEnumValue("parallelogram")
   PARALLELOGRAM("PARALLELOGRAM", 6, "parallelogram"),
   @XmlEnumValue("trapezoid")
   TRAPEZOID("TRAPEZOID", 7, "trapezoid"),
   @XmlEnumValue("nonIsoscelesTrapezoid")
   NON_ISOSCELES_TRAPEZOID("NON_ISOSCELES_TRAPEZOID", 8, "nonIsoscelesTrapezoid"),
   @XmlEnumValue("pentagon")
   PENTAGON("PENTAGON", 9, "pentagon"),
   @XmlEnumValue("hexagon")
   HEXAGON("HEXAGON", 10, "hexagon"),
   @XmlEnumValue("heptagon")
   HEPTAGON("HEPTAGON", 11, "heptagon"),
   @XmlEnumValue("octagon")
   OCTAGON("OCTAGON", 12, "octagon"),
   @XmlEnumValue("decagon")
   DECAGON("DECAGON", 13, "decagon"),
   @XmlEnumValue("dodecagon")
   DODECAGON("DODECAGON", 14, "dodecagon"),
   @XmlEnumValue("star4")
   STAR_4("STAR_4", 15, "star4"),
   @XmlEnumValue("star5")
   STAR_5("STAR_5", 16, "star5"),
   @XmlEnumValue("star6")
   STAR_6("STAR_6", 17, "star6"),
   @XmlEnumValue("star7")
   STAR_7("STAR_7", 18, "star7"),
   @XmlEnumValue("star8")
   STAR_8("STAR_8", 19, "star8"),
   @XmlEnumValue("star10")
   STAR_10("STAR_10", 20, "star10"),
   @XmlEnumValue("star12")
   STAR_12("STAR_12", 21, "star12"),
   @XmlEnumValue("star16")
   STAR_16("STAR_16", 22, "star16"),
   @XmlEnumValue("star24")
   STAR_24("STAR_24", 23, "star24"),
   @XmlEnumValue("star32")
   STAR_32("STAR_32", 24, "star32"),
   @XmlEnumValue("roundRect")
   ROUND_RECT("ROUND_RECT", 25, "roundRect"),
   @XmlEnumValue("round1Rect")
   ROUND_1_RECT("ROUND_1_RECT", 26, "round1Rect"),
   @XmlEnumValue("round2SameRect")
   ROUND_2_SAME_RECT("ROUND_2_SAME_RECT", 27, "round2SameRect"),
   @XmlEnumValue("round2DiagRect")
   ROUND_2_DIAG_RECT("ROUND_2_DIAG_RECT", 28, "round2DiagRect"),
   @XmlEnumValue("snipRoundRect")
   SNIP_ROUND_RECT("SNIP_ROUND_RECT", 29, "snipRoundRect"),
   @XmlEnumValue("snip1Rect")
   SNIP_1_RECT("SNIP_1_RECT", 30, "snip1Rect"),
   @XmlEnumValue("snip2SameRect")
   SNIP_2_SAME_RECT("SNIP_2_SAME_RECT", 31, "snip2SameRect"),
   @XmlEnumValue("snip2DiagRect")
   SNIP_2_DIAG_RECT("SNIP_2_DIAG_RECT", 32, "snip2DiagRect"),
   @XmlEnumValue("plaque")
   PLAQUE("PLAQUE", 33, "plaque"),
   @XmlEnumValue("ellipse")
   ELLIPSE("ELLIPSE", 34, "ellipse"),
   @XmlEnumValue("teardrop")
   TEARDROP("TEARDROP", 35, "teardrop"),
   @XmlEnumValue("homePlate")
   HOME_PLATE("HOME_PLATE", 36, "homePlate"),
   @XmlEnumValue("chevron")
   CHEVRON("CHEVRON", 37, "chevron"),
   @XmlEnumValue("pieWedge")
   PIE_WEDGE("PIE_WEDGE", 38, "pieWedge"),
   @XmlEnumValue("pie")
   PIE("PIE", 39, "pie"),
   @XmlEnumValue("blockArc")
   BLOCK_ARC("BLOCK_ARC", 40, "blockArc"),
   @XmlEnumValue("donut")
   DONUT("DONUT", 41, "donut"),
   @XmlEnumValue("noSmoking")
   NO_SMOKING("NO_SMOKING", 42, "noSmoking"),
   @XmlEnumValue("rightArrow")
   RIGHT_ARROW("RIGHT_ARROW", 43, "rightArrow"),
   @XmlEnumValue("leftArrow")
   LEFT_ARROW("LEFT_ARROW", 44, "leftArrow"),
   @XmlEnumValue("upArrow")
   UP_ARROW("UP_ARROW", 45, "upArrow"),
   @XmlEnumValue("downArrow")
   DOWN_ARROW("DOWN_ARROW", 46, "downArrow"),
   @XmlEnumValue("stripedRightArrow")
   STRIPED_RIGHT_ARROW("STRIPED_RIGHT_ARROW", 47, "stripedRightArrow"),
   @XmlEnumValue("notchedRightArrow")
   NOTCHED_RIGHT_ARROW("NOTCHED_RIGHT_ARROW", 48, "notchedRightArrow"),
   @XmlEnumValue("bentUpArrow")
   BENT_UP_ARROW("BENT_UP_ARROW", 49, "bentUpArrow"),
   @XmlEnumValue("leftRightArrow")
   LEFT_RIGHT_ARROW("LEFT_RIGHT_ARROW", 50, "leftRightArrow"),
   @XmlEnumValue("upDownArrow")
   UP_DOWN_ARROW("UP_DOWN_ARROW", 51, "upDownArrow"),
   @XmlEnumValue("leftUpArrow")
   LEFT_UP_ARROW("LEFT_UP_ARROW", 52, "leftUpArrow"),
   @XmlEnumValue("leftRightUpArrow")
   LEFT_RIGHT_UP_ARROW("LEFT_RIGHT_UP_ARROW", 53, "leftRightUpArrow"),
   @XmlEnumValue("quadArrow")
   QUAD_ARROW("QUAD_ARROW", 54, "quadArrow"),
   @XmlEnumValue("leftArrowCallout")
   LEFT_ARROW_CALLOUT("LEFT_ARROW_CALLOUT", 55, "leftArrowCallout"),
   @XmlEnumValue("rightArrowCallout")
   RIGHT_ARROW_CALLOUT("RIGHT_ARROW_CALLOUT", 56, "rightArrowCallout"),
   @XmlEnumValue("upArrowCallout")
   UP_ARROW_CALLOUT("UP_ARROW_CALLOUT", 57, "upArrowCallout"),
   @XmlEnumValue("downArrowCallout")
   DOWN_ARROW_CALLOUT("DOWN_ARROW_CALLOUT", 58, "downArrowCallout"),
   @XmlEnumValue("leftRightArrowCallout")
   LEFT_RIGHT_ARROW_CALLOUT("LEFT_RIGHT_ARROW_CALLOUT", 59, "leftRightArrowCallout"),
   @XmlEnumValue("upDownArrowCallout")
   UP_DOWN_ARROW_CALLOUT("UP_DOWN_ARROW_CALLOUT", 60, "upDownArrowCallout"),
   @XmlEnumValue("quadArrowCallout")
   QUAD_ARROW_CALLOUT("QUAD_ARROW_CALLOUT", 61, "quadArrowCallout"),
   @XmlEnumValue("bentArrow")
   BENT_ARROW("BENT_ARROW", 62, "bentArrow"),
   @XmlEnumValue("uturnArrow")
   UTURN_ARROW("UTURN_ARROW", 63, "uturnArrow"),
   @XmlEnumValue("circularArrow")
   CIRCULAR_ARROW("CIRCULAR_ARROW", 64, "circularArrow"),
   @XmlEnumValue("leftCircularArrow")
   LEFT_CIRCULAR_ARROW("LEFT_CIRCULAR_ARROW", 65, "leftCircularArrow"),
   @XmlEnumValue("leftRightCircularArrow")
   LEFT_RIGHT_CIRCULAR_ARROW("LEFT_RIGHT_CIRCULAR_ARROW", 66, "leftRightCircularArrow"),
   @XmlEnumValue("curvedRightArrow")
   CURVED_RIGHT_ARROW("CURVED_RIGHT_ARROW", 67, "curvedRightArrow"),
   @XmlEnumValue("curvedLeftArrow")
   CURVED_LEFT_ARROW("CURVED_LEFT_ARROW", 68, "curvedLeftArrow"),
   @XmlEnumValue("curvedUpArrow")
   CURVED_UP_ARROW("CURVED_UP_ARROW", 69, "curvedUpArrow"),
   @XmlEnumValue("curvedDownArrow")
   CURVED_DOWN_ARROW("CURVED_DOWN_ARROW", 70, "curvedDownArrow"),
   @XmlEnumValue("swooshArrow")
   SWOOSH_ARROW("SWOOSH_ARROW", 71, "swooshArrow"),
   @XmlEnumValue("cube")
   CUBE("CUBE", 72, "cube"),
   @XmlEnumValue("can")
   CAN("CAN", 73, "can"),
   @XmlEnumValue("lightningBolt")
   LIGHTNING_BOLT("LIGHTNING_BOLT", 74, "lightningBolt"),
   @XmlEnumValue("heart")
   HEART("HEART", 75, "heart"),
   @XmlEnumValue("sun")
   SUN("SUN", 76, "sun"),
   @XmlEnumValue("moon")
   MOON("MOON", 77, "moon"),
   @XmlEnumValue("smileyFace")
   SMILEY_FACE("SMILEY_FACE", 78, "smileyFace"),
   @XmlEnumValue("irregularSeal1")
   IRREGULAR_SEAL_1("IRREGULAR_SEAL_1", 79, "irregularSeal1"),
   @XmlEnumValue("irregularSeal2")
   IRREGULAR_SEAL_2("IRREGULAR_SEAL_2", 80, "irregularSeal2"),
   @XmlEnumValue("foldedCorner")
   FOLDED_CORNER("FOLDED_CORNER", 81, "foldedCorner"),
   @XmlEnumValue("bevel")
   BEVEL("BEVEL", 82, "bevel"),
   @XmlEnumValue("frame")
   FRAME("FRAME", 83, "frame"),
   @XmlEnumValue("halfFrame")
   HALF_FRAME("HALF_FRAME", 84, "halfFrame"),
   @XmlEnumValue("corner")
   CORNER("CORNER", 85, "corner"),
   @XmlEnumValue("diagStripe")
   DIAG_STRIPE("DIAG_STRIPE", 86, "diagStripe"),
   @XmlEnumValue("chord")
   CHORD("CHORD", 87, "chord"),
   @XmlEnumValue("arc")
   ARC("ARC", 88, "arc"),
   @XmlEnumValue("leftBracket")
   LEFT_BRACKET("LEFT_BRACKET", 89, "leftBracket"),
   @XmlEnumValue("rightBracket")
   RIGHT_BRACKET("RIGHT_BRACKET", 90, "rightBracket"),
   @XmlEnumValue("leftBrace")
   LEFT_BRACE("LEFT_BRACE", 91, "leftBrace"),
   @XmlEnumValue("rightBrace")
   RIGHT_BRACE("RIGHT_BRACE", 92, "rightBrace"),
   @XmlEnumValue("bracketPair")
   BRACKET_PAIR("BRACKET_PAIR", 93, "bracketPair"),
   @XmlEnumValue("bracePair")
   BRACE_PAIR("BRACE_PAIR", 94, "bracePair"),
   @XmlEnumValue("straightConnector1")
   STRAIGHT_CONNECTOR_1("STRAIGHT_CONNECTOR_1", 95, "straightConnector1"),
   @XmlEnumValue("bentConnector2")
   BENT_CONNECTOR_2("BENT_CONNECTOR_2", 96, "bentConnector2"),
   @XmlEnumValue("bentConnector3")
   BENT_CONNECTOR_3("BENT_CONNECTOR_3", 97, "bentConnector3"),
   @XmlEnumValue("bentConnector4")
   BENT_CONNECTOR_4("BENT_CONNECTOR_4", 98, "bentConnector4"),
   @XmlEnumValue("bentConnector5")
   BENT_CONNECTOR_5("BENT_CONNECTOR_5", 99, "bentConnector5"),
   @XmlEnumValue("curvedConnector2")
   CURVED_CONNECTOR_2("CURVED_CONNECTOR_2", 100, "curvedConnector2"),
   @XmlEnumValue("curvedConnector3")
   CURVED_CONNECTOR_3("CURVED_CONNECTOR_3", 101, "curvedConnector3"),
   @XmlEnumValue("curvedConnector4")
   CURVED_CONNECTOR_4("CURVED_CONNECTOR_4", 102, "curvedConnector4"),
   @XmlEnumValue("curvedConnector5")
   CURVED_CONNECTOR_5("CURVED_CONNECTOR_5", 103, "curvedConnector5"),
   @XmlEnumValue("callout1")
   CALLOUT_1("CALLOUT_1", 104, "callout1"),
   @XmlEnumValue("callout2")
   CALLOUT_2("CALLOUT_2", 105, "callout2"),
   @XmlEnumValue("callout3")
   CALLOUT_3("CALLOUT_3", 106, "callout3"),
   @XmlEnumValue("accentCallout1")
   ACCENT_CALLOUT_1("ACCENT_CALLOUT_1", 107, "accentCallout1"),
   @XmlEnumValue("accentCallout2")
   ACCENT_CALLOUT_2("ACCENT_CALLOUT_2", 108, "accentCallout2"),
   @XmlEnumValue("accentCallout3")
   ACCENT_CALLOUT_3("ACCENT_CALLOUT_3", 109, "accentCallout3"),
   @XmlEnumValue("borderCallout1")
   BORDER_CALLOUT_1("BORDER_CALLOUT_1", 110, "borderCallout1"),
   @XmlEnumValue("borderCallout2")
   BORDER_CALLOUT_2("BORDER_CALLOUT_2", 111, "borderCallout2"),
   @XmlEnumValue("borderCallout3")
   BORDER_CALLOUT_3("BORDER_CALLOUT_3", 112, "borderCallout3"),
   @XmlEnumValue("accentBorderCallout1")
   ACCENT_BORDER_CALLOUT_1("ACCENT_BORDER_CALLOUT_1", 113, "accentBorderCallout1"),
   @XmlEnumValue("accentBorderCallout2")
   ACCENT_BORDER_CALLOUT_2("ACCENT_BORDER_CALLOUT_2", 114, "accentBorderCallout2"),
   @XmlEnumValue("accentBorderCallout3")
   ACCENT_BORDER_CALLOUT_3("ACCENT_BORDER_CALLOUT_3", 115, "accentBorderCallout3"),
   @XmlEnumValue("wedgeRectCallout")
   WEDGE_RECT_CALLOUT("WEDGE_RECT_CALLOUT", 116, "wedgeRectCallout"),
   @XmlEnumValue("wedgeRoundRectCallout")
   WEDGE_ROUND_RECT_CALLOUT("WEDGE_ROUND_RECT_CALLOUT", 117, "wedgeRoundRectCallout"),
   @XmlEnumValue("wedgeEllipseCallout")
   WEDGE_ELLIPSE_CALLOUT("WEDGE_ELLIPSE_CALLOUT", 118, "wedgeEllipseCallout"),
   @XmlEnumValue("cloudCallout")
   CLOUD_CALLOUT("CLOUD_CALLOUT", 119, "cloudCallout"),
   @XmlEnumValue("cloud")
   CLOUD("CLOUD", 120, "cloud"),
   @XmlEnumValue("ribbon")
   RIBBON("RIBBON", 121, "ribbon"),
   @XmlEnumValue("ribbon2")
   RIBBON_2("RIBBON_2", 122, "ribbon2"),
   @XmlEnumValue("ellipseRibbon")
   ELLIPSE_RIBBON("ELLIPSE_RIBBON", 123, "ellipseRibbon"),
   @XmlEnumValue("ellipseRibbon2")
   ELLIPSE_RIBBON_2("ELLIPSE_RIBBON_2", 124, "ellipseRibbon2"),
   @XmlEnumValue("leftRightRibbon")
   LEFT_RIGHT_RIBBON("LEFT_RIGHT_RIBBON", 125, "leftRightRibbon"),
   @XmlEnumValue("verticalScroll")
   VERTICAL_SCROLL("VERTICAL_SCROLL", 126, "verticalScroll"),
   @XmlEnumValue("horizontalScroll")
   HORIZONTAL_SCROLL("HORIZONTAL_SCROLL", 127, "horizontalScroll"),
   @XmlEnumValue("wave")
   WAVE("WAVE", 128, "wave"),
   @XmlEnumValue("doubleWave")
   DOUBLE_WAVE("DOUBLE_WAVE", 129, "doubleWave"),
   @XmlEnumValue("plus")
   PLUS("PLUS", 130, "plus"),
   @XmlEnumValue("flowChartProcess")
   FLOW_CHART_PROCESS("FLOW_CHART_PROCESS", 131, "flowChartProcess"),
   @XmlEnumValue("flowChartDecision")
   FLOW_CHART_DECISION("FLOW_CHART_DECISION", 132, "flowChartDecision"),
   @XmlEnumValue("flowChartInputOutput")
   FLOW_CHART_INPUT_OUTPUT("FLOW_CHART_INPUT_OUTPUT", 133, "flowChartInputOutput"),
   @XmlEnumValue("flowChartPredefinedProcess")
   FLOW_CHART_PREDEFINED_PROCESS("FLOW_CHART_PREDEFINED_PROCESS", 134, "flowChartPredefinedProcess"),
   @XmlEnumValue("flowChartInternalStorage")
   FLOW_CHART_INTERNAL_STORAGE("FLOW_CHART_INTERNAL_STORAGE", 135, "flowChartInternalStorage"),
   @XmlEnumValue("flowChartDocument")
   FLOW_CHART_DOCUMENT("FLOW_CHART_DOCUMENT", 136, "flowChartDocument"),
   @XmlEnumValue("flowChartMultidocument")
   FLOW_CHART_MULTIDOCUMENT("FLOW_CHART_MULTIDOCUMENT", 137, "flowChartMultidocument"),
   @XmlEnumValue("flowChartTerminator")
   FLOW_CHART_TERMINATOR("FLOW_CHART_TERMINATOR", 138, "flowChartTerminator"),
   @XmlEnumValue("flowChartPreparation")
   FLOW_CHART_PREPARATION("FLOW_CHART_PREPARATION", 139, "flowChartPreparation"),
   @XmlEnumValue("flowChartManualInput")
   FLOW_CHART_MANUAL_INPUT("FLOW_CHART_MANUAL_INPUT", 140, "flowChartManualInput"),
   @XmlEnumValue("flowChartManualOperation")
   FLOW_CHART_MANUAL_OPERATION("FLOW_CHART_MANUAL_OPERATION", 141, "flowChartManualOperation"),
   @XmlEnumValue("flowChartConnector")
   FLOW_CHART_CONNECTOR("FLOW_CHART_CONNECTOR", 142, "flowChartConnector"),
   @XmlEnumValue("flowChartPunchedCard")
   FLOW_CHART_PUNCHED_CARD("FLOW_CHART_PUNCHED_CARD", 143, "flowChartPunchedCard"),
   @XmlEnumValue("flowChartPunchedTape")
   FLOW_CHART_PUNCHED_TAPE("FLOW_CHART_PUNCHED_TAPE", 144, "flowChartPunchedTape"),
   @XmlEnumValue("flowChartSummingJunction")
   FLOW_CHART_SUMMING_JUNCTION("FLOW_CHART_SUMMING_JUNCTION", 145, "flowChartSummingJunction"),
   @XmlEnumValue("flowChartOr")
   FLOW_CHART_OR("FLOW_CHART_OR", 146, "flowChartOr"),
   @XmlEnumValue("flowChartCollate")
   FLOW_CHART_COLLATE("FLOW_CHART_COLLATE", 147, "flowChartCollate"),
   @XmlEnumValue("flowChartSort")
   FLOW_CHART_SORT("FLOW_CHART_SORT", 148, "flowChartSort"),
   @XmlEnumValue("flowChartExtract")
   FLOW_CHART_EXTRACT("FLOW_CHART_EXTRACT", 149, "flowChartExtract"),
   @XmlEnumValue("flowChartMerge")
   FLOW_CHART_MERGE("FLOW_CHART_MERGE", 150, "flowChartMerge"),
   @XmlEnumValue("flowChartOfflineStorage")
   FLOW_CHART_OFFLINE_STORAGE("FLOW_CHART_OFFLINE_STORAGE", 151, "flowChartOfflineStorage"),
   @XmlEnumValue("flowChartOnlineStorage")
   FLOW_CHART_ONLINE_STORAGE("FLOW_CHART_ONLINE_STORAGE", 152, "flowChartOnlineStorage"),
   @XmlEnumValue("flowChartMagneticTape")
   FLOW_CHART_MAGNETIC_TAPE("FLOW_CHART_MAGNETIC_TAPE", 153, "flowChartMagneticTape"),
   @XmlEnumValue("flowChartMagneticDisk")
   FLOW_CHART_MAGNETIC_DISK("FLOW_CHART_MAGNETIC_DISK", 154, "flowChartMagneticDisk"),
   @XmlEnumValue("flowChartMagneticDrum")
   FLOW_CHART_MAGNETIC_DRUM("FLOW_CHART_MAGNETIC_DRUM", 155, "flowChartMagneticDrum"),
   @XmlEnumValue("flowChartDisplay")
   FLOW_CHART_DISPLAY("FLOW_CHART_DISPLAY", 156, "flowChartDisplay"),
   @XmlEnumValue("flowChartDelay")
   FLOW_CHART_DELAY("FLOW_CHART_DELAY", 157, "flowChartDelay"),
   @XmlEnumValue("flowChartAlternateProcess")
   FLOW_CHART_ALTERNATE_PROCESS("FLOW_CHART_ALTERNATE_PROCESS", 158, "flowChartAlternateProcess"),
   @XmlEnumValue("flowChartOffpageConnector")
   FLOW_CHART_OFFPAGE_CONNECTOR("FLOW_CHART_OFFPAGE_CONNECTOR", 159, "flowChartOffpageConnector"),
   @XmlEnumValue("actionButtonBlank")
   ACTION_BUTTON_BLANK("ACTION_BUTTON_BLANK", 160, "actionButtonBlank"),
   @XmlEnumValue("actionButtonHome")
   ACTION_BUTTON_HOME("ACTION_BUTTON_HOME", 161, "actionButtonHome"),
   @XmlEnumValue("actionButtonHelp")
   ACTION_BUTTON_HELP("ACTION_BUTTON_HELP", 162, "actionButtonHelp"),
   @XmlEnumValue("actionButtonInformation")
   ACTION_BUTTON_INFORMATION("ACTION_BUTTON_INFORMATION", 163, "actionButtonInformation"),
   @XmlEnumValue("actionButtonForwardNext")
   ACTION_BUTTON_FORWARD_NEXT("ACTION_BUTTON_FORWARD_NEXT", 164, "actionButtonForwardNext"),
   @XmlEnumValue("actionButtonBackPrevious")
   ACTION_BUTTON_BACK_PREVIOUS("ACTION_BUTTON_BACK_PREVIOUS", 165, "actionButtonBackPrevious"),
   @XmlEnumValue("actionButtonEnd")
   ACTION_BUTTON_END("ACTION_BUTTON_END", 166, "actionButtonEnd"),
   @XmlEnumValue("actionButtonBeginning")
   ACTION_BUTTON_BEGINNING("ACTION_BUTTON_BEGINNING", 167, "actionButtonBeginning"),
   @XmlEnumValue("actionButtonReturn")
   ACTION_BUTTON_RETURN("ACTION_BUTTON_RETURN", 168, "actionButtonReturn"),
   @XmlEnumValue("actionButtonDocument")
   ACTION_BUTTON_DOCUMENT("ACTION_BUTTON_DOCUMENT", 169, "actionButtonDocument"),
   @XmlEnumValue("actionButtonSound")
   ACTION_BUTTON_SOUND("ACTION_BUTTON_SOUND", 170, "actionButtonSound"),
   @XmlEnumValue("actionButtonMovie")
   ACTION_BUTTON_MOVIE("ACTION_BUTTON_MOVIE", 171, "actionButtonMovie"),
   @XmlEnumValue("gear6")
   GEAR_6("GEAR_6", 172, "gear6"),
   @XmlEnumValue("gear9")
   GEAR_9("GEAR_9", 173, "gear9"),
   @XmlEnumValue("funnel")
   FUNNEL("FUNNEL", 174, "funnel"),
   @XmlEnumValue("mathPlus")
   MATH_PLUS("MATH_PLUS", 175, "mathPlus"),
   @XmlEnumValue("mathMinus")
   MATH_MINUS("MATH_MINUS", 176, "mathMinus"),
   @XmlEnumValue("mathMultiply")
   MATH_MULTIPLY("MATH_MULTIPLY", 177, "mathMultiply"),
   @XmlEnumValue("mathDivide")
   MATH_DIVIDE("MATH_DIVIDE", 178, "mathDivide"),
   @XmlEnumValue("mathEqual")
   MATH_EQUAL("MATH_EQUAL", 179, "mathEqual"),
   @XmlEnumValue("mathNotEqual")
   MATH_NOT_EQUAL("MATH_NOT_EQUAL", 180, "mathNotEqual"),
   @XmlEnumValue("cornerTabs")
   CORNER_TABS("CORNER_TABS", 181, "cornerTabs"),
   @XmlEnumValue("squareTabs")
   SQUARE_TABS("SQUARE_TABS", 182, "squareTabs"),
   @XmlEnumValue("plaqueTabs")
   PLAQUE_TABS("PLAQUE_TABS", 183, "plaqueTabs"),
   @XmlEnumValue("chartX")
   CHART_X("CHART_X", 184, "chartX"),
   @XmlEnumValue("chartStar")
   CHART_STAR("CHART_STAR", 185, "chartStar"),
   @XmlEnumValue("chartPlus")
   CHART_PLUS("CHART_PLUS", 186, "chartPlus");
   private final String value;
   // $FF: synthetic field
   private static final STShapeType[] $VALUES = new STShapeType[]{LINE, LINE_INV, TRIANGLE, RT_TRIANGLE, RECT, DIAMOND, PARALLELOGRAM, TRAPEZOID, NON_ISOSCELES_TRAPEZOID, PENTAGON, HEXAGON, HEPTAGON, OCTAGON, DECAGON, DODECAGON, STAR_4, STAR_5, STAR_6, STAR_7, STAR_8, STAR_10, STAR_12, STAR_16, STAR_24, STAR_32, ROUND_RECT, ROUND_1_RECT, ROUND_2_SAME_RECT, ROUND_2_DIAG_RECT, SNIP_ROUND_RECT, SNIP_1_RECT, SNIP_2_SAME_RECT, SNIP_2_DIAG_RECT, PLAQUE, ELLIPSE, TEARDROP, HOME_PLATE, CHEVRON, PIE_WEDGE, PIE, BLOCK_ARC, DONUT, NO_SMOKING, RIGHT_ARROW, LEFT_ARROW, UP_ARROW, DOWN_ARROW, STRIPED_RIGHT_ARROW, NOTCHED_RIGHT_ARROW, BENT_UP_ARROW, LEFT_RIGHT_ARROW, UP_DOWN_ARROW, LEFT_UP_ARROW, LEFT_RIGHT_UP_ARROW, QUAD_ARROW, LEFT_ARROW_CALLOUT, RIGHT_ARROW_CALLOUT, UP_ARROW_CALLOUT, DOWN_ARROW_CALLOUT, LEFT_RIGHT_ARROW_CALLOUT, UP_DOWN_ARROW_CALLOUT, QUAD_ARROW_CALLOUT, BENT_ARROW, UTURN_ARROW, CIRCULAR_ARROW, LEFT_CIRCULAR_ARROW, LEFT_RIGHT_CIRCULAR_ARROW, CURVED_RIGHT_ARROW, CURVED_LEFT_ARROW, CURVED_UP_ARROW, CURVED_DOWN_ARROW, SWOOSH_ARROW, CUBE, CAN, LIGHTNING_BOLT, HEART, SUN, MOON, SMILEY_FACE, IRREGULAR_SEAL_1, IRREGULAR_SEAL_2, FOLDED_CORNER, BEVEL, FRAME, HALF_FRAME, CORNER, DIAG_STRIPE, CHORD, ARC, LEFT_BRACKET, RIGHT_BRACKET, LEFT_BRACE, RIGHT_BRACE, BRACKET_PAIR, BRACE_PAIR, STRAIGHT_CONNECTOR_1, BENT_CONNECTOR_2, BENT_CONNECTOR_3, BENT_CONNECTOR_4, BENT_CONNECTOR_5, CURVED_CONNECTOR_2, CURVED_CONNECTOR_3, CURVED_CONNECTOR_4, CURVED_CONNECTOR_5, CALLOUT_1, CALLOUT_2, CALLOUT_3, ACCENT_CALLOUT_1, ACCENT_CALLOUT_2, ACCENT_CALLOUT_3, BORDER_CALLOUT_1, BORDER_CALLOUT_2, BORDER_CALLOUT_3, ACCENT_BORDER_CALLOUT_1, ACCENT_BORDER_CALLOUT_2, ACCENT_BORDER_CALLOUT_3, WEDGE_RECT_CALLOUT, WEDGE_ROUND_RECT_CALLOUT, WEDGE_ELLIPSE_CALLOUT, CLOUD_CALLOUT, CLOUD, RIBBON, RIBBON_2, ELLIPSE_RIBBON, ELLIPSE_RIBBON_2, LEFT_RIGHT_RIBBON, VERTICAL_SCROLL, HORIZONTAL_SCROLL, WAVE, DOUBLE_WAVE, PLUS, FLOW_CHART_PROCESS, FLOW_CHART_DECISION, FLOW_CHART_INPUT_OUTPUT, FLOW_CHART_PREDEFINED_PROCESS, FLOW_CHART_INTERNAL_STORAGE, FLOW_CHART_DOCUMENT, FLOW_CHART_MULTIDOCUMENT, FLOW_CHART_TERMINATOR, FLOW_CHART_PREPARATION, FLOW_CHART_MANUAL_INPUT, FLOW_CHART_MANUAL_OPERATION, FLOW_CHART_CONNECTOR, FLOW_CHART_PUNCHED_CARD, FLOW_CHART_PUNCHED_TAPE, FLOW_CHART_SUMMING_JUNCTION, FLOW_CHART_OR, FLOW_CHART_COLLATE, FLOW_CHART_SORT, FLOW_CHART_EXTRACT, FLOW_CHART_MERGE, FLOW_CHART_OFFLINE_STORAGE, FLOW_CHART_ONLINE_STORAGE, FLOW_CHART_MAGNETIC_TAPE, FLOW_CHART_MAGNETIC_DISK, FLOW_CHART_MAGNETIC_DRUM, FLOW_CHART_DISPLAY, FLOW_CHART_DELAY, FLOW_CHART_ALTERNATE_PROCESS, FLOW_CHART_OFFPAGE_CONNECTOR, ACTION_BUTTON_BLANK, ACTION_BUTTON_HOME, ACTION_BUTTON_HELP, ACTION_BUTTON_INFORMATION, ACTION_BUTTON_FORWARD_NEXT, ACTION_BUTTON_BACK_PREVIOUS, ACTION_BUTTON_END, ACTION_BUTTON_BEGINNING, ACTION_BUTTON_RETURN, ACTION_BUTTON_DOCUMENT, ACTION_BUTTON_SOUND, ACTION_BUTTON_MOVIE, GEAR_6, GEAR_9, FUNNEL, MATH_PLUS, MATH_MINUS, MATH_MULTIPLY, MATH_DIVIDE, MATH_EQUAL, MATH_NOT_EQUAL, CORNER_TABS, SQUARE_TABS, PLAQUE_TABS, CHART_X, CHART_STAR, CHART_PLUS};


   private STShapeType(String var1, int var2, String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static STShapeType fromValue(String v) {
      STShapeType[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         STShapeType c = arr$[i$];
         if(c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }

}
