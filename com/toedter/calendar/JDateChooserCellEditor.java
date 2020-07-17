package com.toedter.calendar;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.util.Date;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class JDateChooserCellEditor extends AbstractCellEditor implements TableCellEditor {

   private static final long serialVersionUID = 917881575221755609L;
   private JDateChooser dateChooser = new JDateChooser();


   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      Date var6 = null;
      if(var2 instanceof Date) {
         var6 = (Date)var2;
      }

      this.dateChooser.setDate(var6);
      return this.dateChooser;
   }

   public Object getCellEditorValue() {
      return this.dateChooser.getDate();
   }
}
