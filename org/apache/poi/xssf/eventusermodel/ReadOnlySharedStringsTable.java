package org.apache.poi.xssf.eventusermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.SAXHelper;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class ReadOnlySharedStringsTable extends DefaultHandler {

   private int count;
   private int uniqueCount;
   private List strings;
   private StringBuffer characters;
   private boolean tIsOpen;


   public ReadOnlySharedStringsTable(OPCPackage pkg) throws IOException, SAXException {
      ArrayList parts = pkg.getPartsByContentType(XSSFRelation.SHARED_STRINGS.getContentType());
      if(parts.size() > 0) {
         PackagePart sstPart = (PackagePart)parts.get(0);
         this.readFrom(sstPart.getInputStream());
      }

   }

   public ReadOnlySharedStringsTable(PackagePart part) throws IOException, SAXException {
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   public ReadOnlySharedStringsTable(PackagePart part, PackageRelationship rel_ignored) throws IOException, SAXException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException, SAXException {
      PushbackInputStream pis = new PushbackInputStream(is, 1);
      int emptyTest = pis.read();
      if(emptyTest > -1) {
         pis.unread(emptyTest);
         InputSource sheetSource = new InputSource(pis);

         try {
            XMLReader e = SAXHelper.newXMLReader();
            e.setContentHandler(this);
            e.parse(sheetSource);
         } catch (ParserConfigurationException var6) {
            throw new RuntimeException("SAX parser appears to be broken - " + var6.getMessage());
         }
      }

   }

   public int getCount() {
      return this.count;
   }

   public int getUniqueCount() {
      return this.uniqueCount;
   }

   public String getEntryAt(int idx) {
      return (String)this.strings.get(idx);
   }

   public List getItems() {
      return this.strings;
   }

   public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
      if(uri == null || uri.equals("http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
         if("sst".equals(localName)) {
            String count = attributes.getValue("count");
            if(count != null) {
               this.count = Integer.parseInt(count);
            }

            String uniqueCount = attributes.getValue("uniqueCount");
            if(uniqueCount != null) {
               this.uniqueCount = Integer.parseInt(uniqueCount);
            }

            this.strings = new ArrayList(this.uniqueCount);
            this.characters = new StringBuffer();
         } else if("si".equals(localName)) {
            this.characters.setLength(0);
         } else if("t".equals(localName)) {
            this.tIsOpen = true;
         }

      }
   }

   public void endElement(String uri, String localName, String name) throws SAXException {
      if(uri == null || uri.equals("http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
         if("si".equals(localName)) {
            this.strings.add(this.characters.toString());
         } else if("t".equals(localName)) {
            this.tIsOpen = false;
         }

      }
   }

   public void characters(char[] ch, int start, int length) throws SAXException {
      if(this.tIsOpen) {
         this.characters.append(ch, start, length);
      }

   }
}
