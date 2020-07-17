package org.apache.xmlbeans.impl.xb.xmlconfig;

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

public interface JavaNameList extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(JavaNameList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("javanamelistbcfetype");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   static class NamelessClass1151286118 {
   }

   public static final class Factory {

      public static JavaNameList newValue(Object obj) {
         return (JavaNameList)JavaNameList.type.newValue(obj);
      }

      public static JavaNameList newInstance() {
         return (JavaNameList)XmlBeans.getContextTypeLoader().newInstance(JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList newInstance(XmlOptions options) {
         return (JavaNameList)XmlBeans.getContextTypeLoader().newInstance(JavaNameList.type, options);
      }

      public static JavaNameList parse(String xmlAsString) throws XmlException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(xmlAsString, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(xmlAsString, JavaNameList.type, options);
      }

      public static JavaNameList parse(File file) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(file, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(File file, XmlOptions options) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(file, JavaNameList.type, options);
      }

      public static JavaNameList parse(URL u) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(u, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(u, JavaNameList.type, options);
      }

      public static JavaNameList parse(InputStream is) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(is, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(is, JavaNameList.type, options);
      }

      public static JavaNameList parse(Reader r) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(r, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(r, JavaNameList.type, options);
      }

      public static JavaNameList parse(XMLStreamReader sr) throws XmlException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(sr, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(sr, JavaNameList.type, options);
      }

      public static JavaNameList parse(Node node) throws XmlException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(node, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(Node node, XmlOptions options) throws XmlException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(node, JavaNameList.type, options);
      }

      public static JavaNameList parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(xis, JavaNameList.type, (XmlOptions)null);
      }

      public static JavaNameList parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (JavaNameList)XmlBeans.getContextTypeLoader().parse(xis, JavaNameList.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, JavaNameList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, JavaNameList.type, options);
      }

   }

   public interface Member2 extends XmlAnySimpleType {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(JavaNameList.Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("anon3a98type");


      List getListValue();

      List xgetListValue();

      void setListValue(List var1);

      List listValue();

      List xlistValue();

      void set(List var1);


      public static final class Factory {

         public static JavaNameList.Member2 newValue(Object obj) {
            return (JavaNameList.Member2)JavaNameList.Member2.type.newValue(obj);
         }

         public static JavaNameList.Member2 newInstance() {
            return (JavaNameList.Member2)XmlBeans.getContextTypeLoader().newInstance(JavaNameList.Member2.type, (XmlOptions)null);
         }

         public static JavaNameList.Member2 newInstance(XmlOptions options) {
            return (JavaNameList.Member2)XmlBeans.getContextTypeLoader().newInstance(JavaNameList.Member2.type, options);
         }

      }
   }

   public interface Member extends XmlToken {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(JavaNameList.Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("anon3e39type");
      JavaNameList.Member.Enum X = JavaNameList.Member.Enum.forString("*");
      int INT_X = 1;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_X = 1;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new JavaNameList.Member.Enum[]{new JavaNameList.Member.Enum("*", 1)});
         private static final long serialVersionUID = 1L;


         public static JavaNameList.Member.Enum forString(String s) {
            return (JavaNameList.Member.Enum)table.forString(s);
         }

         public static JavaNameList.Member.Enum forInt(int i) {
            return (JavaNameList.Member.Enum)table.forInt(i);
         }

         private Enum(String s, int i) {
            super(s, i);
         }

         private Object readResolve() {
            return forInt(this.intValue());
         }

      }

      public static final class Factory {

         public static JavaNameList.Member newValue(Object obj) {
            return (JavaNameList.Member)JavaNameList.Member.type.newValue(obj);
         }

         public static JavaNameList.Member newInstance() {
            return (JavaNameList.Member)XmlBeans.getContextTypeLoader().newInstance(JavaNameList.Member.type, (XmlOptions)null);
         }

         public static JavaNameList.Member newInstance(XmlOptions options) {
            return (JavaNameList.Member)XmlBeans.getContextTypeLoader().newInstance(JavaNameList.Member.type, options);
         }

      }
   }
}
