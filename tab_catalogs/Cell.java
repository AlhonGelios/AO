package tab_catalogs;


class Cell {

   Integer Row = null;
   Integer Col = null;


   public Cell(Integer row, Integer col) {
      if(row != null) {
         this.Row = row;
      } else {
         this.Row = Integer.valueOf(0);
      }

      if(col != null) {
         this.Col = col;
      } else {
         this.Col = Integer.valueOf(0);
      }

   }

   public Integer getRow() {
      return this.Row;
   }

   public Integer getCol() {
      return this.Col;
   }

   public boolean equals(Cell cell) {
      return cell.getRow() == this.getRow() && cell.getCol() == this.getCol();
   }

   public boolean equals(Object oCell) {
      Cell cell = (Cell)oCell;
      return this.equals(cell);
   }
}
