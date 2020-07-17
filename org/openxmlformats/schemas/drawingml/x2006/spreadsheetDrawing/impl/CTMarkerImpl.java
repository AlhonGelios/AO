package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID;

public class CTMarkerImpl extends XmlComplexContentImpl implements CTMarker {

   private static final QName COL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "col");
   private static final QName COLOFF$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "colOff");
   private static final QName ROW$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "row");
   private static final QName ROWOFF$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "rowOff");


   public CTMarkerImpl(SchemaType var1) {
      super(var1);
   }

   public int getCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(COL$0, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STColID xgetCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColID var2 = null;
         var2 = (STColID)this.get_store().find_element_user(COL$0, 0);
         return var2;
      }
   }

   public void setCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(COL$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(COL$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetCol(STColID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColID var3 = null;
         var3 = (STColID)this.get_store().find_element_user(COL$0, 0);
         if(var3 == null) {
            var3 = (STColID)this.get_store().add_element_user(COL$0);
         }

         var3.set(var1);
      }
   }

   public long getColOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(COLOFF$2, 0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STCoordinate xgetColOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var2 = null;
         var2 = (STCoordinate)this.get_store().find_element_user(COLOFF$2, 0);
         return var2;
      }
   }

   public void setColOff(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(COLOFF$2, 0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_element_user(COLOFF$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetColOff(STCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var3 = null;
         var3 = (STCoordinate)this.get_store().find_element_user(COLOFF$2, 0);
         if(var3 == null) {
            var3 = (STCoordinate)this.get_store().add_element_user(COLOFF$2);
         }

         var3.set(var1);
      }
   }

   public int getRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(ROW$4, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STRowID xgetRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRowID var2 = null;
         var2 = (STRowID)this.get_store().find_element_user(ROW$4, 0);
         return var2;
      }
   }

   public void setRow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ROW$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(ROW$4);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetRow(STRowID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRowID var3 = null;
         var3 = (STRowID)this.get_store().find_element_user(ROW$4, 0);
         if(var3 == null) {
            var3 = (STRowID)this.get_store().add_element_user(ROW$4);
         }

         var3.set(var1);
      }
   }

   public long getRowOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(ROWOFF$6, 0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STCoordinate xgetRowOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var2 = null;
         var2 = (STCoordinate)this.get_store().find_element_user(ROWOFF$6, 0);
         return var2;
      }
   }

   public void setRowOff(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(ROWOFF$6, 0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_element_user(ROWOFF$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetRowOff(STCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var3 = null;
         var3 = (STCoordinate)this.get_store().find_element_user(ROWOFF$6, 0);
         if(var3 == null) {
            var3 = (STCoordinate)this.get_store().add_element_user(ROWOFF$6);
         }

         var3.set(var1);
      }
   }

}
