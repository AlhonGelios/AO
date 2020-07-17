package org.apache.xmlbeans;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.LexicalHandler;

public interface XmlSaxHandler {

   ContentHandler getContentHandler();

   LexicalHandler getLexicalHandler();

   void bookmarkLastEvent(XmlCursor.XmlBookmark var1);

   void bookmarkLastAttr(QName var1, XmlCursor.XmlBookmark var2);

   XmlObject getObject() throws XmlException;
}
