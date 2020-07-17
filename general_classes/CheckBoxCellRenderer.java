package general_classes;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class CheckBoxCellRenderer implements TableCellRenderer {

   JComboBox combo = new JComboBox();


   public CheckBoxCellRenderer(JComboBox comboBox) {
      for(int i = 0; i < comboBox.getItemCount(); ++i) {
         this.combo.addItem(comboBox.getItemAt(i));
      }

   }

   public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      this.combo.setSelectedItem(value);
      return this.combo;
   }
}
