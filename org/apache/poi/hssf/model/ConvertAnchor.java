package org.apache.poi.hssf.model;

import org.apache.poi.ddf.EscherChildAnchorRecord;
import org.apache.poi.ddf.EscherClientAnchorRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.usermodel.HSSFChildAnchor;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;

public class ConvertAnchor {

   public static EscherRecord createAnchor(HSSFAnchor userAnchor) {
      if(userAnchor instanceof HSSFClientAnchor) {
         HSSFClientAnchor a1 = (HSSFClientAnchor)userAnchor;
         EscherClientAnchorRecord anchor1 = new EscherClientAnchorRecord();
         anchor1.setRecordId((short)-4080);
         anchor1.setOptions((short)0);
         anchor1.setFlag(a1.getAnchorType().value);
         anchor1.setCol1((short)Math.min(a1.getCol1(), a1.getCol2()));
         anchor1.setDx1((short)a1.getDx1());
         anchor1.setRow1((short)Math.min(a1.getRow1(), a1.getRow2()));
         anchor1.setDy1((short)a1.getDy1());
         anchor1.setCol2((short)Math.max(a1.getCol1(), a1.getCol2()));
         anchor1.setDx2((short)a1.getDx2());
         anchor1.setRow2((short)Math.max(a1.getRow1(), a1.getRow2()));
         anchor1.setDy2((short)a1.getDy2());
         return anchor1;
      } else {
         HSSFChildAnchor a = (HSSFChildAnchor)userAnchor;
         EscherChildAnchorRecord anchor = new EscherChildAnchorRecord();
         anchor.setRecordId((short)-4081);
         anchor.setOptions((short)0);
         anchor.setDx1((short)Math.min(a.getDx1(), a.getDx2()));
         anchor.setDy1((short)Math.min(a.getDy1(), a.getDy2()));
         anchor.setDx2((short)Math.max(a.getDx2(), a.getDx1()));
         anchor.setDy2((short)Math.max(a.getDy2(), a.getDy1()));
         return anchor;
      }
   }
}
