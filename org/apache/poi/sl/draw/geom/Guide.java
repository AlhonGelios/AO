package org.apache.poi.sl.draw.geom;

import org.apache.poi.sl.draw.binding.CTGeomGuide;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.Expression;
import org.apache.poi.sl.draw.geom.ExpressionParser;
import org.apache.poi.sl.draw.geom.Formula;

public class Guide extends Formula {

   private String name;
   private String fmla;
   private Expression expr;


   public Guide(CTGeomGuide gd) {
      this(gd.getName(), gd.getFmla());
   }

   public Guide(String nm, String fm) {
      this.name = nm;
      this.fmla = fm;
      this.expr = ExpressionParser.parse(fm);
   }

   String getName() {
      return this.name;
   }

   String getFormula() {
      return this.fmla;
   }

   public double evaluate(Context ctx) {
      return this.expr.evaluate(ctx);
   }
}
