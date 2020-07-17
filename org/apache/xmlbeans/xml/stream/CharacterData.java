package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLEvent;

public interface CharacterData extends XMLEvent {

   String getContent();

   boolean hasContent();
}
