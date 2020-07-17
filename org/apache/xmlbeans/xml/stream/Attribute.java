package org.apache.xmlbeans.xml.stream;

import org.apache.xmlbeans.xml.stream.XMLName;

public interface Attribute {

   XMLName getName();

   String getValue();

   String getType();

   XMLName getSchemaType();
}
