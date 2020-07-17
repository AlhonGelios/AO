package general_classes;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class GUITableModel extends DefaultTableModel {

   public Vector getInfoByKey(int i) {
      Vector info = new Vector();

      for(int j = 0; j < this.getColumnCount(); ++j) {
         info.add(this.getValueAt(i, j).toString());
      }

      return info;
   }

   public int getKeyIndex(String key, int columnIndex) {
      int index = -1;

      for(int i = 0; i < this.getRowCount(); ++i) {
         if(this.getValueAt(i, columnIndex).toString().equals(key)) {
            index = i;
         }
      }

      return index;
   }

   public boolean isCellEditable(int row, int column) {
      String var3;
      switch((var3 = this.getColumnName(column)).hashCode()) {
      case 8470:
         if(var3.equals("№")) {
            return false;
         }
         break;
      case 1041835:
         if(var3.equals("Имя")) {
            return false;
         }
         break;
      case 1816089226:
         if(var3.equals("Фамилия")) {
            return false;
         }
         break;
      case 1999766751:
         if(var3.equals("Отчество")) {
            return false;
         }
      }

      return true;
   }
}
