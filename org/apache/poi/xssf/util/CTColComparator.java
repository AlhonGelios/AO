package org.apache.poi.xssf.util;

import java.util.Comparator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol;

public class CTColComparator {

   public static final Comparator BY_MAX = new Comparator() {
      public int compare(CTCol col1, CTCol col2) {
         long col1max = col1.getMax();
         long col2max = col2.getMax();
         return col1max < col2max?-1:(col1max > col2max?1:0);
      }
   };
   public static final Comparator BY_MIN_MAX = new Comparator() {
      public int compare(CTCol col1, CTCol col2) {
         long col11min = col1.getMin();
         long col2min = col2.getMin();
         return col11min < col2min?-1:(col11min > col2min?1:CTColComparator.BY_MAX.compare(col1, col2));
      }
   };


}
