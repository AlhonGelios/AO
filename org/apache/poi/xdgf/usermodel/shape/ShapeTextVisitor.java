package org.apache.poi.xdgf.usermodel.shape;

import java.awt.geom.AffineTransform;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.shape.ShapeVisitor;
import org.apache.poi.xdgf.usermodel.shape.ShapeVisitorAcceptor;

public class ShapeTextVisitor extends ShapeVisitor {

   protected StringBuilder text = new StringBuilder();


   protected ShapeVisitorAcceptor getAcceptor() {
      return new ShapeTextVisitor.TextAcceptor();
   }

   public void visit(XDGFShape shape, AffineTransform globalTransform, int level) {
      this.text.append(shape.getText().getTextContent().trim());
      this.text.append('\n');
   }

   public String getText() {
      return this.text.toString();
   }

   public static class TextAcceptor implements ShapeVisitorAcceptor {

      public boolean accept(XDGFShape shape) {
         return shape.hasText();
      }
   }
}
