package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.TypeWriter;
import org.apache.poi.hpsf.VariantSupport;
import org.apache.poi.hpsf.WritingNotSupportedException;

public class MutableProperty extends Property {

   public MutableProperty() {}

   public MutableProperty(Property p) {
      this.setID(p.getID());
      this.setType(p.getType());
      this.setValue(p.getValue());
   }

   public void setID(long id) {
      this.id = id;
   }

   public void setType(long type) {
      this.type = type;
   }

   public void setValue(Object value) {
      this.value = value;
   }

   public int write(OutputStream out, int codepage) throws IOException, WritingNotSupportedException {
      byte length = 0;
      long variantType = this.getType();
      if(codepage == 1200 && variantType == 30L) {
         variantType = 31L;
      }

      int length1 = length + TypeWriter.writeUIntToStream(out, variantType);
      length1 += VariantSupport.write(out, variantType, this.getValue(), codepage);
      return length1;
   }
}
