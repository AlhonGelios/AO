package org.apache.xmlbeans.impl.values;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.util.XsTypeConverter;
import org.apache.xmlbeans.impl.values.JavaDecimalHolder;
import org.apache.xmlbeans.impl.values.JavaLongHolder;
import org.apache.xmlbeans.impl.values.XmlObjectBase;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

public abstract class JavaLongHolderEx extends JavaLongHolder {

   private SchemaType _schemaType;


   public JavaLongHolderEx(SchemaType type, boolean complex) {
      this._schemaType = type;
      this.initComplexType(complex, false);
   }

   public SchemaType schemaType() {
      return this._schemaType;
   }

   protected void set_text(String s) {
      long v;
      try {
         v = XsTypeConverter.lexLong(s);
      } catch (Exception var5) {
         throw new XmlValueOutOfRangeException();
      }

      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
         validateLexical(s, this._schemaType, _voorVc);
      }

      super.set_long(v);
   }

   protected void set_long(long v) {
      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
      }

      super.set_long(v);
   }

   public static void validateLexical(String v, SchemaType sType, ValidationContext context) {
      JavaDecimalHolder.validateLexical(v, context);
      if(sType.hasPatternFacet() && !sType.matchPatternFacet(v)) {
         context.invalid("cvc-datatype-valid.1.1", new Object[]{"long", v, QNameHelper.readable(sType)});
      }

   }

   private static void validateValue(long v, SchemaType sType, ValidationContext context) {
      XmlAnySimpleType td = sType.getFacet(7);
      if(td != null) {
         long mine = getLongValue(td);
         String maxi = Long.toString(v);
         int maxe = maxi.length();
         if(maxe > 0 && maxi.charAt(0) == 45) {
            --maxe;
         }

         if((long)maxe > mine) {
            context.invalid("cvc-totalDigits-valid", new Object[]{new Integer(maxe), maxi, new Long(mine), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var11 = sType.getFacet(3);
      if(var11 != null) {
         long mini = getLongValue(var11);
         if(v <= mini) {
            context.invalid("cvc-minExclusive-valid", new Object[]{"long", new Long(v), new Long(mini), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var12 = sType.getFacet(4);
      if(var12 != null) {
         long var13 = getLongValue(var12);
         if(v < var13) {
            context.invalid("cvc-minInclusive-valid", new Object[]{"long", new Long(v), new Long(var13), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var14 = sType.getFacet(5);
      if(var14 != null) {
         long var15 = getLongValue(var14);
         if(v > var15) {
            context.invalid("cvc-maxInclusive-valid", new Object[]{"long", new Long(v), new Long(var15), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var16 = sType.getFacet(6);
      if(var16 != null) {
         long vals = getLongValue(var16);
         if(v >= vals) {
            context.invalid("cvc-maxExclusive-valid", new Object[]{"long", new Long(v), new Long(vals), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType[] var17 = sType.getEnumerationValues();
      if(var17 != null) {
         for(int i = 0; i < var17.length; ++i) {
            if(v == getLongValue(var17[i])) {
               return;
            }
         }

         context.invalid("cvc-enumeration-valid", new Object[]{"long", new Long(v), QNameHelper.readable(sType)});
      }

   }

   private static long getLongValue(XmlObject o) {
      SchemaType s = o.schemaType();
      switch(s.getDecimalSize()) {
      case 64:
         return ((XmlObjectBase)o).getLongValue();
      case 1000000:
         return ((XmlObjectBase)o).getBigIntegerValue().longValue();
      case 1000001:
         return ((XmlObjectBase)o).getBigDecimalValue().longValue();
      default:
         throw new IllegalStateException("Bad facet type: " + s);
      }
   }

   protected void validate_simpleval(String lexical, ValidationContext ctx) {
      validateLexical(lexical, this.schemaType(), ctx);
      validateValue(this.getLongValue(), this.schemaType(), ctx);
   }
}
