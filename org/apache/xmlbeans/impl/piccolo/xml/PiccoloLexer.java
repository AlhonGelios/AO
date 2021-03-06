package org.apache.xmlbeans.impl.piccolo.xml;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Stack;
import org.apache.xmlbeans.impl.piccolo.io.IllegalCharException;
import org.apache.xmlbeans.impl.piccolo.util.CharStringConverter;
import org.apache.xmlbeans.impl.piccolo.util.IndexedObject;
import org.apache.xmlbeans.impl.piccolo.util.LongStack;
import org.apache.xmlbeans.impl.piccolo.util.RecursionException;
import org.apache.xmlbeans.impl.piccolo.util.StringStack;
import org.apache.xmlbeans.impl.piccolo.xml.AttributeDefinition;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.apache.xmlbeans.impl.piccolo.xml.ElementDefinition;
import org.apache.xmlbeans.impl.piccolo.xml.Entity;
import org.apache.xmlbeans.impl.piccolo.xml.EntityManager;
import org.apache.xmlbeans.impl.piccolo.xml.FastNamespaceSupport;
import org.apache.xmlbeans.impl.piccolo.xml.FatalParsingException;
import org.apache.xmlbeans.impl.piccolo.xml.Piccolo;
import org.xml.sax.SAXException;

final class PiccoloLexer {

