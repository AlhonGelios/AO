package org.apache.poi.poifs.crypt.dsig.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.OctetStreamData;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.XmlSort;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipReference;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.RelationshipReferenceDocument;
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationship;
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationships;
import org.openxmlformats.schemas.xpackage.x2006.relationships.RelationshipsDocument;
import org.openxmlformats.schemas.xpackage.x2006.relationships.STTargetMode;
import org.w3.x2000.x09.xmldsig.TransformDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class RelationshipTransformService extends TransformService {

   public static final String TRANSFORM_URI = "http://schemas.openxmlformats.org/package/2006/RelationshipTransform";
   private final List sourceIds;
   private static final POILogger LOG = POILogFactory.getLogger(RelationshipTransformService.class);


   public RelationshipTransformService() {
      LOG.log(1, new Object[]{"constructor"});
      this.sourceIds = new ArrayList();
   }

   public static synchronized void registerDsigProvider() {
      String dsigProvider = "POIXmlDsigProvider";
      if(Security.getProperty("POIXmlDsigProvider") == null) {
         Provider p = new Provider("POIXmlDsigProvider", 1.0D, x2) {

            static final long serialVersionUID = 1L;

         };
         p.put("TransformService.http://schemas.openxmlformats.org/package/2006/RelationshipTransform", RelationshipTransformService.class.getName());
         p.put("TransformService.http://schemas.openxmlformats.org/package/2006/RelationshipTransform MechanismType", "DOM");
         Security.addProvider(p);
      }

   }

   public void init(TransformParameterSpec params) throws InvalidAlgorithmParameterException {
      LOG.log(1, new Object[]{"init(params)"});
      if(!(params instanceof RelationshipTransformService.RelationshipTransformParameterSpec)) {
         throw new InvalidAlgorithmParameterException();
      } else {
         RelationshipTransformService.RelationshipTransformParameterSpec relParams = (RelationshipTransformService.RelationshipTransformParameterSpec)params;
         Iterator i$ = relParams.sourceIds.iterator();

         while(i$.hasNext()) {
            String sourceId = (String)i$.next();
            this.sourceIds.add(sourceId);
         }

      }
   }

   public void init(XMLStructure parent, XMLCryptoContext context) throws InvalidAlgorithmParameterException {
      LOG.log(1, new Object[]{"init(parent,context)"});
      LOG.log(1, new Object[]{"parent java type: " + parent.getClass().getName()});
      DOMStructure domParent = (DOMStructure)parent;
      Node parentNode = domParent.getNode();

      try {
         TransformDocument e = TransformDocument.Factory.parse(parentNode, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         XmlObject[] xoList = e.getTransform().selectChildren(RelationshipReferenceDocument.type.getDocumentElementName());
         if(xoList.length == 0) {
            LOG.log(5, new Object[]{"no RelationshipReference/@SourceId parameters present"});
         }

         XmlObject[] arr$ = xoList;
         int len$ = xoList.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            XmlObject xo = arr$[i$];
            String sourceId = ((CTRelationshipReference)xo).getSourceId();
            LOG.log(1, new Object[]{"sourceId: ", sourceId});
            this.sourceIds.add(sourceId);
         }

      } catch (XmlException var12) {
         throw new InvalidAlgorithmParameterException(var12);
      }
   }

   public void marshalParams(XMLStructure parent, XMLCryptoContext context) throws MarshalException {
      LOG.log(1, new Object[]{"marshallParams(parent,context)"});
      DOMStructure domParent = (DOMStructure)parent;
      Element parentNode = (Element)domParent.getNode();
      Document doc = parentNode.getOwnerDocument();
      Iterator i$ = this.sourceIds.iterator();

      while(i$.hasNext()) {
         String sourceId = (String)i$.next();
         RelationshipReferenceDocument relRef = RelationshipReferenceDocument.Factory.newInstance();
         relRef.addNewRelationshipReference().setSourceId(sourceId);
         Node n = relRef.getRelationshipReference().getDomNode();
         n = doc.importNode(n, true);
         parentNode.appendChild(n);
      }

   }

   public AlgorithmParameterSpec getParameterSpec() {
      LOG.log(1, new Object[]{"getParameterSpec"});
      return null;
   }

   public Data transform(Data data, XMLCryptoContext context) throws TransformException {
      LOG.log(1, new Object[]{"transform(data,context)"});
      LOG.log(1, new Object[]{"data java type: " + data.getClass().getName()});
      OctetStreamData octetStreamData = (OctetStreamData)data;
      LOG.log(1, new Object[]{"URI: " + octetStreamData.getURI()});
      InputStream octetStream = octetStreamData.getOctetStream();

      RelationshipsDocument relDoc;
      try {
         relDoc = RelationshipsDocument.Factory.parse(octetStream, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      } catch (Exception var12) {
         throw new TransformException(var12.getMessage(), var12);
      }

      LOG.log(1, new Object[]{"relationships document", relDoc});
      CTRelationships rels = relDoc.getRelationships();
      List relList = rels.getRelationshipList();
      Iterator relIter = rels.getRelationshipList().iterator();

      while(relIter.hasNext()) {
         CTRelationship e = (CTRelationship)relIter.next();
         if(!this.sourceIds.contains(e.getId())) {
            LOG.log(1, new Object[]{"removing element: " + e.getId()});
            relIter.remove();
         } else if(!e.isSetTargetMode()) {
            e.setTargetMode(STTargetMode.INTERNAL);
         }
      }

      LOG.log(1, new Object[]{"# Relationship elements", Integer.valueOf(relList.size())});
      XmlSort.sort(rels, new Comparator() {
         public int compare(XmlCursor c1, XmlCursor c2) {
            String id1 = ((CTRelationship)c1.getObject()).getId();
            String id2 = ((CTRelationship)c2.getObject()).getId();
            return id1.compareTo(id2);
         }
      });

      try {
         ByteArrayOutputStream e1 = new ByteArrayOutputStream();
         XmlOptions xo = new XmlOptions();
         xo.setSaveNoXmlDecl();
         relDoc.save(e1, xo);
         return new OctetStreamData(new ByteArrayInputStream(e1.toByteArray()));
      } catch (IOException var11) {
         throw new TransformException(var11.getMessage(), var11);
      }
   }

   public Data transform(Data data, XMLCryptoContext context, OutputStream os) throws TransformException {
      LOG.log(1, new Object[]{"transform(data,context,os)"});
      return null;
   }

   public boolean isFeatureSupported(String feature) {
      LOG.log(1, new Object[]{"isFeatureSupported(feature)"});
      return false;
   }


   public static class RelationshipTransformParameterSpec implements TransformParameterSpec {

      List sourceIds = new ArrayList();


      public void addRelationshipReference(String relationshipId) {
         this.sourceIds.add(relationshipId);
      }

      public boolean hasSourceIds() {
         return !this.sourceIds.isEmpty();
      }
   }
}
