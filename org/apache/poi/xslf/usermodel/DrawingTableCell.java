package org.apache.poi.xslf.usermodel;

import org.apache.poi.xslf.usermodel.DrawingTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell;

public class DrawingTableCell {

   private final CTTableCell cell;
   private final DrawingTextBody drawingTextBody;


   public DrawingTableCell(CTTableCell cell) {
      this.cell = cell;
      this.drawingTextBody = new DrawingTextBody(this.cell.getTxBody());
   }

   public DrawingTextBody getTextBody() {
      return this.drawingTextBody;
   }
}
