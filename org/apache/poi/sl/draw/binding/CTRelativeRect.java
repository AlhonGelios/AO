package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_RelativeRect",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
public class CTRelativeRect {

   @XmlAttribute
   protected Integer l;
   @XmlAttribute
   protected Integer t;
   @XmlAttribute
   protected Integer r;
   @XmlAttribute
   protected Integer b;


   public int getL() {
      return this.l == null?0:this.l.intValue();
   }

   public void setL(int value) {
      this.l = Integer.valueOf(value);
   }

   public boolean isSetL() {
      return this.l != null;
   }

   public void unsetL() {
      this.l = null;
   }

   public int getT() {
      return this.t == null?0:this.t.intValue();
   }

   public void setT(int value) {
      this.t = Integer.valueOf(value);
   }

   public boolean isSetT() {
      return this.t != null;
   }

   public void unsetT() {
      this.t = null;
   }

   public int getR() {
      return this.r == null?0:this.r.intValue();
   }

   public void setR(int value) {
      this.r = Integer.valueOf(value);
   }

   public boolean isSetR() {
      return this.r != null;
   }

   public void unsetR() {
      this.r = null;
   }

   public int getB() {
      return this.b == null?0:this.b.intValue();
   }

   public void setB(int value) {
      this.b = Integer.valueOf(value);
   }

   public boolean isSetB() {
      return this.b != null;
   }

   public void unsetB() {
      this.b = null;
   }
}
