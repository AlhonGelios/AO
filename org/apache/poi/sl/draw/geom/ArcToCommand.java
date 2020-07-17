package org.apache.poi.sl.draw.geom;

import java.awt.geom.Point2D;
import java.awt.geom.Path2D.Double;
import org.apache.poi.sl.draw.binding.CTPath2DArcTo;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.PathCommand;

public class ArcToCommand implements PathCommand {

   private String hr;
   private String wr;
   private String stAng;
   private String swAng;


   ArcToCommand(CTPath2DArcTo arc) {
      this.hr = arc.getHR().toString();
      this.wr = arc.getWR().toString();
      this.stAng = arc.getStAng().toString();
      this.swAng = arc.getSwAng().toString();
   }

   public void execute(Double path, Context ctx) {
      double rx = ctx.getValue(this.wr);
      double ry = ctx.getValue(this.hr);
      double start = ctx.getValue(this.stAng) / 60000.0D;
      double extent = ctx.getValue(this.swAng) / 60000.0D;
      Point2D pt = path.getCurrentPoint();
      double x0 = pt.getX() - rx - rx * Math.cos(Math.toRadians(start));
      double y0 = pt.getY() - ry - ry * Math.sin(Math.toRadians(start));
      java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double(x0, y0, 2.0D * rx, 2.0D * ry, -start, -extent, 0);
      path.append(arc, true);
   }
}
