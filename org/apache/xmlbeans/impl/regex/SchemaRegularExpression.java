package org.apache.xmlbeans.impl.regex;

import java.util.HashMap;
import java.util.Map;
import org.apache.xmlbeans.impl.common.XMLChar;
import org.apache.xmlbeans.impl.regex.RegularExpression;

public class SchemaRegularExpression extends RegularExpression {

   static final Map knownPatterns = buildKnownPatternMap();


   private SchemaRegularExpression(String pattern) {
      super(pattern, "X");
   }

   public static RegularExpression forPattern(String s) {
      SchemaRegularExpression tre = (SchemaRegularExpression)knownPatterns.get(s);
      return (RegularExpression)(tre != null?tre:new RegularExpression(s, "X"));
   }

   private static Map buildKnownPatternMap() {
      HashMap result = new HashMap();
      result.put("\\c+", new SchemaRegularExpression("\\c+", null) {
         public boolean matches(String s) {
            return XMLChar.isValidNmtoken(s);
         }
      });
      result.put("\\i\\c*", new SchemaRegularExpression("\\i\\c*", null) {
         public boolean matches(String s) {
            return XMLChar.isValidName(s);
         }
      });
      result.put("[\\i-[:]][\\c-[:]]*", new SchemaRegularExpression("[\\i-[:]][\\c-[:]]*", null) {
         public boolean matches(String s) {
            return XMLChar.isValidNCName(s);
         }
      });
      return result;
   }

   SchemaRegularExpression(String x0, Object x1) {
      this(x0);
   }

}
