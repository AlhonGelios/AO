package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant;

public class CTPropertiesImpl extends XmlComplexContentImpl implements CTProperties {

   private static final QName TEMPLATE$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Template");
   private static final QName MANAGER$2 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Manager");
   private static final QName COMPANY$4 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Company");
   private static final QName PAGES$6 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Pages");
   private static final QName WORDS$8 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Words");
   private static final QName CHARACTERS$10 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Characters");
   private static final QName PRESENTATIONFORMAT$12 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "PresentationFormat");
   private static final QName LINES$14 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Lines");
   private static final QName PARAGRAPHS$16 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Paragraphs");
   private static final QName SLIDES$18 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Slides");
   private static final QName NOTES$20 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Notes");
   private static final QName TOTALTIME$22 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "TotalTime");
   private static final QName HIDDENSLIDES$24 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HiddenSlides");
   private static final QName MMCLIPS$26 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "MMClips");
   private static final QName SCALECROP$28 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "ScaleCrop");
   private static final QName HEADINGPAIRS$30 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HeadingPairs");
   private static final QName TITLESOFPARTS$32 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "TitlesOfParts");
   private static final QName LINKSUPTODATE$34 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "LinksUpToDate");
   private static final QName CHARACTERSWITHSPACES$36 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "CharactersWithSpaces");
   private static final QName SHAREDDOC$38 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "SharedDoc");
   private static final QName HYPERLINKBASE$40 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HyperlinkBase");
   private static final QName HLINKS$42 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HLinks");
   private static final QName HYPERLINKSCHANGED$44 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HyperlinksChanged");
   private static final QName DIGSIG$46 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "DigSig");
   private static final QName APPLICATION$48 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Application");
   private static final QName APPVERSION$50 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "AppVersion");
   private static final QName DOCSECURITY$52 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "DocSecurity");


   public CTPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public String getTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(TEMPLATE$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(TEMPLATE$0, 0);
         return var2;
      }
   }

   public boolean isSetTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEMPLATE$0) != 0;
      }
   }

   public void setTemplate(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(TEMPLATE$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(TEMPLATE$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTemplate(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(TEMPLATE$0, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(TEMPLATE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEMPLATE$0, 0);
      }
   }

   public String getManager() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(MANAGER$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetManager() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(MANAGER$2, 0);
         return var2;
      }
   }

   public boolean isSetManager() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MANAGER$2) != 0;
      }
   }

   public void setManager(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MANAGER$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(MANAGER$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetManager(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(MANAGER$2, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(MANAGER$2);
         }

         var3.set(var1);
      }
   }

   public void unsetManager() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MANAGER$2, 0);
      }
   }

   public String getCompany() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(COMPANY$4, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetCompany() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(COMPANY$4, 0);
         return var2;
      }
   }

   public boolean isSetCompany() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMPANY$4) != 0;
      }
   }

   public void setCompany(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(COMPANY$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(COMPANY$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCompany(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(COMPANY$4, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(COMPANY$4);
         }

         var3.set(var1);
      }
   }

   public void unsetCompany() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMPANY$4, 0);
      }
   }

   public int getPages() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(PAGES$6, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetPages() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(PAGES$6, 0);
         return var2;
      }
   }

   public boolean isSetPages() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGES$6) != 0;
      }
   }

   public void setPages(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(PAGES$6, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(PAGES$6);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetPages(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(PAGES$6, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(PAGES$6);
         }

         var3.set(var1);
      }
   }

   public void unsetPages() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGES$6, 0);
      }
   }

   public int getWords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(WORDS$8, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetWords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(WORDS$8, 0);
         return var2;
      }
   }

   public boolean isSetWords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WORDS$8) != 0;
      }
   }

   public void setWords(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(WORDS$8, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(WORDS$8);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetWords(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(WORDS$8, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(WORDS$8);
         }

         var3.set(var1);
      }
   }

   public void unsetWords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WORDS$8, 0);
      }
   }

   public int getCharacters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(CHARACTERS$10, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetCharacters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(CHARACTERS$10, 0);
         return var2;
      }
   }

   public boolean isSetCharacters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHARACTERS$10) != 0;
      }
   }

   public void setCharacters(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CHARACTERS$10, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(CHARACTERS$10);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetCharacters(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(CHARACTERS$10, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(CHARACTERS$10);
         }

         var3.set(var1);
      }
   }

   public void unsetCharacters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHARACTERS$10, 0);
      }
   }

   public String getPresentationFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetPresentationFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
         return var2;
      }
   }

   public boolean isSetPresentationFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRESENTATIONFORMAT$12) != 0;
      }
   }

   public void setPresentationFormat(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(PRESENTATIONFORMAT$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPresentationFormat(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(PRESENTATIONFORMAT$12);
         }

         var3.set(var1);
      }
   }

   public void unsetPresentationFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRESENTATIONFORMAT$12, 0);
      }
   }

   public int getLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(LINES$14, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(LINES$14, 0);
         return var2;
      }
   }

   public boolean isSetLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LINES$14) != 0;
      }
   }

   public void setLines(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LINES$14, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(LINES$14);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetLines(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(LINES$14, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(LINES$14);
         }

         var3.set(var1);
      }
   }

   public void unsetLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LINES$14, 0);
      }
   }

   public int getParagraphs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(PARAGRAPHS$16, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetParagraphs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(PARAGRAPHS$16, 0);
         return var2;
      }
   }

   public boolean isSetParagraphs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PARAGRAPHS$16) != 0;
      }
   }

   public void setParagraphs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(PARAGRAPHS$16, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(PARAGRAPHS$16);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetParagraphs(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(PARAGRAPHS$16, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(PARAGRAPHS$16);
         }

         var3.set(var1);
      }
   }

   public void unsetParagraphs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PARAGRAPHS$16, 0);
      }
   }

   public int getSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SLIDES$18, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(SLIDES$18, 0);
         return var2;
      }
   }

   public boolean isSetSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SLIDES$18) != 0;
      }
   }

   public void setSlides(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SLIDES$18, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SLIDES$18);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSlides(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(SLIDES$18, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(SLIDES$18);
         }

         var3.set(var1);
      }
   }

   public void unsetSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SLIDES$18, 0);
      }
   }

   public int getNotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(NOTES$20, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetNotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(NOTES$20, 0);
         return var2;
      }
   }

   public boolean isSetNotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOTES$20) != 0;
      }
   }

   public void setNotes(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(NOTES$20, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(NOTES$20);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetNotes(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(NOTES$20, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(NOTES$20);
         }

         var3.set(var1);
      }
   }

   public void unsetNotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOTES$20, 0);
      }
   }

   public int getTotalTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(TOTALTIME$22, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetTotalTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(TOTALTIME$22, 0);
         return var2;
      }
   }

   public boolean isSetTotalTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TOTALTIME$22) != 0;
      }
   }

   public void setTotalTime(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(TOTALTIME$22, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(TOTALTIME$22);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetTotalTime(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(TOTALTIME$22, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(TOTALTIME$22);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TOTALTIME$22, 0);
      }
   }

   public int getHiddenSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(HIDDENSLIDES$24, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetHiddenSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(HIDDENSLIDES$24, 0);
         return var2;
      }
   }

   public boolean isSetHiddenSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIDDENSLIDES$24) != 0;
      }
   }

   public void setHiddenSlides(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(HIDDENSLIDES$24, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(HIDDENSLIDES$24);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetHiddenSlides(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(HIDDENSLIDES$24, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(HIDDENSLIDES$24);
         }

         var3.set(var1);
      }
   }

   public void unsetHiddenSlides() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIDDENSLIDES$24, 0);
      }
   }

   public int getMMClips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(MMCLIPS$26, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetMMClips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(MMCLIPS$26, 0);
         return var2;
      }
   }

   public boolean isSetMMClips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MMCLIPS$26) != 0;
      }
   }

   public void setMMClips(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MMCLIPS$26, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(MMCLIPS$26);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMMClips(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(MMCLIPS$26, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(MMCLIPS$26);
         }

         var3.set(var1);
      }
   }

   public void unsetMMClips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MMCLIPS$26, 0);
      }
   }

   public boolean getScaleCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SCALECROP$28, 0);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetScaleCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_element_user(SCALECROP$28, 0);
         return var2;
      }
   }

   public boolean isSetScaleCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCALECROP$28) != 0;
      }
   }

   public void setScaleCrop(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SCALECROP$28, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SCALECROP$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetScaleCrop(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_element_user(SCALECROP$28, 0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_element_user(SCALECROP$28);
         }

         var3.set(var1);
      }
   }

   public void unsetScaleCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCALECROP$28, 0);
      }
   }

   public CTVectorVariant getHeadingPairs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorVariant var2 = null;
         var2 = (CTVectorVariant)this.get_store().find_element_user(HEADINGPAIRS$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHeadingPairs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADINGPAIRS$30) != 0;
      }
   }

   public void setHeadingPairs(CTVectorVariant var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorVariant var3 = null;
         var3 = (CTVectorVariant)this.get_store().find_element_user(HEADINGPAIRS$30, 0);
         if(var3 == null) {
            var3 = (CTVectorVariant)this.get_store().add_element_user(HEADINGPAIRS$30);
         }

         var3.set(var1);
      }
   }

   public CTVectorVariant addNewHeadingPairs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorVariant var2 = null;
         var2 = (CTVectorVariant)this.get_store().add_element_user(HEADINGPAIRS$30);
         return var2;
      }
   }

   public void unsetHeadingPairs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADINGPAIRS$30, 0);
      }
   }

   public CTVectorLpstr getTitlesOfParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorLpstr var2 = null;
         var2 = (CTVectorLpstr)this.get_store().find_element_user(TITLESOFPARTS$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTitlesOfParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TITLESOFPARTS$32) != 0;
      }
   }

   public void setTitlesOfParts(CTVectorLpstr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorLpstr var3 = null;
         var3 = (CTVectorLpstr)this.get_store().find_element_user(TITLESOFPARTS$32, 0);
         if(var3 == null) {
            var3 = (CTVectorLpstr)this.get_store().add_element_user(TITLESOFPARTS$32);
         }

         var3.set(var1);
      }
   }

   public CTVectorLpstr addNewTitlesOfParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorLpstr var2 = null;
         var2 = (CTVectorLpstr)this.get_store().add_element_user(TITLESOFPARTS$32);
         return var2;
      }
   }

   public void unsetTitlesOfParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TITLESOFPARTS$32, 0);
      }
   }

   public boolean getLinksUpToDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(LINKSUPTODATE$34, 0);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLinksUpToDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_element_user(LINKSUPTODATE$34, 0);
         return var2;
      }
   }

   public boolean isSetLinksUpToDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LINKSUPTODATE$34) != 0;
      }
   }

   public void setLinksUpToDate(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LINKSUPTODATE$34, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(LINKSUPTODATE$34);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLinksUpToDate(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_element_user(LINKSUPTODATE$34, 0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_element_user(LINKSUPTODATE$34);
         }

         var3.set(var1);
      }
   }

   public void unsetLinksUpToDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LINKSUPTODATE$34, 0);
      }
   }

   public int getCharactersWithSpaces() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetCharactersWithSpaces() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
         return var2;
      }
   }

   public boolean isSetCharactersWithSpaces() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHARACTERSWITHSPACES$36) != 0;
      }
   }

   public void setCharactersWithSpaces(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(CHARACTERSWITHSPACES$36);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetCharactersWithSpaces(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(CHARACTERSWITHSPACES$36);
         }

         var3.set(var1);
      }
   }

   public void unsetCharactersWithSpaces() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHARACTERSWITHSPACES$36, 0);
      }
   }

   public boolean getSharedDoc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SHAREDDOC$38, 0);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSharedDoc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_element_user(SHAREDDOC$38, 0);
         return var2;
      }
   }

   public boolean isSetSharedDoc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAREDDOC$38) != 0;
      }
   }

   public void setSharedDoc(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SHAREDDOC$38, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SHAREDDOC$38);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSharedDoc(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_element_user(SHAREDDOC$38, 0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_element_user(SHAREDDOC$38);
         }

         var3.set(var1);
      }
   }

   public void unsetSharedDoc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAREDDOC$38, 0);
      }
   }

   public String getHyperlinkBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(HYPERLINKBASE$40, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetHyperlinkBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(HYPERLINKBASE$40, 0);
         return var2;
      }
   }

   public boolean isSetHyperlinkBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HYPERLINKBASE$40) != 0;
      }
   }

   public void setHyperlinkBase(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(HYPERLINKBASE$40, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(HYPERLINKBASE$40);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHyperlinkBase(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(HYPERLINKBASE$40, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(HYPERLINKBASE$40);
         }

         var3.set(var1);
      }
   }

   public void unsetHyperlinkBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HYPERLINKBASE$40, 0);
      }
   }

   public CTVectorVariant getHLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorVariant var2 = null;
         var2 = (CTVectorVariant)this.get_store().find_element_user(HLINKS$42, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HLINKS$42) != 0;
      }
   }

   public void setHLinks(CTVectorVariant var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorVariant var3 = null;
         var3 = (CTVectorVariant)this.get_store().find_element_user(HLINKS$42, 0);
         if(var3 == null) {
            var3 = (CTVectorVariant)this.get_store().add_element_user(HLINKS$42);
         }

         var3.set(var1);
      }
   }

   public CTVectorVariant addNewHLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVectorVariant var2 = null;
         var2 = (CTVectorVariant)this.get_store().add_element_user(HLINKS$42);
         return var2;
      }
   }

   public void unsetHLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HLINKS$42, 0);
      }
   }

   public boolean getHyperlinksChanged() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHyperlinksChanged() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
         return var2;
      }
   }

   public boolean isSetHyperlinksChanged() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HYPERLINKSCHANGED$44) != 0;
      }
   }

   public void setHyperlinksChanged(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(HYPERLINKSCHANGED$44);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHyperlinksChanged(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_element_user(HYPERLINKSCHANGED$44);
         }

         var3.set(var1);
      }
   }

   public void unsetHyperlinksChanged() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HYPERLINKSCHANGED$44, 0);
      }
   }

   public CTDigSigBlob getDigSig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDigSigBlob var2 = null;
         var2 = (CTDigSigBlob)this.get_store().find_element_user(DIGSIG$46, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDigSig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIGSIG$46) != 0;
      }
   }

   public void setDigSig(CTDigSigBlob var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDigSigBlob var3 = null;
         var3 = (CTDigSigBlob)this.get_store().find_element_user(DIGSIG$46, 0);
         if(var3 == null) {
            var3 = (CTDigSigBlob)this.get_store().add_element_user(DIGSIG$46);
         }

         var3.set(var1);
      }
   }

   public CTDigSigBlob addNewDigSig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDigSigBlob var2 = null;
         var2 = (CTDigSigBlob)this.get_store().add_element_user(DIGSIG$46);
         return var2;
      }
   }

   public void unsetDigSig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIGSIG$46, 0);
      }
   }

   public String getApplication() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(APPLICATION$48, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetApplication() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(APPLICATION$48, 0);
         return var2;
      }
   }

   public boolean isSetApplication() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(APPLICATION$48) != 0;
      }
   }

   public void setApplication(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(APPLICATION$48, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(APPLICATION$48);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetApplication(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(APPLICATION$48, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(APPLICATION$48);
         }

         var3.set(var1);
      }
   }

   public void unsetApplication() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(APPLICATION$48, 0);
      }
   }

   public String getAppVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(APPVERSION$50, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetAppVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(APPVERSION$50, 0);
         return var2;
      }
   }

   public boolean isSetAppVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(APPVERSION$50) != 0;
      }
   }

   public void setAppVersion(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(APPVERSION$50, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(APPVERSION$50);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAppVersion(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(APPVERSION$50, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(APPVERSION$50);
         }

         var3.set(var1);
      }
   }

   public void unsetAppVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(APPVERSION$50, 0);
      }
   }

   public int getDocSecurity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DOCSECURITY$52, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetDocSecurity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(DOCSECURITY$52, 0);
         return var2;
      }
   }

   public boolean isSetDocSecurity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCSECURITY$52) != 0;
      }
   }

   public void setDocSecurity(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DOCSECURITY$52, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DOCSECURITY$52);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetDocSecurity(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(DOCSECURITY$52, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(DOCSECURITY$52);
         }

         var3.set(var1);
      }
   }

   public void unsetDocSecurity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCSECURITY$52, 0);
      }
   }

}
