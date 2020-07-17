package org.apache.commons.collections4.functors;

import java.util.Collection;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.AbstractQuantifierPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.FunctorUtils;

public final class OnePredicate extends AbstractQuantifierPredicate {

   private static final long serialVersionUID = -8125389089924745785L;


   public static Predicate onePredicate(Predicate ... predicates) {
      FunctorUtils.validate(predicates);
      return (Predicate)(predicates.length == 0?FalsePredicate.falsePredicate():(predicates.length == 1?predicates[0]:new OnePredicate(FunctorUtils.copy(predicates))));
   }

   public static Predicate onePredicate(Collection predicates) {
      Predicate[] preds = FunctorUtils.validate(predicates);
      return new OnePredicate(preds);
   }

   public OnePredicate(Predicate ... predicates) {
      super(predicates);
   }

   public boolean evaluate(Object object) {
      boolean match = false;
      Predicate[] arr$ = this.iPredicates;
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Predicate iPredicate = arr$[i$];
         if(iPredicate.evaluate(object)) {
            if(match) {
               return false;
            }

            match = true;
         }
      }

      return match;
   }
}
