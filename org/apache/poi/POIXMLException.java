package org.apache.poi;


public final class POIXMLException extends RuntimeException {

   public POIXMLException() {}

   public POIXMLException(String msg) {
      super(msg);
   }

   public POIXMLException(String msg, Throwable cause) {
      super(msg, cause);
   }

   public POIXMLException(Throwable cause) {
      super(cause);
   }
}
