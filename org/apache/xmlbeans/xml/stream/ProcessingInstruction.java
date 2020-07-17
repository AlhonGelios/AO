package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLEvent;

public interface ProcessingInstruction extends XMLEvent {

   String getTarget();

   String getData();
}
