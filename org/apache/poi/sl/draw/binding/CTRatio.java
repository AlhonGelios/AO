package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_Ratio",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
public class CTRatio {

   @XmlAttribute(
      required = true
   )
   protected long n;
   @XmlAttribute(
      required = true
   )
   protected long d;


   public long getN() {
      return this.n;
   }

   public void setN(long value) {
      this.n = value;
   }

   public boolean isSetN() {
      return true;
   }

   public long getD() {
      return this.d;
   }

   public void setD(long value) {
      this.d = value;
   }

   public boolean isSetD() {
      return true;
   }
}
