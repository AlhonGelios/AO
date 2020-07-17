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

public interface STShapeType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STShapeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stshapetype069ctype");
   STShapeType.Enum LINE = STShapeType.Enum.forString("line");
   STShapeType.Enum LINE_INV = STShapeType.Enum.forString("lineInv");
   STShapeType.Enum TRIANGLE = STShapeType.Enum.forString("triangle");
   STShapeType.Enum RT_TRIANGLE = STShapeType.Enum.forString("rtTriangle");
   STShapeType.Enum RECT = STShapeType.Enum.forString("rect");
   STShapeType.Enum DIAMOND = STShapeType.Enum.forString("diamond");
   STShapeType.Enum PARALLELOGRAM = STShapeType.Enum.forString("parallelogram");
   STShapeType.Enum TRAPEZOID = STShapeType.Enum.forString("trapezoid");
   STShapeType.Enum NON_ISOSCELES_TRAPEZOID = STShapeType.Enum.forString("nonIsoscelesTrapezoid");
   STShapeType.Enum PENTAGON = STShapeType.Enum.forString("pentagon");
   STShapeType.Enum HEXAGON = STShapeType.Enum.forString("hexagon");
   STShapeType.Enum HEPTAGON = STShapeType.Enum.forString("heptagon");
   STShapeType.Enum OCTAGON = STShapeType.Enum.forString("octagon");
   STShapeType.Enum DECAGON = STShapeType.Enum.forString("decagon");
   STShapeType.Enum DODECAGON = STShapeType.Enum.forString("dodecagon");
   STShapeType.Enum STAR_4 = STShapeType.Enum.forString("star4");
   STShapeType.Enum STAR_5 = STShapeType.Enum.forString("star5");
   STShapeType.Enum STAR_6 = STShapeType.Enum.forString("star6");
   STShapeType.Enum STAR_7 = STShapeType.Enum.forString("star7");
   STShapeType.Enum STAR_8 = STShapeType.Enum.forString("star8");
   STShapeType.Enum STAR_10 = STShapeType.Enum.forString("star10");
   STShapeType.Enum STAR_12 = STShapeType.Enum.forString("star12");
   STShapeType.Enum STAR_16 = STShapeType.Enum.forString("star16");
   STShapeType.Enum STAR_24 = STShapeType.Enum.forString("star24");
   STShapeType.Enum STAR_32 = STShapeType.Enum.forString("star32");
   STShapeType.Enum ROUND_RECT = STShapeType.Enum.forString("roundRect");
   STShapeType.Enum ROUND_1_RECT = STShapeType.Enum.forString("round1Rect");
   STShapeType.Enum ROUND_2_SAME_RECT = STShapeType.Enum.forString("round2SameRect");
   STShapeType.Enum ROUND_2_DIAG_RECT = STShapeType.Enum.forString("round2DiagRect");
   STShapeType.Enum SNIP_ROUND_RECT = STShapeType.Enum.forString("snipRoundRect");
   STShapeType.Enum SNIP_1_RECT = STShapeType.Enum.forString("snip1Rect");
   STShapeType.Enum SNIP_2_SAME_RECT = STShapeType.Enum.forString("snip2SameRect");
   STShapeType.Enum SNIP_2_DIAG_RECT = STShapeType.Enum.forString("snip2DiagRect");
   STShapeType.Enum PLAQUE = STShapeType.Enum.forString("plaque");
   STShapeType.Enum ELLIPSE = STShapeType.Enum.forString("ellipse");
   STShapeType.Enum TEARDROP = STShapeType.Enum.forString("teardrop");
   STShapeType.Enum HOME_PLATE = STShapeType.Enum.forString("homePlate");
   STShapeType.Enum CHEVRON = STShapeType.Enum.forString("chevron");
   STShapeType.Enum PIE_WEDGE = STShapeType.Enum.forString("pieWedge");
   STShapeType.Enum PIE = STShapeType.Enum.forString("pie");
   STShapeType.Enum BLOCK_ARC = STShapeType.Enum.forString("blockArc");
   STShapeType.Enum DONUT = STShapeType.Enum.forString("donut");
   STShapeType.Enum NO_SMOKING = STShapeType.Enum.forString("noSmoking");
   STShapeType.Enum RIGHT_ARROW = STShapeType.Enum.forString("rightArrow");
   STShapeType.Enum LEFT_ARROW = STShapeType.Enum.forString("leftArrow");
   STShapeType.Enum UP_ARROW = STShapeType.Enum.forString("upArrow");
   STShapeType.Enum DOWN_ARROW = STShapeType.Enum.forString("downArrow");
   STShapeType.Enum STRIPED_RIGHT_ARROW = STShapeType.Enum.forString("stripedRightArrow");
   STShapeType.Enum NOTCHED_RIGHT_ARROW = STShapeType.Enum.forString("notchedRightArrow");
   STShapeType.Enum BENT_UP_ARROW = STShapeType.Enum.forString("bentUpArrow");
   STShapeType.Enum LEFT_RIGHT_ARROW = STShapeType.Enum.forString("leftRightArrow");
   STShapeType.Enum UP_DOWN_ARROW = STShapeType.Enum.forString("upDownArrow");
   STShapeType.Enum LEFT_UP_ARROW = STShapeType.Enum.forString("leftUpArrow");
   STShapeType.Enum LEFT_RIGHT_UP_ARROW = STShapeType.Enum.forString("leftRightUpArrow");
   STShapeType.Enum QUAD_ARROW = STShapeType.Enum.forString("quadArrow");
   STShapeType.Enum LEFT_ARROW_CALLOUT = STShapeType.Enum.forString("leftArrowCallout");
   STShapeType.Enum RIGHT_ARROW_CALLOUT = STShapeType.Enum.forString("rightArrowCallout");
   STShapeType.Enum UP_ARROW_CALLOUT = STShapeType.Enum.forString("upArrowCallout");
   STShapeType.Enum DOWN_ARROW_CALLOUT = STShapeType.Enum.forString("downArrowCallout");
   STShapeType.Enum LEFT_RIGHT_ARROW_CALLOUT = STShapeType.Enum.forString("leftRightArrowCallout");
   STShapeType.Enum UP_DOWN_ARROW_CALLOUT = STShapeType.Enum.forString("upDownArrowCallout");
   STShapeType.Enum QUAD_ARROW_CALLOUT = STShapeType.Enum.forString("quadArrowCallout");
   STShapeType.Enum BENT_ARROW = STShapeType.Enum.forString("bentArrow");
   STShapeType.Enum UTURN_ARROW = STShapeType.Enum.forString("uturnArrow");
   STShapeType.Enum CIRCULAR_ARROW = STShapeType.Enum.forString("circularArrow");
   STShapeType.Enum LEFT_CIRCULAR_ARROW = STShapeType.Enum.forString("leftCircularArrow");
   STShapeType.Enum LEFT_RIGHT_CIRCULAR_ARROW = STShapeType.Enum.forString("leftRightCircularArrow");
   STShapeType.Enum CURVED_RIGHT_ARROW = STShapeType.Enum.forString("curvedRightArrow");
   STShapeType.Enum CURVED_LEFT_ARROW = STShapeType.Enum.forString("curvedLeftArrow");
   STShapeType.Enum CURVED_UP_ARROW = STShapeType.Enum.forString("curvedUpArrow");
   STShapeType.Enum CURVED_DOWN_ARROW = STShapeType.Enum.forString("curvedDownArrow");
   STShapeType.Enum SWOOSH_ARROW = STShapeType.Enum.forString("swooshArrow");
   STShapeType.Enum CUBE = STShapeType.Enum.forString("cube");
   STShapeType.Enum CAN = STShapeType.Enum.forString("can");
   STShapeType.Enum LIGHTNING_BOLT = STShapeType.Enum.forString("lightningBolt");
   STShapeType.Enum HEART = STShapeType.Enum.forString("heart");
   STShapeType.Enum SUN = STShapeType.Enum.forString("sun");
   STShapeType.Enum MOON = STShapeType.Enum.forString("moon");
   STShapeType.Enum SMILEY_FACE = STShapeType.Enum.forString("smileyFace");
   STShapeType.Enum IRREGULAR_SEAL_1 = STShapeType.Enum.forString("irregularSeal1");
   STShapeType.Enum IRREGULAR_SEAL_2 = STShapeType.Enum.forString("irregularSeal2");
   STShapeType.Enum FOLDED_CORNER = STShapeType.Enum.forString("foldedCorner");
   STShapeType.Enum BEVEL = STShapeType.Enum.forString("bevel");
   STShapeType.Enum FRAME = STShapeType.Enum.forString("frame");
   STShapeType.Enum HALF_FRAME = STShapeType.Enum.forString("halfFrame");
   STShapeType.Enum CORNER = STShapeType.Enum.forString("corner");
   STShapeType.Enum DIAG_STRIPE = STShapeType.Enum.forString("diagStripe");
   STShapeType.Enum CHORD = STShapeType.Enum.forString("chord");
   STShapeType.Enum ARC = STShapeType.Enum.forString("arc");
   STShapeType.Enum LEFT_BRACKET = STShapeType.Enum.forString("leftBracket");
   STShapeType.Enum RIGHT_BRACKET = STShapeType.Enum.forString("rightBracket");
   STShapeType.Enum LEFT_BRACE = STShapeType.Enum.forString("leftBrace");
   STShapeType.Enum RIGHT_BRACE = STShapeType.Enum.forString("rightBrace");
   STShapeType.Enum BRACKET_PAIR = STShapeType.Enum.forString("bracketPair");
   STShapeType.Enum BRACE_PAIR = STShapeType.Enum.forString("bracePair");
   STShapeType.Enum STRAIGHT_CONNECTOR_1 = STShapeType.Enum.forString("straightConnector1");
   STShapeType.Enum BENT_CONNECTOR_2 = STShapeType.Enum.forString("bentConnector2");
   STShapeType.Enum BENT_CONNECTOR_3 = STShapeType.Enum.forString("bentConnector3");
   STShapeType.Enum BENT_CONNECTOR_4 = STShapeType.Enum.forString("bentConnector4");
   STShapeType.Enum BENT_CONNECTOR_5 = STShapeType.Enum.forString("bentConnector5");
   STShapeType.Enum CURVED_CONNECTOR_2 = STShapeType.Enum.forString("curvedConnector2");
   STShapeType.Enum CURVED_CONNECTOR_3 = STShapeType.Enum.forString("curvedConnector3");
   STShapeType.Enum CURVED_CONNECTOR_4 = STShapeType.Enum.forString("curvedConnector4");
   STShapeType.Enum CURVED_CONNECTOR_5 = STShapeType.Enum.forString("curvedConnector5");
   STShapeType.Enum CALLOUT_1 = STShapeType.Enum.forString("callout1");
   STShapeType.Enum CALLOUT_2 = STShapeType.Enum.forString("callout2");
   STShapeType.Enum CALLOUT_3 = STShapeType.Enum.forString("callout3");
   STShapeType.Enum ACCENT_CALLOUT_1 = STShapeType.Enum.forString("accentCallout1");
   STShapeType.Enum ACCENT_CALLOUT_2 = STShapeType.Enum.forString("accentCallout2");
   STShapeType.Enum ACCENT_CALLOUT_3 = STShapeType.Enum.forString("accentCallout3");
   STShapeType.Enum BORDER_CALLOUT_1 = STShapeType.Enum.forString("borderCallout1");
   STShapeType.Enum BORDER_CALLOUT_2 = STShapeType.Enum.forString("borderCallout2");
   STShapeType.Enum BORDER_CALLOUT_3 = STShapeType.Enum.forString("borderCallout3");
   STShapeType.Enum ACCENT_BORDER_CALLOUT_1 = STShapeType.Enum.forString("accentBorderCallout1");
   STShapeType.Enum ACCENT_BORDER_CALLOUT_2 = STShapeType.Enum.forString("accentBorderCallout2");
   STShapeType.Enum ACCENT_BORDER_CALLOUT_3 = STShapeType.Enum.forString("accentBorderCallout3");
   STShapeType.Enum WEDGE_RECT_CALLOUT = STShapeType.Enum.forString("wedgeRectCallout");
   STShapeType.Enum WEDGE_ROUND_RECT_CALLOUT = STShapeType.Enum.forString("wedgeRoundRectCallout");
   STShapeType.Enum WEDGE_ELLIPSE_CALLOUT = STShapeType.Enum.forString("wedgeEllipseCallout");
   STShapeType.Enum CLOUD_CALLOUT = STShapeType.Enum.forString("cloudCallout");
   STShapeType.Enum CLOUD = STShapeType.Enum.forString("cloud");
   STShapeType.Enum RIBBON = STShapeType.Enum.forString("ribbon");
   STShapeType.Enum RIBBON_2 = STShapeType.Enum.forString("ribbon2");
   STShapeType.Enum ELLIPSE_RIBBON = STShapeType.Enum.forString("ellipseRibbon");
   STShapeType.Enum ELLIPSE_RIBBON_2 = STShapeType.Enum.forString("ellipseRibbon2");
   STShapeType.Enum LEFT_RIGHT_RIBBON = STShapeType.Enum.forString("leftRightRibbon");
   STShapeType.Enum VERTICAL_SCROLL = STShapeType.Enum.forString("verticalScroll");
   STShapeType.Enum HORIZONTAL_SCROLL = STShapeType.Enum.forString("horizontalScroll");
   STShapeType.Enum WAVE = STShapeType.Enum.forString("wave");
   STShapeType.Enum DOUBLE_WAVE = STShapeType.Enum.forString("doubleWave");
   STShapeType.Enum PLUS = STShapeType.Enum.forString("plus");
   STShapeType.Enum FLOW_CHART_PROCESS = STShapeType.Enum.forString("flowChartProcess");
   STShapeType.Enum FLOW_CHART_DECISION = STShapeType.Enum.forString("flowChartDecision");
   STShapeType.Enum FLOW_CHART_INPUT_OUTPUT = STShapeType.Enum.forString("flowChartInputOutput");
   STShapeType.Enum FLOW_CHART_PREDEFINED_PROCESS = STShapeType.Enum.forString("flowChartPredefinedProcess");
   STShapeType.Enum FLOW_CHART_INTERNAL_STORAGE = STShapeType.Enum.forString("flowChartInternalStorage");
   STShapeType.Enum FLOW_CHART_DOCUMENT = STShapeType.Enum.forString("flowChartDocument");
   STShapeType.Enum FLOW_CHART_MULTIDOCUMENT = STShapeType.Enum.forString("flowChartMultidocument");
   STShapeType.Enum FLOW_CHART_TERMINATOR = STShapeType.Enum.forString("flowChartTerminator");
   STShapeType.Enum FLOW_CHART_PREPARATION = STShapeType.Enum.forString("flowChartPreparation");
   STShapeType.Enum FLOW_CHART_MANUAL_INPUT = STShapeType.Enum.forString("flowChartManualInput");
   STShapeType.Enum FLOW_CHART_MANUAL_OPERATION = STShapeType.Enum.forString("flowChartManualOperation");
   STShapeType.Enum FLOW_CHART_CONNECTOR = STShapeType.Enum.forString("flowChartConnector");
   STShapeType.Enum FLOW_CHART_PUNCHED_CARD = STShapeType.Enum.forString("flowChartPunchedCard");
   STShapeType.Enum FLOW_CHART_PUNCHED_TAPE = STShapeType.Enum.forString("flowChartPunchedTape");
   STShapeType.Enum FLOW_CHART_SUMMING_JUNCTION = STShapeType.Enum.forString("flowChartSummingJunction");
   STShapeType.Enum FLOW_CHART_OR = STShapeType.Enum.forString("flowChartOr");
   STShapeType.Enum FLOW_CHART_COLLATE = STShapeType.Enum.forString("flowChartCollate");
   STShapeType.Enum FLOW_CHART_SORT = STShapeType.Enum.forString("flowChartSort");
   STShapeType.Enum FLOW_CHART_EXTRACT = STShapeType.Enum.forString("flowChartExtract");
   STShapeType.Enum FLOW_CHART_MERGE = STShapeType.Enum.forString("flowChartMerge");
   STShapeType.Enum FLOW_CHART_OFFLINE_STORAGE = STShapeType.Enum.forString("flowChartOfflineStorage");
   STShapeType.Enum FLOW_CHART_ONLINE_STORAGE = STShapeType.Enum.forString("flowChartOnlineStorage");
   STShapeType.Enum FLOW_CHART_MAGNETIC_TAPE = STShapeType.Enum.forString("flowChartMagneticTape");
   STShapeType.Enum FLOW_CHART_MAGNETIC_DISK = STShapeType.Enum.forString("flowChartMagneticDisk");
   STShapeType.Enum FLOW_CHART_MAGNETIC_DRUM = STShapeType.Enum.forString("flowChartMagneticDrum");
   STShapeType.Enum FLOW_CHART_DISPLAY = STShapeType.Enum.forString("flowChartDisplay");
   STShapeType.Enum FLOW_CHART_DELAY = STShapeType.Enum.forString("flowChartDelay");
   STShapeType.Enum FLOW_CHART_ALTERNATE_PROCESS = STShapeType.Enum.forString("flowChartAlternateProcess");
   STShapeType.Enum FLOW_CHART_OFFPAGE_CONNECTOR = STShapeType.Enum.forString("flowChartOffpageConnector");
   STShapeType.Enum ACTION_BUTTON_BLANK = STShapeType.Enum.forString("actionButtonBlank");
   STShapeType.Enum ACTION_BUTTON_HOME = STShapeType.Enum.forString("actionButtonHome");
   STShapeType.Enum ACTION_BUTTON_HELP = STShapeType.Enum.forString("actionButtonHelp");
   STShapeType.Enum ACTION_BUTTON_INFORMATION = STShapeType.Enum.forString("actionButtonInformation");
   STShapeType.Enum ACTION_BUTTON_FORWARD_NEXT = STShapeType.Enum.forString("actionButtonForwardNext");
   STShapeType.Enum ACTION_BUTTON_BACK_PREVIOUS = STShapeType.Enum.forString("actionButtonBackPrevious");
   STShapeType.Enum ACTION_BUTTON_END = STShapeType.Enum.forString("actionButtonEnd");
   STShapeType.Enum ACTION_BUTTON_BEGINNING = STShapeType.Enum.forString("actionButtonBeginning");
   STShapeType.Enum ACTION_BUTTON_RETURN = STShapeType.Enum.forString("actionButtonReturn");
   STShapeType.Enum ACTION_BUTTON_DOCUMENT = STShapeType.Enum.forString("actionButtonDocument");
   STShapeType.Enum ACTION_BUTTON_SOUND = STShapeType.Enum.forString("actionButtonSound");
   STShapeType.Enum ACTION_BUTTON_MOVIE = STShapeType.Enum.forString("actionButtonMovie");
   STShapeType.Enum GEAR_6 = STShapeType.Enum.forString("gear6");
   STShapeType.Enum GEAR_9 = STShapeType.Enum.forString("gear9");
   STShapeType.Enum FUNNEL = STShapeType.Enum.forString("funnel");
   STShapeType.Enum MATH_PLUS = STShapeType.Enum.forString("mathPlus");
   STShapeType.Enum MATH_MINUS = STShapeType.Enum.forString("mathMinus");
   STShapeType.Enum MATH_MULTIPLY = STShapeType.Enum.forString("mathMultiply");
   STShapeType.Enum MATH_DIVIDE = STShapeType.Enum.forString("mathDivide");
   STShapeType.Enum MATH_EQUAL = STShapeType.Enum.forString("mathEqual");
   STShapeType.Enum MATH_NOT_EQUAL = STShapeType.Enum.forString("mathNotEqual");
   STShapeType.Enum CORNER_TABS = STShapeType.Enum.forString("cornerTabs");
   STShapeType.Enum SQUARE_TABS = STShapeType.Enum.forString("squareTabs");
   STShapeType.Enum PLAQUE_TABS = STShapeType.Enum.forString("plaqueTabs");
   STShapeType.Enum CHART_X = STShapeType.Enum.forString("chartX");
   STShapeType.Enum CHART_STAR = STShapeType.Enum.forString("chartStar");
   STShapeType.Enum CHART_PLUS = STShapeType.Enum.forString("chartPlus");
   int INT_LINE = 1;
   int INT_LINE_INV = 2;
   int INT_TRIANGLE = 3;
   int INT_RT_TRIANGLE = 4;
   int INT_RECT = 5;
   int INT_DIAMOND = 6;
   int INT_PARALLELOGRAM = 7;
   int INT_TRAPEZOID = 8;
   int INT_NON_ISOSCELES_TRAPEZOID = 9;
   int INT_PENTAGON = 10;
   int INT_HEXAGON = 11;
   int INT_HEPTAGON = 12;
   int INT_OCTAGON = 13;
   int INT_DECAGON = 14;
   int INT_DODECAGON = 15;
   int INT_STAR_4 = 16;
   int INT_STAR_5 = 17;
   int INT_STAR_6 = 18;
   int INT_STAR_7 = 19;
   int INT_STAR_8 = 20;
   int INT_STAR_10 = 21;
   int INT_STAR_12 = 22;
   int INT_STAR_16 = 23;
   int INT_STAR_24 = 24;
   int INT_STAR_32 = 25;
   int INT_ROUND_RECT = 26;
   int INT_ROUND_1_RECT = 27;
   int INT_ROUND_2_SAME_RECT = 28;
   int INT_ROUND_2_DIAG_RECT = 29;
   int INT_SNIP_ROUND_RECT = 30;
   int INT_SNIP_1_RECT = 31;
   int INT_SNIP_2_SAME_RECT = 32;
   int INT_SNIP_2_DIAG_RECT = 33;
   int INT_PLAQUE = 34;
   int INT_ELLIPSE = 35;
   int INT_TEARDROP = 36;
   int INT_HOME_PLATE = 37;
   int INT_CHEVRON = 38;
   int INT_PIE_WEDGE = 39;
   int INT_PIE = 40;
   int INT_BLOCK_ARC = 41;
   int INT_DONUT = 42;
   int INT_NO_SMOKING = 43;
   int INT_RIGHT_ARROW = 44;
   int INT_LEFT_ARROW = 45;
   int INT_UP_ARROW = 46;
   int INT_DOWN_ARROW = 47;
   int INT_STRIPED_RIGHT_ARROW = 48;
   int INT_NOTCHED_RIGHT_ARROW = 49;
   int INT_BENT_UP_ARROW = 50;
   int INT_LEFT_RIGHT_ARROW = 51;
   int INT_UP_DOWN_ARROW = 52;
   int INT_LEFT_UP_ARROW = 53;
   int INT_LEFT_RIGHT_UP_ARROW = 54;
   int INT_QUAD_ARROW = 55;
   int INT_LEFT_ARROW_CALLOUT = 56;
   int INT_RIGHT_ARROW_CALLOUT = 57;
   int INT_UP_ARROW_CALLOUT = 58;
   int INT_DOWN_ARROW_CALLOUT = 59;
   int INT_LEFT_RIGHT_ARROW_CALLOUT = 60;
   int INT_UP_DOWN_ARROW_CALLOUT = 61;
   int INT_QUAD_ARROW_CALLOUT = 62;
   int INT_BENT_ARROW = 63;
   int INT_UTURN_ARROW = 64;
   int INT_CIRCULAR_ARROW = 65;
   int INT_LEFT_CIRCULAR_ARROW = 66;
   int INT_LEFT_RIGHT_CIRCULAR_ARROW = 67;
   int INT_CURVED_RIGHT_ARROW = 68;
   int INT_CURVED_LEFT_ARROW = 69;
   int INT_CURVED_UP_ARROW = 70;
   int INT_CURVED_DOWN_ARROW = 71;
   int INT_SWOOSH_ARROW = 72;
   int INT_CUBE = 73;
   int INT_CAN = 74;
   int INT_LIGHTNING_BOLT = 75;
   int INT_HEART = 76;
   int INT_SUN = 77;
   int INT_MOON = 78;
   int INT_SMILEY_FACE = 79;
   int INT_IRREGULAR_SEAL_1 = 80;
   int INT_IRREGULAR_SEAL_2 = 81;
   int INT_FOLDED_CORNER = 82;
   int INT_BEVEL = 83;
   int INT_FRAME = 84;
   int INT_HALF_FRAME = 85;
   int INT_CORNER = 86;
   int INT_DIAG_STRIPE = 87;
   int INT_CHORD = 88;
   int INT_ARC = 89;
   int INT_LEFT_BRACKET = 90;
   int INT_RIGHT_BRACKET = 91;
   int INT_LEFT_BRACE = 92;
   int INT_RIGHT_BRACE = 93;
   int INT_BRACKET_PAIR = 94;
   int INT_BRACE_PAIR = 95;
   int INT_STRAIGHT_CONNECTOR_1 = 96;
   int INT_BENT_CONNECTOR_2 = 97;
   int INT_BENT_CONNECTOR_3 = 98;
   int INT_BENT_CONNECTOR_4 = 99;
   int INT_BENT_CONNECTOR_5 = 100;
   int INT_CURVED_CONNECTOR_2 = 101;
   int INT_CURVED_CONNECTOR_3 = 102;
   int INT_CURVED_CONNECTOR_4 = 103;
   int INT_CURVED_CONNECTOR_5 = 104;
   int INT_CALLOUT_1 = 105;
   int INT_CALLOUT_2 = 106;
   int INT_CALLOUT_3 = 107;
   int INT_ACCENT_CALLOUT_1 = 108;
   int INT_ACCENT_CALLOUT_2 = 109;
   int INT_ACCENT_CALLOUT_3 = 110;
   int INT_BORDER_CALLOUT_1 = 111;
   int INT_BORDER_CALLOUT_2 = 112;
   int INT_BORDER_CALLOUT_3 = 113;
   int INT_ACCENT_BORDER_CALLOUT_1 = 114;
   int INT_ACCENT_BORDER_CALLOUT_2 = 115;
   int INT_ACCENT_BORDER_CALLOUT_3 = 116;
   int INT_WEDGE_RECT_CALLOUT = 117;
   int INT_WEDGE_ROUND_RECT_CALLOUT = 118;
   int INT_WEDGE_ELLIPSE_CALLOUT = 119;
   int INT_CLOUD_CALLOUT = 120;
   int INT_CLOUD = 121;
   int INT_RIBBON = 122;
   int INT_RIBBON_2 = 123;
   int INT_ELLIPSE_RIBBON = 124;
   int INT_ELLIPSE_RIBBON_2 = 125;
   int INT_LEFT_RIGHT_RIBBON = 126;
   int INT_VERTICAL_SCROLL = 127;
   int INT_HORIZONTAL_SCROLL = 128;
   int INT_WAVE = 129;
   int INT_DOUBLE_WAVE = 130;
   int INT_PLUS = 131;
   int INT_FLOW_CHART_PROCESS = 132;
   int INT_FLOW_CHART_DECISION = 133;
   int INT_FLOW_CHART_INPUT_OUTPUT = 134;
   int INT_FLOW_CHART_PREDEFINED_PROCESS = 135;
   int INT_FLOW_CHART_INTERNAL_STORAGE = 136;
   int INT_FLOW_CHART_DOCUMENT = 137;
   int INT_FLOW_CHART_MULTIDOCUMENT = 138;
   int INT_FLOW_CHART_TERMINATOR = 139;
   int INT_FLOW_CHART_PREPARATION = 140;
   int INT_FLOW_CHART_MANUAL_INPUT = 141;
   int INT_FLOW_CHART_MANUAL_OPERATION = 142;
   int INT_FLOW_CHART_CONNECTOR = 143;
   int INT_FLOW_CHART_PUNCHED_CARD = 144;
   int INT_FLOW_CHART_PUNCHED_TAPE = 145;
   int INT_FLOW_CHART_SUMMING_JUNCTION = 146;
   int INT_FLOW_CHART_OR = 147;
   int INT_FLOW_CHART_COLLATE = 148;
   int INT_FLOW_CHART_SORT = 149;
   int INT_FLOW_CHART_EXTRACT = 150;
   int INT_FLOW_CHART_MERGE = 151;
   int INT_FLOW_CHART_OFFLINE_STORAGE = 152;
   int INT_FLOW_CHART_ONLINE_STORAGE = 153;
   int INT_FLOW_CHART_MAGNETIC_TAPE = 154;
   int INT_FLOW_CHART_MAGNETIC_DISK = 155;
   int INT_FLOW_CHART_MAGNETIC_DRUM = 156;
   int INT_FLOW_CHART_DISPLAY = 157;
   int INT_FLOW_CHART_DELAY = 158;
   int INT_FLOW_CHART_ALTERNATE_PROCESS = 159;
   int INT_FLOW_CHART_OFFPAGE_CONNECTOR = 160;
   int INT_ACTION_BUTTON_BLANK = 161;
   int INT_ACTION_BUTTON_HOME = 162;
   int INT_ACTION_BUTTON_HELP = 163;
   int INT_ACTION_BUTTON_INFORMATION = 164;
   int INT_ACTION_BUTTON_FORWARD_NEXT = 165;
   int INT_ACTION_BUTTON_BACK_PREVIOUS = 166;
   int INT_ACTION_BUTTON_END = 167;
   int INT_ACTION_BUTTON_BEGINNING = 168;
   int INT_ACTION_BUTTON_RETURN = 169;
   int INT_ACTION_BUTTON_DOCUMENT = 170;
   int INT_ACTION_BUTTON_SOUND = 171;
   int INT_ACTION_BUTTON_MOVIE = 172;
   int INT_GEAR_6 = 173;
   int INT_GEAR_9 = 174;
   int INT_FUNNEL = 175;
   int INT_MATH_PLUS = 176;
   int INT_MATH_MINUS = 177;
   int INT_MATH_MULTIPLY = 178;
   int INT_MATH_DIVIDE = 179;
   int INT_MATH_EQUAL = 180;
   int INT_MATH_NOT_EQUAL = 181;
   int INT_CORNER_TABS = 182;
   int INT_SQUARE_TABS = 183;
   int INT_PLAQUE_TABS = 184;
   int INT_CHART_X = 185;
   int INT_CHART_STAR = 186;
   int INT_CHART_PLUS = 187;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_LINE = 1;
      static final int INT_LINE_INV = 2;
      static final int INT_TRIANGLE = 3;
      static final int INT_RT_TRIANGLE = 4;
      static final int INT_RECT = 5;
      static final int INT_DIAMOND = 6;
      static final int INT_PARALLELOGRAM = 7;
      static final int INT_TRAPEZOID = 8;
      static final int INT_NON_ISOSCELES_TRAPEZOID = 9;
      static final int INT_PENTAGON = 10;
      static final int INT_HEXAGON = 11;
      static final int INT_HEPTAGON = 12;
      static final int INT_OCTAGON = 13;
      static final int INT_DECAGON = 14;
      static final int INT_DODECAGON = 15;
      static final int INT_STAR_4 = 16;
      static final int INT_STAR_5 = 17;
      static final int INT_STAR_6 = 18;
      static final int INT_STAR_7 = 19;
      static final int INT_STAR_8 = 20;
      static final int INT_STAR_10 = 21;
      static final int INT_STAR_12 = 22;
      static final int INT_STAR_16 = 23;
      static final int INT_STAR_24 = 24;
      static final int INT_STAR_32 = 25;
      static final int INT_ROUND_RECT = 26;
      static final int INT_ROUND_1_RECT = 27;
      static final int INT_ROUND_2_SAME_RECT = 28;
      static final int INT_ROUND_2_DIAG_RECT = 29;
      static final int INT_SNIP_ROUND_RECT = 30;
      static final int INT_SNIP_1_RECT = 31;
      static final int INT_SNIP_2_SAME_RECT = 32;
      static final int INT_SNIP_2_DIAG_RECT = 33;
      static final int INT_PLAQUE = 34;
      static final int INT_ELLIPSE = 35;
      static final int INT_TEARDROP = 36;
      static final int INT_HOME_PLATE = 37;
      static final int INT_CHEVRON = 38;
      static final int INT_PIE_WEDGE = 39;
      static final int INT_PIE = 40;
      static final int INT_BLOCK_ARC = 41;
      static final int INT_DONUT = 42;
      static final int INT_NO_SMOKING = 43;
      static final int INT_RIGHT_ARROW = 44;
      static final int INT_LEFT_ARROW = 45;
      static final int INT_UP_ARROW = 46;
      static final int INT_DOWN_ARROW = 47;
      static final int INT_STRIPED_RIGHT_ARROW = 48;
      static final int INT_NOTCHED_RIGHT_ARROW = 49;
      static final int INT_BENT_UP_ARROW = 50;
      static final int INT_LEFT_RIGHT_ARROW = 51;
      static final int INT_UP_DOWN_ARROW = 52;
      static final int INT_LEFT_UP_ARROW = 53;
      static final int INT_LEFT_RIGHT_UP_ARROW = 54;
      static final int INT_QUAD_ARROW = 55;
      static final int INT_LEFT_ARROW_CALLOUT = 56;
      static final int INT_RIGHT_ARROW_CALLOUT = 57;
      static final int INT_UP_ARROW_CALLOUT = 58;
      static final int INT_DOWN_ARROW_CALLOUT = 59;
      static final int INT_LEFT_RIGHT_ARROW_CALLOUT = 60;
      static final int INT_UP_DOWN_ARROW_CALLOUT = 61;
      static final int INT_QUAD_ARROW_CALLOUT = 62;
      static final int INT_BENT_ARROW = 63;
      static final int INT_UTURN_ARROW = 64;
      static final int INT_CIRCULAR_ARROW = 65;
      static final int INT_LEFT_CIRCULAR_ARROW = 66;
      static final int INT_LEFT_RIGHT_CIRCULAR_ARROW = 67;
      static final int INT_CURVED_RIGHT_ARROW = 68;
      static final int INT_CURVED_LEFT_ARROW = 69;
      static final int INT_CURVED_UP_ARROW = 70;
      static final int INT_CURVED_DOWN_ARROW = 71;
      static final int INT_SWOOSH_ARROW = 72;
      static final int INT_CUBE = 73;
      static final int INT_CAN = 74;
      static final int INT_LIGHTNING_BOLT = 75;
      static final int INT_HEART = 76;
      static final int INT_SUN = 77;
      static final int INT_MOON = 78;
      static final int INT_SMILEY_FACE = 79;
      static final int INT_IRREGULAR_SEAL_1 = 80;
      static final int INT_IRREGULAR_SEAL_2 = 81;
      static final int INT_FOLDED_CORNER = 82;
      static final int INT_BEVEL = 83;
      static final int INT_FRAME = 84;
      static final int INT_HALF_FRAME = 85;
      static final int INT_CORNER = 86;
      static final int INT_DIAG_STRIPE = 87;
      static final int INT_CHORD = 88;
      static final int INT_ARC = 89;
      static final int INT_LEFT_BRACKET = 90;
      static final int INT_RIGHT_BRACKET = 91;
      static final int INT_LEFT_BRACE = 92;
      static final int INT_RIGHT_BRACE = 93;
      static final int INT_BRACKET_PAIR = 94;
      static final int INT_BRACE_PAIR = 95;
      static final int INT_STRAIGHT_CONNECTOR_1 = 96;
      static final int INT_BENT_CONNECTOR_2 = 97;
      static final int INT_BENT_CONNECTOR_3 = 98;
      static final int INT_BENT_CONNECTOR_4 = 99;
      static final int INT_BENT_CONNECTOR_5 = 100;
      static final int INT_CURVED_CONNECTOR_2 = 101;
      static final int INT_CURVED_CONNECTOR_3 = 102;
      static final int INT_CURVED_CONNECTOR_4 = 103;
      static final int INT_CURVED_CONNECTOR_5 = 104;
      static final int INT_CALLOUT_1 = 105;
      static final int INT_CALLOUT_2 = 106;
      static final int INT_CALLOUT_3 = 107;
      static final int INT_ACCENT_CALLOUT_1 = 108;
      static final int INT_ACCENT_CALLOUT_2 = 109;
      static final int INT_ACCENT_CALLOUT_3 = 110;
      static final int INT_BORDER_CALLOUT_1 = 111;
      static final int INT_BORDER_CALLOUT_2 = 112;
      static final int INT_BORDER_CALLOUT_3 = 113;
      static final int INT_ACCENT_BORDER_CALLOUT_1 = 114;
      static final int INT_ACCENT_BORDER_CALLOUT_2 = 115;
      static final int INT_ACCENT_BORDER_CALLOUT_3 = 116;
      static final int INT_WEDGE_RECT_CALLOUT = 117;
      static final int INT_WEDGE_ROUND_RECT_CALLOUT = 118;
      static final int INT_WEDGE_ELLIPSE_CALLOUT = 119;
      static final int INT_CLOUD_CALLOUT = 120;
      static final int INT_CLOUD = 121;
      static final int INT_RIBBON = 122;
      static final int INT_RIBBON_2 = 123;
      static final int INT_ELLIPSE_RIBBON = 124;
      static final int INT_ELLIPSE_RIBBON_2 = 125;
      static final int INT_LEFT_RIGHT_RIBBON = 126;
      static final int INT_VERTICAL_SCROLL = 127;
      static final int INT_HORIZONTAL_SCROLL = 128;
      static final int INT_WAVE = 129;
      static final int INT_DOUBLE_WAVE = 130;
      static final int INT_PLUS = 131;
      static final int INT_FLOW_CHART_PROCESS = 132;
      static final int INT_FLOW_CHART_DECISION = 133;
      static final int INT_FLOW_CHART_INPUT_OUTPUT = 134;
      static final int INT_FLOW_CHART_PREDEFINED_PROCESS = 135;
      static final int INT_FLOW_CHART_INTERNAL_STORAGE = 136;
      static final int INT_FLOW_CHART_DOCUMENT = 137;
      static final int INT_FLOW_CHART_MULTIDOCUMENT = 138;
      static final int INT_FLOW_CHART_TERMINATOR = 139;
      static final int INT_FLOW_CHART_PREPARATION = 140;
      static final int INT_FLOW_CHART_MANUAL_INPUT = 141;
      static final int INT_FLOW_CHART_MANUAL_OPERATION = 142;
      static final int INT_FLOW_CHART_CONNECTOR = 143;
      static final int INT_FLOW_CHART_PUNCHED_CARD = 144;
      static final int INT_FLOW_CHART_PUNCHED_TAPE = 145;
      static final int INT_FLOW_CHART_SUMMING_JUNCTION = 146;
      static final int INT_FLOW_CHART_OR = 147;
      static final int INT_FLOW_CHART_COLLATE = 148;
      static final int INT_FLOW_CHART_SORT = 149;
      static final int INT_FLOW_CHART_EXTRACT = 150;
      static final int INT_FLOW_CHART_MERGE = 151;
      static final int INT_FLOW_CHART_OFFLINE_STORAGE = 152;
      static final int INT_FLOW_CHART_ONLINE_STORAGE = 153;
      static final int INT_FLOW_CHART_MAGNETIC_TAPE = 154;
      static final int INT_FLOW_CHART_MAGNETIC_DISK = 155;
      static final int INT_FLOW_CHART_MAGNETIC_DRUM = 156;
      static final int INT_FLOW_CHART_DISPLAY = 157;
      static final int INT_FLOW_CHART_DELAY = 158;
      static final int INT_FLOW_CHART_ALTERNATE_PROCESS = 159;
      static final int INT_FLOW_CHART_OFFPAGE_CONNECTOR = 160;
      static final int INT_ACTION_BUTTON_BLANK = 161;
      static final int INT_ACTION_BUTTON_HOME = 162;
      static final int INT_ACTION_BUTTON_HELP = 163;
      static final int INT_ACTION_BUTTON_INFORMATION = 164;
      static final int INT_ACTION_BUTTON_FORWARD_NEXT = 165;
      static final int INT_ACTION_BUTTON_BACK_PREVIOUS = 166;
      static final int INT_ACTION_BUTTON_END = 167;
      static final int INT_ACTION_BUTTON_BEGINNING = 168;
      static final int INT_ACTION_BUTTON_RETURN = 169;
      static final int INT_ACTION_BUTTON_DOCUMENT = 170;
      static final int INT_ACTION_BUTTON_SOUND = 171;
      static final int INT_ACTION_BUTTON_MOVIE = 172;
      static final int INT_GEAR_6 = 173;
      static final int INT_GEAR_9 = 174;
      static final int INT_FUNNEL = 175;
      static final int INT_MATH_PLUS = 176;
      static final int INT_MATH_MINUS = 177;
      static final int INT_MATH_MULTIPLY = 178;
      static final int INT_MATH_DIVIDE = 179;
      static final int INT_MATH_EQUAL = 180;
      static final int INT_MATH_NOT_EQUAL = 181;
      static final int INT_CORNER_TABS = 182;
      static final int INT_SQUARE_TABS = 183;
      static final int INT_PLAQUE_TABS = 184;
      static final int INT_CHART_X = 185;
      static final int INT_CHART_STAR = 186;
      static final int INT_CHART_PLUS = 187;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STShapeType.Enum[]{new STShapeType.Enum("line", 1), new STShapeType.Enum("lineInv", 2), new STShapeType.Enum("triangle", 3), new STShapeType.Enum("rtTriangle", 4), new STShapeType.Enum("rect", 5), new STShapeType.Enum("diamond", 6), new STShapeType.Enum("parallelogram", 7), new STShapeType.Enum("trapezoid", 8), new STShapeType.Enum("nonIsoscelesTrapezoid", 9), new STShapeType.Enum("pentagon", 10), new STShapeType.Enum("hexagon", 11), new STShapeType.Enum("heptagon", 12), new STShapeType.Enum("octagon", 13), new STShapeType.Enum("decagon", 14), new STShapeType.Enum("dodecagon", 15), new STShapeType.Enum("star4", 16), new STShapeType.Enum("star5", 17), new STShapeType.Enum("star6", 18), new STShapeType.Enum("star7", 19), new STShapeType.Enum("star8", 20), new STShapeType.Enum("star10", 21), new STShapeType.Enum("star12", 22), new STShapeType.Enum("star16", 23), new STShapeType.Enum("star24", 24), new STShapeType.Enum("star32", 25), new STShapeType.Enum("roundRect", 26), new STShapeType.Enum("round1Rect", 27), new STShapeType.Enum("round2SameRect", 28), new STShapeType.Enum("round2DiagRect", 29), new STShapeType.Enum("snipRoundRect", 30), new STShapeType.Enum("snip1Rect", 31), new STShapeType.Enum("snip2SameRect", 32), new STShapeType.Enum("snip2DiagRect", 33), new STShapeType.Enum("plaque", 34), new STShapeType.Enum("ellipse", 35), new STShapeType.Enum("teardrop", 36), new STShapeType.Enum("homePlate", 37), new STShapeType.Enum("chevron", 38), new STShapeType.Enum("pieWedge", 39), new STShapeType.Enum("pie", 40), new STShapeType.Enum("blockArc", 41), new STShapeType.Enum("donut", 42), new STShapeType.Enum("noSmoking", 43), new STShapeType.Enum("rightArrow", 44), new STShapeType.Enum("leftArrow", 45), new STShapeType.Enum("upArrow", 46), new STShapeType.Enum("downArrow", 47), new STShapeType.Enum("stripedRightArrow", 48), new STShapeType.Enum("notchedRightArrow", 49), new STShapeType.Enum("bentUpArrow", 50), new STShapeType.Enum("leftRightArrow", 51), new STShapeType.Enum("upDownArrow", 52), new STShapeType.Enum("leftUpArrow", 53), new STShapeType.Enum("leftRightUpArrow", 54), new STShapeType.Enum("quadArrow", 55), new STShapeType.Enum("leftArrowCallout", 56), new STShapeType.Enum("rightArrowCallout", 57), new STShapeType.Enum("upArrowCallout", 58), new STShapeType.Enum("downArrowCallout", 59), new STShapeType.Enum("leftRightArrowCallout", 60), new STShapeType.Enum("upDownArrowCallout", 61), new STShapeType.Enum("quadArrowCallout", 62), new STShapeType.Enum("bentArrow", 63), new STShapeType.Enum("uturnArrow", 64), new STShapeType.Enum("circularArrow", 65), new STShapeType.Enum("leftCircularArrow", 66), new STShapeType.Enum("leftRightCircularArrow", 67), new STShapeType.Enum("curvedRightArrow", 68), new STShapeType.Enum("curvedLeftArrow", 69), new STShapeType.Enum("curvedUpArrow", 70), new STShapeType.Enum("curvedDownArrow", 71), new STShapeType.Enum("swooshArrow", 72), new STShapeType.Enum("cube", 73), new STShapeType.Enum("can", 74), new STShapeType.Enum("lightningBolt", 75), new STShapeType.Enum("heart", 76), new STShapeType.Enum("sun", 77), new STShapeType.Enum("moon", 78), new STShapeType.Enum("smileyFace", 79), new STShapeType.Enum("irregularSeal1", 80), new STShapeType.Enum("irregularSeal2", 81), new STShapeType.Enum("foldedCorner", 82), new STShapeType.Enum("bevel", 83), new STShapeType.Enum("frame", 84), new STShapeType.Enum("halfFrame", 85), new STShapeType.Enum("corner", 86), new STShapeType.Enum("diagStripe", 87), new STShapeType.Enum("chord", 88), new STShapeType.Enum("arc", 89), new STShapeType.Enum("leftBracket", 90), new STShapeType.Enum("rightBracket", 91), new STShapeType.Enum("leftBrace", 92), new STShapeType.Enum("rightBrace", 93), new STShapeType.Enum("bracketPair", 94), new STShapeType.Enum("bracePair", 95), new STShapeType.Enum("straightConnector1", 96), new STShapeType.Enum("bentConnector2", 97), new STShapeType.Enum("bentConnector3", 98), new STShapeType.Enum("bentConnector4", 99), new STShapeType.Enum("bentConnector5", 100), new STShapeType.Enum("curvedConnector2", 101), new STShapeType.Enum("curvedConnector3", 102), new STShapeType.Enum("curvedConnector4", 103), new STShapeType.Enum("curvedConnector5", 104), new STShapeType.Enum("callout1", 105), new STShapeType.Enum("callout2", 106), new STShapeType.Enum("callout3", 107), new STShapeType.Enum("accentCallout1", 108), new STShapeType.Enum("accentCallout2", 109), new STShapeType.Enum("accentCallout3", 110), new STShapeType.Enum("borderCallout1", 111), new STShapeType.Enum("borderCallout2", 112), new STShapeType.Enum("borderCallout3", 113), new STShapeType.Enum("accentBorderCallout1", 114), new STShapeType.Enum("accentBorderCallout2", 115), new STShapeType.Enum("accentBorderCallout3", 116), new STShapeType.Enum("wedgeRectCallout", 117), new STShapeType.Enum("wedgeRoundRectCallout", 118), new STShapeType.Enum("wedgeEllipseCallout", 119), new STShapeType.Enum("cloudCallout", 120), new STShapeType.Enum("cloud", 121), new STShapeType.Enum("ribbon", 122), new STShapeType.Enum("ribbon2", 123), new STShapeType.Enum("ellipseRibbon", 124), new STShapeType.Enum("ellipseRibbon2", 125), new STShapeType.Enum("leftRightRibbon", 126), new STShapeType.Enum("verticalScroll", 127), new STShapeType.Enum("horizontalScroll", 128), new STShapeType.Enum("wave", 129), new STShapeType.Enum("doubleWave", 130), new STShapeType.Enum("plus", 131), new STShapeType.Enum("flowChartProcess", 132), new STShapeType.Enum("flowChartDecision", 133), new STShapeType.Enum("flowChartInputOutput", 134), new STShapeType.Enum("flowChartPredefinedProcess", 135), new STShapeType.Enum("flowChartInternalStorage", 136), new STShapeType.Enum("flowChartDocument", 137), new STShapeType.Enum("flowChartMultidocument", 138), new STShapeType.Enum("flowChartTerminator", 139), new STShapeType.Enum("flowChartPreparation", 140), new STShapeType.Enum("flowChartManualInput", 141), new STShapeType.Enum("flowChartManualOperation", 142), new STShapeType.Enum("flowChartConnector", 143), new STShapeType.Enum("flowChartPunchedCard", 144), new STShapeType.Enum("flowChartPunchedTape", 145), new STShapeType.Enum("flowChartSummingJunction", 146), new STShapeType.Enum("flowChartOr", 147), new STShapeType.Enum("flowChartCollate", 148), new STShapeType.Enum("flowChartSort", 149), new STShapeType.Enum("flowChartExtract", 150), new STShapeType.Enum("flowChartMerge", 151), new STShapeType.Enum("flowChartOfflineStorage", 152), new STShapeType.Enum("flowChartOnlineStorage", 153), new STShapeType.Enum("flowChartMagneticTape", 154), new STShapeType.Enum("flowChartMagneticDisk", 155), new STShapeType.Enum("flowChartMagneticDrum", 156), new STShapeType.Enum("flowChartDisplay", 157), new STShapeType.Enum("flowChartDelay", 158), new STShapeType.Enum("flowChartAlternateProcess", 159), new STShapeType.Enum("flowChartOffpageConnector", 160), new STShapeType.Enum("actionButtonBlank", 161), new STShapeType.Enum("actionButtonHome", 162), new STShapeType.Enum("actionButtonHelp", 163), new STShapeType.Enum("actionButtonInformation", 164), new STShapeType.Enum("actionButtonForwardNext", 165), new STShapeType.Enum("actionButtonBackPrevious", 166), new STShapeType.Enum("actionButtonEnd", 167), new STShapeType.Enum("actionButtonBeginning", 168), new STShapeType.Enum("actionButtonReturn", 169), new STShapeType.Enum("actionButtonDocument", 170), new STShapeType.Enum("actionButtonSound", 171), new STShapeType.Enum("actionButtonMovie", 172), new STShapeType.Enum("gear6", 173), new STShapeType.Enum("gear9", 174), new STShapeType.Enum("funnel", 175), new STShapeType.Enum("mathPlus", 176), new STShapeType.Enum("mathMinus", 177), new STShapeType.Enum("mathMultiply", 178), new STShapeType.Enum("mathDivide", 179), new STShapeType.Enum("mathEqual", 180), new STShapeType.Enum("mathNotEqual", 181), new STShapeType.Enum("cornerTabs", 182), new STShapeType.Enum("squareTabs", 183), new STShapeType.Enum("plaqueTabs", 184), new STShapeType.Enum("chartX", 185), new STShapeType.Enum("chartStar", 186), new STShapeType.Enum("chartPlus", 187)});
      private static final long serialVersionUID = 1L;


      public static STShapeType.Enum forString(String var0) {
         return (STShapeType.Enum)table.forString(var0);
      }

      public static STShapeType.Enum forInt(int var0) {
         return (STShapeType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STShapeType newValue(Object var0) {
         return (STShapeType)STShapeType.type.newValue(var0);
      }

      public static STShapeType newInstance() {
         return (STShapeType)POIXMLTypeLoader.newInstance(STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType newInstance(XmlOptions var0) {
         return (STShapeType)POIXMLTypeLoader.newInstance(STShapeType.type, var0);
      }

      public static STShapeType parse(String var0) throws XmlException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(String var0, XmlOptions var1) throws XmlException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static STShapeType parse(File var0) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static STShapeType parse(URL var0) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static STShapeType parse(InputStream var0) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static STShapeType parse(Reader var0) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static STShapeType parse(XMLStreamReader var0) throws XmlException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static STShapeType parse(Node var0) throws XmlException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static STShapeType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, (XmlOptions)null);
      }

      public static STShapeType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STShapeType)POIXMLTypeLoader.parse(var0, STShapeType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STShapeType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STShapeType.type, var1);
      }

   }
}
