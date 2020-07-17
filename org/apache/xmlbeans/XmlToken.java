package org.apache.xmlbeans;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlNormalizedString;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface XmlToken extends XmlNormalizedString {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_token");



   public static final class Factory {

      public static XmlToken newInstance() {
         return (XmlToken)XmlBeans.getContextTypeLoader().newInstance(XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken newInstance(XmlOptions options) {
         return (XmlToken)XmlBeans.getContextTypeLoader().newInstance(XmlToken.type, options);
      }

      public static XmlToken newValue(Object obj) {
         return (XmlToken)XmlToken.type.newValue(obj);
      }

      public static XmlToken parse(String s) throws XmlException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(s, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(String s, XmlOptions options) throws XmlException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(s, XmlToken.type, options);
      }

      public static XmlToken parse(File f) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(f, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(f, XmlToken.type, options);
      }

      public static XmlToken parse(URL u) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(u, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(u, XmlToken.type, options);
      }

      public static XmlToken parse(InputStream is) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(is, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(is, XmlToken.type, options);
      }

      public static XmlToken parse(Reader r) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(r, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(r, XmlToken.type, options);
      }

      public static XmlToken parse(Node node) throws XmlException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(node, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(Node node, XmlOptions options) throws XmlException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(node, XmlToken.type, options);
      }

      public static XmlToken parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(xis, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(xis, XmlToken.type, options);
      }

      public static XmlToken parse(XMLStreamReader xsr) throws XmlException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(xsr, XmlToken.type, (XmlOptions)null);
      }

      public static XmlToken parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlToken)XmlBeans.getContextTypeLoader().parse(xsr, XmlToken.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlToken.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlToken.type, options);
      }

   }
}
