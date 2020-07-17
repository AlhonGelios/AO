package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;

public interface ReferenceResolver {

   XMLInputStream resolve(String var1) throws XMLStreamException;

   String getId(String var1);
}
