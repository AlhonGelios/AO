package tab_education;

import backend.MessageProcessing;
import backend.ModelDBConnection;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import tab_education.SimpleEducationPanel;

public class EducationPanel extends JPanel {

   private SimpleEducationPanel highEducPanel;
   private SimpleEducationPanel afterDiplEducPanel;
   private JButton editEducationButton;
   private JButton saveEducationButton;


   public EducationPanel() {
      this.setLayout(new BoxLayout(this, 1));
      this.highEducPanel = new SimpleEducationPanel("Высшее образование");
      this.add(this.highEducPanel);
      this.afterDiplEducPanel = new SimpleEducationPanel("Последипломное образование");
      this.add(this.afterDiplEducPanel);
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout(2));
      this.editEducationButton = new JButton("Редактировать");
      this.editEducationButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            EducationPanel.this.editEducationButtonActionPerformed(evt);
         }
      });
      buttonPanel.add(this.editEducationButton);
      this.saveEducationButton = new JButton("Сохранить");
      this.saveEducationButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            EducationPanel.this.saveEducationButtonActionPerformed(evt);
         }
      });
      buttonPanel.add(this.saveEducationButton);
      this.add(buttonPanel);
      this.setEditable(false);
   }

   private void editEducationButtonActionPerformed(ActionEvent evt) {
      try {
         this.setEditable(true);
      } catch (Exception var3) {
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   private void saveEducationButtonActionPerformed(ActionEvent evt) {
      try {
         ArrayList e = this.highEducPanel.checkData(this.highEducPanel.getValues());
         ArrayList mistakesIndicesPostGradEdu = this.afterDiplEducPanel.checkData(this.afterDiplEducPanel.getValues());
         if(!e.contains(Integer.valueOf(5)) && !mistakesIndicesPostGradEdu.contains(Integer.valueOf(5)) && !e.contains(Integer.valueOf(6)) && !mistakesIndicesPostGradEdu.contains(Integer.valueOf(6))) {
            if(e.isEmpty()) {
               ModelDBConnection.updateAbiturientEducationByID("AbiturientHigherEducation", this.highEducPanel.getValues());
            } else if(e.contains(Integer.valueOf(-1))) {
               ModelDBConnection.deleteElementInTableById("AbiturientHigherEducation", this.highEducPanel.getValues()[0]);
            }

            if(mistakesIndicesPostGradEdu.isEmpty()) {
               ModelDBConnection.updateAbiturientEducationByID("AbiturientPostgraduateEducation", this.afterDiplEducPanel.getValues());
            } else if(mistakesIndicesPostGradEdu.contains(Integer.valueOf(-1))) {
               ModelDBConnection.deleteElementInTableById("AbiturientPostgraduateEducation", this.afterDiplEducPanel.getValues()[0]);
            }

            this.setEditable(false);
            MessageProcessing.displaySuccessMessage(this, 8);
         } else {
            MessageProcessing.displayErrorMessage((Component)null, 9);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         MessageProcessing.displayErrorMessage(this, var4);
      }

   }

   public void setEditable(boolean state) {
      this.highEducPanel.setEditable(state);
      this.afterDiplEducPanel.setEditable(state);
      this.saveEducationButton.setEnabled(state);
      this.editEducationButton.setEnabled(!state);
      if(this.highEducPanel.getCurrentAbit() == null || this.highEducPanel.getCurrentAbit().equals("0")) {
         this.editEducationButton.setEnabled(state);
      }

   }

   public void setValues(String[] abiturientHigherEducationData, String[] abiturientPostgraduateEducationData) {
      this.highEducPanel.setValues(abiturientHigherEducationData);
      this.afterDiplEducPanel.setValues(abiturientPostgraduateEducationData);
      this.setEditable(false);
   }

   public String[] getValues(int educationType) {
      switch(educationType) {
      case 0:
         return this.highEducPanel.getValues();
      case 1:
         return this.afterDiplEducPanel.getValues();
      default:
         return null;
      }
   }
}
