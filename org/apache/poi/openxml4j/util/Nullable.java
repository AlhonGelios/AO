package org.apache.poi.openxml4j.util;


public final class Nullable {

   private Object value;


   public Nullable() {}

   public Nullable(Object value) {
      this.value = value;
   }

   public Object getValue() {
      return this.value;
   }

   public boolean hasValue() {
      return this.value != null;
   }

   public void nullify() {
      this.value = null;
   }
}
