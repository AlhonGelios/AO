package org.apache.poi.ss.usermodel;

import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.Removal;

public interface Row extends Iterable {

   @Removal(
      version = "3.17"
   )
   @Deprecated
   Row.MissingCellPolicy RETURN_NULL_AND_BLANK = Row.MissingCellPolicy.RETURN_NULL_AND_BLANK;
   @Removal(
      version = "3.17"
   )
   @Deprecated
   Row.MissingCellPolicy RETURN_BLANK_AS_NULL = Row.MissingCellPolicy.RETURN_BLANK_AS_NULL;
   @Removal(
      version = "3.17"
   )
   @Deprecated
   Row.MissingCellPolicy CREATE_NULL_AS_BLANK = Row.MissingCellPolicy.CREATE_NULL_AS_BLANK;


   Cell createCell(int var1);

   Cell createCell(int var1, int var2);

   Cell createCell(int var1, CellType var2);

   void removeCell(Cell var1);

   void setRowNum(int var1);

   int getRowNum();

   Cell getCell(int var1);

   Cell getCell(int var1, Row.MissingCellPolicy var2);

   short getFirstCellNum();

   short getLastCellNum();

   int getPhysicalNumberOfCells();

   void setHeight(short var1);

   void setZeroHeight(boolean var1);

   boolean getZeroHeight();

   void setHeightInPoints(float var1);

   short getHeight();

   float getHeightInPoints();

   boolean isFormatted();

   CellStyle getRowStyle();

   void setRowStyle(CellStyle var1);

   Iterator cellIterator();

   Sheet getSheet();

   int getOutlineLevel();


   public static enum MissingCellPolicy {

      RETURN_NULL_AND_BLANK("RETURN_NULL_AND_BLANK", 0, 1),
      RETURN_BLANK_AS_NULL("RETURN_BLANK_AS_NULL", 1, 2),
      CREATE_NULL_AS_BLANK("CREATE_NULL_AS_BLANK", 2, 3);
      @Removal(
         version = "3.17"
      )
      @Deprecated
      public final int id;
      // $FF: synthetic field
      private static final Row.MissingCellPolicy[] $VALUES = new Row.MissingCellPolicy[]{RETURN_NULL_AND_BLANK, RETURN_BLANK_AS_NULL, CREATE_NULL_AS_BLANK};


      private MissingCellPolicy(String var1, int var2, int id) {
         this.id = id;
      }

   }
}
