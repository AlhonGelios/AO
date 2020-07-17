package org.apache.xmlbeans.impl.xb.xmlschema;

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
import org.apache.xmlbeans.XmlNCName;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface SpaceAttribute extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SpaceAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLLANG").resolveHandle("space9344attrtypetype");


   SpaceAttribute.Space.Enum getSpace();

   SpaceAttribute.Space xgetSpace();

   boolean isSetSpace();

   void setSpace(SpaceAttribute.Space.Enum var1);

   void xsetSpace(SpaceAttribute.Space var1);

   void unsetSpace();


   public static final class Factory {

      public static SpaceAttribute newInstance() {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().newInstance(SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute newInstance(XmlOptions options) {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().newInstance(SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(String xmlAsString) throws XmlException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(xmlAsString, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(xmlAsString, SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(File file) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(file, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(File file, XmlOptions options) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(file, SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(URL u) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(u, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(u, SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(InputStream is) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(is, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(is, SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(Reader r) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(r, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(r, SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(XMLStreamReader sr) throws XmlException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(sr, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(sr, SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(Node node) throws XmlException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(node, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(Node node, XmlOptions options) throws XmlException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(node, SpaceAttribute.type, options);
      }

      public static SpaceAttribute parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(xis, SpaceAttribute.type, (XmlOptions)null);
      }

      public static SpaceAttribute parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (SpaceAttribute)XmlBeans.getContextTypeLoader().parse(xis, SpaceAttribute.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SpaceAttribute.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, SpaceAttribute.type, options);
      }

   }

   public interface Space extends XmlNCName {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SpaceAttribute.Space.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLLANG").resolveHandle("spaceb986attrtype");
      SpaceAttribute.Space.Enum DEFAULT = SpaceAttribute.Space.Enum.forString("default");
      SpaceAttribute.Space.Enum PRESERVE = SpaceAttribute.Space.Enum.forString("preserve");
      int INT_DEFAULT = 1;
      int INT_PRESERVE = 2;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_DEFAULT = 1;
         static final int INT_PRESERVE = 2;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new SpaceAttribute.Space.Enum[]{new SpaceAttribute.Space.Enum("default", 1), new SpaceAttribute.Space.Enum("preserve", 2)});
         private static final long serialVersionUID = 1L;


         public static SpaceAttribute.Space.Enum forString(String s) {
            return (SpaceAttribute.Space.Enum)table.forString(s);
         }

         public static SpaceAttribute.Space.Enum forInt(int i) {
            return (SpaceAttribute.Space.Enum)table.forInt(i);
         }

         private Enum(String s, int i) {
            super(s, i);
         }

         private Object readResolve() {
            return forInt(this.intValue());
         }

      }

      public static final class Factory {

         public static SpaceAttribute.Space newValue(Object obj) {
            return (SpaceAttribute.Space)SpaceAttribute.Space.type.newValue(obj);
         }

         public static SpaceAttribute.Space newInstance() {
            return (SpaceAttribute.Space)XmlBeans.getContextTypeLoader().newInstance(SpaceAttribute.Space.type, (XmlOptions)null);
         }

         public static SpaceAttribute.Space newInstance(XmlOptions options) {
            return (SpaceAttribute.Space)XmlBeans.getContextTypeLoader().newInstance(SpaceAttribute.Space.type, options);
         }

      }
   }

   static class NamelessClass1081932634 {
   }
}
