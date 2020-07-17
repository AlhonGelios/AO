package org.apache.poi.xssf.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.ss.usermodel.Name;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.ExternalLinkDocument;

public class ExternalLinksTable extends POIXMLDocumentPart {

   private CTExternalLink link;


   public ExternalLinksTable() {
      this.link = CTExternalLink.Factory.newInstance();
      this.link.addNewExternalBook();
   }

   public ExternalLinksTable(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   public ExternalLinksTable(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         ExternalLinkDocument e = ExternalLinkDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.link = e.getExternalLink();
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   public void writeTo(OutputStream out) throws IOException {
      ExternalLinkDocument doc = ExternalLinkDocument.Factory.newInstance();
      doc.setExternalLink(this.link);
      doc.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }

   public CTExternalLink getCTExternalLink() {
      return this.link;
   }

   public String getLinkedFileName() {
      String rId = this.link.getExternalBook().getId();
      PackageRelationship rel = this.getPackagePart().getRelationship(rId);
      return rel != null && rel.getTargetMode() == TargetMode.EXTERNAL?rel.getTargetURI().toString():null;
   }

   public void setLinkedFileName(String target) {
      String rId = this.link.getExternalBook().getId();
      if(rId != null && !rId.isEmpty()) {
         this.getPackagePart().removeRelationship(rId);
      }

      PackageRelationship newRel = this.getPackagePart().addExternalRelationship(target, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLinkPath");
      this.link.getExternalBook().setId(newRel.getId());
   }

   public List getSheetNames() {
      CTExternalSheetName[] sheetNames = this.link.getExternalBook().getSheetNames().getSheetNameArray();
      ArrayList names = new ArrayList(sheetNames.length);
      CTExternalSheetName[] arr$ = sheetNames;
      int len$ = sheetNames.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTExternalSheetName name = arr$[i$];
         names.add(name.getVal());
      }

      return names;
   }

   public List getDefinedNames() {
      CTExternalDefinedName[] extNames = this.link.getExternalBook().getDefinedNames().getDefinedNameArray();
      ArrayList names = new ArrayList(extNames.length);
      CTExternalDefinedName[] arr$ = extNames;
      int len$ = extNames.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTExternalDefinedName extName = arr$[i$];
         names.add(new ExternalLinksTable.ExternalName(extName));
      }

      return names;
   }

   protected class ExternalName implements Name {

      private CTExternalDefinedName name;


      protected ExternalName(CTExternalDefinedName name) {
         this.name = name;
      }

      public String getNameName() {
         return this.name.getName();
      }

      public void setNameName(String name) {
         this.name.setName(name);
      }

      public String getSheetName() {
         int sheetId = this.getSheetIndex();
         return sheetId >= 0?(String)ExternalLinksTable.this.getSheetNames().get(sheetId):null;
      }

      public int getSheetIndex() {
         return this.name.isSetSheetId()?(int)this.name.getSheetId():-1;
      }

      public void setSheetIndex(int sheetId) {
         this.name.setSheetId((long)sheetId);
      }

      public String getRefersToFormula() {
         return this.name.getRefersTo().substring(1);
      }

      public void setRefersToFormula(String formulaText) {
         this.name.setRefersTo('=' + formulaText);
      }

      public boolean isFunctionName() {
         return false;
      }

      public boolean isDeleted() {
         return false;
      }

      public String getComment() {
         return null;
      }

      public void setComment(String comment) {
         throw new IllegalStateException("Not Supported");
      }

      public void setFunction(boolean value) {
         throw new IllegalStateException("Not Supported");
      }
   }
}
