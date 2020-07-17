package org.apache.poi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.ContentTypes;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.StreamHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart;
import org.apache.poi.openxml4j.util.Nullable;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.PropertiesDocument;

public class POIXMLProperties {

   private OPCPackage pkg;
   private POIXMLProperties.CoreProperties core;
   private POIXMLProperties.ExtendedProperties ext;
   private POIXMLProperties.CustomProperties cust;
   private PackagePart extPart;
   private PackagePart custPart;
   private static final PropertiesDocument NEW_EXT_INSTANCE = PropertiesDocument.Factory.newInstance();
   private static final org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument NEW_CUST_INSTANCE;


   public POIXMLProperties(OPCPackage docPackage) throws IOException, OpenXML4JException, XmlException {
      this.pkg = docPackage;
      this.core = new POIXMLProperties.CoreProperties((PackagePropertiesPart)this.pkg.getPackageProperties(), (POIXMLProperties.NamelessClass1981257595)null);
      PackageRelationshipCollection extRel = this.pkg.getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties");
      if(extRel.size() == 1) {
         this.extPart = this.pkg.getPart(extRel.getRelationship(0));
         PropertiesDocument custRel = PropertiesDocument.Factory.parse(this.extPart.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.ext = new POIXMLProperties.ExtendedProperties(custRel, (POIXMLProperties.NamelessClass1981257595)null);
      } else {
         this.extPart = null;
         this.ext = new POIXMLProperties.ExtendedProperties((PropertiesDocument)NEW_EXT_INSTANCE.copy(), (POIXMLProperties.NamelessClass1981257595)null);
      }

      PackageRelationshipCollection custRel1 = this.pkg.getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties");
      if(custRel1.size() == 1) {
         this.custPart = this.pkg.getPart(custRel1.getRelationship(0));
         org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument props = org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument.parse(this.custPart.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.cust = new POIXMLProperties.CustomProperties(props, (POIXMLProperties.NamelessClass1981257595)null);
      } else {
         this.custPart = null;
         this.cust = new POIXMLProperties.CustomProperties((org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument)NEW_CUST_INSTANCE.copy(), (POIXMLProperties.NamelessClass1981257595)null);
      }

   }

   public POIXMLProperties.CoreProperties getCoreProperties() {
      return this.core;
   }

   public POIXMLProperties.ExtendedProperties getExtendedProperties() {
      return this.ext;
   }

   public POIXMLProperties.CustomProperties getCustomProperties() {
      return this.cust;
   }

   protected PackagePart getThumbnailPart() {
      PackageRelationshipCollection rels = this.pkg.getRelationshipsByType("http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail");
      return rels.size() == 1?this.pkg.getPart(rels.getRelationship(0)):null;
   }

   public String getThumbnailFilename() {
      PackagePart tPart = this.getThumbnailPart();
      if(tPart == null) {
         return null;
      } else {
         String name = tPart.getPartName().getName();
         return name.substring(name.lastIndexOf(47));
      }
   }

   public InputStream getThumbnailImage() throws IOException {
      PackagePart tPart = this.getThumbnailPart();
      return tPart == null?null:tPart.getInputStream();
   }

   public void setThumbnail(String filename, InputStream imageData) throws IOException {
      PackagePart tPart = this.getThumbnailPart();
      if(tPart == null) {
         this.pkg.addThumbnail(filename, imageData);
      } else {
         String newType = ContentTypes.getContentTypeFromFileExtension(filename);
         if(!newType.equals(tPart.getContentType())) {
            throw new IllegalArgumentException("Can\'t set a Thumbnail of type " + newType + " when existing one is of a different type " + tPart.getContentType());
         }

         StreamHelper.copyStream(imageData, tPart.getOutputStream());
      }

   }

   public void commit() throws IOException {
      PackagePartName out;
      if(this.extPart == null && !NEW_EXT_INSTANCE.toString().equals(this.ext.props.toString())) {
         try {
            out = PackagingURIHelper.createPartName("/docProps/app.xml");
            this.pkg.addRelationship(out, TargetMode.INTERNAL, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties");
            this.extPart = this.pkg.createPart(out, "application/vnd.openxmlformats-officedocument.extended-properties+xml");
         } catch (InvalidFormatException var3) {
            throw new POIXMLException(var3);
         }
      }

      if(this.custPart == null && !NEW_CUST_INSTANCE.toString().equals(this.cust.props.toString())) {
         try {
            out = PackagingURIHelper.createPartName("/docProps/custom.xml");
            this.pkg.addRelationship(out, TargetMode.INTERNAL, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties");
            this.custPart = this.pkg.createPart(out, "application/vnd.openxmlformats-officedocument.custom-properties+xml");
         } catch (InvalidFormatException var2) {
            throw new POIXMLException(var2);
         }
      }

      OutputStream out1;
      if(this.extPart != null) {
         out1 = this.extPart.getOutputStream();
         if(this.extPart.getSize() > 0L) {
            this.extPart.clear();
         }

         this.ext.props.save(out1, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         out1.close();
      }

      if(this.custPart != null) {
         out1 = this.custPart.getOutputStream();
         this.cust.props.save(out1, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         out1.close();
      }

   }

   static {
      NEW_EXT_INSTANCE.addNewProperties();
      NEW_CUST_INSTANCE = org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument.newInstance();
      NEW_CUST_INSTANCE.addNewProperties();
   }

   public static class CustomProperties {

      public static final String FORMAT_ID = "{D5CDD505-2E9C-101B-9397-08002B2CF9AE}";
      private org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument props;


      private CustomProperties(org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument props) {
         this.props = props;
      }

      public CTProperties getUnderlyingProperties() {
         return this.props.getProperties();
      }

      private CTProperty add(String name) {
         if(this.contains(name)) {
            throw new IllegalArgumentException("A property with this name already exists in the custom properties");
         } else {
            CTProperty p = this.props.getProperties().addNewProperty();
            int pid = this.nextPid();
            p.setPid(pid);
            p.setFmtid("{D5CDD505-2E9C-101B-9397-08002B2CF9AE}");
            p.setName(name);
            return p;
         }
      }

      public void addProperty(String name, String value) {
         CTProperty p = this.add(name);
         p.setLpwstr(value);
      }

      public void addProperty(String name, double value) {
         CTProperty p = this.add(name);
         p.setR8(value);
      }

      public void addProperty(String name, int value) {
         CTProperty p = this.add(name);
         p.setI4(value);
      }

      public void addProperty(String name, boolean value) {
         CTProperty p = this.add(name);
         p.setBool(value);
      }

      protected int nextPid() {
         int propid = 1;
         CTProperty[] arr$ = this.props.getProperties().getPropertyArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTProperty p = arr$[i$];
            if(p.getPid() > propid) {
               propid = p.getPid();
            }
         }

         return propid + 1;
      }

      public boolean contains(String name) {
         CTProperty[] arr$ = this.props.getProperties().getPropertyArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTProperty p = arr$[i$];
            if(p.getName().equals(name)) {
               return true;
            }
         }

         return false;
      }

      public CTProperty getProperty(String name) {
         CTProperty[] arr$ = this.props.getProperties().getPropertyArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTProperty p = arr$[i$];
            if(p.getName().equals(name)) {
               return p;
            }
         }

         return null;
      }

      // $FF: synthetic method
      CustomProperties(org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument x0, POIXMLProperties.NamelessClass1981257595 x1) {
         this(x0);
      }
   }

   public static class CoreProperties {

      private PackagePropertiesPart part;


      private CoreProperties(PackagePropertiesPart part) {
         this.part = part;
      }

      public String getCategory() {
         return (String)this.part.getCategoryProperty().getValue();
      }

      public void setCategory(String category) {
         this.part.setCategoryProperty(category);
      }

      public String getContentStatus() {
         return (String)this.part.getContentStatusProperty().getValue();
      }

      public void setContentStatus(String contentStatus) {
         this.part.setContentStatusProperty(contentStatus);
      }

      public String getContentType() {
         return (String)this.part.getContentTypeProperty().getValue();
      }

      public void setContentType(String contentType) {
         this.part.setContentTypeProperty(contentType);
      }

      public Date getCreated() {
         return (Date)this.part.getCreatedProperty().getValue();
      }

      public void setCreated(Nullable date) {
         this.part.setCreatedProperty(date);
      }

      public void setCreated(String date) {
         this.part.setCreatedProperty(date);
      }

      public String getCreator() {
         return (String)this.part.getCreatorProperty().getValue();
      }

      public void setCreator(String creator) {
         this.part.setCreatorProperty(creator);
      }

      public String getDescription() {
         return (String)this.part.getDescriptionProperty().getValue();
      }

      public void setDescription(String description) {
         this.part.setDescriptionProperty(description);
      }

      public String getIdentifier() {
         return (String)this.part.getIdentifierProperty().getValue();
      }

      public void setIdentifier(String identifier) {
         this.part.setIdentifierProperty(identifier);
      }

      public String getKeywords() {
         return (String)this.part.getKeywordsProperty().getValue();
      }

      public void setKeywords(String keywords) {
         this.part.setKeywordsProperty(keywords);
      }

      public Date getLastPrinted() {
         return (Date)this.part.getLastPrintedProperty().getValue();
      }

      public void setLastPrinted(Nullable date) {
         this.part.setLastPrintedProperty(date);
      }

      public void setLastPrinted(String date) {
         this.part.setLastPrintedProperty(date);
      }

      public String getLastModifiedByUser() {
         return (String)this.part.getLastModifiedByProperty().getValue();
      }

      public void setLastModifiedByUser(String user) {
         this.part.setLastModifiedByProperty(user);
      }

      public Date getModified() {
         return (Date)this.part.getModifiedProperty().getValue();
      }

      public void setModified(Nullable date) {
         this.part.setModifiedProperty(date);
      }

      public void setModified(String date) {
         this.part.setModifiedProperty(date);
      }

      public String getSubject() {
         return (String)this.part.getSubjectProperty().getValue();
      }

      public void setSubjectProperty(String subject) {
         this.part.setSubjectProperty(subject);
      }

      public void setTitle(String title) {
         this.part.setTitleProperty(title);
      }

      public String getTitle() {
         return (String)this.part.getTitleProperty().getValue();
      }

      public String getRevision() {
         return (String)this.part.getRevisionProperty().getValue();
      }

      public void setRevision(String revision) {
         try {
            Long.valueOf(revision);
            this.part.setRevisionProperty(revision);
         } catch (NumberFormatException var3) {
            ;
         }

      }

      public PackagePropertiesPart getUnderlyingProperties() {
         return this.part;
      }

      // $FF: synthetic method
      CoreProperties(PackagePropertiesPart x0, POIXMLProperties.NamelessClass1981257595 x1) {
         this(x0);
      }
   }

   public static class ExtendedProperties {

      private PropertiesDocument props;


      private ExtendedProperties(PropertiesDocument props) {
         this.props = props;
      }

      public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties getUnderlyingProperties() {
         return this.props.getProperties();
      }

      public String getTemplate() {
         return this.props.getProperties().isSetTemplate()?this.props.getProperties().getTemplate():null;
      }

      public String getManager() {
         return this.props.getProperties().isSetManager()?this.props.getProperties().getManager():null;
      }

      public String getCompany() {
         return this.props.getProperties().isSetCompany()?this.props.getProperties().getCompany():null;
      }

      public String getPresentationFormat() {
         return this.props.getProperties().isSetPresentationFormat()?this.props.getProperties().getPresentationFormat():null;
      }

      public String getApplication() {
         return this.props.getProperties().isSetApplication()?this.props.getProperties().getApplication():null;
      }

      public String getAppVersion() {
         return this.props.getProperties().isSetAppVersion()?this.props.getProperties().getAppVersion():null;
      }

      public int getPages() {
         return this.props.getProperties().isSetPages()?this.props.getProperties().getPages():-1;
      }

      public int getWords() {
         return this.props.getProperties().isSetWords()?this.props.getProperties().getWords():-1;
      }

      public int getCharacters() {
         return this.props.getProperties().isSetCharacters()?this.props.getProperties().getCharacters():-1;
      }

      public int getCharactersWithSpaces() {
         return this.props.getProperties().isSetCharactersWithSpaces()?this.props.getProperties().getCharactersWithSpaces():-1;
      }

      public int getLines() {
         return this.props.getProperties().isSetLines()?this.props.getProperties().getLines():-1;
      }

      public int getParagraphs() {
         return this.props.getProperties().isSetParagraphs()?this.props.getProperties().getParagraphs():-1;
      }

      public int getSlides() {
         return this.props.getProperties().isSetSlides()?this.props.getProperties().getSlides():-1;
      }

      public int getNotes() {
         return this.props.getProperties().isSetNotes()?this.props.getProperties().getNotes():-1;
      }

      public int getTotalTime() {
         return this.props.getProperties().isSetTotalTime()?this.props.getProperties().getTotalTime():-1;
      }

      public int getHiddenSlides() {
         return this.props.getProperties().isSetHiddenSlides()?this.props.getProperties().getHiddenSlides():-1;
      }

      public int getMMClips() {
         return this.props.getProperties().isSetMMClips()?this.props.getProperties().getMMClips():-1;
      }

      public String getHyperlinkBase() {
         return this.props.getProperties().isSetHyperlinkBase()?this.props.getProperties().getHyperlinkBase():null;
      }

      // $FF: synthetic method
      ExtendedProperties(PropertiesDocument x0, POIXMLProperties.NamelessClass1981257595 x1) {
         this(x0);
      }
   }

   // $FF: synthetic class
   static class NamelessClass1981257595 {
   }
}
