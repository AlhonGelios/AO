package org.etsi.uri.x01903.v13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.ResponderIDType;
import org.w3c.dom.Node;

public interface OCSPIdentifierType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(OCSPIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ocspidentifiertype3968type");


   ResponderIDType getResponderID();

   void setResponderID(ResponderIDType var1);

   ResponderIDType addNewResponderID();

   Calendar getProducedAt();

   XmlDateTime xgetProducedAt();

   void setProducedAt(Calendar var1);

   void xsetProducedAt(XmlDateTime var1);

   String getURI();

   XmlAnyURI xgetURI();

   boolean isSetURI();

   void setURI(String var1);

   void xsetURI(XmlAnyURI var1);

   void unsetURI();


   public static final class Factory {

      public static OCSPIdentifierType newInstance() {
         return (OCSPIdentifierType)POIXMLTypeLoader.newInstance(OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType newInstance(XmlOptions var0) {
         return (OCSPIdentifierType)POIXMLTypeLoader.newInstance(OCSPIdentifierType.type, var0);
      }

      public static OCSPIdentifierType parse(String var0) throws XmlException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(String var0, XmlOptions var1) throws XmlException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static OCSPIdentifierType parse(File var0) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static OCSPIdentifierType parse(URL var0) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static OCSPIdentifierType parse(InputStream var0) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static OCSPIdentifierType parse(Reader var0) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static OCSPIdentifierType parse(XMLStreamReader var0) throws XmlException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static OCSPIdentifierType parse(Node var0) throws XmlException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(Node var0, XmlOptions var1) throws XmlException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static OCSPIdentifierType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static OCSPIdentifierType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (OCSPIdentifierType)POIXMLTypeLoader.parse(var0, OCSPIdentifierType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPIdentifierType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPIdentifierType.type, var1);
      }

   }
}
