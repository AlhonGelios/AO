package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.TwoDEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.MissingArgEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function2Arg;
import org.apache.poi.ss.formula.functions.Function3Arg;
import org.apache.poi.ss.formula.functions.Function4Arg;

public final class Index implements Function2Arg, Function3Arg, Function4Arg {

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {
      TwoDEval reference = convertFirstArg(arg0);
      int columnIx = 0;

      try {
         int e = resolveIndexArg(arg1, srcRowIndex, srcColumnIndex);
         if(!reference.isColumn()) {
            if(!reference.isRow()) {
               return ErrorEval.REF_INVALID;
            }

            columnIx = e;
            e = 0;
         }

         return getValueFromArea(reference, e, columnIx);
      } catch (EvaluationException var8) {
         return var8.getErrorEval();
      }
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2) {
      TwoDEval reference = convertFirstArg(arg0);

      try {
         int e = resolveIndexArg(arg2, srcRowIndex, srcColumnIndex);
         int rowIx = resolveIndexArg(arg1, srcRowIndex, srcColumnIndex);
         return getValueFromArea(reference, rowIx, e);
      } catch (EvaluationException var9) {
         return var9.getErrorEval();
      }
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1, ValueEval arg2, ValueEval arg3) {
      throw new RuntimeException("Incomplete code - don\'t know how to support the \'area_num\' parameter yet)");
   }

   private static TwoDEval convertFirstArg(ValueEval arg0) {
      if(arg0 instanceof RefEval) {
         return ((RefEval)arg0).offset(0, 0, 0, 0);
      } else if(arg0 instanceof TwoDEval) {
         return (TwoDEval)arg0;
      } else {
         throw new RuntimeException("Incomplete code - cannot handle first arg of type (" + arg0.getClass().getName() + ")");
      }
   }

   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      switch(args.length) {
      case 2:
         return this.evaluate(srcRowIndex, srcColumnIndex, args[0], args[1]);
      case 3:
         return this.evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);
      case 4:
         return this.evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2], args[3]);
      default:
         return ErrorEval.VALUE_INVALID;
      }
   }

   private static ValueEval getValueFromArea(TwoDEval ae, int pRowIx, int pColumnIx) throws EvaluationException {
      assert pRowIx >= 0;

      assert pColumnIx >= 0;

      TwoDEval result = ae;
      if(pRowIx != 0) {
         if(pRowIx > ae.getHeight()) {
            throw new EvaluationException(ErrorEval.REF_INVALID);
         }

         result = ae.getRow(pRowIx - 1);
      }

      if(pColumnIx != 0) {
         if(pColumnIx > ae.getWidth()) {
            throw new EvaluationException(ErrorEval.REF_INVALID);
         }

         result = result.getColumn(pColumnIx - 1);
      }

      return result;
   }

   private static int resolveIndexArg(ValueEval arg, int srcCellRow, int srcCellCol) throws EvaluationException {
      ValueEval ev = OperandResolver.getSingleValue(arg, srcCellRow, srcCellCol);
      if(ev == MissingArgEval.instance) {
         return 0;
      } else if(ev == BlankEval.instance) {
         return 0;
      } else {
         int result = OperandResolver.coerceValueToInt(ev);
         if(result < 0) {
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
         } else {
            return result;
         }
      }
   }

}
