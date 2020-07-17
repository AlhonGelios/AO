package org.apache.poi.poifs.dev;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.poifs.dev.POIFSViewable;

public class POIFSViewEngine {

   private static final String _EOL = System.getProperty("line.separator");


   public static List inspectViewable(Object viewable, boolean drilldown, int indentLevel, String indentString) {
      ArrayList objects = new ArrayList();
      if(viewable instanceof POIFSViewable) {
         POIFSViewable inspected = (POIFSViewable)viewable;
         objects.add(indent(indentLevel, indentString, inspected.getShortDescription()));
         if(drilldown) {
            if(inspected.preferArray()) {
               Object[] iter = inspected.getViewableArray();

               for(int j = 0; j < iter.length; ++j) {
                  objects.addAll(inspectViewable(iter[j], drilldown, indentLevel + 1, indentString));
               }
            } else {
               Iterator var8 = inspected.getViewableIterator();

               while(var8.hasNext()) {
                  objects.addAll(inspectViewable(var8.next(), drilldown, indentLevel + 1, indentString));
               }
            }
         }
      } else {
         objects.add(indent(indentLevel, indentString, viewable.toString()));
      }

      return objects;
   }

   private static String indent(int indentLevel, String indentString, String data) {
      StringBuffer finalBuffer = new StringBuffer();
      StringBuffer indentPrefix = new StringBuffer();

      for(int reader = 0; reader < indentLevel; ++reader) {
         indentPrefix.append(indentString);
      }

      LineNumberReader var8 = new LineNumberReader(new StringReader(data));

      try {
         for(String e = var8.readLine(); e != null; e = var8.readLine()) {
            finalBuffer.append(indentPrefix).append(e).append(_EOL);
         }
      } catch (IOException var7) {
         finalBuffer.append(indentPrefix).append(var7.getMessage()).append(_EOL);
      }

      return finalBuffer.toString();
   }

}
