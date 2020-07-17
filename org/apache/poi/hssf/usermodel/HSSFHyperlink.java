package org.apache.poi.hssf.usermodel;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.record.HyperlinkRecord;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.util.Internal;

public class HSSFHyperlink implements Hyperlink {

   protected final HyperlinkRecord record;
   protected final HyperlinkType link_type;


   @Internal(
      since = "3.15 beta 3"
   )
   protected HSSFHyperlink(int type) {
      this(HyperlinkType.forInt(type));
   }

   @Internal(
      since = "3.15 beta 3"
   )
   protected HSSFHyperlink(HyperlinkType type) {
      this.link_type = type;
      this.record = new HyperlinkRecord();
      switch(HSSFHyperlink.NamelessClass2034750551.$SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[type.ordinal()]) {
      case 1:
      case 2:
         this.record.newUrlLink();
         break;
      case 3:
         this.record.newFileLink();
         break;
      case 4:
         this.record.newDocumentLink();
         break;
      default:
         throw new IllegalArgumentException("Invalid type: " + type);
      }

   }

   protected HSSFHyperlink(HyperlinkRecord record) {
      this.record = record;
      this.link_type = getType(record);
   }

   private static HyperlinkType getType(HyperlinkRecord record) {
      HyperlinkType link_type;
      if(record.isFileLink()) {
         link_type = HyperlinkType.FILE;
      } else if(record.isDocumentLink()) {
         link_type = HyperlinkType.DOCUMENT;
      } else if(record.getAddress() != null && record.getAddress().startsWith("mailto:")) {
         link_type = HyperlinkType.EMAIL;
      } else {
         link_type = HyperlinkType.URL;
      }

      return link_type;
   }

   protected HSSFHyperlink(Hyperlink other) {
      if(other instanceof HSSFHyperlink) {
         HSSFHyperlink hlink = (HSSFHyperlink)other;
         this.record = hlink.record.clone();
         this.link_type = getType(this.record);
      } else {
         this.link_type = other.getTypeEnum();
         this.record = new HyperlinkRecord();
         this.setFirstRow(other.getFirstRow());
         this.setFirstColumn(other.getFirstColumn());
         this.setLastRow(other.getLastRow());
         this.setLastColumn(other.getLastColumn());
      }

   }

   public int getFirstRow() {
      return this.record.getFirstRow();
   }

   public void setFirstRow(int row) {
      this.record.setFirstRow(row);
   }

   public int getLastRow() {
      return this.record.getLastRow();
   }

   public void setLastRow(int row) {
      this.record.setLastRow(row);
   }

   public int getFirstColumn() {
      return this.record.getFirstColumn();
   }

   public void setFirstColumn(int col) {
      this.record.setFirstColumn((short)col);
   }

   public int getLastColumn() {
      return this.record.getLastColumn();
   }

   public void setLastColumn(int col) {
      this.record.setLastColumn((short)col);
   }

   public String getAddress() {
      return this.record.getAddress();
   }

   public String getTextMark() {
      return this.record.getTextMark();
   }

   public void setTextMark(String textMark) {
      this.record.setTextMark(textMark);
   }

   public String getShortFilename() {
      return this.record.getShortFilename();
   }

   public void setShortFilename(String shortFilename) {
      this.record.setShortFilename(shortFilename);
   }

   public void setAddress(String address) {
      this.record.setAddress(address);
   }

   public String getLabel() {
      return this.record.getLabel();
   }

   public void setLabel(String label) {
      this.record.setLabel(label);
   }

   public int getType() {
      return this.link_type.getCode();
   }

   public HyperlinkType getTypeEnum() {
      return this.link_type;
   }

   public boolean equals(Object other) {
      if(this == other) {
         return true;
      } else if(!(other instanceof HSSFHyperlink)) {
         return false;
      } else {
         HSSFHyperlink otherLink = (HSSFHyperlink)other;
         return this.record == otherLink.record;
      }
   }

   public int hashCode() {
      return this.record.hashCode();
   }

   // $FF: synthetic class
   static class NamelessClass2034750551 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType = new int[HyperlinkType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.URL.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.EMAIL.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.FILE.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.DOCUMENT.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
