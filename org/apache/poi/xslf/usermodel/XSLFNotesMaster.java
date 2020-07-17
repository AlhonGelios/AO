package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.usermodel.MasterSheet;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster;
import org.openxmlformats.schemas.presentationml.x2006.main.NotesMasterDocument;

public class XSLFNotesMaster extends XSLFSheet implements MasterSheet {

   private CTNotesMaster _slide;
   private XSLFTheme _theme;


   XSLFNotesMaster() {
      this._slide = prototype();
   }

   protected XSLFNotesMaster(PackagePart part) throws IOException, XmlException {
      super(part);
      NotesMasterDocument doc = NotesMasterDocument.Factory.parse(this.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._slide = doc.getNotesMaster();
      this.setCommonSlideData(this._slide.getCSld());
   }

   @Deprecated
   protected XSLFNotesMaster(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   private static CTNotesMaster prototype() {
      InputStream is = XSLFNotesMaster.class.getResourceAsStream("notesMaster.xml");
      if(is == null) {
         throw new POIXMLException("Missing resource \'notesMaster.xml\'");
      } else {
         try {
            CTNotesMaster var3;
            try {
               NotesMasterDocument e = NotesMasterDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
               CTNotesMaster slide = e.getNotesMaster();
               var3 = slide;
            } finally {
               is.close();
            }

            return var3;
         } catch (Exception var8) {
            throw new POIXMLException("Can\'t initialize NotesMaster", var8);
         }
      }
   }

   public CTNotesMaster getXmlObject() {
      return this._slide;
   }

   protected String getRootElementName() {
      return "notesMaster";
   }

   public MasterSheet getMasterSheet() {
      return null;
   }

   public XSLFTheme getTheme() {
      if(this._theme == null) {
         Iterator i$ = this.getRelations().iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart p = (POIXMLDocumentPart)i$.next();
            if(p instanceof XSLFTheme) {
               this._theme = (XSLFTheme)p;
               CTColorMapping cmap = this._slide.getClrMap();
               if(cmap != null) {
                  this._theme.initColorMap(cmap);
               }
               break;
            }
         }
      }

      return this._theme;
   }
}
