package org.apache.poi.ss.usermodel;

import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;

public interface CellRange extends Iterable {

   int getWidth();

   int getHeight();

   int size();

   String getReferenceText();

   Cell getTopLeftCell();

   Cell getCell(int var1, int var2);

   Cell[] getFlattenedCells();

   Cell[][] getCells();

   Iterator iterator();
}
