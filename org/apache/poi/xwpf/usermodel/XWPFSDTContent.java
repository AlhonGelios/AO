package org.apache.poi.xwpf.usermodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.ICell;
import org.apache.poi.xwpf.usermodel.IRunBody;
import org.apache.poi.xwpf.usermodel.IRunElement;
import org.apache.poi.xwpf.usermodel.ISDTContent;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFSDT;
import org.apache.poi.xwpf.usermodel.XWPFSDTCell;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;

public class XWPFSDTContent implements ISDTContent {

   private List paragraphs = new ArrayList();
   private List tables = new ArrayList();
   private List runs = new ArrayList();
   private List contentControls = new ArrayList();
   private List bodyElements = new ArrayList();


   public XWPFSDTContent(CTSdtContentRun sdtRun, IBody part, IRunBody parent) {
      CTR[] arr$ = sdtRun.getRArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTR ctr = arr$[i$];
         XWPFRun run = new XWPFRun(ctr, parent);
         this.runs.add(run);
         this.bodyElements.add(run);
      }

   }

   public XWPFSDTContent(CTSdtContentBlock block, IBody part, IRunBody parent) {
      XmlCursor cursor = block.newCursor();
      cursor.selectPath("./*");

      while(cursor.toNextSelection()) {
         XmlObject o = cursor.getObject();
         if(o instanceof CTP) {
            XWPFParagraph run = new XWPFParagraph((CTP)o, part);
            this.bodyElements.add(run);
            this.paragraphs.add(run);
         } else if(o instanceof CTTbl) {
            XWPFTable run1 = new XWPFTable((CTTbl)o, part);
            this.bodyElements.add(run1);
            this.tables.add(run1);
         } else if(o instanceof CTSdtBlock) {
            XWPFSDT run2 = new XWPFSDT((CTSdtBlock)o, part);
            this.bodyElements.add(run2);
            this.contentControls.add(run2);
         } else if(o instanceof CTR) {
            XWPFRun run3 = new XWPFRun((CTR)o, parent);
            this.runs.add(run3);
            this.bodyElements.add(run3);
         }
      }

      cursor.dispose();
   }

   public String getText() {
      StringBuilder text = new StringBuilder();
      boolean addNewLine = false;

      for(int i = 0; i < this.bodyElements.size(); ++i) {
         Object o = this.bodyElements.get(i);
         if(o instanceof XWPFParagraph) {
            this.appendParagraph((XWPFParagraph)o, text);
            addNewLine = true;
         } else if(o instanceof XWPFTable) {
            this.appendTable((XWPFTable)o, text);
            addNewLine = true;
         } else if(o instanceof XWPFSDT) {
            text.append(((XWPFSDT)o).getContent().getText());
            addNewLine = true;
         } else if(o instanceof XWPFRun) {
            text.append(((XWPFRun)o).toString());
            addNewLine = false;
         }

         if(addNewLine && i < this.bodyElements.size() - 1) {
            text.append("\n");
         }
      }

      return text.toString();
   }

   private void appendTable(XWPFTable table, StringBuilder text) {
      Iterator i$ = table.getRows().iterator();

      while(i$.hasNext()) {
         XWPFTableRow row = (XWPFTableRow)i$.next();
         List cells = row.getTableICells();

         for(int i = 0; i < cells.size(); ++i) {
            ICell cell = (ICell)cells.get(i);
            if(cell instanceof XWPFTableCell) {
               text.append(((XWPFTableCell)cell).getTextRecursively());
            } else if(cell instanceof XWPFSDTCell) {
               text.append(((XWPFSDTCell)cell).getContent().getText());
            }

            if(i < cells.size() - 1) {
               text.append("\t");
            }
         }

         text.append('\n');
      }

   }

   private void appendParagraph(XWPFParagraph paragraph, StringBuilder text) {
      Iterator i$ = paragraph.getRuns().iterator();

      while(i$.hasNext()) {
         IRunElement run = (IRunElement)i$.next();
         text.append(run.toString());
      }

   }

   public String toString() {
      return this.getText();
   }
}
