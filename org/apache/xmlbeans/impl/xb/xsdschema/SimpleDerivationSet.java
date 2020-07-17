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
import org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface SimpleDerivationSet extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SimpleDerivationSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("simplederivationsetf70ctype");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   public static final class Factory {

      public static SimpleDerivationSet newValue(Object obj) {
         return (SimpleDerivationSet)SimpleDerivationSet.type.newValue(obj);
      }

      public static SimpleDerivationSet newInstance() {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet newInstance(XmlOptions options) {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(String xmlAsString) throws XmlException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(File file) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(file, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(File file, XmlOptions options) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(file, SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(URL u) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(u, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(u, SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(InputStream is) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(is, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(is, SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(Reader r) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(r, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(r, SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(XMLStreamReader sr) throws XmlException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(sr, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(sr, SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(Node node) throws XmlException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(node, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(Node node, XmlOptions options) throws XmlException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(node, SimpleDerivationSet.type, options);
      }

      public static SimpleDerivationSet parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(xis, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static SimpleDerivationSet parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (SimpleDerivationSet)XmlBeans.getContextTypeLoader().parse(xis, SimpleDerivationSet.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SimpleDerivationSet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SimpleDerivationSet.type, options);
      }

   }

   static class NamelessClass1477888640 {
   }

   public interface Member extends XmlToken {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SimpleDerivationSet.Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anon38c7type");
      SimpleDerivationSet.Member.Enum ALL = SimpleDerivationSet.Member.Enum.forString("#all");
      int INT_ALL = 1;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_ALL = 1;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new SimpleDerivationSet.Member.Enum[]{new SimpleDerivationSet.Member.Enum("#all", 1)});
         private static final long serialVersionUID = 1L;


         public static SimpleDerivationSet.Member.Enum forString(String s) {
            return (SimpleDerivationSet.Member.Enum)table.forString(s);
         }

         public static SimpleDerivationSet.Member.Enum forInt(int i) {
            return (SimpleDerivationSet.Member.Enum)table.forInt(i);
         }

         private Enum(String s, int i) {
            super(s, i);
         }

         private Object readResolve() {
            return forInt(this.intValue());
         }

      }

      public static final class Factory {

         public static SimpleDerivationSet.Member newValue(Object obj) {
            return (SimpleDerivationSet.Member)SimpleDerivationSet.Member.type.newValue(obj);
         }

         public static SimpleDerivationSet.Member newInstance() {
            return (SimpleDerivationSet.Member)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.Member.type, (XmlOptions)null);
         }

         public static SimpleDerivationSet.Member newInstance(XmlOptions options) {
            return (SimpleDerivationSet.Member)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.Member.type, options);
         }

      }
   }

   public interface Member2 extends XmlAnySimpleType {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SimpleDerivationSet.Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anon8ba6type");


      List getListValue();

      List xgetListValue();

      void setListValue(List var1);

      List listValue();

      List xlistValue();

      void set(List var1);


      public interface Item extends DerivationControl {

         SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SimpleDerivationSet.Member2.Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anonf38etype");
         DerivationControl.Enum LIST = DerivationControl.LIST;
         DerivationControl.Enum UNION = DerivationControl.UNION;
         DerivationControl.Enum RESTRICTION = DerivationControl.RESTRICTION;
         int INT_LIST = 4;
         int INT_UNION = 5;
         int INT_RESTRICTION = 3;



         public static final class Factory {

            public static SimpleDerivationSet.Member2.Item newValue(Object obj) {
               return (SimpleDerivationSet.Member2.Item)SimpleDerivationSet.Member2.Item.type.newValue(obj);
            }

            public static SimpleDerivationSet.Member2.Item newInstance() {
               return (SimpleDerivationSet.Member2.Item)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.Member2.Item.type, (XmlOptions)null);
            }

            public static SimpleDerivationSet.Member2.Item newInstance(XmlOptions options) {
               return (SimpleDerivationSet.Member2.Item)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.Member2.Item.type, options);
            }

         }
      }

      public static final class Factory {

         public static SimpleDerivationSet.Member2 newValue(Object obj) {
            return (SimpleDerivationSet.Member2)SimpleDerivationSet.Member2.type.newValue(obj);
         }

         public static SimpleDerivationSet.Member2 newInstance() {
            return (SimpleDerivationSet.Member2)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.Member2.type, (XmlOptions)null);
         }

         public static SimpleDerivationSet.Member2 newInstance(XmlOptions options) {
            return (SimpleDerivationSet.Member2)XmlBeans.getContextTypeLoader().newInstance(SimpleDerivationSet.Member2.type, options);
         }

      }
   }
}
