package com.toedter.calendar.demo;

import com.toedter.calendar.IDateEvaluator;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

public class BirthdayEvaluator implements IDateEvaluator {

   private Calendar calendar = Calendar.getInstance();
   private Color darkGreen = new Color(32512);
   private Color lightGreen = new Color(12315592);


   public boolean isSpecial(Date var1) {
      this.calendar.setTime(var1);
      return this.calendar.get(2) == 8 && this.calendar.get(5) == 21;
   }

   public Color getSpecialForegroundColor() {
      return this.darkGreen;
   }

   public Color getSpecialBackroundColor() {
      return this.lightGreen;
   }

   public String getSpecialTooltip() {
      return "Kai\'s Birthday";
   }

   public boolean isInvalid(Date var1) {
      return false;
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
}
