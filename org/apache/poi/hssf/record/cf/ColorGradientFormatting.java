package org.apache.poi.hssf.record.cf;

import org.apache.poi.hssf.record.cf.ColorGradientThreshold;
import org.apache.poi.hssf.record.common.ExtendedColor;
import org.apache.poi.util.BitField;
import org.apache.poi.util.BitFieldFactory;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class ColorGradientFormatting implements Cloneable {

   private static POILogger log = POILogFactory.getLogger(ColorGradientFormatting.class);
   private byte options = 0;
   private ColorGradientThreshold[] thresholds;
   private ExtendedColor[] colors;
   private static BitField clamp = BitFieldFactory.getInstance(1);
   private static BitField background = BitFieldFactory.getInstance(2);


   public ColorGradientFormatting() {
      this.options = 3;
      this.thresholds = new ColorGradientThreshold[3];
      this.colors = new ExtendedColor[3];
   }

   public ColorGradientFormatting(LittleEndianInput in) {
      in.readShort();
      in.readByte();
      byte numI = in.readByte();
      byte numG = in.readByte();
      if(numI != numG) {
         log.log(5, new Object[]{"Inconsistent Color Gradient defintion, found " + numI + " vs " + numG + " entries"});
      }

      this.options = in.readByte();
      this.thresholds = new ColorGradientThreshold[numI];

      int i;
      for(i = 0; i < this.thresholds.length; ++i) {
         this.thresholds[i] = new ColorGradientThreshold(in);
      }

      this.colors = new ExtendedColor[numG];

      for(i = 0; i < this.colors.length; ++i) {
         in.readDouble();
         this.colors[i] = new ExtendedColor(in);
      }

   }

   public int getNumControlPoints() {
      return this.thresholds.length;
   }

   public void setNumControlPoints(int num) {
      if(num != this.thresholds.length) {
         ColorGradientThreshold[] nt = new ColorGradientThreshold[num];
         ExtendedColor[] nc = new ExtendedColor[num];
         int copy = Math.min(this.thresholds.length, num);
         System.arraycopy(this.thresholds, 0, nt, 0, copy);
         System.arraycopy(this.colors, 0, nc, 0, copy);
         this.thresholds = nt;
         this.colors = nc;
         this.updateThresholdPositions();
      }

   }

   public ColorGradientThreshold[] getThresholds() {
      return this.thresholds;
   }

   public void setThresholds(ColorGradientThreshold[] thresholds) {
      this.thresholds = thresholds == null?null:(ColorGradientThreshold[])thresholds.clone();
      this.updateThresholdPositions();
   }

   public ExtendedColor[] getColors() {
      return this.colors;
   }

   public void setColors(ExtendedColor[] colors) {
      this.colors = colors == null?null:(ExtendedColor[])colors.clone();
   }

   public boolean isClampToCurve() {
      return this.getOptionFlag(clamp);
   }

   public boolean isAppliesToBackground() {
      return this.getOptionFlag(background);
   }

   private boolean getOptionFlag(BitField field) {
      int value = field.getValue(this.options);
      return value != 0;
   }

   private void updateThresholdPositions() {
      double step = 1.0D / (double)(this.thresholds.length - 1);

      for(int i = 0; i < this.thresholds.length; ++i) {
         this.thresholds[i].setPosition(step * (double)i);
      }

   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("    [Color Gradient Formatting]\n");
      buffer.append("          .clamp     = ").append(this.isClampToCurve()).append("\n");
      buffer.append("          .background= ").append(this.isAppliesToBackground()).append("\n");
      ColorGradientThreshold[] arr$ = this.thresholds;
      int len$ = arr$.length;

      int i$;
      for(i$ = 0; i$ < len$; ++i$) {
         ColorGradientThreshold c = arr$[i$];
         buffer.append(c.toString());
      }

      ExtendedColor[] var6 = this.colors;
      len$ = var6.length;

      for(i$ = 0; i$ < len$; ++i$) {
         ExtendedColor var7 = var6[i$];
         buffer.append(var7.toString());
      }

      buffer.append("    [/Color Gradient Formatting]\n");
      return buffer.toString();
   }

   public Object clone() {
      ColorGradientFormatting rec = new ColorGradientFormatting();
      rec.options = this.options;
      rec.thresholds = new ColorGradientThreshold[this.thresholds.length];
      rec.colors = new ExtendedColor[this.colors.length];
      System.arraycopy(this.thresholds, 0, rec.thresholds, 0, this.thresholds.length);
      System.arraycopy(this.colors, 0, rec.colors, 0, this.colors.length);
      return rec;
   }

   public int getDataLength() {
      int len = 6;
      ColorGradientThreshold[] arr$ = this.thresholds;
      int len$ = arr$.length;

      int i$;
      for(i$ = 0; i$ < len$; ++i$) {
         ColorGradientThreshold c = arr$[i$];
         len += c.getDataLength();
      }

      ExtendedColor[] var6 = this.colors;
      len$ = var6.length;

      for(i$ = 0; i$ < len$; ++i$) {
         ExtendedColor var7 = var6[i$];
         len += var7.getDataLength();
         len += 8;
      }

      return len;
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(0);
      out.writeByte(0);
      out.writeByte(this.thresholds.length);
      out.writeByte(this.thresholds.length);
      out.writeByte(this.options);
      ColorGradientThreshold[] step = this.thresholds;
      int len$ = step.length;

      int i;
      for(i = 0; i < len$; ++i) {
         ColorGradientThreshold c = step[i];
         c.serialize(out);
      }

      double var6 = 1.0D / (double)(this.colors.length - 1);

      for(i = 0; i < this.colors.length; ++i) {
         out.writeDouble((double)i * var6);
         ExtendedColor var7 = this.colors[i];
         var7.serialize(out);
      }

   }

}
