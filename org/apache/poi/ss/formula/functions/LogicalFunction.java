package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.RefEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;
import org.apache.poi.ss.formula.functions.Function;

public abstract class LogicalFunction extends Fixed1ArgFunction {

   public static final Function ISLOGICAL = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return arg instanceof BoolEval;
      }
   };
   public static final Function ISNONTEXT = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return !(arg instanceof StringEval);
      }
   };
   public static final Function ISNUMBER = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return arg instanceof NumberEval;
      }
   };
   public static final Function ISTEXT = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return arg instanceof StringEval;
      }
   };
   public static final Function ISBLANK = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return arg instanceof BlankEval;
      }
   };
   public static final Function ISERROR = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return arg instanceof ErrorEval;
      }
   };
   public static final Function ISERR = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return arg instanceof ErrorEval?arg != ErrorEval.NA:false;
      }
   };
   public static final Function ISNA = new LogicalFunction() {
      protected boolean evaluate(ValueEval arg) {
         return arg == ErrorEval.NA;
      }
   };
   public static final Function ISREF = new Fixed1ArgFunction() {
      public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
         return !(arg0 instanceof RefEval) && !(arg0 instanceof AreaEval)?BoolEval.FALSE:BoolEval.TRUE;
      }
   };


   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
      Object ve;
      try {
         ve = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
      } catch (EvaluationException var6) {
         ve = var6.getErrorEval();
      }

      return BoolEval.valueOf(this.evaluate((ValueEval)ve));
   }

   protected abstract boolean evaluate(ValueEval var1);

}
