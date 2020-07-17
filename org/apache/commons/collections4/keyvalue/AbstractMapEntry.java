package org.apache.commons.collections4.keyvalue;

import java.util.Map.Entry;
import org.apache.commons.collections4.keyvalue.AbstractKeyValue;

public abstract class AbstractMapEntry extends AbstractKeyValue implements Entry {

   protected AbstractMapEntry(Object key, Object value) {
      super(key, value);
   }

   public Object setValue(Object value) {
      return super.setValue(value);
   }

   public boolean equals(Object obj) {
      if(obj == this) {
         return true;
      } else if(!(obj instanceof Entry)) {
         return false;
      } else {
         boolean var10000;
         label44: {
            Entry other = (Entry)obj;
            if(this.getKey() == null) {
               if(other.getKey() != null) {
                  break label44;
               }
            } else if(!this.getKey().equals(other.getKey())) {
               break label44;
            }

            if(this.getValue() == null) {
               if(other.getValue() != null) {
                  break label44;
               }
            } else if(!this.getValue().equals(other.getValue())) {
               break label44;
            }

            var10000 = true;
            return var10000;
         }

         var10000 = false;
         return var10000;
      }
   }

   public int hashCode() {
      return (this.getKey() == null?0:this.getKey().hashCode()) ^ (this.getValue() == null?0:this.getValue().hashCode());
   }
}
