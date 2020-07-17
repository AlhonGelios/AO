package org.apache.commons.collections4;

import java.util.Set;
import org.apache.commons.collections4.IterableMap;

public interface BidiMap extends IterableMap {

   Object put(Object var1, Object var2);

   Object getKey(Object var1);

   Object removeValue(Object var1);

   BidiMap inverseBidiMap();

   Set values();
}
