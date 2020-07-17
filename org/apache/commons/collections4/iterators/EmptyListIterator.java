package org.apache.commons.collections4.iterators;

import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;
import org.apache.commons.collections4.iterators.AbstractEmptyIterator;

public class EmptyListIterator extends AbstractEmptyIterator implements ResettableListIterator {

   public static final ResettableListIterator RESETTABLE_INSTANCE = new EmptyListIterator();
   public static final ListIterator INSTANCE = RESETTABLE_INSTANCE;


   public static ResettableListIterator resettableEmptyListIterator() {
      return RESETTABLE_INSTANCE;
   }

   public static ListIterator emptyListIterator() {
      return INSTANCE;
   }

}
