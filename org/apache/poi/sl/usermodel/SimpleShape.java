package org.apache.poi.sl.usermodel;

import java.awt.Color;
import org.apache.poi.sl.draw.geom.CustomGeometry;
import org.apache.poi.sl.draw.geom.IAdjustableShape;
import org.apache.poi.sl.usermodel.FillStyle;
import org.apache.poi.sl.usermodel.Hyperlink;
import org.apache.poi.sl.usermodel.LineDecoration;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.sl.usermodel.Shadow;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.sl.usermodel.ShapeType;
import org.apache.poi.sl.usermodel.StrokeStyle;

public interface SimpleShape extends Shape, IAdjustableShape, PlaceableShape {

   FillStyle getFillStyle();

   LineDecoration getLineDecoration();

   StrokeStyle getStrokeStyle();

   void setStrokeStyle(Object ... var1);

   CustomGeometry getGeometry();

   ShapeType getShapeType();

   void setShapeType(ShapeType var1);

   Placeholder getPlaceholder();

   void setPlaceholder(Placeholder var1);

   Shadow getShadow();

   Color getFillColor();

   void setFillColor(Color var1);

   Hyperlink getHyperlink();

   Hyperlink createHyperlink();
}
