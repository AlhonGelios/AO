package org.apache.poi.sl.draw.geom;

import java.awt.geom.Path2D.Double;
import org.apache.poi.sl.draw.geom.Context;

public interface PathCommand {

   void execute(Double var1, Context var2);
}
