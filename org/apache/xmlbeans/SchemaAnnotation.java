package org.apache.xmlbeans;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaComponent;
import org.apache.xmlbeans.XmlObject;

public interface SchemaAnnotation extends SchemaComponent {

   XmlObject[] getApplicationInformation();

   XmlObject[] getUserInformation();

   SchemaAnnotation.Attribute[] getAttributes();

   public interface Attribute {

      QName getName();

      String getValue();

      String getValueUri();
   }
}
