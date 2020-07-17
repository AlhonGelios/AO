package org.apache.xmlbeans.impl.values;

import java.math.BigDecimal;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.values.JavaDecimalHolder;
import org.apache.xmlbeans.impl.values.XmlObjectBase;

public abstract class JavaDecimalHolderEx extends JavaDecimalHolder {

   private SchemaType _schemaType;


   public SchemaType schemaType() {
      return this._schemaType;
   }

   public JavaDecimalHolderEx(SchemaType type, boolean complex) {
      this._schemaType = type;
      this.initComplexType(complex, false);
   }

   protected void set_text(String s) {
      if(this._validateOnSet()) {
         validateLexical(s, this._schemaType, _voorVc);
      }

      BigDecimal v = null;

      try {
         v = new BigDecimal(s);
      } catch (NumberFormatException var4) {
         _voorVc.invalid("decimal", new Object[]{s});
      }

      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
      }

      super.set_BigDecimal(v);
   }

   protected void set_BigDecimal(BigDecimal v) {
      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
      }

      super.set_BigDecimal(v);
   }

   public static void validateLexical(String v, SchemaType sType, ValidationContext context) {
      JavaDecimalHolder.validateLexical(v, context);
      if(sType.hasPatternFacet() && !sType.matchPatternFacet(v)) {
         context.invalid("cvc-datatype-valid.1.1", new Object[]{"decimal", v, QNameHelper.readable(sType)});
      }

   }

   public static void validateValue(BigDecimal v, SchemaType sType, ValidationContext context) {
      XmlAnySimpleType fd = sType.getFacet(8);
      if(fd != null) {
         int td = ((XmlObjectBase)fd).getBigIntegerValue().intValue();

         try {
            v.setScale(td);
         } catch (ArithmeticException var12) {
            context.invalid("cvc-fractionDigits-valid", new Object[]{new Integer(v.scale()), v.toString(), new Integer(td), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var13 = sType.getFacet(7);
      int i;
      if(var13 != null) {
         String mine = v.unscaledValue().toString();
         int mini = ((XmlObjectBase)var13).getBigIntegerValue().intValue();
         int maxi = mine.length();
         int maxe = maxi;
         if(maxi > 0) {
            if(mine.charAt(0) == 45) {
               maxe = maxi - 1;
            }

            int vals = 0;
            i = v.scale();

            for(int j = maxi - 1; mine.charAt(j) == 48 && j > 0 && vals < i; --j) {
               ++vals;
            }

            maxe -= vals;
         }

         if(maxe > mini) {
            context.invalid("cvc-totalDigits-valid", new Object[]{new Integer(maxe), v.toString(), new Integer(mini), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var14 = sType.getFacet(3);
      if(var14 != null) {
         BigDecimal var15 = ((XmlObjectBase)var14).getBigDecimalValue();
         if(v.compareTo(var15) <= 0) {
            context.invalid("cvc-minExclusive-valid", new Object[]{"decimal", v, var15, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var16 = sType.getFacet(4);
      if(var16 != null) {
         BigDecimal var17 = ((XmlObjectBase)var16).getBigDecimalValue();
         if(v.compareTo(var17) < 0) {
            context.invalid("cvc-minInclusive-valid", new Object[]{"decimal", v, var17, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var18 = sType.getFacet(5);
      if(var18 != null) {
         BigDecimal var19 = ((XmlObjectBase)var18).getBigDecimalValue();
         if(v.compareTo(var19) > 0) {
            context.invalid("cvc-maxInclusive-valid", new Object[]{"decimal", v, var19, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var21 = sType.getFacet(6);
      if(var21 != null) {
         BigDecimal var20 = ((XmlObjectBase)var21).getBigDecimalValue();
         if(v.compareTo(var20) >= 0) {
            context.invalid("cvc-maxExclusive-valid", new Object[]{"decimal", v, var20, QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType[] var22 = sType.getEnumerationValues();
      if(var22 != null) {
         for(i = 0; i < var22.length; ++i) {
            if(v.equals(((XmlObjectBase)var22[i]).getBigDecimalValue())) {
               return;
            }
         }

         context.invalid("cvc-enumeration-valid", new Object[]{"decimal", v, QNameHelper.readable(sType)});
      }

   }

   protected void validate_simpleval(String lexical, ValidationContext ctx) {
      validateLexical(lexical, this.schemaType(), ctx);
      validateValue(this.getBigDecimalValue(), this.schemaType(), ctx);
   }
}
