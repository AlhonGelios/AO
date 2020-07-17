package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JMember;
import org.apache.xmlbeans.impl.jam.JParameter;

public interface JInvokable extends JMember {

   JParameter[] getParameters();

   JClass[] getExceptionTypes();
}
