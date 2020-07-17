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
import org.apache.xmlbeans.impl.xb.xsdschema.TopLevelAttribute;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface AttributeDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(AttributeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("attributeedb9doctype");


   TopLevelAttribute getAttribute();

   void setAttribute(TopLevelAttribute var1);

   TopLevelAttribute addNewAttribute();


   public static final class Factory {

      public static AttributeDocument newInstance() {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().newInstance(AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument newInstance(XmlOptions options) {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().newInstance(AttributeDocument.type, options);
      }

      public static AttributeDocument parse(String xmlAsString) throws XmlException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, AttributeDocument.type, options);
      }

      public static AttributeDocument parse(File file) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(file, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(file, AttributeDocument.type, options);
      }

      public static AttributeDocument parse(URL u) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(u, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(u, AttributeDocument.type, options);
      }

      public static AttributeDocument parse(InputStream is) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(is, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(is, AttributeDocument.type, options);
      }

      public static AttributeDocument parse(Reader r) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(r, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(r, AttributeDocument.type, options);
      }

      public static AttributeDocument parse(XMLStreamReader sr) throws XmlException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(sr, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(sr, AttributeDocument.type, options);
      }

      public static AttributeDocument parse(Node node) throws XmlException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(node, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(Node node, XmlOptions options) throws XmlException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(node, AttributeDocument.type, options);
      }

      public static AttributeDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(xis, AttributeDocument.type, (XmlOptions)null);
      }

      public static AttributeDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (AttributeDocument)XmlBeans.getContextTypeLoader().parse(xis, AttributeDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, AttributeDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, AttributeDocument.type, options);
      }

   }

   static class NamelessClass1750178868 {
   }
}
