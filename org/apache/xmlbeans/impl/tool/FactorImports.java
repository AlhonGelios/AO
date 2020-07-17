package org.apache.xmlbeans.impl.tool;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.tool.CodeGenUtil;
import org.apache.xmlbeans.impl.tool.CommandLine;
import org.apache.xmlbeans.impl.xb.xsdschema.FormChoice;
import org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.NamedAttributeGroup;
import org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute;
import org.apache.xmlbeans.impl.xb.xsdschema.TopLevelComplexType;
import org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement;
import org.apache.xmlbeans.impl.xb.xsdschema.TopLevelSimpleType;

public class FactorImports {

   public static void printUsage() {
      System.out.println("Refactors a directory of XSD files to remove name conflicts.");
      System.out.println("Usage: sfactor [-import common.xsd] [-out outputdir] inputdir");
      System.out.println("    -import common.xsd - The XSD file to contain redundant ");
      System.out.println("                         definitions for importing.");
      System.out.println("    -out outputdir - The directory into which to place XSD ");
      System.out.println("                     files resulting from refactoring, ");
      System.out.println("                     plus a commonly imported common.xsd.");
      System.out.println("    inputdir - The directory containing the XSD files with");
      System.out.println("               redundant definitions.");
      System.out.println("    -license - Print license information.");
      System.out.println();
   }

