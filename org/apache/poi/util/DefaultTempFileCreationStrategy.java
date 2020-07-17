package org.apache.poi.util;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import org.apache.poi.util.TempFileCreationStrategy;

public class DefaultTempFileCreationStrategy implements TempFileCreationStrategy {

   private static final String JAVA_IO_TMPDIR = "java.io.tmpdir";
   static final String POIFILES = "poifiles";
   public static final String KEEP_FILES = "poi.keep.tmp.files";
   private static final SecureRandom random = new SecureRandom();
   private File dir;


   public DefaultTempFileCreationStrategy() {
      this((File)null);
   }

   public DefaultTempFileCreationStrategy(File dir) {
      this.dir = dir;
   }

   private void createPOIFilesDirectory() throws IOException {
      if(this.dir == null) {
         String tmpDir = System.getProperty("java.io.tmpdir");
         if(tmpDir == null) {
            throw new IOException("Systems temporary directory not defined - set the -Djava.io.tmpdir jvm property!");
         }

         this.dir = new File(tmpDir, "poifiles");
      }

      this.createTempDirectory(this.dir);
   }

   private void createTempDirectory(File directory) throws IOException {
      if(!directory.exists() && !directory.mkdirs() || !directory.isDirectory()) {
         throw new IOException("Could not create temporary directory \'" + directory + "\'");
      }
   }

   public File createTempFile(String prefix, String suffix) throws IOException {
      this.createPOIFilesDirectory();
      File newFile = File.createTempFile(prefix, suffix, this.dir);
      if(System.getProperty("poi.keep.tmp.files") == null) {
         newFile.deleteOnExit();
      }

      return newFile;
   }

   public File createTempDirectory(String prefix) throws IOException {
      this.createPOIFilesDirectory();
      long n = random.nextLong();
      File newDirectory = new File(this.dir, prefix + Long.toString(n));
      this.createTempDirectory(newDirectory);
      if(System.getProperty("poi.keep.tmp.files") == null) {
         newDirectory.deleteOnExit();
      }

      return newDirectory;
   }

}
