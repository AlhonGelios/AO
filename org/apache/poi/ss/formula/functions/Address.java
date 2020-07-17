package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.MissingArgEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.util.CellReference;

public class Address implements Function {

   public static final int REF_ABSOLUTE = 1;
   public static final int REF_ROW_ABSOLUTE_COLUMN_RELATIVE = 2;
   public static final int REF_ROW_RELATIVE_RELATIVE_ABSOLUTE = 3;
   public static final int REF_RELATIVE = 4;


   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      if(args.length >= 2 && args.length <= 5) {
         try {
            int row = (int)NumericFunction.singleOperandEvaluate(args[0], srcRowIndex, srcColumnIndex);
            int col = (int)NumericFunction.singleOperandEvaluate(args[1], srcRowIndex, srcColumnIndex);
            int refType;
            if(args.length > 2 && args[2] != MissingArgEval.instance) {
               refType = (int)NumericFunction.singleOperandEvaluate(args[2], srcRowIndex, srcColumnIndex);
            } else {
               refType = 1;
            }

            boolean e;
            boolean pAbsCol;
            switch(refType) {
            case 1:
               e = true;
               pAbsCol = true;
               break;
            case 2:
               e = true;
               pAbsCol = false;
               break;
            case 3:
               e = false;
               pAbsCol = true;
               break;
            case 4:
               e = false;
               pAbsCol = false;
               break;
            default:
               throw new EvaluationException(ErrorEval.VALUE_INVALID);
            }

            String sheetName;
            if(args.length == 5) {
               ValueEval ref = OperandResolver.getSingleValue(args[4], srcRowIndex, srcColumnIndex);
               sheetName = ref == MissingArgEval.instance?null:OperandResolver.coerceValueToString(ref);
            } else {
               sheetName = null;
            }

            CellReference ref1 = new CellReference(row - 1, col - 1, e, pAbsCol);
            StringBuffer sb = new StringBuffer(32);
            if(sheetName != null) {
               SheetNameFormatter.appendFormat(sb, sheetName);
               sb.append('!');
            }

            sb.append(ref1.formatAsString());
            return new StringEval(sb.toString());
         } catch (EvaluationException var12) {
            return var12.getErrorEval();
         }
      } else {
         return ErrorEval.VALUE_INVALID;
      }
   }
}
