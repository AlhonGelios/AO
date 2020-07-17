package org.openxmlformats.schemas.xpackage.x2006.relationships;

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
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationships;
import org.w3c.dom.Node;

public interface RelationshipsDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(RelationshipsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("relationships93b3doctype");


   CTRelationships getRelationships();

   void setRelationships(CTRelationships var1);

   CTRelationships addNewRelationships();


   public static final class Factory {

      public static RelationshipsDocument newInstance() {
         return (RelationshipsDocument)POIXMLTypeLoader.newInstance(RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument newInstance(XmlOptions var0) {
         return (RelationshipsDocument)POIXMLTypeLoader.newInstance(RelationshipsDocument.type, var0);
      }

      public static RelationshipsDocument parse(String var0) throws XmlException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static RelationshipsDocument parse(File var0) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static RelationshipsDocument parse(URL var0) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static RelationshipsDocument parse(InputStream var0) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static RelationshipsDocument parse(Reader var0) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static RelationshipsDocument parse(XMLStreamReader var0) throws XmlException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static RelationshipsDocument parse(Node var0) throws XmlException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static RelationshipsDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static RelationshipsDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (RelationshipsDocument)POIXMLTypeLoader.parse(var0, RelationshipsDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, RelationshipsDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, RelationshipsDocument.type, var1);
      }

   }
}
