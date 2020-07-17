package org.apache.poi.xdgf.usermodel.section.geometry;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class ArcTo implements GeometryRow {

   ArcTo _master = null;
   Double x = null;
   Double y = null;
   Double a = null;
   Boolean deleted = null;


   public ArcTo(RowType row) {
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
         } else {
            if(!cellName.equals("A")) {
               throw new POIXMLException("Invalid cell \'" + cellName + "\' in ArcTo row");
            }

            this.a = XDGFCell.parseDoubleValue(cell);
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

   public void setupMaster(GeometryRow row) {
      this._master = (ArcTo)row;
   }

   public void addToPath(java.awt.geom.Path2D.Double path, XDGFShape parent) {
      if(!this.getDel()) {
         Point2D last = path.getCurrentPoint();
         double x = this.getX().doubleValue();
         double y = this.getY().doubleValue();
         double a = this.getA().doubleValue();
         if(a == 0.0D) {
            path.lineTo(x, y);
         } else {
            double x0 = last.getX();
            double y0 = last.getY();
            double chordLength = Math.hypot(y - y0, x - x0);
            double radius = (4.0D * a * a + chordLength * chordLength) / (8.0D * Math.abs(a));
            double cx = x0 + (x - x0) / 2.0D;
            double cy = y0 + (y - y0) / 2.0D;
            double rotate = Math.atan2(y - cy, x - cx);
            java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double(x0, y0 - radius, chordLength, 2.0D * radius, 180.0D, x0 < x?180.0D:-180.0D, 0);
            path.append(AffineTransform.getRotateInstance(rotate, x0, y0).createTransformedShape(arc), true);
         }
      }
   }
}
