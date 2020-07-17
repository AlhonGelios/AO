package org.apache.xmlbeans.xml.stream;

import java.util.Map;
import org.apache.xmlbeans.xml.stream.Attribute;
import org.apache.xmlbeans.xml.stream.AttributeIterator;
import org.apache.xmlbeans.xml.stream.XMLEvent;
import org.apache.xmlbeans.xml.stream.XMLName;

public interface StartElement extends XMLEvent {

   AttributeIterator getAttributes();

   AttributeIterator getNamespaces();

   AttributeIterator getAttributesAndNamespaces();

   Attribute getAttributeByName(XMLName var1);

   String getNamespaceUri(String var1);

   Map getNamespaceMap();
}
