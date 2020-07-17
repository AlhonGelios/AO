package org.apache.poi.sl.usermodel;

import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.sl.usermodel.TableCell;

public interface TableShape extends Shape, PlaceableShape {

   int getNumberOfColumns();

   int getNumberOfRows();

   TableCell getCell(int var1, int var2);

   double getColumnWidth(int var1);

   void setColumnWidth(int var1, double var2);

   double getRowHeight(int var1);

   void setRowHeight(int var1, double var2);
}
