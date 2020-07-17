package org.apache.poi.xwpf.usermodel;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public interface IRunBody {

   XWPFDocument getDocument();

   POIXMLDocumentPart getPart();
}
