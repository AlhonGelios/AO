package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;
import org.apache.poi.ss.usermodel.FormulaError;

public final class Errortype extends Fixed1ArgFunction {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
      try {
         OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
         return ErrorEval.NA;
      } catch (EvaluationException var6) {
         int result = this.translateErrorCodeToErrorTypeValue(var6.getErrorEval().getErrorCode());
         return new NumberEval((double)result);
      }
   }

   private int translateErrorCodeToErrorTypeValue(int errorCode) {
      switch(Errortype.NamelessClass103888215.$SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.forInt(errorCode).ordinal()]) {
      case 1:
         return 1;
      case 2:
         return 2;
      case 3:
         return 3;
      case 4:
         return 4;
      case 5:
         return 5;
      case 6:
         return 6;
      case 7:
         return 7;
      default:
         throw new IllegalArgumentException("Invalid error code (" + errorCode + ")");
      }
   }

   // $FF: synthetic class
   static class NamelessClass103888215 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$FormulaError = new int[FormulaError.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NULL.ordinal()] = 1;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.DIV0.ordinal()] = 2;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.VALUE.ordinal()] = 3;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.REF.ordinal()] = 4;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NAME.ordinal()] = 5;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NUM.ordinal()] = 6;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NA.ordinal()] = 7;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
