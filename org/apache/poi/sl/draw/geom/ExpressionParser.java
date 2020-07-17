package org.apache.poi.sl.draw.geom;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.sl.draw.geom.AbsExpression;
import org.apache.poi.sl.draw.geom.AddDivideExpression;
import org.apache.poi.sl.draw.geom.AddSubtractExpression;
import org.apache.poi.sl.draw.geom.ArcTanExpression;
import org.apache.poi.sl.draw.geom.CosExpression;
import org.apache.poi.sl.draw.geom.CosineArcTanExpression;
import org.apache.poi.sl.draw.geom.Expression;
import org.apache.poi.sl.draw.geom.IfElseExpression;
import org.apache.poi.sl.draw.geom.LiteralValueExpression;
import org.apache.poi.sl.draw.geom.MaxExpression;
import org.apache.poi.sl.draw.geom.MinExpression;
import org.apache.poi.sl.draw.geom.ModExpression;
import org.apache.poi.sl.draw.geom.MultiplyDivideExpression;
import org.apache.poi.sl.draw.geom.PinExpression;
import org.apache.poi.sl.draw.geom.SinArcTanExpression;
import org.apache.poi.sl.draw.geom.SinExpression;
import org.apache.poi.sl.draw.geom.SqrtExpression;
import org.apache.poi.sl.draw.geom.TanExpression;

public class ExpressionParser {

   private static final Map impls = new HashMap();


   private static String op(String str) {
      return str != null && str.contains(" ")?str.substring(0, str.indexOf(" ")).replace("\\", ""):"";
   }

   public static Expression parse(String str) {
      ExpressionParser.ExpressionEntry ee = (ExpressionParser.ExpressionEntry)impls.get(op(str));
      Matcher m = ee == null?null:ee.regex.matcher(str);
      if(m != null && m.matches()) {
         try {
            return (Expression)ee.con.newInstance(new Object[]{m});
         } catch (Exception var4) {
            throw new RuntimeException("Unsupported formula: " + str, var4);
         }
      } else {
         throw new RuntimeException("Unsupported formula: " + str);
      }
   }

   static {
      try {
         new ExpressionParser.ExpressionEntry("\\*/ +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)", MultiplyDivideExpression.class);
         new ExpressionParser.ExpressionEntry("\\+- +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)( 0)?", AddSubtractExpression.class);
         new ExpressionParser.ExpressionEntry("\\+/ +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)", AddDivideExpression.class);
         new ExpressionParser.ExpressionEntry("\\?: +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)", IfElseExpression.class);
         new ExpressionParser.ExpressionEntry("val +([\\-\\w]+)", LiteralValueExpression.class);
         new ExpressionParser.ExpressionEntry("abs +([\\-\\w]+)", AbsExpression.class);
         new ExpressionParser.ExpressionEntry("sqrt +([\\-\\w]+)", SqrtExpression.class);
         new ExpressionParser.ExpressionEntry("max +([\\-\\w]+) +([\\-\\w]+)", MaxExpression.class);
         new ExpressionParser.ExpressionEntry("min +([\\-\\w]+) +([\\-\\w]+)", MinExpression.class);
         new ExpressionParser.ExpressionEntry("at2 +([\\-\\w]+) +([\\-\\w]+)", ArcTanExpression.class);
         new ExpressionParser.ExpressionEntry("sin +([\\-\\w]+) +([\\-\\w]+)", SinExpression.class);
         new ExpressionParser.ExpressionEntry("cos +([\\-\\w]+) +([\\-\\w]+)", CosExpression.class);
         new ExpressionParser.ExpressionEntry("tan +([\\-\\w]+) +([\\-\\w]+)", TanExpression.class);
         new ExpressionParser.ExpressionEntry("cat2 +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)", CosineArcTanExpression.class);
         new ExpressionParser.ExpressionEntry("sat2 +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)", SinArcTanExpression.class);
         new ExpressionParser.ExpressionEntry("pin +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)", PinExpression.class);
         new ExpressionParser.ExpressionEntry("mod +([\\-\\w]+) +([\\-\\w]+) +([\\-\\w]+)", ModExpression.class);
      } catch (Exception var1) {
         throw new RuntimeException(var1);
      }
   }

   private static class ExpressionEntry {

      final Pattern regex;
      final Constructor con;


      ExpressionEntry(String regex, Class cls) throws SecurityException, NoSuchMethodException {
         this.regex = Pattern.compile(regex);
         this.con = cls.getDeclaredConstructor(new Class[]{Matcher.class});
         ExpressionParser.impls.put(ExpressionParser.op(regex), this);
      }
   }
}
