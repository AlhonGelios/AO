package org.apache.poi.ddf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ddf.EscherArrayProperty;
import org.apache.poi.ddf.EscherBoolProperty;
import org.apache.poi.ddf.EscherComplexProperty;
import org.apache.poi.ddf.EscherProperties;
import org.apache.poi.ddf.EscherProperty;
import org.apache.poi.ddf.EscherRGBProperty;
import org.apache.poi.ddf.EscherShapePathProperty;
import org.apache.poi.ddf.EscherSimpleProperty;
import org.apache.poi.util.LittleEndian;

public final class EscherPropertyFactory {

   public List createProperties(byte[] data, int offset, short numProperties) {
      ArrayList results = new ArrayList();
      int pos = offset;

      for(int i$ = 0; i$ < numProperties; ++i$) {
         short p = LittleEndian.getShort(data, pos);
         int complexData = LittleEndian.getInt(data, pos + 2);
         short leftover = (short)(p & 16383);
         boolean isComplex = (p & -32768) != 0;
         byte propertyType = EscherProperties.getPropertyType(leftover);
         if(propertyType == 1) {
            results.add(new EscherBoolProperty(p, complexData));
         } else if(propertyType == 2) {
            results.add(new EscherRGBProperty(p, complexData));
         } else if(propertyType == 3) {
            results.add(new EscherShapePathProperty(p, complexData));
         } else if(!isComplex) {
            results.add(new EscherSimpleProperty(p, complexData));
         } else if(propertyType == 5) {
            results.add(new EscherArrayProperty(p, new byte[complexData]));
         } else {
            results.add(new EscherComplexProperty(p, new byte[complexData]));
         }

         pos += 6;
      }

      Iterator var12 = results.iterator();

      while(var12.hasNext()) {
         EscherProperty var13 = (EscherProperty)var12.next();
         if(var13 instanceof EscherComplexProperty) {
            if(var13 instanceof EscherArrayProperty) {
               pos += ((EscherArrayProperty)var13).setArrayData(data, pos);
            } else {
               byte[] var14 = ((EscherComplexProperty)var13).getComplexData();
               int var15 = data.length - pos;
               if(var15 < var14.length) {
                  throw new IllegalStateException("Could not read complex escher property, lenght was " + var14.length + ", but had only " + var15 + " bytes left");
               }

               System.arraycopy(data, pos, var14, 0, var14.length);
               pos += var14.length;
            }
         }
      }

      return results;
   }
}
