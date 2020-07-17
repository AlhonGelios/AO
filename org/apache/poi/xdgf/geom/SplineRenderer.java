package org.apache.poi.xdgf.geom;

import com.graphbuilder.curve.ControlPath;
import com.graphbuilder.curve.GroupIterator;
import com.graphbuilder.curve.NURBSpline;
import com.graphbuilder.curve.ShapeMultiPath;
import com.graphbuilder.curve.ValueVector;

public class SplineRenderer {

   public static ShapeMultiPath createNurbsSpline(ControlPath controlPoints, ValueVector knots, ValueVector weights, int degree) {
      double firstKnot = knots.get(0);
      int count = knots.size();
      double lastKnot = knots.get(count - 1);

      int knotsToAdd;
      for(knotsToAdd = 0; knotsToAdd < count; ++knotsToAdd) {
         knots.set((knots.get(knotsToAdd) - firstKnot) / lastKnot, knotsToAdd);
      }

      knotsToAdd = controlPoints.numPoints() + degree + 1;

      for(int gi = count; gi < knotsToAdd; ++gi) {
         knots.add(1.0D);
      }

      GroupIterator var13 = new GroupIterator("0:n-1", controlPoints.numPoints());
      NURBSpline spline = new NURBSpline(controlPoints, var13);
      spline.setDegree(degree);
      spline.setKnotVectorType(2);
      spline.setKnotVector(knots);
      if(weights == null) {
         spline.setUseWeightVector(false);
      } else {
         spline.setWeightVector(weights);
      }

      ShapeMultiPath shape = new ShapeMultiPath();
      shape.setFlatness(0.01D);
      spline.appendTo(shape);
      return shape;
   }
}
