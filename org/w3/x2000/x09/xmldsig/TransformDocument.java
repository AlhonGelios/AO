package org.w3.x2000.x09.xmldsig;

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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3.x2000.x09.xmldsig.TransformType;
import org.w3c.dom.Node;

public interface TransformDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(TransformDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("transforme335doctype");


   TransformType getTransform();

   void setTransform(TransformType var1);

   TransformType addNewTransform();


   public static final class Factory {

      public static TransformDocument newInstance() {
         return (TransformDocument)POIXMLTypeLoader.newInstance(TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument newInstance(XmlOptions var0) {
         return (TransformDocument)POIXMLTypeLoader.newInstance(TransformDocument.type, var0);
      }

      public static TransformDocument parse(String var0) throws XmlException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static TransformDocument parse(File var0) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static TransformDocument parse(URL var0) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static TransformDocument parse(InputStream var0) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static TransformDocument parse(Reader var0) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static TransformDocument parse(XMLStreamReader var0) throws XmlException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static TransformDocument parse(Node var0) throws XmlException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static TransformDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static TransformDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (TransformDocument)POIXMLTypeLoader.parse(var0, TransformDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TransformDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TransformDocument.type, var1);
      }

   }
}
