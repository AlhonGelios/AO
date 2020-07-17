package com.toedter.calendar;

import com.toedter.calendar.DateUtil;
import com.toedter.calendar.IDateEvaluator;
import java.awt.Color;
import java.util.Date;

public class MinMaxDateEvaluator implements IDateEvaluator {

   private DateUtil dateUtil = new DateUtil();


   public boolean isSpecial(Date var1) {
      return false;
   }

   public Color getSpecialForegroundColor() {
      return null;
   }

   public Color getSpecialBackroundColor() {
      return null;
   }

   public String getSpecialTooltip() {
      return null;
   }

   public boolean isInvalid(Date var1) {
      return !this.dateUtil.checkDate(var1);
   }

   public Color getInvalidForegroundColor() {
      return null;
   }

   public Color getInvalidBackroundColor() {
      return null;
   }

   public String getInvalidTooltip() {
      return null;
   }

   public Date setMaxSelectableDate(Date var1) {
      return this.dateUtil.setMaxSelectableDate(var1);
   }

   public Date setMinSelectableDate(Date var1) {
      return this.dateUtil.setMinSelectableDate(var1);
   }

   public Date getMaxSelectableDate() {
      return this.dateUtil.getMaxSelectableDate();
   }

   public Date getMinSelectableDate() {
      return this.dateUtil.getMinSelectableDate();
   }
}
