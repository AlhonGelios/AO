package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JamClassIterator;
import org.apache.xmlbeans.impl.jam.JamClassLoader;

public interface JamService {

   JamClassLoader getClassLoader();

   String[] getClassNames();

   JamClassIterator getClasses();

   JClass[] getAllClasses();
}
