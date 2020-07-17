package com.toedter.calendar;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

   protected Date minSelectableDate;
   protected Date maxSelectableDate;
   protected Date defaultMinSelectableDate;
   protected Date defaultMaxSelectableDate;


   public DateUtil() {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, 0, 1, 1, 1);
      this.defaultMinSelectableDate = var1.getTime();
      this.minSelectableDate = this.defaultMinSelectableDate;
      var1.set(9999, 0, 1, 1, 1);
      this.defaultMaxSelectableDate = var1.getTime();
      this.maxSelectableDate = this.defaultMaxSelectableDate;
   }

   public void setSelectableDateRange(Date var1, Date var2) {
      if(var1 == null) {
         this.minSelectableDate = this.defaultMinSelectableDate;
      } else {
         this.minSelectableDate = var1;
      }

      if(var2 == null) {
         this.maxSelectableDate = this.defaultMaxSelectableDate;
      } else {
         this.maxSelectableDate = var2;
      }

      if(this.maxSelectableDate.before(this.minSelectableDate)) {
         this.minSelectableDate = this.defaultMinSelectableDate;
         this.maxSelectableDate = this.defaultMaxSelectableDate;
      }

   }

   public Date setMaxSelectableDate(Date var1) {
      if(var1 == null) {
         this.maxSelectableDate = this.defaultMaxSelectableDate;
      } else {
         this.maxSelectableDate = var1;
      }

      return this.maxSelectableDate;
   }

   public Date setMinSelectableDate(Date var1) {
      if(var1 == null) {
         this.minSelectableDate = this.defaultMinSelectableDate;
      } else {
         this.minSelectableDate = var1;
      }

      return this.minSelectableDate;
   }

   public Date getMaxSelectableDate() {
      return this.maxSelectableDate;
   }

   public Date getMinSelectableDate() {
      return this.minSelectableDate;
   }

   public boolean checkDate(Date var1) {
      Calendar var2 = Calendar.getInstance();
      var2.setTime(var1);
      var2.set(11, 0);
      var2.set(12, 0);
      var2.set(13, 0);
      var2.set(14, 0);
      Calendar var3 = Calendar.getInstance();
      var3.setTime(this.minSelectableDate);
      var3.set(11, 0);
      var3.set(12, 0);
      var3.set(13, 0);
      var3.set(14, 0);
      Calendar var4 = Calendar.getInstance();
      var4.setTime(this.maxSelectableDate);
      var4.set(11, 0);
      var4.set(12, 0);
      var4.set(13, 0);
      var4.set(14, 0);
      return !var2.before(var3) && !var2.after(var4);
   }
}
