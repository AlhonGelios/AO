package org.apache.xmlbeans;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface XmlDouble extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_double");


   double getDoubleValue();

   void setDoubleValue(double var1);

   double doubleValue();

   void set(double var1);


   public static final class Factory {

      public static XmlDouble newInstance() {
         return (XmlDouble)XmlBeans.getContextTypeLoader().newInstance(XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble newInstance(XmlOptions options) {
         return (XmlDouble)XmlBeans.getContextTypeLoader().newInstance(XmlDouble.type, options);
      }

      public static XmlDouble newValue(Object obj) {
         return (XmlDouble)XmlDouble.type.newValue(obj);
      }

      public static XmlDouble parse(String s) throws XmlException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(s, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(String s, XmlOptions options) throws XmlException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(s, XmlDouble.type, options);
      }

      public static XmlDouble parse(File f) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(f, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(f, XmlDouble.type, options);
      }

      public static XmlDouble parse(URL u) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(u, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(u, XmlDouble.type, options);
      }

      public static XmlDouble parse(InputStream is) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(is, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(is, XmlDouble.type, options);
      }

      public static XmlDouble parse(Reader r) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(r, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(r, XmlDouble.type, options);
      }

      public static XmlDouble parse(Node node) throws XmlException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(node, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(Node node, XmlOptions options) throws XmlException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(node, XmlDouble.type, options);
      }

      public static XmlDouble parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(xis, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(xis, XmlDouble.type, options);
      }

      public static XmlDouble parse(XMLStreamReader xsr) throws XmlException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(xsr, XmlDouble.type, (XmlOptions)null);
      }

      public static XmlDouble parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlDouble)XmlBeans.getContextTypeLoader().parse(xsr, XmlDouble.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlDouble.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlDouble.type, options);
      }

   }
}
