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
import org.apache.xmlbeans.impl.xb.xsdschema.Annotated;
import org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface Wildcard extends Annotated {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(Wildcard.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("wildcarde0b9type");


   Object getNamespace();

   NamespaceList xgetNamespace();

   boolean isSetNamespace();

   void setNamespace(Object var1);

   void xsetNamespace(NamespaceList var1);

   void unsetNamespace();

   Wildcard.ProcessContents.Enum getProcessContents();

   Wildcard.ProcessContents xgetProcessContents();

   boolean isSetProcessContents();

   void setProcessContents(Wildcard.ProcessContents.Enum var1);

   void xsetProcessContents(Wildcard.ProcessContents var1);

   void unsetProcessContents();


   public interface ProcessContents extends XmlNMTOKEN {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(Wildcard.ProcessContents.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sXMLSCHEMA").resolveHandle("processcontents864aattrtype");
      Wildcard.ProcessContents.Enum SKIP = Wildcard.ProcessContents.Enum.forString("skip");
      Wildcard.ProcessContents.Enum LAX = Wildcard.ProcessContents.Enum.forString("lax");
      Wildcard.ProcessContents.Enum STRICT = Wildcard.ProcessContents.Enum.forString("strict");
      int INT_SKIP = 1;
      int INT_LAX = 2;
      int INT_STRICT = 3;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Factory {

         public static Wildcard.ProcessContents newValue(Object obj) {
            return (Wildcard.ProcessContents)Wildcard.ProcessContents.type.newValue(obj);
         }

         public static Wildcard.ProcessContents newInstance() {
            return (Wildcard.ProcessContents)XmlBeans.getContextTypeLoader().newInstance(Wildcard.ProcessContents.type, (XmlOptions)null);
         }

         public static Wildcard.ProcessContents newInstance(XmlOptions options) {
            return (Wildcard.ProcessContents)XmlBeans.getContextTypeLoader().newInstance(Wildcard.ProcessContents.type, options);
         }

      }

      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_SKIP = 1;
         static final int INT_LAX = 2;
         static final int INT_STRICT = 3;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new Wildcard.ProcessContents.Enum[]{new Wildcard.ProcessContents.Enum("skip", 1), new Wildcard.ProcessContents.Enum("lax", 2), new Wildcard.ProcessContents.Enum("strict", 3)});
         private static final long serialVersionUID = 1L;


         public static Wildcard.ProcessContents.Enum forString(String s) {
            return (Wildcard.ProcessContents.Enum)table.forString(s);
         }

         public static Wildcard.ProcessContents.Enum forInt(int i) {
            return (Wildcard.ProcessContents.Enum)table.forInt(i);
         }

         private Enum(String s, int i) {
            super(s, i);
         }

         private Object readResolve() {
            return forInt(this.intValue());
         }

      }
   }

   static class NamelessClass1756380819 {
   }

   public static final class Factory {

      public static Wildcard newInstance() {
         return (Wildcard)XmlBeans.getContextTypeLoader().newInstance(Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard newInstance(XmlOptions options) {
         return (Wildcard)XmlBeans.getContextTypeLoader().newInstance(Wildcard.type, options);
      }

      public static Wildcard parse(String xmlAsString) throws XmlException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(xmlAsString, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(String xmlAsString, XmlOptions options) throws XmlException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(xmlAsString, Wildcard.type, options);
      }

      public static Wildcard parse(File file) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(file, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(File file, XmlOptions options) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(file, Wildcard.type, options);
      }

      public static Wildcard parse(URL u) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(u, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(u, Wildcard.type, options);
      }

      public static Wildcard parse(InputStream is) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(is, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(is, Wildcard.type, options);
      }

      public static Wildcard parse(Reader r) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(r, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(r, Wildcard.type, options);
      }

      public static Wildcard parse(XMLStreamReader sr) throws XmlException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(sr, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(sr, Wildcard.type, options);
      }

      public static Wildcard parse(Node node) throws XmlException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(node, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(Node node, XmlOptions options) throws XmlException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(node, Wildcard.type, options);
      }

      public static Wildcard parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(xis, Wildcard.type, (XmlOptions)null);
      }

      public static Wildcard parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (Wildcard)XmlBeans.getContextTypeLoader().parse(xis, Wildcard.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, Wildcard.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, Wildcard.type, options);
      }

   }
}
