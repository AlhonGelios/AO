package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTComment;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList;
import org.openxmlformats.schemas.presentationml.x2006.main.CmLstDocument;

public class XSLFComments extends POIXMLDocumentPart {

   private final CTCommentList _comments;


   XSLFComments() {
      CmLstDocument doc = CmLstDocument.Factory.newInstance();
      this._comments = doc.addNewCmLst();
   }

   XSLFComments(PackagePart part) throws IOException, XmlException {
      super(part);
      CmLstDocument doc = CmLstDocument.Factory.parse(this.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._comments = doc.getCmLst();
   }

   @Deprecated
   XSLFComments(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   public CTCommentList getCTCommentsList() {
      return this._comments;
   }

   public int getNumberOfComments() {
      return this._comments.sizeOfCmArray();
   }

   public CTComment getCommentAt(int pos) {
      return this._comments.getCmArray(pos);
   }
}
