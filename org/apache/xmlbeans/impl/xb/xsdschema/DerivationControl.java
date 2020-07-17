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

public interface DerivationControl extends XmlNMTOKEN {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DerivationControl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("derivationcontrola5dftype");
   DerivationControl.Enum SUBSTITUTION = DerivationControl.Enum.forString("substitution");
   DerivationControl.Enum EXTENSION = DerivationControl.Enum.forString("extension");
   DerivationControl.Enum RESTRICTION = DerivationControl.Enum.forString("restriction");
   DerivationControl.Enum LIST = DerivationControl.Enum.forString("list");
   DerivationControl.Enum UNION = DerivationControl.Enum.forString("union");
   int INT_SUBSTITUTION = 1;
   int INT_EXTENSION = 2;
   int INT_RESTRICTION = 3;
   int INT_LIST = 4;
   int INT_UNION = 5;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Factory {

      public static DerivationControl newValue(Object obj) {
         return (DerivationControl)DerivationControl.type.newValue(obj);
      }

      public static DerivationControl newInstance() {
         return (DerivationControl)XmlBeans.getContextTypeLoader().newInstance(DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl newInstance(XmlOptions options) {
         return (DerivationControl)XmlBeans.getContextTypeLoader().newInstance(DerivationControl.type, options);
      }

      public static DerivationControl parse(String xmlAsString) throws XmlException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(xmlAsString, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(xmlAsString, DerivationControl.type, options);
      }

      public static DerivationControl parse(File file) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(file, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(File file, XmlOptions options) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(file, DerivationControl.type, options);
      }

      public static DerivationControl parse(URL u) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(u, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(u, DerivationControl.type, options);
      }

      public static DerivationControl parse(InputStream is) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(is, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(is, DerivationControl.type, options);
      }

      public static DerivationControl parse(Reader r) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(r, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(r, DerivationControl.type, options);
      }

      public static DerivationControl parse(XMLStreamReader sr) throws XmlException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(sr, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(sr, DerivationControl.type, options);
      }

      public static DerivationControl parse(Node node) throws XmlException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(node, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(Node node, XmlOptions options) throws XmlException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(node, DerivationControl.type, options);
      }

      public static DerivationControl parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(xis, DerivationControl.type, (XmlOptions)null);
      }

      public static DerivationControl parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (DerivationControl)XmlBeans.getContextTypeLoader().parse(xis, DerivationControl.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, DerivationControl.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, DerivationControl.type, options);
      }

   }

   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SUBSTITUTION = 1;
      static final int INT_EXTENSION = 2;
      static final int INT_RESTRICTION = 3;
      static final int INT_LIST = 4;
      static final int INT_UNION = 5;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new DerivationControl.Enum[]{new DerivationControl.Enum("substitution", 1), new DerivationControl.Enum("extension", 2), new DerivationControl.Enum("restriction", 3), new DerivationControl.Enum("list", 4), new DerivationControl.Enum("union", 5)});
      private static final long serialVersionUID = 1L;


      public static DerivationControl.Enum forString(String s) {
         return (DerivationControl.Enum)table.forString(s);
      }

      public static DerivationControl.Enum forInt(int i) {
         return (DerivationControl.Enum)table.forInt(i);
      }

      private Enum(String s, int i) {
         super(s, i);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   static class NamelessClass547473487 {
   }
}
