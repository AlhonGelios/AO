package org.apache.xmlbeans.impl.values;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.values.JavaStringHolder;
import org.apache.xmlbeans.impl.values.XmlObjectBase;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

public abstract class JavaStringHolderEx extends JavaStringHolder {

   private SchemaType _schemaType;


   public SchemaType schemaType() {
      return this._schemaType;
   }

   public JavaStringHolderEx(SchemaType type, boolean complex) {
      this._schemaType = type;
      this.initComplexType(complex, false);
   }

   protected int get_wscanon_rule() {
      return this.schemaType().getWhiteSpaceRule();
   }

   protected void set_text(String s) {
      if(this._validateOnSet()) {
         validateLexical(s, this._schemaType, _voorVc);
      }

      super.set_text(s);
   }

   protected boolean is_defaultable_ws(String v) {
      try {
         validateLexical(v, this._schemaType, _voorVc);
         return false;
      } catch (XmlValueOutOfRangeException var3) {
         return true;
      }
   }

   public static void validateLexical(String v, SchemaType sType, ValidationContext context) {
      if(!sType.matchPatternFacet(v)) {
         context.invalid("cvc-datatype-valid.1.1", new Object[]{"string", v, QNameHelper.readable(sType)});
      } else {
         XmlAnySimpleType len = sType.getFacet(0);
         if(len != null) {
            int min = ((XmlObjectBase)len).bigIntegerValue().intValue();
            if(v.length() != min) {
               context.invalid("cvc-length-valid.1.1", new Object[]{"string", new Integer(v.length()), new Integer(min), QNameHelper.readable(sType)});
               return;
            }
         }

         XmlAnySimpleType var8 = sType.getFacet(1);
         if(var8 != null) {
            int max = ((XmlObjectBase)var8).bigIntegerValue().intValue();
            if(v.length() < max) {
               context.invalid("cvc-minLength-valid.1.1", new Object[]{"string", new Integer(v.length()), new Integer(max), QNameHelper.readable(sType)});
               return;
            }
         }

         XmlAnySimpleType var9 = sType.getFacet(2);
         if(var9 != null) {
            int vals = ((XmlObjectBase)var9).bigIntegerValue().intValue();
            if(v.length() > vals) {
               context.invalid("cvc-maxLength-valid.1.1", new Object[]{"string", new Integer(v.length()), new Integer(vals), QNameHelper.readable(sType)});
               return;
            }
         }

         XmlAnySimpleType[] var10 = sType.getEnumerationValues();
         if(var10 != null) {
            for(int i = 0; i < var10.length; ++i) {
               if(v.equals(var10[i].getStringValue())) {
                  return;
               }
            }

            context.invalid("cvc-enumeration-valid", new Object[]{"string", v, QNameHelper.readable(sType)});
         }

      }
   }

   protected void validate_simpleval(String lexical, ValidationContext ctx) {
      validateLexical(this.stringValue(), this.schemaType(), ctx);
   }
}
