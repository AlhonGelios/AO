package org.apache.poi.ss.usermodel;

import java.util.regex.Pattern;

public interface Table {

   Pattern isStructuredReference = Pattern.compile("[a-zA-Z_\\\\][a-zA-Z0-9._]*\\[.*\\]");


   int getStartColIndex();

   int getStartRowIndex();

   int getEndColIndex();

   int getEndRowIndex();

   String getName();

   int findColumnIndex(String var1);

   String getSheetName();

   boolean isHasTotalsRow();

}
