package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.ExtSSTRecord;
import org.apache.poi.hssf.record.common.UnicodeString;
import org.apache.poi.hssf.record.cont.ContinuableRecordOutput;
import org.apache.poi.util.IntMapper;

final class SSTSerializer {

   private final int _numStrings;
   private final int _numUniqueStrings;
   private final IntMapper strings;
   private final int[] bucketAbsoluteOffsets;
   private final int[] bucketRelativeOffsets;


   public SSTSerializer(IntMapper strings, int numStrings, int numUniqueStrings) {
      this.strings = strings;
      this._numStrings = numStrings;
      this._numUniqueStrings = numUniqueStrings;
      int infoRecs = ExtSSTRecord.getNumberOfInfoRecsForStrings(strings.size());
      this.bucketAbsoluteOffsets = new int[infoRecs];
      this.bucketRelativeOffsets = new int[infoRecs];
   }

   public void serialize(ContinuableRecordOutput out) {
      out.writeInt(this._numStrings);
      out.writeInt(this._numUniqueStrings);

      for(int k = 0; k < this.strings.size(); ++k) {
         if(k % 8 == 0) {
            int s = out.getTotalSize();
            int index = k / 8;
            if(index < 128) {
               this.bucketAbsoluteOffsets[index] = s;
               this.bucketRelativeOffsets[index] = s;
            }
         }

         UnicodeString var5 = this.getUnicodeString(k);
         var5.serialize(out);
      }

   }

   private UnicodeString getUnicodeString(int index) {
      return getUnicodeString(this.strings, index);
   }

   private static UnicodeString getUnicodeString(IntMapper strings, int index) {
      return (UnicodeString)strings.get(index);
   }

   public int[] getBucketAbsoluteOffsets() {
      return this.bucketAbsoluteOffsets;
   }

   public int[] getBucketRelativeOffsets() {
      return this.bucketRelativeOffsets;
   }
}
