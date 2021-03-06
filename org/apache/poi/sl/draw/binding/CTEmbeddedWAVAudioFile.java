package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_EmbeddedWAVAudioFile",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
public class CTEmbeddedWAVAudioFile {

   @XmlAttribute(
      namespace = "http://schemas.openxmlformats.org/officeDocument/2006/relationships",
      required = true
   )
   protected String embed;
   @XmlAttribute
   protected String name;
   @XmlAttribute
   protected Boolean builtIn;


   public String getEmbed() {
      return this.embed;
   }

   public void setEmbed(String value) {
      this.embed = value;
   }

   public boolean isSetEmbed() {
      return this.embed != null;
   }

   public String getName() {
      return this.name == null?"":this.name;
   }

   public void setName(String value) {
      this.name = value;
   }

   public boolean isSetName() {
      return this.name != null;
   }

   public boolean isBuiltIn() {
      return this.builtIn == null?false:this.builtIn.booleanValue();
   }

   public void setBuiltIn(boolean value) {
      this.builtIn = Boolean.valueOf(value);
   }

   public boolean isSetBuiltIn() {
      return this.builtIn != null;
   }

   public void unsetBuiltIn() {
      this.builtIn = null;
   }
}
