package org.apache.poi.ss.usermodel;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.ConditionalFormattingThreshold;

public interface ColorScaleFormatting {

   int getNumControlPoints();

   void setNumControlPoints(int var1);

   Color[] getColors();

   void setColors(Color[] var1);

   ConditionalFormattingThreshold[] getThresholds();

   void setThresholds(ConditionalFormattingThreshold[] var1);

   ConditionalFormattingThreshold createThreshold();
}
