package tab_competitive_groups;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import tab_competitive_groups.AddNewCompetitiveGroup;
import tab_competitive_groups.SimpleCompetitiveGroupPanel;

public class CompetitiveGroupPanelListener implements ActionListener {

   private boolean isPushed = false;
   private JPanel panel = new JPanel();
   private AddNewCompetitiveGroup openCompetGroup;


   public CompetitiveGroupPanelListener(JPanel panel, String[] data, JPanel parentPanel) {
      this.panel = panel;
      this.openCompetGroup = new AddNewCompetitiveGroup(parentPanel);
      this.openCompetGroup.setValues(data);
      this.openCompetGroup.setEditable(false);
      panel.add(this.openCompetGroup.getAddNewCompetGroup());
      panel.setVisible(false);
   }

   public void actionPerformed(ActionEvent arg0) {
      try {
         if(!this.isPushed) {
            ((JButton)arg0.getSource()).setText("-");
            this.panel.setVisible(true);
            ((SimpleCompetitiveGroupPanel)this.panel.getParent()).limitMaxSize(false);
            this.isPushed = true;
         } else {
            ((JButton)arg0.getSource()).setText("+");
            this.panel.setVisible(false);
            ((SimpleCompetitiveGroupPanel)this.panel.getParent()).limitMaxSize(true);
            this.isPushed = false;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public String[] getValues(boolean forDocs) {
      return this.openCompetGroup.getValues(forDocs);
   }
}
