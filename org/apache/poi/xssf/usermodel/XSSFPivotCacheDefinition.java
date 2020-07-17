package org.apache.poi.xssf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition;

public class XSSFPivotCacheDefinition extends POIXMLDocumentPart {

   private CTPivotCacheDefinition ctPivotCacheDefinition;


   public XSSFPivotCacheDefinition() {
      this.ctPivotCacheDefinition = CTPivotCacheDefinition.Factory.newInstance();
      this.createDefaultValues();
   }

   protected XSSFPivotCacheDefinition(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   protected XSSFPivotCacheDefinition(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         XmlOptions e = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         e.setLoadReplaceDocumentElement((QName)null);
         this.ctPivotCacheDefinition = CTPivotCacheDefinition.Factory.parse(is, e);
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   @Internal
   public CTPivotCacheDefinition getCTPivotCacheDefinition() {
      return this.ctPivotCacheDefinition;
   }

   private void createDefaultValues() {
      this.ctPivotCacheDefinition.setCreatedVersion((short)3);
      this.ctPivotCacheDefinition.setMinRefreshableVersion((short)3);
      this.ctPivotCacheDefinition.setRefreshedVersion((short)3);
      this.ctPivotCacheDefinition.setRefreshedBy("Apache POI");
      this.ctPivotCacheDefinition.setRefreshedDate((double)(new Date()).getTime());
      this.ctPivotCacheDefinition.setRefreshOnLoad(true);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTPivotCacheDefinition.type.getName().getNamespaceURI(), "pivotCacheDefinition"));
      this.ctPivotCacheDefinition.save(out, xmlOptions);
      out.close();
   }

   protected void createCacheFields(Sheet sheet) {
      AreaReference ar = new AreaReference(this.ctPivotCacheDefinition.getCacheSource().getWorksheetSource().getRef());
      CellReference firstCell = ar.getFirstCell();
      CellReference lastCell = ar.getLastCell();
      short columnStart = firstCell.getCol();
      short columnEnd = lastCell.getCol();
      Row row = sheet.getRow(firstCell.getRow());
      CTCacheFields cFields;
      if(this.ctPivotCacheDefinition.getCacheFields() != null) {
         cFields = this.ctPivotCacheDefinition.getCacheFields();
      } else {
         cFields = this.ctPivotCacheDefinition.addNewCacheFields();
      }

      for(int i = columnStart; i <= columnEnd; ++i) {
         CTCacheField cf = cFields.addNewCacheField();
         if(i == columnEnd) {
            cFields.setCount((long)cFields.sizeOfCacheFieldArray());
         }

         cf.setNumFmtId(0L);
         Cell cell = row.getCell(i);
         cell.setCellType(CellType.STRING);
         cf.setName(row.getCell(i).getStringCellValue());
         cf.addNewSharedItems();
      }

   }
}
