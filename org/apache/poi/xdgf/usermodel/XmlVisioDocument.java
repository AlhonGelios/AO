package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentDocument1;
import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.util.PackageHelper;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFFactory;
import org.apache.poi.xdgf.usermodel.XDGFMasters;
import org.apache.poi.xdgf.usermodel.XDGFPages;
import org.apache.poi.xdgf.usermodel.XDGFStyleSheet;
import org.apache.xmlbeans.XmlException;

public class XmlVisioDocument extends POIXMLDocument {

   protected XDGFPages _pages;
   protected XDGFMasters _masters;
   protected XDGFDocument _document;


   public XmlVisioDocument(OPCPackage pkg) throws IOException {
      super(pkg, "http://schemas.microsoft.com/visio/2010/relationships/document");

      VisioDocumentType document;
      try {
         document = VisioDocumentDocument1.Factory.parse(this.getPackagePart().getInputStream()).getVisioDocument();
      } catch (XmlException var4) {
         throw new POIXMLException(var4);
      } catch (IOException var5) {
         throw new POIXMLException(var5);
      }

      this._document = new XDGFDocument(document);
      this.load(new XDGFFactory(this._document));
   }

   public XmlVisioDocument(InputStream is) throws IOException {
      this(PackageHelper.open(is));
   }

   protected void onDocumentRead() throws IOException {
      Iterator i$ = this.getRelations().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart part = (POIXMLDocumentPart)i$.next();
         if(part instanceof XDGFPages) {
            this._pages = (XDGFPages)part;
         } else if(part instanceof XDGFMasters) {
            this._masters = (XDGFMasters)part;
         }
      }

      if(this._masters != null) {
         this._masters.onDocumentRead();
      }

      this._pages.onDocumentRead();
   }

   public List getAllEmbedds() throws OpenXML4JException {
      return new ArrayList();
   }

   public Collection getPages() {
      return this._pages.getPageList();
   }

   public XDGFStyleSheet getStyleById(long id) {
      return this._document.getStyleById(id);
   }
}
