package org.apache.poi.hssf.model;

import java.util.List;
import org.apache.poi.hssf.record.Record;

public final class RecordStream {

   private final List _list;
   private int _nextIndex;
   private int _countRead;
   private final int _endIx;


   public RecordStream(List inputList, int startIndex, int endIx) {
      this._list = inputList;
      this._nextIndex = startIndex;
      this._endIx = endIx;
      this._countRead = 0;
   }

   public RecordStream(List records, int startIx) {
      this(records, startIx, records.size());
   }

   public boolean hasNext() {
      return this._nextIndex < this._endIx;
   }

   public Record getNext() {
      if(!this.hasNext()) {
         throw new RuntimeException("Attempt to read past end of record stream");
      } else {
         ++this._countRead;
         return (Record)this._list.get(this._nextIndex++);
      }
   }

   public Class peekNextClass() {
      return !this.hasNext()?null:((Record)this._list.get(this._nextIndex)).getClass();
   }

   public int peekNextSid() {
      return !this.hasNext()?-1:((Record)this._list.get(this._nextIndex)).getSid();
   }

   public int getCountRead() {
      return this._countRead;
   }
}
