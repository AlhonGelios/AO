package org.apache.poi.xssf.extractor;

import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.extractor.ExcelExtractor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.HeaderFooter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSimpleShape;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.XmlException;

public class XSSFExcelExtractor extends POIXMLTextExtractor implements ExcelExtractor {

   public static final XSSFRelation[] SUPPORTED_TYPES = new XSSFRelation[]{XSSFRelation.WORKBOOK, XSSFRelation.MACRO_TEMPLATE_WORKBOOK, XSSFRelation.MACRO_ADDIN_WORKBOOK, XSSFRelation.TEMPLATE_WORKBOOK, XSSFRelation.MACROS_WORKBOOK};
   private Locale locale;
   private XSSFWorkbook workbook;
   private boolean includeSheetNames;
   private boolean formulasNotResults;
   private boolean includeCellComments;
   private boolean includeHeadersFooters;
   private boolean includeTextBoxes;


   public XSSFExcelExtractor(OPCPackage container) throws XmlException, OpenXML4JException, IOException {
      this(new XSSFWorkbook(container));
   }

   public XSSFExcelExtractor(XSSFWorkbook workbook) {
      super(workbook);
      this.includeSheetNames = true;
      this.formulasNotResults = false;
      this.includeCellComments = false;
      this.includeHeadersFooters = true;
      this.includeTextBoxes = true;
      this.workbook = workbook;
   }

   public static void main(String[] args) throws Exception {
      if(args.length < 1) {
         System.err.println("Use:");
         System.err.println("  XSSFExcelExtractor <filename.xlsx>");
         System.exit(1);
      }

      OPCPackage pkg = OPCPackage.create(args[0]);
      XSSFExcelExtractor extractor = new XSSFExcelExtractor(pkg);

      try {
         System.out.println(extractor.getText());
      } finally {
         extractor.close();
      }

   }

   public void setIncludeSheetNames(boolean includeSheetNames) {
      this.includeSheetNames = includeSheetNames;
   }

   public void setFormulasNotResults(boolean formulasNotResults) {
      this.formulasNotResults = formulasNotResults;
   }

   public void setIncludeCellComments(boolean includeCellComments) {
      this.includeCellComments = includeCellComments;
   }

   public void setIncludeHeadersFooters(boolean includeHeadersFooters) {
      this.includeHeadersFooters = includeHeadersFooters;
   }

   public void setIncludeTextBoxes(boolean includeTextBoxes) {
      this.includeTextBoxes = includeTextBoxes;
   }

   public void setLocale(Locale locale) {
      this.locale = locale;
   }

   public String getText() {
      DataFormatter formatter;
      if(this.locale == null) {
         formatter = new DataFormatter();
      } else {
         formatter = new DataFormatter(this.locale);
      }

      StringBuffer text = new StringBuffer();
      Iterator i$ = this.workbook.iterator();

      while(i$.hasNext()) {
         Sheet sh = (Sheet)i$.next();
         XSSFSheet sheet = (XSSFSheet)sh;
         if(this.includeSheetNames) {
            text.append(sheet.getSheetName()).append("\n");
         }

         if(this.includeHeadersFooters) {
            text.append(this.extractHeaderFooter(sheet.getFirstHeader()));
            text.append(this.extractHeaderFooter(sheet.getOddHeader()));
            text.append(this.extractHeaderFooter(sheet.getEvenHeader()));
         }

         Iterator drawing = sheet.iterator();

         while(drawing.hasNext()) {
            Object i$1 = drawing.next();
            Row shape = (Row)i$1;
            Iterator boxText = shape.cellIterator();

            while(boxText.hasNext()) {
               Cell cell = (Cell)boxText.next();
               if(cell.getCellTypeEnum() == CellType.FORMULA) {
                  if(this.formulasNotResults) {
                     String comment = cell.getCellFormula();
                     this.checkMaxTextSize(text, comment);
                     text.append(comment);
                  } else if(cell.getCachedFormulaResultTypeEnum() == CellType.STRING) {
                     this.handleStringCell(text, cell);
                  } else {
                     this.handleNonStringCell(text, cell, formatter);
                  }
               } else if(cell.getCellTypeEnum() == CellType.STRING) {
                  this.handleStringCell(text, cell);
               } else {
                  this.handleNonStringCell(text, cell, formatter);
               }

               Comment comment1 = cell.getCellComment();
               if(this.includeCellComments && comment1 != null) {
                  String commentText = comment1.getString().getString().replace('\n', ' ');
                  this.checkMaxTextSize(text, commentText);
                  text.append(" Comment by ").append(comment1.getAuthor()).append(": ").append(commentText);
               }

               if(boxText.hasNext()) {
                  text.append("\t");
               }
            }

            text.append("\n");
         }

         if(this.includeTextBoxes) {
            XSSFDrawing drawing1 = sheet.getDrawingPatriarch();
            if(drawing1 != null) {
               Iterator i$2 = drawing1.getShapes().iterator();

               while(i$2.hasNext()) {
                  XSSFShape shape1 = (XSSFShape)i$2.next();
                  if(shape1 instanceof XSSFSimpleShape) {
                     String boxText1 = ((XSSFSimpleShape)shape1).getText();
                     if(boxText1.length() > 0) {
                        text.append(boxText1);
                        text.append('\n');
                     }
                  }
               }
            }
         }

         if(this.includeHeadersFooters) {
            text.append(this.extractHeaderFooter(sheet.getFirstFooter()));
            text.append(this.extractHeaderFooter(sheet.getOddFooter()));
            text.append(this.extractHeaderFooter(sheet.getEvenFooter()));
         }
      }

      return text.toString();
   }

   private void handleStringCell(StringBuffer text, Cell cell) {
      String contents = cell.getRichStringCellValue().getString();
      this.checkMaxTextSize(text, contents);
      text.append(contents);
   }

   private void handleNonStringCell(StringBuffer text, Cell cell, DataFormatter formatter) {
      CellType type = cell.getCellTypeEnum();
      if(type == CellType.FORMULA) {
         type = cell.getCachedFormulaResultTypeEnum();
      }

      if(type == CellType.NUMERIC) {
         CellStyle contents = cell.getCellStyle();
         if(contents != null && contents.getDataFormatString() != null) {
            String contents1 = formatter.formatRawCellContents(cell.getNumericCellValue(), contents.getDataFormat(), contents.getDataFormatString());
            this.checkMaxTextSize(text, contents1);
            text.append(contents1);
            return;
         }
      }

      String contents2 = ((XSSFCell)cell).getRawValue();
      this.checkMaxTextSize(text, contents2);
      text.append(contents2);
   }

   private String extractHeaderFooter(HeaderFooter hf) {
      return org.apache.poi.hssf.extractor.ExcelExtractor._extractHeaderFooter(hf);
   }

}
