package org.apache.poi.util;

import java.io.File;
import java.io.IOException;
import org.apache.poi.util.DefaultTempFileCreationStrategy;
import org.apache.poi.util.TempFileCreationStrategy;

public final class TempFile {

   private static TempFileCreationStrategy strategy = new TempFile.DefaultTempFileCreationStrategy();
   public static final String JAVA_IO_TMPDIR = "java.io.tmpdir";


   public static void setTempFileCreationStrategy(TempFileCreationStrategy strategy) {
      if(strategy == null) {
         throw new IllegalArgumentException("strategy == null");
      } else {
         strategy = strategy;
      }
   }

   public static File createTempFile(String prefix, String suffix) throws IOException {
      return strategy.createTempFile(prefix, suffix);
   }

   public static File createTempDirectory(String name) throws IOException {
      return strategy.createTempDirectory(name);
   }


   public static class DefaultTempFileCreationStrategy extends DefaultTempFileCreationStrategy {

   }
}
