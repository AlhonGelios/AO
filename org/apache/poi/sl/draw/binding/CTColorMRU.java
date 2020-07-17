package org.apache.poi.sl.draw.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.poi.sl.draw.binding.CTHslColor;
import org.apache.poi.sl.draw.binding.CTPresetColor;
import org.apache.poi.sl.draw.binding.CTSRgbColor;
import org.apache.poi.sl.draw.binding.CTScRgbColor;
import org.apache.poi.sl.draw.binding.CTSchemeColor;
import org.apache.poi.sl.draw.binding.CTSystemColor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_ColorMRU",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"egColorChoice"}
)
public class CTColorMRU {

   @XmlElements({      @XmlElement(
         name = "prstClr",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPresetColor.class
      ),       @XmlElement(
         name = "sysClr",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTSystemColor.class
      ),       @XmlElement(
         name = "hslClr",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTHslColor.class
      ),       @XmlElement(
         name = "srgbClr",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTSRgbColor.class
      ),       @XmlElement(
         name = "scrgbClr",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTScRgbColor.class
      ),       @XmlElement(
         name = "schemeClr",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTSchemeColor.class
      )})
   protected List egColorChoice;


   public List getEGColorChoice() {
      if(this.egColorChoice == null) {
         this.egColorChoice = new ArrayList();
      }

      return this.egColorChoice;
   }

   public boolean isSetEGColorChoice() {
      return this.egColorChoice != null && !this.egColorChoice.isEmpty();
   }

   public void unsetEGColorChoice() {
      this.egColorChoice = null;
   }
}
