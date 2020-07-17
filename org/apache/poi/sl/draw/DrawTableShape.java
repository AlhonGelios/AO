package org.apache.poi.sl.draw;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D.Double;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.draw.DrawShape;
import org.apache.poi.sl.draw.DrawTextShape;
import org.apache.poi.sl.draw.Drawable;
import org.apache.poi.sl.usermodel.GroupShape;
import org.apache.poi.sl.usermodel.StrokeStyle;
import org.apache.poi.sl.usermodel.TableCell;
import org.apache.poi.sl.usermodel.TableShape;
import org.apache.poi.sl.usermodel.TextShape;
import org.apache.poi.util.Internal;

public class DrawTableShape extends DrawShape {

   @Internal
   public static final int borderSize = 2;


   public DrawTableShape(TableShape shape) {
      super(shape);
   }

   protected Drawable getGroupShape(Graphics2D graphics) {
      if(this.shape instanceof GroupShape) {
         DrawFactory df = DrawFactory.getInstance(graphics);
         return df.getDrawable((GroupShape)this.shape);
      } else {
         return null;
      }
   }

   public void applyTransform(Graphics2D graphics) {
      Drawable d = this.getGroupShape(graphics);
      if(d != null) {
         d.applyTransform(graphics);
      } else {
         super.applyTransform(graphics);
      }

   }

   public void draw(Graphics2D graphics) {
      Drawable d = this.getGroupShape(graphics);
      if(d != null) {
         d.draw(graphics);
      } else {
         TableShape ts = this.getShape();
         DrawPaint drawPaint = DrawFactory.getInstance(graphics).getPaint(ts);
         int rows = ts.getNumberOfRows();
         int cols = ts.getNumberOfColumns();

         for(int row = 0; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
               TableCell tc = ts.getCell(row, col);
               if(tc != null && !tc.isMerged()) {
                  Paint fillPaint = drawPaint.getPaint(graphics, tc.getFillStyle().getPaint());
                  graphics.setPaint(fillPaint);
                  Rectangle2D cellAnc = tc.getAnchor();
                  graphics.fill(cellAnc);
                  TableCell.BorderEdge[] arr$ = TableCell.BorderEdge.values();
                  int len$ = arr$.length;

                  for(int i$ = 0; i$ < len$; ++i$) {
                     TableCell.BorderEdge edge = arr$[i$];
                     StrokeStyle stroke = tc.getBorderStyle(edge);
                     if(stroke != null) {
                        graphics.setStroke(getStroke(stroke));
                        Paint linePaint = drawPaint.getPaint(graphics, stroke.getPaint());
                        graphics.setPaint(linePaint);
                        double x = cellAnc.getX();
                        double y = cellAnc.getY();
                        double w = cellAnc.getWidth();
                        double h = cellAnc.getHeight();
                        Double line;
                        switch(DrawTableShape.NamelessClass1627344157.$SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[edge.ordinal()]) {
                        case 1:
                        default:
                           line = new Double(x - 2.0D, y + h, x + w + 2.0D, y + h);
                           break;
                        case 2:
                           line = new Double(x, y, x, y + h + 2.0D);
                           break;
                        case 3:
                           line = new Double(x + w, y, x + w, y + h + 2.0D);
                           break;
                        case 4:
                           line = new Double(x - 2.0D, y, x + w + 2.0D, y);
                        }

                        graphics.draw(line);
                     }
                  }
               }
            }
         }

         this.drawContent(graphics);
      }
   }

   public void drawContent(Graphics2D graphics) {
      Drawable d = this.getGroupShape(graphics);
      if(d != null) {
         d.drawContent(graphics);
      } else {
         TableShape ts = this.getShape();
         DrawFactory df = DrawFactory.getInstance(graphics);
         int rows = ts.getNumberOfRows();
         int cols = ts.getNumberOfColumns();

         for(int row = 0; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
               TableCell tc = ts.getCell(row, col);
               DrawTextShape dts = df.getDrawable((TextShape)tc);
               dts.drawContent(graphics);
            }
         }

      }
   }

   protected TableShape getShape() {
      return (TableShape)this.shape;
   }

   public void setAllBorders(Object ... args) {
      TableShape table = this.getShape();
      int rows = table.getNumberOfRows();
      int cols = table.getNumberOfColumns();
      TableCell.BorderEdge[] edges = new TableCell.BorderEdge[]{TableCell.BorderEdge.top, TableCell.BorderEdge.left, null, null};

      for(int row = 0; row < rows; ++row) {
         for(int col = 0; col < cols; ++col) {
            edges[2] = col == cols - 1?TableCell.BorderEdge.right:null;
            edges[3] = row == rows - 1?TableCell.BorderEdge.bottom:null;
            setEdges(table.getCell(row, col), edges, args);
         }
      }

   }

   public void setOutsideBorders(Object ... args) {
      if(args.length != 0) {
         TableShape table = this.getShape();
         int rows = table.getNumberOfRows();
         int cols = table.getNumberOfColumns();
         TableCell.BorderEdge[] edges = new TableCell.BorderEdge[4];

         for(int row = 0; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
               edges[0] = col == 0?TableCell.BorderEdge.left:null;
               edges[1] = col == cols - 1?TableCell.BorderEdge.right:null;
               edges[2] = row == 0?TableCell.BorderEdge.top:null;
               edges[3] = row == rows - 1?TableCell.BorderEdge.bottom:null;
               setEdges(table.getCell(row, col), edges, args);
            }
         }

      }
   }

   public void setInsideBorders(Object ... args) {
      if(args.length != 0) {
         TableShape table = this.getShape();
         int rows = table.getNumberOfRows();
         int cols = table.getNumberOfColumns();
         TableCell.BorderEdge[] edges = new TableCell.BorderEdge[2];

         for(int row = 0; row < rows; ++row) {
            for(int col = 0; col < cols; ++col) {
               edges[0] = col > 0 && col < cols - 1?TableCell.BorderEdge.right:null;
               edges[1] = row > 0 && row < rows - 1?TableCell.BorderEdge.bottom:null;
               setEdges(table.getCell(row, col), edges, args);
            }
         }

      }
   }

   private static void setEdges(TableCell cell, TableCell.BorderEdge[] edges, Object ... args) {
      TableCell.BorderEdge[] arr$ = edges;
      int len$ = edges.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         TableCell.BorderEdge be = arr$[i$];
         if(be != null) {
            if(args.length == 0) {
               cell.removeBorder(be);
            } else {
               Object[] arr$1 = args;
               int len$1 = args.length;

               for(int i$1 = 0; i$1 < len$1; ++i$1) {
                  Object o = arr$1[i$1];
                  if(o instanceof java.lang.Double) {
                     cell.setBorderWidth(be, ((java.lang.Double)o).doubleValue());
                  } else if(o instanceof Color) {
                     cell.setBorderColor(be, (Color)o);
                  } else if(o instanceof StrokeStyle.LineDash) {
                     cell.setBorderDash(be, (StrokeStyle.LineDash)o);
                  } else if(o instanceof StrokeStyle.LineCompound) {
                     cell.setBorderCompound(be, (StrokeStyle.LineCompound)o);
                  }
               }
            }
         }
      }

   }

   // $FF: synthetic class
   static class NamelessClass1627344157 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge = new int[TableCell.BorderEdge.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.bottom.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.left.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.right.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.top.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
