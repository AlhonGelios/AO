package org.apache.commons.collections4;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.OrderedMap;

public interface OrderedBidiMap extends BidiMap, OrderedMap {

   OrderedBidiMap inverseBidiMap();
}
