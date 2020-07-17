package org.apache.xmlbeans.impl.tool;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.common.IOUtil;
import org.apache.xmlbeans.impl.tool.SchemaImportResolver;
import org.apache.xmlbeans.impl.util.HexBin;
import org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry;
import org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;

public abstract class BaseSchemaResourceManager extends SchemaImportResolver {

   private static final String USER_AGENT = "XMLBeans/" + XmlBeans.getVersion() + " (" + XmlBeans.getTitle() + ")";
   private String _defaultCopyDirectory;
   private DownloadedSchemasDocument _importsDoc;
   private Map _resourceForFilename = new HashMap();
   private Map _resourceForURL = new HashMap();
   private Map _resourceForNamespace = new HashMap();
   private Map _resourceForDigest = new HashMap();
   private Map _resourceForCacheEntry = new HashMap();
   private Set _redownloadSet = new HashSet();


   protected final void init() {
      if(this.fileExists(this.getIndexFilename())) {
         try {
            this._importsDoc = DownloadedSchemasDocument.Factory.parse(this.inputStreamForFile(this.getIndexFilename()));
         } catch (IOException var5) {
            this._importsDoc = null;
         } catch (Exception var6) {
            throw (IllegalStateException)(new IllegalStateException("Problem reading xsdownload.xml: please fix or delete this file")).initCause(var6);
         }
      }

      if(this._importsDoc == null) {
         try {
            this._importsDoc = DownloadedSchemasDocument.Factory.parse("<dls:downloaded-schemas xmlns:dls=\'http://www.bea.com/2003/01/xmlbean/xsdownload\' defaultDirectory=\'" + this.getDefaultSchemaDir() + "\'/>");
         } catch (Exception var4) {
            throw (IllegalStateException)(new IllegalStateException()).initCause(var4);
         }
      }

      String defaultDir = this._importsDoc.getDownloadedSchemas().getDefaultDirectory();
      if(defaultDir == null) {
         defaultDir = this.getDefaultSchemaDir();
      }

      this._defaultCopyDirectory = defaultDir;
      DownloadedSchemaEntry[] entries = this._importsDoc.getDownloadedSchemas().getEntryArray();

      for(int i = 0; i < entries.length; ++i) {
         this.updateResource(entries[i]);
      }

   }

   public final void writeCache() throws IOException {
      InputStream input = this._importsDoc.newInputStream((new XmlOptions()).setSavePrettyPrint());
      this.writeInputStreamToFile(input, this.getIndexFilename());
   }

   public final void processAll(boolean sync, boolean refresh, boolean imports) {
      if(refresh) {
         this._redownloadSet = new HashSet();
      } else {
         this._redownloadSet = null;
      }

      String[] allFilenames = this.getAllXSDFilenames();
      if(sync) {
         this.syncCacheWithLocalXsdFiles(allFilenames, false);
      }

      BaseSchemaResourceManager.SchemaResource[] starters = (BaseSchemaResourceManager.SchemaResource[])((BaseSchemaResourceManager.SchemaResource[])this._resourceForFilename.values().toArray(new BaseSchemaResourceManager.SchemaResource[0]));
      if(refresh) {
         this.redownloadEntries(starters);
      }

      if(imports) {
         this.resolveImports(starters);
      }

      this._redownloadSet = null;
   }

