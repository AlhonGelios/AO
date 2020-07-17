package org.apache.poi.sl.usermodel;

import java.awt.Insets;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.SimpleShape;

public interface PictureShape extends SimpleShape {

   PictureData getPictureData();

   Insets getClipping();
}
