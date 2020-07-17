package org.apache.xmlbeans;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.SchemaLocalAttribute;

public interface SchemaAttributeModel {

   int NONE = 0;
   int STRICT = 1;
   int LAX = 2;
   int SKIP = 3;


   SchemaLocalAttribute[] getAttributes();

   SchemaLocalAttribute getAttribute(QName var1);

   QNameSet getWildcardSet();

   int getWildcardProcess();
}
