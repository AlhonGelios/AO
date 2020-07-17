package org.apache.poi.hssf.usermodel;

import org.apache.poi.ddf.EscherChildAnchorRecord;
import org.apache.poi.ddf.EscherClientAnchorRecord;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.hssf.usermodel.HSSFChildAnchor;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;

public abstract class HSSFAnchor {

   protected boolean _isHorizontallyFlipped = false;
   protected boolean _isVerticallyFlipped = false;


   public HSSFAnchor() {
      this.createEscherAnchor();
   }

   public HSSFAnchor(int dx1, int dy1, int dx2, int dy2) {
      this.createEscherAnchor();
      this.setDx1(dx1);
      this.setDy1(dy1);
      this.setDx2(dx2);
      this.setDy2(dy2);
   }

   public static HSSFAnchor createAnchorFromEscher(EscherContainerRecord container) {
      return (HSSFAnchor)(null != container.getChildById((short)-4081)?new HSSFChildAnchor((EscherChildAnchorRecord)container.getChildById((short)-4081)):(null != container.getChildById((short)-4080)?new HSSFClientAnchor((EscherClientAnchorRecord)container.getChildById((short)-4080)):null));
   }

   public abstract int getDx1();

   public abstract void setDx1(int var1);

   public abstract int getDy1();

   public abstract void setDy1(int var1);

   public abstract int getDy2();

   public abstract void setDy2(int var1);

   public abstract int getDx2();

   public abstract void setDx2(int var1);

   public abstract boolean isHorizontallyFlipped();

   public abstract boolean isVerticallyFlipped();

   protected abstract EscherRecord getEscherAnchor();

   protected abstract void createEscherAnchor();
}
