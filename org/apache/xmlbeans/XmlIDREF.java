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
import org.apache.xmlbeans.XmlNCName;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface XmlIDREF extends XmlNCName {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_IDREF");



   public static final class Factory {

      public static XmlIDREF newInstance() {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().newInstance(XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF newInstance(XmlOptions options) {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().newInstance(XmlIDREF.type, options);
      }

      public static XmlIDREF newValue(Object obj) {
         return (XmlIDREF)XmlIDREF.type.newValue(obj);
      }

      public static XmlIDREF parse(String s) throws XmlException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(s, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(String s, XmlOptions options) throws XmlException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(s, XmlIDREF.type, options);
      }

      public static XmlIDREF parse(File f) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(f, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(f, XmlIDREF.type, options);
      }

      public static XmlIDREF parse(URL u) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(u, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(u, XmlIDREF.type, options);
      }

      public static XmlIDREF parse(InputStream is) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(is, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(is, XmlIDREF.type, options);
      }

      public static XmlIDREF parse(Reader r) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(r, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(r, XmlIDREF.type, options);
      }

      public static XmlIDREF parse(Node node) throws XmlException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(node, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(Node node, XmlOptions options) throws XmlException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(node, XmlIDREF.type, options);
      }

      public static XmlIDREF parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(xis, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(xis, XmlIDREF.type, options);
      }

      public static XmlIDREF parse(XMLStreamReader xsr) throws XmlException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(xsr, XmlIDREF.type, (XmlOptions)null);
      }

      public static XmlIDREF parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlIDREF)XmlBeans.getContextTypeLoader().parse(xsr, XmlIDREF.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlIDREF.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlIDREF.type, options);
      }

   }
}
