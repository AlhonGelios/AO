package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class Rate implements Function {

   private static final POILogger LOG = POILogFactory.getLogger(Rate.class);


   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      if(args.length < 3) {
         return ErrorEval.VALUE_INVALID;
      } else {
         double future_val = 0.0D;
         double type = 0.0D;
         double estimate = 0.1D;

         double rate;
         try {
            ValueEval e = OperandResolver.getSingleValue(args[0], srcRowIndex, srcColumnIndex);
            ValueEval v2 = OperandResolver.getSingleValue(args[1], srcRowIndex, srcColumnIndex);
            ValueEval v3 = OperandResolver.getSingleValue(args[2], srcRowIndex, srcColumnIndex);
            ValueEval v4 = null;
            if(args.length >= 4) {
               v4 = OperandResolver.getSingleValue(args[3], srcRowIndex, srcColumnIndex);
            }

            ValueEval v5 = null;
            if(args.length >= 5) {
               v5 = OperandResolver.getSingleValue(args[4], srcRowIndex, srcColumnIndex);
            }

            ValueEval v6 = null;
            if(args.length >= 6) {
               v6 = OperandResolver.getSingleValue(args[5], srcRowIndex, srcColumnIndex);
            }

            double periods = OperandResolver.coerceValueToDouble(e);
            double payment = OperandResolver.coerceValueToDouble(v2);
            double present_val = OperandResolver.coerceValueToDouble(v3);
            if(args.length >= 4) {
               future_val = OperandResolver.coerceValueToDouble(v4);
            }

            if(args.length >= 5) {
               type = OperandResolver.coerceValueToDouble(v5);
            }

            if(args.length >= 6) {
               estimate = OperandResolver.coerceValueToDouble(v6);
            }

            rate = this.calculateRate(periods, payment, present_val, future_val, type, estimate);
            checkValue(rate);
         } catch (EvaluationException var24) {
            LOG.log(7, new Object[]{"Can\'t evaluate rate function", var24});
            return var24.getErrorEval();
         }

         return new NumberEval(rate);
      }
   }

   private double calculateRate(double nper, double pmt, double pv, double fv, double type, double guess) {
      byte FINANCIAL_MAX_ITERATIONS = 20;
      double FINANCIAL_PRECISION = 1.0E-7D;
      double x1 = 0.0D;
      double f = 0.0D;
      double i = 0.0D;
      double rate = guess;
      double y;
      if(Math.abs(guess) < FINANCIAL_PRECISION) {
         y = pv * (1.0D + nper * guess) + pmt * (1.0D + guess * type) * nper + fv;
      } else {
         f = Math.exp(nper * Math.log(1.0D + guess));
         y = pv * f + pmt * (1.0D / guess + type) * (f - 1.0D) + fv;
      }

      double y0 = pv + pmt * nper + fv;
      double y1 = pv * f + pmt * (1.0D / guess + type) * (f - 1.0D) + fv;
      double x0 = 0.0D;
      i = 0.0D;

      for(x1 = guess; Math.abs(y0 - y1) > FINANCIAL_PRECISION && i < (double)FINANCIAL_MAX_ITERATIONS; ++i) {
         rate = (y1 * x0 - y0 * x1) / (y1 - y0);
         x0 = x1;
         x1 = rate;
         if(Math.abs(rate) < FINANCIAL_PRECISION) {
            y = pv * (1.0D + nper * rate) + pmt * (1.0D + rate * type) * nper + fv;
         } else {
            f = Math.exp(nper * Math.log(1.0D + rate));
            y = pv * f + pmt * (1.0D / rate + type) * (f - 1.0D) + fv;
         }

         y0 = y1;
         y1 = y;
      }

      return rate;
   }

   static final void checkValue(double result) throws EvaluationException {
      if(Double.isNaN(result) || Double.isInfinite(result)) {
         throw new EvaluationException(ErrorEval.NUM_ERROR);
      }
   }

}
