package org.apache.poi.xssf.dev;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.internal.ZipHelper;
import org.apache.poi.util.DocumentHelper;
import org.apache.poi.util.IOUtils;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public final class XSSFDump {

   public static void main(String[] args) throws Exception {
      for(int i = 0; i < args.length; ++i) {
         System.out.println("Dumping " + args[i]);
         ZipFile zip = ZipHelper.openZipFile(args[i]);

         try {
            dump(zip);
         } finally {
            zip.close();
         }
      }

   }

   private static void createDirIfMissing(File directory) throws RuntimeException {
      if(!directory.exists()) {
         boolean dirWasCreated = directory.mkdir();
         if(!dirWasCreated) {
            throw new RuntimeException("Unable to create directory: " + directory);
         }
      }

   }

   private static void recursivelyCreateDirIfMissing(File directory) throws RuntimeException {
      if(!directory.exists()) {
         boolean dirsWereCreated = directory.mkdirs();
         if(!dirsWereCreated) {
            throw new RuntimeException("Unable to recursively create directory: " + directory);
         }
      }

   }

   public static void dump(ZipFile zip) throws Exception {
      String zipname = zip.getName();
      int sep = zipname.lastIndexOf(46);
      File root = new File(zipname.substring(0, sep));
      createDirIfMissing(root);
      System.out.println("Dumping to directory " + root);
      Enumeration en = zip.entries();

      while(en.hasMoreElements()) {
         ZipEntry entry = (ZipEntry)en.nextElement();
         String name = entry.getName();
         int idx = name.lastIndexOf(47);
         File f;
         if(idx != -1) {
            f = new File(root, name.substring(0, idx));
            recursivelyCreateDirIfMissing(f);
         }

         f = new File(root, entry.getName());
         FileOutputStream out = new FileOutputStream(f);

         try {
            if(!entry.getName().endsWith(".xml") && !entry.getName().endsWith(".vml") && !entry.getName().endsWith(".rels")) {
               IOUtils.copy(zip.getInputStream(entry), out);
            } else {
               try {
                  Document e = DocumentHelper.readDocument(zip.getInputStream(entry));
                  XmlObject xml = XmlObject.Factory.parse((Node)e, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
                  XmlOptions options = new XmlOptions();
                  options.setSavePrettyPrint();
                  xml.save(out, options);
               } catch (XmlException var16) {
                  System.err.println("Failed to parse " + entry.getName() + ", dumping raw content");
                  IOUtils.copy(zip.getInputStream(entry), out);
               }
            }
         } finally {
            out.close();
         }
      }

   }
}
