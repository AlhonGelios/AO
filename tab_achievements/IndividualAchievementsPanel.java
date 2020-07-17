package tab_achievements;

import backend.MessageProcessing;
import backend.ModelDBConnection;
import general_classes.CheckBoxCellRenderer;
import general_classes.GUITableModel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Box.Filler;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import tab_achievements.AcceptRejectEditor;
import tab_achievements.EditWatchRenderer;

public class IndividualAchievementsPanel extends JPanel {

   private String currentAbit;
   private JTable indAchivTable;
   private JButton addNewAchievmentButton;
   private JButton editAchievmentButton;
   private JButton saveAchievmentButton;
   private JButton deleteAchievmentButton;
   private GUITableModel individAchivTM = new GUITableModel();
   private String[] nameIndAchivTest;
   private String[] individAchivColumnNames = new String[]{"Наименование", "Балл", "Подтверждающий документ"};


   public IndividualAchievementsPanel() {
      this.setLayout(new BorderLayout());
      this.indAchivTable = new JTable(this.individAchivTM);
      this.individAchivTM.setDataVector((Object[][])null, this.individAchivColumnNames);
      this.indAchivTable.setAutoResizeMode(1);
      JScrollPane scrPane = new JScrollPane(this.indAchivTable);
      scrPane.setPreferredSize(new Dimension(300, 0));
      this.indAchivTable.setMaximumSize(new Dimension(100, 100));
      this.add(scrPane, "Center");
      this.indAchivTable.setRowHeight(37);
      this.individAchivTM.setDataVector((Object[][])null, this.individAchivColumnNames);
      this.nameIndAchivTest = ModelDBConnection.getNamesFromTableOrderedById("IndividualAchievement");
      this.createCheckboxTable(this.indAchivTable, 0, this.nameIndAchivTest);
      EditWatchRenderer renderer = new EditWatchRenderer(this.indAchivTable);
      this.indAchivTable.getColumnModel().getColumn(2).setCellRenderer(renderer);
      this.indAchivTable.getColumnModel().getColumn(2).setCellEditor(new AcceptRejectEditor(this.indAchivTable));
      this.indAchivTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent e) {
            if(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow() > -1 && IndividualAchievementsPanel.this.individAchivTM.getValueAt(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow(), 0) != null) {
               String[] values = new String[]{IndividualAchievementsPanel.this.currentAbit, "1", null};
               String selectedIndAch = (String)IndividualAchievementsPanel.this.individAchivTM.getValueAt(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow(), 0);

               for(int j = 0; !selectedIndAch.equals(IndividualAchievementsPanel.this.nameIndAchivTest[j]); values[1] = String.valueOf(j + 1)) {
                  ++j;
               }

               values[2] = (String)IndividualAchievementsPanel.this.individAchivTM.getValueAt(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow(), 1);
               ((AcceptRejectEditor)IndividualAchievementsPanel.this.indAchivTable.getColumnModel().getColumn(2).getCellEditor()).setValues(values);
            }

         }
      });
      this.indAchivTable.getModel().addTableModelListener(new TableModelListener() {
         public void tableChanged(TableModelEvent arg0) {
            if(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow() > -1 && IndividualAchievementsPanel.this.indAchivTable.getSelectedRow() < IndividualAchievementsPanel.this.indAchivTable.getRowCount() && IndividualAchievementsPanel.this.individAchivTM.getValueAt(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow(), 0) != null) {
               String[] values = new String[]{IndividualAchievementsPanel.this.currentAbit, "1", null};
               String selectedIndAch = (String)IndividualAchievementsPanel.this.individAchivTM.getValueAt(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow(), 0);

               for(int j = 0; !selectedIndAch.equals(IndividualAchievementsPanel.this.nameIndAchivTest[j]); values[1] = String.valueOf(j + 1)) {
                  ++j;
               }

               values[2] = (String)IndividualAchievementsPanel.this.individAchivTM.getValueAt(IndividualAchievementsPanel.this.indAchivTable.getSelectedRow(), 1);
               ((AcceptRejectEditor)IndividualAchievementsPanel.this.indAchivTable.getColumnModel().getColumn(2).getCellEditor()).setValues(values);
            }

         }
      });
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new BoxLayout(buttonPanel, 1));
      JPanel longButtonPanel = new JPanel();
      longButtonPanel.setLayout(new GridLayout(0, 1));
      this.addNewAchievmentButton = new JButton("Добавить новое достижение");
      this.addNewAchievmentButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            IndividualAchievementsPanel.this.addNewAchievmentButtonActionPerformed(evt);
         }
      });
      longButtonPanel.add(this.addNewAchievmentButton);
      Dimension minSize = new Dimension(5, 10);
      Dimension prefSize = new Dimension(5, 10);
      Dimension maxSize = new Dimension(32767, 100);
      buttonPanel.add(new Filler(minSize, prefSize, maxSize));
      buttonPanel.add(longButtonPanel);
      buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
      JPanel buttonEditSavePanel = new JPanel();
      buttonEditSavePanel.setLayout(new FlowLayout(2));
      this.editAchievmentButton = new JButton("Редактировать");
      this.editAchievmentButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            IndividualAchievementsPanel.this.editAchievmentButtonActionPerformed(evt);
         }
      });
      buttonEditSavePanel.add(this.editAchievmentButton);
      this.saveAchievmentButton = new JButton("Сохранить");
      this.saveAchievmentButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            if(IndividualAchievementsPanel.this.indAchivTable.isEditing()) {
               IndividualAchievementsPanel.this.indAchivTable.getCellEditor().stopCellEditing();
            }

            IndividualAchievementsPanel.this.saveAchievmentButtonActionPerformed(evt);
         }
      });
      buttonEditSavePanel.add(this.saveAchievmentButton);
      this.deleteAchievmentButton = new JButton("Удалить");
      this.deleteAchievmentButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            if(IndividualAchievementsPanel.this.indAchivTable.isEditing()) {
               IndividualAchievementsPanel.this.indAchivTable.getCellEditor().stopCellEditing();
            }

            IndividualAchievementsPanel.this.deleteAchievmentButtonActionPerformed(evt);
         }
      });
      buttonEditSavePanel.add(this.deleteAchievmentButton);
      buttonPanel.add(buttonEditSavePanel);
      this.add(buttonPanel, "Last");
      this.setEditable(false);
   }

   private void addNewAchievmentButtonActionPerformed(ActionEvent evt) {
      try {
         this.individAchivTM.addRow(new String[this.individAchivColumnNames.length]);
      } catch (Exception var3) {
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   private void editAchievmentButtonActionPerformed(ActionEvent evt) {
      try {
         this.setEditable(true);
      } catch (Exception var3) {
         MessageProcessing.displayErrorMessage(this, var3);
      }

   }

   private void deleteAchievmentButtonActionPerformed(ActionEvent evt) {
      try {
         if(this.indAchivTable.getSelectedRow() > -1) {
            String[][] e = ModelDBConnection.getAllAchievmentsByAbiturientId(this.currentAbit, true);
            if(e.length > this.indAchivTable.getSelectedRow()) {
               Vector data = this.individAchivTM.getDataVector();
               String currentIndAchievment = "1";

               for(int data_delete = 0; !((Vector)data.elementAt(this.indAchivTable.getSelectedRow())).toArray()[0].toString().equals(this.nameIndAchivTest[data_delete]); currentIndAchievment = String.valueOf(data_delete + 1)) {
                  ++data_delete;
               }

               String[] var7 = new String[]{this.currentAbit, currentIndAchievment};
               ModelDBConnection.deleteElementInTableByIds("AbiturientIndividualAchievement", var7);
               ModelDBConnection.updateCompetitiveBallsByID(this.currentAbit);
               MessageProcessing.displaySuccessMessage(this, 5);
            }

            this.individAchivTM.removeRow(this.indAchivTable.getSelectedRow());
            this.indAchivTable.clearSelection();
         }
      } catch (Exception var6) {
         MessageProcessing.displayErrorMessage(this, var6);
      }

   }

   private void saveAchievmentButtonActionPerformed(ActionEvent evt) {
      try {
         Vector e = this.individAchivTM.getDataVector();
         String[][] data_new = new String[e.size()][8];
         String[][] data_old = ModelDBConnection.getAllAchievmentsByAbiturientId(this.currentAbit, true);
         int data_old_length = data_old == null?0:data_old.length;
         ArrayList allUniqueAchievments = new ArrayList();
         boolean isAcievmentNameNull = false;
         boolean formatError = false;

         int i;
         int data_delete;
         for(i = 0; i < e.size(); ++i) {
            Object[] tmpdata = ((Vector)e.elementAt(i)).toArray();
            if(tmpdata[0] == null) {
               isAcievmentNameNull = true;
            }

            data_new[i][0] = this.currentAbit;
            data_new[i][1] = "1";

            for(data_delete = 0; !tmpdata[0].toString().equals(this.nameIndAchivTest[data_delete]); data_new[i][1] = String.valueOf(data_delete + 1)) {
               ++data_delete;
            }

            if(!allUniqueAchievments.contains(data_new[i][1])) {
               allUniqueAchievments.add(data_new[i][1]);
            }

            if(tmpdata[1] != null) {
               data_new[i][2] = tmpdata[1].toString().isEmpty()?null:tmpdata[1].toString();
               if(data_new[i][2] != null && !data_new[i][2].matches("^[0-9]+$")) {
                  formatError = true;
               }
            }

            for(data_delete = 3; data_delete < data_new[i].length; ++data_delete) {
               data_new[i][data_delete] = null;
            }

            data_new[i][7] = null;
         }

         if(isAcievmentNameNull) {
            MessageProcessing.displayErrorMessage((Component)null, 40);
         } else if(formatError) {
            MessageProcessing.displayErrorMessage((Component)null, 32);
         } else if(allUniqueAchievments.size() != data_new.length) {
            MessageProcessing.displayErrorMessage((Component)null, 41);
         } else {
            for(i = 0; i < (e.size() <= data_old_length?e.size():data_old_length); ++i) {
               for(data_delete = 3; data_delete < data_new[i].length; ++data_delete) {
                  data_new[i][data_delete] = data_old[i][data_delete];
               }
            }

            for(i = 0; i < data_old_length; ++i) {
               String[] var13 = new String[]{data_old[i][0], data_old[i][1]};
               ModelDBConnection.deleteElementInTableByIds("AbiturientIndividualAchievement", var13);
            }

            for(i = 0; i < e.size(); ++i) {
               ModelDBConnection.updateAbiturientIndividualAchivementByID(data_new[i]);
            }

            ModelDBConnection.updateCompetitiveBallsByID(this.currentAbit);
            MessageProcessing.displaySuccessMessage(this, 4);
            this.indAchivTable.clearSelection();
            this.setValues(this.currentAbit);
            this.setEditable(false);
         }
      } catch (Exception var12) {
         var12.printStackTrace();
         MessageProcessing.displayErrorMessage(this, var12);
      }

   }

   public void setValues(String aid) {
      this.currentAbit = aid;
      this.individAchivTM.setDataVector(ModelDBConnection.getAllAchievmentsByAbiturientId(aid, false), this.individAchivColumnNames);
      String[] nameIndAchivTest = ModelDBConnection.getNamesFromTableOrderedById("IndividualAchievement");
      this.createCheckboxTable(this.indAchivTable, 0, nameIndAchivTest);
      EditWatchRenderer renderer = new EditWatchRenderer(this.indAchivTable);
      this.indAchivTable.getColumnModel().getColumn(2).setCellRenderer(renderer);
      this.indAchivTable.getColumnModel().getColumn(2).setCellEditor(new AcceptRejectEditor(this.indAchivTable));
      this.setEditable(false);
   }

   public void setEditable(boolean state) {
      this.indAchivTable.setEnabled(state);
      this.saveAchievmentButton.setEnabled(state);
      this.addNewAchievmentButton.setEnabled(state);
      this.deleteAchievmentButton.setEnabled(state);
      this.editAchievmentButton.setEnabled(!state);
      if(this.currentAbit == null || this.currentAbit.equals("0")) {
         this.editAchievmentButton.setEnabled(state);
      }

   }

   private void createCheckboxTable(JTable table, int numColumn, String[] dataCheck) {
      TableColumn tmpColumn = table.getColumnModel().getColumn(numColumn);
      JComboBox comboBox = new JComboBox(dataCheck);
      DefaultCellEditor defaultCellEditor = new DefaultCellEditor(comboBox);
      tmpColumn.setCellEditor(defaultCellEditor);
      tmpColumn.setCellRenderer(new CheckBoxCellRenderer(comboBox));
   }

   public String[][] getValues(boolean forDocs) {
      String[][] indAchievments = ModelDBConnection.getAllAchievmentsByAbiturientId(this.currentAbit, true);
      if(forDocs) {
         Vector data = this.individAchivTM.getDataVector();

         for(int i = 0; i < data.size(); ++i) {
            indAchievments[i][1] = ((Vector)data.elementAt(i)).toArray()[0].toString();
         }
      }

      return indAchievments;
   }
}