   public static void main(String[] args) throws Exception {
      HashSet flags = new HashSet();
      flags.add("h");
      flags.add("help");
      flags.add("usage");
      flags.add("license");
      flags.add("version");
      CommandLine cl = new CommandLine(args, flags, Arrays.asList(new String[]{"import", "out"}));
      if(cl.getOpt("h") == null && cl.getOpt("help") == null && cl.getOpt("usage") == null && args.length >= 1) {
         String[] badopts = cl.getBadOpts();
         if(badopts.length > 0) {
            for(int var41 = 0; var41 < badopts.length; ++var41) {
               System.out.println("Unrecognized option: " + badopts[var41]);
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
            if(args.length != 1) {
               System.exit(0);
            } else {
               String commonName = cl.getOpt("import");
               if(commonName == null) {
                  commonName = "common.xsd";
               }

               String out = cl.getOpt("out");
               if(out == null) {
                  System.out.println("Using output directory \'out\'");
                  out = "out";
               }

               File outdir = new File(out);
               File basedir = new File(args[0]);
               File[] files = cl.getFiles();
               HashMap schemaDocs = new HashMap();
               HashSet elementNames = new HashSet();
               HashSet attributeNames = new HashSet();
               HashSet typeNames = new HashSet();
               HashSet modelGroupNames = new HashSet();
               HashSet attrGroupNames = new HashSet();
               HashSet dupeElementNames = new HashSet();
               HashSet dupeAttributeNames = new HashSet();
               HashSet dupeTypeNames = new HashSet();
               HashSet dupeModelGroupNames = new HashSet();
               HashSet dupeAttrGroupNames = new HashSet();
               HashSet dupeNamespaces = new HashSet();

               int st;
               for(int commonDocs = 0; commonDocs < files.length; ++commonDocs) {
                  try {
                     SchemaDocument commonFiles = SchemaDocument.Factory.parse(files[commonDocs]);
                     schemaDocs.put(commonFiles, files[commonDocs]);
                     if(commonFiles.getSchema().sizeOfImportArray() > 0 || commonFiles.getSchema().sizeOfIncludeArray() > 0) {
                        System.out.println("warning: " + files[commonDocs] + " contains imports or includes that are being ignored.");
                     }

                     String count = commonFiles.getSchema().getTargetNamespace();
                     if(count == null) {
                        count = "";
                     }

                     TopLevelComplexType[] i = commonFiles.getSchema().getComplexTypeArray();

                     for(int doc = 0; doc < i.length; ++doc) {
                        noteName(i[doc].getName(), count, typeNames, dupeTypeNames, dupeNamespaces);
                     }

                     TopLevelSimpleType[] var46 = commonFiles.getSchema().getSimpleTypeArray();

                     for(int outputFile = 0; outputFile < var46.length; ++outputFile) {
                        noteName(var46[outputFile].getName(), count, typeNames, dupeTypeNames, dupeNamespaces);
                     }

                     TopLevelElement[] var49 = commonFiles.getSchema().getElementArray();

                     for(int outputFile1 = 0; outputFile1 < var49.length; ++outputFile1) {
                        noteName(var49[outputFile1].getName(), count, elementNames, dupeElementNames, dupeNamespaces);
                     }

                     TopLevelAttribute[] var52 = commonFiles.getSchema().getAttributeArray();

                     for(int needImport = 0; needImport < var52.length; ++needImport) {
                        noteName(var52[needImport].getName(), count, attributeNames, dupeAttributeNames, dupeNamespaces);
                     }

                     NamedGroup[] var56 = commonFiles.getSchema().getGroupArray();

                     for(int ct = 0; ct < var56.length; ++ct) {
                        noteName(var56[ct].getName(), count, modelGroupNames, dupeModelGroupNames, dupeNamespaces);
                     }

                     NamedAttributeGroup[] var58 = commonFiles.getSchema().getAttributeGroupArray();

                     for(st = 0; st < var58.length; ++st) {
                        noteName(var58[st].getName(), count, attrGroupNames, dupeAttrGroupNames, dupeNamespaces);
                     }
                  } catch (XmlException var39) {
                     System.out.println("warning: " + files[commonDocs] + " is not a schema file - " + var39.getError().toString());
                  } catch (IOException var40) {
                     System.err.println("Unable to load " + files[commonDocs] + " - " + var40.getMessage());
                     System.exit(1);
                     return;
                  }
               }

               if(schemaDocs.size() == 0) {
                  System.out.println("No schema files found.");
                  System.exit(0);
               } else if(dupeTypeNames.size() + dupeElementNames.size() + dupeAttributeNames.size() + dupeModelGroupNames.size() + dupeAttrGroupNames.size() == 0) {
                  System.out.println("No duplicate names found.");
                  System.exit(0);
               } else {
                  HashMap var42 = new HashMap();
                  HashMap var43 = new HashMap();
                  int var45 = dupeNamespaces.size() == 1?0:1;
                  Iterator var44 = dupeNamespaces.iterator();

                  while(var44.hasNext()) {
                     String var47 = (String)var44.next();
                     SchemaDocument var50 = SchemaDocument.Factory.parse("<xs:schema xmlns:xs=\'http://www.w3.org/2001/XMLSchema\'/>");
                     if(var47.length() > 0) {
                        var50.getSchema().setTargetNamespace(var47);
                     }

                     var50.getSchema().setElementFormDefault(FormChoice.QUALIFIED);
                     var42.put(var47, var50);
                     var43.put(var50, commonFileFor(commonName, var47, var45++, outdir));
                  }

                  var44 = schemaDocs.keySet().iterator();

                  SchemaDocument var48;
                  while(var44.hasNext()) {
                     var48 = (SchemaDocument)var44.next();
                     String var51 = var48.getSchema().getTargetNamespace();
                     if(var51 == null) {
                        var51 = "";
                     }

                     SchemaDocument var53 = (SchemaDocument)var42.get(var51);
                     boolean var57 = false;
                     TopLevelComplexType[] var59 = var48.getSchema().getComplexTypeArray();

                     for(st = var59.length - 1; st >= 0; --st) {
                        if(isDuplicate(var59[st].getName(), var51, dupeTypeNames)) {
                           if(isFirstDuplicate(var59[st].getName(), var51, typeNames, dupeTypeNames)) {
                              var53.getSchema().addNewComplexType().set(var59[st]);
                           }

                           var57 = true;
                           var48.getSchema().removeComplexType(st);
                        }
                     }

                     TopLevelSimpleType[] var60 = var48.getSchema().getSimpleTypeArray();

                     for(int el = 0; el < var60.length; ++el) {
                        if(isDuplicate(var60[el].getName(), var51, dupeTypeNames)) {
                           if(isFirstDuplicate(var60[el].getName(), var51, typeNames, dupeTypeNames)) {
                              var53.getSchema().addNewSimpleType().set(var60[el]);
                           }

                           var57 = true;
                           var48.getSchema().removeSimpleType(el);
                        }
                     }

                     TopLevelElement[] var61 = var48.getSchema().getElementArray();

                     for(int at = 0; at < var61.length; ++at) {
                        if(isDuplicate(var61[at].getName(), var51, dupeElementNames)) {
                           if(isFirstDuplicate(var61[at].getName(), var51, elementNames, dupeElementNames)) {
                              var53.getSchema().addNewElement().set(var61[at]);
                           }

                           var57 = true;
                           var48.getSchema().removeElement(at);
                        }
                     }

                     TopLevelAttribute[] var62 = var48.getSchema().getAttributeArray();

                     for(int gr = 0; gr < var62.length; ++gr) {
                        if(isDuplicate(var62[gr].getName(), var51, dupeAttributeNames)) {
                           if(isFirstDuplicate(var62[gr].getName(), var51, attributeNames, dupeAttributeNames)) {
                              var53.getSchema().addNewElement().set(var62[gr]);
                           }

                           var57 = true;
                           var48.getSchema().removeElement(gr);
                        }
                     }

                     NamedGroup[] var63 = var48.getSchema().getGroupArray();

                     for(int ag = 0; ag < var63.length; ++ag) {
                        if(isDuplicate(var63[ag].getName(), var51, dupeModelGroupNames)) {
                           if(isFirstDuplicate(var63[ag].getName(), var51, modelGroupNames, dupeModelGroupNames)) {
                              var53.getSchema().addNewElement().set(var63[ag]);
                           }

                           var57 = true;
                           var48.getSchema().removeElement(ag);
                        }
                     }

                     NamedAttributeGroup[] var64 = var48.getSchema().getAttributeGroupArray();

                     for(int newInclude = 0; newInclude < var64.length; ++newInclude) {
                        if(isDuplicate(var64[newInclude].getName(), var51, dupeAttrGroupNames)) {
                           if(isFirstDuplicate(var64[newInclude].getName(), var51, attrGroupNames, dupeAttrGroupNames)) {
                              var53.getSchema().addNewElement().set(var64[newInclude]);
                           }

                           var57 = true;
                           var48.getSchema().removeElement(newInclude);
                        }
                     }

                     if(var57) {
                        IncludeDocument.Include var65 = var48.getSchema().addNewInclude();
                        File inputFile = (File)schemaDocs.get(var48);
                        File outputFile2 = outputFileFor(inputFile, basedir, outdir);
                        File commonFile = (File)var43.get(var53);
                        if(var51 != null) {
                           var65.setSchemaLocation(relativeURIFor(outputFile2, commonFile));
                        }
                     }
                  }

                  if(!outdir.isDirectory() && !outdir.mkdirs()) {
                     System.err.println("Unable to makedir " + outdir);
                     System.exit(1);
                  } else {
                     var44 = schemaDocs.keySet().iterator();

                     File var54;
                     while(var44.hasNext()) {
                        var48 = (SchemaDocument)var44.next();
                        var54 = (File)schemaDocs.get(var48);
                        File var55 = outputFileFor(var54, basedir, outdir);
                        if(var55 == null) {
                           System.out.println("Cannot copy " + var54);
                        } else {
                           var48.save(var55, (new XmlOptions()).setSavePrettyPrint().setSaveAggresiveNamespaces());
                        }
                     }

                     var44 = var43.keySet().iterator();

                     while(var44.hasNext()) {
                        var48 = (SchemaDocument)var44.next();
                        var54 = (File)var43.get(var48);
                        var48.save(var54, (new XmlOptions()).setSavePrettyPrint().setSaveAggresiveNamespaces());
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

   private static File outputFileFor(File file, File baseDir, File outdir) {
      URI base = baseDir.getAbsoluteFile().toURI();
      URI abs = file.getAbsoluteFile().toURI();
      URI rel = base.relativize(abs);
      if(rel.isAbsolute()) {
         System.out.println("Cannot relativize " + file);
         return null;
      } else {
         URI outbase = outdir.toURI();
         URI out = CodeGenUtil.resolve(outbase, rel);
         return new File(out);
      }
   }

   private static URI commonAncestor(URI first, URI second) {
      String firstStr = first.toString();
      String secondStr = second.toString();
      int len = firstStr.length();
      if(secondStr.length() < len) {
         len = secondStr.length();
      }

      int i;
      for(i = 0; i < len && firstStr.charAt(i) == secondStr.charAt(i); ++i) {
         ;
      }

      --i;
      if(i >= 0) {
         i = firstStr.lastIndexOf(47, i);
      }

      if(i < 0) {
         return null;
      } else {
         try {
            return new URI(firstStr.substring(0, i));
         } catch (URISyntaxException var7) {
            return null;
         }
      }
   }

   private static String relativeURIFor(File source, File target) {
      URI base = source.getAbsoluteFile().toURI();
      URI abs = target.getAbsoluteFile().toURI();
      URI commonBase = commonAncestor(base, abs);
      if(commonBase == null) {
         return abs.toString();
      } else {
         URI baserel = commonBase.relativize(base);
         URI targetrel = commonBase.relativize(abs);
         if(!baserel.isAbsolute() && !targetrel.isAbsolute()) {
            String prefix = "";
            String sourceRel = baserel.toString();

            for(int i = 0; i < sourceRel.length(); ++i) {
               i = sourceRel.indexOf(47, i);
               if(i < 0) {
                  break;
               }

               prefix = prefix + "../";
            }

            return prefix + targetrel.toString();
         } else {
            return abs.toString();
         }
      }
   }

   private static File commonFileFor(String commonName, String namespace, int i, File outdir) {
      String name = commonName;
      if(i > 0) {
         int index = commonName.lastIndexOf(46);
         if(index < 0) {
            index = commonName.length();
         }

         name = commonName.substring(0, index) + i + commonName.substring(index);
      }

      return new File(outdir, name);
   }

   private static void noteName(String name, String targetNamespace, Set seen, Set dupes, Set dupeNamespaces) {
      if(name != null) {
         QName qName = new QName(targetNamespace, name);
         if(seen.contains(qName)) {
            dupes.add(qName);
            dupeNamespaces.add(targetNamespace);
         } else {
            seen.add(qName);
         }

      }
   }

   private static boolean isFirstDuplicate(String name, String targetNamespace, Set notseen, Set dupes) {
      if(name == null) {
         return false;
      } else {
         QName qName = new QName(targetNamespace, name);
         if(dupes.contains(qName) && notseen.contains(qName)) {
            notseen.remove(qName);
            return true;
         } else {
            return false;
         }
      }
   }

   private static boolean isDuplicate(String name, String targetNamespace, Set dupes) {
      if(name == null) {
         return false;
      } else {
         QName qName = new QName(targetNamespace, name);
         return dupes.contains(qName);
      }
   }
}
