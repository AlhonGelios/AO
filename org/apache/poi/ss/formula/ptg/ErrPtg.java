package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.ptg.ScalarConstantPtg;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;

public final class ErrPtg extends ScalarConstantPtg {

   public static final ErrPtg NULL_INTERSECTION = new ErrPtg(FormulaError.NULL.getCode());
   public static final ErrPtg DIV_ZERO = new ErrPtg(FormulaError.DIV0.getCode());
   public static final ErrPtg VALUE_INVALID = new ErrPtg(FormulaError.VALUE.getCode());
   public static final ErrPtg REF_INVALID = new ErrPtg(FormulaError.REF.getCode());
   public static final ErrPtg NAME_INVALID = new ErrPtg(FormulaError.NAME.getCode());
   public static final ErrPtg NUM_ERROR = new ErrPtg(FormulaError.NUM.getCode());
   public static final ErrPtg N_A = new ErrPtg(FormulaError.NA.getCode());
   public static final short sid = 28;
   private static final int SIZE = 2;
   private final int field_1_error_code;


   private ErrPtg(int errorCode) {
      if(!FormulaError.isValidCode(errorCode)) {
         throw new IllegalArgumentException("Invalid error code (" + errorCode + ")");
      } else {
         this.field_1_error_code = errorCode;
      }
   }

   public static ErrPtg read(LittleEndianInput in) {
      return valueOf(in.readByte());
   }

   public void write(LittleEndianOutput out) {
      out.writeByte(28 + this.getPtgClass());
      out.writeByte(this.field_1_error_code);
   }

   public String toFormulaString() {
      return FormulaError.forInt(this.field_1_error_code).getString();
   }

   public int getSize() {
      return 2;
   }

   public int getErrorCode() {
      return this.field_1_error_code;
   }

   public static ErrPtg valueOf(int code) {
      switch(ErrPtg.NamelessClass1529983936.$SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.forInt(code).ordinal()]) {
      case 1:
         return DIV_ZERO;
      case 2:
         return N_A;
      case 3:
         return NAME_INVALID;
      case 4:
         return NULL_INTERSECTION;
      case 5:
         return NUM_ERROR;
      case 6:
         return REF_INVALID;
      case 7:
         return VALUE_INVALID;
      default:
         throw new RuntimeException("Unexpected error code (" + code + ")");
      }
   }


   // $FF: synthetic class
   static class NamelessClass1529983936 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$FormulaError = new int[FormulaError.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.DIV0.ordinal()] = 1;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NA.ordinal()] = 2;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NAME.ordinal()] = 3;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NULL.ordinal()] = 4;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NUM.ordinal()] = 5;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.REF.ordinal()] = 6;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.VALUE.ordinal()] = 7;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
