package org.apache.poi.sl.draw.geom;

import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.sl.draw.geom.Context;

public abstract class Formula {

   static Map builtInFormulas = new HashMap();


   String getName() {
      return null;
   }

   abstract double evaluate(Context var1);

   static {
      builtInFormulas.put("3cd4", new Formula() {
         double evaluate(Context ctx) {
            return 1.62E7D;
         }
      });
      builtInFormulas.put("3cd8", new Formula() {
         double evaluate(Context ctx) {
            return 8100000.0D;
         }
      });
      builtInFormulas.put("5cd8", new Formula() {
         double evaluate(Context ctx) {
            return 1.62E7D;
         }
      });
      builtInFormulas.put("7cd8", new Formula() {
         double evaluate(Context ctx) {
            return 1.62E7D;
         }
      });
      builtInFormulas.put("b", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getY() + anchor.getHeight();
         }
      });
      builtInFormulas.put("cd2", new Formula() {
         double evaluate(Context ctx) {
            return 1.08E7D;
         }
      });
      builtInFormulas.put("cd4", new Formula() {
         double evaluate(Context ctx) {
            return 5400000.0D;
         }
      });
      builtInFormulas.put("cd8", new Formula() {
         double evaluate(Context ctx) {
            return 2700000.0D;
         }
      });
      builtInFormulas.put("hc", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getX() + anchor.getWidth() / 2.0D;
         }
      });
      builtInFormulas.put("h", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getHeight();
         }
      });
      builtInFormulas.put("hd2", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getHeight() / 2.0D;
         }
      });
      builtInFormulas.put("hd3", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getHeight() / 3.0D;
         }
      });
      builtInFormulas.put("hd4", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getHeight() / 4.0D;
         }
      });
      builtInFormulas.put("hd5", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getHeight() / 5.0D;
         }
      });
      builtInFormulas.put("hd6", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getHeight() / 6.0D;
         }
      });
      builtInFormulas.put("hd8", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getHeight() / 8.0D;
         }
      });
      builtInFormulas.put("l", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getX();
         }
      });
      builtInFormulas.put("ls", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return Math.max(anchor.getWidth(), anchor.getHeight());
         }
      });
      builtInFormulas.put("r", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getX() + anchor.getWidth();
         }
      });
      builtInFormulas.put("ss", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return Math.min(anchor.getWidth(), anchor.getHeight());
         }
      });
      builtInFormulas.put("ssd2", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            double ss = Math.min(anchor.getWidth(), anchor.getHeight());
            return ss / 2.0D;
         }
      });
      builtInFormulas.put("ssd4", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            double ss = Math.min(anchor.getWidth(), anchor.getHeight());
            return ss / 4.0D;
         }
      });
      builtInFormulas.put("ssd6", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            double ss = Math.min(anchor.getWidth(), anchor.getHeight());
            return ss / 6.0D;
         }
      });
      builtInFormulas.put("ssd8", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            double ss = Math.min(anchor.getWidth(), anchor.getHeight());
            return ss / 8.0D;
         }
      });
      builtInFormulas.put("ssd16", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            double ss = Math.min(anchor.getWidth(), anchor.getHeight());
            return ss / 16.0D;
         }
      });
      builtInFormulas.put("ssd32", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            double ss = Math.min(anchor.getWidth(), anchor.getHeight());
            return ss / 32.0D;
         }
      });
      builtInFormulas.put("t", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getY();
         }
      });
      builtInFormulas.put("vc", new Formula() {
         double evaluate(Context ctx) {
            Rectangle2D anchor = ctx.getShapeAnchor();
            return anchor.getY() + anchor.getHeight() / 2.0D;
         }
      });
      builtInFormulas.put("w", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth();
         }
      });
      builtInFormulas.put("wd2", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 2.0D;
         }
      });
      builtInFormulas.put("wd3", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 3.0D;
         }
      });
      builtInFormulas.put("wd4", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 4.0D;
         }
      });
      builtInFormulas.put("wd5", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 5.0D;
         }
      });
      builtInFormulas.put("wd6", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 6.0D;
         }
      });
      builtInFormulas.put("wd8", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 8.0D;
         }
      });
      builtInFormulas.put("wd10", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 10.0D;
         }
      });
      builtInFormulas.put("wd32", new Formula() {
         double evaluate(Context ctx) {
            return ctx.getShapeAnchor().getWidth() / 32.0D;
         }
      });
   }
}
