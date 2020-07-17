package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator;

public abstract class AbstractIteratorDecorator extends AbstractUntypedIteratorDecorator {

   protected AbstractIteratorDecorator(Iterator iterator) {
      super(iterator);
   }

   public Object next() {
      return this.getIterator().next();
   }
}
