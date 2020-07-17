package org.apache.poi.openxml4j.opc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageProperties;
import org.apache.poi.openxml4j.util.Nullable;
import org.apache.poi.util.LocaleUtil;

public final class PackagePropertiesPart extends PackagePart implements PackageProperties {

   public static final String NAMESPACE_DC_URI = "http://purl.org/dc/elements/1.1/";
   public static final String NAMESPACE_CP_URI = "http://schemas.openxmlformats.org/package/2006/metadata/core-properties";
   public static final String NAMESPACE_DCTERMS_URI = "http://purl.org/dc/terms/";
   private static final String DEFAULT_DATEFORMAT = "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'";
   private static final String[] DATE_FORMATS = new String[]{"yyyy-MM-dd\'T\'HH:mm:ss\'Z\'", "yyyy-MM-dd\'T\'HH:mm:ss.SS\'Z\'"};
   private final String[] TZ_DATE_FORMATS = new String[]{"yyyy-MM-dd\'T\'HH:mm:ssz", "yyyy-MM-dd\'T\'HH:mm:ss.Sz", "yyyy-MM-dd\'T\'HH:mm:ss.SSz", "yyyy-MM-dd\'T\'HH:mm:ss.SSSz"};
   private final Pattern TIME_ZONE_PAT = Pattern.compile("([-+]\\d\\d):?(\\d\\d)");
   protected Nullable category = new Nullable();
   protected Nullable contentStatus = new Nullable();
   protected Nullable contentType = new Nullable();
   protected Nullable created = new Nullable();
   protected Nullable creator = new Nullable();
   protected Nullable description = new Nullable();
   protected Nullable identifier = new Nullable();
   protected Nullable keywords = new Nullable();
   protected Nullable language = new Nullable();
   protected Nullable lastModifiedBy = new Nullable();
   protected Nullable lastPrinted = new Nullable();
   protected Nullable modified = new Nullable();
   protected Nullable revision = new Nullable();
   protected Nullable subject = new Nullable();
   protected Nullable title = new Nullable();
   protected Nullable version = new Nullable();


   public PackagePropertiesPart(OPCPackage pack, PackagePartName partName) throws InvalidFormatException {
      super(pack, partName, "application/vnd.openxmlformats-package.core-properties+xml");
   }

   public Nullable getCategoryProperty() {
      return this.category;
   }

   public Nullable getContentStatusProperty() {
      return this.contentStatus;
   }

   public Nullable getContentTypeProperty() {
      return this.contentType;
   }

   public Nullable getCreatedProperty() {
      return this.created;
   }

   public String getCreatedPropertyString() {
      return this.getDateValue(this.created);
   }

   public Nullable getCreatorProperty() {
      return this.creator;
   }

   public Nullable getDescriptionProperty() {
      return this.description;
   }

   public Nullable getIdentifierProperty() {
      return this.identifier;
   }

   public Nullable getKeywordsProperty() {
      return this.keywords;
   }

   public Nullable getLanguageProperty() {
      return this.language;
   }

   public Nullable getLastModifiedByProperty() {
      return this.lastModifiedBy;
   }

   public Nullable getLastPrintedProperty() {
      return this.lastPrinted;
   }

   public String getLastPrintedPropertyString() {
      return this.getDateValue(this.lastPrinted);
   }

   public Nullable getModifiedProperty() {
      return this.modified;
   }

   public String getModifiedPropertyString() {
      return this.modified.hasValue()?this.getDateValue(this.modified):this.getDateValue(new Nullable(new Date()));
   }

   public Nullable getRevisionProperty() {
      return this.revision;
   }

   public Nullable getSubjectProperty() {
      return this.subject;
   }

   public Nullable getTitleProperty() {
      return this.title;
   }

   public Nullable getVersionProperty() {
      return this.version;
   }

   public void setCategoryProperty(String category) {
      this.category = this.setStringValue(category);
   }

   public void setContentStatusProperty(String contentStatus) {
      this.contentStatus = this.setStringValue(contentStatus);
   }

   public void setContentTypeProperty(String contentType) {
      this.contentType = this.setStringValue(contentType);
   }

   public void setCreatedProperty(String created) {
      try {
         this.created = this.setDateValue(created);
      } catch (InvalidFormatException var3) {
         throw new IllegalArgumentException("Date for created could not be parsed: " + created, var3);
      }
   }

   public void setCreatedProperty(Nullable created) {
      if(created.hasValue()) {
         this.created = created;
      }

   }

   public void setCreatorProperty(String creator) {
      this.creator = this.setStringValue(creator);
   }

   public void setDescriptionProperty(String description) {
      this.description = this.setStringValue(description);
   }

   public void setIdentifierProperty(String identifier) {
      this.identifier = this.setStringValue(identifier);
   }

   public void setKeywordsProperty(String keywords) {
      this.keywords = this.setStringValue(keywords);
   }

