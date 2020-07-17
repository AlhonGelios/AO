package org.apache.poi.sl.draw;

import java.awt.Graphics2D;
import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.poi.sl.draw.DrawAutoShape;
import org.apache.poi.sl.draw.geom.Outline;
import org.apache.poi.sl.draw.geom.Path;
import org.apache.poi.sl.usermodel.FillStyle;
import org.apache.poi.sl.usermodel.FreeformShape;
import org.apache.poi.sl.usermodel.StrokeStyle;

public class DrawFreeformShape extends DrawAutoShape {

   public DrawFreeformShape(FreeformShape shape) {
      super(shape);
   }

   protected Collection computeOutlines(Graphics2D graphics) {
      ArrayList lst = new ArrayList();
      Double sh = this.getShape().getPath();
      FillStyle fs = this.getShape().getFillStyle();
      StrokeStyle ss = this.getShape().getStrokeStyle();
      Path path = new Path(fs != null, ss != null);
      lst.add(new Outline(sh, path));
      return lst;
   }

   protected FreeformShape getShape() {
      return (FreeformShape)this.shape;
   }
}
