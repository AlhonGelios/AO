package org.apache.poi.xdgf.geom;

import com.graphbuilder.curve.ControlPath;
import com.graphbuilder.curve.ShapeMultiPath;
import com.graphbuilder.curve.ValueVector;
import com.graphbuilder.geom.PointFactory;
import java.awt.geom.Point2D;
import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.xdgf.geom.SplineRenderer;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.SplineKnot;
import org.apache.poi.xdgf.usermodel.section.geometry.SplineStart;

public class SplineCollector {

   SplineStart _start;
   ArrayList _knots = new ArrayList();


   public SplineCollector(SplineStart start) {
      this._start = start;
   }

   public void addKnot(SplineKnot knot) {
      if(!knot.getDel()) {
         this._knots.add(knot);
      }

   }

   public void addToPath(Double path, XDGFShape parent) {
      Point2D last = path.getCurrentPoint();
      ControlPath controlPath = new ControlPath();
      ValueVector knots = new ValueVector(this._knots.size() + 3);
      double firstKnot = this._start.getB().doubleValue();
      double lastKnot = this._start.getC().doubleValue();
      int degree = this._start.getD().intValue();
      knots.add(firstKnot);
      knots.add(this._start.getA().doubleValue());
      controlPath.addPoint(PointFactory.create(last.getX(), last.getY()));
      controlPath.addPoint(PointFactory.create(this._start.getX().doubleValue(), this._start.getY().doubleValue()));
      Iterator shape = this._knots.iterator();

      while(shape.hasNext()) {
         SplineKnot knot = (SplineKnot)shape.next();
         knots.add(knot.getA().doubleValue());
         controlPath.addPoint(PointFactory.create(knot.getX().doubleValue(), knot.getY().doubleValue()));
      }

      knots.add(lastKnot);
      ShapeMultiPath shape1 = SplineRenderer.createNurbsSpline(controlPath, knots, (ValueVector)null, degree);
      path.append(shape1, true);
   }
}
