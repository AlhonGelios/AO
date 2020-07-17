package org.apache.poi.ss.util;

import java.math.BigInteger;
import org.apache.poi.ss.util.NormalisedDecimal;

final class ExpandedDouble {

   private static final BigInteger BI_FRAC_MASK = BigInteger.valueOf(4503599627370495L);
   private static final BigInteger BI_IMPLIED_FRAC_MSB = BigInteger.valueOf(4503599627370496L);
   private final BigInteger _significand;
   private final int _binaryExponent;


   private static BigInteger getFrac(long rawBits) {
      return BigInteger.valueOf(rawBits).and(BI_FRAC_MASK).or(BI_IMPLIED_FRAC_MSB).shiftLeft(11);
   }

   public static ExpandedDouble fromRawBitsAndExponent(long rawBits, int exp) {
      return new ExpandedDouble(getFrac(rawBits), exp);
   }

   public ExpandedDouble(long rawBits) {
      int biasedExp = (int)(rawBits >> 52);
      BigInteger frac;
      if(biasedExp == 0) {
         frac = BigInteger.valueOf(rawBits).and(BI_FRAC_MASK);
         int expAdj = 64 - frac.bitLength();
         this._significand = frac.shiftLeft(expAdj);
         this._binaryExponent = (biasedExp & 2047) - 1023 - expAdj;
      } else {
         frac = getFrac(rawBits);
         this._significand = frac;
         this._binaryExponent = (biasedExp & 2047) - 1023;
      }

   }

   ExpandedDouble(BigInteger frac, int binaryExp) {
      if(frac.bitLength() != 64) {
         throw new IllegalArgumentException("bad bit length");
      } else {
         this._significand = frac;
         this._binaryExponent = binaryExp;
      }
   }

   public NormalisedDecimal normaliseBaseTen() {
      return NormalisedDecimal.create(this._significand, this._binaryExponent);
   }

   public int getBinaryExponent() {
      return this._binaryExponent;
   }

   public BigInteger getSignificand() {
      return this._significand;
   }

}
