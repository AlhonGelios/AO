package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLEvent;

public interface StartDocument extends XMLEvent {

   String getSystemId();

   String getCharacterEncodingScheme();

   boolean isStandalone();

   String getVersion();
}
