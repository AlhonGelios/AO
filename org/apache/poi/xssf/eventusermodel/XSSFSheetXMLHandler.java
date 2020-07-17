package org.apache.poi.xssf.eventusermodel;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.poi.ss.usermodel.BuiltinFormats;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable;
import org.apache.poi.xssf.model.CommentsTable;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XSSFSheetXMLHandler extends DefaultHandler {

   private static final POILogger logger = POILogFactory.getLogger(XSSFSheetXMLHandler.class);
   private StylesTable stylesTable;
   private CommentsTable commentsTable;
   private ReadOnlySharedStringsTable sharedStringsTable;
   private final XSSFSheetXMLHandler.SheetContentsHandler output;
   private boolean vIsOpen;
   private boolean fIsOpen;
   private boolean isIsOpen;
   private boolean hfIsOpen;
   private XSSFSheetXMLHandler.xssfDataType nextDataType;
   private short formatIndex;
   private String formatString;
   private final DataFormatter formatter;
   private int rowNum;
   private int nextRowNum;
   private String cellRef;
   private boolean formulasNotResults;
   private StringBuffer value;
   private StringBuffer formula;
   private StringBuffer headerFooter;
   private Queue commentCellRefs;


   public XSSFSheetXMLHandler(StylesTable styles, CommentsTable comments, ReadOnlySharedStringsTable strings, XSSFSheetXMLHandler.SheetContentsHandler sheetContentsHandler, DataFormatter dataFormatter, boolean formulasNotResults) {
      this.value = new StringBuffer();
      this.formula = new StringBuffer();
      this.headerFooter = new StringBuffer();
      this.stylesTable = styles;
      this.commentsTable = comments;
      this.sharedStringsTable = strings;
      this.output = sheetContentsHandler;
      this.formulasNotResults = formulasNotResults;
      this.nextDataType = XSSFSheetXMLHandler.xssfDataType.NUMBER;
      this.formatter = dataFormatter;
      this.init();
   }

   public XSSFSheetXMLHandler(StylesTable styles, ReadOnlySharedStringsTable strings, XSSFSheetXMLHandler.SheetContentsHandler sheetContentsHandler, DataFormatter dataFormatter, boolean formulasNotResults) {
      this(styles, (CommentsTable)null, strings, sheetContentsHandler, dataFormatter, formulasNotResults);
   }

   public XSSFSheetXMLHandler(StylesTable styles, ReadOnlySharedStringsTable strings, XSSFSheetXMLHandler.SheetContentsHandler sheetContentsHandler, boolean formulasNotResults) {
      this(styles, strings, sheetContentsHandler, new DataFormatter(), formulasNotResults);
   }

   private void init() {
      if(this.commentsTable != null) {
         this.commentCellRefs = new LinkedList();
         CTComment[] arr$ = this.commentsTable.getCTComments().getCommentList().getCommentArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTComment comment = arr$[i$];
            this.commentCellRefs.add(new CellAddress(comment.getRef()));
         }
      }

   }

   private boolean isTextTag(String name) {
      return "v".equals(name)?true:("inlineStr".equals(name)?true:"t".equals(name) && this.isIsOpen);
   }

   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
      if(uri == null || uri.equals("http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
         if(this.isTextTag(localName)) {
            this.vIsOpen = true;
            this.value.setLength(0);
         } else if("is".equals(localName)) {
            this.isIsOpen = true;
         } else {
            String cellType;
            String cellStyleStr;
            if("f".equals(localName)) {
               this.formula.setLength(0);
               if(this.nextDataType == XSSFSheetXMLHandler.xssfDataType.NUMBER) {
                  this.nextDataType = XSSFSheetXMLHandler.xssfDataType.FORMULA;
               }

               cellType = attributes.getValue("t");
               if(cellType != null && cellType.equals("shared")) {
                  cellStyleStr = attributes.getValue("ref");
                  String style = attributes.getValue("si");
                  if(cellStyleStr != null) {
                     this.fIsOpen = true;
                  } else if(this.formulasNotResults) {
                     logger.log(5, new Object[]{"shared formulas not yet supported!"});
                  }
               } else {
                  this.fIsOpen = true;
               }
            } else if(!"oddHeader".equals(localName) && !"evenHeader".equals(localName) && !"firstHeader".equals(localName) && !"firstFooter".equals(localName) && !"oddFooter".equals(localName) && !"evenFooter".equals(localName)) {
               if("row".equals(localName)) {
                  cellType = attributes.getValue("r");
                  if(cellType != null) {
                     this.rowNum = Integer.parseInt(cellType) - 1;
                  } else {
                     this.rowNum = this.nextRowNum;
                  }

                  this.output.startRow(this.rowNum);
               } else if("c".equals(localName)) {
                  this.nextDataType = XSSFSheetXMLHandler.xssfDataType.NUMBER;
                  this.formatIndex = -1;
                  this.formatString = null;
                  this.cellRef = attributes.getValue("r");
                  cellType = attributes.getValue("t");
                  cellStyleStr = attributes.getValue("s");
                  if("b".equals(cellType)) {
                     this.nextDataType = XSSFSheetXMLHandler.xssfDataType.BOOLEAN;
                  } else if("e".equals(cellType)) {
                     this.nextDataType = XSSFSheetXMLHandler.xssfDataType.ERROR;
                  } else if("inlineStr".equals(cellType)) {
                     this.nextDataType = XSSFSheetXMLHandler.xssfDataType.INLINE_STRING;
                  } else if("s".equals(cellType)) {
                     this.nextDataType = XSSFSheetXMLHandler.xssfDataType.SST_STRING;
                  } else if("str".equals(cellType)) {
                     this.nextDataType = XSSFSheetXMLHandler.xssfDataType.FORMULA;
                  } else {
                     XSSFCellStyle style1 = null;
                     if(this.stylesTable != null) {
                        if(cellStyleStr != null) {
                           int styleIndex = Integer.parseInt(cellStyleStr);
                           style1 = this.stylesTable.getStyleAt(styleIndex);
                        } else if(this.stylesTable.getNumCellStyles() > 0) {
                           style1 = this.stylesTable.getStyleAt(0);
                        }
                     }

                     if(style1 != null) {
                        this.formatIndex = style1.getDataFormat();
                        this.formatString = style1.getDataFormatString();
                        if(this.formatString == null) {
                           this.formatString = BuiltinFormats.getBuiltinFormat(this.formatIndex);
                        }
                     }
                  }
               }
            } else {
               this.hfIsOpen = true;
               this.headerFooter.setLength(0);
            }
         }

      }
   }

   public void endElement(String uri, String localName, String qName) throws SAXException {
      if(uri == null || uri.equals("http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
         String thisStr = null;
         if(this.isTextTag(localName)) {
            this.vIsOpen = false;
            switch(XSSFSheetXMLHandler.NamelessClass845187186.$SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType[this.nextDataType.ordinal()]) {
            case 1:
               char comment = this.value.charAt(0);
               thisStr = comment == 48?"FALSE":"TRUE";
               break;
            case 2:
               thisStr = "ERROR:" + this.value.toString();
               break;
            case 3:
               if(this.formulasNotResults) {
                  thisStr = this.formula.toString();
               } else {
                  String rtsi1 = this.value.toString();
                  if(this.formatString != null) {
                     try {
                        double sstIndex1 = Double.parseDouble(rtsi1);
                        thisStr = this.formatter.formatRawCellContents(sstIndex1, this.formatIndex, this.formatString);
                     } catch (NumberFormatException var11) {
                        thisStr = rtsi1;
                     }
                  } else {
                     thisStr = rtsi1;
                  }
               }
               break;
            case 4:
               XSSFRichTextString rtsi = new XSSFRichTextString(this.value.toString());
               thisStr = rtsi.toString();
               break;
            case 5:
               String sstIndex = this.value.toString();

               try {
                  int n1 = Integer.parseInt(sstIndex);
                  XSSFRichTextString rtss = new XSSFRichTextString(this.sharedStringsTable.getEntryAt(n1));
                  thisStr = rtss.toString();
               } catch (NumberFormatException var10) {
                  logger.log(7, new Object[]{"Failed to parse SST index \'" + sstIndex, var10});
               }
               break;
            case 6:
               String n = this.value.toString();
               if(this.formatString != null && n.length() > 0) {
                  thisStr = this.formatter.formatRawCellContents(Double.parseDouble(n), this.formatIndex, this.formatString);
               } else {
                  thisStr = n;
               }
               break;
            default:
               thisStr = "(TODO: Unexpected type: " + this.nextDataType + ")";
            }

            this.checkForEmptyCellComments(XSSFSheetXMLHandler.EmptyCellCommentsCheckType.CELL);
            XSSFComment comment1 = this.commentsTable != null?this.commentsTable.findCellComment(new CellAddress(this.cellRef)):null;
            this.output.cell(this.cellRef, thisStr, comment1);
         } else if("f".equals(localName)) {
            this.fIsOpen = false;
         } else if("is".equals(localName)) {
            this.isIsOpen = false;
         } else if("row".equals(localName)) {
            this.checkForEmptyCellComments(XSSFSheetXMLHandler.EmptyCellCommentsCheckType.END_OF_ROW);
            this.output.endRow(this.rowNum);
            this.nextRowNum = this.rowNum + 1;
         } else if("sheetData".equals(localName)) {
            this.checkForEmptyCellComments(XSSFSheetXMLHandler.EmptyCellCommentsCheckType.END_OF_SHEET_DATA);
         } else if(!"oddHeader".equals(localName) && !"evenHeader".equals(localName) && !"firstHeader".equals(localName)) {
            if("oddFooter".equals(localName) || "evenFooter".equals(localName) || "firstFooter".equals(localName)) {
               this.hfIsOpen = false;
               this.output.headerFooter(this.headerFooter.toString(), false, localName);
            }
         } else {
            this.hfIsOpen = false;
            this.output.headerFooter(this.headerFooter.toString(), true, localName);
         }

      }
   }

   public void characters(char[] ch, int start, int length) throws SAXException {
      if(this.vIsOpen) {
         this.value.append(ch, start, length);
      }

      if(this.fIsOpen) {
         this.formula.append(ch, start, length);
      }

      if(this.hfIsOpen) {
         this.headerFooter.append(ch, start, length);
      }

   }

   private void checkForEmptyCellComments(XSSFSheetXMLHandler.EmptyCellCommentsCheckType type) {
      if(this.commentCellRefs != null && !this.commentCellRefs.isEmpty()) {
         if(type == XSSFSheetXMLHandler.EmptyCellCommentsCheckType.END_OF_SHEET_DATA) {
            while(!this.commentCellRefs.isEmpty()) {
               this.outputEmptyCellComment((CellAddress)this.commentCellRefs.remove());
            }

            return;
         }

         if(this.cellRef == null) {
            if(type == XSSFSheetXMLHandler.EmptyCellCommentsCheckType.END_OF_ROW) {
               while(!this.commentCellRefs.isEmpty()) {
                  if(((CellAddress)this.commentCellRefs.peek()).getRow() != this.rowNum) {
                     return;
                  }

                  this.outputEmptyCellComment((CellAddress)this.commentCellRefs.remove());
               }

               return;
            }

            throw new IllegalStateException("Cell ref should be null only if there are only empty cells in the row; rowNum: " + this.rowNum);
         }

         CellAddress nextCommentCellRef;
         do {
            CellAddress cellRef = new CellAddress(this.cellRef);
            CellAddress peekCellRef = (CellAddress)this.commentCellRefs.peek();
            if(type == XSSFSheetXMLHandler.EmptyCellCommentsCheckType.CELL && cellRef.equals(peekCellRef)) {
               this.commentCellRefs.remove();
               return;
            }

            int comparison = peekCellRef.compareTo(cellRef);
            if(comparison > 0 && type == XSSFSheetXMLHandler.EmptyCellCommentsCheckType.END_OF_ROW && peekCellRef.getRow() <= this.rowNum) {
               nextCommentCellRef = (CellAddress)this.commentCellRefs.remove();
               this.outputEmptyCellComment(nextCommentCellRef);
            } else if(comparison < 0 && type == XSSFSheetXMLHandler.EmptyCellCommentsCheckType.CELL && peekCellRef.getRow() <= this.rowNum) {
               nextCommentCellRef = (CellAddress)this.commentCellRefs.remove();
               this.outputEmptyCellComment(nextCommentCellRef);
            } else {
               nextCommentCellRef = null;
            }
         } while(nextCommentCellRef != null && !this.commentCellRefs.isEmpty());
      }

   }

   private void outputEmptyCellComment(CellAddress cellRef) {
      XSSFComment comment = this.commentsTable.findCellComment(cellRef);
      this.output.cell(cellRef.formatAsString(), (String)null, comment);
   }


   // $FF: synthetic class
   static class NamelessClass845187186 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType = new int[XSSFSheetXMLHandler.xssfDataType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType[XSSFSheetXMLHandler.xssfDataType.BOOLEAN.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType[XSSFSheetXMLHandler.xssfDataType.ERROR.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType[XSSFSheetXMLHandler.xssfDataType.FORMULA.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType[XSSFSheetXMLHandler.xssfDataType.INLINE_STRING.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType[XSSFSheetXMLHandler.xssfDataType.SST_STRING.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$eventusermodel$XSSFSheetXMLHandler$xssfDataType[XSSFSheetXMLHandler.xssfDataType.NUMBER.ordinal()] = 6;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   public interface SheetContentsHandler {

      void startRow(int var1);

      void endRow(int var1);

      void cell(String var1, String var2, XSSFComment var3);

      void headerFooter(String var1, boolean var2, String var3);
   }

   static enum xssfDataType {

      BOOLEAN("BOOLEAN", 0),
      ERROR("ERROR", 1),
      FORMULA("FORMULA", 2),
      INLINE_STRING("INLINE_STRING", 3),
      SST_STRING("SST_STRING", 4),
      NUMBER("NUMBER", 5);
      // $FF: synthetic field
      private static final XSSFSheetXMLHandler.xssfDataType[] $VALUES = new XSSFSheetXMLHandler.xssfDataType[]{BOOLEAN, ERROR, FORMULA, INLINE_STRING, SST_STRING, NUMBER};


      private xssfDataType(String var1, int var2) {}

   }

   private static enum EmptyCellCommentsCheckType {

      CELL("CELL", 0),
      END_OF_ROW("END_OF_ROW", 1),
      END_OF_SHEET_DATA("END_OF_SHEET_DATA", 2);
      // $FF: synthetic field
      private static final XSSFSheetXMLHandler.EmptyCellCommentsCheckType[] $VALUES = new XSSFSheetXMLHandler.EmptyCellCommentsCheckType[]{CELL, END_OF_ROW, END_OF_SHEET_DATA};


      private EmptyCellCommentsCheckType(String var1, int var2) {}

   }
}
