package org.apache.poi.sl.draw.geom;

import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.sl.draw.binding.CTAdjPoint2D;
import org.apache.poi.sl.draw.binding.CTPath2D;
import org.apache.poi.sl.draw.binding.CTPath2DArcTo;
import org.apache.poi.sl.draw.binding.CTPath2DClose;
import org.apache.poi.sl.draw.binding.CTPath2DCubicBezierTo;
import org.apache.poi.sl.draw.binding.CTPath2DLineTo;
import org.apache.poi.sl.draw.binding.CTPath2DMoveTo;
import org.apache.poi.sl.draw.binding.CTPath2DQuadBezierTo;
import org.apache.poi.sl.draw.binding.STPathFillMode;
import org.apache.poi.sl.draw.geom.ArcToCommand;
import org.apache.poi.sl.draw.geom.ClosePathCommand;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.CurveToCommand;
import org.apache.poi.sl.draw.geom.LineToCommand;
import org.apache.poi.sl.draw.geom.MoveToCommand;
import org.apache.poi.sl.draw.geom.PathCommand;
import org.apache.poi.sl.draw.geom.QuadToCommand;

public class Path {

   private final List commands;
   boolean _fill;
   boolean _stroke;
   long _w;
   long _h;


   public Path() {
      this(true, true);
   }

   public Path(boolean fill, boolean stroke) {
      this.commands = new ArrayList();
      this._w = -1L;
      this._h = -1L;
      this._fill = fill;
      this._stroke = stroke;
   }

   public Path(CTPath2D spPath) {
      this._fill = spPath.getFill() != STPathFillMode.NONE;
      this._stroke = spPath.isStroke();
      this._w = spPath.isSetW()?spPath.getW():-1L;
      this._h = spPath.isSetH()?spPath.getH():-1L;
      this.commands = new ArrayList();
      Iterator i$ = spPath.getCloseOrMoveToOrLnTo().iterator();

      while(i$.hasNext()) {
         Object ch = i$.next();
         CTAdjPoint2D bez;
         if(ch instanceof CTPath2DMoveTo) {
            bez = ((CTPath2DMoveTo)ch).getPt();
            this.commands.add(new MoveToCommand(bez));
         } else if(ch instanceof CTPath2DLineTo) {
            bez = ((CTPath2DLineTo)ch).getPt();
            this.commands.add(new LineToCommand(bez));
         } else if(ch instanceof CTPath2DArcTo) {
            CTPath2DArcTo bez1 = (CTPath2DArcTo)ch;
            this.commands.add(new ArcToCommand(bez1));
         } else {
            CTAdjPoint2D pt1;
            CTAdjPoint2D pt2;
            if(ch instanceof CTPath2DQuadBezierTo) {
               CTPath2DQuadBezierTo bez2 = (CTPath2DQuadBezierTo)ch;
               pt1 = (CTAdjPoint2D)bez2.getPt().get(0);
               pt2 = (CTAdjPoint2D)bez2.getPt().get(1);
               this.commands.add(new QuadToCommand(pt1, pt2));
            } else if(ch instanceof CTPath2DCubicBezierTo) {
               CTPath2DCubicBezierTo bez3 = (CTPath2DCubicBezierTo)ch;
               pt1 = (CTAdjPoint2D)bez3.getPt().get(0);
               pt2 = (CTAdjPoint2D)bez3.getPt().get(1);
               CTAdjPoint2D pt3 = (CTAdjPoint2D)bez3.getPt().get(2);
               this.commands.add(new CurveToCommand(pt1, pt2, pt3));
            } else {
               if(!(ch instanceof CTPath2DClose)) {
                  throw new IllegalStateException("Unsupported path segment: " + ch);
               }

               this.commands.add(new ClosePathCommand());
            }
         }
      }

   }

   public void addCommand(PathCommand cmd) {
      this.commands.add(cmd);
   }

   public Double getPath(Context ctx) {
      Double path = new Double();
      Iterator i$ = this.commands.iterator();

      while(i$.hasNext()) {
         PathCommand cmd = (PathCommand)i$.next();
         cmd.execute(path, ctx);
      }

      return path;
   }

   public boolean isStroked() {
      return this._stroke;
   }

   public boolean isFilled() {
      return this._fill;
   }

   public long getW() {
      return this._w;
   }

   public long getH() {
      return this._h;
   }
}
