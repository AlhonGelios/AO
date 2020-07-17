package org.apache.xmlbeans;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlSaxHandler;
import org.apache.xmlbeans.XmlTokenSource;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;

public interface XmlObject extends XmlTokenSource {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_anyType");
   int LESS_THAN = -1;
   int EQUAL = 0;
   int GREATER_THAN = 1;
   int NOT_EQUAL = 2;


   SchemaType schemaType();

   boolean validate();

   boolean validate(XmlOptions var1);

   XmlObject[] selectPath(String var1);

   XmlObject[] selectPath(String var1, XmlOptions var2);

   XmlObject[] execQuery(String var1);

   XmlObject[] execQuery(String var1, XmlOptions var2);

   XmlObject changeType(SchemaType var1);

   XmlObject substitute(QName var1, SchemaType var2);

   boolean isNil();

   void setNil();

   String toString();

   boolean isImmutable();

   XmlObject set(XmlObject var1);

   XmlObject copy();

   XmlObject copy(XmlOptions var1);

   boolean valueEquals(XmlObject var1);

   int valueHashCode();

   int compareTo(Object var1);

   int compareValue(XmlObject var1);

   XmlObject[] selectChildren(QName var1);

   XmlObject[] selectChildren(String var1, String var2);

   XmlObject[] selectChildren(QNameSet var1);

   XmlObject selectAttribute(QName var1);

   XmlObject selectAttribute(String var1, String var2);

   XmlObject[] selectAttributes(QNameSet var1);


   public static final class Factory {

      public static XmlObject newInstance() {
         return XmlBeans.getContextTypeLoader().newInstance((SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject newInstance(XmlOptions options) {
         return XmlBeans.getContextTypeLoader().newInstance((SchemaType)null, options);
      }

      public static XmlObject newValue(Object obj) {
         return XmlObject.type.newValue(obj);
      }

      public static XmlObject parse(String xmlAsString) throws XmlException {
         return XmlBeans.getContextTypeLoader().parse(xmlAsString, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(String xmlAsString, XmlOptions options) throws XmlException {
         return XmlBeans.getContextTypeLoader().parse(xmlAsString, (SchemaType)null, options);
      }

      public static XmlObject parse(File file) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(file, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(File file, XmlOptions options) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(file, (SchemaType)null, options);
      }

      public static XmlObject parse(URL u) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(u, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(URL u, XmlOptions options) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(u, (SchemaType)null, options);
      }

      public static XmlObject parse(InputStream is) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(is, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(XMLStreamReader xsr) throws XmlException {
         return XmlBeans.getContextTypeLoader().parse(xsr, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(is, (SchemaType)null, options);
      }

      public static XmlObject parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return XmlBeans.getContextTypeLoader().parse(xsr, (SchemaType)null, options);
      }

      public static XmlObject parse(Reader r) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(r, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return XmlBeans.getContextTypeLoader().parse(r, (SchemaType)null, options);
      }

      public static XmlObject parse(Node node) throws XmlException {
         return XmlBeans.getContextTypeLoader().parse(node, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(Node node, XmlOptions options) throws XmlException {
         return XmlBeans.getContextTypeLoader().parse(node, (SchemaType)null, options);
      }

      public static XmlObject parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().parse(xis, (SchemaType)null, (XmlOptions)null);
      }

      public static XmlObject parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().parse(xis, (SchemaType)null, options);
      }

      public static XmlSaxHandler newXmlSaxHandler() {
         return XmlBeans.getContextTypeLoader().newXmlSaxHandler((SchemaType)null, (XmlOptions)null);
      }

      public static XmlSaxHandler newXmlSaxHandler(XmlOptions options) {
         return XmlBeans.getContextTypeLoader().newXmlSaxHandler((SchemaType)null, options);
      }

      public static DOMImplementation newDomImplementation() {
         return XmlBeans.getContextTypeLoader().newDomImplementation((XmlOptions)null);
      }

      public static DOMImplementation newDomImplementation(XmlOptions options) {
         return XmlBeans.getContextTypeLoader().newDomImplementation(options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, (SchemaType)null, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, (SchemaType)null, options);
      }

   }
}
