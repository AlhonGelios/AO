package org.apache.poi.hpsf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.hpsf.HPSFRuntimeException;
import org.apache.poi.hpsf.IllegalPropertySetDataException;
import org.apache.poi.hpsf.MutableProperty;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.Section;
import org.apache.poi.hpsf.TypeWriter;
import org.apache.poi.hpsf.Util;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.apache.poi.util.CodePageUtil;

public class MutableSection extends Section {

   private boolean dirty = true;
   private List preprops;
   private byte[] sectionBytes;


   public MutableSection() {
      this.dirty = true;
      this.formatID = null;
      this.offset = -1L;
      this.preprops = new LinkedList();
   }

   public MutableSection(Section s) {
      this.setFormatID(s.getFormatID());
      Property[] pa = s.getProperties();
      MutableProperty[] mpa = new MutableProperty[pa.length];

      for(int i = 0; i < pa.length; ++i) {
         mpa[i] = new MutableProperty(pa[i]);
      }

      this.setProperties(mpa);
      this.setDictionary(s.getDictionary());
   }

   public void setFormatID(ClassID formatID) {
      this.formatID = formatID;
   }

   public void setFormatID(byte[] formatID) {
      ClassID fid = this.getFormatID();
      if(fid == null) {
         fid = new ClassID();
         this.setFormatID(fid);
      }

      fid.setBytes(formatID);
   }

   public void setProperties(Property[] properties) {
      this.properties = properties;
      this.preprops = new LinkedList();

      for(int i = 0; i < properties.length; ++i) {
         this.preprops.add(properties[i]);
      }

      this.dirty = true;
   }

   public void setProperty(int id, String value) {
      this.setProperty(id, 31L, value);
      this.dirty = true;
   }

   public void setProperty(int id, int value) {
      this.setProperty(id, 3L, Integer.valueOf(value));
      this.dirty = true;
   }

   public void setProperty(int id, long value) {
      this.setProperty(id, 20L, Long.valueOf(value));
      this.dirty = true;
   }

   public void setProperty(int id, boolean value) {
      this.setProperty(id, 11L, Boolean.valueOf(value));
      this.dirty = true;
   }

   public void setProperty(int id, long variantType, Object value) {
      MutableProperty p = new MutableProperty();
      p.setID((long)id);
      p.setType(variantType);
      p.setValue(value);
      this.setProperty(p);
      this.dirty = true;
   }

   public void setProperty(Property p) {
      long id = p.getID();
      this.removeProperty(id);
      this.preprops.add(p);
      this.dirty = true;
   }

   public void removeProperty(long id) {
      Iterator i = this.preprops.iterator();

      while(i.hasNext()) {
         if(((Property)i.next()).getID() == id) {
            i.remove();
            break;
         }
      }

      this.dirty = true;
   }

   protected void setPropertyBooleanValue(int id, boolean value) {
      this.setProperty(id, 11L, Boolean.valueOf(value));
   }

   public int getSize() {
      if(this.dirty) {
         try {
            this.size = this.calcSize();
            this.dirty = false;
         } catch (HPSFRuntimeException var2) {
            throw var2;
         } catch (Exception var3) {
            throw new HPSFRuntimeException(var3);
         }
      }

      return this.size;
   }

   private int calcSize() throws WritingNotSupportedException, IOException {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      this.write(out);
      out.close();
      this.sectionBytes = Util.pad4(out.toByteArray());
      return this.sectionBytes.length;
   }

