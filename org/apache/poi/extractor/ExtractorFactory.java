package org.apache.poi.extractor;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.POIOLE2TextExtractor;
import org.apache.poi.POITextExtractor;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.extractor.OLE2ExtractorFactory;
import org.apache.poi.hsmf.MAPIMessage;
import org.apache.poi.hsmf.datatypes.AttachmentChunks;
import org.apache.poi.hsmf.extractor.OutlookTextExtactor;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentFactoryHelper;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.NotOLE2FileException;
import org.apache.poi.poifs.filesystem.OPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.xdgf.extractor.XDGFVisioExtractor;
import org.apache.poi.xslf.extractor.XSLFPowerPointExtractor;
import org.apache.poi.xslf.usermodel.XSLFRelation;
import org.apache.poi.xslf.usermodel.XSLFSlideShow;
import org.apache.poi.xssf.extractor.XSSFEventBasedExcelExtractor;
import org.apache.poi.xssf.extractor.XSSFExcelExtractor;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.apache.xmlbeans.XmlException;

public class ExtractorFactory {

   private static final POILogger logger = POILogFactory.getLogger(ExtractorFactory.class);
   public static final String CORE_DOCUMENT_REL = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument";
   protected static final String VISIO_DOCUMENT_REL = "http://schemas.microsoft.com/visio/2010/relationships/document";
   protected static final String STRICT_DOCUMENT_REL = "http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument";


   public static boolean getThreadPrefersEventExtractors() {
      return OLE2ExtractorFactory.getThreadPrefersEventExtractors();
   }

   public static Boolean getAllThreadsPreferEventExtractors() {
      return OLE2ExtractorFactory.getAllThreadsPreferEventExtractors();
   }

   public static void setThreadPrefersEventExtractors(boolean preferEventExtractors) {
      OLE2ExtractorFactory.setThreadPrefersEventExtractors(preferEventExtractors);
   }

   public static void setAllThreadsPreferEventExtractors(Boolean preferEventExtractors) {
      OLE2ExtractorFactory.setAllThreadsPreferEventExtractors(preferEventExtractors);
   }

   protected static boolean getPreferEventExtractor() {
      return OLE2ExtractorFactory.getPreferEventExtractor();
   }

   public static POITextExtractor createExtractor(File f) throws IOException, InvalidFormatException, OpenXML4JException, XmlException {
      NPOIFSFileSystem fs = null;

      try {
         fs = new NPOIFSFileSystem(f);
         POIOLE2TextExtractor e = createExtractor(fs);
         e.setFilesystem(fs);
         return e;
      } catch (OfficeXmlFileException var3) {
         IOUtils.closeQuietly(fs);
         return createExtractor(OPCPackage.open(f.toString(), PackageAccess.READ));
      } catch (NotOLE2FileException var4) {
         IOUtils.closeQuietly(fs);
         throw new IllegalArgumentException("Your File was neither an OLE2 file, nor an OOXML file");
      } catch (OpenXML4JException var5) {
         IOUtils.closeQuietly(fs);
         throw var5;
      } catch (XmlException var6) {
         IOUtils.closeQuietly(fs);
         throw var6;
      } catch (IOException var7) {
         IOUtils.closeQuietly(fs);
         throw var7;
      } catch (RuntimeException var8) {
         IOUtils.closeQuietly(fs);
         throw var8;
      }
   }

   public static POITextExtractor createExtractor(InputStream inp) throws IOException, InvalidFormatException, OpenXML4JException, XmlException {
      if(!((InputStream)inp).markSupported()) {
         inp = new PushbackInputStream((InputStream)inp, 8);
      }

      if(NPOIFSFileSystem.hasPOIFSHeader((InputStream)inp)) {
         return createExtractor(new NPOIFSFileSystem((InputStream)inp));
      } else if(DocumentFactoryHelper.hasOOXMLHeader((InputStream)inp)) {
         return createExtractor(OPCPackage.open((InputStream)inp));
      } else {
         throw new IllegalArgumentException("Your InputStream was neither an OLE2 stream, nor an OOXML stream");
      }
   }

   public static POIXMLTextExtractor createExtractor(OPCPackage pkg) throws IOException, OpenXML4JException, XmlException {
      try {
         PackageRelationshipCollection e = pkg.getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument");
         if(e.size() == 0) {
            e = pkg.getRelationshipsByType("http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument");
         }

         if(e.size() == 0) {
            e = pkg.getRelationshipsByType("http://schemas.microsoft.com/visio/2010/relationships/document");
            if(e.size() == 1) {
               return new XDGFVisioExtractor(pkg);
            }
         }

         if(e.size() != 1) {
            throw new IllegalArgumentException("Invalid OOXML Package received - expected 1 core document, found " + e.size());
         } else {
            PackagePart corePart = pkg.getPart(e.getRelationship(0));
            String contentType = corePart.getContentType();
            XSSFRelation[] arr$ = XSSFExcelExtractor.SUPPORTED_TYPES;
            int len$ = arr$.length;

            int i$;
            for(i$ = 0; i$ < len$; ++i$) {
               XSSFRelation rel = arr$[i$];
               if(rel.getContentType().equals(contentType)) {
                  if(getPreferEventExtractor()) {
                     return new XSSFEventBasedExcelExtractor(pkg);
                  }

                  return new XSSFExcelExtractor(pkg);
               }
            }

            XWPFRelation[] var12 = XWPFWordExtractor.SUPPORTED_TYPES;
            len$ = var12.length;

            for(i$ = 0; i$ < len$; ++i$) {
               XWPFRelation var14 = var12[i$];
               if(var14.getContentType().equals(contentType)) {
                  return new XWPFWordExtractor(pkg);
               }
            }

            XSLFRelation[] var13 = XSLFPowerPointExtractor.SUPPORTED_TYPES;
            len$ = var13.length;

            for(i$ = 0; i$ < len$; ++i$) {
               XSLFRelation var15 = var13[i$];
               if(var15.getContentType().equals(contentType)) {
                  return new XSLFPowerPointExtractor(pkg);
               }
            }

            if(XSLFRelation.THEME_MANAGER.getContentType().equals(contentType)) {
               return new XSLFPowerPointExtractor(new XSLFSlideShow(pkg));
            } else {
               throw new IllegalArgumentException("No supported documents found in the OOXML package (found " + contentType + ")");
            }
         }
      } catch (IOException var8) {
         pkg.revert();
         throw var8;
      } catch (OpenXML4JException var9) {
         pkg.revert();
         throw var9;
      } catch (XmlException var10) {
         pkg.revert();
         throw var10;
      } catch (RuntimeException var11) {
         pkg.revert();
         throw var11;
      }
   }

