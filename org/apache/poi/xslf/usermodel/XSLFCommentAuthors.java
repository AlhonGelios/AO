package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList;
import org.openxmlformats.schemas.presentationml.x2006.main.CmAuthorLstDocument;

public class XSLFCommentAuthors extends POIXMLDocumentPart {

   private final CTCommentAuthorList _authors;


   XSLFCommentAuthors() {
      CmAuthorLstDocument doc = CmAuthorLstDocument.Factory.newInstance();
      this._authors = doc.addNewCmAuthorLst();
   }

   XSLFCommentAuthors(PackagePart part) throws IOException, XmlException {
      super(part);
      CmAuthorLstDocument doc = CmAuthorLstDocument.Factory.parse(this.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._authors = doc.getCmAuthorLst();
   }

   @Deprecated
   XSLFCommentAuthors(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   public CTCommentAuthorList getCTCommentAuthorsList() {
      return this._authors;
   }

   public CTCommentAuthor getAuthorById(long id) {
      CTCommentAuthor[] arr$ = this._authors.getCmAuthorArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTCommentAuthor author = arr$[i$];
         if(author.getId() == id) {
            return author;
         }
      }

      return null;
   }
}
