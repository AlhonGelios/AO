package com.toedter.components;

import java.beans.PropertyEditorSupport;
import java.util.Calendar;
import java.util.Locale;

public class LocaleEditor extends PropertyEditorSupport {

   private Locale[] locales = Calendar.getAvailableLocales();
   private String[] localeStrings;
   private Locale locale = Locale.getDefault();
   private int length;


   public LocaleEditor() {
      this.length = this.locales.length;
      this.localeStrings = new String[this.length];
   }

   public String[] getTags() {
      for(int var1 = 0; var1 < this.length; ++var1) {
         this.localeStrings[var1] = this.locales[var1].getDisplayName();
      }

      return this.localeStrings;
   }

   public void setAsText(String var1) throws IllegalArgumentException {
      for(int var2 = 0; var2 < this.length; ++var2) {
         if(var1.equals(this.locales[var2].getDisplayName())) {
            this.locale = this.locales[var2];
            this.setValue(this.locale);
            break;
         }
      }

   }

   public String getAsText() {
      return this.locale.getDisplayName();
   }
}
