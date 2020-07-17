package org.apache.poi.ddf;

import org.apache.poi.util.BitField;
import org.apache.poi.util.LittleEndian;

public class EscherColorRef {

   int opid = -1;
   int colorRef = 0;
   private static final BitField FLAG_SYS_INDEX = new BitField(268435456);
   private static final BitField FLAG_SCHEME_INDEX = new BitField(134217728);
   private static final BitField FLAG_SYSTEM_RGB = new BitField(67108864);
   private static final BitField FLAG_PALETTE_RGB = new BitField(33554432);
   private static final BitField FLAG_PALETTE_INDEX = new BitField(16777216);
   private static final BitField FLAG_BLUE = new BitField(16711680);
   private static final BitField FLAG_GREEN = new BitField('\uff00');
   private static final BitField FLAG_RED = new BitField(255);


   public EscherColorRef(int colorRef) {
      this.colorRef = colorRef;
   }

   public EscherColorRef(byte[] source, int start, int len) {
      assert len == 4 || len == 6;

      int offset = start;
      if(len == 6) {
         this.opid = LittleEndian.getUShort(source, start);
         offset = start + 2;
      }

      this.colorRef = LittleEndian.getInt(source, offset);
   }

   public boolean hasSysIndexFlag() {
      return FLAG_SYS_INDEX.isSet(this.colorRef);
   }

   public void setSysIndexFlag(boolean flag) {
      this.colorRef = FLAG_SYS_INDEX.setBoolean(this.colorRef, flag);
   }

   public boolean hasSchemeIndexFlag() {
      return FLAG_SCHEME_INDEX.isSet(this.colorRef);
   }

   public void setSchemeIndexFlag(boolean flag) {
      this.colorRef = FLAG_SCHEME_INDEX.setBoolean(this.colorRef, flag);
   }

   public boolean hasSystemRGBFlag() {
      return FLAG_SYSTEM_RGB.isSet(this.colorRef);
   }

   public void setSystemRGBFlag(boolean flag) {
      this.colorRef = FLAG_SYSTEM_RGB.setBoolean(this.colorRef, flag);
   }

   public boolean hasPaletteRGBFlag() {
      return FLAG_PALETTE_RGB.isSet(this.colorRef);
   }

   public void setPaletteRGBFlag(boolean flag) {
      this.colorRef = FLAG_PALETTE_RGB.setBoolean(this.colorRef, flag);
   }

   public boolean hasPaletteIndexFlag() {
      return FLAG_PALETTE_INDEX.isSet(this.colorRef);
   }

   public void setPaletteIndexFlag(boolean flag) {
      this.colorRef = FLAG_PALETTE_INDEX.setBoolean(this.colorRef, flag);
   }

   public int[] getRGB() {
      int[] rgb = new int[]{FLAG_RED.getValue(this.colorRef), FLAG_GREEN.getValue(this.colorRef), FLAG_BLUE.getValue(this.colorRef)};
      return rgb;
   }

   public EscherColorRef.SysIndexSource getSysIndexSource() {
      if(!this.hasSysIndexFlag()) {
         return null;
      } else {
         int val = FLAG_RED.getValue(this.colorRef);
         EscherColorRef.SysIndexSource[] arr$ = EscherColorRef.SysIndexSource.values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            EscherColorRef.SysIndexSource sis = arr$[i$];
            if(sis.value == val) {
               return sis;
            }
         }

         return null;
      }
   }

   public EscherColorRef.SysIndexProcedure getSysIndexProcedure() {
      if(!this.hasSysIndexFlag()) {
         return null;
      } else {
         int val = FLAG_GREEN.getValue(this.colorRef);
         EscherColorRef.SysIndexProcedure[] arr$ = EscherColorRef.SysIndexProcedure.values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            EscherColorRef.SysIndexProcedure sip = arr$[i$];
            if(sip != EscherColorRef.SysIndexProcedure.INVERT_AFTER && sip != EscherColorRef.SysIndexProcedure.INVERT_HIGHBIT_AFTER && sip.mask.isSet(val)) {
               return sip;
            }
         }

         return null;
      }
   }

   public int getSysIndexInvert() {
      if(!this.hasSysIndexFlag()) {
         return 0;
      } else {
         int val = FLAG_GREEN.getValue(this.colorRef);
         return EscherColorRef.SysIndexProcedure.INVERT_AFTER.mask.isSet(val)?1:(EscherColorRef.SysIndexProcedure.INVERT_HIGHBIT_AFTER.mask.isSet(val)?2:0);
      }
   }

   public int getSchemeIndex() {
      return !this.hasSchemeIndexFlag()?-1:FLAG_RED.getValue(this.colorRef);
   }

   public int getPaletteIndex() {
      return this.hasPaletteIndexFlag()?this.getIndex():-1;
   }

   public int getSysIndex() {
      return this.hasSysIndexFlag()?this.getIndex():-1;
   }

   private int getIndex() {
      return FLAG_GREEN.getValue(this.colorRef) << 8 | FLAG_RED.getValue(this.colorRef);
   }


   public static enum SysIndexProcedure {

      DARKEN_COLOR("DARKEN_COLOR", 0, 1),
      LIGHTEN_COLOR("LIGHTEN_COLOR", 1, 2),
      ADD_GRAY_LEVEL("ADD_GRAY_LEVEL", 2, 3),
      SUB_GRAY_LEVEL("SUB_GRAY_LEVEL", 3, 4),
      REVERSE_GRAY_LEVEL("REVERSE_GRAY_LEVEL", 4, 5),
      THRESHOLD("THRESHOLD", 5, 6),
      INVERT_AFTER("INVERT_AFTER", 6, 32),
      INVERT_HIGHBIT_AFTER("INVERT_HIGHBIT_AFTER", 7, 64);
      BitField mask;
      // $FF: synthetic field
      private static final EscherColorRef.SysIndexProcedure[] $VALUES = new EscherColorRef.SysIndexProcedure[]{DARKEN_COLOR, LIGHTEN_COLOR, ADD_GRAY_LEVEL, SUB_GRAY_LEVEL, REVERSE_GRAY_LEVEL, THRESHOLD, INVERT_AFTER, INVERT_HIGHBIT_AFTER};


      private SysIndexProcedure(String var1, int var2, int mask) {
         this.mask = new BitField(mask);
      }

   }

   public static enum SysIndexSource {

      FILL_COLOR("FILL_COLOR", 0, 240),
      LINE_OR_FILL_COLOR("LINE_OR_FILL_COLOR", 1, 241),
      LINE_COLOR("LINE_COLOR", 2, 242),
      SHADOW_COLOR("SHADOW_COLOR", 3, 243),
      CURRENT_OR_LAST_COLOR("CURRENT_OR_LAST_COLOR", 4, 244),
      FILL_BACKGROUND_COLOR("FILL_BACKGROUND_COLOR", 5, 245),
      LINE_BACKGROUND_COLOR("LINE_BACKGROUND_COLOR", 6, 246),
      FILL_OR_LINE_COLOR("FILL_OR_LINE_COLOR", 7, 247);
      int value;
      // $FF: synthetic field
      private static final EscherColorRef.SysIndexSource[] $VALUES = new EscherColorRef.SysIndexSource[]{FILL_COLOR, LINE_OR_FILL_COLOR, LINE_COLOR, SHADOW_COLOR, CURRENT_OR_LAST_COLOR, FILL_BACKGROUND_COLOR, LINE_BACKGROUND_COLOR, FILL_OR_LINE_COLOR};


      private SysIndexSource(String var1, int var2, int value) {
         this.value = value;
      }

   }
}
