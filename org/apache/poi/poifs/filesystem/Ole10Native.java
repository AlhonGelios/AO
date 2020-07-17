package org.apache.poi.poifs.filesystem;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.Ole10NativeException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.LittleEndianOutputStream;
import org.apache.poi.util.StringUtil;

public class Ole10Native {

   public static final String OLE10_NATIVE = "Ole10Native";
   protected static final String ISO1 = "ISO-8859-1";
   private int totalSize;
   private short flags1 = 2;
   private String label;
   private String fileName;
   private short flags2 = 0;
   private short unknown1 = 3;
   private String command;
   private byte[] dataBuffer;
   private short flags3 = 0;
   private Ole10Native.EncodingMode mode;


   public static Ole10Native createFromEmbeddedOleObject(POIFSFileSystem poifs) throws IOException, Ole10NativeException {
      return createFromEmbeddedOleObject(poifs.getRoot());
   }

   public static Ole10Native createFromEmbeddedOleObject(DirectoryNode directory) throws IOException, Ole10NativeException {
      DocumentEntry nativeEntry = (DocumentEntry)directory.getEntry("Ole10Native");
      byte[] data = new byte[nativeEntry.getSize()];
      int readBytes = directory.createDocumentInputStream((Entry)nativeEntry).read(data);

      assert readBytes == data.length;

      return new Ole10Native(data, 0);
   }

   public Ole10Native(String label, String filename, String command, byte[] data) {
      this.setLabel(label);
      this.setFileName(filename);
      this.setCommand(command);
      this.setDataBuffer(data);
      this.mode = Ole10Native.EncodingMode.parsed;
   }

   public Ole10Native(byte[] data, int offset) throws Ole10NativeException {
      if(data.length < offset + 2) {
         throw new Ole10NativeException("data is too small");
      } else {
         this.totalSize = LittleEndian.getInt(data, offset);
         int ofs = offset + 4;
         this.mode = Ole10Native.EncodingMode.unparsed;
         if(LittleEndian.getShort(data, ofs) == 2) {
            if(Character.isISOControl(data[ofs + 2])) {
               this.mode = Ole10Native.EncodingMode.compact;
            } else {
               this.mode = Ole10Native.EncodingMode.parsed;
            }
         }

         int dataSize;
         switch(Ole10Native.NamelessClass1350895942.$SwitchMap$org$apache$poi$poifs$filesystem$Ole10Native$EncodingMode[this.mode.ordinal()]) {
         case 1:
            this.flags1 = LittleEndian.getShort(data, ofs);
            ofs += 2;
            int len = getStringLength(data, ofs);
            this.label = StringUtil.getFromCompressedUnicode(data, ofs, len - 1);
            ofs += len;
            len = getStringLength(data, ofs);
            this.fileName = StringUtil.getFromCompressedUnicode(data, ofs, len - 1);
            ofs += len;
            this.flags2 = LittleEndian.getShort(data, ofs);
            ofs += 2;
            this.unknown1 = LittleEndian.getShort(data, ofs);
            ofs += 2;
            len = LittleEndian.getInt(data, ofs);
            ofs += 4;
            this.command = StringUtil.getFromCompressedUnicode(data, ofs, len - 1);
            ofs += len;
            if(this.totalSize < ofs) {
               throw new Ole10NativeException("Invalid Ole10Native");
            }

            dataSize = LittleEndian.getInt(data, ofs);
            ofs += 4;
            if(dataSize < 0 || this.totalSize - (ofs - 4) < dataSize) {
               throw new Ole10NativeException("Invalid Ole10Native");
            }
            break;
         case 2:
            this.flags1 = LittleEndian.getShort(data, ofs);
            ofs += 2;
            dataSize = this.totalSize - 2;
            break;
         case 3:
         default:
            dataSize = this.totalSize;
         }

         this.dataBuffer = new byte[dataSize];
         System.arraycopy(data, ofs, this.dataBuffer, 0, dataSize);
         int var10000 = ofs + dataSize;
      }
   }

