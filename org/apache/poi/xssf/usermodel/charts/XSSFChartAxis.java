package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.AxisCrosses;
import org.apache.poi.ss.usermodel.charts.AxisOrientation;
import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.AxisTickMark;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark;
import org.openxmlformats.schemas.drawingml.x2006.chart.STAxPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.STCrosses;
import org.openxmlformats.schemas.drawingml.x2006.chart.STOrientation;
import org.openxmlformats.schemas.drawingml.x2006.chart.STTickMark;

public abstract class XSSFChartAxis implements ChartAxis {

   protected XSSFChart chart;
   private static final double MIN_LOG_BASE = 2.0D;
   private static final double MAX_LOG_BASE = 1000.0D;


   protected XSSFChartAxis(XSSFChart chart) {
      this.chart = chart;
   }

   public AxisPosition getPosition() {
      return toAxisPosition(this.getCTAxPos());
   }

   public void setPosition(AxisPosition position) {
      this.getCTAxPos().setVal(fromAxisPosition(position));
   }

   public void setNumberFormat(String format) {
      this.getCTNumFmt().setFormatCode(format);
      this.getCTNumFmt().setSourceLinked(true);
   }

   public String getNumberFormat() {
      return this.getCTNumFmt().getFormatCode();
   }

   public boolean isSetLogBase() {
      return this.getCTScaling().isSetLogBase();
   }

   public void setLogBase(double logBase) {
      if(logBase >= 2.0D && 1000.0D >= logBase) {
         CTScaling scaling = this.getCTScaling();
         if(scaling.isSetLogBase()) {
            scaling.getLogBase().setVal(logBase);
         } else {
            scaling.addNewLogBase().setVal(logBase);
         }

      } else {
         throw new IllegalArgumentException("Axis log base must be between 2 and 1000 (inclusive), got: " + logBase);
      }
   }

   public double getLogBase() {
      CTLogBase logBase = this.getCTScaling().getLogBase();
      return logBase != null?logBase.getVal():0.0D;
   }

   public boolean isSetMinimum() {
      return this.getCTScaling().isSetMin();
   }

   public void setMinimum(double min) {
      CTScaling scaling = this.getCTScaling();
      if(scaling.isSetMin()) {
         scaling.getMin().setVal(min);
      } else {
         scaling.addNewMin().setVal(min);
      }

   }

   public double getMinimum() {
      CTScaling scaling = this.getCTScaling();
      return scaling.isSetMin()?scaling.getMin().getVal():0.0D;
   }

   public boolean isSetMaximum() {
      return this.getCTScaling().isSetMax();
   }

   public void setMaximum(double max) {
      CTScaling scaling = this.getCTScaling();
      if(scaling.isSetMax()) {
         scaling.getMax().setVal(max);
      } else {
         scaling.addNewMax().setVal(max);
      }

   }

   public double getMaximum() {
      CTScaling scaling = this.getCTScaling();
      return scaling.isSetMax()?scaling.getMax().getVal():0.0D;
   }

   public AxisOrientation getOrientation() {
      return toAxisOrientation(this.getCTScaling().getOrientation());
   }

   public void setOrientation(AxisOrientation orientation) {
      CTScaling scaling = this.getCTScaling();
      STOrientation.Enum stOrientation = fromAxisOrientation(orientation);
      if(scaling.isSetOrientation()) {
         scaling.getOrientation().setVal(stOrientation);
      } else {
         this.getCTScaling().addNewOrientation().setVal(stOrientation);
      }

   }

   public AxisCrosses getCrosses() {
      return toAxisCrosses(this.getCTCrosses());
   }

   public void setCrosses(AxisCrosses crosses) {
      this.getCTCrosses().setVal(fromAxisCrosses(crosses));
   }

   public boolean isVisible() {
      return !this.getDelete().getVal();
   }

   public void setVisible(boolean value) {
      this.getDelete().setVal(!value);
   }

   public AxisTickMark getMajorTickMark() {
      return toAxisTickMark(this.getMajorCTTickMark());
   }

   public void setMajorTickMark(AxisTickMark tickMark) {
      this.getMajorCTTickMark().setVal(fromAxisTickMark(tickMark));
   }

   public AxisTickMark getMinorTickMark() {
      return toAxisTickMark(this.getMinorCTTickMark());
   }

   public void setMinorTickMark(AxisTickMark tickMark) {
      this.getMinorCTTickMark().setVal(fromAxisTickMark(tickMark));
   }

   protected abstract CTAxPos getCTAxPos();

   protected abstract CTNumFmt getCTNumFmt();

   protected abstract CTScaling getCTScaling();

   protected abstract CTCrosses getCTCrosses();

   protected abstract CTBoolean getDelete();

   protected abstract CTTickMark getMajorCTTickMark();

   protected abstract CTTickMark getMinorCTTickMark();

