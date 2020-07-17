package org.apache.poi.sl.draw.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.poi.sl.draw.binding.CTPath2DArcTo;
import org.apache.poi.sl.draw.binding.CTPath2DClose;
import org.apache.poi.sl.draw.binding.CTPath2DCubicBezierTo;
import org.apache.poi.sl.draw.binding.CTPath2DLineTo;
import org.apache.poi.sl.draw.binding.CTPath2DMoveTo;
import org.apache.poi.sl.draw.binding.CTPath2DQuadBezierTo;
import org.apache.poi.sl.draw.binding.STPathFillMode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_Path2D",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"closeOrMoveToOrLnTo"}
)
public class CTPath2D {

   @XmlElements({      @XmlElement(
         name = "lnTo",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPath2DLineTo.class
      ),       @XmlElement(
         name = "close",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPath2DClose.class
      ),       @XmlElement(
         name = "cubicBezTo",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPath2DCubicBezierTo.class
      ),       @XmlElement(
         name = "quadBezTo",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPath2DQuadBezierTo.class
      ),       @XmlElement(
         name = "arcTo",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPath2DArcTo.class
      ),       @XmlElement(
         name = "moveTo",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPath2DMoveTo.class
      )})
   protected List closeOrMoveToOrLnTo;
   @XmlAttribute
   protected Long w;
   @XmlAttribute
   protected Long h;
   @XmlAttribute
   protected STPathFillMode fill;
   @XmlAttribute
   protected Boolean stroke;
   @XmlAttribute
   protected Boolean extrusionOk;


   public List getCloseOrMoveToOrLnTo() {
      if(this.closeOrMoveToOrLnTo == null) {
         this.closeOrMoveToOrLnTo = new ArrayList();
      }

      return this.closeOrMoveToOrLnTo;
   }

   public boolean isSetCloseOrMoveToOrLnTo() {
      return this.closeOrMoveToOrLnTo != null && !this.closeOrMoveToOrLnTo.isEmpty();
   }

   public void unsetCloseOrMoveToOrLnTo() {
      this.closeOrMoveToOrLnTo = null;
   }

   public long getW() {
      return this.w == null?0L:this.w.longValue();
   }

   public void setW(long value) {
      this.w = Long.valueOf(value);
   }

   public boolean isSetW() {
      return this.w != null;
   }

   public void unsetW() {
      this.w = null;
   }

   public long getH() {
      return this.h == null?0L:this.h.longValue();
   }

   public void setH(long value) {
      this.h = Long.valueOf(value);
   }

   public boolean isSetH() {
      return this.h != null;
   }

   public void unsetH() {
      this.h = null;
   }

   public STPathFillMode getFill() {
      return this.fill == null?STPathFillMode.NORM:this.fill;
   }

   public void setFill(STPathFillMode value) {
      this.fill = value;
   }

   public boolean isSetFill() {
      return this.fill != null;
   }

   public boolean isStroke() {
      return this.stroke == null?true:this.stroke.booleanValue();
   }

   public void setStroke(boolean value) {
      this.stroke = Boolean.valueOf(value);
   }

   public boolean isSetStroke() {
      return this.stroke != null;
   }

   public void unsetStroke() {
      this.stroke = null;
   }

   public boolean isExtrusionOk() {
      return this.extrusionOk == null?true:this.extrusionOk.booleanValue();
   }

   public void setExtrusionOk(boolean value) {
      this.extrusionOk = Boolean.valueOf(value);
   }

   public boolean isSetExtrusionOk() {
      return this.extrusionOk != null;
   }

   public void unsetExtrusionOk() {
      this.extrusionOk = null;
   }
}
