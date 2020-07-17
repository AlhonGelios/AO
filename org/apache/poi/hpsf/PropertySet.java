package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.hpsf.HPSFRuntimeException;
import org.apache.poi.hpsf.MarkUnsupportedException;
import org.apache.poi.hpsf.MissingSectionException;
import org.apache.poi.hpsf.NoPropertySetStreamException;
import org.apache.poi.hpsf.NoSingleSectionException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.Section;
import org.apache.poi.hpsf.Util;
import org.apache.poi.hpsf.wellknown.SectionIDMap;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.LittleEndian;

public class PropertySet {

   static final byte[] BYTE_ORDER_ASSERTION = new byte[]{(byte)-2, (byte)-1};
   protected int byteOrder;
   static final byte[] FORMAT_ASSERTION = new byte[]{(byte)0, (byte)0};
   protected int format;
   protected int osVersion;
   public static final int OS_WIN16 = 0;
   public static final int OS_MACINTOSH = 1;
   public static final int OS_WIN32 = 2;
   protected ClassID classID;
   protected List sections;


   public int getByteOrder() {
      return this.byteOrder;
   }

   public int getFormat() {
      return this.format;
   }

   public int getOSVersion() {
      return this.osVersion;
   }

   public ClassID getClassID() {
      return this.classID;
   }

   public int getSectionCount() {
      return this.sections.size();
   }

   public List getSections() {
      return this.sections;
   }

   protected PropertySet() {}

   public PropertySet(InputStream stream) throws NoPropertySetStreamException, MarkUnsupportedException, IOException, UnsupportedEncodingException {
      if(isPropertySetStream(stream)) {
         int avail = stream.available();
         byte[] buffer = new byte[avail];
         IOUtils.readFully(stream, buffer);
         this.init(buffer, 0, buffer.length);
      } else {
         throw new NoPropertySetStreamException();
      }
   }

   public PropertySet(byte[] stream, int offset, int length) throws NoPropertySetStreamException, UnsupportedEncodingException {
      if(isPropertySetStream(stream, offset, length)) {
         this.init(stream, offset, length);
      } else {
         throw new NoPropertySetStreamException();
      }
   }

   public PropertySet(byte[] stream) throws NoPropertySetStreamException, UnsupportedEncodingException {
      this(stream, 0, stream.length);
   }

   public static boolean isPropertySetStream(InputStream stream) throws MarkUnsupportedException, IOException {
      boolean BUFFER_SIZE = true;
      if(!stream.markSupported()) {
         throw new MarkUnsupportedException(stream.getClass().getName());
      } else {
         stream.mark(50);
         byte[] buffer = new byte[50];
         int bytes = stream.read(buffer, 0, Math.min(buffer.length, stream.available()));
         boolean isPropertySetStream = isPropertySetStream(buffer, 0, bytes);
         stream.reset();
         return isPropertySetStream;
      }
   }

   public static boolean isPropertySetStream(byte[] src, int offset, int length) {
      int byteOrder = LittleEndian.getUShort(src, offset);
      int o = offset + 2;
      byte[] temp = new byte[2];
      LittleEndian.putShort(temp, 0, (short)byteOrder);
      if(!Util.equal(temp, BYTE_ORDER_ASSERTION)) {
         return false;
      } else {
         int format = LittleEndian.getUShort(src, o);
         o += 2;
         temp = new byte[2];
         LittleEndian.putShort(temp, 0, (short)format);
         if(!Util.equal(temp, FORMAT_ASSERTION)) {
            return false;
         } else {
            o += 4;
            o += 16;
            long sectionCount = LittleEndian.getUInt(src, o);
            o += 4;
            return sectionCount >= 0L;
         }
      }
   }

