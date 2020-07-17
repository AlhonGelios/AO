package org.apache.poi.sl.usermodel;

import java.awt.Graphics2D;
import org.apache.poi.sl.usermodel.Background;
import org.apache.poi.sl.usermodel.MasterSheet;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.sl.usermodel.SlideShow;

public interface Sheet extends ShapeContainer {

   SlideShow getSlideShow();

   boolean getFollowMasterGraphics();

   MasterSheet getMasterSheet();

   Background getBackground();

   void draw(Graphics2D var1);
}
