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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface Extensionconfig extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(Extensionconfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("extensionconfig2ac2type");


   Extensionconfig.Interface[] getInterfaceArray();

   Extensionconfig.Interface getInterfaceArray(int var1);

   int sizeOfInterfaceArray();

   void setInterfaceArray(Extensionconfig.Interface[] var1);

   void setInterfaceArray(int var1, Extensionconfig.Interface var2);

   Extensionconfig.Interface insertNewInterface(int var1);

   Extensionconfig.Interface addNewInterface();

   void removeInterface(int var1);

   Extensionconfig.PrePostSet getPrePostSet();

   boolean isSetPrePostSet();

   void setPrePostSet(Extensionconfig.PrePostSet var1);

   Extensionconfig.PrePostSet addNewPrePostSet();

   void unsetPrePostSet();

   Object getFor();

   JavaNameList xgetFor();

   boolean isSetFor();

   void setFor(Object var1);

   void xsetFor(JavaNameList var1);

   void unsetFor();


   public interface Interface extends XmlObject {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(Extensionconfig.Interface.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("interface02a7elemtype");


      String getStaticHandler();

      XmlString xgetStaticHandler();

      void setStaticHandler(String var1);

      void xsetStaticHandler(XmlString var1);

      String getName();

      XmlString xgetName();

      boolean isSetName();

      void setName(String var1);

      void xsetName(XmlString var1);

      void unsetName();


      public static final class Factory {

         public static Extensionconfig.Interface newInstance() {
            return (Extensionconfig.Interface)XmlBeans.getContextTypeLoader().newInstance(Extensionconfig.Interface.type, (XmlOptions)null);
         }

         public static Extensionconfig.Interface newInstance(XmlOptions options) {
            return (Extensionconfig.Interface)XmlBeans.getContextTypeLoader().newInstance(Extensionconfig.Interface.type, options);
         }

      }
   }

   static class NamelessClass1158233548 {
   }

   public static final class Factory {

      public static Extensionconfig newInstance() {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().newInstance(Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig newInstance(XmlOptions options) {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().newInstance(Extensionconfig.type, options);
      }

      public static Extensionconfig parse(String xmlAsString) throws XmlException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(xmlAsString, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(xmlAsString, Extensionconfig.type, options);
      }

      public static Extensionconfig parse(File file) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(file, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(File file, XmlOptions options) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(file, Extensionconfig.type, options);
      }

      public static Extensionconfig parse(URL u) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(u, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(u, Extensionconfig.type, options);
      }

      public static Extensionconfig parse(InputStream is) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(is, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(is, Extensionconfig.type, options);
      }

      public static Extensionconfig parse(Reader r) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(r, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(r, Extensionconfig.type, options);
      }

      public static Extensionconfig parse(XMLStreamReader sr) throws XmlException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(sr, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(sr, Extensionconfig.type, options);
      }

      public static Extensionconfig parse(Node node) throws XmlException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(node, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(Node node, XmlOptions options) throws XmlException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(node, Extensionconfig.type, options);
      }

      public static Extensionconfig parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(xis, Extensionconfig.type, (XmlOptions)null);
      }

      public static Extensionconfig parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (Extensionconfig)XmlBeans.getContextTypeLoader().parse(xis, Extensionconfig.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, Extensionconfig.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, Extensionconfig.type, options);
      }

   }

   public interface PrePostSet extends XmlObject {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(Extensionconfig.PrePostSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("prepostset5c9delemtype");


      String getStaticHandler();

      XmlString xgetStaticHandler();

      void setStaticHandler(String var1);

      void xsetStaticHandler(XmlString var1);


      public static final class Factory {

         public static Extensionconfig.PrePostSet newInstance() {
            return (Extensionconfig.PrePostSet)XmlBeans.getContextTypeLoader().newInstance(Extensionconfig.PrePostSet.type, (XmlOptions)null);
         }

         public static Extensionconfig.PrePostSet newInstance(XmlOptions options) {
            return (Extensionconfig.PrePostSet)XmlBeans.getContextTypeLoader().newInstance(Extensionconfig.PrePostSet.type, options);
         }

      }
   }
}
