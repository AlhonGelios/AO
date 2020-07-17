package org.apache.xmlbeans.impl.xb.ltgfmt;

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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface Code extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLTOOLS").resolveHandle("codef72ftype");


   String getID();

   XmlToken xgetID();

   boolean isSetID();

   void setID(String var1);

   void xsetID(XmlToken var1);

   void unsetID();


   static class NamelessClass133319811 {
   }

   public static final class Factory {

      public static Code newInstance() {
         return (Code)XmlBeans.getContextTypeLoader().newInstance(Code.type, (XmlOptions)null);
      }

      public static Code newInstance(XmlOptions options) {
         return (Code)XmlBeans.getContextTypeLoader().newInstance(Code.type, options);
      }

      public static Code parse(String xmlAsString) throws XmlException {
         return (Code)XmlBeans.getContextTypeLoader().parse(xmlAsString, Code.type, (XmlOptions)null);
      }

      public static Code parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (Code)XmlBeans.getContextTypeLoader().parse(xmlAsString, Code.type, options);
      }

      public static Code parse(File file) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(file, Code.type, (XmlOptions)null);
      }

      public static Code parse(File file, XmlOptions options) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(file, Code.type, options);
      }

      public static Code parse(URL u) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(u, Code.type, (XmlOptions)null);
      }

      public static Code parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(u, Code.type, options);
      }

      public static Code parse(InputStream is) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(is, Code.type, (XmlOptions)null);
      }

      public static Code parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(is, Code.type, options);
      }

      public static Code parse(Reader r) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(r, Code.type, (XmlOptions)null);
      }

      public static Code parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (Code)XmlBeans.getContextTypeLoader().parse(r, Code.type, options);
      }

      public static Code parse(XMLStreamReader sr) throws XmlException {
         return (Code)XmlBeans.getContextTypeLoader().parse(sr, Code.type, (XmlOptions)null);
      }

      public static Code parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (Code)XmlBeans.getContextTypeLoader().parse(sr, Code.type, options);
      }

      public static Code parse(Node node) throws XmlException {
         return (Code)XmlBeans.getContextTypeLoader().parse(node, Code.type, (XmlOptions)null);
      }

      public static Code parse(Node node, XmlOptions options) throws XmlException {
         return (Code)XmlBeans.getContextTypeLoader().parse(node, Code.type, options);
      }

      public static Code parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (Code)XmlBeans.getContextTypeLoader().parse(xis, Code.type, (XmlOptions)null);
      }

      public static Code parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (Code)XmlBeans.getContextTypeLoader().parse(xis, Code.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, Code.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, Code.type, options);
      }

   }
}
