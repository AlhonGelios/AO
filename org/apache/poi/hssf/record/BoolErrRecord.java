package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.CellRecord;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class BoolErrRecord extends CellRecord implements Cloneable {

   public static final short sid = 517;
   private int _value;
   private boolean _isError;


   public BoolErrRecord() {}

   public BoolErrRecord(RecordInputStream in) {
      super(in);
      switch(in.remaining()) {
      case 2:
         this._value = in.readByte();
         break;
      case 3:
         this._value = in.readUShort();
         break;
      default:
         throw new RecordFormatException("Unexpected size (" + in.remaining() + ") for BOOLERR record.");
      }

      int flag = in.readUByte();
      switch(flag) {
      case 0:
         this._isError = false;
         break;
      case 1:
         this._isError = true;
         break;
      default:
         throw new RecordFormatException("Unexpected isError flag (" + flag + ") for BOOLERR record.");
      }

   }

   public void setValue(boolean value) {
      this._value = value?1:0;
      this._isError = false;
   }

   public void setValue(byte value) {
      this.setValue(FormulaError.forInt(value));
   }

   public void setValue(FormulaError value) {
      switch(BoolErrRecord.NamelessClass1910020142.$SwitchMap$org$apache$poi$ss$usermodel$FormulaError[value.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
         this._value = value.getCode();
         this._isError = true;
         return;
      default:
         throw new IllegalArgumentException("Error Value can only be 0,7,15,23,29,36 or 42. It cannot be " + value.getCode() + " (" + value + ")");
      }
   }

   public boolean getBooleanValue() {
      return this._value != 0;
   }

   public byte getErrorValue() {
      return (byte)this._value;
   }

   public boolean isBoolean() {
      return !this._isError;
   }

   public boolean isError() {
      return this._isError;
   }

   protected String getRecordName() {
      return "BOOLERR";
   }

   protected void appendValueText(StringBuilder sb) {
      if(this.isBoolean()) {
         sb.append("  .boolVal = ");
         sb.append(this.getBooleanValue());
      } else {
         sb.append("  .errCode = ");
         sb.append(FormulaError.forInt(this.getErrorValue()).getString());
         sb.append(" (").append(HexDump.byteToHex(this.getErrorValue())).append(")");
      }

   }

   protected void serializeValue(LittleEndianOutput out) {
      out.writeByte(this._value);
      out.writeByte(this._isError?1:0);
   }

   protected int getValueDataSize() {
      return 2;
   }

   public short getSid() {
      return (short)517;
   }

   public BoolErrRecord clone() {
      BoolErrRecord rec = new BoolErrRecord();
      this.copyBaseFields(rec);
      rec._value = this._value;
      rec._isError = this._isError;
      return rec;
   }

   // $FF: synthetic class
   static class NamelessClass1910020142 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$FormulaError = new int[FormulaError.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NULL.ordinal()] = 1;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.DIV0.ordinal()] = 2;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.VALUE.ordinal()] = 3;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.REF.ordinal()] = 4;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NAME.ordinal()] = 5;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NUM.ordinal()] = 6;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FormulaError[FormulaError.NA.ordinal()] = 7;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
