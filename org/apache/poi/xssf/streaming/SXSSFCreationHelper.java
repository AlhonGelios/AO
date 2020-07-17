package org.apache.poi.xssf.streaming;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.util.Internal;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.streaming.SXSSFFormulaEvaluator;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

public class SXSSFCreationHelper implements CreationHelper {

   private static final POILogger logger = POILogFactory.getLogger(SXSSFCreationHelper.class);
   private final SXSSFWorkbook wb;
   private final XSSFCreationHelper helper;


   @Internal
   public SXSSFCreationHelper(SXSSFWorkbook workbook) {
      this.helper = new XSSFCreationHelper(workbook.getXSSFWorkbook());
      this.wb = workbook;
   }

   public XSSFRichTextString createRichTextString(String text) {
      logger.log(3, new Object[]{"SXSSF doesn\'t support Rich Text Strings, any formatting information will be lost"});
      return new XSSFRichTextString(text);
   }

   public SXSSFFormulaEvaluator createFormulaEvaluator() {
      return new SXSSFFormulaEvaluator(this.wb);
   }

   public DataFormat createDataFormat() {
      return this.helper.createDataFormat();
   }

   @Deprecated
   @Removal(
      version = "3.17"
   )
   public Hyperlink createHyperlink(int type) {
      return this.helper.createHyperlink(type);
   }

   public Hyperlink createHyperlink(HyperlinkType type) {
      return this.helper.createHyperlink(type);
   }

   public ExtendedColor createExtendedColor() {
      return this.helper.createExtendedColor();
   }

   public ClientAnchor createClientAnchor() {
      return this.helper.createClientAnchor();
   }

}
