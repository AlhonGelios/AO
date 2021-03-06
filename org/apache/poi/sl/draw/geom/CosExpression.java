package org.apache.poi.sl.draw.geom;

import java.util.regex.Matcher;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.Expression;

public class CosExpression implements Expression {

   private String arg1;
   private String arg2;


   CosExpression(Matcher m) {
      this.arg1 = m.group(1);
      this.arg2 = m.group(2);
   }

   public double evaluate(Context ctx) {
      double x = ctx.getValue(this.arg1);
      double y = ctx.getValue(this.arg2) / 60000.0D;
      return x * Math.cos(Math.toRadians(y));
   }
}
