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

public interface FieldDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FieldDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("field3f9bdoctype");


   FieldDocument.Field getField();

   void setField(FieldDocument.Field var1);

   FieldDocument.Field addNewField();


   static class NamelessClass975491270 {
   }

   public interface Field extends Annotated {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FieldDocument.Field.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("field12f5elemtype");


      String getXpath();

      FieldDocument.Field.Xpath xgetXpath();

      void setXpath(String var1);

      void xsetXpath(FieldDocument.Field.Xpath var1);


      public static final class Factory {

         public static FieldDocument.Field newInstance() {
            return (FieldDocument.Field)XmlBeans.getContextTypeLoader().newInstance(FieldDocument.Field.type, (XmlOptions)null);
         }

         public static FieldDocument.Field newInstance(XmlOptions options) {
            return (FieldDocument.Field)XmlBeans.getContextTypeLoader().newInstance(FieldDocument.Field.type, options);
         }

      }

      public interface Xpath extends XmlToken {

         SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FieldDocument.Field.Xpath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("xpath7f90attrtype");



         public static final class Factory {

            public static FieldDocument.Field.Xpath newValue(Object obj) {
               return (FieldDocument.Field.Xpath)FieldDocument.Field.Xpath.type.newValue(obj);
            }

            public static FieldDocument.Field.Xpath newInstance() {
               return (FieldDocument.Field.Xpath)XmlBeans.getContextTypeLoader().newInstance(FieldDocument.Field.Xpath.type, (XmlOptions)null);
            }

            public static FieldDocument.Field.Xpath newInstance(XmlOptions options) {
               return (FieldDocument.Field.Xpath)XmlBeans.getContextTypeLoader().newInstance(FieldDocument.Field.Xpath.type, options);
            }

         }
      }
   }

   public static final class Factory {

      public static FieldDocument newInstance() {
         return (FieldDocument)XmlBeans.getContextTypeLoader().newInstance(FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument newInstance(XmlOptions options) {
         return (FieldDocument)XmlBeans.getContextTypeLoader().newInstance(FieldDocument.type, options);
      }

      public static FieldDocument parse(String xmlAsString) throws XmlException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, FieldDocument.type, options);
      }

      public static FieldDocument parse(File file) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(file, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(file, FieldDocument.type, options);
      }

      public static FieldDocument parse(URL u) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(u, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(u, FieldDocument.type, options);
      }

      public static FieldDocument parse(InputStream is) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(is, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(is, FieldDocument.type, options);
      }

      public static FieldDocument parse(Reader r) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(r, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(r, FieldDocument.type, options);
      }

      public static FieldDocument parse(XMLStreamReader sr) throws XmlException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(sr, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(sr, FieldDocument.type, options);
      }

      public static FieldDocument parse(Node node) throws XmlException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(node, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(Node node, XmlOptions options) throws XmlException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(node, FieldDocument.type, options);
      }

      public static FieldDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(xis, FieldDocument.type, (XmlOptions)null);
      }

      public static FieldDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (FieldDocument)XmlBeans.getContextTypeLoader().parse(xis, FieldDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, FieldDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, FieldDocument.type, options);
      }

   }
}
