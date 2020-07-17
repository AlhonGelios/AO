package org.apache.poi.sl.draw.geom;

import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.sl.draw.geom.CustomGeometry;
import org.apache.poi.sl.draw.geom.Formula;
import org.apache.poi.sl.draw.geom.Guide;
import org.apache.poi.sl.draw.geom.IAdjustableShape;

public class Context {

   final Map _ctx = new HashMap();
   final IAdjustableShape _props;
   final Rectangle2D _anchor;


   public Context(CustomGeometry geom, Rectangle2D anchor, IAdjustableShape props) {
      this._props = props;
      this._anchor = anchor;
      Iterator i$ = geom.adjusts.iterator();

      Guide gd;
      while(i$.hasNext()) {
         gd = (Guide)i$.next();
         this.evaluate(gd);
      }

      i$ = geom.guides.iterator();

      while(i$.hasNext()) {
         gd = (Guide)i$.next();
         this.evaluate(gd);
      }

   }

   public Rectangle2D getShapeAnchor() {
      return this._anchor;
   }

   public Guide getAdjustValue(String name) {
      return this._props.getAdjustValue(name);
   }

   public double getValue(String key) {
      if(key.matches("(\\+|-)?\\d+")) {
         return Double.parseDouble(key);
      } else {
         Formula builtIn = (Formula)Formula.builtInFormulas.get(key);
         if(builtIn != null) {
            return builtIn.evaluate(this);
         } else if(!this._ctx.containsKey(key)) {
            throw new RuntimeException("undefined variable: " + key);
         } else {
            return ((Double)this._ctx.get(key)).doubleValue();
         }
      }
   }

   public double evaluate(Formula fmla) {
      double result = fmla.evaluate(this);
      String key = fmla.getName();
      if(key != null) {
         this._ctx.put(key, Double.valueOf(result));
      }

      return result;
   }
}
