package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Predicate;

public final class NullPredicate implements Predicate, Serializable {

   private static final long serialVersionUID = 7533784454832764388L;
   public static final Predicate INSTANCE = new NullPredicate();


   public static Predicate nullPredicate() {
      return INSTANCE;
   }

   public boolean evaluate(Object object) {
      return object == null;
   }

   private Object readResolve() {
      return INSTANCE;
   }

}
