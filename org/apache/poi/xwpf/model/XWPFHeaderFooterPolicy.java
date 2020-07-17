package org.apache.poi.xwpf.model;

import com.microsoft.schemas.office.office.CTLock;
import com.microsoft.schemas.office.office.STConnectType;
import com.microsoft.schemas.vml.CTFormulas;
import com.microsoft.schemas.vml.CTGroup;
import com.microsoft.schemas.vml.CTH;
import com.microsoft.schemas.vml.CTHandles;
import com.microsoft.schemas.vml.CTPath;
import com.microsoft.schemas.vml.CTShape;
import com.microsoft.schemas.vml.CTShapetype;
import com.microsoft.schemas.vml.CTTextPath;
import com.microsoft.schemas.vml.STExt;
import com.microsoft.schemas.vml.STTrueFalse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFactory;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFHeaderFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FtrDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHdrFtr;

public class XWPFHeaderFooterPolicy {

   private static final POILogger LOG = POILogFactory.getLogger(XWPFHeaderFooterPolicy.class);
   public static final STHdrFtr.Enum DEFAULT = STHdrFtr.DEFAULT;
   public static final STHdrFtr.Enum EVEN = STHdrFtr.EVEN;
   public static final STHdrFtr.Enum FIRST = STHdrFtr.FIRST;
   private XWPFDocument doc;
   private XWPFHeader firstPageHeader;
   private XWPFFooter firstPageFooter;
   private XWPFHeader evenPageHeader;
   private XWPFFooter evenPageFooter;
   private XWPFHeader defaultHeader;
   private XWPFFooter defaultFooter;


   public XWPFHeaderFooterPolicy(XWPFDocument doc) {
      this(doc, doc.getDocument().getBody().getSectPr());
   }

   public XWPFHeaderFooterPolicy(XWPFDocument doc, CTSectPr sectPr) {
      this.doc = doc;

      int i;
      CTHdrFtrRef ref;
      POIXMLDocumentPart relatedPart;
      STHdrFtr.Enum type;
      for(i = 0; i < sectPr.sizeOfHeaderReferenceArray(); ++i) {
         ref = sectPr.getHeaderReferenceArray(i);
         relatedPart = doc.getRelationById(ref.getId());
         XWPFHeader ftr = null;
         if(relatedPart != null && relatedPart instanceof XWPFHeader) {
            ftr = (XWPFHeader)relatedPart;
         }

         type = ref.getType();
         this.assignHeader(ftr, type);
      }

      for(i = 0; i < sectPr.sizeOfFooterReferenceArray(); ++i) {
         ref = sectPr.getFooterReferenceArray(i);
         relatedPart = doc.getRelationById(ref.getId());
         XWPFFooter var8 = null;
         if(relatedPart != null && relatedPart instanceof XWPFFooter) {
            var8 = (XWPFFooter)relatedPart;
         }

         type = ref.getType();
         this.assignFooter(var8, type);
      }

   }

   private void assignFooter(XWPFFooter ftr, STHdrFtr.Enum type) {
      if(type == STHdrFtr.FIRST) {
         this.firstPageFooter = ftr;
      } else if(type == STHdrFtr.EVEN) {
         this.evenPageFooter = ftr;
      } else {
         this.defaultFooter = ftr;
      }

   }

   private void assignHeader(XWPFHeader hdr, STHdrFtr.Enum type) {
      if(type == STHdrFtr.FIRST) {
         this.firstPageHeader = hdr;
      } else if(type == STHdrFtr.EVEN) {
         this.evenPageHeader = hdr;
      } else {
         this.defaultHeader = hdr;
      }

   }

   public XWPFHeader createHeader(STHdrFtr.Enum type) throws IOException {
      return this.createHeader(type, (XWPFParagraph[])null);
   }

