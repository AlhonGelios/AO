package org.apache.xmlbeans.impl.values;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.util.XsTypeConverter;
import org.apache.xmlbeans.impl.values.NamespaceManager;
import org.apache.xmlbeans.impl.values.XmlObjectBase;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

public abstract class JavaIntHolder extends XmlObjectBase {

   private int _value;
   static final BigInteger _max = BigInteger.valueOf(2147483647L);
   static final BigInteger _min = BigInteger.valueOf(-2147483648L);


   public SchemaType schemaType() {
      return BuiltinSchemaTypeSystem.ST_INT;
   }

   public String compute_text(NamespaceManager nsm) {
      return Long.toString((long)this._value);
   }

   protected void set_text(String s) {
      try {
         this.set_int(XsTypeConverter.lexInt(s));
      } catch (Exception var3) {
         throw new XmlValueOutOfRangeException("int", new Object[]{s});
      }
   }

   protected void set_nil() {
      this._value = 0;
   }

   public BigDecimal getBigDecimalValue() {
      this.check_dated();
      return new BigDecimal((double)this._value);
   }

   public BigInteger getBigIntegerValue() {
      this.check_dated();
      return BigInteger.valueOf((long)this._value);
   }

   public long getLongValue() {
      this.check_dated();
      return (long)this._value;
   }

   public int getIntValue() {
      this.check_dated();
      return this._value;
   }

   protected void set_BigDecimal(BigDecimal v) {
      this.set_BigInteger(v.toBigInteger());
   }

   protected void set_BigInteger(BigInteger v) {
      if(v.compareTo(_max) <= 0 && v.compareTo(_min) >= 0) {
         this.set_int(v.intValue());
      } else {
         throw new XmlValueOutOfRangeException();
      }
   }

   protected void set_long(long l) {
      if(l <= 2147483647L && l >= -2147483648L) {
         this.set_int((int)l);
      } else {
         throw new XmlValueOutOfRangeException();
      }
   }

   protected void set_int(int i) {
      this._value = i;
   }

   protected int compare_to(XmlObject i) {
      return ((SimpleValue)i).instanceType().getDecimalSize() > 32?-i.compareTo(this):(this._value == ((XmlObjectBase)i).intValue()?0:(this._value < ((XmlObjectBase)i).intValue()?-1:1));
   }

   protected boolean equal_to(XmlObject i) {
      return ((SimpleValue)i).instanceType().getDecimalSize() > 32?i.valueEquals(this):this._value == ((XmlObjectBase)i).intValue();
   }

   protected int value_hash_code() {
      return this._value;
   }

}
