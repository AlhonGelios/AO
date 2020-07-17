package org.apache.poi.hpsf;

import java.util.Iterator;
import java.util.Map;
import org.apache.poi.hpsf.CustomProperties;
import org.apache.poi.hpsf.CustomProperty;
import org.apache.poi.hpsf.HPSFRuntimeException;
import org.apache.poi.hpsf.MutableSection;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.PropertySet;
import org.apache.poi.hpsf.Section;
import org.apache.poi.hpsf.SpecialPropertySet;
import org.apache.poi.hpsf.UnexpectedPropertySetTypeException;
import org.apache.poi.hpsf.wellknown.PropertyIDMap;
import org.apache.poi.hpsf.wellknown.SectionIDMap;

public class DocumentSummaryInformation extends SpecialPropertySet {

   public static final String DEFAULT_STREAM_NAME = "DocumentSummaryInformation";


   public PropertyIDMap getPropertySetIDMap() {
      return PropertyIDMap.getDocumentSummaryInformationProperties();
   }

   public DocumentSummaryInformation(PropertySet ps) throws UnexpectedPropertySetTypeException {
      super(ps);
      if(!this.isDocumentSummaryInformation()) {
         throw new UnexpectedPropertySetTypeException("Not a " + this.getClass().getName());
      }
   }

   public String getCategory() {
      return this.getPropertyStringValue(2);
   }

