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

public interface NamespaceList extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NamespaceList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("namespacelist20datype");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   public interface Member extends XmlToken {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NamespaceList.Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("anonc6fftype");
      NamespaceList.Member.Enum ANY = NamespaceList.Member.Enum.forString("##any");
      int INT_ANY = 1;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_ANY = 1;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new NamespaceList.Member.Enum[]{new NamespaceList.Member.Enum("##any", 1)});
         private static final long serialVersionUID = 1L;


         public static NamespaceList.Member.Enum forString(String s) {
            return (NamespaceList.Member.Enum)table.forString(s);
         }

         public static NamespaceList.Member.Enum forInt(int i) {
            return (NamespaceList.Member.Enum)table.forInt(i);
         }

         private Enum(String s, int i) {
            super(s, i);
         }

         private Object readResolve() {
            return forInt(this.intValue());
         }

      }

      public static final class Factory {

         public static NamespaceList.Member newValue(Object obj) {
            return (NamespaceList.Member)NamespaceList.Member.type.newValue(obj);
         }

         public static NamespaceList.Member newInstance() {
            return (NamespaceList.Member)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member.type, (XmlOptions)null);
         }

         public static NamespaceList.Member newInstance(XmlOptions options) {
            return (NamespaceList.Member)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member.type, options);
         }

      }
   }

   public interface Member2 extends XmlAnySimpleType {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NamespaceList.Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("anon5680type");


      List getListValue();

      List xgetListValue();

      void setListValue(List var1);

      List listValue();

      List xlistValue();

      void set(List var1);


      public interface Item extends XmlAnySimpleType {

         SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NamespaceList.Member2.Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("anon0798type");


         Object getObjectValue();

         void setObjectValue(Object var1);

         Object objectValue();

         void objectSet(Object var1);

         SchemaType instanceType();


         public interface Member extends XmlToken {

            SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NamespaceList.Member2.Item.Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLCONFIG").resolveHandle("anon1dd3type");
            NamespaceList.Member2.Item.Member.Enum LOCAL = NamespaceList.Member2.Item.Member.Enum.forString("##local");
            int INT_LOCAL = 1;


            StringEnumAbstractBase enumValue();

            void set(StringEnumAbstractBase var1);


            public static final class Enum extends StringEnumAbstractBase {

               static final int INT_LOCAL = 1;
               public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new NamespaceList.Member2.Item.Member.Enum[]{new NamespaceList.Member2.Item.Member.Enum("##local", 1)});
               private static final long serialVersionUID = 1L;


               public static NamespaceList.Member2.Item.Member.Enum forString(String s) {
                  return (NamespaceList.Member2.Item.Member.Enum)table.forString(s);
               }

               public static NamespaceList.Member2.Item.Member.Enum forInt(int i) {
                  return (NamespaceList.Member2.Item.Member.Enum)table.forInt(i);
               }

               private Enum(String s, int i) {
                  super(s, i);
               }

               private Object readResolve() {
                  return forInt(this.intValue());
               }

            }

            public static final class Factory {

               public static NamespaceList.Member2.Item.Member newValue(Object obj) {
                  return (NamespaceList.Member2.Item.Member)NamespaceList.Member2.Item.Member.type.newValue(obj);
               }

               public static NamespaceList.Member2.Item.Member newInstance() {
                  return (NamespaceList.Member2.Item.Member)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member2.Item.Member.type, (XmlOptions)null);
               }

               public static NamespaceList.Member2.Item.Member newInstance(XmlOptions options) {
                  return (NamespaceList.Member2.Item.Member)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member2.Item.Member.type, options);
               }

            }
         }

         public static final class Factory {

            public static NamespaceList.Member2.Item newValue(Object obj) {
               return (NamespaceList.Member2.Item)NamespaceList.Member2.Item.type.newValue(obj);
            }

            public static NamespaceList.Member2.Item newInstance() {
               return (NamespaceList.Member2.Item)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member2.Item.type, (XmlOptions)null);
            }

            public static NamespaceList.Member2.Item newInstance(XmlOptions options) {
               return (NamespaceList.Member2.Item)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member2.Item.type, options);
            }

         }
      }

      public static final class Factory {

         public static NamespaceList.Member2 newValue(Object obj) {
            return (NamespaceList.Member2)NamespaceList.Member2.type.newValue(obj);
         }

         public static NamespaceList.Member2 newInstance() {
            return (NamespaceList.Member2)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member2.type, (XmlOptions)null);
         }

         public static NamespaceList.Member2 newInstance(XmlOptions options) {
            return (NamespaceList.Member2)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.Member2.type, options);
         }

      }
   }

   static class NamelessClass1208660253 {
   }

   public static final class Factory {

      public static NamespaceList newValue(Object obj) {
         return (NamespaceList)NamespaceList.type.newValue(obj);
      }

      public static NamespaceList newInstance() {
         return (NamespaceList)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList newInstance(XmlOptions options) {
         return (NamespaceList)XmlBeans.getContextTypeLoader().newInstance(NamespaceList.type, options);
      }

      public static NamespaceList parse(String xmlAsString) throws XmlException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(xmlAsString, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(xmlAsString, NamespaceList.type, options);
      }

      public static NamespaceList parse(File file) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(file, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(File file, XmlOptions options) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(file, NamespaceList.type, options);
      }

      public static NamespaceList parse(URL u) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(u, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(u, NamespaceList.type, options);
      }

      public static NamespaceList parse(InputStream is) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(is, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(is, NamespaceList.type, options);
      }

      public static NamespaceList parse(Reader r) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(r, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(r, NamespaceList.type, options);
      }

      public static NamespaceList parse(XMLStreamReader sr) throws XmlException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(sr, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(sr, NamespaceList.type, options);
      }

      public static NamespaceList parse(Node node) throws XmlException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(node, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(Node node, XmlOptions options) throws XmlException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(node, NamespaceList.type, options);
      }

      public static NamespaceList parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(xis, NamespaceList.type, (XmlOptions)null);
      }

      public static NamespaceList parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (NamespaceList)XmlBeans.getContextTypeLoader().parse(xis, NamespaceList.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, NamespaceList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, NamespaceList.type, options);
      }

   }
}
