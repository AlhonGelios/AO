package org.apache.xmlbeans.impl.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.tool.CommandLine;

public class RunXQuery {

   public static void printUsage() {
      System.out.println("Run an XQuery against an XML instance");
      System.out.println("Usage:");
      System.out.println("xquery [-verbose] [-pretty] [-q <query> | -qf query.xq] [file.xml]*");
      System.out.println(" -q <query> to specify a query on the command-line");
      System.out.println(" -qf <query> to specify a file containing a query");
      System.out.println(" -pretty pretty-prints the results");
      System.out.println(" -license prints license information");
      System.out.println(" the query is run on each XML file specified");
      System.out.println("");
   }

   public static void main(String[] args) throws Exception {
      HashSet flags = new HashSet();
      flags.add("h");
      flags.add("help");
      flags.add("usage");
      flags.add("license");
      flags.add("version");
      flags.add("verbose");
      flags.add("pretty");
      CommandLine cl = new CommandLine(args, flags, Arrays.asList(new String[]{"q", "qf"}));
      if(cl.getOpt("h") == null && cl.getOpt("help") == null && cl.getOpt("usage") == null) {
         String[] badopts = cl.getBadOpts();
         if(badopts.length > 0) {
            for(int var18 = 0; var18 < badopts.length; ++var18) {
               System.out.println("Unrecognized option: " + badopts[var18]);
            }

            printUsage();
            System.exit(0);
         } else if(cl.getOpt("license") != null) {
            CommandLine.printLicense();
            System.exit(0);
         } else if(cl.getOpt("version") != null) {
            CommandLine.printVersion();
            System.exit(0);
         } else {
            args = cl.args();
            if(args.length == 0) {
               printUsage();
               System.exit(0);
            } else {
               boolean verbose = cl.getOpt("verbose") != null;
               boolean pretty = cl.getOpt("pretty") != null;
               String query = cl.getOpt("q");
               String queryfile = cl.getOpt("qf");
               if(query == null && queryfile == null) {
                  System.err.println("No query specified");
                  System.exit(0);
               } else if(query != null && queryfile != null) {
                  System.err.println("Specify -qf or -q, not both.");
                  System.exit(0);
               } else {
                  StringBuffer result;
                  int opts;
                  try {
                     if(queryfile != null) {
                        File files = new File(queryfile);
                        FileInputStream i = new FileInputStream(files);
                        InputStreamReader x = new InputStreamReader(i);
                        result = new StringBuffer();

                        while(true) {
                           opts = x.read();
                           if(opts < 0) {
                              x.close();
                              i.close();
                              query = result.toString();
                              break;
                           }

                           result.append((char)opts);
                        }
                     }
                  } catch (Throwable var17) {
                     System.err.println("Cannot read query file: " + var17.getMessage());
                     System.exit(1);
                     return;
                  }

                  if(verbose) {
                     System.out.println("Compile Query:");
                     System.out.println(query);
                     System.out.println();
                  }

                  try {
                     query = XmlBeans.compileQuery(query);
                  } catch (Exception var15) {
                     System.err.println("Error compiling query: " + var15.getMessage());
                     System.exit(1);
                     return;
                  }

                  File[] var19 = cl.getFiles();

                  for(int var20 = 0; var20 < var19.length; ++var20) {
                     XmlObject var21;
                     try {
                        if(verbose) {
                           FileInputStream var22 = new FileInputStream(var19[var20]);

                           while(true) {
                              opts = var22.read();
                              if(opts < 0) {
                                 var22.close();
                                 System.out.println();
                                 break;
                              }

                              System.out.write(opts);
                           }
                        }

                        var21 = XmlObject.Factory.parse(var19[var20]);
                     } catch (Throwable var16) {
                        System.err.println("Error parsing instance: " + var16.getMessage());
                        System.exit(1);
                        return;
                     }

                     if(verbose) {
                        System.out.println("Executing Query...");
                        System.err.println();
                     }

                     result = null;

                     XmlObject[] var23;
                     try {
                        var23 = var21.execQuery(query);
                     } catch (Throwable var14) {
                        System.err.println("Error executing query: " + var14.getMessage());
                        System.exit(1);
                        return;
                     }

                     if(verbose) {
                        System.out.println("Query Result:");
                     }

                     XmlOptions var24 = new XmlOptions();
                     var24.setSaveOuter();
                     if(pretty) {
                        var24.setSavePrettyPrint();
                     }

                     for(int j = 0; j < var23.length; ++j) {
                        var23[j].save(System.out, var24);
                        System.out.println();
                     }
                  }

               }
            }
         }
      } else {
         printUsage();
         System.exit(0);
      }
   }
}
