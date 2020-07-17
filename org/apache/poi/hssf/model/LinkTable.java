package org.apache.poi.hssf.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.model.RecordStream;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.hssf.record.CRNCountRecord;
import org.apache.poi.hssf.record.CRNRecord;
import org.apache.poi.hssf.record.ExternSheetRecord;
import org.apache.poi.hssf.record.ExternalNameRecord;
import org.apache.poi.hssf.record.NameCommentRecord;
import org.apache.poi.hssf.record.NameRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.SupBookRecord;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.formula.ptg.ErrPtg;
import org.apache.poi.ss.formula.ptg.NameXPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.Workbook;

final class LinkTable {

   private LinkTable.ExternalBookBlock[] _externalBookBlocks;
   private final ExternSheetRecord _externSheetRecord;
   private final List _definedNames;
   private final int _recordCount;
   private final WorkbookRecordList _workbookRecordList;


   public LinkTable(List inputList, int startIndex, WorkbookRecordList workbookRecordList, Map commentRecords) {
      this._workbookRecordList = workbookRecordList;
      RecordStream rs = new RecordStream(inputList, startIndex);
      ArrayList temp = new ArrayList();

      while(rs.peekNextClass() == SupBookRecord.class) {
         temp.add(new LinkTable.ExternalBookBlock(rs));
      }

      this._externalBookBlocks = new LinkTable.ExternalBookBlock[temp.size()];
      temp.toArray(this._externalBookBlocks);
      temp.clear();
      if(this._externalBookBlocks.length > 0) {
         if(rs.peekNextClass() != ExternSheetRecord.class) {
            this._externSheetRecord = null;
         } else {
            this._externSheetRecord = readExtSheetRecord(rs);
         }
      } else {
         this._externSheetRecord = null;
      }

      this._definedNames = new ArrayList();

      while(true) {
         while(true) {
            Class nextClass = rs.peekNextClass();
            if(nextClass == NameRecord.class) {
               NameRecord ncr1 = (NameRecord)rs.getNext();
               this._definedNames.add(ncr1);
            } else {
               if(nextClass != NameCommentRecord.class) {
                  this._recordCount = rs.getCountRead();
                  this._workbookRecordList.getRecords().addAll(inputList.subList(startIndex, startIndex + this._recordCount));
                  return;
               }

               NameCommentRecord ncr = (NameCommentRecord)rs.getNext();
               commentRecords.put(ncr.getNameText(), ncr);
            }
         }
      }
   }

   private static ExternSheetRecord readExtSheetRecord(RecordStream rs) {
      ArrayList temp = new ArrayList(2);

      while(rs.peekNextClass() == ExternSheetRecord.class) {
         temp.add((ExternSheetRecord)rs.getNext());
      }

      int nItems = temp.size();
      if(nItems < 1) {
         throw new RuntimeException("Expected an EXTERNSHEET record but got (" + rs.peekNextClass().getName() + ")");
      } else if(nItems == 1) {
         return (ExternSheetRecord)temp.get(0);
      } else {
         ExternSheetRecord[] esrs = new ExternSheetRecord[nItems];
         temp.toArray(esrs);
         return ExternSheetRecord.combine(esrs);
      }
   }

   public LinkTable(int numberOfSheets, WorkbookRecordList workbookRecordList) {
      this._workbookRecordList = workbookRecordList;
      this._definedNames = new ArrayList();
      this._externalBookBlocks = new LinkTable.ExternalBookBlock[]{new LinkTable.ExternalBookBlock(numberOfSheets)};
      this._externSheetRecord = new ExternSheetRecord();
      this._recordCount = 2;
      SupBookRecord supbook = this._externalBookBlocks[0].getExternalBookRecord();
      int idx = this.findFirstRecordLocBySid((short)140);
      if(idx < 0) {
         throw new RuntimeException("CountryRecord not found");
      } else {
         this._workbookRecordList.add(idx + 1, this._externSheetRecord);
         this._workbookRecordList.add(idx + 1, supbook);
      }
   }

   public int getRecordCount() {
      return this._recordCount;
   }

