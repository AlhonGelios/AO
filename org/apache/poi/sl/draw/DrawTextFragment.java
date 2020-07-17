package org.apache.poi.sl.draw;

import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import org.apache.poi.sl.draw.Drawable;

public class DrawTextFragment implements Drawable {

   final TextLayout layout;
   final AttributedString str;
   double x;
   double y;


   public DrawTextFragment(TextLayout layout, AttributedString str) {
      this.layout = layout;
      this.str = str;
   }

   public void setPosition(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public void draw(Graphics2D graphics) {
      if(this.str != null) {
         double yBaseline = this.y + (double)this.layout.getAscent();
         Integer textMode = (Integer)graphics.getRenderingHint(Drawable.TEXT_RENDERING_MODE);
         if(textMode != null && textMode.intValue() == 2) {
            this.layout.draw(graphics, (float)this.x, (float)yBaseline);
         } else {
            graphics.drawString(this.str.getIterator(), (float)this.x, (float)yBaseline);
         }

      }
   }

   public void applyTransform(Graphics2D graphics) {}

   public void drawContent(Graphics2D graphics) {}

   public TextLayout getLayout() {
      return this.layout;
   }

   public AttributedString getAttributedString() {
      return this.str;
   }

   public float getHeight() {
      double h = Math.ceil((double)this.layout.getAscent()) + Math.ceil((double)this.layout.getDescent()) + (double)this.layout.getLeading();
      return (float)h;
   }

   public float getWidth() {
      return this.layout.getAdvance();
   }

   public String getString() {
      if(this.str == null) {
         return "";
      } else {
         AttributedCharacterIterator it = this.str.getIterator();
         StringBuilder buf = new StringBuilder();

         for(char c = it.first(); c != '\uffff'; c = it.next()) {
            buf.append(c);
         }

         return buf.toString();
      }
   }

   public String toString() {
      return "[" + this.getClass().getSimpleName() + "] " + this.getString();
   }
}
