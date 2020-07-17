package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.MasterContentsDocument;
import java.io.IOException;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xdgf.exceptions.XDGFException;
import org.apache.poi.xdgf.usermodel.XDGFBaseContents;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFMaster;
import org.apache.xmlbeans.XmlException;

public class XDGFMasterContents extends XDGFBaseContents {

   protected XDGFMaster _master;


   public XDGFMasterContents(PackagePart part, XDGFDocument document) {
      super(part, document);
   }

   @Deprecated
   public XDGFMasterContents(PackagePart part, PackageRelationship rel, XDGFDocument document) {
      this(part, document);
   }

   protected void onDocumentRead() {
      try {
         try {
            this._pageContents = MasterContentsDocument.Factory.parse(this.getPackagePart().getInputStream()).getMasterContents();
         } catch (XmlException var2) {
            throw new POIXMLException(var2);
         } catch (IOException var3) {
            throw new POIXMLException(var3);
         }

         super.onDocumentRead();
      } catch (POIXMLException var4) {
         throw XDGFException.wrap((POIXMLDocumentPart)this, var4);
      }
   }

   public XDGFMaster getMaster() {
      return this._master;
   }

   protected void setMaster(XDGFMaster master) {
      this._master = master;
   }
}
