package org.apache.poi.poifs.dev;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.poifs.dev.POIFSViewEngine;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;

public class POIFSViewer {

   public static void main(String[] args) {
      if(args.length == 0) {
         System.err.println("Must specify at least one file to view");
         System.exit(1);
      }

      boolean printNames = args.length > 1;

      for(int j = 0; j < args.length; ++j) {
         viewFile(args[j], printNames);
      }

   }

   private static void viewFile(String filename, boolean printName) {
      if(printName) {
         StringBuffer e = new StringBuffer();
         e.append(".");

         for(int strings = 0; strings < filename.length(); ++strings) {
            e.append("-");
         }

         e.append(".");
         System.out.println(e);
         System.out.println("|" + filename + "|");
         System.out.println(e);
      }

      try {
         NPOIFSFileSystem var7 = new NPOIFSFileSystem(new File(filename));
         List var8 = POIFSViewEngine.inspectViewable(var7, true, 0, "  ");
         Iterator i$ = var8.iterator();

         while(i$.hasNext()) {
            String s = (String)i$.next();
            System.out.print(s);
         }

         var7.close();
      } catch (IOException var6) {
         System.out.println(var6.getMessage());
      }

   }
}
