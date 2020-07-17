package org.apache.poi.ss.formula;

import java.util.Stack;
import org.apache.poi.ss.formula.FormulaRenderingWorkbook;
import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.formula.ptg.AttrPtg;
import org.apache.poi.ss.formula.ptg.MemAreaPtg;
import org.apache.poi.ss.formula.ptg.MemErrPtg;
import org.apache.poi.ss.formula.ptg.MemFuncPtg;
import org.apache.poi.ss.formula.ptg.OperationPtg;
import org.apache.poi.ss.formula.ptg.ParenthesisPtg;
import org.apache.poi.ss.formula.ptg.Ptg;

public class FormulaRenderer {

   public static String toFormulaString(FormulaRenderingWorkbook book, Ptg[] ptgs) {
      if(ptgs != null && ptgs.length != 0) {
         Stack stack = new Stack();
         Ptg[] result = ptgs;
         int len$ = ptgs.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Ptg ptg = result[i$];
            if(!(ptg instanceof MemAreaPtg) && !(ptg instanceof MemFuncPtg) && !(ptg instanceof MemErrPtg)) {
               if(ptg instanceof ParenthesisPtg) {
                  String o = (String)stack.pop();
                  stack.push("(" + o + ")");
               } else {
                  String[] operands;
                  if(ptg instanceof AttrPtg) {
                     AttrPtg var10 = (AttrPtg)ptg;
                     if(!var10.isOptimizedIf() && !var10.isOptimizedChoose() && !var10.isSkip() && !var10.isSpace() && !var10.isSemiVolatile()) {
                        if(!var10.isSum()) {
                           throw new RuntimeException("Unexpected tAttr: " + var10.toString());
                        }

                        operands = getOperands(stack, var10.getNumberOfOperands());
                        stack.push(var10.toFormulaString(operands));
                     }
                  } else if(ptg instanceof WorkbookDependentFormula) {
                     WorkbookDependentFormula var11 = (WorkbookDependentFormula)ptg;
                     stack.push(var11.toFormulaString(book));
                  } else if(!(ptg instanceof OperationPtg)) {
                     stack.push(ptg.toFormulaString());
                  } else {
                     OperationPtg var12 = (OperationPtg)ptg;
                     operands = getOperands(stack, var12.getNumberOfOperands());
                     stack.push(var12.toFormulaString(operands));
                  }
               }
            }
         }

         if(stack.isEmpty()) {
            throw new IllegalStateException("Stack underflow");
         } else {
            String var9 = (String)stack.pop();
            if(!stack.isEmpty()) {
               throw new IllegalStateException("too much stuff left on the stack");
            } else {
               return var9;
            }
         }
      } else {
         throw new IllegalArgumentException("ptgs must not be null");
      }
   }

   private static String[] getOperands(Stack stack, int nOperands) {
      String[] operands = new String[nOperands];

      for(int j = nOperands - 1; j >= 0; --j) {
         if(stack.isEmpty()) {
            String msg = "Too few arguments supplied to operation. Expected (" + nOperands + ") operands but got (" + (nOperands - j - 1) + ")";
            throw new IllegalStateException(msg);
         }

         operands[j] = (String)stack.pop();
      }

      return operands;
   }
}
