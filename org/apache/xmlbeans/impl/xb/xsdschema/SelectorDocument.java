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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.impl.xb.xsdschema.Annotated;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface SelectorDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SelectorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("selectorcb44doctype");


   SelectorDocument.Selector getSelector();

   void setSelector(SelectorDocument.Selector var1);

   SelectorDocument.Selector addNewSelector();


   static class NamelessClass266145779 {
   }

   public static final class Factory {

      public static SelectorDocument newInstance() {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().newInstance(SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument newInstance(XmlOptions options) {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().newInstance(SelectorDocument.type, options);
      }

      public static SelectorDocument parse(String xmlAsString) throws XmlException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, SelectorDocument.type, options);
      }

      public static SelectorDocument parse(File file) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(file, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(file, SelectorDocument.type, options);
      }

      public static SelectorDocument parse(URL u) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(u, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(u, SelectorDocument.type, options);
      }

      public static SelectorDocument parse(InputStream is) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(is, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(is, SelectorDocument.type, options);
      }

      public static SelectorDocument parse(Reader r) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(r, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(r, SelectorDocument.type, options);
      }

      public static SelectorDocument parse(XMLStreamReader sr) throws XmlException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(sr, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(sr, SelectorDocument.type, options);
      }

      public static SelectorDocument parse(Node node) throws XmlException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(node, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(Node node, XmlOptions options) throws XmlException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(node, SelectorDocument.type, options);
      }

      public static SelectorDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(xis, SelectorDocument.type, (XmlOptions)null);
      }

      public static SelectorDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (SelectorDocument)XmlBeans.getContextTypeLoader().parse(xis, SelectorDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SelectorDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SelectorDocument.type, options);
      }

   }

   public interface Selector extends Annotated {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SelectorDocument.Selector.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("selector233felemtype");


      String getXpath();

      SelectorDocument.Selector.Xpath xgetXpath();

      void setXpath(String var1);

      void xsetXpath(SelectorDocument.Selector.Xpath var1);


      public static final class Factory {

         public static SelectorDocument.Selector newInstance() {
            return (SelectorDocument.Selector)XmlBeans.getContextTypeLoader().newInstance(SelectorDocument.Selector.type, (XmlOptions)null);
         }

         public static SelectorDocument.Selector newInstance(XmlOptions options) {
            return (SelectorDocument.Selector)XmlBeans.getContextTypeLoader().newInstance(SelectorDocument.Selector.type, options);
         }

      }

      public interface Xpath extends XmlToken {

         SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SelectorDocument.Selector.Xpath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("xpath6f9aattrtype");



         public static final class Factory {

            public static SelectorDocument.Selector.Xpath newValue(Object obj) {
               return (SelectorDocument.Selector.Xpath)SelectorDocument.Selector.Xpath.type.newValue(obj);
            }

            public static SelectorDocument.Selector.Xpath newInstance() {
               return (SelectorDocument.Selector.Xpath)XmlBeans.getContextTypeLoader().newInstance(SelectorDocument.Selector.Xpath.type, (XmlOptions)null);
            }

            public static SelectorDocument.Selector.Xpath newInstance(XmlOptions options) {
               return (SelectorDocument.Selector.Xpath)XmlBeans.getContextTypeLoader().newInstance(SelectorDocument.Selector.Xpath.type, options);
            }

         }
      }
   }
}
