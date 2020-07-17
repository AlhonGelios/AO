package org.apache.poi.xwpf.usermodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFootnotes;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFSDT;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;

public class XWPFFootnote implements Iterable, IBody {

   private List paragraphs = new ArrayList();
   private List tables = new ArrayList();
   private List pictures = new ArrayList();
   private List bodyElements = new ArrayList();
   private CTFtnEdn ctFtnEdn;
   private XWPFFootnotes footnotes;
   private XWPFDocument document;


   public XWPFFootnote(CTFtnEdn note, XWPFFootnotes xFootnotes) {
      this.footnotes = xFootnotes;
      this.ctFtnEdn = note;
      this.document = xFootnotes.getXWPFDocument();
      this.init();
   }

   public XWPFFootnote(XWPFDocument document, CTFtnEdn body) {
      this.ctFtnEdn = body;
      this.document = document;
      this.init();
   }

   private void init() {
      XmlCursor cursor = this.ctFtnEdn.newCursor();
      cursor.selectPath("./*");

      while(cursor.toNextSelection()) {
         XmlObject o = cursor.getObject();
         if(o instanceof CTP) {
            XWPFParagraph c = new XWPFParagraph((CTP)o, this);
            this.bodyElements.add(c);
            this.paragraphs.add(c);
         } else if(o instanceof CTTbl) {
            XWPFTable c1 = new XWPFTable((CTTbl)o, this);
            this.bodyElements.add(c1);
            this.tables.add(c1);
         } else if(o instanceof CTSdtBlock) {
            XWPFSDT c2 = new XWPFSDT((CTSdtBlock)o, this);
            this.bodyElements.add(c2);
         }
      }

      cursor.dispose();
   }

   public List getParagraphs() {
      return this.paragraphs;
   }

   public Iterator iterator() {
      return this.paragraphs.iterator();
   }

   public List getTables() {
      return this.tables;
   }

   public List getPictures() {
      return this.pictures;
   }

   public List getBodyElements() {
      return this.bodyElements;
   }

   public CTFtnEdn getCTFtnEdn() {
      return this.ctFtnEdn;
   }

   public void setCTFtnEdn(CTFtnEdn footnote) {
      this.ctFtnEdn = footnote;
   }

   public XWPFTable getTableArray(int pos) {
      return pos >= 0 && pos < this.tables.size()?(XWPFTable)this.tables.get(pos):null;
   }

   public void insertTable(int pos, XWPFTable table) {
      this.bodyElements.add(pos, table);
      int i = 0;
      CTTbl[] arr$ = this.ctFtnEdn.getTblArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTTbl tbl = arr$[i$];
         if(tbl == table.getCTTbl()) {
            break;
         }

         ++i;
      }