   public NameRecord getSpecificBuiltinRecord(byte builtInCode, int sheetNumber) {
      Iterator iterator = this._definedNames.iterator();

      NameRecord record;
      do {
         if(!iterator.hasNext()) {
            return null;
         }

         record = (NameRecord)iterator.next();
      } while(record.getBuiltInName() != builtInCode || record.getSheetNumber() != sheetNumber);

      return record;
   }

   public void removeBuiltinRecord(byte name, int sheetIndex) {
      NameRecord record = this.getSpecificBuiltinRecord(name, sheetIndex);
      if(record != null) {
         this._definedNames.remove(record);
      }

   }

   public int getNumNames() {
      return this._definedNames.size();
   }

   public NameRecord getNameRecord(int index) {
      return (NameRecord)this._definedNames.get(index);
   }

   public void addName(NameRecord name) {
      this._definedNames.add(name);
      int idx = this.findFirstRecordLocBySid((short)23);
      if(idx == -1) {
         idx = this.findFirstRecordLocBySid((short)430);
      }

      if(idx == -1) {
         idx = this.findFirstRecordLocBySid((short)140);
      }

      int countNames = this._definedNames.size();
      this._workbookRecordList.add(idx + countNames, name);
   }

   public void removeName(int namenum) {
      this._definedNames.remove(namenum);
   }

   public boolean nameAlreadyExists(NameRecord name) {
      for(int i = this.getNumNames() - 1; i >= 0; --i) {
         NameRecord rec = this.getNameRecord(i);
         if(rec != name && isDuplicatedNames(name, rec)) {
            return true;
         }
      }

      return false;
   }

   private static boolean isDuplicatedNames(NameRecord firstName, NameRecord lastName) {
      return lastName.getNameText().equalsIgnoreCase(firstName.getNameText()) && isSameSheetNames(firstName, lastName);
   }

   private static boolean isSameSheetNames(NameRecord firstName, NameRecord lastName) {
      return lastName.getSheetNumber() == firstName.getSheetNumber();
   }

   public String[] getExternalBookAndSheetName(int extRefIndex) {
      int ebIx = this._externSheetRecord.getExtbookIndexFromRefIndex(extRefIndex);
      SupBookRecord ebr = this._externalBookBlocks[ebIx].getExternalBookRecord();
      if(!ebr.isExternalReferences()) {
         return null;
      } else {
         int shIx1 = this._externSheetRecord.getFirstSheetIndexFromRefIndex(extRefIndex);
         int shIx2 = this._externSheetRecord.getLastSheetIndexFromRefIndex(extRefIndex);
         String firstSheetName = null;
         String lastSheetName = null;
         if(shIx1 >= 0) {
            firstSheetName = ebr.getSheetNames()[shIx1];
         }

         if(shIx2 >= 0) {
            lastSheetName = ebr.getSheetNames()[shIx2];
         }

         return shIx1 == shIx2?new String[]{ebr.getURL(), firstSheetName}:new String[]{ebr.getURL(), firstSheetName, lastSheetName};
      }
   }

   private int getExternalWorkbookIndex(String workbookName) {
      for(int i = 0; i < this._externalBookBlocks.length; ++i) {
         SupBookRecord ebr = this._externalBookBlocks[i].getExternalBookRecord();
         if(ebr.isExternalReferences() && workbookName.equals(ebr.getURL())) {
            return i;
         }
      }

      return -1;
   }

   public int linkExternalWorkbook(String name, Workbook externalWorkbook) {
      int extBookIndex = this.getExternalWorkbookIndex(name);
      if(extBookIndex != -1) {
         return extBookIndex;
      } else {
         String[] sheetNames = new String[externalWorkbook.getNumberOfSheets()];

         for(int url = 0; url < sheetNames.length; ++url) {
            sheetNames[url] = externalWorkbook.getSheetName(url);
         }

         String var9 = " " + name;
         LinkTable.ExternalBookBlock block = new LinkTable.ExternalBookBlock(var9, sheetNames);
         extBookIndex = this.extendExternalBookBlocks(block);
         int idx = this.findFirstRecordLocBySid((short)23);
         if(idx == -1) {
            idx = this._workbookRecordList.size();
         }

         this._workbookRecordList.add(idx, block.getExternalBookRecord());

         for(int sn = 0; sn < sheetNames.length; ++sn) {
            this._externSheetRecord.addRef(extBookIndex, sn, sn);
         }

         return extBookIndex;
      }
   }

