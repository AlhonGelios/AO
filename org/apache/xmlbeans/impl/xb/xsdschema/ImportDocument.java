package org.apache.xmlbeans.impl.xb.xsdschema;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.xb.xsdschema.Annotated;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ImportDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ImportDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("import99fedoctype");


   ImportDocument.Import getImport();

   void setImport(ImportDocument.Import var1);

   ImportDocument.Import addNewImport();


   static class NamelessClass1456078924 {
   }

   public static final class Factory {

      public static ImportDocument newInstance() {
         return (ImportDocument)XmlBeans.getContextTypeLoader().newInstance(ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument newInstance(XmlOptions options) {
         return (ImportDocument)XmlBeans.getContextTypeLoader().newInstance(ImportDocument.type, options);
      }

      public static ImportDocument parse(String xmlAsString) throws XmlException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, ImportDocument.type, options);
      }

      public static ImportDocument parse(File file) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(file, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(file, ImportDocument.type, options);
      }

      public static ImportDocument parse(URL u) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(u, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(u, ImportDocument.type, options);
      }

      public static ImportDocument parse(InputStream is) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(is, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(is, ImportDocument.type, options);
      }

      public static ImportDocument parse(Reader r) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(r, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(r, ImportDocument.type, options);
      }

      public static ImportDocument parse(XMLStreamReader sr) throws XmlException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(sr, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(sr, ImportDocument.type, options);
      }

      public static ImportDocument parse(Node node) throws XmlException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(node, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(Node node, XmlOptions options) throws XmlException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(node, ImportDocument.type, options);
      }

      public static ImportDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(xis, ImportDocument.type, (XmlOptions)null);
      }

      public static ImportDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (ImportDocument)XmlBeans.getContextTypeLoader().parse(xis, ImportDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, ImportDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, ImportDocument.type, options);
      }

   }

   public interface Import extends Annotated {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ImportDocument.Import.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("importe2ffelemtype");


      String getNamespace();

      XmlAnyURI xgetNamespace();

      boolean isSetNamespace();

      void setNamespace(String var1);

      void xsetNamespace(XmlAnyURI var1);

      void unsetNamespace();

      String getSchemaLocation();

      XmlAnyURI xgetSchemaLocation();

      boolean isSetSchemaLocation();

      void setSchemaLocation(String var1);

      void xsetSchemaLocation(XmlAnyURI var1);

      void unsetSchemaLocation();


      public static final class Factory {

         public static ImportDocument.Import newInstance() {
            return (ImportDocument.Import)XmlBeans.getContextTypeLoader().newInstance(ImportDocument.Import.type, (XmlOptions)null);
         }

         public static ImportDocument.Import newInstance(XmlOptions options) {
            return (ImportDocument.Import)XmlBeans.getContextTypeLoader().newInstance(ImportDocument.Import.type, options);
         }

      }
   }
}
