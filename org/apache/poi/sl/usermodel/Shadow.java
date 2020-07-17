package org.apache.poi.sl.usermodel;

import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.SimpleShape;

public interface Shadow {

   SimpleShape getShadowParent();

   double getDistance();

   double getAngle();

   double getBlur();

   PaintStyle.SolidPaint getFillStyle();
}
