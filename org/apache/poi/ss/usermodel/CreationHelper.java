package org.apache.poi.ss.usermodel;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.util.Removal;

public interface CreationHelper {

   RichTextString createRichTextString(String var1);

   DataFormat createDataFormat();

   @Removal(
      version = "3.17"
   )
   @Deprecated
   Hyperlink createHyperlink(int var1);

   Hyperlink createHyperlink(HyperlinkType var1);

   FormulaEvaluator createFormulaEvaluator();

   ExtendedColor createExtendedColor();

   ClientAnchor createClientAnchor();
}