   public final void process(String[] uris, String[] filenames, boolean sync, boolean refresh, boolean imports) {
      if(refresh) {
         this._redownloadSet = new HashSet();
      } else {
         this._redownloadSet = null;
      }

      if(filenames.length > 0) {
         this.syncCacheWithLocalXsdFiles(filenames, true);
      } else if(sync) {
         this.syncCacheWithLocalXsdFiles(this.getAllXSDFilenames(), false);
      }

      HashSet starterset = new HashSet();

      int starters;
      BaseSchemaResourceManager.SchemaResource resource;
      for(starters = 0; starters < uris.length; ++starters) {
         resource = (BaseSchemaResourceManager.SchemaResource)this.lookupResource((String)null, uris[starters]);
         if(resource != null) {
            starterset.add(resource);
         }
      }

      for(starters = 0; starters < filenames.length; ++starters) {
         resource = (BaseSchemaResourceManager.SchemaResource)this._resourceForFilename.get(filenames);
         if(resource != null) {
            starterset.add(resource);
         }
      }

      BaseSchemaResourceManager.SchemaResource[] var9 = (BaseSchemaResourceManager.SchemaResource[])((BaseSchemaResourceManager.SchemaResource[])starterset.toArray(new BaseSchemaResourceManager.SchemaResource[0]));
      if(refresh) {
         this.redownloadEntries(var9);
      }

      if(imports) {
         this.resolveImports(var9);
      }

      this._redownloadSet = null;
   }

   public final void syncCacheWithLocalXsdFiles(String[] filenames, boolean deleteOnlyMentioned) {
      HashSet seenResources = new HashSet();
      HashSet vanishedResources = new HashSet();

      for(int i = 0; i < filenames.length; ++i) {
         String filename = filenames[i];
         BaseSchemaResourceManager.SchemaResource resource = (BaseSchemaResourceManager.SchemaResource)this._resourceForFilename.get(filename);
         if(resource != null) {
            if(this.fileExists(filename)) {
               seenResources.add(resource);
            } else {
               vanishedResources.add(resource);
            }
         } else {
            String digest = null;

            try {
               digest = this.shaDigestForFile(filename);
               resource = (BaseSchemaResourceManager.SchemaResource)this._resourceForDigest.get(digest);
               if(resource != null) {
                  String newEntry = resource.getFilename();
                  if(!this.fileExists(newEntry)) {
                     this.warning("File " + filename + " is a rename of " + newEntry);
                     resource.setFilename(filename);
                     seenResources.add(resource);
                     if(this._resourceForFilename.get(newEntry) == resource) {
                        this._resourceForFilename.remove(newEntry);
                     }

                     if(this._resourceForFilename.containsKey(filename)) {
                        this._resourceForFilename.put(filename, resource);
                     }
                     continue;
                  }
               }
            } catch (IOException var10) {
               ;
            }

            DownloadedSchemaEntry var11 = this.addNewEntry();
            var11.setFilename(filename);
            this.warning("Caching information on new local file " + filename);
            if(digest != null) {
               var11.setSha1(digest);
            }

            seenResources.add(this.updateResource(var11));
         }
      }

      if(deleteOnlyMentioned) {
         this.deleteResourcesInSet(vanishedResources, true);
      } else {
         this.deleteResourcesInSet(seenResources, false);
      }

   }

   private void redownloadEntries(BaseSchemaResourceManager.SchemaResource[] resources) {
      for(int i = 0; i < resources.length; ++i) {
         this.redownloadResource(resources[i]);
      }

   }

