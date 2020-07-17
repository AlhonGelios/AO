package org.apache.poi.hssf.record.aggregates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.model.RecordStream;
import org.apache.poi.hssf.record.BottomMarginRecord;
import org.apache.poi.hssf.record.ContinueRecord;
import org.apache.poi.hssf.record.FooterRecord;
import org.apache.poi.hssf.record.HCenterRecord;
import org.apache.poi.hssf.record.HeaderFooterRecord;
import org.apache.poi.hssf.record.HeaderRecord;
import org.apache.poi.hssf.record.HorizontalPageBreakRecord;
import org.apache.poi.hssf.record.LeftMarginRecord;
import org.apache.poi.hssf.record.Margin;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.apache.poi.hssf.record.PrintSetupRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordBase;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.hssf.record.RightMarginRecord;
import org.apache.poi.hssf.record.TopMarginRecord;
import org.apache.poi.hssf.record.UserSViewBegin;
import org.apache.poi.hssf.record.VCenterRecord;
import org.apache.poi.hssf.record.VerticalPageBreakRecord;
import org.apache.poi.hssf.record.aggregates.CustomViewSettingsRecordAggregate;
import org.apache.poi.hssf.record.aggregates.RecordAggregate;
import org.apache.poi.util.HexDump;

public final class PageSettingsBlock extends RecordAggregate {

   private PageBreakRecord _rowBreaksRecord;
   private PageBreakRecord _columnBreaksRecord;
   private HeaderRecord _header;
   private FooterRecord _footer;
   private HCenterRecord _hCenter;
   private VCenterRecord _vCenter;
   private LeftMarginRecord _leftMargin;
   private RightMarginRecord _rightMargin;
   private TopMarginRecord _topMargin;
   private BottomMarginRecord _bottomMargin;
   private final List _plsRecords = new ArrayList();
   private PrintSetupRecord _printSetup;
   private Record _bitmap;
   private HeaderFooterRecord _headerFooter;
   private final List _sviewHeaderFooters = new ArrayList();
   private Record _printSize;


   public PageSettingsBlock(RecordStream rs) {
      while(this.readARecord(rs)) {
         ;
      }

   }

   public PageSettingsBlock() {
      this._rowBreaksRecord = new HorizontalPageBreakRecord();
      this._columnBreaksRecord = new VerticalPageBreakRecord();
      this._header = new HeaderRecord("");
      this._footer = new FooterRecord("");
      this._hCenter = createHCenter();
      this._vCenter = createVCenter();
      this._printSetup = createPrintSetup();
   }

   public static boolean isComponentRecord(int sid) {
      switch(sid) {
      case 20:
      case 21:
      case 26:
      case 27:
      case 38:
      case 39:
      case 40:
      case 41:
      case 51:
      case 77:
      case 131:
      case 132:
      case 161:
      case 233:
      case 2204:
         return true;
      default:
         return false;
      }
   }

