package org.apache.poi.sl.draw.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_ScRgbColor",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"egColorTransform"}
)
public class CTScRgbColor {

   @XmlElementRefs({      @XmlElementRef(
         name = "sat",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "lumOff",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "lumMod",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "satMod",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "gray",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "tint",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "alphaMod",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "gamma",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "blue",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "alphaOff",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "comp",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "shade",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "redOff",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "red",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "satOff",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "blueOff",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "green",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "hue",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "greenOff",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "alpha",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "lum",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "inv",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "hueOff",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "invGamma",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "greenMod",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "redMod",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "hueMod",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      ),       @XmlElementRef(
         name = "blueMod",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = JAXBElement.class
      )})
   protected List egColorTransform;
   @XmlAttribute(
      required = true
   )
   protected int r;
   @XmlAttribute(
      required = true
   )
   protected int g;
   @XmlAttribute(
      required = true
   )
   protected int b;


   public List getEGColorTransform() {
      if(this.egColorTransform == null) {
         this.egColorTransform = new ArrayList();
      }

      return this.egColorTransform;
   }

   public boolean isSetEGColorTransform() {
      return this.egColorTransform != null && !this.egColorTransform.isEmpty();
   }

   public void unsetEGColorTransform() {
      this.egColorTransform = null;
   }

   public int getR() {
      return this.r;
   }

   public void setR(int value) {
      this.r = value;
   }

   public boolean isSetR() {
      return true;
   }

   public int getG() {
      return this.g;
   }

   public void setG(int value) {
      this.g = value;
   }

   public boolean isSetG() {
      return true;
   }

   public int getB() {
      return this.b;
   }

   public void setB(int value) {
      this.b = value;
   }

   public boolean isSetB() {
      return true;
   }
}
