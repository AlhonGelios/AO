package org.apache.poi.ss.formula.functions;


public class BaseNumberUtils {

   public static double convertToDecimal(String value, int base, int maxNumberOfPlaces) throws IllegalArgumentException {
      if(value != null && value.length() != 0) {
         long stringLength = (long)value.length();
         if(stringLength > (long)maxNumberOfPlaces) {
            throw new IllegalArgumentException();
         } else {
            double decimalValue = 0.0D;
            long signedDigit = 0L;
            boolean hasSignedDigit = true;
            char[] characters = value.toCharArray();
            char[] isNegative = characters;
            int len$ = characters.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               char character = isNegative[i$];
               long digit;
               if(48 <= character && character <= 57) {
                  digit = (long)(character - 48);
               } else if(65 <= character && character <= 90) {
                  digit = (long)(10 + (character - 65));
               } else if(97 <= character && character <= 122) {
                  digit = (long)(10 + (character - 97));
               } else {
                  digit = (long)base;
               }

               if(digit >= (long)base) {
                  throw new IllegalArgumentException("character not allowed");
               }

               if(hasSignedDigit) {
                  hasSignedDigit = false;
                  signedDigit = digit;
               }

               decimalValue = decimalValue * (double)base + (double)digit;
            }

            boolean var17 = !hasSignedDigit && stringLength == (long)maxNumberOfPlaces && signedDigit >= (long)(base / 2);
            if(var17) {
               decimalValue = getTwoComplement((double)base, (double)maxNumberOfPlaces, decimalValue);
               decimalValue *= -1.0D;
            }

            return decimalValue;
         }
      } else {
         return 0.0D;
      }
   }

   private static double getTwoComplement(double base, double maxNumberOfPlaces, double decimalValue) {
      return Math.pow(base, maxNumberOfPlaces) - decimalValue;
   }
}
