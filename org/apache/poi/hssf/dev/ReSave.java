package org.apache.poi.hssf.dev;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReSave {

   public static void main(String[] args) throws Exception {
      boolean initDrawing = false;
      boolean saveToMemory = false;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      String[] arr$ = args;
      int len$ = args.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         String filename = arr$[i$];
         if(filename.equals("-dg")) {
            initDrawing = true;
         } else if(filename.equals("-bos")) {
            saveToMemory = true;
         } else {
            System.out.print("reading " + filename + "...");
            FileInputStream is = new FileInputStream(filename);
            HSSFWorkbook wb = new HSSFWorkbook(is);

            try {
               System.out.println("done");

               for(int os = 0; os < wb.getNumberOfSheets(); ++os) {
                  HSSFSheet outputFile = wb.getSheetAt(os);
                  if(initDrawing) {
                     outputFile.getDrawingPatriarch();
                  }
               }

               Object var20;
               if(saveToMemory) {
                  bos.reset();
                  var20 = bos;
               } else {
                  String var21 = filename.replace(".xls", "-saved.xls");
                  System.out.print("saving to " + var21 + "...");
                  var20 = new FileOutputStream(var21);
               }

               try {
                  wb.write((OutputStream)var20);
               } finally {
                  ((OutputStream)var20).close();
               }

               System.out.println("done");
            } finally {
               wb.close();
               is.close();
            }
         }
      }

   }
}
