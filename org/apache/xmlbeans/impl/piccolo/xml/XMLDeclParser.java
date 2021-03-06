package org.apache.xmlbeans.impl.piccolo.xml;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;

final class XMLDeclParser {

   public static final int YYEOF = -1;
   private static final int YY_BUFFERSIZE = 0;
   public static final int GOT_ENCODING = 5;
   public static final int ENCODING = 4;
   public static final int XML_DECL = 1;
   public static final int YYINITIAL = 0;
   public static final int STANDALONE = 6;
   public static final int GOT_VERSION = 3;
   public static final int VERSION = 2;
   public static final int GOT_STANDALONE = 7;
   private static final String yycmap_packed = "\t        (&!)  #$%\'\"  \f\n\t\r\b*ﾅ ";
   private static final char[] yycmap = yy_unpack_cmap("\t        (&!)  #$%\'\"  \f\n\t\r\b*ﾅ ");
   private static final int[] yy_rowMap = new int[]{0, 43, 86, 129, 172, 215, 258, 301, 344, 387, 344, 430, 473, 516, 559, 602, 645, 688, 731, 774, 817, 860, 903, 430, 473, 946, 989, 1032, 344, 1075, 1118, 1161, 1204, 602, 1247, 1290, 1333, 1376, 1419, 1462, 1505, 1548, 731, 1591, 1634, 1677, 1720, 860, 1763, 1806, 1849, 1892, 344, 1935, 1978, 344, 2021, 2064, 2107, 2150, 2193, 2236, 2279, 2322, 2365, 2408, 2451, 2494, 2537, 2580, 2623, 2666, 2709, 2752, 2795, 2838, 2881, 2924, 2967, 3010, 3053, 3096, 344, 3139, 3182, 3225, 3268, 3311, 3354, 344, 3397, 3440, 3483, 3526, 3569, 3612, 3655, 3698, 3741, 3784, 344, 3225, 3827, 3870, 3913, 3956, 344, 3999, 4042, 4085, 4128, 4171, 4214, 4257, 4300, 344, 344, 4343, 4386, 4429, 4472, 4515, 4558, 4601, 4644, 4687, 4730, 4773, 4816, 4859, 4902, 4945, 4988, 5031, 5074, 5117, 5160, 344};
   private static final String yy_packed0 = "\t\n$\t\f\r5\r5\r5\r#2 $    8   \n      \n  !      \"     # \n# # $# #%#& # # \' \n\' \' (\' \')\'* \' \' +  - , - . / 0 + 1. 2/ 33 4  \n5    \n56     \n   5      \n   7 5    # \n#8# # # # \n#8# # #9#:\b# # \n#8# # #;\b# # \n#8# # #<\b# \' \n\' \'8\' \' \' \n\' \'8\' \'=\'>\b\' \' \n\' \'8\' \'?\b\' \' \n\' \'8\' \'@\b\' A& B. C& D\' E. F4 G. H  \n5I     \n   J5    # \n#8# # #K# # \n#8# # #L\n# # \n#8# # #M# # \n#8# # \n#N# \' \n\' \'8\' \'O\' \' \n\' \'8\' \'P\n\' \' \n\' \'8\' \'Q\' \' \n\' \'8\' \n\'R\' S& T2 S\" U& V. W, X+ Y  \nZ     \n   Z    # \n#8[# # #\\]\t# # \n#8# # #%# # \n#8# # \b#^# # \n#8# # #_\n# \' \n\' `\'8\' \'ab\t\' \' \n\' \'8\' \')\' \' \n\' \'8\' \b\'c\' \' \n\' \'8\' \'d\n\' e. e f8 g3 h* i # \n#8# # \t#j# # \n#8[# # #]\t# # \n#k# # # # \n#8# # \b#l# # \n#8# # #m\t# \' \n\' \'8\' \t\'n\' \' \n\' `\'8\' \'b\t\' \' \n\' \'k\' \' \' \n\' \'8\' \b\'o\' \' \n\' \'8\' \'p\t\' q) r6 s # \n#t# # # # \n#u# # # # \n#8# # #v\t# \' \n\' \'t\' \' \' \n\' \'u\' \' \' \n\' \'8\' \'w\t\' x* y# z$ # \n#8# # #{# \' \n\' \'8\' \'|\' x}A ~!  # \n#8# # \f## \' \n\' \'8\' \f\'\' }* ~9  # \n#8# # #\n# \' \n\' \'8\' \'\n\' 5 \" # \n#8# # # \' \n\' \'8\' \' , # \n## # # \' \n\' \'\' \' ) ";
   private static final int[] yytrans = yy_unpack();
   private static final int YY_UNKNOWN_ERROR = 0;
   private static final int YY_ILLEGAL_STATE = 1;
   private static final int YY_NO_MATCH = 2;
   private static final int YY_PUSHBACK_2BIG = 3;
   private static final int YY_SKIP_2BIG = 4;
   private static final String[] YY_ERROR_MSG = new String[]{"Unkown internal scanner error", "Internal error: unknown state", "Error: could not match input", "Error: pushback value was too large", "Error: skip value was too large"};
   private static final byte[] YY_ATTRIBUTE = new byte[]{(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)1, (byte)9, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)2, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)5, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)9, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)9};
   private Reader yy_reader;
   private int yy_state;
   private int yy_lexical_state;
   private char[] yy_buffer;
   private char[] yy_saved_buffer;
   private int yy_markedPos;
   private int yy_pushbackPos;
   private int yy_currentPos;
   private int yy_startRead;
   private int yy_endRead;
   private int yyline;
   private int yychar;
   private int yycolumn;
   private boolean yy_atBOL;
   private boolean yy_atEOF;
   public static final int SUCCESS = 1;
   public static final int NO_DECLARATION = -1;
   private String xmlVersion;
   private String xmlEncoding;
   private boolean xmlStandalone;
   private boolean xmlStandaloneDeclared;
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


   public XMLDeclParser(char[] buf, int off, int len) throws IOException {
      this.yy_lexical_state = 0;
      this.yy_buffer = new char[0];
      this.yy_saved_buffer = null;
      this.yy_atBOL = true;
      this.xmlVersion = null;
      this.xmlEncoding = null;
      this.xmlStandalone = false;
      this.xmlStandaloneDeclared = false;
      this.yy_sawCR = false;
      this.yy_prev_sawCR = false;
      this.yyline_next = 0;
      this.yycolumn_next = 0;
      this.yyreset(buf, off, len);
   }

   public XMLDeclParser() {
      this.yy_lexical_state = 0;
      this.yy_buffer = new char[0];
      this.yy_saved_buffer = null;
      this.yy_atBOL = true;
      this.xmlVersion = null;
      this.xmlEncoding = null;
      this.xmlStandalone = false;
      this.xmlStandaloneDeclared = false;
      this.yy_sawCR = false;
      this.yy_prev_sawCR = false;
      this.yyline_next = 0;
      this.yycolumn_next = 0;
   }

   public void reset(char[] buf, int off, int len) throws IOException {
      this.xmlVersion = this.xmlEncoding = null;
      this.xmlStandaloneDeclared = this.xmlStandalone = false;
      this.yyreset(buf, off, len);
   }

   public String getXMLVersion() {
      return this.xmlVersion;
   }

   public String getXMLEncoding() {
      return this.xmlEncoding;
   }

   public boolean isXMLStandaloneDeclared() {
      return this.xmlStandaloneDeclared;
   }

   public boolean isXMLStandalone() {
      return this.xmlStandalone;
   }

   public int getCharsRead() {
      return this.yychar + this.yylength();
   }

   XMLDeclParser(Reader in) {
      this.yy_lexical_state = 0;
      this.yy_buffer = new char[0];
      this.yy_saved_buffer = null;
      this.yy_atBOL = true;
      this.xmlVersion = null;
      this.xmlEncoding = null;
      this.xmlStandalone = false;
      this.xmlStandaloneDeclared = false;
      this.yy_sawCR = false;
      this.yy_prev_sawCR = false;
      this.yyline_next = 0;
      this.yycolumn_next = 0;
      this.yy_reader = in;
   }

   XMLDeclParser(InputStream in) {
      this((Reader)(new InputStreamReader(in)));
   }

   private static int[] yy_unpack() {
      int[] trans = new int[5203];
      byte offset = 0;
      yy_unpack("\t\n$\t\f\r5\r5\r5\r#2 $    8   \n      \n  !      \"     # \n# # $# #%#& # # \' \n\' \' (\' \')\'* \' \' +  - , - . / 0 + 1. 2/ 33 4  \n5    \n56     \n   5      \n   7 5    # \n#8# # # # \n#8# # #9#:\b# # \n#8# # #;\b# # \n#8# # #<\b# \' \n\' \'8\' \' \' \n\' \'8\' \'=\'>\b\' \' \n\' \'8\' \'?\b\' \' \n\' \'8\' \'@\b\' A& B. C& D\' E. F4 G. H  \n5I     \n   J5    # \n#8# # #K# # \n#8# # #L\n# # \n#8# # #M# # \n#8# # \n#N# \' \n\' \'8\' \'O\' \' \n\' \'8\' \'P\n\' \' \n\' \'8\' \'Q\' \' \n\' \'8\' \n\'R\' S& T2 S\" U& V. W, X+ Y  \nZ     \n   Z    # \n#8[# # #\\]\t# # \n#8# # #%# # \n#8# # \b#^# # \n#8# # #_\n# \' \n\' `\'8\' \'ab\t\' \' \n\' \'8\' \')\' \' \n\' \'8\' \b\'c\' \' \n\' \'8\' \'d\n\' e. e f8 g3 h* i # \n#8# # \t#j# # \n#8[# # #]\t# # \n#k# # # # \n#8# # \b#l# # \n#8# # #m\t# \' \n\' \'8\' \t\'n\' \' \n\' `\'8\' \'b\t\' \' \n\' \'k\' \' \' \n\' \'8\' \b\'o\' \' \n\' \'8\' \'p\t\' q) r6 s # \n#t# # # # \n#u# # # # \n#8# # #v\t# \' \n\' \'t\' \' \' \n\' \'u\' \' \' \n\' \'8\' \'w\t\' x* y# z$ # \n#8# # #{# \' \n\' \'8\' \'|\' x}A ~!  # \n#8# # \f## \' \n\' \'8\' \f\'\' }* ~9  # \n#8# # #\n# \' \n\' \'8\' \'\n\' 5 \" # \n#8# # # \' \n\' \'8\' \' , # \n## # # \' \n\' \'\' \' ) ", offset, trans);
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

      while(i < 144) {
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
      if(this.yy_startRead > 0) {
         System.arraycopy(this.yy_buffer, this.yy_startRead, this.yy_buffer, 0, this.yy_endRead - this.yy_startRead);
         this.yy_endRead -= this.yy_startRead;
         this.yy_currentPos -= this.yy_startRead;
         this.yy_markedPos -= this.yy_startRead;
         this.yy_pushbackPos -= this.yy_startRead;
         this.yy_startRead = 0;
      }

      if(this.yy_markedPos >= this.yy_buffer.length || this.yy_currentPos >= this.yy_buffer.length) {
         char[] numRead = new char[this.yy_buffer.length * 2];
         System.arraycopy(this.yy_buffer, 0, numRead, 0, this.yy_buffer.length);
         this.yy_buffer = numRead;
      }

      int numRead1 = this.yy_reader.read(this.yy_buffer, this.yy_endRead, this.yy_buffer.length - this.yy_endRead);
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

   public final void yyreset(Reader reader) throws IOException {
      this.yyclose();
      if(this.yy_saved_buffer != null) {
         this.yy_buffer = this.yy_saved_buffer;
         this.yy_saved_buffer = null;
      }

      this.yy_reader = reader;
      this.yy_atBOL = true;
      this.yy_atEOF = false;
      this.yy_endRead = this.yy_startRead = 0;
      this.yy_currentPos = this.yy_markedPos = this.yy_pushbackPos = 0;
      this.yyline = this.yychar = this.yycolumn = 0;
      this.yy_state = this.yy_lexical_state = 0;
      this.yy_sawCR = false;
      this.yyline_next = this.yycolumn_next = 0;
   }

   public final void yyreset(char[] buffer, int off, int len) throws IOException {
      this.yyclose();
      if(this.yy_saved_buffer == null) {
         this.yy_saved_buffer = this.yy_buffer;
      }

      this.yy_buffer = buffer;
      this.yy_reader = null;
      this.yy_atBOL = true;
      this.yy_atEOF = true;
      this.yy_currentPos = this.yy_markedPos = this.yy_pushbackPos = this.yy_startRead = off;
      this.yy_endRead = off + len;
      this.yyline = this.yychar = this.yycolumn = 0;
      this.yy_state = this.yy_lexical_state = 0;
      this.yy_sawCR = false;
      this.yyline_next = this.yycolumn_next = 0;
      this.yy_endRead_l = this.yy_endRead;
      this.yy_buffer_l = this.yy_buffer;
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
      char yy_input;
      if(this.yy_markedPos < this.yy_endRead) {
         yy_input = this.yy_buffer[this.yy_markedPos++];
      } else {
         if(this.yy_atEOF) {
            return -1;
         }

         boolean eof = this.yy_refill();
         this.yy_buffer_l = this.yy_buffer;
         this.yy_endRead_l = this.yy_endRead;
         if(eof) {
            return -1;
         }

         yy_input = this.yy_buffer[this.yy_markedPos++];
      }

      this.yy_doCount(yy_input);
      return yy_input;
   }

   public final int yynextBufferChar() throws IOException {
      char yy_input = this.yy_buffer[this.yy_markedPos++];
      this.yy_doCount(yy_input);
      return yy_input;
   }

   private final int yy_doCount(int yy_input) {
      switch(yy_input) {
      case 10:
         if(this.yy_sawCR) {
            this.yy_sawCR = false;
         } else {
            ++this.yyline_next;
            this.yycolumn_next = 0;
         }
         break;
      case 13:
         ++this.yyline_next;
         this.yycolumn_next = 0;
         this.yy_sawCR = true;
         break;
      default:
         this.yy_sawCR = false;
         ++this.yycolumn_next;
      }

      return yy_input;
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
         this.yy_doCount(this.yy_buffer[pos]);
      }

   }

   public int parse() throws IOException, FileFormatException {
      this.yy_endRead_l = this.yy_endRead;
      this.yy_buffer_l = this.yy_buffer;
      this.yycmap_l = yycmap;
      int[] yytrans_l = yytrans;
      int[] yy_rowMap_l = yy_rowMap;
      byte[] yy_attr_l = YY_ATTRIBUTE;
      int yy_pushbackPos_l = this.yy_pushbackPos = -1;

      while(true) {
         this.yy_markedPos_l = this.yy_markedPos;
         this.yychar += this.yy_markedPos_l - this.yy_startRead;
         int yy_action = -1;
         this.yy_startRead_l = this.yy_currentPos_l = this.yy_currentPos = this.yy_startRead = this.yy_markedPos_l;
         this.yy_state = this.yy_lexical_state;
         boolean yy_was_pushback = false;

         int yy_input;
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
               boolean yy_next = this.yy_refill();
               this.yy_currentPos_l = this.yy_currentPos;
               this.yy_markedPos_l = this.yy_markedPos;
               this.yy_buffer_l = this.yy_buffer;
               this.yy_endRead_l = this.yy_endRead;
               yy_pushbackPos_l = this.yy_pushbackPos;
               if(yy_next) {
                  yy_input = -1;
                  break;
               }

               yy_input = this.yy_buffer_l[this.yy_currentPos_l++];
            }

            int yy_next1 = yytrans_l[yy_rowMap_l[this.yy_state] + this.yycmap_l[yy_input]];
            if(yy_next1 != -1) {
               this.yy_state = yy_next1;
               byte yy_attributes = yy_attr_l[this.yy_state];
               if((yy_attributes & 2) == 2) {
                  yy_pushbackPos_l = this.yy_currentPos_l;
               }

               if((yy_attributes & 1) != 1) {
                  continue;
               }

               yy_was_pushback = (yy_attributes & 4) == 4;
               yy_action = this.yy_state;
               this.yy_markedPos_l = this.yy_currentPos_l;
               if((yy_attributes & 8) != 8) {
                  continue;
               }
            }
            break;
         }

         this.yy_markedPos = this.yy_markedPos_l;
         if(yy_was_pushback) {
            this.yy_markedPos = yy_pushbackPos_l;
         }

         switch(yy_action) {
         case 8:
         case 9:
            return -1;
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
            throw new FileFormatException("XML Declaration not well-formed", -1, -1);
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 53:
         case 54:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 102:
         case 103:
         case 104:
         case 105:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 123:
         case 125:
         case 126:
         case 127:
         case 128:
         case 130:
         case 131:
         case 132:
         case 133:
         case 134:
         case 135:
         case 138:
         default:
            if(yy_input == -1 && this.yy_startRead == this.yy_currentPos) {
               this.yy_atEOF = true;
               return -1;
            }

            this.yy_ScanError(2);
            break;
         case 28:
            return 1;
         case 52:
            this.xmlVersion = this.yytext(1, this.yylength() - 2);
            this.yybegin(3);
            break;
         case 55:
            this.xmlEncoding = this.yytext(1, this.yylength() - 2);
            this.yybegin(5);
            break;
         case 82:
            this.xmlStandalone = false;
            this.yybegin(7);
            break;
         case 89:
            this.xmlVersion = "1.0";
            this.yybegin(3);
            break;
         case 100:
            this.xmlStandalone = true;
            this.yybegin(7);
            break;
         case 101:
            this.yybegin(1);
            break;
         case 106:
            this.xmlEncoding = "UTF-8";
            this.yybegin(5);
            break;
         case 115:
            this.xmlEncoding = "UTF-16";
            this.yybegin(5);
            break;
         case 116:
            this.xmlEncoding = "US-ASCII";
            this.yybegin(5);
            break;
         case 124:
            this.yybegin(2);
            break;
         case 129:
            this.yybegin(4);
            break;
         case 136:
            this.xmlStandaloneDeclared = true;
            this.yybegin(6);
            break;
         case 137:
            this.xmlEncoding = "ISO-8859-1";
            this.yybegin(5);
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
         case 145:
         case 146:
         case 147:
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
         case 153:
         case 154:
         }
      }
   }

}
