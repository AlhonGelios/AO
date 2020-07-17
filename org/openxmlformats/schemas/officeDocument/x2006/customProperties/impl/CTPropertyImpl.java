package org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlByte;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDecimal;
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
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError;

public class CTPropertyImpl extends XmlComplexContentImpl implements CTProperty {

   private static final QName VECTOR$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vector");
   private static final QName ARRAY$2 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "array");
   private static final QName BLOB$4 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "blob");
   private static final QName OBLOB$6 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "oblob");
   private static final QName EMPTY$8 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "empty");
   private static final QName NULL$10 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "null");
   private static final QName I1$12 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i1");
   private static final QName I2$14 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i2");
   private static final QName I4$16 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i4");
   private static final QName I8$18 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i8");
   private static final QName INT$20 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "int");
   private static final QName UI1$22 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui1");
   private static final QName UI2$24 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui2");
   private static final QName UI4$26 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui4");
   private static final QName UI8$28 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui8");
   private static final QName UINT$30 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "uint");
   private static final QName R4$32 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r4");
   private static final QName R8$34 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r8");
   private static final QName DECIMAL$36 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "decimal");
   private static final QName LPSTR$38 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpstr");
   private static final QName LPWSTR$40 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpwstr");
   private static final QName BSTR$42 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bstr");
   private static final QName DATE$44 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "date");
   private static final QName FILETIME$46 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "filetime");
   private static final QName BOOL$48 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bool");
   private static final QName CY$50 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cy");
   private static final QName ERROR$52 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "error");
   private static final QName STREAM$54 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "stream");
   private static final QName OSTREAM$56 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ostream");
   private static final QName STORAGE$58 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "storage");
   private static final QName OSTORAGE$60 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ostorage");
   private static final QName VSTREAM$62 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vstream");
   private static final QName CLSID$64 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "clsid");
   private static final QName CF$66 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cf");
   private static final QName FMTID$68 = new QName("", "fmtid");
   private static final QName PID$70 = new QName("", "pid");
   private static final QName NAME$72 = new QName("", "name");
   private static final QName LINKTARGET$74 = new QName("", "linkTarget");


   public CTPropertyImpl(SchemaType var1) {
      super(var1);
   }

   public CTVector getVector() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVector var2 = null;
         var2 = (CTVector)this.get_store().find_element_user(VECTOR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVector() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VECTOR$0) != 0;
      }
   }

   public void setVector(CTVector var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVector var3 = null;
         var3 = (CTVector)this.get_store().find_element_user(VECTOR$0, 0);
         if(var3 == null) {
            var3 = (CTVector)this.get_store().add_element_user(VECTOR$0);
         }

         var3.set(var1);
      }
   }

   public CTVector addNewVector() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVector var2 = null;
         var2 = (CTVector)this.get_store().add_element_user(VECTOR$0);
         return var2;
      }
   }

   public void unsetVector() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VECTOR$0, 0);
      }
   }

   public CTArray getArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArray var2 = null;
         var2 = (CTArray)this.get_store().find_element_user(ARRAY$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ARRAY$2) != 0;
      }
   }

   public void setArray(CTArray var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArray var3 = null;
         var3 = (CTArray)this.get_store().find_element_user(ARRAY$2, 0);
         if(var3 == null) {
            var3 = (CTArray)this.get_store().add_element_user(ARRAY$2);
         }

         var3.set(var1);
      }
   }

   public CTArray addNewArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArray var2 = null;
         var2 = (CTArray)this.get_store().add_element_user(ARRAY$2);
         return var2;
      }
   }

   public void unsetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ARRAY$2, 0);
      }
   }

   public byte[] getBlob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(BLOB$4, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetBlob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(BLOB$4, 0);
         return var2;
      }
   }

   public boolean isSetBlob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLOB$4) != 0;
      }
   }

   public void setBlob(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BLOB$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(BLOB$4);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetBlob(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(BLOB$4, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(BLOB$4);
         }

         var3.set(var1);
      }
   }

   public void unsetBlob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLOB$4, 0);
      }
   }

   public byte[] getOblob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(OBLOB$6, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetOblob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(OBLOB$6, 0);
         return var2;
      }
   }

   public boolean isSetOblob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OBLOB$6) != 0;
      }
   }

   public void setOblob(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(OBLOB$6, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(OBLOB$6);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetOblob(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(OBLOB$6, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(OBLOB$6);
         }

         var3.set(var1);
      }
   }

   public void unsetOblob() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OBLOB$6, 0);
      }
   }

   public CTEmpty getEmpty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().find_element_user(EMPTY$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEmpty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EMPTY$8) != 0;
      }
   }

   public void setEmpty(CTEmpty var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(EMPTY$8, 0);
         if(var3 == null) {
            var3 = (CTEmpty)this.get_store().add_element_user(EMPTY$8);
         }

         var3.set(var1);
      }
   }

   public CTEmpty addNewEmpty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(EMPTY$8);
         return var2;
      }
   }

   public void unsetEmpty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EMPTY$8, 0);
      }
   }

   public CTNull getNull() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNull var2 = null;
         var2 = (CTNull)this.get_store().find_element_user(NULL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNull() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NULL$10) != 0;
      }
   }

   public void setNull(CTNull var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNull var3 = null;
         var3 = (CTNull)this.get_store().find_element_user(NULL$10, 0);
         if(var3 == null) {
            var3 = (CTNull)this.get_store().add_element_user(NULL$10);
         }

         var3.set(var1);
      }
   }

   public CTNull addNewNull() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNull var2 = null;
         var2 = (CTNull)this.get_store().add_element_user(NULL$10);
         return var2;
      }
   }

   public void unsetNull() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NULL$10, 0);
      }
   }

   public byte getI1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(I1$12, 0);
         return var2 == null?0:var2.getByteValue();
      }
   }

   public XmlByte xgetI1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var2 = null;
         var2 = (XmlByte)this.get_store().find_element_user(I1$12, 0);
         return var2;
      }
   }

   public boolean isSetI1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I1$12) != 0;
      }
   }

   public void setI1(byte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(I1$12, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(I1$12);
         }

         var3.setByteValue(var1);
      }
   }

   public void xsetI1(XmlByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlByte var3 = null;
         var3 = (XmlByte)this.get_store().find_element_user(I1$12, 0);
         if(var3 == null) {
            var3 = (XmlByte)this.get_store().add_element_user(I1$12);
         }

         var3.set(var1);
      }
   }

   public void unsetI1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I1$12, 0);
      }
   }

   public short getI2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(I2$14, 0);
         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlShort xgetI2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlShort var2 = null;
         var2 = (XmlShort)this.get_store().find_element_user(I2$14, 0);
         return var2;
      }
   }

   public boolean isSetI2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I2$14) != 0;
      }
   }

   public void setI2(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(I2$14, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(I2$14);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetI2(XmlShort var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlShort var3 = null;
         var3 = (XmlShort)this.get_store().find_element_user(I2$14, 0);
         if(var3 == null) {
            var3 = (XmlShort)this.get_store().add_element_user(I2$14);
         }

         var3.set(var1);
      }
   }

   public void unsetI2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I2$14, 0);
      }
   }

   public int getI4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(I4$16, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetI4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(I4$16, 0);
         return var2;
      }
   }

   public boolean isSetI4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I4$16) != 0;
      }
   }

   public void setI4(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(I4$16, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(I4$16);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetI4(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(I4$16, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(I4$16);
         }

         var3.set(var1);
      }
   }

   public void unsetI4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I4$16, 0);
      }
   }

   public long getI8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(I8$18, 0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlLong xgetI8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlLong var2 = null;
         var2 = (XmlLong)this.get_store().find_element_user(I8$18, 0);
         return var2;
      }
   }

   public boolean isSetI8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I8$18) != 0;
      }
   }

   public void setI8(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(I8$18, 0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_element_user(I8$18);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetI8(XmlLong var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlLong var3 = null;
         var3 = (XmlLong)this.get_store().find_element_user(I8$18, 0);
         if(var3 == null) {
            var3 = (XmlLong)this.get_store().add_element_user(I8$18);
         }

         var3.set(var1);
      }
   }

   public void unsetI8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I8$18, 0);
      }
   }

   public int getInt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(INT$20, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetInt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(INT$20, 0);
         return var2;
      }
   }

   public boolean isSetInt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INT$20) != 0;
      }
   }

   public void setInt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(INT$20, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(INT$20);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetInt(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(INT$20, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(INT$20);
         }

         var3.set(var1);
      }
   }

   public void unsetInt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INT$20, 0);
      }
   }

   public short getUi1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(UI1$22, 0);
         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetUi1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_element_user(UI1$22, 0);
         return var2;
      }
   }

   public boolean isSetUi1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI1$22) != 0;
      }
   }

   public void setUi1(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UI1$22, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(UI1$22);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetUi1(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_element_user(UI1$22, 0);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_element_user(UI1$22);
         }

         var3.set(var1);
      }
   }

   public void unsetUi1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI1$22, 0);
      }
   }

   public int getUi2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(UI2$24, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlUnsignedShort xgetUi2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var2 = null;
         var2 = (XmlUnsignedShort)this.get_store().find_element_user(UI2$24, 0);
         return var2;
      }
   }

   public boolean isSetUi2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI2$24) != 0;
      }
   }

   public void setUi2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UI2$24, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(UI2$24);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetUi2(XmlUnsignedShort var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var3 = null;
         var3 = (XmlUnsignedShort)this.get_store().find_element_user(UI2$24, 0);
         if(var3 == null) {
            var3 = (XmlUnsignedShort)this.get_store().add_element_user(UI2$24);
         }

         var3.set(var1);
      }
   }

   public void unsetUi2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI2$24, 0);
      }
   }

   public long getUi4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(UI4$26, 0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetUi4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_element_user(UI4$26, 0);
         return var2;
      }
   }

   public boolean isSetUi4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI4$26) != 0;
      }
   }

   public void setUi4(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(UI4$26, 0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_element_user(UI4$26);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetUi4(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_element_user(UI4$26, 0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_element_user(UI4$26);
         }

         var3.set(var1);
      }
   }

   public void unsetUi4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI4$26, 0);
      }
   }

   public BigInteger getUi8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(UI8$28, 0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlUnsignedLong xgetUi8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedLong var2 = null;
         var2 = (XmlUnsignedLong)this.get_store().find_element_user(UI8$28, 0);
         return var2;
      }
   }

   public boolean isSetUi8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UI8$28) != 0;
      }
   }

   public void setUi8(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UI8$28, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(UI8$28);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetUi8(XmlUnsignedLong var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedLong var3 = null;
         var3 = (XmlUnsignedLong)this.get_store().find_element_user(UI8$28, 0);
         if(var3 == null) {
            var3 = (XmlUnsignedLong)this.get_store().add_element_user(UI8$28);
         }

         var3.set(var1);
      }
   }

   public void unsetUi8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UI8$28, 0);
      }
   }

   public long getUint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(UINT$30, 0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetUint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_element_user(UINT$30, 0);
         return var2;
      }
   }

   public boolean isSetUint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UINT$30) != 0;
      }
   }

   public void setUint(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(UINT$30, 0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_element_user(UINT$30);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetUint(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_element_user(UINT$30, 0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_element_user(UINT$30);
         }

         var3.set(var1);
      }
   }

   public void unsetUint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UINT$30, 0);
      }
   }

   public float getR4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(R4$32, 0);
         return var2 == null?0.0F:var2.getFloatValue();
      }
   }

   public XmlFloat xgetR4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var2 = null;
         var2 = (XmlFloat)this.get_store().find_element_user(R4$32, 0);
         return var2;
      }
   }

   public boolean isSetR4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R4$32) != 0;
      }
   }

   public void setR4(float var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(R4$32, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(R4$32);
         }

         var3.setFloatValue(var1);
      }
   }

   public void xsetR4(XmlFloat var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var3 = null;
         var3 = (XmlFloat)this.get_store().find_element_user(R4$32, 0);
         if(var3 == null) {
            var3 = (XmlFloat)this.get_store().add_element_user(R4$32);
         }

         var3.set(var1);
      }
   }

   public void unsetR4() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R4$32, 0);
      }
   }

   public double getR8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(R8$34, 0);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetR8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_element_user(R8$34, 0);
         return var2;
      }
   }

   public boolean isSetR8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R8$34) != 0;
      }
   }

   public void setR8(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(R8$34, 0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_element_user(R8$34);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetR8(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_element_user(R8$34, 0);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_element_user(R8$34);
         }

         var3.set(var1);
      }
   }

   public void unsetR8() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R8$34, 0);
      }
   }

   public BigDecimal getDecimal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DECIMAL$36, 0);
         return var2 == null?null:var2.getBigDecimalValue();
      }
   }

   public XmlDecimal xgetDecimal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDecimal var2 = null;
         var2 = (XmlDecimal)this.get_store().find_element_user(DECIMAL$36, 0);
         return var2;
      }
   }

   public boolean isSetDecimal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DECIMAL$36) != 0;
      }
   }

   public void setDecimal(BigDecimal var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DECIMAL$36, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DECIMAL$36);
         }

         var3.setBigDecimalValue(var1);
      }
   }

   public void xsetDecimal(XmlDecimal var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDecimal var3 = null;
         var3 = (XmlDecimal)this.get_store().find_element_user(DECIMAL$36, 0);
         if(var3 == null) {
            var3 = (XmlDecimal)this.get_store().add_element_user(DECIMAL$36);
         }

         var3.set(var1);
      }
   }

   public void unsetDecimal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DECIMAL$36, 0);
      }
   }

   public String getLpstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(LPSTR$38, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetLpstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(LPSTR$38, 0);
         return var2;
      }
   }

   public boolean isSetLpstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LPSTR$38) != 0;
      }
   }

   public void setLpstr(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LPSTR$38, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(LPSTR$38);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLpstr(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(LPSTR$38, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(LPSTR$38);
         }

         var3.set(var1);
      }
   }

   public void unsetLpstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LPSTR$38, 0);
      }
   }

   public String getLpwstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(LPWSTR$40, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetLpwstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(LPWSTR$40, 0);
         return var2;
      }
   }

   public boolean isSetLpwstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LPWSTR$40) != 0;
      }
   }

   public void setLpwstr(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LPWSTR$40, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(LPWSTR$40);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLpwstr(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(LPWSTR$40, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(LPWSTR$40);
         }

         var3.set(var1);
      }
   }

   public void unsetLpwstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LPWSTR$40, 0);
      }
   }

   public String getBstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(BSTR$42, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(BSTR$42, 0);
         return var2;
      }
   }

   public boolean isSetBstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BSTR$42) != 0;
      }
   }

   public void setBstr(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BSTR$42, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(BSTR$42);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBstr(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(BSTR$42, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(BSTR$42);
         }

         var3.set(var1);
      }
   }

   public void unsetBstr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BSTR$42, 0);
      }
   }

   public Calendar getDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DATE$44, 0);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_element_user(DATE$44, 0);
         return var2;
      }
   }

   public boolean isSetDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATE$44) != 0;
      }
   }

   public void setDate(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DATE$44, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DATE$44);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetDate(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_element_user(DATE$44, 0);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_element_user(DATE$44);
         }

         var3.set((XmlObject)var1);
      }
   }

   public void unsetDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATE$44, 0);
      }
   }

   public Calendar getFiletime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(FILETIME$46, 0);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetFiletime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_element_user(FILETIME$46, 0);
         return var2;
      }
   }

   public boolean isSetFiletime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILETIME$46) != 0;
      }
   }

   public void setFiletime(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FILETIME$46, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(FILETIME$46);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetFiletime(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_element_user(FILETIME$46, 0);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_element_user(FILETIME$46);
         }

         var3.set((XmlObject)var1);
      }
   }

   public void unsetFiletime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILETIME$46, 0);
      }
   }

   public boolean getBool() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(BOOL$48, 0);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBool() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_element_user(BOOL$48, 0);
         return var2;
      }
   }

   public boolean isSetBool() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOL$48) != 0;
      }
   }

   public void setBool(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BOOL$48, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(BOOL$48);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBool(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_element_user(BOOL$48, 0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_element_user(BOOL$48);
         }

         var3.set(var1);
      }
   }

   public void unsetBool() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOL$48, 0);
      }
   }

   public String getCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(CY$50, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCy xgetCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCy var2 = null;
         var2 = (STCy)this.get_store().find_element_user(CY$50, 0);
         return var2;
      }
   }

   public boolean isSetCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CY$50) != 0;
      }
   }

   public void setCy(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CY$50, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(CY$50);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCy(STCy var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCy var3 = null;
         var3 = (STCy)this.get_store().find_element_user(CY$50, 0);
         if(var3 == null) {
            var3 = (STCy)this.get_store().add_element_user(CY$50);
         }

         var3.set(var1);
      }
   }

   public void unsetCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CY$50, 0);
      }
   }

   public String getError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(ERROR$52, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STError xgetError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STError var2 = null;
         var2 = (STError)this.get_store().find_element_user(ERROR$52, 0);
         return var2;
      }
   }

   public boolean isSetError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ERROR$52) != 0;
      }
   }

   public void setError(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ERROR$52, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(ERROR$52);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetError(STError var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STError var3 = null;
         var3 = (STError)this.get_store().find_element_user(ERROR$52, 0);
         if(var3 == null) {
            var3 = (STError)this.get_store().add_element_user(ERROR$52);
         }

         var3.set(var1);
      }
   }

   public void unsetError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ERROR$52, 0);
      }
   }

   public byte[] getStream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(STREAM$54, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetStream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(STREAM$54, 0);
         return var2;
      }
   }

   public boolean isSetStream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STREAM$54) != 0;
      }
   }

   public void setStream(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(STREAM$54, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(STREAM$54);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetStream(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(STREAM$54, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(STREAM$54);
         }

         var3.set(var1);
      }
   }

   public void unsetStream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STREAM$54, 0);
      }
   }

   public byte[] getOstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(OSTREAM$56, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetOstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(OSTREAM$56, 0);
         return var2;
      }
   }

   public boolean isSetOstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OSTREAM$56) != 0;
      }
   }

   public void setOstream(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(OSTREAM$56, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(OSTREAM$56);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetOstream(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(OSTREAM$56, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(OSTREAM$56);
         }

         var3.set(var1);
      }
   }

   public void unsetOstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OSTREAM$56, 0);
      }
   }

   public byte[] getStorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(STORAGE$58, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetStorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(STORAGE$58, 0);
         return var2;
      }
   }

   public boolean isSetStorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STORAGE$58) != 0;
      }
   }

   public void setStorage(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(STORAGE$58, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(STORAGE$58);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetStorage(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(STORAGE$58, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(STORAGE$58);
         }

         var3.set(var1);
      }
   }

   public void unsetStorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STORAGE$58, 0);
      }
   }

   public byte[] getOstorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(OSTORAGE$60, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetOstorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(OSTORAGE$60, 0);
         return var2;
      }
   }

   public boolean isSetOstorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OSTORAGE$60) != 0;
      }
   }

   public void setOstorage(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(OSTORAGE$60, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(OSTORAGE$60);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetOstorage(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(OSTORAGE$60, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(OSTORAGE$60);
         }

         var3.set(var1);
      }
   }

   public void unsetOstorage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OSTORAGE$60, 0);
      }
   }

   public CTVstream getVstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVstream var2 = null;
         var2 = (CTVstream)this.get_store().find_element_user(VSTREAM$62, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VSTREAM$62) != 0;
      }
   }

   public void setVstream(CTVstream var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVstream var3 = null;
         var3 = (CTVstream)this.get_store().find_element_user(VSTREAM$62, 0);
         if(var3 == null) {
            var3 = (CTVstream)this.get_store().add_element_user(VSTREAM$62);
         }

         var3.set(var1);
      }
   }

   public CTVstream addNewVstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVstream var2 = null;
         var2 = (CTVstream)this.get_store().add_element_user(VSTREAM$62);
         return var2;
      }
   }

   public void unsetVstream() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VSTREAM$62, 0);
      }
   }

   public String getClsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(CLSID$64, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STClsid xgetClsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var2 = null;
         var2 = (STClsid)this.get_store().find_element_user(CLSID$64, 0);
         return var2;
      }
   }

   public boolean isSetClsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLSID$64) != 0;
      }
   }

   public void setClsid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CLSID$64, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(CLSID$64);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetClsid(STClsid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var3 = null;
         var3 = (STClsid)this.get_store().find_element_user(CLSID$64, 0);
         if(var3 == null) {
            var3 = (STClsid)this.get_store().add_element_user(CLSID$64);
         }

         var3.set(var1);
      }
   }

   public void unsetClsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLSID$64, 0);
      }
   }

   public CTCf getCf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCf var2 = null;
         var2 = (CTCf)this.get_store().find_element_user(CF$66, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CF$66) != 0;
      }
   }

   public void setCf(CTCf var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCf var3 = null;
         var3 = (CTCf)this.get_store().find_element_user(CF$66, 0);
         if(var3 == null) {
            var3 = (CTCf)this.get_store().add_element_user(CF$66);
         }

         var3.set(var1);
      }
   }

   public CTCf addNewCf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCf var2 = null;
         var2 = (CTCf)this.get_store().add_element_user(CF$66);
         return var2;
      }
   }

   public void unsetCf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CF$66, 0);
      }
   }

   public String getFmtid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FMTID$68);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STClsid xgetFmtid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var2 = null;
         var2 = (STClsid)this.get_store().find_attribute_user(FMTID$68);
         return var2;
      }
   }

   public void setFmtid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FMTID$68);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FMTID$68);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFmtid(STClsid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STClsid var3 = null;
         var3 = (STClsid)this.get_store().find_attribute_user(FMTID$68);
         if(var3 == null) {
            var3 = (STClsid)this.get_store().add_attribute_user(FMTID$68);
         }

         var3.set(var1);
      }
   }

   public int getPid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PID$70);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetPid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(PID$70);
         return var2;
      }
   }

   public void setPid(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PID$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PID$70);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetPid(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(PID$70);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(PID$70);
         }

         var3.set(var1);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$72);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$72);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$72) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$72);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$72);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$72);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$72);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$72);
      }
   }

   public String getLinkTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LINKTARGET$74);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetLinkTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(LINKTARGET$74);
         return var2;
      }
   }

   public boolean isSetLinkTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LINKTARGET$74) != null;
      }
   }

   public void setLinkTarget(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LINKTARGET$74);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LINKTARGET$74);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLinkTarget(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(LINKTARGET$74);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(LINKTARGET$74);
         }

         var3.set(var1);
      }
   }

   public void unsetLinkTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LINKTARGET$74);
      }
   }

}
