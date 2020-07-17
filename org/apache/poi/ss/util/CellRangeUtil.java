package org.apache.poi.ss.util;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.util.CellRangeAddress;

public final class CellRangeUtil {

   public static final int NO_INTERSECTION = 1;
   public static final int OVERLAP = 2;
   public static final int INSIDE = 3;
   public static final int ENCLOSES = 4;


   public static int intersect(CellRangeAddress crA, CellRangeAddress crB) {
      int firstRow = crB.getFirstRow();
      int lastRow = crB.getLastRow();
      int firstCol = crB.getFirstColumn();
      int lastCol = crB.getLastColumn();
      return !gt(crA.getFirstRow(), lastRow) && !lt(crA.getLastRow(), firstRow) && !gt(crA.getFirstColumn(), lastCol) && !lt(crA.getLastColumn(), firstCol)?(contains(crA, crB)?3:(contains(crB, crA)?4:2)):1;
   }

   public static CellRangeAddress[] mergeCellRanges(CellRangeAddress[] cellRanges) {
      if(cellRanges.length < 1) {
         return new CellRangeAddress[0];
      } else {
         List list = toList(cellRanges);
         List temp = mergeCellRanges(list);
         return toArray(temp);
      }
   }

   private static List mergeCellRanges(List cellRangeList) {
      while(true) {
         if(cellRangeList.size() > 1) {
            boolean somethingGotMerged = false;

            for(int i = 0; i < cellRangeList.size(); ++i) {
               CellRangeAddress range1 = (CellRangeAddress)cellRangeList.get(i);

               for(int j = i + 1; j < cellRangeList.size(); ++j) {
                  CellRangeAddress range2 = (CellRangeAddress)cellRangeList.get(j);
                  CellRangeAddress[] mergeResult = mergeRanges(range1, range2);
                  if(mergeResult != null) {
                     somethingGotMerged = true;
                     cellRangeList.set(i, mergeResult[0]);
                     cellRangeList.remove(j--);

                     for(int k = 1; k < mergeResult.length; ++k) {
                        ++j;
                        cellRangeList.add(j, mergeResult[k]);
                     }
                  }
               }
            }

            if(somethingGotMerged) {
               continue;
            }
         }

         return cellRangeList;
      }
   }

   private static CellRangeAddress[] mergeRanges(CellRangeAddress range1, CellRangeAddress range2) {
      int x = intersect(range1, range2);
      switch(x) {
      case 1:
         if(hasExactSharedBorder(range1, range2)) {
            return new CellRangeAddress[]{createEnclosingCellRange(range1, range2)};
         }

         return null;
      case 2:
         return null;
      case 3:
         return new CellRangeAddress[]{range1};
      case 4:
         return new CellRangeAddress[]{range2};
      default:
         throw new RuntimeException("unexpected intersection result (" + x + ")");
      }
   }

   private static CellRangeAddress[] toArray(List temp) {
      CellRangeAddress[] result = new CellRangeAddress[temp.size()];
      temp.toArray(result);
      return result;
   }

   private static List toList(CellRangeAddress[] temp) {
      ArrayList result = new ArrayList(temp.length);
      CellRangeAddress[] arr$ = temp;
      int len$ = temp.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CellRangeAddress range = arr$[i$];
         result.add(range);
      }

      return result;
   }

   public static boolean contains(CellRangeAddress crA, CellRangeAddress crB) {
      return le(crA.getFirstRow(), crB.getFirstRow()) && ge(crA.getLastRow(), crB.getLastRow()) && le(crA.getFirstColumn(), crB.getFirstColumn()) && ge(crA.getLastColumn(), crB.getLastColumn());
   }

   public static boolean hasExactSharedBorder(CellRangeAddress crA, CellRangeAddress crB) {
      int oFirstRow = crB.getFirstRow();
      int oLastRow = crB.getLastRow();
      int oFirstCol = crB.getFirstColumn();
      int oLastCol = crB.getLastColumn();
      return (crA.getFirstRow() <= 0 || crA.getFirstRow() - 1 != oLastRow) && (oFirstRow <= 0 || oFirstRow - 1 != crA.getLastRow())?((crA.getFirstColumn() <= 0 || crA.getFirstColumn() - 1 != oLastCol) && (oFirstCol <= 0 || crA.getLastColumn() != oFirstCol - 1)?false:crA.getFirstRow() == oFirstRow && crA.getLastRow() == oLastRow):crA.getFirstColumn() == oFirstCol && crA.getLastColumn() == oLastCol;
   }

   public static CellRangeAddress createEnclosingCellRange(CellRangeAddress crA, CellRangeAddress crB) {
      if(crB == null) {
         return crA.copy();
      } else {
         int minRow = lt(crB.getFirstRow(), crA.getFirstRow())?crB.getFirstRow():crA.getFirstRow();
         int maxRow = gt(crB.getLastRow(), crA.getLastRow())?crB.getLastRow():crA.getLastRow();
         int minCol = lt(crB.getFirstColumn(), crA.getFirstColumn())?crB.getFirstColumn():crA.getFirstColumn();
         int maxCol = gt(crB.getLastColumn(), crA.getLastColumn())?crB.getLastColumn():crA.getLastColumn();
         return new CellRangeAddress(minRow, maxRow, minCol, maxCol);
      }
   }

   private static boolean lt(int a, int b) {
      return a == -1?false:(b == -1?true:a < b);
   }

   private static boolean le(int a, int b) {
      return a == b || lt(a, b);
   }

   private static boolean gt(int a, int b) {
      return lt(b, a);
   }

   private static boolean ge(int a, int b) {
      return !lt(a, b);
   }
}
