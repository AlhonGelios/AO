package org.apache.poi;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLFactory;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.exceptions.PartAlreadyExistsException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.util.Internal;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class POIXMLDocumentPart {

   private static final POILogger logger = POILogFactory.getLogger(POIXMLDocumentPart.class);
   private String coreDocumentRel;
   private PackagePart packagePart;
   private POIXMLDocumentPart parent;
   private Map relations;
   private int relationCounter;


   int incrementRelationCounter() {
      ++this.relationCounter;
      return this.relationCounter;
   }

   int decrementRelationCounter() {
      --this.relationCounter;
      return this.relationCounter;
   }

   int getRelationCounter() {
      return this.relationCounter;
   }

   public POIXMLDocumentPart(OPCPackage pkg) {
      this(pkg, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument");
   }

   public POIXMLDocumentPart(OPCPackage pkg, String coreDocumentRel) {
      this(getPartFromOPCPackage(pkg, coreDocumentRel));
      this.coreDocumentRel = coreDocumentRel;
   }

   public POIXMLDocumentPart() {
      this.coreDocumentRel = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument";
      this.relations = new LinkedHashMap();
      this.relationCounter = 0;
   }

   public POIXMLDocumentPart(PackagePart part) {
      this((POIXMLDocumentPart)null, part);
   }

   public POIXMLDocumentPart(POIXMLDocumentPart parent, PackagePart part) {
      this.coreDocumentRel = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument";
      this.relations = new LinkedHashMap();
      this.relationCounter = 0;
      this.packagePart = part;
      this.parent = parent;
   }

   @Deprecated
   public POIXMLDocumentPart(PackagePart part, PackageRelationship rel) {
      this((POIXMLDocumentPart)null, part);
   }

   @Deprecated
   public POIXMLDocumentPart(POIXMLDocumentPart parent, PackagePart part, PackageRelationship rel) {
      this(parent, part);
   }

   protected final void rebase(OPCPackage pkg) throws InvalidFormatException {
      PackageRelationshipCollection cores = this.packagePart.getRelationshipsByType(this.coreDocumentRel);
      if(cores.size() != 1) {
         throw new IllegalStateException("Tried to rebase using " + this.coreDocumentRel + " but found " + cores.size() + " parts of the right type");
      } else {
         this.packagePart = this.packagePart.getRelatedPart(cores.getRelationship(0));
      }
   }

   public final PackagePart getPackagePart() {
      return this.packagePart;
   }

   @Deprecated
   public final PackageRelationship getPackageRelationship() {
      if(this.parent != null) {
         Iterator pkg = this.parent.getRelationParts().iterator();

         while(pkg.hasNext()) {
            POIXMLDocumentPart.RelationPart partName = (POIXMLDocumentPart.RelationPart)pkg.next();
            if(partName.getDocumentPart() == this) {
               return partName.getRelationship();
            }
         }
      } else {
         OPCPackage pkg1 = this.getPackagePart().getPackage();
         String partName1 = this.getPackagePart().getPartName().getName();
         Iterator i$ = pkg1.getRelationships().iterator();

         while(i$.hasNext()) {
            PackageRelationship rel = (PackageRelationship)i$.next();
            if(rel.getTargetURI().toASCIIString().equals(partName1)) {
               return rel;
            }
         }
      }

      return null;
   }

   public final List getRelations() {
      ArrayList l = new ArrayList();
      Iterator i$ = this.relations.values().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart.RelationPart rp = (POIXMLDocumentPart.RelationPart)i$.next();
         l.add(rp.getDocumentPart());
      }

      return Collections.unmodifiableList(l);
   }

   public final List getRelationParts() {
      ArrayList l = new ArrayList(this.relations.values());
      return Collections.unmodifiableList(l);
   }

   public final POIXMLDocumentPart getRelationById(String id) {
      POIXMLDocumentPart.RelationPart rp = (POIXMLDocumentPart.RelationPart)this.relations.get(id);
      return rp == null?null:rp.getDocumentPart();
   }

   public final String getRelationId(POIXMLDocumentPart part) {
      Iterator i$ = this.relations.values().iterator();

      POIXMLDocumentPart.RelationPart rp;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         rp = (POIXMLDocumentPart.RelationPart)i$.next();
      } while(rp.getDocumentPart() != part);

      return rp.getRelationship().getId();
   }

   @Deprecated
   public final void addRelation(String id, POIXMLDocumentPart part) {
      PackageRelationship pr = part.getPackagePart().getRelationship(id);
      this.addRelation(pr, part);
   }

   public final POIXMLDocumentPart.RelationPart addRelation(String relId, POIXMLRelation relationshipType, POIXMLDocumentPart part) {
      PackageRelationship pr = this.findExistingRelation(part);
      if(pr == null) {
         PackagePartName ppn = part.getPackagePart().getPartName();
         String relType = relationshipType.getRelation();
         pr = this.packagePart.addRelationship(ppn, TargetMode.INTERNAL, relType, relId);
      }

      this.addRelation(pr, part);
      return new POIXMLDocumentPart.RelationPart(pr, part);
   }

   private void addRelation(PackageRelationship pr, POIXMLDocumentPart part) {
      this.relations.put(pr.getId(), new POIXMLDocumentPart.RelationPart(pr, part));
      part.incrementRelationCounter();
   }

   private PackageRelationship findExistingRelation(POIXMLDocumentPart part) {
      String ppn = part.getPackagePart().getPartName().getName();

      try {
         Iterator e = this.packagePart.getRelationships().iterator();

         while(e.hasNext()) {
            PackageRelationship pr = (PackageRelationship)e.next();
            if(pr.getTargetMode() != TargetMode.EXTERNAL) {
               PackagePart pp = this.packagePart.getRelatedPart(pr);
               if(ppn.equals(pp.getPartName().getName())) {
                  return pr;
               }
            }
         }

         return null;
      } catch (InvalidFormatException var6) {
         throw new POIXMLException("invalid package relationships", var6);
      }
   }

   protected final void removeRelation(POIXMLDocumentPart part) {
      this.removeRelation(part, true);
   }

   protected final boolean removeRelation(POIXMLDocumentPart part, boolean removeUnusedParts) {
      String id = this.getRelationId(part);
      if(id == null) {
         return false;
      } else {
         part.decrementRelationCounter();
         this.getPackagePart().removeRelationship(id);
         this.relations.remove(id);
         if(removeUnusedParts && part.getRelationCounter() == 0) {
            try {
               part.onDocumentRemove();
            } catch (IOException var5) {
               throw new POIXMLException(var5);
            }

            this.getPackagePart().getPackage().removePart(part.getPackagePart());
         }

         return true;
      }
   }

   public final POIXMLDocumentPart getParent() {
      return this.parent;
   }

   public String toString() {
      return this.packagePart == null?"":this.packagePart.toString();
   }

   protected void commit() throws IOException {}

   protected final void onSave(Set alreadySaved) throws IOException {
      this.prepareForCommit();
      this.commit();
      alreadySaved.add(this.getPackagePart());
      Iterator i$ = this.relations.values().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart.RelationPart rp = (POIXMLDocumentPart.RelationPart)i$.next();
         POIXMLDocumentPart p = rp.getDocumentPart();
         if(!alreadySaved.contains(p.getPackagePart())) {
            p.onSave(alreadySaved);
         }
      }

   }

   protected void prepareForCommit() {
      PackagePart part = this.getPackagePart();
      if(part != null) {
         part.clear();
      }

   }

   public final POIXMLDocumentPart createRelationship(POIXMLRelation descriptor, POIXMLFactory factory) {
      return this.createRelationship(descriptor, factory, -1, false).getDocumentPart();
   }

   public final POIXMLDocumentPart createRelationship(POIXMLRelation descriptor, POIXMLFactory factory, int idx) {
      return this.createRelationship(descriptor, factory, idx, false).getDocumentPart();
   }

   protected final POIXMLDocumentPart.RelationPart createRelationship(POIXMLRelation descriptor, POIXMLFactory factory, int idx, boolean noRelation) {
      try {
         PackagePartName e = PackagingURIHelper.createPartName(descriptor.getFileName(idx));
         PackageRelationship rel = null;
         PackagePart part = this.packagePart.getPackage().createPart(e, descriptor.getContentType());
         if(!noRelation) {
            rel = this.packagePart.addRelationship(e, TargetMode.INTERNAL, descriptor.getRelation());
         }

         POIXMLDocumentPart doc = factory.newDocumentPart(descriptor);
         doc.packagePart = part;
         doc.parent = this;
         if(!noRelation) {
            this.addRelation(rel, doc);
         }

         return new POIXMLDocumentPart.RelationPart(rel, doc);
      } catch (PartAlreadyExistsException var9) {
         throw var9;
      } catch (Exception var10) {
         throw new POIXMLException(var10);
      }
   }

   protected void read(POIXMLFactory factory, Map context) throws OpenXML4JException {
      PackagePart pp = this.getPackagePart();
      POIXMLDocumentPart otherChild = (POIXMLDocumentPart)context.put(pp, this);
      if(otherChild != null && otherChild != this) {
         throw new POIXMLException("Unique PackagePart-POIXMLDocumentPart relation broken!");
      } else if(pp.hasRelationships()) {
         PackageRelationshipCollection rels = this.packagePart.getRelationships();
         ArrayList readLater = new ArrayList();
         Iterator i$ = rels.iterator();

         while(i$.hasNext()) {
            PackageRelationship childPart = (PackageRelationship)i$.next();
            if(childPart.getTargetMode() == TargetMode.INTERNAL) {
               URI uri = childPart.getTargetURI();
               PackagePartName relName;
               if(uri.getRawFragment() != null) {
                  relName = PackagingURIHelper.createPartName(uri.getPath());
               } else {
                  relName = PackagingURIHelper.createPartName(uri);
               }

               PackagePart p = this.packagePart.getPackage().getPart(relName);
               if(p == null) {
                  logger.log(7, new Object[]{"Skipped invalid entry " + childPart.getTargetURI()});
               } else {
                  POIXMLDocumentPart childPart1 = (POIXMLDocumentPart)context.get(p);
                  if(childPart1 == null) {
                     childPart1 = factory.createDocumentPart(this, p);
                     childPart1.parent = this;
                     context.put(p, childPart1);
                     readLater.add(childPart1);
                  }

                  this.addRelation(childPart, childPart1);
               }
            }
         }

         i$ = readLater.iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart childPart2 = (POIXMLDocumentPart)i$.next();
            childPart2.read(factory, context);
         }

      }
   }

   protected PackagePart getTargetPart(PackageRelationship rel) throws InvalidFormatException {
      return this.getPackagePart().getRelatedPart(rel);
   }

   protected void onDocumentCreate() throws IOException {}

   protected void onDocumentRead() throws IOException {}

   protected void onDocumentRemove() throws IOException {}

   @Internal
   @Deprecated
   public static void _invokeOnDocumentRead(POIXMLDocumentPart part) throws IOException {
      part.onDocumentRead();
   }

   private static PackagePart getPartFromOPCPackage(OPCPackage pkg, String coreDocumentRel) {
      PackageRelationship coreRel = pkg.getRelationshipsByType(coreDocumentRel).getRelationship(0);
      if(coreRel != null) {
         PackagePart pp = pkg.getPart(coreRel);
         if(pp == null) {
            throw new POIXMLException("OOXML file structure broken/invalid - core document \'" + coreRel.getTargetURI() + "\' not found.");
         } else {
            return pp;
         }
      } else {
         coreRel = pkg.getRelationshipsByType("http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument").getRelationship(0);
         if(coreRel != null) {
            throw new POIXMLException("Strict OOXML isn\'t currently supported, please see bug #57699");
         } else {
            throw new POIXMLException("OOXML file structure broken/invalid - no core document found!");
         }
      }
   }


   public static class RelationPart {

      private final PackageRelationship relationship;
      private final POIXMLDocumentPart documentPart;


      RelationPart(PackageRelationship relationship, POIXMLDocumentPart documentPart) {
         this.relationship = relationship;
         this.documentPart = documentPart;
      }

      public PackageRelationship getRelationship() {
         return this.relationship;
      }

      public POIXMLDocumentPart getDocumentPart() {
         return this.documentPart;
      }
   }
}
