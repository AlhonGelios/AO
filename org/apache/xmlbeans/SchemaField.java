package org.apache.xmlbeans;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;

public interface SchemaField {

   QName getName();

   boolean isAttribute();

   boolean isNillable();

   SchemaType getType();

   BigInteger getMinOccurs();

   BigInteger getMaxOccurs();

   String getDefaultText();

   XmlAnySimpleType getDefaultValue();

   boolean isDefault();

   boolean isFixed();

   Object getUserData();
}
