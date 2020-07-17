package org.apache.poi.ss.util;

import java.util.Locale;
import org.apache.poi.ss.util.ExpandedDouble;
import org.apache.poi.ss.util.IEEEDouble;
import org.apache.poi.ss.util.NormalisedDecimal;

public final class NumberComparer {

   public static int compare(double a, double b) {
      long rawBitsA = Double.doubleToLongBits(a);
      long rawBitsB = Double.doubleToLongBits(b);
      int biasedExponentA = IEEEDouble.getBiasedExponent(rawBitsA);
      int biasedExponentB = IEEEDouble.getBiasedExponent(rawBitsB);
      if(biasedExponentA == 2047) {
         throw new IllegalArgumentException("Special double values are not allowed: " + toHex(a));
      } else if(biasedExponentB == 2047) {
         throw new IllegalArgumentException("Special double values are not allowed: " + toHex(a));
      } else {
         boolean aIsNegative = rawBitsA < 0L;
         boolean bIsNegative = rawBitsB < 0L;
         if(aIsNegative != bIsNegative) {
            return aIsNegative?-1:1;
         } else {
            int cmp = biasedExponentA - biasedExponentB;
            int absExpDiff = Math.abs(cmp);
            if(absExpDiff > 1) {
               return aIsNegative?-cmp:cmp;
            } else if(absExpDiff != 1 && rawBitsA == rawBitsB) {
               return 0;
            } else if(biasedExponentA == 0) {
               return biasedExponentB == 0?compareSubnormalNumbers(rawBitsA & 4503599627370495L, rawBitsB & 4503599627370495L, aIsNegative):-compareAcrossSubnormalThreshold(rawBitsB, rawBitsA, aIsNegative);
            } else if(biasedExponentB == 0) {
               return compareAcrossSubnormalThreshold(rawBitsA, rawBitsB, aIsNegative);
            } else {
               ExpandedDouble edA = ExpandedDouble.fromRawBitsAndExponent(rawBitsA, biasedExponentA - 1023);
               ExpandedDouble edB = ExpandedDouble.fromRawBitsAndExponent(rawBitsB, biasedExponentB - 1023);
               NormalisedDecimal ndA = edA.normaliseBaseTen().roundUnits();
               NormalisedDecimal ndB = edB.normaliseBaseTen().roundUnits();
               cmp = ndA.compareNormalised(ndB);
               return aIsNegative?-cmp:cmp;
            }
         }
      }
   }

   private static int compareSubnormalNumbers(long fracA, long fracB, boolean isNegative) {
      int cmp = fracA > fracB?1:(fracA < fracB?-1:0);
      return isNegative?-cmp:cmp;
   }

   private static int compareAcrossSubnormalThreshold(long normalRawBitsA, long subnormalRawBitsB, boolean isNegative) {
      long fracB = subnormalRawBitsB & 4503599627370495L;
      if(fracB == 0L) {
         return isNegative?-1:1;
      } else {
         long fracA = normalRawBitsA & 4503599627370495L;
         return fracA <= 7L && fracB >= 4503599627370490L?(fracA == 7L && fracB == 4503599627370490L?0:(isNegative?1:-1)):(isNegative?-1:1);
      }
   }

   private static String toHex(double a) {
      return "0x" + Long.toHexString(Double.doubleToLongBits(a)).toUpperCase(Locale.ROOT);
   }
}
