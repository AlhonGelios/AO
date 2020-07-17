package org.apache.xmlbeans.impl.jam;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.xmlbeans.impl.jam.JElement;
import org.apache.xmlbeans.impl.jam.JamClassIterator;
import org.apache.xmlbeans.impl.jam.JamClassLoader;
import org.apache.xmlbeans.impl.jam.JamService;
import org.apache.xmlbeans.impl.jam.JamServiceParams;
import org.apache.xmlbeans.impl.jam.internal.JamPrinter;
import org.apache.xmlbeans.impl.jam.provider.JamServiceFactoryImpl;

public abstract class JamServiceFactory {

   private static final JamServiceFactory DEFAULT = new JamServiceFactoryImpl();


   public static JamServiceFactory getInstance() {
      return DEFAULT;
   }

   public abstract JamServiceParams createServiceParams();

   public abstract JamService createService(JamServiceParams var1) throws IOException;

   public abstract JamClassLoader createSystemJamClassLoader();

   public abstract JamClassLoader createJamClassLoader(ClassLoader var1);

   public static void main(String[] args) {
      try {
         JamServiceParams e = getInstance().createServiceParams();

         for(int service = 0; service < args.length; ++service) {
            e.includeSourcePattern(new File[]{new File(".")}, args[service]);
         }

         JamService var7 = getInstance().createService(e);
         JamPrinter jp = JamPrinter.newInstance();
         PrintWriter out = new PrintWriter(System.out);
         JamClassIterator i = var7.getClasses();

         while(i.hasNext()) {
            out.println("-------- ");
            jp.print((JElement)i.nextClass(), out);
         }

         out.flush();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      System.out.flush();
      System.err.flush();
   }

}
