package org.apache.poi.xdgf.usermodel.shape;

import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.shape.ShapeVisitorAcceptor;

public class ShapeDataAcceptor implements ShapeVisitorAcceptor {

   public boolean accept(XDGFShape shape) {
      return shape.isDeleted()?false:(shape.hasText() && shape.getTextAsString().length() != 0?true:(shape.isShape1D()?true:(!shape.hasMaster() && !shape.hasMasterShape()?true:(shape.hasMaster() && !shape.hasMasterShape()?true:shape.hasMasterShape() && shape.getMasterShape().isTopmost()))));
   }
}
