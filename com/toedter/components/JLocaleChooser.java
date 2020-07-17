package com.toedter.components;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class JLocaleChooser extends JComboBox implements ItemListener {

   private static final long serialVersionUID = 8152430789764877431L;
   protected JComponent component;
   private Locale[] locales;
   private Locale locale;
   private int localeCount;


   public JLocaleChooser() {
      this((JComponent)null);
   }

   public String getName() {
      return "JLocaleChoose";
   }

   public JLocaleChooser(JComponent var1) {
      this.component = var1;
      this.addItemListener(this);
      this.locales = Calendar.getAvailableLocales();
      this.localeCount = this.locales.length;

      for(int var2 = 0; var2 < this.localeCount; ++var2) {
         if(this.locales[var2].getCountry().length() > 0) {
            this.addItem(this.locales[var2].getDisplayName());
         }
      }

      this.setLocale(Locale.getDefault());
   }

   public void itemStateChanged(ItemEvent var1) {
      String var2 = (String)var1.getItem();

      int var3;
      for(var3 = 0; var3 < this.localeCount && !this.locales[var3].getDisplayName().equals(var2); ++var3) {
         ;
      }

      this.setLocale(this.locales[var3], false);
   }

   private void setLocale(Locale var1, boolean var2) {
      Locale var3 = this.locale;
      this.locale = var1;
      int var4 = 0;
      if(var2) {
         for(int var5 = 0; var5 < this.localeCount; ++var5) {
            if(this.locales[var5].getCountry().length() > 0) {
               if(this.locales[var5].equals(this.locale)) {
                  this.setSelectedIndex(var4);
               }

               ++var4;
            }
         }
      }

      this.firePropertyChange("locale", var3, this.locale);
      if(this.component != null) {
         this.component.setLocale(var1);
      }

   }

   public void setLocale(Locale var1) {
      this.setLocale(var1, true);
   }

   public Locale getLocale() {
      return this.locale;
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("LocaleChooser");
      var1.getContentPane().add(new JLocaleChooser());
      var1.pack();
      var1.setVisible(true);
   }
}
