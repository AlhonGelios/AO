package org.apache.xmlbeans.impl.xb.xmlconfig;

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
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface JavaName extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(JavaName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("javanamee640type");



   static class NamelessClass1412735672 {
   }

   public static final class Factory {

      public static JavaName newValue(Object obj) {
         return (JavaName)JavaName.type.newValue(obj);
      }

      public static JavaName newInstance() {
         return (JavaName)XmlBeans.getContextTypeLoader().newInstance(JavaName.type, (XmlOptions)null);
      }

      public static JavaName newInstance(XmlOptions options) {
         return (JavaName)XmlBeans.getContextTypeLoader().newInstance(JavaName.type, options);
      }

      public static JavaName parse(String xmlAsString) throws XmlException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(xmlAsString, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(xmlAsString, JavaName.type, options);
      }

      public static JavaName parse(File file) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(file, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(File file, XmlOptions options) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(file, JavaName.type, options);
      }

      public static JavaName parse(URL u) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(u, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(u, JavaName.type, options);
      }

      public static JavaName parse(InputStream is) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(is, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(is, JavaName.type, options);
      }

      public static JavaName parse(Reader r) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(r, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(r, JavaName.type, options);
      }

      public static JavaName parse(XMLStreamReader sr) throws XmlException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(sr, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(sr, JavaName.type, options);
      }

      public static JavaName parse(Node node) throws XmlException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(node, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(Node node, XmlOptions options) throws XmlException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(node, JavaName.type, options);
      }

      public static JavaName parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(xis, JavaName.type, (XmlOptions)null);
      }

      public static JavaName parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (JavaName)XmlBeans.getContextTypeLoader().parse(xis, JavaName.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, JavaName.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, JavaName.type, options);
      }

   }
}
