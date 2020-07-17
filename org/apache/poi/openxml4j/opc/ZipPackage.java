package org.apache.poi.openxml4j.opc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.openxml4j.exceptions.ODFNotOfficeXmlFileException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JRuntimeException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartCollection;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.ZipPackagePart;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.apache.poi.openxml4j.opc.internal.MemoryPackagePart;
import org.apache.poi.openxml4j.opc.internal.PartMarshaller;
import org.apache.poi.openxml4j.opc.internal.ZipContentTypeManager;
import org.apache.poi.openxml4j.opc.internal.ZipHelper;
import org.apache.poi.openxml4j.opc.internal.marshallers.ZipPartMarshaller;
import org.apache.poi.openxml4j.util.ZipEntrySource;
import org.apache.poi.openxml4j.util.ZipFileZipEntrySource;
import org.apache.poi.openxml4j.util.ZipInputStreamZipEntrySource;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.TempFile;

public final class ZipPackage extends OPCPackage {

   private static final String MIMETYPE = "mimetype";
   private static final String SETTINGS_XML = "settings.xml";
   private static final POILogger logger = POILogFactory.getLogger(ZipPackage.class);
   private final ZipEntrySource zipArchive;


   public ZipPackage() {
      super(defaultPackageAccess);
      this.zipArchive = null;

      try {
         this.contentTypeManager = new ZipContentTypeManager((InputStream)null, this);
      } catch (InvalidFormatException var2) {
         logger.log(5, new Object[]{"Could not parse ZipPackage", var2});
      }

   }

   ZipPackage(InputStream in, PackageAccess access) throws IOException {
      super(access);
      ZipSecureFile.ThresholdInputStream zis = ZipHelper.openZipStream(in);

      try {
         this.zipArchive = new ZipInputStreamZipEntrySource(zis);
      } catch (IOException var7) {
         try {
            zis.close();
         } catch (IOException var6) {
            throw new IOException("Failed to close zip input stream while cleaning up. " + var7.getMessage(), var6);
         }

         throw new IOException("Failed to read zip entry source", var7);
      }
   }

   ZipPackage(String path, PackageAccess access) throws InvalidOperationException {
      this(new File(path), access);
   }

   ZipPackage(File file, PackageAccess access) throws InvalidOperationException {
      super(access);

      Object ze;
      try {
         ZipFile e = ZipHelper.openZipFile(file);
         ze = new ZipFileZipEntrySource(e);
      } catch (IOException var5) {
         if(access == PackageAccess.WRITE) {
            throw new InvalidOperationException("Can\'t open the specified file: \'" + file + "\'", var5);
         }

         logger.log(7, new Object[]{"Error in zip file " + file + " - falling back to stream processing (i.e. ignoring zip central directory)"});
         ze = openZipEntrySourceStream(file);
      }

      this.zipArchive = (ZipEntrySource)ze;
   }

   private static ZipEntrySource openZipEntrySourceStream(File file) throws InvalidOperationException {
      FileInputStream fis;
      try {
         fis = new FileInputStream(file);
      } catch (FileNotFoundException var6) {
         throw new InvalidOperationException("Can\'t open the specified file input stream from file: \'" + file + "\'", var6);
      }

      try {
         return openZipEntrySourceStream(fis);
      } catch (Exception var5) {
         try {
            fis.close();
         } catch (IOException var4) {
            throw new InvalidOperationException("Could not close the specified file input stream from file: \'" + file + "\'", var4);
         }

         throw new InvalidOperationException("Failed to read the file input stream from file: \'" + file + "\'", var5);
      }
   }

   private static ZipEntrySource openZipEntrySourceStream(FileInputStream fis) throws InvalidOperationException {
      ZipSecureFile.ThresholdInputStream zis;
      try {
         zis = ZipHelper.openZipStream(fis);
      } catch (IOException var6) {
         throw new InvalidOperationException("Could not open the file input stream", var6);
      }

      try {
         return openZipEntrySourceStream(zis);
      } catch (Exception var5) {
         try {
            zis.close();
         } catch (IOException var4) {
            throw new InvalidOperationException("Failed to read the zip entry source stream and could not close the zip input stream", var4);
         }

         throw new InvalidOperationException("Failed to read the zip entry source stream", var5);
      }
   }

   private static ZipEntrySource openZipEntrySourceStream(ZipSecureFile.ThresholdInputStream zis) throws InvalidOperationException {
      try {
         return new ZipInputStreamZipEntrySource(zis);
      } catch (IOException var2) {
         throw new InvalidOperationException("Could not open the specified zip entry source stream", var2);
      }
   }

