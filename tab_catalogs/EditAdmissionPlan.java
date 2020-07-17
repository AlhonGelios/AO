package tab_catalogs;

import backend.MessageProcessing;
import backend.ModelDBConnection;
import general_classes.GUITableModel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class EditAdmissionPlan extends JFrame {

   private JPanel mainPanel;
   private JTable dataTable;
   private GUITableModel currentTM = new GUITableModel();
   private String[] arrCouse;
   private String[] arrSpeciality;
   private String[] arrFormEduc;
   private String[] arrCompetGroup;
   private String[] arrOrg;
   private String[] arrStandard;
   private String[] columnNames = new String[]{"Направление", "Специальность", "Форма обучения", "Конкурсная группа", "Целевая организация", "Стандарт", "План"};
   private JButton addBtn;
   private JButton editBtn;
   private JButton saveBtn;
   private JButton deleteBtn;


   public EditAdmissionPlan() {
      this.setTitle("Редактирование плана приема");
      this.setDefaultCloseOperation(2);
      this.setBounds(100, 100, 1000, 600);
      this.mainPanel = new JPanel();
      this.mainPanel.setLayout(new BorderLayout());
      this.add(this.mainPanel);
      new JPanel();
      this.dataTable = new JTable(this.currentTM);
      this.currentTM.setDataVector((Object[][])null, this.columnNames);
      JScrollPane scrPane = new JScrollPane(this.dataTable);
      scrPane.setPreferredSize(new Dimension(300, 0));
      this.dataTable.setMaximumSize(new Dimension(100, 100));
      this.dataTable.setRowHeight(25);
      this.dataTable.getColumnModel().getColumn(this.columnNames.length - 1).setMaxWidth(70);
      this.dataTable.setEnabled(false);
      this.mainPanel.add(scrPane, "Center");
      this.currentTM.setDataVector(ModelDBConnection.getAdmissionPlan(), this.columnNames);
      this.arrCouse = ModelDBConnection.getNamesFromTableOrderedById("Course");
      this.createCheckboxTable(this.dataTable, 0, this.arrCouse);
      this.arrSpeciality = ModelDBConnection.getNamesFromTableOrderedById("Speciality");
      this.createCheckboxTable(this.dataTable, 1, this.arrSpeciality);
      this.arrFormEduc = ModelDBConnection.getNamesFromTableOrderedById("EducationForm");
      this.createCheckboxTable(this.dataTable, 2, this.arrFormEduc);
      this.arrCompetGroup = ModelDBConnection.getNamesFromTableOrderedById("CompetitiveGroup");
      this.createCheckboxTable(this.dataTable, 3, this.arrCompetGroup);
      this.arrOrg = ModelDBConnection.getNamesFromTableOrderedById("TargetOrganisation");
      this.createCheckboxTable(this.dataTable, 4, this.arrOrg);
      this.arrStandard = ModelDBConnection.getNamesFromTableOrderedById("EducationStandard");
      this.createCheckboxTable(this.dataTable, 5, this.arrStandard);
      this.addBtn = new JButton("Добавить");
      this.editBtn = new JButton("Редактировать");
      this.saveBtn = new JButton("Сохранить");
      this.deleteBtn = new JButton("Удалить");
      this.saveBtn.setEnabled(false);
      this.deleteBtn.setEnabled(false);
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout(2));
      this.addBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            EditAdmissionPlan.this.currentTM.addRow(new String[EditAdmissionPlan.this.columnNames.length]);
            EditAdmissionPlan.this.dataTable.setEnabled(true);
            EditAdmissionPlan.this.addBtn.setEnabled(false);
            EditAdmissionPlan.this.editBtn.setEnabled(false);
            EditAdmissionPlan.this.saveBtn.setEnabled(true);
         }
      });
      buttonPanel.add(this.addBtn);
      this.editBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            EditAdmissionPlan.this.dataTable.setEnabled(true);
            EditAdmissionPlan.this.addBtn.setEnabled(false);
            EditAdmissionPlan.this.editBtn.setEnabled(false);
            EditAdmissionPlan.this.saveBtn.setEnabled(true);
            EditAdmissionPlan.this.deleteBtn.setEnabled(true);
         }
      });
      buttonPanel.add(this.editBtn);
      this.saveBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(EditAdmissionPlan.this.dataTable.isEditing()) {
               EditAdmissionPlan.this.dataTable.getCellEditor().stopCellEditing();
            }

            EditAdmissionPlan.this.currentTM.fireTableDataChanged();
            EditAdmissionPlan.this.saveButtonActionPerformed(e);
         }
      });
      buttonPanel.add(this.saveBtn);
      this.deleteBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            EditAdmissionPlan.this.deleteButtonActionPerformed(e);
         }
      });
      buttonPanel.add(this.deleteBtn);
      this.mainPanel.add(buttonPanel, "Last");
      this.setPreferredSize(new Dimension(1000, 500));
      this.pack();
   }

   private void saveButtonActionPerformed(ActionEvent e) {
      try {
         Vector e1 = this.currentTM.getDataVector();
         String[][] admissionPlan = new String[e1.size()][this.columnNames.length];
         boolean formatError = false;
         boolean isPlaceCountNull = false;

         int i;
         for(int hasDublicates = 0; hasDublicates < e1.size(); ++hasDublicates) {
            Object[] tmpdata = ((Vector)e1.elementAt(hasDublicates)).toArray();
            if(tmpdata[0] != null) {
               admissionPlan[hasDublicates][0] = "1";

               for(i = 0; !tmpdata[0].toString().equals(this.arrCouse[i]); admissionPlan[hasDublicates][0] = String.valueOf(i + 1)) {
                  ++i;
               }
            }

            if(tmpdata[1] != null) {
               admissionPlan[hasDublicates][1] = "1";

               for(i = 0; !tmpdata[1].toString().equals(this.arrSpeciality[i]); admissionPlan[hasDublicates][1] = String.valueOf(i + 1)) {
                  ++i;
               }
            }

            if(tmpdata[2] != null) {
               admissionPlan[hasDublicates][2] = "1";

               for(i = 0; !tmpdata[2].toString().equals(this.arrFormEduc[i]); admissionPlan[hasDublicates][2] = String.valueOf(i + 1)) {
                  ++i;
               }
            }

            if(tmpdata[3] != null) {
               admissionPlan[hasDublicates][3] = "1";

               for(i = 0; !tmpdata[3].toString().equals(this.arrCompetGroup[i]); admissionPlan[hasDublicates][3] = String.valueOf(i + 1)) {
                  ++i;
               }
            }

            if(tmpdata[4] != null) {
               admissionPlan[hasDublicates][4] = "1";

               for(i = 0; !tmpdata[4].toString().equals(this.arrOrg[i]); admissionPlan[hasDublicates][4] = String.valueOf(i + 1)) {
                  ++i;
               }
            }

            if(tmpdata[5] != null) {
               admissionPlan[hasDublicates][5] = "1";

               for(i = 0; !tmpdata[5].toString().equals(this.arrStandard[i]); admissionPlan[hasDublicates][5] = String.valueOf(i + 1)) {
                  ++i;
               }
            }

            if(tmpdata[6] != null) {
               admissionPlan[hasDublicates][6] = tmpdata[6].toString().isEmpty()?null:tmpdata[6].toString();
               if(admissionPlan[hasDublicates][6] != null && !admissionPlan[hasDublicates][6].matches("^[0-9]+$")) {
                  formatError = true;
               }
            }

            if(admissionPlan[hasDublicates][6] == null) {
               isPlaceCountNull = true;
            }
         }

         boolean var13 = false;

         for(i = 0; i < admissionPlan.length - 1; ++i) {
            for(int j = i + 1; j < admissionPlan.length; ++j) {
               int similarColumns = 0;

               for(int k = 0; k < admissionPlan[0].length - 1; ++k) {
                  if(admissionPlan[i][k] != null && admissionPlan[j][k] != null) {
                     if(admissionPlan[i][k].equals(admissionPlan[j][k])) {
                        ++similarColumns;
                     }
                  } else if(admissionPlan[i][k] == admissionPlan[j][k]) {
                     ++similarColumns;
                  }
               }

               if(similarColumns >= 6) {
                  var13 = true;
                  break;
               }
            }
         }

         if(var13) {
            MessageProcessing.displayErrorMessage(this, 37);
         } else if(formatError) {
            MessageProcessing.displayErrorMessage(this, 38);
         } else if(isPlaceCountNull) {
            MessageProcessing.displayErrorMessage(this, 39);
         } else {
            ModelDBConnection.deleteElementInTableByExpression("AdmissionPlan", (String[])null, 0);

            for(i = 0; i < admissionPlan.length; ++i) {
               ModelDBConnection.updateElementInTableByExpression("AdmissionPlan", admissionPlan[i], 6);
            }

            MessageProcessing.displaySuccessMessage(this, 4);
            this.dataTable.setEnabled(false);
            this.addBtn.setEnabled(true);
            this.editBtn.setEnabled(true);
            this.saveBtn.setEnabled(false);
            this.deleteBtn.setEnabled(false);
            this.dataTable.clearSelection();
         }
      } catch (SQLException var12) {
         MessageProcessing.displayErrorMessage(this, 2);
      }

   }

   private void deleteButtonActionPerformed(ActionEvent e) {
      try {
         Vector e1 = this.currentTM.getDataVector();
         String[] rowData = new String[this.columnNames.length];
         Object[] tmpdata = ((Vector)e1.elementAt(this.dataTable.getSelectedRow())).toArray();
         int j;
         if(tmpdata[0] != null) {
            rowData[0] = "1";

            for(j = 0; !tmpdata[0].toString().equals(this.arrCouse[j]); rowData[0] = String.valueOf(j + 1)) {
               ++j;
            }
         }

         if(tmpdata[1] != null) {
            rowData[1] = "1";

            for(j = 0; !tmpdata[1].toString().equals(this.arrSpeciality[j]); rowData[1] = String.valueOf(j + 1)) {
               ++j;
            }
         }

         if(tmpdata[2] != null) {
            rowData[2] = "1";

            for(j = 0; !tmpdata[2].toString().equals(this.arrFormEduc[j]); rowData[2] = String.valueOf(j + 1)) {
               ++j;
            }
         }

         if(tmpdata[3] != null) {
            rowData[3] = "1";

            for(j = 0; !tmpdata[3].toString().equals(this.arrCompetGroup[j]); rowData[3] = String.valueOf(j + 1)) {
               ++j;
            }
         }

         if(tmpdata[4] != null) {
            rowData[4] = "1";

            for(j = 0; !tmpdata[4].toString().equals(this.arrOrg[j]); rowData[4] = String.valueOf(j + 1)) {
               ++j;
            }
         }

         if(tmpdata[5] != null) {
            rowData[5] = "1";

            for(j = 0; !tmpdata[5].toString().equals(this.arrStandard[j]); rowData[5] = String.valueOf(j + 1)) {
               ++j;
            }
         }

         if(tmpdata[6] != null) {
            rowData[6] = tmpdata[6].toString();
         }

         ModelDBConnection.deleteElementInTableByExpression("AdmissionPlan", rowData, 6);
         MessageProcessing.displaySuccessMessage(this, 5);
         this.currentTM.removeRow(this.dataTable.getSelectedRow());
         this.currentTM.fireTableDataChanged();
      } catch (SQLException var6) {
         var6.printStackTrace();
         MessageProcessing.displayErrorMessage(this, 3);
      }

   }

   private void createCheckboxTable(JTable table, int numColumn, String[] dataCheck) {
      TableColumn tmpColumn = table.getColumnModel().getColumn(numColumn);
      JComboBox comboBox = new JComboBox(dataCheck);
      DefaultCellEditor defaultCellEditor = new DefaultCellEditor(comboBox);
      tmpColumn.setCellEditor(defaultCellEditor);
      tmpColumn.setCellRenderer(new EditAdmissionPlan.CheckBoxCellRenderer(comboBox));
   }

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ModelDBConnection.setConnectionParameters("MSServer", "localhost", "Ordinator", "user", "password");
               ModelDBConnection.initConnection();
               EditAdmissionPlan e = new EditAdmissionPlan();
               e.setVisible(true);
            } catch (Exception var2) {
               var2.printStackTrace();
            }

         }
      });
   }

   class CheckBoxCellRenderer implements TableCellRenderer {

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
}
