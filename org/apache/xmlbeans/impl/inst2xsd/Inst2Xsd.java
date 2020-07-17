package org.apache.xmlbeans.impl.inst2xsd;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.inst2xsd.Inst2XsdOptions;
import org.apache.xmlbeans.impl.inst2xsd.RussianDollStrategy;
import org.apache.xmlbeans.impl.inst2xsd.SalamiSliceStrategy;
import org.apache.xmlbeans.impl.inst2xsd.VenetianBlindStrategy;
import org.apache.xmlbeans.impl.inst2xsd.XsdGenStrategy;
import org.apache.xmlbeans.impl.inst2xsd.util.TypeSystemHolder;
import org.apache.xmlbeans.impl.tool.CommandLine;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;

public class Inst2Xsd {

   public static void main(String[] args) {
      if(args != null && args.length != 0) {
         HashSet flags = new HashSet();
         flags.add("h");
         flags.add("help");
         flags.add("usage");
         flags.add("license");
         flags.add("version");
         flags.add("verbose");
         flags.add("validate");
         HashSet opts = new HashSet();
         opts.add("design");
         opts.add("simple-content-types");
         opts.add("enumerations");
         opts.add("outDir");
         opts.add("outPrefix");
         CommandLine cl = new CommandLine(args, flags, opts);
         Inst2XsdOptions inst2XsdOptions = new Inst2XsdOptions();
         if(cl.getOpt("license") != null) {
            CommandLine.printLicense();
            System.exit(0);
         } else if(cl.getOpt("version") != null) {
            CommandLine.printVersion();
            System.exit(0);
         } else if(cl.getOpt("h") == null && cl.getOpt("help") == null && cl.getOpt("usage") == null) {
            String[] badopts = cl.getBadOpts();
            if(badopts.length > 0) {
               for(int var21 = 0; var21 < badopts.length; ++var21) {
                  System.out.println("Unrecognized option: " + badopts[var21]);
               }

               printHelp();
               System.exit(0);
            } else {
               String design = cl.getOpt("design");
               if(design != null) {
                  if(design.equals("vb")) {
                     inst2XsdOptions.setDesign(3);
                  } else if(design.equals("rd")) {
                     inst2XsdOptions.setDesign(1);
                  } else {
                     if(!design.equals("ss")) {
                        printHelp();
                        System.exit(0);
                        return;
                     }

                     inst2XsdOptions.setDesign(2);
                  }
               }

               String simpleContent = cl.getOpt("simple-content-types");
               if(simpleContent != null) {
                  if(simpleContent.equals("smart")) {
                     inst2XsdOptions.setSimpleContentTypes(1);
                  } else {
                     if(!simpleContent.equals("string")) {
                        printHelp();
                        System.exit(0);
                        return;
                     }

                     inst2XsdOptions.setSimpleContentTypes(2);
                  }
               }

               String enumerations = cl.getOpt("enumerations");
               if(enumerations != null) {
                  if(enumerations.equals("never")) {
                     inst2XsdOptions.setUseEnumerations(1);
                  } else {
                     try {
                        int outDir = Integer.parseInt(enumerations);
                        inst2XsdOptions.setUseEnumerations(outDir);
                     } catch (NumberFormatException var17) {
                        printHelp();
                        System.exit(0);
                        return;
                     }
                  }
               }

               File var22 = new File(cl.getOpt("outDir") == null?".":cl.getOpt("outDir"));
               String outPrefix = cl.getOpt("outPrefix");
               if(outPrefix == null) {
                  outPrefix = "schema";
               }

               inst2XsdOptions.setVerbose(cl.getOpt("verbose") != null);
               boolean validate = cl.getOpt("validate") != null;
               File[] xmlFiles = cl.filesEndingWith(".xml");
               XmlObject[] xmlInstances = new XmlObject[xmlFiles.length];
               if(xmlInstances.length == 0) {
                  printHelp();
                  System.exit(0);
               } else {
                  byte i = 0;

                  int var23;
                  try {
                     for(var23 = 0; var23 < xmlFiles.length; ++var23) {
                        xmlInstances[var23] = XmlObject.Factory.parse(xmlFiles[var23]);
                     }
                  } catch (XmlException var19) {
                     System.err.println("Invalid xml file: \'" + xmlFiles[i].getName() + "\'. " + var19.getMessage());
                     return;
                  } catch (IOException var20) {
                     System.err.println("Could not read file: \'" + xmlFiles[i].getName() + "\'. " + var20.getMessage());
                     return;
                  }

                  SchemaDocument[] schemaDocs = inst2xsd(xmlInstances, inst2XsdOptions);

                  try {
                     for(var23 = 0; var23 < schemaDocs.length; ++var23) {
                        SchemaDocument e = schemaDocs[var23];
                        if(inst2XsdOptions.isVerbose()) {
                           System.out.println("----------------------\n\n" + e);
                        }

                        e.save(new File(var22, outPrefix + var23 + ".xsd"), (new XmlOptions()).setSavePrettyPrint());
                     }
                  } catch (IOException var18) {
                     System.err.println("Could not write file: \'" + var22 + File.pathSeparator + outPrefix + var23 + ".xsd" + "\'. " + var18.getMessage());
                     return;
                  }

                  if(validate) {
                     validateInstances(schemaDocs, xmlInstances);
                  }

               }
            }
         } else {
            printHelp();
            System.exit(0);
         }
      } else {
         printHelp();
         System.exit(0);
      }
   }

