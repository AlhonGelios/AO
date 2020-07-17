package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.JElement;
import org.apache.xmlbeans.impl.jam.JSourcePosition;

public interface JComment extends JElement {

   String getText();

   JSourcePosition getSourcePosition();
}