   public void setLanguageProperty(String language) {
      this.language = this.setStringValue(language);
   }

   public void setLastModifiedByProperty(String lastModifiedBy) {
      this.lastModifiedBy = this.setStringValue(lastModifiedBy);
   }

   public void setLastPrintedProperty(String lastPrinted) {
      try {
         this.lastPrinted = this.setDateValue(lastPrinted);
      } catch (InvalidFormatException var3) {
         throw new IllegalArgumentException("lastPrinted  : " + var3.getLocalizedMessage(), var3);
      }
   }

   public void setLastPrintedProperty(Nullable lastPrinted) {
      if(lastPrinted.hasValue()) {
         this.lastPrinted = lastPrinted;
      }

   }

   public void setModifiedProperty(String modified) {
      try {
         this.modified = this.setDateValue(modified);
      } catch (InvalidFormatException var3) {
         throw new IllegalArgumentException("modified  : " + var3.getLocalizedMessage(), var3);
      }
   }

   public void setModifiedProperty(Nullable modified) {
      if(modified.hasValue()) {
         this.modified = modified;
      }

   }

   public void setRevisionProperty(String revision) {
      this.revision = this.setStringValue(revision);
   }

   public void setSubjectProperty(String subject) {
      this.subject = this.setStringValue(subject);
   }

   public void setTitleProperty(String title) {
      this.title = this.setStringValue(title);
   }

   public void setVersionProperty(String version) {
      this.version = this.setStringValue(version);
   }

   private Nullable setStringValue(String s) {
      return s != null && !s.equals("")?new Nullable(s):new Nullable();
   }

   private Nullable setDateValue(String dateStr) throws InvalidFormatException {
      if(dateStr != null && !dateStr.equals("")) {
         Matcher m = this.TIME_ZONE_PAT.matcher(dateStr);
         String dateTzStr;
         String[] sb;
         int i;
         int arr$;
         String len$;
         SimpleDateFormat i$;
         Date fStr;
         if(m.find()) {
            dateTzStr = dateStr.substring(0, m.start()) + m.group(1) + m.group(2);
            sb = this.TZ_DATE_FORMATS;
            i = sb.length;

            for(arr$ = 0; arr$ < i; ++arr$) {
               len$ = sb[arr$];
               i$ = new SimpleDateFormat(len$, Locale.ROOT);
               i$.setTimeZone(LocaleUtil.TIMEZONE_UTC);
               fStr = i$.parse(dateTzStr, new ParsePosition(0));
               if(fStr != null) {
                  return new Nullable(fStr);
               }
            }
         }

         dateTzStr = dateStr.endsWith("Z")?dateStr:dateStr + "Z";
         sb = DATE_FORMATS;
         i = sb.length;

         for(arr$ = 0; arr$ < i; ++arr$) {
            len$ = sb[arr$];
            i$ = new SimpleDateFormat(len$, Locale.ROOT);
            i$.setTimeZone(LocaleUtil.TIMEZONE_UTC);
            fStr = i$.parse(dateTzStr, new ParsePosition(0));
            if(fStr != null) {
               return new Nullable(fStr);
            }
         }

         StringBuilder var10 = new StringBuilder();
         i = 0;
         String[] var11 = this.TZ_DATE_FORMATS;
         int var12 = var11.length;

         int var13;
         String var14;
         for(var13 = 0; var13 < var12; ++var13) {
            var14 = var11[var13];
            if(i++ > 0) {
               var10.append(", ");
            }

            var10.append(var14);
         }

         var11 = DATE_FORMATS;
         var12 = var11.length;

         for(var13 = 0; var13 < var12; ++var13) {
            var14 = var11[var13];
            var10.append(", ").append(var14);
         }

         throw new InvalidFormatException("Date " + dateStr + " not well formatted, " + "expected format in: " + var10.toString());
      } else {
         return new Nullable();
      }
   }

   private String getDateValue(Nullable d) {
      if(d == null) {
         return "";
      } else {
         Date date = (Date)d.getValue();
         if(date == null) {
            return "";
         } else {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss\'Z\'", Locale.ROOT);
            df.setTimeZone(LocaleUtil.TIMEZONE_UTC);
            return df.format(date);
         }
      }
   }

   protected InputStream getInputStreamImpl() {
      throw new InvalidOperationException("Operation not authorized. This part may only be manipulated using the getters and setters on PackagePropertiesPart");
   }

   protected OutputStream getOutputStreamImpl() {
      throw new InvalidOperationException("Can\'t use output stream to set properties !");
   }

   public boolean save(OutputStream zos) {
      throw new InvalidOperationException("Operation not authorized. This part may only be manipulated using the getters and setters on PackagePropertiesPart");
   }

   public boolean load(InputStream ios) {
      throw new InvalidOperationException("Operation not authorized. This part may only be manipulated using the getters and setters on PackagePropertiesPart");
   }

   public void close() {}

   public void flush() {}

}
