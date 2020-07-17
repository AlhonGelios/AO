package org.apache.xmlbeans;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface XmlIDREFS extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_IDREFS");


   List getListValue();

   List xgetListValue();

   void setListValue(List var1);

   List listValue();

   List xlistValue();

   void set(List var1);


   public static final class Factory {

      public static XmlIDREFS newInstance() {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().newInstance(XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS newInstance(XmlOptions options) {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().newInstance(XmlIDREFS.type, options);
      }

      public static XmlIDREFS newValue(Object obj) {
         return (XmlIDREFS)XmlIDREFS.type.newValue(obj);
      }

      public static XmlIDREFS parse(String s) throws XmlException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(s, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(String s, XmlOptions options) throws XmlException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(s, XmlIDREFS.type, options);
      }

      public static XmlIDREFS parse(File f) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(f, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(f, XmlIDREFS.type, options);
      }

      public static XmlIDREFS parse(URL u) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(u, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(u, XmlIDREFS.type, options);
      }

      public static XmlIDREFS parse(InputStream is) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(is, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(is, XmlIDREFS.type, options);
      }

      public static XmlIDREFS parse(Reader r) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(r, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(r, XmlIDREFS.type, options);
      }

      public static XmlIDREFS parse(Node node) throws XmlException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(node, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(Node node, XmlOptions options) throws XmlException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(node, XmlIDREFS.type, options);
      }

      public static XmlIDREFS parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(xis, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(xis, XmlIDREFS.type, options);
      }

      public static XmlIDREFS parse(XMLStreamReader xsr) throws XmlException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(xsr, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XmlIDREFS parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlIDREFS)XmlBeans.getContextTypeLoader().parse(xsr, XmlIDREFS.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlIDREFS.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlIDREFS.type, options);
      }

   }
}
