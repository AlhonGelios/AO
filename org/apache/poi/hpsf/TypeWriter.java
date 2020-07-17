package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.hpsf.IllegalPropertySetDataException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.UnsupportedVariantTypeException;
import org.apache.poi.hpsf.VariantSupport;
import org.apache.poi.util.LittleEndian;

public class TypeWriter {

   public static int writeToStream(OutputStream out, short n) throws IOException {
      LittleEndian.putShort(out, n);
      return 2;
   }

   public static int writeToStream(OutputStream out, int n) throws IOException {
      LittleEndian.putInt(n, out);
      return 4;
   }

   public static int writeToStream(OutputStream out, long n) throws IOException {
      LittleEndian.putLong(n, out);
      return 8;
   }

   public static void writeUShortToStream(OutputStream out, int n) throws IOException {
      int high = n & -65536;
      if(high != 0) {
         throw new IllegalPropertySetDataException("Value " + n + " cannot be represented by 2 bytes.");
      } else {
         LittleEndian.putUShort(n, out);
      }
   }

   public static int writeUIntToStream(OutputStream out, long n) throws IOException {
      long high = n & -4294967296L;
      if(high != 0L && high != -4294967296L) {
         throw new IllegalPropertySetDataException("Value " + n + " cannot be represented by 4 bytes.");
      } else {
         LittleEndian.putUInt(n, out);
         return 4;
      }
   }

   public static int writeToStream(OutputStream out, ClassID n) throws IOException {
      byte[] b = new byte[16];
      n.write(b, 0);
      out.write(b, 0, b.length);
      return b.length;
   }

   public static void writeToStream(OutputStream out, Property[] properties, int codepage) throws IOException, UnsupportedVariantTypeException {
      if(properties != null) {
         int i;
         Property p;
         for(i = 0; i < properties.length; ++i) {
            p = properties[i];
            writeUIntToStream(out, p.getID());
            writeUIntToStream(out, (long)p.getSize());
         }

         for(i = 0; i < properties.length; ++i) {
            p = properties[i];
            long type = p.getType();
            writeUIntToStream(out, type);
            VariantSupport.write(out, (long)((int)type), p.getValue(), codepage);
         }

      }
   }

   public static int writeToStream(OutputStream out, double n) throws IOException {
      LittleEndian.putDouble(n, out);
      return 8;
   }
}
