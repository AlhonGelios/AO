package org.apache.poi.ss.formula.eval;

import org.apache.poi.ss.formula.eval.ValueEval;

public final class FunctionNameEval implements ValueEval {

   private final String _functionName;


   public FunctionNameEval(String functionName) {
      this._functionName = functionName;
   }

   public String getFunctionName() {
      return this._functionName;
   }

   public String toString() {
      StringBuffer sb = new StringBuffer(64);
      sb.append(this.getClass().getName()).append(" [");
      sb.append(this._functionName);
      sb.append("]");
      return sb.toString();
   }
}
