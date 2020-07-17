package org.apache.poi.xslf.usermodel;

import java.awt.Insets;
import java.net.URI;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.usermodel.PictureShape;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFSimpleShape;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STShapeType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPictureNonVisual;

public class XSLFPictureShape extends XSLFSimpleShape implements PictureShape {

   private XSLFPictureData _data;


   XSLFPictureShape(CTPicture shape, XSLFSheet sheet) {
      super(shape, sheet);
   }

   static CTPicture prototype(int shapeId, String rel) {
      CTPicture ct = CTPicture.Factory.newInstance();
      CTPictureNonVisual nvSpPr = ct.addNewNvPicPr();
      CTNonVisualDrawingProps cnv = nvSpPr.addNewCNvPr();
      cnv.setName("Picture " + shapeId);
      cnv.setId((long)(shapeId + 1));
      nvSpPr.addNewCNvPicPr().addNewPicLocks().setNoChangeAspect(true);
      nvSpPr.addNewNvPr();
      CTBlipFillProperties blipFill = ct.addNewBlipFill();
      CTBlip blip = blipFill.addNewBlip();
      blip.setEmbed(rel);
      blipFill.addNewStretch().addNewFillRect();
      CTShapeProperties spPr = ct.addNewSpPr();
      CTPresetGeometry2D prst = spPr.addNewPrstGeom();
      prst.setPrst(STShapeType.RECT);
      prst.addNewAvLst();
      return ct;
   }

   public boolean isExternalLinkedPicture() {
      return this.getBlipId() == null && this.getBlipLink() != null;
   }

   public XSLFPictureData getPictureData() {
      if(this._data == null) {
         String blipId = this.getBlipId();
         if(blipId == null) {
            return null;
         }

         PackagePart p = this.getSheet().getPackagePart();
         PackageRelationship rel = p.getRelationship(blipId);
         if(rel != null) {
            try {
               PackagePart e = p.getRelatedPart(rel);
               this._data = new XSLFPictureData(e);
            } catch (Exception var5) {
               throw new POIXMLException(var5);
            }
         }
      }

      return this._data;
   }

   public void setPlaceholder(Placeholder placeholder) {
      super.setPlaceholder(placeholder);
   }

   public URI getPictureLink() {
      if(this.getBlipId() != null) {
         return null;
      } else {
         String rId = this.getBlipLink();
         if(rId == null) {
            return null;
         } else {
            PackagePart p = this.getSheet().getPackagePart();
            PackageRelationship rel = p.getRelationship(rId);
            return rel != null?rel.getTargetURI():null;
         }
      }
   }

   protected CTBlipFillProperties getBlipFill() {
      CTPicture ct = (CTPicture)this.getXmlObject();
      CTBlipFillProperties bfp = ct.getBlipFill();
      if(bfp != null) {
         return bfp;
      } else {
         String xquery = "declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\'; declare namespace mc=\'http://schemas.openxmlformats.org/markup-compatibility/2006\' .//mc:Fallback/p:blipFill";
         XmlObject xo = this.selectProperty(XmlObject.class, xquery);

         CTPicture xo1;
         try {
            xo1 = CTPicture.Factory.parse(xo.getDomNode());
         } catch (XmlException var6) {
            return null;
         }

         return ((CTPicture)xo1).getBlipFill();
      }
   }

   protected CTBlip getBlip() {
      return this.getBlipFill().getBlip();
   }

   protected String getBlipLink() {
      String link = this.getBlip().getLink();
      return link.isEmpty()?null:link;
   }

   protected String getBlipId() {
      String id = this.getBlip().getEmbed();
      return id.isEmpty()?null:id;
   }

   public Insets getClipping() {
      CTRelativeRect r = this.getBlipFill().getSrcRect();
      return r == null?null:new Insets(r.getT(), r.getL(), r.getB(), r.getR());
   }

   void copy(XSLFShape sh) {
      super.copy(sh);
      XSLFPictureShape p = (XSLFPictureShape)sh;
      String blipId = p.getBlipId();
      String relId = this.getSheet().importBlip(blipId, p.getSheet().getPackagePart());
      CTPicture ct = (CTPicture)this.getXmlObject();
      CTBlip blip = this.getBlipFill().getBlip();
      blip.setEmbed(relId);
      CTApplicationNonVisualDrawingProps nvPr = ct.getNvPicPr().getNvPr();
      if(nvPr.isSetCustDataLst()) {
         nvPr.unsetCustDataLst();
      }

      if(blip.isSetExtLst()) {
         CTOfficeArtExtensionList extLst = blip.getExtLst();
         CTOfficeArtExtension[] arr$ = extLst.getExtArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTOfficeArtExtension ext = arr$[i$];
            String xpath = "declare namespace a14=\'http://schemas.microsoft.com/office/drawing/2010/main\' $this//a14:imgProps/a14:imgLayer";
            XmlObject[] obj = ext.selectPath(xpath);
            if(obj != null && obj.length == 1) {
               XmlCursor c = obj[0].newCursor();
               String id = c.getAttributeText(new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "embed"));
               String newId = this.getSheet().importBlip(id, p.getSheet().getPackagePart());
               c.setAttributeText(new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "embed"), newId);
               c.dispose();
            }
         }
      }

   }
}
