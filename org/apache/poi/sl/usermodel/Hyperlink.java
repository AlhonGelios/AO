package org.apache.poi.sl.usermodel;

import org.apache.poi.sl.usermodel.Slide;

public interface Hyperlink extends org.apache.poi.common.usermodel.Hyperlink {

   void linkToEmail(String var1);

   void linkToUrl(String var1);

   void linkToSlide(Slide var1);

   void linkToNextSlide();

   void linkToPreviousSlide();

   void linkToFirstSlide();

   void linkToLastSlide();
}
