package org.apache.commons.collections4;

import org.apache.commons.collections4.IterableMap;

public interface BoundedMap extends IterableMap {

   boolean isFull();

   int maxSize();
}
