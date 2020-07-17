package org.apache.poi.xwpf.usermodel;

import javax.xml.namespace.QName;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.ISDTContent;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlCursor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentCell;

public class XWPFSDTContentCell implements ISDTContent {

   private String text = "";


   public XWPFSDTContentCell(CTSdtContentCell sdtContentCell, XWPFTableRow xwpfTableRow, IBody part) {
      StringBuilder sb = new StringBuilder();
      XmlCursor cursor = sdtContentCell.newCursor();
      int tcCnt = 0;
      int iBodyCnt = 0;
      int depth = 1;

      while(cursor.hasNextToken() && depth > 0) {
         XmlCursor.TokenType t = cursor.toNextToken();
         if(t.isText()) {
            sb.append(cursor.getTextValue());
         } else if(this.isStartToken(cursor, "tr")) {
            tcCnt = 0;
            iBodyCnt = 0;
         } else if(this.isStartToken(cursor, "tc")) {
            if(tcCnt++ > 0) {
               sb.append("\t");
            }

            iBodyCnt = 0;
         } else if(this.isStartToken(cursor, "p") || this.isStartToken(cursor, "tbl") || this.isStartToken(cursor, "sdt")) {
            if(iBodyCnt > 0) {
               sb.append("\n");
            }

            ++iBodyCnt;
         }

         if(cursor.isStart()) {
            ++depth;
         } else if(cursor.isEnd()) {
            --depth;
         }
      }

      this.text = sb.toString();
      cursor.dispose();
   }

   private boolean isStartToken(XmlCursor cursor, String string) {
      if(!cursor.isStart()) {
         return false;
      } else {
         QName qName = cursor.getName();
         return qName != null && qName.getLocalPart() != null && qName.getLocalPart().equals(string);
      }
   }

   public String getText() {
      return this.text;
   }

   public String toString() {
      return this.getText();
   }
}
