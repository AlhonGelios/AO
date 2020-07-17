package org.w3.x2000.x09.xmldsig;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface TransformType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(TransformType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("transformtype550btype");


   List getXPathList();

   String[] getXPathArray();

   String getXPathArray(int var1);

   List xgetXPathList();

   XmlString[] xgetXPathArray();

   XmlString xgetXPathArray(int var1);

   int sizeOfXPathArray();

   void setXPathArray(String[] var1);

   void setXPathArray(int var1, String var2);

   void xsetXPathArray(XmlString[] var1);

   void xsetXPathArray(int var1, XmlString var2);

   void insertXPath(int var1, String var2);

   void addXPath(String var1);

   XmlString insertNewXPath(int var1);

   XmlString addNewXPath();

   void removeXPath(int var1);

   String getAlgorithm();

   XmlAnyURI xgetAlgorithm();

   void setAlgorithm(String var1);

   void xsetAlgorithm(XmlAnyURI var1);


   public static final class Factory {

      public static TransformType newInstance() {
         return (TransformType)POIXMLTypeLoader.newInstance(TransformType.type, (XmlOptions)null);
      }

      public static TransformType newInstance(XmlOptions var0) {
         return (TransformType)POIXMLTypeLoader.newInstance(TransformType.type, var0);
      }

      public static TransformType parse(String var0) throws XmlException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(String var0, XmlOptions var1) throws XmlException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static TransformType parse(File var0) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static TransformType parse(URL var0) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static TransformType parse(InputStream var0) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static TransformType parse(Reader var0) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static TransformType parse(XMLStreamReader var0) throws XmlException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static TransformType parse(Node var0) throws XmlException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(Node var0, XmlOptions var1) throws XmlException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static TransformType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, (XmlOptions)null);
      }

      public static TransformType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (TransformType)POIXMLTypeLoader.parse(var0, TransformType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TransformType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TransformType.type, var1);
      }

   }
}
