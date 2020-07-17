package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFFootnotes;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;
import org.apache.poi.xwpf.usermodel.XWPFSettings;
import org.apache.poi.xwpf.usermodel.XWPFStyles;

public final class XWPFRelation extends POIXMLRelation {

   private static final Map _table = new HashMap();
   public static final XWPFRelation DOCUMENT = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument", "/word/document.xml", (Class)null);
   public static final XWPFRelation TEMPLATE = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument", "/word/document.xml", (Class)null);
   public static final XWPFRelation MACRO_DOCUMENT = new XWPFRelation("application/vnd.ms-word.document.macroEnabled.main+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument", "/word/document.xml", (Class)null);
   public static final XWPFRelation MACRO_TEMPLATE_DOCUMENT = new XWPFRelation("application/vnd.ms-word.template.macroEnabledTemplate.main+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument", "/word/document.xml", (Class)null);
   public static final XWPFRelation GLOSSARY_DOCUMENT = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.document.glossary+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/glossaryDocument", "/word/glossary/document.xml", (Class)null);
   public static final XWPFRelation NUMBERING = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.numbering+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/numbering", "/word/numbering.xml", XWPFNumbering.class);
   public static final XWPFRelation FONT_TABLE = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.fontTable+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/fontTable", "/word/fontTable.xml", (Class)null);
   public static final XWPFRelation SETTINGS = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.settings+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/settings", "/word/settings.xml", XWPFSettings.class);
   public static final XWPFRelation STYLES = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.styles+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles", "/word/styles.xml", XWPFStyles.class);
   public static final XWPFRelation WEB_SETTINGS = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.webSettings+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/webSettings", "/word/webSettings.xml", (Class)null);
   public static final XWPFRelation HEADER = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.header+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/header", "/word/header#.xml", XWPFHeader.class);
   public static final XWPFRelation FOOTER = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.footer+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/footer", "/word/footer#.xml", XWPFFooter.class);
   public static final XWPFRelation THEME = new XWPFRelation("application/vnd.openxmlformats-officedocument.theme+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme", "/word/theme/theme#.xml", (Class)null);
   public static final XWPFRelation HYPERLINK = new XWPFRelation((String)null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", (String)null, (Class)null);
   public static final XWPFRelation COMMENT = new XWPFRelation((String)null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments", (String)null, (Class)null);
   public static final XWPFRelation FOOTNOTE = new XWPFRelation("application/vnd.openxmlformats-officedocument.wordprocessingml.footnotes+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/footnotes", "/word/footnotes.xml", XWPFFootnotes.class);
   public static final XWPFRelation ENDNOTE = new XWPFRelation((String)null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/endnotes", (String)null, (Class)null);
   public static final XWPFRelation IMAGE_EMF = new XWPFRelation("image/x-emf", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.emf", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_WMF = new XWPFRelation("image/x-wmf", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.wmf", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_PICT = new XWPFRelation("image/pict", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.pict", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_JPEG = new XWPFRelation("image/jpeg", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.jpeg", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_PNG = new XWPFRelation("image/png", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.png", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_DIB = new XWPFRelation("image/dib", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.dib", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_GIF = new XWPFRelation("image/gif", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.gif", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_TIFF = new XWPFRelation("image/tiff", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.tiff", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_EPS = new XWPFRelation("image/x-eps", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.eps", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_BMP = new XWPFRelation("image/x-ms-bmp", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.bmp", XWPFPictureData.class);
   public static final XWPFRelation IMAGE_WPG = new XWPFRelation("image/x-wpg", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/word/media/image#.wpg", XWPFPictureData.class);
   public static final XWPFRelation IMAGES = new XWPFRelation((String)null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", (String)null, XWPFPictureData.class);


   private XWPFRelation(String type, String rel, String defaultName, Class cls) {
      super(type, rel, defaultName, cls);
      _table.put(rel, this);
   }

   public static XWPFRelation getInstance(String rel) {
      return (XWPFRelation)_table.get(rel);
   }

}
