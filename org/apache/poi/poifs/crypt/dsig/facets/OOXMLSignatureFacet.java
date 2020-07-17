package org.apache.poi.poifs.crypt.dsig.facets;

import com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1;
import com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.Manifest;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureProperties;
import javax.xml.crypto.dsig.SignatureProperty;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignatureException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.poifs.crypt.dsig.facets.SignatureFacet;
import org.apache.poi.poifs.crypt.dsig.services.RelationshipTransformService;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTSignatureTime;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.SignatureTimeDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class OOXMLSignatureFacet extends SignatureFacet {

   private static final POILogger LOG = POILogFactory.getLogger(OOXMLSignatureFacet.class);
   public static final String[] contentTypes = new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.fontTable+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.settings+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.styles+xml", "application/vnd.openxmlformats-officedocument.theme+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.webSettings+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.numbering+xml", "application/vnd.ms-word.stylesWithEffects+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.presentation.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.slide+xml", "application/vnd.openxmlformats-officedocument.presentationml.tableStyles+xml", "application/vnd.openxmlformats-officedocument.presentationml.viewProps+xml", "application/vnd.openxmlformats-officedocument.presentationml.presProps+xml"};
   public static final String[] signed = new String[]{"powerPivotData", "activeXControlBinary", "attachedToolbars", "connectorXml", "downRev", "functionPrototypes", "graphicFrameDoc", "groupShapeXml", "ink", "keyMapCustomizations", "legacyDiagramText", "legacyDocTextInfo", "officeDocument", "pictureXml", "shapeXml", "smartTags", "ui/altText", "ui/buttonSize", "ui/controlID", "ui/description", "ui/enabled", "ui/extensibility", "ui/helperText", "ui/imageID", "ui/imageMso", "ui/keyTip", "ui/label", "ui/lcid", "ui/loud", "ui/pressed", "ui/progID", "ui/ribbonID", "ui/showImage", "ui/showLabel", "ui/supertip", "ui/target", "ui/text", "ui/title", "ui/tooltip", "ui/userCustomization", "ui/visible", "userXmlData", "vbaProject", "wordVbaData", "wsSortMap", "xlBinaryIndex", "xlExternalLinkPath/xlAlternateStartup", "xlExternalLinkPath/xlLibrary", "xlExternalLinkPath/xlPathMissing", "xlExternalLinkPath/xlStartup", "xlIntlMacrosheet", "xlMacrosheet", "customData", "diagramDrawing", "hdphoto", "inkXml", "media", "slicer", "slicerCache", "stylesWithEffects", "ui/extensibility", "chartColorStyle", "chartLayout", "chartStyle", "dictionary", "timeline", "timelineCache", "aFChunk", "attachedTemplate", "audio", "calcChain", "chart", "chartsheet", "chartUserShapes", "commentAuthors", "comments", "connections", "control", "customProperty", "customXml", "diagramColors", "diagramData", "diagramLayout", "diagramQuickStyle", "dialogsheet", "drawing", "endnotes", "externalLink", "externalLinkPath", "font", "fontTable", "footer", "footnotes", "glossaryDocument", "handoutMaster", "header", "hyperlink", "image", "mailMergeHeaderSource", "mailMergeRecipientData", "mailMergeSource", "notesMaster", "notesSlide", "numbering", "officeDocument", "oleObject", "package", "pivotCacheDefinition", "pivotCacheRecords", "pivotTable", "presProps", "printerSettings", "queryTable", "recipientData", "settings", "sharedStrings", "sheetMetadata", "slide", "slideLayout", "slideMaster", "slideUpdateInfo", "slideUpdateUrl", "styles", "table", "tableSingleCells", "tableStyles", "tags", "theme", "themeOverride", "transform", "video", "viewProps", "volatileDependencies", "webSettings", "worksheet", "xmlMaps", "ctrlProp", "customData", "diagram", "diagramColorsHeader", "diagramLayoutHeader", "diagramQuickStyleHeader", "documentParts", "slicer", "slicerCache", "vmlDrawing"};


   public void preSign(Document document, List references, List objects) throws XMLSignatureException {
      LOG.log(1, new Object[]{"pre sign"});
      this.addManifestObject(document, references, objects);
      this.addSignatureInfo(document, references, objects);
   }

   protected void addManifestObject(Document document, List references, List objects) throws XMLSignatureException {
      ArrayList manifestReferences = new ArrayList();
      this.addManifestReferences(manifestReferences);
      Manifest manifest = this.getSignatureFactory().newManifest(manifestReferences);
      String objectId = "idPackageObject";
      ArrayList objectContent = new ArrayList();
      objectContent.add(manifest);
      this.addSignatureTime(document, objectContent);
      XMLObject xo = this.getSignatureFactory().newXMLObject(objectContent, objectId, (String)null, (String)null);
      objects.add(xo);
      Reference reference = this.newReference("#" + objectId, (List)null, "http://www.w3.org/2000/09/xmldsig#Object", (String)null, (byte[])null);
      references.add(reference);
   }

   protected void addManifestReferences(List manifestReferences) throws XMLSignatureException {
      OPCPackage ooxml = this.signatureConfig.getOpcPackage();
      ArrayList relsEntryNames = ooxml.getPartsByContentType("application/vnd.openxmlformats-package.relationships+xml");
      HashSet digestedPartNames = new HashSet();
      Iterator i$ = relsEntryNames.iterator();

      while(i$.hasNext()) {
         PackagePart pp = (PackagePart)i$.next();
         String baseUri = pp.getPartName().getName().replaceFirst("(.*)/_rels/.*", "$1");

         PackageRelationshipCollection prc;
         try {
            prc = new PackageRelationshipCollection(ooxml);
            prc.parseRelationshipsPart(pp);
         } catch (InvalidFormatException var19) {
            throw new XMLSignatureException("Invalid relationship descriptor: " + pp.getPartName().getName(), var19);
         }

         RelationshipTransformService.RelationshipTransformParameterSpec parameterSpec = new RelationshipTransformService.RelationshipTransformParameterSpec();
         Iterator transforms = prc.iterator();

         while(transforms.hasNext()) {
            PackageRelationship uri = (PackageRelationship)transforms.next();
            String reference = uri.getRelationshipType();
            if(TargetMode.EXTERNAL != uri.getTargetMode() && isSignedRelationship(reference)) {
               parameterSpec.addRelationshipReference(uri.getId());
               String partName = uri.getTargetURI().toString();
               if(!partName.startsWith(baseUri)) {
                  partName = baseUri + partName;
               }

               try {
                  partName = (new URI(partName)).normalize().getPath().replace('\\', '/');
                  LOG.log(1, new Object[]{"part name: " + partName});
               } catch (URISyntaxException var18) {
                  throw new XMLSignatureException(var18);
               }

               String contentType;
               try {
                  PackagePartName uri1 = PackagingURIHelper.createPartName(partName);
                  PackagePart reference1 = ooxml.getPart(uri1);
                  contentType = reference1.getContentType();
               } catch (InvalidFormatException var17) {
                  throw new XMLSignatureException(var17);
               }

               if(reference.endsWith("customXml") && !contentType.equals("inkml+xml") && !contentType.equals("text/xml")) {
                  LOG.log(1, new Object[]{"skipping customXml with content type: " + contentType});
               } else if(!digestedPartNames.contains(partName)) {
                  String uri3 = partName + "?ContentType=" + contentType;
                  Reference reference3 = this.newReference(uri3, (List)null, (String)null, (String)null, (byte[])null);
                  manifestReferences.add(reference3);
                  digestedPartNames.add(partName);
               }
            }
         }

         if(parameterSpec.hasSourceIds()) {
            ArrayList transforms1 = new ArrayList();
            transforms1.add(this.newTransform("http://schemas.openxmlformats.org/package/2006/RelationshipTransform", parameterSpec));
            transforms1.add(this.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
            String uri2 = pp.getPartName().getName() + "?ContentType=application/vnd.openxmlformats-package.relationships+xml";
            Reference reference2 = this.newReference(uri2, transforms1, (String)null, (String)null, (byte[])null);
            manifestReferences.add(reference2);
         }
      }

   }

   protected void addSignatureTime(Document document, List objectContent) {
      SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss\'Z\'", Locale.ROOT);
      fmt.setTimeZone(LocaleUtil.TIMEZONE_UTC);
      String nowStr = fmt.format(this.signatureConfig.getExecutionTime());
      LOG.log(1, new Object[]{"now: " + nowStr});
      SignatureTimeDocument sigTime = SignatureTimeDocument.Factory.newInstance();
      CTSignatureTime ctTime = sigTime.addNewSignatureTime();
      ctTime.setFormat("YYYY-MM-DDThh:mm:ssTZD");
      ctTime.setValue(nowStr);
      Element n = (Element)document.importNode(ctTime.getDomNode(), true);
      ArrayList signatureTimeContent = new ArrayList();
      signatureTimeContent.add(new DOMStructure(n));
      SignatureProperty signatureTimeSignatureProperty = this.getSignatureFactory().newSignatureProperty(signatureTimeContent, "#" + this.signatureConfig.getPackageSignatureId(), "idSignatureTime");
      ArrayList signaturePropertyContent = new ArrayList();
      signaturePropertyContent.add(signatureTimeSignatureProperty);
      SignatureProperties signatureProperties = this.getSignatureFactory().newSignatureProperties(signaturePropertyContent, "id-signature-time-" + this.signatureConfig.getExecutionTime());
      objectContent.add(signatureProperties);
   }

   protected void addSignatureInfo(Document document, List references, List objects) throws XMLSignatureException {
      ArrayList objectContent = new ArrayList();
      SignatureInfoV1Document sigV1 = SignatureInfoV1Document.Factory.newInstance();
      CTSignatureInfoV1 ctSigV1 = sigV1.addNewSignatureInfoV1();
      ctSigV1.setManifestHashAlgorithm(this.signatureConfig.getDigestMethodUri());
      Element n = (Element)document.importNode(ctSigV1.getDomNode(), true);
      n.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://schemas.microsoft.com/office/2006/digsig");
      ArrayList signatureInfoContent = new ArrayList();
      signatureInfoContent.add(new DOMStructure(n));
      SignatureProperty signatureInfoSignatureProperty = this.getSignatureFactory().newSignatureProperty(signatureInfoContent, "#" + this.signatureConfig.getPackageSignatureId(), "idOfficeV1Details");
      ArrayList signaturePropertyContent = new ArrayList();
      signaturePropertyContent.add(signatureInfoSignatureProperty);
      SignatureProperties signatureProperties = this.getSignatureFactory().newSignatureProperties(signaturePropertyContent, (String)null);
      objectContent.add(signatureProperties);
      String objectId = "idOfficeObject";
      objects.add(this.getSignatureFactory().newXMLObject(objectContent, objectId, (String)null, (String)null));
      Reference reference = this.newReference("#" + objectId, (List)null, "http://www.w3.org/2000/09/xmldsig#Object", (String)null, (byte[])null);
      references.add(reference);
   }

   protected static String getRelationshipReferenceURI(String zipEntryName) {
      return "/" + zipEntryName + "?ContentType=application/vnd.openxmlformats-package.relationships+xml";
   }

   protected static String getResourceReferenceURI(String resourceName, String contentType) {
      return "/" + resourceName + "?ContentType=" + contentType;
   }

   protected static boolean isSignedRelationship(String relationshipType) {
      LOG.log(1, new Object[]{"relationship type: " + relationshipType});
      String[] arr$ = signed;
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         String signedTypeExtension = arr$[i$];
         if(relationshipType.endsWith(signedTypeExtension)) {
            return true;
         }
      }

      if(relationshipType.endsWith("customXml")) {
         LOG.log(1, new Object[]{"customXml relationship type"});
         return true;
      } else {
         return false;
      }
   }

}
