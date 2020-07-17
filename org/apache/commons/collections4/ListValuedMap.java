package org.apache.commons.collections4;

import java.util.List;
import org.apache.commons.collections4.MultiValuedMap;

public interface ListValuedMap extends MultiValuedMap {

   List get(Object var1);

   List remove(Object var1);
}
