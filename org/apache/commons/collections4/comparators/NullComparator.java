package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.collections4.ComparatorUtils;

public class NullComparator implements Comparator, Serializable {

   private static final long serialVersionUID = -5820772575483504339L;
   private final Comparator nonNullComparator;
   private final boolean nullsAreHigh;


   public NullComparator() {
      this(ComparatorUtils.NATURAL_COMPARATOR, true);
   }

   public NullComparator(Comparator nonNullComparator) {
      this(nonNullComparator, true);
   }

   public NullComparator(boolean nullsAreHigh) {
      this(ComparatorUtils.NATURAL_COMPARATOR, nullsAreHigh);
   }

   public NullComparator(Comparator nonNullComparator, boolean nullsAreHigh) {
      this.nonNullComparator = nonNullComparator;
      this.nullsAreHigh = nullsAreHigh;
      if(nonNullComparator == null) {
         throw new NullPointerException("null nonNullComparator");
      }
   }

   public int compare(Object o1, Object o2) {
      return o1 == o2?0:(o1 == null?(this.nullsAreHigh?1:-1):(o2 == null?(this.nullsAreHigh?-1:1):this.nonNullComparator.compare(o1, o2)));
   }

   public int hashCode() {
      return (this.nullsAreHigh?-1:1) * this.nonNullComparator.hashCode();
   }

   public boolean equals(Object obj) {
      if(obj == null) {
         return false;
      } else if(obj == this) {
         return true;
      } else if(!obj.getClass().equals(this.getClass())) {
         return false;
      } else {
         NullComparator other = (NullComparator)obj;
         return this.nullsAreHigh == other.nullsAreHigh && this.nonNullComparator.equals(other.nonNullComparator);
      }
   }
}
