package org.apache.commons.collections4.functors;

import java.util.Collection;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.AbstractQuantifierPredicate;
import org.apache.commons.collections4.functors.FunctorUtils;
import org.apache.commons.collections4.functors.TruePredicate;

public final class AllPredicate extends AbstractQuantifierPredicate {

   private static final long serialVersionUID = -3094696765038308799L;


   public static Predicate allPredicate(Predicate ... predicates) {
      FunctorUtils.validate(predicates);
      return (Predicate)(predicates.length == 0?TruePredicate.truePredicate():(predicates.length == 1?FunctorUtils.coerce(predicates[0]):new AllPredicate(FunctorUtils.copy(predicates))));
   }

   public static Predicate allPredicate(Collection predicates) {
      Predicate[] preds = FunctorUtils.validate(predicates);
      return (Predicate)(preds.length == 0?TruePredicate.truePredicate():(preds.length == 1?FunctorUtils.coerce(preds[0]):new AllPredicate(preds)));
   }

   public AllPredicate(Predicate ... predicates) {
      super(predicates);
   }

   public boolean evaluate(Object object) {
      Predicate[] arr$ = this.iPredicates;
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Predicate iPredicate = arr$[i$];
         if(!iPredicate.evaluate(object)) {
            return false;
         }
      }

      return true;
   }
}
