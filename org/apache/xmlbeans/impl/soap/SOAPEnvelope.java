package org.apache.xmlbeans.impl.soap;

import org.apache.xmlbeans.impl.soap.Name;
import org.apache.xmlbeans.impl.soap.SOAPBody;
import org.apache.xmlbeans.impl.soap.SOAPElement;
import org.apache.xmlbeans.impl.soap.SOAPException;
import org.apache.xmlbeans.impl.soap.SOAPHeader;

public interface SOAPEnvelope extends SOAPElement {

   Name createName(String var1, String var2, String var3) throws SOAPException;

   Name createName(String var1) throws SOAPException;

   SOAPHeader getHeader() throws SOAPException;

   SOAPBody getBody() throws SOAPException;

   SOAPHeader addHeader() throws SOAPException;

   SOAPBody addBody() throws SOAPException;
}
