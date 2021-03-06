package org.apache.poi.poifs.filesystem;

import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.NDocumentInputStream;
import org.apache.poi.poifs.filesystem.NPOIFSDocument;
import org.apache.poi.poifs.filesystem.ODocumentInputStream;
import org.apache.poi.poifs.filesystem.OPOIFSDocument;
import org.apache.poi.util.LittleEndianInput;

public class DocumentInputStream extends InputStream implements LittleEndianInput {

   protected static final int EOF = -1;
   protected static final int SIZE_SHORT = 2;
   protected static final int SIZE_INT = 4;
   protected static final int SIZE_LONG = 8;
   private DocumentInputStream delegate;


   protected DocumentInputStream() {}

   public DocumentInputStream(DocumentEntry document) throws IOException {
      if(!(document instanceof DocumentNode)) {
         throw new IOException("Cannot open internal document storage");
      } else {
         DocumentNode documentNode = (DocumentNode)document;
         DirectoryNode parentNode = (DirectoryNode)document.getParent();
         if(documentNode.getDocument() != null) {
            this.delegate = new ODocumentInputStream(document);
         } else if(parentNode.getOFileSystem() != null) {
            this.delegate = new ODocumentInputStream(document);
         } else {
            if(parentNode.getNFileSystem() == null) {
               throw new IOException("No FileSystem bound on the parent, can\'t read contents");
            }

            this.delegate = new NDocumentInputStream(document);
         }

      }
   }

   public DocumentInputStream(OPOIFSDocument document) {
      this.delegate = new ODocumentInputStream(document);
   }

   public DocumentInputStream(NPOIFSDocument document) {
      this.delegate = new NDocumentInputStream(document);
   }

   public int available() {
      return this.delegate.available();
   }

   public void close() {
      this.delegate.close();
   }

   public void mark(int ignoredReadlimit) {
      this.delegate.mark(ignoredReadlimit);
   }

   public boolean markSupported() {
      return true;
   }

   public int read() throws IOException {
      return this.delegate.read();
   }

   public int read(byte[] b) throws IOException {
      return this.read(b, 0, b.length);
   }

   public int read(byte[] b, int off, int len) throws IOException {
      return this.delegate.read(b, off, len);
   }

   public void reset() {
      this.delegate.reset();
   }

   public long skip(long n) throws IOException {
      return this.delegate.skip(n);
   }

   public byte readByte() {
      return this.delegate.readByte();
   }

   public double readDouble() {
      return this.delegate.readDouble();
   }

   public short readShort() {
      return (short)this.readUShort();
   }

   public void readFully(byte[] buf) {
      this.readFully(buf, 0, buf.length);
   }

   public void readFully(byte[] buf, int off, int len) {
      this.delegate.readFully(buf, off, len);
   }

   public long readLong() {
      return this.delegate.readLong();
   }

   public int readInt() {
      return this.delegate.readInt();
   }

   public int readUShort() {
      return this.delegate.readUShort();
   }

   public int readUByte() {
      return this.delegate.readUByte();
   }

   public long readUInt() {
      int i = this.readInt();
      return (long)i & 4294967295L;
   }
}