   public void setCategory(String category) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(2, category);
   }

   public void removeCategory() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(2L);
   }

   public String getPresentationFormat() {
      return this.getPropertyStringValue(3);
   }

   public void setPresentationFormat(String presentationFormat) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(3, presentationFormat);
   }

   public void removePresentationFormat() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(3L);
   }

   public int getByteCount() {
      return this.getPropertyIntValue(4);
   }

   public void setByteCount(int byteCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(4, byteCount);
   }

   public void removeByteCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(4L);
   }

   public int getLineCount() {
      return this.getPropertyIntValue(5);
   }

   public void setLineCount(int lineCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(5, lineCount);
   }

   public void removeLineCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(5L);
   }

   public int getParCount() {
      return this.getPropertyIntValue(6);
   }

   public void setParCount(int parCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(6, parCount);
   }

   public void removeParCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(6L);
   }

   public int getSlideCount() {
      return this.getPropertyIntValue(7);
   }

   public void setSlideCount(int slideCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(7, slideCount);
   }

   public void removeSlideCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(7L);
   }

   public int getNoteCount() {
      return this.getPropertyIntValue(8);
   }

   public void setNoteCount(int noteCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(8, noteCount);
   }

   public void removeNoteCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(8L);
   }

   public int getHiddenCount() {
      return this.getPropertyIntValue(9);
   }

   public void setHiddenCount(int hiddenCount) {
      MutableSection s = (MutableSection)this.getSections().get(0);
      s.setProperty(9, hiddenCount);
   }

   public void removeHiddenCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(9L);
   }

   public int getMMClipCount() {
      return this.getPropertyIntValue(10);
   }

   public void setMMClipCount(int mmClipCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(10, mmClipCount);
   }

   public void removeMMClipCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(10L);
   }

   public boolean getScale() {
      return this.getPropertyBooleanValue(11);
   }

   public void setScale(boolean scale) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(11, scale);
   }

   public void removeScale() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(11L);
   }

   public byte[] getHeadingPair() {
      this.notYetImplemented("Reading byte arrays ");
      return (byte[])((byte[])this.getProperty(12));
   }

   public void setHeadingPair(byte[] headingPair) {
      this.notYetImplemented("Writing byte arrays ");
   }

   public void removeHeadingPair() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(12L);
   }

   public byte[] getDocparts() {
      this.notYetImplemented("Reading byte arrays");
      return (byte[])((byte[])this.getProperty(13));
   }

   public void setDocparts(byte[] docparts) {
      this.notYetImplemented("Writing byte arrays");
   }

   public void removeDocparts() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(13L);
   }

   public String getManager() {
      return this.getPropertyStringValue(14);
   }

   public void setManager(String manager) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(14, manager);
   }

   public void removeManager() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(14L);
   }

   public String getCompany() {
      return this.getPropertyStringValue(15);
   }

   public void setCompany(String company) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(15, company);
   }

   public void removeCompany() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(15L);
   }

   public boolean getLinksDirty() {
      return this.getPropertyBooleanValue(16);
   }

   public void setLinksDirty(boolean linksDirty) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(16, linksDirty);
   }

   public void removeLinksDirty() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(16L);
   }

   public int getCharCountWithSpaces() {
      return this.getPropertyIntValue(17);
   }

   public void setCharCountWithSpaces(int count) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(17, count);
   }

   public void removeCharCountWithSpaces() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(17L);
   }

   public boolean getHyperlinksChanged() {
      return this.getPropertyBooleanValue(22);
   }

   public void setHyperlinksChanged(boolean changed) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(22, changed);
   }

   public void removeHyperlinksChanged() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(22L);
   }

   public int getApplicationVersion() {
      return this.getPropertyIntValue(23);
   }

   public void setApplicationVersion(int version) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(23, version);
   }

   public void removeApplicationVersion() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(23L);
   }

   public byte[] getVBADigitalSignature() {
      Object value = this.getProperty(24);
      return value != null && value instanceof byte[]?(byte[])((byte[])value):null;
   }

   public void setVBADigitalSignature(byte[] signature) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(24, (Object)signature);
   }

   public void removeVBADigitalSignature() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(24L);
   }

   public String getContentType() {
      return this.getPropertyStringValue(26);
   }

   public void setContentType(String type) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(26, type);
   }

   public void removeContentType() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(26L);
   }

   public String getContentStatus() {
      return this.getPropertyStringValue(27);
   }

   public void setContentStatus(String status) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(27, status);
   }

   public void removeContentStatus() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(27L);
   }

   public String getLanguage() {
      return this.getPropertyStringValue(28);
   }

   public void setLanguage(String language) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(28, language);
   }

   public void removeLanguage() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(28L);
   }

   public String getDocumentVersion() {
      return this.getPropertyStringValue(29);
   }

   public void setDocumentVersion(String version) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(29, version);
   }

   public void removeDocumentVersion() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(29L);
   }

   public CustomProperties getCustomProperties() {
      CustomProperties cps = null;
      if(this.getSectionCount() >= 2) {
         cps = new CustomProperties();
         Section section = (Section)this.getSections().get(1);
         Map dictionary = section.getDictionary();
         Property[] properties = section.getProperties();
         int propertyCount = 0;

         for(int i = 0; i < properties.length; ++i) {
            Property p = properties[i];
            long id = p.getID();
            if(id != 0L && id != 1L) {
               ++propertyCount;
               CustomProperty cp = new CustomProperty(p, (String)dictionary.get(Long.valueOf(id)));
               cps.put(cp.getName(), cp);
            }
         }

         if(cps.size() != propertyCount) {
            cps.setPure(false);
         }
      }

      return cps;
   }

   public void setCustomProperties(CustomProperties customProperties) {
      this.ensureSection2();
      MutableSection section = (MutableSection)this.getSections().get(1);
      Map dictionary = customProperties.getDictionary();
      section.clear();
      int cpCodepage = customProperties.getCodepage();
      if(cpCodepage < 0) {
         cpCodepage = section.getCodepage();
      }

      if(cpCodepage < 0) {
         cpCodepage = 1200;
      }

      customProperties.setCodepage(cpCodepage);
      section.setCodepage(cpCodepage);
      section.setDictionary(dictionary);
      Iterator i = customProperties.values().iterator();

      while(i.hasNext()) {
         Property p = (Property)i.next();
         section.setProperty(p);
      }

   }

   private void ensureSection2() {
      if(this.getSectionCount() < 2) {
         MutableSection s2 = new MutableSection();
         s2.setFormatID(SectionIDMap.DOCUMENT_SUMMARY_INFORMATION_ID[1]);
         this.addSection(s2);
      }

   }

   public void removeCustomProperties() {
      if(this.getSectionCount() >= 2) {
         this.getSections().remove(1);
      } else {
         throw new HPSFRuntimeException("Illegal internal format of Document SummaryInformation stream: second section is missing.");
      }
   }

   private void notYetImplemented(String msg) {
      throw new UnsupportedOperationException(msg + " is not yet implemented.");
   }
}
