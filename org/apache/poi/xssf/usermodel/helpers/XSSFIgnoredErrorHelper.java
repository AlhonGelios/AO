package org.apache.poi.xssf.usermodel.helpers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.poi.ss.usermodel.IgnoredErrorType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError;

public class XSSFIgnoredErrorHelper {

   public static boolean isSet(IgnoredErrorType errorType, CTIgnoredError error) {
      switch(XSSFIgnoredErrorHelper.NamelessClass2057459927.$SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[errorType.ordinal()]) {
      case 1:
         return error.isSetCalculatedColumn();
      case 2:
         return error.isSetEmptyCellReference();
      case 3:
         return error.isSetEvalError();
      case 4:
         return error.isSetFormula();
      case 5:
         return error.isSetFormulaRange();
      case 6:
         return error.isSetListDataValidation();
      case 7:
         return error.isSetNumberStoredAsText();
      case 8:
         return error.isSetTwoDigitTextYear();
      case 9:
         return error.isSetUnlockedFormula();
      default:
         throw new IllegalStateException();
      }
   }

   public static void set(IgnoredErrorType errorType, CTIgnoredError error) {
      switch(XSSFIgnoredErrorHelper.NamelessClass2057459927.$SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[errorType.ordinal()]) {
      case 1:
         error.setCalculatedColumn(true);
         break;
      case 2:
         error.setEmptyCellReference(true);
         break;
      case 3:
         error.setEvalError(true);
         break;
      case 4:
         error.setFormula(true);
         break;
      case 5:
         error.setFormulaRange(true);
         break;
      case 6:
         error.setListDataValidation(true);
         break;
      case 7:
         error.setNumberStoredAsText(true);
         break;
      case 8:
         error.setTwoDigitTextYear(true);
         break;
      case 9:
         error.setUnlockedFormula(true);
         break;
      default:
         throw new IllegalStateException();
      }

   }

   public static void addIgnoredErrors(CTIgnoredError err, String ref, IgnoredErrorType ... ignoredErrorTypes) {
      err.setSqref(Arrays.asList(new String[]{ref}));
      IgnoredErrorType[] arr$ = ignoredErrorTypes;
      int len$ = ignoredErrorTypes.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         IgnoredErrorType errType = arr$[i$];
         set(errType, err);
      }

   }

   public static Set getErrorTypes(CTIgnoredError err) {
      LinkedHashSet result = new LinkedHashSet();
      IgnoredErrorType[] arr$ = IgnoredErrorType.values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         IgnoredErrorType errType = arr$[i$];
         if(isSet(errType, err)) {
            result.add(errType);
         }
      }

      return result;
   }

   // $FF: synthetic class
   static class NamelessClass2057459927 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType = new int[IgnoredErrorType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.CALCULATED_COLUMN.ordinal()] = 1;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.EMPTY_CELL_REFERENCE.ordinal()] = 2;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.EVALUATION_ERROR.ordinal()] = 3;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.FORMULA.ordinal()] = 4;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.FORMULA_RANGE.ordinal()] = 5;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.LIST_DATA_VALIDATION.ordinal()] = 6;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.NUMBER_STORED_AS_TEXT.ordinal()] = 7;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.TWO_DIGIT_TEXT_YEAR.ordinal()] = 8;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$IgnoredErrorType[IgnoredErrorType.UNLOCKED_FORMULA.ordinal()] = 9;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
