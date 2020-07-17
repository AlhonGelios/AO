package org.apache.poi.openxml4j.opc;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.util.DocumentHelper;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class PackageRelationshipCollection implements Iterable {

   private static POILogger logger = POILogFactory.getLogger(PackageRelationshipCollection.class);
   private TreeMap relationshipsByID;
   private TreeMap relationshipsByType;
   private PackagePart relationshipPart;
   private PackagePart sourcePart;
   private PackagePartName partName;
   private OPCPackage container;
   private int nextRelationshipId;


   PackageRelationshipCollection() {
      this.nextRelationshipId = -1;
      this.relationshipsByID = new TreeMap();
      this.relationshipsByType = new TreeMap();
   }

   public PackageRelationshipCollection(PackageRelationshipCollection coll, String filter) {
      this();
      Iterator i$ = coll.relationshipsByID.values().iterator();

      while(i$.hasNext()) {
         PackageRelationship rel = (PackageRelationship)i$.next();
         if(filter == null || rel.getRelationshipType().equals(filter)) {
            this.addRelationship(rel);
         }
      }

   }

   public PackageRelationshipCollection(OPCPackage container) throws InvalidFormatException {
      this(container, (PackagePart)null);
   }

   public PackageRelationshipCollection(PackagePart part) throws InvalidFormatException {
      this(part._container, part);
   }

   public PackageRelationshipCollection(OPCPackage container, PackagePart part) throws InvalidFormatException {
      this();
      if(container == null) {
         throw new IllegalArgumentException("container");
      } else if(part != null && part.isRelationshipPart()) {
         throw new IllegalArgumentException("part");
      } else {
         this.container = container;
         this.sourcePart = part;
         this.partName = getRelationshipPartName(part);
         if(container.getPackageAccess() != PackageAccess.WRITE && container.containPart(this.partName)) {
            this.relationshipPart = container.getPart(this.partName);
            this.parseRelationshipsPart(this.relationshipPart);
         }

      }
   }

   private static PackagePartName getRelationshipPartName(PackagePart part) throws InvalidOperationException {
      PackagePartName partName;
      if(part == null) {
         partName = PackagingURIHelper.PACKAGE_ROOT_PART_NAME;
      } else {
         partName = part.getPartName();
      }

      return PackagingURIHelper.getRelationshipPartName(partName);
   }

   public void addRelationship(PackageRelationship relPart) {
      this.relationshipsByID.put(relPart.getId(), relPart);
      this.relationshipsByType.put(relPart.getRelationshipType(), relPart);
   }

   public PackageRelationship addRelationship(URI targetUri, TargetMode targetMode, String relationshipType, String id) {
      if(id == null) {
         if(this.nextRelationshipId == -1) {
            this.nextRelationshipId = this.size() + 1;
         }

         do {
            id = "rId" + this.nextRelationshipId++;
         } while(this.relationshipsByID.get(id) != null);
      }

      PackageRelationship rel = new PackageRelationship(this.container, this.sourcePart, targetUri, targetMode, relationshipType, id);
      this.relationshipsByID.put(rel.getId(), rel);
      this.relationshipsByType.put(rel.getRelationshipType(), rel);
      return rel;
   }

   public void removeRelationship(String id) {
      if(this.relationshipsByID != null && this.relationshipsByType != null) {
         PackageRelationship rel = (PackageRelationship)this.relationshipsByID.get(id);
         if(rel != null) {
            this.relationshipsByID.remove(rel.getId());
            this.relationshipsByType.values().remove(rel);
         }
      }

   }

   public void removeRelationship(PackageRelationship rel) {
      if(rel == null) {
         throw new IllegalArgumentException("rel");
      } else {
         this.relationshipsByID.values().remove(rel);
         this.relationshipsByType.values().remove(rel);
      }
   }

   public PackageRelationship getRelationship(int index) {
      if(index >= 0 && index <= this.relationshipsByID.values().size()) {
         int i = 0;
         Iterator i$ = this.relationshipsByID.values().iterator();

         PackageRelationship rel;
         do {
            if(!i$.hasNext()) {
               return null;
            }

            rel = (PackageRelationship)i$.next();
         } while(index != i++);

         return rel;
      } else {
         throw new IllegalArgumentException("index");
      }
   }

   public PackageRelationship getRelationshipByID(String id) {
      return (PackageRelationship)this.relationshipsByID.get(id);
   }

   public int size() {
      return this.relationshipsByID.values().size();
   }

   public void parseRelationshipsPart(PackagePart relPart) throws InvalidFormatException {
      try {
         logger.log(1, new Object[]{"Parsing relationship: " + relPart.getPartName()});
         Document e = DocumentHelper.readDocument(relPart.getInputStream());
         Element root = e.getDocumentElement();
         boolean fCorePropertiesRelationship = false;
         NodeList nodeList = root.getElementsByTagNameNS("http://schemas.openxmlformats.org/package/2006/relationships", "Relationship");
         int nodeCount = nodeList.getLength();

         for(int i = 0; i < nodeCount; ++i) {
            Element element = (Element)nodeList.item(i);
            String id = element.getAttribute("Id");
            String type = element.getAttribute("Type");
            if(type.equals("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties")) {
               if(fCorePropertiesRelationship) {
                  throw new InvalidFormatException("OPC Compliance error [M4.1]: there is more than one core properties relationship in the package !");
               }

               fCorePropertiesRelationship = true;
            }

            Attr targetModeAttr = element.getAttributeNode("TargetMode");
            TargetMode targetMode = TargetMode.INTERNAL;
            if(targetModeAttr != null) {
               targetMode = targetModeAttr.getValue().toLowerCase(Locale.ROOT).equals("internal")?TargetMode.INTERNAL:TargetMode.EXTERNAL;
            }

            URI target = PackagingURIHelper.toURI("http://invalid.uri");
            String value = element.getAttribute("Target");

            try {
               target = PackagingURIHelper.toURI(value);
            } catch (URISyntaxException var16) {
               logger.log(7, new Object[]{"Cannot convert " + value + " in a valid relationship URI-> dummy-URI used", var16});
            }

            this.addRelationship(target, targetMode, type, id);
         }

      } catch (Exception var17) {
         logger.log(7, new Object[]{var17});
         throw new InvalidFormatException(var17.getMessage());
      }
   }

   public PackageRelationshipCollection getRelationships(String typeFilter) {
      PackageRelationshipCollection coll = new PackageRelationshipCollection(this, typeFilter);
      return coll;
   }

   public Iterator iterator() {
      return this.relationshipsByID.values().iterator();
   }

   public Iterator iterator(String typeFilter) {
      ArrayList retArr = new ArrayList();
      Iterator i$ = this.relationshipsByID.values().iterator();

      while(i$.hasNext()) {
         PackageRelationship rel = (PackageRelationship)i$.next();
         if(rel.getRelationshipType().equals(typeFilter)) {
            retArr.add(rel);
         }
      }

      return retArr.iterator();
   }

   public void clear() {
      this.relationshipsByID.clear();
      this.relationshipsByType.clear();
   }

   public String toString() {
      String str;
      if(this.relationshipsByID == null) {
         str = "relationshipsByID=null";
      } else {
         str = this.relationshipsByID.size() + " relationship(s) = [";
      }

      if(this.relationshipPart != null && this.relationshipPart._partName != null) {
         str = str + "," + this.relationshipPart._partName;
      } else {
         str = str + ",relationshipPart=null";
      }

      if(this.sourcePart != null && this.sourcePart._partName != null) {
         str = str + "," + this.sourcePart._partName;
      } else {
         str = str + ",sourcePart=null";
      }

      if(this.partName != null) {
         str = str + "," + this.partName;
      } else {
         str = str + ",uri=null)";
      }

      return str + "]";
   }

}