   public static final int YYEOF = -1;
   private static final int YY_BUFFERSIZE = 16384;
   public static final int DTD_TAG_START = 31;
   public static final int CLOSE_TAG_NS = 20;
   public static final int DTD_IGNORE = 28;
   public static final int PI = 4;
   public static final int DTD_TAG_SQSTRING_BUFFERED = 35;
   public static final int TAG_VALUE_ENTITY = 11;
   public static final int ENTITYREF = 3;
   public static final int DTD_ATT_NAME = 23;
   public static final int DTD_TAG = 30;
   public static final int DTD_TAG_VALUE_EXTERNAL_ENTITY = 33;
   public static final int TAG = 6;
   public static final int TAG_VALUE_ENTITYREF = 12;
   public static final int YYINITIAL = 0;
   public static final int DTD_TAG_VALUE_PARAM_ENTITYREF = 37;
   public static final int TAG_NS = 8;
   public static final int DTD_NMTOKENS = 26;
   public static final int TAG_SQSTRING_NORMALIZE = 16;
   public static final int DTD_PUBLIC_ID = 29;
   public static final int XML_TAG = 1;
   public static final int TAG_QSTRING_NORMALIZE = 15;
   public static final int TAG_START = 7;
   public static final int DTD_COMMENT = 27;
   public static final int DTD_TAG_VALUE_ENTITY = 32;
   public static final int TAG_QSTRING_CDATA_BUFFERED = 13;
   public static final int TAG_SQSTRING_CDATA_BUFFERED = 14;
   public static final int DTD_TAG_VALUE_STD_ENTITYREF = 36;
   public static final int PI_WS = 5;
   public static final int DTD_TAG_QSTRING_BUFFERED = 34;
   public static final int TAG_START_NS = 9;
   public static final int DTD_ATTLIST_ELEMENT = 22;
   public static final int DTD_ATT_TYPE = 24;
   public static final int DTD_ENTITY_DECL = 25;
   public static final int TAG_QSTRING_NORMALIZE_BUFFERED = 17;
   public static final int TAG_SQSTRING_NORMALIZE_BUFFERED = 18;
   public static final int TAG_VALUE = 10;
   public static final int CLOSE_TAG = 19;
   public static final int YYINITIAL_DIRECT = 2;
   public static final int DTD = 21;
   private static final String yycmap_packed = "\t :  4,5(/012!6\n\t\n9\f+#$&.\' )-%*\"   ;BA7?<=8@>\r 3: \b\b   :  \b 5 D\t $  8 Y  \b. F\b \b$ \b   ,      \r \f B \f $ \b\t 5    \b 7 &  &\n \b \b \b \b \b \b  .  \b\n\b\b\r \n\b \bG    \b\b \b \n\bȇ \b 5 \b\b \b \n\b \n\b \b \b      \b \b \b \b\t \b  \b \n\b \b        \b \b \b \b   \n\b\b\f \b        \b\b\b \b \b  \n\b \b \b      \b\b \b \b\b \b   \n\b \b         \b  \b \b \b\t \b \t\b \b \b   \n  \b \b \b \b\t  \n\b \b \b   \n  \b \b \b \b   \n\b \b \b    \b \b \b\t \b\b  \n\b . \b\b \b\b\b \n\b\'             \b\b \b  \b \b \n\b> \b \n\b \b \b \b \b\b ! \b \b \b \b \b \b \bæ &\n \'\t      )                ( \t      (  \b ఆ  Z   &  \b     5       \r  Ó \r\b \bD   Q ຂ \b  \t\b \b T \b \b Z \b (᳓ 冦ౚ ⮤⡜ ";
   private static final char[] yycmap = yy_unpack_cmap("\t :  4,5(/012!6\n\t\n9\f+#$&.\' )-%*\"   ;BA7?<=8@>\r 3: \b\b   :  \b 5 D\t $  8 Y  \b. F\b \b$ \b   ,      \r \f B \f $ \b\t 5    \b 7 &  &\n \b \b \b \b \b \b  .  \b\n\b\b\r \n\b \bG    \b\b \b \n\bȇ \b 5 \b\b \b \n\b \n\b \b \b      \b \b \b \b\t \b  \b \n\b \b        \b \b \b \b   \n\b\b\f \b        \b\b\b \b \b  \n\b \b \b      \b\b \b \b\b \b   \n\b \b         \b  \b \b \b\t \b \t\b \b \b   \n  \b \b \b \b\t  \n\b \b \b   \n  \b \b \b \b   \n\b \b \b    \b \b \b\t \b\b  \n\b . \b\b \b\b\b \n\b\'             \b\b \b  \b \b \n\b> \b \n\b \b \b \b \b\b ! \b \b \b \b \b \b \bæ &\n \'\t      )                ( \t      (  \b ఆ  Z   &  \b     5       \r  Ó \r\b \bD   Q ຂ \b  \t\b \b T \b \b Z \b (᳓ 冦ౚ ⮤⡜ ");
   private static final int[] yy_rowMap = new int[]{0, 67, 134, 201, 268, 335, 402, 469, 536, 603, 670, 737, 804, 871, 938, 1005, 1072, 1139, 1206, 1273, 1340, 1407, 1474, 1541, 1608, 1675, 1742, 1809, 1876, 1943, 2010, 2077, 2144, 2211, 2278, 2345, 2412, 2479, 2546, 2546, 2546, 2546, 2613, 2680, 2546, 2546, 2747, 2814, 2881, 2948, 3015, 3082, 3149, 3216, 3283, 3350, 3417, 3484, 2546, 3551, 3618, 3685, 3752, 3819, 3886, 3953, 4020, 2546, 4087, 4154, 4221, 4288, 4355, 4422, 4489, 2546, 2546, 4556, 4623, 4690, 4757, 4824, 4891, 4958, 5025, 2546, 5092, 5159, 5226, 5293, 2546, 5360, 5427, 5494, 2546, 5561, 5628, 2546, 5695, 5762, 5829, 5896, 2546, 5963, 2546, 6030, 2546, 6097, 6164, 6231, 6298, 6365, 6432, 2546, 6499, 6566, 6633, 6700, 2546, 6767, 6834, 6901, 2546, 2546, 6968, 7035, 7102, 7169, 7236, 7303, 7370, 7437, 2546, 7504, 7571, 7638, 7705, 7772, 7839, 2546, 7906, 7973, 2546, 2546, 2546, 2546, 8040, 8107, 8174, 8241, 8308, 2546, 2546, 8375, 8442, 8509, 8576, 2546, 2546, 2546, 8643, 8710, 8777, 2613, 2680, 2546, 2747, 2546, 8844, 8911, 8978, 9045, 9112, 9179, 9246, 3149, 3216, 2546, 2546, 2546, 9313, 9380, 9447, 9514, 9581, 9648, 9715, 9782, 9849, 2546, 9916, 9983, 10050, 4355, 4422, 2546, 2546, 4556, 2546, 10117, 10184, 10251, 10318, 10385, 10452, 10519, 2546, 5360, 2546, 5695, 2546, 5896, 5963, 10586, 10653, 2546, 10720, 10787, 10854, 10921, 10988, 11055, 11122, 11189, 11256, 6968, 7035, 11323, 11390, 7303, 2546, 7370, 11457, 11524, 11591, 11658, 11725, 11792, 11859, 11926, 11993, 12060, 12127, 12194, 2546, 12261, 12328, 12395, 12462, 12529, 12596, 12663, 2546, 8710, 2546, 8777, 2546, 2546, 2546, 12730, 12797, 12864, 12931, 2546, 12998, 13065, 13132, 13199, 13266, 13333, 13400, 13467, 13534, 2546, 2546, 13601, 13668, 13735, 13802, 2546, 2546, 2546, 2546, 13869, 13936, 14003, 14070, 14137, 14204, 2546, 2546, 14271, 14338, 14405, 14472, 14539, 6901, 14606, 14673, 14740, 14807, 14874, 14941, 15008, 15075, 15142, 15209, 15276, 15343, 2546, 2546, 2546, 15410, 15477, 15544, 15611, 15678, 15745, 15812, 15879, 15946, 2546, 2546, 16013, 16080, 16147, 16214, 16281, 16348, 16415, 16482, 16549, 16616, 16683, 16750, 16817, 16884, 16951, 17018, 17085, 17152, 17219, 17286, 17353, 17420, 17487, 17554, 2546, 2546, 2546, 2546, 17621, 17688, 17755, 17822, 2546, 2546, 17889, 17956, 18023, 18090, 2546, 6901, 18157, 6901, 18224, 18291, 18358, 18425, 18492, 18559, 18626, 18693, 2546, 18760, 18827, 18894, 18961, 2546, 19028, 19095, 19162, 19229, 19296, 19363, 2546, 19430, 19497, 2546, 19564, 19631, 6901, 6901, 6901, 19698, 19765, 2546, 19832, 19899, 19966, 20033, 20100, 20167, 20234, 20301, 2546, 2546, 20368, 20435, 20502, 20569, 6901, 20636, 20703, 2546, 20770, 2546, 20837, 20904, 2546, 20971, 2546, 2546, 2546, 6901, 2546, 21038, 2546, 21105, 2546, 20971, 2546, 2546};
   private static final String yy_packed0 = "\'(\'(\')*\'()\'(\b\'\f+,6+\n-)*7-./././0./.\b/././1/\b./.2/3/4/\f5665.7.7.8.7).7\t.9.:.9:.:9:;.\b:.:.:.:.<:.9\b:.=.=.>=.=.?\b=.=.=.=.@=.\b=.9.AB.9B.CB9BD.\bB.B.B.B.EB.9\bB.FG.G.>G.G.?\bG.G.G.G.HG.\bG.I.I\t.I(.JI\b.KLKLK.M.KL\bK.N.N.NO.N.\bN.N.NPN\b.N.QNRNSNTUTUT.V(TWTU\bTXUXUX.V)XWXU\bXYZYZY.[YZ#Y\\YZ\bY]^]^]._]^$]\\]^\b]`a`a`.b`a#`c`a\b`deded.bde$dcde\bd.f.f\t.f.g%.f\t.h.h\t.h.i%.h\t.j.j.k.j.l.m\".j\t.j.n.jn.njn.o.\bn.n.n.n\b.n.j\bn.j.pq.jq.qjqro.\bq.q.q.q\b.q.j\bq.j.j\t.j.o.st.u.v.w.j\t.j.x.jx.xjx.y.\bx.x.x.x\b.x.j\bx.jz.jz.zjz.o.\tz.z.z.z{.|.z.j\bz!}~!}\n\f+.j.j\t.j#..j\t..z.z.zzro.zzz.zzz|.z.\bz\f..*.\t-\t)\b\t ¡\t¡¡ \r¡.¢.¢.¢.¢.\b¢.¢.¢P¢\b.¢.\b¢.£.£.£.£.\b£.£.£.£\b.£.\b£C \f¤¥B¤¥¤¦.¤ § § § § ¨ \t§ § § §\b § \b§ § § § § ¨ \t§ § § §\b § §©§\t ª «7 § § §¬§ § ¨ \t§ § § §\b § §­§ § § § § ¨ \t§ § § §\b § §®§ § § § § ¨ \t§ § § §\b § §¯§\f°±B°±°².° 7 7\t 7) 7 ³/ 9 9\t 9) 9\n : : : : \t: : : :\b : \b: ´0 = = = = \t= = = =\b = \b= µ µ ¶µ ·µ \bµ µ µ µ\b µ \bµ! ¸¹ º! » » » » \b» » » »\b » \b» A A A A \tA A A A\b A \bA B¼B B B B \tB B B B\b B \bB B¼B B B½B B \tB B B B\b B \bB ¾0 F F F F \tF F F F\b F \bF G¿G G G G \tG G G G\b G \bG ÀÁ Á Á Á \bÁ Á Á Á\b Á \bÁ Â Â\t Â( ÃÂ\t Ã Ã\t Ã# ÄÅ Ã\b K K K .K \bK Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ \bÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÈÆ\t É Ê7 Æ Æ ÆËÆ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÌÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÍÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÎÆT T T (T T \bT U U3 U\t Ï Ï\t Ï Ï! Ï Ï\b X X X )X X \bXY Y Y Y #Y Y \bY Z Z\t Z# Ð Z\t Ñ Ñ\t Ñ Ñ! Ñ Ñ\b ] ] ] ] $] ] \b] ^ ^\t ^$ Ð ^\b ` ` ` ` #` ` \b` a a\t a# Ò a\t Ó Ó\t Ó Ó! Ó Ó\b d d d d $d d \bd e e\t e$ Ò e\t Ô Ô\t Ô g% Ô\t Õ Õ\t Õ i% Õ\t j j\t j) j Ö Ö Ö Ö \bÖ Ö Ö Ö\b Ö \bÖ × ×\t × Ø Ù\" ×\n n n n n \tn n n n\b n \bn Ú Ú Ú Ú \bÚ Ú Ú Ú\b Ú \bÚ p p p p \tp p p p\b p \bp qÛq q q q \tq q q q\b q \bq Ü: Ý\r ÞF ßB à  x x x x \tx x x x\b x \bx á Ú Ú ÚáÚ \bÚ Ú Ú Ú\b Ú á\bÚ z z z z \tz z z z\b z \bz!âãBâä!â\n \f + åA Ù- æ æ \bæ æ \næ æ çæ è è \bè è \nè è ç\rè  \t   \n z z z zéz \tz z z z\b z \bz z z z z zêz zëz z z\b z \bz z z z z zìz z z zí\b z \bz z z z z zîz z z z\b z \bz z z z z zïz z z z\b z \bz  \t ) \n z z z z \tz z zðz z\b z \bz ñ\b òó ô  \t õ \t õ\r ö ö ÷ö øö \bö ö ö ö\b ö \bö ùú û üý   \t - \t -  \t ) \b   $\b \t  ¡ \t¡ ¡ \r¡ þ þ þ þ ÿ \tþ þ þ þ\b þ \bþ Ā Ā Ā Ā ā \tĀ Ā Ā Ā\b Ā \bĀ § § § § Ă \t§ § § §\b § \b§\t ª\f ă5 Ą Ą Ą Ą Ą Ą Ą Ą § § § § ¨ \t§ § § §\b § §ą§ § § § § ¨ \t§ § § §\b § §Ć§ § § § § ¨ \t§ § § §\b § §ć§ § § § § Ĉ \t§ § § §\b § \b§ µ µ µ µ \tµ µ µ µ\b µ \bµ µ µ µĉµ µĊµ \tµ µ µ µ\b µ \bµ µ µ µĊµ µĊµ \tµ µ µ µ\b µ \bµ! ċD Č? č$ » » » » \t» » » »\b » \b» AĎ ĎA Ď Ď \bĎA Ď Ď Ď\b Ď \bĎ B¼B B Bď B \tB B B B\b B \bB FĐ ĐF Đ Đ \bĐF Đ Đ Đ\b Đ \bĐ À À À À \tÀ À À À\b À \bÀ ÁđÁ Á Á Á \tÁ Á Á Á\b Á \bÁ Æ Æ Æ Æ Ē \tÆ Æ Æ Æ\b Æ \bÆ\t É\f ē5 Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆĕÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆĖÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆėÆ Æ Æ Æ Æ Ę \tÆ Æ Æ Æ\b Æ \bÆ Ö Ö Ö Ö ę \tÖ Ö Ö Ö\b Ö \bÖ × ×\t × Ø% × Ě0 Ú Ú Ú Ú ě \tÚ Ú Ú Ú\b Ú \bÚ pĜ Ĝp Ĝ Ĝ \bĜp Ĝ Ĝ Ĝ\b Ĝ \bĜ ĝB ĞB ğL Ġ; ġ% á á) á ĢP ģ\" z z z z \tz z Ĥz z\b z \bz z z z z zĥz z z z\b z \bz z z z z zĦz z z z\b z \bz z z z z \tz ħz z z\b z \bz z z z z zĨz z z z\b z \bz z z z z zĩz z z z\b z \bz z z z z zĪz z z z\b z \bz z z z z \tz z zī z\b z \bz ĬI ĭE ĮI į! ö ö ö ö \tö ö ö ö\b ö \bö ö ö öİö öıö \tö ö ö ö\b ö \bö ö ö öıö öıö \tö ö ö ö\b ö \bö Ĳ ĳH Ĵ= ĵH Ķ* Ą\f ķ Ą Ą Ą Ą Ą Ą Ą § § § § ĸ \t§ § § §\b § \b§ § § § § ¨ \t§ § § §\b §Ĺ \b§ § § § § ¨ \t§ § § §\b § §ĺ§ µ µ µĻ µļ \tµ µ µ µ\b µ \bµ µ µ µļ µļ \tµ µ µ µ\b µ \bµ!ċĽ!ċ$ ľA Ŀ! ĎAĎ Ď Ď Ď \tĎ Ď Ď Ď\b Ď \bĎ B¼B B B B \tB B B B\b ŀB \bB ĐFĐ Đ Đ Đ \tĐ Đ Đ Đ\b Đ \bĐ ÀŁ ŁÀ Ł Ł \bŁÀ Ł Ł Ł\b Ł \bŁ\t Ĕ\f ł Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Æ Æ Æ Æ Ń \tÆ Æ Æ Æ\b Æ \bÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æń \bÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆŅÆ ĜpĜ Ĝ Ĝ Ĝ \tĜ Ĝ Ĝ Ĝ\b Ĝ \bĜ ņF Ň@ ň= ŉD Ŋ) z z z z zŋz z z z\b z \bz z z z z zŌz z z z\b z \bz z z z z zōz z z z\b z \bz z z z zŎ \tz z z z\b z \bz z z z z zŏz z z z\b z \bz z z z z zŐz z z z\b z \bz z z z ző \tz z z z\b z \bz) ŒF œ& ŔU ŕ  ö ö öŖ öŗ \tö ö ö ö\b ö \bö ö ö öŗ öŗ \tö ö ö ö\b ö \bö ŘD řB ŚB ś) § § § § Ŝ \t§ § § §\b § \b§ § § § § ŝ \t§ § § §\b § \b§ Şµ şµ ŞµŞµ \tµ µ µ µ\b µ Ş\bµ şµ şµ şµşµ \tµ µ µ µ\b µ ş\bµ!ċŠ!ċ š? Ţ) B¼B B B B \tB B B B\b Bţ \bB ŁÀŁ Ł Ł Ł \tŁ Ł Ł Ł\b Ł \bŁ Æ Æ Æ Æ Ť \tÆ Æ Æ Æ\b Æ \bÆ Æ Æ Æ Æ ť \tÆ Æ Æ Æ\b Æ \bÆ ŦN ŧ6 ŨM ũ: Ū& z z z z zūz z z z\b z \bz z z z z zŬz z z z\b z \bz z z z z zŭz z z z\b z \bz z z z z \tz z zŮz z\b z \bz z z z z \tz zůz z z\b z \bz z z z z Ű\bz z z z\b z \bz z z z z zűz z z z\b z \bz ŲY ų1 ŴG ŵ% Ŷö şö ŶöŶö \tö ö ö ö\b ö Ŷ\bö şö şö şöşö \tö ö ö ö\b ö ş\bö ŷL ŸD Ź7 źC ŻI żD Ž& žBſB žB BžB \tB B B B\b Bƀž\bB ƁƂ> ƃE ƄE ƅ% z z z z zƆz z z z\b z \bz z z z z \tz zƇz z z\b z \bz z z z z ƈ\bz z z z\b z \bz z z z zƉz \tz z z z\b z \bz z z z z \tz Ɗz z z\b z \bz ƋB ƌJ ƍ9 Ǝ@ ƏD ƐB ƑC ƒD ƓM Ɣ ž ž\t ž( ƀž\n Aƕ ƕA ƕ ƕ \bƕA ƕ ƕ ƕ\b ƕ \bƕ ƀ ƀ\t ƀ# ƖƗ ƀ! ƘC ƙH ƚ$ z z z z zƛz z z z\b z \bz z z z z Ɯ\bz z z z\b z \bz ƝN ƞ; Ɵ> ƠE ơA ƢE ƣE Ƥ9 ƥ+ ƕAƕ ƕ ƕ ƕ \tƕ ƕ ƕ ƕ\b ƕ \bƕ ƦB Ƨ= ƨ* z z z z zƩz z z z\b z \bz$ ƪ7 ƫD ƬG ƭ= Ʈ( Ư Ư) Ư, ư8 Ʊ( ";
   private static final int[] yytrans = yy_unpack();
   private static final int YY_UNKNOWN_ERROR = 0;
   private static final int YY_ILLEGAL_STATE = 1;
   private static final int YY_NO_MATCH = 2;
   private static final int YY_PUSHBACK_2BIG = 3;
   private static final int YY_SKIP_2BIG = 4;
   private static final String[] YY_ERROR_MSG = new String[]{"Unkown internal scanner error", "Internal error: unknown state", "Error: could not match input", "Error: pushback value was too large", "Error: skip value was too large"};
   private static final byte[] YY_ATTRIBUTE = new byte[]{(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)0, (byte)1, (byte)0, (byte)0, (byte)1, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)1, (byte)1, (byte)1, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)9, (byte)9, (byte)9, (byte)9, (byte)1, (byte)1, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)3, (byte)1, (byte)1, (byte)1, (byte)9, (byte)3, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)9, (byte)3, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)9, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)9, (byte)9, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)9, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)9, (byte)9, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)13, (byte)2, (byte)13, (byte)2, (byte)13, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)9, (byte)0, (byte)9, (byte)9, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)9, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)9, (byte)9, (byte)9, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)9, (byte)9, (byte)0, (byte)0, (byte)3, (byte)3, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)9, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)3, (byte)3, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)9, (byte)13, (byte)13, (byte)0, (byte)0, (byte)0, (byte)1, (byte)9, (byte)9, (byte)0, (byte)0, (byte)0, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)13, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)9, (byte)9, (byte)0, (byte)1, (byte)0, (byte)1, (byte)1, (byte)0, (byte)0, (byte)9, (byte)0, (byte)9, (byte)0, (byte)0, (byte)9, (byte)0, (byte)9, (byte)9, (byte)9, (byte)1, (byte)9, (byte)0, (byte)9, (byte)0, (byte)9, (byte)1, (byte)9, (byte)9};
   private Reader yy_reader;
   private int yy_state;
   private int yy_lexical_state;
   private char[] yy_buffer;
   private char[] yy_saved_buffer;
   private int yy_markedPos;
   private int yy_savePos;
   private int yy_pushbackPos;
   private int yy_currentPos;
   private int yy_startRead;
   private int yy_endRead;
   private int yyline;
   private int yychar;
   private int yycolumn;
   private boolean yy_atBOL;
   private boolean yy_atEOF;
   private Stack yy_streams;
   private boolean yy_eof_done;
   Piccolo parser;
   Entity currentEntity;
   CharStringConverter stringConverter;
   EntityManager entityManager;
   Stack entityStack;
   AttributesHolder attribs;
   char[] cbuf;
   int cbuflen;
   String stringValue;
   char[] oneCharBuffer;
   char[] cdataBuffer;
   int cdataStart;
   int cdataLength;
   private LongStack entityStateStack;
   private StringStack entityNameStack;
   private String currentEntityName;
   private int prevEntityLexState;
   private boolean returnEntityEndToken;
   private boolean isParamEntity;
   private int entityBaseDepth;
   private boolean isEntityBeingParsed;
   private boolean inCdataSection;
   private int baseState;
   private int prevState;
   private int piPrevState;
   private boolean isNamespaceDeclaration;
   private boolean entityWasSkipped;
   private int tagState;
   private int tagStartState;
   private boolean tokenizeInput;
   private StringStack tagStack;
   private boolean bypassPERefs;
   private boolean bypassGERefs;
   private boolean needsNormalization;
   private int tagType;
   private boolean endOfTag;
   private HashMap elementMap;
   private ElementDefinition elementDefinition;
   private String elementURI;
   private String elementLocalName;
   private String elementQName;
   private String attributeURI;
   private String attributeLocalName;
   private String attributeQName;
   private String attributeValueType;
   int tokenStartLine;
   int tokenStartColumn;
   private boolean[] defaultAttributeSpecified;
   private int numAttributesDefined;
   private FastNamespaceSupport nsSupport;
   private static boolean[] asciiNameStartChars;
   private static boolean[] asciiNameStartCharsNS;
   private static boolean[] asciiNameChars;
   private static boolean[] asciiNameCharsNS;
   private static final char[] LETTER_RANGE_START;
   private static final char[] LETTER_RANGE_END;
   private static final char[] NON_LETTER_RANGE_START;
   private static final char[] NON_LETTER_RANGE_END;
   private int yy_currentPos_l;
   private int yy_startRead_l;
   private int yy_markedPos_l;
   private int yy_endRead_l;
   private char[] yy_buffer_l;
   private char[] yycmap_l;
   private boolean yy_sawCR;
   private boolean yy_prev_sawCR;
   private int yyline_next;
   private int yycolumn_next;


   public PiccoloLexer(Piccolo parser) {
      this.yy_lexical_state = 0;
      this.yy_buffer = new char[16384];
      this.yy_saved_buffer = this.yy_buffer;
      this.yy_savePos = -1;
      this.yy_atBOL = true;
      this.yy_streams = new Stack();
      this.parser = null;
      this.currentEntity = null;
      this.stringConverter = new CharStringConverter(200);
      this.entityManager = new EntityManager();
      this.entityStack = new Stack();
      this.attribs = new AttributesHolder();
      this.cbuf = new char[1024];
      this.oneCharBuffer = new char[1];
      this.entityStateStack = new LongStack(5);
      this.entityNameStack = new StringStack(2);
      this.tagStack = new StringStack(20);
      this.elementMap = new HashMap();
      this.elementDefinition = null;
      this.tokenStartColumn = -1;
      this.defaultAttributeSpecified = new boolean[4];
      this.nsSupport = new FastNamespaceSupport();
      this.yy_sawCR = false;
      this.yy_prev_sawCR = false;
      this.yyline_next = 0;
      this.yycolumn_next = 0;
      this.parser = parser;
      this.enableNamespaces(true);
   }

   public void reset(Entity entity) throws IOException, SAXException {
      try {
         this.setTokenize(true);
         this.tagStack.clear();
         this.attribs.clear();
         this.entityStack.clear();
         this.clearEntityState();
         this.elementMap.clear();
         this.currentEntity = entity;
         this.entityManager.clear();
         this.elementDefinition = null;
         if(!entity.isOpen()) {
            entity.open();
         }

         if(this.parser.fNamespaces) {
            this.nsSupport.reset();
         }

         this.isNamespaceDeclaration = false;
         this.bypassPERefs = this.bypassGERefs = false;
         this.needsNormalization = false;
         this.entityWasSkipped = false;
         this.inCdataSection = false;
         this.cbuflen = this.cdataStart = this.cdataLength = 0;
         this.tagType = 0;
         this.prevState = this.piPrevState = 0;
         this.endOfTag = false;
         this.tokenStartLine = 0;
         this.tokenStartColumn = 0;
         this.numAttributesDefined = 0;
         this.yy_reader = null;
         this.yyreset(entity.getReader());
      } catch (RecursionException var3) {
         ;
      }

   }

   void enableNamespaces(boolean value) {
      if(value) {
         this.tagState = 8;
         this.tagStartState = 9;
      } else {
         this.tagState = 6;
         this.tagStartState = 7;
         this.elementURI = this.elementLocalName = "";
         this.attributeURI = this.attributeLocalName = "";
      }

   }

   void defineElement(String name, ElementDefinition elem) {
      this.elementMap.put(name, elem);
   }

   ElementDefinition getElement(String name) {
      return (ElementDefinition)this.elementMap.get(name);
   }

   public int getLineNumber() {
      return this.yyline + 1;
   }

   public int getColumnNumber() {
      return this.yycolumn + 1;
   }

   String getPublicID() {
      return this.currentEntity != null?this.currentEntity.getPublicID():null;
   }

   String getSystemID() {
      return this.currentEntity != null?this.currentEntity.getSystemID():null;
   }

   String getVersion() {
      return this.currentEntity != null?this.currentEntity.getXMLVersion():null;
   }

   String getEncoding() {
      return this.currentEntity != null?this.currentEntity.getDeclaredEncoding():null;
   }

   void setTokenize(boolean tokenize) {
      this.tokenizeInput = tokenize;
      this.baseState = tokenize?0:2;
      int state = this.yystate();
      if(state == 0 || state == 2) {
         this.yybegin(this.baseState);
      }

   }

   String normalizeValue(String s) {
      if(s != null && s.length() != 0) {
         char[] inbuf = s.toCharArray();
         int in_len = inbuf.length;
         int inpos = 0;
         char[] outbuf = new char[in_len];
         int outpos = 0;

         label42:
         while(inpos < in_len) {
            switch(inbuf[inpos]) {
            case 9:
            case 10:
            case 13:
            case 32:
               ++inpos;
               break;
            default:
               break label42;
            }
         }

         label35:
         while(inpos < in_len) {
            while(true) {
               char c = inbuf[inpos++];
               switch(c) {
               default:
                  outbuf[outpos++] = c;
                  if(inpos < in_len) {
                     break;
                  }
               case 9:
               case 10:
               case 13:
               case 32:
                  while(true) {
                     if(inpos >= in_len) {
                        continue label35;
                     }

                     c = inbuf[inpos++];
                     switch(c) {
                     case 9:
                     case 10:
                     case 13:
                     case 32:
                        break;
                     default:
                        outbuf[outpos++] = 32;
                        outbuf[outpos++] = c;
                        continue label35;
                     }
                  }
               }
            }
         }

         return new String(outbuf, 0, outpos);
      } else {
         return s;
      }
   }

   void startCdata() throws SAXException {
      if(this.parser.lexHandler != null) {
         this.parser.lexHandler.startCDATA();
         this.inCdataSection = true;
      }

   }

   void endCdata() throws SAXException {
      if(this.parser.lexHandler != null) {
         this.parser.lexHandler.endCDATA();
         this.inCdataSection = false;
      }

   }

   private void appendToCbuf(char c) {
      if(this.cbuf.length - this.cbuflen < 1) {
         char[] newcbuf = new char[2 * (this.cbuf.length + 1)];
         System.arraycopy(this.cbuf, 0, newcbuf, 0, this.cbuflen);
         this.cbuf = newcbuf;
      }

      this.cbuf[this.cbuflen++] = c;
   }

   private void appendToCbuf(char[] ch, int start, int length) {
      if(length > 0) {
         if(this.cbuf.length - this.cbuflen < length) {
            char[] newcbuf = new char[2 * (this.cbuf.length + length)];
            System.arraycopy(this.cbuf, 0, newcbuf, 0, this.cbuflen);
            this.cbuf = newcbuf;
         }

         System.arraycopy(ch, start, this.cbuf, this.cbuflen, length);
         this.cbuflen += length;
      }

   }

   private void clearCbuf() {
      this.cbuflen = 0;
   }

   private int stringToken(int token, String value) {
      this.stringValue = value;
      return token;
   }

   private int cdataToken(char[] buf, int start, int length) {
      return this.cdataToken(257, buf, start, length);
   }

   private int cdataToken(int token, char[] buf, int start, int length) {
      this.cdataBuffer = buf;
      this.cdataStart = start;
      this.cdataLength = length;
      return token;
   }

   private int cdataToken(char c) {
      this.oneCharBuffer[0] = c;
      this.cdataBuffer = this.oneCharBuffer;
      this.cdataStart = 0;
      this.cdataLength = 1;
      return 257;
   }

   private int parseXML() throws SAXException, IOException {
      if(this.parser.fNamespaces) {
         return this.parseXMLNS();
      } else {
         while(true) {
            this.parseCdata();
            this.parser.reportCdata(this.cdataBuffer, this.cdataStart, this.cdataLength);
            this.yynextAction();
            if(this.yystate() != this.tagStartState) {
               return 0;
            }

            int token = this.parseTag();
            switch(token) {
            case -1:
               return 0;
            case 0:
               this.yynextAction();
               break;
            default:
               return token;
            }
         }
      }
   }

   private int parseXMLNS() throws SAXException, IOException {
      while(true) {
         this.parseCdata();
         this.parser.reportCdata(this.cdataBuffer, this.cdataStart, this.cdataLength);
         this.yynextAction();
         if(this.yystate() != this.tagStartState) {
            return 0;
         }

         int token = this.parseTagNS();
         switch(token) {
         case -1:
            return 0;
         case 0:
            this.yynextAction();
            break;
         default:
            return token;
         }
      }
   }

   private int parseTag() throws SAXException, IOException {
      if(this.yy_endRead - this.yy_markedPos > 0) {
         char c = this.yy_buffer[this.yy_markedPos];
         switch(c) {
         case 33:
         case 63:
            this.yybegin(this.tagStartState);
            return -1;
         case 47:
            return this.parseCloseTag();
         default:
            return this.parseOpenTag();
         }
      } else {
         return -1;
      }
   }

   private int parseTagNS() throws SAXException, IOException {
      if(this.yy_endRead - this.yy_markedPos > 0) {
         char c = this.yy_buffer[this.yy_markedPos];
         switch(c) {
         case 33:
         case 63:
            this.yybegin(this.tagStartState);
            return -1;
         case 47:
            return this.parseCloseTagNS();
         default:
            return this.parseOpenTagNS();
         }
      } else {
         return -1;
      }
   }

   private int parseOpenTag() throws SAXException, IOException {
      this.stringValue = this.parseElementName();
      if(this.stringValue == null) {
         this.yybegin(this.tagStartState);
         return -1;
      } else {
         int c = this.yy_buffer[this.yy_markedPos++];

         while(c != 62) {
            if(c == 47) {
               ++this.yycolumn_next;
               c = this.yynextChar();
               if(c != 62) {
                  throw this.fatalError("\'/\' should be followed by \'>\'");
               }

               ++this.yycolumn_next;
               this.yybegin(this.baseState);
               this.processSimpleElement(this.stringValue);
               this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.attribs.clear();
               this.tagType = 265;
               if(this.tokenizeInput) {
                  return 265;
               }

               return 0;
            }

            if(c != 32 && c != 9) {
               if(c != 10) {
                  --this.yy_markedPos;
                  this.prepareComplexElement(this.stringValue);
                  return this.parseAttributes();
               }

               ++this.yyline_next;
               this.yycolumn_next = 0;
            } else {
               ++this.yycolumn_next;
            }

            if(this.yy_endRead - this.yy_markedPos > 0) {
               c = this.yy_buffer[this.yy_markedPos++];
            } else {
               c = this.yynextChar();
            }
         }

         ++this.yycolumn_next;
         this.yybegin(this.baseState);
         this.processSimpleElement(this.stringValue);
         this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
         this.attribs.clear();
         this.tagStack.push(this.stringValue);
         this.tagType = 263;
         return this.tokenizeInput?263:0;
      }
   }

   private int parseOpenTagNS() throws SAXException, IOException {
      this.stringValue = this.parseElementNameNS();
      if(this.stringValue == null) {
         this.yybegin(this.tagStartState);
         return -1;
      } else {
         int c = this.yy_buffer[this.yy_markedPos++];

         while(c != 62) {
            if(c == 47) {
               ++this.yycolumn_next;
               c = this.yynextChar();
               if(c != 62) {
                  throw this.fatalError("\'/\' should be followed by \'>\'");
               }

               ++this.yycolumn_next;
               this.yybegin(this.baseState);
               this.elementURI = this.nsSupport.getURI(this.elementURI);
               this.processSimpleElement(this.stringValue);
               this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.attribs.clear();
               this.tagType = 265;
               if(this.tokenizeInput) {
                  return 265;
               }

               return 0;
            }

            if(c != 32 && c != 9) {
               if(c != 10) {
                  --this.yy_markedPos;
                  this.prepareComplexElement(this.stringValue);
                  this.nsSupport.pushContext();
                  return this.parseAttributesNS();
               }

               ++this.yyline_next;
               this.yycolumn_next = 0;
            } else {
               ++this.yycolumn_next;
            }

            if(this.yy_endRead - this.yy_markedPos > 0) {
               c = this.yy_buffer[this.yy_markedPos++];
            } else {
               c = this.yynextChar();
            }
         }

         ++this.yycolumn_next;
         this.nsSupport.pushContext();
         this.elementURI = this.nsSupport.getURI(this.elementURI);
         this.yybegin(this.baseState);
         this.processSimpleElement(this.stringValue);
         this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
         this.attribs.clear();
         this.tagStack.push(this.stringValue);
         this.tagType = 263;
         return this.tokenizeInput?263:0;
      }
   }

   private int parseAttributes() throws SAXException, IOException {
      this.yybegin(this.tagState);
      int c = 0;
      this.endOfTag = false;

      label84:
      while(true) {
         if(!this.endOfTag) {
            if(this.yy_endRead - this.yy_markedPos <= 0) {
               return -1;
            }

            this.parseAttributeName();
            if(this.attributeQName != null) {
               int bufferLeft = this.yy_endRead - this.yy_markedPos;

               while(true) {
                  if(bufferLeft-- > 0) {
                     switch(this.yy_buffer[this.yy_markedPos++]) {
                     case 9:
                     case 32:
                        ++this.yycolumn_next;
                        continue;
                     case 10:
                        ++this.yyline_next;
                        this.yycolumn_next = 0;
                        continue;
                     case 61:
                        break;
                     default:
                        --this.yy_markedPos;
                        this.yybegin(10);
                        return -1;
                     }
                  }

                  if(bufferLeft < 0) {
                     this.yybegin(10);
                     return -1;
                  }

                  c = this.yynextChar();

                  while(true) {
                     if(c != -1) {
                        label67: {
                           switch(c) {
                           case 9:
                           case 32:
                              ++this.yycolumn_next;
                              break;
                           case 10:
                              ++this.yyline_next;
                              this.yycolumn_next = 0;
                              break;
                           case 34:
                              ++this.yycolumn_next;
                              this.parseQuotedTagValue();
                              if(this.yystate() != this.tagState) {
                                 return -1;
                              }
                              break label67;
                           case 39:
                              ++this.yycolumn_next;
                              this.parseSingleQuotedTagValue();
                              if(this.yystate() != this.tagState) {
                                 return -1;
                              }
                              break label67;
                           default:
                              throw this.fatalError("Unexpected character encountered: \'" + (char)c + "\'");
                           }

                           c = this.yynextChar();
                           continue;
                        }
                     }

                     if(c == -1) {
                        throw this.fatalError("Unexpected end of file");
                     }
                     continue label84;
                  }
               }
            }
         }

         while(this.yy_endRead - this.yy_markedPos > 0) {
            switch(this.yy_buffer[this.yy_markedPos++]) {
            case 9:
            case 32:
               ++this.yycolumn_next;
               break;
            case 10:
               ++this.yyline_next;
               this.yycolumn_next = 0;
               break;
            case 47:
               ++this.yycolumn_next;
               if(this.yynextChar() != 62) {
                  throw this.fatalError("\'/\' should be followed by \'>\'");
               }

               ++this.yycolumn_next;
               this.yybegin(this.baseState);
               this.processComplexElement();
               this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.attribs.clear();
               this.tagType = 265;
               if(this.tokenizeInput) {
                  return 265;
               }

               return 0;
            case 62:
               ++this.yycolumn_next;
               this.yybegin(this.baseState);
               this.processComplexElement();
               this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.tagStack.push(this.stringValue);
               this.attribs.clear();
               this.tagType = 263;
               if(this.tokenizeInput) {
                  return 263;
               }

               return 0;
            default:
               throw this.fatalError("Unexpected character: " + (char)c);
            }
         }

         return -1;
      }
   }

   private int parseAttributesNS() throws SAXException, IOException {
      this.yybegin(this.tagState);
      int c = 0;
      this.endOfTag = false;

      label84:
      while(true) {
         if(!this.endOfTag) {
            if(this.yy_endRead - this.yy_markedPos <= 0) {
               return -1;
            }

            this.parseAttributeNameNS();
            if(this.attributeQName != null) {
               int bufferLeft = this.yy_endRead - this.yy_markedPos;

               while(true) {
                  if(bufferLeft-- > 0) {
                     switch(this.yy_buffer[this.yy_markedPos++]) {
                     case 9:
                     case 32:
                        ++this.yycolumn_next;
                        continue;
                     case 10:
                        ++this.yyline_next;
                        this.yycolumn_next = 0;
                        continue;
                     case 61:
                        break;
                     default:
                        --this.yy_markedPos;
                        this.yybegin(10);
                        return -1;
                     }
                  }

                  if(bufferLeft < 0) {
                     this.yybegin(10);
                     return -1;
                  }

                  c = this.yynextChar();

                  while(true) {
                     if(c != -1) {
                        label67: {
                           switch(c) {
                           case 9:
                           case 32:
                              ++this.yycolumn_next;
                              break;
                           case 10:
                              ++this.yyline_next;
                              this.yycolumn_next = 0;
                              break;
                           case 34:
                              ++this.yycolumn_next;
                              this.parseQuotedTagValue();
                              if(this.yystate() != this.tagState) {
                                 return -1;
                              }
                              break label67;
                           case 39:
                              ++this.yycolumn_next;
                              this.parseSingleQuotedTagValue();
                              if(this.yystate() != this.tagState) {
                                 return -1;
                              }
                              break label67;
                           default:
                              throw this.fatalError("Unexpected character encountered: \'" + (char)c + "\'");
                           }

                           c = this.yynextChar();
                           continue;
                        }
                     }

                     if(c == -1) {
                        throw this.fatalError("Unexpected end of file");
                     }
                     continue label84;
                  }
               }
            }
         }

         while(this.yy_endRead - this.yy_markedPos > 0) {
            switch(this.yy_buffer[this.yy_markedPos++]) {
            case 9:
            case 32:
               ++this.yycolumn_next;
               break;
            case 10:
               ++this.yyline_next;
               this.yycolumn_next = 0;
               break;
            case 47:
               ++this.yycolumn_next;
               if(this.yynextChar() != 62) {
                  throw this.fatalError("\'/\' should be followed by \'>\'");
               }

               ++this.yycolumn_next;
               this.yybegin(this.baseState);
               this.processComplexElement();
               this.resolveNamespacePrefixes();
               this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.processNSContextEnd();
               this.attribs.clear();
               this.tagType = 265;
               if(this.tokenizeInput) {
                  return 265;
               }

               return 0;
            case 62:
               ++this.yycolumn_next;
               this.yybegin(this.baseState);
               this.processComplexElement();
               this.resolveNamespacePrefixes();
               this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.tagStack.push(this.stringValue);
               this.attribs.clear();
               this.tagType = 263;
               if(this.tokenizeInput) {
                  return 263;
               }

               return 0;
            default:
               throw this.fatalError("Unexpected character: " + (char)c);
            }
         }

         return -1;
      }
   }

   private void parseAttributeName() throws SAXException, IOException {
      int c = this.yy_buffer[this.yy_markedPos++];

      while(true) {
         if(c != 32 && c != 9) {
            if(c != 10) {
               if(c == 47) {
                  --this.yy_markedPos;
                  this.attributeQName = null;
                  return;
               }

               if(c == 62) {
                  --this.yy_markedPos;
                  this.attributeQName = null;
                  return;
               }

               label63: {
                  if(c <= 255) {
                     if(!isASCIINameStartChar(c)) {
                        break label63;
                     }
                  } else if(!isNonASCIINameStartChar(c)) {
                     break label63;
                  }

                  ++this.yycolumn_next;
                  this.yy_startRead = this.yy_markedPos - 1;

                  while(true) {
                     if(c <= 255) {
                        if(!isASCIINameChar(c)) {
                           break;
                        }
                     } else if(!isNonASCIINameChar(c)) {
                        break;
                     }

                     ++this.yycolumn_next;
                     if(this.yy_endRead - this.yy_markedPos > 0) {
                        c = this.yy_buffer[this.yy_markedPos++];
                     } else {
                        c = this.yynextChar();
                     }
                  }

                  --this.yy_markedPos;
                  this.attributeQName = this.yytext2();
                  return;
               }

               --this.yy_markedPos;
               this.attributeQName = "";
               return;
            }

            ++this.yyline_next;
            this.yycolumn_next = 0;
         } else {
            ++this.yycolumn_next;
         }

         if(this.yy_endRead - this.yy_markedPos > 0) {
            c = this.yy_buffer[this.yy_markedPos++];
         } else {
            c = this.yynextChar();
         }
      }
   }

   private void parseAttributeNameNS() throws SAXException, IOException {
      this.attributeURI = null;
      this.isNamespaceDeclaration = false;
      int c = this.yy_buffer[this.yy_markedPos++];
      int localNameOffset = 0;
      int var10000 = this.yy_endRead - this.yy_markedPos;

      while(true) {
         if(c != 32 && c != 9) {
            if(c != 10) {
               if(c == 47) {
                  --this.yy_markedPos;
                  this.attributeQName = null;
                  return;
               }

               if(c == 62) {
                  --this.yy_markedPos;
                  this.attributeQName = null;
                  return;
               }

               label87: {
                  label71: {
                     if(c <= 255) {
                        if(!isASCIINameStartChar(c)) {
                           break label71;
                        }
                     } else if(!isNonASCIINameStartChar(c)) {
                        break label71;
                     }

                     ++this.yycolumn_next;
                     this.yy_startRead = this.yy_markedPos - 1;
                     break label87;
                  }

                  if(c != 58) {
                     --this.yy_markedPos;
                     this.attributeQName = "";
                     return;
                  }

                  localNameOffset = this.yy_markedPos - this.yy_startRead;
                  this.attributeURI = "";
               }

               while(true) {
                  label88: {
                     label62: {
                        if(c <= 255) {
                           if(!isASCIINameCharNS(c)) {
                              break label62;
                           }
                        } else if(!isNonASCIINameChar(c)) {
                           break label62;
                        }

                        ++this.yycolumn_next;
                        break label88;
                     }

                     if(c != 58) {
                        --this.yy_markedPos;
                        if(this.attributeURI == null) {
                           this.attributeURI = "";
                        }

                        this.attributeLocalName = this.yytext2(localNameOffset, this.yy_markedPos - (this.yy_startRead + localNameOffset));
                        if(this.attributeURI == "xmlns" || this.attributeLocalName == "xmlns") {
                           this.isNamespaceDeclaration = true;
                        }

                        this.attributeQName = this.yytext2();
                        return;
                     }

                     ++this.yycolumn_next;
                     if(this.attributeURI == null) {
                        this.attributeURI = this.stringConverter.convert(this.yy_buffer, this.yy_startRead, this.yy_markedPos - 1 - this.yy_startRead);
                        localNameOffset = this.yy_markedPos - this.yy_startRead;
                     }
                  }

                  if(this.yy_endRead - this.yy_markedPos > 0) {
                     c = this.yy_buffer[this.yy_markedPos++];
                  } else {
                     c = this.yynextChar();
                  }
               }
            }

            ++this.yyline_next;
            this.yycolumn_next = 0;
         } else {
            ++this.yycolumn_next;
         }

         if(this.yy_endRead - this.yy_markedPos > 0) {
            c = this.yy_buffer[this.yy_markedPos++];
         } else {
            c = this.yynextChar();
         }
      }
   }

   private int parseCloseTag() throws SAXException, IOException {
      ++this.yy_markedPos;
      ++this.yycolumn_next;
      this.stringValue = this.parseElementName();
      if(this.stringValue == null) {
         this.yybegin(this.tagStartState);
         --this.yy_markedPos;
         --this.yycolumn_next;
         return -1;
      } else {
         while(this.yy_endRead - this.yy_markedPos > 0) {
            char c = this.yy_buffer[this.yy_markedPos++];
            switch(c) {
            case 9:
            case 32:
               ++this.yycolumn_next;
               break;
            case 10:
               ++this.yyline_next;
               this.yycolumn_next = 0;
               break;
            case 62:
               ++this.yycolumn_next;
               this.checkEndTag(this.stringValue);
               this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.yybegin(this.baseState);
               this.tagType = 264;
               if(this.tokenizeInput) {
                  return 264;
               }

               return 0;
            default:
               throw this.fatalError("Unexpected character encountered while in a closing tag: \'" + c + "\'");
            }
         }

         this.yybegin(this.parser.fNamespaces?20:19);
         return -1;
      }
   }

   private int parseCloseTagNS() throws SAXException, IOException {
      ++this.yy_markedPos;
      ++this.yycolumn_next;
      this.stringValue = this.parseElementNameNS();
      if(this.stringValue == null) {
         this.yybegin(this.tagStartState);
         --this.yy_markedPos;
         --this.yycolumn_next;
         return -1;
      } else {
         while(this.yy_endRead - this.yy_markedPos > 0) {
            char c = this.yy_buffer[this.yy_markedPos++];
            switch(c) {
            case 9:
            case 32:
               ++this.yycolumn_next;
               break;
            case 10:
               ++this.yyline_next;
               this.yycolumn_next = 0;
               break;
            case 62:
               ++this.yycolumn_next;
               this.checkEndTag(this.stringValue);
               this.elementURI = this.nsSupport.getURI(this.elementURI);
               this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
               this.processNSContextEnd();
               this.yybegin(this.baseState);
               this.tagType = 264;
               if(this.tokenizeInput) {
                  return 264;
               }

               return 0;
            default:
               throw this.fatalError("Unexpected character encountered while in a closing tag: \'" + c + "\'");
            }
         }

         this.yybegin(this.parser.fNamespaces?20:19);
         return -1;
      }
   }

   private String parseElementName() throws SAXException, IOException {
      int c;
      label53: {
         this.yy_startRead = this.yy_markedPos;
         c = this.yynextChar();
         if(c <= 255) {
            if(isASCIINameStartChar(c)) {
               break label53;
            }
         } else if(isNonASCIINameStartChar(c)) {
            break label53;
         }

         this.yybegin(this.tagStartState);
         --this.yy_markedPos;
         return null;
      }

      ++this.yycolumn_next;

      char var2;
      while(true) {
         while(this.yy_endRead - this.yy_markedPos <= 0) {
            c = this.yynextChar();
            if(c < 0) {
               throw this.fatalError("Unexpected end of file");
            }

            --this.yy_markedPos;
         }

         var2 = this.yy_buffer[this.yy_markedPos++];
         if(var2 <= 255) {
            if(!isASCIINameChar(var2)) {
               break;
            }
         } else if(!isNonASCIINameChar(var2)) {
            break;
         }

         ++this.yycolumn_next;
      }

      if(var2 != 62 && var2 != 32 && var2 != 47 && var2 != 10 && var2 != 9) {
         this.yy_markedPos = this.yy_startRead;
         return null;
      } else {
         --this.yy_markedPos;
         return this.yytext2();
      }
   }

   private String parseElementNameNS() throws SAXException, IOException {
      int localNameOffset;
      int c;
      label73: {
         label76: {
            this.yy_startRead = this.yy_markedPos;
            localNameOffset = 0;
            this.elementURI = null;
            c = this.yynextChar();
            if(c <= 255) {
               if(isASCIINameStartCharNS(c)) {
                  break label76;
               }
            } else if(isNonASCIINameStartChar(c)) {
               break label76;
            }

            if(c != 58) {
               this.yybegin(this.tagStartState);
               --this.yy_markedPos;
               return null;
            }

            ++this.yycolumn_next;
            localNameOffset = 1;
            this.elementURI = "";
            break label73;
         }

         ++this.yycolumn_next;
      }

      while(true) {
         char var3;
         while(true) {
            while(this.yy_endRead - this.yy_markedPos <= 0) {
               c = this.yynextChar();
               if(c < 0) {
                  throw this.fatalError("Unexpected end of file");
               }

               --this.yy_markedPos;
            }

            var3 = this.yy_buffer[this.yy_markedPos++];
            if(var3 <= 255) {
               if(!isASCIINameCharNS(var3)) {
                  break;
               }
            } else if(!isNonASCIINameChar(var3)) {
               break;
            }

            ++this.yycolumn_next;
         }

         if(var3 == 62 || var3 == 32 || var3 == 47) {
            break;
         }

         if(var3 != 58) {
            if(var3 != 10 && var3 != 9) {
               this.yy_markedPos = this.yy_startRead;
               return null;
            }
            break;
         }

         ++this.yycolumn_next;
         if(this.elementURI == null) {
            this.elementURI = this.stringConverter.convert(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead - 1);
            localNameOffset = this.yy_markedPos - this.yy_startRead;
         }
      }

      --this.yy_markedPos;
      this.elementLocalName = this.yytext2(localNameOffset, this.yy_markedPos - (this.yy_startRead + localNameOffset));
      return localNameOffset == 0?this.elementLocalName:this.yytext2();
   }

   private static void calcAsciiTables() {
      asciiNameStartChars = new boolean[256];
      asciiNameStartCharsNS = new boolean[256];
      asciiNameChars = new boolean[256];
      asciiNameCharsNS = new boolean[256];

      for(int c = 0; c < 256; ++c) {
         asciiNameStartChars[c] = c >= 97 && c <= 122 || c == 58 || c >= 65 && c <= 90 || c == 95 || c >= 192 && c <= 214 || c >= 216 && c <= 246 || c >= 248 && c <= 255;
         asciiNameStartCharsNS[c] = c != 58 && asciiNameStartChars[c];
         asciiNameChars[c] = c >= 97 && c <= 122 || c == 58 || c >= 65 && c <= 90 || c == 46 || c == 45 || c == 95 || c == 183 || c >= 48 && c <= 57 || c >= 192 && c <= 214 || c >= 216 && c <= 246 || c >= 248 && c <= 255;
         asciiNameCharsNS[c] = c != 58 && asciiNameChars[c];
      }

   }

   private static int findIndexFor(char[] array, int c) {
      int n = array.length;
      int start = 0;
      int end = n;

      while(start + 1 < end) {
         int mid = (end - start) / 2 + start;
         if(array[mid] > c) {
            end = mid;
         } else {
            start = mid;
         }
      }

      return start;
   }

   private static boolean isASCIINameStartChar(int c) {
      return asciiNameStartChars[c];
   }

   private static boolean isASCIINameStartCharNS(int c) {
      return asciiNameStartCharsNS[c];
   }

   private static boolean isNonASCIINameStartChar(int c) {
      int pos = findIndexFor(LETTER_RANGE_START, c);
      return c <= LETTER_RANGE_END[pos];
   }

   private static boolean isASCIINameChar(int c) {
      return asciiNameChars[c];
   }

   private static boolean isASCIINameCharNS(int c) {
      return asciiNameCharsNS[c];
   }

   private static boolean isNonASCIINameChar(int c) {
      return isNonASCIINameStartChar(c) || c <= NON_LETTER_RANGE_END[findIndexFor(NON_LETTER_RANGE_START, c)];
   }

   private int parseWhitespace() throws SAXException, IOException {
      this.cdataBuffer = this.yy_buffer;
      this.cdataStart = this.yy_startRead;

      while(this.yy_endRead - this.yy_markedPos > 0) {
         char c = this.yy_buffer[this.yy_markedPos++];
         switch(c) {
         case 9:
         case 32:
            ++this.yycolumn_next;
            break;
         case 10:
            ++this.yyline_next;
            this.yycolumn_next = 0;
            break;
         case 38:
            ++this.yycolumn_next;
            this.yybegin(3);
            this.cdataLength = this.yy_markedPos - 1 - this.yy_startRead;
            return 257;
         case 60:
            this.tokenStartLine = this.yyline_next + 1;
            ++this.yycolumn_next;
            this.tokenStartColumn = this.yycolumn_next + 1;
            this.yybegin(this.tagStartState);
            this.cdataLength = this.yy_markedPos - 1 - this.yy_startRead;
            this.yybegin(this.tagStartState);
            return 266;
         default:
            ++this.yycolumn_next;
            this.parseCdata();
            return 257;
         }
      }

      this.cdataLength = this.yy_markedPos - this.yy_startRead;
      return 266;
   }

   private void parseCdata() throws SAXException, IOException {
      this.cdataBuffer = this.yy_buffer;
      this.cdataStart = this.yy_startRead;

      label39:
      while(this.yy_endRead > this.yy_markedPos) {
         char c = this.yy_buffer[this.yy_markedPos++];
         switch(c) {
         case 10:
            ++this.yyline_next;
            this.yycolumn_next = 0;
            break;
         case 38:
            ++this.yycolumn_next;
            this.yybegin(3);
            this.cdataLength = this.yy_markedPos - 1 - this.yy_startRead;
            return;
         case 60:
            ++this.yycolumn_next;
            this.yybegin(this.tagStartState);
            this.cdataLength = this.yy_markedPos - 1 - this.yy_startRead;
            this.tokenStartLine = this.yyline_next + 1;
            this.tokenStartColumn = this.yycolumn_next + 1;
            return;
         case 93:
            int numBrackets = 1;

            while(true) {
               int var3;
               if(this.yy_endRead - this.yy_markedPos >= 1) {
                  var3 = this.yy_buffer[this.yy_markedPos++];
               } else {
                  this.parser.reportCdata(this.cdataBuffer, this.cdataStart, this.yy_markedPos - this.yy_startRead);
                  this.yynextAction();
                  var3 = this.yynextChar();
                  this.cdataBuffer = this.yy_buffer;
                  this.cdataStart = this.yy_startRead;
               }

               if(var3 != 93) {
                  if(var3 == 62 && numBrackets >= 2) {
                     throw this.fatalError("Illegal \']]>\' construct in character data");
                  }

                  if(var3 != -1) {
                     --this.yy_markedPos;
                  }
                  continue label39;
               }

               ++numBrackets;
            }
         default:
            ++this.yycolumn_next;
         }
      }

      this.cdataLength = this.yy_markedPos - this.yy_startRead;
   }

   private void parseCdataSection() throws SAXException, IOException {
      this.yynextAction();

      label49:
      while(true) {
         while(this.yy_endRead <= this.yy_markedPos) {
            if(this.yynextChar() == -1) {
               throw this.fatalError("Unexpected end of file in CDATA section");
            }

            --this.yy_markedPos;
         }

         char c = this.yy_buffer[this.yy_markedPos++];
         switch(c) {
         case 10:
            ++this.yyline_next;
            this.yycolumn_next = 0;
            break;
         case 93:
            int numBrackets = 1;

            while(true) {
               int len;
               int var4;
               if(this.yy_endRead > this.yy_markedPos) {
                  var4 = this.yy_buffer[this.yy_markedPos++];
               } else {
                  len = Math.min(2, numBrackets);
                  this.yy_markedPos -= len;
                  this.parser.reportCdata(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
                  this.yynextAction();
                  this.yy_markedPos += len;
                  var4 = this.yynextChar();
               }

               if(var4 != 93) {
                  if(var4 == 62 && numBrackets >= 2) {
                     len = this.yy_markedPos - 3 - this.yy_startRead;
                     if(len > 0) {
                        this.parser.reportCdata(this.yy_buffer, this.yy_startRead, len);
                     }

                     return;
                  }

                  if(var4 == -1) {
                     throw this.fatalError("Unexpected end of file in CDATA section");
                  }

                  --this.yy_markedPos;
                  continue label49;
               }

               ++numBrackets;
            }
         default:
            ++this.yycolumn_next;
         }
      }
   }

   void pushEntity(String name, Entity entity, boolean isParamEntity, boolean returnEndToken) throws SAXException, IOException {
      this.pushEntity(name, entity, isParamEntity, returnEndToken, 0);
   }

   void pushEntity(String name, Entity entity, boolean isParamEntity, boolean returnEndToken, int resumeLexState) throws SAXException, IOException {
      try {
         if(name != null) {
            this.parser.reportStartEntity(name);
         }

         entity.open();
         if(entity.isInternal()) {
            char[] e = entity.charArrayValue();
            this.yypushBuffer(e, 0, e.length);
         } else {
            this.yypushStream(entity.getReader());
         }

         this.entityStack.push(this.currentEntity);
         this.currentEntity = entity;
         this.pushEntityState(name, isParamEntity, returnEndToken, resumeLexState);
      } catch (RecursionException var7) {
         throw this.fatalError("Recursive reference to entity \'" + entity.getSystemID() + "\'");
      }
   }

   void pushEntity(String name, String pubID, String sysID, boolean isParamEntity, boolean returnEndToken) throws SAXException, IOException {
      this.pushEntity(name, pubID, sysID, isParamEntity, returnEndToken, 0);
   }

   void pushEntity(String name, String pubID, String sysID, boolean isParamEntity, boolean returnEndToken, int resumeLexState) throws SAXException, IOException {
      Entity en = this.entityManager.getByID(this.currentEntity, pubID, sysID);
      this.pushEntity(name, en, isParamEntity, returnEndToken, resumeLexState);
   }

   boolean parseExternalEntities(int entityType) {
      if(this.currentEntity.isStandalone()) {
         return false;
      } else {
         switch(entityType) {
         case 0:
         default:
            return this.parser.fExternalGeneralEntities;
         case 1:
            return this.parser.fExternalParameterEntities;
         }
      }
   }

   private void pushEntityState(String entityName, boolean newIsParamEntity, boolean newReturnEndToken) throws SAXException {
      this.pushEntityState(entityName, newIsParamEntity, newReturnEndToken, 0);
   }

   private void pushEntityState(String entityName, boolean newIsParamEntity, boolean newReturnEndToken, int newReturnLexState) throws SAXException {
      long entityState = (long)(this.entityBaseDepth << 11 | (this.prevEntityLexState & 255) << 3 | (this.returnEntityEndToken?4:0) | (this.isParamEntity?2:0) | (this.isEntityBeingParsed?1:0));
      this.entityStateStack.push(entityState);
      this.entityBaseDepth = this.tagStack.size();
      this.entityNameStack.push(this.currentEntityName);
      this.currentEntityName = entityName;
      this.isParamEntity = newIsParamEntity;
      this.returnEntityEndToken = newReturnEndToken;
      this.isEntityBeingParsed = true;
      this.prevEntityLexState = newReturnLexState;
   }

   private void popEntityState() throws SAXException {
      if(this.prevEntityLexState != 0) {
         this.yybegin(this.prevEntityLexState);
      }

      long entityState = this.entityStateStack.pop();
      this.returnEntityEndToken = (entityState & 4L) == 4L;
      this.isParamEntity = (entityState & 2L) == 2L;
      this.isEntityBeingParsed = (entityState & 1L) == 1L;
      this.entityBaseDepth = (int)(entityState >> 11 & 65535L);
      this.prevEntityLexState = (int)(entityState >> 3 & 255L);
      if(this.currentEntityName != null) {
         this.parser.reportEndEntity(this.currentEntityName);
      }

      this.currentEntityName = this.entityNameStack.pop();
      if(this.tagStack.size() > this.entityBaseDepth) {
         this.setTokenize(false);
      }

   }

   private void clearEntityState() {
      this.entityStateStack.clear();
      this.entityNameStack.clear();
      this.returnEntityEndToken = true;
      this.isParamEntity = false;
      this.entityBaseDepth = 0;
      this.isEntityBeingParsed = true;
      this.prevEntityLexState = 0;
      this.currentEntityName = null;
   }

   private int handleEntityRef(String name, int entityType) throws IOException, SAXException {
      Entity entity = this.entityManager.getByName(name, entityType);
      if(entity == null) {
         this.handleUnknownEntityRef(name, entityType);
         return 0;
      } else {
         boolean isParam = entityType == 1;
         String entityReportedName;
         if(isParam) {
            if(this.yystate() == 21) {
               entityReportedName = "%" + name;
            } else {
               entityReportedName = null;
            }
         } else {
            entityReportedName = name;
         }

         if(entity.isInternal()) {
            this.pushEntity(entityReportedName, entity, isParam, true);
            this.setTokenize(true);
            return 295;
         } else if(name != "[dtd]" && !this.parseExternalEntities(entityType)) {
            this.entityWasSkipped = true;
            this.parser.reportSkippedEntity(entityReportedName);
            return 0;
         } else {
            this.pushEntity(entityReportedName, entity, isParam, true);
            this.setTokenize(true);
            return 296;
         }
      }
   }

   private boolean handleLiteralEntityRef(String name, int entityType) throws IOException, SAXException {
      Entity entity = this.entityManager.getByName(name, entityType);
      boolean isParam = false;
      if(entityType == 1) {
         isParam = true;
      }

      if(entity != null) {
         if(entity.isInternal()) {
            this.pushEntity((String)null, entity, isParam, false, this.prevState);
            this.yybegin(isParam?32:11);
            return true;
         } else if(!isParam) {
            throw this.fatalError("Referencing an external entity within an attribute value is illegal");
         } else if(this.parseExternalEntities(entityType)) {
            this.yybegin(33);
            this.pushEntity((String)null, entity, isParam, false, this.prevState);
            return true;
         } else {
            this.entityWasSkipped = true;
            return false;
         }
      } else if(!isParam && (this.currentEntity.isStandalone() || !this.entityWasSkipped)) {
         throw this.fatalError("Reference to undefined entity: " + name);
      } else {
         return false;
      }
   }

   private void handleUnknownEntityRef(String name, int type) throws SAXException {
      boolean isParam = type == 1;
      String reportedName = (isParam?"%":"") + name;
      if(!this.currentEntity.isStandalone() && this.entityWasSkipped) {
         this.parser.reportSkippedEntity(reportedName);
      } else {
         throw this.fatalError("Reference to undefined entity: " + reportedName);
      }
   }

   private boolean isTopEntity() {
      return !this.yymoreStreams();
   }

   private void parseQuotedTagValue() throws SAXException, IOException {
      if(this.elementDefinition == null) {
         this.parseCdataLiteral('\"', 13);
      } else {
         IndexedObject o = this.elementDefinition.getIndexedAttribute(this.attributeQName);
         if(o == null) {
            this.attributeValueType = "CDATA";
            this.parseCdataLiteral('\"', 13);
         } else {
            this.defaultAttributeSpecified[o.getIndex()] = true;
            int type = ((AttributeDefinition)o.getObject()).getValueType();
            if(type == 3) {
               this.attributeValueType = "CDATA";
               this.parseCdataLiteral('\"', 13);
            } else {
               this.attributeValueType = AttributeDefinition.getValueTypeString(type);
               this.yybegin(15);
            }
         }
      }

   }

   private void parseSingleQuotedTagValue() throws SAXException, IOException {
      if(this.elementDefinition == null) {
         this.parseCdataLiteral('\'', 14);
      } else {
         IndexedObject o = this.elementDefinition.getIndexedAttribute(this.attributeQName);
         if(o == null) {
            this.attributeValueType = "CDATA";
            this.parseCdataLiteral('\'', 14);
         } else {
            this.defaultAttributeSpecified[o.getIndex()] = true;
            int type = ((AttributeDefinition)o.getObject()).getValueType();
            if(type == 3) {
               this.attributeValueType = "CDATA";
               this.parseCdataLiteral('\'', 14);
            } else {
               this.attributeValueType = AttributeDefinition.getValueTypeString(type);
               this.yybegin(16);
            }
         }
      }

   }

   private void parseCdataLiteral(char closingQuote, int bufferedState) throws SAXException, IOException {
      int startPos = this.yy_markedPos;

      while(this.yy_endRead - this.yy_markedPos > 0) {
         char c = this.yy_buffer[this.yy_markedPos++];
         if(c == 38) {
            ++this.yycolumn_next;
            this.clearCbuf();
            this.appendToCbuf(this.yy_buffer, startPos, this.yy_markedPos - 1 - startPos);
            this.prevState = bufferedState;
            this.yybegin(12);
            return;
         }

         if(c == 60) {
            throw this.fatalError("Illegal \'<\' found in attribute value. Use \'&lt;\' instead.");
         }

         if(c > 39) {
            ++this.yycolumn_next;
         } else {
            if(c == closingQuote) {
               ++this.yycolumn_next;
               int valueLen = this.yy_markedPos - 1 - startPos;
               String value;
               if(valueLen >= 4 && !this.isNamespaceDeclaration) {
                  value = new String(this.yy_buffer, startPos, valueLen);
               } else {
                  value = this.stringConverter.convert(this.yy_buffer, startPos, valueLen);
               }

               this.addAttribute(this.attributeURI, this.attributeLocalName, this.attributeQName, this.attributeValueType, value);
               int n;
               if(this.yy_endRead - this.yy_markedPos <= 0) {
                  n = this.yynextChar();
               } else {
                  n = this.yy_buffer[this.yy_markedPos++];
               }

               switch(n) {
               case 9:
               case 32:
                  ++this.yycolumn_next;
                  break;
               case 10:
                  ++this.yyline_next;
                  this.yycolumn_next = 0;
                  break;
               case 47:
               case 62:
                  --this.yy_markedPos;
                  this.endOfTag = true;
                  return;
               default:
                  throw this.fatalError("Whitespace missing after attribute value");
               }

               while(this.yy_endRead - this.yy_markedPos > 0) {
                  switch(this.yy_buffer[this.yy_markedPos]) {
                  case 9:
                  case 32:
                     ++this.yy_markedPos;
                     ++this.yycolumn_next;
                     break;
                  case 10:
                     ++this.yy_markedPos;
                     ++this.yyline_next;
                     this.yycolumn_next = 0;
                     break;
                  default:
                     return;
                  }
               }

               return;
            }

            if(c == 9) {
               ++this.yycolumn_next;
               this.yy_buffer[this.yy_markedPos - 1] = 32;
            } else if(c == 10) {
               ++this.yyline_next;
               this.yycolumn_next = 0;
               this.yy_buffer[this.yy_markedPos - 1] = 32;
            } else {
               ++this.yycolumn_next;
            }
         }
      }

      this.clearCbuf();
      this.appendToCbuf(this.yy_buffer, startPos, this.yy_markedPos - startPos);
      this.prevState = bufferedState;
      this.yybegin(bufferedState);
   }

   private void parseEncodedChar(char[] buf, int off, int len, int radix) throws CharConversionException {
      try {
         int e = 0;

         for(int i = 0; i < len; ++i) {
            e = e * radix + Character.digit(buf[off + i], radix);
         }

         if(e >= 1114112) {
            throw new IllegalCharException("Character reference to illegal XML character");
         } else {
            if(e >= 65536) {
               e -= 65536;
               this.appendToCbuf((char)((e >> 10) + '\ud800'));
               this.appendToCbuf((char)((e & 1023) + '\udc00'));
            } else {
               if(e < 32 && e != 9 && e != 13 && e != 10 || e >= '\ud800' && e < '\ue000' || e >= '\ufffe') {
                  throw new IllegalCharException("Character reference to illegal XML character");
               }

               this.appendToCbuf((char)e);
            }

         }
      } catch (ClassCastException var7) {
         throw new CharConversionException();
      }
   }

   private void prepareComplexElement(String elementQName) {
      this.isNamespaceDeclaration = false;
      this.elementDefinition = this.getElement(elementQName);
      if(this.elementDefinition != null) {
         this.numAttributesDefined = this.elementDefinition.getAttributeCount();
         int currentSize = this.defaultAttributeSpecified.length;
         if(currentSize < this.numAttributesDefined) {
            this.defaultAttributeSpecified = new boolean[Math.max(2 * currentSize, this.numAttributesDefined)];
         }

         for(int i = 0; i < this.numAttributesDefined; ++i) {
            this.defaultAttributeSpecified[i] = false;
         }
      } else {
         this.attributeValueType = "CDATA";
      }

   }

   private void processComplexElement() throws SAXException, IOException {
      if(this.elementDefinition != null) {
         AttributeDefinition[] attributes = this.elementDefinition.getAttributes();

         for(int i = 0; i < this.numAttributesDefined; ++i) {
            if(!this.defaultAttributeSpecified[i]) {
               AttributeDefinition ad = attributes[i];
               String defaultValue = ad.getDefaultValue();
               if(defaultValue != null) {
                  this.attribs.addAttribute(ad.getPrefix(), ad.getLocalName(), ad.getQName(), ad.getValueTypeString(), defaultValue);
               }
            }
         }
      }

   }

   private void processNSContextEnd() throws SAXException {
      int mappings = this.nsSupport.getContextSize();

      for(int i = 0; i < mappings; ++i) {
         this.parser.reportEndPrefixMapping(this.nsSupport.getContextPrefix(i));
      }

      this.nsSupport.popContext();
   }

   private void addAttribute(String prefix, String localName, String qName, String type, String value) throws SAXException {
      if(this.needsNormalization) {
         value = this.normalizeValue(value);
         this.needsNormalization = false;
      }

      if(this.isNamespaceDeclaration && this.parser.fNamespaces) {
         if(this.parser.fNamespacePrefixes) {
            this.attribs.addAndCheckAttribute(prefix, localName, qName, type, value);
         }

         if(prefix == "") {
            if(localName == "xmlns") {
               localName = "";
            }

            this.nsSupport.declarePrefix(localName, value);
            this.parser.reportStartPrefixMapping(localName, value);
         } else if(prefix != "xml") {
            this.nsSupport.declarePrefix(localName, value);
            this.parser.reportStartPrefixMapping(localName, value);
         }
      } else {
         this.attribs.addAndCheckAttribute(prefix, localName, qName, type, value);
      }

   }

   private void processSimpleElement(String elementQName) throws SAXException, IOException {
      this.elementDefinition = this.getElement(elementQName);
      if(this.elementDefinition != null) {
         AttributeDefinition[] defaults = this.elementDefinition.getAttributes();
         int numDefaults = this.elementDefinition.getAttributeCount();

         for(int i = 0; i < numDefaults; ++i) {
            AttributeDefinition ad = defaults[i];
            String defaultValue = ad.getDefaultValue();
            if(defaultValue != null) {
               this.attribs.addAttribute(ad.getPrefix(), ad.getLocalName(), ad.getQName(), ad.getValueTypeString(), defaultValue);
            }
         }
      }

   }

   String rescanAttributeValue(String defaultValue) throws SAXException, IOException {
      this.clearCbuf();
      char[] valbuf = defaultValue.toCharArray();
      this.yypushBuffer(valbuf, 0, valbuf.length);
      this.pushEntityState((String)null, false, true, this.yystate());
      this.yybegin(11);
      this.isEntityBeingParsed = false;
      if(this.yylex() != 294) {
         throw this.fatalError("Unexpected element while parsing attribute default value");
      } else {
         this.isEntityBeingParsed = true;
         return this.stringConverter.convert(this.cbuf, 0, this.cbuflen);
      }
   }

   private void resolveNamespacePrefixes() {
      this.elementURI = this.nsSupport.getURI(this.elementURI);
      int numAttributes = this.attribs.getLength();

      for(int i = 0; i < numAttributes; ++i) {
         String prefix = this.attribs.getURI(i);
         if(prefix != "") {
            String uri = this.nsSupport.getURI(prefix);
            if(uri != "") {
               this.attribs.setURI(i, uri);
            }
         }
      }

   }

   private void checkEndTag(String endQName) throws SAXException {
      String properEnd = this.tagStack.pop();
      if(this.tagStack.size() == this.entityBaseDepth) {
         this.setTokenize(true);
      }

      if(properEnd != endQName) {
         throw this.fatalError("</" + endQName + "> does not close tag <" + properEnd + ">.");
      }
   }

   private String yytext2() {
      return this.stringConverter.convert(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
   }

   private String yytext2(int start, int length) {
      return this.stringConverter.convert(this.yy_buffer, this.yy_startRead + start, length);
   }

   private FatalParsingException fatalError(String msg) {
      return new FatalParsingException(msg);
   }

   private FatalParsingException fatalError(String msg, Exception e) {
      return new FatalParsingException(msg, e);
   }

   private void safeBacktrack() {
      if(this.yy_buffer[--this.yy_markedPos] == 10) {
         --this.yyline_next;
      }

   }

   PiccoloLexer(Reader in) {
      this.yy_lexical_state = 0;
      this.yy_buffer = new char[16384];
      this.yy_saved_buffer = this.yy_buffer;
      this.yy_savePos = -1;
      this.yy_atBOL = true;
      this.yy_streams = new Stack();
      this.parser = null;
      this.currentEntity = null;
      this.stringConverter = new CharStringConverter(200);
      this.entityManager = new EntityManager();
      this.entityStack = new Stack();
      this.attribs = new AttributesHolder();
      this.cbuf = new char[1024];
      this.oneCharBuffer = new char[1];
      this.entityStateStack = new LongStack(5);
      this.entityNameStack = new StringStack(2);
      this.tagStack = new StringStack(20);
      this.elementMap = new HashMap();
      this.elementDefinition = null;
      this.tokenStartColumn = -1;
      this.defaultAttributeSpecified = new boolean[4];
      this.nsSupport = new FastNamespaceSupport();
      this.yy_sawCR = false;
      this.yy_prev_sawCR = false;
      this.yyline_next = 0;
      this.yycolumn_next = 0;
      this.yy_reader = in;
   }

   PiccoloLexer(InputStream in) {
      this((Reader)(new InputStreamReader(in)));
   }

   private static int[] yy_unpack() {
      int[] trans = new int[21172];
      byte offset = 0;
      yy_unpack("\'(\'(\')*\'()\'(\b\'\f+,6+\n-)*7-./././0./.\b/././1/\b./.2/3/4/\f5665.7.7.8.7).7\t.9.:.9:.:9:;.\b:.:.:.:.<:.9\b:.=.=.>=.=.?\b=.=.=.=.@=.\b=.9.AB.9B.CB9BD.\bB.B.B.B.EB.9\bB.FG.G.>G.G.?\bG.G.G.G.HG.\bG.I.I\t.I(.JI\b.KLKLK.M.KL\bK.N.N.NO.N.\bN.N.NPN\b.N.QNRNSNTUTUT.V(TWTU\bTXUXUX.V)XWXU\bXYZYZY.[YZ#Y\\YZ\bY]^]^]._]^$]\\]^\b]`a`a`.b`a#`c`a\b`deded.bde$dcde\bd.f.f\t.f.g%.f\t.h.h\t.h.i%.h\t.j.j.k.j.l.m\".j\t.j.n.jn.njn.o.\bn.n.n.n\b.n.j\bn.j.pq.jq.qjqro.\bq.q.q.q\b.q.j\bq.j.j\t.j.o.st.u.v.w.j\t.j.x.jx.xjx.y.\bx.x.x.x\b.x.j\bx.jz.jz.zjz.o.\tz.z.z.z{.|.z.j\bz!}~!}\n\f+.j.j\t.j#..j\t..z.z.zzro.zzz.zzz|.z.\bz\f..*.\t-\t)\b\t ¡\t¡¡ \r¡.¢.¢.¢.¢.\b¢.¢.¢P¢\b.¢.\b¢.£.£.£.£.\b£.£.£.£\b.£.\b£C \f¤¥B¤¥¤¦.¤ § § § § ¨ \t§ § § §\b § \b§ § § § § ¨ \t§ § § §\b § §©§\t ª «7 § § §¬§ § ¨ \t§ § § §\b § §­§ § § § § ¨ \t§ § § §\b § §®§ § § § § ¨ \t§ § § §\b § §¯§\f°±B°±°².° 7 7\t 7) 7 ³/ 9 9\t 9) 9\n : : : : \t: : : :\b : \b: ´0 = = = = \t= = = =\b = \b= µ µ ¶µ ·µ \bµ µ µ µ\b µ \bµ! ¸¹ º! » » » » \b» » » »\b » \b» A A A A \tA A A A\b A \bA B¼B B B B \tB B B B\b B \bB B¼B B B½B B \tB B B B\b B \bB ¾0 F F F F \tF F F F\b F \bF G¿G G G G \tG G G G\b G \bG ÀÁ Á Á Á \bÁ Á Á Á\b Á \bÁ Â Â\t Â( ÃÂ\t Ã Ã\t Ã# ÄÅ Ã\b K K K .K \bK Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ \bÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÈÆ\t É Ê7 Æ Æ ÆËÆ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÌÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÍÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆÎÆT T T (T T \bT U U3 U\t Ï Ï\t Ï Ï! Ï Ï\b X X X )X X \bXY Y Y Y #Y Y \bY Z Z\t Z# Ð Z\t Ñ Ñ\t Ñ Ñ! Ñ Ñ\b ] ] ] ] $] ] \b] ^ ^\t ^$ Ð ^\b ` ` ` ` #` ` \b` a a\t a# Ò a\t Ó Ó\t Ó Ó! Ó Ó\b d d d d $d d \bd e e\t e$ Ò e\t Ô Ô\t Ô g% Ô\t Õ Õ\t Õ i% Õ\t j j\t j) j Ö Ö Ö Ö \bÖ Ö Ö Ö\b Ö \bÖ × ×\t × Ø Ù\" ×\n n n n n \tn n n n\b n \bn Ú Ú Ú Ú \bÚ Ú Ú Ú\b Ú \bÚ p p p p \tp p p p\b p \bp qÛq q q q \tq q q q\b q \bq Ü: Ý\r ÞF ßB à  x x x x \tx x x x\b x \bx á Ú Ú ÚáÚ \bÚ Ú Ú Ú\b Ú á\bÚ z z z z \tz z z z\b z \bz!âãBâä!â\n \f + åA Ù- æ æ \bæ æ \næ æ çæ è è \bè è \nè è ç\rè  \t   \n z z z zéz \tz z z z\b z \bz z z z z zêz zëz z z\b z \bz z z z z zìz z z zí\b z \bz z z z z zîz z z z\b z \bz z z z z zïz z z z\b z \bz  \t ) \n z z z z \tz z zðz z\b z \bz ñ\b òó ô  \t õ \t õ\r ö ö ÷ö øö \bö ö ö ö\b ö \bö ùú û üý   \t - \t -  \t ) \b   $\b \t  ¡ \t¡ ¡ \r¡ þ þ þ þ ÿ \tþ þ þ þ\b þ \bþ Ā Ā Ā Ā ā \tĀ Ā Ā Ā\b Ā \bĀ § § § § Ă \t§ § § §\b § \b§\t ª\f ă5 Ą Ą Ą Ą Ą Ą Ą Ą § § § § ¨ \t§ § § §\b § §ą§ § § § § ¨ \t§ § § §\b § §Ć§ § § § § ¨ \t§ § § §\b § §ć§ § § § § Ĉ \t§ § § §\b § \b§ µ µ µ µ \tµ µ µ µ\b µ \bµ µ µ µĉµ µĊµ \tµ µ µ µ\b µ \bµ µ µ µĊµ µĊµ \tµ µ µ µ\b µ \bµ! ċD Č? č$ » » » » \t» » » »\b » \b» AĎ ĎA Ď Ď \bĎA Ď Ď Ď\b Ď \bĎ B¼B B Bď B \tB B B B\b B \bB FĐ ĐF Đ Đ \bĐF Đ Đ Đ\b Đ \bĐ À À À À \tÀ À À À\b À \bÀ ÁđÁ Á Á Á \tÁ Á Á Á\b Á \bÁ Æ Æ Æ Æ Ē \tÆ Æ Æ Æ\b Æ \bÆ\t É\f ē5 Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆĕÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆĖÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆėÆ Æ Æ Æ Æ Ę \tÆ Æ Æ Æ\b Æ \bÆ Ö Ö Ö Ö ę \tÖ Ö Ö Ö\b Ö \bÖ × ×\t × Ø% × Ě0 Ú Ú Ú Ú ě \tÚ Ú Ú Ú\b Ú \bÚ pĜ Ĝp Ĝ Ĝ \bĜp Ĝ Ĝ Ĝ\b Ĝ \bĜ ĝB ĞB ğL Ġ; ġ% á á) á ĢP ģ\" z z z z \tz z Ĥz z\b z \bz z z z z zĥz z z z\b z \bz z z z z zĦz z z z\b z \bz z z z z \tz ħz z z\b z \bz z z z z zĨz z z z\b z \bz z z z z zĩz z z z\b z \bz z z z z zĪz z z z\b z \bz z z z z \tz z zī z\b z \bz ĬI ĭE ĮI į! ö ö ö ö \tö ö ö ö\b ö \bö ö ö öİö öıö \tö ö ö ö\b ö \bö ö ö öıö öıö \tö ö ö ö\b ö \bö Ĳ ĳH Ĵ= ĵH Ķ* Ą\f ķ Ą Ą Ą Ą Ą Ą Ą § § § § ĸ \t§ § § §\b § \b§ § § § § ¨ \t§ § § §\b §Ĺ \b§ § § § § ¨ \t§ § § §\b § §ĺ§ µ µ µĻ µļ \tµ µ µ µ\b µ \bµ µ µ µļ µļ \tµ µ µ µ\b µ \bµ!ċĽ!ċ$ ľA Ŀ! ĎAĎ Ď Ď Ď \tĎ Ď Ď Ď\b Ď \bĎ B¼B B B B \tB B B B\b ŀB \bB ĐFĐ Đ Đ Đ \tĐ Đ Đ Đ\b Đ \bĐ ÀŁ ŁÀ Ł Ł \bŁÀ Ł Ł Ł\b Ł \bŁ\t Ĕ\f ł Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Ĕ Æ Æ Æ Æ Ń \tÆ Æ Æ Æ\b Æ \bÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æń \bÆ Æ Æ Æ Æ Ç \tÆ Æ Æ Æ\b Æ ÆŅÆ ĜpĜ Ĝ Ĝ Ĝ \tĜ Ĝ Ĝ Ĝ\b Ĝ \bĜ ņF Ň@ ň= ŉD Ŋ) z z z z zŋz z z z\b z \bz z z z z zŌz z z z\b z \bz z z z z zōz z z z\b z \bz z z z zŎ \tz z z z\b z \bz z z z z zŏz z z z\b z \bz z z z z zŐz z z z\b z \bz z z z ző \tz z z z\b z \bz) ŒF œ& ŔU ŕ  ö ö öŖ öŗ \tö ö ö ö\b ö \bö ö ö öŗ öŗ \tö ö ö ö\b ö \bö ŘD řB ŚB ś) § § § § Ŝ \t§ § § §\b § \b§ § § § § ŝ \t§ § § §\b § \b§ Şµ şµ ŞµŞµ \tµ µ µ µ\b µ Ş\bµ şµ şµ şµşµ \tµ µ µ µ\b µ ş\bµ!ċŠ!ċ š? Ţ) B¼B B B B \tB B B B\b Bţ \bB ŁÀŁ Ł Ł Ł \tŁ Ł Ł Ł\b Ł \bŁ Æ Æ Æ Æ Ť \tÆ Æ Æ Æ\b Æ \bÆ Æ Æ Æ Æ ť \tÆ Æ Æ Æ\b Æ \bÆ ŦN ŧ6 ŨM ũ: Ū& z z z z zūz z z z\b z \bz z z z z zŬz z z z\b z \bz z z z z zŭz z z z\b z \bz z z z z \tz z zŮz z\b z \bz z z z z \tz zůz z z\b z \bz z z z z Ű\bz z z z\b z \bz z z z z zűz z z z\b z \bz ŲY ų1 ŴG ŵ% Ŷö şö ŶöŶö \tö ö ö ö\b ö Ŷ\bö şö şö şöşö \tö ö ö ö\b ö ş\bö ŷL ŸD Ź7 źC ŻI żD Ž& žBſB žB BžB \tB B B B\b Bƀž\bB ƁƂ> ƃE ƄE ƅ% z z z z zƆz z z z\b z \bz z z z z \tz zƇz z z\b z \bz z z z z ƈ\bz z z z\b z \bz z z z zƉz \tz z z z\b z \bz z z z z \tz Ɗz z z\b z \bz ƋB ƌJ ƍ9 Ǝ@ ƏD ƐB ƑC ƒD ƓM Ɣ ž ž\t ž( ƀž\n Aƕ ƕA ƕ ƕ \bƕA ƕ ƕ ƕ\b ƕ \bƕ ƀ ƀ\t ƀ# ƖƗ ƀ! ƘC ƙH ƚ$ z z z z zƛz z z z\b z \bz z z z z Ɯ\bz z z z\b z \bz ƝN ƞ; Ɵ> ƠE ơA ƢE ƣE Ƥ9 ƥ+ ƕAƕ ƕ ƕ ƕ \tƕ ƕ ƕ ƕ\b ƕ \bƕ ƦB Ƨ= ƨ* z z z z zƩz z z z\b z \bz$ ƪ7 ƫD ƬG ƭ= Ʈ( Ư Ư) Ư, ư8 Ʊ( ", offset, trans);
      return trans;
   }

   private static int yy_unpack(String packed, int offset, int[] trans) {
      int i = 0;
      int j = offset;
      int l = packed.length();

      while(i < l) {
         int count = packed.charAt(i++);
         char value = packed.charAt(i++);
         int var8 = value - 1;

         while(true) {
            trans[j++] = var8;
            --count;
            if(count <= 0) {
               break;
            }
         }
      }

      return j;
   }

   private static char[] yy_unpack_cmap(String packed) {
      char[] map = new char[65536];
      int i = 0;
      int j = 0;

      while(i < 1350) {
         int count = packed.charAt(i++);
         char value = packed.charAt(i++);

         while(true) {
            map[j++] = value;
            --count;
            if(count <= 0) {
               break;
            }
         }
      }

      return map;
   }

   private boolean yy_refill() throws IOException {
      int save_at = this.yy_savePos < 0?(this.yy_startRead > 0?this.yy_startRead - 1:this.yy_startRead):this.yy_savePos;
      if(save_at > 0) {
         System.arraycopy(this.yy_buffer, save_at, this.yy_buffer, 0, this.yy_endRead - save_at);
         this.yy_endRead -= save_at;
         this.yy_currentPos -= save_at;
         this.yy_markedPos -= save_at;
         this.yy_pushbackPos -= save_at;
         this.yy_startRead -= save_at;
         if(this.yy_savePos >= 0) {
            this.yy_savePos = 0;
         }
      }

      if(this.yy_markedPos >= this.yy_buffer.length || this.yy_currentPos >= this.yy_buffer.length) {
         char[] numRead = new char[this.yy_buffer.length * 2];
         System.arraycopy(this.yy_buffer, 0, numRead, 0, this.yy_buffer.length);
         this.yy_buffer = numRead;
         if(this.yy_buffer.length > this.yy_saved_buffer.length) {
            this.yy_saved_buffer = this.yy_buffer;
         }
      }

      int numRead1;
      for(numRead1 = 0; numRead1 == 0; numRead1 = this.yy_reader.read(this.yy_buffer, this.yy_endRead, this.yy_buffer.length - this.yy_endRead)) {
         ;
      }

      if(numRead1 < 0) {
         return true;
      } else {
         this.yy_endRead += numRead1;
         return false;
      }
   }

   public final void yyclose() throws IOException {
      this.yy_atEOF = true;
      this.yy_endRead = this.yy_startRead;
      if(this.yy_reader != null) {
         this.yy_reader.close();
      }

   }

   public final void yypushStream(Reader reader) {
      this.yy_streams.push(new PiccoloLexer.YY_StreamInfo(this.yy_reader, this.yy_endRead, this.yy_startRead, this.yy_savePos, this.yy_currentPos, this.yy_markedPos, this.yy_pushbackPos, this.yy_buffer, this.yy_atEOF, this.yyline_next, this.yycolumn_next));
      this.yy_atEOF = false;
      this.yy_buffer = new char[16384];
      this.yy_reader = reader;
      this.yy_endRead = this.yy_startRead = 0;
      this.yy_savePos = -1;
      this.yy_currentPos = this.yy_markedPos = this.yy_pushbackPos = 0;
      this.yyline = this.yycolumn = this.yyline_next = this.yycolumn_next = 0;
      this.yy_endRead_l = this.yy_endRead;
      this.yy_buffer_l = this.yy_buffer;
   }

   public final void yypushBuffer(char[] buffer, int off, int len) {
      this.yy_streams.push(new PiccoloLexer.YY_StreamInfo(this.yy_reader, this.yy_endRead, this.yy_startRead, this.yy_savePos, this.yy_currentPos, this.yy_markedPos, this.yy_pushbackPos, this.yy_buffer, this.yy_atEOF, this.yyline, this.yycolumn));
      this.yy_atEOF = true;
      this.yy_buffer = buffer;
      this.yy_reader = null;
      this.yy_startRead = this.yy_markedPos = this.yy_currentPos = this.yy_pushbackPos = off;
      this.yy_savePos = -1;
      this.yy_endRead = this.yy_startRead + len;
      this.yyline = this.yycolumn = this.yyline_next = this.yycolumn_next = 0;
      this.yy_endRead_l = this.yy_endRead;
      this.yy_buffer_l = this.yy_buffer;
   }

   public final void yypopStream() throws IOException {
      if(this.yy_reader != null) {
         this.yy_reader.close();
      }

      PiccoloLexer.YY_StreamInfo s = (PiccoloLexer.YY_StreamInfo)this.yy_streams.pop();
      this.yy_buffer = s.yy_buffer;
      this.yy_reader = s.yy_reader;
      this.yy_endRead = s.yy_endRead;
      this.yy_startRead = s.yy_startRead;
      this.yy_savePos = s.yy_savePos;
      this.yy_currentPos = s.yy_currentPos;
      this.yy_markedPos = s.yy_markedPos;
      this.yy_pushbackPos = s.yy_pushbackPos;
      this.yy_atEOF = s.yy_atEOF;
      this.yyline = s.yyline;
      this.yycolumn = s.yycolumn;
      this.yyline_next = this.yyline;
      this.yycolumn_next = this.yycolumn;
      this.yy_endRead_l = this.yy_endRead;
      this.yy_buffer_l = this.yy_buffer;
      this.yycmap_l = yycmap;
   }

   public final boolean yymoreStreams() {
      return !this.yy_streams.isEmpty();
   }

   public final void yyreset(Reader reader) throws IOException {
      this.yyclose();
      this.yy_buffer = this.yy_saved_buffer;
      this.yy_reader = reader;
      this.yy_atBOL = true;
      this.yy_atEOF = false;
      this.yy_endRead = this.yy_startRead = 0;
      this.yy_savePos = -1;
      this.yy_currentPos = this.yy_markedPos = this.yy_pushbackPos = 0;
      this.yyline = this.yychar = this.yycolumn = 0;
      this.yy_state = this.yy_lexical_state = 0;
      this.yy_sawCR = false;
      this.yyline_next = this.yycolumn_next = 0;
      this.yy_streams.clear();
   }

   public final void yyreset(char[] buffer, int off, int len) throws IOException {
      this.yyclose();
      this.yy_buffer = buffer;
      this.yy_reader = null;
      this.yy_atBOL = true;
      this.yy_atEOF = true;
      this.yy_currentPos = this.yy_markedPos = this.yy_pushbackPos = this.yy_startRead = off;
      this.yy_savePos = -1;
      this.yy_endRead = off + len;
      this.yyline = this.yychar = this.yycolumn = 0;
      this.yy_state = this.yy_lexical_state = 0;
      this.yy_sawCR = false;
      this.yyline_next = this.yycolumn_next = 0;
      this.yy_endRead_l = this.yy_endRead;
      this.yy_buffer_l = this.yy_buffer;
      this.yy_streams.clear();
   }

   public final int yystate() {
      return this.yy_lexical_state;
   }

   public final void yybegin(int newState) {
      this.yy_lexical_state = newState;
   }

   public final String yytext() {
      return new String(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
   }

   public final String yytext(int offset, int length) {
      return new String(this.yy_buffer, this.yy_startRead + offset, length);
   }

   public final void yynextAction() {
      this.yyline = this.yyline_next;
      this.yycolumn = this.yycolumn_next;
      this.yy_currentPos = this.yy_startRead = this.yy_markedPos;
   }

   public final int yynextChar() throws IOException {
      if(this.yy_markedPos < this.yy_endRead) {
         return this.yy_buffer[this.yy_markedPos++];
      } else if(this.yy_atEOF) {
         return -1;
      } else {
         boolean eof = this.yy_refill();
         this.yy_buffer_l = this.yy_buffer;
         this.yy_endRead_l = this.yy_endRead;
         return eof?-1:this.yy_buffer[this.yy_markedPos++];
      }
   }

   public final int yynextBufferChar() {
      return this.yy_buffer[this.yy_markedPos++];
   }

   public final void yycountChar(int yy_input) {
      switch(yy_input) {
      case 10:
         ++this.yyline_next;
         this.yycolumn_next = 0;
         break;
      default:
         ++this.yycolumn_next;
      }

   }

   public final char yycharat(int pos) {
      return this.yy_buffer[this.yy_startRead + pos];
   }

   public final int yybufferLeft() {
      return this.yy_endRead - this.yy_markedPos;
   }

   public final void yyskip(int n) {
      this.yy_markedPos += n;
      this.yy_markedPos_l = this.yy_markedPos;
      if(this.yy_markedPos > this.yy_endRead) {
         this.yy_ScanError(4);
      }

   }

   public final int yylength() {
      return this.yy_markedPos - this.yy_startRead;
   }

   private void yy_ScanError(int errorCode) {
      String message;
      try {
         message = YY_ERROR_MSG[errorCode];
      } catch (ArrayIndexOutOfBoundsException var4) {
         message = YY_ERROR_MSG[0];
      }

      throw new Error(message);
   }

   private void yypushback(int number) {
      if(number > this.yylength()) {
         this.yy_ScanError(3);
      }

      this.yy_markedPos -= number;
      this.yyline_next = this.yyline;
      this.yycolumn_next = this.yycolumn;
      this.yy_sawCR = this.yy_prev_sawCR;

      for(int pos = this.yy_startRead; pos < this.yy_markedPos; ++pos) {
         this.yycountChar(this.yy_buffer[pos]);
      }

   }

   private void yy_do_eof() throws IOException {
      if(!this.yy_eof_done) {
         this.yy_eof_done = true;
         this.yyclose();
      }

   }

   public int yylex() throws IOException, SAXException, FatalParsingException {
      this.yy_endRead_l = this.yy_endRead;
      this.yy_buffer_l = this.yy_buffer;
      this.yycmap_l = yycmap;
      int[] yytrans_l = yytrans;
      int[] yy_rowMap_l = yy_rowMap;
      byte[] yy_attr_l = YY_ATTRIBUTE;
      int yy_pushbackPos_l = this.yy_pushbackPos = -1;

      label531:
      while(true) {
         this.yy_markedPos_l = this.yy_markedPos;
         int yyline_next_l = this.yyline_next;
         this.yyline = this.yyline_next;
         int yycolumn_next_l = this.yycolumn_next;
         this.yycolumn = this.yycolumn_next;
         int yy_action = -1;
         this.yy_startRead_l = this.yy_currentPos_l = this.yy_currentPos = this.yy_startRead = this.yy_markedPos_l;
         this.yy_state = this.yy_lexical_state;
         boolean yy_was_pushback = false;

         int yy_input;
         boolean prevReturnEndToken;
         int var16;
         while(true) {
            if(this.yy_currentPos_l < this.yy_endRead_l) {
               yy_input = this.yy_buffer_l[this.yy_currentPos_l++];
            } else {
               if(this.yy_atEOF) {
                  yy_input = -1;
                  break;
               }

               this.yy_currentPos = this.yy_currentPos_l;
               this.yy_markedPos = this.yy_markedPos_l;
               this.yy_pushbackPos = yy_pushbackPos_l;
               prevReturnEndToken = this.yy_refill();
               this.yy_currentPos_l = this.yy_currentPos;
               this.yy_markedPos_l = this.yy_markedPos;
               this.yy_buffer_l = this.yy_buffer;
               this.yy_endRead_l = this.yy_endRead;
               yy_pushbackPos_l = this.yy_pushbackPos;
               if(prevReturnEndToken) {
                  yy_input = -1;
                  break;
               }

               yy_input = this.yy_buffer_l[this.yy_currentPos_l++];
            }

            switch(yy_input) {
            case 10:
               ++yyline_next_l;
               yycolumn_next_l = 0;
               break;
            default:
               ++yycolumn_next_l;
            }

            var16 = yytrans_l[yy_rowMap_l[this.yy_state] + this.yycmap_l[yy_input]];
            if(var16 == -1) {
               break;
            }

            this.yy_state = var16;
            byte prevIsParamEntity = yy_attr_l[this.yy_state];
            if((prevIsParamEntity & 2) == 2) {
               yy_pushbackPos_l = this.yy_currentPos_l;
            }

            if((prevIsParamEntity & 1) == 1) {
               yy_was_pushback = (prevIsParamEntity & 4) == 4;
               yy_action = this.yy_state;
               this.yy_markedPos_l = this.yy_currentPos_l;
               this.yyline_next = yyline_next_l;
               this.yycolumn_next = yycolumn_next_l;
               if((prevIsParamEntity & 8) == 8) {
                  break;
               }
            }
         }

         this.yy_markedPos = this.yy_markedPos_l;
         if(yy_was_pushback) {
            this.yy_markedPos = yy_pushbackPos_l;
         }

         switch(yy_action) {
         case 5:
         case 54:
            this.yybegin(4);
         case 6:
         case 8:
         case 28:
         case 56:
         case 126:
         case 127:
         case 128:
         case 434:
         case 435:
         case 436:
         case 437:
         case 438:
         case 439:
         case 440:
         case 441:
         case 442:
         case 443:
         case 444:
         case 445:
         case 446:
         case 447:
         case 448:
         case 449:
         case 450:
         case 451:
         case 452:
         case 453:
         case 454:
         case 455:
         case 456:
         case 457:
         case 458:
         case 459:
         case 460:
         case 461:
         case 462:
         case 463:
         case 464:
         case 465:
         case 466:
         case 467:
         case 468:
         case 469:
         case 470:
         case 471:
         case 472:
         case 473:
         case 474:
         case 475:
         case 476:
         case 477:
         case 478:
         case 479:
         case 480:
         case 481:
         case 482:
         case 483:
         case 484:
         case 485:
         case 486:
         case 487:
         case 488:
         case 489:
         case 490:
         case 491:
         case 492:
         case 493:
         case 494:
         case 495:
         case 496:
         case 497:
         case 498:
         case 499:
         case 500:
         case 501:
         case 502:
         case 503:
         case 504:
         case 505:
         case 506:
         case 507:
         case 508:
         case 509:
         case 510:
         case 511:
         case 512:
         case 513:
         case 514:
         case 515:
         case 516:
         case 517:
         case 518:
         case 519:
         case 520:
         case 521:
         case 522:
         case 523:
         case 524:
         case 525:
         case 526:
         case 527:
         case 528:
         case 529:
         case 530:
         case 531:
         case 532:
         case 533:
         case 534:
         case 535:
         case 536:
         case 537:
         case 538:
         case 539:
         case 540:
         case 541:
         case 542:
         case 543:
         case 544:
         case 545:
         case 546:
         case 547:
         case 548:
         case 549:
         case 550:
         case 551:
         case 552:
         case 553:
         case 554:
         case 555:
         case 556:
         case 557:
         case 558:
         case 559:
         case 560:
         case 561:
         case 562:
         case 563:
         case 564:
         case 565:
         case 566:
         case 567:
         case 568:
         case 569:
         case 570:
         case 571:
         case 572:
         case 573:
         case 574:
         case 575:
            break;
         case 7:
         case 9:
         case 10:
         case 12:
         case 19:
         case 20:
         case 27:
         case 31:
         case 36:
         case 37:
         case 163:
         case 164:
         case 166:
         case 168:
         case 169:
         case 170:
         case 171:
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
         case 183:
         case 184:
         case 185:
         case 193:
         case 194:
         case 197:
         case 199:
         case 200:
         case 201:
         case 202:
         case 203:
         case 204:
         case 205:
         case 207:
         case 209:
         case 211:
         case 212:
         case 213:
         case 214:
         case 216:
         case 217:
         case 219:
         case 220:
         case 221:
         case 223:
         case 225:
         case 226:
         case 227:
         case 228:
         case 229:
         case 231:
         case 240:
         case 241:
         case 242:
         case 243:
         case 248:
         case 249:
         case 250:
         case 251:
         case 253:
         case 255:
         case 259:
         case 260:
         case 261:
         case 262:
         case 266:
         case 267:
         case 268:
         case 275:
         case 276:
         case 277:
         case 278:
         case 284:
         case 285:
         case 286:
         case 287:
         case 288:
         case 299:
         case 300:
         case 301:
         case 302:
         case 305:
         case 306:
         case 307:
         case 308:
         case 312:
         case 313:
         case 316:
         case 317:
         case 318:
         case 323:
         case 324:
         case 325:
         case 326:
         case 327:
         case 328:
         case 329:
         case 337:
         case 338:
         case 339:
         case 340:
         case 343:
         case 344:
         case 345:
         case 346:
         case 351:
         case 352:
         case 353:
         case 357:
         case 358:
         case 359:
         case 369:
         case 370:
         case 371:
         case 372:
         case 374:
         case 375:
         case 376:
         case 377:
         case 379:
         case 380:
         case 381:
         case 383:
         case 384:
         case 386:
         case 387:
         case 394:
         case 395:
         case 397:
         case 398:
         case 399:
         case 400:
         case 401:
         case 402:
         case 403:
         case 407:
         case 409:
         case 412:
         case 413:
         case 415:
         case 417:
         case 418:
         case 420:
         case 426:
         case 428:
         case 433:
         default:
            if(yy_input == -1 && this.yy_startRead == this.yy_currentPos) {
               this.yy_atEOF = true;
               this.yy_do_eof();
               switch(this.yy_lexical_state) {
               case 3:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 4:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 5:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 8:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 9:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 10:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 12:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 19:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 20:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 27:
                  throw this.fatalError("Entity is not well-formed (ending lex state: " + this.yystate() + ")");
               case 434:
               case 435:
               case 436:
               case 437:
               case 438:
               case 439:
               case 440:
               case 441:
               case 442:
               case 443:
                  continue;
               default:
                  if(!this.yymoreStreams()) {
                     return 0;
                  }

                  this.yypopStream();
                  if(this.isEntityBeingParsed) {
                     if(this.currentEntity != null) {
                        this.currentEntity.close();
                     }

                     this.currentEntity = (Entity)this.entityStack.pop();
                  }

                  prevReturnEndToken = this.returnEntityEndToken;
                  boolean var17 = this.isParamEntity;
                  this.popEntityState();
                  if(prevReturnEndToken) {
                     return 294;
                  }

                  if(var17) {
                     return 266;
                  }
                  continue;
               }
            }

            this.yy_ScanError(2);
            break;
         case 11:
         case 74:
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
            break;
         case 13:
         case 14:
         case 17:
         case 18:
         case 83:
         case 87:
         case 95:
         case 99:
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
            break;
         case 15:
         case 89:
            this.clearCbuf();
            this.prevState = 17;
            this.yybegin(this.prevState);
            break;
         case 16:
         case 93:
            this.clearCbuf();
            this.prevState = 18;
            this.yybegin(this.prevState);
            break;
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 29:
         case 30:
         case 105:
         case 131:
            return 266;
         case 32:
         case 150:
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
            break;
         case 33:
         case 154:
         case 155:
            this.yybegin(32);
            break;
         case 34:
         case 156:
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yylength());
            break;
         case 35:
         case 160:
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yylength());
            break;
         case 38:
            this.safeBacktrack();
            this.parseCdata();
            this.parser.reportCdata();
            return 257;
         case 39:
            var16 = this.parseWhitespace();
            if(var16 == 257) {
               this.parser.reportCdata();
            }

            return var16;
         case 40:
            this.tokenStartLine = this.yyline_next + 1;
            this.tokenStartColumn = this.yycolumn_next + 1;
            this.yybegin(this.tagStartState);
            if(this.parser.fNamespaces) {
               var16 = this.parseTagNS();
            } else {
               var16 = this.parseTag();
            }

            if(var16 != -1 && this.tokenizeInput) {
               if(this.tagType == 263) {
                  this.setTokenize(false);
               }

               return this.tagType;
            }
            break;
         case 41:
            this.yybegin(3);
            break;
         case 42:
         case 43:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 55:
         case 59:
         case 61:
         case 62:
         case 63:
         case 68:
         case 71:
         case 72:
         case 73:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 86:
         case 91:
         case 98:
         case 101:
         case 103:
         case 107:
         case 108:
         case 110:
         case 114:
         case 115:
         case 116:
         case 117:
         case 120:
         case 124:
         case 125:
         case 129:
         case 130:
         case 141:
         case 148:
         case 149:
         case 161:
         case 162:
            throw this.fatalError("Unexpected character encountered (lex state " + this.yystate() + "): \'" + this.yytext() + "\'");
         case 44:
            this.safeBacktrack();
            var16 = this.parseXML();
            if(var16 != 0) {
               return var16;
            }
            break;
         case 57:
            this.attributeQName = this.yytext2();
            this.yybegin(10);
            break;
         case 58:
            this.yybegin(this.baseState);
            this.tagStack.push(this.stringValue);
            this.processComplexElement();
            this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
            this.attribs.clear();
            if(this.tokenizeInput) {
               this.setTokenize(false);
               return 263;
            }
            break;
         case 60:
            this.yybegin(6);
            this.stringValue = this.yytext2();
            this.prepareComplexElement(this.stringValue);
            break;
         case 64:
         case 65:
         case 66:
         case 187:
         case 188:
         case 270:
         case 319:
         case 354:
         case 382:
            this.isNamespaceDeclaration = false;
            this.attributeLocalName = this.attributeQName = this.yytext2();
            this.attributeURI = "";
            this.yybegin(10);
            break;
         case 67:
            this.yybegin(this.baseState);
            this.processComplexElement();
            this.resolveNamespacePrefixes();
            this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
            this.attribs.clear();
            this.tagStack.push(this.stringValue);
            if(this.tokenizeInput) {
               this.setTokenize(false);
               return 263;
            }
            break;
         case 69:
         case 70:
         case 190:
            this.nsSupport.pushContext();
            this.yybegin(8);
            this.elementURI = "";
            this.elementLocalName = this.stringValue = this.yytext2();
            this.prepareComplexElement(this.stringValue);
            break;
         case 75:
            this.appendToCbuf(' ');
            break;
         case 76:
            this.yybegin(12);
            break;
         case 84:
            var16 = 0;

            while(true) {
               if(var16 >= this.yylength()) {
                  continue label531;
               }

               this.appendToCbuf(' ');
               ++var16;
            }
         case 85:
            this.yybegin(12);
            break;
         case 88:
            this.clearCbuf();
            this.prevState = 17;
            this.yybegin(this.prevState);
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
            break;
         case 90:
            this.clearCbuf();
            this.prevState = 17;
            this.needsNormalization = true;
            this.yybegin(12);
            break;
         case 92:
            this.clearCbuf();
            this.prevState = 18;
            this.yybegin(this.prevState);
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
            break;
         case 94:
            this.clearCbuf();
            this.prevState = 18;
            this.needsNormalization = true;
            this.yybegin(12);
            break;
         case 96:
         case 100:
            this.appendToCbuf(' ');
            break;
         case 97:
            this.needsNormalization = true;
            this.yybegin(12);
            break;
         case 102:
            this.yybegin(this.baseState);
            this.checkEndTag(this.stringValue);
            this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
            if(this.tokenizeInput) {
               return 264;
            }
            break;
         case 104:
            this.yybegin(this.baseState);
            this.checkEndTag(this.stringValue);
            this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
            this.processNSContextEnd();
            if(this.tokenizeInput) {
               return 264;
            }
            break;
         case 106:
            this.yybegin(31);
            this.bypassPERefs = this.bypassGERefs = false;
            break;
         case 109:
            this.yybegin(23);
            this.bypassPERefs = true;
            return this.stringToken(260, this.yytext2());
         case 111:
         case 112:
         case 218:
            this.yybegin(24);
            return this.stringToken(299, this.yytext2());
         case 113:
            this.yybegin(21);
            return 258;
         case 118:
            this.yybegin(26);
            return 274;
         case 119:
            this.yybegin(30);
            return this.stringToken(260, this.yytext2());
         case 121:
            return this.stringToken(260, this.yytext2());
         case 122:
            this.yybegin(30);
            return 275;
         case 123:
            return 277;
         case 132:
            return 313;
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 140:
         case 232:
         case 233:
         case 234:
         case 235:
         case 236:
         case 237:
         case 238:
         case 239:
         case 291:
         case 292:
         case 293:
         case 294:
         case 295:
         case 297:
         case 298:
         case 330:
         case 331:
         case 332:
         case 333:
         case 334:
         case 335:
         case 336:
         case 363:
         case 365:
         case 366:
         case 367:
         case 368:
         case 389:
         case 390:
         case 410:
            return this.stringToken(260, this.yytext2());
         case 138:
            this.yybegin(21);
            return 276;
         case 139:
            return 274;
         case 142:
            return 275;
         case 143:
            return 311;
         case 144:
            return 314;
         case 145:
            return 312;
         case 146:
            this.prevState = 34;
            this.clearCbuf();
            this.appendToCbuf(this.yy_buffer, this.yy_startRead + 1, this.yylength() - 1);
            this.yybegin(this.prevState);
            break;
         case 147:
            this.prevState = 35;
            this.clearCbuf();
            this.appendToCbuf(this.yy_buffer, this.yy_startRead + 1, this.yylength() - 1);
            this.yybegin(this.prevState);
            break;
         case 151:
            this.yybegin(36);
            break;
         case 152:
            this.yybegin(37);
            break;
         case 153:
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
            this.yybegin(32);
            break;
         case 157:
            if(this.bypassGERefs) {
               this.appendToCbuf('&');
            } else {
               this.yybegin(36);
            }
            break;
         case 158:
            if(this.bypassPERefs) {
               this.appendToCbuf('%');
            } else {
               this.yybegin(37);
            }
            break;
         case 159:
            this.yybegin(30);
            return this.stringToken(261, new String(this.cbuf, 0, this.cbuflen));
         case 165:
            if(this.currentEntity.isInternal()) {
               throw this.fatalError("XML declarations are not allowed in internal entities");
            }

            this.yybegin(this.prevState);
            if(this.currentEntity.getXMLVersion() != null) {
               if(this.currentEntity.getDeclaredEncoding() == null) {
                  return 315;
               }

               if(this.currentEntity.isStandaloneDeclared()) {
                  return 315;
               }

               return 317;
            }

            if(this.currentEntity.getDeclaredEncoding() != null && !this.currentEntity.isStandaloneDeclared()) {
               return 316;
            }

            throw this.fatalError("XML declaration is not well-formed");
         case 167:
            this.yybegin(this.baseState);
            var16 = this.handleEntityRef(this.yytext2(0, this.yylength() - 1), 0);
            if(var16 != 0) {
               return var16;
            }
            break;
         case 177:
            this.yybegin(this.piPrevState);
            this.parser.reportPI(this.elementQName, this.yytext(0, this.yylength() - 2));
            if(this.tokenizeInput) {
               return 259;
            }
            break;
         case 178:
            this.yybegin(this.piPrevState);
            this.parser.reportPI(this.elementQName, "");
            if(this.piPrevState != 33 && this.tokenizeInput) {
               return 259;
            }
            break;
         case 179:
            this.yybegin(this.baseState);
            this.processComplexElement();
            this.parser.reportStartTag("", "", this.stringValue);
            this.parser.reportEndTag("", "", this.stringValue);
            this.attribs.clear();
            if(this.tokenizeInput) {
               return 265;
            }
            break;
         case 180:
         case 181:
         case 182:
         case 264:
         case 265:
         case 314:
         case 315:
            this.piPrevState = this.baseState;
            this.elementQName = this.yytext2(1, this.yylength() - 1);
            this.yybegin(5);
            break;
         case 186:
            this.yybegin(19);
            this.stringValue = this.yytext2(1, this.yylength() - 1);
            break;
         case 189:
            this.yybegin(this.baseState);
            this.processComplexElement();
            this.resolveNamespacePrefixes();
            this.parser.reportStartTag(this.elementURI, this.elementLocalName, this.stringValue);
            this.parser.reportEndTag(this.elementURI, this.elementLocalName, this.stringValue);
            this.processNSContextEnd();
            this.attribs.clear();
            if(this.tokenizeInput) {
               return 265;
            }
            break;
         case 191:
         case 192:
         case 272:
            this.yybegin(20);
            this.elementURI = this.nsSupport.getDefaultURI();
            this.stringValue = this.elementLocalName = this.yytext2(1, this.yylength() - 1);
            break;
         case 195:
            this.yybegin(this.tagState);
            this.parseQuotedTagValue();
            break;
         case 196:
            this.yybegin(this.tagState);
            this.parseSingleQuotedTagValue();
            break;
         case 198:
            if(!this.handleLiteralEntityRef(this.yytext2(0, this.yylength() - 1), 0)) {
               this.appendToCbuf('&');
               this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
               this.yybegin(this.prevState);
            }
            break;
         case 206:
            this.yybegin(this.tagState);
            String var18;
            if(this.cbuflen >= 4 && this.attributeQName != "xmlns") {
               var18 = new String(this.cbuf, 0, this.cbuflen);
            } else {
               var18 = this.stringConverter.convert(this.cbuf, 0, this.cbuflen);
            }

            this.addAttribute(this.attributeURI, this.attributeLocalName, this.attributeQName, this.attributeValueType, var18);
            break;
         case 208:
            this.yybegin(this.tagState);
            this.addAttribute(this.attributeURI, this.attributeLocalName, this.attributeQName, this.attributeValueType, "");
            break;
         case 210:
            this.yybegin(this.tagState);
            this.addAttribute(this.attributeURI, this.attributeLocalName, this.attributeQName, this.attributeValueType, new String(this.cbuf, 0, this.cbuflen));
            break;
         case 215:
            return 281;
         case 222:
            this.yybegin(30);
            return 286;
         case 224:
            return 283;
         case 230:
            this.yybegin(30);
            return this.stringToken(261, this.yytext(1, this.yylength() - 2));
         case 244:
            return this.stringToken(261, this.yytext(1, this.yylength() - 2));
         case 245:
         case 246:
         case 247:
         case 303:
         case 304:
         case 341:
         case 342:
            this.piPrevState = 21;
            this.yybegin(5);
            this.elementQName = this.yytext2(1, this.yylength() - 1);
            break;
         case 252:
            this.yybegin(30);
            if(this.isTopEntity()) {
               throw this.fatalError("\'<![\' constructs are not allowed in the internal DTD subset");
            }

            return 302;
         case 254:
            this.appendToCbuf('&');
            this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yylength());
            this.yybegin(this.prevState);
            break;
         case 256:
            if(this.isTopEntity()) {
               throw this.fatalError("Parameter entities may not appear in the internal subset");
            }

            if(!this.handleLiteralEntityRef(this.yytext2(0, this.yylength() - 1), 1)) {
               this.appendToCbuf('%');
               this.appendToCbuf(this.yy_buffer, this.yy_startRead, this.yy_markedPos - this.yy_startRead);
               this.yybegin(this.prevState);
            }
            break;
         case 257:
            this.yybegin(this.baseState);
            this.parser.reportCdata('<');
            break;
         case 258:
            this.yybegin(this.baseState);

            try {
               this.clearCbuf();
               this.parseEncodedChar(this.yy_buffer, this.yy_startRead + 1, this.yylength() - 2, 10);
               this.parser.reportCdata(this.cbuf, 0, this.cbuflen);
               break;
            } catch (IllegalCharException var14) {
               throw this.fatalError("Invalid character entity reference: &" + this.yytext());
            }
         case 263:
            this.yybegin(this.baseState);
            this.parser.reportCdata('>');
            break;
         case 269:
            this.isNamespaceDeclaration = false;
            this.attributeQName = this.yytext2();
            var16 = this.attributeQName.indexOf(58);
            this.attributeURI = this.yytext2(0, var16);
            this.attributeLocalName = this.yytext2(var16 + 1, this.yylength() - var16 - 1);
            this.yybegin(10);
            break;
         case 271:
            this.nsSupport.pushContext();
            this.yybegin(8);
            this.stringValue = this.yytext2();
            var16 = this.stringValue.indexOf(58);
            this.elementURI = this.yytext2(0, var16);
            this.elementLocalName = this.yytext2(var16 + 1, this.yylength() - (var16 + 1));
            this.prepareComplexElement(this.stringValue);
            break;
         case 273:
            this.appendToCbuf('<');
            this.yybegin(this.prevState);
            break;
         case 274:
            this.yybegin(this.prevState);

            try {
               this.parseEncodedChar(this.yy_buffer, this.yy_startRead + 1, this.yylength() - 2, 10);
               break;
            } catch (ClassCastException var12) {
               throw this.fatalError("Invalid character entity reference: &" + this.yytext());
            }
         case 279:
            this.appendToCbuf('>');
            this.yybegin(this.prevState);
            break;
         case 280:
            var16 = this.handleEntityRef(this.yytext2(1, this.yylength() - 2), 1);
            if(var16 != 0) {
               this.returnEntityEndToken = false;
               return var16;
            }
            break;
         case 281:
            return 282;
         case 282:
            if(this.isTopEntity()) {
               throw this.fatalError("Parameter entities may not appear in the internal subset");
            }

            if(this.handleEntityRef(this.yytext2(1, this.yylength() - 2), 1) != 0) {
               this.returnEntityEndToken = false;
            }

            return 266;
         case 283:
            this.yybegin(24);
            return this.stringToken(298, this.yytext2());
         case 289:
            this.yybegin(21);
            this.parser.reportComment(this.yy_buffer, this.yy_startRead, this.yy_markedPos - 3 - this.yy_startRead);
            break;
         case 290:
            return 303;
         case 296:
            return 310;
         case 309:
            this.yybegin(27);
            break;
         case 310:
            this.yybegin(this.baseState);

            try {
               this.clearCbuf();
               this.parseEncodedChar(this.yy_buffer, this.yy_startRead + 2, this.yylength() - 3, 16);
               this.parser.reportCdata(this.cbuf, 0, this.cbuflen);
               break;
            } catch (IllegalCharException var15) {
               throw this.fatalError("Invalid character entity reference: &" + this.yytext());
            }
         case 311:
            this.yybegin(this.baseState);
            this.parser.reportCdata('&');
            break;
         case 320:
            this.yybegin(20);
            this.stringValue = this.yytext2(1, this.yylength() - 1);
            var16 = this.stringValue.indexOf(58) + 1;
            this.elementURI = this.nsSupport.getURI(this.yytext2(1, var16 - 1));
            this.elementLocalName = this.yytext2(var16 + 1, this.yylength() - 1 - var16);
            break;
         case 321:
            this.yybegin(this.prevState);

            try {
               this.parseEncodedChar(this.yy_buffer, this.yy_startRead + 2, this.yylength() - 3, 16);
               break;
            } catch (ClassCastException var13) {
               throw this.fatalError("Invalid character entity reference: &" + this.yytext());
            }
         case 322:
            this.appendToCbuf('&');
            this.yybegin(this.prevState);
            break;
         case 347:
            this.yybegin(this.baseState);
            this.parser.reportCdata('\'');
            break;
         case 348:
            this.yybegin(this.baseState);
            this.parser.reportCdata('\"');
            break;
         case 349:
            this.prevState = this.baseState;
            this.yybegin(1);
            break;
         case 350:
            throw this.fatalError("\'?xml\' is a reserved processing instruction target and must be in lower case.");
         case 355:
            this.appendToCbuf('\'');
            this.yybegin(this.prevState);
            break;
         case 356:
            this.appendToCbuf('\"');
            this.yybegin(this.prevState);
            break;
         case 360:
            this.yybegin(30);
            return 287;
         case 361:
            this.yybegin(30);
            return 257;
         case 362:
            return 309;
         case 364:
            return 300;
         case 373:
            this.prevState = 21;
            this.yybegin(1);
            break;
         case 378:
            this.yybegin(this.baseState);
            this.parser.reportComment(this.yy_buffer, this.yy_startRead + 3, this.yy_markedPos - this.yy_startRead - 6);
            if(this.tokenizeInput) {
               return 301;
            }
            break;
         case 385:
            this.yybegin(30);
            return 289;
         case 388:
            this.yybegin(30);
            return 288;
         case 391:
            return 305;
         case 392:
            this.bypassPERefs = this.bypassGERefs = true;
            return 269;
         case 393:
            this.bypassPERefs = this.bypassGERefs = true;
            this.yybegin(29);
            return 270;
         case 396:
            return 273;
         case 404:
            this.attributeURI = "xmlns";
            this.attributeLocalName = this.yytext2(6, this.yylength() - 6);
            this.attributeQName = this.yytext2();
            this.isNamespaceDeclaration = true;
            this.yybegin(10);
            break;
         case 405:
            this.attributeURI = "xmlns";
            this.attributeLocalName = "";
            this.attributeQName = "xmlns";
            this.isNamespaceDeclaration = true;
            this.parseCdataLiteral('\"', 13);
            break;
         case 406:
            this.attributeURI = "xmlns";
            this.attributeLocalName = "";
            this.attributeQName = "xmlns";
            this.isNamespaceDeclaration = true;
            this.parseCdataLiteral('\'', 14);
            break;
         case 408:
            this.yybegin(30);
            return 291;
         case 411:
            return 304;
         case 414:
            return 307;
         case 416:
            this.yybegin(25);
            return 278;
         case 419:
            this.yybegin(this.baseState);
            this.startCdata();
            this.parseCdataSection();
            if(this.tokenizeInput) {
               return 257;
            }

            this.endCdata();
            break;
         case 421:
            this.yybegin(30);
            return 290;
         case 422:
            this.yybegin(30);
            return 292;
         case 423:
            return 285;
         case 424:
            return 285;
         case 425:
            return 272;
         case 427:
            this.yybegin(30);
            return 308;
         case 429:
            this.yybegin(22);
            return 279;
         case 430:
            this.yybegin(30);
            if(this.parseExternalEntities(0)) {
               return 267;
            }

            return 268;
         case 431:
            return 271;
         case 432:
            this.yybegin(30);
            return 280;
         }
      }
   }

   static {
      calcAsciiTables();
      LETTER_RANGE_START = new char[]{'\u0100', '\u0134', '\u0141', '\u014a', '\u0180', '\u01cd', '\u01f4', '\u01fa', '\u0250', '\u02bb', '\u0386', '\u0388', '\u038c', '\u038e', '\u03a3', '\u03d0', '\u03da', '\u03dc', '\u03de', '\u03e0', '\u03e2', '\u0401', '\u040e', '\u0451', '\u045e', '\u0490', '\u04c7', '\u04cb', '\u04d0', '\u04ee', '\u04f8', '\u0531', '\u0559', '\u0561', '\u05d0', '\u05f0', '\u0621', '\u0641', '\u0671', '\u06ba', '\u06c0', '\u06d0', '\u06d5', '\u06e5', '\u0905', '\u093d', '\u0958', '\u0985', '\u098f', '\u0993', '\u09aa', '\u09b2', '\u09b6', '\u09dc', '\u09df', '\u09f0', '\u0a05', '\u0a0f', '\u0a13', '\u0a2a', '\u0a32', '\u0a35', '\u0a38', '\u0a59', '\u0a5e', '\u0a72', '\u0a85', '\u0a8d', '\u0a8f', '\u0a93', '\u0aaa', '\u0ab2', '\u0ab5', '\u0abd', '\u0ae0', '\u0b05', '\u0b0f', '\u0b13', '\u0b2a', '\u0b32', '\u0b36', '\u0b3d', '\u0b5c', '\u0b5f', '\u0b85', '\u0b8e', '\u0b92', '\u0b99', '\u0b9c', '\u0b9e', '\u0ba3', '\u0ba8', '\u0bae', '\u0bb7', '\u0c05', '\u0c0e', '\u0c12', '\u0c2a', '\u0c35', '\u0c60', '\u0c85', '\u0c8e', '\u0c92', '\u0caa', '\u0cb5', '\u0cde', '\u0ce0', '\u0d05', '\u0d0e', '\u0d12', '\u0d2a', '\u0d60', '\u0e01', '\u0e30', '\u0e32', '\u0e40', '\u0e81', '\u0e84', '\u0e87', '\u0e8a', '\u0e8d', '\u0e94', '\u0e99', '\u0ea1', '\u0ea5', '\u0ea7', '\u0eaa', '\u0ead', '\u0eb0', '\u0eb2', '\u0ebd', '\u0ec0', '\u0f40', '\u0f49', '\u10a0', '\u10d0', '\u1100', '\u1102', '\u1105', '\u1109', '\u110b', '\u110e', '\u113c', '\u113e', '\u1140', '\u114c', '\u114e', '\u1150', '\u1154', '\u1159', '\u115f', '\u1163', '\u1165', '\u1167', '\u1169', '\u116d', '\u1172', '\u1175', '\u119e', '\u11a8', '\u11ab', '\u11ae', '\u11b7', '\u11ba', '\u11bc', '\u11eb', '\u11f0', '\u11f9', '\u1e00', '\u1ea0', '\u1f00', '\u1f18', '\u1f20', '\u1f48', '\u1f50', '\u1f59', '\u1f5b', '\u1f5d', '\u1f5f', '\u1f80', '\u1fb6', '\u1fbe', '\u1fc2', '\u1fc6', '\u1fd0', '\u1fd6', '\u1fe0', '\u1ff2', '\u1ff6', '\u2126', '\u212a', '\u212e', '\u2180', '\u3007', '\u3021', '\u3041', '\u30a1', '\u3105', '\u4e00', '\uac00'};
      LETTER_RANGE_END = new char[]{'\u0131', '\u013e', '\u0148', '\u017e', '\u01c3', '\u01f0', '\u01f5', '\u0217', '\u02a8', '\u02c1', '\u0386', '\u038a', '\u038c', '\u03a1', '\u03ce', '\u03d6', '\u03da', '\u03dc', '\u03de', '\u03e0', '\u03f3', '\u040c', '\u044f', '\u045c', '\u0481', '\u04c4', '\u04c8', '\u04cc', '\u04eb', '\u04f5', '\u04f9', '\u0556', '\u0559', '\u0586', '\u05ea', '\u05f2', '\u063a', '\u064a', '\u06b7', '\u06be', '\u06ce', '\u06d3', '\u06d5', '\u06e6', '\u0939', '\u093d', '\u0961', '\u098c', '\u0990', '\u09a8', '\u09b0', '\u09b2', '\u09b9', '\u09dd', '\u09e1', '\u09f1', '\u0a0a', '\u0a10', '\u0a28', '\u0a30', '\u0a33', '\u0a36', '\u0a39', '\u0a5c', '\u0a5e', '\u0a74', '\u0a8b', '\u0a8d', '\u0a91', '\u0aa8', '\u0ab0', '\u0ab3', '\u0ab9', '\u0abd', '\u0ae0', '\u0b0c', '\u0b10', '\u0b28', '\u0b30', '\u0b33', '\u0b39', '\u0b3d', '\u0b5d', '\u0b61', '\u0b8a', '\u0b90', '\u0b95', '\u0b9a', '\u0b9c', '\u0b9f', '\u0ba4', '\u0baa', '\u0bb5', '\u0bb9', '\u0c0c', '\u0c10', '\u0c28', '\u0c33', '\u0c39', '\u0c61', '\u0c8c', '\u0c90', '\u0ca8', '\u0cb3', '\u0cb9', '\u0cde', '\u0ce1', '\u0d0c', '\u0d10', '\u0d28', '\u0d39', '\u0d61', '\u0e2e', '\u0e30', '\u0e33', '\u0e45', '\u0e82', '\u0e84', '\u0e88', '\u0e8a', '\u0e8d', '\u0e97', '\u0e9f', '\u0ea3', '\u0ea5', '\u0ea7', '\u0eab', '\u0eae', '\u0eb0', '\u0eb3', '\u0ebd', '\u0ec4', '\u0f47', '\u0f69', '\u10c5', '\u10f6', '\u1100', '\u1103', '\u1107', '\u1109', '\u110c', '\u1112', '\u113c', '\u113e', '\u1140', '\u114c', '\u114e', '\u1150', '\u1155', '\u1159', '\u1161', '\u1163', '\u1165', '\u1167', '\u1169', '\u116e', '\u1173', '\u1175', '\u119e', '\u11a8', '\u11ab', '\u11af', '\u11b8', '\u11ba', '\u11c2', '\u11eb', '\u11f0', '\u11f9', '\u1e9b', '\u1ef9', '\u1f15', '\u1f1d', '\u1f45', '\u1f4d', '\u1f57', '\u1f59', '\u1f5b', '\u1f5d', '\u1f7d', '\u1fb4', '\u1fbc', '\u1fbe', '\u1fc4', '\u1fcc', '\u1fd3', '\u1fdb', '\u1fec', '\u1ff4', '\u1ffc', '\u2126', '\u212b', '\u212e', '\u2182', '\u3007', '\u3029', '\u3094', '\u30fa', '\u312c', '\u9fa5', '\ud7a3'};
      NON_LETTER_RANGE_START = new char[]{'\u02d0', '\u0300', '\u0360', '\u0387', '\u0483', '\u0591', '\u05a3', '\u05bb', '\u05bf', '\u05c1', '\u05c4', '\u0640', '\u064b', '\u0660', '\u0670', '\u06d6', '\u06dd', '\u06e0', '\u06e7', '\u06ea', '\u06f0', '\u0901', '\u093c', '\u093e', '\u094d', '\u0951', '\u0962', '\u0966', '\u0981', '\u09bc', '\u09be', '\u09bf', '\u09c0', '\u09c7', '\u09cb', '\u09d7', '\u09e2', '\u09e6', '\u0a02', '\u0a3c', '\u0a3e', '\u0a3f', '\u0a40', '\u0a47', '\u0a4b', '\u0a66', '\u0a70', '\u0a81', '\u0abc', '\u0abe', '\u0ac7', '\u0acb', '\u0ae6', '\u0b01', '\u0b3c', '\u0b3e', '\u0b47', '\u0b4b', '\u0b56', '\u0b66', '\u0b82', '\u0bbe', '\u0bc6', '\u0bca', '\u0bd7', '\u0be7', '\u0c01', '\u0c3e', '\u0c46', '\u0c4a', '\u0c55', '\u0c66', '\u0c82', '\u0cbe', '\u0cc6', '\u0cca', '\u0cd5', '\u0ce6', '\u0d02', '\u0d3e', '\u0d46', '\u0d4a', '\u0d57', '\u0d66', '\u0e31', '\u0e34', '\u0e46', '\u0e50', '\u0eb1', '\u0eb4', '\u0ebb', '\u0ec6', '\u0ec8', '\u0ed0', '\u0f18', '\u0f20', '\u0f35', '\u0f37', '\u0f39', '\u0f3e', '\u0f3f', '\u0f71', '\u0f86', '\u0f90', '\u0f97', '\u0f99', '\u0fb1', '\u0fb9', '\u20d0', '\u20e1', '\u3005', '\u302a', '\u3031', '\u3099', '\u309a', '\u309d', '\u30fc'};
      NON_LETTER_RANGE_END = new char[]{'\u02d1', '\u0345', '\u0361', '\u0387', '\u0486', '\u05a1', '\u05b9', '\u05bd', '\u05bf', '\u05c2', '\u05c4', '\u0640', '\u0652', '\u0669', '\u0670', '\u06dc', '\u06df', '\u06e4', '\u06e8', '\u06ed', '\u06f9', '\u0903', '\u093c', '\u094c', '\u094d', '\u0954', '\u0963', '\u096f', '\u0983', '\u09bc', '\u09be', '\u09bf', '\u09c4', '\u09c8', '\u09cd', '\u09d7', '\u09e3', '\u09ef', '\u0a02', '\u0a3c', '\u0a3e', '\u0a3f', '\u0a42', '\u0a48', '\u0a4d', '\u0a6f', '\u0a71', '\u0a83', '\u0abc', '\u0ac5', '\u0ac9', '\u0acd', '\u0aef', '\u0b03', '\u0b3c', '\u0b43', '\u0b48', '\u0b4d', '\u0b57', '\u0b6f', '\u0b83', '\u0bc2', '\u0bc8', '\u0bcd', '\u0bd7', '\u0bef', '\u0c03', '\u0c44', '\u0c48', '\u0c4d', '\u0c56', '\u0c6f', '\u0c83', '\u0cc4', '\u0cc8', '\u0ccd', '\u0cd6', '\u0cef', '\u0d03', '\u0d43', '\u0d48', '\u0d4d', '\u0d57', '\u0d6f', '\u0e31', '\u0e3a', '\u0e4e', '\u0e59', '\u0eb1', '\u0eb9', '\u0ebc', '\u0ec6', '\u0ecd', '\u0ed9', '\u0f19', '\u0f29', '\u0f35', '\u0f37', '\u0f39', '\u0f3e', '\u0f3f', '\u0f84', '\u0f8b', '\u0f95', '\u0f97', '\u0fad', '\u0fb7', '\u0fb9', '\u20dc', '\u20e1', '\u3005', '\u302f', '\u3035', '\u3099', '\u309a', '\u309e', '\u30fe'};
   }

   private static final class YY_StreamInfo {

      Reader yy_reader;
      int yy_endRead;
      int yy_startRead;
      int yy_savePos;
      int yy_currentPos;
      int yy_markedPos;
      int yy_pushbackPos;
      int yyline;
      int yycolumn;
      char[] yy_buffer;
      boolean yy_atEOF;


      YY_StreamInfo(Reader yy_reader, int yy_endRead, int yy_startRead, int yy_savePos, int yy_currentPos, int yy_markedPos, int yy_pushbackPos, char[] yy_buffer, boolean yy_atEOF, int yyline, int yycolumn) {
         this.yy_reader = yy_reader;
         this.yy_endRead = yy_endRead;
         this.yy_startRead = yy_startRead;
         this.yy_savePos = yy_savePos;
         this.yy_currentPos = yy_currentPos;
         this.yy_markedPos = yy_markedPos;
         this.yy_pushbackPos = yy_pushbackPos;
         this.yy_buffer = yy_buffer;
         this.yy_atEOF = yy_atEOF;
         this.yyline = yyline;
         this.yycolumn = yycolumn;
      }
   }
}
