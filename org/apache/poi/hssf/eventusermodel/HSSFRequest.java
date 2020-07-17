package org.apache.poi.hssf.eventusermodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.eventusermodel.AbortableHSSFListener;
import org.apache.poi.hssf.eventusermodel.HSSFListener;
import org.apache.poi.hssf.eventusermodel.HSSFUserException;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordFactory;

public class HSSFRequest {

   private final Map _records = new HashMap(50);


   public void addListener(HSSFListener lsnr, short sid) {
      Object list = (List)this._records.get(Short.valueOf(sid));
      if(list == null) {
         list = new ArrayList(1);
         this._records.put(Short.valueOf(sid), list);
      }

      ((List)list).add(lsnr);
   }

   public void addListenerForAllRecords(HSSFListener lsnr) {
      short[] rectypes = RecordFactory.getAllKnownRecordSIDs();
      short[] arr$ = rectypes;
      int len$ = rectypes.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         short rectype = arr$[i$];
         this.addListener(lsnr, rectype);
      }

   }

   protected short processRecord(Record rec) throws HSSFUserException {
      List listeners = (List)this._records.get(Short.valueOf(rec.getSid()));
      short userCode = 0;
      if(listeners != null) {
         for(int k = 0; k < listeners.size(); ++k) {
            Object listenObj = listeners.get(k);
            if(listenObj instanceof AbortableHSSFListener) {
               AbortableHSSFListener listener = (AbortableHSSFListener)listenObj;
               userCode = listener.abortableProcessRecord(rec);
               if(userCode != 0) {
                  break;
               }
            } else {
               HSSFListener var7 = (HSSFListener)listenObj;
               var7.processRecord(rec);
            }
         }
      }

      return userCode;
   }
}
