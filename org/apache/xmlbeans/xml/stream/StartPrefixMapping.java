package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLEvent;

public interface StartPrefixMapping extends XMLEvent {

   String getNamespaceUri();

   String getPrefix();
}
