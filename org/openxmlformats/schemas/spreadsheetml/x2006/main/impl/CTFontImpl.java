package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1BList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1CharsetList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1ColorList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1CondenseList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1ExtendList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1FamilyList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1IList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1NameList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1OutlineList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1SchemeList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1ShadowList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1StrikeList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1SzList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1UList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl.1VertAlignList;

public class CTFontImpl extends XmlComplexContentImpl implements CTFont {

   private static final QName NAME$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "name");
   private static final QName CHARSET$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "charset");
   private static final QName FAMILY$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "family");
   private static final QName B$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "b");
   private static final QName I$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "i");
   private static final QName STRIKE$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "strike");
   private static final QName OUTLINE$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "outline");
   private static final QName SHADOW$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "shadow");
   private static final QName CONDENSE$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "condense");
   private static final QName EXTEND$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extend");
   private static final QName COLOR$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
   private static final QName SZ$22 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sz");
   private static final QName U$24 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "u");
   private static final QName VERTALIGN$26 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "vertAlign");
   private static final QName SCHEME$28 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "scheme");


   public CTFontImpl(SchemaType var1) {
      super(var1);
   }

   public List getNameList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NameList(this);
      }
   }

   public CTFontName[] getNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NAME$0, var2);
         CTFontName[] var3 = new CTFontName[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFontName getNameArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontName var3 = null;
         var3 = (CTFontName)this.get_store().find_element_user(NAME$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NAME$0);
      }
   }

   public void setNameArray(CTFontName[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NAME$0);
      }
   }

   public void setNameArray(int var1, CTFontName var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontName var4 = null;
         var4 = (CTFontName)this.get_store().find_element_user(NAME$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFontName insertNewName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontName var3 = null;
         var3 = (CTFontName)this.get_store().insert_element_user(NAME$0, var1);
         return var3;
      }
   }

   public CTFontName addNewName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontName var2 = null;
         var2 = (CTFontName)this.get_store().add_element_user(NAME$0);
         return var2;
      }
   }

   public void removeName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NAME$0, var1);
      }
   }

   public List getCharsetList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CharsetList(this);
      }
   }

   public CTIntProperty[] getCharsetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CHARSET$2, var2);
         CTIntProperty[] var3 = new CTIntProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTIntProperty getCharsetArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var3 = null;
         var3 = (CTIntProperty)this.get_store().find_element_user(CHARSET$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCharsetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHARSET$2);
      }
   }

   public void setCharsetArray(CTIntProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CHARSET$2);
      }
   }

   public void setCharsetArray(int var1, CTIntProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var4 = null;
         var4 = (CTIntProperty)this.get_store().find_element_user(CHARSET$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTIntProperty insertNewCharset(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var3 = null;
         var3 = (CTIntProperty)this.get_store().insert_element_user(CHARSET$2, var1);
         return var3;
      }
   }

   public CTIntProperty addNewCharset() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var2 = null;
         var2 = (CTIntProperty)this.get_store().add_element_user(CHARSET$2);
         return var2;
      }
   }

   public void removeCharset(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHARSET$2, var1);
      }
   }

   public List getFamilyList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FamilyList(this);
      }
   }

   public CTIntProperty[] getFamilyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FAMILY$4, var2);
         CTIntProperty[] var3 = new CTIntProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTIntProperty getFamilyArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var3 = null;
         var3 = (CTIntProperty)this.get_store().find_element_user(FAMILY$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFamilyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FAMILY$4);
      }
   }

   public void setFamilyArray(CTIntProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FAMILY$4);
      }
   }

   public void setFamilyArray(int var1, CTIntProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var4 = null;
         var4 = (CTIntProperty)this.get_store().find_element_user(FAMILY$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTIntProperty insertNewFamily(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var3 = null;
         var3 = (CTIntProperty)this.get_store().insert_element_user(FAMILY$4, var1);
         return var3;
      }
   }

   public CTIntProperty addNewFamily() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIntProperty var2 = null;
         var2 = (CTIntProperty)this.get_store().add_element_user(FAMILY$4);
         return var2;
      }
   }

   public void removeFamily(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FAMILY$4, var1);
      }
   }

   public List getBList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BList(this);
      }
   }

   public CTBooleanProperty[] getBArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(B$6, var2);
         CTBooleanProperty[] var3 = new CTBooleanProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBooleanProperty getBArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().find_element_user(B$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(B$6);
      }
   }

   public void setBArray(CTBooleanProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, B$6);
      }
   }

   public void setBArray(int var1, CTBooleanProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var4 = null;
         var4 = (CTBooleanProperty)this.get_store().find_element_user(B$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBooleanProperty insertNewB(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().insert_element_user(B$6, var1);
         return var3;
      }
   }

   public CTBooleanProperty addNewB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var2 = null;
         var2 = (CTBooleanProperty)this.get_store().add_element_user(B$6);
         return var2;
      }
   }

   public void removeB(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(B$6, var1);
      }
   }

   public List getIList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1IList(this);
      }
   }

   public CTBooleanProperty[] getIArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(I$8, var2);
         CTBooleanProperty[] var3 = new CTBooleanProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBooleanProperty getIArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().find_element_user(I$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfIArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I$8);
      }
   }

   public void setIArray(CTBooleanProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, I$8);
      }
   }

   public void setIArray(int var1, CTBooleanProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var4 = null;
         var4 = (CTBooleanProperty)this.get_store().find_element_user(I$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBooleanProperty insertNewI(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().insert_element_user(I$8, var1);
         return var3;
      }
   }

   public CTBooleanProperty addNewI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var2 = null;
         var2 = (CTBooleanProperty)this.get_store().add_element_user(I$8);
         return var2;
      }
   }

   public void removeI(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I$8, var1);
      }
   }

   public List getStrikeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1StrikeList(this);
      }
   }

   public CTBooleanProperty[] getStrikeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(STRIKE$10, var2);
         CTBooleanProperty[] var3 = new CTBooleanProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBooleanProperty getStrikeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().find_element_user(STRIKE$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfStrikeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STRIKE$10);
      }
   }

   public void setStrikeArray(CTBooleanProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, STRIKE$10);
      }
   }

   public void setStrikeArray(int var1, CTBooleanProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var4 = null;
         var4 = (CTBooleanProperty)this.get_store().find_element_user(STRIKE$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBooleanProperty insertNewStrike(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().insert_element_user(STRIKE$10, var1);
         return var3;
      }
   }

   public CTBooleanProperty addNewStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var2 = null;
         var2 = (CTBooleanProperty)this.get_store().add_element_user(STRIKE$10);
         return var2;
      }
   }

   public void removeStrike(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STRIKE$10, var1);
      }
   }

   public List getOutlineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OutlineList(this);
      }
   }

   public CTBooleanProperty[] getOutlineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OUTLINE$12, var2);
         CTBooleanProperty[] var3 = new CTBooleanProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBooleanProperty getOutlineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().find_element_user(OUTLINE$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOutlineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OUTLINE$12);
      }
   }

   public void setOutlineArray(CTBooleanProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OUTLINE$12);
      }
   }

   public void setOutlineArray(int var1, CTBooleanProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var4 = null;
         var4 = (CTBooleanProperty)this.get_store().find_element_user(OUTLINE$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBooleanProperty insertNewOutline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().insert_element_user(OUTLINE$12, var1);
         return var3;
      }
   }

   public CTBooleanProperty addNewOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var2 = null;
         var2 = (CTBooleanProperty)this.get_store().add_element_user(OUTLINE$12);
         return var2;
      }
   }

   public void removeOutline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OUTLINE$12, var1);
      }
   }

   public List getShadowList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ShadowList(this);
      }
   }

   public CTBooleanProperty[] getShadowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHADOW$14, var2);
         CTBooleanProperty[] var3 = new CTBooleanProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBooleanProperty getShadowArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().find_element_user(SHADOW$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfShadowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHADOW$14);
      }
   }

   public void setShadowArray(CTBooleanProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHADOW$14);
      }
   }

   public void setShadowArray(int var1, CTBooleanProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var4 = null;
         var4 = (CTBooleanProperty)this.get_store().find_element_user(SHADOW$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBooleanProperty insertNewShadow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().insert_element_user(SHADOW$14, var1);
         return var3;
      }
   }

   public CTBooleanProperty addNewShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var2 = null;
         var2 = (CTBooleanProperty)this.get_store().add_element_user(SHADOW$14);
         return var2;
      }
   }

   public void removeShadow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHADOW$14, var1);
      }
   }

   public List getCondenseList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CondenseList(this);
      }
   }

   public CTBooleanProperty[] getCondenseArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CONDENSE$16, var2);
         CTBooleanProperty[] var3 = new CTBooleanProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBooleanProperty getCondenseArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().find_element_user(CONDENSE$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCondenseArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONDENSE$16);
      }
   }

   public void setCondenseArray(CTBooleanProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CONDENSE$16);
      }
   }

   public void setCondenseArray(int var1, CTBooleanProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var4 = null;
         var4 = (CTBooleanProperty)this.get_store().find_element_user(CONDENSE$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBooleanProperty insertNewCondense(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().insert_element_user(CONDENSE$16, var1);
         return var3;
      }
   }

   public CTBooleanProperty addNewCondense() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var2 = null;
         var2 = (CTBooleanProperty)this.get_store().add_element_user(CONDENSE$16);
         return var2;
      }
   }

   public void removeCondense(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONDENSE$16, var1);
      }
   }

   public List getExtendList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ExtendList(this);
      }
   }

   public CTBooleanProperty[] getExtendArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EXTEND$18, var2);
         CTBooleanProperty[] var3 = new CTBooleanProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBooleanProperty getExtendArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().find_element_user(EXTEND$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfExtendArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTEND$18);
      }
   }

   public void setExtendArray(CTBooleanProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EXTEND$18);
      }
   }

   public void setExtendArray(int var1, CTBooleanProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var4 = null;
         var4 = (CTBooleanProperty)this.get_store().find_element_user(EXTEND$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBooleanProperty insertNewExtend(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var3 = null;
         var3 = (CTBooleanProperty)this.get_store().insert_element_user(EXTEND$18, var1);
         return var3;
      }
   }

   public CTBooleanProperty addNewExtend() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBooleanProperty var2 = null;
         var2 = (CTBooleanProperty)this.get_store().add_element_user(EXTEND$18);
         return var2;
      }
   }

   public void removeExtend(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTEND$18, var1);
      }
   }

   public List getColorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ColorList(this);
      }
   }

   public CTColor[] getColorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLOR$20, var2);
         CTColor[] var3 = new CTColor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTColor getColorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(COLOR$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfColorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLOR$20);
      }
   }

   public void setColorArray(CTColor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLOR$20);
      }
   }

   public void setColorArray(int var1, CTColor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var4 = null;
         var4 = (CTColor)this.get_store().find_element_user(COLOR$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTColor insertNewColor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().insert_element_user(COLOR$20, var1);
         return var3;
      }
   }

   public CTColor addNewColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(COLOR$20);
         return var2;
      }
   }

   public void removeColor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLOR$20, var1);
      }
   }

   public List getSzList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SzList(this);
      }
   }

   public CTFontSize[] getSzArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SZ$22, var2);
         CTFontSize[] var3 = new CTFontSize[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFontSize getSzArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontSize var3 = null;
         var3 = (CTFontSize)this.get_store().find_element_user(SZ$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSzArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SZ$22);
      }
   }

   public void setSzArray(CTFontSize[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SZ$22);
      }
   }

   public void setSzArray(int var1, CTFontSize var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontSize var4 = null;
         var4 = (CTFontSize)this.get_store().find_element_user(SZ$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFontSize insertNewSz(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontSize var3 = null;
         var3 = (CTFontSize)this.get_store().insert_element_user(SZ$22, var1);
         return var3;
      }
   }

   public CTFontSize addNewSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontSize var2 = null;
         var2 = (CTFontSize)this.get_store().add_element_user(SZ$22);
         return var2;
      }
   }

   public void removeSz(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SZ$22, var1);
      }
   }

   public List getUList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1UList(this);
      }
   }

   public CTUnderlineProperty[] getUArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(U$24, var2);
         CTUnderlineProperty[] var3 = new CTUnderlineProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTUnderlineProperty getUArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnderlineProperty var3 = null;
         var3 = (CTUnderlineProperty)this.get_store().find_element_user(U$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfUArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(U$24);
      }
   }

   public void setUArray(CTUnderlineProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, U$24);
      }
   }

   public void setUArray(int var1, CTUnderlineProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnderlineProperty var4 = null;
         var4 = (CTUnderlineProperty)this.get_store().find_element_user(U$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTUnderlineProperty insertNewU(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnderlineProperty var3 = null;
         var3 = (CTUnderlineProperty)this.get_store().insert_element_user(U$24, var1);
         return var3;
      }
   }

   public CTUnderlineProperty addNewU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnderlineProperty var2 = null;
         var2 = (CTUnderlineProperty)this.get_store().add_element_user(U$24);
         return var2;
      }
   }

   public void removeU(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(U$24, var1);
      }
   }

   public List getVertAlignList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1VertAlignList(this);
      }
   }

   public CTVerticalAlignFontProperty[] getVertAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VERTALIGN$26, var2);
         CTVerticalAlignFontProperty[] var3 = new CTVerticalAlignFontProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTVerticalAlignFontProperty getVertAlignArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalAlignFontProperty var3 = null;
         var3 = (CTVerticalAlignFontProperty)this.get_store().find_element_user(VERTALIGN$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfVertAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VERTALIGN$26);
      }
   }

   public void setVertAlignArray(CTVerticalAlignFontProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VERTALIGN$26);
      }
   }

   public void setVertAlignArray(int var1, CTVerticalAlignFontProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalAlignFontProperty var4 = null;
         var4 = (CTVerticalAlignFontProperty)this.get_store().find_element_user(VERTALIGN$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTVerticalAlignFontProperty insertNewVertAlign(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalAlignFontProperty var3 = null;
         var3 = (CTVerticalAlignFontProperty)this.get_store().insert_element_user(VERTALIGN$26, var1);
         return var3;
      }
   }

   public CTVerticalAlignFontProperty addNewVertAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalAlignFontProperty var2 = null;
         var2 = (CTVerticalAlignFontProperty)this.get_store().add_element_user(VERTALIGN$26);
         return var2;
      }
   }

   public void removeVertAlign(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VERTALIGN$26, var1);
      }
   }

   public List getSchemeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SchemeList(this);
      }
   }

   public CTFontScheme[] getSchemeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCHEME$28, var2);
         CTFontScheme[] var3 = new CTFontScheme[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFontScheme getSchemeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontScheme var3 = null;
         var3 = (CTFontScheme)this.get_store().find_element_user(SCHEME$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSchemeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCHEME$28);
      }
   }

   public void setSchemeArray(CTFontScheme[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCHEME$28);
      }
   }

   public void setSchemeArray(int var1, CTFontScheme var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontScheme var4 = null;
         var4 = (CTFontScheme)this.get_store().find_element_user(SCHEME$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFontScheme insertNewScheme(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontScheme var3 = null;
         var3 = (CTFontScheme)this.get_store().insert_element_user(SCHEME$28, var1);
         return var3;
      }
   }

   public CTFontScheme addNewScheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontScheme var2 = null;
         var2 = (CTFontScheme)this.get_store().add_element_user(SCHEME$28);
         return var2;
      }
   }

   public void removeScheme(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCHEME$28, var1);
      }
   }

}
