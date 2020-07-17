package org.apache.xmlbeans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSetBuilder;
import org.apache.xmlbeans.QNameSetSpecification;

public final class QNameSet implements QNameSetSpecification, Serializable {

   private static final long serialVersionUID = 1L;
   private final boolean _inverted;
   private final Set _includedURIs;
   private final Set _excludedQNames;
   private final Set _includedQNames;
   public static final QNameSet EMPTY = new QNameSet((Set)null, Collections.EMPTY_SET, Collections.EMPTY_SET, Collections.EMPTY_SET);
   public static final QNameSet ALL = new QNameSet(Collections.EMPTY_SET, (Set)null, Collections.EMPTY_SET, Collections.EMPTY_SET);
   public static final QNameSet LOCAL = new QNameSet((Set)null, Collections.singleton(""), Collections.EMPTY_SET, Collections.EMPTY_SET);
   public static final QNameSet NONLOCAL = new QNameSet(Collections.singleton(""), (Set)null, Collections.EMPTY_SET, Collections.EMPTY_SET);


   private static Set minSetCopy(Set original) {
      return (Set)(original == null?null:(original.isEmpty()?Collections.EMPTY_SET:(original.size() == 1?Collections.singleton(original.iterator().next()):new HashSet(original))));
   }

   public static QNameSet forSets(Set excludedURIs, Set includedURIs, Set excludedQNamesInIncludedURIs, Set includedQNamesInExcludedURIs) {
      if(excludedURIs != null == (includedURIs != null)) {
         throw new IllegalArgumentException("Exactly one of excludedURIs and includedURIs must be null");
      } else {
         return excludedURIs == null && includedURIs.isEmpty() && includedQNamesInExcludedURIs.isEmpty()?EMPTY:(includedURIs == null && excludedURIs.isEmpty() && excludedQNamesInIncludedURIs.isEmpty()?ALL:(excludedURIs == null && includedURIs.size() == 1 && includedURIs.contains("") && includedQNamesInExcludedURIs.isEmpty() && excludedQNamesInIncludedURIs.isEmpty()?LOCAL:(includedURIs == null && excludedURIs.size() == 1 && excludedURIs.contains("") && excludedQNamesInIncludedURIs.isEmpty() && includedQNamesInExcludedURIs.isEmpty()?NONLOCAL:new QNameSet(minSetCopy(excludedURIs), minSetCopy(includedURIs), minSetCopy(excludedQNamesInIncludedURIs), minSetCopy(includedQNamesInExcludedURIs)))));
      }
   }

   public static QNameSet forArray(QName[] includedQNames) {
      if(includedQNames == null) {
         throw new IllegalArgumentException("includedQNames cannot be null");
      } else {
         return new QNameSet((Set)null, Collections.EMPTY_SET, Collections.EMPTY_SET, new HashSet(Arrays.asList(includedQNames)));
      }
   }

   public static QNameSet forSpecification(QNameSetSpecification spec) {
      return spec instanceof QNameSet?(QNameSet)spec:forSets(spec.excludedURIs(), spec.includedURIs(), spec.excludedQNamesInIncludedURIs(), spec.includedQNamesInExcludedURIs());
   }

   public static QNameSet forWildcardNamespaceString(String wildcard, String targetURI) {
      return forSpecification(new QNameSetBuilder(wildcard, targetURI));
   }

   public static QNameSet singleton(QName name) {
      return new QNameSet((Set)null, Collections.EMPTY_SET, Collections.EMPTY_SET, Collections.singleton(name));
   }

   private QNameSet(Set excludedURIs, Set includedURIs, Set excludedQNamesInIncludedURIs, Set includedQNamesInExcludedURIs) {
      if(includedURIs != null && excludedURIs == null) {
         this._inverted = false;
         this._includedURIs = includedURIs;
         this._excludedQNames = excludedQNamesInIncludedURIs;
         this._includedQNames = includedQNamesInExcludedURIs;
      } else {
         if(excludedURIs == null || includedURIs != null) {
            throw new IllegalArgumentException("Exactly one of excludedURIs and includedURIs must be null");
         }

         this._inverted = true;
         this._includedURIs = excludedURIs;
         this._excludedQNames = includedQNamesInExcludedURIs;
         this._includedQNames = excludedQNamesInIncludedURIs;
      }

   }

