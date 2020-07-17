package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLEvent;

public interface ChangePrefixMapping extends XMLEvent {

   String getOldNamespaceUri();

   String getNewNamespaceUri();

   String getPrefix();
}
