package org.apache.poi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.MutablePropertySet;
import org.apache.poi.hpsf.PropertySet;
import org.apache.poi.hpsf.PropertySetFactory;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.util.Internal;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public abstract class POIDocument implements Closeable {

   private SummaryInformation sInf;
   private DocumentSummaryInformation dsInf;
   protected DirectoryNode directory;
   private static final POILogger logger = POILogFactory.getLogger(POIDocument.class);
   private boolean initialized;


   protected POIDocument(DirectoryNode dir) {
      this.initialized = false;
      this.directory = dir;
   }

   protected POIDocument(OPOIFSFileSystem fs) {
      this(fs.getRoot());
   }

   protected POIDocument(NPOIFSFileSystem fs) {
      this(fs.getRoot());
   }

   protected POIDocument(POIFSFileSystem fs) {
      this(fs.getRoot());
   }

   public DocumentSummaryInformation getDocumentSummaryInformation() {
      if(!this.initialized) {
         this.readProperties();
      }

      return this.dsInf;
   }

   public SummaryInformation getSummaryInformation() {
      if(!this.initialized) {
         this.readProperties();
      }

      return this.sInf;
   }

   public void createInformationProperties() {
      if(!this.initialized) {
         this.readProperties();
      }

      if(this.sInf == null) {
         this.sInf = PropertySetFactory.newSummaryInformation();
      }

      if(this.dsInf == null) {
         this.dsInf = PropertySetFactory.newDocumentSummaryInformation();
      }

   }

   protected void readProperties() {
      PropertySet ps = this.getPropertySet("DocumentSummaryInformation");
      if(ps instanceof DocumentSummaryInformation) {
         this.dsInf = (DocumentSummaryInformation)ps;
      } else if(ps != null) {
         logger.log(5, new Object[]{"DocumentSummaryInformation property set came back with wrong class - ", ps.getClass()});
      } else {
         logger.log(5, new Object[]{"DocumentSummaryInformation property set came back as null"});
      }

      ps = this.getPropertySet("SummaryInformation");
      if(ps instanceof SummaryInformation) {
         this.sInf = (SummaryInformation)ps;
      } else if(ps != null) {
         logger.log(5, new Object[]{"SummaryInformation property set came back with wrong class - ", ps.getClass()});
      } else {
         logger.log(5, new Object[]{"SummaryInformation property set came back as null"});
      }

      this.initialized = true;
   }

   protected PropertySet getPropertySet(String setName) {
      return this.getPropertySet(setName, (EncryptionInfo)null);
   }

   protected PropertySet getPropertySet(String setName, EncryptionInfo encryptionInfo) {
      DirectoryNode dirNode = this.directory;
      NPOIFSFileSystem encPoifs = null;
      String step = "getting";

      InputStream e;
      try {
         PropertySet e1;
         try {
            if(encryptionInfo != null) {
               step = "getting encrypted";
               e = encryptionInfo.getDecryptor().getDataStream(this.directory);

               try {
                  encPoifs = new NPOIFSFileSystem(e);
                  dirNode = encPoifs.getRoot();
               } finally {
                  e.close();
               }
            }

            if(dirNode != null && dirNode.hasEntry(setName)) {
               step = "getting";
               DocumentInputStream e2 = dirNode.createDocumentInputStream(dirNode.getEntry(setName));

               try {
                  step = "creating";
                  e1 = PropertySetFactory.create(e2);
                  return e1;
               } finally {
                  e2.close();
               }
            }

            e = null;
         } catch (Exception var33) {
            logger.log(5, new Object[]{"Error " + step + " property set with name " + setName, var33});
            e1 = null;
            return e1;
         }
      } finally {
         if(encPoifs != null) {
            try {
               encPoifs.close();
            } catch (IOException var30) {
               logger.log(5, new Object[]{"Error closing encrypted property poifs", var30});
            }
         }

      }

      return e;
   }

   protected void writeProperties() throws IOException {
      this.validateInPlaceWritePossible();
      this.writeProperties(this.directory.getFileSystem(), (List)null);
   }

   protected void writeProperties(NPOIFSFileSystem outFS) throws IOException {
      this.writeProperties(outFS, (List)null);
   }

   protected void writeProperties(NPOIFSFileSystem outFS, List writtenEntries) throws IOException {
      SummaryInformation si = this.getSummaryInformation();
      if(si != null) {
         this.writePropertySet("SummaryInformation", si, outFS);
         if(writtenEntries != null) {
            writtenEntries.add("SummaryInformation");
         }
      }

      DocumentSummaryInformation dsi = this.getDocumentSummaryInformation();
      if(dsi != null) {
         this.writePropertySet("DocumentSummaryInformation", dsi, outFS);
         if(writtenEntries != null) {
            writtenEntries.add("DocumentSummaryInformation");
         }
      }

   }

   protected void writePropertySet(String name, PropertySet set, NPOIFSFileSystem outFS) throws IOException {
      try {
         MutablePropertySet wnse = new MutablePropertySet(set);
         ByteArrayOutputStream bOut = new ByteArrayOutputStream();
         wnse.write(bOut);
         byte[] data = bOut.toByteArray();
         ByteArrayInputStream bIn = new ByteArrayInputStream(data);
         outFS.createOrUpdateDocument(bIn, name);
         logger.log(3, new Object[]{"Wrote property set " + name + " of size " + data.length});
      } catch (WritingNotSupportedException var8) {
         logger.log(7, new Object[]{"Couldn\'t write property set with name " + name + " as not supported by HPSF yet"});
      }

   }

   protected void validateInPlaceWritePossible() throws IllegalStateException {
      if(this.directory == null) {
         throw new IllegalStateException("Newly created Document, cannot save in-place");
      } else if(this.directory.getParent() != null) {
         throw new IllegalStateException("This is not the root Document, cannot save embedded resource in-place");
      } else if(this.directory.getFileSystem() == null || !this.directory.getFileSystem().isInPlaceWriteable()) {
         throw new IllegalStateException("Opened read-only or via an InputStream, a Writeable File is required");
      }
   }

   public abstract void write() throws IOException;

   public abstract void write(File var1) throws IOException;

   public abstract void write(OutputStream var1) throws IOException;

   public void close() throws IOException {
      if(this.directory != null && this.directory.getNFileSystem() != null) {
         this.directory.getNFileSystem().close();
         this.directory = null;
      }

   }

   @Internal
   public DirectoryNode getDirectory() {
      return this.directory;
   }

}
