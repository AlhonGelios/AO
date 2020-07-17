package tab_catalogs;

import backend.MessageProcessing;
import backend.ModelDBConnection;
import general_classes.GUITableModel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import tab_catalogs.EditableJTable;

public class EditCatalogElem extends JFrame {

   private JPanel mainPanel;
   private EditableJTable dataTable;
   private GUITableModel currentTM = new GUITableModel();
   private String[] columnNames = new String[]{"id", "Наименование", "Код ФИС"};
   private JButton addBtn;
   private JButton editBtn;
   private JButton saveBtn;
   private JButton deleteBtn;


   public EditCatalogElem(final String table, String title) throws SQLException {
      switch(table.hashCode()) {
      case -2031453514:
         if(table.equals("IndividualAchievement")) {
            this.columnNames = new String[]{"id", "Наименование", "Балл", "Код ФИС"};
         }
         break;
      case -1966257016:
         if(table.equals("EntranceTest")) {
            this.columnNames = new String[]{"id", "Наименование", "Минимальный балл", "Код ФИС"};
         }
         break;
      case -484828494:
         if(table.equals("AdmissionPlan")) {
            this.columnNames = new String[]{"Код специальности", "Форма обучения", "Конкурсная группа", "Целевая организация", "Стандарт образования", "Количество мест"};
         }
         break;
      case 82025960:
         if(table.equals("Users")) {
            this.columnNames = new String[]{"Логин", "Пароль", "Подпись"};
         }
         break;
      case 995511669:
         if(table.equals("Speciality")) {
            this.columnNames = new String[]{"id", "Наименование", "Код направления", "Код по стандарту", "Код ФИС"};
         }
      }

      this.setTitle("Редактирование элементов справочника: " + title);
      this.setDefaultCloseOperation(2);
      this.setBounds(100, 100, 1000, 600);
      this.mainPanel = new JPanel();
      this.mainPanel.setLayout(new BorderLayout());
      this.getContentPane().add(this.mainPanel);
      this.dataTable = new EditableJTable(this.currentTM);
      this.dataTable.setEnabled(false);
      String[][] data = ModelDBConnection.getAllFromTableOrderedById(table);
      this.currentTM.setDataVector(data, this.columnNames);
      JScrollPane scrPane = new JScrollPane(this.dataTable);
      scrPane.setPreferredSize(new Dimension(300, 0));
      this.dataTable.setMaximumSize(new Dimension(100, 100));
      this.dataTable.setRowHeight(25);
      this.dataTable.setColumnEditable(0, false);
      this.mainPanel.add(scrPane, "Center");
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
            EditCatalogElem.this.currentTM.addRow(new String[EditCatalogElem.this.columnNames.length]);
            EditCatalogElem.this.dataTable.setEnabled(true);
            EditCatalogElem.this.addBtn.setEnabled(false);
            EditCatalogElem.this.editBtn.setEnabled(false);
            EditCatalogElem.this.saveBtn.setEnabled(true);
         }
      });
      buttonPanel.add(this.addBtn);
      this.editBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            EditCatalogElem.this.dataTable.setEnabled(true);
            EditCatalogElem.this.addBtn.setEnabled(false);
            EditCatalogElem.this.editBtn.setEnabled(false);
            EditCatalogElem.this.saveBtn.setEnabled(true);
            EditCatalogElem.this.deleteBtn.setEnabled(true);
         }
      });
      buttonPanel.add(this.editBtn);
      this.saveBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(EditCatalogElem.this.dataTable.isEditing()) {
               EditCatalogElem.this.dataTable.getCellEditor().stopCellEditing();
            }

            EditCatalogElem.this.currentTM.fireTableDataChanged();
            EditCatalogElem.this.saveButtonActionPerformed(e, table);
         }
      });
      buttonPanel.add(this.saveBtn);
      this.deleteBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            EditCatalogElem.this.deleteButtonActionPerformed(e, table);
         }
      });
      buttonPanel.add(this.deleteBtn);
      this.mainPanel.add(buttonPanel, "Last");
      this.setPreferredSize(new Dimension(850, 600));
      this.pack();
   }

   private void saveButtonActionPerformed(ActionEvent e, String table) {
      try {
         Vector e1 = this.currentTM.getDataVector();
         String[][] rowData = new String[e1.size()][this.columnNames.length];
         boolean hasNullID = false;
         boolean hasNullNames = false;

         int i;
         for(i = 0; i < e1.size(); ++i) {
            Object[] tmpdata = ((Vector)e1.elementAt(i)).toArray();

            for(int j = 0; j < tmpdata.length; ++j) {
               if(tmpdata[j] != null) {
                  rowData[i][j] = tmpdata[j].toString();
                  if(rowData[i][j].isEmpty()) {
                     rowData[i][j] = null;
                  }
               }
            }

            if(rowData[i][0] == null) {
               hasNullID = true;
            } else if(rowData[i][1] == null) {
               hasNullNames = true;
            }
         }

         ArrayList mistakesIndices = this.checkData(table, rowData);
         if(hasNullID) {
            MessageProcessing.displayErrorMessage((Component)null, 35);
         } else if(hasNullNames) {
            MessageProcessing.displayErrorMessage((Component)null, 36);
         } else if(mistakesIndices.contains(Integer.valueOf(0))) {
            MessageProcessing.displayErrorMessage((Component)null, 31);
         } else if(mistakesIndices.contains(Integer.valueOf(2))) {
            if(!table.equals("EntranceTest") && !table.equals("IndividualAchievement")) {
               if(table.equals("Speciality")) {
                  MessageProcessing.displayErrorMessage((Component)null, 43);
               } else {
                  MessageProcessing.displayErrorMessage((Component)null, 33);
               }
            } else {
               MessageProcessing.displayErrorMessage((Component)null, 32);
            }
         } else if(mistakesIndices.contains(Integer.valueOf(3))) {
            MessageProcessing.displayErrorMessage((Component)null, 33);
         } else if(mistakesIndices.contains(Integer.valueOf(4))) {
            MessageProcessing.displayErrorMessage((Component)null, 33);
         } else if(mistakesIndices.contains(Integer.valueOf(5))) {
            MessageProcessing.displayErrorMessage((Component)null, 44);
         } else if(mistakesIndices.contains(Integer.valueOf(-1))) {
            MessageProcessing.displayErrorMessage((Component)null, 34);
         } else if(mistakesIndices.isEmpty()) {
            for(i = 0; i < e1.size(); ++i) {
               ModelDBConnection.updateElementInTableById(table, rowData[i]);
            }

            MessageProcessing.displaySuccessMessage(this, 4);
            this.dataTable.setEnabled(false);
            this.addBtn.setEnabled(true);
            this.editBtn.setEnabled(true);
            this.saveBtn.setEnabled(false);
            this.deleteBtn.setEnabled(false);
            this.dataTable.clearSelection();
         }
      } catch (SQLException var11) {
         var11.printStackTrace();
         MessageProcessing.displayErrorMessage(this, var11);
      }

   }

   private ArrayList checkData(String table, String[][] rowData) {
      ArrayList mistakesIndices = new ArrayList();
      ArrayList allUniqueIDs = new ArrayList();
      ArrayList allUniqueNames = new ArrayList();

      int i;
      for(i = 0; i < rowData.length; ++i) {
         if(!allUniqueIDs.contains(rowData[i][0])) {
            allUniqueIDs.add(rowData[i][0]);
         }

         if(!allUniqueNames.contains(rowData[i][1])) {
            allUniqueNames.add(rowData[i][1]);
         }
      }

      if(rowData.length != allUniqueIDs.size() || rowData.length != allUniqueNames.size()) {
         mistakesIndices.add(Integer.valueOf(-1));
      }

      if(table.equals("EntranceTest") || table.equals("IndividualAchievement")) {
         for(i = 0; i < rowData.length; ++i) {
            if(rowData[i][3] != null && !rowData[i][3].isEmpty()) {
               rowData[i][3].matches("^[0-9]+$");
            }
         }
      }

      if(table.equals("Speciality")) {
         for(i = 0; i < rowData.length; ++i) {
            if(rowData[i][3] != null && !rowData[i][3].isEmpty() && !rowData[i][3].matches("^[0-9]+\\.[0-9]+\\.[0-9]+$")) {
               mistakesIndices.add(Integer.valueOf(5));
            }
         }
      }

      if(!table.equals("Users")) {
         for(i = 0; i < rowData.length; ++i) {
            if(rowData[i][0] != null && !rowData[i][0].matches("^[0-9]+$")) {
               mistakesIndices.add(Integer.valueOf(0));
            }

            if(rowData[i][2] != null) {
               rowData[i][2].matches("^[0-9]+$");
            }
         }
      }

      return mistakesIndices;
   }

   private void deleteButtonActionPerformed(ActionEvent e, String table) {
      try {
         ModelDBConnection.deleteElementInTableById(table, (String)this.currentTM.getValueAt(this.dataTable.getSelectedRow(), 0));
         MessageProcessing.displaySuccessMessage(this, 5);
         this.currentTM.removeRow(this.dataTable.getSelectedRow());
         this.currentTM.fireTableDataChanged();
      } catch (SQLException var4) {
         var4.printStackTrace();
         MessageProcessing.displayErrorMessage(this, 3);
      }

   }
}
