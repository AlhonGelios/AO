package org.apache.poi.sl.usermodel;

import org.apache.poi.sl.usermodel.Notes;
import org.apache.poi.sl.usermodel.Sheet;

public interface Slide extends Sheet {

   Notes getNotes();

   void setNotes(Notes var1);

   boolean getFollowMasterBackground();

   void setFollowMasterBackground(boolean var1);

   boolean getFollowMasterColourScheme();

   void setFollowMasterColourScheme(boolean var1);

   boolean getFollowMasterObjects();

   void setFollowMasterObjects(boolean var1);

   int getSlideNumber();

   String getTitle();
}
