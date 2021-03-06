package org.apache.poi.hssf.record;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class FilePassRecord extends StandardRecord implements Cloneable {

   public static final short sid = 47;
   private static final int ENCRYPTION_XOR = 0;
   private static final int ENCRYPTION_OTHER = 1;
   private int _encryptionType;
   private FilePassRecord.KeyData _keyData;


   private FilePassRecord(FilePassRecord other) {
      this._encryptionType = other._encryptionType;
      this._keyData = other._keyData.clone();
   }

   public FilePassRecord(RecordInputStream in) {
      this._encryptionType = in.readUShort();
      switch(this._encryptionType) {
      case 0:
         this._keyData = new FilePassRecord.XorKeyData();
         break;
      case 1:
         this._keyData = new FilePassRecord.Rc4KeyData();
         break;
      default:
         throw new RecordFormatException("Unknown encryption type " + this._encryptionType);
      }

      this._keyData.read(in);
   }

   private static byte[] read(RecordInputStream in, int size) {
      byte[] result = new byte[size];
      in.readFully(result);
      return result;
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this._encryptionType);

      assert this._keyData != null;

      this._keyData.serialize(out);
   }

   protected int getDataSize() {
      assert this._keyData != null;

      return this._keyData.getDataSize();
   }

   public FilePassRecord.Rc4KeyData getRc4KeyData() {
      return this._keyData instanceof FilePassRecord.Rc4KeyData?(FilePassRecord.Rc4KeyData)this._keyData:null;
   }

   public FilePassRecord.XorKeyData getXorKeyData() {
      return this._keyData instanceof FilePassRecord.XorKeyData?(FilePassRecord.XorKeyData)this._keyData:null;
   }

   private FilePassRecord.Rc4KeyData checkRc4() {
      FilePassRecord.Rc4KeyData rc4 = this.getRc4KeyData();
      if(rc4 == null) {
         throw new RecordFormatException("file pass record doesn\'t contain a rc4 key.");
      } else {
         return rc4;
      }
   }

   public short getSid() {
      return (short)47;
   }

   public FilePassRecord clone() {
      return new FilePassRecord(this);
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[FILEPASS]\n");
      buffer.append("    .type = ").append(HexDump.shortToHex(this._encryptionType)).append("\n");
      this._keyData.appendToString(buffer);
      buffer.append("[/FILEPASS]\n");
      return buffer.toString();
   }


   public static final class XorKeyData implements FilePassRecord.KeyData, Cloneable {

      private int _key;
      private int _verifier;


      public void read(RecordInputStream in) {
         this._key = in.readUShort();
         this._verifier = in.readUShort();
      }

      public void serialize(LittleEndianOutput out) {
         out.writeShort(this._key);
         out.writeShort(this._verifier);
      }

      public int getDataSize() {
         return 6;
      }

      public int getKey() {
         return this._key;
      }

      public int getVerifier() {
         return this._verifier;
      }

      public void setKey(int key) {
         this._key = key;
      }

      public void setVerifier(int verifier) {
         this._verifier = verifier;
      }

      public void appendToString(StringBuffer buffer) {
         buffer.append("    .xor.key = ").append(HexDump.intToHex(this._key)).append("\n");
         buffer.append("    .xor.verifier  = ").append(HexDump.intToHex(this._verifier)).append("\n");
      }

      public FilePassRecord.XorKeyData clone() {
         FilePassRecord.XorKeyData other = new FilePassRecord.XorKeyData();
         other._key = this._key;
         other._verifier = this._verifier;
         return other;
      }
   }

   public static final class Rc4KeyData implements FilePassRecord.KeyData, Cloneable {

      private static final int ENCRYPTION_OTHER_RC4 = 1;
      private static final int ENCRYPTION_OTHER_CAPI_2 = 2;
      private static final int ENCRYPTION_OTHER_CAPI_3 = 3;
      private static final int ENCRYPTION_OTHER_CAPI_4 = 4;
      private byte[] _salt;
      private byte[] _encryptedVerifier;
      private byte[] _encryptedVerifierHash;
      private int _encryptionInfo;
      private int _minorVersionNo;


      public void read(RecordInputStream in) {
         this._encryptionInfo = in.readUShort();
         switch(this._encryptionInfo) {
         case 1:
            this._minorVersionNo = in.readUShort();
            if(this._minorVersionNo != 1) {
               throw new RecordFormatException("Unexpected VersionInfo number for RC4Header " + this._minorVersionNo);
            }

            this._salt = FilePassRecord.read(in, 16);
            this._encryptedVerifier = FilePassRecord.read(in, 16);
            this._encryptedVerifierHash = FilePassRecord.read(in, 16);
            return;
         case 2:
         case 3:
         case 4:
            throw new EncryptedDocumentException("HSSF does not currently support CryptoAPI encryption");
         default:
            throw new RecordFormatException("Unknown encryption info " + this._encryptionInfo);
         }
      }

      public void serialize(LittleEndianOutput out) {
         out.writeShort(this._encryptionInfo);
         out.writeShort(this._minorVersionNo);
         out.write(this._salt);
         out.write(this._encryptedVerifier);
         out.write(this._encryptedVerifierHash);
      }

      public int getDataSize() {
         return 54;
      }

      public byte[] getSalt() {
         return (byte[])this._salt.clone();
      }

      public void setSalt(byte[] salt) {
         this._salt = (byte[])salt.clone();
      }

      public byte[] getEncryptedVerifier() {
         return (byte[])this._encryptedVerifier.clone();
      }

      public void setEncryptedVerifier(byte[] encryptedVerifier) {
         this._encryptedVerifier = (byte[])encryptedVerifier.clone();
      }

      public byte[] getEncryptedVerifierHash() {
         return (byte[])this._encryptedVerifierHash.clone();
      }

      public void setEncryptedVerifierHash(byte[] encryptedVerifierHash) {
         this._encryptedVerifierHash = (byte[])encryptedVerifierHash.clone();
      }

      public void appendToString(StringBuffer buffer) {
         buffer.append("    .rc4.info = ").append(HexDump.shortToHex(this._encryptionInfo)).append("\n");
         buffer.append("    .rc4.ver  = ").append(HexDump.shortToHex(this._minorVersionNo)).append("\n");
         buffer.append("    .rc4.salt = ").append(HexDump.toHex(this._salt)).append("\n");
         buffer.append("    .rc4.verifier = ").append(HexDump.toHex(this._encryptedVerifier)).append("\n");
         buffer.append("    .rc4.verifierHash = ").append(HexDump.toHex(this._encryptedVerifierHash)).append("\n");
      }

      public FilePassRecord.Rc4KeyData clone() {
         FilePassRecord.Rc4KeyData other = new FilePassRecord.Rc4KeyData();
         other._salt = (byte[])this._salt.clone();
         other._encryptedVerifier = (byte[])this._encryptedVerifier.clone();
         other._encryptedVerifierHash = (byte[])this._encryptedVerifierHash.clone();
         other._encryptionInfo = this._encryptionInfo;
         other._minorVersionNo = this._minorVersionNo;
         return other;
      }
   }

   private interface KeyData extends Cloneable {

      void read(RecordInputStream var1);

      void serialize(LittleEndianOutput var1);

      int getDataSize();

      void appendToString(StringBuffer var1);

      FilePassRecord.KeyData clone();
   }
}
