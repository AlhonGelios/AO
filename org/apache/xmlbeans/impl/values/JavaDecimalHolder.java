package org.apache.xmlbeans.impl.values;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.util.XsTypeConverter;
import org.apache.xmlbeans.impl.values.NamespaceManager;
import org.apache.xmlbeans.impl.values.XmlObjectBase;

public class JavaDecimalHolder extends XmlObjectBase {

   private BigDecimal _value;
   private static BigInteger _maxlong = BigInteger.valueOf(Long.MAX_VALUE);
   private static BigInteger _minlong = BigInteger.valueOf(Long.MIN_VALUE);


   public SchemaType schemaType() {
      return BuiltinSchemaTypeSystem.ST_DECIMAL;
   }

   protected String compute_text(NamespaceManager nsm) {
      return XsTypeConverter.printDecimal(this._value);
   }

   protected void set_text(String s) {
      if(this._validateOnSet()) {
         validateLexical(s, _voorVc);
      }

      try {
         this.set_BigDecimal(new BigDecimal(s));
      } catch (NumberFormatException var3) {
         _voorVc.invalid("decimal", new Object[]{s});
      }

   }

   protected void set_nil() {
      this._value = null;
   }

   public static void validateLexical(String v, ValidationContext context) {
      int l = v.length();
      int i = 0;
      if(i < l) {
         char sawDot = v.charAt(i);
         if(sawDot == 43 || sawDot == 45) {
            ++i;
         }
      }

      boolean var7 = false;

      boolean sawDigit;
      for(sawDigit = false; i < l; ++i) {
         char ch = v.charAt(i);
         if(ch == 46) {
            if(var7) {
               context.invalid("decimal", new Object[]{"saw \'.\' more than once: " + v});
               return;
            }

            var7 = true;
         } else {
            if(ch < 48 || ch > 57) {
               context.invalid("decimal", new Object[]{"unexpected char \'" + ch + "\'"});
               return;
            }

            sawDigit = true;
         }
      }

      if(!sawDigit) {
         context.invalid("decimal", new Object[]{"expected at least one digit"});
      }
   }

   public BigDecimal getBigDecimalValue() {
      this.check_dated();
      return this._value;
   }

   protected void set_BigDecimal(BigDecimal v) {
      this._value = v;
   }

   protected int compare_to(XmlObject decimal) {
      return this._value.compareTo(((XmlObjectBase)decimal).bigDecimalValue());
   }

   protected boolean equal_to(XmlObject decimal) {
      return this._value.compareTo(((XmlObjectBase)decimal).bigDecimalValue()) == 0;
   }

   protected int value_hash_code() {
      if(this._value.scale() > 0 && this._value.setScale(0, 1).compareTo(this._value) != 0) {
         return this.decimalHashCode();
      } else {
         BigInteger intval = this._value.toBigInteger();
         if(intval.compareTo(_maxlong) <= 0 && intval.compareTo(_minlong) >= 0) {
            long longval = intval.longValue();
            return (int)((longval >> 32) * 19L + longval);
         } else {
            return intval.hashCode();
         }
      }
   }

   protected int decimalHashCode() {
      assert this._value.scale() > 0;

      String strValue = this._value.toString();

      int i;
      for(i = strValue.length() - 1; i >= 0 && strValue.charAt(i) == 48; --i) {
         ;
      }

      assert strValue.indexOf(46) < i;

      return strValue.substring(0, i + 1).hashCode();
   }

}
