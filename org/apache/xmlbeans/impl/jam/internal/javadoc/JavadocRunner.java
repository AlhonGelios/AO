package org.apache.xmlbeans.impl.jam.internal.javadoc;

import com.sun.javadoc.Doclet;
import com.sun.javadoc.RootDoc;
import com.sun.tools.javadoc.Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.xmlbeans.impl.jam.internal.javadoc.JavadocClassloadingException;
import org.apache.xmlbeans.impl.jam.internal.javadoc.JavadocResults;
import org.apache.xmlbeans.impl.jam.provider.JamLogger;

public class JavadocRunner extends Doclet {

   private static final String JAVADOC_RUNNER_150 = "org.apache.xmlbeans.impl.jam.internal.javadoc.JavadocRunner_150";


   public static JavadocRunner newInstance() {
      try {
         Class.forName("com.sun.javadoc.AnnotationDesc");
      } catch (ClassNotFoundException var4) {
         return new JavadocRunner();
      }

      try {
         Class e = Class.forName("org.apache.xmlbeans.impl.jam.internal.javadoc.JavadocRunner_150");
         return (JavadocRunner)e.newInstance();
      } catch (ClassNotFoundException var1) {
         ;
      } catch (IllegalAccessException var2) {
         ;
      } catch (InstantiationException var3) {
         ;
      }

      return new JavadocRunner();
   }

   synchronized RootDoc run(File[] files, PrintWriter out, String sourcePath, String classPath, String[] javadocArgs, JamLogger logger) throws IOException, FileNotFoundException {
      if(files != null && files.length != 0) {
         ArrayList argList = new ArrayList();
         if(javadocArgs != null) {
            argList.addAll(Arrays.asList(javadocArgs));
         }

         argList.add("-private");
         if(sourcePath != null) {
            argList.add("-sourcepath");
            argList.add(sourcePath);
         }

         if(classPath != null) {
            argList.add("-classpath");
            argList.add(classPath);
            argList.add("-docletpath");
            argList.add(classPath);
         }

         for(int args = 0; args < files.length; ++args) {
            argList.add(files[args].toString());
            if(out != null) {
               out.println(files[args].toString());
            }
         }

         String[] var20 = new String[argList.size()];
         argList.toArray(var20);
         StringWriter spew = null;
         PrintWriter spewWriter;
         if(out == null) {
            spewWriter = new PrintWriter(spew = new StringWriter());
         } else {
            spewWriter = out;
         }

         ClassLoader originalCCL = Thread.currentThread().getContextClassLoader();

         RootDoc var14;
         try {
            JavadocResults.prepare();
            if(logger.isVerbose((Object)this)) {
               logger.verbose("Invoking javadoc.  Command line equivalent is: ");
               StringWriter e = new StringWriter();
               e.write("javadoc ");

               for(int root = 0; root < var20.length; ++root) {
                  e.write("\'");
                  e.write(var20[root]);
                  e.write("\' ");
               }

               logger.verbose("  " + e.toString());
            }

            int var21 = Main.execute("JAM", spewWriter, spewWriter, spewWriter, this.getClass().getName(), var20);
            RootDoc var22 = JavadocResults.getRoot();
            if(var21 != 0 || var22 == null) {
               spewWriter.flush();
               if(JavadocClassloadingException.isClassloadingProblemPresent()) {
                  throw new JavadocClassloadingException();
               }

               throw new RuntimeException("Unknown javadoc problem: result=" + var21 + ", root=" + var22 + ":\n" + (spew == null?"":spew.toString()));
            }

            var14 = var22;
         } catch (RuntimeException var18) {
            throw var18;
         } finally {
            Thread.currentThread().setContextClassLoader(originalCCL);
         }

         return var14;
      } else {
         throw new FileNotFoundException("No input files found.");
      }
   }

   public static boolean start(RootDoc root) {
      JavadocResults.setRoot(root);
      return true;
   }
}
