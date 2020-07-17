package org.apache.poi.xslf.usermodel;

import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawSlide;
import org.apache.poi.sl.usermodel.Notes;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.sl.usermodel.Slide;
import org.apache.poi.util.DocumentHelper;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.xslf.usermodel.XSLFBackground;
import org.apache.poi.xslf.usermodel.XSLFComments;
import org.apache.poi.xslf.usermodel.XSLFNotes;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackground;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.SldDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public final class XSLFSlide extends XSLFSheet implements Slide {

   private final CTSlide _slide;
   private XSLFSlideLayout _layout;
   private XSLFComments _comments;
   private XSLFNotes _notes;


   XSLFSlide() {
      this._slide = prototype();
      this.setCommonSlideData(this._slide.getCSld());
   }

   XSLFSlide(PackagePart part) throws IOException, XmlException {
      super(part);

      Document _doc;
      try {
         _doc = DocumentHelper.readDocument(this.getPackagePart().getInputStream());
      } catch (SAXException var4) {
         throw new IOException(var4);
      }

      SldDocument doc = SldDocument.Factory.parse((Node)_doc, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._slide = doc.getSld();
      this.setCommonSlideData(this._slide.getCSld());
   }

   @Deprecated
   XSLFSlide(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   private static CTSlide prototype() {
      CTSlide ctSlide = CTSlide.Factory.newInstance();
      CTCommonSlideData cSld = ctSlide.addNewCSld();
      CTGroupShape spTree = cSld.addNewSpTree();
      CTGroupShapeNonVisual nvGrpSpPr = spTree.addNewNvGrpSpPr();
      CTNonVisualDrawingProps cnvPr = nvGrpSpPr.addNewCNvPr();
      cnvPr.setId(1L);
      cnvPr.setName("");
      nvGrpSpPr.addNewCNvGrpSpPr();
      nvGrpSpPr.addNewNvPr();
      CTGroupShapeProperties grpSpr = spTree.addNewGrpSpPr();
      CTGroupTransform2D xfrm = grpSpr.addNewXfrm();
      CTPoint2D off = xfrm.addNewOff();
      off.setX(0L);
      off.setY(0L);
      CTPositiveSize2D ext = xfrm.addNewExt();
      ext.setCx(0L);
      ext.setCy(0L);
      CTPoint2D choff = xfrm.addNewChOff();
      choff.setX(0L);
      choff.setY(0L);
      CTPositiveSize2D chExt = xfrm.addNewChExt();
      chExt.setCx(0L);
      chExt.setCy(0L);
      ctSlide.addNewClrMapOvr().addNewMasterClrMapping();
      return ctSlide;
   }

   public CTSlide getXmlObject() {
      return this._slide;
   }

   protected String getRootElementName() {
      return "sld";
   }

   public XSLFSlideLayout getMasterSheet() {
      return this.getSlideLayout();
   }

   public XSLFSlideLayout getSlideLayout() {
      if(this._layout == null) {
         Iterator i$ = this.getRelations().iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart p = (POIXMLDocumentPart)i$.next();
            if(p instanceof XSLFSlideLayout) {
               this._layout = (XSLFSlideLayout)p;
            }
         }
      }

      if(this._layout == null) {
         throw new IllegalArgumentException("SlideLayout was not found for " + this.toString());
      } else {
         return this._layout;
      }
   }

   public XSLFSlideMaster getSlideMaster() {
      return this.getSlideLayout().getSlideMaster();
   }

   public XSLFComments getComments() {
      if(this._comments == null) {
         Iterator i$ = this.getRelations().iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart p = (POIXMLDocumentPart)i$.next();
            if(p instanceof XSLFComments) {
               this._comments = (XSLFComments)p;
            }
         }
      }

      return this._comments == null?null:this._comments;
   }

   public XSLFNotes getNotes() {
      if(this._notes == null) {
         Iterator i$ = this.getRelations().iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart p = (POIXMLDocumentPart)i$.next();
            if(p instanceof XSLFNotes) {
               this._notes = (XSLFNotes)p;
            }
         }
      }

      return this._notes == null?null:this._notes;
   }

   public String getTitle() {
      XSLFTextShape txt = this.getTextShapeByType(Placeholder.TITLE);
      return txt == null?null:txt.getText();
   }

   public XSLFTheme getTheme() {
      return this.getSlideLayout().getSlideMaster().getTheme();
   }

   public XSLFBackground getBackground() {
      CTBackground bg = this._slide.getCSld().getBg();
      return bg != null?new XSLFBackground(bg, this):this.getMasterSheet().getBackground();
   }

   public boolean getFollowMasterGraphics() {
      return this._slide.isSetShowMasterSp() && this._slide.getShowMasterSp();
   }

   public void setFollowMasterGraphics(boolean value) {
      this._slide.setShowMasterSp(value);
   }

   public boolean getFollowMasterObjects() {
      return this.getFollowMasterGraphics();
   }

   public void setFollowMasterObjects(boolean follow) {
      this.setFollowMasterGraphics(follow);
   }

   public XSLFSlide importContent(XSLFSheet src) {
      super.importContent(src);
      XSLFBackground bgShape = this.getBackground();
      if(bgShape != null) {
         CTBackground bg = (CTBackground)bgShape.getXmlObject();
         if(bg.isSetBgPr() && bg.getBgPr().isSetBlipFill()) {
            CTBlip blip = bg.getBgPr().getBlipFill().getBlip();
            String blipId = blip.getEmbed();
            String relId = this.importBlip(blipId, src.getPackagePart());
            blip.setEmbed(relId);
         }
      }

      return this;
   }

   public boolean getFollowMasterBackground() {
      return false;
   }

   @NotImplemented
   public void setFollowMasterBackground(boolean follow) {
      throw new UnsupportedOperationException();
   }

   public boolean getFollowMasterColourScheme() {
      return false;
   }

   @NotImplemented
   public void setFollowMasterColourScheme(boolean follow) {
      throw new UnsupportedOperationException();
   }

   @NotImplemented
   public void setNotes(Notes notes) {
      assert notes instanceof XSLFNotes;

   }

   public int getSlideNumber() {
      int idx = this.getSlideShow().getSlides().indexOf(this);
      return idx == -1?idx:idx + 1;
   }

   public void draw(Graphics2D graphics) {
      DrawFactory drawFact = DrawFactory.getInstance(graphics);
      DrawSlide draw = drawFact.getDrawable((Slide)this);
      draw.draw(graphics);
   }

}
