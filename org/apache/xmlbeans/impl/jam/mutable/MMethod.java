package org.apache.xmlbeans.impl.jam.mutable;

import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JMethod;
import org.apache.xmlbeans.impl.jam.mutable.MInvokable;

public interface MMethod extends JMethod, MInvokable {

   void setReturnType(String var1);

   void setUnqualifiedReturnType(String var1);

   void setReturnType(JClass var1);
}
