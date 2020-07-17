package org.apache.poi.sl.usermodel;


public enum RectAlign {

   TOP_LEFT("TOP_LEFT", 0, "tl"),
   TOP("TOP", 1, "t"),
   TOP_RIGHT("TOP_RIGHT", 2, "tr"),
   LEFT("LEFT", 3, "l"),
   CENTER("CENTER", 4, "ctr"),
   RIGHT("RIGHT", 5, "r"),
   BOTTOM_LEFT("BOTTOM_LEFT", 6, "bl"),
   BOTTOM("BOTTOM", 7, "b"),
   BOTTOM_RIGHT("BOTTOM_RIGHT", 8, "br");
   private final String dir;
   // $FF: synthetic field
   private static final RectAlign[] $VALUES = new RectAlign[]{TOP_LEFT, TOP, TOP_RIGHT, LEFT, CENTER, RIGHT, BOTTOM_LEFT, BOTTOM, BOTTOM_RIGHT};


   private RectAlign(String var1, int var2, String dir) {
      this.dir = dir;
   }

   public String toString() {
      return this.dir;
   }

}
