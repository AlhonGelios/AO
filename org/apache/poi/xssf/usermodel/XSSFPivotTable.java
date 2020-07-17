package org.apache.poi.xssf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataConsolidateFunction;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFPivotCache;
import org.apache.poi.xssf.usermodel.XSSFPivotCacheDefinition;
import org.apache.poi.xssf.usermodel.XSSFPivotCacheRecords;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class XSSFPivotTable extends POIXMLDocumentPart {

   protected static final short CREATED_VERSION = 3;
   protected static final short MIN_REFRESHABLE_VERSION = 3;
   protected static final short UPDATED_VERSION = 3;
   private CTPivotTableDefinition pivotTableDefinition;
   private XSSFPivotCacheDefinition pivotCacheDefinition;
   private XSSFPivotCache pivotCache;
   private XSSFPivotCacheRecords pivotCacheRecords;
   private Sheet parentSheet;
   private Sheet dataSheet;


   protected XSSFPivotTable() {
      this.pivotTableDefinition = CTPivotTableDefinition.Factory.newInstance();
      this.pivotCache = new XSSFPivotCache();
      this.pivotCacheDefinition = new XSSFPivotCacheDefinition();
      this.pivotCacheRecords = new XSSFPivotCacheRecords();
   }

   protected XSSFPivotTable(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   protected XSSFPivotTable(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         XmlOptions e = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         e.setLoadReplaceDocumentElement((QName)null);
         this.pivotTableDefinition = CTPivotTableDefinition.Factory.parse(is, e);
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   public void setPivotCache(XSSFPivotCache pivotCache) {
      this.pivotCache = pivotCache;
   }

   public XSSFPivotCache getPivotCache() {
      return this.pivotCache;
   }

   public Sheet getParentSheet() {
      return this.parentSheet;
   }

   public void setParentSheet(XSSFSheet parentSheet) {
      this.parentSheet = parentSheet;
   }

   @Internal
   public CTPivotTableDefinition getCTPivotTableDefinition() {
      return this.pivotTableDefinition;
   }

   @Internal
   public void setCTPivotTableDefinition(CTPivotTableDefinition pivotTableDefinition) {
      this.pivotTableDefinition = pivotTableDefinition;
   }

   public XSSFPivotCacheDefinition getPivotCacheDefinition() {
      return this.pivotCacheDefinition;
   }

   public void setPivotCacheDefinition(XSSFPivotCacheDefinition pivotCacheDefinition) {
      this.pivotCacheDefinition = pivotCacheDefinition;
   }

   public XSSFPivotCacheRecords getPivotCacheRecords() {
      return this.pivotCacheRecords;
   }

   public void setPivotCacheRecords(XSSFPivotCacheRecords pivotCacheRecords) {
      this.pivotCacheRecords = pivotCacheRecords;
   }

   public Sheet getDataSheet() {
      return this.dataSheet;
   }

   private void setDataSheet(Sheet dataSheet) {
      this.dataSheet = dataSheet;
   }

   protected void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTPivotTableDefinition.type.getName().getNamespaceURI(), "pivotTableDefinition"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.pivotTableDefinition.save(out, xmlOptions);
      out.close();
   }

   protected void setDefaultPivotTableDefinition() {
      this.pivotTableDefinition.setMultipleFieldFilters(false);
      this.pivotTableDefinition.setIndent(0L);
      this.pivotTableDefinition.setCreatedVersion((short)3);
      this.pivotTableDefinition.setMinRefreshableVersion((short)3);
      this.pivotTableDefinition.setUpdatedVersion((short)3);
      this.pivotTableDefinition.setItemPrintTitles(true);
      this.pivotTableDefinition.setUseAutoFormatting(true);
      this.pivotTableDefinition.setApplyNumberFormats(false);
      this.pivotTableDefinition.setApplyWidthHeightFormats(true);
      this.pivotTableDefinition.setApplyAlignmentFormats(false);
      this.pivotTableDefinition.setApplyPatternFormats(false);
      this.pivotTableDefinition.setApplyFontFormats(false);
      this.pivotTableDefinition.setApplyBorderFormats(false);
      this.pivotTableDefinition.setCacheId(this.pivotCache.getCTPivotCache().getCacheId());
      this.pivotTableDefinition.setName("PivotTable" + this.pivotTableDefinition.getCacheId());
      this.pivotTableDefinition.setDataCaption("Values");
      CTPivotTableStyle style = this.pivotTableDefinition.addNewPivotTableStyleInfo();
      style.setName("PivotStyleLight16");
      style.setShowLastColumn(true);
      style.setShowColStripes(false);
      style.setShowRowStripes(false);
      style.setShowColHeaders(true);
      style.setShowRowHeaders(true);
   }

   protected AreaReference getPivotArea() {
      AreaReference pivotArea = new AreaReference(this.getPivotCacheDefinition().getCTPivotCacheDefinition().getCacheSource().getWorksheetSource().getRef(), SpreadsheetVersion.EXCEL2007);
      return pivotArea;
   }

   private void checkColumnIndex(int columnIndex) throws IndexOutOfBoundsException {
      AreaReference pivotArea = this.getPivotArea();
      int size = pivotArea.getLastCell().getCol() - pivotArea.getFirstCell().getCol() + 1;
      if(columnIndex < 0 || columnIndex >= size) {
         throw new IndexOutOfBoundsException("Column Index: " + columnIndex + ", Size: " + size);
      }
   }

   public void addRowLabel(int columnIndex) {
      this.checkColumnIndex(columnIndex);
      AreaReference pivotArea = this.getPivotArea();
      int lastRowIndex = pivotArea.getLastCell().getRow() - pivotArea.getFirstCell().getRow();
      CTPivotFields pivotFields = this.pivotTableDefinition.getPivotFields();
      CTPivotField pivotField = CTPivotField.Factory.newInstance();
      CTItems items = pivotField.addNewItems();
      pivotField.setAxis(STAxis.AXIS_ROW);
      pivotField.setShowAll(false);

      for(int rowFields = 0; rowFields <= lastRowIndex; ++rowFields) {
         items.addNewItem().setT(STItemType.DEFAULT);
      }

      items.setCount((long)items.sizeOfItemArray());
      pivotFields.setPivotFieldArray(columnIndex, pivotField);
      CTRowFields var8;
      if(this.pivotTableDefinition.getRowFields() != null) {
         var8 = this.pivotTableDefinition.getRowFields();
      } else {
         var8 = this.pivotTableDefinition.addNewRowFields();
      }

      var8.addNewField().setX(columnIndex);
      var8.setCount((long)var8.sizeOfFieldArray());
   }

   public List getRowLabelColumns() {
      if(this.pivotTableDefinition.getRowFields() == null) {
         return Collections.emptyList();
      } else {
         ArrayList columnIndexes = new ArrayList();
         CTField[] arr$ = this.pivotTableDefinition.getRowFields().getFieldArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTField f = arr$[i$];
            columnIndexes.add(Integer.valueOf(f.getX()));
         }

         return columnIndexes;
      }
   }

   public void addColumnLabel(DataConsolidateFunction function, int columnIndex, String valueFieldName) {
      this.checkColumnIndex(columnIndex);
      this.addDataColumn(columnIndex, true);
      this.addDataField(function, columnIndex, valueFieldName);
      if(this.pivotTableDefinition.getDataFields().getCount() == 2L) {
         CTColFields colFields;
         if(this.pivotTableDefinition.getColFields() != null) {
            colFields = this.pivotTableDefinition.getColFields();
         } else {
            colFields = this.pivotTableDefinition.addNewColFields();
         }

         colFields.addNewField().setX(-2);
         colFields.setCount((long)colFields.sizeOfFieldArray());
      }

   }

   public void addColumnLabel(DataConsolidateFunction function, int columnIndex) {
      this.addColumnLabel(function, columnIndex, function.getName());
   }

   private void addDataField(DataConsolidateFunction function, int columnIndex, String valueFieldName) {
      this.checkColumnIndex(columnIndex);
      AreaReference pivotArea = this.getPivotArea();
      CTDataFields dataFields;
      if(this.pivotTableDefinition.getDataFields() != null) {
         dataFields = this.pivotTableDefinition.getDataFields();
      } else {
         dataFields = this.pivotTableDefinition.addNewDataFields();
      }

      CTDataField dataField = dataFields.addNewDataField();
      dataField.setSubtotal(STDataConsolidateFunction.Enum.forInt(function.getValue()));
      Cell cell = this.getDataSheet().getRow(pivotArea.getFirstCell().getRow()).getCell(pivotArea.getFirstCell().getCol() + columnIndex);
      cell.setCellType(CellType.STRING);
      dataField.setName(valueFieldName);
      dataField.setFld((long)columnIndex);
      dataFields.setCount((long)dataFields.sizeOfDataFieldArray());
   }

   public void addDataColumn(int columnIndex, boolean isDataField) {
      this.checkColumnIndex(columnIndex);
      CTPivotFields pivotFields = this.pivotTableDefinition.getPivotFields();
      CTPivotField pivotField = CTPivotField.Factory.newInstance();
      pivotField.setDataField(isDataField);
      pivotField.setShowAll(false);
      pivotFields.setPivotFieldArray(columnIndex, pivotField);
   }

   public void addReportFilter(int columnIndex) {
      this.checkColumnIndex(columnIndex);
      AreaReference pivotArea = this.getPivotArea();
      int lastRowIndex = pivotArea.getLastCell().getRow() - pivotArea.getFirstCell().getRow();
      CTPivotFields pivotFields = this.pivotTableDefinition.getPivotFields();
      CTPivotField pivotField = CTPivotField.Factory.newInstance();
      CTItems items = pivotField.addNewItems();
      pivotField.setAxis(STAxis.AXIS_PAGE);
      pivotField.setShowAll(false);

      for(int pageFields = 0; pageFields <= lastRowIndex; ++pageFields) {
         items.addNewItem().setT(STItemType.DEFAULT);
      }

      items.setCount((long)items.sizeOfItemArray());
      pivotFields.setPivotFieldArray(columnIndex, pivotField);
      CTPageFields var9;
      if(this.pivotTableDefinition.getPageFields() != null) {
         var9 = this.pivotTableDefinition.getPageFields();
         this.pivotTableDefinition.setMultipleFieldFilters(true);
      } else {
         var9 = this.pivotTableDefinition.addNewPageFields();
      }

      CTPageField pageField = var9.addNewPageField();
      pageField.setHier(-1);
      pageField.setFld(columnIndex);
      var9.setCount((long)var9.sizeOfPageFieldArray());
      this.pivotTableDefinition.getLocation().setColPageCount(var9.getCount());
   }

   protected void createSourceReferences(AreaReference source, CellReference position, Sheet sourceSheet) {
      AreaReference destination = new AreaReference(position, new CellReference(position.getRow() + 1, position.getCol() + 1));
      CTLocation location;
      if(this.pivotTableDefinition.getLocation() == null) {
         location = this.pivotTableDefinition.addNewLocation();
         location.setFirstDataCol(1L);
         location.setFirstDataRow(1L);
         location.setFirstHeaderRow(1L);
      } else {
         location = this.pivotTableDefinition.getLocation();
      }

      location.setRef(destination.formatAsString());
      this.pivotTableDefinition.setLocation(location);
      CTPivotCacheDefinition cacheDef = this.getPivotCacheDefinition().getCTPivotCacheDefinition();
      CTCacheSource cacheSource = cacheDef.addNewCacheSource();
      cacheSource.setType(STSourceType.WORKSHEET);
      CTWorksheetSource worksheetSource = cacheSource.addNewWorksheetSource();
      worksheetSource.setSheet(sourceSheet.getSheetName());
      this.setDataSheet(sourceSheet);
      String[] firstCell = source.getFirstCell().getCellRefParts();
      String[] lastCell = source.getLastCell().getCellRefParts();
      worksheetSource.setRef(firstCell[2] + firstCell[1] + ':' + lastCell[2] + lastCell[1]);
   }

   protected void createDefaultDataColumns() {
      CTPivotFields pivotFields;
      if(this.pivotTableDefinition.getPivotFields() != null) {
         pivotFields = this.pivotTableDefinition.getPivotFields();
      } else {
         pivotFields = this.pivotTableDefinition.addNewPivotFields();
      }

      AreaReference sourceArea = this.getPivotArea();
      short firstColumn = sourceArea.getFirstCell().getCol();
      short lastColumn = sourceArea.getLastCell().getCol();

      for(int i = 0; i <= lastColumn - firstColumn; ++i) {
         CTPivotField pivotField = pivotFields.addNewPivotField();
         pivotField.setDataField(false);
         pivotField.setShowAll(false);
      }

      pivotFields.setCount((long)pivotFields.sizeOfPivotFieldArray());
   }
}
