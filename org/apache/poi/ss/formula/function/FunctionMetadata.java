package org.apache.poi.ss.formula.function;


public final class FunctionMetadata {

   private static final short FUNCTION_MAX_PARAMS = 30;
   private final int _index;
   private final String _name;
   private final int _minParams;
   private final int _maxParams;
   private final byte _returnClassCode;
   private final byte[] _parameterClassCodes;


   FunctionMetadata(int index, String name, int minParams, int maxParams, byte returnClassCode, byte[] parameterClassCodes) {
      this._index = index;
      this._name = name;
      this._minParams = minParams;
      this._maxParams = maxParams;
      this._returnClassCode = returnClassCode;
      this._parameterClassCodes = parameterClassCodes;
   }

   public int getIndex() {
      return this._index;
   }

   public String getName() {
      return this._name;
   }

   public int getMinParams() {
      return this._minParams;
   }

   public int getMaxParams() {
      return this._maxParams;
   }

   public boolean hasFixedArgsLength() {
      return this._minParams == this._maxParams;
   }

   public byte getReturnClassCode() {
      return this._returnClassCode;
   }

   public byte[] getParameterClassCodes() {
      return (byte[])this._parameterClassCodes.clone();
   }

   public boolean hasUnlimitedVarags() {
      return 30 == this._maxParams;
   }

   public String toString() {
      StringBuffer sb = new StringBuffer(64);
      sb.append(this.getClass().getName()).append(" [");
      sb.append(this._index).append(" ").append(this._name);
      sb.append("]");
      return sb.toString();
   }
}
