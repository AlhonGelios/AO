package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTDrawingImpl.1AbsoluteAnchorList;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTDrawingImpl.1OneCellAnchorList;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.CTDrawingImpl.1TwoCellAnchorList;

public class CTDrawingImpl extends XmlComplexContentImpl implements CTDrawing {

   private static final QName TWOCELLANCHOR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "twoCellAnchor");
   private static final QName ONECELLANCHOR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "oneCellAnchor");
   private static final QName ABSOLUTEANCHOR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "absoluteAnchor");


   public CTDrawingImpl(SchemaType var1) {
      super(var1);
   }

   public List getTwoCellAnchorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TwoCellAnchorList(this);
      }
   }

   public CTTwoCellAnchor[] getTwoCellAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TWOCELLANCHOR$0, var2);
         CTTwoCellAnchor[] var3 = new CTTwoCellAnchor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTwoCellAnchor getTwoCellAnchorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwoCellAnchor var3 = null;
         var3 = (CTTwoCellAnchor)this.get_store().find_element_user(TWOCELLANCHOR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTwoCellAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TWOCELLANCHOR$0);
      }
   }

   public void setTwoCellAnchorArray(CTTwoCellAnchor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TWOCELLANCHOR$0);
      }
   }

   public void setTwoCellAnchorArray(int var1, CTTwoCellAnchor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwoCellAnchor var4 = null;
         var4 = (CTTwoCellAnchor)this.get_store().find_element_user(TWOCELLANCHOR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTwoCellAnchor insertNewTwoCellAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwoCellAnchor var3 = null;
         var3 = (CTTwoCellAnchor)this.get_store().insert_element_user(TWOCELLANCHOR$0, var1);
         return var3;
      }
   }

   public CTTwoCellAnchor addNewTwoCellAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwoCellAnchor var2 = null;
         var2 = (CTTwoCellAnchor)this.get_store().add_element_user(TWOCELLANCHOR$0);
         return var2;
      }
   }

   public void removeTwoCellAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TWOCELLANCHOR$0, var1);
      }
   }

   public List getOneCellAnchorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OneCellAnchorList(this);
      }
   }

   public CTOneCellAnchor[] getOneCellAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ONECELLANCHOR$2, var2);
         CTOneCellAnchor[] var3 = new CTOneCellAnchor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOneCellAnchor getOneCellAnchorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOneCellAnchor var3 = null;
         var3 = (CTOneCellAnchor)this.get_store().find_element_user(ONECELLANCHOR$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOneCellAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ONECELLANCHOR$2);
      }
   }

   public void setOneCellAnchorArray(CTOneCellAnchor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ONECELLANCHOR$2);
      }
   }

   public void setOneCellAnchorArray(int var1, CTOneCellAnchor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOneCellAnchor var4 = null;
         var4 = (CTOneCellAnchor)this.get_store().find_element_user(ONECELLANCHOR$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOneCellAnchor insertNewOneCellAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOneCellAnchor var3 = null;
         var3 = (CTOneCellAnchor)this.get_store().insert_element_user(ONECELLANCHOR$2, var1);
         return var3;
      }
   }

   public CTOneCellAnchor addNewOneCellAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOneCellAnchor var2 = null;
         var2 = (CTOneCellAnchor)this.get_store().add_element_user(ONECELLANCHOR$2);
         return var2;
      }
   }

   public void removeOneCellAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ONECELLANCHOR$2, var1);
      }
   }

   public List getAbsoluteAnchorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AbsoluteAnchorList(this);
      }
   }

   public CTAbsoluteAnchor[] getAbsoluteAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ABSOLUTEANCHOR$4, var2);
         CTAbsoluteAnchor[] var3 = new CTAbsoluteAnchor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAbsoluteAnchor getAbsoluteAnchorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbsoluteAnchor var3 = null;
         var3 = (CTAbsoluteAnchor)this.get_store().find_element_user(ABSOLUTEANCHOR$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAbsoluteAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ABSOLUTEANCHOR$4);
      }
   }

   public void setAbsoluteAnchorArray(CTAbsoluteAnchor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ABSOLUTEANCHOR$4);
      }
   }

   public void setAbsoluteAnchorArray(int var1, CTAbsoluteAnchor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbsoluteAnchor var4 = null;
         var4 = (CTAbsoluteAnchor)this.get_store().find_element_user(ABSOLUTEANCHOR$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAbsoluteAnchor insertNewAbsoluteAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbsoluteAnchor var3 = null;
         var3 = (CTAbsoluteAnchor)this.get_store().insert_element_user(ABSOLUTEANCHOR$4, var1);
         return var3;
      }
   }

   public CTAbsoluteAnchor addNewAbsoluteAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbsoluteAnchor var2 = null;
         var2 = (CTAbsoluteAnchor)this.get_store().add_element_user(ABSOLUTEANCHOR$4);
         return var2;
      }
   }

   public void removeAbsoluteAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ABSOLUTEANCHOR$4, var1);
      }
   }

}
