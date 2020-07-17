package org.apache.commons.collections4;

import java.util.Comparator;
import org.apache.commons.collections4.Bag;

public interface SortedBag extends Bag {

   Comparator comparator();

   Object first();

   Object last();
}
