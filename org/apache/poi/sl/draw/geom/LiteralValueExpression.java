package org.apache.poi.sl.draw.geom;

import java.util.regex.Matcher;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.Expression;

public class LiteralValueExpression implements Expression {

   private String arg;


   LiteralValueExpression(Matcher m) {
      this.arg = m.group(1);
   }

   public double evaluate(Context ctx) {
      return ctx.getValue(this.arg);
   }
}
