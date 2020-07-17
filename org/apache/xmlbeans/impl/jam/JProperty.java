package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JAnnotatedElement;
import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JMethod;

public interface JProperty extends JAnnotatedElement {

   JClass getType();

   JMethod getSetter();

   JMethod getGetter();
}
