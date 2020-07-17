package com.toedter.components;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public abstract class UTF8ResourceBundle {

   public static final ResourceBundle getBundle(String var0, Locale var1) {
      ResourceBundle var2 = ResourceBundle.getBundle(var0, var1);
      return (ResourceBundle)(!(var2 instanceof PropertyResourceBundle)?var2:new UTF8ResourceBundle.UTF8PropertyResourceBundle((PropertyResourceBundle)var2, (UTF8ResourceBundle.NamelessClass1562182941)null));
   }

   static class NamelessClass1562182941 {
   }

   private static class UTF8PropertyResourceBundle extends ResourceBundle {

      PropertyResourceBundle propertyResourceBundle;


      private UTF8PropertyResourceBundle(PropertyResourceBundle var1) {
         this.propertyResourceBundle = var1;
      }

      public Enumeration getKeys() {
         return this.propertyResourceBundle.getKeys();
      }

      protected Object handleGetObject(String var1) {
         String var2 = (String)this.propertyResourceBundle.handleGetObject(var1);
         if(var2 != null) {
            try {
               return new String(var2.getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException var4) {
               throw new RuntimeException("UTF-8 encoding is not supported.", var4);
            }
         } else {
            return null;
         }
      }

      UTF8PropertyResourceBundle(PropertyResourceBundle var1, UTF8ResourceBundle.NamelessClass1562182941 var2) {
         this(var1);
      }
   }
}