   private boolean readARecord(RecordStream rs) {
      switch(rs.peekNextSid()) {
      case 20:
         this.checkNotPresent(this._header);
         this._header = (HeaderRecord)rs.getNext();
         break;
      case 21:
         this.checkNotPresent(this._footer);
         this._footer = (FooterRecord)rs.getNext();
         break;
      case 26:
         this.checkNotPresent(this._columnBreaksRecord);
         this._columnBreaksRecord = (PageBreakRecord)rs.getNext();
         break;
      case 27:
         this.checkNotPresent(this._rowBreaksRecord);
         this._rowBreaksRecord = (PageBreakRecord)rs.getNext();
         break;
      case 38:
         this.checkNotPresent(this._leftMargin);
         this._leftMargin = (LeftMarginRecord)rs.getNext();
         break;
      case 39:
         this.checkNotPresent(this._rightMargin);
         this._rightMargin = (RightMarginRecord)rs.getNext();
         break;
      case 40:
         this.checkNotPresent(this._topMargin);
         this._topMargin = (TopMarginRecord)rs.getNext();
         break;
      case 41:
         this.checkNotPresent(this._bottomMargin);
         this._bottomMargin = (BottomMarginRecord)rs.getNext();
         break;
      case 51:
         this.checkNotPresent(this._printSize);
         this._printSize = rs.getNext();
         break;
      case 77:
         this._plsRecords.add(new PageSettingsBlock.PLSAggregate(rs));
         break;
      case 131:
         this.checkNotPresent(this._hCenter);
         this._hCenter = (HCenterRecord)rs.getNext();
         break;
      case 132:
         this.checkNotPresent(this._vCenter);
         this._vCenter = (VCenterRecord)rs.getNext();
         break;
      case 161:
         this.checkNotPresent(this._printSetup);
         this._printSetup = (PrintSetupRecord)rs.getNext();
         break;
      case 233:
         this.checkNotPresent(this._bitmap);
         this._bitmap = rs.getNext();
         break;
      case 2204:
         HeaderFooterRecord hf = (HeaderFooterRecord)rs.getNext();
         if(hf.isCurrentSheet()) {
            this._headerFooter = hf;
         } else {
            this._sviewHeaderFooters.add(hf);
         }
         break;
      default:
         return false;
      }

      return true;
   }

   private void checkNotPresent(Record rec) {
      if(rec != null) {
         throw new RecordFormatException("Duplicate PageSettingsBlock record (sid=0x" + Integer.toHexString(rec.getSid()) + ")");
      }
   }

   private PageBreakRecord getRowBreaksRecord() {
      if(this._rowBreaksRecord == null) {
         this._rowBreaksRecord = new HorizontalPageBreakRecord();
      }

      return this._rowBreaksRecord;
   }

   private PageBreakRecord getColumnBreaksRecord() {
      if(this._columnBreaksRecord == null) {
         this._columnBreaksRecord = new VerticalPageBreakRecord();
      }

      return this._columnBreaksRecord;
   }

   public void setColumnBreak(short column, short fromRow, short toRow) {
      this.getColumnBreaksRecord().addBreak(column, fromRow, toRow);
   }

   public void removeColumnBreak(int column) {
      this.getColumnBreaksRecord().removeBreak(column);
   }

   public void visitContainedRecords(RecordAggregate.RecordVisitor rv) {
      visitIfPresent(this._rowBreaksRecord, rv);
      visitIfPresent(this._columnBreaksRecord, rv);
      if(this._header == null) {
         rv.visitRecord(new HeaderRecord(""));
      } else {
         rv.visitRecord(this._header);
      }

      if(this._footer == null) {
         rv.visitRecord(new FooterRecord(""));
      } else {
         rv.visitRecord(this._footer);
      }

      visitIfPresent((Record)this._hCenter, rv);
      visitIfPresent((Record)this._vCenter, rv);
      visitIfPresent((Record)this._leftMargin, rv);
      visitIfPresent((Record)this._rightMargin, rv);
      visitIfPresent((Record)this._topMargin, rv);
      visitIfPresent((Record)this._bottomMargin, rv);
      Iterator i$ = this._plsRecords.iterator();

      while(i$.hasNext()) {
         RecordAggregate pls = (RecordAggregate)i$.next();
         pls.visitContainedRecords(rv);
      }

      visitIfPresent((Record)this._printSetup, rv);
      visitIfPresent(this._printSize, rv);
      visitIfPresent((Record)this._headerFooter, rv);
      visitIfPresent(this._bitmap, rv);
   }

   private static void visitIfPresent(Record r, RecordAggregate.RecordVisitor rv) {
      if(r != null) {
         rv.visitRecord(r);
      }

   }

   private static void visitIfPresent(PageBreakRecord r, RecordAggregate.RecordVisitor rv) {
      if(r != null) {
         if(r.isEmpty()) {
            return;
         }

         rv.visitRecord(r);
      }

   }

   private static HCenterRecord createHCenter() {
      HCenterRecord retval = new HCenterRecord();
      retval.setHCenter(false);
      return retval;
   }

   private static VCenterRecord createVCenter() {
      VCenterRecord retval = new VCenterRecord();
      retval.setVCenter(false);
      return retval;
   }

