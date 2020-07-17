package org.apache.poi.xwpf.usermodel;

import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.xmlbeans.XmlCursor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;

public interface IBody {

   POIXMLDocumentPart getPart();

   BodyType getPartType();

   List getBodyElements();

   List getParagraphs();

   List getTables();

   XWPFParagraph getParagraph(CTP var1);

   XWPFTable getTable(CTTbl var1);

   XWPFParagraph getParagraphArray(int var1);

   XWPFTable getTableArray(int var1);

   XWPFParagraph insertNewParagraph(XmlCursor var1);

   XWPFTable insertNewTbl(XmlCursor var1);

   void insertTable(int var1, XWPFTable var2);

   XWPFTableCell getTableCell(CTTc var1);

   XWPFDocument getXWPFDocument();
}
