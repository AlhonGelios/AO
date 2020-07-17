package org.apache.poi.xwpf.extractor;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.model.XWPFCommentsDecorator;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.model.XWPFParagraphDecorator;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.ICell;
import org.apache.poi.xwpf.usermodel.IRunElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHyperlink;
import org.apache.poi.xwpf.usermodel.XWPFHyperlinkRun;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.apache.poi.xwpf.usermodel.XWPFSDT;
import org.apache.poi.xwpf.usermodel.XWPFSDTCell;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;

public class XWPFWordExtractor extends POIXMLTextExtractor {

   public static final XWPFRelation[] SUPPORTED_TYPES = new XWPFRelation[]{XWPFRelation.DOCUMENT, XWPFRelation.TEMPLATE, XWPFRelation.MACRO_DOCUMENT, XWPFRelation.MACRO_TEMPLATE_DOCUMENT};
   private XWPFDocument document;
   private boolean fetchHyperlinks;


   public XWPFWordExtractor(OPCPackage container) throws XmlException, OpenXML4JException, IOException {
      this(new XWPFDocument(container));
   }

   public XWPFWordExtractor(XWPFDocument document) {
      super(document);
      this.fetchHyperlinks = false;
      this.document = document;
   }

   public static void main(String[] args) throws Exception {
      if(args.length < 1) {
         System.err.println("Use:");
         System.err.println("  XWPFWordExtractor <filename.docx>");
         System.exit(1);
      }

      XWPFWordExtractor extractor = new XWPFWordExtractor(POIXMLDocument.openPackage(args[0]));
      System.out.println(extractor.getText());
      extractor.close();
   }

   public void setFetchHyperlinks(boolean fetch) {
      this.fetchHyperlinks = fetch;
   }

   public String getText() {
      StringBuffer text = new StringBuffer();
      XWPFHeaderFooterPolicy hfPolicy = this.document.getHeaderFooterPolicy();
      this.extractHeaders(text, hfPolicy);
      Iterator i$ = this.document.getBodyElements().iterator();

      while(i$.hasNext()) {
         IBodyElement e = (IBodyElement)i$.next();
         this.appendBodyElementText(text, e);
         text.append('\n');
      }

      this.extractFooters(text, hfPolicy);
      return text.toString();
   }

   public void appendBodyElementText(StringBuffer text, IBodyElement e) {
      if(e instanceof XWPFParagraph) {
         this.appendParagraphText(text, (XWPFParagraph)e);
      } else if(e instanceof XWPFTable) {
         this.appendTableText(text, (XWPFTable)e);
      } else if(e instanceof XWPFSDT) {
         text.append(((XWPFSDT)e).getContent().getText());
      }

   }

   public void appendParagraphText(StringBuffer text, XWPFParagraph paragraph) {
      CTSectPr ctSectPr = null;
      if(paragraph.getCTP().getPPr() != null) {
         ctSectPr = paragraph.getCTP().getPPr().getSectPr();
      }

      XWPFHeaderFooterPolicy headerFooterPolicy = null;
      if(ctSectPr != null) {
         headerFooterPolicy = new XWPFHeaderFooterPolicy(this.document, ctSectPr);
         this.extractHeaders(text, headerFooterPolicy);
      }

      Iterator decorator = paragraph.getRuns().iterator();

      while(decorator.hasNext()) {
         IRunElement commentText = (IRunElement)decorator.next();
         text.append(commentText.toString());
         if(commentText instanceof XWPFHyperlinkRun && this.fetchHyperlinks) {
            XWPFHyperlink footnameText = ((XWPFHyperlinkRun)commentText).getHyperlink(this.document);
            if(footnameText != null) {
               text.append(" <").append(footnameText.getURL()).append(">");
            }
         }
      }

      XWPFCommentsDecorator decorator1 = new XWPFCommentsDecorator(paragraph, (XWPFParagraphDecorator)null);
      String commentText1 = decorator1.getCommentText();
      if(commentText1.length() > 0) {
         text.append(commentText1).append('\n');
      }

      String footnameText1 = paragraph.getFootnoteText();
      if(footnameText1 != null && footnameText1.length() > 0) {
         text.append(footnameText1).append('\n');
      }

      if(ctSectPr != null) {
         this.extractFooters(text, headerFooterPolicy);
      }

   }

   private void appendTableText(StringBuffer text, XWPFTable table) {
      Iterator i$ = table.getRows().iterator();

      while(i$.hasNext()) {
         XWPFTableRow row = (XWPFTableRow)i$.next();
         List cells = row.getTableICells();

         for(int i = 0; i < cells.size(); ++i) {
            ICell cell = (ICell)cells.get(i);
            if(cell instanceof XWPFTableCell) {
               text.append(((XWPFTableCell)cell).getTextRecursively());
            } else if(cell instanceof XWPFSDTCell) {
               text.append(((XWPFSDTCell)cell).getContent().getText());
            }

            if(i < cells.size() - 1) {
               text.append("\t");
            }
         }

         text.append('\n');
      }

   }

   private void extractFooters(StringBuffer text, XWPFHeaderFooterPolicy hfPolicy) {
      if(hfPolicy != null) {
         if(hfPolicy.getFirstPageFooter() != null) {
            text.append(hfPolicy.getFirstPageFooter().getText());
         }

         if(hfPolicy.getEvenPageFooter() != null) {
            text.append(hfPolicy.getEvenPageFooter().getText());
         }

         if(hfPolicy.getDefaultFooter() != null) {
            text.append(hfPolicy.getDefaultFooter().getText());
         }

      }
   }

   private void extractHeaders(StringBuffer text, XWPFHeaderFooterPolicy hfPolicy) {
      if(hfPolicy != null) {
         if(hfPolicy.getFirstPageHeader() != null) {
            text.append(hfPolicy.getFirstPageHeader().getText());
         }

         if(hfPolicy.getEvenPageHeader() != null) {
            text.append(hfPolicy.getEvenPageHeader().getText());
         }

         if(hfPolicy.getDefaultHeader() != null) {
            text.append(hfPolicy.getDefaultHeader().getText());
         }

      }
   }

}
