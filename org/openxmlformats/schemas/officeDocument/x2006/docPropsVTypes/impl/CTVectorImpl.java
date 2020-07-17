package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlByte;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlLong;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlShort;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.XmlUnsignedLong;
import org.apache.xmlbeans.XmlUnsignedShort;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType$Enum;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1BoolList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1BstrList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1CfList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1ClsidList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1CyList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1DateList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1ErrorList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1FiletimeList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1I1List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1I2List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1I4List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1I8List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1LpstrList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1LpwstrList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1R4List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1R8List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1Ui1List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1Ui2List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1Ui4List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1Ui8List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.1VariantList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2BoolList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2BstrList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2ClsidList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2CyList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2DateList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2ErrorList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2FiletimeList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2I1List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2I2List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2I4List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2I8List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2LpstrList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2LpwstrList;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2R4List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2R8List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2Ui1List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2Ui2List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2Ui4List;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.CTVectorImpl.2Ui8List;

public class CTVectorImpl extends XmlComplexContentImpl implements CTVector {

   private static final QName VARIANT$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "variant");
   private static final QName I1$2 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i1");
   private static final QName I2$4 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i2");
   private static final QName I4$6 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i4");
   private static final QName I8$8 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i8");
   private static final QName UI1$10 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui1");
   private static final QName UI2$12 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui2");
   private static final QName UI4$14 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui4");
   private static final QName UI8$16 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui8");
   private static final QName R4$18 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r4");
   private static final QName R8$20 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r8");
   private static final QName LPSTR$22 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpstr");
   private static final QName LPWSTR$24 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpwstr");
   private static final QName BSTR$26 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bstr");
   private static final QName DATE$28 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "date");
   private static final QName FILETIME$30 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "filetime");
   private static final QName BOOL$32 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bool");
   private static final QName CY$34 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cy");
   private static final QName ERROR$36 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "error");
   private static final QName CLSID$38 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "clsid");
   private static final QName CF$40 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cf");
   private static final QName BASETYPE$42 = new QName("", "baseType");
   private static final QName SIZE$44 = new QName("", "size");


   public CTVectorImpl(SchemaType var1) {
      super(var1);
   }

   public List getVariantList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1VariantList(this);
      }
   }

   public CTVariant[] getVariantArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VARIANT$0, var2);
         CTVariant[] var3 = new CTVariant[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTVariant getVariantArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVariant var3 = null;
         var3 = (CTVariant)this.get_store().find_element_user(VARIANT$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfVariantArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VARIANT$0);
      }
   }

   public void setVariantArray(CTVariant[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VARIANT$0);
      }
   }

   public void setVariantArray(int var1, CTVariant var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVariant var4 = null;
         var4 = (CTVariant)this.get_store().find_element_user(VARIANT$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTVariant insertNewVariant(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVariant var3 = null;
         var3 = (CTVariant)this.get_store().insert_element_user(VARIANT$0, var1);
         return var3;
      }
   }

   public CTVariant addNewVariant() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVariant var2 = null;
         var2 = (CTVariant)this.get_store().add_element_user(VARIANT$0);
         return var2;
      }
   }

   public void removeVariant(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VARIANT$0, var1);
      }
   }

   public List getI1List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1I1List(this);
      }
   }

   public byte[] getI1Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I1$2, var2);
         byte[] var3 = new byte[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getByteValue();
         }

         return var3;
      }
   }

   public byte getI1Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(I1$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getByteValue();
         }
      }
   }

   public List xgetI1List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2I1List(this);
      }
   }

   public XmlByte[] xgetI1Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I1$2, var2);
         XmlByte[] var3 = new XmlByte[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlByte xgetI1Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var3 = null;
         var3 = (XmlByte)this.get_store().find_element_user(I1$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfI1Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I1$2);
      }
   }

   public void setI1Array(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I1$2);
      }
   }

   public void setI1Array(int var1, byte var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(I1$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setByteValue(var2);
         }
      }
   }

   public void xsetI1Array(XmlByte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I1$2);
      }
   }

   public void xsetI1Array(int var1, XmlByte var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var4 = null;
         var4 = (XmlByte)this.get_store().find_element_user(I1$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertI1(int var1, byte var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(I1$2, var1);
         var4.setByteValue(var2);
      }
   }

   public void addI1(byte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(I1$2);
         var3.setByteValue(var1);
      }
   }

   public XmlByte insertNewI1(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var3 = null;
         var3 = (XmlByte)this.get_store().insert_element_user(I1$2, var1);
         return var3;
      }
   }

   public XmlByte addNewI1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var2 = null;
         var2 = (XmlByte)this.get_store().add_element_user(I1$2);
         return var2;
      }
   }

   public void removeI1(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I1$2, var1);
      }
   }

   public List getI2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1I2List(this);
      }
   }

   public short[] getI2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I2$4, var2);
         short[] var3 = new short[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getShortValue();
         }

         return var3;
      }
   }

   public short getI2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(I2$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getShortValue();
         }
      }
   }

   public List xgetI2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2I2List(this);
      }
   }

   public XmlShort[] xgetI2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I2$4, var2);
         XmlShort[] var3 = new XmlShort[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlShort xgetI2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlShort var3 = null;
         var3 = (XmlShort)this.get_store().find_element_user(I2$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfI2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I2$4);
      }
   }

   public void setI2Array(short[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I2$4);
      }
   }

   public void setI2Array(int var1, short var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(I2$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setShortValue(var2);
         }
      }
   }

   public void xsetI2Array(XmlShort[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I2$4);
      }
   }

   public void xsetI2Array(int var1, XmlShort var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlShort var4 = null;
         var4 = (XmlShort)this.get_store().find_element_user(I2$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertI2(int var1, short var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(I2$4, var1);
         var4.setShortValue(var2);
      }
   }

   public void addI2(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(I2$4);
         var3.setShortValue(var1);
      }
   }

   public XmlShort insertNewI2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlShort var3 = null;
         var3 = (XmlShort)this.get_store().insert_element_user(I2$4, var1);
         return var3;
      }
   }

   public XmlShort addNewI2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlShort var2 = null;
         var2 = (XmlShort)this.get_store().add_element_user(I2$4);
         return var2;
      }
   }

   public void removeI2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I2$4, var1);
      }
   }

   public List getI4List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1I4List(this);
      }
   }

   public int[] getI4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I4$6, var2);
         int[] var3 = new int[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getIntValue();
         }

         return var3;
      }
   }

   public int getI4Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(I4$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getIntValue();
         }
      }
   }

   public List xgetI4List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2I4List(this);
      }
   }

   public XmlInt[] xgetI4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I4$6, var2);
         XmlInt[] var3 = new XmlInt[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInt xgetI4Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(I4$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfI4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I4$6);
      }
   }

   public void setI4Array(int[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I4$6);
      }
   }

   public void setI4Array(int var1, int var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(I4$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setIntValue(var2);
         }
      }
   }

   public void xsetI4Array(XmlInt[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I4$6);
      }
   }

   public void xsetI4Array(int var1, XmlInt var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var4 = null;
         var4 = (XmlInt)this.get_store().find_element_user(I4$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertI4(int var1, int var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(I4$6, var1);
         var4.setIntValue(var2);
      }
   }

   public void addI4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(I4$6);
         var3.setIntValue(var1);
      }
   }

   public XmlInt insertNewI4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().insert_element_user(I4$6, var1);
         return var3;
      }
   }

   public XmlInt addNewI4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().add_element_user(I4$6);
         return var2;
      }
   }

   public void removeI4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I4$6, var1);
      }
   }

   public List getI8List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1I8List(this);
      }
   }

   public long[] getI8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I8$8, var2);
         long[] var3 = new long[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getLongValue();
         }

         return var3;
      }
   }

   public long getI8Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(I8$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getLongValue();
         }
      }
   }

   public List xgetI8List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2I8List(this);
      }
   }

   public XmlLong[] xgetI8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I8$8, var2);
         XmlLong[] var3 = new XmlLong[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlLong xgetI8Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlLong var3 = null;
         var3 = (XmlLong)this.get_store().find_element_user(I8$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfI8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I8$8);
      }
   }

   public void setI8Array(long[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I8$8);
      }
   }

   public void setI8Array(int var1, long var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var5 = null;
         var5 = (SimpleValue)this.get_store().find_element_user(I8$8, var1);
         if(var5 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var5.setLongValue(var2);
         }
      }
   }

   public void xsetI8Array(XmlLong[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I8$8);
      }
   }

   public void xsetI8Array(int var1, XmlLong var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlLong var4 = null;
         var4 = (XmlLong)this.get_store().find_element_user(I8$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertI8(int var1, long var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var5 = (SimpleValue)this.get_store().insert_element_user(I8$8, var1);
         var5.setLongValue(var2);
      }
   }

   public void addI8(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().add_element_user(I8$8);
         var4.setLongValue(var1);
      }
   }

   public XmlLong insertNewI8(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlLong var3 = null;
         var3 = (XmlLong)this.get_store().insert_element_user(I8$8, var1);
         return var3;
      }
   }

   public XmlLong addNewI8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlLong var2 = null;
         var2 = (XmlLong)this.get_store().add_element_user(I8$8);
         return var2;
      }
   }

   public void removeI8(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I8$8, var1);
      }
   }

   public List getUi1List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Ui1List(this);
      }
   }

   public short[] getUi1Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI1$10, var2);
         short[] var3 = new short[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getShortValue();
         }

         return var3;
      }
   }

   public short getUi1Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UI1$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getShortValue();
         }
      }
   }

   public List xgetUi1List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2Ui1List(this);
      }
   }

   public XmlUnsignedByte[] xgetUi1Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI1$10, var2);
         XmlUnsignedByte[] var3 = new XmlUnsignedByte[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlUnsignedByte xgetUi1Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_element_user(UI1$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfUi1Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI1$10);
      }
   }

   public void setUi1Array(short[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI1$10);
      }
   }

   public void setUi1Array(int var1, short var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(UI1$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setShortValue(var2);
         }
      }
   }

   public void xsetUi1Array(XmlUnsignedByte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI1$10);
      }
   }

   public void xsetUi1Array(int var1, XmlUnsignedByte var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var4 = null;
         var4 = (XmlUnsignedByte)this.get_store().find_element_user(UI1$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertUi1(int var1, short var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(UI1$10, var1);
         var4.setShortValue(var2);
      }
   }

   public void addUi1(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(UI1$10);
         var3.setShortValue(var1);
      }
   }

   public XmlUnsignedByte insertNewUi1(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().insert_element_user(UI1$10, var1);
         return var3;
      }
   }

   public XmlUnsignedByte addNewUi1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().add_element_user(UI1$10);
         return var2;
      }
   }

   public void removeUi1(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI1$10, var1);
      }
   }

   public List getUi2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Ui2List(this);
      }
   }

   public int[] getUi2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI2$12, var2);
         int[] var3 = new int[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getIntValue();
         }

         return var3;
      }
   }

   public int getUi2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UI2$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getIntValue();
         }
      }
   }

   public List xgetUi2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2Ui2List(this);
      }
   }

   public XmlUnsignedShort[] xgetUi2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI2$12, var2);
         XmlUnsignedShort[] var3 = new XmlUnsignedShort[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlUnsignedShort xgetUi2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var3 = null;
         var3 = (XmlUnsignedShort)this.get_store().find_element_user(UI2$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfUi2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI2$12);
      }
   }

   public void setUi2Array(int[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI2$12);
      }
   }

   public void setUi2Array(int var1, int var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(UI2$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setIntValue(var2);
         }
      }
   }

   public void xsetUi2Array(XmlUnsignedShort[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI2$12);
      }
   }

   public void xsetUi2Array(int var1, XmlUnsignedShort var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var4 = null;
         var4 = (XmlUnsignedShort)this.get_store().find_element_user(UI2$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertUi2(int var1, int var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(UI2$12, var1);
         var4.setIntValue(var2);
      }
   }

   public void addUi2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(UI2$12);
         var3.setIntValue(var1);
      }
   }

   public XmlUnsignedShort insertNewUi2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var3 = null;
         var3 = (XmlUnsignedShort)this.get_store().insert_element_user(UI2$12, var1);
         return var3;
      }
   }

   public XmlUnsignedShort addNewUi2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var2 = null;
         var2 = (XmlUnsignedShort)this.get_store().add_element_user(UI2$12);
         return var2;
      }
   }

   public void removeUi2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI2$12, var1);
      }
   }

   public List getUi4List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Ui4List(this);
      }
   }

   public long[] getUi4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI4$14, var2);
         long[] var3 = new long[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getLongValue();
         }

         return var3;
      }
   }

   public long getUi4Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UI4$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getLongValue();
         }
      }
   }

   public List xgetUi4List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2Ui4List(this);
      }
   }

   public XmlUnsignedInt[] xgetUi4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI4$14, var2);
         XmlUnsignedInt[] var3 = new XmlUnsignedInt[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlUnsignedInt xgetUi4Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_element_user(UI4$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfUi4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI4$14);
      }
   }

   public void setUi4Array(long[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI4$14);
      }
   }

   public void setUi4Array(int var1, long var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var5 = null;
         var5 = (SimpleValue)this.get_store().find_element_user(UI4$14, var1);
         if(var5 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var5.setLongValue(var2);
         }
      }
   }

   public void xsetUi4Array(XmlUnsignedInt[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI4$14);
      }
   }

   public void xsetUi4Array(int var1, XmlUnsignedInt var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var4 = null;
         var4 = (XmlUnsignedInt)this.get_store().find_element_user(UI4$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertUi4(int var1, long var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var5 = (SimpleValue)this.get_store().insert_element_user(UI4$14, var1);
         var5.setLongValue(var2);
      }
   }

   public void addUi4(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().add_element_user(UI4$14);
         var4.setLongValue(var1);
      }
   }

   public XmlUnsignedInt insertNewUi4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().insert_element_user(UI4$14, var1);
         return var3;
      }
   }

   public XmlUnsignedInt addNewUi4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().add_element_user(UI4$14);
         return var2;
      }
   }

   public void removeUi4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI4$14, var1);
      }
   }

   public List getUi8List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Ui8List(this);
      }
   }

   public BigInteger[] getUi8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI8$16, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getUi8Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UI8$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetUi8List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2Ui8List(this);
      }
   }

   public XmlUnsignedLong[] xgetUi8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UI8$16, var2);
         XmlUnsignedLong[] var3 = new XmlUnsignedLong[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlUnsignedLong xgetUi8Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedLong var3 = null;
         var3 = (XmlUnsignedLong)this.get_store().find_element_user(UI8$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfUi8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI8$16);
      }
   }

   public void setUi8Array(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI8$16);
      }
   }

   public void setUi8Array(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(UI8$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetUi8Array(XmlUnsignedLong[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UI8$16);
      }
   }

   public void xsetUi8Array(int var1, XmlUnsignedLong var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedLong var4 = null;
         var4 = (XmlUnsignedLong)this.get_store().find_element_user(UI8$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertUi8(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(UI8$16, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addUi8(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(UI8$16);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlUnsignedLong insertNewUi8(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedLong var3 = null;
         var3 = (XmlUnsignedLong)this.get_store().insert_element_user(UI8$16, var1);
         return var3;
      }
   }

   public XmlUnsignedLong addNewUi8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedLong var2 = null;
         var2 = (XmlUnsignedLong)this.get_store().add_element_user(UI8$16);
         return var2;
      }
   }

   public void removeUi8(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI8$16, var1);
      }
   }

   public List getR4List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1R4List(this);
      }
   }

   public float[] getR4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R4$18, var2);
         float[] var3 = new float[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getFloatValue();
         }

         return var3;
      }
   }

   public float getR4Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(R4$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getFloatValue();
         }
      }
   }

   public List xgetR4List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2R4List(this);
      }
   }

   public XmlFloat[] xgetR4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R4$18, var2);
         XmlFloat[] var3 = new XmlFloat[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlFloat xgetR4Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var3 = null;
         var3 = (XmlFloat)this.get_store().find_element_user(R4$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfR4Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R4$18);
      }
   }

   public void setR4Array(float[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R4$18);
      }
   }

   public void setR4Array(int var1, float var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(R4$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setFloatValue(var2);
         }
      }
   }

   public void xsetR4Array(XmlFloat[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R4$18);
      }
   }

   public void xsetR4Array(int var1, XmlFloat var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var4 = null;
         var4 = (XmlFloat)this.get_store().find_element_user(R4$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertR4(int var1, float var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(R4$18, var1);
         var4.setFloatValue(var2);
      }
   }

   public void addR4(float var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(R4$18);
         var3.setFloatValue(var1);
      }
   }

   public XmlFloat insertNewR4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var3 = null;
         var3 = (XmlFloat)this.get_store().insert_element_user(R4$18, var1);
         return var3;
      }
   }

   public XmlFloat addNewR4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var2 = null;
         var2 = (XmlFloat)this.get_store().add_element_user(R4$18);
         return var2;
      }
   }

   public void removeR4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R4$18, var1);
      }
   }

   public List getR8List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1R8List(this);
      }
   }

   public double[] getR8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R8$20, var2);
         double[] var3 = new double[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getDoubleValue();
         }

         return var3;
      }
   }

   public double getR8Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(R8$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getDoubleValue();
         }
      }
   }

   public List xgetR8List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2R8List(this);
      }
   }

   public XmlDouble[] xgetR8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R8$20, var2);
         XmlDouble[] var3 = new XmlDouble[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlDouble xgetR8Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_element_user(R8$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfR8Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R8$20);
      }
   }

   public void setR8Array(double[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R8$20);
      }
   }

   public void setR8Array(int var1, double var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var5 = null;
         var5 = (SimpleValue)this.get_store().find_element_user(R8$20, var1);
         if(var5 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var5.setDoubleValue(var2);
         }
      }
   }

   public void xsetR8Array(XmlDouble[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R8$20);
      }
   }

   public void xsetR8Array(int var1, XmlDouble var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var4 = null;
         var4 = (XmlDouble)this.get_store().find_element_user(R8$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertR8(int var1, double var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var5 = (SimpleValue)this.get_store().insert_element_user(R8$20, var1);
         var5.setDoubleValue(var2);
      }
   }

   public void addR8(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().add_element_user(R8$20);
         var4.setDoubleValue(var1);
      }
   }

   public XmlDouble insertNewR8(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().insert_element_user(R8$20, var1);
         return var3;
      }
   }

   public XmlDouble addNewR8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().add_element_user(R8$20);
         return var2;
      }
   }

   public void removeR8(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R8$20, var1);
      }
   }

   public List getLpstrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LpstrList(this);
      }
   }

   public String[] getLpstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LPSTR$22, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getLpstrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LPSTR$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetLpstrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2LpstrList(this);
      }
   }

   public XmlString[] xgetLpstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LPSTR$22, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetLpstrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(LPSTR$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLpstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LPSTR$22);
      }
   }

   public void setLpstrArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LPSTR$22);
      }
   }

   public void setLpstrArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(LPSTR$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetLpstrArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LPSTR$22);
      }
   }

   public void xsetLpstrArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(LPSTR$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertLpstr(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(LPSTR$22, var1);
         var4.setStringValue(var2);
      }
   }

   public void addLpstr(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(LPSTR$22);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewLpstr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(LPSTR$22, var1);
         return var3;
      }
   }

   public XmlString addNewLpstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(LPSTR$22);
         return var2;
      }
   }

   public void removeLpstr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LPSTR$22, var1);
      }
   }

   public List getLpwstrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LpwstrList(this);
      }
   }

   public String[] getLpwstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LPWSTR$24, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getLpwstrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LPWSTR$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetLpwstrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2LpwstrList(this);
      }
   }

   public XmlString[] xgetLpwstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LPWSTR$24, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetLpwstrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(LPWSTR$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLpwstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LPWSTR$24);
      }
   }

   public void setLpwstrArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LPWSTR$24);
      }
   }

   public void setLpwstrArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(LPWSTR$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetLpwstrArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LPWSTR$24);
      }
   }

   public void xsetLpwstrArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(LPWSTR$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertLpwstr(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(LPWSTR$24, var1);
         var4.setStringValue(var2);
      }
   }

   public void addLpwstr(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(LPWSTR$24);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewLpwstr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(LPWSTR$24, var1);
         return var3;
      }
   }

   public XmlString addNewLpwstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(LPWSTR$24);
         return var2;
      }
   }

   public void removeLpwstr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LPWSTR$24, var1);
      }
   }

   public List getBstrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BstrList(this);
      }
   }

   public String[] getBstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BSTR$26, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getBstrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BSTR$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetBstrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2BstrList(this);
      }
   }

   public XmlString[] xgetBstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BSTR$26, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetBstrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(BSTR$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBstrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BSTR$26);
      }
   }

   public void setBstrArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BSTR$26);
      }
   }

   public void setBstrArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(BSTR$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetBstrArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BSTR$26);
      }
   }

   public void xsetBstrArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(BSTR$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertBstr(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(BSTR$26, var1);
         var4.setStringValue(var2);
      }
   }

   public void addBstr(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(BSTR$26);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewBstr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(BSTR$26, var1);
         return var3;
      }
   }

   public XmlString addNewBstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(BSTR$26);
         return var2;
      }
   }

   public void removeBstr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BSTR$26, var1);
      }
   }

   public List getDateList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DateList(this);
      }
   }

   public Calendar[] getDateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DATE$28, var2);
         Calendar[] var3 = new Calendar[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getCalendarValue();
         }

         return var3;
      }
   }

   public Calendar getDateArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DATE$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getCalendarValue();
         }
      }
   }

   public List xgetDateList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DateList(this);
      }
   }

   public XmlDateTime[] xgetDateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DATE$28, var2);
         XmlDateTime[] var3 = new XmlDateTime[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlDateTime xgetDateArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_element_user(DATE$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATE$28);
      }
   }

   public void setDateArray(Calendar[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DATE$28);
      }
   }

   public void setDateArray(int var1, Calendar var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DATE$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setCalendarValue(var2);
         }
      }
   }

   public void xsetDateArray(XmlDateTime[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DATE$28);
      }
   }

   public void xsetDateArray(int var1, XmlDateTime var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var4 = null;
         var4 = (XmlDateTime)this.get_store().find_element_user(DATE$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set((XmlObject)var2);
         }
      }
   }

   public void insertDate(int var1, Calendar var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DATE$28, var1);
         var4.setCalendarValue(var2);
      }
   }

   public void addDate(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DATE$28);
         var3.setCalendarValue(var1);
      }
   }

   public XmlDateTime insertNewDate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().insert_element_user(DATE$28, var1);
         return var3;
      }
   }

   public XmlDateTime addNewDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().add_element_user(DATE$28);
         return var2;
      }
   }

   public void removeDate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATE$28, var1);
      }
   }

   public List getFiletimeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FiletimeList(this);
      }
   }

   public Calendar[] getFiletimeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FILETIME$30, var2);
         Calendar[] var3 = new Calendar[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getCalendarValue();
         }

         return var3;
      }
   }

   public Calendar getFiletimeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FILETIME$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getCalendarValue();
         }
      }
   }

   public List xgetFiletimeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FiletimeList(this);
      }
   }

   public XmlDateTime[] xgetFiletimeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FILETIME$30, var2);
         XmlDateTime[] var3 = new XmlDateTime[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlDateTime xgetFiletimeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_element_user(FILETIME$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFiletimeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILETIME$30);
      }
   }

   public void setFiletimeArray(Calendar[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FILETIME$30);
      }
   }

   public void setFiletimeArray(int var1, Calendar var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FILETIME$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setCalendarValue(var2);
         }
      }
   }

   public void xsetFiletimeArray(XmlDateTime[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FILETIME$30);
      }
   }

   public void xsetFiletimeArray(int var1, XmlDateTime var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var4 = null;
         var4 = (XmlDateTime)this.get_store().find_element_user(FILETIME$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set((XmlObject)var2);
         }
      }
   }

   public void insertFiletime(int var1, Calendar var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FILETIME$30, var1);
         var4.setCalendarValue(var2);
      }
   }

   public void addFiletime(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FILETIME$30);
         var3.setCalendarValue(var1);
      }
   }

   public XmlDateTime insertNewFiletime(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().insert_element_user(FILETIME$30, var1);
         return var3;
      }
   }

   public XmlDateTime addNewFiletime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().add_element_user(FILETIME$30);
         return var2;
      }
   }

   public void removeFiletime(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILETIME$30, var1);
      }
   }

   public List getBoolList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BoolList(this);
      }
   }

   public boolean[] getBoolArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BOOL$32, var2);
         boolean[] var3 = new boolean[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBooleanValue();
         }

         return var3;
      }
   }

   public boolean getBoolArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BOOL$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBooleanValue();
         }
      }
   }

   public List xgetBoolList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2BoolList(this);
      }
   }

   public XmlBoolean[] xgetBoolArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BOOL$32, var2);
         XmlBoolean[] var3 = new XmlBoolean[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlBoolean xgetBoolArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_element_user(BOOL$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBoolArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOL$32);
      }
   }

   public void setBoolArray(boolean[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BOOL$32);
      }
   }

   public void setBoolArray(int var1, boolean var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(BOOL$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBooleanValue(var2);
         }
      }
   }

   public void xsetBoolArray(XmlBoolean[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BOOL$32);
      }
   }

   public void xsetBoolArray(int var1, XmlBoolean var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var4 = null;
         var4 = (XmlBoolean)this.get_store().find_element_user(BOOL$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertBool(int var1, boolean var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(BOOL$32, var1);
         var4.setBooleanValue(var2);
      }
   }

   public void addBool(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(BOOL$32);
         var3.setBooleanValue(var1);
      }
   }

   public XmlBoolean insertNewBool(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().insert_element_user(BOOL$32, var1);
         return var3;
      }
   }

   public XmlBoolean addNewBool() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().add_element_user(BOOL$32);
         return var2;
      }
   }

   public void removeBool(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOL$32, var1);
      }
   }

   public List getCyList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CyList(this);
      }
   }

   public String[] getCyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CY$34, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getCyArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CY$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetCyList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2CyList(this);
      }
   }

   public STCy[] xgetCyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CY$34, var2);
         STCy[] var3 = new STCy[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STCy xgetCyArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCy var3 = null;
         var3 = (STCy)this.get_store().find_element_user(CY$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CY$34);
      }
   }

   public void setCyArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CY$34);
      }
   }

   public void setCyArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(CY$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetCyArray(STCy[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CY$34);
      }
   }

   public void xsetCyArray(int var1, STCy var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCy var4 = null;
         var4 = (STCy)this.get_store().find_element_user(CY$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertCy(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(CY$34, var1);
         var4.setStringValue(var2);
      }
   }

   public void addCy(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(CY$34);
         var3.setStringValue(var1);
      }
   }

   public STCy insertNewCy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCy var3 = null;
         var3 = (STCy)this.get_store().insert_element_user(CY$34, var1);
         return var3;
      }
   }

   public STCy addNewCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCy var2 = null;
         var2 = (STCy)this.get_store().add_element_user(CY$34);
         return var2;
      }
   }

   public void removeCy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CY$34, var1);
      }
   }

   public List getErrorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ErrorList(this);
      }
   }

   public String[] getErrorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ERROR$36, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getErrorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ERROR$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetErrorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ErrorList(this);
      }
   }

   public STError[] xgetErrorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ERROR$36, var2);
         STError[] var3 = new STError[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STError xgetErrorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STError var3 = null;
         var3 = (STError)this.get_store().find_element_user(ERROR$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfErrorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ERROR$36);
      }
   }

   public void setErrorArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ERROR$36);
      }
   }

   public void setErrorArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(ERROR$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetErrorArray(STError[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ERROR$36);
      }
   }

   public void xsetErrorArray(int var1, STError var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STError var4 = null;
         var4 = (STError)this.get_store().find_element_user(ERROR$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertError(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(ERROR$36, var1);
         var4.setStringValue(var2);
      }
   }

   public void addError(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(ERROR$36);
         var3.setStringValue(var1);
      }
   }

   public STError insertNewError(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STError var3 = null;
         var3 = (STError)this.get_store().insert_element_user(ERROR$36, var1);
         return var3;
      }
   }

   public STError addNewError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STError var2 = null;
         var2 = (STError)this.get_store().add_element_user(ERROR$36);
         return var2;
      }
   }

   public void removeError(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ERROR$36, var1);
      }
   }

   public List getClsidList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ClsidList(this);
      }
   }

   public String[] getClsidArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CLSID$38, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getClsidArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CLSID$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetClsidList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ClsidList(this);
      }
   }

   public STClsid[] xgetClsidArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CLSID$38, var2);
         STClsid[] var3 = new STClsid[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STClsid xgetClsidArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var3 = null;
         var3 = (STClsid)this.get_store().find_element_user(CLSID$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfClsidArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLSID$38);
      }
   }

   public void setClsidArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CLSID$38);
      }
   }

   public void setClsidArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(CLSID$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetClsidArray(STClsid[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CLSID$38);
      }
   }

   public void xsetClsidArray(int var1, STClsid var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var4 = null;
         var4 = (STClsid)this.get_store().find_element_user(CLSID$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertClsid(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(CLSID$38, var1);
         var4.setStringValue(var2);
      }
   }

   public void addClsid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(CLSID$38);
         var3.setStringValue(var1);
      }
   }

   public STClsid insertNewClsid(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var3 = null;
         var3 = (STClsid)this.get_store().insert_element_user(CLSID$38, var1);
         return var3;
      }
   }

   public STClsid addNewClsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var2 = null;
         var2 = (STClsid)this.get_store().add_element_user(CLSID$38);
         return var2;
      }
   }

   public void removeClsid(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLSID$38, var1);
      }
   }

   public List getCfList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CfList(this);
      }
   }

   public CTCf[] getCfArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CF$40, var2);
         CTCf[] var3 = new CTCf[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCf getCfArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCf var3 = null;
         var3 = (CTCf)this.get_store().find_element_user(CF$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCfArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CF$40);
      }
   }

   public void setCfArray(CTCf[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CF$40);
      }
   }

   public void setCfArray(int var1, CTCf var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCf var4 = null;
         var4 = (CTCf)this.get_store().find_element_user(CF$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCf insertNewCf(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCf var3 = null;
         var3 = (CTCf)this.get_store().insert_element_user(CF$40, var1);
         return var3;
      }
   }

   public CTCf addNewCf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCf var2 = null;
         var2 = (CTCf)this.get_store().add_element_user(CF$40);
         return var2;
      }
   }

   public void removeCf(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CF$40, var1);
      }
   }

   public STVectorBaseType$Enum getBaseType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BASETYPE$42);
         return var2 == null?null:(STVectorBaseType$Enum)var2.getEnumValue();
      }
   }

   public STVectorBaseType xgetBaseType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVectorBaseType var2 = null;
         var2 = (STVectorBaseType)this.get_store().find_attribute_user(BASETYPE$42);
         return var2;
      }
   }

   public void setBaseType(STVectorBaseType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BASETYPE$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BASETYPE$42);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBaseType(STVectorBaseType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVectorBaseType var3 = null;
         var3 = (STVectorBaseType)this.get_store().find_attribute_user(BASETYPE$42);
         if(var3 == null) {
            var3 = (STVectorBaseType)this.get_store().add_attribute_user(BASETYPE$42);
         }

         var3.set(var1);
      }
   }

   public long getSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SIZE$44);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(SIZE$44);
         return var2;
      }
   }

   public void setSize(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(SIZE$44);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(SIZE$44);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetSize(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(SIZE$44);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(SIZE$44);
         }

         var3.set(var1);
      }
   }

}
