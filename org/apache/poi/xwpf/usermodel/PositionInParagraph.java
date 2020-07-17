package org.apache.poi.xwpf.usermodel;


public class PositionInParagraph {

   private int posRun = 0;
   private int posText = 0;
   private int posChar = 0;


   public PositionInParagraph() {}

   public PositionInParagraph(int posRun, int posText, int posChar) {
      this.posRun = posRun;
      this.posChar = posChar;
      this.posText = posText;
   }

   public int getRun() {
      return this.posRun;
   }

   public void setRun(int beginRun) {
      this.posRun = beginRun;
   }

   public int getText() {
      return this.posText;
   }

   public void setText(int beginText) {
      this.posText = beginText;
   }

   public int getChar() {
      return this.posChar;
   }

   public void setChar(int beginChar) {
      this.posChar = beginChar;
   }
}
