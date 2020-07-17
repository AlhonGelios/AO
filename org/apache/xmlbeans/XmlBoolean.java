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

public interface XmlBoolean extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_boolean");


   boolean booleanValue();

   void set(boolean var1);

   boolean getBooleanValue();

   void setBooleanValue(boolean var1);


   public static final class Factory {

      public static XmlBoolean newInstance() {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().newInstance(XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean newInstance(XmlOptions options) {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().newInstance(XmlBoolean.type, options);
      }

      public static XmlBoolean newValue(Object obj) {
         return (XmlBoolean)XmlBoolean.type.newValue(obj);
      }

      public static XmlBoolean parse(String s) throws XmlException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(s, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(String s, XmlOptions options) throws XmlException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(s, XmlBoolean.type, options);
      }

      public static XmlBoolean parse(File f) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(f, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(f, XmlBoolean.type, options);
      }

      public static XmlBoolean parse(URL u) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(u, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(u, XmlBoolean.type, options);
      }

      public static XmlBoolean parse(InputStream is) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(is, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(is, XmlBoolean.type, options);
      }

      public static XmlBoolean parse(Reader r) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(r, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(r, XmlBoolean.type, options);
      }

      public static XmlBoolean parse(Node node) throws XmlException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(node, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(Node node, XmlOptions options) throws XmlException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(node, XmlBoolean.type, options);
      }

      public static XmlBoolean parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(xis, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(xis, XmlBoolean.type, options);
      }

      public static XmlBoolean parse(XMLStreamReader xsr) throws XmlException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(xsr, XmlBoolean.type, (XmlOptions)null);
      }

      public static XmlBoolean parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlBoolean)XmlBeans.getContextTypeLoader().parse(xsr, XmlBoolean.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlBoolean.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlBoolean.type, options);
      }

   }
}
