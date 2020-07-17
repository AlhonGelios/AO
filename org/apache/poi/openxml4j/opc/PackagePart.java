package org.apache.poi.openxml4j.opc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.RelationshipSource;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.ZipPackagePart;
import org.apache.poi.openxml4j.opc.internal.ContentType;

public abstract class PackagePart implements RelationshipSource, Comparable {

   protected OPCPackage _container;
   protected PackagePartName _partName;
   protected ContentType _contentType;
   private boolean _isRelationshipPart;
   private boolean _isDeleted;
   private PackageRelationshipCollection _relationships;


   protected PackagePart(OPCPackage pack, PackagePartName partName, ContentType contentType) throws InvalidFormatException {
      this(pack, partName, contentType, true);
   }

   protected PackagePart(OPCPackage pack, PackagePartName partName, ContentType contentType, boolean loadRelationships) throws InvalidFormatException {
      this._partName = partName;
      this._contentType = contentType;
      this._container = pack;
      this._isRelationshipPart = this._partName.isRelationshipPartURI();
      if(loadRelationships) {
         this.loadRelationships();
      }

   }

   public PackagePart(OPCPackage pack, PackagePartName partName, String contentType) throws InvalidFormatException {
      this(pack, partName, new ContentType(contentType));
   }

   public PackageRelationship addExternalRelationship(String target, String relationshipType) {
      return this.addExternalRelationship(target, relationshipType, (String)null);
   }

   public PackageRelationship addExternalRelationship(String target, String relationshipType, String id) {
      if(target == null) {
         throw new IllegalArgumentException("target is null for type " + relationshipType);
      } else if(relationshipType == null) {
         throw new IllegalArgumentException("relationshipType");
      } else {
         if(this._relationships == null) {
            this._relationships = new PackageRelationshipCollection();
         }

         URI targetURI;
         try {
            targetURI = new URI(target);
         } catch (URISyntaxException var6) {
            throw new IllegalArgumentException("Invalid target - " + var6);
         }

         return this._relationships.addRelationship(targetURI, TargetMode.EXTERNAL, relationshipType, id);
      }
   }

   public PackageRelationship addRelationship(PackagePartName targetPartName, TargetMode targetMode, String relationshipType) {
      return this.addRelationship(targetPartName, targetMode, relationshipType, (String)null);
   }

   public PackageRelationship addRelationship(PackagePartName targetPartName, TargetMode targetMode, String relationshipType, String id) {
      this._container.throwExceptionIfReadOnly();
      if(targetPartName == null) {
         throw new IllegalArgumentException("targetPartName");
      } else if(targetMode == null) {
         throw new IllegalArgumentException("targetMode");
      } else if(relationshipType == null) {
         throw new IllegalArgumentException("relationshipType");
      } else if(!this._isRelationshipPart && !targetPartName.isRelationshipPartURI()) {
         if(this._relationships == null) {
            this._relationships = new PackageRelationshipCollection();
         }

         return this._relationships.addRelationship(targetPartName.getURI(), targetMode, relationshipType, id);
      } else {
         throw new InvalidOperationException("Rule M1.25: The Relationships part shall not have relationships to any other part.");
      }
   }

   public PackageRelationship addRelationship(URI targetURI, TargetMode targetMode, String relationshipType) {
      return this.addRelationship(targetURI, targetMode, relationshipType, (String)null);
   }

   public PackageRelationship addRelationship(URI targetURI, TargetMode targetMode, String relationshipType, String id) {
      this._container.throwExceptionIfReadOnly();
      if(targetURI == null) {
         throw new IllegalArgumentException("targetPartName");
      } else if(targetMode == null) {
         throw new IllegalArgumentException("targetMode");
      } else if(relationshipType == null) {
         throw new IllegalArgumentException("relationshipType");
      } else if(!this._isRelationshipPart && !PackagingURIHelper.isRelationshipPartURI(targetURI)) {
         if(this._relationships == null) {
            this._relationships = new PackageRelationshipCollection();
         }

         return this._relationships.addRelationship(targetURI, targetMode, relationshipType, id);
      } else {
         throw new InvalidOperationException("Rule M1.25: The Relationships part shall not have relationships to any other part.");
      }
   }

   public void clearRelationships() {
      if(this._relationships != null) {
         this._relationships.clear();
      }

   }

   public void removeRelationship(String id) {
      this._container.throwExceptionIfReadOnly();
      if(this._relationships != null) {
         this._relationships.removeRelationship(id);
      }

   }

   public PackageRelationshipCollection getRelationships() throws InvalidFormatException {
      return this.getRelationshipsCore((String)null);
   }

