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

public interface STBorder extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STBorder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stborderd7ectype");
   STBorder.Enum NIL = STBorder.Enum.forString("nil");
   STBorder.Enum NONE = STBorder.Enum.forString("none");
   STBorder.Enum SINGLE = STBorder.Enum.forString("single");
   STBorder.Enum THICK = STBorder.Enum.forString("thick");
   STBorder.Enum DOUBLE = STBorder.Enum.forString("double");
   STBorder.Enum DOTTED = STBorder.Enum.forString("dotted");
   STBorder.Enum DASHED = STBorder.Enum.forString("dashed");
   STBorder.Enum DOT_DASH = STBorder.Enum.forString("dotDash");
   STBorder.Enum DOT_DOT_DASH = STBorder.Enum.forString("dotDotDash");
   STBorder.Enum TRIPLE = STBorder.Enum.forString("triple");
   STBorder.Enum THIN_THICK_SMALL_GAP = STBorder.Enum.forString("thinThickSmallGap");
   STBorder.Enum THICK_THIN_SMALL_GAP = STBorder.Enum.forString("thickThinSmallGap");
   STBorder.Enum THIN_THICK_THIN_SMALL_GAP = STBorder.Enum.forString("thinThickThinSmallGap");
   STBorder.Enum THIN_THICK_MEDIUM_GAP = STBorder.Enum.forString("thinThickMediumGap");
   STBorder.Enum THICK_THIN_MEDIUM_GAP = STBorder.Enum.forString("thickThinMediumGap");
   STBorder.Enum THIN_THICK_THIN_MEDIUM_GAP = STBorder.Enum.forString("thinThickThinMediumGap");
   STBorder.Enum THIN_THICK_LARGE_GAP = STBorder.Enum.forString("thinThickLargeGap");
   STBorder.Enum THICK_THIN_LARGE_GAP = STBorder.Enum.forString("thickThinLargeGap");
   STBorder.Enum THIN_THICK_THIN_LARGE_GAP = STBorder.Enum.forString("thinThickThinLargeGap");
   STBorder.Enum WAVE = STBorder.Enum.forString("wave");
   STBorder.Enum DOUBLE_WAVE = STBorder.Enum.forString("doubleWave");
   STBorder.Enum DASH_SMALL_GAP = STBorder.Enum.forString("dashSmallGap");
   STBorder.Enum DASH_DOT_STROKED = STBorder.Enum.forString("dashDotStroked");
   STBorder.Enum THREE_D_EMBOSS = STBorder.Enum.forString("threeDEmboss");
   STBorder.Enum THREE_D_ENGRAVE = STBorder.Enum.forString("threeDEngrave");
   STBorder.Enum OUTSET = STBorder.Enum.forString("outset");
   STBorder.Enum INSET = STBorder.Enum.forString("inset");
   STBorder.Enum APPLES = STBorder.Enum.forString("apples");
   STBorder.Enum ARCHED_SCALLOPS = STBorder.Enum.forString("archedScallops");
   STBorder.Enum BABY_PACIFIER = STBorder.Enum.forString("babyPacifier");
   STBorder.Enum BABY_RATTLE = STBorder.Enum.forString("babyRattle");
   STBorder.Enum BALLOONS_3_COLORS = STBorder.Enum.forString("balloons3Colors");
   STBorder.Enum BALLOONS_HOT_AIR = STBorder.Enum.forString("balloonsHotAir");
   STBorder.Enum BASIC_BLACK_DASHES = STBorder.Enum.forString("basicBlackDashes");
   STBorder.Enum BASIC_BLACK_DOTS = STBorder.Enum.forString("basicBlackDots");
   STBorder.Enum BASIC_BLACK_SQUARES = STBorder.Enum.forString("basicBlackSquares");
   STBorder.Enum BASIC_THIN_LINES = STBorder.Enum.forString("basicThinLines");
   STBorder.Enum BASIC_WHITE_DASHES = STBorder.Enum.forString("basicWhiteDashes");
   STBorder.Enum BASIC_WHITE_DOTS = STBorder.Enum.forString("basicWhiteDots");
   STBorder.Enum BASIC_WHITE_SQUARES = STBorder.Enum.forString("basicWhiteSquares");
   STBorder.Enum BASIC_WIDE_INLINE = STBorder.Enum.forString("basicWideInline");
   STBorder.Enum BASIC_WIDE_MIDLINE = STBorder.Enum.forString("basicWideMidline");
   STBorder.Enum BASIC_WIDE_OUTLINE = STBorder.Enum.forString("basicWideOutline");
   STBorder.Enum BATS = STBorder.Enum.forString("bats");
   STBorder.Enum BIRDS = STBorder.Enum.forString("birds");
   STBorder.Enum BIRDS_FLIGHT = STBorder.Enum.forString("birdsFlight");
   STBorder.Enum CABINS = STBorder.Enum.forString("cabins");
   STBorder.Enum CAKE_SLICE = STBorder.Enum.forString("cakeSlice");
   STBorder.Enum CANDY_CORN = STBorder.Enum.forString("candyCorn");
   STBorder.Enum CELTIC_KNOTWORK = STBorder.Enum.forString("celticKnotwork");
   STBorder.Enum CERTIFICATE_BANNER = STBorder.Enum.forString("certificateBanner");
   STBorder.Enum CHAIN_LINK = STBorder.Enum.forString("chainLink");
   STBorder.Enum CHAMPAGNE_BOTTLE = STBorder.Enum.forString("champagneBottle");
   STBorder.Enum CHECKED_BAR_BLACK = STBorder.Enum.forString("checkedBarBlack");
   STBorder.Enum CHECKED_BAR_COLOR = STBorder.Enum.forString("checkedBarColor");
   STBorder.Enum CHECKERED = STBorder.Enum.forString("checkered");
   STBorder.Enum CHRISTMAS_TREE = STBorder.Enum.forString("christmasTree");
   STBorder.Enum CIRCLES_LINES = STBorder.Enum.forString("circlesLines");
   STBorder.Enum CIRCLES_RECTANGLES = STBorder.Enum.forString("circlesRectangles");
   STBorder.Enum CLASSICAL_WAVE = STBorder.Enum.forString("classicalWave");
   STBorder.Enum CLOCKS = STBorder.Enum.forString("clocks");
   STBorder.Enum COMPASS = STBorder.Enum.forString("compass");
   STBorder.Enum CONFETTI = STBorder.Enum.forString("confetti");
   STBorder.Enum CONFETTI_GRAYS = STBorder.Enum.forString("confettiGrays");
   STBorder.Enum CONFETTI_OUTLINE = STBorder.Enum.forString("confettiOutline");
   STBorder.Enum CONFETTI_STREAMERS = STBorder.Enum.forString("confettiStreamers");
   STBorder.Enum CONFETTI_WHITE = STBorder.Enum.forString("confettiWhite");
   STBorder.Enum CORNER_TRIANGLES = STBorder.Enum.forString("cornerTriangles");
   STBorder.Enum COUPON_CUTOUT_DASHES = STBorder.Enum.forString("couponCutoutDashes");
   STBorder.Enum COUPON_CUTOUT_DOTS = STBorder.Enum.forString("couponCutoutDots");
   STBorder.Enum CRAZY_MAZE = STBorder.Enum.forString("crazyMaze");
   STBorder.Enum CREATURES_BUTTERFLY = STBorder.Enum.forString("creaturesButterfly");
   STBorder.Enum CREATURES_FISH = STBorder.Enum.forString("creaturesFish");
   STBorder.Enum CREATURES_INSECTS = STBorder.Enum.forString("creaturesInsects");
   STBorder.Enum CREATURES_LADY_BUG = STBorder.Enum.forString("creaturesLadyBug");
   STBorder.Enum CROSS_STITCH = STBorder.Enum.forString("crossStitch");
   STBorder.Enum CUP = STBorder.Enum.forString("cup");
   STBorder.Enum DECO_ARCH = STBorder.Enum.forString("decoArch");
   STBorder.Enum DECO_ARCH_COLOR = STBorder.Enum.forString("decoArchColor");
   STBorder.Enum DECO_BLOCKS = STBorder.Enum.forString("decoBlocks");
   STBorder.Enum DIAMONDS_GRAY = STBorder.Enum.forString("diamondsGray");
   STBorder.Enum DOUBLE_D = STBorder.Enum.forString("doubleD");
   STBorder.Enum DOUBLE_DIAMONDS = STBorder.Enum.forString("doubleDiamonds");
   STBorder.Enum EARTH_1 = STBorder.Enum.forString("earth1");
   STBorder.Enum EARTH_2 = STBorder.Enum.forString("earth2");
   STBorder.Enum ECLIPSING_SQUARES_1 = STBorder.Enum.forString("eclipsingSquares1");
   STBorder.Enum ECLIPSING_SQUARES_2 = STBorder.Enum.forString("eclipsingSquares2");
   STBorder.Enum EGGS_BLACK = STBorder.Enum.forString("eggsBlack");
   STBorder.Enum FANS = STBorder.Enum.forString("fans");
   STBorder.Enum FILM = STBorder.Enum.forString("film");
   STBorder.Enum FIRECRACKERS = STBorder.Enum.forString("firecrackers");
   STBorder.Enum FLOWERS_BLOCK_PRINT = STBorder.Enum.forString("flowersBlockPrint");
   STBorder.Enum FLOWERS_DAISIES = STBorder.Enum.forString("flowersDaisies");
   STBorder.Enum FLOWERS_MODERN_1 = STBorder.Enum.forString("flowersModern1");
   STBorder.Enum FLOWERS_MODERN_2 = STBorder.Enum.forString("flowersModern2");
   STBorder.Enum FLOWERS_PANSY = STBorder.Enum.forString("flowersPansy");
   STBorder.Enum FLOWERS_RED_ROSE = STBorder.Enum.forString("flowersRedRose");
   STBorder.Enum FLOWERS_ROSES = STBorder.Enum.forString("flowersRoses");
   STBorder.Enum FLOWERS_TEACUP = STBorder.Enum.forString("flowersTeacup");
   STBorder.Enum FLOWERS_TINY = STBorder.Enum.forString("flowersTiny");
   STBorder.Enum GEMS = STBorder.Enum.forString("gems");
   STBorder.Enum GINGERBREAD_MAN = STBorder.Enum.forString("gingerbreadMan");
   STBorder.Enum GRADIENT = STBorder.Enum.forString("gradient");
   STBorder.Enum HANDMADE_1 = STBorder.Enum.forString("handmade1");
   STBorder.Enum HANDMADE_2 = STBorder.Enum.forString("handmade2");
   STBorder.Enum HEART_BALLOON = STBorder.Enum.forString("heartBalloon");
   STBorder.Enum HEART_GRAY = STBorder.Enum.forString("heartGray");
   STBorder.Enum HEARTS = STBorder.Enum.forString("hearts");
   STBorder.Enum HEEBIE_JEEBIES = STBorder.Enum.forString("heebieJeebies");
   STBorder.Enum HOLLY = STBorder.Enum.forString("holly");
   STBorder.Enum HOUSE_FUNKY = STBorder.Enum.forString("houseFunky");
   STBorder.Enum HYPNOTIC = STBorder.Enum.forString("hypnotic");
   STBorder.Enum ICE_CREAM_CONES = STBorder.Enum.forString("iceCreamCones");
   STBorder.Enum LIGHT_BULB = STBorder.Enum.forString("lightBulb");
   STBorder.Enum LIGHTNING_1 = STBorder.Enum.forString("lightning1");
   STBorder.Enum LIGHTNING_2 = STBorder.Enum.forString("lightning2");
   STBorder.Enum MAP_PINS = STBorder.Enum.forString("mapPins");
   STBorder.Enum MAPLE_LEAF = STBorder.Enum.forString("mapleLeaf");
   STBorder.Enum MAPLE_MUFFINS = STBorder.Enum.forString("mapleMuffins");
   STBorder.Enum MARQUEE = STBorder.Enum.forString("marquee");
   STBorder.Enum MARQUEE_TOOTHED = STBorder.Enum.forString("marqueeToothed");
   STBorder.Enum MOONS = STBorder.Enum.forString("moons");
   STBorder.Enum MOSAIC = STBorder.Enum.forString("mosaic");
   STBorder.Enum MUSIC_NOTES = STBorder.Enum.forString("musicNotes");
   STBorder.Enum NORTHWEST = STBorder.Enum.forString("northwest");
   STBorder.Enum OVALS = STBorder.Enum.forString("ovals");
   STBorder.Enum PACKAGES = STBorder.Enum.forString("packages");
   STBorder.Enum PALMS_BLACK = STBorder.Enum.forString("palmsBlack");
   STBorder.Enum PALMS_COLOR = STBorder.Enum.forString("palmsColor");
   STBorder.Enum PAPER_CLIPS = STBorder.Enum.forString("paperClips");
   STBorder.Enum PAPYRUS = STBorder.Enum.forString("papyrus");
   STBorder.Enum PARTY_FAVOR = STBorder.Enum.forString("partyFavor");
   STBorder.Enum PARTY_GLASS = STBorder.Enum.forString("partyGlass");
   STBorder.Enum PENCILS = STBorder.Enum.forString("pencils");
   STBorder.Enum PEOPLE = STBorder.Enum.forString("people");
   STBorder.Enum PEOPLE_WAVING = STBorder.Enum.forString("peopleWaving");
   STBorder.Enum PEOPLE_HATS = STBorder.Enum.forString("peopleHats");
   STBorder.Enum POINSETTIAS = STBorder.Enum.forString("poinsettias");
   STBorder.Enum POSTAGE_STAMP = STBorder.Enum.forString("postageStamp");
   STBorder.Enum PUMPKIN_1 = STBorder.Enum.forString("pumpkin1");
   STBorder.Enum PUSH_PIN_NOTE_2 = STBorder.Enum.forString("pushPinNote2");
   STBorder.Enum PUSH_PIN_NOTE_1 = STBorder.Enum.forString("pushPinNote1");
   STBorder.Enum PYRAMIDS = STBorder.Enum.forString("pyramids");
   STBorder.Enum PYRAMIDS_ABOVE = STBorder.Enum.forString("pyramidsAbove");
   STBorder.Enum QUADRANTS = STBorder.Enum.forString("quadrants");
   STBorder.Enum RINGS = STBorder.Enum.forString("rings");
   STBorder.Enum SAFARI = STBorder.Enum.forString("safari");
   STBorder.Enum SAWTOOTH = STBorder.Enum.forString("sawtooth");
   STBorder.Enum SAWTOOTH_GRAY = STBorder.Enum.forString("sawtoothGray");
   STBorder.Enum SCARED_CAT = STBorder.Enum.forString("scaredCat");
   STBorder.Enum SEATTLE = STBorder.Enum.forString("seattle");
   STBorder.Enum SHADOWED_SQUARES = STBorder.Enum.forString("shadowedSquares");
   STBorder.Enum SHARKS_TEETH = STBorder.Enum.forString("sharksTeeth");
   STBorder.Enum SHOREBIRD_TRACKS = STBorder.Enum.forString("shorebirdTracks");
   STBorder.Enum SKYROCKET = STBorder.Enum.forString("skyrocket");
   STBorder.Enum SNOWFLAKE_FANCY = STBorder.Enum.forString("snowflakeFancy");
   STBorder.Enum SNOWFLAKES = STBorder.Enum.forString("snowflakes");
   STBorder.Enum SOMBRERO = STBorder.Enum.forString("sombrero");
   STBorder.Enum SOUTHWEST = STBorder.Enum.forString("southwest");
   STBorder.Enum STARS = STBorder.Enum.forString("stars");
   STBorder.Enum STARS_TOP = STBorder.Enum.forString("starsTop");
   STBorder.Enum STARS_3_D = STBorder.Enum.forString("stars3d");
   STBorder.Enum STARS_BLACK = STBorder.Enum.forString("starsBlack");
   STBorder.Enum STARS_SHADOWED = STBorder.Enum.forString("starsShadowed");
   STBorder.Enum SUN = STBorder.Enum.forString("sun");
   STBorder.Enum SWIRLIGIG = STBorder.Enum.forString("swirligig");
   STBorder.Enum TORN_PAPER = STBorder.Enum.forString("tornPaper");
   STBorder.Enum TORN_PAPER_BLACK = STBorder.Enum.forString("tornPaperBlack");
   STBorder.Enum TREES = STBorder.Enum.forString("trees");
   STBorder.Enum TRIANGLE_PARTY = STBorder.Enum.forString("triangleParty");
   STBorder.Enum TRIANGLES = STBorder.Enum.forString("triangles");
   STBorder.Enum TRIBAL_1 = STBorder.Enum.forString("tribal1");
   STBorder.Enum TRIBAL_2 = STBorder.Enum.forString("tribal2");
   STBorder.Enum TRIBAL_3 = STBorder.Enum.forString("tribal3");
   STBorder.Enum TRIBAL_4 = STBorder.Enum.forString("tribal4");
   STBorder.Enum TRIBAL_5 = STBorder.Enum.forString("tribal5");
   STBorder.Enum TRIBAL_6 = STBorder.Enum.forString("tribal6");
   STBorder.Enum TWISTED_LINES_1 = STBorder.Enum.forString("twistedLines1");
   STBorder.Enum TWISTED_LINES_2 = STBorder.Enum.forString("twistedLines2");
   STBorder.Enum VINE = STBorder.Enum.forString("vine");
   STBorder.Enum WAVELINE = STBorder.Enum.forString("waveline");
   STBorder.Enum WEAVING_ANGLES = STBorder.Enum.forString("weavingAngles");
   STBorder.Enum WEAVING_BRAID = STBorder.Enum.forString("weavingBraid");
   STBorder.Enum WEAVING_RIBBON = STBorder.Enum.forString("weavingRibbon");
   STBorder.Enum WEAVING_STRIPS = STBorder.Enum.forString("weavingStrips");
   STBorder.Enum WHITE_FLOWERS = STBorder.Enum.forString("whiteFlowers");
   STBorder.Enum WOODWORK = STBorder.Enum.forString("woodwork");
   STBorder.Enum X_ILLUSIONS = STBorder.Enum.forString("xIllusions");
   STBorder.Enum ZANY_TRIANGLES = STBorder.Enum.forString("zanyTriangles");
   STBorder.Enum ZIG_ZAG = STBorder.Enum.forString("zigZag");
   STBorder.Enum ZIG_ZAG_STITCH = STBorder.Enum.forString("zigZagStitch");
   int INT_NIL = 1;
   int INT_NONE = 2;
   int INT_SINGLE = 3;
   int INT_THICK = 4;
   int INT_DOUBLE = 5;
   int INT_DOTTED = 6;
   int INT_DASHED = 7;
   int INT_DOT_DASH = 8;
   int INT_DOT_DOT_DASH = 9;
   int INT_TRIPLE = 10;
   int INT_THIN_THICK_SMALL_GAP = 11;
   int INT_THICK_THIN_SMALL_GAP = 12;
   int INT_THIN_THICK_THIN_SMALL_GAP = 13;
   int INT_THIN_THICK_MEDIUM_GAP = 14;
   int INT_THICK_THIN_MEDIUM_GAP = 15;
   int INT_THIN_THICK_THIN_MEDIUM_GAP = 16;
   int INT_THIN_THICK_LARGE_GAP = 17;
   int INT_THICK_THIN_LARGE_GAP = 18;
   int INT_THIN_THICK_THIN_LARGE_GAP = 19;
   int INT_WAVE = 20;
   int INT_DOUBLE_WAVE = 21;
   int INT_DASH_SMALL_GAP = 22;
   int INT_DASH_DOT_STROKED = 23;
   int INT_THREE_D_EMBOSS = 24;
   int INT_THREE_D_ENGRAVE = 25;
   int INT_OUTSET = 26;
   int INT_INSET = 27;
   int INT_APPLES = 28;
   int INT_ARCHED_SCALLOPS = 29;
   int INT_BABY_PACIFIER = 30;
   int INT_BABY_RATTLE = 31;
   int INT_BALLOONS_3_COLORS = 32;
   int INT_BALLOONS_HOT_AIR = 33;
   int INT_BASIC_BLACK_DASHES = 34;
   int INT_BASIC_BLACK_DOTS = 35;
   int INT_BASIC_BLACK_SQUARES = 36;
   int INT_BASIC_THIN_LINES = 37;
   int INT_BASIC_WHITE_DASHES = 38;
   int INT_BASIC_WHITE_DOTS = 39;
   int INT_BASIC_WHITE_SQUARES = 40;
   int INT_BASIC_WIDE_INLINE = 41;
   int INT_BASIC_WIDE_MIDLINE = 42;
   int INT_BASIC_WIDE_OUTLINE = 43;
   int INT_BATS = 44;
   int INT_BIRDS = 45;
   int INT_BIRDS_FLIGHT = 46;
   int INT_CABINS = 47;
   int INT_CAKE_SLICE = 48;
   int INT_CANDY_CORN = 49;
   int INT_CELTIC_KNOTWORK = 50;
   int INT_CERTIFICATE_BANNER = 51;
   int INT_CHAIN_LINK = 52;
   int INT_CHAMPAGNE_BOTTLE = 53;
   int INT_CHECKED_BAR_BLACK = 54;
   int INT_CHECKED_BAR_COLOR = 55;
   int INT_CHECKERED = 56;
   int INT_CHRISTMAS_TREE = 57;
   int INT_CIRCLES_LINES = 58;
   int INT_CIRCLES_RECTANGLES = 59;
   int INT_CLASSICAL_WAVE = 60;
   int INT_CLOCKS = 61;
   int INT_COMPASS = 62;
   int INT_CONFETTI = 63;
   int INT_CONFETTI_GRAYS = 64;
   int INT_CONFETTI_OUTLINE = 65;
   int INT_CONFETTI_STREAMERS = 66;
   int INT_CONFETTI_WHITE = 67;
   int INT_CORNER_TRIANGLES = 68;
   int INT_COUPON_CUTOUT_DASHES = 69;
   int INT_COUPON_CUTOUT_DOTS = 70;
   int INT_CRAZY_MAZE = 71;
   int INT_CREATURES_BUTTERFLY = 72;
   int INT_CREATURES_FISH = 73;
   int INT_CREATURES_INSECTS = 74;
   int INT_CREATURES_LADY_BUG = 75;
   int INT_CROSS_STITCH = 76;
   int INT_CUP = 77;
   int INT_DECO_ARCH = 78;
   int INT_DECO_ARCH_COLOR = 79;
   int INT_DECO_BLOCKS = 80;
   int INT_DIAMONDS_GRAY = 81;
   int INT_DOUBLE_D = 82;
   int INT_DOUBLE_DIAMONDS = 83;
   int INT_EARTH_1 = 84;
   int INT_EARTH_2 = 85;
   int INT_ECLIPSING_SQUARES_1 = 86;
   int INT_ECLIPSING_SQUARES_2 = 87;
   int INT_EGGS_BLACK = 88;
   int INT_FANS = 89;
   int INT_FILM = 90;
   int INT_FIRECRACKERS = 91;
   int INT_FLOWERS_BLOCK_PRINT = 92;
   int INT_FLOWERS_DAISIES = 93;
   int INT_FLOWERS_MODERN_1 = 94;
   int INT_FLOWERS_MODERN_2 = 95;
   int INT_FLOWERS_PANSY = 96;
   int INT_FLOWERS_RED_ROSE = 97;
   int INT_FLOWERS_ROSES = 98;
   int INT_FLOWERS_TEACUP = 99;
   int INT_FLOWERS_TINY = 100;
   int INT_GEMS = 101;
   int INT_GINGERBREAD_MAN = 102;
   int INT_GRADIENT = 103;
   int INT_HANDMADE_1 = 104;
   int INT_HANDMADE_2 = 105;
   int INT_HEART_BALLOON = 106;
   int INT_HEART_GRAY = 107;
   int INT_HEARTS = 108;
   int INT_HEEBIE_JEEBIES = 109;
   int INT_HOLLY = 110;
   int INT_HOUSE_FUNKY = 111;
   int INT_HYPNOTIC = 112;
   int INT_ICE_CREAM_CONES = 113;
   int INT_LIGHT_BULB = 114;
   int INT_LIGHTNING_1 = 115;
   int INT_LIGHTNING_2 = 116;
   int INT_MAP_PINS = 117;
   int INT_MAPLE_LEAF = 118;
   int INT_MAPLE_MUFFINS = 119;
   int INT_MARQUEE = 120;
   int INT_MARQUEE_TOOTHED = 121;
   int INT_MOONS = 122;
   int INT_MOSAIC = 123;
   int INT_MUSIC_NOTES = 124;
   int INT_NORTHWEST = 125;
   int INT_OVALS = 126;
   int INT_PACKAGES = 127;
   int INT_PALMS_BLACK = 128;
   int INT_PALMS_COLOR = 129;
   int INT_PAPER_CLIPS = 130;
   int INT_PAPYRUS = 131;
   int INT_PARTY_FAVOR = 132;
   int INT_PARTY_GLASS = 133;
   int INT_PENCILS = 134;
   int INT_PEOPLE = 135;
   int INT_PEOPLE_WAVING = 136;
   int INT_PEOPLE_HATS = 137;
   int INT_POINSETTIAS = 138;
   int INT_POSTAGE_STAMP = 139;
   int INT_PUMPKIN_1 = 140;
   int INT_PUSH_PIN_NOTE_2 = 141;
   int INT_PUSH_PIN_NOTE_1 = 142;
   int INT_PYRAMIDS = 143;
   int INT_PYRAMIDS_ABOVE = 144;
   int INT_QUADRANTS = 145;
   int INT_RINGS = 146;
   int INT_SAFARI = 147;
   int INT_SAWTOOTH = 148;
   int INT_SAWTOOTH_GRAY = 149;
   int INT_SCARED_CAT = 150;
   int INT_SEATTLE = 151;
   int INT_SHADOWED_SQUARES = 152;
   int INT_SHARKS_TEETH = 153;
   int INT_SHOREBIRD_TRACKS = 154;
   int INT_SKYROCKET = 155;
   int INT_SNOWFLAKE_FANCY = 156;
   int INT_SNOWFLAKES = 157;
   int INT_SOMBRERO = 158;
   int INT_SOUTHWEST = 159;
   int INT_STARS = 160;
   int INT_STARS_TOP = 161;
   int INT_STARS_3_D = 162;
   int INT_STARS_BLACK = 163;
   int INT_STARS_SHADOWED = 164;
   int INT_SUN = 165;
   int INT_SWIRLIGIG = 166;
   int INT_TORN_PAPER = 167;
   int INT_TORN_PAPER_BLACK = 168;
   int INT_TREES = 169;
   int INT_TRIANGLE_PARTY = 170;
   int INT_TRIANGLES = 171;
   int INT_TRIBAL_1 = 172;
   int INT_TRIBAL_2 = 173;
   int INT_TRIBAL_3 = 174;
   int INT_TRIBAL_4 = 175;
   int INT_TRIBAL_5 = 176;
   int INT_TRIBAL_6 = 177;
   int INT_TWISTED_LINES_1 = 178;
   int INT_TWISTED_LINES_2 = 179;
   int INT_VINE = 180;
   int INT_WAVELINE = 181;
   int INT_WEAVING_ANGLES = 182;
   int INT_WEAVING_BRAID = 183;
   int INT_WEAVING_RIBBON = 184;
   int INT_WEAVING_STRIPS = 185;
   int INT_WHITE_FLOWERS = 186;
   int INT_WOODWORK = 187;
   int INT_X_ILLUSIONS = 188;
   int INT_ZANY_TRIANGLES = 189;
   int INT_ZIG_ZAG = 190;
   int INT_ZIG_ZAG_STITCH = 191;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NIL = 1;
      static final int INT_NONE = 2;
      static final int INT_SINGLE = 3;
      static final int INT_THICK = 4;
      static final int INT_DOUBLE = 5;
      static final int INT_DOTTED = 6;
      static final int INT_DASHED = 7;
      static final int INT_DOT_DASH = 8;
      static final int INT_DOT_DOT_DASH = 9;
      static final int INT_TRIPLE = 10;
      static final int INT_THIN_THICK_SMALL_GAP = 11;
      static final int INT_THICK_THIN_SMALL_GAP = 12;
      static final int INT_THIN_THICK_THIN_SMALL_GAP = 13;
      static final int INT_THIN_THICK_MEDIUM_GAP = 14;
      static final int INT_THICK_THIN_MEDIUM_GAP = 15;
      static final int INT_THIN_THICK_THIN_MEDIUM_GAP = 16;
      static final int INT_THIN_THICK_LARGE_GAP = 17;
      static final int INT_THICK_THIN_LARGE_GAP = 18;
      static final int INT_THIN_THICK_THIN_LARGE_GAP = 19;
      static final int INT_WAVE = 20;
      static final int INT_DOUBLE_WAVE = 21;
      static final int INT_DASH_SMALL_GAP = 22;
      static final int INT_DASH_DOT_STROKED = 23;
      static final int INT_THREE_D_EMBOSS = 24;
      static final int INT_THREE_D_ENGRAVE = 25;
      static final int INT_OUTSET = 26;
      static final int INT_INSET = 27;
      static final int INT_APPLES = 28;
      static final int INT_ARCHED_SCALLOPS = 29;
      static final int INT_BABY_PACIFIER = 30;
      static final int INT_BABY_RATTLE = 31;
      static final int INT_BALLOONS_3_COLORS = 32;
      static final int INT_BALLOONS_HOT_AIR = 33;
      static final int INT_BASIC_BLACK_DASHES = 34;
      static final int INT_BASIC_BLACK_DOTS = 35;
      static final int INT_BASIC_BLACK_SQUARES = 36;
      static final int INT_BASIC_THIN_LINES = 37;
      static final int INT_BASIC_WHITE_DASHES = 38;
      static final int INT_BASIC_WHITE_DOTS = 39;
      static final int INT_BASIC_WHITE_SQUARES = 40;
      static final int INT_BASIC_WIDE_INLINE = 41;
      static final int INT_BASIC_WIDE_MIDLINE = 42;
      static final int INT_BASIC_WIDE_OUTLINE = 43;
      static final int INT_BATS = 44;
      static final int INT_BIRDS = 45;
      static final int INT_BIRDS_FLIGHT = 46;
      static final int INT_CABINS = 47;
      static final int INT_CAKE_SLICE = 48;
      static final int INT_CANDY_CORN = 49;
      static final int INT_CELTIC_KNOTWORK = 50;
      static final int INT_CERTIFICATE_BANNER = 51;
      static final int INT_CHAIN_LINK = 52;
      static final int INT_CHAMPAGNE_BOTTLE = 53;
      static final int INT_CHECKED_BAR_BLACK = 54;
      static final int INT_CHECKED_BAR_COLOR = 55;
      static final int INT_CHECKERED = 56;
      static final int INT_CHRISTMAS_TREE = 57;
      static final int INT_CIRCLES_LINES = 58;
      static final int INT_CIRCLES_RECTANGLES = 59;
      static final int INT_CLASSICAL_WAVE = 60;
      static final int INT_CLOCKS = 61;
      static final int INT_COMPASS = 62;
      static final int INT_CONFETTI = 63;
      static final int INT_CONFETTI_GRAYS = 64;
      static final int INT_CONFETTI_OUTLINE = 65;
      static final int INT_CONFETTI_STREAMERS = 66;
      static final int INT_CONFETTI_WHITE = 67;
      static final int INT_CORNER_TRIANGLES = 68;
      static final int INT_COUPON_CUTOUT_DASHES = 69;
      static final int INT_COUPON_CUTOUT_DOTS = 70;
      static final int INT_CRAZY_MAZE = 71;
      static final int INT_CREATURES_BUTTERFLY = 72;
      static final int INT_CREATURES_FISH = 73;
      static final int INT_CREATURES_INSECTS = 74;
      static final int INT_CREATURES_LADY_BUG = 75;
      static final int INT_CROSS_STITCH = 76;
      static final int INT_CUP = 77;
      static final int INT_DECO_ARCH = 78;
      static final int INT_DECO_ARCH_COLOR = 79;
      static final int INT_DECO_BLOCKS = 80;
      static final int INT_DIAMONDS_GRAY = 81;
      static final int INT_DOUBLE_D = 82;
      static final int INT_DOUBLE_DIAMONDS = 83;
      static final int INT_EARTH_1 = 84;
      static final int INT_EARTH_2 = 85;
      static final int INT_ECLIPSING_SQUARES_1 = 86;
      static final int INT_ECLIPSING_SQUARES_2 = 87;
      static final int INT_EGGS_BLACK = 88;
      static final int INT_FANS = 89;
      static final int INT_FILM = 90;
      static final int INT_FIRECRACKERS = 91;
      static final int INT_FLOWERS_BLOCK_PRINT = 92;
      static final int INT_FLOWERS_DAISIES = 93;
      static final int INT_FLOWERS_MODERN_1 = 94;
      static final int INT_FLOWERS_MODERN_2 = 95;
      static final int INT_FLOWERS_PANSY = 96;
      static final int INT_FLOWERS_RED_ROSE = 97;
      static final int INT_FLOWERS_ROSES = 98;
      static final int INT_FLOWERS_TEACUP = 99;
      static final int INT_FLOWERS_TINY = 100;
      static final int INT_GEMS = 101;
      static final int INT_GINGERBREAD_MAN = 102;
      static final int INT_GRADIENT = 103;
      static final int INT_HANDMADE_1 = 104;
      static final int INT_HANDMADE_2 = 105;
      static final int INT_HEART_BALLOON = 106;
      static final int INT_HEART_GRAY = 107;
      static final int INT_HEARTS = 108;
      static final int INT_HEEBIE_JEEBIES = 109;
      static final int INT_HOLLY = 110;
      static final int INT_HOUSE_FUNKY = 111;
      static final int INT_HYPNOTIC = 112;
      static final int INT_ICE_CREAM_CONES = 113;
      static final int INT_LIGHT_BULB = 114;
      static final int INT_LIGHTNING_1 = 115;
      static final int INT_LIGHTNING_2 = 116;
      static final int INT_MAP_PINS = 117;
      static final int INT_MAPLE_LEAF = 118;
      static final int INT_MAPLE_MUFFINS = 119;
      static final int INT_MARQUEE = 120;
      static final int INT_MARQUEE_TOOTHED = 121;
      static final int INT_MOONS = 122;
      static final int INT_MOSAIC = 123;
      static final int INT_MUSIC_NOTES = 124;
      static final int INT_NORTHWEST = 125;
      static final int INT_OVALS = 126;
      static final int INT_PACKAGES = 127;
      static final int INT_PALMS_BLACK = 128;
      static final int INT_PALMS_COLOR = 129;
      static final int INT_PAPER_CLIPS = 130;
      static final int INT_PAPYRUS = 131;
      static final int INT_PARTY_FAVOR = 132;
      static final int INT_PARTY_GLASS = 133;
      static final int INT_PENCILS = 134;
      static final int INT_PEOPLE = 135;
      static final int INT_PEOPLE_WAVING = 136;
      static final int INT_PEOPLE_HATS = 137;
      static final int INT_POINSETTIAS = 138;
      static final int INT_POSTAGE_STAMP = 139;
      static final int INT_PUMPKIN_1 = 140;
      static final int INT_PUSH_PIN_NOTE_2 = 141;
      static final int INT_PUSH_PIN_NOTE_1 = 142;
      static final int INT_PYRAMIDS = 143;
      static final int INT_PYRAMIDS_ABOVE = 144;
      static final int INT_QUADRANTS = 145;
      static final int INT_RINGS = 146;
      static final int INT_SAFARI = 147;
      static final int INT_SAWTOOTH = 148;
      static final int INT_SAWTOOTH_GRAY = 149;
      static final int INT_SCARED_CAT = 150;
      static final int INT_SEATTLE = 151;
      static final int INT_SHADOWED_SQUARES = 152;
      static final int INT_SHARKS_TEETH = 153;
      static final int INT_SHOREBIRD_TRACKS = 154;
      static final int INT_SKYROCKET = 155;
      static final int INT_SNOWFLAKE_FANCY = 156;
      static final int INT_SNOWFLAKES = 157;
      static final int INT_SOMBRERO = 158;
      static final int INT_SOUTHWEST = 159;
      static final int INT_STARS = 160;
      static final int INT_STARS_TOP = 161;
      static final int INT_STARS_3_D = 162;
      static final int INT_STARS_BLACK = 163;
      static final int INT_STARS_SHADOWED = 164;
      static final int INT_SUN = 165;
      static final int INT_SWIRLIGIG = 166;
      static final int INT_TORN_PAPER = 167;
      static final int INT_TORN_PAPER_BLACK = 168;
      static final int INT_TREES = 169;
      static final int INT_TRIANGLE_PARTY = 170;
      static final int INT_TRIANGLES = 171;
      static final int INT_TRIBAL_1 = 172;
      static final int INT_TRIBAL_2 = 173;
      static final int INT_TRIBAL_3 = 174;
      static final int INT_TRIBAL_4 = 175;
      static final int INT_TRIBAL_5 = 176;
      static final int INT_TRIBAL_6 = 177;
      static final int INT_TWISTED_LINES_1 = 178;
      static final int INT_TWISTED_LINES_2 = 179;
      static final int INT_VINE = 180;
      static final int INT_WAVELINE = 181;
      static final int INT_WEAVING_ANGLES = 182;
      static final int INT_WEAVING_BRAID = 183;
      static final int INT_WEAVING_RIBBON = 184;
      static final int INT_WEAVING_STRIPS = 185;
      static final int INT_WHITE_FLOWERS = 186;
      static final int INT_WOODWORK = 187;
      static final int INT_X_ILLUSIONS = 188;
      static final int INT_ZANY_TRIANGLES = 189;
      static final int INT_ZIG_ZAG = 190;
      static final int INT_ZIG_ZAG_STITCH = 191;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STBorder.Enum[]{new STBorder.Enum("nil", 1), new STBorder.Enum("none", 2), new STBorder.Enum("single", 3), new STBorder.Enum("thick", 4), new STBorder.Enum("double", 5), new STBorder.Enum("dotted", 6), new STBorder.Enum("dashed", 7), new STBorder.Enum("dotDash", 8), new STBorder.Enum("dotDotDash", 9), new STBorder.Enum("triple", 10), new STBorder.Enum("thinThickSmallGap", 11), new STBorder.Enum("thickThinSmallGap", 12), new STBorder.Enum("thinThickThinSmallGap", 13), new STBorder.Enum("thinThickMediumGap", 14), new STBorder.Enum("thickThinMediumGap", 15), new STBorder.Enum("thinThickThinMediumGap", 16), new STBorder.Enum("thinThickLargeGap", 17), new STBorder.Enum("thickThinLargeGap", 18), new STBorder.Enum("thinThickThinLargeGap", 19), new STBorder.Enum("wave", 20), new STBorder.Enum("doubleWave", 21), new STBorder.Enum("dashSmallGap", 22), new STBorder.Enum("dashDotStroked", 23), new STBorder.Enum("threeDEmboss", 24), new STBorder.Enum("threeDEngrave", 25), new STBorder.Enum("outset", 26), new STBorder.Enum("inset", 27), new STBorder.Enum("apples", 28), new STBorder.Enum("archedScallops", 29), new STBorder.Enum("babyPacifier", 30), new STBorder.Enum("babyRattle", 31), new STBorder.Enum("balloons3Colors", 32), new STBorder.Enum("balloonsHotAir", 33), new STBorder.Enum("basicBlackDashes", 34), new STBorder.Enum("basicBlackDots", 35), new STBorder.Enum("basicBlackSquares", 36), new STBorder.Enum("basicThinLines", 37), new STBorder.Enum("basicWhiteDashes", 38), new STBorder.Enum("basicWhiteDots", 39), new STBorder.Enum("basicWhiteSquares", 40), new STBorder.Enum("basicWideInline", 41), new STBorder.Enum("basicWideMidline", 42), new STBorder.Enum("basicWideOutline", 43), new STBorder.Enum("bats", 44), new STBorder.Enum("birds", 45), new STBorder.Enum("birdsFlight", 46), new STBorder.Enum("cabins", 47), new STBorder.Enum("cakeSlice", 48), new STBorder.Enum("candyCorn", 49), new STBorder.Enum("celticKnotwork", 50), new STBorder.Enum("certificateBanner", 51), new STBorder.Enum("chainLink", 52), new STBorder.Enum("champagneBottle", 53), new STBorder.Enum("checkedBarBlack", 54), new STBorder.Enum("checkedBarColor", 55), new STBorder.Enum("checkered", 56), new STBorder.Enum("christmasTree", 57), new STBorder.Enum("circlesLines", 58), new STBorder.Enum("circlesRectangles", 59), new STBorder.Enum("classicalWave", 60), new STBorder.Enum("clocks", 61), new STBorder.Enum("compass", 62), new STBorder.Enum("confetti", 63), new STBorder.Enum("confettiGrays", 64), new STBorder.Enum("confettiOutline", 65), new STBorder.Enum("confettiStreamers", 66), new STBorder.Enum("confettiWhite", 67), new STBorder.Enum("cornerTriangles", 68), new STBorder.Enum("couponCutoutDashes", 69), new STBorder.Enum("couponCutoutDots", 70), new STBorder.Enum("crazyMaze", 71), new STBorder.Enum("creaturesButterfly", 72), new STBorder.Enum("creaturesFish", 73), new STBorder.Enum("creaturesInsects", 74), new STBorder.Enum("creaturesLadyBug", 75), new STBorder.Enum("crossStitch", 76), new STBorder.Enum("cup", 77), new STBorder.Enum("decoArch", 78), new STBorder.Enum("decoArchColor", 79), new STBorder.Enum("decoBlocks", 80), new STBorder.Enum("diamondsGray", 81), new STBorder.Enum("doubleD", 82), new STBorder.Enum("doubleDiamonds", 83), new STBorder.Enum("earth1", 84), new STBorder.Enum("earth2", 85), new STBorder.Enum("eclipsingSquares1", 86), new STBorder.Enum("eclipsingSquares2", 87), new STBorder.Enum("eggsBlack", 88), new STBorder.Enum("fans", 89), new STBorder.Enum("film", 90), new STBorder.Enum("firecrackers", 91), new STBorder.Enum("flowersBlockPrint", 92), new STBorder.Enum("flowersDaisies", 93), new STBorder.Enum("flowersModern1", 94), new STBorder.Enum("flowersModern2", 95), new STBorder.Enum("flowersPansy", 96), new STBorder.Enum("flowersRedRose", 97), new STBorder.Enum("flowersRoses", 98), new STBorder.Enum("flowersTeacup", 99), new STBorder.Enum("flowersTiny", 100), new STBorder.Enum("gems", 101), new STBorder.Enum("gingerbreadMan", 102), new STBorder.Enum("gradient", 103), new STBorder.Enum("handmade1", 104), new STBorder.Enum("handmade2", 105), new STBorder.Enum("heartBalloon", 106), new STBorder.Enum("heartGray", 107), new STBorder.Enum("hearts", 108), new STBorder.Enum("heebieJeebies", 109), new STBorder.Enum("holly", 110), new STBorder.Enum("houseFunky", 111), new STBorder.Enum("hypnotic", 112), new STBorder.Enum("iceCreamCones", 113), new STBorder.Enum("lightBulb", 114), new STBorder.Enum("lightning1", 115), new STBorder.Enum("lightning2", 116), new STBorder.Enum("mapPins", 117), new STBorder.Enum("mapleLeaf", 118), new STBorder.Enum("mapleMuffins", 119), new STBorder.Enum("marquee", 120), new STBorder.Enum("marqueeToothed", 121), new STBorder.Enum("moons", 122), new STBorder.Enum("mosaic", 123), new STBorder.Enum("musicNotes", 124), new STBorder.Enum("northwest", 125), new STBorder.Enum("ovals", 126), new STBorder.Enum("packages", 127), new STBorder.Enum("palmsBlack", 128), new STBorder.Enum("palmsColor", 129), new STBorder.Enum("paperClips", 130), new STBorder.Enum("papyrus", 131), new STBorder.Enum("partyFavor", 132), new STBorder.Enum("partyGlass", 133), new STBorder.Enum("pencils", 134), new STBorder.Enum("people", 135), new STBorder.Enum("peopleWaving", 136), new STBorder.Enum("peopleHats", 137), new STBorder.Enum("poinsettias", 138), new STBorder.Enum("postageStamp", 139), new STBorder.Enum("pumpkin1", 140), new STBorder.Enum("pushPinNote2", 141), new STBorder.Enum("pushPinNote1", 142), new STBorder.Enum("pyramids", 143), new STBorder.Enum("pyramidsAbove", 144), new STBorder.Enum("quadrants", 145), new STBorder.Enum("rings", 146), new STBorder.Enum("safari", 147), new STBorder.Enum("sawtooth", 148), new STBorder.Enum("sawtoothGray", 149), new STBorder.Enum("scaredCat", 150), new STBorder.Enum("seattle", 151), new STBorder.Enum("shadowedSquares", 152), new STBorder.Enum("sharksTeeth", 153), new STBorder.Enum("shorebirdTracks", 154), new STBorder.Enum("skyrocket", 155), new STBorder.Enum("snowflakeFancy", 156), new STBorder.Enum("snowflakes", 157), new STBorder.Enum("sombrero", 158), new STBorder.Enum("southwest", 159), new STBorder.Enum("stars", 160), new STBorder.Enum("starsTop", 161), new STBorder.Enum("stars3d", 162), new STBorder.Enum("starsBlack", 163), new STBorder.Enum("starsShadowed", 164), new STBorder.Enum("sun", 165), new STBorder.Enum("swirligig", 166), new STBorder.Enum("tornPaper", 167), new STBorder.Enum("tornPaperBlack", 168), new STBorder.Enum("trees", 169), new STBorder.Enum("triangleParty", 170), new STBorder.Enum("triangles", 171), new STBorder.Enum("tribal1", 172), new STBorder.Enum("tribal2", 173), new STBorder.Enum("tribal3", 174), new STBorder.Enum("tribal4", 175), new STBorder.Enum("tribal5", 176), new STBorder.Enum("tribal6", 177), new STBorder.Enum("twistedLines1", 178), new STBorder.Enum("twistedLines2", 179), new STBorder.Enum("vine", 180), new STBorder.Enum("waveline", 181), new STBorder.Enum("weavingAngles", 182), new STBorder.Enum("weavingBraid", 183), new STBorder.Enum("weavingRibbon", 184), new STBorder.Enum("weavingStrips", 185), new STBorder.Enum("whiteFlowers", 186), new STBorder.Enum("woodwork", 187), new STBorder.Enum("xIllusions", 188), new STBorder.Enum("zanyTriangles", 189), new STBorder.Enum("zigZag", 190), new STBorder.Enum("zigZagStitch", 191)});
      private static final long serialVersionUID = 1L;


      public static STBorder.Enum forString(String var0) {
         return (STBorder.Enum)table.forString(var0);
      }

      public static STBorder.Enum forInt(int var0) {
         return (STBorder.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STBorder newValue(Object var0) {
         return (STBorder)STBorder.type.newValue(var0);
      }

      public static STBorder newInstance() {
         return (STBorder)POIXMLTypeLoader.newInstance(STBorder.type, (XmlOptions)null);
      }

      public static STBorder newInstance(XmlOptions var0) {
         return (STBorder)POIXMLTypeLoader.newInstance(STBorder.type, var0);
      }

      public static STBorder parse(String var0) throws XmlException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(String var0, XmlOptions var1) throws XmlException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static STBorder parse(File var0) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static STBorder parse(URL var0) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static STBorder parse(InputStream var0) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static STBorder parse(Reader var0) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static STBorder parse(XMLStreamReader var0) throws XmlException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static STBorder parse(Node var0) throws XmlException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(Node var0, XmlOptions var1) throws XmlException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static STBorder parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, (XmlOptions)null);
      }

      public static STBorder parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STBorder)POIXMLTypeLoader.parse(var0, STBorder.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBorder.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBorder.type, var1);
      }

   }
}
