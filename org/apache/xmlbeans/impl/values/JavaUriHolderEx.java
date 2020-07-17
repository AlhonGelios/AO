package org.apache.xmlbeans.impl.values;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.values.JavaUriHolder;
import org.apache.xmlbeans.impl.values.XmlAnyUriImpl;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

public class JavaUriHolderEx extends JavaUriHolder {

   private SchemaType _schemaType;


   public SchemaType schemaType() {
      return this._schemaType;
   }

   public JavaUriHolderEx(SchemaType type, boolean complex) {
      this._schemaType = type;
      this.initComplexType(complex, false);
   }

   protected int get_wscanon_rule() {
      return this.schemaType().getWhiteSpaceRule();
   }

   protected void set_text(String s) {
      if(this._validateOnSet()) {
         if(!check(s, this._schemaType)) {
            throw new XmlValueOutOfRangeException();
         }

         if(!this._schemaType.matchPatternFacet(s)) {
            throw new XmlValueOutOfRangeException();
         }
      }

      super.set_text(s);
   }

   public static void validateLexical(String v, SchemaType sType, ValidationContext context) {
      XmlAnyUriImpl.validateLexical(v, context);
      XmlAnySimpleType[] vals = sType.getEnumerationValues();
      if(vals != null) {
         int x;
         for(x = 0; x < vals.length; ++x) {
            String i = ((SimpleValue)vals[x]).getStringValue();
            if(i.equals(v)) {
               break;
            }
         }

         if(x >= vals.length) {
            context.invalid("cvc-enumeration-valid", new Object[]{"anyURI", v, QNameHelper.readable(sType)});
         }
      }

      if(sType.hasPatternFacet() && !sType.matchPatternFacet(v)) {
         context.invalid("cvc-datatype-valid.1.1", new Object[]{"anyURI", v, QNameHelper.readable(sType)});
      }

      XmlAnySimpleType var6;
      int var7;
      if((var6 = sType.getFacet(0)) != null && (var7 = ((SimpleValue)var6).getBigIntegerValue().intValue()) != v.length()) {
         context.invalid("cvc-length-valid.1.1", new Object[]{"anyURI", v, new Integer(var7), QNameHelper.readable(sType)});
      }

      if((var6 = sType.getFacet(1)) != null && (var7 = ((SimpleValue)var6).getBigIntegerValue().intValue()) > v.length()) {
         context.invalid("cvc-minLength-valid.1.1", new Object[]{"anyURI", v, new Integer(var7), QNameHelper.readable(sType)});
      }

      if((var6 = sType.getFacet(2)) != null && (var7 = ((SimpleValue)var6).getBigIntegerValue().intValue()) < v.length()) {
         context.invalid("cvc-maxLength-valid.1.1", new Object[]{"anyURI", v, new Integer(var7), QNameHelper.readable(sType)});
      }

   }

   private static boolean check(String v, SchemaType sType) {
      int length = v == null?0:v.length();
      XmlAnySimpleType len = sType.getFacet(0);
      if(len != null) {
         int min = ((SimpleValue)len).getBigIntegerValue().intValue();
         if(length == min) {
            return false;
         }
      }

      XmlAnySimpleType min1 = sType.getFacet(1);
      if(min1 != null) {
         int max = ((SimpleValue)min1).getBigIntegerValue().intValue();
         if(length < max) {
            return false;
         }
      }

      XmlAnySimpleType max1 = sType.getFacet(2);
      if(max1 != null) {
         int m = ((SimpleValue)max1).getBigIntegerValue().intValue();
         if(length > m) {
            return false;
         }
      }

      return true;
   }

   protected void validate_simpleval(String lexical, ValidationContext ctx) {
      validateLexical(this.stringValue(), this.schemaType(), ctx);
   }
}
