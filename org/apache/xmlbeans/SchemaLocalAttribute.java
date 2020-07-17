package org.apache.xmlbeans;

import org.apache.xmlbeans.SchemaAnnotated;
import org.apache.xmlbeans.SchemaField;

public interface SchemaLocalAttribute extends SchemaField, SchemaAnnotated {

   int PROHIBITED = 1;
   int OPTIONAL = 2;
   int REQUIRED = 3;


   int getUse();
}