   private void deleteResourcesInSet(Set seenResources, boolean setToDelete) {
      HashSet seenCacheEntries = new HashSet();
      Iterator downloadedSchemas = seenResources.iterator();

      while(downloadedSchemas.hasNext()) {
         BaseSchemaResourceManager.SchemaResource i = (BaseSchemaResourceManager.SchemaResource)downloadedSchemas.next();
         seenCacheEntries.add(i._cacheEntry);
      }

      DownloadedSchemasDocument.DownloadedSchemas var10 = this._importsDoc.getDownloadedSchemas();

      for(int var11 = 0; var11 < var10.sizeOfEntryArray(); ++var11) {
         DownloadedSchemaEntry cacheEntry = var10.getEntryArray(var11);
         if(seenCacheEntries.contains(cacheEntry) == setToDelete) {
            BaseSchemaResourceManager.SchemaResource resource = (BaseSchemaResourceManager.SchemaResource)this._resourceForCacheEntry.get(cacheEntry);
            this.warning("Removing obsolete cache entry for " + resource.getFilename());
            if(resource != null) {
               this._resourceForCacheEntry.remove(cacheEntry);
               if(resource == this._resourceForFilename.get(resource.getFilename())) {
                  this._resourceForFilename.remove(resource.getFilename());
               }

               if(resource == this._resourceForDigest.get(resource.getSha1())) {
                  this._resourceForDigest.remove(resource.getSha1());
               }

               if(resource == this._resourceForNamespace.get(resource.getNamespace())) {
                  this._resourceForNamespace.remove(resource.getNamespace());
               }

               String[] urls = resource.getSchemaLocationArray();

               for(int j = 0; j < urls.length; ++j) {
                  if(resource == this._resourceForURL.get(urls[j])) {
                     this._resourceForURL.remove(urls[j]);
                  }
               }
            }

            var10.removeEntry(var11);
            --var11;
         }
      }

   }

   private BaseSchemaResourceManager.SchemaResource updateResource(DownloadedSchemaEntry entry) {
      String filename = entry.getFilename();
      if(filename == null) {
         return null;
      } else {
         BaseSchemaResourceManager.SchemaResource resource = new BaseSchemaResourceManager.SchemaResource(entry);
         this._resourceForCacheEntry.put(entry, resource);
         if(!this._resourceForFilename.containsKey(filename)) {
            this._resourceForFilename.put(filename, resource);
         }

         String digest = resource.getSha1();
         if(digest != null && !this._resourceForDigest.containsKey(digest)) {
            this._resourceForDigest.put(digest, resource);
         }

         String namespace = resource.getNamespace();
         if(namespace != null && !this._resourceForNamespace.containsKey(namespace)) {
            this._resourceForNamespace.put(namespace, resource);
         }

         String[] urls = resource.getSchemaLocationArray();

         for(int j = 0; j < urls.length; ++j) {
            if(!this._resourceForURL.containsKey(urls[j])) {
               this._resourceForURL.put(urls[j], resource);
            }
         }

         return resource;
      }
   }

   private static DigestInputStream digestInputStream(InputStream input) {
      MessageDigest sha;
      try {
         sha = MessageDigest.getInstance("SHA");
      } catch (NoSuchAlgorithmException var3) {
         throw (IllegalStateException)((IllegalStateException)(new IllegalStateException()).initCause(var3));
      }

      DigestInputStream str = new DigestInputStream(input, sha);
      return str;
   }

   private DownloadedSchemaEntry addNewEntry() {
      return this._importsDoc.getDownloadedSchemas().addNewEntry();
   }

   public SchemaImportResolver.SchemaResource lookupResource(String nsURI, String schemaLocation) {
      BaseSchemaResourceManager.SchemaResource result = this.fetchFromCache(nsURI, schemaLocation);
      if(result != null) {
         if(this._redownloadSet != null) {
            this.redownloadResource(result);
         }

         return result;
      } else if(schemaLocation == null) {
         this.warning("No cached schema for namespace \'" + nsURI + "\', and no url specified");
         return null;
      } else {
         result = this.copyOrIdentifyDuplicateURL(schemaLocation, nsURI);
         if(this._redownloadSet != null) {
            this._redownloadSet.add(result);
         }

         return result;
      }
   }

   private BaseSchemaResourceManager.SchemaResource fetchFromCache(String nsURI, String schemaLocation) {
      BaseSchemaResourceManager.SchemaResource result;
      if(schemaLocation != null) {
         result = (BaseSchemaResourceManager.SchemaResource)this._resourceForURL.get(schemaLocation);
         if(result != null) {
            return result;
         }
      }

      if(nsURI != null) {
         result = (BaseSchemaResourceManager.SchemaResource)this._resourceForNamespace.get(nsURI);
         if(result != null) {
            return result;
         }
      }

      return null;
   }