   public PackageRelationship getRelationship(String id) {
      return this._relationships.getRelationshipByID(id);
   }

   public PackageRelationshipCollection getRelationshipsByType(String relationshipType) throws InvalidFormatException {
      this._container.throwExceptionIfWriteOnly();
      return this.getRelationshipsCore(relationshipType);
   }

   private PackageRelationshipCollection getRelationshipsCore(String filter) throws InvalidFormatException {
      this._container.throwExceptionIfWriteOnly();
      if(this._relationships == null) {
         this.throwExceptionIfRelationship();
         this._relationships = new PackageRelationshipCollection(this);
      }

      return new PackageRelationshipCollection(this._relationships, filter);
   }

   public boolean hasRelationships() {
      return !this._isRelationshipPart && this._relationships != null && this._relationships.size() > 0;
   }

   public boolean isRelationshipExists(PackageRelationship rel) {
      try {
         Iterator i$ = this.getRelationships().iterator();

         while(i$.hasNext()) {
            PackageRelationship r = (PackageRelationship)i$.next();
            if(r == rel) {
               return true;
            }
         }
      } catch (InvalidFormatException var4) {
         ;
      }

      return false;
   }

   public PackagePart getRelatedPart(PackageRelationship rel) throws InvalidFormatException {
      if(!this.isRelationshipExists(rel)) {
         throw new IllegalArgumentException("Relationship " + rel + " doesn\'t start with this part " + this._partName);
      } else {
         URI target = rel.getTargetURI();
         if(target.getFragment() != null) {
            String relName = target.toString();

            try {
               target = new URI(relName.substring(0, relName.indexOf(35)));
            } catch (URISyntaxException var5) {
               throw new InvalidFormatException("Invalid target URI: " + target);
            }
         }

         PackagePartName relName1 = PackagingURIHelper.createPartName(target);
         PackagePart part = this._container.getPart(relName1);
         if(part == null) {
            throw new IllegalArgumentException("No part found for relationship " + rel);
         } else {
            return part;
         }
      }
   }

   public InputStream getInputStream() throws IOException {
      InputStream inStream = this.getInputStreamImpl();
      if(inStream == null) {
         throw new IOException("Can\'t obtain the input stream from " + this._partName.getName());
      } else {
         return inStream;
      }
   }

   public OutputStream getOutputStream() {
      OutputStream outStream;
      if(this instanceof ZipPackagePart) {
         this._container.removePart(this._partName);
         PackagePart part = this._container.createPart(this._partName, this._contentType.toString(), false);
         if(part == null) {
            throw new InvalidOperationException("Can\'t create a temporary part !");
         }

         part._relationships = this._relationships;
         outStream = part.getOutputStreamImpl();
      } else {
         outStream = this.getOutputStreamImpl();
      }

      return outStream;
   }

   private void throwExceptionIfRelationship() throws InvalidOperationException {
      if(this._isRelationshipPart) {
         throw new InvalidOperationException("Can do this operation on a relationship part !");
      }
   }

   private void loadRelationships() throws InvalidFormatException {
      if(this._relationships == null && !this._isRelationshipPart) {
         this.throwExceptionIfRelationship();
         this._relationships = new PackageRelationshipCollection(this);
      }

   }

   public PackagePartName getPartName() {
      return this._partName;
   }

   public String getContentType() {
      return this._contentType.toString();
   }

   public ContentType getContentTypeDetails() {
      return this._contentType;
   }

   public void setContentType(String contentType) throws InvalidFormatException {
      if(this._container == null) {
         this._contentType = new ContentType(contentType);
      } else {
         this._container.unregisterPartAndContentType(this._partName);
         this._contentType = new ContentType(contentType);
         this._container.registerPartAndContentType(this);
      }

   }

   public OPCPackage getPackage() {
      return this._container;
   }

   public boolean isRelationshipPart() {
      return this._isRelationshipPart;
   }

   public boolean isDeleted() {
      return this._isDeleted;
   }

   public void setDeleted(boolean isDeleted) {
      this._isDeleted = isDeleted;
   }

   public long getSize() {
      return -1L;
   }

   public String toString() {
      return "Name: " + this._partName + " - Content Type: " + this._contentType.toString();
   }

   public int compareTo(PackagePart other) {
      return other == null?-1:PackagePartName.compare(this._partName, other._partName);
   }

   protected abstract InputStream getInputStreamImpl() throws IOException;

   protected abstract OutputStream getOutputStreamImpl();

   public abstract boolean save(OutputStream var1) throws OpenXML4JException;

   public abstract boolean load(InputStream var1) throws InvalidFormatException;

   public abstract void close();

   public abstract void flush();

   public void clear() {}
}
