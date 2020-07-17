package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JAnnotationValue;
import org.apache.xmlbeans.impl.jam.JElement;

public interface JAnnotation extends JElement {

   String SINGLE_VALUE_NAME = "value";


   String getSimpleName();

   Object getProxy();

   JAnnotationValue[] getValues();

   JAnnotationValue getValue(String var1);

   Object getAnnotationInstance();
}
