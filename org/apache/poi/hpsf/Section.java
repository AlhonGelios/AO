package org.apache.poi.hpsf;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.hpsf.HPSFRuntimeException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.Util;
import org.apache.poi.hpsf.wellknown.SectionIDMap;
import org.apache.poi.util.LittleEndian;

public class Section {

   protected Map dictionary;
   protected ClassID formatID;
   protected long offset;
   protected int size;
   protected Property[] properties;
   private boolean wasNull;


   public ClassID getFormatID() {
      return this.formatID;
   }

   public long getOffset() {
      return this.offset;
   }

   public int getSize() {
      return this.size;
   }

   public int getPropertyCount() {
      return this.properties.length;
   }

   public Property[] getProperties() {
      return this.properties;
   }

   protected Section() {}

   public Section(byte[] src, int offset) throws UnsupportedEncodingException {
      this.formatID = new ClassID(src, offset);
      int o1 = offset + 16;
      this.offset = LittleEndian.getUInt(src, o1);
      o1 = (int)this.offset;
      this.size = (int)LittleEndian.getUInt(src, o1);
      o1 += 4;
      int propertyCount = (int)LittleEndian.getUInt(src, o1);
      o1 += 4;
      this.properties = new Property[propertyCount];
      int pass1Offset = o1;
      ArrayList propertyList = new ArrayList(propertyCount);

      Section.PropertyListEntry ple;
      int codepage;
      for(codepage = 0; codepage < this.properties.length; ++codepage) {
         ple = new Section.PropertyListEntry();
         ple.id = (int)LittleEndian.getUInt(src, pass1Offset);
         pass1Offset += 4;
         ple.offset = (int)LittleEndian.getUInt(src, pass1Offset);
         pass1Offset += 4;
         propertyList.add(ple);
      }

      Collections.sort(propertyList);

      for(codepage = 0; codepage < propertyCount - 1; ++codepage) {
         Section.PropertyListEntry i1 = (Section.PropertyListEntry)propertyList.get(codepage);
         Section.PropertyListEntry i = (Section.PropertyListEntry)propertyList.get(codepage + 1);
         i1.length = i.offset - i1.offset;
      }

      if(propertyCount > 0) {
         ple = (Section.PropertyListEntry)propertyList.get(propertyCount - 1);
         ple.length = this.size - ple.offset;
      }

      codepage = -1;
      Iterator var13 = propertyList.iterator();

      while(codepage == -1 && var13.hasNext()) {
         ple = (Section.PropertyListEntry)var13.next();
         if(ple.id == 1) {
            int var15 = (int)(this.offset + (long)ple.offset);
            long p = LittleEndian.getUInt(src, var15);
            var15 += 4;
            if(p != 2L) {
               throw new HPSFRuntimeException("Value type of property ID 1 is not VT_I2 but " + p + ".");
            }

            codepage = LittleEndian.getUShort(src, var15);
         }
      }

      int var14 = 0;

      Property var17;
      for(Iterator var16 = propertyList.iterator(); var16.hasNext(); this.properties[var14++] = var17) {
         ple = (Section.PropertyListEntry)var16.next();
         var17 = new Property((long)ple.id, src, this.offset + (long)ple.offset, ple.length, codepage);
         if(var17.getID() == 1L) {
            var17 = new Property(var17.getID(), var17.getType(), Integer.valueOf(codepage));
         }
      }

      this.dictionary = (Map)this.getProperty(0L);
   }

   public Object getProperty(long id) {
      this.wasNull = false;

      for(int i = 0; i < this.properties.length; ++i) {
         if(id == this.properties[i].getID()) {
            return this.properties[i].getValue();
         }
      }

      this.wasNull = true;
      return null;
   }

   protected int getPropertyIntValue(long id) {
      Object o = this.getProperty(id);
      if(o == null) {
         return 0;
      } else if(!(o instanceof Long) && !(o instanceof Integer)) {
         throw new HPSFRuntimeException("This property is not an integer type, but " + o.getClass().getName() + ".");
      } else {
         Number i = (Number)o;
         return i.intValue();
      }
   }

   protected boolean getPropertyBooleanValue(int id) {
      Boolean b = (Boolean)this.getProperty((long)id);
      return b == null?false:b.booleanValue();
   }

   public boolean wasNull() {
      return this.wasNull;
   }

   public String getPIDString(long pid) {
      String s = null;
      if(this.dictionary != null) {
         s = (String)this.dictionary.get(Long.valueOf(pid));
      }

      if(s == null) {
         s = SectionIDMap.getPIDString(this.getFormatID().getBytes(), pid);
      }

      return s;
   }

