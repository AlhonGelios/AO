package repackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import repackage.Repackager;

public class Repackage {

   private File _sourceBase;
   private File _targetBase;
   private List _fromPackages;
   private List _toPackages;
   private Pattern _packagePattern;
   private Repackager _repackager;
   private Map _movedDirs;
   private List _moveAlongFiles;
   private int _skippedFiles;


   public static void main(String[] args) throws Exception {
      (new Repackage(args)).repackage();
   }

   private Repackage(String[] args) {
      String sourceDir = null;
      String targetDir = null;
      String repackageSpec = null;
      boolean failure = false;

      for(int i = 0; i < args.length; ++i) {
         if(args[i].equals("-repackage") && i + 1 < args.length) {
            ++i;
            repackageSpec = args[i];
         } else if(args[i].equals("-f") && i + 1 < args.length) {
            ++i;
            sourceDir = args[i];
         } else if(args[i].equals("-t") && i + 1 < args.length) {
            ++i;
            targetDir = args[i];
         } else {
            failure = true;
         }
      }

      if(!failure && repackageSpec != null && !(sourceDir == null ^ targetDir == null)) {
         this._repackager = new Repackager(repackageSpec);
         if(sourceDir != null && targetDir != null) {
            this._sourceBase = new File(sourceDir);
            this._targetBase = new File(targetDir);
         }
      } else {
         throw new RuntimeException("Usage: repackage -repackage [spec] [ -f [sourcedir] -t [targetdir] ]");
      }
   }

   public void repackage() throws Exception {
      if(this._sourceBase != null && this._targetBase != null) {
         this._fromPackages = this._repackager.getFromPackages();
         this._toPackages = this._repackager.getToPackages();
         this._packagePattern = Pattern.compile("^\\s*package\\s+((?:\\w|\\.)*)\\s*;", 8);
         this._moveAlongFiles = new ArrayList();
         this._movedDirs = new HashMap();
         this._targetBase.mkdirs();
         ArrayList files = new ArrayList();
         this.fillFiles(files, this._sourceBase);
         System.out.println("Repackaging " + files.size() + " files ...");
         int prefixLength = this._sourceBase.getCanonicalPath().length();

         for(int i = 0; i < files.size(); ++i) {
            File from = (File)files.get(i);
            String name = from.getCanonicalPath().substring(prefixLength + 1);
            this.repackageFile(name);
         }

         this.finishMovingFiles();
         if(this._skippedFiles > 0) {
            System.out.println("Skipped " + this._skippedFiles + " unmodified files.");
         }

      } else {
         System.out.println(this._repackager.repackage(this.readInputStream(System.in)).toString());
      }
   }

   private boolean fileIsUnchanged(String name) {
      File sourceFile = new File(this._sourceBase, name);
      File targetFile = new File(this._targetBase, name);
      return sourceFile.lastModified() < targetFile.lastModified();
   }

   public void repackageFile(String name) throws IOException {
      if(name.endsWith(".java")) {
         this.repackageJavaFile(name);
      } else if(!name.endsWith(".xsdconfig") && !name.endsWith(".xml") && !name.endsWith(".g")) {
         if(name.startsWith("bin" + File.separatorChar)) {
            this.repackageNonJavaFile(name);
         } else {
            this.moveAlongWithJavaFiles(name);
         }
      } else {
         this.repackageNonJavaFile(name);
      }

   }

   public void moveAlongWithJavaFiles(String name) {
      this._moveAlongFiles.add(name);
   }

   public void finishMovingFiles() throws IOException {
      Iterator i = this._moveAlongFiles.iterator();

      while(i.hasNext()) {
         String name = (String)i.next();
         String toName = name;
         String srcDir = Repackager.dirForPath(name);
         String toDir = (String)this._movedDirs.get(srcDir);
         if(toDir != null) {
            toName = (new File(toDir, (new File(name)).getName())).toString();
         }

         if(name.endsWith(".html")) {
            this.repackageNonJavaFile(name, toName);
         } else {
            this.justMoveNonJavaFile(name, toName);
         }
      }

   }

   public void repackageNonJavaFile(String name) throws IOException {
      File sourceFile = new File(this._sourceBase, name);
      File targetFile = new File(this._targetBase, name);
      if(sourceFile.lastModified() < targetFile.lastModified()) {
         ++this._skippedFiles;
      } else {
         this.writeFile(targetFile, this._repackager.repackage(this.readFile(sourceFile)));
      }

   }

   public void repackageNonJavaFile(String sourceName, String targetName) throws IOException {
      File sourceFile = new File(this._sourceBase, sourceName);
      File targetFile = new File(this._targetBase, targetName);
      if(sourceFile.lastModified() < targetFile.lastModified()) {
         ++this._skippedFiles;
      } else {
         this.writeFile(targetFile, this._repackager.repackage(this.readFile(sourceFile)));
      }

   }

   public void justMoveNonJavaFile(String sourceName, String targetName) throws IOException {
      File sourceFile = new File(this._sourceBase, sourceName);
      File targetFile = new File(this._targetBase, targetName);
      if(sourceFile.lastModified() < targetFile.lastModified()) {
         ++this._skippedFiles;
      } else {
         copyFile(sourceFile, targetFile);
      }

   }