   private static int getStringLength(byte[] data, int ofs) {
      int len;
      for(len = 0; len + ofs < data.length && data[ofs + len] != 0; ++len) {
         ;
      }

      ++len;
      return len;
   }

   public int getTotalSize() {
      return this.totalSize;
   }

   public short getFlags1() {
      return this.flags1;
   }

   public String getLabel() {
      return this.label;
   }

   public String getFileName() {
      return this.fileName;
   }

   public short getFlags2() {
      return this.flags2;
   }

   public short getUnknown1() {
      return this.unknown1;
   }

   public String getCommand() {
      return this.command;
   }

   public int getDataSize() {
      return this.dataBuffer.length;
   }

   public byte[] getDataBuffer() {
      return this.dataBuffer;
   }

   public short getFlags3() {
      return this.flags3;
   }

   public void writeOut(OutputStream out) throws IOException {
      LittleEndianOutputStream leosOut = new LittleEndianOutputStream(out);
      switch(Ole10Native.NamelessClass1350895942.$SwitchMap$org$apache$poi$poifs$filesystem$Ole10Native$EncodingMode[this.mode.ordinal()]) {
      case 1:
         ByteArrayOutputStream bos = new ByteArrayOutputStream();
         LittleEndianOutputStream leos = new LittleEndianOutputStream(bos);
         leos.writeShort(this.getFlags1());
         leos.write(this.getLabel().getBytes("ISO-8859-1"));
         leos.write(0);
         leos.write(this.getFileName().getBytes("ISO-8859-1"));
         leos.write(0);
         leos.writeShort(this.getFlags2());
         leos.writeShort(this.getUnknown1());
         leos.writeInt(this.getCommand().length() + 1);
         leos.write(this.getCommand().getBytes("ISO-8859-1"));
         leos.write(0);
         leos.writeInt(this.getDataSize());
         leos.write(this.getDataBuffer());
         leos.writeShort(this.getFlags3());
         leos.close();
         leosOut.writeInt(bos.size());
         bos.writeTo(out);
         break;
      case 2:
         leosOut.writeInt(this.getDataSize() + 2);
         leosOut.writeShort(this.getFlags1());
         out.write(this.getDataBuffer());
         break;
      case 3:
      default:
         leosOut.writeInt(this.getDataSize());
         out.write(this.getDataBuffer());
      }

   }

   public void setFlags1(short flags1) {
      this.flags1 = flags1;
   }

   public void setFlags2(short flags2) {
      this.flags2 = flags2;
   }

   public void setFlags3(short flags3) {
      this.flags3 = flags3;
   }

   public void setLabel(String label) {
      this.label = label;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public void setCommand(String command) {
      this.command = command;
   }

   public void setUnknown1(short unknown1) {
      this.unknown1 = unknown1;
   }

   public void setDataBuffer(byte[] dataBuffer) {
      this.dataBuffer = (byte[])dataBuffer.clone();
   }


   private static enum EncodingMode {

      parsed("parsed", 0),
      unparsed("unparsed", 1),
      compact("compact", 2);
      // $FF: synthetic field
      private static final Ole10Native.EncodingMode[] $VALUES = new Ole10Native.EncodingMode[]{parsed, unparsed, compact};


      private EncodingMode(String var1, int var2) {}

   }

   // $FF: synthetic class
   static class NamelessClass1350895942 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$poifs$filesystem$Ole10Native$EncodingMode = new int[Ole10Native.EncodingMode.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$poifs$filesystem$Ole10Native$EncodingMode[Ole10Native.EncodingMode.parsed.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$filesystem$Ole10Native$EncodingMode[Ole10Native.EncodingMode.compact.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$filesystem$Ole10Native$EncodingMode[Ole10Native.EncodingMode.unparsed.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
