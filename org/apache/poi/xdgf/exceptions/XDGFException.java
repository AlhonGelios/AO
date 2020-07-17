package org.apache.poi.xdgf.exceptions;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;

public class XDGFException {

   public static POIXMLException error(String message, Object o) {
      return new POIXMLException(o.toString() + ": " + message);
   }

   public static POIXMLException error(String message, Object o, Throwable t) {
      return new POIXMLException(o.toString() + ": " + message, t);
   }

   public static POIXMLException wrap(POIXMLDocumentPart part, POIXMLException e) {
      return new POIXMLException(part.getPackagePart().getPartName().toString() + ": " + e.getMessage(), (Throwable)(e.getCause() == null?e:e.getCause()));
   }

   public static POIXMLException wrap(String where, POIXMLException e) {
      return new POIXMLException(where + ": " + e.getMessage(), (Throwable)(e.getCause() == null?e:e.getCause()));
   }
}
