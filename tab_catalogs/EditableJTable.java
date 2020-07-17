package tab_catalogs;

import general_classes.GUITableModel;
import java.util.ArrayList;
import javax.swing.JTable;
import tab_catalogs.Cell;

public class EditableJTable extends JTable {

   private ArrayList nonEditableCells = new ArrayList();


   public EditableJTable(GUITableModel currentTM) {
      super(currentTM);
   }

   public void setCellEditable(int row, int column, boolean editable) {
      Cell cell = new Cell(Integer.valueOf(row), Integer.valueOf(column));
      if(editable) {
         while(this.nonEditableCells.remove(cell)) {
            ;
         }
      } else {
         this.nonEditableCells.add(cell);
      }

   }

   public void setRowEditable(int row, boolean editable) {
      for(int i = 0; i < this.getColumnCount(); ++i) {
         if(editable) {
            while(this.nonEditableCells.remove(new Cell(Integer.valueOf(row), Integer.valueOf(i)))) {
               ;
            }
         } else {
            this.nonEditableCells.add(new Cell(Integer.valueOf(row), Integer.valueOf(i)));
         }
      }

   }

   public void setColumnEditable(int column, boolean editable) {
      for(int i = 0; i < this.getRowCount(); ++i) {
         if(editable) {
            while(this.nonEditableCells.remove(new Cell(Integer.valueOf(i), Integer.valueOf(column)))) {
               ;
            }
         } else {
            this.nonEditableCells.add(new Cell(Integer.valueOf(i), Integer.valueOf(column)));
         }
      }

   }

   public boolean isCellEditable(int row, int column) {
      Cell cell = new Cell(Integer.valueOf(row), Integer.valueOf(column));

      for(int i = 0; i < this.nonEditableCells.size(); ++i) {
         if(cell.equals((Cell)this.nonEditableCells.get(i))) {
            return false;
         }
      }

      return super.isCellEditable(row, column);
   }
}
