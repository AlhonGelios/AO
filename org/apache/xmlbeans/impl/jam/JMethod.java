package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JInvokable;

public interface JMethod extends JInvokable {

   JClass getReturnType();

   boolean isFinal();

   boolean isStatic();

   boolean isAbstract();

   boolean isNative();

   boolean isSynchronized();

   String getQualifiedName();
}
