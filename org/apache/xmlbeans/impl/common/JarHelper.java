package org.apache.xmlbeans.impl.common;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;

public class JarHelper {

   private static final int BUFFER_SIZE = 2156;
   private byte[] mBuffer = new byte[2156];
   private int mByteCount = 0;
   private boolean mVerbose = false;
   private String mDestJarName = "";
   private static final char SEP = '/';


   public void jarDir(File dirOrFile2Jar, File destJar) throws IOException {
      if(dirOrFile2Jar != null && destJar != null) {
         this.mDestJarName = destJar.getCanonicalPath();
         FileOutputStream fout = new FileOutputStream(destJar);
         JarOutputStream jout = new JarOutputStream(fout);

         try {
            this.jarDir(dirOrFile2Jar, jout, (String)null);
         } catch (IOException var9) {
            throw var9;
         } finally {
            jout.close();
            fout.close();
         }

      } else {
         throw new IllegalArgumentException();
      }
   }

   public void unjarDir(File jarFile, File destDir) throws IOException {
      Object dest = null;
      FileInputStream fis = new FileInputStream(jarFile);
      this.unjar(fis, destDir);
   }

   public void unjar(InputStream in, File destDir) throws IOException {
      BufferedOutputStream dest = null;
      JarInputStream jis = new JarInputStream(in);

      JarEntry entry;
      while((entry = jis.getNextJarEntry()) != null) {
         if(entry.isDirectory()) {
            File count1 = new File(destDir, entry.getName());
            count1.mkdir();
            if(entry.getTime() != -1L) {
               count1.setLastModified(entry.getTime());
            }
         } else {
            byte[] data = new byte[2156];
            File destFile = new File(destDir, entry.getName());
            if(this.mVerbose) {
               System.out.println("unjarring " + destFile + " from " + entry.getName());
            }

            FileOutputStream fos = new FileOutputStream(destFile);
            dest = new BufferedOutputStream(fos, 2156);

            int count;
            while((count = jis.read(data, 0, 2156)) != -1) {
               dest.write(data, 0, count);
            }

            dest.flush();
            dest.close();
            if(entry.getTime() != -1L) {
               destFile.setLastModified(entry.getTime());
            }
         }
      }

      jis.close();
   }

   public void setVerbose(boolean b) {
      this.mVerbose = b;
   }

   private void jarDir(File dirOrFile2jar, JarOutputStream jos, String path) throws IOException {
      if(this.mVerbose) {
         System.out.println("checking " + dirOrFile2jar);
      }

      if(dirOrFile2jar.isDirectory()) {
         String[] fis = dirOrFile2jar.list();
         String ioe = path == null?"":path + dirOrFile2jar.getName() + '/';
         if(path != null) {
            JarEntry i = new JarEntry(ioe);
            i.setTime(dirOrFile2jar.lastModified());
            jos.putNextEntry(i);
            jos.flush();
            jos.closeEntry();
         }

         for(int var15 = 0; var15 < fis.length; ++var15) {
            File f = new File(dirOrFile2jar, fis[var15]);
            this.jarDir(f, jos, ioe);
         }
      } else {
         if(dirOrFile2jar.getCanonicalPath().equals(this.mDestJarName)) {
            if(this.mVerbose) {
               System.out.println("skipping " + dirOrFile2jar.getPath());
            }

            return;
         }

         if(this.mVerbose) {
            System.out.println("adding " + dirOrFile2jar.getPath());
         }

         FileInputStream var13 = new FileInputStream(dirOrFile2jar);

         try {
            JarEntry var14 = new JarEntry(path + dirOrFile2jar.getName());
            var14.setTime(dirOrFile2jar.lastModified());
            jos.putNextEntry(var14);

            while((this.mByteCount = var13.read(this.mBuffer)) != -1) {
               jos.write(this.mBuffer, 0, this.mByteCount);
               if(this.mVerbose) {
                  System.out.println("wrote " + this.mByteCount + " bytes");
               }
            }

            jos.flush();
            jos.closeEntry();
         } catch (IOException var11) {
            throw var11;
         } finally {
            var13.close();
         }
      }

   }

   public static void main(String[] args) throws IOException {
      if(args.length < 2) {
         System.err.println("Usage: JarHelper jarname.jar directory");
      } else {
         JarHelper jarHelper = new JarHelper();
         jarHelper.mVerbose = true;
         File destJar = new File(args[0]);
         File dirOrFile2Jar = new File(args[1]);
         jarHelper.jarDir(dirOrFile2Jar, destJar);
      }
   }
}
