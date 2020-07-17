package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.PageType;
import com.microsoft.schemas.office.visio.x2012.main.PagesDocument;
import com.microsoft.schemas.office.visio.x2012.main.PagesType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.exceptions.XDGFException;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFPage;
import org.apache.poi.xdgf.usermodel.XDGFPageContents;
import org.apache.poi.xdgf.xml.XDGFXMLDocumentPart;
import org.apache.xmlbeans.XmlException;

public class XDGFPages extends XDGFXMLDocumentPart {

   PagesType _pagesObject;
   List _pages;


   public XDGFPages(PackagePart part, XDGFDocument document) {
      super(part, document);
      this._pages = new ArrayList();
   }

   @Deprecated
   public XDGFPages(PackagePart part, PackageRelationship rel, XDGFDocument document) {
      this(part, document);
   }

   @Internal
   PagesType getXmlObject() {
      return this._pagesObject;
   }

   protected void onDocumentRead() {
      try {
         try {
            this._pagesObject = PagesDocument.Factory.parse(this.getPackagePart().getInputStream()).getPages();
         } catch (XmlException var9) {
            throw new POIXMLException(var9);
         } catch (IOException var10) {
            throw new POIXMLException(var10);
         }

         PageType[] e = this._pagesObject.getPageArray();
         int len$ = e.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            PageType pageSettings = e[i$];
            String relId = pageSettings.getRel().getId();
            POIXMLDocumentPart pageContentsPart = this.getRelationById(relId);
            if(pageContentsPart == null) {
               throw new POIXMLException("PageSettings relationship for " + relId + " not found");
            }

            if(!(pageContentsPart instanceof XDGFPageContents)) {
               throw new POIXMLException("Unexpected pages relationship for " + relId + ": " + pageContentsPart);
            }

            XDGFPageContents contents = (XDGFPageContents)pageContentsPart;
            XDGFPage page = new XDGFPage(pageSettings, contents, this._document, this);
            contents.onDocumentRead();
            this._pages.add(page);
         }

      } catch (POIXMLException var11) {
         throw XDGFException.wrap((POIXMLDocumentPart)this, var11);
      }
   }

   public List getPageList() {
      return Collections.unmodifiableList(this._pages);
   }
}
