package org.apache.poi.xslf.extractor;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xslf.usermodel.DrawingParagraph;
import org.apache.poi.xslf.usermodel.DrawingTextBody;
import org.apache.poi.xslf.usermodel.DrawingTextPlaceholder;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFCommentAuthors;
import org.apache.poi.xslf.usermodel.XSLFComments;
import org.apache.poi.xslf.usermodel.XSLFCommonSlideData;
import org.apache.poi.xslf.usermodel.XSLFNotes;
import org.apache.poi.xslf.usermodel.XSLFRelation;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFSlideShow;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTComment;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor;

public class XSLFPowerPointExtractor extends POIXMLTextExtractor {

   public static final XSLFRelation[] SUPPORTED_TYPES = new XSLFRelation[]{XSLFRelation.MAIN, XSLFRelation.MACRO, XSLFRelation.MACRO_TEMPLATE, XSLFRelation.PRESENTATIONML, XSLFRelation.PRESENTATIONML_TEMPLATE, XSLFRelation.PRESENTATION_MACRO};
   private XMLSlideShow slideshow;
   private boolean slidesByDefault;
   private boolean notesByDefault;
   private boolean masterByDefault;


   public XSLFPowerPointExtractor(XMLSlideShow slideshow) {
      super(slideshow);
      this.slidesByDefault = true;
      this.notesByDefault = false;
      this.masterByDefault = false;
      this.slideshow = slideshow;
   }

   public XSLFPowerPointExtractor(XSLFSlideShow slideshow) throws XmlException, IOException {
      this(new XMLSlideShow(slideshow.getPackage()));
   }

   public XSLFPowerPointExtractor(OPCPackage container) throws XmlException, OpenXML4JException, IOException {
      this(new XSLFSlideShow(container));
   }

   public static void main(String[] args) throws Exception {
      if(args.length < 1) {
         System.err.println("Use:");
         System.err.println("  XSLFPowerPointExtractor <filename.pptx>");
         System.exit(1);
      }

      XSLFPowerPointExtractor extractor = new XSLFPowerPointExtractor(new XSLFSlideShow(args[0]));
      System.out.println(extractor.getText());
      extractor.close();
   }

   public void setSlidesByDefault(boolean slidesByDefault) {
      this.slidesByDefault = slidesByDefault;
   }

   public void setNotesByDefault(boolean notesByDefault) {
      this.notesByDefault = notesByDefault;
   }

   public void setMasterByDefault(boolean masterByDefault) {
      this.masterByDefault = masterByDefault;
   }

   public String getText() {
      return this.getText(this.slidesByDefault, this.notesByDefault);
   }

   public String getText(boolean slideText, boolean notesText) {
      return this.getText(slideText, notesText, this.masterByDefault);
   }

   public String getText(boolean slideText, boolean notesText, boolean masterText) {
      StringBuffer text = new StringBuffer();
      List slides = this.slideshow.getSlides();
      XSLFCommentAuthors commentAuthors = this.slideshow.getCommentAuthors();
      Iterator i$ = slides.iterator();

      while(i$.hasNext()) {
         XSLFSlide slide = (XSLFSlide)i$.next();

         try {
            XSLFNotes e = slide.getNotes();
            XSLFComments comments = slide.getComments();
            XSLFSlideLayout layout = slide.getSlideLayout();
            XSLFSlideMaster master = layout.getSlideMaster();
            if(slideText) {
               this.extractText(slide.getCommonSlideData(), false, text);
               if(masterText) {
                  if(layout != null) {
                     this.extractText(layout.getCommonSlideData(), true, text);
                  }

                  if(master != null) {
                     this.extractText(master.getCommonSlideData(), true, text);
                  }
               }

               if(comments != null) {
                  CTComment[] arr$ = comments.getCTCommentsList().getCmArray();
                  int len$ = arr$.length;

                  for(int i$1 = 0; i$1 < len$; ++i$1) {
                     CTComment comment = arr$[i$1];
                     if(commentAuthors != null) {
                        CTCommentAuthor author = commentAuthors.getAuthorById(comment.getAuthorId());
                        if(author != null) {
                           text.append(author.getName() + ": ");
                        }
                     }

                     text.append(comment.getText());
                     text.append("\n");
                  }
               }
            }

            if(notesText && e != null) {
               this.extractText(e.getCommonSlideData(), false, text);
            }
         } catch (Exception var18) {
            throw new RuntimeException(var18);
         }
      }

      return text.toString();
   }

   private void extractText(XSLFCommonSlideData data, boolean skipPlaceholders, StringBuffer text) {
      Iterator i$ = data.getDrawingText().iterator();

      while(i$.hasNext()) {
         DrawingTextBody textBody = (DrawingTextBody)i$.next();
         if(skipPlaceholders && textBody instanceof DrawingTextPlaceholder) {
            DrawingTextPlaceholder arr$ = (DrawingTextPlaceholder)textBody;
            if(!arr$.isPlaceholderCustom()) {
               continue;
            }
         }

         DrawingParagraph[] var10 = textBody.getParagraphs();
         int len$ = var10.length;

         for(int i$1 = 0; i$1 < len$; ++i$1) {
            DrawingParagraph p = var10[i$1];
            text.append(p.getText());
            text.append("\n");
         }
      }

   }

}
