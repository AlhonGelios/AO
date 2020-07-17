package com.toedter.calendar.demo;

import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class DemoTable extends JPanel {

   private static final long serialVersionUID = -2823838920746867592L;


   public DemoTable() {
      super(new GridLayout(1, 0));
      this.setName("DemoTable");
      JTable var1 = new JTable(new DemoTable.DemoTableModel());
      var1.setPreferredScrollableViewportSize(new Dimension(180, 32));
      var1.setDefaultEditor(Date.class, new JDateChooserCellEditor());
      JScrollPane var2 = new JScrollPane(var1);
      this.add(var2);
   }

   class DemoTableModel extends AbstractTableModel {

      private static final long serialVersionUID = 3283465559187131559L;
      private final String[] columnNames = new String[]{"Empty Date", "Date set"};
      private final Object[][] data = new Object[][]{{null, new Date()}, {null, new Date()}};


      public int getColumnCount() {
         return this.columnNames.length;
      }

      public int getRowCount() {
         return this.data.length;
      }

      public String getColumnName(int var1) {
         return this.columnNames[var1];
      }

      public Object getValueAt(int var1, int var2) {
         return this.data[var1][var2];
      }

      public Class getColumnClass(int var1) {
         return this.getValueAt(0, 1).getClass();
      }

      public boolean isCellEditable(int var1, int var2) {
         return true;
      }

      public void setValueAt(Object var1, int var2, int var3) {
         this.data[var2][var3] = var1;
         this.fireTableCellUpdated(var2, var3);
      }
   }
}
