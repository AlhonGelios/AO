package org.apache.poi.xslf.usermodel;

import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.xslf.usermodel.XSLFAutoShape;
import org.apache.poi.xslf.usermodel.XSLFConnectorShape;
import org.apache.poi.xslf.usermodel.XSLFFreeformShape;
import org.apache.poi.xslf.usermodel.XSLFGroupShape;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFTextBox;

public interface XSLFShapeContainer extends ShapeContainer {

   XSLFAutoShape createAutoShape();

   XSLFFreeformShape createFreeform();

   XSLFTextBox createTextBox();

   XSLFConnectorShape createConnector();

   XSLFGroupShape createGroup();

   XSLFPictureShape createPicture(PictureData var1);

   void clear();
}
