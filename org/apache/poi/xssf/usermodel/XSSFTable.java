package org.apache.poi.xssf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.usermodel.Table;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.poi.util.StringUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.helpers.XSSFXmlColumnPr;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.TableDocument;

public class XSSFTable extends POIXMLDocumentPart implements Table {

   private CTTable ctTable;
   private List xmlColumnPr;
   private CTTableColumn[] ctColumns;
   private HashMap columnMap;
   private CellReference startCellReference;
   private CellReference endCellReference;
   private String commonXPath;


   public XSSFTable() {
      this.ctTable = CTTable.Factory.newInstance();
   }

   public XSSFTable(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   public XSSFTable(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         TableDocument e = TableDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.ctTable = e.getTable();
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   public XSSFSheet getXSSFSheet() {
      return (XSSFSheet)this.getParent();
   }

   public void writeTo(OutputStream out) throws IOException {
      this.updateHeaders();
      TableDocument doc = TableDocument.Factory.newInstance();
      doc.setTable(this.ctTable);
      doc.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }

   @Internal(
      since = "POI 3.15 beta 3"
   )
   public CTTable getCTTable() {
      return this.ctTable;
   }

   public boolean mapsTo(long id) {
      List pointers = this.getXmlColumnPrs();
      Iterator i$ = pointers.iterator();

      XSSFXmlColumnPr pointer;
      do {
         if(!i$.hasNext()) {
            return false;
         }

         pointer = (XSSFXmlColumnPr)i$.next();
      } while(pointer.getMapId() != id);

      return true;
   }

   private CTTableColumn[] getTableColumns() {
      if(this.ctColumns == null) {
         this.ctColumns = this.ctTable.getTableColumns().getTableColumnArray();
      }

      return this.ctColumns;
   }

   public String getCommonXpath() {
      if(this.commonXPath == null) {
         String[] commonTokens = new String[0];
         CTTableColumn[] arr$ = this.getTableColumns();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTTableColumn column = arr$[i$];
            if(column.getXmlColumnPr() != null) {
               String xpath = column.getXmlColumnPr().getXpath();
               String[] tokens = xpath.split("/");
               if(commonTokens.length == 0) {
                  commonTokens = tokens;
               } else {
                  int maxLength = Math.min(commonTokens.length, tokens.length);

                  for(int i = 0; i < maxLength; ++i) {
                     if(!commonTokens[i].equals(tokens[i])) {
                        List subCommonTokens = Arrays.asList(commonTokens).subList(0, i);
                        String[] container = new String[0];
                        commonTokens = (String[])subCommonTokens.toArray(container);
                        break;
                     }
                  }
               }
            }
         }

         commonTokens[0] = "";
         this.commonXPath = StringUtil.join((Object[])commonTokens, "/");
      }

      return this.commonXPath;
   }

   public List getXmlColumnPrs() {
      if(this.xmlColumnPr == null) {
         this.xmlColumnPr = new ArrayList();
         CTTableColumn[] arr$ = this.getTableColumns();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTTableColumn column = arr$[i$];
            if(column.getXmlColumnPr() != null) {
               XSSFXmlColumnPr columnPr = new XSSFXmlColumnPr(this, column, column.getXmlColumnPr());
               this.xmlColumnPr.add(columnPr);
            }
         }
      }

      return this.xmlColumnPr;
   }

   public String getName() {
      return this.ctTable.getName();
   }

   public void setName(String name) {
      if(name == null) {
         this.ctTable.unsetName();
      } else {
         this.ctTable.setName(name);
      }
   }

   public String getDisplayName() {
      return this.ctTable.getDisplayName();
   }

   public void setDisplayName(String name) {
      this.ctTable.setDisplayName(name);
   }

   public long getNumberOfMappedColumns() {
      return this.ctTable.getTableColumns().getCount();
   }

   public long getNumerOfMappedColumns() {
      return this.getNumberOfMappedColumns();
   }

   public CellReference getStartCellReference() {
      if(this.startCellReference == null) {
         this.setCellReferences();
      }

      return this.startCellReference;
   }

   public CellReference getEndCellReference() {
      if(this.endCellReference == null) {
         this.setCellReferences();
      }

      return this.endCellReference;
   }

   private void setCellReferences() {
      String ref = this.ctTable.getRef();
      if(ref != null) {
         String[] boundaries = ref.split(":", 2);
         String from = boundaries[0];
         String to = boundaries[1];
         this.startCellReference = new CellReference(from);
         this.endCellReference = new CellReference(to);
      }

   }

   public void updateReferences() {
      this.startCellReference = null;
      this.endCellReference = null;
   }

   public int getRowCount() {
      CellReference from = this.getStartCellReference();
      CellReference to = this.getEndCellReference();
      int rowCount = 0;
      if(from != null && to != null) {
         rowCount = to.getRow() - from.getRow() + 1;
      }

      return rowCount;
   }

   public void updateHeaders() {
      XSSFSheet sheet = (XSSFSheet)this.getParent();
      CellReference ref = this.getStartCellReference();
      if(ref != null) {
         int headerRow = ref.getRow();
         short firstHeaderColumn = ref.getCol();
         XSSFRow row = sheet.getRow(headerRow);
         if(row != null && row.getCTRow().validate()) {
            int cellnum = firstHeaderColumn;
            CTTableColumn[] arr$ = this.getCTTable().getTableColumns().getTableColumnArray();
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               CTTableColumn col = arr$[i$];
               XSSFCell cell = row.getCell(cellnum);
               if(cell != null) {
                  col.setName(cell.getStringCellValue());
               }

               ++cellnum;
            }

            this.ctColumns = null;
            this.columnMap = null;
            this.xmlColumnPr = null;
            this.commonXPath = null;
         }

      }
   }

   private static String caseInsensitive(String s) {
      return s.toUpperCase(Locale.ROOT);
   }

   public int findColumnIndex(String columnHeader) {
      if(columnHeader == null) {
         return -1;
      } else {
         if(this.columnMap == null) {
            int idx = this.getTableColumns().length;
            this.columnMap = new HashMap(idx * 3 / 2);
            int i = 0;
            CTTableColumn[] arr$ = this.getTableColumns();
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               CTTableColumn column = arr$[i$];
               String columnName = column.getName();
               this.columnMap.put(caseInsensitive(columnName), Integer.valueOf(i));
               ++i;
            }
         }

         Integer var9 = (Integer)this.columnMap.get(caseInsensitive(columnHeader.replace("\'", "")));
         return var9 == null?-1:var9.intValue();
      }
   }

   public String getSheetName() {
      return this.getXSSFSheet().getSheetName();
   }

   public boolean isHasTotalsRow() {
      return this.ctTable.getTotalsRowShown();
   }

   public int getStartColIndex() {
      return this.getStartCellReference().getCol();
   }

   public int getStartRowIndex() {
      return this.getStartCellReference().getRow();
   }

   public int getEndColIndex() {
      return this.getEndCellReference().getCol();
   }

   public int getEndRowIndex() {
      return this.getEndCellReference().getRow();
   }
}
