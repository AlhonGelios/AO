package org.apache.poi.ss.formula.functions;

import org.apache.poi.ss.formula.eval.AreaEval;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.NotImplementedException;
import org.apache.poi.ss.formula.eval.NumericValueEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.StringValueEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.DGet;
import org.apache.poi.ss.formula.functions.DMin;
import org.apache.poi.ss.formula.functions.Function3Arg;
import org.apache.poi.ss.formula.functions.IDStarAlgorithm;
import org.apache.poi.ss.util.NumberComparer;

public final class DStarRunner implements Function3Arg {

   private final DStarRunner.DStarAlgorithmEnum algoType;


   public DStarRunner(DStarRunner.DStarAlgorithmEnum algorithm) {
      this.algoType = algorithm;
   }

   public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
      return (ValueEval)(args.length == 3?this.evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]):ErrorEval.VALUE_INVALID);
   }

   public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval database, ValueEval filterColumn, ValueEval conditionDatabase) {
      if(database instanceof AreaEval && conditionDatabase instanceof AreaEval) {
         AreaEval db = (AreaEval)database;
         AreaEval cdb = (AreaEval)conditionDatabase;

         try {
            filterColumn = OperandResolver.getSingleValue(filterColumn, srcRowIndex, srcColumnIndex);
         } catch (EvaluationException var17) {
            return var17.getErrorEval();
         }

         int fc;
         try {
            fc = getColumnForName(filterColumn, db);
         } catch (EvaluationException var16) {
            return ErrorEval.VALUE_INVALID;
         }

         if(fc == -1) {
            return ErrorEval.VALUE_INVALID;
         } else {
            Object algorithm = null;
            switch(DStarRunner.NamelessClass1881427439.$SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$DStarAlgorithmEnum[this.algoType.ordinal()]) {
            case 1:
               algorithm = new DGet();
               break;
            case 2:
               algorithm = new DMin();
               break;
            default:
               throw new IllegalStateException("Unexpected algorithm type " + this.algoType + " encountered.");
            }

            int height = db.getHeight();

            for(int row = 1; row < height; ++row) {
               boolean matches = true;

               try {
                  matches = fullfillsConditions(db, row, cdb);
               } catch (EvaluationException var15) {
                  return ErrorEval.VALUE_INVALID;
               }

               if(matches) {
                  ValueEval currentValueEval = resolveReference(db, row, fc);
                  boolean shouldContinue = ((IDStarAlgorithm)algorithm).processMatch(currentValueEval);
                  if(!shouldContinue) {
                     break;
                  }
               }
            }

            return ((IDStarAlgorithm)algorithm).getResult();
         }
      } else {
         return ErrorEval.VALUE_INVALID;
      }
   }

   private static int getColumnForName(ValueEval nameValueEval, AreaEval db) throws EvaluationException {
      String name = OperandResolver.coerceValueToString(nameValueEval);
      return getColumnForString(db, name);
   }

   private static int getColumnForString(AreaEval db, String name) throws EvaluationException {
      int resultColumn = -1;
      int width = db.getWidth();

      for(int column = 0; column < width; ++column) {
         ValueEval columnNameValueEval = resolveReference(db, 0, column);
         if(!(columnNameValueEval instanceof BlankEval) && !(columnNameValueEval instanceof ErrorEval)) {
            String columnName = OperandResolver.coerceValueToString(columnNameValueEval);
            if(name.equals(columnName)) {
               resultColumn = column;
               break;
            }
         }
      }

      return resultColumn;
   }

   private static boolean fullfillsConditions(AreaEval db, int row, AreaEval cdb) throws EvaluationException {
      int height = cdb.getHeight();
      int conditionRow = 1;

      while(conditionRow < height) {
         boolean matches = true;
         int width = cdb.getWidth();
         int column = 0;

         while(true) {
            if(column < width) {
               label44: {
                  boolean columnCondition = true;
                  ValueEval condition = null;
                  condition = resolveReference(cdb, conditionRow, column);
                  if(!(condition instanceof BlankEval)) {
                     ValueEval targetHeader = resolveReference(cdb, 0, column);
                     if(!(targetHeader instanceof StringValueEval)) {
                        throw new EvaluationException(ErrorEval.VALUE_INVALID);
                     }

                     if(getColumnForName(targetHeader, db) == -1) {
                        columnCondition = false;
                     }

                     if(!columnCondition) {
                        if(OperandResolver.coerceValueToString(condition).isEmpty()) {
                           throw new EvaluationException(ErrorEval.VALUE_INVALID);
                        }

                        throw new NotImplementedException("D* function with formula conditions");
                     }

                     ValueEval value = resolveReference(db, row, getColumnForName(targetHeader, db));
                     if(!testNormalCondition(value, condition)) {
                        matches = false;
                        break label44;
                     }
                  }

                  ++column;
                  continue;
               }
            }

            if(matches) {
               return true;
            }

            ++conditionRow;
            break;
         }
      }

      return false;
   }

   private static boolean testNormalCondition(ValueEval value, ValueEval condition) throws EvaluationException {
      if(condition instanceof StringEval) {
         String conditionNumber1 = ((StringEval)condition).getStringValue();
         String valueString;
         if(conditionNumber1.startsWith("<")) {
            valueString = conditionNumber1.substring(1);
            if(valueString.startsWith("=")) {
               valueString = valueString.substring(1);
               return testNumericCondition(value, DStarRunner.operator.smallerEqualThan, valueString);
            } else {
               return testNumericCondition(value, DStarRunner.operator.smallerThan, valueString);
            }
         } else if(conditionNumber1.startsWith(">")) {
            valueString = conditionNumber1.substring(1);
            if(valueString.startsWith("=")) {
               valueString = valueString.substring(1);
               return testNumericCondition(value, DStarRunner.operator.largerEqualThan, valueString);
            } else {
               return testNumericCondition(value, DStarRunner.operator.largerThan, valueString);
            }
         } else if(conditionNumber1.startsWith("=")) {
            valueString = conditionNumber1.substring(1);
            if(valueString.isEmpty()) {
               return value instanceof BlankEval;
            } else {
               boolean valueNumber1 = false;

               try {
                  Integer.parseInt(valueString);
                  valueNumber1 = true;
               } catch (NumberFormatException var8) {
                  try {
                     Double.parseDouble(valueString);
                     valueNumber1 = true;
                  } catch (NumberFormatException var7) {
                     valueNumber1 = false;
                  }
               }

               if(valueNumber1) {
                  return testNumericCondition(value, DStarRunner.operator.equal, valueString);
               } else {
                  String valueString1 = value instanceof BlankEval?"":OperandResolver.coerceValueToString(value);
                  return valueString.equals(valueString1);
               }
            }
         } else if(conditionNumber1.isEmpty()) {
            return value instanceof StringEval;
         } else {
            valueString = value instanceof BlankEval?"":OperandResolver.coerceValueToString(value);
            return valueString.startsWith(conditionNumber1);
         }
      } else if(condition instanceof NumericValueEval) {
         double conditionNumber = ((NumericValueEval)condition).getNumberValue();
         Double valueNumber = getNumberFromValueEval(value);
         return valueNumber == null?false:conditionNumber == valueNumber.doubleValue();
      } else {
         return condition instanceof ErrorEval?(value instanceof ErrorEval?((ErrorEval)condition).getErrorCode() == ((ErrorEval)value).getErrorCode():false):false;
      }
   }

   private static boolean testNumericCondition(ValueEval valueEval, DStarRunner.operator op, String condition) throws EvaluationException {
      if(!(valueEval instanceof NumericValueEval)) {
         return false;
      } else {
         double value = ((NumericValueEval)valueEval).getNumberValue();
         double conditionValue = 0.0D;

         int result;
         try {
            result = Integer.parseInt(condition);
            conditionValue = (double)result;
         } catch (NumberFormatException var10) {
            try {
               conditionValue = Double.parseDouble(condition);
            } catch (NumberFormatException var9) {
               throw new EvaluationException(ErrorEval.VALUE_INVALID);
            }
         }

         result = NumberComparer.compare(value, conditionValue);
         switch(DStarRunner.NamelessClass1881427439.$SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$operator[op.ordinal()]) {
         case 1:
            return result > 0;
         case 2:
            return result >= 0;
         case 3:
            return result < 0;
         case 4:
            return result <= 0;
         case 5:
            return result == 0;
         default:
            return false;
         }
      }
   }

   private static Double getNumberFromValueEval(ValueEval value) {
      if(value instanceof NumericValueEval) {
         return Double.valueOf(((NumericValueEval)value).getNumberValue());
      } else if(value instanceof StringValueEval) {
         String stringValue = ((StringValueEval)value).getStringValue();

         try {
            return Double.valueOf(Double.parseDouble(stringValue));
         } catch (NumberFormatException var3) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static ValueEval resolveReference(AreaEval db, int dbRow, int dbCol) {
      try {
         return OperandResolver.getSingleValue(db.getValue(dbRow, dbCol), db.getFirstRow() + dbRow, db.getFirstColumn() + dbCol);
      } catch (EvaluationException var4) {
         return var4.getErrorEval();
      }
   }

   public static enum DStarAlgorithmEnum {

      DGET("DGET", 0),
      DMIN("DMIN", 1);
      // $FF: synthetic field
      private static final DStarRunner.DStarAlgorithmEnum[] $VALUES = new DStarRunner.DStarAlgorithmEnum[]{DGET, DMIN};


      private DStarAlgorithmEnum(String var1, int var2) {}

   }

   private static enum operator {

      largerThan("largerThan", 0),
      largerEqualThan("largerEqualThan", 1),
      smallerThan("smallerThan", 2),
      smallerEqualThan("smallerEqualThan", 3),
      equal("equal", 4);
      // $FF: synthetic field
      private static final DStarRunner.operator[] $VALUES = new DStarRunner.operator[]{largerThan, largerEqualThan, smallerThan, smallerEqualThan, equal};


      private operator(String var1, int var2) {}

   }

   // $FF: synthetic class
   static class NamelessClass1881427439 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$DStarAlgorithmEnum;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$operator = new int[DStarRunner.operator.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$operator[DStarRunner.operator.largerThan.ordinal()] = 1;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$operator[DStarRunner.operator.largerEqualThan.ordinal()] = 2;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$operator[DStarRunner.operator.smallerThan.ordinal()] = 3;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$operator[DStarRunner.operator.smallerEqualThan.ordinal()] = 4;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$operator[DStarRunner.operator.equal.ordinal()] = 5;
         } catch (NoSuchFieldError var3) {
            ;
         }

         $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$DStarAlgorithmEnum = new int[DStarRunner.DStarAlgorithmEnum.values().length];

         try {
            $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$DStarAlgorithmEnum[DStarRunner.DStarAlgorithmEnum.DGET.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$formula$functions$DStarRunner$DStarAlgorithmEnum[DStarRunner.DStarAlgorithmEnum.DMIN.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
