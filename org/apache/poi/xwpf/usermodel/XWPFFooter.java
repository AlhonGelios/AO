package org.apache.poi.xwpf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeaderFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFSDT;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FtrDocument;

public class XWPFFooter extends XWPFHeaderFooter {

   public XWPFFooter() {}

   public XWPFFooter(XWPFDocument doc, CTHdrFtr hdrFtr) throws IOException {
      super(doc, hdrFtr);
      XmlCursor cursor = this.headerFooter.newCursor();
      cursor.selectPath("./*");

      while(cursor.toNextSelection()) {
         XmlObject o = cursor.getObject();
         if(o instanceof CTP) {
            XWPFParagraph t = new XWPFParagraph((CTP)o, this);
            this.paragraphs.add(t);
            this.bodyElements.add(t);
         }

         if(o instanceof CTTbl) {
            XWPFTable t1 = new XWPFTable((CTTbl)o, this);
            this.tables.add(t1);
            this.bodyElements.add(t1);
         }
      }

      cursor.dispose();
   }

   public XWPFFooter(POIXMLDocumentPart parent, PackagePart part) throws IOException {
      super(parent, part);
   }

   @Deprecated
   public XWPFFooter(POIXMLDocumentPart parent, PackagePart part, PackageRelationship rel) throws IOException {
      this(parent, part);
   }

   protected void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTNumbering.type.getName().getNamespaceURI(), "ftr"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      super._getHdrFtr().save(out, xmlOptions);
      out.close();
   }

   protected void onDocumentRead() throws IOException {
      super.onDocumentRead();
      FtrDocument ftrDocument = null;
      InputStream is = null;

      try {
         is = this.getPackagePart().getInputStream();
         ftrDocument = FtrDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.headerFooter = ftrDocument.getFtr();
         XmlCursor e = this.headerFooter.newCursor();
         e.selectPath("./*");

         while(e.toNextSelection()) {
            XmlObject o = e.getObject();
            if(o instanceof CTP) {
               XWPFParagraph c = new XWPFParagraph((CTP)o, this);
               this.paragraphs.add(c);
               this.bodyElements.add(c);
            }

            if(o instanceof CTTbl) {
               XWPFTable c1 = new XWPFTable((CTTbl)o, this);
               this.tables.add(c1);
               this.bodyElements.add(c1);
            }

            if(o instanceof CTSdtBlock) {
               XWPFSDT c2 = new XWPFSDT((CTSdtBlock)o, this);
               this.bodyElements.add(c2);
            }
         }

         e.dispose();
      } catch (Exception var9) {
         throw new POIXMLException(var9);
      } finally {
         if(is != null) {
            is.close();
         }

      }
   }

   public BodyType getPartType() {
      return BodyType.FOOTER;
   }
}
