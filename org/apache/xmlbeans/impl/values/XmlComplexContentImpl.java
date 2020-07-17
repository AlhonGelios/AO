package org.apache.xmlbeans.impl.values;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.GDate;
import org.apache.xmlbeans.GDateSpecification;
import org.apache.xmlbeans.GDuration;
import org.apache.xmlbeans.GDurationSpecification;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.SchemaProperty;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.schema.SchemaTypeImpl;
import org.apache.xmlbeans.impl.schema.SchemaTypeVisitorImpl;
import org.apache.xmlbeans.impl.values.NamespaceManager;
import org.apache.xmlbeans.impl.values.TypeStore;
import org.apache.xmlbeans.impl.values.TypeStoreUser;
import org.apache.xmlbeans.impl.values.TypeStoreVisitor;
import org.apache.xmlbeans.impl.values.XmlObjectBase;

public class XmlComplexContentImpl extends XmlObjectBase {

   private SchemaTypeImpl _schemaType;


   public XmlComplexContentImpl(SchemaType type) {
      this._schemaType = (SchemaTypeImpl)type;
      this.initComplexType(true, true);
   }

   public SchemaType schemaType() {
      return this._schemaType;
   }

   public String compute_text(NamespaceManager nsm) {
      return null;
   }

   protected final void set_String(String v) {
      assert this._schemaType.getContentType() != 2;

      if(this._schemaType.getContentType() != 4 && !this._schemaType.isNoType()) {
         throw new IllegalArgumentException("Type does not allow for textual content: " + this._schemaType);
      } else {
         super.set_String(v);
      }
   }

   public void set_text(String str) {
      assert this._schemaType.getContentType() == 4 || this._schemaType.isNoType();

   }

   protected void update_from_complex_content() {}

   public void set_nil() {}

   public boolean equal_to(XmlObject complexObject) {
      return this._schemaType.equals(complexObject.schemaType());
   }

   protected int value_hash_code() {
      throw new IllegalStateException("Complex types cannot be used as hash keys");
   }

   public TypeStoreVisitor new_visitor() {
      return new SchemaTypeVisitorImpl(this._schemaType.getContentModel());
   }

   public boolean is_child_element_order_sensitive() {
      return this.schemaType().isOrderSensitive();
   }

   public int get_elementflags(QName eltName) {
      SchemaProperty prop = this.schemaType().getElementProperty(eltName);
      return prop == null?0:(prop.hasDefault() != 1 && prop.hasFixed() != 1 && prop.hasNillable() != 1?(prop.hasDefault() == 0?0:2) | (prop.hasFixed() == 0?0:4) | (prop.hasNillable() == 0?0:1):-1);
   }

   public String get_default_attribute_text(QName attrName) {
      return super.get_default_attribute_text(attrName);
   }

   public String get_default_element_text(QName eltName) {
      SchemaProperty prop = this.schemaType().getElementProperty(eltName);
      return prop == null?"":prop.getDefaultText();
   }

