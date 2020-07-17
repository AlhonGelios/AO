package org.apache.poi.sl.usermodel;

import org.apache.poi.sl.usermodel.FontCollection;
import org.apache.poi.sl.usermodel.PictureData;

public interface Resources {

   FontCollection getFontCollection();

   PictureData[] getPictureData();

   int addPictureData(PictureData var1);
}
