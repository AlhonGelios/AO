package org.apache.poi.sl.usermodel;

import org.apache.poi.sl.usermodel.PaintStyle;

public interface StrokeStyle {

   PaintStyle getPaint();

   StrokeStyle.LineCap getLineCap();

   StrokeStyle.LineDash getLineDash();

   StrokeStyle.LineCompound getLineCompound();

   double getLineWidth();

   public static enum LineDash {

      SOLID("SOLID", 0, 1, 1, (int[])null),
      DOT("DOT", 1, 6, 2, new int[]{1, 1}),
      DASH("DASH", 2, 7, 3, new int[]{3, 4}),
      DASH_DOT("DASH_DOT", 3, 9, 5, new int[]{4, 3, 1, 3}),
      LG_DASH("LG_DASH", 4, 8, 4, new int[]{8, 3}),
      LG_DASH_DOT("LG_DASH_DOT", 5, 10, 6, new int[]{8, 3, 1, 3}),
      LG_DASH_DOT_DOT("LG_DASH_DOT_DOT", 6, 11, 7, new int[]{8, 3, 1, 3, 1, 3}),
      SYS_DASH("SYS_DASH", 7, 2, 8, new int[]{2, 2}),
      SYS_DOT("SYS_DOT", 8, 3, 9, new int[]{1, 1}),
      SYS_DASH_DOT("SYS_DASH_DOT", 9, 4, 10, new int[]{2, 2, 1, 1}),
      SYS_DASH_DOT_DOT("SYS_DASH_DOT_DOT", 10, 5, 11, new int[]{2, 2, 1, 1, 1, 1});
      public final int[] pattern;
      public final int nativeId;
      public final int ooxmlId;
      // $FF: synthetic field
      private static final StrokeStyle.LineDash[] $VALUES = new StrokeStyle.LineDash[]{SOLID, DOT, DASH, DASH_DOT, LG_DASH, LG_DASH_DOT, LG_DASH_DOT_DOT, SYS_DASH, SYS_DOT, SYS_DASH_DOT, SYS_DASH_DOT_DOT};


      private LineDash(String var1, int var2, int nativeId, int ooxmlId, int ... pattern) {
         this.nativeId = nativeId;
         this.ooxmlId = ooxmlId;
         this.pattern = pattern != null && pattern.length != 0?pattern:null;
      }

      public static StrokeStyle.LineDash fromNativeId(int nativeId) {
         StrokeStyle.LineDash[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            StrokeStyle.LineDash ld = arr$[i$];
            if(ld.nativeId == nativeId) {
               return ld;
            }
         }

         return null;
      }

      public static StrokeStyle.LineDash fromOoxmlId(int ooxmlId) {
         StrokeStyle.LineDash[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            StrokeStyle.LineDash ld = arr$[i$];
            if(ld.ooxmlId == ooxmlId) {
               return ld;
            }
         }

         return null;
      }

   }

   public static enum LineCap {

      ROUND("ROUND", 0, 0, 1),
      SQUARE("SQUARE", 1, 1, 2),
      FLAT("FLAT", 2, 2, 3);
      public final int nativeId;
      public final int ooxmlId;
      // $FF: synthetic field
      private static final StrokeStyle.LineCap[] $VALUES = new StrokeStyle.LineCap[]{ROUND, SQUARE, FLAT};


      private LineCap(String var1, int var2, int nativeId, int ooxmlId) {
         this.nativeId = nativeId;
         this.ooxmlId = ooxmlId;
      }

      public static StrokeStyle.LineCap fromNativeId(int nativeId) {
         StrokeStyle.LineCap[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            StrokeStyle.LineCap ld = arr$[i$];
            if(ld.nativeId == nativeId) {
               return ld;
            }
         }

         return null;
      }

      public static StrokeStyle.LineCap fromOoxmlId(int ooxmlId) {
         StrokeStyle.LineCap[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            StrokeStyle.LineCap lc = arr$[i$];
            if(lc.ooxmlId == ooxmlId) {
               return lc;
            }
         }

         return null;
      }

   }

   public static enum LineCompound {

      SINGLE("SINGLE", 0, 0, 1),
      DOUBLE("DOUBLE", 1, 1, 2),
      THICK_THIN("THICK_THIN", 2, 2, 3),
      THIN_THICK("THIN_THICK", 3, 3, 4),
      TRIPLE("TRIPLE", 4, 4, 5);
      public final int nativeId;
      public final int ooxmlId;
      // $FF: synthetic field
      private static final StrokeStyle.LineCompound[] $VALUES = new StrokeStyle.LineCompound[]{SINGLE, DOUBLE, THICK_THIN, THIN_THICK, TRIPLE};


      private LineCompound(String var1, int var2, int nativeId, int ooxmlId) {
         this.nativeId = nativeId;
         this.ooxmlId = ooxmlId;
      }

      public static StrokeStyle.LineCompound fromNativeId(int nativeId) {
         StrokeStyle.LineCompound[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            StrokeStyle.LineCompound lc = arr$[i$];
            if(lc.nativeId == nativeId) {
               return lc;
            }
         }

         return null;
      }

      public static StrokeStyle.LineCompound fromOoxmlId(int ooxmlId) {
         StrokeStyle.LineCompound[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            StrokeStyle.LineCompound lc = arr$[i$];
            if(lc.ooxmlId == ooxmlId) {
               return lc;
            }
         }

         return null;
      }

   }
}
