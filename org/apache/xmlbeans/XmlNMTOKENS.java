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

public interface XmlNMTOKENS extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_NMTOKENS");


   List getListValue();

   List xgetListValue();

   void setListValue(List var1);

   List listValue();

   List xlistValue();

   void set(List var1);


   public static final class Factory {

      public static XmlNMTOKENS newInstance() {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().newInstance(XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS newInstance(XmlOptions options) {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().newInstance(XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS newValue(Object obj) {
         return (XmlNMTOKENS)XmlNMTOKENS.type.newValue(obj);
      }

      public static XmlNMTOKENS parse(String s) throws XmlException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(s, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(String s, XmlOptions options) throws XmlException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(s, XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS parse(File f) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(f, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(f, XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS parse(URL u) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(u, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(u, XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS parse(InputStream is) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(is, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(is, XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS parse(Reader r) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(r, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(r, XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS parse(Node node) throws XmlException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(node, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(Node node, XmlOptions options) throws XmlException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(node, XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(xis, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(xis, XmlNMTOKENS.type, options);
      }

      public static XmlNMTOKENS parse(XMLStreamReader xsr) throws XmlException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(xsr, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XmlNMTOKENS parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlNMTOKENS)XmlBeans.getContextTypeLoader().parse(xsr, XmlNMTOKENS.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlNMTOKENS.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlNMTOKENS.type, options);
      }

   }
}
