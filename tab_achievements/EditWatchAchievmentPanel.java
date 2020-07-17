package tab_achievements;

import backend.MessageProcessing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import tab_achievements.WatchConfirmingDoc;

public class EditWatchAchievmentPanel extends JPanel {

   private WatchConfirmingDoc window;
   private JButton editButton;
   private JButton watchButton;
   private String state;
   private String[] values;


   public EditWatchAchievmentPanel() {
      this.setLayout(new FlowLayout());
      this.editButton = new JButton("Редактировать");
      this.editButton.setActionCommand("Редактировать");
      this.editButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            EditWatchAchievmentPanel.this.editButtonActionPerformed(evt);
         }
      });
      this.watchButton = new JButton("Просмотреть");
      this.watchButton.setActionCommand("Просмотреть");
      this.watchButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            EditWatchAchievmentPanel.this.watchButtonActionPerformed(evt);
         }
      });
      this.add(this.editButton);
      this.add(this.watchButton);
   }

   private void editButtonActionPerformed(ActionEvent evt) {
      try {
         if(this.values != null) {
            this.window = new WatchConfirmingDoc("edit");
            this.window.setEditable(true);
            this.window.setVisible(true);
            this.window.setValues(this.values);
         }
      } catch (Exception var3) {
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   private void watchButtonActionPerformed(ActionEvent evt) {
      try {
         if(this.values != null) {
            this.window = new WatchConfirmingDoc("watch");
            this.window.setValues(this.values);
            this.window.setVisible(true);
         }
      } catch (Exception var3) {
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   public String getState() {
      return this.state;
   }

   public void setValues(String[] values) {
      this.values = values;
   }
}