   public XWPFHeader createHeader(STHdrFtr.Enum type, XWPFParagraph[] pars) throws IOException {
      XWPFRelation relation = XWPFRelation.HEADER;
      String pStyle = "Header";
      int i = this.getRelationIndex(relation);
      HdrDocument hdrDoc = HdrDocument.Factory.newInstance();
      XWPFHeader wrapper = (XWPFHeader)this.doc.createRelationship(relation, XWPFFactory.getInstance(), i);
      wrapper.setXWPFDocument(this.doc);
      CTHdrFtr hdr = this.buildHdr(type, pStyle, wrapper, pars);
      wrapper.setHeaderFooter(hdr);
      OutputStream outputStream = wrapper.getPackagePart().getOutputStream();
      hdrDoc.setHdr(hdr);
      this.assignHeader(wrapper, type);
      hdrDoc.save(outputStream, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      outputStream.close();
      return wrapper;
   }

   public XWPFFooter createFooter(STHdrFtr.Enum type) throws IOException {
      return this.createFooter(type, (XWPFParagraph[])null);
   }

   public XWPFFooter createFooter(STHdrFtr.Enum type, XWPFParagraph[] pars) throws IOException {
      XWPFRelation relation = XWPFRelation.FOOTER;
      String pStyle = "Footer";
      int i = this.getRelationIndex(relation);
      FtrDocument ftrDoc = FtrDocument.Factory.newInstance();
      XWPFFooter wrapper = (XWPFFooter)this.doc.createRelationship(relation, XWPFFactory.getInstance(), i);
      wrapper.setXWPFDocument(this.doc);
      CTHdrFtr ftr = this.buildFtr(type, pStyle, wrapper, pars);
      wrapper.setHeaderFooter(ftr);
      OutputStream outputStream = wrapper.getPackagePart().getOutputStream();
      ftrDoc.setFtr(ftr);
      this.assignFooter(wrapper, type);
      ftrDoc.save(outputStream, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      outputStream.close();
      return wrapper;
   }

   private int getRelationIndex(XWPFRelation relation) {
      int i = 1;
      Iterator i$ = this.doc.getRelationParts().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart.RelationPart rp = (POIXMLDocumentPart.RelationPart)i$.next();
         if(rp.getRelationship().getRelationshipType().equals(relation.getRelation())) {
            ++i;
         }
      }

      return i;
   }

   private CTHdrFtr buildFtr(STHdrFtr.Enum type, String pStyle, XWPFHeaderFooter wrapper, XWPFParagraph[] pars) {
      CTHdrFtr ftr = this.buildHdrFtr(pStyle, pars, wrapper);
      this.setFooterReference(type, wrapper);
      return ftr;
   }

   private CTHdrFtr buildHdr(STHdrFtr.Enum type, String pStyle, XWPFHeaderFooter wrapper, XWPFParagraph[] pars) {
      CTHdrFtr hdr = this.buildHdrFtr(pStyle, pars, wrapper);
      this.setHeaderReference(type, wrapper);
      return hdr;
   }

   private CTHdrFtr buildHdrFtr(String pStyle, XWPFParagraph[] paragraphs, XWPFHeaderFooter wrapper) {
      CTHdrFtr ftr = wrapper._getHdrFtr();
      if(paragraphs != null) {
         for(int p = 0; p < paragraphs.length; ++p) {
            CTP body = ftr.addNewP();
            ftr.setPArray(p, paragraphs[p].getCTP());
         }
      } else {
         CTP var10 = ftr.addNewP();
         CTBody var11 = this.doc.getDocument().getBody();
         if(var11.sizeOfPArray() > 0) {
            CTP pPr = var11.getPArray(0);
            if(pPr.isSetRsidR()) {
               byte[] rsidr = pPr.getRsidR();
               byte[] rsidrdefault = pPr.getRsidRDefault();
               var10.setRsidP(rsidr);
               var10.setRsidRDefault(rsidrdefault);
            }
         }

         CTPPr var12 = var10.addNewPPr();
         var12.addNewPStyle().setVal(pStyle);
      }

      return ftr;
   }

   private void setFooterReference(STHdrFtr.Enum type, XWPFHeaderFooter wrapper) {
      CTHdrFtrRef ref = this.doc.getDocument().getBody().getSectPr().addNewFooterReference();
      ref.setType(type);
      ref.setId(this.doc.getRelationId(wrapper));
   }

   private void setHeaderReference(STHdrFtr.Enum type, XWPFHeaderFooter wrapper) {
      CTHdrFtrRef ref = this.doc.getDocument().getBody().getSectPr().addNewHeaderReference();
      ref.setType(type);
      ref.setId(this.doc.getRelationId(wrapper));
   }

   public XWPFHeader getFirstPageHeader() {
      return this.firstPageHeader;
   }

   public XWPFFooter getFirstPageFooter() {
      return this.firstPageFooter;
   }

   public XWPFHeader getOddPageHeader() {
      return this.defaultHeader;
   }

   public XWPFFooter getOddPageFooter() {
      return this.defaultFooter;
   }

   public XWPFHeader getEvenPageHeader() {
      return this.evenPageHeader;
   }

   public XWPFFooter getEvenPageFooter() {
      return this.evenPageFooter;
   }

   public XWPFHeader getDefaultHeader() {
      return this.defaultHeader;
   }

   public XWPFFooter getDefaultFooter() {
      return this.defaultFooter;
   }

   public XWPFHeader getHeader(int pageNumber) {
      return pageNumber == 1 && this.firstPageHeader != null?this.firstPageHeader:(pageNumber % 2 == 0 && this.evenPageHeader != null?this.evenPageHeader:this.defaultHeader);
   }

   public XWPFFooter getFooter(int pageNumber) {
      return pageNumber == 1 && this.firstPageFooter != null?this.firstPageFooter:(pageNumber % 2 == 0 && this.evenPageFooter != null?this.evenPageFooter:this.defaultFooter);
   }

   public void createWatermark(String text) {
      XWPFParagraph[] pars = new XWPFParagraph[1];

      try {
         pars[0] = this.getWatermarkParagraph(text, 1);
         this.createHeader(DEFAULT, pars);
         pars[0] = this.getWatermarkParagraph(text, 2);
         this.createHeader(FIRST, pars);
         pars[0] = this.getWatermarkParagraph(text, 3);
         this.createHeader(EVEN, pars);
      } catch (IOException var4) {
         LOG.log(7, new Object[]{"error while creating watermark", var4});
      }

   }

   private XWPFParagraph getWatermarkParagraph(String text, int idx) {
      CTP p = CTP.Factory.newInstance();
      byte[] rsidr = this.doc.getDocument().getBody().getPArray(0).getRsidR();
      byte[] rsidrdefault = this.doc.getDocument().getBody().getPArray(0).getRsidRDefault();
      p.setRsidP(rsidr);
      p.setRsidRDefault(rsidrdefault);
      CTPPr pPr = p.addNewPPr();
      pPr.addNewPStyle().setVal("Header");
      CTR r = p.addNewR();
      CTRPr rPr = r.addNewRPr();
      rPr.addNewNoProof();
      CTPicture pict = r.addNewPict();
      CTGroup group = CTGroup.Factory.newInstance();
      CTShapetype shapetype = group.addNewShapetype();
      shapetype.setId("_x0000_t136");
      shapetype.setCoordsize("1600,21600");
      shapetype.setSpt(136.0F);
      shapetype.setAdj("10800");
      shapetype.setPath2("m@7,0l@8,0m@5,21600l@6,21600e");
      CTFormulas formulas = shapetype.addNewFormulas();
      formulas.addNewF().setEqn("sum #0 0 10800");
      formulas.addNewF().setEqn("prod #0 2 1");
      formulas.addNewF().setEqn("sum 21600 0 @1");
      formulas.addNewF().setEqn("sum 0 0 @2");
      formulas.addNewF().setEqn("sum 21600 0 @3");
      formulas.addNewF().setEqn("if @0 @3 0");
      formulas.addNewF().setEqn("if @0 21600 @1");
      formulas.addNewF().setEqn("if @0 0 @2");
      formulas.addNewF().setEqn("if @0 @4 21600");
      formulas.addNewF().setEqn("mid @5 @6");
      formulas.addNewF().setEqn("mid @8 @5");
      formulas.addNewF().setEqn("mid @7 @8");
      formulas.addNewF().setEqn("mid @6 @7");
      formulas.addNewF().setEqn("sum @6 0 @5");
      CTPath path = shapetype.addNewPath();
      path.setTextpathok(STTrueFalse.T);
      path.setConnecttype(STConnectType.CUSTOM);
      path.setConnectlocs("@9,0;@10,10800;@11,21600;@12,10800");
      path.setConnectangles("270,180,90,0");
      CTTextPath shapeTypeTextPath = shapetype.addNewTextpath();
      shapeTypeTextPath.setOn(STTrueFalse.T);
      shapeTypeTextPath.setFitshape(STTrueFalse.T);
      CTHandles handles = shapetype.addNewHandles();
      CTH h = handles.addNewH();
      h.setPosition("#0,bottomRight");
      h.setXrange("6629,14971");
      CTLock lock = shapetype.addNewLock();
      lock.setExt(STExt.EDIT);
      CTShape shape = group.addNewShape();
      shape.setId("PowerPlusWaterMarkObject" + idx);
      shape.setSpid("_x0000_s102" + (4 + idx));
      shape.setType("#_x0000_t136");
      shape.setStyle("position:absolute;margin-left:0;margin-top:0;width:415pt;height:207.5pt;z-index:-251654144;mso-wrap-edited:f;mso-position-horizontal:center;mso-position-horizontal-relative:margin;mso-position-vertical:center;mso-position-vertical-relative:margin");
      shape.setWrapcoords("616 5068 390 16297 39 16921 -39 17155 7265 17545 7186 17467 -39 17467 18904 17467 10507 17467 8710 17545 18904 17077 18787 16843 18358 16297 18279 12554 19178 12476 20701 11774 20779 11228 21131 10059 21248 8811 21248 7563 20975 6316 20935 5380 19490 5146 14022 5068 2616 5068");
      shape.setFillcolor("black");
      shape.setStroked(STTrueFalse.FALSE);
      CTTextPath shapeTextPath = shape.addNewTextpath();
      shapeTextPath.setStyle("font-family:&quot;Cambria&quot;;font-size:1pt");
      shapeTextPath.setString(text);
      pict.set(group);
      return new XWPFParagraph(p, this.doc);
   }

}
