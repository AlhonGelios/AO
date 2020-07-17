package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JAnnotatedElement;
import org.apache.xmlbeans.impl.jam.JClass;

public interface JMember extends JAnnotatedElement {

   JClass getContainingClass();

   int getModifiers();

   boolean isPackagePrivate();

   boolean isPrivate();

   boolean isProtected();

   boolean isPublic();
}
