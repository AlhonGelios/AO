package org.apache.poi;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLFactory;
import org.apache.poi.POIXMLProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.poifs.filesystem.DocumentFactoryHelper;
import org.apache.xmlbeans.impl.common.SystemCache;

public abstract class POIXMLDocument extends POIXMLDocumentPart implements Closeable {

   public static final String DOCUMENT_CREATOR = "Apache POI";
   public static final String OLE_OBJECT_REL_TYPE = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject";
   public static final String PACK_OBJECT_REL_TYPE = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/package";
   private OPCPackage pkg;
   private POIXMLProperties properties;


   protected POIXMLDocument(OPCPackage pkg) {
      super(pkg);
      this.init(pkg);
   }

   protected POIXMLDocument(OPCPackage pkg, String coreDocumentRel) {
      super(pkg, coreDocumentRel);
      this.init(pkg);
   }

   private void init(OPCPackage p) {
      this.pkg = p;
      SystemCache.get().setSaxLoader((Object)null);
   }

   public static OPCPackage openPackage(String path) throws IOException {
      try {
         return OPCPackage.open(path);
      } catch (InvalidFormatException var2) {
         throw new IOException(var2.toString(), var2);
      }
   }

   public OPCPackage getPackage() {
      return this.pkg;
   }

   protected PackagePart getCorePart() {
      return this.getPackagePart();
   }

   protected PackagePart[] getRelatedByType(String contentType) throws InvalidFormatException {
      PackageRelationshipCollection partsC = this.getPackagePart().getRelationshipsByType(contentType);
      PackagePart[] parts = new PackagePart[partsC.size()];
      int count = 0;

      for(Iterator i$ = partsC.iterator(); i$.hasNext(); ++count) {
         PackageRelationship rel = (PackageRelationship)i$.next();
         parts[count] = this.getPackagePart().getRelatedPart(rel);
      }

      return parts;
   }

   @Deprecated
   public static boolean hasOOXMLHeader(InputStream inp) throws IOException {
      return DocumentFactoryHelper.hasOOXMLHeader(inp);
   }

   public POIXMLProperties getProperties() {
      if(this.properties == null) {
         try {
            this.properties = new POIXMLProperties(this.pkg);
         } catch (Exception var2) {
            throw new POIXMLException(var2);
         }
      }

      return this.properties;
   }

   public abstract List getAllEmbedds() throws OpenXML4JException;

   protected final void load(POIXMLFactory factory) throws IOException {
      HashMap context = new HashMap();

      try {
         this.read(factory, context);
      } catch (OpenXML4JException var4) {
         throw new POIXMLException(var4);
      }

      this.onDocumentRead();
      context.clear();
   }

   public void close() throws IOException {
      if(this.pkg != null) {
         if(this.pkg.getPackageAccess() == PackageAccess.READ) {
            this.pkg.revert();
         } else {
            this.pkg.close();
         }

         this.pkg = null;
      }

   }

   public final void write(OutputStream stream) throws IOException {
      OPCPackage p = this.getPackage();
      if(p == null) {
         throw new IOException("Cannot write data, document seems to have been closed already");
      } else {
         HashSet context = new HashSet();
         this.onSave(context);
         context.clear();
         this.getProperties().commit();
         p.save(stream);
      }
   }
}
