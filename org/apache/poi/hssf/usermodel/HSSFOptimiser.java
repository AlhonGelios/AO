package org.apache.poi.hssf.usermodel;

import java.util.HashSet;
import java.util.Iterator;
import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.apache.poi.hssf.record.FontRecord;
import org.apache.poi.hssf.record.common.UnicodeString;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class HSSFOptimiser {

   public static void optimiseFonts(HSSFWorkbook workbook) {
      short[] newPos = new short[workbook.getWorkbook().getNumberOfFontRecords() + 1];
      boolean[] zapRecords = new boolean[newPos.length];

      for(int frecs = 0; frecs < newPos.length; ++frecs) {
         newPos[frecs] = (short)frecs;
         zapRecords[frecs] = false;
      }

      FontRecord[] var14 = new FontRecord[newPos.length];

      int doneUnicodeStrings;
      for(doneUnicodeStrings = 0; doneUnicodeStrings < newPos.length; ++doneUnicodeStrings) {
         if(doneUnicodeStrings != 4) {
            var14[doneUnicodeStrings] = workbook.getWorkbook().getFontRecordAt(doneUnicodeStrings);
         }
      }

      int sheetNum;
      for(doneUnicodeStrings = 5; doneUnicodeStrings < newPos.length; ++doneUnicodeStrings) {
         sheetNum = -1;

         for(int s = 0; s < doneUnicodeStrings && sheetNum == -1; ++s) {
            if(s != 4) {
               FontRecord i$ = workbook.getWorkbook().getFontRecordAt(s);
               if(i$.sameProperties(var14[doneUnicodeStrings])) {
                  sheetNum = s;
               }
            }
         }

         if(sheetNum != -1) {
            newPos[doneUnicodeStrings] = (short)sheetNum;
            zapRecords[doneUnicodeStrings] = true;
         }
      }

      for(doneUnicodeStrings = 5; doneUnicodeStrings < newPos.length; ++doneUnicodeStrings) {
         short var15 = newPos[doneUnicodeStrings];
         short var17 = var15;

         for(int var18 = 0; var18 < var15; ++var18) {
            if(zapRecords[var18]) {
               --var17;
            }
         }

         newPos[doneUnicodeStrings] = var17;
      }

      for(doneUnicodeStrings = 5; doneUnicodeStrings < newPos.length; ++doneUnicodeStrings) {
         if(zapRecords[doneUnicodeStrings]) {
            workbook.getWorkbook().removeFontRecord(var14[doneUnicodeStrings]);
         }
      }

      workbook.resetFontCache();

      for(doneUnicodeStrings = 0; doneUnicodeStrings < workbook.getWorkbook().getNumExFormats(); ++doneUnicodeStrings) {
         ExtendedFormatRecord var16 = workbook.getWorkbook().getExFormatAt(doneUnicodeStrings);
         var16.setFontIndex(newPos[var16.getFontIndex()]);
      }

      HashSet var19 = new HashSet();

      for(sheetNum = 0; sheetNum < workbook.getNumberOfSheets(); ++sheetNum) {
         HSSFSheet var20 = workbook.getSheetAt(sheetNum);
         Iterator var21 = var20.iterator();

         while(var21.hasNext()) {
            Row row = (Row)var21.next();
            Iterator i$1 = row.iterator();

            while(i$1.hasNext()) {
               Cell cell = (Cell)i$1.next();
               if(cell.getCellTypeEnum() == CellType.STRING) {
                  HSSFRichTextString rtr = (HSSFRichTextString)cell.getRichStringCellValue();
                  UnicodeString u = rtr.getRawUnicodeString();
                  if(!var19.contains(u)) {
                     for(short i = 5; i < newPos.length; ++i) {
                        if(i != newPos[i]) {
                           u.swapFontUse(i, newPos[i]);
                        }
                     }

                     var19.add(u);
                  }
               }
            }
         }
      }

   }

   public static void optimiseCellStyles(HSSFWorkbook workbook) {
      short[] newPos = new short[workbook.getWorkbook().getNumExFormats()];
      boolean[] isUsed = new boolean[newPos.length];
      boolean[] zapRecords = new boolean[newPos.length];

      for(int xfrs = 0; xfrs < newPos.length; ++xfrs) {
         isUsed[xfrs] = false;
         newPos[xfrs] = (short)xfrs;
         zapRecords[xfrs] = false;
      }

      ExtendedFormatRecord[] var16 = new ExtendedFormatRecord[newPos.length];

      int max;
      for(max = 0; max < newPos.length; ++max) {
         var16[max] = workbook.getWorkbook().getExFormatAt(max);
      }

      int removed;
      int sheetNum;
      for(max = 21; max < newPos.length; ++max) {
         removed = -1;

         for(sheetNum = 0; sheetNum < max && removed == -1; ++sheetNum) {
            ExtendedFormatRecord s = workbook.getWorkbook().getExFormatAt(sheetNum);
            if(s.equals(var16[max])) {
               removed = sheetNum;
            }
         }

         if(removed != -1) {
            newPos[max] = (short)removed;
            zapRecords[max] = true;
         }

         if(removed != -1) {
            isUsed[removed] = true;
         }
      }

      Iterator i$;
      for(max = 0; max < workbook.getNumberOfSheets(); ++max) {
         HSSFSheet var17 = workbook.getSheetAt(max);
         Iterator var19 = var17.iterator();

         while(var19.hasNext()) {
            Row var21 = (Row)var19.next();

            short cellI;
            for(i$ = var21.iterator(); i$.hasNext(); isUsed[cellI] = true) {
               Cell row = (Cell)i$.next();
               HSSFCell i$1 = (HSSFCell)row;
               cellI = i$1.getCellValueRecord().getXFIndex();
            }
         }
      }

      for(max = 21; max < isUsed.length; ++max) {
         if(!isUsed[max]) {
            zapRecords[max] = true;
            newPos[max] = 0;
         }
      }

      for(max = 21; max < newPos.length; ++max) {
         short var18 = newPos[max];
         short var20 = var18;

         for(int var22 = 0; var22 < var18; ++var22) {
            if(zapRecords[var22]) {
               --var20;
            }
         }

         newPos[max] = var20;
      }

      max = newPos.length;
      removed = 0;

      for(sheetNum = 21; sheetNum < max; ++sheetNum) {
         if(zapRecords[sheetNum + removed]) {
            workbook.getWorkbook().removeExFormatRecord(sheetNum);
            --sheetNum;
            --max;
            ++removed;
         }
      }

      for(sheetNum = 0; sheetNum < workbook.getNumberOfSheets(); ++sheetNum) {
         HSSFSheet var23 = workbook.getSheetAt(sheetNum);
         i$ = var23.iterator();

         while(i$.hasNext()) {
            Row var24 = (Row)i$.next();
            Iterator var25 = var24.iterator();

            while(var25.hasNext()) {
               Cell var26 = (Cell)var25.next();
               HSSFCell cell = (HSSFCell)var26;
               short oldXf = cell.getCellValueRecord().getXFIndex();
               HSSFCellStyle newStyle = workbook.getCellStyleAt(newPos[oldXf]);
               cell.setCellStyle(newStyle);
            }
         }
      }

   }
}
