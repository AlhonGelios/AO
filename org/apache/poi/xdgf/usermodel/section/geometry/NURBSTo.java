package org.apache.poi.xdgf.usermodel.section.geometry;

import com.graphbuilder.curve.ControlPath;
import com.graphbuilder.curve.ShapeMultiPath;
import com.graphbuilder.curve.ValueVector;
import com.graphbuilder.geom.PointFactory;
import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import java.awt.geom.Point2D;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.geom.SplineRenderer;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class NURBSTo implements GeometryRow {

   NURBSTo _master = null;
   Double x = null;
   Double y = null;
   Double a = null;
   Double b = null;
   Double c = null;
   Double d = null;
   String e = null;
   Boolean deleted = null;


   public NURBSTo(RowType row) {
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
         } else if(cellName.equals("D")) {
            this.d = XDGFCell.parseDoubleValue(cell);
         } else {
            if(!cellName.equals("E")) {
               throw new POIXMLException("Invalid cell \'" + cellName + "\' in NURBS row");
            }

            this.e = cell.getV();
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

   public String getE() {
      return this.e == null?this._master.e:this.e;
   }

   public void setupMaster(GeometryRow row) {
      this._master = (NURBSTo)row;
   }

   public void addToPath(java.awt.geom.Path2D.Double path, XDGFShape parent) {
      if(!this.getDel()) {
         Point2D last = path.getCurrentPoint();
         String formula = this.getE().trim();
         if(formula.startsWith("NURBS(") && formula.endsWith(")")) {
            String[] components = formula.substring(6, formula.length() - 1).split(",");
            if(components.length < 8) {
               throw new POIXMLException("Invalid NURBS formula (not enough arguments)");
            } else if((components.length - 4) % 4 != 0) {
               throw new POIXMLException("Invalid NURBS formula -- need 4 + n*4 arguments, got " + components.length);
            } else {
               double lastControlX = this.getX().doubleValue();
               double lastControlY = this.getY().doubleValue();
               double secondToLastKnot = this.getA().doubleValue();
               double lastWeight = this.getB().doubleValue();
               double firstKnot = this.getC().doubleValue();
               double firstWeight = this.getD().doubleValue();
               double lastKnot = Double.parseDouble(components[0].trim());
               int degree = Integer.parseInt(components[1].trim());
               int xType = Integer.parseInt(components[2].trim());
               int yType = Integer.parseInt(components[3].trim());
               double xScale = 1.0D;
               double yScale = 1.0D;
               if(xType == 0) {
                  xScale = parent.getWidth().doubleValue();
               }

               if(yType == 0) {
                  yScale = parent.getHeight().doubleValue();
               }

               ControlPath controlPath = new ControlPath();
               ValueVector knots = new ValueVector();
               ValueVector weights = new ValueVector();
               knots.add(firstKnot);
               weights.add(firstWeight);
               controlPath.addPoint(PointFactory.create(last.getX(), last.getY()));
               int sets = (components.length - 4) / 4;

               for(int shape = 0; shape < sets; ++shape) {
                  double x1 = Double.parseDouble(components[4 + shape * 4 + 0].trim());
                  double y1 = Double.parseDouble(components[4 + shape * 4 + 1].trim());
                  double k = Double.parseDouble(components[4 + shape * 4 + 2].trim());
                  double w = Double.parseDouble(components[4 + shape * 4 + 3].trim());
                  controlPath.addPoint(PointFactory.create(x1 * xScale, y1 * yScale));
                  knots.add(k);
                  weights.add(w);
               }

               knots.add(secondToLastKnot);
               knots.add(lastKnot);
               weights.add(lastWeight);
               controlPath.addPoint(PointFactory.create(lastControlX, lastControlY));
               ShapeMultiPath var40 = SplineRenderer.createNurbsSpline(controlPath, knots, weights, degree);
               path.append(var40, true);
            }
         } else {
            throw new POIXMLException("Invalid NURBS formula: " + formula);
         }
      }
   }
}
