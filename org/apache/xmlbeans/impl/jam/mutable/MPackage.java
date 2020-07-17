package org.apache.xmlbeans.impl.jam.mutable;

import org.apache.xmlbeans.impl.jam.JPackage;
import org.apache.xmlbeans.impl.jam.mutable.MAnnotatedElement;
import org.apache.xmlbeans.impl.jam.mutable.MClass;

public interface MPackage extends JPackage, MAnnotatedElement {

   MClass[] getMutableClasses();
}
