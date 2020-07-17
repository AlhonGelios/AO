package org.apache.poi.xwpf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Internal;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFactory;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.apache.poi.xwpf.usermodel.XWPFSDT;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;

public abstract class XWPFHeaderFooter extends POIXMLDocumentPart implements IBody {

   List paragraphs;
   List tables;
   List pictures;
   List bodyElements;
   CTHdrFtr headerFooter;
   XWPFDocument document;


   XWPFHeaderFooter(XWPFDocument doc, CTHdrFtr hdrFtr) {
      this.paragraphs = new ArrayList(1);
      this.tables = new ArrayList(1);
      this.pictures = new ArrayList();
      this.bodyElements = new ArrayList(1);
      if(doc == null) {
         throw new NullPointerException();
      } else {
         this.document = doc;
         this.headerFooter = hdrFtr;
         this.readHdrFtr();
      }
   }

   protected XWPFHeaderFooter() {
      this.paragraphs = new ArrayList(1);
      this.tables = new ArrayList(1);
      this.pictures = new ArrayList();
      this.bodyElements = new ArrayList(1);
      this.headerFooter = CTHdrFtr.Factory.newInstance();
      this.readHdrFtr();
   }

   public XWPFHeaderFooter(POIXMLDocumentPart parent, PackagePart part) throws IOException {
      super(parent, part);
      this.paragraphs = new ArrayList(1);
      this.tables = new ArrayList(1);
      this.pictures = new ArrayList();
      this.bodyElements = new ArrayList(1);
      this.document = (XWPFDocument)this.getParent();
      if(this.document == null) {
         throw new NullPointerException();
      }
   }

   @Deprecated
   public XWPFHeaderFooter(POIXMLDocumentPart parent, PackagePart part, PackageRelationship rel) throws IOException {
      this(parent, part);
   }

