package org.apache.poi.poifs.macros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.poi.poifs.macros.VBAMacroReader;
import org.apache.poi.util.StringUtil;

public class VBAMacroExtractor {

   public static void main(String[] args) throws IOException {
      if(args.length == 0) {
         System.err.println("Use:");
         System.err.println("   VBAMacroExtractor <office.doc> [output]");
         System.err.println("");
         System.err.println("If an output directory is given, macros are written there");
         System.err.println("Otherwise they are output to the screen");
         System.exit(1);
      }

      File input = new File(args[0]);
      File output = null;
      if(args.length > 1) {
         output = new File(args[1]);
      }

      VBAMacroExtractor extractor = new VBAMacroExtractor();
      extractor.extract(input, output);
   }

   public void extract(File input, File outputDir, String extension) throws IOException {
      if(!input.exists()) {
         throw new FileNotFoundException(input.toString());
      } else {
         System.err.print("Extracting VBA Macros from " + input + " to ");
         if(outputDir != null) {
            if(!outputDir.exists() && !outputDir.mkdirs()) {
               throw new IOException("Output directory " + outputDir + " could not be created");
            }

            System.err.println(outputDir);
         } else {
            System.err.println("STDOUT");
         }

         VBAMacroReader reader = new VBAMacroReader(input);
         Map macros = reader.readMacros();
         reader.close();
         String divider = "---------------------------------------";
         Iterator i$ = macros.entrySet().iterator();

         while(i$.hasNext()) {
            Entry entry = (Entry)i$.next();
            String moduleName = (String)entry.getKey();
            String moduleCode = (String)entry.getValue();
            if(outputDir == null) {
               System.out.println("---------------------------------------");
               System.out.println(moduleName);
               System.out.println("");
               System.out.println(moduleCode);
            } else {
               File out = new File(outputDir, moduleName + extension);
               FileOutputStream fout = new FileOutputStream(out);
               OutputStreamWriter fwriter = new OutputStreamWriter(fout, StringUtil.UTF8);
               fwriter.write(moduleCode);
               fwriter.close();
               fout.close();
               System.out.println("Extracted " + out);
            }
         }

         if(outputDir == null) {
            System.out.println("---------------------------------------");
         }

      }
   }

   public void extract(File input, File outputDir) throws IOException {
      this.extract(input, outputDir, ".vba");
   }
}
