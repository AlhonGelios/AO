package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import org.apache.commons.collections4.iterators.AbstractEmptyIterator;

public class EmptyIterator extends AbstractEmptyIterator implements ResettableIterator {

   public static final ResettableIterator RESETTABLE_INSTANCE = new EmptyIterator();
   public static final Iterator INSTANCE = RESETTABLE_INSTANCE;


   public static ResettableIterator resettableEmptyIterator() {
      return RESETTABLE_INSTANCE;
   }

   public static Iterator emptyIterator() {
      return INSTANCE;
   }

}
