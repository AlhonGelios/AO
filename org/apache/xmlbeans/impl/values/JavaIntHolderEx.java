package org.apache.xmlbeans.impl.values;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.util.XsTypeConverter;
import org.apache.xmlbeans.impl.values.JavaDecimalHolder;
import org.apache.xmlbeans.impl.values.JavaIntHolder;
import org.apache.xmlbeans.impl.values.XmlObjectBase;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

public abstract class JavaIntHolderEx extends JavaIntHolder {

   private SchemaType _schemaType;


   public JavaIntHolderEx(SchemaType type, boolean complex) {
      this._schemaType = type;
      this.initComplexType(complex, false);
   }

   public SchemaType schemaType() {
      return this._schemaType;
   }

   protected void set_text(String s) {
      int v;
      try {
         v = XsTypeConverter.lexInt(s);
      } catch (Exception var4) {
         throw new XmlValueOutOfRangeException();
      }

      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
         validateLexical(s, this._schemaType, _voorVc);
      }

      super.set_int(v);
   }

   protected void set_int(int v) {
      if(this._validateOnSet()) {
         validateValue(v, this._schemaType, _voorVc);
      }

      super.set_int(v);
   }

   public static void validateLexical(String v, SchemaType sType, ValidationContext context) {
      JavaDecimalHolder.validateLexical(v, context);
      if(sType.hasPatternFacet() && !sType.matchPatternFacet(v)) {
         context.invalid("cvc-datatype-valid.1.1", new Object[]{"int", v, QNameHelper.readable(sType)});
      }

   }

   private static void validateValue(int v, SchemaType sType, ValidationContext context) {
      XmlAnySimpleType td = sType.getFacet(7);
      int mini;
      int maxi;
      if(td != null) {
         String mine = Integer.toString(v);
         mini = mine.length();
         if(mini > 0 && mine.charAt(0) == 45) {
            --mini;
         }

         maxi = getIntValue(td);
         if(mini > maxi) {
            context.invalid("cvc-totalDigits-valid", new Object[]{new Integer(mini), mine, new Integer(getIntValue(td)), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var10 = sType.getFacet(3);
      if(var10 != null) {
         mini = getIntValue(var10);
         if(v <= mini) {
            context.invalid("cvc-minExclusive-valid", new Object[]{"int", new Integer(v), new Integer(mini), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var11 = sType.getFacet(4);
      if(var11 != null) {
         maxi = getIntValue(var11);
         if(v < maxi) {
            context.invalid("cvc-minInclusive-valid", new Object[]{"int", new Integer(v), new Integer(maxi), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var12 = sType.getFacet(5);
      if(var12 != null) {
         int maxe = getIntValue(var12);
         if(v > maxe) {
            context.invalid("cvc-maxExclusive-valid", new Object[]{"int", new Integer(v), new Integer(maxe), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType var13 = sType.getFacet(6);
      if(var13 != null) {
         int vals = getIntValue(var13);
         if(v >= vals) {
            context.invalid("cvc-maxExclusive-valid", new Object[]{"int", new Integer(v), new Integer(vals), QNameHelper.readable(sType)});
            return;
         }
      }

      XmlAnySimpleType[] var14 = sType.getEnumerationValues();
      if(var14 != null) {
         for(int i = 0; i < var14.length; ++i) {
            if(v == getIntValue(var14[i])) {
               return;
            }
         }

         context.invalid("cvc-enumeration-valid", new Object[]{"int", new Integer(v), QNameHelper.readable(sType)});
      }

   }

   private static int getIntValue(XmlObject o) {
      SchemaType s = o.schemaType();
      switch(s.getDecimalSize()) {
      case 64:
         return (int)((XmlObjectBase)o).getLongValue();
      case 1000000:
         return ((XmlObjectBase)o).getBigIntegerValue().intValue();
      case 1000001:
         return ((XmlObjectBase)o).getBigDecimalValue().intValue();
      default:
         return ((XmlObjectBase)o).getIntValue();
      }
   }

   protected void validate_simpleval(String lexical, ValidationContext ctx) {
      validateLexical(lexical, this.schemaType(), ctx);
      validateValue(this.getIntValue(), this.schemaType(), ctx);
   }
}
