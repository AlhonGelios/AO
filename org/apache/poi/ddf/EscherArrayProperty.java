package org.apache.poi.ddf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.poi.ddf.EscherComplexProperty;
import org.apache.poi.ddf.EscherProperties;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public final class EscherArrayProperty extends EscherComplexProperty implements Iterable {

   private static final int FIXED_SIZE = 6;
   private boolean sizeIncludesHeaderSize = true;
   private boolean emptyComplexPart = false;


   public EscherArrayProperty(short id, byte[] complexData) {
      super(id, checkComplexData(complexData));
      this.emptyComplexPart = complexData.length == 0;
   }

   public EscherArrayProperty(short propertyNumber, boolean isBlipId, byte[] complexData) {
      super(propertyNumber, isBlipId, checkComplexData(complexData));
   }

   private static byte[] checkComplexData(byte[] complexData) {
      return complexData != null && complexData.length != 0?complexData:new byte[6];
   }

   public int getNumberOfElementsInArray() {
      return this.emptyComplexPart?0:LittleEndian.getUShort(this._complexData, 0);
   }

   public void setNumberOfElementsInArray(int numberOfElements) {
      int expectedArraySize = numberOfElements * getActualSizeOfElements(this.getSizeOfElements()) + 6;
      if(expectedArraySize != this._complexData.length) {
         byte[] newArray = new byte[expectedArraySize];
         System.arraycopy(this._complexData, 0, newArray, 0, this._complexData.length);
         this._complexData = newArray;
      }

      LittleEndian.putShort(this._complexData, 0, (short)numberOfElements);
   }

   public int getNumberOfElementsInMemory() {
      return this.emptyComplexPart?0:LittleEndian.getUShort(this._complexData, 2);
   }

   public void setNumberOfElementsInMemory(int numberOfElements) {
      int expectedArraySize = numberOfElements * getActualSizeOfElements(this.getSizeOfElements()) + 6;
      if(expectedArraySize != this._complexData.length) {
         byte[] newArray = new byte[expectedArraySize];
         System.arraycopy(this._complexData, 0, newArray, 0, expectedArraySize);
         this._complexData = newArray;
      }

      LittleEndian.putShort(this._complexData, 2, (short)numberOfElements);
   }

   public short getSizeOfElements() {
      return this.emptyComplexPart?0:LittleEndian.getShort(this._complexData, 4);
   }

   public void setSizeOfElements(int sizeOfElements) {
      LittleEndian.putShort(this._complexData, 4, (short)sizeOfElements);
      int expectedArraySize = this.getNumberOfElementsInArray() * getActualSizeOfElements(this.getSizeOfElements()) + 6;
      if(expectedArraySize != this._complexData.length) {
         byte[] newArray = new byte[expectedArraySize];
         System.arraycopy(this._complexData, 0, newArray, 0, 6);
         this._complexData = newArray;
      }

   }

   public byte[] getElement(int index) {
      int actualSize = getActualSizeOfElements(this.getSizeOfElements());
      byte[] result = new byte[actualSize];
      System.arraycopy(this._complexData, 6 + index * actualSize, result, 0, result.length);
      return result;
   }

   public void setElement(int index, byte[] element) {
      int actualSize = getActualSizeOfElements(this.getSizeOfElements());
      System.arraycopy(element, 0, this._complexData, 6 + index * actualSize, actualSize);
   }

   public String toString() {
      StringBuffer results = new StringBuffer();
      results.append("    {EscherArrayProperty:\n");
      results.append("     Num Elements: " + this.getNumberOfElementsInArray() + '\n');
      results.append("     Num Elements In Memory: " + this.getNumberOfElementsInMemory() + '\n');
      results.append("     Size of elements: " + this.getSizeOfElements() + '\n');

      for(int i = 0; i < this.getNumberOfElementsInArray(); ++i) {
         results.append("     Element " + i + ": " + HexDump.toHex(this.getElement(i)) + '\n');
      }

      results.append("}\n");
      return "propNum: " + this.getPropertyNumber() + ", propName: " + EscherProperties.getPropertyName(this.getPropertyNumber()) + ", complex: " + this.isComplex() + ", blipId: " + this.isBlipId() + ", data: " + '\n' + results.toString();
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append("<").append(this.getClass().getSimpleName()).append(" id=\"0x").append(HexDump.toHex(this.getId())).append("\" name=\"").append(this.getName()).append("\" blipId=\"").append(this.isBlipId()).append("\">\n");

      for(int i = 0; i < this.getNumberOfElementsInArray(); ++i) {
         builder.append("\t").append(tab).append("<Element>").append(HexDump.toHex(this.getElement(i))).append("</Element>\n");
      }

      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

   public int setArrayData(byte[] data, int offset) {
      if(this.emptyComplexPart) {
         this._complexData = new byte[0];
      } else {
         short numElements = LittleEndian.getShort(data, offset);
         short sizeOfElements = LittleEndian.getShort(data, offset + 4);
         int arraySize = getActualSizeOfElements(sizeOfElements) * numElements;
         if(arraySize == this._complexData.length) {
            this._complexData = new byte[arraySize + 6];
            this.sizeIncludesHeaderSize = false;
         }

         System.arraycopy(data, offset, this._complexData, 0, this._complexData.length);
      }

      return this._complexData.length;
   }

   public int serializeSimplePart(byte[] data, int pos) {
      LittleEndian.putShort(data, pos, this.getId());
      int recordSize = this._complexData.length;
      if(!this.sizeIncludesHeaderSize) {
         recordSize -= 6;
      }

      LittleEndian.putInt(data, pos + 2, recordSize);
      return 6;
   }

   private static int getActualSizeOfElements(short sizeOfElements) {
      return sizeOfElements < 0?(short)(-sizeOfElements >> 2):sizeOfElements;
   }

   public Iterator iterator() {
      return new Iterator() {

         int idx = 0;

         public boolean hasNext() {
            return this.idx < EscherArrayProperty.this.getNumberOfElementsInArray();
         }
         public byte[] next() {
            if(!this.hasNext()) {
               throw new NoSuchElementException();
            } else {
               return EscherArrayProperty.this.getElement(this.idx++);
            }
         }
         public void remove() {
            throw new UnsupportedOperationException("not yet implemented");
         }
      };
   }
}
