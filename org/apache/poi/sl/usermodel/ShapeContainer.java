package org.apache.poi.sl.usermodel;

import java.util.List;
import org.apache.poi.sl.usermodel.AutoShape;
import org.apache.poi.sl.usermodel.ConnectorShape;
import org.apache.poi.sl.usermodel.FreeformShape;
import org.apache.poi.sl.usermodel.GroupShape;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.PictureShape;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.sl.usermodel.TableShape;
import org.apache.poi.sl.usermodel.TextBox;

public interface ShapeContainer extends Iterable {

   List getShapes();

   void addShape(Shape var1);

   boolean removeShape(Shape var1);

   AutoShape createAutoShape();

   FreeformShape createFreeform();

   TextBox createTextBox();

   ConnectorShape createConnector();

   GroupShape createGroup();

   PictureShape createPicture(PictureData var1);

   TableShape createTable(int var1, int var2);
}
