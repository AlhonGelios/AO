package org.apache.xmlbeans.impl.xb.xsdschema;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface FullDerivationSet extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FullDerivationSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("fullderivationsetd369type");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   public interface Member extends XmlToken {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FullDerivationSet.Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anon47e4type");
      FullDerivationSet.Member.Enum ALL = FullDerivationSet.Member.Enum.forString("#all");
      int INT_ALL = 1;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Factory {

         public static FullDerivationSet.Member newValue(Object obj) {
            return (FullDerivationSet.Member)FullDerivationSet.Member.type.newValue(obj);
         }

         public static FullDerivationSet.Member newInstance() {
            return (FullDerivationSet.Member)XmlBeans.getContextTypeLoader().newInstance(FullDerivationSet.Member.type, (XmlOptions)null);
         }

         public static FullDerivationSet.Member newInstance(XmlOptions options) {
            return (FullDerivationSet.Member)XmlBeans.getContextTypeLoader().newInstance(FullDerivationSet.Member.type, options);
         }

      }

      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_ALL = 1;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new FullDerivationSet.Member.Enum[]{new FullDerivationSet.Member.Enum("#all", 1)});
         private static final long serialVersionUID = 1L;


         public static FullDerivationSet.Member.Enum forString(String s) {
            return (FullDerivationSet.Member.Enum)table.forString(s);
         }

         public static FullDerivationSet.Member.Enum forInt(int i) {
            return (FullDerivationSet.Member.Enum)table.forInt(i);
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

      public static FullDerivationSet newValue(Object obj) {
         return (FullDerivationSet)FullDerivationSet.type.newValue(obj);
      }

      public static FullDerivationSet newInstance() {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().newInstance(FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet newInstance(XmlOptions options) {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().newInstance(FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(String xmlAsString) throws XmlException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(File file) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(file, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(File file, XmlOptions options) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(file, FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(URL u) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(u, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(u, FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(InputStream is) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(is, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(is, FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(Reader r) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(r, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(r, FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(XMLStreamReader sr) throws XmlException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(sr, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(sr, FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(Node node) throws XmlException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(node, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(Node node, XmlOptions options) throws XmlException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(node, FullDerivationSet.type, options);
      }

      public static FullDerivationSet parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(xis, FullDerivationSet.type, (XmlOptions)null);
      }

      public static FullDerivationSet parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (FullDerivationSet)XmlBeans.getContextTypeLoader().parse(xis, FullDerivationSet.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, FullDerivationSet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, FullDerivationSet.type, options);
      }

   }

   public interface Member2 extends XmlAnySimpleType {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FullDerivationSet.Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anonc683type");


      List getListValue();

      List xgetListValue();

      void setListValue(List var1);

      List listValue();

      List xlistValue();

      void set(List var1);


      public static final class Factory {

         public static FullDerivationSet.Member2 newValue(Object obj) {
            return (FullDerivationSet.Member2)FullDerivationSet.Member2.type.newValue(obj);
         }

         public static FullDerivationSet.Member2 newInstance() {
            return (FullDerivationSet.Member2)XmlBeans.getContextTypeLoader().newInstance(FullDerivationSet.Member2.type, (XmlOptions)null);
         }

         public static FullDerivationSet.Member2 newInstance(XmlOptions options) {
            return (FullDerivationSet.Member2)XmlBeans.getContextTypeLoader().newInstance(FullDerivationSet.Member2.type, options);
         }

      }
   }

   static class NamelessClass1646863644 {
   }
}
