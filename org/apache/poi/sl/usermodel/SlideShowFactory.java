package org.apache.poi.sl.usermodel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.OldFileFormatException;
import org.apache.poi.hssf.record.crypto.Biff8EncryptionKey;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentFactoryHelper;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.sl.usermodel.SlideShow;
import org.apache.poi.util.IOUtils;

public class SlideShowFactory {

   public static SlideShow create(NPOIFSFileSystem fs) throws IOException {
      return create(fs, (String)null);
   }

   public static SlideShow create(NPOIFSFileSystem fs, String password) throws IOException {
      DirectoryNode root = fs.getRoot();
      if(root.hasEntry("EncryptedPackage")) {
         InputStream stream1 = null;

         SlideShow var4;
         try {
            stream1 = DocumentFactoryHelper.getDecryptedStream(fs, password);
            var4 = createXSLFSlideShow(new Object[]{stream1});
         } finally {
            if(stream1 != null) {
               stream1.close();
            }

         }

         return var4;
      } else {
         if(password != null) {
            Biff8EncryptionKey.setCurrentUserPassword(password);
         }

         SlideShow stream;
         try {
            stream = createHSLFSlideShow(new Object[]{fs});
         } finally {
            Biff8EncryptionKey.setCurrentUserPassword((String)null);
         }

         return stream;
      }
   }

   public static SlideShow create(InputStream inp) throws IOException, EncryptedDocumentException {
      return create(inp, (String)null);
   }

   public static SlideShow create(InputStream inp, String password) throws IOException, EncryptedDocumentException {
      if(!((InputStream)inp).markSupported()) {
         inp = new PushbackInputStream((InputStream)inp, 8);
      }

      byte[] header8 = IOUtils.peekFirst8Bytes((InputStream)inp);
      if(NPOIFSFileSystem.hasPOIFSHeader(header8)) {
         NPOIFSFileSystem fs = new NPOIFSFileSystem((InputStream)inp);
         return create(fs, password);
      } else if(DocumentFactoryHelper.hasOOXMLHeader((InputStream)inp)) {
         return createXSLFSlideShow(new Object[]{inp});
      } else {
         throw new IllegalArgumentException("Your InputStream was neither an OLE2 stream, nor an OOXML stream");
      }
   }

   public static SlideShow create(File file) throws IOException, EncryptedDocumentException {
      return create(file, (String)null);
   }

   public static SlideShow create(File file, String password) throws IOException, EncryptedDocumentException {
      return create(file, password, false);
   }

   public static SlideShow create(File file, String password, boolean readOnly) throws IOException, EncryptedDocumentException {
      if(!file.exists()) {
         throw new FileNotFoundException(file.toString());
      } else {
         NPOIFSFileSystem fs = null;

         try {
            fs = new NPOIFSFileSystem(file, readOnly);
            return create(fs, password);
         } catch (OfficeXmlFileException var5) {
            if(fs != null) {
               fs.close();
            }

            return createXSLFSlideShow(new Object[]{file, Boolean.valueOf(readOnly)});
         } catch (RuntimeException var6) {
            if(fs != null) {
               fs.close();
            }

            throw var6;
         }
      }
   }

   protected static SlideShow createHSLFSlideShow(Object ... args) throws IOException, EncryptedDocumentException {
      return createSlideShow("org.apache.poi.hslf.usermodel.HSLFSlideShowFactory", args);
   }

   protected static SlideShow createXSLFSlideShow(Object ... args) throws IOException, EncryptedDocumentException {
      return createSlideShow("org.apache.poi.xslf.usermodel.XSLFSlideShowFactory", args);
   }

   protected static SlideShow createSlideShow(String factoryClass, Object[] args) throws IOException, EncryptedDocumentException {
      try {
         Class e = Thread.currentThread().getContextClassLoader().loadClass(factoryClass);
         Class[] var12 = new Class[args.length];
         int i = 0;
         Object[] m = args;
         int len$ = args.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Object o = m[i$];
            Class c = o.getClass();
            if(Boolean.class.isAssignableFrom(c)) {
               c = Boolean.TYPE;
            } else if(InputStream.class.isAssignableFrom(c)) {
               c = InputStream.class;
            }

            var12[i++] = c;
         }

         Method var13 = e.getMethod("createSlideShow", var12);
         return (SlideShow)var13.invoke((Object)null, args);
      } catch (InvocationTargetException var10) {
         Throwable t = var10.getCause();
         if(t instanceof IOException) {
            throw (IOException)t;
         } else if(t instanceof EncryptedDocumentException) {
            throw (EncryptedDocumentException)t;
         } else if(t instanceof OldFileFormatException) {
            throw (OldFileFormatException)t;
         } else {
            throw new IOException(t);
         }
      } catch (Exception var11) {
         throw new IOException(var11);
      }
   }
}
