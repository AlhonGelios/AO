package org.apache.poi.ss.usermodel;

import java.awt.Dimension;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;

public interface Picture {

   void resize();

   void resize(double var1);

   void resize(double var1, double var3);

   ClientAnchor getPreferredSize();

   ClientAnchor getPreferredSize(double var1, double var3);

   Dimension getImageDimension();

   PictureData getPictureData();

   ClientAnchor getClientAnchor();

   Sheet getSheet();
}
