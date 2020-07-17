package org.apache.poi.hpsf;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.poi.hpsf.HPSFRuntimeException;
import org.apache.poi.hpsf.UnsupportedVariantTypeException;
import org.apache.poi.hpsf.Util;
import org.apache.poi.hpsf.VariantSupport;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.apache.poi.util.CodePageUtil;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class Property {

   protected long id;
   protected long type;
   protected Object value;


   public long getID() {
      return this.id;
   }

   public long getType() {
      return this.type;
   }

   public Object getValue() {
      return this.value;
   }

   public Property(long id, long type, Object value) {
      this.id = id;
      this.type = type;
      this.value = value;
   }

   public Property(long id, byte[] src, long offset, int length, int codepage) throws UnsupportedEncodingException {
      this.id = id;
      if(id == 0L) {
         this.value = this.readDictionary(src, offset, length, codepage);
      } else {
         int o = (int)offset;
         this.type = LittleEndian.getUInt(src, o);
         o += 4;

         try {
            this.value = VariantSupport.read(src, o, length, (long)((int)this.type), codepage);
         } catch (UnsupportedVariantTypeException var10) {
            VariantSupport.writeUnsupportedTypeMessage(var10);
            this.value = var10.getValue();
         }

      }
   }

   protected Property() {}

   protected Map readDictionary(byte[] src, long offset, int length, int codepage) throws UnsupportedEncodingException {
      if(offset >= 0L && offset <= (long)src.length) {
         int o = (int)offset;
         long nrEntries = LittleEndian.getUInt(src, o);
         o += 4;
         LinkedHashMap m = new LinkedHashMap((int)nrEntries, 1.0F);

         try {
            for(int ex = 0; (long)ex < nrEntries; ++ex) {
               Long var19 = Long.valueOf(LittleEndian.getUInt(src, o));
               o += 4;
               long sLength = LittleEndian.getUInt(src, o);
               o += 4;
               StringBuffer b = new StringBuffer();
               switch(codepage) {
               case -1:
                  b.append(new String(src, o, (int)sLength, Charset.forName("ASCII")));
                  break;
               case 1200:
                  int nrBytes = (int)(sLength * 2L);
                  byte[] h = new byte[nrBytes];

                  for(int i2 = 0; i2 < nrBytes; i2 += 2) {
                     h[i2] = src[o + i2 + 1];
                     h[i2 + 1] = src[o + i2];
                  }

                  b.append(new String(h, 0, nrBytes, CodePageUtil.codepageToEncoding(codepage)));
                  break;
               default:
                  b.append(new String(src, o, (int)sLength, VariantSupport.codepageToEncoding(codepage)));
               }

               while(b.length() > 0 && b.charAt(b.length() - 1) == 0) {
                  b.setLength(b.length() - 1);
               }

               if(codepage == 1200) {
                  if(sLength % 2L == 1L) {
                     ++sLength;
                  }

                  o = (int)((long)o + sLength + sLength);
               } else {
                  o = (int)((long)o + sLength);
               }

               m.put(var19, b.toString());
            }
         } catch (RuntimeException var18) {
            POILogger l = POILogFactory.getLogger(this.getClass());
            l.log(5, new Object[]{"The property set\'s dictionary contains bogus data. All dictionary entries starting with the one with ID " + this.id + " will be ignored.", var18});
         }

         return m;
      } else {
         throw new HPSFRuntimeException("Illegal offset " + offset + " while HPSF stream contains " + length + " bytes.");
      }
   }

   protected int getSize() throws WritingNotSupportedException {
      int length = VariantSupport.getVariantLength(this.type);
      if(length >= 0) {
         return length;
      } else if(length == -2) {
         throw new WritingNotSupportedException(this.type, (Object)null);
      } else {
         boolean PADDING = true;
         switch((int)this.type) {
         case 30:
            int l = ((String)this.value).length() + 1;
            int r = l % 4;
            if(r > 0) {
               l += 4 - r;
            }

            length += l;
         case 0:
            return length;
         default:
            throw new WritingNotSupportedException(this.type, this.value);
         }
      }
   }

   public boolean equals(Object o) {
      if(!(o instanceof Property)) {
         return false;
      } else {
         Property p = (Property)o;
         Object pValue = p.getValue();
         long pId = p.getID();
         if(this.id == pId && (this.id == 0L || this.typesAreEqual(this.type, p.getType()))) {
            if(this.value == null && pValue == null) {
               return true;
            } else if(this.value != null && pValue != null) {
               Class valueClass = this.value.getClass();
               Class pValueClass = pValue.getClass();
               return !valueClass.isAssignableFrom(pValueClass) && !pValueClass.isAssignableFrom(valueClass)?false:(this.value instanceof byte[]?Util.equal((byte[])((byte[])this.value), (byte[])((byte[])pValue)):this.value.equals(pValue));
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   private boolean typesAreEqual(long t1, long t2) {
      return t1 == t2 || t1 == 30L && t2 == 31L || t2 == 30L && t1 == 31L;
   }

   public int hashCode() {
      long hashCode = 0L;
      hashCode += this.id;
      hashCode += this.type;
      if(this.value != null) {
         hashCode += (long)this.value.hashCode();
      }

      int returnHashCode = (int)(hashCode & 4294967295L);
      return returnHashCode;
   }

   public String toString() {
      StringBuffer b = new StringBuffer();
      b.append(this.getClass().getName());
      b.append('[');
      b.append("id: ");
      b.append(this.getID());
      b.append(", type: ");
      b.append(this.getType());
      Object value = this.getValue();
      b.append(", value: ");
      if(value instanceof String) {
         b.append(value.toString());
         String bytes = (String)value;
         int hex = bytes.length();
         byte[] bytes1 = new byte[hex * 2];

         for(int hex1 = 0; hex1 < hex; ++hex1) {
            char c = bytes.charAt(hex1);
            byte high = (byte)((c & '\uff00') >> 8);
            byte low = (byte)((c & 255) >> 0);
            bytes1[hex1 * 2] = high;
            bytes1[hex1 * 2 + 1] = low;
         }

         b.append(" [");
         if(bytes1.length > 0) {
            String var12 = HexDump.dump(bytes1, 0L, 0);
            b.append(var12);
         }

         b.append("]");
      } else if(value instanceof byte[]) {
         byte[] var10 = (byte[])((byte[])value);
         if(var10.length > 0) {
            String var11 = HexDump.dump(var10, 0L, 0);
            b.append(var11);
         }
      } else {
         b.append(value.toString());
      }

      b.append(']');
      return b.toString();
   }
}
