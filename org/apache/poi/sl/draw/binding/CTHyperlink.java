package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.poi.sl.draw.binding.CTEmbeddedWAVAudioFile;
import org.apache.poi.sl.draw.binding.CTOfficeArtExtensionList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_Hyperlink",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"snd", "extLst"}
)
public class CTHyperlink {

   @XmlElement(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
   )
   protected CTEmbeddedWAVAudioFile snd;
   @XmlElement(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
   )
   protected CTOfficeArtExtensionList extLst;
   @XmlAttribute(
      namespace = "http://schemas.openxmlformats.org/officeDocument/2006/relationships"
   )
   protected String id;
   @XmlAttribute
   protected String invalidUrl;
   @XmlAttribute
   protected String action;
   @XmlAttribute
   protected String tgtFrame;
   @XmlAttribute
   protected String tooltip;
   @XmlAttribute
   protected Boolean history;
   @XmlAttribute
   protected Boolean highlightClick;
   @XmlAttribute
   protected Boolean endSnd;


   public CTEmbeddedWAVAudioFile getSnd() {
      return this.snd;
   }

   public void setSnd(CTEmbeddedWAVAudioFile value) {
      this.snd = value;
   }

   public boolean isSetSnd() {
      return this.snd != null;
   }

   public CTOfficeArtExtensionList getExtLst() {
      return this.extLst;
   }

   public void setExtLst(CTOfficeArtExtensionList value) {
      this.extLst = value;
   }

   public boolean isSetExtLst() {
      return this.extLst != null;
   }

   public String getId() {
      return this.id;
   }

   public void setId(String value) {
      this.id = value;
   }

   public boolean isSetId() {
      return this.id != null;
   }

   public String getInvalidUrl() {
      return this.invalidUrl == null?"":this.invalidUrl;
   }

   public void setInvalidUrl(String value) {
      this.invalidUrl = value;
   }

   public boolean isSetInvalidUrl() {
      return this.invalidUrl != null;
   }

   public String getAction() {
      return this.action == null?"":this.action;
   }

   public void setAction(String value) {
      this.action = value;
   }

   public boolean isSetAction() {
      return this.action != null;
   }

   public String getTgtFrame() {
      return this.tgtFrame == null?"":this.tgtFrame;
   }

   public void setTgtFrame(String value) {
      this.tgtFrame = value;
   }

   public boolean isSetTgtFrame() {
      return this.tgtFrame != null;
   }

   public String getTooltip() {
      return this.tooltip == null?"":this.tooltip;
   }

   public void setTooltip(String value) {
      this.tooltip = value;
   }

   public boolean isSetTooltip() {
      return this.tooltip != null;
   }

   public boolean isHistory() {
      return this.history == null?true:this.history.booleanValue();
   }

   public void setHistory(boolean value) {
      this.history = Boolean.valueOf(value);
   }

   public boolean isSetHistory() {
      return this.history != null;
   }

   public void unsetHistory() {
      this.history = null;
   }

   public boolean isHighlightClick() {
      return this.highlightClick == null?false:this.highlightClick.booleanValue();
   }

   public void setHighlightClick(boolean value) {
      this.highlightClick = Boolean.valueOf(value);
   }

   public boolean isSetHighlightClick() {
      return this.highlightClick != null;
   }

   public void unsetHighlightClick() {
      this.highlightClick = null;
   }

   public boolean isEndSnd() {
      return this.endSnd == null?false:this.endSnd.booleanValue();
   }

   public void setEndSnd(boolean value) {
      this.endSnd = Boolean.valueOf(value);
   }

   public boolean isSetEndSnd() {
      return this.endSnd != null;
   }

   public void unsetEndSnd() {
      this.endSnd = null;
   }
}
