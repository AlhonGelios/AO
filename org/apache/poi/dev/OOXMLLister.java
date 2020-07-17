package org.apache.poi.dev;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;

public class OOXMLLister {

   private final OPCPackage container;
   private final PrintStream disp;


   public OOXMLLister(OPCPackage container) {
      this(container, System.out);
   }

   public OOXMLLister(OPCPackage container, PrintStream disp) {
      this.container = container;
      this.disp = disp;
   }

   public static long getSize(PackagePart part) throws IOException {
      InputStream in = part.getInputStream();

      long var6;
      try {
         byte[] b = new byte[8192];
         long size = 0L;
         int read = 0;

         while(read > -1) {
            read = in.read(b);
            if(read > 0) {
               size += (long)read;
            }
         }

         var6 = size;
      } finally {
         in.close();
      }

      return var6;
   }

   public void displayParts() throws InvalidFormatException, IOException {
      ArrayList parts = this.container.getParts();
      Iterator i$ = parts.iterator();

      while(i$.hasNext()) {
         PackagePart part = (PackagePart)i$.next();
         this.disp.println(part.getPartName());
         this.disp.println("\t" + part.getContentType());
         if(!part.getPartName().toString().equals("/docProps/core.xml")) {
            this.disp.println("\t" + getSize(part) + " bytes");
         }

         if(!part.isRelationshipPart()) {
            this.disp.println("\t" + part.getRelationships().size() + " relations");
            Iterator i$1 = part.getRelationships().iterator();

            while(i$1.hasNext()) {
               PackageRelationship rel = (PackageRelationship)i$1.next();
               this.displayRelation(rel, "\t  ");
            }
         }
      }

   }

   public void displayRelations() {
      PackageRelationshipCollection rels = this.container.getRelationships();
      Iterator i$ = rels.iterator();

      while(i$.hasNext()) {
         PackageRelationship rel = (PackageRelationship)i$.next();
         this.displayRelation(rel, "");
      }

   }

   private void displayRelation(PackageRelationship rel, String indent) {
      this.disp.println(indent + "Relationship:");
      this.disp.println(indent + "\tFrom: " + rel.getSourceURI());
      this.disp.println(indent + "\tTo:   " + rel.getTargetURI());
      this.disp.println(indent + "\tID:   " + rel.getId());
      this.disp.println(indent + "\tMode: " + rel.getTargetMode());
      this.disp.println(indent + "\tType: " + rel.getRelationshipType());
   }

   public static void main(String[] args) throws Exception {
      if(args.length == 0) {
         System.err.println("Use:");
         System.err.println("\tjava OOXMLLister <filename>");
         System.exit(1);
      }

      File f = new File(args[0]);
      if(!f.exists()) {
         System.err.println("Error, file not found!");
         System.err.println("\t" + f.toString());
         System.exit(2);
      }

      OOXMLLister lister = new OOXMLLister(OPCPackage.open(f.toString(), PackageAccess.READ));
      lister.disp.println(f.toString() + "\n");
      lister.displayParts();
      lister.disp.println();
      lister.displayRelations();
   }
}