   private static PrintSetupRecord createPrintSetup() {
      PrintSetupRecord retval = new PrintSetupRecord();
      retval.setPaperSize((short)1);
      retval.setScale((short)100);
      retval.setPageStart((short)1);
      retval.setFitWidth((short)1);
      retval.setFitHeight((short)1);
      retval.setOptions((short)2);
      retval.setHResolution((short)300);
      retval.setVResolution((short)300);
      retval.setHeaderMargin(0.5D);
      retval.setFooterMargin(0.5D);
      retval.setCopies((short)1);
      return retval;
   }

   public HeaderRecord getHeader() {
      return this._header;
   }

   public void setHeader(HeaderRecord newHeader) {
      this._header = newHeader;
   }

   public FooterRecord getFooter() {
      return this._footer;
   }

   public void setFooter(FooterRecord newFooter) {
      this._footer = newFooter;
   }

   public PrintSetupRecord getPrintSetup() {
      return this._printSetup;
   }

   public void setPrintSetup(PrintSetupRecord newPrintSetup) {
      this._printSetup = newPrintSetup;
   }

   private Margin getMarginRec(int marginIndex) {
      switch(marginIndex) {
      case 0:
         return this._leftMargin;
      case 1:
         return this._rightMargin;
      case 2:
         return this._topMargin;
      case 3:
         return this._bottomMargin;
      default:
         throw new IllegalArgumentException("Unknown margin constant:  " + marginIndex);
      }
   }

   public double getMargin(short margin) {
      Margin m = this.getMarginRec(margin);
      if(m != null) {
         return m.getMargin();
      } else {
         switch(margin) {
         case 0:
            return 0.75D;
         case 1:
            return 0.75D;
         case 2:
            return 1.0D;
         case 3:
            return 1.0D;
         default:
            throw new IllegalArgumentException("Unknown margin constant:  " + margin);
         }
      }
   }

   public void setMargin(short margin, double size) {
      Object m = this.getMarginRec(margin);
      if(m == null) {
         switch(margin) {
         case 0:
            this._leftMargin = new LeftMarginRecord();
            m = this._leftMargin;
            break;
         case 1:
            this._rightMargin = new RightMarginRecord();
            m = this._rightMargin;
            break;
         case 2:
            this._topMargin = new TopMarginRecord();
            m = this._topMargin;
            break;
         case 3:
            this._bottomMargin = new BottomMarginRecord();
            m = this._bottomMargin;
            break;
         default:
            throw new IllegalArgumentException("Unknown margin constant:  " + margin);
         }
      }

      ((Margin)m).setMargin(size);
   }

   private static void shiftBreaks(PageBreakRecord breaks, int start, int stop, int count) {
      Iterator iterator = breaks.getBreaksIterator();
      ArrayList shiftedBreak = new ArrayList();

      PageBreakRecord.Break breakItem;
      while(iterator.hasNext()) {
         breakItem = (PageBreakRecord.Break)iterator.next();
         int breakLocation = breakItem.main;
         boolean inStart = breakLocation >= start;
         boolean inEnd = breakLocation <= stop;
         if(inStart && inEnd) {
            shiftedBreak.add(breakItem);
         }
      }

      iterator = shiftedBreak.iterator();

      while(iterator.hasNext()) {
         breakItem = (PageBreakRecord.Break)iterator.next();
         breaks.removeBreak(breakItem.main);
         breaks.addBreak((short)(breakItem.main + count), breakItem.subFrom, breakItem.subTo);
      }

   }

   public void setRowBreak(int row, short fromCol, short toCol) {
      this.getRowBreaksRecord().addBreak((short)row, fromCol, toCol);
   }

   public void removeRowBreak(int row) {
      if(this.getRowBreaksRecord().getBreaks().length < 1) {
         throw new IllegalArgumentException("Sheet does not define any row breaks");
      } else {
         this.getRowBreaksRecord().removeBreak((short)row);
      }
   }

