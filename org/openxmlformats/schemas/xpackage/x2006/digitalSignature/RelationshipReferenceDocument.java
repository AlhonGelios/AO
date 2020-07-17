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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipReference;
import org.w3c.dom.Node;

public interface RelationshipReferenceDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(RelationshipReferenceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("relationshipreference8903doctype");


   CTRelationshipReference getRelationshipReference();

   void setRelationshipReference(CTRelationshipReference var1);

   CTRelationshipReference addNewRelationshipReference();


   public static final class Factory {

      public static RelationshipReferenceDocument newInstance() {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.newInstance(RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument newInstance(XmlOptions var0) {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.newInstance(RelationshipReferenceDocument.type, var0);
      }

      public static RelationshipReferenceDocument parse(String var0) throws XmlException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static RelationshipReferenceDocument parse(File var0) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static RelationshipReferenceDocument parse(URL var0) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static RelationshipReferenceDocument parse(InputStream var0) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static RelationshipReferenceDocument parse(Reader var0) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static RelationshipReferenceDocument parse(XMLStreamReader var0) throws XmlException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static RelationshipReferenceDocument parse(Node var0) throws XmlException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static RelationshipReferenceDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static RelationshipReferenceDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (RelationshipReferenceDocument)POIXMLTypeLoader.parse(var0, RelationshipReferenceDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, RelationshipReferenceDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, RelationshipReferenceDocument.type, var1);
      }

   }
}
