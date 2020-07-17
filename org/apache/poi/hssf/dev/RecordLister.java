package org.apache.poi.hssf.dev;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.hssf.dev.BiffViewer;
import org.apache.poi.hssf.record.RecordFactory;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;

public class RecordLister {

   String file;


   public void run() throws IOException {
      NPOIFSFileSystem fs = new NPOIFSFileSystem(new File(this.file), true);

      try {
         InputStream din = BiffViewer.getPOIFSInputStream(fs);

         try {
            RecordInputStream rinp = new RecordInputStream(din);

            while(rinp.hasNextRecord()) {
               int sid = rinp.getNextSid();
               rinp.nextRecord();
               int size = rinp.available();
               Class clz = RecordFactory.getRecordClass(sid);
               System.out.print(formatSID(sid) + " - " + formatSize(size) + " bytes");
               if(clz != null) {
                  System.out.print("  \t");
                  System.out.print(clz.getName().replace("org.apache.poi.hssf.record.", ""));
               }

               System.out.println();
               byte[] data = rinp.readRemainder();
               if(data.length > 0) {
                  System.out.print("   ");
                  System.out.println(formatData(data));
               }
            }
         } finally {
            din.close();
         }
      } finally {
         fs.close();
      }

   }

   private static String formatSID(int sid) {
      String hex = Integer.toHexString(sid);
      String dec = Integer.toString(sid);
      StringBuffer s = new StringBuffer();
      s.append("0x");

      int i;
      for(i = hex.length(); i < 4; ++i) {
         s.append('0');
      }

      s.append(hex);
      s.append(" (");

      for(i = dec.length(); i < 4; ++i) {
         s.append('0');
      }

      s.append(dec);
      s.append(")");
      return s.toString();
   }

   private static String formatSize(int size) {
      String hex = Integer.toHexString(size);
      String dec = Integer.toString(size);
      StringBuffer s = new StringBuffer();

      int i;
      for(i = hex.length(); i < 3; ++i) {
         s.append('0');
      }

      s.append(hex);
      s.append(" (");

      for(i = dec.length(); i < 3; ++i) {
         s.append('0');
      }

      s.append(dec);
      s.append(")");
      return s.toString();
   }

   private static String formatData(byte[] data) {
      if(data != null && data.length != 0) {
         StringBuffer s = new StringBuffer();
         if(data.length > 9) {
            s.append(byteToHex(data[0]));
            s.append(' ');
            s.append(byteToHex(data[1]));
            s.append(' ');
            s.append(byteToHex(data[2]));
            s.append(' ');
            s.append(byteToHex(data[3]));
            s.append(' ');
            s.append(" .... ");
            s.append(' ');
            s.append(byteToHex(data[data.length - 4]));
            s.append(' ');
            s.append(byteToHex(data[data.length - 3]));
            s.append(' ');
            s.append(byteToHex(data[data.length - 2]));
            s.append(' ');
            s.append(byteToHex(data[data.length - 1]));
         } else {
            for(int i = 0; i < data.length; ++i) {
               s.append(byteToHex(data[i]));
               s.append(' ');
            }
         }

         return s.toString();
      } else {
         return "";
      }
   }

   private static String byteToHex(byte b) {
      int i = b;
      if(b < 0) {
         i = b + 256;
      }

      String s = Integer.toHexString(i);
      return i < 16?"0" + s:s;
   }

   public void setFile(String file) {
      this.file = file;
   }

   public static void main(String[] args) throws IOException {
      if(args.length == 1 && !args[0].equals("--help")) {
         RecordLister viewer = new RecordLister();
         viewer.setFile(args[0]);
         viewer.run();
      } else {
         System.out.println("RecordLister");
         System.out.println("Outputs the summary of the records in file order");
         System.out.println("usage: java org.apache.poi.hssf.dev.RecordLister filename");
      }

   }
}
