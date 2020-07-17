package org.apache.xmlbeans;

import org.apache.xmlbeans.SchemaAnnotated;
import org.apache.xmlbeans.SchemaField;
import org.apache.xmlbeans.SchemaIdentityConstraint;

public interface SchemaLocalElement extends SchemaField, SchemaAnnotated {

   boolean blockExtension();

   boolean blockRestriction();

   boolean blockSubstitution();

   boolean isAbstract();

   SchemaIdentityConstraint[] getIdentityConstraints();
}
