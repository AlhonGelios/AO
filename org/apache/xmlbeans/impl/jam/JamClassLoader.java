package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JPackage;

public interface JamClassLoader {

   JClass loadClass(String var1);

   JPackage getPackage(String var1);
}
