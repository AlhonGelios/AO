package tab_competitive_groups;

import backend.MessageProcessing;
import backend.ModelDBConnection;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import tab_competitive_groups.CompetitiveGroupsPanel;

public class AddNewCompetitiveGroup extends JFrame {

   private JPanel parentPanel;
   private String currentAbit;
   private String priority;
   private JPanel mainPanel;
   private JPanel infoPanel;
   private JPanel directPanel;
   private JPanel specialityPanel;
   private JPanel departmentPanel;
   private JPanel orgPanel;
   private JPanel educFormPanel;
   private JPanel competGroupPanel;
   private JPanel provisionPanel;
   private JPanel panelDateProvide;
   private JButton saveCompetitiveGroupButton;
   private JButton editCompetitiveGroupButton;
   private JButton deleteCompetitiveGroupButton;
   private JComboBox comboCompetGroupType;
   private JComboBox comboStandardType;
   JCheckBox originalBox;
   private JDateChooser calendar;
   private Dimension dimRigidArea = new Dimension(20, 0);
   private String[] directType;
   private String[] specialityType;
   private String[] departmentType;
   private String[] orgType;
   private String[] educFormType;
   private String[] competGroupType;
   private String[] standardType;


   public AddNewCompetitiveGroup(JPanel parentPanel) {
      this.parentPanel = parentPanel;
      this.directType = ModelDBConnection.getNamesFromTableOrderedById("Course");
      this.specialityType = ModelDBConnection.getNamesFromTableOrderedById("Speciality");
      this.departmentType = ModelDBConnection.getNamesFromTableOrderedById("Chair");
      this.orgType = ModelDBConnection.getNamesFromTableOrderedById("TargetOrganisation");
      this.educFormType = ModelDBConnection.getNamesFromTableOrderedById("EducationForm");
      this.competGroupType = ModelDBConnection.getNamesFromTableOrderedById("CompetitiveGroup");
      this.standardType = ModelDBConnection.getNamesFromTableOrderedById("EducationStandard");
      this.setTitle("Добавление новой конкурсной группы");
      this.setDefaultCloseOperation(2);
      this.setBounds(100, 100, 1000, 600);
      this.mainPanel = new JPanel();
      this.mainPanel.setLayout(new BoxLayout(this.mainPanel, 3));
      this.add(this.mainPanel);
      this.infoPanel = new JPanel();
      this.infoPanel.setLayout(new BoxLayout(this.infoPanel, 3));
      this.mainPanel.add(this.infoPanel);
      this.directPanel = new JPanel();
      this.directPanel = this.createCheckBoxPanel("Направление", this.directType);
      this.infoPanel.add(this.directPanel);
      this.specialityPanel = new JPanel();
      this.specialityPanel = this.createCheckBoxPanel("Специальность", this.specialityType);
      this.infoPanel.add(this.specialityPanel);
      this.departmentPanel = new JPanel();
      this.departmentPanel = this.createCheckBoxPanel("Кафедра", this.departmentType);
      this.infoPanel.add(this.departmentPanel);
      this.competGroupPanel = new JPanel();
      this.competGroupPanel.setLayout(new FlowLayout(0));
      JLabel competGroupLabel = new JLabel("Конкурсная группа");
      this.competGroupPanel.add(competGroupLabel);
      this.comboCompetGroupType = new JComboBox(this.competGroupType);
      this.comboCompetGroupType.setSelectedIndex(-1);
      this.competGroupPanel.add(this.comboCompetGroupType);
      this.comboCompetGroupType.setPreferredSize(new Dimension(280, 30));
      this.competGroupPanel.add(Box.createRigidArea(this.dimRigidArea));
      JLabel standardLabel = new JLabel("Стандарт");
      this.competGroupPanel.add(standardLabel);
      this.comboStandardType = new JComboBox(this.standardType);
      this.competGroupPanel.add(this.comboStandardType);
      this.comboStandardType.setSelectedIndex(-1);
      this.infoPanel.add(this.competGroupPanel);
      this.orgPanel = new JPanel();
      this.orgPanel = this.createCheckBoxPanel("Организация", this.orgType);
      this.infoPanel.add(this.orgPanel);
      this.educFormPanel = new JPanel();
      this.educFormPanel = this.createCheckBoxPanel("Форма обучения", this.educFormType);
      ((JComboBox)this.educFormPanel.getComponent(1)).setSelectedItem("очная");
      this.infoPanel.add(this.educFormPanel);
      this.provisionPanel = new JPanel();
      this.provisionPanel.setBorder(new TitledBorder((Border)null, "Сведения о предоставлении оригиналов документов", 4, 2, (Font)null, (Color)null));
      this.provisionPanel.setLayout(new FlowLayout(0));
      this.panelDateProvide = new JPanel();
      this.panelDateProvide.setLayout(new FlowLayout());
      this.panelDateProvide.setAlignmentY(0.0F);
      JLabel dateProvideLabel = new JLabel("Дата предоставления:");
      this.panelDateProvide.add(dateProvideLabel);
      this.calendar = new JDateChooser("dd.MM.yyyy", "##.##.####", '_');
      this.calendar.setEnabled(false);
      this.calendar.setFont(new Font("Dialog", 0, 11));
      this.panelDateProvide.add(this.calendar);
      this.panelDateProvide.add(Box.createRigidArea(this.dimRigidArea));
      this.panelDateProvide.setPreferredSize(new Dimension(350, 30));
      this.provisionPanel.add(this.panelDateProvide);
      this.originalBox = new JCheckBox("Предоставил оригинал");
      this.originalBox.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
            if(AddNewCompetitiveGroup.this.originalBox.isSelected()) {
               AddNewCompetitiveGroup.this.calendar.setEnabled(true);
               AddNewCompetitiveGroup.this.calendar.setDate(new Date());
            } else {
               AddNewCompetitiveGroup.this.calendar.setDate((Date)null);
               AddNewCompetitiveGroup.this.calendar.setEnabled(false);
            }

         }
      });
      this.provisionPanel.add(this.originalBox);
      this.infoPanel.add(this.provisionPanel);
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout(2));
      this.saveCompetitiveGroupButton = new JButton("Сохранить");
      this.saveCompetitiveGroupButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddNewCompetitiveGroup.this.saveCompetitiveGroupButtonActionPerformed(evt);
         }
      });
      buttonPanel.add(this.saveCompetitiveGroupButton);
      this.mainPanel.add(buttonPanel);
      this.setPreferredSize(new Dimension(580, 380));
      this.pack();
   }

   private JPanel createCheckBoxPanel(String name, String[] arrCheckBox) {
      JPanel checkboxPanel = new JPanel();
      checkboxPanel.setLayout(new FlowLayout(0));
      JLabel checkboxLabel = new JLabel(name);
      checkboxPanel.add(checkboxLabel);
      Dimension comboBoxPrefferedSize = null;
      switch(name.hashCode()) {
      case -2013223284:
         if(name.equals("Стандарт")) {
            comboBoxPrefferedSize = new Dimension(100, 30);
         }
         break;
      case -1707725631:
         if(name.equals("Конкурсная группа")) {
            comboBoxPrefferedSize = new Dimension(150, 30);
         }
         break;
      case -1431311438:
         if(name.equals("Специальность")) {
            comboBoxPrefferedSize = new Dimension(450, 30);
         }
         break;
      case 1513315402:
         if(name.equals("Направление")) {
            comboBoxPrefferedSize = new Dimension(462, 30);
         }
         break;
      case 1538279293:
         if(name.equals("Кафедра")) {
            comboBoxPrefferedSize = new Dimension(488, 30);
         }
         break;
      case 2082124554:
         if(name.equals("Организация")) {
            comboBoxPrefferedSize = new Dimension(466, 30);
         }
      }

      JComboBox comboType = new JComboBox(arrCheckBox);
      comboType.setPreferredSize(comboBoxPrefferedSize);
      checkboxPanel.add(comboType);
      comboType.setSelectedIndex(-1);
      return checkboxPanel;
   }

   public JPanel getAddNewCompetGroup() {
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout(2));
      this.editCompetitiveGroupButton = new JButton("Редактировать");
      this.editCompetitiveGroupButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddNewCompetitiveGroup.this.editCompetitiveGroupButtonActionPerformed(evt);
         }
      });
      buttonPanel.add(this.editCompetitiveGroupButton);
      this.deleteCompetitiveGroupButton = new JButton("Удалить");
      this.deleteCompetitiveGroupButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddNewCompetitiveGroup.this.deleteCompetitiveGroupButtonActionPerformed(evt);
         }
      });
      buttonPanel.add(this.deleteCompetitiveGroupButton);
      this.infoPanel.add(buttonPanel);
      return this.infoPanel;
   }

   private void saveCompetitiveGroupButtonActionPerformed(ActionEvent evt) {
      try {
         String[] e = this.getValues(false);
         if(e[1].equals("0")) {
            MessageProcessing.displayErrorMessage((Component)null, 24);
         } else if(e[2].equals("0")) {
            MessageProcessing.displayErrorMessage((Component)null, 25);
         } else if(e[3].equals("0")) {
            MessageProcessing.displayErrorMessage((Component)null, 26);
         } else if(e[4].equals("0")) {
            MessageProcessing.displayErrorMessage((Component)null, 27);
         } else if(e[5].equals("0")) {
            MessageProcessing.displayErrorMessage((Component)null, 28);
         } else if(e[7].equals("0")) {
            MessageProcessing.displayErrorMessage((Component)null, 29);
         } else {
            boolean isDuplicated = false;
            String[] newCompetitiveGroupWithDetails = this.getValues(true);
            String[][] allCompetitiveGroups = ((CompetitiveGroupsPanel)this.parentPanel).getAllCompetitiveGroups();

            for(int i = 0; i < allCompetitiveGroups.length; ++i) {
               if(allCompetitiveGroups[i][0].equals(newCompetitiveGroupWithDetails[1]) && allCompetitiveGroups[i][1].equals(newCompetitiveGroupWithDetails[2]) && allCompetitiveGroups[i][3].equals(newCompetitiveGroupWithDetails[5]) && allCompetitiveGroups[i][4].equals(newCompetitiveGroupWithDetails[3])) {
                  isDuplicated = true;
                  break;
               }
            }

            if(isDuplicated) {
               MessageProcessing.displayErrorMessage((Component)null, 30);
            } else {
               ModelDBConnection.updateAbiturientCompetitiveGroupByID(e);
               this.setVisible(false);
               ModelDBConnection.updateCompetitiveBallsByID(this.currentAbit);
               ((CompetitiveGroupsPanel)this.parentPanel).setValues(this.currentAbit);
               MessageProcessing.displaySuccessMessage((Component)null, 11);
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
         MessageProcessing.displayErrorMessage(this, var7);
      }

   }

   private void editCompetitiveGroupButtonActionPerformed(ActionEvent evt) {
      try {
         if(this.editCompetitiveGroupButton.getText().equals("Редактировать")) {
            this.calendar.setEnabled(this.originalBox.isSelected());
            this.originalBox.setEnabled(true);
            this.deleteCompetitiveGroupButton.setEnabled(false);
            this.editCompetitiveGroupButton.setText("    Сохранить     ");
         } else if(((CompetitiveGroupsPanel)this.parentPanel).getCountOfSelectedOriginalBox() > 1) {
            MessageProcessing.displayErrorMessage(this, 42);
         } else {
            ModelDBConnection.updateAbiturientCompetitiveGroupByID(this.getValues(false));
            ModelDBConnection.updateCompetitiveBallsByID(this.currentAbit);
            this.calendar.setEnabled(false);
            this.originalBox.setEnabled(false);
            this.deleteCompetitiveGroupButton.setEnabled(true);
            this.editCompetitiveGroupButton.setText("Редактировать");
            MessageProcessing.displaySuccessMessage((Component)null, 13);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   private void deleteCompetitiveGroupButtonActionPerformed(ActionEvent evt) {
      try {
         ModelDBConnection.deleteAbiturientCompetitiveGroupByID(this.currentAbit, this.getValues(false));
         ((CompetitiveGroupsPanel)this.parentPanel).setValues(this.currentAbit);
         MessageProcessing.displaySuccessMessage((Component)null, 12);
      } catch (Exception var3) {
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   public void setValues(String[] values) {
      try {
         this.currentAbit = values[0];
         this.priority = String.valueOf(ModelDBConnection.getCountForAbitID("AbiturientCompetitiveGroup", this.currentAbit) + 1);
         if(values.length > 1) {
            ((JComboBox)this.directPanel.getComponent(1)).setSelectedIndex(Integer.valueOf(values[1]).intValue() - 1);
            ((JComboBox)this.specialityPanel.getComponent(1)).setSelectedIndex(Integer.valueOf(values[2]).intValue() - 1);
            ((JComboBox)this.educFormPanel.getComponent(1)).setSelectedIndex(Integer.valueOf(values[3]).intValue() - 1);
            ((JComboBox)this.departmentPanel.getComponent(1)).setSelectedIndex(Integer.valueOf(values[4]).intValue() - 1);
            this.comboCompetGroupType.setSelectedIndex(Integer.valueOf(values[5]).intValue() - 1);
            ((JComboBox)this.orgPanel.getComponent(1)).setSelectedIndex(values[6] != null?Integer.valueOf(values[6]).intValue() - 1:-1);
            this.comboStandardType.setSelectedIndex(Integer.valueOf(values[7]).intValue() - 1);
            if(values[10] != null) {
               SimpleDateFormat e = new SimpleDateFormat("yyyy-MM-dd");
               Date date = e.parse(values[10]);
               this.calendar.setDate(date);
            }

            this.originalBox.setSelected(values[10] != null);
            this.priority = values[16];
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         MessageProcessing.displayErrorMessage(this, var4);
      }

   }

   public String[] getValues(boolean forDocs) {
      String[] values = new String[]{this.currentAbit, forDocs?((JComboBox)this.directPanel.getComponent(1)).getSelectedItem().toString():String.valueOf(((JComboBox)this.directPanel.getComponent(1)).getSelectedIndex() + 1), forDocs?((JComboBox)this.specialityPanel.getComponent(1)).getSelectedItem().toString():String.valueOf(((JComboBox)this.specialityPanel.getComponent(1)).getSelectedIndex() + 1), forDocs?((JComboBox)this.educFormPanel.getComponent(1)).getSelectedItem().toString():String.valueOf(((JComboBox)this.educFormPanel.getComponent(1)).getSelectedIndex() + 1), forDocs?((JComboBox)this.departmentPanel.getComponent(1)).getSelectedItem().toString():String.valueOf(((JComboBox)this.departmentPanel.getComponent(1)).getSelectedIndex() + 1), forDocs?this.comboCompetGroupType.getSelectedItem().toString():String.valueOf(this.comboCompetGroupType.getSelectedIndex() + 1), forDocs?(((JComboBox)this.orgPanel.getComponent(1)).getSelectedItem() != null?((JComboBox)this.orgPanel.getComponent(1)).getSelectedItem().toString():null):(((JComboBox)this.orgPanel.getComponent(1)).getSelectedIndex() > -1?String.valueOf(((JComboBox)this.orgPanel.getComponent(1)).getSelectedIndex() + 1):null), forDocs?this.comboStandardType.getSelectedItem().toString():String.valueOf(this.comboStandardType.getSelectedIndex() + 1), null, null, this.originalBox.isSelected()?(new SimpleDateFormat("dd.MM.yyyy")).format(this.calendar.getDate()).toString():null, this.priority, null};
      return values;
   }

   public void setEditable(boolean state) {
      ((JComboBox)this.directPanel.getComponent(1)).setEnabled(state);
      ((JComboBox)this.directPanel.getComponent(1)).setEditable(!state);
      ((JComboBox)this.specialityPanel.getComponent(1)).setEnabled(state);
      ((JComboBox)this.specialityPanel.getComponent(1)).setEditable(!state);
      ((JComboBox)this.educFormPanel.getComponent(1)).setEnabled(state);
      ((JComboBox)this.educFormPanel.getComponent(1)).setEditable(!state);
      ((JComboBox)this.departmentPanel.getComponent(1)).setEnabled(state);
      ((JComboBox)this.departmentPanel.getComponent(1)).setEditable(!state);
      this.comboCompetGroupType.setEnabled(state);
      this.comboCompetGroupType.setEditable(!state);
      ((JComboBox)this.orgPanel.getComponent(1)).setEnabled(state);
      ((JComboBox)this.orgPanel.getComponent(1)).setEditable(!state);
      this.comboStandardType.setEnabled(state);
      this.comboStandardType.setEditable(!state);
      this.calendar.setEnabled(state);
      this.originalBox.setEnabled(state);
   }
}
