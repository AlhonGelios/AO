package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTSchema extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSchema.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctschema0e6atype");


   String getID();

   XmlString xgetID();

   void setID(String var1);

   void xsetID(XmlString var1);

   String getSchemaRef();

   XmlString xgetSchemaRef();

   boolean isSetSchemaRef();

   void setSchemaRef(String var1);

   void xsetSchemaRef(XmlString var1);

   void unsetSchemaRef();

   String getNamespace();

   XmlString xgetNamespace();

   boolean isSetNamespace();

   void setNamespace(String var1);

   void xsetNamespace(XmlString var1);

   void unsetNamespace();


   public static final class Factory {

      public static CTSchema newInstance() {
         return (CTSchema)POIXMLTypeLoader.newInstance(CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema newInstance(XmlOptions var0) {
         return (CTSchema)POIXMLTypeLoader.newInstance(CTSchema.type, var0);
      }

      public static CTSchema parse(String var0) throws XmlException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static CTSchema parse(File var0) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static CTSchema parse(URL var0) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static CTSchema parse(InputStream var0) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static CTSchema parse(Reader var0) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static CTSchema parse(XMLStreamReader var0) throws XmlException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static CTSchema parse(Node var0) throws XmlException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static CTSchema parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, (XmlOptions)null);
      }

      public static CTSchema parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSchema)POIXMLTypeLoader.parse(var0, CTSchema.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSchema.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSchema.type, var1);
      }

   }
}
