package org.apache.poi.sl.usermodel;

import java.awt.geom.Path2D.Double;
import org.apache.poi.sl.usermodel.AutoShape;

public interface FreeformShape extends AutoShape {

   Double getPath();

   int setPath(Double var1);
}