      this.tables.add(i, table);
   }

   public XWPFTable getTable(CTTbl ctTable) {
      Iterator i$ = this.tables.iterator();

      XWPFTable table;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         table = (XWPFTable)i$.next();
         if(table == null) {
            return null;
         }
      } while(!table.getCTTbl().equals(ctTable));

      return table;
   }

   public XWPFParagraph getParagraph(CTP p) {
      Iterator i$ = this.paragraphs.iterator();

      XWPFParagraph paragraph;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         paragraph = (XWPFParagraph)i$.next();
      } while(!paragraph.getCTP().equals(p));

      return paragraph;
   }

   public XWPFParagraph getParagraphArray(int pos) {
      return pos >= 0 && pos < this.paragraphs.size()?(XWPFParagraph)this.paragraphs.get(pos):null;
   }

   public XWPFTableCell getTableCell(CTTc cell) {
      XmlCursor cursor = cell.newCursor();
      cursor.toParent();
      XmlObject o = cursor.getObject();
      if(!(o instanceof CTRow)) {
         return null;
      } else {
         CTRow row = (CTRow)o;
         cursor.toParent();
         o = cursor.getObject();
         cursor.dispose();
         if(!(o instanceof CTTbl)) {
            return null;
         } else {
            CTTbl tbl = (CTTbl)o;
            XWPFTable table = this.getTable(tbl);
            if(table == null) {
               return null;
            } else {
               XWPFTableRow tableRow = table.getRow(row);
               return tableRow == null?null:tableRow.getTableCell(cell);
            }
         }
      }
   }

   private boolean isCursorInFtn(XmlCursor cursor) {
      XmlCursor verify = cursor.newCursor();
      verify.toParent();
      return verify.getObject() == this.ctFtnEdn;
   }

   public POIXMLDocumentPart getOwner() {
      return this.footnotes;
   }

   public XWPFTable insertNewTbl(XmlCursor cursor) {
      if(!this.isCursorInFtn(cursor)) {
         return null;
      } else {
         String uri = CTTbl.type.getName().getNamespaceURI();
         String localPart = "tbl";
         cursor.beginElement(localPart, uri);
         cursor.toParent();
         CTTbl t = (CTTbl)cursor.getObject();
         XWPFTable newT = new XWPFTable(t, this);
         cursor.removeXmlContents();

         XmlObject o;
         for(o = null; !(o instanceof CTTbl) && cursor.toPrevSibling(); o = cursor.getObject()) {
            ;
         }

         int i;
         if(!(o instanceof CTTbl)) {
            this.tables.add(0, newT);
         } else {
            i = this.tables.indexOf(this.getTable((CTTbl)o)) + 1;
            this.tables.add(i, newT);
         }

         i = 0;
         cursor = t.newCursor();

         while(cursor.toPrevSibling()) {
            o = cursor.getObject();
            if(o instanceof CTP || o instanceof CTTbl) {
               ++i;
            }
         }

         this.bodyElements.add(i, newT);
         XmlCursor c2 = t.newCursor();
         cursor.toCursor(c2);
         cursor.toEndToken();
         c2.dispose();
         return newT;
      }
   }

   public XWPFParagraph insertNewParagraph(XmlCursor cursor) {
      if(!this.isCursorInFtn(cursor)) {
         return null;
      } else {
         String uri = CTP.type.getName().getNamespaceURI();
         String localPart = "p";
         cursor.beginElement(localPart, uri);
         cursor.toParent();
         CTP p = (CTP)cursor.getObject();
         XWPFParagraph newP = new XWPFParagraph(p, this);

         XmlObject o;
         for(o = null; !(o instanceof CTP) && cursor.toPrevSibling(); o = cursor.getObject()) {
            ;
         }

         int i;
         if(o instanceof CTP && (CTP)o != p) {
            i = this.paragraphs.indexOf(this.getParagraph((CTP)o)) + 1;
            this.paragraphs.add(i, newP);
         } else {
            this.paragraphs.add(0, newP);
         }

         i = 0;
         XmlCursor p2 = p.newCursor();
         cursor.toCursor(p2);
         p2.dispose();

         while(cursor.toPrevSibling()) {
            o = cursor.getObject();
            if(o instanceof CTP || o instanceof CTTbl) {
               ++i;
            }
         }

         this.bodyElements.add(i, newP);
         p2 = p.newCursor();
         cursor.toCursor(p2);
         cursor.toEndToken();
         p2.dispose();
         return newP;
      }
   }

   public XWPFTable addNewTbl(CTTbl table) {
      CTTbl newTable = this.ctFtnEdn.addNewTbl();
      newTable.set(table);
      XWPFTable xTable = new XWPFTable(newTable, this);
      this.tables.add(xTable);
      return xTable;
   }

   public XWPFParagraph addNewParagraph(CTP paragraph) {
      CTP newPara = this.ctFtnEdn.addNewP();
      newPara.set(paragraph);
      XWPFParagraph xPara = new XWPFParagraph(newPara, this);
      this.paragraphs.add(xPara);
      return xPara;
   }

   public XWPFDocument getXWPFDocument() {
      return this.document;
   }

   public POIXMLDocumentPart getPart() {
      return this.footnotes;
   }

   public BodyType getPartType() {
      return BodyType.FOOTNOTE;
   }
}
