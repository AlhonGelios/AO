package org.apache.poi.openxml4j.opc;

import java.util.ArrayList;
import java.util.TreeMap;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;

public final class PackagePartCollection extends TreeMap {

   private static final long serialVersionUID = 2515031135957635515L;
   private ArrayList registerPartNameStr = new ArrayList();


   public Object clone() {
      return super.clone();
   }

   public PackagePart put(PackagePartName partName, PackagePart part) {
      String[] segments = partName.getURI().toASCIIString().split(PackagingURIHelper.FORWARD_SLASH_STRING);
      StringBuffer concatSeg = new StringBuffer();
      String[] arr$ = segments;
      int len$ = segments.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         String seg = arr$[i$];
         if(!seg.equals("")) {
            concatSeg.append(PackagingURIHelper.FORWARD_SLASH_CHAR);
         }

         concatSeg.append(seg);
         if(this.registerPartNameStr.contains(concatSeg.toString())) {
            throw new InvalidOperationException("You can\'t add a part with a part name derived from another part ! [M1.11]");
         }
      }

      this.registerPartNameStr.add(partName.getName());
      return (PackagePart)super.put(partName, part);
   }

   public PackagePart remove(Object key) {
      if(key instanceof PackagePartName) {
         this.registerPartNameStr.remove(((PackagePartName)key).getName());
      }

      return (PackagePart)super.remove(key);
   }
}
