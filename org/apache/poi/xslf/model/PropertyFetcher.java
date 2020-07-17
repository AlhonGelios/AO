package org.apache.poi.xslf.model;

import org.apache.poi.util.Internal;
import org.apache.poi.xslf.usermodel.XSLFShape;

@Internal
public abstract class PropertyFetcher {

   private Object _value;


   public abstract boolean fetch(XSLFShape var1);

   public Object getValue() {
      return this._value;
   }

   public void setValue(Object val) {
      this._value = val;
   }
}
