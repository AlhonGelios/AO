package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STSheetViewType$Enum extends StringEnumAbstractBase {

   static final int INT_NORMAL = 1;
   static final int INT_PAGE_BREAK_PREVIEW = 2;
   static final int INT_PAGE_LAYOUT = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STSheetViewType$Enum[]{new STSheetViewType$Enum("normal", 1), new STSheetViewType$Enum("pageBreakPreview", 2), new STSheetViewType$Enum("pageLayout", 3)});
   private static final long serialVersionUID = 1L;


   public static STSheetViewType$Enum forString(String var0) {
      return (STSheetViewType$Enum)table.forString(var0);
   }

   public static STSheetViewType$Enum forInt(int var0) {
      return (STSheetViewType$Enum)table.forInt(var0);
   }

   private STSheetViewType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
