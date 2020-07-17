package org.apache.poi.sl.usermodel;


public enum Placeholder {

   NONE("NONE", 0, 0, 0, 0, 0, 0),
   TITLE("TITLE", 1, 13, 1, 1, 1, 1),
   BODY("BODY", 2, 14, 2, 12, 6, 2),
   CENTERED_TITLE("CENTERED_TITLE", 3, 15, 3, 3, 3, 3),
   SUBTITLE("SUBTITLE", 4, 16, 4, 4, 4, 4),
   DATETIME("DATETIME", 5, 7, 7, 7, 7, 5),
   SLIDE_NUMBER("SLIDE_NUMBER", 6, 8, 8, 8, 8, 6),
   FOOTER("FOOTER", 7, 9, 9, 9, 9, 7),
   HEADER("HEADER", 8, 10, 10, 10, 10, 8),
   CONTENT("CONTENT", 9, 19, 19, 19, 19, 9),
   CHART("CHART", 10, 20, 20, 20, 20, 10),
   TABLE("TABLE", 11, 21, 21, 21, 21, 11),
   CLIP_ART("CLIP_ART", 12, 22, 22, 22, 22, 12),
   DGM("DGM", 13, 23, 23, 23, 23, 13),
   MEDIA("MEDIA", 14, 24, 24, 24, 24, 14),
   SLIDE_IMAGE("SLIDE_IMAGE", 15, 11, 11, 11, 5, 15),
   PICTURE("PICTURE", 16, 26, 26, 26, 26, 16),
   VERTICAL_OBJECT("VERTICAL_OBJECT", 17, 25, 25, 25, 25, -2),
   VERTICAL_TEXT_TITLE("VERTICAL_TEXT_TITLE", 18, 17, 17, 17, 17, -2),
   VERTICAL_TEXT_BODY("VERTICAL_TEXT_BODY", 19, 18, 18, 18, 18, -2);
   public final int nativeSlideId;
   public final int nativeSlideMasterId;
   public final int nativeNotesId;
   public final int nativeNotesMasterId;
   public final int ooxmlId;
   // $FF: synthetic field
   private static final Placeholder[] $VALUES = new Placeholder[]{NONE, TITLE, BODY, CENTERED_TITLE, SUBTITLE, DATETIME, SLIDE_NUMBER, FOOTER, HEADER, CONTENT, CHART, TABLE, CLIP_ART, DGM, MEDIA, SLIDE_IMAGE, PICTURE, VERTICAL_OBJECT, VERTICAL_TEXT_TITLE, VERTICAL_TEXT_BODY};


   private Placeholder(String var1, int var2, int nativeSlideId, int nativeSlideMasterId, int nativeNotesId, int nativeNotesMasterId, int ooxmlId) {
      this.nativeSlideId = nativeSlideId;
      this.nativeSlideMasterId = nativeSlideMasterId;
      this.nativeNotesId = nativeNotesId;
      this.nativeNotesMasterId = nativeNotesMasterId;
      this.ooxmlId = ooxmlId;
   }

   public static Placeholder lookupNative(int nativeId) {
      Placeholder[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Placeholder ph = arr$[i$];
         if(ph.nativeSlideId == nativeId || ph.nativeSlideMasterId == nativeId || ph.nativeNotesId == nativeId || ph.nativeNotesMasterId == nativeId) {
            return ph;
         }
      }

      return null;
   }

   public static Placeholder lookupOoxml(int ooxmlId) {
      Placeholder[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Placeholder ph = arr$[i$];
         if(ph.ooxmlId == ooxmlId) {
            return ph;
         }
      }

      return null;
   }

}
