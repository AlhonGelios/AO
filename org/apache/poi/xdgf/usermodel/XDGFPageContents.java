package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.PageContentsDocument;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xdgf.exceptions.XDGFException;
import org.apache.poi.xdgf.usermodel.XDGFBaseContents;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFMaster;
import org.apache.poi.xdgf.usermodel.XDGFMasterContents;
import org.apache.poi.xdgf.usermodel.XDGFPage;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.xmlbeans.XmlException;

public class XDGFPageContents extends XDGFBaseContents {

   protected Map _masters;
   protected XDGFPage _page;


   public XDGFPageContents(PackagePart part, XDGFDocument document) {
      super(part, document);
      this._masters = new HashMap();
   }

   @Deprecated
   public XDGFPageContents(PackagePart part, PackageRelationship rel, XDGFDocument document) {
      this(part, document);
   }

   protected void onDocumentRead() {
      try {
         try {
            this._pageContents = PageContentsDocument.Factory.parse(this.getPackagePart().getInputStream()).getPageContents();
         } catch (XmlException var4) {
            throw new POIXMLException(var4);
         } catch (IOException var5) {
            throw new POIXMLException(var5);
         }

         Iterator e = this.getRelations().iterator();

         while(e.hasNext()) {
            POIXMLDocumentPart shape = (POIXMLDocumentPart)e.next();
            if(shape instanceof XDGFMasterContents) {
               XDGFMaster master = ((XDGFMasterContents)shape).getMaster();
               this._masters.put(Long.valueOf(master.getID()), master);
            }
         }

         super.onDocumentRead();
         e = this._shapes.values().iterator();

         while(e.hasNext()) {
            XDGFShape shape1 = (XDGFShape)e.next();
            if(shape1.isTopmost()) {
               shape1.setupMaster(this, (XDGFMasterContents)null);
            }
         }

      } catch (POIXMLException var6) {
         throw XDGFException.wrap((POIXMLDocumentPart)this, var6);
      }
   }

   public XDGFPage getPage() {
      return this._page;
   }

   protected void setPage(XDGFPage page) {
      this._page = page;
   }

   public XDGFMaster getMasterById(long id) {
      return (XDGFMaster)this._masters.get(Long.valueOf(id));
   }
}
