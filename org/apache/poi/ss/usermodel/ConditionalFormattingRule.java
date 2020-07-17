package org.apache.poi.ss.usermodel;

import org.apache.poi.ss.usermodel.BorderFormatting;
import org.apache.poi.ss.usermodel.ColorScaleFormatting;
import org.apache.poi.ss.usermodel.ConditionType;
import org.apache.poi.ss.usermodel.DataBarFormatting;
import org.apache.poi.ss.usermodel.FontFormatting;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.apache.poi.ss.usermodel.PatternFormatting;

public interface ConditionalFormattingRule {

   BorderFormatting createBorderFormatting();

   BorderFormatting getBorderFormatting();

   FontFormatting createFontFormatting();

   FontFormatting getFontFormatting();

   PatternFormatting createPatternFormatting();

   PatternFormatting getPatternFormatting();

   DataBarFormatting getDataBarFormatting();

   IconMultiStateFormatting getMultiStateFormatting();

   ColorScaleFormatting getColorScaleFormatting();

   ConditionType getConditionType();

   byte getComparisonOperation();

   String getFormula1();

   String getFormula2();
}
