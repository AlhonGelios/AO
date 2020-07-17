package org.apache.xmlbeans.impl.xb.xmlconfig;

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
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;
import org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig;
import org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig;
import org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ConfigDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ConfigDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("config4185doctype");


   ConfigDocument.Config getConfig();

   void setConfig(ConfigDocument.Config var1);

   ConfigDocument.Config addNewConfig();


   public static final class Factory {

      public static ConfigDocument newInstance() {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().newInstance(ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument newInstance(XmlOptions options) {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().newInstance(ConfigDocument.type, options);
      }

      public static ConfigDocument parse(String xmlAsString) throws XmlException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, ConfigDocument.type, options);
      }

      public static ConfigDocument parse(File file) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(file, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(file, ConfigDocument.type, options);
      }

      public static ConfigDocument parse(URL u) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(u, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(u, ConfigDocument.type, options);
      }

      public static ConfigDocument parse(InputStream is) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(is, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(is, ConfigDocument.type, options);
      }

      public static ConfigDocument parse(Reader r) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(r, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(r, ConfigDocument.type, options);
      }

      public static ConfigDocument parse(XMLStreamReader sr) throws XmlException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(sr, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(sr, ConfigDocument.type, options);
      }

      public static ConfigDocument parse(Node node) throws XmlException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(node, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(Node node, XmlOptions options) throws XmlException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(node, ConfigDocument.type, options);
      }

      public static ConfigDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(xis, ConfigDocument.type, (XmlOptions)null);
      }

      public static ConfigDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (ConfigDocument)XmlBeans.getContextTypeLoader().parse(xis, ConfigDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, ConfigDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, ConfigDocument.type, options);
      }

   }

   public interface Config extends XmlObject {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ConfigDocument.Config.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("configf467elemtype");


      Nsconfig[] getNamespaceArray();

      Nsconfig getNamespaceArray(int var1);

      int sizeOfNamespaceArray();

      void setNamespaceArray(Nsconfig[] var1);

      void setNamespaceArray(int var1, Nsconfig var2);

      Nsconfig insertNewNamespace(int var1);

      Nsconfig addNewNamespace();

      void removeNamespace(int var1);

      Qnameconfig[] getQnameArray();

      Qnameconfig getQnameArray(int var1);

      int sizeOfQnameArray();

      void setQnameArray(Qnameconfig[] var1);

      void setQnameArray(int var1, Qnameconfig var2);

      Qnameconfig insertNewQname(int var1);

      Qnameconfig addNewQname();

      void removeQname(int var1);

      Extensionconfig[] getExtensionArray();

      Extensionconfig getExtensionArray(int var1);

      int sizeOfExtensionArray();

      void setExtensionArray(Extensionconfig[] var1);

      void setExtensionArray(int var1, Extensionconfig var2);

      Extensionconfig insertNewExtension(int var1);

      Extensionconfig addNewExtension();

      void removeExtension(int var1);

      Usertypeconfig[] getUsertypeArray();

      Usertypeconfig getUsertypeArray(int var1);

      int sizeOfUsertypeArray();

      void setUsertypeArray(Usertypeconfig[] var1);

      void setUsertypeArray(int var1, Usertypeconfig var2);

      Usertypeconfig insertNewUsertype(int var1);

      Usertypeconfig addNewUsertype();

      void removeUsertype(int var1);


      public static final class Factory {

         public static ConfigDocument.Config newInstance() {
            return (ConfigDocument.Config)XmlBeans.getContextTypeLoader().newInstance(ConfigDocument.Config.type, (XmlOptions)null);
         }

         public static ConfigDocument.Config newInstance(XmlOptions options) {
            return (ConfigDocument.Config)XmlBeans.getContextTypeLoader().newInstance(ConfigDocument.Config.type, options);
         }

      }
   }

   static class NamelessClass1038677340 {
   }
}
