package org.apache.poi.sl.draw.geom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.sl.draw.binding.CTCustomGeometry2D;
import org.apache.poi.sl.draw.binding.CTGeomGuide;
import org.apache.poi.sl.draw.binding.CTGeomGuideList;
import org.apache.poi.sl.draw.binding.CTGeomRect;
import org.apache.poi.sl.draw.binding.CTPath2D;
import org.apache.poi.sl.draw.binding.CTPath2DList;
import org.apache.poi.sl.draw.geom.AdjustValue;
import org.apache.poi.sl.draw.geom.ClosePathCommand;
import org.apache.poi.sl.draw.geom.Guide;
import org.apache.poi.sl.draw.geom.LineToCommand;
import org.apache.poi.sl.draw.geom.MoveToCommand;
import org.apache.poi.sl.draw.geom.Path;

public class CustomGeometry implements Iterable {

   List adjusts = new ArrayList();
   List guides = new ArrayList();
   List paths = new ArrayList();
   Path textBounds;


   public CustomGeometry(CTCustomGeometry2D geom) {
      CTGeomGuideList avLst = geom.getAvLst();
      if(avLst != null) {
         Iterator gdLst = avLst.getGd().iterator();

         while(gdLst.hasNext()) {
            CTGeomGuide pathLst = (CTGeomGuide)gdLst.next();
            this.adjusts.add(new AdjustValue(pathLst));
         }
      }

      CTGeomGuideList gdLst1 = geom.getGdLst();
      if(gdLst1 != null) {
         Iterator pathLst1 = gdLst1.getGd().iterator();

         while(pathLst1.hasNext()) {
            CTGeomGuide rect = (CTGeomGuide)pathLst1.next();
            this.guides.add(new Guide(rect));
         }
      }

      CTPath2DList pathLst2 = geom.getPathLst();
      if(pathLst2 != null) {
         Iterator rect1 = pathLst2.getPath().iterator();

         while(rect1.hasNext()) {
            CTPath2D spPath = (CTPath2D)rect1.next();
            this.paths.add(new Path(spPath));
         }
      }

      CTGeomRect rect2 = geom.getRect();
      if(rect2 != null) {
         this.textBounds = new Path();
         this.textBounds.addCommand(new MoveToCommand(rect2.getL().toString(), rect2.getT().toString()));
         this.textBounds.addCommand(new LineToCommand(rect2.getR().toString(), rect2.getT().toString()));
         this.textBounds.addCommand(new LineToCommand(rect2.getR().toString(), rect2.getB().toString()));
         this.textBounds.addCommand(new LineToCommand(rect2.getL().toString(), rect2.getB().toString()));
         this.textBounds.addCommand(new ClosePathCommand());
      }

   }

   public Iterator iterator() {
      return this.paths.iterator();
   }

   public Path getTextBounds() {
      return this.textBounds;
   }
}
