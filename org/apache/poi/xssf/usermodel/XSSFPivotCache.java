package org.apache.poi.xssf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache;

public class XSSFPivotCache extends POIXMLDocumentPart {

   private CTPivotCache ctPivotCache;


   public XSSFPivotCache() {
      this.ctPivotCache = CTPivotCache.Factory.newInstance();
   }

   public XSSFPivotCache(CTPivotCache ctPivotCache) {
      this.ctPivotCache = ctPivotCache;
   }

   protected XSSFPivotCache(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   protected XSSFPivotCache(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   protected void readFrom(InputStream is) throws IOException {
      try {
         XmlOptions e = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         e.setLoadReplaceDocumentElement((QName)null);
         this.ctPivotCache = CTPivotCache.Factory.parse(is, e);
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   public CTPivotCache getCTPivotCache() {
      return this.ctPivotCache;
   }
}
