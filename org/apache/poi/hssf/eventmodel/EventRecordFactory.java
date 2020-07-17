package org.apache.poi.hssf.eventmodel;

import java.io.InputStream;
import java.util.Arrays;
import org.apache.poi.hssf.eventmodel.ERFListener;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordFactory;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.hssf.record.RecordInputStream;

public final class EventRecordFactory {

   private final ERFListener _listener;
   private final short[] _sids;


   public EventRecordFactory(ERFListener listener, short[] sids) {
      this._listener = listener;
      if(sids == null) {
         this._sids = null;
      } else {
         this._sids = (short[])sids.clone();
         Arrays.sort(this._sids);
      }

   }

   private boolean isSidIncluded(short sid) {
      return this._sids == null?true:Arrays.binarySearch(this._sids, sid) >= 0;
   }

   private boolean processRecord(Record record) {
      return !this.isSidIncluded(record.getSid())?true:this._listener.processRecord(record);
   }

   public void processRecords(InputStream in) throws RecordFormatException {
      Record last_record = null;
      RecordInputStream recStream = new RecordInputStream(in);

      while(recStream.hasNextRecord()) {
         recStream.nextRecord();
         Record[] recs = RecordFactory.createRecord(recStream);
         if(recs.length > 1) {
            Record[] record = recs;
            int len$ = recs.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               Record rec = record[i$];
               if(last_record != null && !this.processRecord(last_record)) {
                  return;
               }

               last_record = rec;
            }
         } else {
            Record var9 = recs[0];
            if(var9 != null) {
               if(last_record != null && !this.processRecord(last_record)) {
                  return;
               }

               last_record = var9;
            }
         }
      }

      if(last_record != null) {
         this.processRecord(last_record);
      }

   }
}
