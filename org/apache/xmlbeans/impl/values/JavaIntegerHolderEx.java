package org.apache.xmlbeans.impl.values;

import java.math.BigInteger;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlPositiveInteger;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.values.JavaDecimalHolder;
import org.apache.xmlbeans.impl.values.JavaIntegerHolder;
import org.apache.xmlbeans.impl.values.XmlObjectBase;

public class JavaIntegerHolderEx extends JavaIntegerHolder {

   private SchemaType _schemaType;


   public JavaIntegerHolderEx(SchemaType type, boolean complex) {
      this._schemaType = type;
      this.initComplexType(complex, false);
   }

   public SchemaType schemaType() {
      return this._schemaType;
   }

   protected void set_text(String s) {
      BigInteger v = lex(s, _voorVc);
      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
      }

      if(this._validateOnSet()) {
         validateLexical(s, this._schemaType, _voorVc);
      }

      super.set_BigInteger(v);
   }

   protected void set_BigInteger(BigInteger v) {
      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
      }

      super.set_BigInteger(v);
   }

   public static void validateLexical(String v, SchemaType sType, ValidationContext context) {
      JavaDecimalHolder.validateLexical(v, context);
      if(v.lastIndexOf(46) >= 0) {
         context.invalid("integer", new Object[]{v});
      }

      if(sType.hasPatternFacet() && !sType.matchPatternFacet(v)) {
         context.invalid("cvc-datatype-valid.1.1", new Object[]{"integer", v, QNameHelper.readable(sType)});
      }

   }

   private static void validateValue(BigInteger v, SchemaType sType, ValidationContext context) {
      XmlPositiveInteger td = (XmlPositiveInteger)sType.getFacet(7);
      if(td != null) {
         String mine = v.toString();
         int mini = mine.length();
         if(mini > 0 && mine.charAt(0) == 45) {
            --mini;
         }

         if(mini > td.getBigIntegerValue().intValue()) {
            context.invalid("cvc-totalDigits-valid", new Object[]{new Integer(mini), mine, new Integer(td.getBigIntegerValue().intValue()), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var10 = sType.getFacet(3);
      if(var10 != null) {
         BigInteger var11 = getBigIntegerValue(var10);
         if(v.compareTo(var11) <= 0) {
            context.invalid("cvc-minExclusive-valid", new Object[]{"integer", v, var11, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var12 = sType.getFacet(4);
      if(var12 != null) {
         BigInteger maxi = getBigIntegerValue(var12);
         if(v.compareTo(maxi) < 0) {
            context.invalid("cvc-minInclusive-valid", new Object[]{"integer", v, maxi, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var13 = sType.getFacet(5);
      if(var13 != null) {
         BigInteger maxe = getBigIntegerValue(var13);
         if(v.compareTo(maxe) > 0) {
            context.invalid("cvc-maxInclusive-valid", new Object[]{"integer", v, maxe, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var14 = sType.getFacet(6);
      if(var14 != null) {
         BigInteger vals = getBigIntegerValue(var14);
         if(v.compareTo(vals) >= 0) {
            context.invalid("cvc-maxExclusive-valid", new Object[]{"integer", v, vals, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType[] var15 = sType.getEnumerationValues();
      if(var15 != null) {
         for(int i = 0; i < var15.length; ++i) {
            if(v.equals(getBigIntegerValue(var15[i]))) {
               return;
            }
         }

         context.invalid("cvc-enumeration-valid", new Object[]{"integer", v, QNameHelper.readable(sType)});
      }

   }

   private static BigInteger getBigIntegerValue(XmlObject o) {
      SchemaType s = o.schemaType();
      switch(s.getDecimalSize()) {
      case 1000000:
         return ((XmlObjectBase)o).bigIntegerValue();
      case 1000001:
         return ((XmlObjectBase)o).bigDecimalValue().toBigInteger();
      default:
         throw new IllegalStateException("Bad facet type for Big Int: " + s);
      }
   }

   protected void validate_simpleval(String lexical, ValidationContext ctx) {
      validateLexical(lexical, this.schemaType(), ctx);
      validateValue(this.getBigIntegerValue(), this.schemaType(), ctx);
   }
}
