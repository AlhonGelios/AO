package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.collections4.Predicate;

public class ComparatorPredicate implements Predicate, Serializable {

   private static final long serialVersionUID = -1863209236504077399L;
   private final Object object;
   private final Comparator comparator;
   private final ComparatorPredicate.Criterion criterion;


   public static Predicate comparatorPredicate(Object object, Comparator comparator) {
      return comparatorPredicate(object, comparator, ComparatorPredicate.Criterion.EQUAL);
   }

   public static Predicate comparatorPredicate(Object object, Comparator comparator, ComparatorPredicate.Criterion criterion) {
      if(comparator == null) {
         throw new NullPointerException("Comparator must not be null.");
      } else if(criterion == null) {
         throw new NullPointerException("Criterion must not be null.");
      } else {
         return new ComparatorPredicate(object, comparator, criterion);
      }
   }

   public ComparatorPredicate(Object object, Comparator comparator, ComparatorPredicate.Criterion criterion) {
      this.object = object;
      this.comparator = comparator;
      this.criterion = criterion;
   }

   public boolean evaluate(Object target) {
      boolean result = false;
      int comparison = this.comparator.compare(this.object, target);
      switch(ComparatorPredicate.NamelessClass1806376568.$SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[this.criterion.ordinal()]) {
      case 1:
         result = comparison == 0;
         break;
      case 2:
         result = comparison > 0;
         break;
      case 3:
         result = comparison < 0;
         break;
      case 4:
         result = comparison >= 0;
         break;
      case 5:
         result = comparison <= 0;
         break;
      default:
         throw new IllegalStateException("The current criterion \'" + this.criterion + "\' is invalid.");
      }

      return result;
   }

   public static enum Criterion {

      EQUAL("EQUAL", 0),
      GREATER("GREATER", 1),
      LESS("LESS", 2),
      GREATER_OR_EQUAL("GREATER_OR_EQUAL", 3),
      LESS_OR_EQUAL("LESS_OR_EQUAL", 4);
      // $FF: synthetic field
      private static final ComparatorPredicate.Criterion[] $VALUES = new ComparatorPredicate.Criterion[]{EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL};


      private Criterion(String var1, int var2) {}

   }

   // $FF: synthetic class
   static class NamelessClass1806376568 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion = new int[ComparatorPredicate.Criterion.values().length];


      static {
         try {
            $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[ComparatorPredicate.Criterion.EQUAL.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[ComparatorPredicate.Criterion.GREATER.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[ComparatorPredicate.Criterion.LESS.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[ComparatorPredicate.Criterion.GREATER_OR_EQUAL.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[ComparatorPredicate.Criterion.LESS_OR_EQUAL.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
