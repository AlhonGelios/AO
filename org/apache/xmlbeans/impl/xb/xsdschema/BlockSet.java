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

public interface BlockSet extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(BlockSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("blockset815etype");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   public interface Member2 extends XmlAnySimpleType {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(BlockSet.Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anonc904type");


      List getListValue();

      List xgetListValue();

      void setListValue(List var1);

      List listValue();

      List xlistValue();

      void set(List var1);


      public static final class Factory {

         public static BlockSet.Member2 newValue(Object obj) {
            return (BlockSet.Member2)BlockSet.Member2.type.newValue(obj);
         }

         public static BlockSet.Member2 newInstance() {
            return (BlockSet.Member2)XmlBeans.getContextTypeLoader().newInstance(BlockSet.Member2.type, (XmlOptions)null);
         }

         public static BlockSet.Member2 newInstance(XmlOptions options) {
            return (BlockSet.Member2)XmlBeans.getContextTypeLoader().newInstance(BlockSet.Member2.type, options);
         }

      }

      public interface Item extends DerivationControl {

         SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(BlockSet.Member2.Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anon421ctype");
         DerivationControl.Enum EXTENSION = DerivationControl.EXTENSION;
         DerivationControl.Enum RESTRICTION = DerivationControl.RESTRICTION;
         DerivationControl.Enum SUBSTITUTION = DerivationControl.SUBSTITUTION;
         int INT_EXTENSION = 2;
         int INT_RESTRICTION = 3;
         int INT_SUBSTITUTION = 1;



         public static final class Factory {

            public static BlockSet.Member2.Item newValue(Object obj) {
               return (BlockSet.Member2.Item)BlockSet.Member2.Item.type.newValue(obj);
            }

            public static BlockSet.Member2.Item newInstance() {
               return (BlockSet.Member2.Item)XmlBeans.getContextTypeLoader().newInstance(BlockSet.Member2.Item.type, (XmlOptions)null);
            }

            public static BlockSet.Member2.Item newInstance(XmlOptions options) {
               return (BlockSet.Member2.Item)XmlBeans.getContextTypeLoader().newInstance(BlockSet.Member2.Item.type, options);
            }

         }
      }
   }

   static class NamelessClass455136214 {
   }

   public interface Member extends XmlToken {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(BlockSet.Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("anon0683type");
      BlockSet.Member.Enum ALL = BlockSet.Member.Enum.forString("#all");
      int INT_ALL = 1;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Factory {

         public static BlockSet.Member newValue(Object obj) {
            return (BlockSet.Member)BlockSet.Member.type.newValue(obj);
         }

         public static BlockSet.Member newInstance() {
            return (BlockSet.Member)XmlBeans.getContextTypeLoader().newInstance(BlockSet.Member.type, (XmlOptions)null);
         }

         public static BlockSet.Member newInstance(XmlOptions options) {
            return (BlockSet.Member)XmlBeans.getContextTypeLoader().newInstance(BlockSet.Member.type, options);
         }

      }

      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_ALL = 1;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new BlockSet.Member.Enum[]{new BlockSet.Member.Enum("#all", 1)});
         private static final long serialVersionUID = 1L;


         public static BlockSet.Member.Enum forString(String s) {
            return (BlockSet.Member.Enum)table.forString(s);
         }

         public static BlockSet.Member.Enum forInt(int i) {
            return (BlockSet.Member.Enum)table.forInt(i);
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

      public static BlockSet newValue(Object obj) {
         return (BlockSet)BlockSet.type.newValue(obj);
      }

      public static BlockSet newInstance() {
         return (BlockSet)XmlBeans.getContextTypeLoader().newInstance(BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet newInstance(XmlOptions options) {
         return (BlockSet)XmlBeans.getContextTypeLoader().newInstance(BlockSet.type, options);
      }

      public static BlockSet parse(String xmlAsString) throws XmlException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(xmlAsString, BlockSet.type, options);
      }

      public static BlockSet parse(File file) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(file, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(File file, XmlOptions options) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(file, BlockSet.type, options);
      }

      public static BlockSet parse(URL u) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(u, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(u, BlockSet.type, options);
      }

      public static BlockSet parse(InputStream is) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(is, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(is, BlockSet.type, options);
      }

      public static BlockSet parse(Reader r) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(r, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(r, BlockSet.type, options);
      }

      public static BlockSet parse(XMLStreamReader sr) throws XmlException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(sr, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(sr, BlockSet.type, options);
      }

      public static BlockSet parse(Node node) throws XmlException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(node, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(Node node, XmlOptions options) throws XmlException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(node, BlockSet.type, options);
      }

      public static BlockSet parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(xis, BlockSet.type, (XmlOptions)null);
      }

      public static BlockSet parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (BlockSet)XmlBeans.getContextTypeLoader().parse(xis, BlockSet.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, BlockSet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, BlockSet.type, options);
      }

   }
}
