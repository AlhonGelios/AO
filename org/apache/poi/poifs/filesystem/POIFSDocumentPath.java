package org.apache.poi.poifs.filesystem;

import java.io.File;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class POIFSDocumentPath {

   private static final POILogger log = POILogFactory.getLogger(POIFSDocumentPath.class);
   private final String[] components;
   private int hashcode = 0;


   public POIFSDocumentPath(String[] components) throws IllegalArgumentException {
      if(components == null) {
         this.components = new String[0];
      } else {
         this.components = new String[components.length];

         for(int j = 0; j < components.length; ++j) {
            if(components[j] == null || components[j].length() == 0) {
               throw new IllegalArgumentException("components cannot contain null or empty strings");
            }

            this.components[j] = components[j];
         }
      }

   }

   public POIFSDocumentPath() {
      this.components = new String[0];
   }

   public POIFSDocumentPath(POIFSDocumentPath path, String[] components) throws IllegalArgumentException {
      if(components == null) {
         this.components = new String[path.components.length];
      } else {
         this.components = new String[path.components.length + components.length];
      }

      int j;
      for(j = 0; j < path.components.length; ++j) {
         this.components[j] = path.components[j];
      }

      if(components != null) {
         for(j = 0; j < components.length; ++j) {
            if(components[j] == null) {
               throw new IllegalArgumentException("components cannot contain null");
            }

            if(components[j].length() == 0) {
               log.log(5, new Object[]{"Directory under " + path + " has an empty name, " + "not all OLE2 readers will handle this file correctly!"});
            }

            this.components[j + path.components.length] = components[j];
         }
      }

   }

   public boolean equals(Object o) {
      boolean rval = false;
      if(o != null && o.getClass() == this.getClass()) {
         if(this == o) {
            rval = true;
         } else {
            POIFSDocumentPath path = (POIFSDocumentPath)o;
            if(path.components.length == this.components.length) {
               rval = true;

               for(int j = 0; j < this.components.length; ++j) {
                  if(!path.components[j].equals(this.components[j])) {
                     rval = false;
                     break;
                  }
               }
            }
         }
      }

      return rval;
   }

   public int hashCode() {
      if(this.hashcode == 0) {
         this.hashcode = this.computeHashCode();
      }

      return this.hashcode;
   }

   private int computeHashCode() {
      int code = 0;

      for(int j = 0; j < this.components.length; ++j) {
         code += this.components[j].hashCode();
      }

      return code;
   }

   public int length() {
      return this.components.length;
   }

   public String getComponent(int n) throws ArrayIndexOutOfBoundsException {
      return this.components[n];
   }

   public POIFSDocumentPath getParent() {
      int length = this.components.length - 1;
      if(length < 0) {
         return null;
      } else {
         String[] parentComponents = new String[length];
         System.arraycopy(this.components, 0, parentComponents, 0, length);
         POIFSDocumentPath parent = new POIFSDocumentPath(parentComponents);
         return parent;
      }
   }

   public String getName() {
      return this.components.length == 0?"":this.components[this.components.length - 1];
   }

   public String toString() {
      StringBuffer b = new StringBuffer();
      int l = this.length();
      b.append(File.separatorChar);

      for(int i = 0; i < l; ++i) {
         b.append(this.getComponent(i));
         if(i < l - 1) {
            b.append(File.separatorChar);
         }
      }

      return b.toString();
   }

}
