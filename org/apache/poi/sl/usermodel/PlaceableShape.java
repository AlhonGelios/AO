package org.apache.poi.sl.usermodel;

import java.awt.geom.Rectangle2D;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.sl.usermodel.Sheet;

public interface PlaceableShape {

   ShapeContainer getParent();

   Sheet getSheet();

   Rectangle2D getAnchor();

   void setAnchor(Rectangle2D var1);

   double getRotation();

   void setRotation(double var1);

   void setFlipHorizontal(boolean var1);

   void setFlipVertical(boolean var1);

   boolean getFlipHorizontal();

   boolean getFlipVertical();
}
