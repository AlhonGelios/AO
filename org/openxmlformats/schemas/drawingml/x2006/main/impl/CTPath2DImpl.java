package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode$Enum;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DImpl.1ArcToList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DImpl.1CloseList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DImpl.1CubicBezToList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DImpl.1LnToList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DImpl.1MoveToList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTPath2DImpl.1QuadBezToList;

public class CTPath2DImpl extends XmlComplexContentImpl implements CTPath2D {

   private static final QName CLOSE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "close");
   private static final QName MOVETO$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "moveTo");
   private static final QName LNTO$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnTo");
   private static final QName ARCTO$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "arcTo");
   private static final QName QUADBEZTO$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "quadBezTo");
   private static final QName CUBICBEZTO$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cubicBezTo");
   private static final QName W$12 = new QName("", "w");
   private static final QName H$14 = new QName("", "h");
   private static final QName FILL$16 = new QName("", "fill");
   private static final QName STROKE$18 = new QName("", "stroke");
   private static final QName EXTRUSIONOK$20 = new QName("", "extrusionOk");


   public CTPath2DImpl(SchemaType var1) {
      super(var1);
   }

   public List getCloseList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CloseList(this);
      }
   }

   public CTPath2DClose[] getCloseArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CLOSE$0, var2);
         CTPath2DClose[] var3 = new CTPath2DClose[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath2DClose getCloseArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DClose var3 = null;
         var3 = (CTPath2DClose)this.get_store().find_element_user(CLOSE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCloseArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLOSE$0);
      }
   }

   public void setCloseArray(CTPath2DClose[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CLOSE$0);
      }
   }

   public void setCloseArray(int var1, CTPath2DClose var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DClose var4 = null;
         var4 = (CTPath2DClose)this.get_store().find_element_user(CLOSE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath2DClose insertNewClose(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DClose var3 = null;
         var3 = (CTPath2DClose)this.get_store().insert_element_user(CLOSE$0, var1);
         return var3;
      }
   }

   public CTPath2DClose addNewClose() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DClose var2 = null;
         var2 = (CTPath2DClose)this.get_store().add_element_user(CLOSE$0);
         return var2;
      }
   }

   public void removeClose(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLOSE$0, var1);
      }
   }

   public List getMoveToList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveToList(this);
      }
   }

   public CTPath2DMoveTo[] getMoveToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVETO$2, var2);
         CTPath2DMoveTo[] var3 = new CTPath2DMoveTo[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath2DMoveTo getMoveToArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DMoveTo var3 = null;
         var3 = (CTPath2DMoveTo)this.get_store().find_element_user(MOVETO$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVETO$2);
      }
   }

   public void setMoveToArray(CTPath2DMoveTo[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVETO$2);
      }
   }

   public void setMoveToArray(int var1, CTPath2DMoveTo var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DMoveTo var4 = null;
         var4 = (CTPath2DMoveTo)this.get_store().find_element_user(MOVETO$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath2DMoveTo insertNewMoveTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DMoveTo var3 = null;
         var3 = (CTPath2DMoveTo)this.get_store().insert_element_user(MOVETO$2, var1);
         return var3;
      }
   }

   public CTPath2DMoveTo addNewMoveTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DMoveTo var2 = null;
         var2 = (CTPath2DMoveTo)this.get_store().add_element_user(MOVETO$2);
         return var2;
      }
   }

   public void removeMoveTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETO$2, var1);
      }
   }

   public List getLnToList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LnToList(this);
      }
   }

   public CTPath2DLineTo[] getLnToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LNTO$4, var2);
         CTPath2DLineTo[] var3 = new CTPath2DLineTo[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath2DLineTo getLnToArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DLineTo var3 = null;
         var3 = (CTPath2DLineTo)this.get_store().find_element_user(LNTO$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLnToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNTO$4);
      }
   }

   public void setLnToArray(CTPath2DLineTo[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LNTO$4);
      }
   }

   public void setLnToArray(int var1, CTPath2DLineTo var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DLineTo var4 = null;
         var4 = (CTPath2DLineTo)this.get_store().find_element_user(LNTO$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath2DLineTo insertNewLnTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DLineTo var3 = null;
         var3 = (CTPath2DLineTo)this.get_store().insert_element_user(LNTO$4, var1);
         return var3;
      }
   }

   public CTPath2DLineTo addNewLnTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DLineTo var2 = null;
         var2 = (CTPath2DLineTo)this.get_store().add_element_user(LNTO$4);
         return var2;
      }
   }

   public void removeLnTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNTO$4, var1);
      }
   }

   public List getArcToList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ArcToList(this);
      }
   }

   public CTPath2DArcTo[] getArcToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ARCTO$6, var2);
         CTPath2DArcTo[] var3 = new CTPath2DArcTo[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath2DArcTo getArcToArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DArcTo var3 = null;
         var3 = (CTPath2DArcTo)this.get_store().find_element_user(ARCTO$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfArcToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ARCTO$6);
      }
   }

   public void setArcToArray(CTPath2DArcTo[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ARCTO$6);
      }
   }

   public void setArcToArray(int var1, CTPath2DArcTo var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DArcTo var4 = null;
         var4 = (CTPath2DArcTo)this.get_store().find_element_user(ARCTO$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath2DArcTo insertNewArcTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DArcTo var3 = null;
         var3 = (CTPath2DArcTo)this.get_store().insert_element_user(ARCTO$6, var1);
         return var3;
      }
   }

   public CTPath2DArcTo addNewArcTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DArcTo var2 = null;
         var2 = (CTPath2DArcTo)this.get_store().add_element_user(ARCTO$6);
         return var2;
      }
   }

   public void removeArcTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ARCTO$6, var1);
      }
   }

   public List getQuadBezToList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1QuadBezToList(this);
      }
   }

   public CTPath2DQuadBezierTo[] getQuadBezToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(QUADBEZTO$8, var2);
         CTPath2DQuadBezierTo[] var3 = new CTPath2DQuadBezierTo[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath2DQuadBezierTo getQuadBezToArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DQuadBezierTo var3 = null;
         var3 = (CTPath2DQuadBezierTo)this.get_store().find_element_user(QUADBEZTO$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfQuadBezToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(QUADBEZTO$8);
      }
   }

   public void setQuadBezToArray(CTPath2DQuadBezierTo[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, QUADBEZTO$8);
      }
   }

   public void setQuadBezToArray(int var1, CTPath2DQuadBezierTo var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DQuadBezierTo var4 = null;
         var4 = (CTPath2DQuadBezierTo)this.get_store().find_element_user(QUADBEZTO$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath2DQuadBezierTo insertNewQuadBezTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DQuadBezierTo var3 = null;
         var3 = (CTPath2DQuadBezierTo)this.get_store().insert_element_user(QUADBEZTO$8, var1);
         return var3;
      }
   }

   public CTPath2DQuadBezierTo addNewQuadBezTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DQuadBezierTo var2 = null;
         var2 = (CTPath2DQuadBezierTo)this.get_store().add_element_user(QUADBEZTO$8);
         return var2;
      }
   }

   public void removeQuadBezTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(QUADBEZTO$8, var1);
      }
   }

   public List getCubicBezToList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CubicBezToList(this);
      }
   }

   public CTPath2DCubicBezierTo[] getCubicBezToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CUBICBEZTO$10, var2);
         CTPath2DCubicBezierTo[] var3 = new CTPath2DCubicBezierTo[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath2DCubicBezierTo getCubicBezToArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DCubicBezierTo var3 = null;
         var3 = (CTPath2DCubicBezierTo)this.get_store().find_element_user(CUBICBEZTO$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCubicBezToArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUBICBEZTO$10);
      }
   }

   public void setCubicBezToArray(CTPath2DCubicBezierTo[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CUBICBEZTO$10);
      }
   }

   public void setCubicBezToArray(int var1, CTPath2DCubicBezierTo var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DCubicBezierTo var4 = null;
         var4 = (CTPath2DCubicBezierTo)this.get_store().find_element_user(CUBICBEZTO$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath2DCubicBezierTo insertNewCubicBezTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DCubicBezierTo var3 = null;
         var3 = (CTPath2DCubicBezierTo)this.get_store().insert_element_user(CUBICBEZTO$10, var1);
         return var3;
      }
   }

   public CTPath2DCubicBezierTo addNewCubicBezTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DCubicBezierTo var2 = null;
         var2 = (CTPath2DCubicBezierTo)this.get_store().add_element_user(CUBICBEZTO$10);
         return var2;
      }
   }

   public void removeCubicBezTo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUBICBEZTO$10, var1);
      }
   }

   public long getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(W$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(W$12);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STPositiveCoordinate xgetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var2 = null;
         var2 = (STPositiveCoordinate)this.get_store().find_attribute_user(W$12);
         if(var2 == null) {
            var2 = (STPositiveCoordinate)this.get_default_attribute_value(W$12);
         }

         return var2;
      }
   }

   public boolean isSetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(W$12) != null;
      }
   }

   public void setW(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(W$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(W$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetW(STPositiveCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var3 = null;
         var3 = (STPositiveCoordinate)this.get_store().find_attribute_user(W$12);
         if(var3 == null) {
            var3 = (STPositiveCoordinate)this.get_store().add_attribute_user(W$12);
         }

         var3.set(var1);
      }
   }

   public void unsetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(W$12);
      }
   }

   public long getH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(H$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(H$14);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STPositiveCoordinate xgetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var2 = null;
         var2 = (STPositiveCoordinate)this.get_store().find_attribute_user(H$14);
         if(var2 == null) {
            var2 = (STPositiveCoordinate)this.get_default_attribute_value(H$14);
         }

         return var2;
      }
   }

   public boolean isSetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(H$14) != null;
      }
   }

   public void setH(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(H$14);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(H$14);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetH(STPositiveCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var3 = null;
         var3 = (STPositiveCoordinate)this.get_store().find_attribute_user(H$14);
         if(var3 == null) {
            var3 = (STPositiveCoordinate)this.get_store().add_attribute_user(H$14);
         }

         var3.set(var1);
      }
   }

   public void unsetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(H$14);
      }
   }

   public STPathFillMode$Enum getFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILL$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FILL$16);
         }

         return var2 == null?null:(STPathFillMode$Enum)var2.getEnumValue();
      }
   }

   public STPathFillMode xgetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPathFillMode var2 = null;
         var2 = (STPathFillMode)this.get_store().find_attribute_user(FILL$16);
         if(var2 == null) {
            var2 = (STPathFillMode)this.get_default_attribute_value(FILL$16);
         }

         return var2;
      }
   }

   public boolean isSetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILL$16) != null;
      }
   }

   public void setFill(STPathFillMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILL$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILL$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFill(STPathFillMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPathFillMode var3 = null;
         var3 = (STPathFillMode)this.get_store().find_attribute_user(FILL$16);
         if(var3 == null) {
            var3 = (STPathFillMode)this.get_store().add_attribute_user(FILL$16);
         }

         var3.set(var1);
      }
   }

   public void unsetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILL$16);
      }
   }

   public boolean getStroke() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STROKE$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STROKE$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetStroke() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(STROKE$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(STROKE$18);
         }

         return var2;
      }
   }

   public boolean isSetStroke() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STROKE$18) != null;
      }
   }

   public void setStroke(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STROKE$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STROKE$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetStroke(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(STROKE$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(STROKE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetStroke() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STROKE$18);
      }
   }

   public boolean getExtrusionOk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EXTRUSIONOK$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EXTRUSIONOK$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetExtrusionOk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(EXTRUSIONOK$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(EXTRUSIONOK$20);
         }

         return var2;
      }
   }

   public boolean isSetExtrusionOk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EXTRUSIONOK$20) != null;
      }
   }

   public void setExtrusionOk(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EXTRUSIONOK$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EXTRUSIONOK$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetExtrusionOk(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(EXTRUSIONOK$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(EXTRUSIONOK$20);
         }

         var3.set(var1);
      }
   }

   public void unsetExtrusionOk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EXTRUSIONOK$20);
      }
   }

}
