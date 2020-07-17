package org.apache.poi.ss.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.poi.ss.util.ExpandedDouble;
import org.apache.poi.ss.util.MutableFPNumber;

final class NormalisedDecimal {

   private static final int EXPONENT_OFFSET = 14;
   private static final BigDecimal BD_2_POW_24 = new BigDecimal(BigInteger.ONE.shiftLeft(24));
   private static final int LOG_BASE_10_OF_2_TIMES_2_POW_20 = 315653;
   private static final int C_2_POW_19 = 524288;
   private static final int FRAC_HALF = 8388608;
   private static final long MAX_REP_WHOLE_PART = 1000000000000000L;
   private final int _relativeDecimalExponent;
   private final long _wholePart;
   private final int _fractionalPart;


   public static NormalisedDecimal create(BigInteger frac, int binaryExponent) {
      int pow10;
      if(binaryExponent <= 49 && binaryExponent >= 46) {
         pow10 = 0;
      } else {
         int cc = 15204352 - binaryExponent * 315653;
         cc += 524288;
         pow10 = -(cc >> 20);
      }

      MutableFPNumber var4 = new MutableFPNumber(frac, binaryExponent);
      if(pow10 != 0) {
         var4.multiplyByPowerOfTen(-pow10);
      }

      switch(var4.get64BitNormalisedExponent()) {
      case 46:
         if(var4.isAboveMinRep()) {
            break;
         }
      case 44:
      case 45:
         var4.multiplyByPowerOfTen(1);
         --pow10;
      case 47:
      case 48:
         break;
      case 49:
         if(var4.isBelowMaxRep()) {
            break;
         }
      case 50:
         var4.multiplyByPowerOfTen(-1);
         ++pow10;
         break;
      default:
         throw new IllegalStateException("Bad binary exp " + var4.get64BitNormalisedExponent() + ".");
      }

      var4.normalise64bit();
      return var4.createNormalisedDecimal(pow10);
   }

   public NormalisedDecimal roundUnits() {
      long wholePart = this._wholePart;
      if(this._fractionalPart >= 8388608) {
         ++wholePart;
      }

      int de = this._relativeDecimalExponent;
      return wholePart < 1000000000000000L?new NormalisedDecimal(wholePart, 0, de):new NormalisedDecimal(wholePart / 10L, 0, de + 1);
   }

   NormalisedDecimal(long wholePart, int fracPart, int decimalExponent) {
      this._wholePart = wholePart;
      this._fractionalPart = fracPart;
      this._relativeDecimalExponent = decimalExponent;
   }

   public ExpandedDouble normaliseBaseTwo() {
      MutableFPNumber cc = new MutableFPNumber(this.composeFrac(), 39);
      cc.multiplyByPowerOfTen(this._relativeDecimalExponent);
      cc.normalise64bit();
      return cc.createExpandedDouble();
   }

   BigInteger composeFrac() {
      long wp = this._wholePart;
      int fp = this._fractionalPart;
      return new BigInteger(new byte[]{(byte)((int)(wp >> 56)), (byte)((int)(wp >> 48)), (byte)((int)(wp >> 40)), (byte)((int)(wp >> 32)), (byte)((int)(wp >> 24)), (byte)((int)(wp >> 16)), (byte)((int)(wp >> 8)), (byte)((int)(wp >> 0)), (byte)(fp >> 16), (byte)(fp >> 8), (byte)(fp >> 0)});
   }

   public String getSignificantDecimalDigits() {
      return Long.toString(this._wholePart);
   }

   public String getSignificantDecimalDigitsLastDigitRounded() {
      long wp = this._wholePart + 5L;
      StringBuilder sb = new StringBuilder(24);
      sb.append(wp);
      sb.setCharAt(sb.length() - 1, '0');
      return sb.toString();
   }

   public int getDecimalExponent() {
      return this._relativeDecimalExponent + 14;
   }

   public int compareNormalised(NormalisedDecimal other) {
      int cmp = this._relativeDecimalExponent - other._relativeDecimalExponent;
      return cmp != 0?cmp:(this._wholePart > other._wholePart?1:(this._wholePart < other._wholePart?-1:this._fractionalPart - other._fractionalPart));
   }

   public BigDecimal getFractionalPart() {
      return (new BigDecimal(this._fractionalPart)).divide(BD_2_POW_24);
   }

   private String getFractionalDigits() {
      return this._fractionalPart == 0?"0":this.getFractionalPart().toString().substring(2);
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getName());
      sb.append(" [");
      String ws = String.valueOf(this._wholePart);
      sb.append(ws.charAt(0));
      sb.append('.');
      sb.append(ws.substring(1));
      sb.append(' ');
      sb.append(this.getFractionalDigits());
      sb.append("E");
      sb.append(this.getDecimalExponent());
      sb.append("]");
      return sb.toString();
   }

}
