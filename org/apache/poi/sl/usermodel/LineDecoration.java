package org.apache.poi.sl.usermodel;


public interface LineDecoration {

   LineDecoration.DecorationShape getHeadShape();

   LineDecoration.DecorationSize getHeadWidth();

   LineDecoration.DecorationSize getHeadLength();

   LineDecoration.DecorationShape getTailShape();

   LineDecoration.DecorationSize getTailWidth();

   LineDecoration.DecorationSize getTailLength();

   public static enum DecorationSize {

      SMALL("SMALL", 0, 0, 1),
      MEDIUM("MEDIUM", 1, 1, 2),
      LARGE("LARGE", 2, 2, 3);
      public final int nativeId;
      public final int ooxmlId;
      // $FF: synthetic field
      private static final LineDecoration.DecorationSize[] $VALUES = new LineDecoration.DecorationSize[]{SMALL, MEDIUM, LARGE};


      private DecorationSize(String var1, int var2, int nativeId, int ooxmlId) {
         this.nativeId = nativeId;
         this.ooxmlId = ooxmlId;
      }

      public static LineDecoration.DecorationSize fromNativeId(int nativeId) {
         LineDecoration.DecorationSize[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            LineDecoration.DecorationSize ld = arr$[i$];
            if(ld.nativeId == nativeId) {
               return ld;
            }
         }

         return null;
      }

      public static LineDecoration.DecorationSize fromOoxmlId(int ooxmlId) {
         LineDecoration.DecorationSize[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            LineDecoration.DecorationSize ds = arr$[i$];
            if(ds.ooxmlId == ooxmlId) {
               return ds;
            }
         }

         return null;
      }

   }

   public static enum DecorationShape {

      NONE("NONE", 0, 0, 1),
      TRIANGLE("TRIANGLE", 1, 1, 2),
      STEALTH("STEALTH", 2, 2, 3),
      DIAMOND("DIAMOND", 3, 3, 4),
      OVAL("OVAL", 4, 4, 5),
      ARROW("ARROW", 5, 5, 6);
      public final int nativeId;
      public final int ooxmlId;
      // $FF: synthetic field
      private static final LineDecoration.DecorationShape[] $VALUES = new LineDecoration.DecorationShape[]{NONE, TRIANGLE, STEALTH, DIAMOND, OVAL, ARROW};


      private DecorationShape(String var1, int var2, int nativeId, int ooxmlId) {
         this.nativeId = nativeId;
         this.ooxmlId = ooxmlId;
      }

      public static LineDecoration.DecorationShape fromNativeId(int nativeId) {
         LineDecoration.DecorationShape[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            LineDecoration.DecorationShape ld = arr$[i$];
            if(ld.nativeId == nativeId) {
               return ld;
            }
         }

         return null;
      }

      public static LineDecoration.DecorationShape fromOoxmlId(int ooxmlId) {
         LineDecoration.DecorationShape[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            LineDecoration.DecorationShape ds = arr$[i$];
            if(ds.ooxmlId == ooxmlId) {
               return ds;
            }
         }

         return null;
      }

   }
}
