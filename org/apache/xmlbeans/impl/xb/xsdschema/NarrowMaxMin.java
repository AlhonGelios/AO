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
import org.apache.xmlbeans.XmlNonNegativeInteger;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.xb.xsdschema.AllNNI;
import org.apache.xmlbeans.impl.xb.xsdschema.LocalElement;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface NarrowMaxMin extends LocalElement {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NarrowMaxMin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("narrowmaxmin926atype");



   public static final class Factory {

      public static NarrowMaxMin newInstance() {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().newInstance(NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin newInstance(XmlOptions options) {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().newInstance(NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(String xmlAsString) throws XmlException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(xmlAsString, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(xmlAsString, NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(File file) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(file, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(File file, XmlOptions options) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(file, NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(URL u) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(u, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(u, NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(InputStream is) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(is, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(is, NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(Reader r) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(r, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(r, NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(XMLStreamReader sr) throws XmlException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(sr, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(sr, NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(Node node) throws XmlException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(node, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(Node node, XmlOptions options) throws XmlException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(node, NarrowMaxMin.type, options);
      }

      public static NarrowMaxMin parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(xis, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static NarrowMaxMin parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (NarrowMaxMin)XmlBeans.getContextTypeLoader().parse(xis, NarrowMaxMin.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, NarrowMaxMin.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, NarrowMaxMin.type, options);
      }

   }

   public interface MinOccurs extends XmlNonNegativeInteger {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NarrowMaxMin.MinOccurs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("minoccurs1acbattrtype");



      public static final class Factory {

         public static NarrowMaxMin.MinOccurs newValue(Object obj) {
            return (NarrowMaxMin.MinOccurs)NarrowMaxMin.MinOccurs.type.newValue(obj);
         }

         public static NarrowMaxMin.MinOccurs newInstance() {
            return (NarrowMaxMin.MinOccurs)XmlBeans.getContextTypeLoader().newInstance(NarrowMaxMin.MinOccurs.type, (XmlOptions)null);
         }

         public static NarrowMaxMin.MinOccurs newInstance(XmlOptions options) {
            return (NarrowMaxMin.MinOccurs)XmlBeans.getContextTypeLoader().newInstance(NarrowMaxMin.MinOccurs.type, options);
         }

      }
   }

   public interface MaxOccurs extends AllNNI {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NarrowMaxMin.MaxOccurs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("maxoccursd85dattrtype");


      Object getObjectValue();

      void setObjectValue(Object var1);

      Object objectValue();

      void objectSet(Object var1);

      SchemaType instanceType();


      public static final class Factory {

         public static NarrowMaxMin.MaxOccurs newValue(Object obj) {
            return (NarrowMaxMin.MaxOccurs)NarrowMaxMin.MaxOccurs.type.newValue(obj);
         }

         public static NarrowMaxMin.MaxOccurs newInstance() {
            return (NarrowMaxMin.MaxOccurs)XmlBeans.getContextTypeLoader().newInstance(NarrowMaxMin.MaxOccurs.type, (XmlOptions)null);
         }

         public static NarrowMaxMin.MaxOccurs newInstance(XmlOptions options) {
            return (NarrowMaxMin.MaxOccurs)XmlBeans.getContextTypeLoader().newInstance(NarrowMaxMin.MaxOccurs.type, options);
         }

      }
   }

   static class NamelessClass175806843 {
   }
}
