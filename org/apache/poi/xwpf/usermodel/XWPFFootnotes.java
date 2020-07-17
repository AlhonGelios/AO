package org.apache.poi.xwpf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFootnote;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FootnotesDocument;

public class XWPFFootnotes extends POIXMLDocumentPart {

   protected XWPFDocument document;
   private List listFootnote;
   private CTFootnotes ctFootnotes;


   public XWPFFootnotes(PackagePart part) throws IOException, OpenXML4JException {
      super(part);
      this.listFootnote = new ArrayList();
   }

   @Deprecated
   public XWPFFootnotes(PackagePart part, PackageRelationship rel) throws IOException, OpenXML4JException {
      this(part);
   }

   public XWPFFootnotes() {
      this.listFootnote = new ArrayList();
   }

   protected void onDocumentRead() throws IOException {
      InputStream is = null;

      try {
         is = this.getPackagePart().getInputStream();
         FootnotesDocument notesDoc = FootnotesDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.ctFootnotes = notesDoc.getFootnotes();
      } catch (XmlException var9) {
         throw new POIXMLException();
      } finally {
         if(is != null) {
            is.close();
         }

      }

      CTFtnEdn[] arr$ = this.ctFootnotes.getFootnoteArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTFtnEdn note = arr$[i$];
         this.listFootnote.add(new XWPFFootnote(note, this));
      }

   }

   protected void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTFootnotes.type.getName().getNamespaceURI(), "footnotes"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.ctFootnotes.save(out, xmlOptions);
      out.close();
   }

   public List getFootnotesList() {
      return this.listFootnote;
   }

   public XWPFFootnote getFootnoteById(int id) {
      Iterator i$ = this.listFootnote.iterator();

      XWPFFootnote note;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         note = (XWPFFootnote)i$.next();
      } while(note.getCTFtnEdn().getId().intValue() != id);

      return note;
   }

   public void setFootnotes(CTFootnotes footnotes) {
      this.ctFootnotes = footnotes;
   }

   public void addFootnote(XWPFFootnote footnote) {
      this.listFootnote.add(footnote);
      this.ctFootnotes.addNewFootnote().set(footnote.getCTFtnEdn());
   }

   public XWPFFootnote addFootnote(CTFtnEdn note) {
      CTFtnEdn newNote = this.ctFootnotes.addNewFootnote();
      newNote.set(note);
      XWPFFootnote xNote = new XWPFFootnote(newNote, this);
      this.listFootnote.add(xNote);
      return xNote;
   }

   public XWPFDocument getXWPFDocument() {
      return this.document != null?this.document:(XWPFDocument)this.getParent();
   }

   public void setXWPFDocument(XWPFDocument doc) {
      this.document = doc;
   }
}
