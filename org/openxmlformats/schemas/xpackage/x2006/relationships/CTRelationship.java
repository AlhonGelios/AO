package org.openxmlformats.schemas.xpackage.x2006.relationships;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.xpackage.x2006.relationships.STTargetMode;
import org.w3c.dom.Node;

public interface CTRelationship extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRelationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctrelationship8cf8type");


   STTargetMode.Enum getTargetMode();

   STTargetMode xgetTargetMode();

   boolean isSetTargetMode();

   void setTargetMode(STTargetMode.Enum var1);

   void xsetTargetMode(STTargetMode var1);

   void unsetTargetMode();

   String getTarget();

   XmlAnyURI xgetTarget();

   void setTarget(String var1);

   void xsetTarget(XmlAnyURI var1);

   String getType();

   XmlAnyURI xgetType();

   void setType(String var1);

   void xsetType(XmlAnyURI var1);

   String getId();

   XmlID xgetId();

   void setId(String var1);

   void xsetId(XmlID var1);


   public static final class Factory {

      public static CTRelationship newInstance() {
         return (CTRelationship)POIXMLTypeLoader.newInstance(CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship newInstance(XmlOptions var0) {
         return (CTRelationship)POIXMLTypeLoader.newInstance(CTRelationship.type, var0);
      }

      public static CTRelationship parse(String var0) throws XmlException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static CTRelationship parse(File var0) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static CTRelationship parse(URL var0) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static CTRelationship parse(InputStream var0) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static CTRelationship parse(Reader var0) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static CTRelationship parse(XMLStreamReader var0) throws XmlException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static CTRelationship parse(Node var0) throws XmlException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static CTRelationship parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static CTRelationship parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRelationship)POIXMLTypeLoader.parse(var0, CTRelationship.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelationship.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelationship.type, var1);
      }

   }
}
