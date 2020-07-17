package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JMember;

public interface JField extends JMember {

   JClass getType();

   boolean isFinal();

   boolean isStatic();

   boolean isVolatile();

   boolean isTransient();

   String getQualifiedName();
}
