package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.hpsf.MutablePropertySet;
import org.apache.poi.hpsf.NoSingleSectionException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.PropertySet;
import org.apache.poi.hpsf.Section;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.apache.poi.hpsf.wellknown.PropertyIDMap;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.util.LittleEndian;

public abstract class SpecialPropertySet extends MutablePropertySet {

   private final MutablePropertySet delegate;


   public abstract PropertyIDMap getPropertySetIDMap();

   public SpecialPropertySet(PropertySet ps) {
      this.delegate = new MutablePropertySet(ps);
   }

   public SpecialPropertySet(MutablePropertySet ps) {
      this.delegate = ps;
   }

   public int getByteOrder() {
      return this.delegate.getByteOrder();
   }

   public int getFormat() {
      return this.delegate.getFormat();
   }

   public int getOSVersion() {
      return this.delegate.getOSVersion();
   }

   public ClassID getClassID() {
      return this.delegate.getClassID();
   }

   public int getSectionCount() {
      return this.delegate.getSectionCount();
   }

   public List getSections() {
      return this.delegate.getSections();
   }

   public boolean isSummaryInformation() {
      return this.delegate.isSummaryInformation();
   }

   public boolean isDocumentSummaryInformation() {
      return this.delegate.isDocumentSummaryInformation();
   }

   public Section getFirstSection() {
      return this.delegate.getFirstSection();
   }

   public void addSection(Section section) {
      this.delegate.addSection(section);
   }

   public void clearSections() {
      this.delegate.clearSections();
   }

   public void setByteOrder(int byteOrder) {
      this.delegate.setByteOrder(byteOrder);
   }

   public void setClassID(ClassID classID) {
      this.delegate.setClassID(classID);
   }

   public void setFormat(int format) {
      this.delegate.setFormat(format);
   }

   public void setOSVersion(int osVersion) {
      this.delegate.setOSVersion(osVersion);
   }

   public InputStream toInputStream() throws IOException, WritingNotSupportedException {
      return this.delegate.toInputStream();
   }

   public void write(DirectoryEntry dir, String name) throws WritingNotSupportedException, IOException {
      this.delegate.write(dir, name);
   }

   public void write(OutputStream out) throws WritingNotSupportedException, IOException {
      this.delegate.write(out);
   }

   public boolean equals(Object o) {
      return this.delegate.equals(o);
   }

   public Property[] getProperties() throws NoSingleSectionException {
      return this.delegate.getProperties();
   }

   protected Object getProperty(int id) throws NoSingleSectionException {
      return this.delegate.getProperty(id);
   }

   protected boolean getPropertyBooleanValue(int id) throws NoSingleSectionException {
      return this.delegate.getPropertyBooleanValue(id);
   }

   protected int getPropertyIntValue(int id) throws NoSingleSectionException {
      return this.delegate.getPropertyIntValue(id);
   }

   protected String getPropertyStringValue(int propertyId) {
      Object propertyValue = this.getProperty(propertyId);
      return getPropertyStringValue(propertyValue);
   }

   protected static String getPropertyStringValue(Object propertyValue) {
      if(propertyValue == null) {
         return null;
      } else if(propertyValue instanceof String) {
         return (String)propertyValue;
      } else if(propertyValue instanceof byte[]) {
         byte[] b = (byte[])((byte[])propertyValue);
         return b.length == 0?"":(b.length == 1?Byte.toString(b[0]):(b.length == 2?Integer.toString(LittleEndian.getUShort(b)):(b.length == 4?Long.toString(LittleEndian.getUInt(b)):new String(b, Charset.forName("ASCII")))));
      } else {
         return propertyValue.toString();
      }
   }

   public int hashCode() {
      return this.delegate.hashCode();
   }

   public String toString() {
      return this.delegate.toString();
   }

   public boolean wasNull() throws NoSingleSectionException {
      return this.delegate.wasNull();
   }
}
