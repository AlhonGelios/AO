package tab_accreditation;

import backend.MessageProcessing;
import backend.ModelDBConnection;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import tab_accreditation.SimpleAccreditationPanel;

public class AccreditationPanel extends JPanel {

   private SimpleAccreditationPanel sertSpecPanel;
   private SimpleAccreditationPanel accreditSpecPanel;
   private JButton editAccreditationButton;
   private JButton saveAccreditationButton;


   public AccreditationPanel() {
      this.setLayout(new BoxLayout(this, 1));
      this.sertSpecPanel = new SimpleAccreditationPanel("Сертификат специалиста");
      this.add(this.sertSpecPanel);
      this.accreditSpecPanel = new SimpleAccreditationPanel("Свидетельство/протокол аккредитации");
      this.add(this.accreditSpecPanel);
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout(2));
      this.editAccreditationButton = new JButton("Редактировать");
      this.editAccreditationButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AccreditationPanel.this.editAccreditationButtonActionPerformed(evt);
         }
      });
      buttonPanel.add(this.editAccreditationButton);
      this.saveAccreditationButton = new JButton("Сохранить");
      this.saveAccreditationButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AccreditationPanel.this.saveAccreditationButtonActionPerformed(evt);
         }
      });
      buttonPanel.add(this.saveAccreditationButton);
      this.add(buttonPanel);
      this.setEditable(false);
   }

   private void editAccreditationButtonActionPerformed(ActionEvent evt) {
      try {
         this.setEditable(true);
      } catch (Exception var3) {
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   private void saveAccreditationButtonActionPerformed(ActionEvent evt) {
      try {
         ArrayList e = this.sertSpecPanel.checkData(this.sertSpecPanel.getValues());
         ArrayList mistakesAccreditSertificate = this.accreditSpecPanel.checkData(this.accreditSpecPanel.getValues());
         if(e.isEmpty()) {
            ModelDBConnection.updateAbiturientCertificateByID("AbiturientSpecialistCertificate", this.sertSpecPanel.getValues());
         } else if(e.contains(Integer.valueOf(-1))) {
            ModelDBConnection.deleteElementInTableById("AbiturientSpecialistCertificate", this.sertSpecPanel.getValues()[0]);
         }

         if(mistakesAccreditSertificate.isEmpty()) {
            ModelDBConnection.updateAbiturientCertificateByID("AbiturientAccreditationCertificate", this.accreditSpecPanel.getValues());
         } else if(mistakesAccreditSertificate.contains(Integer.valueOf(-1))) {
            ModelDBConnection.deleteElementInTableById("AbiturientAccreditationCertificate", this.accreditSpecPanel.getValues()[0]);
         }

         this.setEditable(false);
         MessageProcessing.displaySuccessMessage(this, 14);
      } catch (Exception var4) {
         var4.printStackTrace();
         MessageProcessing.displayErrorMessage(this, var4);
      }

   }

   public void setEditable(boolean state) {
      this.sertSpecPanel.setEditable(state);
      this.accreditSpecPanel.setEditable(state);
      this.saveAccreditationButton.setEnabled(state);
      this.editAccreditationButton.setEnabled(!state);
      if(this.sertSpecPanel.getCurrentAbit() == null || this.sertSpecPanel.getCurrentAbit().equals("0")) {
         this.editAccreditationButton.setEnabled(state);
      }

   }

   public void setValues(String[] abiturientSpecialistSertificateData, String[] abiturientAccreditationData) {
      this.sertSpecPanel.setValues(abiturientSpecialistSertificateData);
      this.accreditSpecPanel.setValues(abiturientAccreditationData);
      this.setEditable(false);
   }

   public String[] getValues(int accreditationType) {
      switch(accreditationType) {
      case 0:
         return this.sertSpecPanel.getValues();
      case 1:
         return this.accreditSpecPanel.getValues();
      default:
         return null;
      }
   }
}
