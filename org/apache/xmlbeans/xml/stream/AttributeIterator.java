package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.Attribute;

public interface AttributeIterator {

   Attribute next();

   boolean hasNext();

   Attribute peek();

   void skip();
}
