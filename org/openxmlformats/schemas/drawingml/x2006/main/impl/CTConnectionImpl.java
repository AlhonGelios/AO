package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnection;
import org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId;

public class CTConnectionImpl extends XmlComplexContentImpl implements CTConnection {

   private static final QName ID$0 = new QName("", "id");
   private static final QName IDX$2 = new QName("", "idx");


   public CTConnectionImpl(SchemaType var1) {
      super(var1);
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDrawingElementId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDrawingElementId var2 = null;
         var2 = (STDrawingElementId)this.get_store().find_attribute_user(ID$0);
         return var2;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(STDrawingElementId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDrawingElementId var3 = null;
         var3 = (STDrawingElementId)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (STDrawingElementId)this.get_store().add_attribute_user(ID$0);
         }

         var3.set(var1);
      }
   }

   public long getIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IDX$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(IDX$2);
         return var2;
      }
   }

   public void setIdx(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(IDX$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(IDX$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIdx(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(IDX$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(IDX$2);
         }

         var3.set(var1);
      }
   }

}
