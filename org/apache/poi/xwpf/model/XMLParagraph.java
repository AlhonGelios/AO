package org.apache.poi.xwpf.model;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;

public class XMLParagraph {

   protected CTP paragraph;


   public XMLParagraph(CTP paragraph) {
      this.paragraph = paragraph;
   }

   public CTP getCTP() {
      return this.paragraph;
   }
}
