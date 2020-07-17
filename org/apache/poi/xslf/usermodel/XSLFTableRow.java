package org.apache.poi.xslf.usermodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableCell;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow;

public class XSLFTableRow implements Iterable {

   private final CTTableRow _row;
   private final List _cells;
   private final XSLFTable _table;


   XSLFTableRow(CTTableRow row, XSLFTable table) {
      this._row = row;
      this._table = table;
      CTTableCell[] tcArray = this._row.getTcArray();
      this._cells = new ArrayList(tcArray.length);
      CTTableCell[] arr$ = tcArray;
      int len$ = tcArray.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTTableCell cell = arr$[i$];
         this._cells.add(new XSLFTableCell(cell, table));
      }

   }

   public CTTableRow getXmlObject() {
      return this._row;
   }

   public Iterator iterator() {
      return this._cells.iterator();
   }

   public List getCells() {
      return Collections.unmodifiableList(this._cells);
   }

   public double getHeight() {
      return Units.toPoints(this._row.getH());
   }

   public void setHeight(double height) {
      this._row.setH((long)Units.toEMU(height));
   }

   public XSLFTableCell addCell() {
      CTTableCell c = this._row.addNewTc();
      c.set(XSLFTableCell.prototype());
      XSLFTableCell cell = new XSLFTableCell(c, this._table);
      this._cells.add(cell);
      if(this._table.getNumberOfColumns() < this._row.sizeOfTcArray()) {
         this._table.getCTTable().getTblGrid().addNewGridCol().setW((long)Units.toEMU(100.0D));
      }

      this._table.updateRowColIndexes();
      return cell;
   }

   public void mergeCells(int firstCol, int lastCol) {
      if(firstCol >= lastCol) {
         throw new IllegalArgumentException("Cannot merge, first column >= last column : " + firstCol + " >= " + lastCol);
      } else {
         int colSpan = lastCol - firstCol + 1;
         ((XSLFTableCell)this._cells.get(firstCol)).setGridSpan(colSpan);
         Iterator i$ = this._cells.subList(firstCol + 1, lastCol + 1).iterator();

         while(i$.hasNext()) {
            XSLFTableCell cell = (XSLFTableCell)i$.next();
            cell.setHMerge(true);
         }

      }
   }
}
