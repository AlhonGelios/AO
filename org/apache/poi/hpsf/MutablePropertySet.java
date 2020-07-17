package org.apache.poi.hpsf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.hpsf.HPSFRuntimeException;
import org.apache.poi.hpsf.IllegalPropertySetDataException;
import org.apache.poi.hpsf.MutableSection;
import org.apache.poi.hpsf.NoFormatIDException;
import org.apache.poi.hpsf.PropertySet;
import org.apache.poi.hpsf.Section;
import org.apache.poi.hpsf.TypeWriter;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.util.LittleEndian;

public class MutablePropertySet extends PropertySet {

   private static final int OFFSET_HEADER = BYTE_ORDER_ASSERTION.length + FORMAT_ASSERTION.length + 4 + 16 + 4;


   public MutablePropertySet() {
      this.byteOrder = LittleEndian.getUShort(BYTE_ORDER_ASSERTION);
      this.format = LittleEndian.getUShort(FORMAT_ASSERTION);
      this.osVersion = 133636;
      this.classID = new ClassID();
      this.sections = new LinkedList();
      this.sections.add(new MutableSection());
   }

   public MutablePropertySet(PropertySet ps) {
      this.byteOrder = ps.getByteOrder();
      this.format = ps.getFormat();
      this.osVersion = ps.getOSVersion();
      this.setClassID(ps.getClassID());
      this.clearSections();
      if(this.sections == null) {
         this.sections = new LinkedList();
      }

      Iterator i$ = ps.getSections().iterator();

      while(i$.hasNext()) {
         Section section = (Section)i$.next();
         MutableSection s = new MutableSection(section);
         this.addSection(s);
      }

   }

   public void setByteOrder(int byteOrder) {
      this.byteOrder = byteOrder;
   }

   public void setFormat(int format) {
      this.format = format;
   }

   public void setOSVersion(int osVersion) {
      this.osVersion = osVersion;
   }

   public void setClassID(ClassID classID) {
      this.classID = classID;
   }

   public void clearSections() {
      this.sections = null;
   }

   public void addSection(Section section) {
      if(this.sections == null) {
         this.sections = new LinkedList();
      }

      this.sections.add(section);
   }

   public void write(OutputStream out) throws WritingNotSupportedException, IOException {
      int nrSections = this.sections.size();
      TypeWriter.writeToStream(out, (short)this.getByteOrder());
      TypeWriter.writeToStream(out, (short)this.getFormat());
      TypeWriter.writeToStream(out, this.getOSVersion());
      TypeWriter.writeToStream(out, this.getClassID());
      TypeWriter.writeToStream(out, nrSections);
      int offset = OFFSET_HEADER;
      offset += nrSections * 20;
      Iterator i$ = this.sections.iterator();

      Section section;
      MutableSection s;
      while(i$.hasNext()) {
         section = (Section)i$.next();
         s = (MutableSection)section;
         ClassID formatID = s.getFormatID();
         if(formatID == null) {
            throw new NoFormatIDException();
         }

         TypeWriter.writeToStream(out, s.getFormatID());
         TypeWriter.writeUIntToStream(out, (long)offset);

         try {
            offset += s.getSize();
         } catch (HPSFRuntimeException var11) {
            Throwable cause = var11.getReason();
            if(cause instanceof UnsupportedEncodingException) {
               throw new IllegalPropertySetDataException(cause);
            }

            throw var11;
         }
      }

      offset = offset;

      for(i$ = this.sections.iterator(); i$.hasNext(); offset += s.write(out)) {
         section = (Section)i$.next();
         s = (MutableSection)section;
      }

      out.close();
   }

   public InputStream toInputStream() throws IOException, WritingNotSupportedException {
      ByteArrayOutputStream psStream = new ByteArrayOutputStream();

      try {
         this.write(psStream);
      } finally {
         psStream.close();
      }

      byte[] streamData = psStream.toByteArray();
      return new ByteArrayInputStream(streamData);
   }

   public void write(DirectoryEntry dir, String name) throws WritingNotSupportedException, IOException {
      try {
         Entry e = dir.getEntry(name);
         e.delete();
      } catch (FileNotFoundException var4) {
         ;
      }

      dir.createDocument(name, this.toInputStream());
   }

}