   public int getExternalSheetIndex(String workbookName, String firstSheetName, String lastSheetName) {
      int externalBookIndex = this.getExternalWorkbookIndex(workbookName);
      if(externalBookIndex == -1) {
         throw new RuntimeException("No external workbook with name \'" + workbookName + "\'");
      } else {
         SupBookRecord ebrTarget = this._externalBookBlocks[externalBookIndex].getExternalBookRecord();
         int firstSheetIndex = getSheetIndex(ebrTarget.getSheetNames(), firstSheetName);
         int lastSheetIndex = getSheetIndex(ebrTarget.getSheetNames(), lastSheetName);
         int result = this._externSheetRecord.getRefIxForSheet(externalBookIndex, firstSheetIndex, lastSheetIndex);
         if(result < 0) {
            result = this._externSheetRecord.addRef(externalBookIndex, firstSheetIndex, lastSheetIndex);
         }

         return result;
      }
   }

   private static int getSheetIndex(String[] sheetNames, String sheetName) {
      for(int i = 0; i < sheetNames.length; ++i) {
         if(sheetNames[i].equals(sheetName)) {
            return i;
         }
      }

      throw new RuntimeException("External workbook does not contain sheet \'" + sheetName + "\'");
   }

   public int getFirstInternalSheetIndexForExtIndex(int extRefIndex) {
      return extRefIndex < this._externSheetRecord.getNumOfRefs() && extRefIndex >= 0?this._externSheetRecord.getFirstSheetIndexFromRefIndex(extRefIndex):-1;
   }

   public int getLastInternalSheetIndexForExtIndex(int extRefIndex) {
      return extRefIndex < this._externSheetRecord.getNumOfRefs() && extRefIndex >= 0?this._externSheetRecord.getLastSheetIndexFromRefIndex(extRefIndex):-1;
   }

   public void removeSheet(int sheetIdx) {
      this._externSheetRecord.removeSheet(sheetIdx);
   }

   public int checkExternSheet(int sheetIndex) {
      return this.checkExternSheet(sheetIndex, sheetIndex);
   }

   public int checkExternSheet(int firstSheetIndex, int lastSheetIndex) {
      int thisWbIndex = -1;

      int i;
      for(i = 0; i < this._externalBookBlocks.length; ++i) {
         SupBookRecord ebr = this._externalBookBlocks[i].getExternalBookRecord();
         if(ebr.isInternalReferences()) {
            thisWbIndex = i;
            break;
         }
      }

      if(thisWbIndex < 0) {
         throw new RuntimeException("Could not find \'internal references\' EXTERNALBOOK");
      } else {
         i = this._externSheetRecord.getRefIxForSheet(thisWbIndex, firstSheetIndex, lastSheetIndex);
         return i >= 0?i:this._externSheetRecord.addRef(thisWbIndex, firstSheetIndex, lastSheetIndex);
      }
   }

   private int findFirstRecordLocBySid(short sid) {
      int index = 0;

      for(Iterator iterator = this._workbookRecordList.iterator(); iterator.hasNext(); ++index) {
         Record record = (Record)iterator.next();
         if(record.getSid() == sid) {
            return index;
         }
      }

      return -1;
   }

