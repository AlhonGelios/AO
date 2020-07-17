package org.openxmlformats.schemas.xpackage.x2006.digitalSignature;

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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTRelationshipReference extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRelationshipReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctrelationshipreferencee68ftype");


   String getSourceId();

   XmlString xgetSourceId();

   void setSourceId(String var1);

   void xsetSourceId(XmlString var1);


   public static final class Factory {

      public static CTRelationshipReference newInstance() {
         return (CTRelationshipReference)POIXMLTypeLoader.newInstance(CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference newInstance(XmlOptions var0) {
         return (CTRelationshipReference)POIXMLTypeLoader.newInstance(CTRelationshipReference.type, var0);
      }

      public static CTRelationshipReference parse(String var0) throws XmlException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static CTRelationshipReference parse(File var0) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static CTRelationshipReference parse(URL var0) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static CTRelationshipReference parse(InputStream var0) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static CTRelationshipReference parse(Reader var0) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static CTRelationshipReference parse(XMLStreamReader var0) throws XmlException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static CTRelationshipReference parse(Node var0) throws XmlException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static CTRelationshipReference parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static CTRelationshipReference parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRelationshipReference)POIXMLTypeLoader.parse(var0, CTRelationshipReference.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelationshipReference.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelationshipReference.type, var1);
      }

   }
}
