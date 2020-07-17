package org.apache.poi.xslf.usermodel;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawTextShape;
import org.apache.poi.sl.usermodel.TableShape;
import org.apache.poi.sl.usermodel.TextShape;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.XSLFGraphicFrame;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTableCell;
import org.apache.poi.xslf.usermodel.XSLFTableRow;
import org.apache.poi.xslf.usermodel.XSLFTableStyle;
import org.apache.poi.xslf.usermodel.XSLFTableStyles;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlAnyTypeImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual;

public class XSLFTable extends XSLFGraphicFrame implements Iterable, TableShape {

   static final String TABLE_URI = "http://schemas.openxmlformats.org/drawingml/2006/table";
   private CTTable _table;
   private List _rows;


   XSLFTable(CTGraphicalObjectFrame shape, XSLFSheet sheet) {
      super(shape, sheet);
      XmlObject[] rs = shape.getGraphic().getGraphicData().selectPath("declare namespace a=\'http://schemas.openxmlformats.org/drawingml/2006/main\' ./a:tbl");
      if(rs.length == 0) {
         throw new IllegalStateException("a:tbl element was not found in\n " + shape.getGraphic().getGraphicData());
      } else {
         if(rs[0] instanceof XmlAnyTypeImpl) {
            try {
               rs[0] = CTTable.Factory.parse(rs[0].toString(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
            } catch (XmlException var10) {
               throw new POIXMLException(var10);
            }
         }

         this._table = (CTTable)rs[0];
         CTTableRow[] trArray = this._table.getTrArray();
         this._rows = new ArrayList(trArray.length);
         CTTableRow[] arr$ = trArray;
         int len$ = trArray.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTTableRow row = arr$[i$];
            XSLFTableRow xr = new XSLFTableRow(row, this);
            this._rows.add(xr);
         }

         this.updateRowColIndexes();
      }
   }

   public XSLFTableCell getCell(int row, int col) {
      List rows = this.getRows();
      if(row >= 0 && rows.size() > row) {
         XSLFTableRow r = (XSLFTableRow)rows.get(row);
         if(r == null) {
            return null;
         } else {
            List cells = r.getCells();
            return col >= 0 && cells.size() > col?(XSLFTableCell)cells.get(col):null;
         }
      } else {
         return null;
      }
   }

   @Internal
   public CTTable getCTTable() {
      return this._table;
   }

   public int getNumberOfColumns() {
      return this._table.getTblGrid().sizeOfGridColArray();
   }

   public int getNumberOfRows() {
      return this._table.sizeOfTrArray();
   }

   public double getColumnWidth(int idx) {
      return Units.toPoints(this._table.getTblGrid().getGridColArray(idx).getW());
   }

   public void setColumnWidth(int idx, double width) {
      this._table.getTblGrid().getGridColArray(idx).setW((long)Units.toEMU(width));
   }

   public double getRowHeight(int row) {
      return Units.toPoints(this._table.getTrArray(row).getH());
   }

   public void setRowHeight(int row, double height) {
      this._table.getTrArray(row).setH((long)Units.toEMU(height));
   }

   public Iterator iterator() {
      return this._rows.iterator();
   }

   public List getRows() {
      return Collections.unmodifiableList(this._rows);
   }

   public XSLFTableRow addRow() {
      CTTableRow tr = this._table.addNewTr();
      XSLFTableRow row = new XSLFTableRow(tr, this);
      row.setHeight(20.0D);
      this._rows.add(row);
      this.updateRowColIndexes();
      return row;
   }

   static CTGraphicalObjectFrame prototype(int shapeId) {
      CTGraphicalObjectFrame frame = CTGraphicalObjectFrame.Factory.newInstance();
      CTGraphicalObjectFrameNonVisual nvGr = frame.addNewNvGraphicFramePr();
      CTNonVisualDrawingProps cnv = nvGr.addNewCNvPr();
      cnv.setName("Table " + shapeId);
      cnv.setId((long)(shapeId + 1));
      nvGr.addNewCNvGraphicFramePr().addNewGraphicFrameLocks().setNoGrp(true);
      nvGr.addNewNvPr();
      frame.addNewXfrm();
      CTGraphicalObjectData gr = frame.addNewGraphic().addNewGraphicData();
      XmlCursor cursor = gr.newCursor();
      cursor.toNextToken();
      cursor.beginElement(new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tbl"));
      cursor.beginElement(new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblPr"));
      cursor.toNextToken();
      cursor.beginElement(new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblGrid"));
      cursor.dispose();
      gr.setUri("http://schemas.openxmlformats.org/drawingml/2006/table");
      return frame;
   }

   public void mergeCells(int firstRow, int lastRow, int firstCol, int lastCol) {
      if(firstRow > lastRow) {
         throw new IllegalArgumentException("Cannot merge, first row > last row : " + firstRow + " > " + lastRow);
      } else if(firstCol > lastCol) {
         throw new IllegalArgumentException("Cannot merge, first column > last column : " + firstCol + " > " + lastCol);
      } else {
         int rowSpan = lastRow - firstRow + 1;
         boolean mergeRowRequired = rowSpan > 1;
         int colSpan = lastCol - firstCol + 1;
         boolean mergeColumnRequired = colSpan > 1;

         for(int i = firstRow; i <= lastRow; ++i) {
            XSLFTableRow row = (XSLFTableRow)this._rows.get(i);

            for(int colPos = firstCol; colPos <= lastCol; ++colPos) {
               XSLFTableCell cell = (XSLFTableCell)row.getCells().get(colPos);
               if(mergeRowRequired) {
                  if(i == firstRow) {
                     cell.setRowSpan(rowSpan);
                  } else {
                     cell.setVMerge(true);
                  }
               }

               if(mergeColumnRequired) {
                  if(colPos == firstCol) {
                     cell.setGridSpan(colSpan);
                  } else {
                     cell.setHMerge(true);
                  }
               }
            }
         }

      }
   }

   protected XSLFTableStyle getTableStyle() {
      CTTable tab = this.getCTTable();
      if(tab.isSetTblPr() && tab.getTblPr().isSetTableStyleId()) {
         String styleId = tab.getTblPr().getTableStyleId();
         XSLFTableStyles styles = this.getSheet().getSlideShow().getTableStyles();
         Iterator i$ = styles.getStyles().iterator();

         XSLFTableStyle style;
         do {
            if(!i$.hasNext()) {
               return null;
            }

            style = (XSLFTableStyle)i$.next();
         } while(!style.getStyleId().equals(styleId));

         return style;
      } else {
         return null;
      }
   }

   void updateRowColIndexes() {
      int rowIdx = 0;

      for(Iterator i$ = this.iterator(); i$.hasNext(); ++rowIdx) {
         XSLFTableRow xr = (XSLFTableRow)i$.next();
         int colIdx = 0;

         for(Iterator i$1 = xr.iterator(); i$1.hasNext(); ++colIdx) {
            XSLFTableCell tc = (XSLFTableCell)i$1.next();
            tc.setRowColIndex(rowIdx, colIdx);
         }
      }

   }

   void updateCellAnchor() {
      int rows = this.getNumberOfRows();
      int cols = this.getNumberOfColumns();
      double[] colWidths = new double[cols];
      double[] rowHeights = new double[rows];

      int tblAnc;
      for(tblAnc = 0; tblAnc < rows; ++tblAnc) {
         rowHeights[tblAnc] = this.getRowHeight(tblAnc);
      }

      for(tblAnc = 0; tblAnc < cols; ++tblAnc) {
         colWidths[tblAnc] = this.getColumnWidth(tblAnc);
      }

      Rectangle2D var15 = this.getAnchor();
      DrawFactory df = DrawFactory.getInstance((Graphics2D)null);
      double newY = var15.getY();

      int row;
      double col;
      int mergedBounds;
      for(row = 0; row < rows; ++row) {
         col = 0.0D;

         for(mergedBounds = 0; mergedBounds < cols; ++mergedBounds) {
            XSLFTableCell row2 = this.getCell(row, mergedBounds);
            if(row2.getGridSpan() == 1 && row2.getRowSpan() == 1) {
               row2.setAnchor(new Double(0.0D, 0.0D, colWidths[mergedBounds], 0.0D));
               DrawTextShape tc2 = df.getDrawable((TextShape)row2);
               col = Math.max(col, tc2.getTextHeight());
            }
         }

         rowHeights[row] = Math.max(rowHeights[row], col);
      }

      XSLFTableCell var20;
      for(row = 0; row < rows; ++row) {
         col = var15.getX();

         for(mergedBounds = 0; mergedBounds < cols; ++mergedBounds) {
            Double var17 = new Double(col, newY, colWidths[mergedBounds], rowHeights[row]);
            var20 = this.getCell(row, mergedBounds);
            var20.setAnchor(var17);
            col += colWidths[mergedBounds] + 2.0D;
         }

         newY += rowHeights[row] + 2.0D;
      }

      for(row = 0; row < rows; ++row) {
         for(int var16 = 0; var16 < cols; ++var16) {
            XSLFTableCell tc = this.getCell(row, var16);
            Rectangle2D var18 = tc.getAnchor();

            int var19;
            for(var19 = var16 + 1; var19 < var16 + tc.getGridSpan(); ++var19) {
               assert var19 < cols;

               var20 = this.getCell(row, var19);

               assert var20.getGridSpan() == 1 && var20.getRowSpan() == 1;

               var18.add(var20.getAnchor());
            }

            for(var19 = row + 1; var19 < row + tc.getRowSpan(); ++var19) {
               assert var19 < rows;

               var20 = this.getCell(var19, var16);

               assert var20.getGridSpan() == 1 && var20.getRowSpan() == 1;

               var18.add(var20.getAnchor());
            }

            tc.setAnchor(var18);
         }
      }

   }

}
