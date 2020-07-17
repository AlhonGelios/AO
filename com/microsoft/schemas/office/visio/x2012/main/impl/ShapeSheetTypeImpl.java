package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.DataType;
import com.microsoft.schemas.office.visio.x2012.main.ForeignDataType;
import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;
import com.microsoft.schemas.office.visio.x2012.main.ShapesType;
import com.microsoft.schemas.office.visio.x2012.main.TextType;
import com.microsoft.schemas.office.visio.x2012.main.impl.SheetTypeImpl;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.XmlUnsignedInt;

public class ShapeSheetTypeImpl extends SheetTypeImpl implements ShapeSheetType {

   private static final QName TEXT$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Text");
   private static final QName DATA1$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Data1");
   private static final QName DATA2$4 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Data2");
   private static final QName DATA3$6 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Data3");
   private static final QName FOREIGNDATA$8 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "ForeignData");
   private static final QName SHAPES$10 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Shapes");
   private static final QName ID$12 = new QName("", "ID");
   private static final QName ORIGINALID$14 = new QName("", "OriginalID");
   private static final QName DEL$16 = new QName("", "Del");
   private static final QName MASTERSHAPE$18 = new QName("", "MasterShape");
   private static final QName UNIQUEID$20 = new QName("", "UniqueID");
   private static final QName NAME$22 = new QName("", "Name");
   private static final QName NAMEU$24 = new QName("", "NameU");
   private static final QName ISCUSTOMNAME$26 = new QName("", "IsCustomName");
   private static final QName ISCUSTOMNAMEU$28 = new QName("", "IsCustomNameU");
   private static final QName MASTER$30 = new QName("", "Master");
   private static final QName TYPE$32 = new QName("", "Type");


   public ShapeSheetTypeImpl(SchemaType var1) {
      super(var1);
   }

   public TextType getText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TextType var2 = null;
         var2 = (TextType)this.get_store().find_element_user(TEXT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXT$0) != 0;
      }
   }

   public void setText(TextType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TextType var3 = null;
         var3 = (TextType)this.get_store().find_element_user(TEXT$0, 0);
         if(var3 == null) {
            var3 = (TextType)this.get_store().add_element_user(TEXT$0);
         }

         var3.set(var1);
      }
   }

   public TextType addNewText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TextType var2 = null;
         var2 = (TextType)this.get_store().add_element_user(TEXT$0);
         return var2;
      }
   }

   public void unsetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXT$0, 0);
      }
   }

   public DataType getData1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var2 = null;
         var2 = (DataType)this.get_store().find_element_user(DATA1$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetData1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATA1$2) != 0;
      }
   }

   public void setData1(DataType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var3 = null;
         var3 = (DataType)this.get_store().find_element_user(DATA1$2, 0);
         if(var3 == null) {
            var3 = (DataType)this.get_store().add_element_user(DATA1$2);
         }

         var3.set(var1);
      }
   }

   public DataType addNewData1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var2 = null;
         var2 = (DataType)this.get_store().add_element_user(DATA1$2);
         return var2;
      }
   }

   public void unsetData1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATA1$2, 0);
      }
   }

   public DataType getData2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var2 = null;
         var2 = (DataType)this.get_store().find_element_user(DATA2$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetData2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATA2$4) != 0;
      }
   }

   public void setData2(DataType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var3 = null;
         var3 = (DataType)this.get_store().find_element_user(DATA2$4, 0);
         if(var3 == null) {
            var3 = (DataType)this.get_store().add_element_user(DATA2$4);
         }

         var3.set(var1);
      }
   }

   public DataType addNewData2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var2 = null;
         var2 = (DataType)this.get_store().add_element_user(DATA2$4);
         return var2;
      }
   }

   public void unsetData2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATA2$4, 0);
      }
   }

   public DataType getData3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var2 = null;
         var2 = (DataType)this.get_store().find_element_user(DATA3$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetData3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATA3$6) != 0;
      }
   }

   public void setData3(DataType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var3 = null;
         var3 = (DataType)this.get_store().find_element_user(DATA3$6, 0);
         if(var3 == null) {
            var3 = (DataType)this.get_store().add_element_user(DATA3$6);
         }

         var3.set(var1);
      }
   }

   public DataType addNewData3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DataType var2 = null;
         var2 = (DataType)this.get_store().add_element_user(DATA3$6);
         return var2;
      }
   }

   public void unsetData3() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATA3$6, 0);
      }
   }

   public ForeignDataType getForeignData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ForeignDataType var2 = null;
         var2 = (ForeignDataType)this.get_store().find_element_user(FOREIGNDATA$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetForeignData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FOREIGNDATA$8) != 0;
      }
   }

   public void setForeignData(ForeignDataType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ForeignDataType var3 = null;
         var3 = (ForeignDataType)this.get_store().find_element_user(FOREIGNDATA$8, 0);
         if(var3 == null) {
            var3 = (ForeignDataType)this.get_store().add_element_user(FOREIGNDATA$8);
         }

         var3.set(var1);
      }
   }

   public ForeignDataType addNewForeignData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ForeignDataType var2 = null;
         var2 = (ForeignDataType)this.get_store().add_element_user(FOREIGNDATA$8);
         return var2;
      }
   }

   public void unsetForeignData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FOREIGNDATA$8, 0);
      }
   }

   public ShapesType getShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapesType var2 = null;
         var2 = (ShapesType)this.get_store().find_element_user(SHAPES$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAPES$10) != 0;
      }
   }

   public void setShapes(ShapesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapesType var3 = null;
         var3 = (ShapesType)this.get_store().find_element_user(SHAPES$10, 0);
         if(var3 == null) {
            var3 = (ShapesType)this.get_store().add_element_user(SHAPES$10);
         }

         var3.set(var1);
      }
   }

   public ShapesType addNewShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ShapesType var2 = null;
         var2 = (ShapesType)this.get_store().add_element_user(SHAPES$10);
         return var2;
      }
   }

   public void unsetShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAPES$10, 0);
      }
   }

   public long getID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$12);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$12);
         return var2;
      }
   }

   public void setID(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetID(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$12);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$12);
         }

         var3.set(var1);
      }
   }

   public long getOriginalID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ORIGINALID$14);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetOriginalID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ORIGINALID$14);
         return var2;
      }
   }

   public boolean isSetOriginalID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ORIGINALID$14) != null;
      }
   }

   public void setOriginalID(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ORIGINALID$14);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ORIGINALID$14);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetOriginalID(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ORIGINALID$14);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ORIGINALID$14);
         }

         var3.set(var1);
      }
   }

   public void unsetOriginalID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ORIGINALID$14);
      }
   }

   public boolean getDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEL$16);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DEL$16);
         return var2;
      }
   }

   public boolean isSetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEL$16) != null;
      }
   }

   public void setDel(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEL$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEL$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDel(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DEL$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DEL$16);
         }

         var3.set(var1);
      }
   }

   public void unsetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEL$16);
      }
   }

   public long getMasterShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MASTERSHAPE$18);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMasterShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MASTERSHAPE$18);
         return var2;
      }
   }

   public boolean isSetMasterShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MASTERSHAPE$18) != null;
      }
   }

   public void setMasterShape(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MASTERSHAPE$18);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MASTERSHAPE$18);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMasterShape(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MASTERSHAPE$18);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MASTERSHAPE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetMasterShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MASTERSHAPE$18);
      }
   }

   public String getUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEID$20);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(UNIQUEID$20);
         return var2;
      }
   }

   public boolean isSetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNIQUEID$20) != null;
      }
   }

   public void setUniqueID(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEID$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNIQUEID$20);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetUniqueID(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(UNIQUEID$20);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(UNIQUEID$20);
         }

         var3.set(var1);
      }
   }

   public void unsetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNIQUEID$20);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$22);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$22);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$22) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$22);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$22);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$22);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$22);
      }
   }

   public String getNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$24);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAMEU$24);
         return var2;
      }
   }

   public boolean isSetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAMEU$24) != null;
      }
   }

   public void setNameU(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAMEU$24);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetNameU(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAMEU$24);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAMEU$24);
         }

         var3.set(var1);
      }
   }

   public void unsetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAMEU$24);
      }
   }

   public boolean getIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$26);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$26);
         return var2;
      }
   }

   public boolean isSetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAME$26) != null;
      }
   }

   public void setIsCustomName(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAME$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomName(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAME$26);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAME$26);
      }
   }

   public boolean getIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$28);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$28);
         return var2;
      }
   }

   public boolean isSetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAMEU$28) != null;
      }
   }

   public void setIsCustomNameU(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAMEU$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomNameU(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAMEU$28);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAMEU$28);
      }
   }

   public long getMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MASTER$30);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MASTER$30);
         return var2;
      }
   }

   public boolean isSetMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MASTER$30) != null;
      }
   }

   public void setMaster(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MASTER$30);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MASTER$30);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMaster(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MASTER$30);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MASTER$30);
         }

         var3.set(var1);
      }
   }

   public void unsetMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MASTER$30);
      }
   }

   public String getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$32);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlToken xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlToken var2 = null;
         var2 = (XmlToken)this.get_store().find_attribute_user(TYPE$32);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$32) != null;
      }
   }

   public void setType(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$32);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetType(XmlToken var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlToken var3 = null;
         var3 = (XmlToken)this.get_store().find_attribute_user(TYPE$32);
         if(var3 == null) {
            var3 = (XmlToken)this.get_store().add_attribute_user(TYPE$32);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$32);
      }
   }

}
