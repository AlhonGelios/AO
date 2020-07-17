package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.usermodel.XSLFRelation;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.CmLstDocument;
import org.openxmlformats.schemas.presentationml.x2006.main.NotesDocument;
import org.openxmlformats.schemas.presentationml.x2006.main.PresentationDocument;
import org.openxmlformats.schemas.presentationml.x2006.main.SldDocument;
import org.openxmlformats.schemas.presentationml.x2006.main.SldMasterDocument;

public class XSLFSlideShow extends POIXMLDocument {

   private PresentationDocument presentationDoc;
   private List embedds;


   public XSLFSlideShow(OPCPackage container) throws OpenXML4JException, IOException, XmlException {
      super(container);
      if(this.getCorePart().getContentType().equals(XSLFRelation.THEME_MANAGER.getContentType())) {
         this.rebase(this.getPackage());
      }

      this.presentationDoc = PresentationDocument.Factory.parse(this.getCorePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this.embedds = new LinkedList();
      CTSlideIdListEntry[] arr$ = this.getSlideReferences().getSldIdArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTSlideIdListEntry ctSlide = arr$[i$];
         PackagePart corePart = this.getCorePart();
         PackagePart slidePart = corePart.getRelatedPart(corePart.getRelationship(ctSlide.getId2()));
         Iterator i$1 = slidePart.getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject").iterator();

         PackageRelationship rel;
         while(i$1.hasNext()) {
            rel = (PackageRelationship)i$1.next();
            if(TargetMode.EXTERNAL != rel.getTargetMode()) {
               this.embedds.add(slidePart.getRelatedPart(rel));
            }
         }

         i$1 = slidePart.getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/package").iterator();

         while(i$1.hasNext()) {
            rel = (PackageRelationship)i$1.next();
            this.embedds.add(slidePart.getRelatedPart(rel));
         }
      }

   }

   public XSLFSlideShow(String file) throws OpenXML4JException, IOException, XmlException {
      this(openPackage(file));
   }

   @Internal
   public CTPresentation getPresentation() {
      return this.presentationDoc.getPresentation();
   }

   @Internal
   public CTSlideIdList getSlideReferences() {
      if(!this.getPresentation().isSetSldIdLst()) {
         this.getPresentation().setSldIdLst(CTSlideIdList.Factory.newInstance());
      }

      return this.getPresentation().getSldIdLst();
   }

   @Internal
   public CTSlideMasterIdList getSlideMasterReferences() {
      return this.getPresentation().getSldMasterIdLst();
   }

   public PackagePart getSlideMasterPart(CTSlideMasterIdListEntry master) throws IOException, XmlException {
      try {
         PackagePart e = this.getCorePart();
         return e.getRelatedPart(e.getRelationship(master.getId2()));
      } catch (InvalidFormatException var3) {
         throw new XmlException(var3);
      }
   }

   @Internal
   public CTSlideMaster getSlideMaster(CTSlideMasterIdListEntry master) throws IOException, XmlException {
      PackagePart masterPart = this.getSlideMasterPart(master);
      SldMasterDocument masterDoc = SldMasterDocument.Factory.parse(masterPart.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      return masterDoc.getSldMaster();
   }

   public PackagePart getSlidePart(CTSlideIdListEntry slide) throws IOException, XmlException {
      try {
         PackagePart e = this.getCorePart();
         return e.getRelatedPart(e.getRelationship(slide.getId2()));
      } catch (InvalidFormatException var3) {
         throw new XmlException(var3);
      }
   }

   @Internal
   public CTSlide getSlide(CTSlideIdListEntry slide) throws IOException, XmlException {
      PackagePart slidePart = this.getSlidePart(slide);
      SldDocument slideDoc = SldDocument.Factory.parse(slidePart.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      return slideDoc.getSld();
   }

   public PackagePart getNodesPart(CTSlideIdListEntry parentSlide) throws IOException, XmlException {
      PackagePart slidePart = this.getSlidePart(parentSlide);

      PackageRelationshipCollection notes;
      try {
         notes = slidePart.getRelationshipsByType(XSLFRelation.NOTES.getRelation());
      } catch (InvalidFormatException var6) {
         throw new IllegalStateException(var6);
      }

      if(notes.size() == 0) {
         return null;
      } else if(notes.size() > 1) {
         throw new IllegalStateException("Expecting 0 or 1 notes for a slide, but found " + notes.size());
      } else {
         try {
            return slidePart.getRelatedPart(notes.getRelationship(0));
         } catch (InvalidFormatException var5) {
            throw new IllegalStateException(var5);
         }
      }
   }

   @Internal
   public CTNotesSlide getNotes(CTSlideIdListEntry slide) throws IOException, XmlException {
      PackagePart notesPart = this.getNodesPart(slide);
      if(notesPart == null) {
         return null;
      } else {
         NotesDocument notesDoc = NotesDocument.Factory.parse(notesPart.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         return notesDoc.getNotes();
      }
   }

   @Internal
   public CTCommentList getSlideComments(CTSlideIdListEntry slide) throws IOException, XmlException {
      PackagePart slidePart = this.getSlidePart(slide);

      PackageRelationshipCollection commentRels;
      try {
         commentRels = slidePart.getRelationshipsByType(XSLFRelation.COMMENTS.getRelation());
      } catch (InvalidFormatException var7) {
         throw new IllegalStateException(var7);
      }

      if(commentRels.size() == 0) {
         return null;
      } else if(commentRels.size() > 1) {
         throw new IllegalStateException("Expecting 0 or 1 comments for a slide, but found " + commentRels.size());
      } else {
         try {
            PackagePart e = slidePart.getRelatedPart(commentRels.getRelationship(0));
            CmLstDocument commDoc = CmLstDocument.Factory.parse(e.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
            return commDoc.getCmLst();
         } catch (InvalidFormatException var6) {
            throw new IllegalStateException(var6);
         }
      }
   }

   public List getAllEmbedds() throws OpenXML4JException {
      return this.embedds;
   }
}