   public boolean equals(Object o) {
      if(o != null && o instanceof Section) {
         Section s = (Section)o;
         if(!s.getFormatID().equals(this.getFormatID())) {
            return false;
         } else {
            Property[] pa1 = new Property[this.getProperties().length];
            Property[] pa2 = new Property[s.getProperties().length];
            System.arraycopy(this.getProperties(), 0, pa1, 0, pa1.length);
            System.arraycopy(s.getProperties(), 0, pa2, 0, pa2.length);
            Property p10 = null;
            Property p20 = null;

            int dictionaryEqual;
            long id;
            for(dictionaryEqual = 0; dictionaryEqual < pa1.length; ++dictionaryEqual) {
               id = pa1[dictionaryEqual].getID();
               if(id == 0L) {
                  p10 = pa1[dictionaryEqual];
                  pa1 = this.remove(pa1, dictionaryEqual);
                  --dictionaryEqual;
               }

               if(id == 1L) {
                  pa1 = this.remove(pa1, dictionaryEqual);
                  --dictionaryEqual;
               }
            }

            for(dictionaryEqual = 0; dictionaryEqual < pa2.length; ++dictionaryEqual) {
               id = pa2[dictionaryEqual].getID();
               if(id == 0L) {
                  p20 = pa2[dictionaryEqual];
                  pa2 = this.remove(pa2, dictionaryEqual);
                  --dictionaryEqual;
               }

               if(id == 1L) {
                  pa2 = this.remove(pa2, dictionaryEqual);
                  --dictionaryEqual;
               }
            }

            if(pa1.length != pa2.length) {
               return false;
            } else {
               boolean var10 = true;
               if(p10 != null && p20 != null) {
                  var10 = p10.getValue().equals(p20.getValue());
               } else if(p10 != null || p20 != null) {
                  var10 = false;
               }

               return var10?Util.equals((Object[])pa1, (Object[])pa2):false;
            }
         }
      } else {
         return false;
      }
   }

   private Property[] remove(Property[] pa, int i) {
      Property[] h = new Property[pa.length - 1];
      if(i > 0) {
         System.arraycopy(pa, 0, h, 0, i);
      }

      System.arraycopy(pa, i + 1, h, i, h.length - i);
      return h;
   }

   public int hashCode() {
      long hashCode = 0L;
      hashCode += (long)this.getFormatID().hashCode();
      Property[] pa = this.getProperties();

      int returnHashCode;
      for(returnHashCode = 0; returnHashCode < pa.length; ++returnHashCode) {
         hashCode += (long)pa[returnHashCode].hashCode();
      }

      returnHashCode = (int)(hashCode & 4294967295L);
      return returnHashCode;
   }

   public String toString() {
      StringBuffer b = new StringBuffer();
      Property[] pa = this.getProperties();
      b.append(this.getClass().getName());
      b.append('[');
      b.append("formatID: ");
      b.append(this.getFormatID());
      b.append(", offset: ");
      b.append(this.getOffset());
      b.append(", propertyCount: ");
      b.append(this.getPropertyCount());
      b.append(", size: ");
      b.append(this.getSize());
      b.append(", properties: [\n");

      for(int i = 0; i < pa.length; ++i) {
         b.append(pa[i].toString());
         b.append(",\n");
      }

      b.append(']');
      b.append(']');
      return b.toString();
   }

   public Map getDictionary() {
      return this.dictionary;
   }

   public int getCodepage() {
      Integer codepage = (Integer)this.getProperty(1L);
      if(codepage == null) {
         return -1;
      } else {
         int cp = codepage.intValue();
         return cp;
      }
   }

   static class PropertyListEntry implements Comparable {

      int id;
      int offset;
      int length;


      public int compareTo(Section.PropertyListEntry o) {
         int otherOffset = o.offset;
         return this.offset < otherOffset?-1:(this.offset == otherOffset?0:1);
      }

      public int hashCode() {
         boolean prime = true;
         byte result = 1;
         int result1 = 31 * result + this.id;
         result1 = 31 * result1 + this.length;
         result1 = 31 * result1 + this.offset;
         return result1;
      }

      public boolean equals(Object obj) {
         if(this == obj) {
            return true;
         } else if(obj == null) {
            return false;
         } else if(this.getClass() != obj.getClass()) {
            return false;
         } else {
            Section.PropertyListEntry other = (Section.PropertyListEntry)obj;
            return this.id != other.id?false:(this.length != other.length?false:this.offset == other.offset);
         }
      }

      public String toString() {
         StringBuffer b = new StringBuffer();
         b.append(this.getClass().getName());
         b.append("[id=");
         b.append(this.id);
         b.append(", offset=");
         b.append(this.offset);
         b.append(", length=");
         b.append(this.length);
         b.append(']');
         return b.toString();
      }
   }
}
