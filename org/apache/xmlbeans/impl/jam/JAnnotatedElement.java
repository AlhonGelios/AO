package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JAnnotation;
import org.apache.xmlbeans.impl.jam.JAnnotationValue;
import org.apache.xmlbeans.impl.jam.JComment;
import org.apache.xmlbeans.impl.jam.JElement;

public interface JAnnotatedElement extends JElement {

   JAnnotation[] getAnnotations();

   JAnnotation getAnnotation(Class var1);

   Object getAnnotationProxy(Class var1);

   JAnnotation getAnnotation(String var1);

   JAnnotationValue getAnnotationValue(String var1);

   JComment getComment();

   JAnnotation[] getAllJavadocTags();
}
