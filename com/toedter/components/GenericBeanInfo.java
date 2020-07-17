package com.toedter.components;

import com.toedter.components.LocaleEditor;
import java.awt.Image;
import java.beans.PropertyEditorManager;
import java.beans.SimpleBeanInfo;
import java.util.Locale;

public class GenericBeanInfo extends SimpleBeanInfo {

   protected Image iconColor16;
   protected Image iconColor32;
   protected Image iconMono16;
   protected Image iconMono32;


   public GenericBeanInfo(String var1, boolean var2) {
      try {
         this.iconColor16 = this.loadImage("images/" + var1 + "Color16.gif");
         this.iconColor32 = this.loadImage("images/" + var1 + "Color32.gif");
         this.iconMono16 = this.loadImage("images/" + var1 + "Mono16.gif");
         this.iconMono32 = this.loadImage("images/" + var1 + "Mono32.gif");
      } catch (RuntimeException var4) {
         System.out.println("GenericBeanInfo.GenericBeanInfo(): " + var4);
      }

      if(var2) {
         PropertyEditorManager.registerEditor(Locale.class, LocaleEditor.class);
      }

   }

   public Image getIcon(int var1) {
      switch(var1) {
      case 1:
         return this.iconColor16;
      case 2:
         return this.iconColor32;
      case 3:
         return this.iconMono16;
      case 4:
         return this.iconMono32;
      default:
         return null;
      }
   }
}
