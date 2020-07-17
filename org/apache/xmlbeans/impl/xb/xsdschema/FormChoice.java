package org.apache.xmlbeans.impl.xb.xsdschema;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlNMTOKEN;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface FormChoice extends XmlNMTOKEN {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FormChoice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("formchoicef2aetype");
   FormChoice.Enum QUALIFIED = FormChoice.Enum.forString("qualified");
   FormChoice.Enum UNQUALIFIED = FormChoice.Enum.forString("unqualified");
   int INT_QUALIFIED = 1;
   int INT_UNQUALIFIED = 2;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_QUALIFIED = 1;
      static final int INT_UNQUALIFIED = 2;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new FormChoice.Enum[]{new FormChoice.Enum("qualified", 1), new FormChoice.Enum("unqualified", 2)});
      private static final long serialVersionUID = 1L;


      public static FormChoice.Enum forString(String s) {
         return (FormChoice.Enum)table.forString(s);
      }

      public static FormChoice.Enum forInt(int i) {
         return (FormChoice.Enum)table.forInt(i);
      }

      private Enum(String s, int i) {
         super(s, i);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   static class NamelessClass1099474700 {
   }

   public static final class Factory {

      public static FormChoice newValue(Object obj) {
         return (FormChoice)FormChoice.type.newValue(obj);
      }

      public static FormChoice newInstance() {
         return (FormChoice)XmlBeans.getContextTypeLoader().newInstance(FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice newInstance(XmlOptions options) {
         return (FormChoice)XmlBeans.getContextTypeLoader().newInstance(FormChoice.type, options);
      }

      public static FormChoice parse(String xmlAsString) throws XmlException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(xmlAsString, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(xmlAsString, FormChoice.type, options);
      }

      public static FormChoice parse(File file) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(file, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(File file, XmlOptions options) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(file, FormChoice.type, options);
      }

      public static FormChoice parse(URL u) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(u, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(u, FormChoice.type, options);
      }

      public static FormChoice parse(InputStream is) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(is, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(is, FormChoice.type, options);
      }

      public static FormChoice parse(Reader r) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(r, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(r, FormChoice.type, options);
      }

      public static FormChoice parse(XMLStreamReader sr) throws XmlException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(sr, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(sr, FormChoice.type, options);
      }

      public static FormChoice parse(Node node) throws XmlException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(node, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(Node node, XmlOptions options) throws XmlException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(node, FormChoice.type, options);
      }

      public static FormChoice parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(xis, FormChoice.type, (XmlOptions)null);
      }

      public static FormChoice parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (FormChoice)XmlBeans.getContextTypeLoader().parse(xis, FormChoice.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, FormChoice.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, FormChoice.type, options);
      }

   }
}
