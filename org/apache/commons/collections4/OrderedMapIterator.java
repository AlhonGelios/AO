package org.apache.commons.collections4;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedIterator;

public interface OrderedMapIterator extends MapIterator, OrderedIterator {

   boolean hasPrevious();

   Object previous();
}
