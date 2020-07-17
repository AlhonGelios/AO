package org.openxmlformats.schemas.xpackage.x2006.relationships;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationship;
import org.w3c.dom.Node;

public interface CTRelationships extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRelationships.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctrelationshipse33ftype");


   List getRelationshipList();

   CTRelationship[] getRelationshipArray();

   CTRelationship getRelationshipArray(int var1);

   int sizeOfRelationshipArray();

   void setRelationshipArray(CTRelationship[] var1);

   void setRelationshipArray(int var1, CTRelationship var2);

   CTRelationship insertNewRelationship(int var1);

   CTRelationship addNewRelationship();

   void removeRelationship(int var1);


   public static final class Factory {

      public static CTRelationships newInstance() {
         return (CTRelationships)POIXMLTypeLoader.newInstance(CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships newInstance(XmlOptions var0) {
         return (CTRelationships)POIXMLTypeLoader.newInstance(CTRelationships.type, var0);
      }

      public static CTRelationships parse(String var0) throws XmlException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static CTRelationships parse(File var0) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static CTRelationships parse(URL var0) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static CTRelationships parse(InputStream var0) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static CTRelationships parse(Reader var0) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static CTRelationships parse(XMLStreamReader var0) throws XmlException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static CTRelationships parse(Node var0) throws XmlException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static CTRelationships parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static CTRelationships parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRelationships)POIXMLTypeLoader.parse(var0, CTRelationships.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelationships.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelationships.type, var1);
      }

   }
}
