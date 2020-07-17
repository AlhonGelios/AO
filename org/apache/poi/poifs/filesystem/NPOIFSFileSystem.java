package org.apache.poi.poifs.filesystem;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.EmptyFileException;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.common.POIFSConstants;
import org.apache.poi.poifs.dev.POIFSViewable;
import org.apache.poi.poifs.filesystem.BlockStore;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.EntryNode;
import org.apache.poi.poifs.filesystem.NPOIFSDocument;
import org.apache.poi.poifs.filesystem.NPOIFSMiniStore;
import org.apache.poi.poifs.filesystem.NPOIFSStream;
import org.apache.poi.poifs.filesystem.POIFSWriterListener;
import org.apache.poi.poifs.nio.ByteArrayBackedDataSource;
import org.apache.poi.poifs.nio.DataSource;
import org.apache.poi.poifs.nio.FileBackedDataSource;
import org.apache.poi.poifs.property.DirectoryProperty;
import org.apache.poi.poifs.property.DocumentProperty;
import org.apache.poi.poifs.property.NPropertyTable;
import org.apache.poi.poifs.storage.BATBlock;
import org.apache.poi.poifs.storage.BlockAllocationTableReader;
import org.apache.poi.poifs.storage.BlockAllocationTableWriter;
import org.apache.poi.poifs.storage.HeaderBlock;
import org.apache.poi.poifs.storage.HeaderBlockWriter;
import org.apache.poi.util.CloseIgnoringInputStream;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LongField;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class NPOIFSFileSystem extends BlockStore implements POIFSViewable, Closeable {

   private static final POILogger LOG = POILogFactory.getLogger(NPOIFSFileSystem.class);
   private NPOIFSMiniStore _mini_store;
   private NPropertyTable _property_table;
   private List _xbat_blocks;
   private List _bat_blocks;
   private HeaderBlock _header;
   private DirectoryNode _root;
   private DataSource _data;
   private POIFSBigBlockSize bigBlockSize;


   public static InputStream createNonClosingInputStream(InputStream is) {
      return new CloseIgnoringInputStream(is);
   }

   private NPOIFSFileSystem(boolean newFS) {
      this.bigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
      this._header = new HeaderBlock(this.bigBlockSize);
      this._property_table = new NPropertyTable(this._header);
      this._mini_store = new NPOIFSMiniStore(this, this._property_table.getRoot(), new ArrayList(), this._header);
      this._xbat_blocks = new ArrayList();
      this._bat_blocks = new ArrayList();
      this._root = null;
      if(newFS) {
         this._data = new ByteArrayBackedDataSource(new byte[this.bigBlockSize.getBigBlockSize() * 3]);
      }

   }

   public NPOIFSFileSystem() {
      this(true);
      this._header.setBATCount(1);
      this._header.setBATArray(new int[]{1});
      BATBlock bb = BATBlock.createEmptyBATBlock(this.bigBlockSize, false);
      bb.setOurBlockIndex(1);
      this._bat_blocks.add(bb);
      this.setNextBlock(0, -2);
      this.setNextBlock(1, -3);
      this._property_table.setStartBlock(0);
   }

   public NPOIFSFileSystem(File file) throws IOException {
      this(file, true);
   }

   public NPOIFSFileSystem(File file, boolean readOnly) throws IOException {
      this((FileChannel)null, file, readOnly, true);
   }

   public NPOIFSFileSystem(FileChannel channel) throws IOException {
      this(channel, true);
   }

   public NPOIFSFileSystem(FileChannel channel, boolean readOnly) throws IOException {
      this(channel, (File)null, readOnly, false);
   }

   private NPOIFSFileSystem(FileChannel channel, File srcFile, boolean readOnly, boolean closeChannelOnError) throws IOException {
      this(false);

      try {
         if(srcFile != null) {
            if(srcFile.length() == 0L) {
               throw new EmptyFileException();
            }

            FileBackedDataSource e = new FileBackedDataSource(srcFile, readOnly);
            channel = e.getChannel();
            this._data = e;
         } else {
            this._data = new FileBackedDataSource(channel, readOnly);
         }

         ByteBuffer e1 = ByteBuffer.allocate(512);
         IOUtils.readFully((ReadableByteChannel)channel, e1);
         this._header = new HeaderBlock(e1);
         this.readCoreContents();
      } catch (IOException var6) {
         if(closeChannelOnError && channel != null) {
            channel.close();
            channel = null;
         }

         throw var6;
      } catch (RuntimeException var7) {
         if(closeChannelOnError && channel != null) {
            channel.close();
            channel = null;
         }

         throw var7;
      }
   }

   public NPOIFSFileSystem(InputStream stream) throws IOException {
      this(false);
      ReadableByteChannel channel = null;
      boolean success = false;

      try {
         channel = Channels.newChannel(stream);
         ByteBuffer headerBuffer = ByteBuffer.allocate(512);
         IOUtils.readFully(channel, headerBuffer);
         this._header = new HeaderBlock(headerBuffer);
         BlockAllocationTableReader.sanityCheckBlockCount(this._header.getBATCount());
         long maxSize = BATBlock.calculateMaximumSize(this._header);
         if(maxSize > 2147483647L) {
            throw new IllegalArgumentException("Unable read a >2gb file via an InputStream");
         }

         ByteBuffer data = ByteBuffer.allocate((int)maxSize);
         headerBuffer.position(0);
         data.put(headerBuffer);
         data.position(headerBuffer.capacity());
         IOUtils.readFully(channel, data);
         success = true;
         this._data = new ByteArrayBackedDataSource(data.array(), data.position());
      } finally {
         if(channel != null) {
            channel.close();
         }

         this.closeInputStream(stream, success);
      }

      this.readCoreContents();
   }

   private void closeInputStream(InputStream stream, boolean success) {
      try {
         stream.close();
      } catch (IOException var4) {
         if(success) {
            throw new RuntimeException(var4);
         }

         LOG.log(7, new Object[]{"can\'t close input stream", var4});
      }

   }

   public static boolean hasPOIFSHeader(InputStream inp) throws IOException {
      inp.mark(8);
      byte[] header = new byte[8];
      int bytesRead = IOUtils.readFully(inp, header);
      LongField signature = new LongField(0, header);
      if(inp instanceof PushbackInputStream) {
         PushbackInputStream pin = (PushbackInputStream)inp;
         pin.unread(header, 0, bytesRead);
      } else {
         inp.reset();
      }

      return signature.get() == -2226271756974174256L;
   }

   public static boolean hasPOIFSHeader(byte[] header8Bytes) {
      LongField signature = new LongField(0, header8Bytes);
      return signature.get() == -2226271756974174256L;
   }

   private void readCoreContents() throws IOException {
      this.bigBlockSize = this._header.getBigBlockSize();
      BlockStore.ChainLoopDetector loopDetector = this.getChainLoopDetector();
      int[] remainingFATs = this._header.getBATArray();
      int xfat = remainingFATs.length;

      int nextAt;
      int sfat;
      for(nextAt = 0; nextAt < xfat; ++nextAt) {
         sfat = remainingFATs[nextAt];
         this.readBAT(sfat, loopDetector);
      }

      int var10 = this._header.getBATCount() - this._header.getBATArray().length;
      nextAt = this._header.getXBATIndex();
      sfat = 0;

      int i;
      while(sfat < this._header.getXBATCount()) {
         loopDetector.claim(nextAt);
         ByteBuffer sbats = this.getBlockAt(nextAt);
         BATBlock var11 = BATBlock.createBATBlock(this.bigBlockSize, sbats);
         var11.setOurBlockIndex(nextAt);
         nextAt = var11.getValueAt(this.bigBlockSize.getXBATEntriesPerBlock());
         this._xbat_blocks.add(var11);
         i = Math.min(var10, this.bigBlockSize.getXBATEntriesPerBlock());
         int fatData = 0;

         while(true) {
            if(fatData < i) {
               int fatAt = var11.getValueAt(fatData);
               if(fatAt != -1 && fatAt != -2) {
                  this.readBAT(fatAt, loopDetector);
                  ++fatData;
                  continue;
               }
            }

            var10 -= i;
            ++sfat;
            break;
         }
      }

      this._property_table = new NPropertyTable(this._header, this);
      ArrayList var13 = new ArrayList();
      this._mini_store = new NPOIFSMiniStore(this, this._property_table.getRoot(), var13, this._header);
      nextAt = this._header.getSBATStart();

      for(i = 0; i < this._header.getSBATCount() && nextAt != -2; ++i) {
         loopDetector.claim(nextAt);
         ByteBuffer var14 = this.getBlockAt(nextAt);
         BATBlock var12 = BATBlock.createBATBlock(this.bigBlockSize, var14);
         var12.setOurBlockIndex(nextAt);
         var13.add(var12);
         nextAt = this.getNextBlock(nextAt);
      }

   }

   private void readBAT(int batAt, BlockStore.ChainLoopDetector loopDetector) throws IOException {
      loopDetector.claim(batAt);
      ByteBuffer fatData = this.getBlockAt(batAt);
      BATBlock bat = BATBlock.createBATBlock(this.bigBlockSize, fatData);
      bat.setOurBlockIndex(batAt);
      this._bat_blocks.add(bat);
   }

   private BATBlock createBAT(int offset, boolean isBAT) throws IOException {
      BATBlock newBAT = BATBlock.createEmptyBATBlock(this.bigBlockSize, !isBAT);
      newBAT.setOurBlockIndex(offset);
      ByteBuffer buffer = ByteBuffer.allocate(this.bigBlockSize.getBigBlockSize());
      int writeTo = (1 + offset) * this.bigBlockSize.getBigBlockSize();
      this._data.write(buffer, (long)writeTo);
      return newBAT;
   }

   protected ByteBuffer getBlockAt(int offset) throws IOException {
      long blockWanted = (long)(offset + 1);
      long startAt = blockWanted * (long)this.bigBlockSize.getBigBlockSize();

      try {
         return this._data.read(this.bigBlockSize.getBigBlockSize(), startAt);
      } catch (IndexOutOfBoundsException var8) {
         IndexOutOfBoundsException wrapped = new IndexOutOfBoundsException("Block " + offset + " not found");
         wrapped.initCause(var8);
         throw wrapped;
      }
   }

   protected ByteBuffer createBlockIfNeeded(int offset) throws IOException {
      try {
         return this.getBlockAt(offset);
      } catch (IndexOutOfBoundsException var6) {
         long startAt = (long)((offset + 1) * this.bigBlockSize.getBigBlockSize());
         ByteBuffer buffer = ByteBuffer.allocate(this.getBigBlockSize());
         this._data.write(buffer, startAt);
         return this.getBlockAt(offset);
      }
   }

   protected BATBlock.BATBlockAndIndex getBATBlockAndIndex(int offset) {
      return BATBlock.getBATBlockAndIndex(offset, this._header, this._bat_blocks);
   }

   protected int getNextBlock(int offset) {
      BATBlock.BATBlockAndIndex bai = this.getBATBlockAndIndex(offset);
      return bai.getBlock().getValueAt(bai.getIndex());
   }

   protected void setNextBlock(int offset, int nextBlock) {
      BATBlock.BATBlockAndIndex bai = this.getBATBlockAndIndex(offset);
      bai.getBlock().setValueAt(bai.getIndex(), nextBlock);
   }

   protected int getFreeBlock() throws IOException {
      int numSectors = this.bigBlockSize.getBATEntriesPerBlock();
      int offset = 0;

      BATBlock newBATs;
      int i;
      for(Iterator bat = this._bat_blocks.iterator(); bat.hasNext(); offset += numSectors) {
         newBATs = (BATBlock)bat.next();
         if(newBATs.hasFreeSectors()) {
            for(i = 0; i < numSectors; ++i) {
               int x = newBATs.getValueAt(i);
               if(x == -1) {
                  return offset + i;
               }
            }
         }
      }

      BATBlock var7 = this.createBAT(offset, true);
      var7.setValueAt(0, -3);
      this._bat_blocks.add(var7);
      if(this._header.getBATCount() >= 109) {
         newBATs = null;
         Iterator var9 = this._xbat_blocks.iterator();

         while(var9.hasNext()) {
            BATBlock var10 = (BATBlock)var9.next();
            if(var10.hasFreeSectors()) {
               newBATs = var10;
               break;
            }
         }

         if(newBATs == null) {
            newBATs = this.createBAT(offset + 1, false);
            newBATs.setValueAt(0, offset);
            var7.setValueAt(1, -4);
            ++offset;
            if(this._xbat_blocks.size() == 0) {
               this._header.setXBATStart(offset);
            } else {
               ((BATBlock)this._xbat_blocks.get(this._xbat_blocks.size() - 1)).setValueAt(this.bigBlockSize.getXBATEntriesPerBlock(), offset);
            }

            this._xbat_blocks.add(newBATs);
            this._header.setXBATCount(this._xbat_blocks.size());
         } else {
            for(i = 0; i < this.bigBlockSize.getXBATEntriesPerBlock(); ++i) {
               if(newBATs.getValueAt(i) == -1) {
                  newBATs.setValueAt(i, offset);
                  break;
               }
            }
         }
      } else {
         int[] var8 = new int[this._header.getBATCount() + 1];
         System.arraycopy(this._header.getBATArray(), 0, var8, 0, var8.length - 1);
         var8[var8.length - 1] = offset;
         this._header.setBATArray(var8);
      }

      this._header.setBATCount(this._bat_blocks.size());
      return offset + 1;
   }

   protected long size() throws IOException {
      return this._data.size();
   }

   protected BlockStore.ChainLoopDetector getChainLoopDetector() throws IOException {
      return new BlockStore.ChainLoopDetector(this._data.size());
   }

   NPropertyTable _get_property_table() {
      return this._property_table;
   }

   public NPOIFSMiniStore getMiniStore() {
      return this._mini_store;
   }

   void addDocument(NPOIFSDocument document) {
      this._property_table.addProperty(document.getDocumentProperty());
   }

   void addDirectory(DirectoryProperty directory) {
      this._property_table.addProperty(directory);
   }

   public DocumentEntry createDocument(InputStream stream, String name) throws IOException {
      return this.getRoot().createDocument(name, stream);
   }

   public DocumentEntry createDocument(String name, int size, POIFSWriterListener writer) throws IOException {
      return this.getRoot().createDocument(name, size, writer);
   }

   public DirectoryEntry createDirectory(String name) throws IOException {
      return this.getRoot().createDirectory(name);
   }

   public DocumentEntry createOrUpdateDocument(InputStream stream, String name) throws IOException {
      return this.getRoot().createOrUpdateDocument(name, stream);
   }

   public boolean isInPlaceWriteable() {
      return this._data instanceof FileBackedDataSource && ((FileBackedDataSource)this._data).isWriteable();
   }

   public void writeFilesystem() throws IOException {
      if(this._data instanceof FileBackedDataSource) {
         if(!((FileBackedDataSource)this._data).isWriteable()) {
            throw new IllegalArgumentException("POIFS opened in read only mode, so writeFilesystem() may not be called. Open the FileSystem in read-write mode first");
         } else {
            this.syncWithDataSource();
         }
      } else {
         throw new IllegalArgumentException("POIFS opened from an inputstream, so writeFilesystem() may not be called. Use writeFilesystem(OutputStream) instead");
      }
   }

   public void writeFilesystem(OutputStream stream) throws IOException {
      this.syncWithDataSource();
      this._data.copyTo(stream);
   }

   private void syncWithDataSource() throws IOException {
      this._mini_store.syncWithDataSource();
      NPOIFSStream propStream = new NPOIFSStream(this, this._header.getPropertyStart());
      this._property_table.preWrite();
      this._property_table.write(propStream);
      HeaderBlockWriter hbw = new HeaderBlockWriter(this._header);
      hbw.writeBlock(this.getBlockAt(-1));
      Iterator i$ = this._bat_blocks.iterator();

      BATBlock bat;
      ByteBuffer block;
      while(i$.hasNext()) {
         bat = (BATBlock)i$.next();
         block = this.getBlockAt(bat.getOurBlockIndex());
         BlockAllocationTableWriter.writeBlock(bat, block);
      }

      i$ = this._xbat_blocks.iterator();

      while(i$.hasNext()) {
         bat = (BATBlock)i$.next();
         block = this.getBlockAt(bat.getOurBlockIndex());
         BlockAllocationTableWriter.writeBlock(bat, block);
      }

   }

   public void close() throws IOException {
      this._data.close();
   }

   public static void main(String[] args) throws IOException {
      if(args.length != 2) {
         System.err.println("two arguments required: input filename and output filename");
         System.exit(1);
      }

      FileInputStream istream = new FileInputStream(args[0]);

      try {
         FileOutputStream ostream = new FileOutputStream(args[1]);

         try {
            NPOIFSFileSystem fs = new NPOIFSFileSystem(istream);

            try {
               fs.writeFilesystem(ostream);
            } finally {
               fs.close();
            }
         } finally {
            ostream.close();
         }
      } finally {
         istream.close();
      }

   }

   public DirectoryNode getRoot() {
      if(this._root == null) {
         this._root = new DirectoryNode(this._property_table.getRoot(), this, (DirectoryNode)null);
      }

      return this._root;
   }

   public DocumentInputStream createDocumentInputStream(String documentName) throws IOException {
      return this.getRoot().createDocumentInputStream(documentName);
   }

   void remove(EntryNode entry) throws IOException {
      if(entry instanceof DocumentEntry) {
         NPOIFSDocument doc = new NPOIFSDocument((DocumentProperty)entry.getProperty(), this);
         doc.free();
      }

      this._property_table.removeProperty(entry.getProperty());
   }

   public Object[] getViewableArray() {
      return this.preferArray()?this.getRoot().getViewableArray():new Object[0];
   }

   public Iterator getViewableIterator() {
      return !this.preferArray()?this.getRoot().getViewableIterator():Collections.emptyList().iterator();
   }

   public boolean preferArray() {
      return this.getRoot().preferArray();
   }

   public String getShortDescription() {
      return "POIFS FileSystem";
   }

   public int getBigBlockSize() {
      return this.bigBlockSize.getBigBlockSize();
   }

   public POIFSBigBlockSize getBigBlockSizeDetails() {
      return this.bigBlockSize;
   }

   protected int getBlockStoreBlockSize() {
      return this.getBigBlockSize();
   }

   @Internal
   public NPropertyTable getPropertyTable() {
      return this._property_table;
   }

   @Internal
   public HeaderBlock getHeaderBlock() {
      return this._header;
   }

}
