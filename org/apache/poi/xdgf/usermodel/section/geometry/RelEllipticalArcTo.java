package org.apache.poi.xdgf.usermodel.section.geometry;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.EllipticalArcTo;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class RelEllipticalArcTo implements GeometryRow {

   RelEllipticalArcTo _master = null;
   Double x = null;
   Double y = null;
   Double a = null;
   Double b = null;
   Double c = null;
   Double d = null;
   Boolean deleted = null;


   public RelEllipticalArcTo(RowType row) {
      if(row.isSetDel()) {
         this.deleted = Boolean.valueOf(row.getDel());
      }

      CellType[] arr$ = row.getCellArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CellType cell = arr$[i$];
         String cellName = cell.getN();
         if(cellName.equals("X")) {
            this.x = XDGFCell.parseDoubleValue(cell);
         } else if(cellName.equals("Y")) {
            this.y = XDGFCell.parseDoubleValue(cell);
         } else if(cellName.equals("A")) {
            this.a = XDGFCell.parseDoubleValue(cell);
         } else if(cellName.equals("B")) {
            this.b = XDGFCell.parseDoubleValue(cell);
         } else if(cellName.equals("C")) {
            this.c = XDGFCell.parseDoubleValue(cell);
         } else {
            if(!cellName.equals("D")) {
               throw new POIXMLException("Invalid cell \'" + cellName + "\' in RelEllipticalArcTo row");
            }

            this.d = XDGFCell.parseDoubleValue(cell);
         }
      }

   }

   public boolean getDel() {
      return this.deleted != null?this.deleted.booleanValue():(this._master != null?this._master.getDel():false);
   }

   public Double getX() {
      return this.x == null?this._master.x:this.x;
   }

   public Double getY() {
      return this.y == null?this._master.y:this.y;
   }

   public Double getA() {
      return this.a == null?this._master.a:this.a;
   }

   public Double getB() {
      return this.b == null?this._master.b:this.b;
   }

   public Double getC() {
      return this.c == null?this._master.c:this.c;
   }

   public Double getD() {
      return this.d == null?this._master.d:this.d;
   }

   public void setupMaster(GeometryRow row) {
      this._master = (RelEllipticalArcTo)row;
   }

   public void addToPath(java.awt.geom.Path2D.Double path, XDGFShape parent) {
      if(!this.getDel()) {
         double w = parent.getWidth().doubleValue();
         double h = parent.getHeight().doubleValue();
         double x = this.getX().doubleValue() * w;
         double y = this.getY().doubleValue() * h;
         double a = this.getA().doubleValue() * w;
         double b = this.getB().doubleValue() * h;
         double c = this.getC().doubleValue();
         double d = this.getD().doubleValue();
         EllipticalArcTo.createEllipticalArc(x, y, a, b, c, d, path);
      }
   }
}
