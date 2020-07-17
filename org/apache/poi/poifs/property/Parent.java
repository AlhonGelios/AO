package org.apache.poi.poifs.property;

import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.poifs.property.Child;
import org.apache.poi.poifs.property.Property;

public interface Parent extends Child {

   Iterator getChildren();

   void addChild(Property var1) throws IOException;

   void setPreviousChild(Child var1);

   void setNextChild(Child var1);
}