   public boolean isRowBroken(int row) {
      return this.getRowBreaksRecord().getBreak(row) != null;
   }

   public boolean isColumnBroken(int column) {
      return this.getColumnBreaksRecord().getBreak(column) != null;
   }

   public void shiftRowBreaks(int startingRow, int endingRow, int count) {
      shiftBreaks(this.getRowBreaksRecord(), startingRow, endingRow, count);
   }

   public void shiftColumnBreaks(short startingCol, short endingCol, short count) {
      shiftBreaks(this.getColumnBreaksRecord(), startingCol, endingCol, count);
   }

   public int[] getRowBreaks() {
      return this.getRowBreaksRecord().getBreaks();
   }

   public int getNumRowBreaks() {
      return this.getRowBreaksRecord().getNumBreaks();
   }

   public int[] getColumnBreaks() {
      return this.getColumnBreaksRecord().getBreaks();
   }

   public int getNumColumnBreaks() {
      return this.getColumnBreaksRecord().getNumBreaks();
   }

   public VCenterRecord getVCenter() {
      return this._vCenter;
   }

   public HCenterRecord getHCenter() {
      return this._hCenter;
   }

   public void addLateHeaderFooter(HeaderFooterRecord rec) {
      if(this._headerFooter != null) {
         throw new IllegalStateException("This page settings block already has a header/footer record");
      } else if(rec.getSid() != 2204) {
         throw new RecordFormatException("Unexpected header-footer record sid: 0x" + Integer.toHexString(rec.getSid()));
      } else {
         this._headerFooter = rec;
      }
   }

   public void addLateRecords(RecordStream rs) {
      while(this.readARecord(rs)) {
         ;
      }

   }

   public void positionRecords(List sheetRecords) {
      ArrayList hfRecordsToIterate = new ArrayList(this._sviewHeaderFooters);
      final HashMap hfGuidMap = new HashMap();
      Iterator i$ = hfRecordsToIterate.iterator();

      while(i$.hasNext()) {
         HeaderFooterRecord rb = (HeaderFooterRecord)i$.next();
         hfGuidMap.put(HexDump.toHex(rb.getGuid()), rb);
      }

      i$ = sheetRecords.iterator();

      while(i$.hasNext()) {
         RecordBase rb1 = (RecordBase)i$.next();
         if(rb1 instanceof CustomViewSettingsRecordAggregate) {
            final CustomViewSettingsRecordAggregate cv = (CustomViewSettingsRecordAggregate)rb1;
            cv.visitContainedRecords(new RecordAggregate.RecordVisitor() {
               public void visitRecord(Record r) {
                  if(r.getSid() == 426) {
                     String guid = HexDump.toHex(((UserSViewBegin)r).getGuid());
                     HeaderFooterRecord hf = (HeaderFooterRecord)hfGuidMap.get(guid);
                     if(hf != null) {
                        cv.append(hf);
                        PageSettingsBlock.this._sviewHeaderFooters.remove(hf);
                     }
                  }

               }
            });
         }
      }

   }

   private static final class PLSAggregate extends RecordAggregate {

      private static final ContinueRecord[] EMPTY_CONTINUE_RECORD_ARRAY = new ContinueRecord[0];
      private final Record _pls;
      private ContinueRecord[] _plsContinues;


      public PLSAggregate(RecordStream rs) {
         this._pls = rs.getNext();
         if(rs.peekNextSid() == 60) {
            ArrayList temp = new ArrayList();

            while(rs.peekNextSid() == 60) {
               temp.add((ContinueRecord)rs.getNext());
            }

            this._plsContinues = new ContinueRecord[temp.size()];
            temp.toArray(this._plsContinues);
         } else {
            this._plsContinues = EMPTY_CONTINUE_RECORD_ARRAY;
         }

      }

      public void visitContainedRecords(RecordAggregate.RecordVisitor rv) {
         rv.visitRecord(this._pls);
         ContinueRecord[] arr$ = this._plsContinues;
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            ContinueRecord _plsContinue = arr$[i$];
            rv.visitRecord(_plsContinue);
         }

      }

   }
}
