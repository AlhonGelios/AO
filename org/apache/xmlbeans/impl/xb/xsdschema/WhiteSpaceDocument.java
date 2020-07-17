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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.xb.xsdschema.Facet;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface WhiteSpaceDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(WhiteSpaceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("whitespaced2c6doctype");


   WhiteSpaceDocument.WhiteSpace getWhiteSpace();

   void setWhiteSpace(WhiteSpaceDocument.WhiteSpace var1);

   WhiteSpaceDocument.WhiteSpace addNewWhiteSpace();


   public static final class Factory {

      public static WhiteSpaceDocument newInstance() {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().newInstance(WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument newInstance(XmlOptions options) {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().newInstance(WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(String xmlAsString) throws XmlException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(File file) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(file, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(File file, XmlOptions options) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(file, WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(URL u) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(u, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(u, WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(InputStream is) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(is, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(is, WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(Reader r) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(r, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(r, WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(XMLStreamReader sr) throws XmlException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(sr, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(sr, WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(Node node) throws XmlException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(node, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(Node node, XmlOptions options) throws XmlException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(node, WhiteSpaceDocument.type, options);
      }

      public static WhiteSpaceDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(xis, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static WhiteSpaceDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (WhiteSpaceDocument)XmlBeans.getContextTypeLoader().parse(xis, WhiteSpaceDocument.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, WhiteSpaceDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, WhiteSpaceDocument.type, options);
      }

   }

   public interface WhiteSpace extends Facet {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(WhiteSpaceDocument.WhiteSpace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("whitespace97ffelemtype");



      public interface Value extends XmlNMTOKEN {

         SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(WhiteSpaceDocument.WhiteSpace.Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("value8186attrtype");
         WhiteSpaceDocument.WhiteSpace.Value.Enum PRESERVE = WhiteSpaceDocument.WhiteSpace.Value.Enum.forString("preserve");
         WhiteSpaceDocument.WhiteSpace.Value.Enum REPLACE = WhiteSpaceDocument.WhiteSpace.Value.Enum.forString("replace");
         WhiteSpaceDocument.WhiteSpace.Value.Enum COLLAPSE = WhiteSpaceDocument.WhiteSpace.Value.Enum.forString("collapse");
         int INT_PRESERVE = 1;
         int INT_REPLACE = 2;
         int INT_COLLAPSE = 3;


         StringEnumAbstractBase enumValue();

         void set(StringEnumAbstractBase var1);


         public static final class Factory {

            public static WhiteSpaceDocument.WhiteSpace.Value newValue(Object obj) {
               return (WhiteSpaceDocument.WhiteSpace.Value)WhiteSpaceDocument.WhiteSpace.Value.type.newValue(obj);
            }

            public static WhiteSpaceDocument.WhiteSpace.Value newInstance() {
               return (WhiteSpaceDocument.WhiteSpace.Value)XmlBeans.getContextTypeLoader().newInstance(WhiteSpaceDocument.WhiteSpace.Value.type, (XmlOptions)null);
            }

            public static WhiteSpaceDocument.WhiteSpace.Value newInstance(XmlOptions options) {
               return (WhiteSpaceDocument.WhiteSpace.Value)XmlBeans.getContextTypeLoader().newInstance(WhiteSpaceDocument.WhiteSpace.Value.type, options);
            }

         }

         public static final class Enum extends StringEnumAbstractBase {

            static final int INT_PRESERVE = 1;
            static final int INT_REPLACE = 2;
            static final int INT_COLLAPSE = 3;
            public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new WhiteSpaceDocument.WhiteSpace.Value.Enum[]{new WhiteSpaceDocument.WhiteSpace.Value.Enum("preserve", 1), new WhiteSpaceDocument.WhiteSpace.Value.Enum("replace", 2), new WhiteSpaceDocument.WhiteSpace.Value.Enum("collapse", 3)});
            private static final long serialVersionUID = 1L;


            public static WhiteSpaceDocument.WhiteSpace.Value.Enum forString(String s) {
               return (WhiteSpaceDocument.WhiteSpace.Value.Enum)table.forString(s);
            }

            public static WhiteSpaceDocument.WhiteSpace.Value.Enum forInt(int i) {
               return (WhiteSpaceDocument.WhiteSpace.Value.Enum)table.forInt(i);
            }

            private Enum(String s, int i) {
               super(s, i);
            }

            private Object readResolve() {
               return forInt(this.intValue());
            }

         }
      }

      public static final class Factory {

         public static WhiteSpaceDocument.WhiteSpace newInstance() {
            return (WhiteSpaceDocument.WhiteSpace)XmlBeans.getContextTypeLoader().newInstance(WhiteSpaceDocument.WhiteSpace.type, (XmlOptions)null);
         }

         public static WhiteSpaceDocument.WhiteSpace newInstance(XmlOptions options) {
            return (WhiteSpaceDocument.WhiteSpace)XmlBeans.getContextTypeLoader().newInstance(WhiteSpaceDocument.WhiteSpace.type, options);
         }

      }
   }

   static class NamelessClass1804883593 {
   }
}
