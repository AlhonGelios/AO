package org.apache.poi.sl.usermodel;

import org.apache.poi.sl.usermodel.PictureShape;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.Shape;

public interface GraphicalFrame extends Shape, PlaceableShape {

   PictureShape getFallbackPicture();
}
