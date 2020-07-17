package com.toedter.calendar;

import com.toedter.calendar.DateUtil;
import com.toedter.calendar.IDateEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.MaskFormatter;

public class JTextFieldDateEditor extends JFormattedTextField implements IDateEditor, CaretListener, FocusListener, ActionListener {

   private static final long serialVersionUID = -8901842591101625304L;
   protected Date date;
   protected SimpleDateFormat dateFormatter;
   protected MaskFormatter maskFormatter;
   protected String datePattern;
   protected String maskPattern;
   protected char placeholder;
   protected Color darkGreen;
   protected DateUtil dateUtil;
   private boolean isMaskVisible;
   private boolean ignoreDatePatternChange;
   private int hours;
   private int minutes;
   private int seconds;
   private int millis;
   private Calendar calendar;


   public JTextFieldDateEditor() {
      this(false, (String)null, (String)null, ' ');
   }

   public JTextFieldDateEditor(String var1, String var2, char var3) {
      this(true, var1, var2, var3);
   }

   public JTextFieldDateEditor(boolean var1, String var2, String var3, char var4) {
      this.dateFormatter = (SimpleDateFormat)DateFormat.getDateInstance(2);
      this.dateFormatter.setLenient(false);
      this.setDateFormatString(var2);
      if(var2 != null) {
         this.ignoreDatePatternChange = true;
      }

      this.placeholder = var4;
      if(var3 == null) {
         this.maskPattern = this.createMaskFromDatePattern(this.datePattern);
      } else {
         this.maskPattern = var3;
      }

      this.setToolTipText(this.datePattern);
      this.setMaskVisible(var1);
      this.addCaretListener(this);
      this.addFocusListener(this);
      this.addActionListener(this);
      this.darkGreen = new Color(0, 150, 0);
      this.calendar = Calendar.getInstance();
      this.dateUtil = new DateUtil();
   }

   public Date getDate() {
      try {
         this.calendar.setTime(this.dateFormatter.parse(this.getText()));
         this.calendar.set(11, this.hours);
         this.calendar.set(12, this.minutes);
         this.calendar.set(13, this.seconds);
         this.calendar.set(14, this.millis);
         this.date = this.calendar.getTime();
      } catch (ParseException var2) {
         this.date = null;
      }

      return this.date;
   }

   public void setDate(Date var1) {
      this.setDate(var1, true);
   }

   protected void setDate(Date var1, boolean var2) {
      Date var3 = this.date;
      this.date = var1;
      if(var1 == null) {
         this.setText("");
      } else {
         this.calendar.setTime(var1);
         this.hours = this.calendar.get(11);
         this.minutes = this.calendar.get(12);
         this.seconds = this.calendar.get(13);
         this.millis = this.calendar.get(14);
         String var4 = this.dateFormatter.format(var1);

         try {
            this.setText(var4);
         } catch (RuntimeException var6) {
            var6.printStackTrace();
         }
      }

      if(var1 != null && this.dateUtil.checkDate(var1)) {
         this.setForeground(Color.BLACK);
      }

      if(var2) {
         this.firePropertyChange("date", var3, var1);
      }

   }

   public void setDateFormatString(String var1) {
      if(!this.ignoreDatePatternChange) {
         try {
            this.dateFormatter.applyPattern(var1);
         } catch (RuntimeException var3) {
            this.dateFormatter = (SimpleDateFormat)DateFormat.getDateInstance(2);
            this.dateFormatter.setLenient(false);
         }

         this.datePattern = this.dateFormatter.toPattern();
         this.setToolTipText(this.datePattern);
         this.setDate(this.date, false);
      }
   }

   public String getDateFormatString() {
      return this.datePattern;
   }

   public JComponent getUiComponent() {
      return this;
   }

   public void caretUpdate(CaretEvent var1) {
      String var2 = this.getText().trim();
      String var3 = this.maskPattern.replace('#', this.placeholder);
      if(var2.length() != 0 && !var2.equals(var3)) {
         try {
            Date var4 = this.dateFormatter.parse(this.getText());
            if(this.dateUtil.checkDate(var4)) {
               this.setForeground(this.darkGreen);
            } else {
               this.setForeground(Color.RED);
            }
         } catch (Exception var5) {
            this.setForeground(Color.RED);
         }

      } else {
         this.setForeground(Color.BLACK);
      }
   }

   public void focusLost(FocusEvent var1) {
      this.checkText();
   }

   private void checkText() {
      try {
         Date var1 = this.dateFormatter.parse(this.getText());
         this.setDate(var1, true);
      } catch (Exception var2) {
         ;
      }

   }

   public void focusGained(FocusEvent var1) {}

   public void setLocale(Locale var1) {
      if(var1 != this.getLocale() && !this.ignoreDatePatternChange) {
         super.setLocale(var1);
         this.dateFormatter = (SimpleDateFormat)DateFormat.getDateInstance(2, var1);
         this.setToolTipText(this.dateFormatter.toPattern());
         this.setDate(this.date, false);
         this.doLayout();
      }
   }

   public String createMaskFromDatePattern(String var1) {
      String var2 = "GyMdkHmsSEDFwWahKzZ";
      String var3 = "";
      int var4 = 0;

      while(var4 < var1.length()) {
         char var5 = var1.charAt(var4);
         boolean var6 = false;
         int var7 = 0;

         while(true) {
            if(var7 < var2.length()) {
               if(var2.charAt(var7) != var5) {
                  ++var7;
                  continue;
               }

               var3 = var3 + "#";
               var6 = true;
            }

            if(!var6) {
               var3 = var3 + var5;
            }

            ++var4;
            break;
         }
      }

      return var3;
   }

   public boolean isMaskVisible() {
      return this.isMaskVisible;
   }

   public void setMaskVisible(boolean var1) {
      this.isMaskVisible = var1;
      if(var1 && this.maskFormatter == null) {
         try {
            this.maskFormatter = new MaskFormatter(this.createMaskFromDatePattern(this.datePattern));
            this.maskFormatter.setPlaceholderCharacter(this.placeholder);
            this.maskFormatter.install(this);
         } catch (ParseException var3) {
            var3.printStackTrace();
         }
      }

   }

   public Dimension getPreferredSize() {
      return this.datePattern != null?(new JTextField(this.datePattern)).getPreferredSize():super.getPreferredSize();
   }

   public void actionPerformed(ActionEvent var1) {
      this.checkText();
   }

   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      if(!var1) {
         super.setBackground(UIManager.getColor("TextField.inactiveBackground"));
      }

   }

   public Date getMaxSelectableDate() {
      return this.dateUtil.getMaxSelectableDate();
   }

   public Date getMinSelectableDate() {
      return this.dateUtil.getMinSelectableDate();
   }

   public void setMaxSelectableDate(Date var1) {
      this.dateUtil.setMaxSelectableDate(var1);
      this.checkText();
   }

   public void setMinSelectableDate(Date var1) {
      this.dateUtil.setMinSelectableDate(var1);
      this.checkText();
   }

   public void setSelectableDateRange(Date var1, Date var2) {
      this.dateUtil.setSelectableDateRange(var1, var2);
      this.checkText();
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("JTextFieldDateEditor");
      JTextFieldDateEditor var2 = new JTextFieldDateEditor();
      var2.setDate(new Date());
      var1.getContentPane().add(var2);
      var1.pack();
      var1.setVisible(true);
   }
}
