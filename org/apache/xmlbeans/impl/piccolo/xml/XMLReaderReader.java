package org.apache.xmlbeans.impl.piccolo.xml;

import java.io.IOException;
import java.io.Reader;
import org.apache.xmlbeans.impl.piccolo.io.IllegalCharException;
import org.apache.xmlbeans.impl.piccolo.xml.XMLInputReader;

public final class XMLReaderReader extends XMLInputReader {

   private static final int BUFFER_SIZE = 8192;
   private Reader in;
   private boolean rewindDeclaration;
   private char[] cbuf;
   private int cbufPos;
   private int cbufEnd;
   private boolean eofReached;
   private boolean sawCR;
   private char[] oneCharBuf;


   public XMLReaderReader() {
      this.cbuf = new char[8192];
      this.cbufPos = 0;
      this.cbufEnd = 0;
      this.eofReached = false;
      this.sawCR = false;
      this.oneCharBuf = new char[1];
   }

   public XMLReaderReader(Reader in) throws IOException {
      this(in, true);
   }

   public XMLReaderReader(Reader in, boolean rewindDeclaration) throws IOException {
      this.cbuf = new char[8192];
      this.cbufPos = 0;
      this.cbufEnd = 0;
      this.eofReached = false;
      this.sawCR = false;
      this.oneCharBuf = new char[1];
      this.reset(in, rewindDeclaration);
   }

   public void reset(Reader in, boolean rewindDeclaration) throws IOException {
      super.resetInput();
      this.in = in;
      this.rewindDeclaration = rewindDeclaration;
      this.cbufPos = this.cbufEnd = 0;
      this.sawCR = false;
      this.eofReached = false;
      this.fillCharBuffer();
      this.processXMLDecl();
   }

   public void close() throws IOException {
      this.eofReached = true;
      this.cbufPos = this.cbufEnd = 0;
      if(this.in != null) {
         this.in.close();
      }

   }

   public void mark(int readAheadLimit) throws IOException {
      throw new UnsupportedOperationException("mark() not supported");
   }

   public boolean markSupported() {
      return false;
   }

   public int read() throws IOException {
      int n = this.read(this.oneCharBuf, 0, 1);
      return n <= 0?n:this.oneCharBuf[0];
   }

   public int read(char[] destbuf) throws IOException {
      return this.read(destbuf, 0, destbuf.length);
   }

   public int read(char[] destbuf, int off, int len) throws IOException {
      int charsRead = 0;

      while(true) {
         if(charsRead < len) {
            if(this.cbufPos < this.cbufEnd) {
               char c = this.cbuf[this.cbufPos++];
               if(c < 32) {
                  switch(c) {
                  case 9:
                     destbuf[off + charsRead++] = 9;
                     continue;
                  case 10:
                     if(this.sawCR) {
                        this.sawCR = false;
                     } else {
                        destbuf[off + charsRead++] = 10;
                     }
                     continue;
                  case 11:
                  case 12:
                  default:
                     throw new IllegalCharException("Illegal XML character: 0x" + Integer.toHexString(c));
                  case 13:
                     this.sawCR = true;
                     destbuf[off + charsRead++] = 10;
                     continue;
                  }
               }

               if(c > '\ud7ff' && (c < '\ue000' || c > '\ufffd') && (c < 65536 || c > 1114111)) {
                  throw new IllegalCharException("Illegal XML Character: 0x" + Integer.toHexString(c));
               }

               this.sawCR = false;
               destbuf[off + charsRead++] = c;
               continue;
            }

            if(!this.eofReached && (charsRead == 0 || this.in.ready())) {
               this.fillCharBuffer();
               continue;
            }
         }

         return charsRead == 0 && this.eofReached?-1:charsRead;
      }
   }

   public boolean ready() throws IOException {
      return this.cbufEnd - this.cbufPos > 0 || this.in.ready();
   }

   public void reset() throws IOException {
      super.resetInput();
      this.in.reset();
      this.cbufPos = this.cbufEnd = 0;
      this.sawCR = false;
      this.eofReached = false;
   }

   public long skip(long n) throws IOException {
      int charsRead = 0;

      while(true) {
         if((long)charsRead < n) {
            if(this.cbufPos < this.cbufEnd) {
               char c = this.cbuf[this.cbufPos++];
               if(c < 32) {
                  switch(c) {
                  case 9:
                     ++charsRead;
                     continue;
                  case 10:
                     if(this.sawCR) {
                        this.sawCR = false;
                     } else {
                        ++charsRead;
                     }
                     continue;
                  case 11:
                  case 12:
                  default:
                     throw new IllegalCharException("Illegal XML character: 0x" + Integer.toHexString(c));
                  case 13:
                     this.sawCR = true;
                     ++charsRead;
                     continue;
                  }
               }

               if(c > '\ud7ff' && (c < '\ue000' || c > '\ufffd') && (c < 65536 || c > 1114111)) {
                  throw new IllegalCharException("Illegal XML Character: 0x" + Integer.toHexString(c));
               }

               this.sawCR = false;
               ++charsRead;
               continue;
            }

            if(!this.eofReached) {
               this.fillCharBuffer();
               continue;
            }
         }

         return (long)(charsRead == 0 && this.eofReached?-1:charsRead);
      }
   }

   private void fillCharBuffer() throws IOException {
      this.cbufPos = 0;
      this.cbufEnd = this.in.read(this.cbuf, 0, 8192);
      if(this.cbufEnd <= 0) {
         this.eofReached = true;
      }

   }

   private void processXMLDecl() throws IOException {
      int numCharsParsed = this.parseXMLDeclaration(this.cbuf, 0, this.cbufEnd);
      if(numCharsParsed > 0 && !this.rewindDeclaration) {
         this.cbufPos += numCharsParsed;
      }

   }
}
