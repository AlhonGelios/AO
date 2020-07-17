package org.apache.poi.hssf.record.aggregates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.model.RecordStream;
import org.apache.poi.hssf.record.CFHeader12Record;
import org.apache.poi.hssf.record.CFHeaderRecord;
import org.apache.poi.hssf.record.aggregates.CFRecordsAggregate;
import org.apache.poi.hssf.record.aggregates.RecordAggregate;
import org.apache.poi.ss.formula.FormulaShifter;

public final class ConditionalFormattingTable extends RecordAggregate {

   private final List _cfHeaders;


   public ConditionalFormattingTable() {
      this._cfHeaders = new ArrayList();
   }

   public ConditionalFormattingTable(RecordStream rs) {
      ArrayList temp = new ArrayList();

      while(rs.peekNextClass() == CFHeaderRecord.class || rs.peekNextClass() == CFHeader12Record.class) {
         temp.add(CFRecordsAggregate.createCFAggregate(rs));
      }

      this._cfHeaders = temp;
   }

   public void visitContainedRecords(RecordAggregate.RecordVisitor rv) {
      Iterator i$ = this._cfHeaders.iterator();

      while(i$.hasNext()) {
         CFRecordsAggregate subAgg = (CFRecordsAggregate)i$.next();
         subAgg.visitContainedRecords(rv);
      }

   }

   public int add(CFRecordsAggregate cfAggregate) {
      cfAggregate.getHeader().setID(this._cfHeaders.size());
      this._cfHeaders.add(cfAggregate);
      return this._cfHeaders.size() - 1;
   }

   public int size() {
      return this._cfHeaders.size();
   }

   public CFRecordsAggregate get(int index) {
      this.checkIndex(index);
      return (CFRecordsAggregate)this._cfHeaders.get(index);
   }

   public void remove(int index) {
      this.checkIndex(index);
      this._cfHeaders.remove(index);
   }

   private void checkIndex(int index) {
      if(index < 0 || index >= this._cfHeaders.size()) {
         throw new IllegalArgumentException("Specified CF index " + index + " is outside the allowable range (0.." + (this._cfHeaders.size() - 1) + ")");
      }
   }

   public void updateFormulasAfterCellShift(FormulaShifter shifter, int externSheetIndex) {
      for(int i = 0; i < this._cfHeaders.size(); ++i) {
         CFRecordsAggregate subAgg = (CFRecordsAggregate)this._cfHeaders.get(i);
         boolean shouldKeep = subAgg.updateFormulasAfterCellShift(shifter, externSheetIndex);
         if(!shouldKeep) {
            this._cfHeaders.remove(i);
            --i;
         }
      }

   }
}
