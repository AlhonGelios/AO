package org.apache.poi.xdgf.usermodel.section.geometry;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import java.awt.geom.AffineTransform;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class Ellipse implements GeometryRow {

   Ellipse _master = null;
   Double x = null;
   Double y = null;
   Double a = null;
   Double b = null;
   Double c = null;
   Double d = null;
   Boolean deleted = null;


   public Ellipse(RowType row) {
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
               throw new POIXMLException("Invalid cell \'" + cellName + "\' in Ellipse row");
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
      this._master = (Ellipse)row;
   }

   public java.awt.geom.Path2D.Double getPath() {
      if(this.getDel()) {
         return null;
      } else {
         double cx = this.getX().doubleValue();
         double cy = this.getY().doubleValue();
         double a = this.getA().doubleValue();
         double b = this.getB().doubleValue();
         double c = this.getC().doubleValue();
         double d = this.getD().doubleValue();
         double rx = Math.hypot(a - cx, b - cy);
         double ry = Math.hypot(c - cx, d - cy);
         double angle = (6.283185307179586D + (cy > b?1.0D:-1.0D) * Math.acos((cx - a) / rx)) % 6.283185307179586D;
         java.awt.geom.Ellipse2D.Double ellipse = new java.awt.geom.Ellipse2D.Double(cx - rx, cy - ry, rx * 2.0D, ry * 2.0D);
         java.awt.geom.Path2D.Double path = new java.awt.geom.Path2D.Double(ellipse);
         AffineTransform tr = new AffineTransform();
         tr.rotate(angle, cx, cy);
         path.transform(tr);
         return path;
      }
   }

   public void addToPath(java.awt.geom.Path2D.Double path, XDGFShape parent) {
      throw new POIXMLException("Ellipse elements cannot be part of a path");
   }
}
