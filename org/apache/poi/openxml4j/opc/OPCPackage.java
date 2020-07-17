package org.apache.poi.openxml4j.opc;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JRuntimeException;
import org.apache.poi.openxml4j.exceptions.PartAlreadyExistsException;
import org.apache.poi.openxml4j.opc.ContentTypes;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartCollection;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageProperties;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.RelationshipSource;
import org.apache.poi.openxml4j.opc.StreamHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.ZipPackage;
import org.apache.poi.openxml4j.opc.internal.ContentType;
import org.apache.poi.openxml4j.opc.internal.ContentTypeManager;
import org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart;
import org.apache.poi.openxml4j.opc.internal.PartMarshaller;
import org.apache.poi.openxml4j.opc.internal.PartUnmarshaller;
import org.apache.poi.openxml4j.opc.internal.ZipContentTypeManager;
import org.apache.poi.openxml4j.opc.internal.marshallers.DefaultMarshaller;
import org.apache.poi.openxml4j.opc.internal.marshallers.ZipPackagePropertiesMarshaller;
import org.apache.poi.openxml4j.opc.internal.unmarshallers.PackagePropertiesUnmarshaller;
import org.apache.poi.openxml4j.opc.internal.unmarshallers.UnmarshallContext;
import org.apache.poi.openxml4j.util.Nullable;
import org.apache.poi.openxml4j.util.ZipEntrySource;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public abstract class OPCPackage implements RelationshipSource, Closeable {

   private static final POILogger logger = POILogFactory.getLogger(OPCPackage.class);
   protected static final PackageAccess defaultPackageAccess = PackageAccess.READ_WRITE;
   private PackageAccess packageAccess;
   protected PackagePartCollection partList;
   protected PackageRelationshipCollection relationships;
   protected Map partMarshallers;
   protected PartMarshaller defaultPartMarshaller;
   protected Map partUnmarshallers;
   protected PackagePropertiesPart packageProperties;
   protected ContentTypeManager contentTypeManager;
   protected boolean isDirty = false;
   protected String originalPackagePath;
   protected OutputStream output;


   OPCPackage(PackageAccess access) {
      if(this.getClass() != ZipPackage.class) {
         throw new IllegalArgumentException("PackageBase may not be subclassed");
      } else {
         this.init();
         this.packageAccess = access;
      }
   }

   private void init() {
      this.partMarshallers = new HashMap(5);
      this.partUnmarshallers = new HashMap(2);

      try {
         this.partUnmarshallers.put(new ContentType("application/vnd.openxmlformats-package.core-properties+xml"), new PackagePropertiesUnmarshaller());
         this.defaultPartMarshaller = new DefaultMarshaller();
         this.partMarshallers.put(new ContentType("application/vnd.openxmlformats-package.core-properties+xml"), new ZipPackagePropertiesMarshaller());
      } catch (InvalidFormatException var2) {
         throw new OpenXML4JRuntimeException("Package.init() : this exception should never happen, if you read this message please send a mail to the developers team. : " + var2.getMessage(), var2);
      }
   }

   public static OPCPackage open(String path) throws InvalidFormatException {
      return open(path, defaultPackageAccess);
   }

   public static OPCPackage open(File file) throws InvalidFormatException {
      return open(file, defaultPackageAccess);
   }

   public static OPCPackage open(ZipEntrySource zipEntry) throws InvalidFormatException {
      ZipPackage pack = new ZipPackage(zipEntry, PackageAccess.READ);

      try {
         if(pack.partList == null) {
            pack.getParts();
         }

         return pack;
      } catch (InvalidFormatException var6) {
         try {
            pack.close();
         } catch (IOException var5) {
            throw new IllegalStateException(var6);
         }

         throw var6;
      } catch (RuntimeException var7) {
         try {
            pack.close();
         } catch (IOException var4) {
            throw new IllegalStateException(var7);
         }

         throw var7;
      }
   }

   public static OPCPackage open(String path, PackageAccess access) throws InvalidFormatException, InvalidOperationException {
      if(path != null && !"".equals(path.trim())) {
         File file = new File(path);
         if(file.exists() && file.isDirectory()) {
            throw new IllegalArgumentException("path must not be a directory");
         } else {
            ZipPackage pack = new ZipPackage(path, access);
            boolean success = false;
            if(pack.partList == null && access != PackageAccess.WRITE) {
               try {
                  pack.getParts();
                  success = true;
               } finally {
                  if(!success) {
                     try {
                        pack.close();
                     } catch (IOException var11) {
                        throw new InvalidOperationException("Could not close OPCPackage while cleaning up", var11);
                     }
                  }

               }
            }

            pack.originalPackagePath = (new File(path)).getAbsolutePath();
            return pack;
         }
      } else {
         throw new IllegalArgumentException("\'path\' must be given");
      }
   }

   public static OPCPackage open(File file, PackageAccess access) throws InvalidFormatException {
      if(file == null) {
         throw new IllegalArgumentException("\'file\' must be given");
      } else if(file.exists() && file.isDirectory()) {
         throw new IllegalArgumentException("file must not be a directory");
      } else {
         ZipPackage pack = new ZipPackage(file, access);

         try {
            if(pack.partList == null && access != PackageAccess.WRITE) {
               pack.getParts();
            }

            pack.originalPackagePath = file.getAbsolutePath();
            return pack;
         } catch (InvalidFormatException var7) {
            try {
               pack.close();
            } catch (IOException var6) {
               throw new IllegalStateException(var7);
            }

            throw var7;
         } catch (RuntimeException var8) {
            try {
               pack.close();
            } catch (IOException var5) {
               throw new IllegalStateException(var8);
            }

            throw var8;
         }
      }
   }

   public static OPCPackage open(InputStream in) throws InvalidFormatException, IOException {
      ZipPackage pack = new ZipPackage(in, PackageAccess.READ_WRITE);
      if(pack.partList == null) {
         pack.getParts();
      }

      return pack;
   }

   public static OPCPackage openOrCreate(File file) throws InvalidFormatException {
      OPCPackage retPackage = null;
      if(file.exists()) {
         retPackage = open(file.getAbsolutePath());
      } else {
         retPackage = create(file);
      }

      return retPackage;
   }

   public static OPCPackage create(String path) {
      return create(new File(path));
   }

   public static OPCPackage create(File file) {
      if(file != null && (!file.exists() || !file.isDirectory())) {
         if(file.exists()) {
            throw new InvalidOperationException("This package (or file) already exists : use the open() method or delete the file.");
         } else {
            ZipPackage pkg = new ZipPackage();
            pkg.originalPackagePath = file.getAbsolutePath();
            configurePackage(pkg);
            return pkg;
         }
      } else {
         throw new IllegalArgumentException("file");
      }
   }

   public static OPCPackage create(OutputStream output) {
      ZipPackage pkg = new ZipPackage();
      pkg.originalPackagePath = null;
      pkg.output = output;
      configurePackage(pkg);
      return pkg;
   }

   private static void configurePackage(OPCPackage pkg) {
      try {
         pkg.contentTypeManager = new ZipContentTypeManager((InputStream)null, pkg);
         pkg.contentTypeManager.addContentType(PackagingURIHelper.createPartName(PackagingURIHelper.PACKAGE_RELATIONSHIPS_ROOT_URI), "application/vnd.openxmlformats-package.relationships+xml");
         pkg.contentTypeManager.addContentType(PackagingURIHelper.createPartName("/default.xml"), "application/xml");
         pkg.packageProperties = new PackagePropertiesPart(pkg, PackagingURIHelper.CORE_PROPERTIES_PART_NAME);
         pkg.packageProperties.setCreatorProperty("Generated by Apache POI OpenXML4J");
         pkg.packageProperties.setCreatedProperty(new Nullable(new Date()));
      } catch (InvalidFormatException var2) {
         throw new IllegalStateException(var2);
      }
   }

   public void flush() {
      this.throwExceptionIfReadOnly();
      if(this.packageProperties != null) {
         this.packageProperties.flush();
      }

      this.flushImpl();
   }

   public void close() throws IOException {
      if(this.packageAccess == PackageAccess.READ) {
         logger.log(5, new Object[]{"The close() method is intended to SAVE a package. This package is open in READ ONLY mode, use the revert() method instead !"});
         this.revert();
      } else if(this.contentTypeManager == null) {
         logger.log(5, new Object[]{"Unable to call close() on a package that hasn\'t been fully opened yet"});
         this.revert();
      } else {
         ReentrantReadWriteLock l = new ReentrantReadWriteLock();

         try {
            l.writeLock().lock();
            if(this.originalPackagePath != null && !"".equals(this.originalPackagePath.trim())) {
               File targetFile = new File(this.originalPackagePath);
               if(targetFile.exists() && this.originalPackagePath.equalsIgnoreCase(targetFile.getAbsolutePath())) {
                  this.closeImpl();
               } else {
                  this.save(targetFile);
               }
            } else if(this.output != null) {
               this.save(this.output);
               this.output.close();
            }
         } finally {
            l.writeLock().unlock();
         }

         this.contentTypeManager.clearAll();
      }
   }

   public void revert() {
      this.revertImpl();
   }

   public void addThumbnail(String path) throws IOException {
      if(path != null && !path.isEmpty()) {
         String name = path.substring(path.lastIndexOf(File.separatorChar) + 1);
         FileInputStream is = new FileInputStream(path);

         try {
            this.addThumbnail(name, is);
         } finally {
            is.close();
         }

      } else {
         throw new IllegalArgumentException("path");
      }
   }

   public void addThumbnail(String filename, InputStream data) throws IOException {
      if(filename != null && !filename.isEmpty()) {
         String contentType = ContentTypes.getContentTypeFromFileExtension(filename);

         PackagePartName thumbnailPartName;
         try {
            thumbnailPartName = PackagingURIHelper.createPartName("/docProps/" + filename);
         } catch (InvalidFormatException var9) {
            String partName = "/docProps/thumbnail" + filename.substring(filename.lastIndexOf(".") + 1);

            try {
               thumbnailPartName = PackagingURIHelper.createPartName(partName);
            } catch (InvalidFormatException var8) {
               throw new InvalidOperationException("Can\'t add a thumbnail file named \'" + filename + "\'", var8);
            }
         }

         if(this.getPart(thumbnailPartName) != null) {
            throw new InvalidOperationException("You already add a thumbnail named \'" + filename + "\'");
         } else {
            PackagePart thumbnailPart = this.createPart(thumbnailPartName, contentType, false);
            this.addRelationship(thumbnailPartName, TargetMode.INTERNAL, "http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail");
            StreamHelper.copyStream(data, thumbnailPart.getOutputStream());
         }
      } else {
         throw new IllegalArgumentException("filename");
      }
   }

   void throwExceptionIfReadOnly() throws InvalidOperationException {
      if(this.packageAccess == PackageAccess.READ) {
         throw new InvalidOperationException("Operation not allowed, document open in read only mode!");
      }
   }

   void throwExceptionIfWriteOnly() throws InvalidOperationException {
      if(this.packageAccess == PackageAccess.WRITE) {
         throw new InvalidOperationException("Operation not allowed, document open in write only mode!");
      }
   }

   public PackageProperties getPackageProperties() throws InvalidFormatException {
      this.throwExceptionIfWriteOnly();
      if(this.packageProperties == null) {
         this.packageProperties = new PackagePropertiesPart(this, PackagingURIHelper.CORE_PROPERTIES_PART_NAME);
      }

      return this.packageProperties;
   }

   public PackagePart getPart(PackagePartName partName) {
      this.throwExceptionIfWriteOnly();
      if(partName == null) {
         throw new IllegalArgumentException("partName");
      } else {
         if(this.partList == null) {
            try {
               this.getParts();
            } catch (InvalidFormatException var3) {
               return null;
            }
         }

         return this.getPartImpl(partName);
      }
   }

   public ArrayList getPartsByContentType(String contentType) {
      ArrayList retArr = new ArrayList();
      Iterator i$ = this.partList.values().iterator();

      while(i$.hasNext()) {
         PackagePart part = (PackagePart)i$.next();
         if(part.getContentType().equals(contentType)) {
            retArr.add(part);
         }
      }

      Collections.sort(retArr);
      return retArr;
   }

   public ArrayList getPartsByRelationshipType(String relationshipType) {
      if(relationshipType == null) {
         throw new IllegalArgumentException("relationshipType");
      } else {
         ArrayList retArr = new ArrayList();
         Iterator i$ = this.getRelationshipsByType(relationshipType).iterator();

         while(i$.hasNext()) {
            PackageRelationship rel = (PackageRelationship)i$.next();
            PackagePart part = this.getPart(rel);
            if(part != null) {
               retArr.add(part);
            }
         }

         Collections.sort(retArr);
         return retArr;
      }
   }

   public List getPartsByName(Pattern namePattern) {
      if(namePattern == null) {
         throw new IllegalArgumentException("name pattern must not be null");
      } else {
         Matcher matcher = namePattern.matcher("");
         ArrayList result = new ArrayList();
         Iterator i$ = this.partList.values().iterator();

         while(i$.hasNext()) {
            PackagePart part = (PackagePart)i$.next();
            PackagePartName partName = part.getPartName();
            if(matcher.reset(partName.getName()).matches()) {
               result.add(part);
            }
         }

         Collections.sort(result);
         return result;
      }
   }

   public PackagePart getPart(PackageRelationship partRel) {
      PackagePart retPart = null;
      this.ensureRelationships();
      Iterator i$ = this.relationships.iterator();

      while(i$.hasNext()) {
         PackageRelationship rel = (PackageRelationship)i$.next();
         if(rel.getRelationshipType().equals(partRel.getRelationshipType())) {
            try {
               retPart = this.getPart(PackagingURIHelper.createPartName(rel.getTargetURI()));
               break;
            } catch (InvalidFormatException var6) {
               ;
            }
         }
      }

      return retPart;
   }

   public ArrayList getParts() throws InvalidFormatException {
      this.throwExceptionIfWriteOnly();
      if(this.partList == null) {
         boolean result = false;
         boolean needCorePropertiesPart = true;
         PackagePart[] parts = this.getPartsImpl();
         this.partList = new PackagePartCollection();
         PackagePart[] arr$ = parts;
         int len$ = parts.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            PackagePart part = arr$[i$];
            if(this.partList.containsKey(part._partName)) {
               throw new InvalidFormatException("A part with the name \'" + part._partName + "\' already exist : Packages shall not contain equivalent " + "part names and package implementers shall neither create " + "nor recognize packages with equivalent part names. [M1.12]");
            }

            if(part.getContentType().equals("application/vnd.openxmlformats-package.core-properties+xml")) {
               if(!result) {
                  result = true;
               } else {
                  logger.log(5, new Object[]{"OPC Compliance error [M4.1]: there is more than one core properties relationship in the package! POI will use only the first, but other software may reject this file."});
               }
            }

            PartUnmarshaller partUnmarshaller = (PartUnmarshaller)this.partUnmarshallers.get(part._contentType);
            if(partUnmarshaller != null) {
               UnmarshallContext e = new UnmarshallContext(this, part._partName);

               try {
                  PackagePart invoe = partUnmarshaller.unmarshall(e, part.getInputStream());
                  this.partList.put(invoe._partName, invoe);
                  if(invoe instanceof PackagePropertiesPart && result && needCorePropertiesPart) {
                     this.packageProperties = (PackagePropertiesPart)invoe;
                     needCorePropertiesPart = false;
                  }
               } catch (IOException var12) {
                  logger.log(5, new Object[]{"Unmarshall operation : IOException for " + part._partName});
               } catch (InvalidOperationException var13) {
                  throw new InvalidFormatException(var13.getMessage(), var13);
               }
            } else {
               try {
                  this.partList.put(part._partName, part);
               } catch (InvalidOperationException var11) {
                  throw new InvalidFormatException(var11.getMessage(), var11);
               }
            }
         }
      }

      ArrayList var14 = new ArrayList(this.partList.values());
      Collections.sort(var14);
      return var14;
   }

   public PackagePart createPart(PackagePartName partName, String contentType) {
      return this.createPart(partName, contentType, true);
   }

   PackagePart createPart(PackagePartName partName, String contentType, boolean loadRelationships) {
      this.throwExceptionIfReadOnly();
      if(partName == null) {
         throw new IllegalArgumentException("partName");
      } else if(contentType != null && !contentType.equals("")) {
         if(this.partList.containsKey(partName) && !((PackagePart)this.partList.get(partName)).isDeleted()) {
            throw new PartAlreadyExistsException("A part with the name \'" + partName.getName() + "\'" + " already exists : Packages shall not contain equivalent part names and package" + " implementers shall neither create nor recognize packages with equivalent part names. [M1.12]");
         } else if(contentType.equals("application/vnd.openxmlformats-package.core-properties+xml") && this.packageProperties != null) {
            throw new InvalidOperationException("OPC Compliance error [M4.1]: you try to add more than one core properties relationship in the package !");
         } else {
            PackagePart part = this.createPartImpl(partName, contentType, loadRelationships);
            this.contentTypeManager.addContentType(partName, contentType);
            this.partList.put(partName, part);
            this.isDirty = true;
            return part;
         }
      } else {
         throw new IllegalArgumentException("contentType");
      }
   }

   public PackagePart createPart(PackagePartName partName, String contentType, ByteArrayOutputStream content) {
      PackagePart addedPart = this.createPart(partName, contentType);
      if(addedPart == null) {
         return null;
      } else if(content != null) {
         try {
            OutputStream ioe = addedPart.getOutputStream();
            if(ioe == null) {
               return null;
            } else {
               ioe.write(content.toByteArray(), 0, content.size());
               ioe.close();
               return addedPart;
            }
         } catch (IOException var6) {
            return null;
         }
      } else {
         return null;
      }
   }

   protected PackagePart addPackagePart(PackagePart part) {
      this.throwExceptionIfReadOnly();
      if(part == null) {
         throw new IllegalArgumentException("part");
      } else {
         if(this.partList.containsKey(part._partName)) {
            if(!((PackagePart)this.partList.get(part._partName)).isDeleted()) {
               throw new InvalidOperationException("A part with the name \'" + part._partName.getName() + "\' already exists : Packages shall not contain equivalent part names and package implementers shall neither create nor recognize packages with equivalent part names. [M1.12]");
            }

            part.setDeleted(false);
            this.partList.remove(part._partName);
         }

         this.partList.put(part._partName, part);
         this.isDirty = true;
         return part;
      }
   }

   public void removePart(PackagePart part) {
      if(part != null) {
         this.removePart(part.getPartName());
      }

   }

   public void removePart(PackagePartName partName) {
      this.throwExceptionIfReadOnly();
      if(partName != null && this.containPart(partName)) {
         if(this.partList.containsKey(partName)) {
            ((PackagePart)this.partList.get(partName)).setDeleted(true);
            this.removePartImpl(partName);
            this.partList.remove(partName);
         } else {
            this.removePartImpl(partName);
         }

         this.contentTypeManager.removeContentType(partName);
         if(partName.isRelationshipPartURI()) {
            URI sourceURI = PackagingURIHelper.getSourcePartUriFromRelationshipPartUri(partName.getURI());

            PackagePartName sourcePartName;
            try {
               sourcePartName = PackagingURIHelper.createPartName(sourceURI);
            } catch (InvalidFormatException var5) {
               logger.log(7, new Object[]{"Part name URI \'" + sourceURI + "\' is not valid ! This message is not intended to be displayed !"});
               return;
            }

            if(sourcePartName.getURI().equals(PackagingURIHelper.PACKAGE_ROOT_URI)) {
               this.clearRelationships();
            } else if(this.containPart(sourcePartName)) {
               PackagePart part = this.getPart(sourcePartName);
               if(part != null) {
                  part.clearRelationships();
               }
            }
         }

         this.isDirty = true;
      } else {
         throw new IllegalArgumentException("partName");
      }
   }

   public void removePartRecursive(PackagePartName partName) throws InvalidFormatException {
      PackagePart relPart = (PackagePart)this.partList.get(PackagingURIHelper.getRelationshipPartName(partName));
      PackagePart partToRemove = (PackagePart)this.partList.get(partName);
      if(relPart != null) {
         PackageRelationshipCollection partRels = new PackageRelationshipCollection(partToRemove);
         Iterator i$ = partRels.iterator();

         while(i$.hasNext()) {
            PackageRelationship rel = (PackageRelationship)i$.next();
            PackagePartName partNameToRemove = PackagingURIHelper.createPartName(PackagingURIHelper.resolvePartUri(rel.getSourceURI(), rel.getTargetURI()));
            this.removePart(partNameToRemove);
         }

         this.removePart(relPart._partName);
      }

      this.removePart(partToRemove._partName);
   }

   public void deletePart(PackagePartName partName) {
      if(partName == null) {
         throw new IllegalArgumentException("partName");
      } else {
         this.removePart(partName);
         this.removePart(PackagingURIHelper.getRelationshipPartName(partName));
      }
   }

   public void deletePartRecursive(PackagePartName partName) {
      if(partName != null && this.containPart(partName)) {
         PackagePart partToDelete = this.getPart(partName);
         this.removePart(partName);

         try {
            Iterator relationshipPartName = partToDelete.getRelationships().iterator();

            while(relationshipPartName.hasNext()) {
               PackageRelationship relationship = (PackageRelationship)relationshipPartName.next();
               PackagePartName targetPartName = PackagingURIHelper.createPartName(PackagingURIHelper.resolvePartUri(partName.getURI(), relationship.getTargetURI()));
               this.deletePartRecursive(targetPartName);
            }
         } catch (InvalidFormatException var6) {
            logger.log(5, new Object[]{"An exception occurs while deleting part \'" + partName.getName() + "\'. Some parts may remain in the package. - " + var6.getMessage()});
            return;
         }

         PackagePartName relationshipPartName1 = PackagingURIHelper.getRelationshipPartName(partName);
         if(relationshipPartName1 != null && this.containPart(relationshipPartName1)) {
            this.removePart(relationshipPartName1);
         }

      } else {
         throw new IllegalArgumentException("partName");
      }
   }

   public boolean containPart(PackagePartName partName) {
      return this.getPart(partName) != null;
   }

   public PackageRelationship addRelationship(PackagePartName targetPartName, TargetMode targetMode, String relationshipType, String relID) {
      if(relationshipType.equals("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties") && this.packageProperties != null) {
         throw new InvalidOperationException("OPC Compliance error [M4.1]: can\'t add another core properties part ! Use the built-in package method instead.");
      } else if(targetPartName.isRelationshipPartURI()) {
         throw new InvalidOperationException("Rule M1.25: The Relationships part shall not have relationships to any other part.");
      } else {
         this.ensureRelationships();
         PackageRelationship retRel = this.relationships.addRelationship(targetPartName.getURI(), targetMode, relationshipType, relID);
         this.isDirty = true;
         return retRel;
      }
   }

   public PackageRelationship addRelationship(PackagePartName targetPartName, TargetMode targetMode, String relationshipType) {
      return this.addRelationship(targetPartName, targetMode, relationshipType, (String)null);
   }

   public PackageRelationship addExternalRelationship(String target, String relationshipType) {
      return this.addExternalRelationship(target, relationshipType, (String)null);
   }

   public PackageRelationship addExternalRelationship(String target, String relationshipType, String id) {
      if(target == null) {
         throw new IllegalArgumentException("target");
      } else if(relationshipType == null) {
         throw new IllegalArgumentException("relationshipType");
      } else {
         URI targetURI;
         try {
            targetURI = new URI(target);
         } catch (URISyntaxException var6) {
            throw new IllegalArgumentException("Invalid target - " + var6);
         }

         this.ensureRelationships();
         PackageRelationship retRel = this.relationships.addRelationship(targetURI, TargetMode.EXTERNAL, relationshipType, id);
         this.isDirty = true;
         return retRel;
      }
   }

   public void removeRelationship(String id) {
      if(this.relationships != null) {
         this.relationships.removeRelationship(id);
         this.isDirty = true;
      }

   }

   public PackageRelationshipCollection getRelationships() {
      return this.getRelationshipsHelper((String)null);
   }

   public PackageRelationshipCollection getRelationshipsByType(String relationshipType) {
      this.throwExceptionIfWriteOnly();
      if(relationshipType == null) {
         throw new IllegalArgumentException("relationshipType");
      } else {
         return this.getRelationshipsHelper(relationshipType);
      }
   }

   private PackageRelationshipCollection getRelationshipsHelper(String id) {
      this.throwExceptionIfWriteOnly();
      this.ensureRelationships();
      return this.relationships.getRelationships(id);
   }

   public void clearRelationships() {
      if(this.relationships != null) {
         this.relationships.clear();
         this.isDirty = true;
      }

   }

   public void ensureRelationships() {
      if(this.relationships == null) {
         try {
            this.relationships = new PackageRelationshipCollection(this);
         } catch (InvalidFormatException var2) {
            this.relationships = new PackageRelationshipCollection();
         }
      }

   }

   public PackageRelationship getRelationship(String id) {
      return this.relationships.getRelationshipByID(id);
   }

   public boolean hasRelationships() {
      return this.relationships.size() > 0;
   }

   public boolean isRelationshipExists(PackageRelationship rel) {
      Iterator i$ = this.getRelationships().iterator();

      PackageRelationship r;
      do {
         if(!i$.hasNext()) {
            return false;
         }

         r = (PackageRelationship)i$.next();
      } while(r != rel);

      return true;
   }

   public void addMarshaller(String contentType, PartMarshaller marshaller) {
      try {
         this.partMarshallers.put(new ContentType(contentType), marshaller);
      } catch (InvalidFormatException var4) {
         logger.log(5, new Object[]{"The specified content type is not valid: \'" + var4.getMessage() + "\'. The marshaller will not be added !"});
      }

   }

   public void addUnmarshaller(String contentType, PartUnmarshaller unmarshaller) {
      try {
         this.partUnmarshallers.put(new ContentType(contentType), unmarshaller);
      } catch (InvalidFormatException var4) {
         logger.log(5, new Object[]{"The specified content type is not valid: \'" + var4.getMessage() + "\'. The unmarshaller will not be added !"});
      }

   }

   public void removeMarshaller(String contentType) {
      try {
         this.partMarshallers.remove(new ContentType(contentType));
      } catch (InvalidFormatException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void removeUnmarshaller(String contentType) {
      try {
         this.partUnmarshallers.remove(new ContentType(contentType));
      } catch (InvalidFormatException var3) {
         throw new RuntimeException(var3);
      }
   }

   public PackageAccess getPackageAccess() {
      return this.packageAccess;
   }

   @NotImplemented
   public boolean validatePackage(OPCPackage pkg) throws InvalidFormatException {
      throw new InvalidOperationException("Not implemented yet !!!");
   }

   public void save(File targetFile) throws IOException {
      if(targetFile == null) {
         throw new IllegalArgumentException("targetFile");
      } else {
         this.throwExceptionIfReadOnly();
         if(targetFile.exists() && targetFile.getAbsolutePath().equals(this.originalPackagePath)) {
            throw new InvalidOperationException("You can\'t call save(File) to save to the currently open file. To save to the current file, please just call close()");
         } else {
            FileOutputStream fos = null;

            try {
               fos = new FileOutputStream(targetFile);
               this.save((OutputStream)fos);
            } finally {
               if(fos != null) {
                  fos.close();
               }

            }

         }
      }
   }

   public void save(OutputStream outputStream) throws IOException {
      this.throwExceptionIfReadOnly();
      this.saveImpl(outputStream);
   }

   protected abstract PackagePart createPartImpl(PackagePartName var1, String var2, boolean var3);

   protected abstract void removePartImpl(PackagePartName var1);

   protected abstract void flushImpl();

   protected abstract void closeImpl() throws IOException;

   protected abstract void revertImpl();

   protected abstract void saveImpl(OutputStream var1) throws IOException;

   protected abstract PackagePart getPartImpl(PackagePartName var1);

   protected abstract PackagePart[] getPartsImpl() throws InvalidFormatException;

   public boolean replaceContentType(String oldContentType, String newContentType) {
      boolean success = false;
      ArrayList list = this.getPartsByContentType(oldContentType);
      Iterator i$ = list.iterator();

      while(i$.hasNext()) {
         PackagePart packagePart = (PackagePart)i$.next();
         if(packagePart.getContentType().equals(oldContentType)) {
            PackagePartName partName = packagePart.getPartName();
            this.contentTypeManager.addContentType(partName, newContentType);
            success = true;
         }
      }

      return success;
   }

   public void registerPartAndContentType(PackagePart part) {
      this.addPackagePart(part);
      this.contentTypeManager.addContentType(part.getPartName(), part.getContentType());
      this.isDirty = true;
   }

   public void unregisterPartAndContentType(PackagePartName partName) {
      this.removePart(partName);
      this.contentTypeManager.removeContentType(partName);
      this.isDirty = true;
   }

}
