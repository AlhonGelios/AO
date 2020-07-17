package org.apache.poi.ss.usermodel;

import org.apache.poi.ss.usermodel.HeaderFooter;

public interface Header extends HeaderFooter {

   String getLeft();

   void setLeft(String var1);

   String getCenter();

   void setCenter(String var1);

   String getRight();

   void setRight(String var1);
}
