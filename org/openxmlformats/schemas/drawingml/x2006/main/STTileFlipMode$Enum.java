package org.openxmlformats.schemas.drawingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTileFlipMode$Enum extends StringEnumAbstractBase {

   static final int INT_NONE = 1;
   static final int INT_X = 2;
   static final int INT_Y = 3;
   static final int INT_XY = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTileFlipMode$Enum[]{new STTileFlipMode$Enum("none", 1), new STTileFlipMode$Enum("x", 2), new STTileFlipMode$Enum("y", 3), new STTileFlipMode$Enum("xy", 4)});
   private static final long serialVersionUID = 1L;


   public static STTileFlipMode$Enum forString(String var0) {
      return (STTileFlipMode$Enum)table.forString(var0);
   }

   public static STTileFlipMode$Enum forInt(int var0) {
      return (STTileFlipMode$Enum)table.forInt(var0);
   }

   private STTileFlipMode$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
