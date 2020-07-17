package org.apache.poi.ss.formula;

import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ParseNode;
import org.apache.poi.ss.formula.ptg.AbstractFunctionPtg;
import org.apache.poi.ss.formula.ptg.AttrPtg;
import org.apache.poi.ss.formula.ptg.ControlPtg;
import org.apache.poi.ss.formula.ptg.FuncVarPtg;
import org.apache.poi.ss.formula.ptg.IntersectionPtg;
import org.apache.poi.ss.formula.ptg.MemAreaPtg;
import org.apache.poi.ss.formula.ptg.MemFuncPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.RangePtg;
import org.apache.poi.ss.formula.ptg.UnionPtg;
import org.apache.poi.ss.formula.ptg.ValueOperatorPtg;
import org.apache.poi.util.Removal;

final class OperandClassTransformer {

   private final FormulaType _formulaType;


   @Removal(
      version = "3.17"
   )
   public OperandClassTransformer(int formulaType) {
      this(FormulaType.forInt(formulaType));
   }

   public OperandClassTransformer(FormulaType formulaType) {
      this._formulaType = formulaType;
   }

   public void transformFormula(ParseNode rootNode) {
      byte rootNodeOperandClass;
      switch(OperandClassTransformer.NamelessClass1786577979.$SwitchMap$org$apache$poi$ss$formula$FormulaType[this._formulaType.ordinal()]) {
      case 1:
         rootNodeOperandClass = 32;
         break;
      case 2:
         rootNodeOperandClass = 64;
         break;
      case 3:
      case 4:
         rootNodeOperandClass = 0;
         break;
      default:
         throw new RuntimeException("Incomplete code - formula type (" + this._formulaType + ") not supported yet");
      }

      this.transformNode(rootNode, rootNodeOperandClass, false);
   }

   private void transformNode(ParseNode node, byte desiredOperandClass, boolean callerForceArrayFlag) {
      Object token = node.getToken();
      ParseNode[] children = node.getChildren();
      boolean isSimpleValueFunc = isSimpleValueFunction((Ptg)token);
      int i;
      if(isSimpleValueFunc) {
         boolean var9 = desiredOperandClass == 64;

         for(i = 0; i < children.length; ++i) {
            this.transformNode(children[i], desiredOperandClass, var9);
         }

         this.setSimpleValueFuncClass((AbstractFunctionPtg)token, desiredOperandClass, callerForceArrayFlag);
      } else {
         if(isSingleArgSum((Ptg)token)) {
            token = FuncVarPtg.SUM;
         }

         if(!(token instanceof ValueOperatorPtg) && !(token instanceof ControlPtg) && !(token instanceof MemFuncPtg) && !(token instanceof MemAreaPtg) && !(token instanceof UnionPtg) && !(token instanceof IntersectionPtg)) {
            if(token instanceof AbstractFunctionPtg) {
               this.transformFunctionNode((AbstractFunctionPtg)token, children, desiredOperandClass, callerForceArrayFlag);
            } else if(children.length > 0) {
               if(token != RangePtg.instance) {
                  throw new IllegalStateException("Node should not have any children");
               }
            } else if(!((Ptg)token).isBaseToken()) {
               ((Ptg)token).setClass(this.transformClass(((Ptg)token).getPtgClass(), desiredOperandClass, callerForceArrayFlag));
            }
         } else {
            byte localDesiredOperandClass = desiredOperandClass == 0?32:desiredOperandClass;

            for(i = 0; i < children.length; ++i) {
               this.transformNode(children[i], localDesiredOperandClass, callerForceArrayFlag);
            }

         }
      }
   }

   private static boolean isSingleArgSum(Ptg token) {
      if(token instanceof AttrPtg) {
         AttrPtg attrPtg = (AttrPtg)token;
         return attrPtg.isSum();
      } else {
         return false;
      }
   }

   private static boolean isSimpleValueFunction(Ptg token) {
      if(token instanceof AbstractFunctionPtg) {
         AbstractFunctionPtg aptg = (AbstractFunctionPtg)token;
         if(aptg.getDefaultOperandClass() != 32) {
            return false;
         } else {
            int numberOfOperands = aptg.getNumberOfOperands();

            for(int i = numberOfOperands - 1; i >= 0; --i) {
               if(aptg.getParameterClass(i) != 32) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private byte transformClass(byte currentOperandClass, byte desiredOperandClass, boolean callerForceArrayFlag) {
      switch(desiredOperandClass) {
      case 0:
         if(!callerForceArrayFlag) {
            return currentOperandClass;
         }

         return (byte)0;
      case 32:
         if(!callerForceArrayFlag) {
            return (byte)32;
         }
      case 64:
         return (byte)64;
      default:
         throw new IllegalStateException("Unexpected operand class (" + desiredOperandClass + ")");
      }
   }

   private void transformFunctionNode(AbstractFunctionPtg afp, ParseNode[] children, byte desiredOperandClass, boolean callerForceArrayFlag) {
      byte defaultReturnOperandClass = afp.getDefaultOperandClass();
      boolean localForceArrayFlag;
      if(callerForceArrayFlag) {
         switch(defaultReturnOperandClass) {
         case 0:
            if(desiredOperandClass == 0) {
               afp.setClass((byte)0);
            } else {
               afp.setClass((byte)64);
            }

            localForceArrayFlag = false;
            break;
         case 32:
            afp.setClass((byte)64);
            localForceArrayFlag = true;
            break;
         case 64:
            afp.setClass((byte)64);
            localForceArrayFlag = false;
            break;
         default:
            throw new IllegalStateException("Unexpected operand class (" + defaultReturnOperandClass + ")");
         }
      } else if(defaultReturnOperandClass == desiredOperandClass) {
         localForceArrayFlag = false;
         afp.setClass(defaultReturnOperandClass);
      } else {
         switch(desiredOperandClass) {
         case 0:
            switch(defaultReturnOperandClass) {
            case 32:
               afp.setClass((byte)32);
               break;
            case 64:
               afp.setClass((byte)64);
               break;
            default:
               throw new IllegalStateException("Unexpected operand class (" + defaultReturnOperandClass + ")");
            }

            localForceArrayFlag = false;
            break;
         case 32:
            afp.setClass((byte)32);
            localForceArrayFlag = false;
            break;
         case 64:
            switch(defaultReturnOperandClass) {
            case 0:
               afp.setClass((byte)0);
               break;
            case 32:
               afp.setClass((byte)64);
               break;
            default:
               throw new IllegalStateException("Unexpected operand class (" + defaultReturnOperandClass + ")");
            }

            localForceArrayFlag = defaultReturnOperandClass == 32;
            break;
         default:
            throw new IllegalStateException("Unexpected operand class (" + desiredOperandClass + ")");
         }
      }

      for(int i = 0; i < children.length; ++i) {
         ParseNode child = children[i];
         byte paramOperandClass = afp.getParameterClass(i);
         this.transformNode(child, paramOperandClass, localForceArrayFlag);
      }

   }

   private void setSimpleValueFuncClass(AbstractFunctionPtg afp, byte desiredOperandClass, boolean callerForceArrayFlag) {
      if(!callerForceArrayFlag && desiredOperandClass != 64) {
         afp.setClass((byte)32);
      } else {
         afp.setClass((byte)64);
      }

   }

   // $FF: synthetic class
   static class NamelessClass1786577979 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$formula$FormulaType = new int[FormulaType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$formula$FormulaType[FormulaType.CELL.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$FormulaType[FormulaType.ARRAY.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$FormulaType[FormulaType.NAMEDRANGE.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$FormulaType[FormulaType.DATAVALIDATION_LIST.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
