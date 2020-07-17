package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;

public interface BufferedXMLInputStream extends XMLInputStream {

   void mark() throws XMLStreamException;

   void reset() throws XMLStreamException;
}
