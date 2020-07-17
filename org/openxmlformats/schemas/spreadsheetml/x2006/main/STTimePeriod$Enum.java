package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTimePeriod$Enum extends StringEnumAbstractBase {

   static final int INT_TODAY = 1;
   static final int INT_YESTERDAY = 2;
   static final int INT_TOMORROW = 3;
   static final int INT_LAST_7_DAYS = 4;
   static final int INT_THIS_MONTH = 5;
   static final int INT_LAST_MONTH = 6;
   static final int INT_NEXT_MONTH = 7;
   static final int INT_THIS_WEEK = 8;
   static final int INT_LAST_WEEK = 9;
   static final int INT_NEXT_WEEK = 10;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTimePeriod$Enum[]{new STTimePeriod$Enum("today", 1), new STTimePeriod$Enum("yesterday", 2), new STTimePeriod$Enum("tomorrow", 3), new STTimePeriod$Enum("last7Days", 4), new STTimePeriod$Enum("thisMonth", 5), new STTimePeriod$Enum("lastMonth", 6), new STTimePeriod$Enum("nextMonth", 7), new STTimePeriod$Enum("thisWeek", 8), new STTimePeriod$Enum("lastWeek", 9), new STTimePeriod$Enum("nextWeek", 10)});
   private static final long serialVersionUID = 1L;


   public static STTimePeriod$Enum forString(String var0) {
      return (STTimePeriod$Enum)table.forString(var0);
   }

   public static STTimePeriod$Enum forInt(int var0) {
      return (STTimePeriod$Enum)table.forInt(var0);
   }

   private STTimePeriod$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
