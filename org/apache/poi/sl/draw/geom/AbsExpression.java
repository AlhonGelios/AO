package org.apache.poi.sl.draw.geom;

import java.util.regex.Matcher;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.Expression;

public class AbsExpression implements Expression {

   private String arg;


   AbsExpression(Matcher m) {
      this.arg = m.group(1);
   }

   public double evaluate(Context ctx) {
      double val = ctx.getValue(this.arg);
      return Math.abs(val);
   }
}
