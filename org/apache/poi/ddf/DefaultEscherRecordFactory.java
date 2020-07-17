package org.apache.poi.ddf;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ddf.EscherBSERecord;
import org.apache.poi.ddf.EscherBitmapBlip;
import org.apache.poi.ddf.EscherBlipRecord;
import org.apache.poi.ddf.EscherChildAnchorRecord;
import org.apache.poi.ddf.EscherClientAnchorRecord;
import org.apache.poi.ddf.EscherClientDataRecord;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherDgRecord;
import org.apache.poi.ddf.EscherDggRecord;
import org.apache.poi.ddf.EscherMetafileBlip;
import org.apache.poi.ddf.EscherOptRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSpRecord;
import org.apache.poi.ddf.EscherSpgrRecord;
import org.apache.poi.ddf.EscherSplitMenuColorsRecord;
import org.apache.poi.ddf.EscherTertiaryOptRecord;
import org.apache.poi.ddf.EscherTextboxRecord;
import org.apache.poi.ddf.UnknownEscherRecord;
import org.apache.poi.util.LittleEndian;

public class DefaultEscherRecordFactory implements EscherRecordFactory {

   private static Class[] escherRecordClasses = new Class[]{EscherBSERecord.class, EscherOptRecord.class, EscherTertiaryOptRecord.class, EscherClientAnchorRecord.class, EscherDgRecord.class, EscherSpgrRecord.class, EscherSpRecord.class, EscherClientDataRecord.class, EscherDggRecord.class, EscherSplitMenuColorsRecord.class, EscherChildAnchorRecord.class, EscherTextboxRecord.class};
   private static Map recordsMap = recordsToMap(escherRecordClasses);


   public EscherRecord createRecord(byte[] data, int offset) {
      short options = LittleEndian.getShort(data, offset);
      short recordId = LittleEndian.getShort(data, offset + 2);
      if(isContainer(options, recordId)) {
         EscherContainerRecord recordConstructor2 = new EscherContainerRecord();
         recordConstructor2.setRecordId(recordId);
         recordConstructor2.setOptions(options);
         return recordConstructor2;
      } else if(recordId >= -4072 && recordId <= -3817) {
         Object recordConstructor1;
         if(recordId != -4065 && recordId != -4067 && recordId != -4066) {
            if(recordId != -4070 && recordId != -4069 && recordId != -4068) {
               recordConstructor1 = new EscherBlipRecord();
            } else {
               recordConstructor1 = new EscherMetafileBlip();
            }
         } else {
            recordConstructor1 = new EscherBitmapBlip();
         }

         ((EscherBlipRecord)recordConstructor1).setRecordId(recordId);
         ((EscherBlipRecord)recordConstructor1).setOptions(options);
         return (EscherRecord)recordConstructor1;
      } else {
         Constructor recordConstructor = (Constructor)recordsMap.get(Short.valueOf(recordId));
         if(recordConstructor == null) {
            return new UnknownEscherRecord();
         } else {
            EscherRecord escherRecord;
            try {
               escherRecord = (EscherRecord)recordConstructor.newInstance(new Object[0]);
            } catch (Exception var8) {
               return new UnknownEscherRecord();
            }

            escherRecord.setRecordId(recordId);
            escherRecord.setOptions(options);
            return escherRecord;
         }
      }
   }

   protected static Map recordsToMap(Class[] recClasses) {
      HashMap result = new HashMap();
      Class[] EMPTY_CLASS_ARRAY = new Class[0];
      Class[] arr$ = recClasses;
      int len$ = recClasses.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Class recClass = arr$[i$];
         Class recCls = recClass;

         short sid;
         try {
            sid = recCls.getField("RECORD_ID").getShort((Object)null);
         } catch (IllegalArgumentException var12) {
            throw new RuntimeException(var12);
         } catch (IllegalAccessException var13) {
            throw new RuntimeException(var13);
         } catch (NoSuchFieldException var14) {
            throw new RuntimeException(var14);
         }

         Constructor constructor;
         try {
            constructor = recCls.getConstructor(EMPTY_CLASS_ARRAY);
         } catch (NoSuchMethodException var11) {
            throw new RuntimeException(var11);
         }

         result.put(Short.valueOf(sid), constructor);
      }

      return result;
   }

   public static boolean isContainer(short options, short recordId) {
      return recordId >= -4096 && recordId <= -4091?true:(recordId == -4083?false:(options & 15) == 15);
   }

}
