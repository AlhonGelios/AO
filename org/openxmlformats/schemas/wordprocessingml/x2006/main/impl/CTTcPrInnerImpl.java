package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTcPrBaseImpl;

public class CTTcPrInnerImpl extends CTTcPrBaseImpl implements CTTcPrInner {

   private static final QName CELLINS$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cellIns");
   private static final QName CELLDEL$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cellDel");
   private static final QName CELLMERGE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cellMerge");


   public CTTcPrInnerImpl(SchemaType var1) {
      super(var1);
   }

   public CTTrackChange getCellIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(CELLINS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCellIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELLINS$0) != 0;
      }
   }

   public void setCellIns(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CELLINS$0, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(CELLINS$0);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewCellIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CELLINS$0);
         return var2;
      }
   }

   public void unsetCellIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELLINS$0, 0);
      }
   }

   public CTTrackChange getCellDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(CELLDEL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCellDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELLDEL$2) != 0;
      }
   }

   public void setCellDel(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(CELLDEL$2, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(CELLDEL$2);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewCellDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(CELLDEL$2);
         return var2;
      }
   }

   public void unsetCellDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELLDEL$2, 0);
      }
   }

   public CTCellMergeTrackChange getCellMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellMergeTrackChange var2 = null;
         var2 = (CTCellMergeTrackChange)this.get_store().find_element_user(CELLMERGE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCellMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELLMERGE$4) != 0;
      }
   }

   public void setCellMerge(CTCellMergeTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellMergeTrackChange var3 = null;
         var3 = (CTCellMergeTrackChange)this.get_store().find_element_user(CELLMERGE$4, 0);
         if(var3 == null) {
            var3 = (CTCellMergeTrackChange)this.get_store().add_element_user(CELLMERGE$4);
         }

         var3.set(var1);
      }
   }

   public CTCellMergeTrackChange addNewCellMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellMergeTrackChange var2 = null;
         var2 = (CTCellMergeTrackChange)this.get_store().add_element_user(CELLMERGE$4);
         return var2;
      }
   }

   public void unsetCellMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELLMERGE$4, 0);
      }
   }

}
