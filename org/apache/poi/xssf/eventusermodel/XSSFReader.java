package org.apache.poi.xssf.eventusermodel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.xssf.model.CommentsTable;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.model.ThemesTable;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class XSSFReader {

   private OPCPackage pkg;
   private PackagePart workbookPart;


   public XSSFReader(OPCPackage pkg) throws IOException, OpenXML4JException {
      this.pkg = pkg;
      PackageRelationship coreDocRelationship = this.pkg.getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument").getRelationship(0);
      if(coreDocRelationship == null) {
         if(this.pkg.getRelationshipsByType("http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument").getRelationship(0) != null) {
            throw new POIXMLException("Strict OOXML isn\'t currently supported, please see bug #57699");
         } else {
            throw new POIXMLException("OOXML file structure broken/invalid - no core document found!");
         }
      } else {
         this.workbookPart = this.pkg.getPart(coreDocRelationship);
      }
   }

   public SharedStringsTable getSharedStringsTable() throws IOException, InvalidFormatException {
      ArrayList parts = this.pkg.getPartsByContentType(XSSFRelation.SHARED_STRINGS.getContentType());
      return parts.size() == 0?null:new SharedStringsTable((PackagePart)parts.get(0), (PackageRelationship)null);
   }

   public StylesTable getStylesTable() throws IOException, InvalidFormatException {
      ArrayList parts = this.pkg.getPartsByContentType(XSSFRelation.STYLES.getContentType());
      if(parts.size() == 0) {
         return null;
      } else {
         StylesTable styles = new StylesTable((PackagePart)parts.get(0), (PackageRelationship)null);
         parts = this.pkg.getPartsByContentType(XSSFRelation.THEME.getContentType());
         if(parts.size() != 0) {
            styles.setTheme(new ThemesTable((PackagePart)parts.get(0), (PackageRelationship)null));
         }

         return styles;
      }
   }

   public InputStream getSharedStringsData() throws IOException, InvalidFormatException {
      return XSSFRelation.SHARED_STRINGS.getContents(this.workbookPart);
   }

   public InputStream getStylesData() throws IOException, InvalidFormatException {
      return XSSFRelation.STYLES.getContents(this.workbookPart);
   }

   public InputStream getThemesData() throws IOException, InvalidFormatException {
      return XSSFRelation.THEME.getContents(this.workbookPart);
   }

   public InputStream getWorkbookData() throws IOException, InvalidFormatException {
      return this.workbookPart.getInputStream();
   }

   public InputStream getSheet(String relId) throws IOException, InvalidFormatException {
      PackageRelationship rel = this.workbookPart.getRelationship(relId);
      if(rel == null) {
         throw new IllegalArgumentException("No Sheet found with r:id " + relId);
      } else {
         PackagePartName relName = PackagingURIHelper.createPartName(rel.getTargetURI());
         PackagePart sheet = this.pkg.getPart(relName);
         if(sheet == null) {
            throw new IllegalArgumentException("No data found for Sheet with r:id " + relId);
         } else {
            return sheet.getInputStream();
         }
      }
   }

   public Iterator getSheetsData() throws IOException, InvalidFormatException {
      return new XSSFReader.SheetIterator(this.workbookPart, (XSSFReader.NamelessClass743350999)null);
   }

   // $FF: synthetic class
   static class NamelessClass743350999 {
   }

   public static class SheetIterator implements Iterator {

      private Map sheetMap;
      private CTSheet ctSheet;
      private Iterator sheetIterator;


      private SheetIterator(PackagePart wb) throws IOException {
         try {
            this.sheetMap = new HashMap();
            Iterator e = wb.getRelationships().iterator();

            while(e.hasNext()) {
               PackageRelationship rel = (PackageRelationship)e.next();
               if(rel.getRelationshipType().equals(XSSFRelation.WORKSHEET.getRelation()) || rel.getRelationshipType().equals(XSSFRelation.CHARTSHEET.getRelation())) {
                  PackagePartName relName = PackagingURIHelper.createPartName(rel.getTargetURI());
                  this.sheetMap.put(rel.getId(), wb.getPackage().getPart(relName));
               }
            }

            CTWorkbook e1 = WorkbookDocument.Factory.parse(wb.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS).getWorkbook();
            this.sheetIterator = e1.getSheets().getSheetList().iterator();
         } catch (InvalidFormatException var5) {
            throw new POIXMLException(var5);
         } catch (XmlException var6) {
            throw new POIXMLException(var6);
         }
      }

      public boolean hasNext() {
         return this.sheetIterator.hasNext();
      }

      public InputStream next() {
         this.ctSheet = (CTSheet)this.sheetIterator.next();
         String sheetId = this.ctSheet.getId();

         try {
            PackagePart e = (PackagePart)this.sheetMap.get(sheetId);
            return e.getInputStream();
         } catch (IOException var3) {
            throw new POIXMLException(var3);
         }
      }

      public String getSheetName() {
         return this.ctSheet.getName();
      }

      public CommentsTable getSheetComments() {
         PackagePart sheetPkg = this.getSheetPart();

         try {
            PackageRelationshipCollection e = sheetPkg.getRelationshipsByType(XSSFRelation.SHEET_COMMENTS.getRelation());
            if(e.size() > 0) {
               PackageRelationship comments = e.getRelationship(0);
               PackagePartName commentsName = PackagingURIHelper.createPartName(comments.getTargetURI());
               PackagePart commentsPart = sheetPkg.getPackage().getPart(commentsName);
               return new CommentsTable(commentsPart, comments);
            } else {
               return null;
            }
         } catch (InvalidFormatException var6) {
            return null;
         } catch (IOException var7) {
            return null;
         }
      }

      public List getShapes() {
         PackagePart sheetPkg = this.getSheetPart();
         LinkedList shapes = new LinkedList();

         try {
            PackageRelationshipCollection e = sheetPkg.getRelationshipsByType(XSSFRelation.DRAWINGS.getRelation());

            for(int i = 0; i < e.size(); ++i) {
               PackageRelationship drawings = e.getRelationship(i);
               PackagePartName drawingsName = PackagingURIHelper.createPartName(drawings.getTargetURI());
               PackagePart drawingsPart = sheetPkg.getPackage().getPart(drawingsName);
               XSSFDrawing drawing = new XSSFDrawing(drawingsPart, drawings);
               Iterator i$ = drawing.getShapes().iterator();

               while(i$.hasNext()) {
                  XSSFShape shape = (XSSFShape)i$.next();
                  shapes.add(shape);
               }
            }

            return shapes;
         } catch (XmlException var11) {
            return null;
         } catch (InvalidFormatException var12) {
            return null;
         } catch (IOException var13) {
            return null;
         }
      }

      public PackagePart getSheetPart() {
         String sheetId = this.ctSheet.getId();
         return (PackagePart)this.sheetMap.get(sheetId);
      }

      public void remove() {
         throw new IllegalStateException("Not supported");
      }

      // $FF: synthetic method
      SheetIterator(PackagePart x0, XSSFReader.NamelessClass743350999 x1) throws IOException {
         this(x0);
      }
   }
}
