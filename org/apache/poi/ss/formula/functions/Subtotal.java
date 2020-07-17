package org.apache.poi.ss.formula.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.poi.ss.formula.LazyRefEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NotImplementedException;
import org.apache.poi.ss.formula.eval.NotImplementedFunctionException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.AggregateFunction;
import org.apache.poi.ss.formula.functions.Count;
import org.apache.poi.ss.formula.functions.Counta;
import org.apache.poi.ss.formula.functions.Function;

public class Subtotal implements Function {

   private static Function findFunction(int functionCode) throws EvaluationException {
      switch(functionCode) {
      case 1:
         return AggregateFunction.subtotalInstance(AggregateFunction.AVERAGE);
      case 2:
         return Count.subtotalInstance();
      case 3:
         return Counta.subtotalInstance();
      case 4:
         return AggregateFunction.subtotalInstance(AggregateFunction.MAX);
      case 5:
         return AggregateFunction.subtotalInstance(AggregateFunction.MIN);
      case 6:
         return AggregateFunction.subtotalInstance(AggregateFunction.PRODUCT);
      case 7:
         return AggregateFunction.subtotalInstance(AggregateFunction.STDEV);
      case 8:
         throw new NotImplementedFunctionException("STDEVP");
      case 9:
         return AggregateFunction.subtotalInstance(AggregateFunction.SUM);
      case 10:
         throw new NotImplementedFunctionException("VAR");
      case 11:
         throw new NotImplementedFunctionException("VARP");
      default:
         if(functionCode > 100 && functionCode < 112) {
            throw new NotImplementedException("SUBTOTAL - with \'exclude hidden values\' option");
         } else {
            throw EvaluationException.invalidValue();
         }
      }
   }

   public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      int nInnerArgs = args.length - 1;
      if(nInnerArgs < 1) {
         return ErrorEval.VALUE_INVALID;
      } else {
         Function innerFunc;
         try {
            ValueEval list = OperandResolver.getSingleValue(args[0], srcRowIndex, srcColumnIndex);
            int it = OperandResolver.coerceValueToInt(list);
            innerFunc = findFunction(it);
         } catch (EvaluationException var10) {
            return var10.getErrorEval();
         }

         ArrayList list1 = new ArrayList(Arrays.asList(args).subList(1, args.length));
         Iterator it1 = list1.iterator();

         while(it1.hasNext()) {
            ValueEval eval = (ValueEval)it1.next();
            if(eval instanceof LazyRefEval) {
               LazyRefEval lazyRefEval = (LazyRefEval)eval;
               if(lazyRefEval.isSubTotal()) {
                  it1.remove();
               }
            }
         }

         return innerFunc.evaluate((ValueEval[])list1.toArray(new ValueEval[list1.size()]), srcRowIndex, srcColumnIndex);
      }
   }
}
