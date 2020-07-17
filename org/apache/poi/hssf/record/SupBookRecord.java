package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.StringUtil;

public final class SupBookRecord extends StandardRecord {

   private static final POILogger logger = POILogFactory.getLogger(SupBookRecord.class);
   public static final short sid = 430;
   private static final short SMALL_RECORD_SIZE = 4;
   private static final short TAG_INTERNAL_REFERENCES = 1025;
   private static final short TAG_ADD_IN_FUNCTIONS = 14849;
   private short field_1_number_of_sheets;
   private String field_2_encoded_url;
   private String[] field_3_sheet_names;
   private boolean _isAddInFunctions;
   protected static final char CH_VOLUME = '\u0001';
   protected static final char CH_SAME_VOLUME = '\u0002';
   protected static final char CH_DOWN_DIR = '\u0003';
   protected static final char CH_UP_DIR = '\u0004';
   protected static final char CH_LONG_VOLUME = '\u0005';
   protected static final char CH_STARTUP_DIR = '\u0006';
   protected static final char CH_ALT_STARTUP_DIR = '\u0007';
   protected static final char CH_LIB_DIR = '\b';
   protected static final String PATH_SEPERATOR = System.getProperty("file.separator");


   public static SupBookRecord createInternalReferences(short numberOfSheets) {
      return new SupBookRecord(false, numberOfSheets);
   }

   public static SupBookRecord createAddInFunctions() {
      return new SupBookRecord(true, (short)1);
   }

   public static SupBookRecord createExternalReferences(String url, String[] sheetNames) {
      return new SupBookRecord(url, sheetNames);
   }

   private SupBookRecord(boolean isAddInFuncs, short numberOfSheets) {
      this.field_1_number_of_sheets = numberOfSheets;
      this.field_2_encoded_url = null;
      this.field_3_sheet_names = null;
      this._isAddInFunctions = isAddInFuncs;
   }

   public SupBookRecord(String url, String[] sheetNames) {
      this.field_1_number_of_sheets = (short)sheetNames.length;
      this.field_2_encoded_url = url;
      this.field_3_sheet_names = sheetNames;
      this._isAddInFunctions = false;
   }

   public boolean isExternalReferences() {
      return this.field_3_sheet_names != null;
   }

   public boolean isInternalReferences() {
      return this.field_3_sheet_names == null && !this._isAddInFunctions;
   }

   public boolean isAddInFunctions() {
      return this.field_3_sheet_names == null && this._isAddInFunctions;
   }

   public SupBookRecord(RecordInputStream in) {
      int recLen = in.remaining();
      this.field_1_number_of_sheets = in.readShort();
      if(recLen <= 4) {
         this.field_2_encoded_url = null;
         this.field_3_sheet_names = null;
         short var5 = in.readShort();
         if(var5 == 1025) {
            this._isAddInFunctions = false;
         } else {
            if(var5 != 14849) {
               throw new RuntimeException("invalid EXTERNALBOOK code (" + Integer.toHexString(var5) + ")");
            }

            this._isAddInFunctions = true;
            if(this.field_1_number_of_sheets != 1) {
               throw new RuntimeException("Expected 0x0001 for number of sheets field in \'Add-In Functions\' but got (" + this.field_1_number_of_sheets + ")");
            }
         }

      } else {
         this._isAddInFunctions = false;
         this.field_2_encoded_url = in.readString();
         String[] nextShort = new String[this.field_1_number_of_sheets];

         for(int i = 0; i < nextShort.length; ++i) {
            nextShort[i] = in.readString();
         }

         this.field_3_sheet_names = nextShort;
      }
   }

   public String toString() {
      StringBuffer sb = new StringBuffer();
      sb.append("[SUPBOOK ");
      if(this.isExternalReferences()) {
         sb.append("External References]\n");
         sb.append(" .url     = ").append(this.field_2_encoded_url).append("\n");
         sb.append(" .nSheets = ").append(this.field_1_number_of_sheets).append("\n");
         String[] arr$ = this.field_3_sheet_names;
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            String sheetname = arr$[i$];
            sb.append("    .name = ").append(sheetname).append("\n");
         }

         sb.append("[/SUPBOOK");
      } else if(this._isAddInFunctions) {
         sb.append("Add-In Functions");
      } else {
         sb.append("Internal References");
         sb.append(" nSheets=").append(this.field_1_number_of_sheets);
      }

      sb.append("]");
      return sb.toString();
   }

   protected int getDataSize() {
      if(!this.isExternalReferences()) {
         return 4;
      } else {
         byte sum = 2;
         int var3 = sum + StringUtil.getEncodedSize(this.field_2_encoded_url);

         for(int i = 0; i < this.field_3_sheet_names.length; ++i) {
            var3 += StringUtil.getEncodedSize(this.field_3_sheet_names[i]);
         }

         return var3;
      }
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this.field_1_number_of_sheets);
      int field2val;
      if(this.isExternalReferences()) {
         StringUtil.writeUnicodeString(out, this.field_2_encoded_url);

         for(field2val = 0; field2val < this.field_3_sheet_names.length; ++field2val) {
            StringUtil.writeUnicodeString(out, this.field_3_sheet_names[field2val]);
         }
      } else {
         field2val = this._isAddInFunctions?14849:1025;
         out.writeShort(field2val);
      }

   }

   public void setNumberOfSheets(short number) {
      this.field_1_number_of_sheets = number;
   }

   public short getNumberOfSheets() {
      return this.field_1_number_of_sheets;
   }

   public short getSid() {
      return (short)430;
   }

   public String getURL() {
      String encodedUrl = this.field_2_encoded_url;
      switch(encodedUrl.charAt(0)) {
      case 0:
         return encodedUrl.substring(1);
      case 1:
         return decodeFileName(encodedUrl);
      case 2:
         return encodedUrl.substring(1);
      default:
         return encodedUrl;
      }
   }

   private static String decodeFileName(String encodedUrl) {
      StringBuilder sb = new StringBuilder();

      for(int i = 1; i < encodedUrl.length(); ++i) {
         char c = encodedUrl.charAt(i);
         switch(c) {
         case 1:
            ++i;
            char driveLetter = encodedUrl.charAt(i);
            if(driveLetter == 64) {
               sb.append("\\\\");
            } else {
               sb.append(driveLetter).append(":");
            }
            break;
         case 2:
            sb.append(PATH_SEPERATOR);
            break;
         case 3:
            sb.append(PATH_SEPERATOR);
            break;
         case 4:
            sb.append("..").append(PATH_SEPERATOR);
            break;
         case 5:
            logger.log(5, new Object[]{"Found unexpected key: ChLongVolume - IGNORING"});
            break;
         case 6:
         case 7:
         case 8:
            logger.log(5, new Object[]{"EXCEL.EXE path unkown - using this directoy instead: ."});
            sb.append(".").append(PATH_SEPERATOR);
            break;
         default:
            sb.append(c);
         }
      }

      return sb.toString();
   }

   public String[] getSheetNames() {
      return (String[])this.field_3_sheet_names.clone();
   }

   public void setURL(String pUrl) {
      this.field_2_encoded_url = this.field_2_encoded_url.substring(0, 1) + pUrl;
   }

}
