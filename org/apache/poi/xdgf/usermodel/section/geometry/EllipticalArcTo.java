package org.apache.poi.xdgf.usermodel.section.geometry;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class EllipticalArcTo implements GeometryRow {

   EllipticalArcTo _master = null;
   Double x = null;
   Double y = null;
   Double a = null;
   Double b = null;
   Double c = null;
   Double d = null;
   Boolean deleted = null;
   public static int draw = 0;


   public EllipticalArcTo(RowType row) {
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
               throw new POIXMLException("Invalid cell \'" + cellName + "\' in EllipticalArcTo row");
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
      this._master = (EllipticalArcTo)row;
   }

   public void addToPath(java.awt.geom.Path2D.Double path, XDGFShape parent) {
      if(!this.getDel()) {
         double x = this.getX().doubleValue();
         double y = this.getY().doubleValue();
         double a = this.getA().doubleValue();
         double b = this.getB().doubleValue();
         double c = this.getC().doubleValue();
         double d = this.getD().doubleValue();
         createEllipticalArc(x, y, a, b, c, d, path);
      }
   }

   public static void createEllipticalArc(double x, double y, double a, double b, double c, double d, java.awt.geom.Path2D.Double path) {
      Point2D last = path.getCurrentPoint();
      double x0 = last.getX();
      double y0 = last.getY();
      AffineTransform at = AffineTransform.getRotateInstance(-c);
      double[] pts = new double[]{x0, y0, x, y, a, b};
      at.transform(pts, 0, pts, 0, 3);
      x0 = pts[0];
      y0 = pts[1];
      x = pts[2];
      y = pts[3];
      a = pts[4];
      b = pts[5];
      double d2 = d * d;
      double cx = ((x0 - x) * (x0 + x) * (y - b) - (x - a) * (x + a) * (y0 - y) + d2 * (y0 - y) * (y - b) * (y0 - b)) / (2.0D * ((x0 - x) * (y - b) - (x - a) * (y0 - y)));
      double cy = ((x0 - x) * (x - a) * (x0 - a) / d2 + (x - a) * (y0 - y) * (y0 + y) - (x0 - x) * (y - b) * (y + b)) / (2.0D * ((x - a) * (y0 - y) - (x0 - x) * (y - b)));
      double rx = Math.sqrt(Math.pow(x0 - cx, 2.0D) + Math.pow(y0 - cy, 2.0D) * d2);
      double ry = rx / d;
      double ctrlAngle = Math.toDegrees(Math.atan2((b - cy) / ry, (a - cx) / rx));
      double startAngle = Math.toDegrees(Math.atan2((y0 - cy) / ry, (x0 - cx) / rx));
      double endAngle = Math.toDegrees(Math.atan2((y - cy) / ry, (x - cx) / rx));
      double sweep = computeSweep(startAngle, endAngle, ctrlAngle);
      java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double(cx - rx, cy - ry, rx * 2.0D, ry * 2.0D, -startAngle, sweep, 0);
      at.setToRotation(c);
      path.append(at.createTransformedShape(arc), false);
   }

   protected static double computeSweep(double startAngle, double endAngle, double ctrlAngle) {
      startAngle = (360.0D + startAngle) % 360.0D;
      endAngle = (360.0D + endAngle) % 360.0D;
      ctrlAngle = (360.0D + ctrlAngle) % 360.0D;
      double sweep;
      if(startAngle < endAngle) {
         if(startAngle < ctrlAngle && ctrlAngle < endAngle) {
            sweep = startAngle - endAngle;
         } else {
            sweep = 360.0D + (startAngle - endAngle);
         }
      } else if(endAngle < ctrlAngle && ctrlAngle < startAngle) {
         sweep = startAngle - endAngle;
      } else {
         sweep = -(360.0D - (startAngle - endAngle));
      }

      return sweep;
   }

}
