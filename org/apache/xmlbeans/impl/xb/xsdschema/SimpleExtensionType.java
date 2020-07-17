package org.apache.xmlbeans.impl.xb.xsdschema;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface SimpleExtensionType extends ExtensionType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SimpleExtensionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("simpleextensiontypee0detype");



   public static final class Factory {

      public static SimpleExtensionType newInstance() {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().newInstance(SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType newInstance(XmlOptions options) {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().newInstance(SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(String xmlAsString) throws XmlException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(xmlAsString, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(xmlAsString, SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(File file) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(file, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(File file, XmlOptions options) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(file, SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(URL u) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(u, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(u, SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(InputStream is) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(is, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(is, SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(Reader r) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(r, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(r, SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(XMLStreamReader sr) throws XmlException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(sr, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(sr, SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(Node node) throws XmlException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(node, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(Node node, XmlOptions options) throws XmlException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(node, SimpleExtensionType.type, options);
      }

      public static SimpleExtensionType parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(xis, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static SimpleExtensionType parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (SimpleExtensionType)XmlBeans.getContextTypeLoader().parse(xis, SimpleExtensionType.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SimpleExtensionType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SimpleExtensionType.type, options);
      }

   }

   static class NamelessClass1415393716 {
   }
}
