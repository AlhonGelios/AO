package org.apache.poi.hssf.model;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.poi.ddf.EscherBSERecord;
import org.apache.poi.ddf.EscherBoolProperty;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherDgRecord;
import org.apache.poi.ddf.EscherDggRecord;
import org.apache.poi.ddf.EscherOptRecord;
import org.apache.poi.ddf.EscherRGBProperty;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherSimpleProperty;
import org.apache.poi.ddf.EscherSpRecord;
import org.apache.poi.ddf.EscherSplitMenuColorsRecord;
import org.apache.poi.hssf.model.DrawingManager2;
import org.apache.poi.hssf.model.InternalSheet;
import org.apache.poi.hssf.model.LinkTable;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.hssf.record.BOFRecord;
import org.apache.poi.hssf.record.BackupRecord;
import org.apache.poi.hssf.record.BookBoolRecord;
import org.apache.poi.hssf.record.BoundSheetRecord;
import org.apache.poi.hssf.record.CodepageRecord;
import org.apache.poi.hssf.record.CountryRecord;
import org.apache.poi.hssf.record.DSFRecord;
import org.apache.poi.hssf.record.DateWindow1904Record;
import org.apache.poi.hssf.record.DrawingGroupRecord;
import org.apache.poi.hssf.record.EOFRecord;
import org.apache.poi.hssf.record.EscherAggregate;
import org.apache.poi.hssf.record.ExtSSTRecord;
import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.apache.poi.hssf.record.FileSharingRecord;
import org.apache.poi.hssf.record.FnGroupCountRecord;
import org.apache.poi.hssf.record.FontRecord;
import org.apache.poi.hssf.record.FormatRecord;
import org.apache.poi.hssf.record.HideObjRecord;
import org.apache.poi.hssf.record.HyperlinkRecord;
import org.apache.poi.hssf.record.InterfaceEndRecord;
import org.apache.poi.hssf.record.InterfaceHdrRecord;
import org.apache.poi.hssf.record.MMSRecord;
import org.apache.poi.hssf.record.NameCommentRecord;
import org.apache.poi.hssf.record.NameRecord;
import org.apache.poi.hssf.record.PaletteRecord;
import org.apache.poi.hssf.record.PasswordRecord;
import org.apache.poi.hssf.record.PasswordRev4Record;
import org.apache.poi.hssf.record.PrecisionRecord;
import org.apache.poi.hssf.record.ProtectRecord;
import org.apache.poi.hssf.record.ProtectionRev4Record;
import org.apache.poi.hssf.record.RecalcIdRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RefreshAllRecord;
import org.apache.poi.hssf.record.SSTRecord;
import org.apache.poi.hssf.record.StyleRecord;
import org.apache.poi.hssf.record.TabIdRecord;
import org.apache.poi.hssf.record.UseSelFSRecord;
import org.apache.poi.hssf.record.WindowOneRecord;
import org.apache.poi.hssf.record.WindowProtectRecord;
import org.apache.poi.hssf.record.WriteAccessRecord;
import org.apache.poi.hssf.record.WriteProtectRecord;
import org.apache.poi.hssf.record.common.UnicodeString;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.FormulaShifter;
import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.ss.formula.ptg.NameXPtg;
import org.apache.poi.ss.formula.ptg.OperandPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPtg;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.BuiltinFormats;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

@Internal
public final class InternalWorkbook {

   private static final int MAX_SENSITIVE_SHEET_NAME_LEN = 31;
   public static final String[] WORKBOOK_DIR_ENTRY_NAMES = new String[]{"Workbook", "WORKBOOK", "BOOK"};
   public static final String OLD_WORKBOOK_DIR_ENTRY_NAME = "Book";
   private static final POILogger log = POILogFactory.getLogger(InternalWorkbook.class);
   private static final int DEBUG = 1;
   private static final short CODEPAGE = 1200;
   private final WorkbookRecordList records = new WorkbookRecordList();
   protected SSTRecord sst;
   private LinkTable linkTable;
   private final List boundsheets = new ArrayList();
   private final List formats = new ArrayList();
   private final List hyperlinks = new ArrayList();
   private int numxfs = 0;
   private int numfonts = 0;
   private int maxformatid = -1;
   private boolean uses1904datewindowing = false;
   private DrawingManager2 drawingManager;
   private List escherBSERecords = new ArrayList();
   private WindowOneRecord windowOne;
   private FileSharingRecord fileShare;
   private WriteAccessRecord writeAccess;
   private WriteProtectRecord writeProtect;
   private final Map commentRecords = new LinkedHashMap();


   public static InternalWorkbook createWorkbook(List recs) {
      if(log.check(1)) {
         log.log(1, new Object[]{"Workbook (readfile) created with reclen=", Integer.valueOf(recs.size())});
      }

      InternalWorkbook retval = new InternalWorkbook();
      ArrayList records = new ArrayList(recs.size() / 3);
      retval.records.setRecords(records);
      int k = 0;

      while(true) {
         Record rec;
         if(k < recs.size()) {
            rec = (Record)recs.get(k);
            if(rec.getSid() != 10) {
               label132: {
                  switch(rec.getSid()) {
                  case 18:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found protect record at " + k});
                     }

                     retval.records.setProtpos(k);
                     break;
                  case 23:
                     throw new RuntimeException("Extern sheet is part of LinkTable");
                  case 24:
                  case 430:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found SupBook record at " + k});
                     }

                     retval.linkTable = new LinkTable(recs, k, retval.records, retval.commentRecords);
                     k += retval.linkTable.getRecordCount() - 1;
                     break label132;
                  case 34:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found datewindow1904 record at " + k});
                     }

                     retval.uses1904datewindowing = ((DateWindow1904Record)rec).getWindowing() == 1;
                     break;
                  case 49:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found font record at " + k});
                     }

                     retval.records.setFontpos(k);
                     ++retval.numfonts;
                     break;
                  case 61:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found WindowOneRecord at " + k});
                     }

                     retval.windowOne = (WindowOneRecord)rec;
                     break;
                  case 64:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found backup record at " + k});
                     }

