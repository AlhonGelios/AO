package org.apache.poi.ss.formula.function;

import java.util.Map;
import java.util.Set;
import org.apache.poi.ss.formula.function.FunctionMetadata;
import org.apache.poi.ss.formula.function.FunctionMetadataReader;

public final class FunctionMetadataRegistry {

   public static final String FUNCTION_NAME_IF = "IF";
   public static final int FUNCTION_INDEX_IF = 1;
   public static final short FUNCTION_INDEX_SUM = 4;
   public static final int FUNCTION_INDEX_CHOOSE = 100;
   public static final short FUNCTION_INDEX_INDIRECT = 148;
   public static final short FUNCTION_INDEX_EXTERNAL = 255;
   private static FunctionMetadataRegistry _instance;
   private final FunctionMetadata[] _functionDataByIndex;
   private final Map _functionDataByName;


   private static FunctionMetadataRegistry getInstance() {
      if(_instance == null) {
         _instance = FunctionMetadataReader.createRegistry();
      }

      return _instance;
   }

   FunctionMetadataRegistry(FunctionMetadata[] functionDataByIndex, Map functionDataByName) {
      this._functionDataByIndex = functionDataByIndex;
      this._functionDataByName = functionDataByName;
   }

   Set getAllFunctionNames() {
      return this._functionDataByName.keySet();
   }

   public static FunctionMetadata getFunctionByIndex(int index) {
      return getInstance().getFunctionByIndexInternal(index);
   }

   private FunctionMetadata getFunctionByIndexInternal(int index) {
      return this._functionDataByIndex[index];
   }

   public static short lookupIndexByName(String name) {
      FunctionMetadata fd = getInstance().getFunctionByNameInternal(name);
      return fd == null?-1:(short)fd.getIndex();
   }

   private FunctionMetadata getFunctionByNameInternal(String name) {
      return (FunctionMetadata)this._functionDataByName.get(name);
   }

   public static FunctionMetadata getFunctionByName(String name) {
      return getInstance().getFunctionByNameInternal(name);
   }
}