   public static POIOLE2TextExtractor createExtractor(POIFSFileSystem fs) throws IOException, OpenXML4JException, XmlException {
      return OLE2ExtractorFactory.createExtractor(fs);
   }

   public static POIOLE2TextExtractor createExtractor(NPOIFSFileSystem fs) throws IOException, OpenXML4JException, XmlException {
      return OLE2ExtractorFactory.createExtractor(fs);
   }

   public static POIOLE2TextExtractor createExtractor(OPOIFSFileSystem fs) throws IOException, OpenXML4JException, XmlException {
      return OLE2ExtractorFactory.createExtractor(fs);
   }

   public static POITextExtractor createExtractor(DirectoryNode poifsDir) throws IOException, OpenXML4JException, XmlException {
      Iterator i$ = poifsDir.getEntryNames().iterator();

      String entryName;
      do {
         if(!i$.hasNext()) {
            return OLE2ExtractorFactory.createExtractor(poifsDir);
         }

         entryName = (String)i$.next();
      } while(!entryName.equals("Package"));

      OPCPackage pkg = OPCPackage.open((InputStream)poifsDir.createDocumentInputStream("Package"));
      return createExtractor(pkg);
   }

   public static POITextExtractor[] getEmbededDocsTextExtractors(POIOLE2TextExtractor ext) throws IOException, OpenXML4JException, XmlException {
      ArrayList dirs = new ArrayList();
      ArrayList nonPOIFS = new ArrayList();
      DirectoryEntry root = ext.getRoot();
      if(root == null) {
         throw new IllegalStateException("The extractor didn\'t know which POIFS it came from!");
      } else {
         Entry nonPOIF;
         Iterator var17;
         if(ext instanceof ExcelExtractor) {
            Iterator textExtractors = root.getEntries();

            while(textExtractors.hasNext()) {
               Entry i$ = (Entry)textExtractors.next();
               if(i$.getName().startsWith("MBD")) {
                  dirs.add(i$);
               }
            }
         } else if(ext instanceof WordExtractor) {
            try {
               DirectoryEntry var14 = (DirectoryEntry)root.getEntry("ObjectPool");
               var17 = var14.getEntries();

               while(var17.hasNext()) {
                  nonPOIF = (Entry)var17.next();
                  if(nonPOIF.getName().startsWith("_")) {
                     dirs.add(nonPOIF);
                  }
               }
            } catch (FileNotFoundException var13) {
               logger.log(3, new Object[]{"Ignoring FileNotFoundException while extracting Word document", var13.getLocalizedMessage()});
            }
         } else if(ext instanceof OutlookTextExtactor) {
            MAPIMessage var15 = ((OutlookTextExtactor)ext).getMAPIMessage();
            AttachmentChunks[] var18 = var15.getAttachmentFiles();
            int var19 = var18.length;

            for(int e = 0; e < var19; ++e) {
               AttachmentChunks attachment = var18[e];
               if(attachment.attachData != null) {
                  byte[] data = attachment.attachData.getValue();
                  nonPOIFS.add(new ByteArrayInputStream(data));
               } else if(attachment.attachmentDirectory != null) {
                  dirs.add(attachment.attachmentDirectory.getDirectory());
               }
            }
         }

         if(dirs.size() == 0 && nonPOIFS.size() == 0) {
            return new POITextExtractor[0];
         } else {
            ArrayList var16 = new ArrayList();
            var17 = dirs.iterator();

            while(var17.hasNext()) {
               nonPOIF = (Entry)var17.next();
               var16.add(createExtractor((DirectoryNode)nonPOIF));
            }

            var17 = nonPOIFS.iterator();

            while(var17.hasNext()) {
               InputStream var20 = (InputStream)var17.next();

               try {
                  var16.add(createExtractor(var20));
               } catch (IllegalArgumentException var10) {
                  logger.log(3, new Object[]{"Format not supported yet", var10.getLocalizedMessage()});
               } catch (XmlException var11) {
                  throw new IOException(var11.getMessage(), var11);
               } catch (OpenXML4JException var12) {
                  throw new IOException(var12.getMessage(), var12);
               }
            }

            return (POITextExtractor[])var16.toArray(new POITextExtractor[var16.size()]);
         }
      }
   }

   @NotImplemented
   public static POITextExtractor[] getEmbededDocsTextExtractors(POIXMLTextExtractor ext) {
      throw new IllegalStateException("Not yet supported");
   }

}
