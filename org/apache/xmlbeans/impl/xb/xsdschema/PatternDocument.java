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
import org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface PatternDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PatternDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("pattern9585doctype");


   PatternDocument.Pattern getPattern();

   void setPattern(PatternDocument.Pattern var1);

   PatternDocument.Pattern addNewPattern();


   public interface Pattern extends NoFixedFacet {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PatternDocument.Pattern.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("pattern6809elemtype");



      public static final class Factory {

         public static PatternDocument.Pattern newInstance() {
            return (PatternDocument.Pattern)XmlBeans.getContextTypeLoader().newInstance(PatternDocument.Pattern.type, (XmlOptions)null);
         }

         public static PatternDocument.Pattern newInstance(XmlOptions options) {
            return (PatternDocument.Pattern)XmlBeans.getContextTypeLoader().newInstance(PatternDocument.Pattern.type, options);
         }

      }
   }

   static class NamelessClass1339312075 {
   }

   public static final class Factory {

      public static PatternDocument newInstance() {
         return (PatternDocument)XmlBeans.getContextTypeLoader().newInstance(PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument newInstance(XmlOptions options) {
         return (PatternDocument)XmlBeans.getContextTypeLoader().newInstance(PatternDocument.type, options);
      }

      public static PatternDocument parse(String xmlAsString) throws XmlException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, PatternDocument.type, options);
      }

      public static PatternDocument parse(File file) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(file, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(file, PatternDocument.type, options);
      }

      public static PatternDocument parse(URL u) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(u, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(u, PatternDocument.type, options);
      }

      public static PatternDocument parse(InputStream is) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(is, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(is, PatternDocument.type, options);
      }

      public static PatternDocument parse(Reader r) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(r, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(r, PatternDocument.type, options);
      }

      public static PatternDocument parse(XMLStreamReader sr) throws XmlException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(sr, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(sr, PatternDocument.type, options);
      }

      public static PatternDocument parse(Node node) throws XmlException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(node, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(Node node, XmlOptions options) throws XmlException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(node, PatternDocument.type, options);
      }

      public static PatternDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(xis, PatternDocument.type, (XmlOptions)null);
      }

      public static PatternDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (PatternDocument)XmlBeans.getContextTypeLoader().parse(xis, PatternDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, PatternDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, PatternDocument.type, options);
      }

   }
}
