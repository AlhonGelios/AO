package org.apache.poi.hssf.eventusermodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.eventusermodel.HSSFListener;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.record.BoundSheetRecord;
import org.apache.poi.hssf.record.EOFRecord;
import org.apache.poi.hssf.record.ExternSheetRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.SSTRecord;
import org.apache.poi.hssf.record.SupBookRecord;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class EventWorkbookBuilder {

   public static InternalWorkbook createStubWorkbook(ExternSheetRecord[] externs, BoundSheetRecord[] bounds, SSTRecord sst) {
      ArrayList wbRecords = new ArrayList();
      int len$;
      int i$;
      if(bounds != null) {
         BoundSheetRecord[] arr$ = bounds;
         len$ = bounds.length;

         for(i$ = 0; i$ < len$; ++i$) {
            BoundSheetRecord extern = arr$[i$];
            wbRecords.add(extern);
         }
      }

      if(sst != null) {
         wbRecords.add(sst);
      }

      if(externs != null) {
         wbRecords.add(SupBookRecord.createInternalReferences((short)externs.length));
         ExternSheetRecord[] var8 = externs;
         len$ = externs.length;

         for(i$ = 0; i$ < len$; ++i$) {
            ExternSheetRecord var9 = var8[i$];
            wbRecords.add(var9);
         }
      }

      wbRecords.add(EOFRecord.instance);
      return InternalWorkbook.createWorkbook(wbRecords);
   }

   public static InternalWorkbook createStubWorkbook(ExternSheetRecord[] externs, BoundSheetRecord[] bounds) {
      return createStubWorkbook(externs, bounds, (SSTRecord)null);
   }

   public static class SheetRecordCollectingListener implements HSSFListener {

      private final HSSFListener childListener;
      private final List boundSheetRecords = new ArrayList();
      private final List externSheetRecords = new ArrayList();
      private SSTRecord sstRecord = null;


      public SheetRecordCollectingListener(HSSFListener childListener) {
         this.childListener = childListener;
      }

      public BoundSheetRecord[] getBoundSheetRecords() {
         return (BoundSheetRecord[])this.boundSheetRecords.toArray(new BoundSheetRecord[this.boundSheetRecords.size()]);
      }

      public ExternSheetRecord[] getExternSheetRecords() {
         return (ExternSheetRecord[])this.externSheetRecords.toArray(new ExternSheetRecord[this.externSheetRecords.size()]);
      }

      public SSTRecord getSSTRecord() {
         return this.sstRecord;
      }

      public HSSFWorkbook getStubHSSFWorkbook() {
         HSSFWorkbook wb = HSSFWorkbook.create(this.getStubWorkbook());
         Iterator i$ = this.boundSheetRecords.iterator();

         while(i$.hasNext()) {
            BoundSheetRecord bsr = (BoundSheetRecord)i$.next();
            wb.createSheet(bsr.getSheetname());
         }

         return wb;
      }

      public InternalWorkbook getStubWorkbook() {
         return EventWorkbookBuilder.createStubWorkbook(this.getExternSheetRecords(), this.getBoundSheetRecords(), this.getSSTRecord());
      }

      public void processRecord(Record record) {
         this.processRecordInternally(record);
         this.childListener.processRecord(record);
      }

      public void processRecordInternally(Record record) {
         if(record instanceof BoundSheetRecord) {
            this.boundSheetRecords.add((BoundSheetRecord)record);
         } else if(record instanceof ExternSheetRecord) {
            this.externSheetRecords.add((ExternSheetRecord)record);
         } else if(record instanceof SSTRecord) {
            this.sstRecord = (SSTRecord)record;
         }

      }
   }
}
