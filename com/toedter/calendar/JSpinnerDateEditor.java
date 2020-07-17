package com.toedter.calendar;

import com.toedter.calendar.DateUtil;
import com.toedter.calendar.IDateEditor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;
import javax.swing.JSpinner.DateEditor;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerDateEditor extends JSpinner implements IDateEditor, FocusListener, ChangeListener {

   private static final long serialVersionUID = 5692204052306085316L;
   protected Date date;
   protected String dateFormatString;
   protected SimpleDateFormat dateFormatter = (SimpleDateFormat)DateFormat.getDateInstance(2);


   public JSpinnerDateEditor() {
      super(new SpinnerDateModel());
      ((DateEditor)this.getEditor()).getTextField().addFocusListener(this);
      DateUtil var1 = new DateUtil();
      this.setMinSelectableDate(var1.getMinSelectableDate());
      this.setMaxSelectableDate(var1.getMaxSelectableDate());
      ((DateEditor)this.getEditor()).getTextField().setFocusLostBehavior(3);
      this.addChangeListener(this);
   }

   public Date getDate() {
      return this.date == null?null:((SpinnerDateModel)this.getModel()).getDate();
   }

   public void setDate(Date var1) {
      this.setDate(var1, true);
   }

   public void setDate(Date var1, boolean var2) {
      Date var3 = this.date;
      this.date = var1;
      if(var1 == null) {
         ((DateEditor)this.getEditor()).getFormat().applyPattern("");
         ((DateEditor)this.getEditor()).getTextField().setText("");
      } else if(var2) {
         if(this.dateFormatString != null) {
            ((DateEditor)this.getEditor()).getFormat().applyPattern(this.dateFormatString);
         }

         ((SpinnerDateModel)this.getModel()).setValue(var1);
      }

      this.firePropertyChange("date", var3, var1);
   }

   public void setDateFormatString(String var1) {
      try {
         this.dateFormatter.applyPattern(var1);
      } catch (RuntimeException var3) {
         this.dateFormatter = (SimpleDateFormat)DateFormat.getDateInstance(2);
         this.dateFormatter.setLenient(false);
      }

      this.dateFormatString = this.dateFormatter.toPattern();
      this.setToolTipText(this.dateFormatString);
      if(this.date != null) {
         ((DateEditor)this.getEditor()).getFormat().applyPattern(this.dateFormatString);
      } else {
         ((DateEditor)this.getEditor()).getFormat().applyPattern("");
      }

      if(this.date != null) {
         String var2 = this.dateFormatter.format(this.date);
         ((DateEditor)this.getEditor()).getTextField().setText(var2);
      }

   }

   public String getDateFormatString() {
      return this.dateFormatString;
   }

   public JComponent getUiComponent() {
      return this;
   }

   public void setLocale(Locale var1) {
      super.setLocale(var1);
      this.dateFormatter = (SimpleDateFormat)DateFormat.getDateInstance(2, var1);
      this.setEditor(new DateEditor(this, this.dateFormatter.toPattern()));
      this.setDateFormatString(this.dateFormatter.toPattern());
   }

   public void focusLost(FocusEvent var1) {
      String var2 = ((DateEditor)this.getEditor()).getTextField().getText();
      if(var2.length() == 0) {
         this.setDate((Date)null);
      }

   }

   public void focusGained(FocusEvent var1) {}

   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      if(!var1) {
         ((DateEditor)this.getEditor()).getTextField().setBackground(UIManager.getColor("TextField.inactiveBackground"));
      }

   }

   public Date getMaxSelectableDate() {
      return (Date)((SpinnerDateModel)this.getModel()).getEnd();
   }

   public Date getMinSelectableDate() {
      return (Date)((SpinnerDateModel)this.getModel()).getStart();
   }

   public void setMaxSelectableDate(Date var1) {
      ((SpinnerDateModel)this.getModel()).setEnd(var1);
   }

   public void setMinSelectableDate(Date var1) {
      ((SpinnerDateModel)this.getModel()).setStart(var1);
   }

   public void setSelectableDateRange(Date var1, Date var2) {
      this.setMaxSelectableDate(var2);
      this.setMinSelectableDate(var1);
   }

   public void stateChanged(ChangeEvent var1) {
      this.setDate(((SpinnerDateModel)this.getModel()).getDate(), false);
   }
}
