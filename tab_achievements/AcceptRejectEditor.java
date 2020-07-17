package tab_achievements;

import java.awt.Component;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import tab_achievements.EditWatchAchievmentPanel;

public class AcceptRejectEditor extends AbstractCellEditor implements TableCellEditor {

   private EditWatchAchievmentPanel acceptRejectPane = new EditWatchAchievmentPanel();


   public AcceptRejectEditor(JTable table) {}

   public Object getCellEditorValue() {
      return this.acceptRejectPane.getState();
   }

   public boolean isCellEditable(EventObject e) {
      return true;
   }

   public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
      if(isSelected) {
         this.acceptRejectPane.setBackground(table.getSelectionBackground());
      } else {
         this.acceptRejectPane.setBackground(table.getBackground());
      }

      return this.acceptRejectPane;
   }

   public void setValues(String[] values) {
      this.acceptRejectPane.setValues(values);
   }
}
