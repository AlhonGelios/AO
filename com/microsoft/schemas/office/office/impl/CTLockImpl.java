package com.microsoft.schemas.office.office.impl;

import com.microsoft.schemas.office.office.CTLock;
import com.microsoft.schemas.office.office.STTrueFalse;
import com.microsoft.schemas.office.office.STTrueFalse$Enum;
import com.microsoft.schemas.vml.STExt;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTLockImpl extends XmlComplexContentImpl implements CTLock {

   private static final QName EXT$0 = new QName("urn:schemas-microsoft-com:vml", "ext");
   private static final QName POSITION$2 = new QName("", "position");
   private static final QName SELECTION$4 = new QName("", "selection");
   private static final QName GROUPING$6 = new QName("", "grouping");
   private static final QName UNGROUPING$8 = new QName("", "ungrouping");
   private static final QName ROTATION$10 = new QName("", "rotation");
   private static final QName CROPPING$12 = new QName("", "cropping");
   private static final QName VERTICIES$14 = new QName("", "verticies");
   private static final QName ADJUSTHANDLES$16 = new QName("", "adjusthandles");
   private static final QName TEXT$18 = new QName("", "text");
   private static final QName ASPECTRATIO$20 = new QName("", "aspectratio");
   private static final QName SHAPETYPE$22 = new QName("", "shapetype");


   public CTLockImpl(SchemaType var1) {
      super(var1);
   }

   public STExt.Enum getExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EXT$0);
         return var2 == null?null:(STExt.Enum)var2.getEnumValue();
      }
   }

   public STExt xgetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STExt var2 = null;
         var2 = (STExt)this.get_store().find_attribute_user(EXT$0);
         return var2;
      }
   }

   public boolean isSetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EXT$0) != null;
      }
   }

   public void setExt(STExt.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EXT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EXT$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetExt(STExt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STExt var3 = null;
         var3 = (STExt)this.get_store().find_attribute_user(EXT$0);
         if(var3 == null) {
            var3 = (STExt)this.get_store().add_attribute_user(EXT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EXT$0);
      }
   }

   public STTrueFalse$Enum getPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(POSITION$2);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(POSITION$2);
         return var2;
      }
   }

   public boolean isSetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(POSITION$2) != null;
      }
   }

   public void setPosition(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(POSITION$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(POSITION$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPosition(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(POSITION$2);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(POSITION$2);
         }

         var3.set(var1);
      }
   }

   public void unsetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(POSITION$2);
      }
   }

   public STTrueFalse$Enum getSelection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SELECTION$4);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetSelection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(SELECTION$4);
         return var2;
      }
   }

   public boolean isSetSelection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SELECTION$4) != null;
      }
   }

   public void setSelection(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SELECTION$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SELECTION$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSelection(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(SELECTION$4);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(SELECTION$4);
         }

         var3.set(var1);
      }
   }

   public void unsetSelection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SELECTION$4);
      }
   }

   public STTrueFalse$Enum getGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GROUPING$6);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(GROUPING$6);
         return var2;
      }
   }

   public boolean isSetGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GROUPING$6) != null;
      }
   }

   public void setGrouping(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GROUPING$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GROUPING$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetGrouping(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(GROUPING$6);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(GROUPING$6);
         }

         var3.set(var1);
      }
   }

   public void unsetGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GROUPING$6);
      }
   }

   public STTrueFalse$Enum getUngrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNGROUPING$8);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetUngrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(UNGROUPING$8);
         return var2;
      }
   }

   public boolean isSetUngrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNGROUPING$8) != null;
      }
   }

   public void setUngrouping(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNGROUPING$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNGROUPING$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUngrouping(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(UNGROUPING$8);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(UNGROUPING$8);
         }

         var3.set(var1);
      }
   }

   public void unsetUngrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNGROUPING$8);
      }
   }

   public STTrueFalse$Enum getRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROTATION$10);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ROTATION$10);
         return var2;
      }
   }

   public boolean isSetRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROTATION$10) != null;
      }
   }

   public void setRotation(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROTATION$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROTATION$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetRotation(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ROTATION$10);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ROTATION$10);
         }

         var3.set(var1);
      }
   }

   public void unsetRotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROTATION$10);
      }
   }

   public STTrueFalse$Enum getCropping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CROPPING$12);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetCropping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(CROPPING$12);
         return var2;
      }
   }

   public boolean isSetCropping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CROPPING$12) != null;
      }
   }

   public void setCropping(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CROPPING$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CROPPING$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCropping(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(CROPPING$12);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(CROPPING$12);
         }

         var3.set(var1);
      }
   }

   public void unsetCropping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CROPPING$12);
      }
   }

   public STTrueFalse$Enum getVerticies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERTICIES$14);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetVerticies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(VERTICIES$14);
         return var2;
      }
   }

   public boolean isSetVerticies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERTICIES$14) != null;
      }
   }

   public void setVerticies(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VERTICIES$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VERTICIES$14);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVerticies(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(VERTICIES$14);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(VERTICIES$14);
         }

         var3.set(var1);
      }
   }

   public void unsetVerticies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERTICIES$14);
      }
   }

   public STTrueFalse$Enum getAdjusthandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ADJUSTHANDLES$16);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetAdjusthandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ADJUSTHANDLES$16);
         return var2;
      }
   }

   public boolean isSetAdjusthandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ADJUSTHANDLES$16) != null;
      }
   }

   public void setAdjusthandles(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ADJUSTHANDLES$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ADJUSTHANDLES$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAdjusthandles(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ADJUSTHANDLES$16);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ADJUSTHANDLES$16);
         }

         var3.set(var1);
      }
   }

   public void unsetAdjusthandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ADJUSTHANDLES$16);
      }
   }

   public STTrueFalse$Enum getText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TEXT$18);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(TEXT$18);
         return var2;
      }
   }

   public boolean isSetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TEXT$18) != null;
      }
   }

   public void setText(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TEXT$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TEXT$18);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetText(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(TEXT$18);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(TEXT$18);
         }

         var3.set(var1);
      }
   }

   public void unsetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TEXT$18);
      }
   }

   public STTrueFalse$Enum getAspectratio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ASPECTRATIO$20);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetAspectratio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(ASPECTRATIO$20);
         return var2;
      }
   }

   public boolean isSetAspectratio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ASPECTRATIO$20) != null;
      }
   }

   public void setAspectratio(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ASPECTRATIO$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ASPECTRATIO$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAspectratio(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(ASPECTRATIO$20);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(ASPECTRATIO$20);
         }

         var3.set(var1);
      }
   }

   public void unsetAspectratio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ASPECTRATIO$20);
      }
   }

   public STTrueFalse$Enum getShapetype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHAPETYPE$22);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetShapetype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(SHAPETYPE$22);
         return var2;
      }
   }

   public boolean isSetShapetype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHAPETYPE$22) != null;
      }
   }

   public void setShapetype(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHAPETYPE$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHAPETYPE$22);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetShapetype(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(SHAPETYPE$22);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(SHAPETYPE$22);
         }

         var3.set(var1);
      }
   }

   public void unsetShapetype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHAPETYPE$22);
      }
   }

}
