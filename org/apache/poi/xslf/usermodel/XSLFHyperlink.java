package org.apache.poi.xslf.usermodel;

import java.net.URI;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.sl.usermodel.Hyperlink;
import org.apache.poi.sl.usermodel.Slide;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.usermodel.XSLFRelation;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;

public class XSLFHyperlink implements Hyperlink {

   final XSLFSheet _sheet;
   final CTHyperlink _link;


   XSLFHyperlink(CTHyperlink link, XSLFSheet sheet) {
      this._sheet = sheet;
      this._link = link;
   }

   @Internal
   public CTHyperlink getXmlObject() {
      return this._link;
   }

   public void setAddress(String address) {
      this.linkToUrl(address);
   }

   public String getAddress() {
      String id = this._link.getId();
      if(id != null && !"".equals(id)) {
         URI targetURI = this._sheet.getPackagePart().getRelationship(id).getTargetURI();
         return targetURI.toASCIIString();
      } else {
         return this._link.getAction();
      }
   }

   public String getLabel() {
      return this._link.getTooltip();
   }

   public void setLabel(String label) {
      this._link.setTooltip(label);
   }

   public int getType() {
      return this.getTypeEnum().getCode();
   }

   public HyperlinkType getTypeEnum() {
      String action = this._link.getAction();
      if(action == null) {
         action = "";
      }

      if(!action.equals("ppaction://hlinksldjump") && !action.startsWith("ppaction://hlinkshowjump")) {
         String address = this.getAddress();
         if(address == null) {
            address = "";
         }

         return address.startsWith("mailto:")?HyperlinkType.EMAIL:HyperlinkType.URL;
      } else {
         return HyperlinkType.DOCUMENT;
      }
   }

   public void linkToEmail(String emailAddress) {
      this.linkToExternal("mailto:" + emailAddress);
      this.setLabel(emailAddress);
   }

   public void linkToUrl(String url) {
      this.linkToExternal(url);
      this.setLabel(url);
   }

   private void linkToExternal(String url) {
      PackagePart thisPP = this._sheet.getPackagePart();
      if(this._link.isSetId() && !this._link.getId().isEmpty()) {
         thisPP.removeRelationship(this._link.getId());
      }

      PackageRelationship rel = thisPP.addExternalRelationship(url, XSLFRelation.HYPERLINK.getRelation());
      this._link.setId(rel.getId());
      if(this._link.isSetAction()) {
         this._link.unsetAction();
      }

   }

   public void linkToSlide(Slide slide) {
      PackagePart thisPP = this._sheet.getPackagePart();
      PackagePartName otherPPN = ((XSLFSheet)slide).getPackagePart().getPartName();
      if(this._link.isSetId() && !this._link.getId().isEmpty()) {
         thisPP.removeRelationship(this._link.getId());
      }

      PackageRelationship rel = thisPP.addRelationship(otherPPN, TargetMode.INTERNAL, XSLFRelation.SLIDE.getRelation());
      this._link.setId(rel.getId());
      this._link.setAction("ppaction://hlinksldjump");
   }

   public void linkToNextSlide() {
      this.linkToRelativeSlide("nextslide");
   }

   public void linkToPreviousSlide() {
      this.linkToRelativeSlide("previousslide");
   }

   public void linkToFirstSlide() {
      this.linkToRelativeSlide("firstslide");
   }

   public void linkToLastSlide() {
      this.linkToRelativeSlide("lastslide");
   }

   private void linkToRelativeSlide(String jump) {
      PackagePart thisPP = this._sheet.getPackagePart();
      if(this._link.isSetId() && !this._link.getId().isEmpty()) {
         thisPP.removeRelationship(this._link.getId());
      }

      this._link.setId("");
      this._link.setAction("ppaction://hlinkshowjump?jump=" + jump);
   }
}