   private String uniqueFilenameForURI(String schemaLocation) throws IOException, URISyntaxException {
      String localFilename = (new URI(schemaLocation)).getRawPath();
      int i = localFilename.lastIndexOf(47);
      if(i >= 0) {
         localFilename = localFilename.substring(i + 1);
      }

      if(localFilename.endsWith(".xsd")) {
         localFilename = localFilename.substring(0, localFilename.length() - 4);
      }

      if(localFilename.length() == 0) {
         localFilename = "schema";
      }

      String candidateFilename = localFilename;

      for(int suffix = 1; suffix < 1000; candidateFilename = localFilename + suffix) {
         String candidate = this._defaultCopyDirectory + "/" + candidateFilename + ".xsd";
         if(!this.fileExists(candidate)) {
            return candidate;
         }

         ++suffix;
      }

      throw new IOException("Problem with filename " + localFilename + ".xsd");
   }

   private void redownloadResource(BaseSchemaResourceManager.SchemaResource resource) {
      if(this._redownloadSet != null) {
         if(this._redownloadSet.contains(resource)) {
            return;
         }

         this._redownloadSet.add(resource);
      }

      String filename = resource.getFilename();
      String schemaLocation = resource.getSchemaLocation();
      String digest = null;
      if(schemaLocation != null && filename != null) {
         ByteArrayOutputStream buffer = new ByteArrayOutputStream();

         try {
            URL e = new URL(schemaLocation);
            URLConnection conn = e.openConnection();
            conn.addRequestProperty("User-Agent", USER_AGENT);
            conn.addRequestProperty("Accept", "application/xml, text/xml, */*");
            DigestInputStream input = digestInputStream(conn.getInputStream());
            IOUtil.copyCompletely((InputStream)input, (OutputStream)buffer);
            digest = HexBin.bytesToString(input.getMessageDigest().digest());
         } catch (Exception var10) {
            this.warning("Could not copy remote resource " + schemaLocation + ":" + var10.getMessage());
            return;
         }

         if(digest.equals(resource.getSha1()) && this.fileExists(filename)) {
            this.warning("Resource " + filename + " is unchanged from " + schemaLocation + ".");
         } else {
            try {
               ByteArrayInputStream e1 = new ByteArrayInputStream(buffer.toByteArray());
               this.writeInputStreamToFile(e1, filename);
            } catch (IOException var9) {
               this.warning("Could not write to file " + filename + " for " + schemaLocation + ":" + var9.getMessage());
               return;
            }

            this.warning("Refreshed " + filename + " from " + schemaLocation);
         }
      }
   }

   private BaseSchemaResourceManager.SchemaResource copyOrIdentifyDuplicateURL(String schemaLocation, String namespace) {
      String targetFilename;
      try {
         targetFilename = this.uniqueFilenameForURI(schemaLocation);
      } catch (URISyntaxException var9) {
         this.warning("Invalid URI \'" + schemaLocation + "\':" + var9.getMessage());
         return null;
      } catch (IOException var10) {
         this.warning("Could not create local file for " + schemaLocation + ":" + var10.getMessage());
         return null;
      }

      String digest;
      try {
         URL newEntry = new URL(schemaLocation);
         DigestInputStream input = digestInputStream(newEntry.openStream());
         this.writeInputStreamToFile(input, targetFilename);
         digest = HexBin.bytesToString(input.getMessageDigest().digest());
      } catch (Exception var8) {
         this.warning("Could not copy remote resource " + schemaLocation + ":" + var8.getMessage());
         return null;
      }

      BaseSchemaResourceManager.SchemaResource result = (BaseSchemaResourceManager.SchemaResource)this._resourceForDigest.get(digest);
      if(result != null) {
         this.deleteFile(targetFilename);
         result.addSchemaLocation(schemaLocation);
         if(!this._resourceForURL.containsKey(schemaLocation)) {
            this._resourceForURL.put(schemaLocation, result);
         }

         return result;
      } else {
         this.warning("Downloaded " + schemaLocation + " to " + targetFilename);
         DownloadedSchemaEntry newEntry1 = this.addNewEntry();
         newEntry1.setFilename(targetFilename);
         newEntry1.setSha1(digest);
         if(namespace != null) {
            newEntry1.setNamespace(namespace);
         }

         newEntry1.addSchemaLocation(schemaLocation);
         return this.updateResource(newEntry1);
      }
   }

