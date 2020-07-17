package org.apache.poi.openxml4j.opc.internal.unmarshallers;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.ZipPackage;
import org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart;
import org.apache.poi.openxml4j.opc.internal.PartUnmarshaller;
import org.apache.poi.openxml4j.opc.internal.ZipHelper;
import org.apache.poi.openxml4j.opc.internal.unmarshallers.UnmarshallContext;
import org.apache.poi.util.DocumentHelper;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public final class PackagePropertiesUnmarshaller implements PartUnmarshaller {

   protected static final String KEYWORD_CATEGORY = "category";
   protected static final String KEYWORD_CONTENT_STATUS = "contentStatus";
   protected static final String KEYWORD_CONTENT_TYPE = "contentType";
   protected static final String KEYWORD_CREATED = "created";
   protected static final String KEYWORD_CREATOR = "creator";
   protected static final String KEYWORD_DESCRIPTION = "description";
   protected static final String KEYWORD_IDENTIFIER = "identifier";
   protected static final String KEYWORD_KEYWORDS = "keywords";
   protected static final String KEYWORD_LANGUAGE = "language";
   protected static final String KEYWORD_LAST_MODIFIED_BY = "lastModifiedBy";
   protected static final String KEYWORD_LAST_PRINTED = "lastPrinted";
   protected static final String KEYWORD_MODIFIED = "modified";
   protected static final String KEYWORD_REVISION = "revision";
   protected static final String KEYWORD_SUBJECT = "subject";
   protected static final String KEYWORD_TITLE = "title";
   protected static final String KEYWORD_VERSION = "version";


   public PackagePart unmarshall(UnmarshallContext context, InputStream in) throws InvalidFormatException, IOException {
      PackagePropertiesPart coreProps = new PackagePropertiesPart(context.getPackage(), context.getPartName());
      if(in == null) {
         if(context.getZipEntry() != null) {
            in = ((ZipPackage)context.getPackage()).getZipArchive().getInputStream(context.getZipEntry());
         } else {
            if(context.getPackage() == null) {
               throw new IOException("Error while trying to get the part input stream.");
            }

            ZipEntry xmlDoc = ZipHelper.getCorePropertiesZipEntry((ZipPackage)context.getPackage());
            in = ((ZipPackage)context.getPackage()).getZipArchive().getInputStream(xmlDoc);
         }
      }

      Document xmlDoc1;
      try {
         xmlDoc1 = DocumentHelper.readDocument(in);
         this.checkElementForOPCCompliance(xmlDoc1.getDocumentElement());
      } catch (SAXException var6) {
         throw new IOException(var6.getMessage());
      }

      coreProps.setCategoryProperty(this.loadCategory(xmlDoc1));
      coreProps.setContentStatusProperty(this.loadContentStatus(xmlDoc1));
      coreProps.setContentTypeProperty(this.loadContentType(xmlDoc1));
      coreProps.setCreatedProperty(this.loadCreated(xmlDoc1));
      coreProps.setCreatorProperty(this.loadCreator(xmlDoc1));
      coreProps.setDescriptionProperty(this.loadDescription(xmlDoc1));
      coreProps.setIdentifierProperty(this.loadIdentifier(xmlDoc1));
      coreProps.setKeywordsProperty(this.loadKeywords(xmlDoc1));
      coreProps.setLanguageProperty(this.loadLanguage(xmlDoc1));
      coreProps.setLastModifiedByProperty(this.loadLastModifiedBy(xmlDoc1));
      coreProps.setLastPrintedProperty(this.loadLastPrinted(xmlDoc1));
      coreProps.setModifiedProperty(this.loadModified(xmlDoc1));
      coreProps.setRevisionProperty(this.loadRevision(xmlDoc1));
      coreProps.setSubjectProperty(this.loadSubject(xmlDoc1));
      coreProps.setTitleProperty(this.loadTitle(xmlDoc1));
      coreProps.setVersionProperty(this.loadVersion(xmlDoc1));
      return coreProps;
   }

   private String readElement(Document xmlDoc, String localName, String namespaceURI) {
      Element el = (Element)xmlDoc.getDocumentElement().getElementsByTagNameNS(namespaceURI, localName).item(0);
      return el == null?null:el.getTextContent();
   }

   private String loadCategory(Document xmlDoc) {
      return this.readElement(xmlDoc, "category", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   private String loadContentStatus(Document xmlDoc) {
      return this.readElement(xmlDoc, "contentStatus", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   private String loadContentType(Document xmlDoc) {
      return this.readElement(xmlDoc, "contentType", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   private String loadCreated(Document xmlDoc) {
      return this.readElement(xmlDoc, "created", "http://purl.org/dc/terms/");
   }

   private String loadCreator(Document xmlDoc) {
      return this.readElement(xmlDoc, "creator", "http://purl.org/dc/elements/1.1/");
   }

   private String loadDescription(Document xmlDoc) {
      return this.readElement(xmlDoc, "description", "http://purl.org/dc/elements/1.1/");
   }

   private String loadIdentifier(Document xmlDoc) {
      return this.readElement(xmlDoc, "identifier", "http://purl.org/dc/elements/1.1/");
   }

   private String loadKeywords(Document xmlDoc) {
      return this.readElement(xmlDoc, "keywords", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   private String loadLanguage(Document xmlDoc) {
      return this.readElement(xmlDoc, "language", "http://purl.org/dc/elements/1.1/");
   }

   private String loadLastModifiedBy(Document xmlDoc) {
      return this.readElement(xmlDoc, "lastModifiedBy", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   private String loadLastPrinted(Document xmlDoc) {
      return this.readElement(xmlDoc, "lastPrinted", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   private String loadModified(Document xmlDoc) {
      return this.readElement(xmlDoc, "modified", "http://purl.org/dc/terms/");
   }

   private String loadRevision(Document xmlDoc) {
      return this.readElement(xmlDoc, "revision", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   private String loadSubject(Document xmlDoc) {
      return this.readElement(xmlDoc, "subject", "http://purl.org/dc/elements/1.1/");
   }

   private String loadTitle(Document xmlDoc) {
      return this.readElement(xmlDoc, "title", "http://purl.org/dc/elements/1.1/");
   }

   private String loadVersion(Document xmlDoc) {
      return this.readElement(xmlDoc, "version", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
   }

   public void checkElementForOPCCompliance(Element el) throws InvalidFormatException {
      NamedNodeMap namedNodeMap = el.getAttributes();
      int namedNodeCount = namedNodeMap.getLength();

      Attr childElements;
      for(int elName = 0; elName < namedNodeCount; ++elName) {
         childElements = (Attr)namedNodeMap.item(0);
         if(childElements.getNamespaceURI().equals("http://www.w3.org/2000/xmlns/") && childElements.getValue().equals("http://schemas.openxmlformats.org/markup-compatibility/2006")) {
            throw new InvalidFormatException("OPC Compliance error [M4.2]: A format consumer shall consider the use of the Markup Compatibility namespace to be an error.");
         }
      }

      String var8 = el.getLocalName();
      if(el.getNamespaceURI().equals("http://purl.org/dc/terms/") && !var8.equals("created") && !var8.equals("modified")) {
         throw new InvalidFormatException("OPC Compliance error [M4.3]: Producers shall not create a document element that contains refinements to the Dublin Core elements, except for the two specified in the schema: <dcterms:created> and <dcterms:modified> Consumers shall consider a document element that violates this constraint to be an error.");
      } else if(el.getAttributeNodeNS("http://www.w3.org/XML/1998/namespace", "lang") != null) {
         throw new InvalidFormatException("OPC Compliance error [M4.4]: Producers shall not create a document element that contains the xml:lang attribute. Consumers shall consider a document element that violates this constraint to be an error.");
      } else {
         if(el.getNamespaceURI().equals("http://purl.org/dc/terms/")) {
            if(!var8.equals("created") && !var8.equals("modified")) {
               throw new InvalidFormatException("Namespace error : " + var8 + " shouldn\'t have the following naemspace -> " + "http://purl.org/dc/terms/");
            }

            childElements = el.getAttributeNodeNS("http://www.w3.org/2001/XMLSchema-instance", "type");
            if(childElements == null) {
               throw new InvalidFormatException("The element \'" + var8 + "\' must have the \'xsi:type\' attribute present !");
            }

            if(!childElements.getValue().equals(el.getPrefix() + ":W3CDTF")) {
               throw new InvalidFormatException("The element \'" + var8 + "\' must have the \'xsi:type\' attribute with the value \'" + el.getPrefix() + ":W3CDTF\', but had \'" + childElements.getValue() + "\' !");
            }
         }

         NodeList var9 = el.getElementsByTagName("*");
         int childElementCount = var9.getLength();

         for(int i = 0; i < childElementCount; ++i) {
            this.checkElementForOPCCompliance((Element)var9.item(i));
         }

      }
   }
}