   public String resolveNameXText(int refIndex, int definedNameIndex, InternalWorkbook workbook) {
      int extBookIndex = this._externSheetRecord.getExtbookIndexFromRefIndex(refIndex);
      int firstTabIndex = this._externSheetRecord.getFirstSheetIndexFromRefIndex(refIndex);
      if(firstTabIndex == -1) {
         throw new RuntimeException("Referenced sheet could not be found");
      } else {
         LinkTable.ExternalBookBlock externalBook = this._externalBookBlocks[extBookIndex];
         if(externalBook._externalNameRecords.length > definedNameIndex) {
            return this._externalBookBlocks[extBookIndex].getNameText(definedNameIndex);
         } else if(firstTabIndex == -2) {
            NameRecord nr = this.getNameRecord(definedNameIndex);
            int sheetNumber = nr.getSheetNumber();
            StringBuffer text = new StringBuffer();
            if(sheetNumber > 0) {
               String sheetName = workbook.getSheetName(sheetNumber - 1);
               SheetNameFormatter.appendFormat(text, sheetName);
               text.append("!");
            }

            text.append(nr.getNameText());
            return text.toString();
         } else {
            throw new ArrayIndexOutOfBoundsException("Ext Book Index relative but beyond the supported length, was " + extBookIndex + " but maximum is " + this._externalBookBlocks.length);
         }
      }
   }

   public int resolveNameXIx(int refIndex, int definedNameIndex) {
      int extBookIndex = this._externSheetRecord.getExtbookIndexFromRefIndex(refIndex);
      return this._externalBookBlocks[extBookIndex].getNameIx(definedNameIndex);
   }

   public NameXPtg getNameXPtg(String name, int sheetRefIndex) {
      for(int i = 0; i < this._externalBookBlocks.length; ++i) {
         int definedNameIndex = this._externalBookBlocks[i].getIndexOfName(name);
         if(definedNameIndex >= 0) {
            int thisSheetRefIndex = this.findRefIndexFromExtBookIndex(i);
            if(thisSheetRefIndex >= 0 && (sheetRefIndex == -1 || thisSheetRefIndex == sheetRefIndex)) {
               return new NameXPtg(thisSheetRefIndex, definedNameIndex);
            }
         }
      }

      return null;
   }

   public NameXPtg addNameXPtg(String name) {
      int extBlockIndex = -1;
      LinkTable.ExternalBookBlock extBlock = null;

      int extNameRecord;
      for(extNameRecord = 0; extNameRecord < this._externalBookBlocks.length; ++extNameRecord) {
         SupBookRecord nameIndex = this._externalBookBlocks[extNameRecord].getExternalBookRecord();
         if(nameIndex.isAddInFunctions()) {
            extBlock = this._externalBookBlocks[extNameRecord];
            extBlockIndex = extNameRecord;
            break;
         }
      }

      if(extBlock == null) {
         extBlock = new LinkTable.ExternalBookBlock();
         extBlockIndex = this.extendExternalBookBlocks(extBlock);
         extNameRecord = this.findFirstRecordLocBySid((short)23);
         this._workbookRecordList.add(extNameRecord, extBlock.getExternalBookRecord());
         this._externSheetRecord.addRef(this._externalBookBlocks.length - 1, -2, -2);
      }

      ExternalNameRecord var10 = new ExternalNameRecord();
      var10.setText(name);
      var10.setParsedExpression(new Ptg[]{ErrPtg.REF_INVALID});
      int var11 = extBlock.addExternalName(var10);
      int supLinkIndex = 0;

      for(Iterator numberOfNames = this._workbookRecordList.iterator(); numberOfNames.hasNext(); ++supLinkIndex) {
         Record fakeSheetIdx = (Record)numberOfNames.next();
         if(fakeSheetIdx instanceof SupBookRecord && ((SupBookRecord)fakeSheetIdx).isAddInFunctions()) {
            break;
         }
      }

      int var12 = extBlock.getNumberOfNames();
      this._workbookRecordList.add(supLinkIndex + var12, var10);
      byte var13 = -2;
      int ix = this._externSheetRecord.getRefIxForSheet(extBlockIndex, var13, var13);
      return new NameXPtg(ix, var11);
   }

   private int extendExternalBookBlocks(LinkTable.ExternalBookBlock newBlock) {
      LinkTable.ExternalBookBlock[] tmp = new LinkTable.ExternalBookBlock[this._externalBookBlocks.length + 1];
      System.arraycopy(this._externalBookBlocks, 0, tmp, 0, this._externalBookBlocks.length);
      tmp[tmp.length - 1] = newBlock;
      this._externalBookBlocks = tmp;
      return this._externalBookBlocks.length - 1;
   }

