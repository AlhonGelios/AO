package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.formula.constant.ConstantValueParser;
import org.apache.poi.ss.formula.constant.ErrorConstant;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;

public final class ArrayPtg extends Ptg {

   public static final byte sid = 32;
   private static final int RESERVED_FIELD_LEN = 7;
   public static final int PLAIN_TOKEN_SIZE = 8;
   private final int _reserved0Int;
   private final int _reserved1Short;
   private final int _reserved2Byte;
   private final int _nColumns;
   private final int _nRows;
   private final Object[] _arrayValues;


   ArrayPtg(int reserved0, int reserved1, int reserved2, int nColumns, int nRows, Object[] arrayValues) {
      this._reserved0Int = reserved0;
      this._reserved1Short = reserved1;
      this._reserved2Byte = reserved2;
      this._nColumns = nColumns;
      this._nRows = nRows;
      this._arrayValues = (Object[])arrayValues.clone();
   }

   public ArrayPtg(Object[][] values2d) {
      int nColumns = values2d[0].length;
      int nRows = values2d.length;
      this._nColumns = (short)nColumns;
      this._nRows = (short)nRows;
      Object[] vv = new Object[this._nColumns * this._nRows];

      for(int r = 0; r < nRows; ++r) {
         Object[] rowData = values2d[r];

         for(int c = 0; c < nColumns; ++c) {
            vv[this.getValueIndex(c, r)] = rowData[c];
         }
      }

      this._arrayValues = vv;
      this._reserved0Int = 0;
      this._reserved1Short = 0;
      this._reserved2Byte = 0;
   }

   public Object[][] getTokenArrayValues() {
      if(this._arrayValues == null) {
         throw new IllegalStateException("array values not read yet");
      } else {
         Object[][] result = new Object[this._nRows][this._nColumns];

         for(int r = 0; r < this._nRows; ++r) {
            Object[] rowData = result[r];

            for(int c = 0; c < this._nColumns; ++c) {
               rowData[c] = this._arrayValues[this.getValueIndex(c, r)];
            }
         }

         return result;
      }
   }

   public boolean isBaseToken() {
      return false;
   }

   public String toString() {
      StringBuffer sb = new StringBuffer("[ArrayPtg]\n");
      sb.append("nRows = ").append(this.getRowCount()).append("\n");
      sb.append("nCols = ").append(this.getColumnCount()).append("\n");
      if(this._arrayValues == null) {
         sb.append("  #values#uninitialised#\n");
      } else {
         sb.append("  ").append(this.toFormulaString());
      }

      return sb.toString();
   }

   int getValueIndex(int colIx, int rowIx) {
      if(colIx >= 0 && colIx < this._nColumns) {
         if(rowIx >= 0 && rowIx < this._nRows) {
            return rowIx * this._nColumns + colIx;
         } else {
            throw new IllegalArgumentException("Specified rowIx (" + rowIx + ") is outside the allowed range (0.." + (this._nRows - 1) + ")");
         }
      } else {
         throw new IllegalArgumentException("Specified colIx (" + colIx + ") is outside the allowed range (0.." + (this._nColumns - 1) + ")");
      }
   }

   public void write(LittleEndianOutput out) {
      out.writeByte(32 + this.getPtgClass());
      out.writeInt(this._reserved0Int);
      out.writeShort(this._reserved1Short);
      out.writeByte(this._reserved2Byte);
   }

   public int writeTokenValueBytes(LittleEndianOutput out) {
      out.writeByte(this._nColumns - 1);
      out.writeShort(this._nRows - 1);
      ConstantValueParser.encode(out, this._arrayValues);
      return 3 + ConstantValueParser.getEncodedSize(this._arrayValues);
   }

   public int getRowCount() {
      return this._nRows;
   }

   public int getColumnCount() {
      return this._nColumns;
   }

   public int getSize() {
      return 11 + ConstantValueParser.getEncodedSize(this._arrayValues);
   }

   public String toFormulaString() {
      StringBuffer b = new StringBuffer();
      b.append("{");

      for(int y = 0; y < this._nRows; ++y) {
         if(y > 0) {
            b.append(";");
         }

         for(int x = 0; x < this._nColumns; ++x) {
            if(x > 0) {
               b.append(",");
            }

            Object o = this._arrayValues[this.getValueIndex(x, y)];
            b.append(getConstantText(o));
         }
      }

      b.append("}");
      return b.toString();
   }

   private static String getConstantText(Object o) {
      if(o == null) {
         throw new RuntimeException("Array item cannot be null");
      } else if(o instanceof String) {
         return "\"" + (String)o + "\"";
      } else if(o instanceof Double) {
         return NumberToTextConverter.toText(((Double)o).doubleValue());
      } else if(o instanceof Boolean) {
         return ((Boolean)o).booleanValue()?"TRUE":"FALSE";
      } else if(o instanceof ErrorConstant) {
         return ((ErrorConstant)o).getText();
      } else {
         throw new IllegalArgumentException("Unexpected constant class (" + o.getClass().getName() + ")");
      }
   }

   public byte getDefaultOperandClass() {
      return (byte)64;
   }

   static final class Initial extends Ptg {

      private final int _reserved0;
      private final int _reserved1;
      private final int _reserved2;


      public Initial(LittleEndianInput in) {
         this._reserved0 = in.readInt();
         this._reserved1 = in.readUShort();
         this._reserved2 = in.readUByte();
      }

      private static RuntimeException invalid() {
         throw new IllegalStateException("This object is a partially initialised tArray, and cannot be used as a Ptg");
      }

      public byte getDefaultOperandClass() {
         throw invalid();
      }

      public int getSize() {
         return 8;
      }

      public boolean isBaseToken() {
         return false;
      }

      public String toFormulaString() {
         throw invalid();
      }

      public void write(LittleEndianOutput out) {
         throw invalid();
      }

      public ArrayPtg finishReading(LittleEndianInput in) {
         int nColumns = in.readUByte();
         short nRows = in.readShort();
         ++nColumns;
         ++nRows;
         int totalCount = nRows * nColumns;
         Object[] arrayValues = ConstantValueParser.parse(in, totalCount);
         ArrayPtg result = new ArrayPtg(this._reserved0, this._reserved1, this._reserved2, nColumns, nRows, arrayValues);
         result.setClass(this.getPtgClass());
         return result;
      }
   }
}
