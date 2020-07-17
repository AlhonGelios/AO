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

public interface DerivationSet extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DerivationSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("derivationset037atype");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   public interface Member2 extends XmlAnySimpleType {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DerivationSet.Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anon9394type");


      List getListValue();

      List xgetListValue();

      void setListValue(List var1);

      List listValue();

      List xlistValue();

      void set(List var1);


      public static final class Factory {

         public static DerivationSet.Member2 newValue(Object obj) {
            return (DerivationSet.Member2)DerivationSet.Member2.type.newValue(obj);
         }

         public static DerivationSet.Member2 newInstance() {
            return (DerivationSet.Member2)XmlBeans.getContextTypeLoader().newInstance(DerivationSet.Member2.type, (XmlOptions)null);
         }

         public static DerivationSet.Member2 newInstance(XmlOptions options) {
            return (DerivationSet.Member2)XmlBeans.getContextTypeLoader().newInstance(DerivationSet.Member2.type, options);
         }

      }
   }

   public static final class Factory {

      public static DerivationSet newValue(Object obj) {
         return (DerivationSet)DerivationSet.type.newValue(obj);
      }

      public static DerivationSet newInstance() {
         return (DerivationSet)XmlBeans.getContextTypeLoader().newInstance(DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet newInstance(XmlOptions options) {
         return (DerivationSet)XmlBeans.getContextTypeLoader().newInstance(DerivationSet.type, options);
      }

      public static DerivationSet parse(String xmlAsString) throws XmlException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, DerivationSet.type, options);
      }

      public static DerivationSet parse(File file) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(file, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(File file, XmlOptions options) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(file, DerivationSet.type, options);
      }

      public static DerivationSet parse(URL u) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(u, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(u, DerivationSet.type, options);
      }

      public static DerivationSet parse(InputStream is) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(is, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(is, DerivationSet.type, options);
      }

      public static DerivationSet parse(Reader r) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(r, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(r, DerivationSet.type, options);
      }

      public static DerivationSet parse(XMLStreamReader sr) throws XmlException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(sr, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(sr, DerivationSet.type, options);
      }

      public static DerivationSet parse(Node node) throws XmlException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(node, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(Node node, XmlOptions options) throws XmlException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(node, DerivationSet.type, options);
      }

      public static DerivationSet parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(xis, DerivationSet.type, (XmlOptions)null);
      }

      public static DerivationSet parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (DerivationSet)XmlBeans.getContextTypeLoader().parse(xis, DerivationSet.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, DerivationSet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, DerivationSet.type, options);
      }

   }

   static class NamelessClass1007070083 {
   }

   public interface Member extends XmlToken {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DerivationSet.Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anoned75type");
      DerivationSet.Member.Enum ALL = DerivationSet.Member.Enum.forString("#all");
      int INT_ALL = 1;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Factory {

         public static DerivationSet.Member newValue(Object obj) {
            return (DerivationSet.Member)DerivationSet.Member.type.newValue(obj);
         }

         public static DerivationSet.Member newInstance() {
            return (DerivationSet.Member)XmlBeans.getContextTypeLoader().newInstance(DerivationSet.Member.type, (XmlOptions)null);
         }

         public static DerivationSet.Member newInstance(XmlOptions options) {
            return (DerivationSet.Member)XmlBeans.getContextTypeLoader().newInstance(DerivationSet.Member.type, options);
         }

      }

      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_ALL = 1;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new DerivationSet.Member.Enum[]{new DerivationSet.Member.Enum("#all", 1)});
         private static final long serialVersionUID = 1L;


         public static DerivationSet.Member.Enum forString(String s) {
            return (DerivationSet.Member.Enum)table.forString(s);
         }

         public static DerivationSet.Member.Enum forInt(int i) {
            return (DerivationSet.Member.Enum)table.forInt(i);
         }

         private Enum(String s, int i) {
            super(s, i);
         }

         private Object readResolve() {
            return forInt(this.intValue());
         }

      }
   }
}