   public void repackageJavaFile(String name) throws IOException {
      File sourceFile = new File(this._sourceBase, name);
      StringBuffer sb = this.readFile(sourceFile);
      Matcher packageMatcher = this._packagePattern.matcher(sb);
      if(packageMatcher.find()) {
         String targetFile = packageMatcher.group(1);
         int pkgStart = packageMatcher.start(1);
         int pkgEnd = packageMatcher.end(1);
         if(packageMatcher.find()) {
            throw new RuntimeException("Two package specifications found: " + name);
         }

         ArrayList filePath = Repackager.splitPath(name, File.separatorChar);
         String srcDir = Repackager.dirForPath(name);

         boolean pkgPath;
         int f;
         do {
            pkgPath = false;

            for(f = 1; f < filePath.size(); ++f) {
               String changeTo = (String)filePath.get(f - 1);
               String changeFrom = (String)filePath.get(f);
               if(changeTo.indexOf(58) < changeFrom.indexOf(58)) {
                  filePath.set(f - 1, changeFrom);
                  filePath.set(f, changeTo);
                  pkgPath = true;
               }
            }
         } while(pkgPath);

         ArrayList var18 = Repackager.splitPath(targetFile, '.');
         f = filePath.size() - 2;
         if(f < 0 || filePath.size() - 1 < var18.size()) {
            throw new RuntimeException("Package spec differs from file path: " + name);
         }

         for(int var19 = var18.size() - 1; var19 >= 0; --var19) {
            if(!var18.get(var19).equals(filePath.get(f))) {
               throw new RuntimeException("Package spec differs from file path: " + name);
            }

            --f;
         }

         List var20 = null;
         List var21 = null;

         int newDir;
         label93:
         for(int newPkg = 0; newPkg < this._fromPackages.size(); ++newPkg) {
            List newName = (List)this._fromPackages.get(newPkg);
            if(newName.size() <= var18.size()) {
               for(newDir = 0; newDir < newName.size(); ++newDir) {
                  if(!newName.get(newDir).equals(var18.get(newDir))) {
                     continue label93;
                  }
               }

               var21 = newName;
               var20 = (List)this._toPackages.get(newPkg);
               break;
            }
         }

         if(var20 != null) {
            String var22 = "";
            String var23 = "";

            for(newDir = 0; newDir < var20.size(); ++newDir) {
               if(newDir > 0) {
                  var22 = var22 + ".";
                  var23 = var23 + File.separatorChar;
               }

               var22 = var22 + var20.get(newDir);
               var23 = var23 + var20.get(newDir);
            }

            for(newDir = filePath.size() - var18.size() - 2; newDir >= 0; --newDir) {
               var23 = (String)filePath.get(newDir) + File.separatorChar + var23;
            }

            for(newDir = var21.size(); newDir < var18.size(); ++newDir) {
               var23 = var23 + File.separatorChar + (String)var18.get(newDir);
               var22 = var22 + '.' + (String)var18.get(newDir);
            }

            var23 = var23 + File.separatorChar + (String)filePath.get(filePath.size() - 1);
            sb.replace(pkgStart, pkgEnd, var22);
            name = var23;
            String var24 = Repackager.dirForPath(var23);
            if(!srcDir.equals(var24)) {
               this._movedDirs.put(srcDir, var24);
            }
         }
      }

      File var17 = new File(this._targetBase, name);
      if(sourceFile.lastModified() < var17.lastModified()) {
         ++this._skippedFiles;
      } else {
         this.writeFile(new File(this._targetBase, name), this._repackager.repackage(sb));
      }
   }

   void writeFile(File f, StringBuffer chars) throws IOException {
      f.getParentFile().mkdirs();
      FileOutputStream out = new FileOutputStream(f);
      OutputStreamWriter w = new OutputStreamWriter(out);
      StringReader r = new StringReader(chars.toString());
      copy((Reader)r, (Writer)w);
      r.close();
      w.close();
      out.close();
   }

   StringBuffer readFile(File f) throws IOException {
      FileInputStream in = new FileInputStream(f);
      InputStreamReader r = new InputStreamReader(in);
      StringWriter w = new StringWriter();
      copy((Reader)r, (Writer)w);
      w.close();
      r.close();
      in.close();
      return w.getBuffer();
   }

   StringBuffer readInputStream(InputStream is) throws IOException {
      InputStreamReader r = new InputStreamReader(is);
      StringWriter w = new StringWriter();
      copy((Reader)r, (Writer)w);
      w.close();
      r.close();
      return w.getBuffer();
   }

   public static void copyFile(File from, File to) throws IOException {
      to.getParentFile().mkdirs();
      FileInputStream in = new FileInputStream(from);
      FileOutputStream out = new FileOutputStream(to);
      copy((InputStream)in, (OutputStream)out);
      out.close();
      in.close();
   }

   public static void copy(InputStream in, OutputStream out) throws IOException {
      byte[] buffer = new byte[16384];

      while(true) {
         int n = in.read(buffer, 0, buffer.length);
         if(n < 0) {
            return;
         }

         out.write(buffer, 0, n);
      }
   }

   public static void copy(Reader r, Writer w) throws IOException {
      char[] buffer = new char[16384];

      while(true) {
         int n = r.read(buffer, 0, buffer.length);
         if(n < 0) {
            return;
         }

         w.write(buffer, 0, n);
      }
   }

   public void fillFiles(ArrayList files, File file) throws IOException {
      if(!file.isDirectory()) {
         files.add(file);
      } else if(!file.getName().equals("build")) {
         if(!file.getName().equals("CVS")) {
            String[] entries = file.list();

            for(int i = 0; i < entries.length; ++i) {
               this.fillFiles(files, new File(file, entries[i]));
            }

         }
      }
   }

   public void recursiveDelete(File file) throws IOException {
      if(file.exists()) {
         if(file.isDirectory()) {
            String[] entries = file.list();

            for(int i = 0; i < entries.length; ++i) {
               this.recursiveDelete(new File(file, entries[i]));
            }
         }

         file.delete();
      }
   }
}
