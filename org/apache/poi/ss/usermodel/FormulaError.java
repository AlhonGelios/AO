package org.apache.poi.ss.usermodel;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.util.Internal;

public enum FormulaError {

   @Internal
   _NO_ERROR("_NO_ERROR", 0, -1, "(no error)"),
   NULL("NULL", 1, 0, "#NULL!"),
   DIV0("DIV0", 2, 7, "#DIV/0!"),
   VALUE("VALUE", 3, 15, "#VALUE!"),
   REF("REF", 4, 23, "#REF!"),
   NAME("NAME", 5, 29, "#NAME?"),
   NUM("NUM", 6, 36, "#NUM!"),
   NA("NA", 7, 42, "#N/A"),
   CIRCULAR_REF("CIRCULAR_REF", 8, -60, "~CIRCULAR~REF~"),
   FUNCTION_NOT_IMPLEMENTED("FUNCTION_NOT_IMPLEMENTED", 9, -30, "~FUNCTION~NOT~IMPLEMENTED~");
   private final byte type;
   private final int longType;
   private final String repr;
   private static final Map smap = new HashMap();
   private static final Map bmap = new HashMap();
   private static final Map imap = new HashMap();
   // $FF: synthetic field
   private static final FormulaError[] $VALUES = new FormulaError[]{_NO_ERROR, NULL, DIV0, VALUE, REF, NAME, NUM, NA, CIRCULAR_REF, FUNCTION_NOT_IMPLEMENTED};


   private FormulaError(String var1, int var2, int type, String repr) {
      this.type = (byte)type;
      this.longType = type;
      this.repr = repr;
   }

   public byte getCode() {
      return this.type;
   }

   public int getLongCode() {
      return this.longType;
   }

   public String getString() {
      return this.repr;
   }

   public static final boolean isValidCode(int errorCode) {
      FormulaError[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         FormulaError error = arr$[i$];
         if(error.getCode() == errorCode) {
            return true;
         }

         if(error.getLongCode() == errorCode) {
            return true;
         }
      }

      return false;
   }

   public static FormulaError forInt(byte type) throws IllegalArgumentException {
      FormulaError err = (FormulaError)bmap.get(Byte.valueOf(type));
      if(err == null) {
         throw new IllegalArgumentException("Unknown error type: " + type);
      } else {
         return err;
      }
   }

   public static FormulaError forInt(int type) throws IllegalArgumentException {
      FormulaError err = (FormulaError)imap.get(Integer.valueOf(type));
      if(err == null) {
         err = (FormulaError)bmap.get(Byte.valueOf((byte)type));
      }

      if(err == null) {
         throw new IllegalArgumentException("Unknown error type: " + type);
      } else {
         return err;
      }
   }

   public static FormulaError forString(String code) throws IllegalArgumentException {
      FormulaError err = (FormulaError)smap.get(code);
      if(err == null) {
         throw new IllegalArgumentException("Unknown error code: " + code);
      } else {
         return err;
      }
   }

   static {
      FormulaError[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         FormulaError error = arr$[i$];
         bmap.put(Byte.valueOf(error.getCode()), error);
         imap.put(Integer.valueOf(error.getLongCode()), error);
         smap.put(error.getString(), error);
      }

   }
}
