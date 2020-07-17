package org.apache.xmlbeans.impl.soap;

import org.apache.xmlbeans.impl.soap.SOAPElement;

public interface SOAPHeaderElement extends SOAPElement {

   void setActor(String var1);

   String getActor();

   void setMustUnderstand(boolean var1);

   boolean getMustUnderstand();
}