   protected void onDocumentRead() throws IOException {
      Iterator i$ = this.getRelations().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart poixmlDocumentPart = (POIXMLDocumentPart)i$.next();
         if(poixmlDocumentPart instanceof XWPFPictureData) {
            XWPFPictureData xwpfPicData = (XWPFPictureData)poixmlDocumentPart;
            this.pictures.add(xwpfPicData);
            this.document.registerPackagePictureData(xwpfPicData);
         }
      }

   }

   @Internal
   public CTHdrFtr _getHdrFtr() {
      return this.headerFooter;
   }

   public List getBodyElements() {
      return Collections.unmodifiableList(this.bodyElements);
   }

   public List getParagraphs() {
      return Collections.unmodifiableList(this.paragraphs);
   }

   public List getTables() throws ArrayIndexOutOfBoundsException {
      return Collections.unmodifiableList(this.tables);
   }

   public String getText() {
      StringBuffer t = new StringBuffer();

      int i$;
      String bodyElement;
      for(i$ = 0; i$ < this.paragraphs.size(); ++i$) {
         if(!((XWPFParagraph)this.paragraphs.get(i$)).isEmpty()) {
            bodyElement = ((XWPFParagraph)this.paragraphs.get(i$)).getText();
            if(bodyElement != null && bodyElement.length() > 0) {
               t.append(bodyElement);
               t.append('\n');
            }
         }
      }

      for(i$ = 0; i$ < this.tables.size(); ++i$) {
         bodyElement = ((XWPFTable)this.tables.get(i$)).getText();
         if(bodyElement != null && bodyElement.length() > 0) {
            t.append(bodyElement);
            t.append('\n');
         }
      }

      Iterator var4 = this.getBodyElements().iterator();

      while(var4.hasNext()) {
         IBodyElement var5 = (IBodyElement)var4.next();
         if(var5 instanceof XWPFSDT) {
            t.append(((XWPFSDT)var5).getContent().getText() + '\n');
         }
      }

      return t.toString();
   }

   public void setHeaderFooter(CTHdrFtr headerFooter) {
      this.headerFooter = headerFooter;
      this.readHdrFtr();
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

   public List getListParagraph() {
      return this.paragraphs;
   }

   public List getAllPictures() {
      return Collections.unmodifiableList(this.pictures);
   }

   public List getAllPackagePictures() {
      return this.document.getAllPackagePictures();
   }

   public String addPictureData(byte[] pictureData, int format) throws InvalidFormatException {
      XWPFPictureData xwpfPicData = this.document.findPackagePictureData(pictureData, format);
      POIXMLRelation relDesc = XWPFPictureData.RELATIONS[format];
      if(xwpfPicData == null) {
         int rp1 = this.document.getNextPicNameNumber(format);
         xwpfPicData = (XWPFPictureData)this.createRelationship(relDesc, XWPFFactory.getInstance(), rp1);
         PackagePart picDataPart = xwpfPicData.getPackagePart();
         OutputStream out = null;

         try {
            out = picDataPart.getOutputStream();
            out.write(pictureData);
         } catch (IOException var16) {
            throw new POIXMLException(var16);
         } finally {
            try {
               if(out != null) {
                  out.close();
               }
            } catch (IOException var15) {
               ;
            }

         }

         this.document.registerPackagePictureData(xwpfPicData);
         this.pictures.add(xwpfPicData);
         return this.getRelationId(xwpfPicData);
      } else if(!this.getRelations().contains(xwpfPicData)) {
         POIXMLDocumentPart.RelationPart rp = this.addRelation((String)null, XWPFRelation.IMAGES, xwpfPicData);
         this.pictures.add(xwpfPicData);
         return rp.getRelationship().getId();
      } else {
         return this.getRelationId(xwpfPicData);
      }
   }

   public String addPictureData(InputStream is, int format) throws InvalidFormatException, IOException {
      byte[] data = IOUtils.toByteArray(is);
      return this.addPictureData(data, format);
   }

   public XWPFPictureData getPictureDataByID(String blipID) {
      POIXMLDocumentPart relatedPart = this.getRelationById(blipID);
      return relatedPart != null && relatedPart instanceof XWPFPictureData?(XWPFPictureData)relatedPart:null;
   }

   public XWPFParagraph createParagraph() {
      XWPFParagraph paragraph = new XWPFParagraph(this.headerFooter.addNewP(), this);
      this.paragraphs.add(paragraph);
      return paragraph;
   }

   public XWPFParagraph insertNewParagraph(XmlCursor cursor) {
      if(!this.isCursorInHdrF(cursor)) {
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

   public XWPFTable insertNewTbl(XmlCursor cursor) {
      if(!this.isCursorInHdrF(cursor)) {
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
         XmlCursor cursor2 = t.newCursor();

         while(cursor2.toPrevSibling()) {
            o = cursor2.getObject();
            if(o instanceof CTP || o instanceof CTTbl) {
               ++i;
            }
         }

         cursor2.dispose();
         this.bodyElements.add(i, newT);
         cursor2 = t.newCursor();
         cursor.toCursor(cursor2);
         cursor.toEndToken();
         cursor2.dispose();
         return newT;
      }
   }

   private boolean isCursorInHdrF(XmlCursor cursor) {
      XmlCursor verify = cursor.newCursor();
      verify.toParent();
      boolean result = verify.getObject() == this.headerFooter;
      verify.dispose();
      return result;
   }

   public POIXMLDocumentPart getOwner() {
      return this;
   }

   public XWPFTable getTableArray(int pos) {
      return pos >= 0 && pos < this.tables.size()?(XWPFTable)this.tables.get(pos):null;
   }

   public void insertTable(int pos, XWPFTable table) {
      this.bodyElements.add(pos, table);
      int i = 0;
      CTTbl[] arr$ = this.headerFooter.getTblArray();
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

   public void readHdrFtr() {
      this.bodyElements = new ArrayList();
      this.paragraphs = new ArrayList();
      this.tables = new ArrayList();
      XmlCursor cursor = this.headerFooter.newCursor();
      cursor.selectPath("./*");

      while(cursor.toNextSelection()) {
         XmlObject o = cursor.getObject();
         if(o instanceof CTP) {
            XWPFParagraph t = new XWPFParagraph((CTP)o, this);
            this.paragraphs.add(t);
            this.bodyElements.add(t);
         }

         if(o instanceof CTTbl) {
            XWPFTable t1 = new XWPFTable((CTTbl)o, this);
            this.tables.add(t1);
            this.bodyElements.add(t1);
         }
      }

      cursor.dispose();
   }

   public XWPFTableCell getTableCell(CTTc cell) {
      XmlCursor cursor = cell.newCursor();
      cursor.toParent();
      XmlObject o = cursor.getObject();
      if(!(o instanceof CTRow)) {
         cursor.dispose();
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
               return tableRow.getTableCell(cell);
            }
         }
      }
   }

   public XWPFDocument getXWPFDocument() {
      return this.document != null?this.document:(XWPFDocument)this.getParent();
   }

   public void setXWPFDocument(XWPFDocument doc) {
      this.document = doc;
   }

   public POIXMLDocumentPart getPart() {
      return this;
   }
}
