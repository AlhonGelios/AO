package org.apache.poi.xdgf.usermodel.section.geometry;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class InfiniteLine implements GeometryRow {

   InfiniteLine _master = null;
   Double x = null;
   Double y = null;
   Double a = null;
   Double b = null;
   Boolean deleted = null;


   public InfiniteLine(RowType row) {
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
         } else {
            if(!cellName.equals("B")) {
               throw new POIXMLException("Invalid cell \'" + cellName + "\' in InfiniteLine row");
            }

            this.b = XDGFCell.parseDoubleValue(cell);
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

   public void setupMaster(GeometryRow row) {
      this._master = (InfiniteLine)row;
   }

   public void addToPath(java.awt.geom.Path2D.Double path, XDGFShape parent) {
      if(!this.getDel()) {
         throw new POIXMLException("InfiniteLine elements cannot be part of a path");
      }
   }

   public java.awt.geom.Path2D.Double getPath() {
      java.awt.geom.Path2D.Double path = new java.awt.geom.Path2D.Double();
      double max_val = 100000.0D;
      double x0 = this.getX().doubleValue();
      double y0 = this.getY().doubleValue();
      double x1 = this.getA().doubleValue();
      double y1 = this.getB().doubleValue();
      if(x0 == x1) {
         path.moveTo(x0, -max_val);
         path.lineTo(x0, max_val);
      } else if(y0 == y1) {
         path.moveTo(-max_val, y0);
         path.lineTo(max_val, y0);
      } else {
         double m = (y1 - y0) / (x1 - x0);
         double c = y0 - m * x0;
         path.moveTo(max_val, m * max_val + c);
         path.lineTo(max_val, (max_val - c) / m);
      }

      return path;
   }
}
