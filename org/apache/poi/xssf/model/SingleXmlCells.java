package org.apache.poi.xssf.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.helpers.XSSFSingleXmlCell;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.SingleXmlCellsDocument;

public class SingleXmlCells extends POIXMLDocumentPart {

   private CTSingleXmlCells singleXMLCells;


   public SingleXmlCells() {
      this.singleXMLCells = CTSingleXmlCells.Factory.newInstance();
   }

   public SingleXmlCells(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   public SingleXmlCells(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         SingleXmlCellsDocument e = SingleXmlCellsDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.singleXMLCells = e.getSingleXmlCells();
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   public XSSFSheet getXSSFSheet() {
      return (XSSFSheet)this.getParent();
   }

   protected void writeTo(OutputStream out) throws IOException {
      SingleXmlCellsDocument doc = SingleXmlCellsDocument.Factory.newInstance();
      doc.setSingleXmlCells(this.singleXMLCells);
      doc.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }

   public CTSingleXmlCells getCTSingleXMLCells() {
      return this.singleXMLCells;
   }

   public List getAllSimpleXmlCell() {
      Vector list = new Vector();
      CTSingleXmlCell[] arr$ = this.singleXMLCells.getSingleXmlCellArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTSingleXmlCell singleXmlCell = arr$[i$];
         list.add(new XSSFSingleXmlCell(singleXmlCell, this));
      }

      return list;
   }
}
