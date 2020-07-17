package org.apache.poi.sl.usermodel;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.sl.usermodel.Sheet;

public interface Shape {

   ShapeContainer getParent();

   Sheet getSheet();

   Rectangle2D getAnchor();

   void draw(Graphics2D var1, Rectangle2D var2);
}
