package org.apache.poi.poifs.filesystem;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.common.POIFSConstants;
import org.apache.poi.poifs.dev.POIFSViewable;
import org.apache.poi.poifs.filesystem.BATManaged;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.EntryNode;
import org.apache.poi.poifs.filesystem.OPOIFSDocument;
import org.apache.poi.poifs.filesystem.POIFSWriterListener;
import org.apache.poi.poifs.property.DirectoryProperty;
import org.apache.poi.poifs.property.Property;
import org.apache.poi.poifs.property.PropertyTable;
import org.apache.poi.poifs.storage.BATBlock;
import org.apache.poi.poifs.storage.BlockAllocationTableReader;
import org.apache.poi.poifs.storage.BlockAllocationTableWriter;
import org.apache.poi.poifs.storage.BlockList;
import org.apache.poi.poifs.storage.BlockWritable;
import org.apache.poi.poifs.storage.HeaderBlock;
import org.apache.poi.poifs.storage.HeaderBlockWriter;
import org.apache.poi.poifs.storage.RawDataBlockList;
import org.apache.poi.poifs.storage.SmallBlockTableReader;
import org.apache.poi.poifs.storage.SmallBlockTableWriter;
import org.apache.poi.util.CloseIgnoringInputStream;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.LongField;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class OPOIFSFileSystem implements POIFSViewable {

   private static final POILogger _logger = POILogFactory.getLogger(OPOIFSFileSystem.class);
   private PropertyTable _property_table;
   private List _documents;
   private DirectoryNode _root;
   private POIFSBigBlockSize bigBlockSize;


   public static InputStream createNonClosingInputStream(InputStream is) {
      return new CloseIgnoringInputStream(is);
   }

   public OPOIFSFileSystem() {
      this.bigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
      HeaderBlock header_block = new HeaderBlock(this.bigBlockSize);
      this._property_table = new PropertyTable(header_block);
      this._documents = new ArrayList();
      this._root = null;
   }

   public OPOIFSFileSystem(InputStream stream) throws IOException {
      this();
      boolean success = false;

      HeaderBlock header_block;
      RawDataBlockList data_blocks;
      try {
         header_block = new HeaderBlock(stream);
         this.bigBlockSize = header_block.getBigBlockSize();
         data_blocks = new RawDataBlockList(stream, this.bigBlockSize);
         success = true;
      } finally {
         this.closeInputStream(stream, success);
      }

      new BlockAllocationTableReader(header_block.getBigBlockSize(), header_block.getBATCount(), header_block.getBATArray(), header_block.getXBATCount(), header_block.getXBATIndex(), data_blocks);
      PropertyTable properties = new PropertyTable(header_block, data_blocks);
      this.processProperties(SmallBlockTableReader.getSmallDocumentBlocks(this.bigBlockSize, data_blocks, properties.getRoot(), header_block.getSBATStart()), data_blocks, properties.getRoot().getChildren(), (DirectoryNode)null, header_block.getPropertyStart());
      this.getRoot().setStorageClsid(properties.getRoot().getStorageClsid());
   }

   protected void closeInputStream(InputStream stream, boolean success) {
      if(stream.markSupported() && !(stream instanceof ByteArrayInputStream)) {
         String e = "POIFS is closing the supplied input stream of type (" + stream.getClass().getName() + ") which supports mark/reset.  " + "This will be a problem for the caller if the stream will still be used.  " + "If that is the case the caller should wrap the input stream to avoid this close logic.  " + "This warning is only temporary and will not be present in future versions of POI.";
         _logger.log(5, new Object[]{e});
      }

      try {
         stream.close();
      } catch (IOException var4) {
         if(success) {
            throw new RuntimeException(var4);
         }

         _logger.log(7, new Object[]{"can\'t close input stream", var4});
      }

   }

   public static boolean hasPOIFSHeader(InputStream inp) throws IOException {
      byte[] header = IOUtils.peekFirst8Bytes(inp);
      return hasPOIFSHeader(header);
   }

   public static boolean hasPOIFSHeader(byte[] header8Bytes) {
      LongField signature = new LongField(0, header8Bytes);
      return signature.get() == -2226271756974174256L;
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

   public void writeFilesystem(OutputStream stream) throws IOException {
      this._property_table.preWrite();
      SmallBlockTableWriter sbtw = new SmallBlockTableWriter(this.bigBlockSize, this._documents, this._property_table.getRoot());
      BlockAllocationTableWriter bat = new BlockAllocationTableWriter(this.bigBlockSize);
      ArrayList bm_objects = new ArrayList();
      bm_objects.addAll(this._documents);
      bm_objects.add(this._property_table);
      bm_objects.add(sbtw);
      bm_objects.add(sbtw.getSBAT());
      Iterator iter = bm_objects.iterator();

      while(iter.hasNext()) {
         BATManaged batStartBlock = (BATManaged)iter.next();
         int header_block_writer = batStartBlock.countBlocks();
         if(header_block_writer != 0) {
            batStartBlock.setStartBlock(bat.allocateSpace(header_block_writer));
         }
      }

      int var12 = bat.createBlocks();
      HeaderBlockWriter var13 = new HeaderBlockWriter(this.bigBlockSize);
      BATBlock[] xbat_blocks = var13.setBATBlocks(bat.countBlocks(), var12);
      var13.setPropertyStart(this._property_table.getStartBlock());
      var13.setSBATStart(sbtw.getSBAT().getStartBlock());
      var13.setSBATBlockCount(sbtw.getSBATBlockCount());
      ArrayList writers = new ArrayList();
      writers.add(var13);
      writers.addAll(this._documents);
      writers.add(this._property_table);
      writers.add(sbtw);
      writers.add(sbtw.getSBAT());
      writers.add(bat);

      for(int writer = 0; writer < xbat_blocks.length; ++writer) {
         writers.add(xbat_blocks[writer]);
      }

      iter = writers.iterator();

      while(iter.hasNext()) {
         BlockWritable var11 = (BlockWritable)iter.next();
         var11.writeBlocks(stream);
      }

   }

   public static void main(String[] args) throws IOException {
      if(args.length != 2) {
         System.err.println("two arguments required: input filename and output filename");
         System.exit(1);
      }

      FileInputStream istream = new FileInputStream(args[0]);
      FileOutputStream ostream = new FileOutputStream(args[1]);
      (new OPOIFSFileSystem(istream)).writeFilesystem(ostream);
      istream.close();
      ostream.close();
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

   void addDocument(OPOIFSDocument document) {
      this._documents.add(document);
      this._property_table.addProperty(document.getDocumentProperty());
   }

   void addDirectory(DirectoryProperty directory) {
      this._property_table.addProperty(directory);
   }

   void remove(EntryNode entry) {
      this._property_table.removeProperty(entry.getProperty());
      if(entry.isDocumentEntry()) {
         this._documents.remove(((DocumentNode)entry).getDocument());
      }

   }

   private void processProperties(BlockList small_blocks, BlockList big_blocks, Iterator properties, DirectoryNode dir, int headerPropertiesStartAt) throws IOException {
      while(properties.hasNext()) {
         Property property = (Property)properties.next();
         String name = property.getName();
         DirectoryNode parent = dir == null?this.getRoot():dir;
         if(property.isDirectory()) {
            DirectoryNode startBlock1 = (DirectoryNode)parent.createDirectory(name);
            startBlock1.setStorageClsid(property.getStorageClsid());
            this.processProperties(small_blocks, big_blocks, ((DirectoryProperty)property).getChildren(), startBlock1, headerPropertiesStartAt);
         } else {
            int startBlock = property.getStartBlock();
            int size = property.getSize();
            OPOIFSDocument document = null;
            if(property.shouldUseSmallBlocks()) {
               document = new OPOIFSDocument(name, small_blocks.fetchBlocks(startBlock, headerPropertiesStartAt), size);
            } else {
               document = new OPOIFSDocument(name, big_blocks.fetchBlocks(startBlock, headerPropertiesStartAt), size);
            }

            parent.createDocument(document);
         }
      }

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

}
