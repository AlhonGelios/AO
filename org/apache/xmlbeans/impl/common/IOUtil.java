package org.apache.xmlbeans.impl.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.channels.FileChannel;

public class IOUtil {

   public static void copyCompletely(InputStream input, OutputStream output) throws IOException {
      if(output instanceof FileOutputStream && input instanceof FileInputStream) {
         try {
            FileChannel buf1 = ((FileOutputStream)output).getChannel();
            FileChannel ignore1 = ((FileInputStream)input).getChannel();
            ignore1.transferTo(0L, 2147483647L, buf1);
            ignore1.close();
            buf1.close();
            return;
         } catch (Exception var6) {
            ;
         }
      }

      byte[] buf = new byte[8192];

      while(true) {
         int ignore = input.read(buf);
         if(ignore < 0) {
            try {
               input.close();
            } catch (IOException var5) {
               ;
            }

            try {
               output.close();
            } catch (IOException var4) {
               ;
            }

            return;
         }

         output.write(buf, 0, ignore);
      }
   }

   public static void copyCompletely(Reader input, Writer output) throws IOException {
      char[] buf = new char[8192];

      while(true) {
         int ignore = input.read(buf);
         if(ignore < 0) {
            try {
               input.close();
            } catch (IOException var5) {
               ;
            }

            try {
               output.close();
            } catch (IOException var4) {
               ;
            }

            return;
         }

         output.write(buf, 0, ignore);
      }
   }

   public static void copyCompletely(URI input, URI output) throws IOException {
      try {
         Object e = null;

         File out;
         try {
            out = new File(input);
            if(out.exists()) {
               e = new FileInputStream(out);
            }
         } catch (Exception var5) {
            ;
         }

         out = new File(output);
         File dir = out.getParentFile();
         dir.mkdirs();
         if(e == null) {
            e = input.toURL().openStream();
         }

         copyCompletely((InputStream)e, (OutputStream)(new FileOutputStream(out)));
      } catch (IllegalArgumentException var6) {
         throw new IOException("Cannot copy to " + output);
      }
   }

   public static File createDir(File rootdir, String subdir) {
      File newdir = subdir == null?rootdir:new File(rootdir, subdir);
      boolean created = newdir.exists() && newdir.isDirectory() || newdir.mkdirs();

      assert created : "Could not create " + newdir.getAbsolutePath();

      return newdir;
   }

}
