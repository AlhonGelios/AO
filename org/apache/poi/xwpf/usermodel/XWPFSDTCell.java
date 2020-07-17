package org.apache.poi.xwpf.usermodel;

import org.apache.poi.xwpf.usermodel.AbstractXWPFSDT;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.ICell;
import org.apache.poi.xwpf.usermodel.ISDTContent;
import org.apache.poi.xwpf.usermodel.XWPFSDTContentCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtCell;

public class XWPFSDTCell extends AbstractXWPFSDT implements ICell {

   private final XWPFSDTContentCell cellContent;


   public XWPFSDTCell(CTSdtCell sdtCell, XWPFTableRow xwpfTableRow, IBody part) {
      super(sdtCell.getSdtPr(), part);
      this.cellContent = new XWPFSDTContentCell(sdtCell.getSdtContent(), xwpfTableRow, part);
   }

   public ISDTContent getContent() {
      return this.cellContent;
   }
}
