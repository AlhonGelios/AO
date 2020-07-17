package org.apache.poi.openxml4j.exceptions;

import org.apache.poi.UnsupportedFileFormatException;

public class NotOfficeXmlFileException extends UnsupportedFileFormatException {

   public NotOfficeXmlFileException(String message) {
      super(message);
   }
}
