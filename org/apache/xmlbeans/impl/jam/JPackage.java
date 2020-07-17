package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JAnnotatedElement;
import org.apache.xmlbeans.impl.jam.JClass;

public interface JPackage extends JAnnotatedElement {

   JClass[] getClasses();
}
