package org.apache.poi.xwpf.model;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public abstract class XWPFParagraphDecorator {

   protected XWPFParagraph paragraph;
   protected XWPFParagraphDecorator nextDecorator;


   public XWPFParagraphDecorator(XWPFParagraph paragraph) {
      this(paragraph, (XWPFParagraphDecorator)null);
   }

   public XWPFParagraphDecorator(XWPFParagraph paragraph, XWPFParagraphDecorator nextDecorator) {
      this.paragraph = paragraph;
      this.nextDecorator = nextDecorator;
   }

   public String getText() {
      return this.nextDecorator != null?this.nextDecorator.getText():this.paragraph.getText();
   }
}
