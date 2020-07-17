package org.apache.poi.xwpf.usermodel;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.IBody;

public interface IBodyElement {

   IBody getBody();

   POIXMLDocumentPart getPart();

   BodyType getPartType();

   BodyElementType getElementType();
}
