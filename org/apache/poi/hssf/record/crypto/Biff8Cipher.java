package org.apache.poi.hssf.record.crypto;


public interface Biff8Cipher {

   void startRecord(int var1);

   void setNextRecordSize(int var1);

   void skipTwoBytes();

   void xor(byte[] var1, int var2, int var3);

   int xorByte(int var1);

   int xorShort(int var1);

   int xorInt(int var1);

   long xorLong(long var1);
}