   public void reportActualNamespace(SchemaImportResolver.SchemaResource rresource, String actualNamespace) {
      BaseSchemaResourceManager.SchemaResource resource = (BaseSchemaResourceManager.SchemaResource)rresource;
      String oldNamespace = resource.getNamespace();
      if(oldNamespace != null && this._resourceForNamespace.get(oldNamespace) == resource) {
         this._resourceForNamespace.remove(oldNamespace);
      }

      if(!this._resourceForNamespace.containsKey(actualNamespace)) {
         this._resourceForNamespace.put(actualNamespace, resource);
      }

      resource.setNamespace(actualNamespace);
   }

   private String shaDigestForFile(String filename) throws IOException {
      DigestInputStream str = digestInputStream(this.inputStreamForFile(filename));
      byte[] dummy = new byte[4096];

      for(int i = 1; i > 0; i = str.read(dummy)) {
         ;
      }

      str.close();
      return HexBin.bytesToString(str.getMessageDigest().digest());
   }

   protected String getIndexFilename() {
      return "./xsdownload.xml";
   }

   protected String getDefaultSchemaDir() {
      return "./schema";
   }

   protected abstract void warning(String var1);

   protected abstract boolean fileExists(String var1);

   protected abstract InputStream inputStreamForFile(String var1) throws IOException;

   protected abstract void writeInputStreamToFile(InputStream var1, String var2) throws IOException;

   protected abstract void deleteFile(String var1);

   protected abstract String[] getAllXSDFilenames();

   static void access$000(BaseSchemaResourceManager x0, BaseSchemaResourceManager.SchemaResource x1) {
      x0.redownloadResource(x1);
   }


   private class SchemaResource implements SchemaImportResolver.SchemaResource {

      DownloadedSchemaEntry _cacheEntry;


      SchemaResource(DownloadedSchemaEntry entry) {
         this._cacheEntry = entry;
      }

      public void setFilename(String filename) {
         this._cacheEntry.setFilename(filename);
      }

      public String getFilename() {
         return this._cacheEntry.getFilename();
      }

      public SchemaDocument.Schema getSchema() {
         if(!BaseSchemaResourceManager.this.fileExists(this.getFilename())) {
            BaseSchemaResourceManager.this.redownloadResource(this);
         }

         try {
            return SchemaDocument.Factory.parse(BaseSchemaResourceManager.this.inputStreamForFile(this.getFilename())).getSchema();
         } catch (Exception var2) {
            return null;
         }
      }

      public String getSha1() {
         return this._cacheEntry.getSha1();
      }

      public String getNamespace() {
         return this._cacheEntry.getNamespace();
      }

      public void setNamespace(String namespace) {
         this._cacheEntry.setNamespace(namespace);
      }

      public String getSchemaLocation() {
         return this._cacheEntry.sizeOfSchemaLocationArray() > 0?this._cacheEntry.getSchemaLocationArray(0):null;
      }

      public String[] getSchemaLocationArray() {
         return this._cacheEntry.getSchemaLocationArray();
      }

      public int hashCode() {
         return this.getFilename().hashCode();
      }

      public boolean equals(Object obj) {
         return this == obj || this.getFilename().equals(((BaseSchemaResourceManager.SchemaResource)obj).getFilename());
      }

      public void addSchemaLocation(String schemaLocation) {
         this._cacheEntry.addSchemaLocation(schemaLocation);
      }
   }
}
