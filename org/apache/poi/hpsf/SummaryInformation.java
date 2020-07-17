package org.apache.poi.hpsf;

import org.apache.poi.hpsf.MutableSection;
import org.apache.poi.hpsf.PropertySet;
import org.apache.poi.hpsf.SpecialPropertySet;
import org.apache.poi.hpsf.Thumbnail;
import org.apache.poi.hpsf.UnexpectedPropertySetTypeException;
import org.apache.poi.hpsf.Util;
import org.apache.poi.hpsf.wellknown.PropertyIDMap;

public final class SummaryInformation extends SpecialPropertySet {

   public static final String DEFAULT_STREAM_NAME = "SummaryInformation";


   public PropertyIDMap getPropertySetIDMap() {
      return PropertyIDMap.getSummaryInformationProperties();
   }

   public SummaryInformation(PropertySet ps) throws UnexpectedPropertySetTypeException {
      super(ps);
      if(!this.isSummaryInformation()) {
         throw new UnexpectedPropertySetTypeException("Not a " + this.getClass().getName());
      }
   }

   public String getTitle() {
      return this.getPropertyStringValue(2);
   }

   public void setTitle(String title) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(2, title);
   }

   public void removeTitle() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(2L);
   }

   public String getSubject() {
      return this.getPropertyStringValue(3);
   }

   public void setSubject(String subject) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(3, subject);
   }

   public void removeSubject() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(3L);
   }

   public String getAuthor() {
      return this.getPropertyStringValue(4);
   }

   public void setAuthor(String author) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(4, author);
   }

   public void removeAuthor() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(4L);
   }

   public String getKeywords() {
      return this.getPropertyStringValue(5);
   }

   public void setKeywords(String keywords) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(5, keywords);
   }

   public void removeKeywords() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(5L);
   }

   public String getComments() {
      return this.getPropertyStringValue(6);
   }

   public void setComments(String comments) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(6, comments);
   }

   public void removeComments() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(6L);
   }

   public String getTemplate() {
      return this.getPropertyStringValue(7);
   }

   public void setTemplate(String template) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(7, template);
   }

   public void removeTemplate() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(7L);
   }

   public String getLastAuthor() {
      return this.getPropertyStringValue(8);
   }

   public void setLastAuthor(String lastAuthor) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(8, lastAuthor);
   }

   public void removeLastAuthor() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(8L);
   }

   public String getRevNumber() {
      return this.getPropertyStringValue(9);
   }

   public void setRevNumber(String revNumber) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(9, revNumber);
   }

   public void removeRevNumber() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(9L);
   }

   public long getEditTime() {
      java.util.Date d = (java.util.Date)this.getProperty(10);
      return d == null?0L:Util.dateToFileTime(d);
   }

   public void setEditTime(long time) {
      java.util.Date d = Util.filetimeToDate(time);
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(10, 64L, d);
   }

   public void removeEditTime() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(10L);
   }

   public java.util.Date getLastPrinted() {
      return (java.util.Date)this.getProperty(11);
   }

   public void setLastPrinted(java.util.Date lastPrinted) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(11, 64L, lastPrinted);
   }

   public void removeLastPrinted() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(11L);
   }

   public java.util.Date getCreateDateTime() {
      return (java.util.Date)this.getProperty(12);
   }

   public void setCreateDateTime(java.util.Date createDateTime) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(12, 64L, createDateTime);
   }

   public void removeCreateDateTime() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(12L);
   }

   public java.util.Date getLastSaveDateTime() {
      return (java.util.Date)this.getProperty(13);
   }

   public void setLastSaveDateTime(java.util.Date time) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(13, 64L, time);
   }

   public void removeLastSaveDateTime() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(13L);
   }

   public int getPageCount() {
      return this.getPropertyIntValue(14);
   }

   public void setPageCount(int pageCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(14, pageCount);
   }

   public void removePageCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(14L);
   }

   public int getWordCount() {
      return this.getPropertyIntValue(15);
   }

   public void setWordCount(int wordCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(15, wordCount);
   }

   public void removeWordCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(15L);
   }

   public int getCharCount() {
      return this.getPropertyIntValue(16);
   }

   public void setCharCount(int charCount) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(16, charCount);
   }

   public void removeCharCount() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(16L);
   }

   public byte[] getThumbnail() {
      return (byte[])((byte[])this.getProperty(17));
   }

   public Thumbnail getThumbnailThumbnail() {
      byte[] data = this.getThumbnail();
      return data == null?null:new Thumbnail(data);
   }

   public void setThumbnail(byte[] thumbnail) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(17, 30L, thumbnail);
   }

   public void removeThumbnail() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(17L);
   }

   public String getApplicationName() {
      return this.getPropertyStringValue(18);
   }

   public void setApplicationName(String applicationName) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(18, applicationName);
   }

   public void removeApplicationName() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(18L);
   }

   public int getSecurity() {
      return this.getPropertyIntValue(19);
   }

   public void setSecurity(int security) {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.setProperty(19, security);
   }

   public void removeSecurity() {
      MutableSection s = (MutableSection)this.getFirstSection();
      s.removeProperty(19L);
   }
}
