package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.usermodel.Notes;
import org.apache.poi.xslf.usermodel.XSLFNotesMaster;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.NotesDocument;

public final class XSLFNotes extends XSLFSheet implements Notes {

   private CTNotesSlide _notes;


   XSLFNotes() {
      this._notes = prototype();
      this.setCommonSlideData(this._notes.getCSld());
   }

   XSLFNotes(PackagePart part) throws IOException, XmlException {
      super(part);
      NotesDocument doc = NotesDocument.Factory.parse(this.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._notes = doc.getNotes();
      this.setCommonSlideData(this._notes.getCSld());
   }

   @Deprecated
   XSLFNotes(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   private static CTNotesSlide prototype() {
      CTNotesSlide ctNotes = CTNotesSlide.Factory.newInstance();
      CTCommonSlideData cSld = ctNotes.addNewCSld();
      cSld.addNewSpTree();
      return ctNotes;
   }

   public CTNotesSlide getXmlObject() {
      return this._notes;
   }

   protected String getRootElementName() {
      return "notes";
   }

   public XSLFTheme getTheme() {
      return this.getMasterSheet().getTheme();
   }

   public XSLFNotesMaster getMasterSheet() {
      Iterator i$ = this.getRelations().iterator();

      POIXMLDocumentPart p;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         p = (POIXMLDocumentPart)i$.next();
      } while(!(p instanceof XSLFNotesMaster));

      return (XSLFNotesMaster)p;
   }

   public List getTextParagraphs() {
      ArrayList tp = new ArrayList();
      Iterator i$ = super.getShapes().iterator();

      while(i$.hasNext()) {
         XSLFShape sh = (XSLFShape)i$.next();
         if(sh instanceof XSLFTextShape) {
            XSLFTextShape txt = (XSLFTextShape)sh;
            tp.add(txt.getTextParagraphs());
         }
      }

      return tp;
   }
}
