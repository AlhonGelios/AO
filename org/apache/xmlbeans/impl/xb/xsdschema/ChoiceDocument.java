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
import org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ChoiceDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ChoiceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("choicedf82doctype");


   ExplicitGroup getChoice();

   void setChoice(ExplicitGroup var1);

   ExplicitGroup addNewChoice();


   public static final class Factory {

      public static ChoiceDocument newInstance() {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().newInstance(ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument newInstance(XmlOptions options) {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().newInstance(ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(String xmlAsString) throws XmlException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(File file) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(file, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(file, ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(URL u) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(u, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(u, ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(InputStream is) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(is, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(is, ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(Reader r) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(r, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(r, ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(XMLStreamReader sr) throws XmlException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(sr, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(sr, ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(Node node) throws XmlException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(node, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(Node node, XmlOptions options) throws XmlException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(node, ChoiceDocument.type, options);
      }

      public static ChoiceDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(xis, ChoiceDocument.type, (XmlOptions)null);
      }

      public static ChoiceDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (ChoiceDocument)XmlBeans.getContextTypeLoader().parse(xis, ChoiceDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, ChoiceDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, ChoiceDocument.type, options);
      }

   }

   static class NamelessClass1152951186 {
   }
}
