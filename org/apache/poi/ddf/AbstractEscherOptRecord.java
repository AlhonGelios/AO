package org.apache.poi.ddf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ddf.EscherProperty;
import org.apache.poi.ddf.EscherPropertyFactory;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public abstract class AbstractEscherOptRecord extends EscherRecord {

   protected List properties = new ArrayList();


   public void addEscherProperty(EscherProperty prop) {
      this.properties.add(prop);
   }

   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesRemaining = this.readHeader(data, offset);
      short propertiesCount = readInstance(data, offset);
      int pos = offset + 8;
      EscherPropertyFactory f = new EscherPropertyFactory();
      this.properties = f.createProperties(data, pos, propertiesCount);
      return bytesRemaining + 8;
   }

   public List getEscherProperties() {
      return this.properties;
   }

   public EscherProperty getEscherProperty(int index) {
      return (EscherProperty)this.properties.get(index);
   }

   private int getPropertiesSize() {
      int totalSize = 0;

      EscherProperty property;
      for(Iterator i$ = this.properties.iterator(); i$.hasNext(); totalSize += property.getPropertySize()) {
         property = (EscherProperty)i$.next();
      }

      return totalSize;
   }

   public int getRecordSize() {
      return 8 + this.getPropertiesSize();
   }

   public EscherProperty lookup(int propId) {
      Iterator i$ = this.properties.iterator();

      EscherProperty prop;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         prop = (EscherProperty)i$.next();
      } while(prop.getPropertyNumber() != propId);

      return prop;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      LittleEndian.putInt(data, offset + 4, this.getPropertiesSize());
      int pos = offset + 8;

      Iterator i$;
      EscherProperty property;
      for(i$ = this.properties.iterator(); i$.hasNext(); pos += property.serializeSimplePart(data, pos)) {
         property = (EscherProperty)i$.next();
      }

      for(i$ = this.properties.iterator(); i$.hasNext(); pos += property.serializeComplexPart(data, pos)) {
         property = (EscherProperty)i$.next();
      }

      listener.afterRecordSerialize(pos, this.getRecordId(), pos - offset, this);
      return pos - offset;
   }

   public void sortProperties() {
      Collections.sort(this.properties, new Comparator() {
         public int compare(EscherProperty p1, EscherProperty p2) {
            short s1 = p1.getPropertyNumber();
            short s2 = p2.getPropertyNumber();
            return s1 < s2?-1:(s1 == s2?0:1);
         }
      });
   }

   public void setEscherProperty(EscherProperty value) {
      Iterator iterator = this.properties.iterator();

      while(iterator.hasNext()) {
         EscherProperty prop = (EscherProperty)iterator.next();
         if(prop.getId() == value.getId()) {
            iterator.remove();
         }
      }

      this.properties.add(value);
      this.sortProperties();
   }

   public void removeEscherProperty(int num) {
      Iterator iterator = this.getEscherProperties().iterator();

      while(iterator.hasNext()) {
         EscherProperty prop = (EscherProperty)iterator.next();
         if(prop.getPropertyNumber() == num) {
            iterator.remove();
         }
      }

   }

   public String toString() {
      String nl = System.getProperty("line.separator");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.getClass().getName());
      stringBuilder.append(":");
      stringBuilder.append(nl);
      stringBuilder.append("  isContainer: ");
      stringBuilder.append(this.isContainerRecord());
      stringBuilder.append(nl);
      stringBuilder.append("  version: 0x");
      stringBuilder.append(HexDump.toHex(this.getVersion()));
      stringBuilder.append(nl);
      stringBuilder.append("  instance: 0x");
      stringBuilder.append(HexDump.toHex(this.getInstance()));
      stringBuilder.append(nl);
      stringBuilder.append("  recordId: 0x");
      stringBuilder.append(HexDump.toHex(this.getRecordId()));
      stringBuilder.append(nl);
      stringBuilder.append("  numchildren: ");
      stringBuilder.append(this.getChildRecords().size());
      stringBuilder.append(nl);
      stringBuilder.append("  properties:");
      stringBuilder.append(nl);
      Iterator i$ = this.properties.iterator();

      while(i$.hasNext()) {
         EscherProperty property = (EscherProperty)i$.next();
         stringBuilder.append("    ").append(property.toString()).append(nl);
      }

      return stringBuilder.toString();
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance())));
      Iterator i$ = this.getEscherProperties().iterator();

      while(i$.hasNext()) {
         EscherProperty property = (EscherProperty)i$.next();
         builder.append(property.toXml(tab + "\t"));
      }

      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }
}
