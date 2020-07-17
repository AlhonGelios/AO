package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.poi.sl.draw.binding.CTPoint2D;
import org.apache.poi.sl.draw.binding.CTPositiveSize2D;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_Transform2D",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"off", "ext"}
)
public class CTTransform2D {

   @XmlElement(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
   )
   protected CTPoint2D off;
   @XmlElement(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
   )
   protected CTPositiveSize2D ext;
   @XmlAttribute
   protected Integer rot;
   @XmlAttribute
   protected Boolean flipH;
   @XmlAttribute
   protected Boolean flipV;


   public CTPoint2D getOff() {
      return this.off;
   }

   public void setOff(CTPoint2D value) {
      this.off = value;
   }

   public boolean isSetOff() {
      return this.off != null;
   }

   public CTPositiveSize2D getExt() {
      return this.ext;
   }

   public void setExt(CTPositiveSize2D value) {
      this.ext = value;
   }

   public boolean isSetExt() {
      return this.ext != null;
   }

   public int getRot() {
      return this.rot == null?0:this.rot.intValue();
   }

   public void setRot(int value) {
      this.rot = Integer.valueOf(value);
   }

   public boolean isSetRot() {
      return this.rot != null;
   }

   public void unsetRot() {
      this.rot = null;
   }

   public boolean isFlipH() {
      return this.flipH == null?false:this.flipH.booleanValue();
   }

   public void setFlipH(boolean value) {
      this.flipH = Boolean.valueOf(value);
   }

   public boolean isSetFlipH() {
      return this.flipH != null;
   }

   public void unsetFlipH() {
      this.flipH = null;
   }

   public boolean isFlipV() {
      return this.flipV == null?false:this.flipV.booleanValue();
   }

   public void setFlipV(boolean value) {
      this.flipV = Boolean.valueOf(value);
   }

   public boolean isSetFlipV() {
      return this.flipV != null;
   }

   public void unsetFlipV() {
      this.flipV = null;
   }
}