                     retval.records.setBackuppos(k);
                     break;
                  case 91:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found FileSharing at " + k});
                     }

                     retval.fileShare = (FileSharingRecord)rec;
                     break;
                  case 92:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found WriteAccess at " + k});
                     }

                     retval.writeAccess = (WriteAccessRecord)rec;
                     break;
                  case 133:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found boundsheet record at " + k});
                     }

                     retval.boundsheets.add((BoundSheetRecord)rec);
                     retval.records.setBspos(k);
                     break;
                  case 134:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found WriteProtect at " + k});
                     }

                     retval.writeProtect = (WriteProtectRecord)rec;
                     break;
                  case 146:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found palette record at " + k});
                     }

                     retval.records.setPalettepos(k);
                     break;
                  case 224:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found XF record at " + k});
                     }

                     retval.records.setXfpos(k);
                     ++retval.numxfs;
                     break;
                  case 252:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found sst record at " + k});
                     }

                     retval.sst = (SSTRecord)rec;
                     break;
                  case 317:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found tabid record at " + k});
                     }

                     retval.records.setTabpos(k);
                     break;
                  case 1054:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found format record at " + k});
                     }

                     retval.formats.add((FormatRecord)rec);
                     retval.maxformatid = retval.maxformatid >= ((FormatRecord)rec).getIndexCode()?retval.maxformatid:((FormatRecord)rec).getIndexCode();
                     break;
                  case 2196:
                     NameCommentRecord ncr = (NameCommentRecord)rec;
                     if(log.check(1)) {
                        log.log(1, new Object[]{"found NameComment at " + k});
                     }

                     retval.commentRecords.put(ncr.getNameText(), ncr);
                     break;
                  default:
                     if(log.check(1)) {
                        log.log(1, new Object[]{"ignoring record (sid=" + rec.getSid() + ") at " + k});
                     }
                  }

                  records.add(rec);
               }

               ++k;
               continue;
            }

            records.add(rec);
            if(log.check(1)) {
               log.log(1, new Object[]{"found workbook eof record at " + k});
            }
         }

         while(k < recs.size()) {
            rec = (Record)recs.get(k);
            switch(rec.getSid()) {
            case 440:
               retval.hyperlinks.add((HyperlinkRecord)rec);
            default:
               ++k;
            }
         }

         if(retval.windowOne == null) {
            retval.windowOne = createWindowOne();
         }

         if(log.check(1)) {
            log.log(1, new Object[]{"exit create workbook from existing file function"});
         }

         return retval;
      }
   }

   public static InternalWorkbook createWorkbook() {
      if(log.check(1)) {
         log.log(1, new Object[]{"creating new workbook from scratch"});
      }

      InternalWorkbook retval = new InternalWorkbook();
      ArrayList records = new ArrayList(30);
      retval.records.setRecords(records);
      List formats = retval.formats;
      records.add(createBOF());
      records.add(new InterfaceHdrRecord(1200));
      records.add(createMMS());
      records.add(InterfaceEndRecord.instance);
      records.add(createWriteAccess());
      records.add(createCodepage());
      records.add(createDSF());
      records.add(createTabId());
      retval.records.setTabpos(records.size() - 1);
      records.add(createFnGroupCount());
      records.add(createWindowProtect());
      records.add(createProtect());
      retval.records.setProtpos(records.size() - 1);
      records.add(createPassword());
      records.add(createProtectionRev4());
      records.add(createPasswordRev4());
      retval.windowOne = createWindowOne();
      records.add(retval.windowOne);
      records.add(createBackup());
      retval.records.setBackuppos(records.size() - 1);
      records.add(createHideObj());
      records.add(createDateWindow1904());
      records.add(createPrecision());
      records.add(createRefreshAll());
      records.add(createBookBool());
      records.add(createFont());
      records.add(createFont());
      records.add(createFont());
      records.add(createFont());
      retval.records.setFontpos(records.size() - 1);
      retval.numfonts = 4;

      int nBoundSheets;
      for(nBoundSheets = 0; nBoundSheets <= 7; ++nBoundSheets) {
         FormatRecord k = createFormat(nBoundSheets);
         retval.maxformatid = retval.maxformatid >= k.getIndexCode()?retval.maxformatid:k.getIndexCode();
         formats.add(k);
         records.add(k);
      }

      for(nBoundSheets = 0; nBoundSheets < 21; ++nBoundSheets) {
         records.add(createExtendedFormat(nBoundSheets));
         ++retval.numxfs;
      }

      retval.records.setXfpos(records.size() - 1);

      for(nBoundSheets = 0; nBoundSheets < 6; ++nBoundSheets) {
         records.add(createStyle(nBoundSheets));
      }

      records.add(createUseSelFS());
      byte var7 = 1;

      int var6;
      for(var6 = 0; var6 < var7; ++var6) {
         BoundSheetRecord bsr = createBoundSheet(var6);
         records.add(bsr);
         retval.boundsheets.add(bsr);
         retval.records.setBspos(records.size() - 1);
      }

      records.add(createCountry());

      for(var6 = 0; var6 < var7; ++var6) {
         retval.getOrCreateLinkTable().checkExternSheet(var6);
      }

      retval.sst = new SSTRecord();
      records.add(retval.sst);
      records.add(createExtendedSST());
      records.add(EOFRecord.instance);
      if(log.check(1)) {
         log.log(1, new Object[]{"exit create new workbook from scratch"});
      }

      return retval;
   }

   public NameRecord getSpecificBuiltinRecord(byte name, int sheetNumber) {
      return this.getOrCreateLinkTable().getSpecificBuiltinRecord(name, sheetNumber);
   }

   public void removeBuiltinRecord(byte name, int sheetIndex) {
      this.linkTable.removeBuiltinRecord(name, sheetIndex);
   }

   public int getNumRecords() {
      return this.records.size();
   }

   public FontRecord getFontRecordAt(int idx) {
      int index = idx;
      if(idx > 4) {
         index = idx - 1;
      }

      if(index > this.numfonts - 1) {
         throw new ArrayIndexOutOfBoundsException("There are only " + this.numfonts + " font records, you asked for " + idx);
      } else {
         FontRecord retval = (FontRecord)this.records.get(this.records.getFontpos() - (this.numfonts - 1) + index);
         return retval;
      }
   }

   public int getFontIndex(FontRecord font) {
      for(int i = 0; i <= this.numfonts; ++i) {
         FontRecord thisFont = (FontRecord)this.records.get(this.records.getFontpos() - (this.numfonts - 1) + i);
         if(thisFont == font) {
            if(i > 3) {
               return i + 1;
            }

            return i;
         }
      }

      throw new IllegalArgumentException("Could not find that font!");
   }

   public FontRecord createNewFont() {
      FontRecord rec = createFont();
      this.records.add(this.records.getFontpos() + 1, rec);
      this.records.setFontpos(this.records.getFontpos() + 1);
      ++this.numfonts;
      return rec;
   }

   public void removeFontRecord(FontRecord rec) {
      this.records.remove(rec);
      --this.numfonts;
   }

   public int getNumberOfFontRecords() {
      return this.numfonts;
   }

   public void setSheetBof(int sheetIndex, int pos) {
      if(log.check(1)) {
         log.log(1, new Object[]{"setting bof for sheetnum =", Integer.valueOf(sheetIndex), " at pos=", Integer.valueOf(pos)});
      }

      this.checkSheets(sheetIndex);
      this.getBoundSheetRec(sheetIndex).setPositionOfBof(pos);
   }

   private BoundSheetRecord getBoundSheetRec(int sheetIndex) {
      return (BoundSheetRecord)this.boundsheets.get(sheetIndex);
   }

   public BackupRecord getBackupRecord() {
      return (BackupRecord)this.records.get(this.records.getBackuppos());
   }

   public void setSheetName(int sheetnum, String sheetname) {
      this.checkSheets(sheetnum);
      if(sheetname.length() > 31) {
         sheetname = sheetname.substring(0, 31);
      }

      BoundSheetRecord sheet = (BoundSheetRecord)this.boundsheets.get(sheetnum);
      sheet.setSheetname(sheetname);
   }

   public boolean doesContainsSheetName(String name, int excludeSheetIdx) {
      String aName = name;
      if(name.length() > 31) {
         aName = name.substring(0, 31);
      }

      for(int i = 0; i < this.boundsheets.size(); ++i) {
         BoundSheetRecord boundSheetRecord = this.getBoundSheetRec(i);
         if(excludeSheetIdx != i) {
            String bName = boundSheetRecord.getSheetname();
            if(bName.length() > 31) {
               bName = bName.substring(0, 31);
            }

            if(aName.equalsIgnoreCase(bName)) {
               return true;
            }
         }
      }

      return false;
   }

   public void setSheetOrder(String sheetname, int pos) {
      int sheetNumber = this.getSheetIndex(sheetname);
      this.boundsheets.add(pos, this.boundsheets.remove(sheetNumber));
      int initialBspos = this.records.getBspos();
      int pos0 = initialBspos - (this.boundsheets.size() - 1);
      Record removed = this.records.get(pos0 + sheetNumber);
      this.records.remove(pos0 + sheetNumber);
      this.records.add(pos0 + pos, removed);
      this.records.setBspos(initialBspos);
   }

   public String getSheetName(int sheetIndex) {
      return this.getBoundSheetRec(sheetIndex).getSheetname();
   }

   public boolean isSheetHidden(int sheetnum) {
      return this.getBoundSheetRec(sheetnum).isHidden();
   }

   public boolean isSheetVeryHidden(int sheetnum) {
      return this.getBoundSheetRec(sheetnum).isVeryHidden();
   }

   public void setSheetHidden(int sheetnum, boolean hidden) {
      this.getBoundSheetRec(sheetnum).setHidden(hidden);
   }

   public void setSheetHidden(int sheetnum, int hidden) {
      BoundSheetRecord bsr = this.getBoundSheetRec(sheetnum);
      boolean h = false;
      boolean vh = false;
      if(hidden != 0) {
         if(hidden == 1) {
            h = true;
         } else {
            if(hidden != 2) {
               throw new IllegalArgumentException("Invalid hidden flag " + hidden + " given, must be 0, 1 or 2");
            }

            vh = true;
         }
      }

      bsr.setHidden(h);
      bsr.setVeryHidden(vh);
   }

   public int getSheetIndex(String name) {
      int retval = -1;

      for(int k = 0; k < this.boundsheets.size(); ++k) {
         String sheet = this.getSheetName(k);
         if(sheet.equalsIgnoreCase(name)) {
            retval = k;
            break;
         }
      }

      return retval;
   }

   private void checkSheets(int sheetnum) {
      if(this.boundsheets.size() <= sheetnum) {
         if(this.boundsheets.size() + 1 <= sheetnum) {
            throw new RuntimeException("Sheet number out of bounds!");
         }

         BoundSheetRecord bsr = createBoundSheet(sheetnum);
         this.records.add(this.records.getBspos() + 1, bsr);
         this.records.setBspos(this.records.getBspos() + 1);
         this.boundsheets.add(bsr);
         this.getOrCreateLinkTable().checkExternSheet(sheetnum);
         this.fixTabIdRecord();
      }

   }

   public void removeSheet(int sheetIndex) {
      if(this.boundsheets.size() > sheetIndex) {
         this.records.remove(this.records.getBspos() - (this.boundsheets.size() - 1) + sheetIndex);
         this.boundsheets.remove(sheetIndex);
         this.fixTabIdRecord();
      }

      int sheetNum1Based = sheetIndex + 1;

      for(int i = 0; i < this.getNumNames(); ++i) {
         NameRecord nr = this.getNameRecord(i);
         if(nr.getSheetNumber() == sheetNum1Based) {
            nr.setSheetNumber(0);
         } else if(nr.getSheetNumber() > sheetNum1Based) {
            nr.setSheetNumber(nr.getSheetNumber() - 1);
         }
      }

      if(this.linkTable != null) {
         this.linkTable.removeSheet(sheetIndex);
      }

   }

   private void fixTabIdRecord() {
      Record rec = this.records.get(this.records.getTabpos());
      if(this.records.getTabpos() > 0) {
         TabIdRecord tir = (TabIdRecord)rec;
         short[] tia = new short[this.boundsheets.size()];

         for(short k = 0; k < tia.length; tia[k] = k++) {
            ;
         }

         tir.setTabIdArray(tia);
      }
   }

   public int getNumSheets() {
      if(log.check(1)) {
         log.log(1, new Object[]{"getNumSheets=", Integer.valueOf(this.boundsheets.size())});
      }

      return this.boundsheets.size();
   }

   public int getNumExFormats() {
      if(log.check(1)) {
         log.log(1, new Object[]{"getXF=", Integer.valueOf(this.numxfs)});
      }

      return this.numxfs;
   }

   public ExtendedFormatRecord getExFormatAt(int index) {
      int xfptr = this.records.getXfpos() - (this.numxfs - 1);
      xfptr += index;
      ExtendedFormatRecord retval = (ExtendedFormatRecord)this.records.get(xfptr);
      return retval;
   }

   public void removeExFormatRecord(ExtendedFormatRecord rec) {
      this.records.remove(rec);
      --this.numxfs;
   }

   public void removeExFormatRecord(int index) {
      int xfptr = this.records.getXfpos() - (this.numxfs - 1) + index;
      this.records.remove(xfptr);
      --this.numxfs;
   }

   public ExtendedFormatRecord createCellXF() {
      ExtendedFormatRecord xf = createExtendedFormat();
      this.records.add(this.records.getXfpos() + 1, xf);
      this.records.setXfpos(this.records.getXfpos() + 1);
      ++this.numxfs;
      return xf;
   }

   public StyleRecord getStyleRecord(int xfIndex) {
      for(int i = this.records.getXfpos(); i < this.records.size(); ++i) {
         Record r = this.records.get(i);
         if(!(r instanceof ExtendedFormatRecord) && r instanceof StyleRecord) {
            StyleRecord sr = (StyleRecord)r;
            if(sr.getXFIndex() == xfIndex) {
               return sr;
            }
         }
      }

      return null;
   }

   public StyleRecord createStyleRecord(int xfIndex) {
      StyleRecord newSR = new StyleRecord();
      newSR.setXFIndex(xfIndex);
      int addAt = -1;

      for(int i = this.records.getXfpos(); i < this.records.size() && addAt == -1; ++i) {
         Record r = this.records.get(i);
         if(!(r instanceof ExtendedFormatRecord) && !(r instanceof StyleRecord)) {
            addAt = i;
         }
      }

      if(addAt == -1) {
         throw new IllegalStateException("No XF Records found!");
      } else {
         this.records.add(addAt, newSR);
         return newSR;
      }
   }

   public int addSSTString(UnicodeString string) {
      if(log.check(1)) {
         log.log(1, new Object[]{"insert to sst string=\'", string});
      }

      if(this.sst == null) {
         this.insertSST();
      }

      return this.sst.addString(string);
   }

   public UnicodeString getSSTString(int str) {
      if(this.sst == null) {
         this.insertSST();
      }

      UnicodeString retval = this.sst.getString(str);
      if(log.check(1)) {
         log.log(1, new Object[]{"Returning SST for index=", Integer.valueOf(str), " String= ", retval});
      }

      return retval;
   }

   public void insertSST() {
      if(log.check(1)) {
         log.log(1, new Object[]{"creating new SST via insertSST!"});
      }

      this.sst = new SSTRecord();
      this.records.add(this.records.size() - 1, createExtendedSST());
      this.records.add(this.records.size() - 2, this.sst);
   }

   public int serialize(int offset, byte[] data) {
      if(log.check(1)) {
         log.log(1, new Object[]{"Serializing Workbook with offsets"});
      }

      int pos = 0;
      SSTRecord sst = null;
      int sstPos = 0;
      boolean wroteBoundSheets = false;

      for(int k = 0; k < this.records.size(); ++k) {
         Object record = this.records.get(k);
         int len = 0;
         if(record instanceof SSTRecord) {
            sst = (SSTRecord)record;
            sstPos = pos;
         }

         if(((Record)record).getSid() == 255 && sst != null) {
            record = sst.createExtSSTRecord(sstPos + offset);
         }

         if(record instanceof BoundSheetRecord) {
            if(!wroteBoundSheets) {
               for(int i = 0; i < this.boundsheets.size(); ++i) {
                  len += this.getBoundSheetRec(i).serialize(pos + offset + len, data);
               }

               wroteBoundSheets = true;
            }
         } else {
            len = ((Record)record).serialize(pos + offset, data);
         }

         pos += len;
      }

      if(log.check(1)) {
         log.log(1, new Object[]{"Exiting serialize workbook"});
      }

      return pos;
   }

   public void preSerialize() {
      if(this.records.getTabpos() > 0) {
         TabIdRecord tir = (TabIdRecord)this.records.get(this.records.getTabpos());
         if(tir._tabids.length < this.boundsheets.size()) {
            this.fixTabIdRecord();
         }
      }

   }

   public int getSize() {
      int retval = 0;
      SSTRecord sst = null;

      for(int k = 0; k < this.records.size(); ++k) {
         Record record = this.records.get(k);
         if(record instanceof SSTRecord) {
            sst = (SSTRecord)record;
         }

         if(record.getSid() == 255 && sst != null) {
            retval += sst.calcExtSSTRecordSize();
         } else {
            retval += record.getRecordSize();
         }
      }

      return retval;
   }

   private static BOFRecord createBOF() {
      BOFRecord retval = new BOFRecord();
      retval.setVersion(1536);
      retval.setType(5);
      retval.setBuild(4307);
      retval.setBuildYear(1996);
      retval.setHistoryBitMask(65);
      retval.setRequiredVersion(6);
      return retval;
   }

   private static MMSRecord createMMS() {
      MMSRecord retval = new MMSRecord();
      retval.setAddMenuCount((byte)0);
      retval.setDelMenuCount((byte)0);
      return retval;
   }

   private static WriteAccessRecord createWriteAccess() {
      WriteAccessRecord retval = new WriteAccessRecord();
      String defaultUserName = "POI";

      try {
         String e = System.getProperty("user.name");
         if(e == null) {
            e = defaultUserName;
         }

         retval.setUsername(e);
      } catch (AccessControlException var3) {
         retval.setUsername(defaultUserName);
      }

      return retval;
   }

   private static CodepageRecord createCodepage() {
      CodepageRecord retval = new CodepageRecord();
      retval.setCodepage((short)1200);
      return retval;
   }

   private static DSFRecord createDSF() {
      return new DSFRecord(false);
   }

   private static TabIdRecord createTabId() {
      return new TabIdRecord();
   }

   private static FnGroupCountRecord createFnGroupCount() {
      FnGroupCountRecord retval = new FnGroupCountRecord();
      retval.setCount((short)14);
      return retval;
   }

   private static WindowProtectRecord createWindowProtect() {
      return new WindowProtectRecord(false);
   }

   private static ProtectRecord createProtect() {
      return new ProtectRecord(false);
   }

   private static PasswordRecord createPassword() {
      return new PasswordRecord(0);
   }

   private static ProtectionRev4Record createProtectionRev4() {
      return new ProtectionRev4Record(false);
   }

   private static PasswordRev4Record createPasswordRev4() {
      return new PasswordRev4Record(0);
   }

   private static WindowOneRecord createWindowOne() {
      WindowOneRecord retval = new WindowOneRecord();
      retval.setHorizontalHold((short)360);
      retval.setVerticalHold((short)270);
      retval.setWidth((short)14940);
      retval.setHeight((short)9150);
      retval.setOptions((short)56);
      retval.setActiveSheetIndex(0);
      retval.setFirstVisibleTab(0);
      retval.setNumSelectedTabs((short)1);
      retval.setTabWidthRatio((short)600);
      return retval;
   }

   private static BackupRecord createBackup() {
      BackupRecord retval = new BackupRecord();
      retval.setBackup((short)0);
      return retval;
   }

   private static HideObjRecord createHideObj() {
      HideObjRecord retval = new HideObjRecord();
      retval.setHideObj((short)0);
      return retval;
   }

   private static DateWindow1904Record createDateWindow1904() {
      DateWindow1904Record retval = new DateWindow1904Record();
      retval.setWindowing((short)0);
      return retval;
   }

   private static PrecisionRecord createPrecision() {
      PrecisionRecord retval = new PrecisionRecord();
      retval.setFullPrecision(true);
      return retval;
   }

   private static RefreshAllRecord createRefreshAll() {
      return new RefreshAllRecord(false);
   }

   private static BookBoolRecord createBookBool() {
      BookBoolRecord retval = new BookBoolRecord();
      retval.setSaveLinkValues((short)0);
      return retval;
   }

   private static FontRecord createFont() {
      FontRecord retval = new FontRecord();
      retval.setFontHeight((short)200);
      retval.setAttributes((short)0);
      retval.setColorPaletteIndex((short)32767);
      retval.setBoldWeight((short)400);
      retval.setFontName("Arial");
      return retval;
   }

   private static FormatRecord createFormat(int id) {
      switch(id) {
      case 0:
         return new FormatRecord(5, BuiltinFormats.getBuiltinFormat(5));
      case 1:
         return new FormatRecord(6, BuiltinFormats.getBuiltinFormat(6));
      case 2:
         return new FormatRecord(7, BuiltinFormats.getBuiltinFormat(7));
      case 3:
         return new FormatRecord(8, BuiltinFormats.getBuiltinFormat(8));
      case 4:
         return new FormatRecord(42, BuiltinFormats.getBuiltinFormat(42));
      case 5:
         return new FormatRecord(41, BuiltinFormats.getBuiltinFormat(41));
      case 6:
         return new FormatRecord(44, BuiltinFormats.getBuiltinFormat(44));
      case 7:
         return new FormatRecord(43, BuiltinFormats.getBuiltinFormat(43));
      default:
         throw new IllegalArgumentException("Unexpected id " + id);
      }
   }

   private static ExtendedFormatRecord createExtendedFormat(int id) {
      ExtendedFormatRecord retval = new ExtendedFormatRecord();
      switch(id) {
      case 0:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)0);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 1:
         retval.setFontIndex((short)1);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 2:
         retval.setFontIndex((short)1);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 3:
         retval.setFontIndex((short)2);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 4:
         retval.setFontIndex((short)2);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 5:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 6:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 7:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 8:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 9:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 10:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 11:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 12:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 13:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 14:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-3072);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 15:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)1);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)0);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 16:
         retval.setFontIndex((short)1);
         retval.setFormatIndex((short)43);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-2048);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 17:
         retval.setFontIndex((short)1);
         retval.setFormatIndex((short)41);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-2048);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 18:
         retval.setFontIndex((short)1);
         retval.setFormatIndex((short)44);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-2048);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 19:
         retval.setFontIndex((short)1);
         retval.setFormatIndex((short)42);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-2048);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 20:
         retval.setFontIndex((short)1);
         retval.setFormatIndex((short)9);
         retval.setCellOptions((short)-11);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)-2048);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 21:
         retval.setFontIndex((short)5);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)1);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)2048);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 22:
         retval.setFontIndex((short)6);
         retval.setFormatIndex((short)0);
         retval.setCellOptions((short)1);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)23552);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 23:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)49);
         retval.setCellOptions((short)1);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)23552);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 24:
         retval.setFontIndex((short)0);
         retval.setFormatIndex((short)8);
         retval.setCellOptions((short)1);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)23552);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      case 25:
         retval.setFontIndex((short)6);
         retval.setFormatIndex((short)8);
         retval.setCellOptions((short)1);
         retval.setAlignmentOptions((short)32);
         retval.setIndentionOptions((short)23552);
         retval.setBorderOptions((short)0);
         retval.setPaletteOptions((short)0);
         retval.setAdtlPaletteOptions((short)0);
         retval.setFillPaletteOptions((short)8384);
         break;
      default:
         throw new IllegalStateException("Unrecognized format id: " + id);
      }

      return retval;
   }

   private static ExtendedFormatRecord createExtendedFormat() {
      ExtendedFormatRecord retval = new ExtendedFormatRecord();
      retval.setFontIndex((short)0);
      retval.setFormatIndex((short)0);
      retval.setCellOptions((short)1);
      retval.setAlignmentOptions((short)32);
      retval.setIndentionOptions((short)0);
      retval.setBorderOptions((short)0);
      retval.setPaletteOptions((short)0);
      retval.setAdtlPaletteOptions((short)0);
      retval.setFillPaletteOptions((short)8384);
      retval.setTopBorderPaletteIdx((short)8);
      retval.setBottomBorderPaletteIdx((short)8);
      retval.setLeftBorderPaletteIdx((short)8);
      retval.setRightBorderPaletteIdx((short)8);
      return retval;
   }

   private static StyleRecord createStyle(int id) {
      StyleRecord retval = new StyleRecord();
      switch(id) {
      case 0:
         retval.setXFIndex(16);
         retval.setBuiltinStyle(3);
         retval.setOutlineStyleLevel(-1);
         break;
      case 1:
         retval.setXFIndex(17);
         retval.setBuiltinStyle(6);
         retval.setOutlineStyleLevel(-1);
         break;
      case 2:
         retval.setXFIndex(18);
         retval.setBuiltinStyle(4);
         retval.setOutlineStyleLevel(-1);
         break;
      case 3:
         retval.setXFIndex(19);
         retval.setBuiltinStyle(7);
         retval.setOutlineStyleLevel(-1);
         break;
      case 4:
         retval.setXFIndex(0);
         retval.setBuiltinStyle(0);
         retval.setOutlineStyleLevel(-1);
         break;
      case 5:
         retval.setXFIndex(20);
         retval.setBuiltinStyle(5);
         retval.setOutlineStyleLevel(-1);
         break;
      default:
         throw new IllegalStateException("Unrecognized style id: " + id);
      }

      return retval;
   }

   private static PaletteRecord createPalette() {
      return new PaletteRecord();
   }

   private static UseSelFSRecord createUseSelFS() {
      return new UseSelFSRecord(false);
   }

   private static BoundSheetRecord createBoundSheet(int id) {
      return new BoundSheetRecord("Sheet" + (id + 1));
   }

   private static CountryRecord createCountry() {
      CountryRecord retval = new CountryRecord();
      retval.setDefaultCountry((short)1);
      if(LocaleUtil.getUserLocale().toString().equals("ru_RU")) {
         retval.setCurrentCountry((short)7);
      } else {
         retval.setCurrentCountry((short)1);
      }

      return retval;
   }

   private static ExtSSTRecord createExtendedSST() {
      ExtSSTRecord retval = new ExtSSTRecord();
      retval.setNumStringsPerBucket((short)8);
      return retval;
   }

   private LinkTable getOrCreateLinkTable() {
      if(this.linkTable == null) {
         this.linkTable = new LinkTable((short)this.getNumSheets(), this.records);
      }

      return this.linkTable;
   }

   public int linkExternalWorkbook(String name, Workbook externalWorkbook) {
      return this.getOrCreateLinkTable().linkExternalWorkbook(name, externalWorkbook);
   }

   public String findSheetFirstNameFromExternSheet(int externSheetIndex) {
      int indexToSheet = this.linkTable.getFirstInternalSheetIndexForExtIndex(externSheetIndex);
      return this.findSheetNameFromIndex(indexToSheet);
   }

   public String findSheetLastNameFromExternSheet(int externSheetIndex) {
      int indexToSheet = this.linkTable.getLastInternalSheetIndexForExtIndex(externSheetIndex);
      return this.findSheetNameFromIndex(indexToSheet);
   }

   private String findSheetNameFromIndex(int internalSheetIndex) {
      return internalSheetIndex < 0?"":(internalSheetIndex >= this.boundsheets.size()?"":this.getSheetName(internalSheetIndex));
   }

   public EvaluationWorkbook.ExternalSheet getExternalSheet(int externSheetIndex) {
      String[] extNames = this.linkTable.getExternalBookAndSheetName(externSheetIndex);
      return (EvaluationWorkbook.ExternalSheet)(extNames == null?null:(extNames.length == 2?new EvaluationWorkbook.ExternalSheet(extNames[0], extNames[1]):new EvaluationWorkbook.ExternalSheetRange(extNames[0], extNames[1], extNames[2])));
   }

   public EvaluationWorkbook.ExternalName getExternalName(int externSheetIndex, int externNameIndex) {
      String nameName = this.linkTable.resolveNameXText(externSheetIndex, externNameIndex, this);
      if(nameName == null) {
         return null;
      } else {
         int ix = this.linkTable.resolveNameXIx(externSheetIndex, externNameIndex);
         return new EvaluationWorkbook.ExternalName(nameName, externNameIndex, ix);
      }
   }

   public int getFirstSheetIndexFromExternSheetIndex(int externSheetNumber) {
      return this.linkTable.getFirstInternalSheetIndexForExtIndex(externSheetNumber);
   }

   public int getLastSheetIndexFromExternSheetIndex(int externSheetNumber) {
      return this.linkTable.getLastInternalSheetIndexForExtIndex(externSheetNumber);
   }

   public short checkExternSheet(int sheetNumber) {
      return (short)this.getOrCreateLinkTable().checkExternSheet(sheetNumber);
   }

   public short checkExternSheet(int firstSheetNumber, int lastSheetNumber) {
      return (short)this.getOrCreateLinkTable().checkExternSheet(firstSheetNumber, lastSheetNumber);
   }

   public int getExternalSheetIndex(String workbookName, String sheetName) {
      return this.getOrCreateLinkTable().getExternalSheetIndex(workbookName, sheetName, sheetName);
   }

   public int getExternalSheetIndex(String workbookName, String firstSheetName, String lastSheetName) {
      return this.getOrCreateLinkTable().getExternalSheetIndex(workbookName, firstSheetName, lastSheetName);
   }

   public int getNumNames() {
      return this.linkTable == null?0:this.linkTable.getNumNames();
   }

   public NameRecord getNameRecord(int index) {
      return this.linkTable.getNameRecord(index);
   }

   public NameCommentRecord getNameCommentRecord(NameRecord nameRecord) {
      return (NameCommentRecord)this.commentRecords.get(nameRecord.getNameText());
   }

   public NameRecord createName() {
      return this.addName(new NameRecord());
   }

   public NameRecord addName(NameRecord name) {
      LinkTable linkTable = this.getOrCreateLinkTable();
      linkTable.addName(name);
      return name;
   }

   public NameRecord createBuiltInName(byte builtInName, int sheetNumber) {
      if(sheetNumber >= 0 && sheetNumber + 1 <= 32767) {
         NameRecord name = new NameRecord(builtInName, sheetNumber);
         if(this.linkTable.nameAlreadyExists(name)) {
            throw new RuntimeException("Builtin (" + builtInName + ") already exists for sheet (" + sheetNumber + ")");
         } else {
            this.addName(name);
            return name;
         }
      } else {
         throw new IllegalArgumentException("Sheet number [" + sheetNumber + "]is not valid ");
      }
   }

   public void removeName(int nameIndex) {
      if(this.linkTable.getNumNames() > nameIndex) {
         int idx = this.findFirstRecordLocBySid((short)24);
         this.records.remove(idx + nameIndex);
         this.linkTable.removeName(nameIndex);
      }

   }

   public void updateNameCommentRecordCache(NameCommentRecord commentRecord) {
      if(this.commentRecords.containsValue(commentRecord)) {
         Iterator i$ = this.commentRecords.entrySet().iterator();

         while(i$.hasNext()) {
            Entry entry = (Entry)i$.next();
            if(((NameCommentRecord)entry.getValue()).equals(commentRecord)) {
               this.commentRecords.remove(entry.getKey());
               break;
            }
         }
      }

      this.commentRecords.put(commentRecord.getNameText(), commentRecord);
   }

   public short getFormat(String format, boolean createIfNotFound) {
      Iterator i$ = this.formats.iterator();

      FormatRecord r;
      do {
         if(!i$.hasNext()) {
            if(createIfNotFound) {
               return (short)this.createFormat(format);
            }

            return (short)-1;
         }

         r = (FormatRecord)i$.next();
      } while(!r.getFormatString().equals(format));

      return (short)r.getIndexCode();
   }

   public List getFormats() {
      return this.formats;
   }

   public int createFormat(String formatString) {
      this.maxformatid = this.maxformatid >= 164?this.maxformatid + 1:164;
      FormatRecord rec = new FormatRecord(this.maxformatid, formatString);

      int pos;
      for(pos = 0; pos < this.records.size() && this.records.get(pos).getSid() != 1054; ++pos) {
         ;
      }

      pos += this.formats.size();
      this.formats.add(rec);
      this.records.add(pos, rec);
      return this.maxformatid;
   }

   public Record findFirstRecordBySid(short sid) {
      Iterator i$ = this.records.iterator();

      Record record;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         record = (Record)i$.next();
      } while(record.getSid() != sid);

      return record;
   }

   public int findFirstRecordLocBySid(short sid) {
      int index = 0;

      for(Iterator i$ = this.records.iterator(); i$.hasNext(); ++index) {
         Record record = (Record)i$.next();
         if(record.getSid() == sid) {
            return index;
         }
      }

      return -1;
   }

   public Record findNextRecordBySid(short sid, int pos) {
      int matches = 0;
      Iterator i$ = this.records.iterator();

      Record record;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         record = (Record)i$.next();
      } while(record.getSid() != sid || matches++ != pos);

      return record;
   }

   public List getHyperlinks() {
      return this.hyperlinks;
   }

   public List getRecords() {
      return this.records.getRecords();
   }

   public boolean isUsing1904DateWindowing() {
      return this.uses1904datewindowing;
   }

   public PaletteRecord getCustomPalette() {
      int palettePos = this.records.getPalettepos();
      PaletteRecord palette;
      if(palettePos != -1) {
         Record rec = this.records.get(palettePos);
         if(!(rec instanceof PaletteRecord)) {
            throw new RuntimeException("InternalError: Expected PaletteRecord but got a \'" + rec + "\'");
         }

         palette = (PaletteRecord)rec;
      } else {
         palette = createPalette();
         this.records.add(1, palette);
         this.records.setPalettepos(1);
      }

      return palette;
   }

   public DrawingManager2 findDrawingGroup() {
      if(this.drawingManager != null) {
         return this.drawingManager;
      } else {
         Iterator dgLoc = this.records.iterator();

         EscherContainerRecord bStore;
         while(dgLoc.hasNext()) {
            Record dg = (Record)dgLoc.next();
            if(dg instanceof DrawingGroupRecord) {
               DrawingGroupRecord dgg = (DrawingGroupRecord)dg;
               dgg.processChildRecords();
               bStore = dgg.getEscherContainer();
               if(bStore != null) {
                  EscherDggRecord i$ = null;
                  EscherContainerRecord bs = null;
                  Iterator i$1 = bStore.getChildIterator();

                  EscherRecord bs1;
                  while(i$1.hasNext()) {
                     bs1 = (EscherRecord)i$1.next();
                     if(bs1 instanceof EscherDggRecord) {
                        i$ = (EscherDggRecord)bs1;
                     } else if(bs1.getRecordId() == -4095) {
                        bs = (EscherContainerRecord)bs1;
                     }
                  }

                  if(i$ != null) {
                     this.drawingManager = new DrawingManager2(i$);
                     if(bs != null) {
                        i$1 = bs.getChildRecords().iterator();

                        while(i$1.hasNext()) {
                           bs1 = (EscherRecord)i$1.next();
                           if(bs1 instanceof EscherBSERecord) {
                              this.escherBSERecords.add((EscherBSERecord)bs1);
                           }
                        }
                     }

                     return this.drawingManager;
                  }
               }
            }
         }

         int dgLoc1 = this.findFirstRecordLocBySid((short)235);
         if(dgLoc1 != -1) {
            DrawingGroupRecord dg1 = (DrawingGroupRecord)this.records.get(dgLoc1);
            EscherDggRecord dgg1 = null;
            bStore = null;
            Iterator i$2 = dg1.getEscherRecords().iterator();

            EscherRecord bs2;
            while(i$2.hasNext()) {
               bs2 = (EscherRecord)i$2.next();
               if(bs2 instanceof EscherDggRecord) {
                  dgg1 = (EscherDggRecord)bs2;
               } else if(bs2.getRecordId() == -4095) {
                  bStore = (EscherContainerRecord)bs2;
               }
            }

            if(dgg1 != null) {
               this.drawingManager = new DrawingManager2(dgg1);
               if(bStore != null) {
                  i$2 = bStore.getChildRecords().iterator();

                  while(i$2.hasNext()) {
                     bs2 = (EscherRecord)i$2.next();
                     if(bs2 instanceof EscherBSERecord) {
                        this.escherBSERecords.add((EscherBSERecord)bs2);
                     }
                  }
               }
            }
         }

         return this.drawingManager;
      }
   }

   public void createDrawingGroup() {
      if(this.drawingManager == null) {
         EscherContainerRecord dggContainer = new EscherContainerRecord();
         EscherDggRecord dgg = new EscherDggRecord();
         EscherOptRecord opt = new EscherOptRecord();
         EscherSplitMenuColorsRecord splitMenuColors = new EscherSplitMenuColorsRecord();
         dggContainer.setRecordId((short)-4096);
         dggContainer.setOptions((short)15);
         dgg.setRecordId((short)-4090);
         dgg.setOptions((short)0);
         dgg.setShapeIdMax(1024);
         dgg.setNumShapesSaved(0);
         dgg.setDrawingsSaved(0);
         dgg.setFileIdClusters(new EscherDggRecord.FileIdCluster[0]);
         this.drawingManager = new DrawingManager2(dgg);
         EscherContainerRecord bstoreContainer = null;
         if(this.escherBSERecords.size() > 0) {
            bstoreContainer = new EscherContainerRecord();
            bstoreContainer.setRecordId((short)-4095);
            bstoreContainer.setOptions((short)(this.escherBSERecords.size() << 4 | 15));
            Iterator dgLoc = this.escherBSERecords.iterator();

            while(dgLoc.hasNext()) {
               EscherRecord drawingGroup = (EscherRecord)dgLoc.next();
               bstoreContainer.addChildRecord(drawingGroup);
            }
         }

         opt.setRecordId((short)-4085);
         opt.setOptions((short)51);
         opt.addEscherProperty(new EscherBoolProperty((short)191, 524296));
         opt.addEscherProperty(new EscherRGBProperty((short)385, 134217793));
         opt.addEscherProperty(new EscherRGBProperty((short)448, 134217792));
         splitMenuColors.setRecordId((short)-3810);
         splitMenuColors.setOptions((short)64);
         splitMenuColors.setColor1(134217741);
         splitMenuColors.setColor2(134217740);
         splitMenuColors.setColor3(134217751);
         splitMenuColors.setColor4(268435703);
         dggContainer.addChildRecord(dgg);
         if(bstoreContainer != null) {
            dggContainer.addChildRecord(bstoreContainer);
         }

         dggContainer.addChildRecord(opt);
         dggContainer.addChildRecord(splitMenuColors);
         int dgLoc1 = this.findFirstRecordLocBySid((short)235);
         DrawingGroupRecord drawingGroup1;
         if(dgLoc1 == -1) {
            drawingGroup1 = new DrawingGroupRecord();
            drawingGroup1.addEscherRecord(dggContainer);
            int loc = this.findFirstRecordLocBySid((short)140);
            this.getRecords().add(loc + 1, drawingGroup1);
         } else {
            drawingGroup1 = new DrawingGroupRecord();
            drawingGroup1.addEscherRecord(dggContainer);
            this.getRecords().set(dgLoc1, drawingGroup1);
         }
      }

   }

   public WindowOneRecord getWindowOne() {
      return this.windowOne;
   }

   public EscherBSERecord getBSERecord(int pictureIndex) {
      return (EscherBSERecord)this.escherBSERecords.get(pictureIndex - 1);
   }

   public int addBSERecord(EscherBSERecord e) {
      this.createDrawingGroup();
      this.escherBSERecords.add(e);
      int dgLoc = this.findFirstRecordLocBySid((short)235);
      DrawingGroupRecord drawingGroup = (DrawingGroupRecord)this.getRecords().get(dgLoc);
      EscherContainerRecord dggContainer = (EscherContainerRecord)drawingGroup.getEscherRecord(0);
      EscherContainerRecord bstoreContainer;
      if(dggContainer.getChild(1).getRecordId() == -4095) {
         bstoreContainer = (EscherContainerRecord)dggContainer.getChild(1);
      } else {
         bstoreContainer = new EscherContainerRecord();
         bstoreContainer.setRecordId((short)-4095);
         List childRecords = dggContainer.getChildRecords();
         childRecords.add(1, bstoreContainer);
         dggContainer.setChildRecords(childRecords);
      }

      bstoreContainer.setOptions((short)(this.escherBSERecords.size() << 4 | 15));
      bstoreContainer.addChildRecord(e);
      return this.escherBSERecords.size();
   }

   public DrawingManager2 getDrawingManager() {
      return this.drawingManager;
   }

   public WriteProtectRecord getWriteProtect() {
      if(this.writeProtect == null) {
         this.writeProtect = new WriteProtectRecord();
         boolean i = false;

         int var2;
         for(var2 = 0; var2 < this.records.size() && !(this.records.get(var2) instanceof BOFRecord); ++var2) {
            ;
         }

         this.records.add(var2 + 1, this.writeProtect);
      }

      return this.writeProtect;
   }

   public WriteAccessRecord getWriteAccess() {
      if(this.writeAccess == null) {
         this.writeAccess = createWriteAccess();
         boolean i = false;

         int var2;
         for(var2 = 0; var2 < this.records.size() && !(this.records.get(var2) instanceof InterfaceEndRecord); ++var2) {
            ;
         }

         this.records.add(var2 + 1, this.writeAccess);
      }

      return this.writeAccess;
   }

   public FileSharingRecord getFileSharing() {
      if(this.fileShare == null) {
         this.fileShare = new FileSharingRecord();
         boolean i = false;

         int var2;
         for(var2 = 0; var2 < this.records.size() && !(this.records.get(var2) instanceof WriteAccessRecord); ++var2) {
            ;
         }

         this.records.add(var2 + 1, this.fileShare);
      }

      return this.fileShare;
   }

   public boolean isWriteProtected() {
      if(this.fileShare == null) {
         return false;
      } else {
         FileSharingRecord frec = this.getFileSharing();
         return frec.getReadOnly() == 1;
      }
   }

   public void writeProtectWorkbook(String password, String username) {
      FileSharingRecord frec = this.getFileSharing();
      WriteAccessRecord waccess = this.getWriteAccess();
      this.getWriteProtect();
      frec.setReadOnly((short)1);
      frec.setPassword((short)CryptoFunctions.createXorVerifier1(password));
      frec.setUsername(username);
      waccess.setUsername(username);
   }

   public void unwriteProtectWorkbook() {
      this.records.remove(this.fileShare);
      this.records.remove(this.writeProtect);
      this.fileShare = null;
      this.writeProtect = null;
   }

   public String resolveNameXText(int refIndex, int definedNameIndex) {
      return this.linkTable.resolveNameXText(refIndex, definedNameIndex, this);
   }

   public NameXPtg getNameXPtg(String name, int sheetRefIndex, UDFFinder udf) {
      LinkTable lnk = this.getOrCreateLinkTable();
      NameXPtg xptg = lnk.getNameXPtg(name, sheetRefIndex);
      if(xptg == null && udf.findFunction(name) != null) {
         xptg = lnk.addNameXPtg(name);
      }

      return xptg;
   }

   public NameXPtg getNameXPtg(String name, UDFFinder udf) {
      return this.getNameXPtg(name, -1, udf);
   }

   public void cloneDrawings(InternalSheet sheet) {
      this.findDrawingGroup();
      if(this.drawingManager != null) {
         int aggLoc = sheet.aggregateDrawingRecords(this.drawingManager, false);
         if(aggLoc != -1) {
            EscherAggregate agg = (EscherAggregate)sheet.findFirstRecordBySid((short)9876);
            EscherContainerRecord escherContainer = agg.getEscherContainer();
            if(escherContainer == null) {
               return;
            }

            EscherDggRecord dgg = this.drawingManager.getDgg();
            short dgId = this.drawingManager.findNewDrawingGroupId();
            dgg.addCluster(dgId, 0);
            dgg.setDrawingsSaved(dgg.getDrawingsSaved() + 1);
            EscherDgRecord dg = null;
            Iterator it = escherContainer.getChildIterator();

            while(it.hasNext()) {
               EscherRecord er = (EscherRecord)it.next();
               if(er instanceof EscherDgRecord) {
                  dg = (EscherDgRecord)er;
                  dg.setOptions((short)(dgId << 4));
               } else if(er instanceof EscherContainerRecord) {
                  EscherContainerRecord cp = (EscherContainerRecord)er;
                  Iterator spIt = cp.getChildRecords().iterator();

                  while(spIt.hasNext()) {
                     EscherContainerRecord shapeContainer = (EscherContainerRecord)spIt.next();
                     Iterator i$ = shapeContainer.getChildRecords().iterator();

                     while(i$.hasNext()) {
                        EscherRecord shapeChildRecord = (EscherRecord)i$.next();
                        short recordId = shapeChildRecord.getRecordId();
                        if(recordId == -4086) {
                           EscherSpRecord opt = (EscherSpRecord)shapeChildRecord;
                           int prop = this.drawingManager.allocateShapeId((short)dgId, dg);
                           dg.setNumShapes(dg.getNumShapes() - 1);
                           opt.setShapeId(prop);
                        } else if(recordId == -4085) {
                           EscherOptRecord opt1 = (EscherOptRecord)shapeChildRecord;
                           EscherSimpleProperty prop1 = (EscherSimpleProperty)opt1.lookup(260);
                           if(prop1 != null) {
                              int pictureIndex = prop1.getPropertyValue();
                              EscherBSERecord bse = this.getBSERecord(pictureIndex);
                              bse.setRef(bse.getRef() + 1);
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public NameRecord cloneFilter(int filterDbNameIndex, int newSheetIndex) {
      NameRecord origNameRecord = this.getNameRecord(filterDbNameIndex);
      short newExtSheetIx = this.checkExternSheet(newSheetIndex);
      Ptg[] ptgs = origNameRecord.getNameDefinition();

      for(int newNameRecord = 0; newNameRecord < ptgs.length; ++newNameRecord) {
         Ptg ptg = ptgs[newNameRecord];
         if(ptg instanceof Area3DPtg) {
            Area3DPtg r3p = (Area3DPtg)((OperandPtg)ptg).copy();
            r3p.setExternSheetIndex(newExtSheetIx);
            ptgs[newNameRecord] = r3p;
         } else if(ptg instanceof Ref3DPtg) {
            Ref3DPtg var10 = (Ref3DPtg)((OperandPtg)ptg).copy();
            var10.setExternSheetIndex(newExtSheetIx);
            ptgs[newNameRecord] = var10;
         }
      }

      NameRecord var9 = this.createBuiltInName((byte)13, newSheetIndex + 1);
      var9.setNameDefinition(ptgs);
      var9.setHidden(true);
      return var9;
   }

   public void updateNamesAfterCellShift(FormulaShifter shifter) {
      for(int i = 0; i < this.getNumNames(); ++i) {
         NameRecord nr = this.getNameRecord(i);
         Ptg[] ptgs = nr.getNameDefinition();
         if(shifter.adjustFormula(ptgs, nr.getSheetNumber())) {
            nr.setNameDefinition(ptgs);
         }
      }

   }

   public RecalcIdRecord getRecalcId() {
      RecalcIdRecord record = (RecalcIdRecord)this.findFirstRecordBySid((short)449);
      if(record == null) {
         record = new RecalcIdRecord();
         int pos = this.findFirstRecordLocBySid((short)140);
         this.records.add(pos + 1, record);
      }

      return record;
   }

   public boolean changeExternalReference(String oldUrl, String newUrl) {
      return this.linkTable.changeExternalReference(oldUrl, newUrl);
   }

}
