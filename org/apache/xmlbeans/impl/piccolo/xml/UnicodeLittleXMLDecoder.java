package org.apache.xmlbeans.impl.piccolo.xml;

import java.io.CharConversionException;
import org.apache.xmlbeans.impl.piccolo.io.CharsetDecoder;
import org.apache.xmlbeans.impl.piccolo.io.IllegalCharException;
import org.apache.xmlbeans.impl.piccolo.xml.XMLDecoder;

public final class UnicodeLittleXMLDecoder implements XMLDecoder {

   private boolean sawCR = false;


   public CharsetDecoder newCharsetDecoder() {
      return this.newXMLDecoder();
   }

   public XMLDecoder newXMLDecoder() {
      return new UnicodeLittleXMLDecoder();
   }

   public int minBytesPerChar() {
      return 2;
   }

   public int maxBytesPerChar() {
      return 2;
   }

   public void reset() {
      this.sawCR = false;
   }

   public void decode(byte[] in_buf, int in_off, int in_len, char[] out_buf, int out_off, int out_len, int[] result) throws CharConversionException {
      int o = 0;

      int i;
      for(i = 0; i + 1 < in_len && o < out_len; i += 2) {
         char c = (char)((255 & in_buf[in_off + i + 1]) << 8 | 255 & in_buf[in_off + i]);
         if(c >= 32) {
            if(c > '\ud7ff' && (c < '\ue000' || c > '\ufffd') && (c < 65536 || c > 1114111)) {
               throw new IllegalCharException("Illegal XML Character: 0x" + Integer.toHexString(c));
            }

            this.sawCR = false;
            out_buf[out_off + o++] = c;
         } else {
            switch(c) {
            case 9:
               out_buf[out_off + o++] = 9;
               break;
            case 10:
               if(this.sawCR) {
                  this.sawCR = false;
               } else {
                  out_buf[out_off + o++] = 10;
               }
               break;
            case 11:
            case 12:
            default:
               throw new IllegalCharException("Illegal XML character: 0x" + Integer.toHexString(c));
            case 13:
               this.sawCR = true;
               out_buf[out_off + o++] = 10;
            }
         }
      }

      result[0] = i;
      result[1] = o;
   }

   public void decodeXMLDecl(byte[] in_buf, int in_off, int in_len, char[] out_buf, int out_off, int out_len, int[] result) throws CharConversionException {
      int o = 0;

      int i;
      label45:
      for(i = 0; i + 1 < in_len && o < out_len; i += 2) {
         char c = (char)((255 & in_buf[in_off + i + 1]) << 8 | 255 & in_buf[in_off + i]);
         if(c >= 32) {
            if(c > '\ud7ff' && (c < '\ue000' || c > '\ufffd') && (c < 65536 || c > 1114111)) {
               break;
            }

            this.sawCR = false;
            out_buf[out_off + o++] = c;
            if(c == 62) {
               i += 2;
               break;
            }
         } else {
            switch(c) {
            case 9:
               out_buf[out_off + o++] = 9;
               break;
            case 10:
               if(this.sawCR) {
                  this.sawCR = false;
               } else {
                  out_buf[out_off + o++] = 10;
               }
               break;
            case 11:
            case 12:
            default:
               break label45;
            case 13:
               this.sawCR = true;
               out_buf[out_off + o++] = 10;
            }
         }
      }

      result[0] = i;
      result[1] = o;
   }
}
