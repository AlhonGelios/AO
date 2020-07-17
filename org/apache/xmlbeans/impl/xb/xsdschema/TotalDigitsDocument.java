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
import org.apache.xmlbeans.impl.xb.xsdschema.NumFacet;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface TotalDigitsDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(TotalDigitsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("totaldigits4a8bdoctype");


   TotalDigitsDocument.TotalDigits getTotalDigits();

   void setTotalDigits(TotalDigitsDocument.TotalDigits var1);

   TotalDigitsDocument.TotalDigits addNewTotalDigits();


   public interface TotalDigits extends NumFacet {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(TotalDigitsDocument.TotalDigits.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("totaldigits2615elemtype");



      public static final class Factory {

         public static TotalDigitsDocument.TotalDigits newInstance() {
            return (TotalDigitsDocument.TotalDigits)XmlBeans.getContextTypeLoader().newInstance(TotalDigitsDocument.TotalDigits.type, (XmlOptions)null);
         }

         public static TotalDigitsDocument.TotalDigits newInstance(XmlOptions options) {
            return (TotalDigitsDocument.TotalDigits)XmlBeans.getContextTypeLoader().newInstance(TotalDigitsDocument.TotalDigits.type, options);
         }

      }
   }

   static class NamelessClass1031536090 {
   }

   public static final class Factory {

      public static TotalDigitsDocument newInstance() {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().newInstance(TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument newInstance(XmlOptions options) {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().newInstance(TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(String xmlAsString) throws XmlException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(File file) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(file, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(file, TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(URL u) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(u, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(u, TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(InputStream is) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(is, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(is, TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(Reader r) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(r, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(r, TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(XMLStreamReader sr) throws XmlException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(sr, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(sr, TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(Node node) throws XmlException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(node, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(Node node, XmlOptions options) throws XmlException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(node, TotalDigitsDocument.type, options);
      }

      public static TotalDigitsDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(xis, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static TotalDigitsDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (TotalDigitsDocument)XmlBeans.getContextTypeLoader().parse(xis, TotalDigitsDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, TotalDigitsDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, TotalDigitsDocument.type, options);
      }

   }
}
