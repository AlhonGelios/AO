package org.apache.poi.ss.usermodel;


public enum FontUnderline {

   SINGLE("SINGLE", 0, 1),
   DOUBLE("DOUBLE", 1, 2),
   SINGLE_ACCOUNTING("SINGLE_ACCOUNTING", 2, 3),
   DOUBLE_ACCOUNTING("DOUBLE_ACCOUNTING", 3, 4),
   NONE("NONE", 4, 5);
   private int value;
   private static FontUnderline[] _table = new FontUnderline[6];
   // $FF: synthetic field
   private static final FontUnderline[] $VALUES = new FontUnderline[]{SINGLE, DOUBLE, SINGLE_ACCOUNTING, DOUBLE_ACCOUNTING, NONE};


   private FontUnderline(String var1, int var2, int val) {
      this.value = val;
   }

   public int getValue() {
      return this.value;
   }

   public byte getByteValue() {
      switch(FontUnderline.NamelessClass1075704412.$SwitchMap$org$apache$poi$ss$usermodel$FontUnderline[this.ordinal()]) {
      case 1:
         return (byte)2;
      case 2:
         return (byte)34;
      case 3:
         return (byte)33;
      case 4:
         return (byte)0;
      case 5:
         return (byte)1;
      default:
         return (byte)1;
      }
   }

   public static FontUnderline valueOf(int value) {
      return _table[value];
   }

   public static FontUnderline valueOf(byte value) {
      FontUnderline val;
      switch(value) {
      case 1:
         val = SINGLE;
         break;
      case 2:
         val = DOUBLE;
         break;
      case 33:
         val = SINGLE_ACCOUNTING;
         break;
      case 34:
         val = DOUBLE_ACCOUNTING;
         break;
      default:
         val = NONE;
      }

      return val;
   }

   static {
      FontUnderline[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         FontUnderline c = arr$[i$];
         _table[c.getValue()] = c;
      }

   }

   // $FF: synthetic class
   static class NamelessClass1075704412 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$FontUnderline = new int[FontUnderline.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FontUnderline[FontUnderline.DOUBLE.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FontUnderline[FontUnderline.DOUBLE_ACCOUNTING.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FontUnderline[FontUnderline.SINGLE_ACCOUNTING.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FontUnderline[FontUnderline.NONE.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$FontUnderline[FontUnderline.SINGLE.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
