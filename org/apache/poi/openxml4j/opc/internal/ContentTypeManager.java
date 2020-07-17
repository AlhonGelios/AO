package org.apache.poi.openxml4j.opc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JRuntimeException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.util.DocumentHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public abstract class ContentTypeManager {

   public static final String CONTENT_TYPES_PART_NAME = "[Content_Types].xml";
   public static final String TYPES_NAMESPACE_URI = "http://schemas.openxmlformats.org/package/2006/content-types";
   private static final String TYPES_TAG_NAME = "Types";
   private static final String DEFAULT_TAG_NAME = "Default";
   private static final String EXTENSION_ATTRIBUTE_NAME = "Extension";
   private static final String CONTENT_TYPE_ATTRIBUTE_NAME = "ContentType";
   private static final String OVERRIDE_TAG_NAME = "Override";
   private static final String PART_NAME_ATTRIBUTE_NAME = "PartName";
   protected OPCPackage container;
   private TreeMap defaultContentType;
   private TreeMap overrideContentType;


   public ContentTypeManager(InputStream in, OPCPackage pkg) throws InvalidFormatException {
      this.container = pkg;
      this.defaultContentType = new TreeMap();
      if(in != null) {
         try {
            this.parseContentTypesFile(in);
         } catch (InvalidFormatException var5) {
            InvalidFormatException ex = new InvalidFormatException("Can\'t read content types part !");
            ex.initCause(var5);
            throw ex;
         }
      }

   }

   public void addContentType(PackagePartName partName, String contentType) {
      boolean defaultCTExists = this.defaultContentType.containsValue(contentType);
      String extension = partName.getExtension().toLowerCase(Locale.ROOT);
      if(extension.length() != 0 && (!this.defaultContentType.containsKey(extension) || defaultCTExists)) {
         if(!defaultCTExists) {
            this.addDefaultContentType(extension, contentType);
         }
      } else {
         this.addOverrideContentType(partName, contentType);
      }

   }

   private void addOverrideContentType(PackagePartName partName, String contentType) {
      if(this.overrideContentType == null) {
         this.overrideContentType = new TreeMap();
      }

      this.overrideContentType.put(partName, contentType);
   }

   private void addDefaultContentType(String extension, String contentType) {
      this.defaultContentType.put(extension.toLowerCase(Locale.ROOT), contentType);
   }

   public void removeContentType(PackagePartName partName) throws InvalidOperationException {
      if(partName == null) {
         throw new IllegalArgumentException("partName");
      } else if(this.overrideContentType != null && this.overrideContentType.get(partName) != null) {
         this.overrideContentType.remove(partName);
      } else {
         String extensionToDelete = partName.getExtension();
         boolean deleteDefaultContentTypeFlag = true;
         Iterator e;
         PackagePart part;
         if(this.container != null) {
            try {
               e = this.container.getParts().iterator();

               while(e.hasNext()) {
                  part = (PackagePart)e.next();
                  if(!part.getPartName().equals(partName) && part.getPartName().getExtension().equalsIgnoreCase(extensionToDelete)) {
                     deleteDefaultContentTypeFlag = false;
                     break;
                  }
               }
            } catch (InvalidFormatException var7) {
               throw new InvalidOperationException(var7.getMessage());
            }
         }

         if(deleteDefaultContentTypeFlag) {
            this.defaultContentType.remove(extensionToDelete);
         }

         if(this.container != null) {
            try {
               e = this.container.getParts().iterator();

               while(e.hasNext()) {
                  part = (PackagePart)e.next();
                  if(!part.getPartName().equals(partName) && this.getContentType(part.getPartName()) == null) {
                     throw new InvalidOperationException("Rule M2.4 is not respected: Nor a default element or override element is associated with the part: " + part.getPartName().getName());
                  }
               }
            } catch (InvalidFormatException var6) {
               throw new InvalidOperationException(var6.getMessage());
            }
         }

      }
   }

   public boolean isContentTypeRegister(String contentType) {
      if(contentType == null) {
         throw new IllegalArgumentException("contentType");
      } else {
         return this.defaultContentType.values().contains(contentType) || this.overrideContentType != null && this.overrideContentType.values().contains(contentType);
      }
   }

   public String getContentType(PackagePartName partName) {
      if(partName == null) {
         throw new IllegalArgumentException("partName");
      } else if(this.overrideContentType != null && this.overrideContentType.containsKey(partName)) {
         return (String)this.overrideContentType.get(partName);
      } else {
         String extension = partName.getExtension().toLowerCase(Locale.ROOT);
         if(this.defaultContentType.containsKey(extension)) {
            return (String)this.defaultContentType.get(extension);
         } else if(this.container != null && this.container.getPart(partName) != null) {
            throw new OpenXML4JRuntimeException("Rule M2.4 exception : this error should NEVER happen! If you can provide the triggering file, then please raise a bug at https://bz.apache.org/bugzilla/enter_bug.cgi?product=POI and attach the file that triggers it, thanks!");
         } else {
            return null;
         }
      }
   }

   public void clearAll() {
      this.defaultContentType.clear();
      if(this.overrideContentType != null) {
         this.overrideContentType.clear();
      }

   }

   public void clearOverrideContentTypes() {
      if(this.overrideContentType != null) {
         this.overrideContentType.clear();
      }

   }

   private void parseContentTypesFile(InputStream in) throws InvalidFormatException {
      try {
         Document e = DocumentHelper.readDocument(in);
         NodeList defaultTypes = e.getDocumentElement().getElementsByTagNameNS("http://schemas.openxmlformats.org/package/2006/content-types", "Default");
         int defaultTypeCount = defaultTypes.getLength();

         for(int overrideTypes = 0; overrideTypes < defaultTypeCount; ++overrideTypes) {
            Element overrideTypeCount = (Element)defaultTypes.item(overrideTypes);
            String i = overrideTypeCount.getAttribute("Extension");
            String element = overrideTypeCount.getAttribute("ContentType");
            this.addDefaultContentType(i, element);
         }

         NodeList var15 = e.getDocumentElement().getElementsByTagNameNS("http://schemas.openxmlformats.org/package/2006/content-types", "Override");
         int var16 = var15.getLength();

         for(int var17 = 0; var17 < var16; ++var17) {
            Element var18 = (Element)var15.item(var17);
            URI uri = new URI(var18.getAttribute("PartName"));
            PackagePartName partName = PackagingURIHelper.createPartName(uri);
            String contentType = var18.getAttribute("ContentType");
            this.addOverrideContentType(partName, contentType);
         }

      } catch (URISyntaxException var12) {
         throw new InvalidFormatException(var12.getMessage());
      } catch (SAXException var13) {
         throw new InvalidFormatException(var13.getMessage());
      } catch (IOException var14) {
         throw new InvalidFormatException(var14.getMessage());
      }
   }

   public boolean save(OutputStream outStream) {
      Document xmlOutDoc = DocumentHelper.createDocument();
      Element typesElem = xmlOutDoc.createElementNS("http://schemas.openxmlformats.org/package/2006/content-types", "Types");
      xmlOutDoc.appendChild(typesElem);
      Iterator i$ = this.defaultContentType.entrySet().iterator();

      Entry entry;
      while(i$.hasNext()) {
         entry = (Entry)i$.next();
         this.appendDefaultType(typesElem, entry);
      }

      if(this.overrideContentType != null) {
         i$ = this.overrideContentType.entrySet().iterator();

         while(i$.hasNext()) {
            entry = (Entry)i$.next();
            this.appendSpecificTypes(typesElem, entry);
         }
      }

      xmlOutDoc.normalize();
      return this.saveImpl(xmlOutDoc, outStream);
   }

   private void appendSpecificTypes(Element root, Entry entry) {
      Element specificType = root.getOwnerDocument().createElementNS("http://schemas.openxmlformats.org/package/2006/content-types", "Override");
      specificType.setAttribute("PartName", ((PackagePartName)entry.getKey()).getName());
      specificType.setAttribute("ContentType", (String)entry.getValue());
      root.appendChild(specificType);
   }

   private void appendDefaultType(Element root, Entry entry) {
      Element defaultType = root.getOwnerDocument().createElementNS("http://schemas.openxmlformats.org/package/2006/content-types", "Default");
      defaultType.setAttribute("Extension", (String)entry.getKey());
      defaultType.setAttribute("ContentType", (String)entry.getValue());
      root.appendChild(defaultType);
   }

   public abstract boolean saveImpl(Document var1, OutputStream var2);
}
