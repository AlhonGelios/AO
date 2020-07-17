package org.apache.poi.xwpf.model;

import org.apache.poi.xwpf.model.XWPFParagraphDecorator;
import org.apache.poi.xwpf.usermodel.XWPFComment;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange;

public class XWPFCommentsDecorator extends XWPFParagraphDecorator {

   private StringBuffer commentText;


   public XWPFCommentsDecorator(XWPFParagraphDecorator nextDecorator) {
      this(nextDecorator.paragraph, nextDecorator);
   }

   public XWPFCommentsDecorator(XWPFParagraph paragraph, XWPFParagraphDecorator nextDecorator) {
      super(paragraph, nextDecorator);
      this.commentText = new StringBuffer();
      CTMarkupRange[] arr$ = paragraph.getCTP().getCommentRangeStartArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTMarkupRange anchor = arr$[i$];
         XWPFComment comment;
         if((comment = paragraph.getDocument().getCommentByID(anchor.getId().toString())) != null) {
            this.commentText.append("\tComment by " + comment.getAuthor() + ": " + comment.getText());
         }
      }

   }

   public String getCommentText() {
      return this.commentText.toString();
   }

   public String getText() {
      return super.getText() + this.commentText;
   }
}
