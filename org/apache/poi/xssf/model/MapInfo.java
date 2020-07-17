package org.apache.poi.xssf.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xssf.usermodel.XSSFMap;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.MapInfoDocument;

public class MapInfo extends POIXMLDocumentPart {

   private CTMapInfo mapInfo;
   private Map maps;


   public MapInfo() {
      this.mapInfo = CTMapInfo.Factory.newInstance();
   }

   public MapInfo(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   public MapInfo(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         MapInfoDocument e = MapInfoDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.mapInfo = e.getMapInfo();
         this.maps = new HashMap();
         CTMap[] arr$ = this.mapInfo.getMapArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTMap map = arr$[i$];
            this.maps.put(Integer.valueOf((int)map.getID()), new XSSFMap(map, this));
         }

      } catch (XmlException var7) {
         throw new IOException(var7.getLocalizedMessage());
      }
   }

   public XSSFWorkbook getWorkbook() {
      return (XSSFWorkbook)this.getParent();
   }

   public CTMapInfo getCTMapInfo() {
      return this.mapInfo;
   }

   public CTSchema getCTSchemaById(String schemaId) {
      CTSchema xmlSchema = null;
      CTSchema[] arr$ = this.mapInfo.getSchemaArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTSchema schema = arr$[i$];
         if(schema.getID().equals(schemaId)) {
            xmlSchema = schema;
            break;
         }
      }

      return xmlSchema;
   }

   public XSSFMap getXSSFMapById(int id) {
      return (XSSFMap)this.maps.get(Integer.valueOf(id));
   }

   public XSSFMap getXSSFMapByName(String name) {
      XSSFMap matchedMap = null;
      Iterator i$ = this.maps.values().iterator();

      while(i$.hasNext()) {
         XSSFMap map = (XSSFMap)i$.next();
         if(map.getCtMap().getName() != null && map.getCtMap().getName().equals(name)) {
            matchedMap = map;
         }
      }

      return matchedMap;
   }

   public Collection getAllXSSFMaps() {
      return this.maps.values();
   }

   protected void writeTo(OutputStream out) throws IOException {
      MapInfoDocument doc = MapInfoDocument.Factory.newInstance();
      doc.setMapInfo(this.mapInfo);
      doc.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }
}
