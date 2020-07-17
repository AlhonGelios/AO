package org.apache.poi.xssf.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.SstDocument;

public class SharedStringsTable extends POIXMLDocumentPart {

   private final List strings;
   private final Map stmap;
   private int count;
   private int uniqueCount;
   private SstDocument _sstDoc;
   private static final XmlOptions options = new XmlOptions();


   public SharedStringsTable() {
      this.strings = new ArrayList();
      this.stmap = new HashMap();
      this._sstDoc = SstDocument.Factory.newInstance();
      this._sstDoc.addNewSst();
   }

   public SharedStringsTable(PackagePart part) throws IOException {
      super(part);
      this.strings = new ArrayList();
      this.stmap = new HashMap();
      this.readFrom(part.getInputStream());
   }

   public SharedStringsTable(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         int e = 0;
         this._sstDoc = SstDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         CTSst sst = this._sstDoc.getSst();
         this.count = (int)sst.getCount();
         this.uniqueCount = (int)sst.getUniqueCount();
         CTRst[] arr$ = sst.getSiArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTRst st = arr$[i$];
            this.stmap.put(this.getKey(st), Integer.valueOf(e));
            this.strings.add(st);
            ++e;
         }

      } catch (XmlException var8) {
         throw new IOException("unable to parse shared strings table", var8);
      }
   }

   private String getKey(CTRst st) {
      return st.xmlText(options);
   }

   public CTRst getEntryAt(int idx) {
      return (CTRst)this.strings.get(idx);
   }

   public int getCount() {
      return this.count;
   }

   public int getUniqueCount() {
      return this.uniqueCount;
   }

   public int addEntry(CTRst st) {
      String s = this.getKey(st);
      ++this.count;
      if(this.stmap.containsKey(s)) {
         return ((Integer)this.stmap.get(s)).intValue();
      } else {
         ++this.uniqueCount;
         CTRst newSt = this._sstDoc.getSst().addNewSi();
         newSt.set(st);
         int idx = this.strings.size();
         this.stmap.put(s, Integer.valueOf(idx));
         this.strings.add(newSt);
         return idx;
      }
   }

   public List getItems() {
      return Collections.unmodifiableList(this.strings);
   }

   public void writeTo(OutputStream out) throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveCDataLengthThreshold(1000000);
      xmlOptions.setSaveCDataEntityCountThreshold(-1);
      CTSst sst = this._sstDoc.getSst();
      sst.setCount((long)this.count);
      sst.setUniqueCount((long)this.uniqueCount);
      this._sstDoc.save(out, xmlOptions);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }

   static {
      options.put("SAVE_INNER");
      options.put("SAVE_AGGRESSIVE_NAMESPACES");
      options.put("SAVE_USE_DEFAULT_NAMESPACE");
      options.setSaveImplicitNamespaces(Collections.singletonMap("", "http://schemas.openxmlformats.org/spreadsheetml/2006/main"));
   }
}
