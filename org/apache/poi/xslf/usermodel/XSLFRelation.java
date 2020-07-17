package org.apache.poi.xslf.usermodel;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.xslf.usermodel.XSLFChart;
import org.apache.poi.xslf.usermodel.XSLFCommentAuthors;
import org.apache.poi.xslf.usermodel.XSLFComments;
import org.apache.poi.xslf.usermodel.XSLFNotes;
import org.apache.poi.xslf.usermodel.XSLFNotesMaster;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTableStyles;
import org.apache.poi.xslf.usermodel.XSLFTheme;

public class XSLFRelation extends POIXMLRelation {

   private static final Map _table = new HashMap();
   public static final XSLFRelation MAIN = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.presentation.main+xml", (String)null, (String)null, (Class)null);
   public static final XSLFRelation MACRO = new XSLFRelation("application/vnd.ms-powerpoint.slideshow.macroEnabled.main+xml", (String)null, (String)null, (Class)null);
   public static final XSLFRelation MACRO_TEMPLATE = new XSLFRelation("application/vnd.ms-powerpoint.template.macroEnabled.main+xml", (String)null, (String)null, (Class)null);
   public static final XSLFRelation PRESENTATIONML = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.slideshow.main+xml", (String)null, (String)null, (Class)null);
   public static final XSLFRelation PRESENTATIONML_TEMPLATE = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.template.main+xml", (String)null, (String)null, (Class)null);
   public static final XSLFRelation PRESENTATION_MACRO = new XSLFRelation("application/vnd.ms-powerpoint.presentation.macroEnabled.main+xml", (String)null, (String)null, (Class)null);
   public static final XSLFRelation THEME_MANAGER = new XSLFRelation("application/vnd.openxmlformats-officedocument.themeManager+xml", (String)null, (String)null, (Class)null);
   public static final XSLFRelation NOTES = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.notesSlide+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesSlide", "/ppt/notesSlides/notesSlide#.xml", XSLFNotes.class);
   public static final XSLFRelation SLIDE = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.slide+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", "/ppt/slides/slide#.xml", XSLFSlide.class);
   public static final XSLFRelation SLIDE_LAYOUT = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideLayout", "/ppt/slideLayouts/slideLayout#.xml", XSLFSlideLayout.class);
   public static final XSLFRelation SLIDE_MASTER = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideMaster", "/ppt/slideMasters/slideMaster#.xml", XSLFSlideMaster.class);
   public static final XSLFRelation NOTES_MASTER = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.notesMaster+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesMaster", "/ppt/notesMasters/notesMaster#.xml", XSLFNotesMaster.class);
   public static final XSLFRelation COMMENTS = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.comments+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments", "/ppt/comments/comment#.xml", XSLFComments.class);
   public static final XSLFRelation COMMENT_AUTHORS = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.commentAuthors+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/commentAuthors", "/ppt/commentAuthors.xml", XSLFCommentAuthors.class);
   public static final XSLFRelation HYPERLINK = new XSLFRelation((String)null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", (String)null, (Class)null);
   public static final XSLFRelation THEME = new XSLFRelation("application/vnd.openxmlformats-officedocument.theme+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme", "/ppt/theme/theme#.xml", XSLFTheme.class);
   public static final XSLFRelation VML_DRAWING = new XSLFRelation("application/vnd.openxmlformats-officedocument.vmlDrawing", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/vmlDrawing", "/ppt/drawings/vmlDrawing#.vml", (Class)null);
   public static final XSLFRelation CHART = new XSLFRelation("application/vnd.openxmlformats-officedocument.drawingml.chart+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart", "/ppt/charts/chart#.xml", XSLFChart.class);
   public static final XSLFRelation IMAGE_EMF = new XSLFRelation(PictureData.PictureType.EMF.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.emf", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_WMF = new XSLFRelation(PictureData.PictureType.WMF.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.wmf", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_PICT = new XSLFRelation(PictureData.PictureType.PICT.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.pict", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_JPEG = new XSLFRelation(PictureData.PictureType.JPEG.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.jpeg", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_PNG = new XSLFRelation(PictureData.PictureType.PNG.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.png", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_DIB = new XSLFRelation(PictureData.PictureType.DIB.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.dib", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_GIF = new XSLFRelation(PictureData.PictureType.GIF.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.gif", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_TIFF = new XSLFRelation(PictureData.PictureType.TIFF.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.tiff", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_EPS = new XSLFRelation(PictureData.PictureType.EPS.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.eps", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_BMP = new XSLFRelation(PictureData.PictureType.BMP.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.bmp", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_WPG = new XSLFRelation(PictureData.PictureType.WPG.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.wpg", XSLFPictureData.class);
   public static final XSLFRelation IMAGE_WDP = new XSLFRelation(PictureData.PictureType.WDP.contentType, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "/ppt/media/image#.wdp", XSLFPictureData.class);
   public static final XSLFRelation IMAGES = new XSLFRelation((String)null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", (String)null, XSLFPictureData.class);
   public static final XSLFRelation TABLE_STYLES = new XSLFRelation("application/vnd.openxmlformats-officedocument.presentationml.tableStyles+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableStyles", "/ppt/tableStyles.xml", XSLFTableStyles.class);


   private XSLFRelation(String type, String rel, String defaultName, Class cls) {
      super(type, rel, defaultName, cls);
      _table.put(rel, this);
   }

   public static XSLFRelation getInstance(String rel) {
      return (XSLFRelation)_table.get(rel);
   }

}