   private void init(byte[] src, int offset, int length) throws UnsupportedEncodingException {
      this.byteOrder = LittleEndian.getUShort(src, offset);
      int o = offset + 2;
      this.format = LittleEndian.getUShort(src, o);
      o += 2;
      this.osVersion = (int)LittleEndian.getUInt(src, o);
      o += 4;
      this.classID = new ClassID(src, o);
      o += 16;
      int sectionCount = LittleEndian.getInt(src, o);
      o += 4;
      if(sectionCount < 0) {
         throw new HPSFRuntimeException("Section count " + sectionCount + " is negative.");
      } else {
         this.sections = new ArrayList(sectionCount);

         for(int i = 0; i < sectionCount; ++i) {
            Section s = new Section(src, o);
            o += 20;
            this.sections.add(s);
         }

      }
   }

   public boolean isSummaryInformation() {
      return this.sections.size() <= 0?false:Util.equal(((Section)this.sections.get(0)).getFormatID().getBytes(), SectionIDMap.SUMMARY_INFORMATION_ID);
   }

   public boolean isDocumentSummaryInformation() {
      return this.sections.size() <= 0?false:Util.equal(((Section)this.sections.get(0)).getFormatID().getBytes(), SectionIDMap.DOCUMENT_SUMMARY_INFORMATION_ID[0]);
   }

   public Property[] getProperties() throws NoSingleSectionException {
      return this.getFirstSection().getProperties();
   }

   protected Object getProperty(int id) throws NoSingleSectionException {
      return this.getFirstSection().getProperty((long)id);
   }

   protected boolean getPropertyBooleanValue(int id) throws NoSingleSectionException {
      return this.getFirstSection().getPropertyBooleanValue(id);
   }

   protected int getPropertyIntValue(int id) throws NoSingleSectionException {
      return this.getFirstSection().getPropertyIntValue((long)id);
   }

   public boolean wasNull() throws NoSingleSectionException {
      return this.getFirstSection().wasNull();
   }

   public Section getFirstSection() {
      if(this.getSectionCount() < 1) {
         throw new MissingSectionException("Property set does not contain any sections.");
      } else {
         return (Section)this.sections.get(0);
      }
   }

   public Section getSingleSection() {
      int sectionCount = this.getSectionCount();
      if(sectionCount != 1) {
         throw new NoSingleSectionException("Property set contains " + sectionCount + " sections.");
      } else {
         return (Section)this.sections.get(0);
      }
   }

   public boolean equals(Object o) {
      if(o != null && o instanceof PropertySet) {
         PropertySet ps = (PropertySet)o;
         int byteOrder1 = ps.getByteOrder();
         int byteOrder2 = this.getByteOrder();
         ClassID classID1 = ps.getClassID();
         ClassID classID2 = this.getClassID();
         int format1 = ps.getFormat();
         int format2 = this.getFormat();
         int osVersion1 = ps.getOSVersion();
         int osVersion2 = this.getOSVersion();
         int sectionCount1 = ps.getSectionCount();
         int sectionCount2 = this.getSectionCount();
         return byteOrder1 == byteOrder2 && classID1.equals(classID2) && format1 == format2 && osVersion1 == osVersion2 && sectionCount1 == sectionCount2?Util.equals((Collection)this.getSections(), (Collection)ps.getSections()):false;
      } else {
         return false;
      }
   }

   public int hashCode() {
      throw new UnsupportedOperationException("FIXME: Not yet implemented.");
   }

   public String toString() {
      StringBuilder b = new StringBuilder();
      int sectionCount = this.getSectionCount();
      b.append(this.getClass().getName());
      b.append('[');
      b.append("byteOrder: ");
      b.append(this.getByteOrder());
      b.append(", classID: ");
      b.append(this.getClassID());
      b.append(", format: ");
      b.append(this.getFormat());
      b.append(", OSVersion: ");
      b.append(this.getOSVersion());
      b.append(", sectionCount: ");
      b.append(sectionCount);
      b.append(", sections: [\n");
      Iterator i$ = this.getSections().iterator();

      while(i$.hasNext()) {
         Section section = (Section)i$.next();
         b.append(section);
      }

      b.append(']');
      b.append(']');
      return b.toString();
   }

}
