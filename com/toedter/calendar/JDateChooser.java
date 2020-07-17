package com.toedter.calendar;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JDateChooser extends JPanel implements ActionListener, PropertyChangeListener {

   private static final long serialVersionUID = -4306412745720670722L;
   protected IDateEditor dateEditor;
   protected JButton calendarButton;
   protected JCalendar jcalendar;
   protected JPopupMenu popup;
   protected boolean isInitialized;
   protected boolean dateSelected;
   protected Date lastSelectedDate;
   private ChangeListener changeListener;


   public JDateChooser() {
      this((JCalendar)null, (Date)null, (String)null, (IDateEditor)null);
   }

   public JDateChooser(IDateEditor var1) {
      this((JCalendar)null, (Date)null, (String)null, var1);
   }

   public JDateChooser(Date var1) {
      this(var1, (String)null);
   }

   public JDateChooser(Date var1, String var2) {
      this(var1, var2, (IDateEditor)null);
   }

   public JDateChooser(Date var1, String var2, IDateEditor var3) {
      this((JCalendar)null, var1, var2, var3);
   }

   public JDateChooser(String var1, String var2, char var3) {
      this((JCalendar)null, (Date)null, var1, new JTextFieldDateEditor(var1, var2, var3));
   }

   public JDateChooser(JCalendar var1, Date var2, String var3, IDateEditor var4) {
      this.setName("JDateChooser");
      this.dateEditor = var4;
      if(this.dateEditor == null) {
         this.dateEditor = new JTextFieldDateEditor();
      }

      this.dateEditor.addPropertyChangeListener("date", this);
      if(var1 == null) {
         this.jcalendar = new JCalendar(var2);
      } else {
         this.jcalendar = var1;
         if(var2 != null) {
            this.jcalendar.setDate(var2);
         }
      }

      this.setLayout(new BorderLayout());
      this.jcalendar.getDayChooser().addPropertyChangeListener("day", this);
      this.jcalendar.getDayChooser().setAlwaysFireDayProperty(true);
      this.setDateFormatString(var3);
      this.setDate(var2);
      URL var5 = this.getClass().getResource("/com/toedter/calendar/images/JDateChooserIcon.gif");
      final ImageIcon var6 = new ImageIcon(var5);
      this.calendarButton = new JButton(var6) {

         private static final long serialVersionUID = -1913767779079949668L;

         public boolean isFocusable() {
            return false;
         }
      };
      this.calendarButton.setMargin(new Insets(0, 0, 0, 0));
      this.calendarButton.addActionListener(this);
      this.calendarButton.setMnemonic(67);
      this.add(this.calendarButton, "East");
      this.add(this.dateEditor.getUiComponent(), "Center");
      this.calendarButton.setMargin(new Insets(0, 0, 0, 0));
      this.popup = new JPopupMenu() {

         private static final long serialVersionUID = -6078272560337577761L;

         public void setVisible(boolean var1) {
            Boolean var2 = (Boolean)this.getClientProperty("JPopupMenu.firePopupMenuCanceled");
            if(var1 || !var1 && JDateChooser.this.dateSelected || var2 != null && !var1 && var2.booleanValue()) {
               super.setVisible(var1);
            }

         }
      };
      this.popup.setLightWeightPopupEnabled(true);
      this.popup.add(this.jcalendar);
      this.lastSelectedDate = var2;
      this.changeListener = new ChangeListener() {

         boolean hasListened = false;

         public void stateChanged(ChangeEvent var1) {
            if(this.hasListened) {
               this.hasListened = false;
            } else {
               if(JDateChooser.this.popup.isVisible() && JDateChooser.this.jcalendar.monthChooser.getComboBox().hasFocus()) {
                  MenuElement[] var2 = MenuSelectionManager.defaultManager().getSelectedPath();
                  MenuElement[] var3 = new MenuElement[var2.length + 1];
                  var3[0] = JDateChooser.this.popup;

                  for(int var4 = 0; var4 < var2.length; ++var4) {
                     var3[var4 + 1] = var2[var4];
                  }

                  this.hasListened = true;
                  MenuSelectionManager.defaultManager().setSelectedPath(var3);
               }

            }
         }
      };
      MenuSelectionManager.defaultManager().addChangeListener(this.changeListener);
      this.isInitialized = true;
   }

   public void actionPerformed(ActionEvent var1) {
      int var2 = this.calendarButton.getWidth() - (int)this.popup.getPreferredSize().getWidth();
      int var3 = this.calendarButton.getY() + this.calendarButton.getHeight();
      Calendar var4 = Calendar.getInstance();
      Date var5 = this.dateEditor.getDate();
      if(var5 != null) {
         var4.setTime(var5);
      }

      this.jcalendar.setCalendar(var4);
      this.popup.show(this.calendarButton, var2, var3);
      this.dateSelected = false;
   }

   public void propertyChange(PropertyChangeEvent var1) {
      if(var1.getPropertyName().equals("day")) {
         if(this.popup.isVisible()) {
            this.dateSelected = true;
            this.popup.setVisible(false);
            if(((Integer)var1.getNewValue()).intValue() > 0) {
               this.setDate(this.jcalendar.getCalendar().getTime());
            } else {
               this.setDate((Date)null);
            }
         }
      } else if(var1.getPropertyName().equals("date")) {
         if(var1.getSource() == this.dateEditor) {
            this.firePropertyChange("date", var1.getOldValue(), var1.getNewValue());
         } else {
            this.setDate((Date)var1.getNewValue());
         }
      }

   }

   public void updateUI() {
      super.updateUI();
      this.setEnabled(this.isEnabled());
      if(this.jcalendar != null) {
         SwingUtilities.updateComponentTreeUI(this.popup);
      }

   }

   public void setLocale(Locale var1) {
      super.setLocale(var1);
      this.dateEditor.setLocale(var1);
      this.jcalendar.setLocale(var1);
   }

   public String getDateFormatString() {
      return this.dateEditor.getDateFormatString();
   }

   public void setDateFormatString(String var1) {
      this.dateEditor.setDateFormatString(var1);
      this.invalidate();
   }

   public Date getDate() {
      return this.dateEditor.getDate();
   }

   public void setDate(Date var1) {
      this.dateEditor.setDate(var1);
      if(this.getParent() != null) {
         this.getParent().invalidate();
      }

   }

   public Calendar getCalendar() {
      Date var1 = this.getDate();
      if(var1 == null) {
         return null;
      } else {
         Calendar var2 = Calendar.getInstance();
         var2.setTime(var1);
         return var2;
      }
   }

   public void setCalendar(Calendar var1) {
      if(var1 == null) {
         this.dateEditor.setDate((Date)null);
      } else {
         this.dateEditor.setDate(var1.getTime());
      }

   }

   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      if(this.dateEditor != null) {
         this.dateEditor.setEnabled(var1);
         this.calendarButton.setEnabled(var1);
      }

   }

   public boolean isEnabled() {
      return super.isEnabled();
   }

   public void setIcon(ImageIcon var1) {
      this.calendarButton.setIcon(var1);
   }

   public void setFont(Font var1) {
      if(this.isInitialized) {
         this.dateEditor.getUiComponent().setFont(var1);
         this.jcalendar.setFont(var1);
      }

      super.setFont(var1);
   }

   public JCalendar getJCalendar() {
      return this.jcalendar;
   }

   public JButton getCalendarButton() {
      return this.calendarButton;
   }

   public IDateEditor getDateEditor() {
      return this.dateEditor;
   }

   public void setSelectableDateRange(Date var1, Date var2) {
      this.jcalendar.setSelectableDateRange(var1, var2);
      this.dateEditor.setSelectableDateRange(this.jcalendar.getMinSelectableDate(), this.jcalendar.getMaxSelectableDate());
   }

   public void setMaxSelectableDate(Date var1) {
      this.jcalendar.setMaxSelectableDate(var1);
      this.dateEditor.setMaxSelectableDate(var1);
   }

   public void setMinSelectableDate(Date var1) {
      this.jcalendar.setMinSelectableDate(var1);
      this.dateEditor.setMinSelectableDate(var1);
   }

   public Date getMaxSelectableDate() {
      return this.jcalendar.getMaxSelectableDate();
   }

   public Date getMinSelectableDate() {
      return this.jcalendar.getMinSelectableDate();
   }

   public void cleanup() {
      MenuSelectionManager.defaultManager().removeChangeListener(this.changeListener);
      this.changeListener = null;
   }

   public boolean requestFocusInWindow() {
      return this.dateEditor instanceof JComponent?((JComponent)this.dateEditor).requestFocusInWindow():super.requestFocusInWindow();
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("JDateChooser");
      JDateChooser var2 = new JDateChooser();
      var1.getContentPane().add(var2);
      var1.pack();
      var1.setVisible(true);
      var2.requestFocusInWindow();
   }
}