   public int write(OutputStream out) throws WritingNotSupportedException, IOException {
      if(!this.dirty && this.sectionBytes != null) {
         out.write(this.sectionBytes);
         return this.sectionBytes.length;
      } else {
         ByteArrayOutputStream propertyStream = new ByteArrayOutputStream();
         ByteArrayOutputStream propertyListStream = new ByteArrayOutputStream();
         byte position = 0;
         int position1 = position + 8 + this.getPropertyCount() * 2 * 4;
         int codepage = -1;
         if(this.getProperty(0L) != null) {
            Object pb1 = this.getProperty(1L);
            if(pb1 != null) {
               if(!(pb1 instanceof Integer)) {
                  throw new IllegalPropertySetDataException("The codepage property (ID = 1) must be an Integer object.");
               }
            } else {
               this.setProperty(1, 2L, Integer.valueOf(1200));
            }

            codepage = this.getCodepage();
         }

         Collections.sort(this.preprops, new Comparator() {
            public int compare(Property p1, Property p2) {
               return p1.getID() < p2.getID()?-1:(p1.getID() == p2.getID()?0:1);
            }
         });
         ListIterator pb11 = this.preprops.listIterator();

         while(pb11.hasNext()) {
            MutableProperty pb2 = (MutableProperty)pb11.next();
            long streamLength = pb2.getID();
            TypeWriter.writeUIntToStream(propertyListStream, pb2.getID());
            TypeWriter.writeUIntToStream(propertyListStream, (long)position1);
            if(streamLength != 0L) {
               position1 += pb2.write(propertyStream, this.getCodepage());
            } else {
               if(codepage == -1) {
                  throw new IllegalPropertySetDataException("Codepage (property 1) is undefined.");
               }

               position1 += writeDictionary(propertyStream, this.dictionary, codepage);
            }
         }

         propertyStream.close();
         propertyListStream.close();
         byte[] pb12 = propertyListStream.toByteArray();
         byte[] pb21 = propertyStream.toByteArray();
         TypeWriter.writeToStream(out, 8 + pb12.length + pb21.length);
         TypeWriter.writeToStream(out, this.getPropertyCount());
         out.write(pb12);
         out.write(pb21);
         int streamLength1 = 8 + pb12.length + pb21.length;
         return streamLength1;
      }
   }

   private static int writeDictionary(OutputStream out, Map dictionary, int codepage) throws IOException {
      int length = TypeWriter.writeUIntToStream(out, (long)dictionary.size());
      Iterator i$ = dictionary.entrySet().iterator();

      while(i$.hasNext()) {
         Entry ls = (Entry)i$.next();
         Long key = (Long)ls.getKey();
         String value = (String)ls.getValue();
         if(codepage == 1200) {
            int var11 = value.length() + 1;
            if((var11 & 1) == 1) {
               ++var11;
            }

            length += TypeWriter.writeUIntToStream(out, key.longValue());
            length += TypeWriter.writeUIntToStream(out, (long)var11);
            byte[] var12 = CodePageUtil.getBytesInCodePage(value, codepage);

            for(int j1 = 2; j1 < var12.length; j1 += 2) {
               out.write(var12[j1 + 1]);
               out.write(var12[j1]);
               length += 2;
            }

            for(var11 -= value.length(); var11 > 0; --var11) {
               out.write(0);
               out.write(0);
               length += 2;
            }
         } else {
            length += TypeWriter.writeUIntToStream(out, key.longValue());
            length += TypeWriter.writeUIntToStream(out, (long)(value.length() + 1));
            byte[] ba = CodePageUtil.getBytesInCodePage(value, codepage);

            for(int j = 0; j < ba.length; ++j) {
               out.write(ba[j]);
               ++length;
            }

            out.write(0);
            ++length;
         }
      }

      return length;
   }

   public int getPropertyCount() {
      return this.preprops.size();
   }

   public Property[] getProperties() {
      this.properties = (Property[])this.preprops.toArray(new Property[0]);
      return this.properties;
   }

   public Object getProperty(long id) {
      this.getProperties();
      return super.getProperty(id);
   }

   public void setDictionary(Map dictionary) throws IllegalPropertySetDataException {
      if(dictionary != null) {
         this.dictionary = dictionary;
         this.setProperty(0, -1L, dictionary);
         Integer codepage = (Integer)this.getProperty(1L);
         if(codepage == null) {
            this.setProperty(1, 2L, Integer.valueOf(1200));
         }
      } else {
         this.removeProperty(0L);
      }

   }

   public void setProperty(int id, Object value) {
      if(value instanceof String) {
         this.setProperty(id, (String)value);
      } else if(value instanceof Long) {
         this.setProperty(id, ((Long)value).longValue());
      } else if(value instanceof Integer) {
         this.setProperty(id, ((Integer)value).intValue());
      } else if(value instanceof Short) {
         this.setProperty(id, ((Short)value).intValue());
      } else if(value instanceof Boolean) {
         this.setProperty(id, ((Boolean)value).booleanValue());
      } else {
         if(!(value instanceof java.util.Date)) {
            throw new HPSFRuntimeException("HPSF does not support properties of type " + value.getClass().getName() + ".");
         }

         this.setProperty(id, 64L, value);
      }

   }

   public void clear() {
      Property[] properties = this.getProperties();

      for(int i = 0; i < properties.length; ++i) {
         Property p = properties[i];
         this.removeProperty(p.getID());
      }

   }

   public void setCodepage(int codepage) {
      this.setProperty(1, 2L, Integer.valueOf(codepage));
   }
}