   private static String nsFromName(QName xmlName) {
      String ns = xmlName.getNamespaceURI();
      return ns == null?"":ns;
   }

   public boolean contains(QName name) {
      boolean in = this._includedURIs.contains(nsFromName(name))?!this._excludedQNames.contains(name):this._includedQNames.contains(name);
      return this._inverted ^ in;
   }

   public boolean isAll() {
      return this._inverted && this._includedURIs.isEmpty() && this._includedQNames.isEmpty();
   }

   public boolean isEmpty() {
      return !this._inverted && this._includedURIs.isEmpty() && this._includedQNames.isEmpty();
   }

   public QNameSet intersect(QNameSetSpecification set) {
      QNameSetBuilder result = new QNameSetBuilder(this);
      result.restrict(set);
      return result.toQNameSet();
   }

   public QNameSet union(QNameSetSpecification set) {
      QNameSetBuilder result = new QNameSetBuilder(this);
      result.addAll(set);
      return result.toQNameSet();
   }

   public QNameSet inverse() {
      return this == EMPTY?ALL:(this == ALL?EMPTY:(this == LOCAL?NONLOCAL:(this == NONLOCAL?LOCAL:new QNameSet(this.includedURIs(), this.excludedURIs(), this.includedQNamesInExcludedURIs(), this.excludedQNamesInIncludedURIs()))));
   }

   public boolean containsAll(QNameSetSpecification set) {
      return !this._inverted && set.excludedURIs() != null?false:this.inverse().isDisjoint(set);
   }

   public boolean isDisjoint(QNameSetSpecification set) {
      return this._inverted && set.excludedURIs() != null?false:(this._inverted?this.isDisjointImpl(set, this):this.isDisjointImpl(this, set));
   }

   private boolean isDisjointImpl(QNameSetSpecification set1, QNameSetSpecification set2) {
      Set includeURIs = set1.includedURIs();
      Set otherIncludeURIs = set2.includedURIs();
      Iterator i;
      if(otherIncludeURIs != null) {
         i = includeURIs.iterator();

         while(i.hasNext()) {
            if(otherIncludeURIs.contains(i.next())) {
               return false;
            }
         }
      } else {
         Set i2 = set2.excludedURIs();
         Iterator i1 = includeURIs.iterator();

         while(i1.hasNext()) {
            if(!i2.contains(i1.next())) {
               return false;
            }
         }
      }

      i = set1.includedQNamesInExcludedURIs().iterator();

      while(i.hasNext()) {
         if(set2.contains((QName)i.next())) {
            return false;
         }
      }

      if(includeURIs.size() > 0) {
         i = set2.includedQNamesInExcludedURIs().iterator();

         while(i.hasNext()) {
            if(set1.contains((QName)i.next())) {
               return false;
            }
         }
      }

      return true;
   }

   public Set excludedURIs() {
      return this._inverted?Collections.unmodifiableSet(this._includedURIs):null;
   }

   public Set includedURIs() {
      return !this._inverted?this._includedURIs:null;
   }

   public Set excludedQNamesInIncludedURIs() {
      return Collections.unmodifiableSet(this._inverted?this._includedQNames:this._excludedQNames);
   }

   public Set includedQNamesInExcludedURIs() {
      return Collections.unmodifiableSet(this._inverted?this._excludedQNames:this._includedQNames);
   }

   private String prettyQName(QName name) {
      return name.getNamespaceURI() == null?name.getLocalPart():name.getLocalPart() + "@" + name.getNamespaceURI();
   }

   public String toString() {
      StringBuffer sb = new StringBuffer();
      sb.append("QNameSet");
      sb.append(this._inverted?"-(":"+(");
      Iterator index = this._includedURIs.iterator();

      while(index.hasNext()) {
         sb.append("+*@");
         sb.append(index.next());
         sb.append(", ");
      }

      index = this._excludedQNames.iterator();

      while(index.hasNext()) {
         sb.append("-");
         sb.append(this.prettyQName((QName)index.next()));
         sb.append(", ");
      }

      index = this._includedQNames.iterator();

      while(index.hasNext()) {
         sb.append("+");
         sb.append(this.prettyQName((QName)index.next()));
         sb.append(", ");
      }

      int index1 = sb.lastIndexOf(", ");
      if(index1 > 0) {
         sb.setLength(index1);
      }

      sb.append(')');
      return sb.toString();
   }

}