   protected void unionArraySetterHelper(Object[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).objectSet(sources[i]);
      }

   }

   protected SimpleValue[] arraySetterHelper(int sourcesLength, QName elemName) {
      SimpleValue[] dests = new SimpleValue[sourcesLength];
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > sourcesLength; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < sourcesLength; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         dests[i] = (SimpleValue)user;
      }

      return dests;
   }

   protected SimpleValue[] arraySetterHelper(int sourcesLength, QName elemName, QNameSet set) {
      SimpleValue[] dests = new SimpleValue[sourcesLength];
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > sourcesLength; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < sourcesLength; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         dests[i] = (SimpleValue)user;
      }

      return dests;
   }

   protected void arraySetterHelper(boolean[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(float[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(double[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(byte[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(short[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(int[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(long[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(BigDecimal[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(BigInteger[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(String[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(byte[][] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(GDate[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set((GDateSpecification)sources[i]);
      }

   }

   protected void arraySetterHelper(GDuration[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set((GDurationSpecification)sources[i]);
      }

   }

   protected void arraySetterHelper(Calendar[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(Date[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(QName[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(StringEnumAbstractBase[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(List[] sources, QName elemName) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(elemName); m > n; --m) {
         store.remove_element(elemName, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(elemName, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void unionArraySetterHelper(Object[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).objectSet(sources[i]);
      }

   }

   protected void arraySetterHelper(boolean[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(float[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(double[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(byte[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(short[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(int[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(long[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(BigDecimal[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(BigInteger[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(String[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(byte[][] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(GDate[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set((GDateSpecification)sources[i]);
      }

   }

   protected void arraySetterHelper(GDuration[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set((GDurationSpecification)sources[i]);
      }

   }

   protected void arraySetterHelper(Calendar[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(Date[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(QName[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(StringEnumAbstractBase[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(List[] sources, QName elemName, QNameSet set) {
      int n = sources == null?0:sources.length;
      TypeStore store = this.get_store();

      int m;
      for(m = store.count_elements(set); m > n; --m) {
         store.remove_element(set, m - 1);
      }

      for(int i = 0; i < n; ++i) {
         TypeStoreUser user;
         if(i >= m) {
            user = store.add_element_user(elemName);
         } else {
            user = store.find_element_user(set, i);
         }

         ((XmlObjectBase)user).set(sources[i]);
      }

   }

   protected void arraySetterHelper(XmlObject[] sources, QName elemName) {
      TypeStore store = this.get_store();
      int i;
      if(sources != null && sources.length != 0) {
         int m = store.count_elements(elemName);
         int startSrc = 0;
         int startDest = 0;

         for(i = 0; i < sources.length; ++i) {
            if(!sources[i].isImmutable()) {
               XmlCursor n = sources[i].newCursor();
               if(n.toParent() && n.getObject() == this) {
                  n.dispose();
                  break;
               }

               n.dispose();
            }
         }

         TypeStoreUser user;
         int var14;
         if(i < sources.length) {
            TypeStoreUser var12 = store.find_element_user(elemName, 0);
            if(var12 == sources[i]) {
               boolean j = false;

               for(var14 = 0; var14 < i; ++var14) {
                  user = store.insert_element_user(elemName, var14);
                  ((XmlObjectBase)user).set(sources[var14]);
               }

               ++i;
               ++var14;

               while(i < sources.length) {
                  XmlCursor var15 = sources[i].isImmutable()?null:sources[i].newCursor();
                  if(var15 != null && var15.toParent() && var15.getObject() == this) {
                     var15.dispose();
                     var12 = store.find_element_user(elemName, var14);
                     if(var12 != sources[i]) {
                        break;
                     }
                  } else {
                     var15.dispose();
                     TypeStoreUser user1 = store.insert_element_user(elemName, var14);
                     ((XmlObjectBase)user1).set(sources[i]);
                  }

                  ++i;
                  ++var14;
               }

               startDest = var14;
               startSrc = i;
               m = store.count_elements(elemName);
            }
         }

         int var13;
         for(var13 = i; var13 < sources.length; ++var13) {
            TypeStoreUser var16 = store.add_element_user(elemName);
            ((XmlObjectBase)var16).set(sources[var13]);
         }

         for(var13 = i; m > var13 - startSrc + startDest; --m) {
            store.remove_element(elemName, m - 1);
         }

         i = startSrc;

         for(var14 = startDest; i < var13; ++var14) {
            if(var14 >= m) {
               user = store.add_element_user(elemName);
            } else {
               user = store.find_element_user(elemName, var14);
            }

            ((XmlObjectBase)user).set(sources[i]);
            ++i;
         }

      } else {
         for(i = store.count_elements(elemName); i > 0; --i) {
            store.remove_element(elemName, 0);
         }

      }
   }

   protected void arraySetterHelper(XmlObject[] sources, QName elemName, QNameSet set) {
      TypeStore store = this.get_store();
      int i;
      if(sources != null && sources.length != 0) {
         int m = store.count_elements(set);
         int startSrc = 0;
         int startDest = 0;

         for(i = 0; i < sources.length; ++i) {
            if(!sources[i].isImmutable()) {
               XmlCursor n = sources[i].newCursor();
               if(n.toParent() && n.getObject() == this) {
                  n.dispose();
                  break;
               }

               n.dispose();
            }
         }

         TypeStoreUser user;
         int var15;
         if(i < sources.length) {
            TypeStoreUser var13 = store.find_element_user(set, 0);
            if(var13 == sources[i]) {
               boolean j = false;

               for(var15 = 0; var15 < i; ++var15) {
                  user = store.insert_element_user(set, elemName, var15);
                  ((XmlObjectBase)user).set(sources[var15]);
               }

               ++i;
               ++var15;

               while(i < sources.length) {
                  XmlCursor var16 = sources[i].isImmutable()?null:sources[i].newCursor();
                  if(var16 != null && var16.toParent() && var16.getObject() == this) {
                     var16.dispose();
                     var13 = store.find_element_user(set, var15);
                     if(var13 != sources[i]) {
                        break;
                     }
                  } else {
                     var16.dispose();
                     TypeStoreUser user1 = store.insert_element_user(set, elemName, var15);
                     ((XmlObjectBase)user1).set(sources[i]);
                  }

                  ++i;
                  ++var15;
               }

               startDest = var15;
               startSrc = i;
               m = store.count_elements(elemName);
            }
         }

         int var14;
         for(var14 = i; var14 < sources.length; ++var14) {
            TypeStoreUser var17 = store.add_element_user(elemName);
            ((XmlObjectBase)var17).set(sources[var14]);
         }

         for(var14 = i; m > var14 - startSrc + startDest; --m) {
            store.remove_element(set, m - 1);
         }

         i = startSrc;

         for(var15 = startDest; i < var14; ++var15) {
            if(var15 >= m) {
               user = store.add_element_user(elemName);
            } else {
               user = store.find_element_user(set, var15);
            }

            ((XmlObjectBase)user).set(sources[i]);
            ++i;
         }

      } else {
         for(i = store.count_elements(set); i > 0; --i) {
            store.remove_element(set, 0);
         }

      }
   }

}
