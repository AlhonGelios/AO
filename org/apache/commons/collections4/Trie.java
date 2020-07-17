package org.apache.commons.collections4;

import java.util.SortedMap;
import org.apache.commons.collections4.IterableSortedMap;

public interface Trie extends IterableSortedMap {

   SortedMap prefixMap(Object var1);
}
