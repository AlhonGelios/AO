package org.apache.poi.extractor;

import java.io.File;
import org.apache.poi.POITextExtractor;
import org.apache.poi.extractor.ExtractorFactory;

public class CommandLineTextExtractor {

   public static final String DIVIDER = "=======================";


   public static void main(String[] args) throws Exception {
      if(args.length < 1) {
         System.err.println("Use:");
         System.err.println("   CommandLineTextExtractor <filename> [filename] [filename]");
         System.exit(1);
      }

      for(int i = 0; i < args.length; ++i) {
         System.out.println("=======================");
         File f = new File(args[i]);
         System.out.println(f);
         POITextExtractor extractor = ExtractorFactory.createExtractor(f);

         try {
            POITextExtractor metadataExtractor = extractor.getMetadataTextExtractor();
            System.out.println("   =======================");
            System.out.println(metadataExtractor.getText());
            System.out.println("   =======================");
            System.out.println(extractor.getText());
            System.out.println("=======================");
         } finally {
            extractor.close();
         }
      }

   }
}
