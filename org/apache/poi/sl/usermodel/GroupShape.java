package org.apache.poi.sl.usermodel;

import java.awt.geom.Rectangle2D;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.sl.usermodel.ShapeContainer;

public interface GroupShape extends Shape, ShapeContainer, PlaceableShape {

   Rectangle2D getInteriorAnchor();

   void setInteriorAnchor(Rectangle2D var1);
}
