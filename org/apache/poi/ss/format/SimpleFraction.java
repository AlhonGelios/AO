package org.apache.poi.ss.format;


public class SimpleFraction {

   private final int denominator;
   private final int numerator;


   public static SimpleFraction buildFractionExactDenominator(double val, int exactDenom) {
      int num = (int)Math.round(val * (double)exactDenom);
      return new SimpleFraction(num, exactDenom);
   }

   public static SimpleFraction buildFractionMaxDenominator(double value, int maxDenominator) {
      return buildFractionMaxDenominator(value, 0.0D, maxDenominator, 100);
   }

   private static SimpleFraction buildFractionMaxDenominator(double value, double epsilon, int maxDenominator, int maxIterations) {
      long overflow = 2147483647L;
      double r0 = value;
      long a0 = (long)Math.floor(value);
      if(a0 > overflow) {
         throw new IllegalArgumentException("Overflow trying to convert " + value + " to fraction (" + a0 + "/" + 1L + ")");
      } else if(Math.abs((double)a0 - value) < epsilon) {
         return new SimpleFraction((int)a0, 1);
      } else {
         long p0 = 1L;
         long q0 = 0L;
         long p1 = a0;
         long q1 = 1L;
         int n = 0;
         boolean stop = false;

         long p2;
         long q2;
         do {
            ++n;
            double r1 = 1.0D / (r0 - (double)a0);
            long a1 = (long)Math.floor(r1);
            p2 = a1 * p1 + p0;
            q2 = a1 * q1 + q0;
            if(epsilon == 0.0D && maxDenominator > 0 && Math.abs(q2) > (long)maxDenominator && Math.abs(q1) < (long)maxDenominator) {
               return new SimpleFraction((int)p1, (int)q1);
            }

            if(p2 > overflow || q2 > overflow) {
               throw new RuntimeException("Overflow trying to convert " + value + " to fraction (" + p2 + "/" + q2 + ")");
            }

            double convergent = (double)p2 / (double)q2;
            if(n < maxIterations && Math.abs(convergent - value) > epsilon && q2 < (long)maxDenominator) {
               p0 = p1;
               p1 = p2;
               q0 = q1;
               q1 = q2;
               a0 = a1;
               r0 = r1;
            } else {
               stop = true;
            }
         } while(!stop);

         if(n >= maxIterations) {
            throw new RuntimeException("Unable to convert " + value + " to fraction after " + maxIterations + " iterations");
         } else if(q2 < (long)maxDenominator) {
            return new SimpleFraction((int)p2, (int)q2);
         } else {
            return new SimpleFraction((int)p1, (int)q1);
         }
      }
   }

   public SimpleFraction(int numerator, int denominator) {
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public int getDenominator() {
      return this.denominator;
   }

   public int getNumerator() {
      return this.numerator;
   }
}