   ZipPackage(ZipEntrySource zipEntry, PackageAccess access) {
      super(access);
      this.zipArchive = zipEntry;
   }

   protected PackagePart[] getPartsImpl() throws InvalidFormatException {
      if(this.partList == null) {
         this.partList = new PackagePartCollection();
      }

      if(this.zipArchive == null) {
         return (PackagePart[])this.partList.values().toArray(new PackagePart[this.partList.values().size()]);
      } else {
         Enumeration entries = this.zipArchive.getEntries();

         ZipEntry entry;
         while(entries.hasMoreElements()) {
            entry = (ZipEntry)entries.nextElement();
            if(entry.getName().equalsIgnoreCase("[Content_Types].xml")) {
               try {
                  this.contentTypeManager = new ZipContentTypeManager(this.getZipArchive().getInputStream(entry), this);
                  break;
               } catch (IOException var9) {
                  throw new InvalidFormatException(var9.getMessage(), var9);
               }
            }
         }

         if(this.contentTypeManager == null) {
            int var10 = 0;
            boolean var11 = false;
            boolean var12 = false;

            for(entries = this.zipArchive.getEntries(); entries.hasMoreElements(); ++var10) {
               ZipEntry var13 = (ZipEntry)entries.nextElement();
               String name = var13.getName();
               if("mimetype".equals(name)) {
                  var11 = true;
               }

               if("settings.xml".equals(name)) {
                  var12 = true;
               }
            }

            if(var11 && var12) {
               throw new ODFNotOfficeXmlFileException("The supplied data appears to be in ODF (Open Document) Format. Formats like these (eg ODS, ODP) are not supported, try Apache ODFToolkit");
            } else if(var10 == 0) {
               throw new NotOfficeXmlFileException("No valid entries or contents found, this is not a valid OOXML (Office Open XML) file");
            } else {
               throw new InvalidFormatException("Package should contain a content type part [M1.13]");
            }
         } else {
            entries = this.zipArchive.getEntries();

            PackagePartName partName;
            String contentType;
            ZipPackagePart e;
            while(entries.hasMoreElements()) {
               entry = (ZipEntry)entries.nextElement();
               partName = this.buildPartName(entry);
               if(partName != null) {
                  contentType = this.contentTypeManager.getContentType(partName);
                  if(contentType != null && contentType.equals("application/vnd.openxmlformats-package.relationships+xml")) {
                     try {
                        e = new ZipPackagePart(this, entry, partName, contentType);
                        this.partList.put(partName, (PackagePart)e);
                     } catch (InvalidOperationException var8) {
                        throw new InvalidFormatException(var8.getMessage(), var8);
                     }
                  }
               }
            }

            entries = this.zipArchive.getEntries();

            while(entries.hasMoreElements()) {
               entry = (ZipEntry)entries.nextElement();
               partName = this.buildPartName(entry);
               if(partName != null) {
                  contentType = this.contentTypeManager.getContentType(partName);
                  if(contentType == null || !contentType.equals("application/vnd.openxmlformats-package.relationships+xml")) {
                     if(contentType == null) {
                        throw new InvalidFormatException("The part " + partName.getURI().getPath() + " does not have any content type ! Rule: Package require content types when retrieving a part from a package. [M.1.14]");
                     }

                     try {
                        e = new ZipPackagePart(this, entry, partName, contentType);
                        this.partList.put(partName, (PackagePart)e);
                     } catch (InvalidOperationException var7) {
                        throw new InvalidFormatException(var7.getMessage(), var7);
                     }
                  }
               }
            }

            return (PackagePart[])this.partList.values().toArray(new ZipPackagePart[this.partList.size()]);
         }
      }
   }

   private PackagePartName buildPartName(ZipEntry entry) {
      try {
         return entry.getName().equalsIgnoreCase("[Content_Types].xml")?null:PackagingURIHelper.createPartName(ZipHelper.getOPCNameFromZipItemName(entry.getName()));
      } catch (Exception var3) {
         logger.log(5, new Object[]{"Entry " + entry.getName() + " is not valid, so this part won\'t be add to the package.", var3});
         return null;
      }
   }

   protected PackagePart createPartImpl(PackagePartName partName, String contentType, boolean loadRelationships) {
      if(contentType == null) {
         throw new IllegalArgumentException("contentType");
      } else if(partName == null) {
         throw new IllegalArgumentException("partName");
      } else {
         try {
            return new MemoryPackagePart(this, partName, contentType, loadRelationships);
         } catch (InvalidFormatException var5) {
            logger.log(5, new Object[]{var5});
            return null;
         }
      }
   }

