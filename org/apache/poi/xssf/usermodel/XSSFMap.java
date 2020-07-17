package org.apache.poi.xssf.usermodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.model.MapInfo;
import org.apache.poi.xssf.model.SingleXmlCells;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.helpers.XSSFSingleXmlCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema;
import org.w3c.dom.Node;

public class XSSFMap {

   private CTMap ctMap;
   private MapInfo mapInfo;


   public XSSFMap(CTMap ctMap, MapInfo mapInfo) {
      this.ctMap = ctMap;
      this.mapInfo = mapInfo;
   }

   @Internal
   public CTMap getCtMap() {
      return this.ctMap;
   }

   @Internal
   public CTSchema getCTSchema() {
      String schemaId = this.ctMap.getSchemaID();
      return this.mapInfo.getCTSchemaById(schemaId);
   }

   public Node getSchema() {
      Node xmlSchema = null;
      CTSchema schema = this.getCTSchema();
      xmlSchema = schema.getDomNode().getFirstChild();
      return xmlSchema;
   }

   public List getRelatedSingleXMLCell() {
      ArrayList relatedSimpleXmlCells = new ArrayList();
      int sheetNumber = this.mapInfo.getWorkbook().getNumberOfSheets();

      for(int i = 0; i < sheetNumber; ++i) {
         XSSFSheet sheet = this.mapInfo.getWorkbook().getSheetAt(i);
         Iterator i$ = sheet.getRelations().iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart p = (POIXMLDocumentPart)i$.next();
            if(p instanceof SingleXmlCells) {
               SingleXmlCells singleXMLCells = (SingleXmlCells)p;
               Iterator i$1 = singleXMLCells.getAllSimpleXmlCell().iterator();

               while(i$1.hasNext()) {
                  XSSFSingleXmlCell cell = (XSSFSingleXmlCell)i$1.next();
                  if(cell.getMapId() == this.ctMap.getID()) {
                     relatedSimpleXmlCells.add(cell);
                  }
               }
            }
         }
      }

      return relatedSimpleXmlCells;
   }

   public List getRelatedTables() {
      ArrayList tables = new ArrayList();
      Iterator i$ = this.mapInfo.getWorkbook().iterator();

      while(i$.hasNext()) {
         Sheet sheet = (Sheet)i$.next();
         Iterator i$1 = ((XSSFSheet)sheet).getRelationParts().iterator();

         while(i$1.hasNext()) {
            POIXMLDocumentPart.RelationPart rp = (POIXMLDocumentPart.RelationPart)i$1.next();
            if(rp.getRelationship().getRelationshipType().equals(XSSFRelation.TABLE.getRelation())) {
               XSSFTable table = (XSSFTable)rp.getDocumentPart();
               if(table.mapsTo(this.ctMap.getID())) {
                  tables.add(table);
               }
            }
         }
      }

      return tables;
   }
}
