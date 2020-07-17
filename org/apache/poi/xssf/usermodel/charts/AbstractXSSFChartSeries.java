package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.ChartSeries;
import org.apache.poi.ss.usermodel.charts.TitleType;
import org.apache.poi.ss.util.CellReference;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx;

public abstract class AbstractXSSFChartSeries implements ChartSeries {

   private String titleValue;
   private CellReference titleRef;
   private TitleType titleType;


   public void setTitle(CellReference titleReference) {
      this.titleType = TitleType.CELL_REFERENCE;
      this.titleRef = titleReference;
   }

   public void setTitle(String title) {
      this.titleType = TitleType.STRING;
      this.titleValue = title;
   }

   public CellReference getTitleCellReference() {
      if(TitleType.CELL_REFERENCE.equals(this.titleType)) {
         return this.titleRef;
      } else {
         throw new IllegalStateException("Title type is not CellReference.");
      }
   }

   public String getTitleString() {
      if(TitleType.STRING.equals(this.titleType)) {
         return this.titleValue;
      } else {
         throw new IllegalStateException("Title type is not String.");
      }
   }

   public TitleType getTitleType() {
      return this.titleType;
   }

   protected boolean isTitleSet() {
      return this.titleType != null;
   }

   protected CTSerTx getCTSerTx() {
      CTSerTx tx = CTSerTx.Factory.newInstance();
      switch(AbstractXSSFChartSeries.NamelessClass1796215163.$SwitchMap$org$apache$poi$ss$usermodel$charts$TitleType[this.titleType.ordinal()]) {
      case 1:
         tx.addNewStrRef().setF(this.titleRef.formatAsString());
         return tx;
      case 2:
         tx.setV(this.titleValue);
         return tx;
      default:
         throw new IllegalStateException("Unkown title type: " + this.titleType);
      }
   }

   // $FF: synthetic class
   static class NamelessClass1796215163 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$TitleType = new int[TitleType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$TitleType[TitleType.CELL_REFERENCE.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$TitleType[TitleType.STRING.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
