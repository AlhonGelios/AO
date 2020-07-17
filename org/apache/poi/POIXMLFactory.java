package org.apache.poi;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public abstract class POIXMLFactory {

   private static final POILogger LOGGER = POILogFactory.getLogger(POIXMLFactory.class);
   private static final Class[] PARENT_PART = new Class[]{POIXMLDocumentPart.class, PackagePart.class};
   private static final Class[] ORPHAN_PART = new Class[]{PackagePart.class};


   public POIXMLDocumentPart createDocumentPart(POIXMLDocumentPart parent, PackagePart part) {
      PackageRelationship rel = this.getPackageRelationship(parent, part);
      POIXMLRelation descriptor = this.getDescriptor(rel.getRelationshipType());
      if(descriptor != null && descriptor.getRelationClass() != null) {
         Class cls = descriptor.getRelationClass();

         try {
            try {
               return this.createDocumentPart(cls, PARENT_PART, new Object[]{parent, part});
            } catch (NoSuchMethodException var7) {
               return this.createDocumentPart(cls, ORPHAN_PART, new Object[]{part});
            }
         } catch (Exception var8) {
            throw new POIXMLException(var8);
         }
      } else {
         LOGGER.log(1, new Object[]{"using default POIXMLDocumentPart for " + rel.getRelationshipType()});
         return new POIXMLDocumentPart(parent, part);
      }
   }

   protected abstract POIXMLDocumentPart createDocumentPart(Class var1, Class[] var2, Object[] var3) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException;

   protected abstract POIXMLRelation getDescriptor(String var1);

   @Deprecated
   public final POIXMLDocumentPart createDocumentPart(POIXMLDocumentPart parent, PackageRelationship rel, PackagePart part) {
      return this.createDocumentPart(parent, part);
   }

   public POIXMLDocumentPart newDocumentPart(POIXMLRelation descriptor) {
      Class cls = descriptor.getRelationClass();

      try {
         return this.createDocumentPart(cls, (Class[])null, (Object[])null);
      } catch (Exception var4) {
         throw new POIXMLException(var4);
      }
   }

   protected PackageRelationship getPackageRelationship(POIXMLDocumentPart parent, PackagePart part) {
      try {
         String e = part.getPartName().getName();
         Iterator i$ = parent.getPackagePart().getRelationships().iterator();

         while(i$.hasNext()) {
            PackageRelationship pr = (PackageRelationship)i$.next();
            String packName = pr.getTargetURI().toASCIIString();
            if(packName.equalsIgnoreCase(e)) {
               return pr;
            }
         }
      } catch (InvalidFormatException var7) {
         throw new POIXMLException("error while determining package relations", var7);
      }

      throw new POIXMLException("package part isn\'t a child of the parent document.");
   }

}