   private int findRefIndexFromExtBookIndex(int extBookIndex) {
      return this._externSheetRecord.findRefIndexFromExtBookIndex(extBookIndex);
   }

   public boolean changeExternalReference(String oldUrl, String newUrl) {
      LinkTable.ExternalBookBlock[] arr$ = this._externalBookBlocks;
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         LinkTable.ExternalBookBlock ex = arr$[i$];
         SupBookRecord externalRecord = ex.getExternalBookRecord();
         if(externalRecord.isExternalReferences() && externalRecord.getURL().equals(oldUrl)) {
            externalRecord.setURL(newUrl);
            return true;
         }
      }

      return false;
   }

   private static final class ExternalBookBlock {

      private final SupBookRecord _externalBookRecord;
      private ExternalNameRecord[] _externalNameRecords;
      private final LinkTable.CRNBlock[] _crnBlocks;


      public ExternalBookBlock(RecordStream rs) {
         this._externalBookRecord = (SupBookRecord)rs.getNext();
         ArrayList temp = new ArrayList();

         while(rs.peekNextClass() == ExternalNameRecord.class) {
            temp.add(rs.getNext());
         }

         this._externalNameRecords = new ExternalNameRecord[temp.size()];
         temp.toArray(this._externalNameRecords);
         temp.clear();

         while(rs.peekNextClass() == CRNCountRecord.class) {
            temp.add(new LinkTable.CRNBlock(rs));
         }

         this._crnBlocks = new LinkTable.CRNBlock[temp.size()];
         temp.toArray(this._crnBlocks);
      }

      public ExternalBookBlock(String url, String[] sheetNames) {
         this._externalBookRecord = SupBookRecord.createExternalReferences(url, sheetNames);
         this._crnBlocks = new LinkTable.CRNBlock[0];
      }

      public ExternalBookBlock(int numberOfSheets) {
         this._externalBookRecord = SupBookRecord.createInternalReferences((short)numberOfSheets);
         this._externalNameRecords = new ExternalNameRecord[0];
         this._crnBlocks = new LinkTable.CRNBlock[0];
      }

      public ExternalBookBlock() {
         this._externalBookRecord = SupBookRecord.createAddInFunctions();
         this._externalNameRecords = new ExternalNameRecord[0];
         this._crnBlocks = new LinkTable.CRNBlock[0];
      }

      public SupBookRecord getExternalBookRecord() {
         return this._externalBookRecord;
      }

      public String getNameText(int definedNameIndex) {
         return this._externalNameRecords[definedNameIndex].getText();
      }

      public int getNameIx(int definedNameIndex) {
         return this._externalNameRecords[definedNameIndex].getIx();
      }

      public int getIndexOfName(String name) {
         for(int i = 0; i < this._externalNameRecords.length; ++i) {
            if(this._externalNameRecords[i].getText().equalsIgnoreCase(name)) {
               return i;
            }
         }

         return -1;
      }

      public int getNumberOfNames() {
         return this._externalNameRecords.length;
      }

      public int addExternalName(ExternalNameRecord rec) {
         ExternalNameRecord[] tmp = new ExternalNameRecord[this._externalNameRecords.length + 1];
         System.arraycopy(this._externalNameRecords, 0, tmp, 0, this._externalNameRecords.length);
         tmp[tmp.length - 1] = rec;
         this._externalNameRecords = tmp;
         return this._externalNameRecords.length - 1;
      }
   }

   private static final class CRNBlock {

      private final CRNCountRecord _countRecord;
      private final CRNRecord[] _crns;


      public CRNBlock(RecordStream rs) {
         this._countRecord = (CRNCountRecord)rs.getNext();
         int nCRNs = this._countRecord.getNumberOfCRNs();
         CRNRecord[] crns = new CRNRecord[nCRNs];

         for(int i = 0; i < crns.length; ++i) {
            crns[i] = (CRNRecord)rs.getNext();
         }

         this._crns = crns;
      }

      public CRNRecord[] getCrns() {
         return (CRNRecord[])this._crns.clone();
      }
   }
}