   private static STOrientation.Enum fromAxisOrientation(AxisOrientation orientation) {
      switch(XSSFChartAxis.NamelessClass2019013939.$SwitchMap$org$apache$poi$ss$usermodel$charts$AxisOrientation[orientation.ordinal()]) {
      case 1:
         return STOrientation.MIN_MAX;
      case 2:
         return STOrientation.MAX_MIN;
      default:
         throw new IllegalArgumentException();
      }
   }

   private static AxisOrientation toAxisOrientation(CTOrientation ctOrientation) {
      switch(ctOrientation.getVal().intValue()) {
      case 1:
         return AxisOrientation.MAX_MIN;
      case 2:
         return AxisOrientation.MIN_MAX;
      default:
         throw new IllegalArgumentException();
      }
   }

   private static STCrosses.Enum fromAxisCrosses(AxisCrosses crosses) {
      switch(XSSFChartAxis.NamelessClass2019013939.$SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrosses[crosses.ordinal()]) {
      case 1:
         return STCrosses.AUTO_ZERO;
      case 2:
         return STCrosses.MIN;
      case 3:
         return STCrosses.MAX;
      default:
         throw new IllegalArgumentException();
      }
   }

   private static AxisCrosses toAxisCrosses(CTCrosses ctCrosses) {
      switch(ctCrosses.getVal().intValue()) {
      case 1:
         return AxisCrosses.AUTO_ZERO;
      case 2:
         return AxisCrosses.MAX;
      case 3:
         return AxisCrosses.MIN;
      default:
         throw new IllegalArgumentException();
      }
   }

   private static STAxPos.Enum fromAxisPosition(AxisPosition position) {
      switch(XSSFChartAxis.NamelessClass2019013939.$SwitchMap$org$apache$poi$ss$usermodel$charts$AxisPosition[position.ordinal()]) {
      case 1:
         return STAxPos.B;
      case 2:
         return STAxPos.L;
      case 3:
         return STAxPos.R;
      case 4:
         return STAxPos.T;
      default:
         throw new IllegalArgumentException();
      }
   }

   private static AxisPosition toAxisPosition(CTAxPos ctAxPos) {
      switch(ctAxPos.getVal().intValue()) {
      case 1:
         return AxisPosition.BOTTOM;
      case 2:
         return AxisPosition.LEFT;
      case 3:
         return AxisPosition.RIGHT;
      case 4:
         return AxisPosition.TOP;
      default:
         return AxisPosition.BOTTOM;
      }
   }

   private static STTickMark.Enum fromAxisTickMark(AxisTickMark tickMark) {
      switch(XSSFChartAxis.NamelessClass2019013939.$SwitchMap$org$apache$poi$ss$usermodel$charts$AxisTickMark[tickMark.ordinal()]) {
      case 1:
         return STTickMark.NONE;
      case 2:
         return STTickMark.IN;
      case 3:
         return STTickMark.OUT;
      case 4:
         return STTickMark.CROSS;
      default:
         throw new IllegalArgumentException("Unknown AxisTickMark: " + tickMark);
      }
   }

   private static AxisTickMark toAxisTickMark(CTTickMark ctTickMark) {
      switch(ctTickMark.getVal().intValue()) {
      case 1:
         return AxisTickMark.CROSS;
      case 2:
         return AxisTickMark.IN;
      case 3:
         return AxisTickMark.NONE;
      case 4:
         return AxisTickMark.OUT;
      default:
         return AxisTickMark.CROSS;
      }
   }

   // $FF: synthetic class
   static class NamelessClass2019013939 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisOrientation;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrosses;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisPosition;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisTickMark = new int[AxisTickMark.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisTickMark[AxisTickMark.NONE.ordinal()] = 1;
         } catch (NoSuchFieldError var13) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisTickMark[AxisTickMark.IN.ordinal()] = 2;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisTickMark[AxisTickMark.OUT.ordinal()] = 3;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisTickMark[AxisTickMark.CROSS.ordinal()] = 4;
         } catch (NoSuchFieldError var10) {
            ;
         }

         $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisPosition = new int[AxisPosition.values().length];

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisPosition[AxisPosition.BOTTOM.ordinal()] = 1;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisPosition[AxisPosition.LEFT.ordinal()] = 2;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisPosition[AxisPosition.RIGHT.ordinal()] = 3;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisPosition[AxisPosition.TOP.ordinal()] = 4;
         } catch (NoSuchFieldError var6) {
            ;
         }

         $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrosses = new int[AxisCrosses.values().length];

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrosses[AxisCrosses.AUTO_ZERO.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrosses[AxisCrosses.MIN.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrosses[AxisCrosses.MAX.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisOrientation = new int[AxisOrientation.values().length];

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisOrientation[AxisOrientation.MIN_MAX.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisOrientation[AxisOrientation.MAX_MIN.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
