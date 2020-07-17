package tab_achievements;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import tab_achievements.EditWatchAchievmentPanel;

public class EditWatchRenderer extends DefaultTableCellRenderer {

   private EditWatchAchievmentPanel acceptRejectPane = new EditWatchAchievmentPanel();


   public EditWatchRenderer(JTable table) {}

   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      if(isSelected) {
         this.acceptRejectPane.setBackground(table.getSelectionBackground());
      } else {
         this.acceptRejectPane.setBackground(table.getBackground());
      }

      return this.acceptRejectPane;
   }
}
