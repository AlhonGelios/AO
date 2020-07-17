package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.FormulaRenderingWorkbook;
import org.apache.poi.ss.formula.SheetNameFormatter;

final class ExternSheetNameResolver {

   public static String prependSheetName(FormulaRenderingWorkbook book, int field_1_index_extern_sheet, String cellRefText) {
      EvaluationWorkbook.ExternalSheet externalSheet = book.getExternalSheet(field_1_index_extern_sheet);
      StringBuffer sb;
      String firstSheetName;
      String lastSheetName;
      if(externalSheet != null) {
         firstSheetName = externalSheet.getWorkbookName();
         lastSheetName = externalSheet.getSheetName();
         if(firstSheetName != null) {
            sb = new StringBuffer(firstSheetName.length() + lastSheetName.length() + cellRefText.length() + 4);
            SheetNameFormatter.appendFormat(sb, firstSheetName, lastSheetName);
         } else {
            sb = new StringBuffer(lastSheetName.length() + cellRefText.length() + 4);
            SheetNameFormatter.appendFormat(sb, lastSheetName);
         }

         if(externalSheet instanceof EvaluationWorkbook.ExternalSheetRange) {
            EvaluationWorkbook.ExternalSheetRange r = (EvaluationWorkbook.ExternalSheetRange)externalSheet;
            if(!r.getFirstSheetName().equals(r.getLastSheetName())) {
               sb.append(':');
               SheetNameFormatter.appendFormat(sb, r.getLastSheetName());
            }
         }
      } else {
         firstSheetName = book.getSheetFirstNameByExternSheet(field_1_index_extern_sheet);
         lastSheetName = book.getSheetLastNameByExternSheet(field_1_index_extern_sheet);
         sb = new StringBuffer(firstSheetName.length() + cellRefText.length() + 4);
         if(firstSheetName.length() < 1) {
            sb.append("#REF");
         } else {
            SheetNameFormatter.appendFormat(sb, firstSheetName);
            if(!firstSheetName.equals(lastSheetName)) {
               sb.append(':');
               sb.append(lastSheetName);
            }
         }
      }

      sb.append('!');
      sb.append(cellRefText);
      return sb.toString();
   }
}