   protected void removePartImpl(PackagePartName partName) {
      if(partName == null) {
         throw new IllegalArgumentException("partUri");
      }
   }

   protected void flushImpl() {}

   protected void closeImpl() throws IOException {
      this.flush();
      if(this.originalPackagePath != null && !"".equals(this.originalPackagePath)) {
         File targetFile = new File(this.originalPackagePath);
         if(!targetFile.exists()) {
            throw new InvalidOperationException("Can\'t close a package not previously open with the open() method !");
         }

         File tempFile = TempFile.createTempFile(this.generateTempFileName(FileHelper.getDirectory(targetFile)), ".tmp");

         try {
            this.save(tempFile);
         } finally {
            try {
               this.zipArchive.close();
               FileHelper.copyFile(tempFile, targetFile);
            } finally {
               if(!tempFile.delete()) {
                  logger.log(5, new Object[]{"The temporary file: \'" + targetFile.getAbsolutePath() + "\' cannot be deleted ! Make sure that no other application use it."});
               }

            }
         }
      }

   }

   private synchronized String generateTempFileName(File directory) {
      File tmpFilename;
      do {
         tmpFilename = new File(directory.getAbsoluteFile() + File.separator + "OpenXML4J" + System.nanoTime());
      } while(tmpFilename.exists());

      return FileHelper.getFilename(tmpFilename.getAbsoluteFile());
   }

   protected void revertImpl() {
      try {
         if(this.zipArchive != null) {
            this.zipArchive.close();
         }
      } catch (IOException var2) {
         ;
      }

   }

   protected PackagePart getPartImpl(PackagePartName partName) {
      return this.partList.containsKey(partName)?(PackagePart)this.partList.get(partName):null;
   }

   public void saveImpl(OutputStream outputStream) {
      this.throwExceptionIfReadOnly();

      try {
         ZipOutputStream zos;
         if(!(outputStream instanceof ZipOutputStream)) {
            zos = new ZipOutputStream(outputStream);
         } else {
            zos = (ZipOutputStream)outputStream;
         }

         if(this.getPartsByRelationshipType("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties").size() == 0 && this.getPartsByRelationshipType("http://schemas.openxmlformats.org/officedocument/2006/relationships/metadata/core-properties").size() == 0) {
            logger.log(1, new Object[]{"Save core properties part"});
            this.getPackageProperties();
            this.addPackagePart(this.packageProperties);
            this.relationships.addRelationship(this.packageProperties.getPartName().getURI(), TargetMode.INTERNAL, "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties", (String)null);
            if(!this.contentTypeManager.isContentTypeRegister("application/vnd.openxmlformats-package.core-properties+xml")) {
               this.contentTypeManager.addContentType(this.packageProperties.getPartName(), "application/vnd.openxmlformats-package.core-properties+xml");
            }
         }

         logger.log(1, new Object[]{"Save package relationships"});
         ZipPartMarshaller.marshallRelationshipPart(this.getRelationships(), PackagingURIHelper.PACKAGE_RELATIONSHIPS_ROOT_PART_NAME, zos);
         logger.log(1, new Object[]{"Save content types part"});
         this.contentTypeManager.save(zos);
         Iterator e = this.getParts().iterator();

         while(e.hasNext()) {
            PackagePart part = (PackagePart)e.next();
            if(!part.isRelationshipPart()) {
               logger.log(1, new Object[]{"Save part \'" + ZipHelper.getZipItemNameFromOPCName(part.getPartName().getName()) + "\'"});
               PartMarshaller marshaller = (PartMarshaller)this.partMarshallers.get(part._contentType);
               if(marshaller != null) {
                  if(!marshaller.marshall(part, zos)) {
                     throw new OpenXML4JException("The part " + part.getPartName().getURI() + " fail to be saved in the stream with marshaller " + marshaller);
                  }
               } else if(!this.defaultPartMarshaller.marshall(part, zos)) {
                  throw new OpenXML4JException("The part " + part.getPartName().getURI() + " fail to be saved in the stream with marshaller " + this.defaultPartMarshaller);
               }
            }
         }

         zos.close();
      } catch (OpenXML4JRuntimeException var6) {
         throw var6;
      } catch (Exception var7) {
         throw new OpenXML4JRuntimeException("Fail to save: an error occurs while saving the package : " + var7.getMessage(), var7);
      }
   }

   public ZipEntrySource getZipArchive() {
      return this.zipArchive;
   }

}
