package com.toedter.calendar.demo;

import com.toedter.calendar.IDateEvaluator;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

public class TestDateEvaluator implements IDateEvaluator {

   private Calendar calendar = Calendar.getInstance();
   private Calendar calendar2 = Calendar.getInstance();
   private Color darkGreen = new Color(32512);
   private Color lightGreen = new Color(12315592);
   private Color darkRed = new Color(10878983);
   private Color lightRed = new Color(16757173);


   public boolean isSpecial(Date var1) {
      this.calendar2.setTime(var1);

      for(int var2 = 2; var2 < 5; ++var2) {
         if(this.calendar.get(2) == this.calendar2.get(2) && this.calendar.get(5) == this.calendar2.get(5) + var2) {
            return true;
         }
      }

      return false;
   }

   public Color getSpecialForegroundColor() {
      return this.darkGreen;
   }

   public Color getSpecialBackroundColor() {
      return this.lightGreen;
   }

   public String getSpecialTooltip() {
      return "Special Day!";
   }

   public boolean isInvalid(Date var1) {
      this.calendar2.setTime(var1);

      for(int var2 = 4; var2 < 6; ++var2) {
         if(this.calendar.get(2) == this.calendar2.get(2) && this.calendar.get(5) == this.calendar2.get(5) + var2) {
            return true;
         }
      }

      return false;
   }

   public Color getInvalidForegroundColor() {
      return this.darkRed;
   }

   public Color getInvalidBackroundColor() {
      return null;
   }

   public String getInvalidTooltip() {
      return "You cannot select this date...";
   }
}
