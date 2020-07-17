package org.apache.poi;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart;
import org.apache.poi.util.LocaleUtil;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties;

public class POIXMLPropertiesTextExtractor extends POIXMLTextExtractor {

   private final DateFormat dateFormat;


   public POIXMLPropertiesTextExtractor(POIXMLDocument doc) {
      super(doc);
      DateFormatSymbols dfs = DateFormatSymbols.getInstance(Locale.ROOT);
      this.dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", dfs);
      this.dateFormat.setTimeZone(LocaleUtil.TIMEZONE_UTC);
   }

   public POIXMLPropertiesTextExtractor(POIXMLTextExtractor otherExtractor) {
      this(otherExtractor.getDocument());
   }

   private void appendIfPresent(StringBuffer text, String thing, boolean value) {
      this.appendIfPresent(text, thing, Boolean.toString(value));
   }

   private void appendIfPresent(StringBuffer text, String thing, int value) {
      this.appendIfPresent(text, thing, Integer.toString(value));
   }

   private void appendIfPresent(StringBuffer text, String thing, Date value) {
      if(value != null) {
         this.appendIfPresent(text, thing, this.dateFormat.format(value));
      }
   }

   private void appendIfPresent(StringBuffer text, String thing, String value) {
      if(value != null) {
         text.append(thing);
         text.append(" = ");
         text.append(value);
         text.append("\n");
      }
   }

   public String getCorePropertiesText() {
      POIXMLDocument document = this.getDocument();
      if(document == null) {
         return "";
      } else {
         StringBuffer text = new StringBuffer();
         PackagePropertiesPart props = document.getProperties().getCoreProperties().getUnderlyingProperties();
         this.appendIfPresent(text, "Category", (String)props.getCategoryProperty().getValue());
         this.appendIfPresent(text, "Category", (String)props.getCategoryProperty().getValue());
         this.appendIfPresent(text, "ContentStatus", (String)props.getContentStatusProperty().getValue());
         this.appendIfPresent(text, "ContentType", (String)props.getContentTypeProperty().getValue());
         this.appendIfPresent(text, "Created", (Date)props.getCreatedProperty().getValue());
         this.appendIfPresent(text, "CreatedString", props.getCreatedPropertyString());
         this.appendIfPresent(text, "Creator", (String)props.getCreatorProperty().getValue());
         this.appendIfPresent(text, "Description", (String)props.getDescriptionProperty().getValue());
         this.appendIfPresent(text, "Identifier", (String)props.getIdentifierProperty().getValue());
         this.appendIfPresent(text, "Keywords", (String)props.getKeywordsProperty().getValue());
         this.appendIfPresent(text, "Language", (String)props.getLanguageProperty().getValue());
         this.appendIfPresent(text, "LastModifiedBy", (String)props.getLastModifiedByProperty().getValue());
         this.appendIfPresent(text, "LastPrinted", (Date)props.getLastPrintedProperty().getValue());
         this.appendIfPresent(text, "LastPrintedString", props.getLastPrintedPropertyString());
         this.appendIfPresent(text, "Modified", (Date)props.getModifiedProperty().getValue());
         this.appendIfPresent(text, "ModifiedString", props.getModifiedPropertyString());
         this.appendIfPresent(text, "Revision", (String)props.getRevisionProperty().getValue());
         this.appendIfPresent(text, "Subject", (String)props.getSubjectProperty().getValue());
         this.appendIfPresent(text, "Title", (String)props.getTitleProperty().getValue());
         this.appendIfPresent(text, "Version", (String)props.getVersionProperty().getValue());
         return text.toString();
      }
   }

   public String getExtendedPropertiesText() {
      POIXMLDocument document = this.getDocument();
      if(document == null) {
         return "";
      } else {
         StringBuffer text = new StringBuffer();
         CTProperties props = document.getProperties().getExtendedProperties().getUnderlyingProperties();
         this.appendIfPresent(text, "Application", props.getApplication());
         this.appendIfPresent(text, "AppVersion", props.getAppVersion());
         this.appendIfPresent(text, "Characters", props.getCharacters());
         this.appendIfPresent(text, "CharactersWithSpaces", props.getCharactersWithSpaces());
         this.appendIfPresent(text, "Company", props.getCompany());
         this.appendIfPresent(text, "HyperlinkBase", props.getHyperlinkBase());
         this.appendIfPresent(text, "HyperlinksChanged", props.getHyperlinksChanged());
         this.appendIfPresent(text, "Lines", props.getLines());
         this.appendIfPresent(text, "LinksUpToDate", props.getLinksUpToDate());
         this.appendIfPresent(text, "Manager", props.getManager());
         this.appendIfPresent(text, "Pages", props.getPages());
         this.appendIfPresent(text, "Paragraphs", props.getParagraphs());
         this.appendIfPresent(text, "PresentationFormat", props.getPresentationFormat());
         this.appendIfPresent(text, "Template", props.getTemplate());
         this.appendIfPresent(text, "TotalTime", props.getTotalTime());
         return text.toString();
      }
   }

   public String getCustomPropertiesText() {
      POIXMLDocument document = this.getDocument();
      if(document == null) {
         return "";
      } else {
         StringBuilder text = new StringBuilder();
         org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties props = document.getProperties().getCustomProperties().getUnderlyingProperties();
         CTProperty[] arr$ = props.getPropertyArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTProperty property = arr$[i$];
            String val = "(not implemented!)";
            if(property.isSetLpwstr()) {
               val = property.getLpwstr();
            } else if(property.isSetLpstr()) {
               val = property.getLpstr();
            } else if(property.isSetDate()) {
               val = property.getDate().toString();
            } else if(property.isSetFiletime()) {
               val = property.getFiletime().toString();
            } else if(property.isSetBool()) {
               val = Boolean.toString(property.getBool());
            } else if(property.isSetI1()) {
               val = Integer.toString(property.getI1());
            } else if(property.isSetI2()) {
               val = Integer.toString(property.getI2());
            } else if(property.isSetI4()) {
               val = Integer.toString(property.getI4());
            } else if(property.isSetI8()) {
               val = Long.toString(property.getI8());
            } else if(property.isSetInt()) {
               val = Integer.toString(property.getInt());
            } else if(property.isSetUi1()) {
               val = Integer.toString(property.getUi1());
            } else if(property.isSetUi2()) {
               val = Integer.toString(property.getUi2());
            } else if(property.isSetUi4()) {
               val = Long.toString(property.getUi4());
            } else if(property.isSetUi8()) {
               val = property.getUi8().toString();
            } else if(property.isSetUint()) {
               val = Long.toString(property.getUint());
            } else if(property.isSetR4()) {
               val = Float.toString(property.getR4());
            } else if(property.isSetR8()) {
               val = Double.toString(property.getR8());
            } else if(property.isSetDecimal()) {
               BigDecimal d = property.getDecimal();
               if(d == null) {
                  val = null;
               } else {
                  val = d.toPlainString();
               }
            }

            text.append(property.getName()).append(" = ").append(val).append("\n");
         }

         return text.toString();
      }
   }

   public String getText() {
      try {
         return this.getCorePropertiesText() + this.getExtendedPropertiesText() + this.getCustomPropertiesText();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public POIXMLPropertiesTextExtractor getMetadataTextExtractor() {
      throw new IllegalStateException("You already have the Metadata Text Extractor, not recursing!");
   }
}
