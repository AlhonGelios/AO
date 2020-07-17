package org.apache.poi.sl.usermodel;

import java.awt.Color;
import org.apache.poi.sl.usermodel.StrokeStyle;
import org.apache.poi.sl.usermodel.TextShape;

public interface TableCell extends TextShape {

   StrokeStyle getBorderStyle(TableCell.BorderEdge var1);

   void setBorderStyle(TableCell.BorderEdge var1, StrokeStyle var2);

   void setBorderWidth(TableCell.BorderEdge var1, double var2);

   void setBorderColor(TableCell.BorderEdge var1, Color var2);

   void setBorderCompound(TableCell.BorderEdge var1, StrokeStyle.LineCompound var2);

   void setBorderDash(TableCell.BorderEdge var1, StrokeStyle.LineDash var2);

   void removeBorder(TableCell.BorderEdge var1);

   int getGridSpan();

   int getRowSpan();

   boolean isMerged();

   public static enum BorderEdge {

      bottom("bottom", 0),
      left("left", 1),
      top("top", 2),
      right("right", 3);
      // $FF: synthetic field
      private static final TableCell.BorderEdge[] $VALUES = new TableCell.BorderEdge[]{bottom, left, top, right};


      private BorderEdge(String var1, int var2) {}

   }
}
