package org.apache.poi.sl.draw.geom;

import java.awt.geom.Path2D.Double;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.PathCommand;

public class ClosePathCommand implements PathCommand {

   public void execute(Double path, Context ctx) {
      path.closePath();
   }
}
