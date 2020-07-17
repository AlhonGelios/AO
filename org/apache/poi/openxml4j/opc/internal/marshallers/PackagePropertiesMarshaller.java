package org.apache.poi.openxml4j.opc.internal.marshallers;

import java.io.OutputStream;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.events.Namespace;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart;
import org.apache.poi.openxml4j.opc.internal.PartMarshaller;
import org.apache.poi.openxml4j.util.Nullable;
import org.apache.poi.util.DocumentHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PackagePropertiesMarshaller implements PartMarshaller {

   private static final Namespace namespaceDC;
   private static final Namespace namespaceCoreProperties;
   private static final Namespace namespaceDcTerms;
   private static final Namespace namespaceXSI;
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
   PackagePropertiesPart propsPart;
   Document xmlDoc = null;


   public boolean marshall(PackagePart part, OutputStream out) throws OpenXML4JException {
      if(!(part instanceof PackagePropertiesPart)) {
         throw new IllegalArgumentException("\'part\' must be a PackagePropertiesPart instance.");
      } else {
         this.propsPart = (PackagePropertiesPart)part;
         this.xmlDoc = DocumentHelper.createDocument();
         Element rootElem = this.xmlDoc.createElementNS(namespaceCoreProperties.getNamespaceURI(), this.getQName("coreProperties", namespaceCoreProperties));
         DocumentHelper.addNamespaceDeclaration(rootElem, namespaceCoreProperties);
         DocumentHelper.addNamespaceDeclaration(rootElem, namespaceDC);
         DocumentHelper.addNamespaceDeclaration(rootElem, namespaceDcTerms);
         DocumentHelper.addNamespaceDeclaration(rootElem, namespaceXSI);
         this.xmlDoc.appendChild(rootElem);
         this.addCategory();
         this.addContentStatus();
         this.addContentType();
         this.addCreated();
         this.addCreator();
         this.addDescription();
         this.addIdentifier();
         this.addKeywords();
         this.addLanguage();
         this.addLastModifiedBy();
         this.addLastPrinted();
         this.addModified();
         this.addRevision();
         this.addSubject();
         this.addTitle();
         this.addVersion();
         return true;
      }
   }

   private Element setElementTextContent(String localName, Namespace namespace, Nullable property) {
      return this.setElementTextContent(localName, namespace, property, (String)property.getValue());
   }

   private String getQName(String localName, Namespace namespace) {
      return namespace.getPrefix().isEmpty()?localName:namespace.getPrefix() + ':' + localName;
   }

   private Element setElementTextContent(String localName, Namespace namespace, Nullable property, String propertyValue) {
      if(!property.hasValue()) {
         return null;
      } else {
         Element root = this.xmlDoc.getDocumentElement();
         Element elem = (Element)root.getElementsByTagNameNS(namespace.getNamespaceURI(), localName).item(0);
         if(elem == null) {
            elem = this.xmlDoc.createElementNS(namespace.getNamespaceURI(), this.getQName(localName, namespace));
            root.appendChild(elem);
         }

         elem.setTextContent(propertyValue);
         return elem;
      }
   }

   private Element setElementTextContent(String localName, Namespace namespace, Nullable property, String propertyValue, String xsiType) {
      Element element = this.setElementTextContent(localName, namespace, property, propertyValue);
      if(element != null) {
         element.setAttributeNS(namespaceXSI.getNamespaceURI(), this.getQName("type", namespaceXSI), xsiType);
      }

      return element;
   }

   private void addCategory() {
      this.setElementTextContent("category", namespaceCoreProperties, this.propsPart.getCategoryProperty());
   }

   private void addContentStatus() {
      this.setElementTextContent("contentStatus", namespaceCoreProperties, this.propsPart.getContentStatusProperty());
   }

   private void addContentType() {
      this.setElementTextContent("contentType", namespaceCoreProperties, this.propsPart.getContentTypeProperty());
   }

   private void addCreated() {
      this.setElementTextContent("created", namespaceDcTerms, this.propsPart.getCreatedProperty(), this.propsPart.getCreatedPropertyString(), "dcterms:W3CDTF");
   }

   private void addCreator() {
      this.setElementTextContent("creator", namespaceDC, this.propsPart.getCreatorProperty());
   }

   private void addDescription() {
      this.setElementTextContent("description", namespaceDC, this.propsPart.getDescriptionProperty());
   }

   private void addIdentifier() {
      this.setElementTextContent("identifier", namespaceDC, this.propsPart.getIdentifierProperty());
   }

   private void addKeywords() {
      this.setElementTextContent("keywords", namespaceCoreProperties, this.propsPart.getKeywordsProperty());
   }

   private void addLanguage() {
      this.setElementTextContent("language", namespaceDC, this.propsPart.getLanguageProperty());
   }

   private void addLastModifiedBy() {
      this.setElementTextContent("lastModifiedBy", namespaceCoreProperties, this.propsPart.getLastModifiedByProperty());
   }

   private void addLastPrinted() {
      this.setElementTextContent("lastPrinted", namespaceCoreProperties, this.propsPart.getLastPrintedProperty(), this.propsPart.getLastPrintedPropertyString());
   }

   private void addModified() {
      this.setElementTextContent("modified", namespaceDcTerms, this.propsPart.getModifiedProperty(), this.propsPart.getModifiedPropertyString(), "dcterms:W3CDTF");
   }

   private void addRevision() {
      this.setElementTextContent("revision", namespaceCoreProperties, this.propsPart.getRevisionProperty());
   }

   private void addSubject() {
      this.setElementTextContent("subject", namespaceDC, this.propsPart.getSubjectProperty());
   }

   private void addTitle() {
      this.setElementTextContent("title", namespaceDC, this.propsPart.getTitleProperty());
   }

   private void addVersion() {
      this.setElementTextContent("version", namespaceCoreProperties, this.propsPart.getVersionProperty());
   }

   static {
      XMLEventFactory f = XMLEventFactory.newInstance();
      namespaceDC = f.createNamespace("dc", "http://purl.org/dc/elements/1.1/");
      namespaceCoreProperties = f.createNamespace("cp", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
      namespaceDcTerms = f.createNamespace("dcterms", "http://purl.org/dc/terms/");
      namespaceXSI = f.createNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
   }
}
