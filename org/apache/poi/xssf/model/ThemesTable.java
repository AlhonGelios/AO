package org.apache.poi.xssf.model;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

public class ThemesTable extends POIXMLDocumentPart {

   private ThemeDocument theme;


   public ThemesTable() {
      this.theme = ThemeDocument.Factory.newInstance();
      this.theme.addNewTheme().addNewThemeElements();
   }

   public ThemesTable(PackagePart part) throws IOException {
      super(part);

      try {
         this.theme = ThemeDocument.Factory.parse(part.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage(), var3);
      }
   }

   @Deprecated
   public ThemesTable(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public ThemesTable(ThemeDocument theme) {
      this.theme = theme;
   }

   public XSSFColor getThemeColor(int idx) {
      CTColorScheme colorScheme = this.theme.getTheme().getThemeElements().getClrScheme();
      CTColor ctColor;
      switch(ThemesTable.NamelessClass2054613534.$SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.byId(idx).ordinal()]) {
      case 1:
         ctColor = colorScheme.getLt1();
         break;
      case 2:
         ctColor = colorScheme.getDk1();
         break;
      case 3:
         ctColor = colorScheme.getLt2();
         break;
      case 4:
         ctColor = colorScheme.getDk2();
         break;
      case 5:
         ctColor = colorScheme.getAccent1();
         break;
      case 6:
         ctColor = colorScheme.getAccent2();
         break;
      case 7:
         ctColor = colorScheme.getAccent3();
         break;
      case 8:
         ctColor = colorScheme.getAccent4();
         break;
      case 9:
         ctColor = colorScheme.getAccent5();
         break;
      case 10:
         ctColor = colorScheme.getAccent6();
         break;
      case 11:
         ctColor = colorScheme.getHlink();
         break;
      case 12:
         ctColor = colorScheme.getFolHlink();
         break;
      default:
         return null;
      }

      Object rgb = null;
      byte[] rgb1;
      if(ctColor.isSetSrgbClr()) {
         rgb1 = ctColor.getSrgbClr().getVal();
      } else {
         if(!ctColor.isSetSysClr()) {
            return null;
         }

         rgb1 = ctColor.getSysClr().getLastClr();
      }

      return new XSSFColor(rgb1);
   }

   public void inheritFromThemeAsRequired(XSSFColor color) {
      if(color != null) {
         if(color.getCTColor().isSetTheme()) {
            XSSFColor themeColor = this.getThemeColor(color.getTheme());
            color.getCTColor().setRgb(themeColor.getCTColor().getRgb());
         }
      }
   }

   public void writeTo(OutputStream out) throws IOException {
      this.theme.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }

   public static enum ThemeElement {

      LT1("LT1", 0, 0, "Lt1"),
      DK1("DK1", 1, 1, "Dk1"),
      LT2("LT2", 2, 2, "Lt2"),
      DK2("DK2", 3, 3, "Dk2"),
      ACCENT1("ACCENT1", 4, 4, "Accent1"),
      ACCENT2("ACCENT2", 5, 5, "Accent2"),
      ACCENT3("ACCENT3", 6, 6, "Accent3"),
      ACCENT4("ACCENT4", 7, 7, "Accent4"),
      ACCENT5("ACCENT5", 8, 8, "Accent5"),
      ACCENT6("ACCENT6", 9, 9, "Accent6"),
      HLINK("HLINK", 10, 10, "Hlink"),
      FOLHLINK("FOLHLINK", 11, 11, "FolHlink"),
      UNKNOWN("UNKNOWN", 12, -1, (String)null);
      public final int idx;
      public final String name;
      // $FF: synthetic field
      private static final ThemesTable.ThemeElement[] $VALUES = new ThemesTable.ThemeElement[]{LT1, DK1, LT2, DK2, ACCENT1, ACCENT2, ACCENT3, ACCENT4, ACCENT5, ACCENT6, HLINK, FOLHLINK, UNKNOWN};


      public static ThemesTable.ThemeElement byId(int idx) {
         return idx < values().length && idx >= 0?values()[idx]:UNKNOWN;
      }

      private ThemeElement(String var1, int var2, int idx, String name) {
         this.idx = idx;
         this.name = name;
      }

   }

   // $FF: synthetic class
   static class NamelessClass2054613534 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement = new int[ThemesTable.ThemeElement.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.LT1.ordinal()] = 1;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.DK1.ordinal()] = 2;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.LT2.ordinal()] = 3;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.DK2.ordinal()] = 4;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.ACCENT1.ordinal()] = 5;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.ACCENT2.ordinal()] = 6;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.ACCENT3.ordinal()] = 7;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.ACCENT4.ordinal()] = 8;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.ACCENT5.ordinal()] = 9;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.ACCENT6.ordinal()] = 10;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.HLINK.ordinal()] = 11;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$model$ThemesTable$ThemeElement[ThemesTable.ThemeElement.FOLHLINK.ordinal()] = 12;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
