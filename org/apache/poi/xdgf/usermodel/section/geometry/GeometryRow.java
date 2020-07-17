package org.apache.poi.xdgf.usermodel.section.geometry;

import java.awt.geom.Path2D.Double;
import org.apache.poi.xdgf.usermodel.XDGFShape;

public interface GeometryRow {

   void setupMaster(GeometryRow var1);

   void addToPath(Double var1, XDGFShape var2);
}
