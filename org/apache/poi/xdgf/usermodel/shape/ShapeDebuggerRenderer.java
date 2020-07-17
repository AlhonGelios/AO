package org.apache.poi.xdgf.usermodel.shape;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.shape.ShapeRenderer;
import org.apache.poi.xdgf.usermodel.shape.ShapeVisitorAcceptor;

public class ShapeDebuggerRenderer extends ShapeRenderer {

   ShapeVisitorAcceptor _debugAcceptor = null;


   public ShapeDebuggerRenderer() {}

   public ShapeDebuggerRenderer(Graphics2D g) {
      super(g);
   }

   public void setDebugAcceptor(ShapeVisitorAcceptor acceptor) {
      this._debugAcceptor = acceptor;
   }

   protected Path2D drawPath(XDGFShape shape) {
      Path2D path = super.drawPath(shape);
      if(this._debugAcceptor == null || this._debugAcceptor.accept(shape)) {
         Font f = this._graphics.getFont();
         this._graphics.scale(1.0D, -1.0D);
         this._graphics.setFont(f.deriveFont(0.05F));
         String shapeId = "" + shape.getID();
         float shapeOffset = -0.1F;
         if(shape.hasMasterShape()) {
            shapeId = shapeId + " MS:" + shape.getMasterShape().getID();
            shapeOffset -= 0.15F;
         }

         this._graphics.drawString(shapeId, shapeOffset, 0.0F);
         this._graphics.setFont(f);
         this._graphics.scale(1.0D, -1.0D);
      }

      return path;
   }
}
