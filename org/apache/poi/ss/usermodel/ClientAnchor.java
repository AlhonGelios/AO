package org.apache.poi.ss.usermodel;

import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;

public interface ClientAnchor {

   @Removal(
      version = "3.17"
   )
   ClientAnchor.AnchorType MOVE_AND_RESIZE = ClientAnchor.AnchorType.MOVE_AND_RESIZE;
   @Removal(
      version = "3.17"
   )
   ClientAnchor.AnchorType MOVE_DONT_RESIZE = ClientAnchor.AnchorType.MOVE_DONT_RESIZE;
   @Removal(
      version = "3.17"
   )
   ClientAnchor.AnchorType DONT_MOVE_AND_RESIZE = ClientAnchor.AnchorType.DONT_MOVE_AND_RESIZE;


   short getCol1();

   void setCol1(int var1);

   short getCol2();

   void setCol2(int var1);

   int getRow1();

   void setRow1(int var1);

   int getRow2();

   void setRow2(int var1);

   int getDx1();

   void setDx1(int var1);

   int getDy1();

   void setDy1(int var1);

   int getDy2();

   void setDy2(int var1);

   int getDx2();

   void setDx2(int var1);

   void setAnchorType(ClientAnchor.AnchorType var1);

   @Removal(
      version = "3.17"
   )
   void setAnchorType(int var1);

   ClientAnchor.AnchorType getAnchorType();


   public static enum AnchorType {

      MOVE_AND_RESIZE("MOVE_AND_RESIZE", 0, 0),
      DONT_MOVE_DO_RESIZE("DONT_MOVE_DO_RESIZE", 1, 1),
      MOVE_DONT_RESIZE("MOVE_DONT_RESIZE", 2, 2),
      DONT_MOVE_AND_RESIZE("DONT_MOVE_AND_RESIZE", 3, 3);
      public final short value;
      // $FF: synthetic field
      private static final ClientAnchor.AnchorType[] $VALUES = new ClientAnchor.AnchorType[]{MOVE_AND_RESIZE, DONT_MOVE_DO_RESIZE, MOVE_DONT_RESIZE, DONT_MOVE_AND_RESIZE};


      private AnchorType(String var1, int var2, int value) {
         this.value = (short)value;
      }

      @Internal
      public static ClientAnchor.AnchorType byId(int value) {
         return values()[value];
      }

   }
}