   private static void printHelp() {
      System.out.println("Generates XMLSchema from instance xml documents.");
      System.out.println("Usage: inst2xsd [opts] [instance.xml]*");
      System.out.println("Options include:");
      System.out.println("    -design [rd|ss|vb] - XMLSchema design type");
      System.out.println("             rd  - Russian Doll Design - local elements and local types");
      System.out.println("             ss  - Salami Slice Design - global elements and local types");
      System.out.println("             vb  - Venetian Blind Design (default) - local elements and global complex types");
      System.out.println("    -simple-content-types [smart|string] - Simple content types detection (leaf text). Smart is the default");
      System.out.println("    -enumerations [never|NUMBER] - Use enumerations. Default value is 10.");
      System.out.println("    -outDir [dir] - Directory for output files. Default is \'.\'");
      System.out.println("    -outPrefix [file_name_prefix] - Prefix for output file names. Default is \'schema\'");
      System.out.println("    -validate - Validates input instances agaist generated schemas.");
      System.out.println("    -verbose - print more informational messages");
      System.out.println("    -license - print license information");
      System.out.println("    -help - help imformation");
   }

   public static SchemaDocument[] inst2xsd(Reader[] instReaders, Inst2XsdOptions options) throws IOException, XmlException {
      XmlObject[] instances = new XmlObject[instReaders.length];

      for(int i = 0; i < instReaders.length; ++i) {
         instances[i] = XmlObject.Factory.parse(instReaders[i]);
      }

      return inst2xsd(instances, options);
   }

   public static SchemaDocument[] inst2xsd(XmlObject[] instances, Inst2XsdOptions options) {
      if(options == null) {
         options = new Inst2XsdOptions();
      }

      TypeSystemHolder typeSystemHolder = new TypeSystemHolder();
      Object strategy;
      switch(options.getDesign()) {
      case 1:
         strategy = new RussianDollStrategy();
         break;
      case 2:
         strategy = new SalamiSliceStrategy();
         break;
      case 3:
         strategy = new VenetianBlindStrategy();
         break;
      default:
         throw new IllegalArgumentException("Unknown design.");
      }

      ((XsdGenStrategy)strategy).processDoc(instances, options, typeSystemHolder);
      if(options.isVerbose()) {
         System.out.println("typeSystemHolder.toString(): " + typeSystemHolder);
      }

      SchemaDocument[] sDocs = typeSystemHolder.getSchemaDocuments();
      return sDocs;
   }

   private static boolean validateInstances(SchemaDocument[] sDocs, XmlObject[] instances) {
      ArrayList compErrors = new ArrayList();
      XmlOptions schemaOptions = new XmlOptions();
      schemaOptions.setErrorListener(compErrors);

      SchemaTypeLoader sLoader;
      try {
         sLoader = XmlBeans.loadXsd(sDocs, schemaOptions);
      } catch (Exception var11) {
         if(compErrors.isEmpty() || !(var11 instanceof XmlException)) {
            var11.printStackTrace(System.out);
         }

         System.out.println("\n-------------------\n\nInvalid schemas.");
         Iterator i = compErrors.iterator();

         while(i.hasNext()) {
            XmlError xobj = (XmlError)i.next();
            System.out.println(xobj.getLine() + ":" + xobj.getColumn() + " " + xobj.getMessage());
         }

         return false;
      }

      System.out.println("\n-------------------");
      boolean result = true;

      for(int var13 = 0; var13 < instances.length; ++var13) {
         XmlObject var14;
         try {
            var14 = sLoader.parse(instances[var13].newXMLStreamReader(), (SchemaType)null, (new XmlOptions()).setLoadLineNumbers());
         } catch (XmlException var12) {
            System.out.println("Error:\n" + instances[var13].documentProperties().getSourceName() + " not loadable: " + var12);
            var12.printStackTrace(System.out);
            result = false;
            continue;
         }

         ArrayList errors = new ArrayList();
         if(var14.schemaType() == XmlObject.type) {
            System.out.println(instances[var13].documentProperties().getSourceName() + " NOT valid.  ");
            System.out.println("  Document type not found.");
            result = false;
         } else if(var14.validate((new XmlOptions()).setErrorListener(errors))) {
            System.out.println("Instance[" + var13 + "] valid - " + instances[var13].documentProperties().getSourceName());
         } else {
            System.out.println("Instance[" + var13 + "] NOT valid - " + instances[var13].documentProperties().getSourceName());
            Iterator it = errors.iterator();

            while(it.hasNext()) {
               XmlError xe = (XmlError)it.next();
               System.out.println(xe.getLine() + ":" + xe.getColumn() + " " + xe.getMessage());
            }

            result = false;
         }
      }

      return result;
   }
}
