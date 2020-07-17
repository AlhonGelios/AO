package org.apache.xmlbeans.impl.soap;

import java.util.Iterator;
import org.apache.xmlbeans.impl.soap.Name;
import org.apache.xmlbeans.impl.soap.SOAPElement;
import org.apache.xmlbeans.impl.soap.SOAPException;
import org.apache.xmlbeans.impl.soap.SOAPHeaderElement;

public interface SOAPHeader extends SOAPElement {

   SOAPHeaderElement addHeaderElement(Name var1) throws SOAPException;

   Iterator examineHeaderElements(String var1);

   Iterator extractHeaderElements(String var1);

   Iterator examineMustUnderstandHeaderElements(String var1);

   Iterator examineAllHeaderElements();

   Iterator extractAllHeaderElements();
}
