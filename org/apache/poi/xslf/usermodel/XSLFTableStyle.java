package org.apache.poi.xslf.usermodel;

import org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle;

public class XSLFTableStyle {

   private CTTableStyle _tblStyle;


   XSLFTableStyle(CTTableStyle style) {
      this._tblStyle = style;
   }

   public CTTableStyle getXmlObject() {
      return this._tblStyle;
   }

   public String getStyleName() {
      return this._tblStyle.getStyleName();
   }

   public String getStyleId() {
      return this._tblStyle.getStyleId();
   }

   protected CTTablePartStyle getTablePartStyle(XSLFTableStyle.TablePartStyle tps) {
      switch(XSLFTableStyle.NamelessClass229010234.$SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[tps.ordinal()]) {
      case 1:
      default:
         return this._tblStyle.getWholeTbl();
      case 2:
         return this._tblStyle.getBand1H();
      case 3:
         return this._tblStyle.getBand2H();
      case 4:
         return this._tblStyle.getBand1V();
      case 5:
         return this._tblStyle.getBand2V();
      case 6:
         return this._tblStyle.getFirstCol();
      case 7:
         return this._tblStyle.getLastCol();
      case 8:
         return this._tblStyle.getFirstRow();
      case 9:
         return this._tblStyle.getLastRow();
      case 10:
         return this._tblStyle.getSeCell();
      case 11:
         return this._tblStyle.getSwCell();
      case 12:
         return this._tblStyle.getNeCell();
      case 13:
         return this._tblStyle.getNwCell();
      }
   }

   // $FF: synthetic class
   static class NamelessClass229010234 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle = new int[XSLFTableStyle.TablePartStyle.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.wholeTbl.ordinal()] = 1;
         } catch (NoSuchFieldError var13) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.band1H.ordinal()] = 2;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.band2H.ordinal()] = 3;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.band1V.ordinal()] = 4;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.band2V.ordinal()] = 5;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.firstCol.ordinal()] = 6;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.lastCol.ordinal()] = 7;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.firstRow.ordinal()] = 8;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.lastRow.ordinal()] = 9;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.seCell.ordinal()] = 10;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.swCell.ordinal()] = 11;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.neCell.ordinal()] = 12;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xslf$usermodel$XSLFTableStyle$TablePartStyle[XSLFTableStyle.TablePartStyle.nwCell.ordinal()] = 13;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   public static enum TablePartStyle {

      wholeTbl("wholeTbl", 0),
      band1H("band1H", 1),
      band2H("band2H", 2),
      band1V("band1V", 3),
      band2V("band2V", 4),
      firstCol("firstCol", 5),
      lastCol("lastCol", 6),
      firstRow("firstRow", 7),
      lastRow("lastRow", 8),
      seCell("seCell", 9),
      swCell("swCell", 10),
      neCell("neCell", 11),
      nwCell("nwCell", 12);
      // $FF: synthetic field
      private static final XSLFTableStyle.TablePartStyle[] $VALUES = new XSLFTableStyle.TablePartStyle[]{wholeTbl, band1H, band2H, band1V, band2V, firstCol, lastCol, firstRow, lastRow, seCell, swCell, neCell, nwCell};


      private TablePartStyle(String var1, int var2) {}

   }
}
