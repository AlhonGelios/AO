package com.toedter.calendar;

import com.toedter.calendar.JDayChooser;
import com.toedter.components.JSpinField;
import java.util.Calendar;
import javax.swing.JFrame;

public class JYearChooser extends JSpinField {

   private static final long serialVersionUID = 2648810220491090064L;
   protected JDayChooser dayChooser;
   protected int oldYear;
   protected int startYear;
   protected int endYear;


   public JYearChooser() {
      this.setName("JYearChooser");
      Calendar var1 = Calendar.getInstance();
      this.dayChooser = null;
      this.setMinimum(var1.getMinimum(1));
      this.setMaximum(var1.getMaximum(1));
      this.setValue(var1.get(1));
   }

   public void setYear(int var1) {
      super.setValue(var1, true, false);
      if(this.dayChooser != null) {
         this.dayChooser.setYear(this.value);
      }

      this.spinner.setValue(new Integer(this.value));
      this.firePropertyChange("year", this.oldYear, this.value);
      this.oldYear = this.value;
   }

   public void setValue(int var1) {
      this.setYear(var1);
   }

   public int getYear() {
      return super.getValue();
   }

   public void setDayChooser(JDayChooser var1) {
      this.dayChooser = var1;
   }

   public int getEndYear() {
      return this.getMaximum();
   }

   public void setEndYear(int var1) {
      this.setMaximum(var1);
   }

   public int getStartYear() {
      return this.getMinimum();
   }

   public void setStartYear(int var1) {
      this.setMinimum(var1);
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("JYearChooser");
      var1.getContentPane().add(new JYearChooser());
      var1.pack();
      var1.setVisible(true);
   }
}
