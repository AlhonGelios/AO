package org.apache.poi.xssf.util;


public class NumericRanges {

   public static final int NO_OVERLAPS = -1;
   public static final int OVERLAPS_1_MINOR = 0;
   public static final int OVERLAPS_2_MINOR = 1;
   public static final int OVERLAPS_1_WRAPS = 2;
   public static final int OVERLAPS_2_WRAPS = 3;


   public static long[] getOverlappingRange(long[] range1, long[] range2) {
      int overlappingType = getOverlappingType(range1, range2);
      return overlappingType == 0?new long[]{range2[0], range1[1]}:(overlappingType == 1?new long[]{range1[0], range2[1]}:(overlappingType == 3?range1:(overlappingType == 2?range2:new long[]{-1L, -1L})));
   }

   public static int getOverlappingType(long[] range1, long[] range2) {
      long min1 = range1[0];
      long max1 = range1[1];
      long min2 = range2[0];
      long max2 = range2[1];
      return min1 >= min2 && max1 <= max2?3:(min2 >= min1 && max2 <= max1?2:(min2 >= min1 && min2 <= max1 && max2 >= max1?0:(min1 >= min2 && min1 <= max2 && max1 >= max2?1:-1)));
   }
}
