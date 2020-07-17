package org.apache.poi.sl.draw.geom;

import java.util.regex.Matcher;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.Expression;

public class SqrtExpression implements Expression {

   private String arg;


   SqrtExpression(Matcher m) {
      this.arg = m.group(1);
   }

   public double evaluate(Context ctx) {
      double val = ctx.getValue(this.arg);
      return Math.sqrt(val);
   }
}
