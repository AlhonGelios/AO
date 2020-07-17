package org.w3.x2000.x09.xmldsig;

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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3.x2000.x09.xmldsig.DigestMethodType;
import org.w3.x2000.x09.xmldsig.DigestValueType;
import org.w3.x2000.x09.xmldsig.TransformsType;
import org.w3c.dom.Node;

public interface ReferenceType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ReferenceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("referencetypef44ctype");


   TransformsType getTransforms();

   boolean isSetTransforms();

   void setTransforms(TransformsType var1);

   TransformsType addNewTransforms();

   void unsetTransforms();

   DigestMethodType getDigestMethod();

   void setDigestMethod(DigestMethodType var1);

   DigestMethodType addNewDigestMethod();

   byte[] getDigestValue();

   DigestValueType xgetDigestValue();

   void setDigestValue(byte[] var1);

   void xsetDigestValue(DigestValueType var1);

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();

   String getURI();

   XmlAnyURI xgetURI();

   boolean isSetURI();

   void setURI(String var1);

   void xsetURI(XmlAnyURI var1);

   void unsetURI();

   String getType();

   XmlAnyURI xgetType();

   boolean isSetType();

   void setType(String var1);

   void xsetType(XmlAnyURI var1);

   void unsetType();


   public static final class Factory {

      public static ReferenceType newInstance() {
         return (ReferenceType)POIXMLTypeLoader.newInstance(ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType newInstance(XmlOptions var0) {
         return (ReferenceType)POIXMLTypeLoader.newInstance(ReferenceType.type, var0);
      }

      public static ReferenceType parse(String var0) throws XmlException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(String var0, XmlOptions var1) throws XmlException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static ReferenceType parse(File var0) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static ReferenceType parse(URL var0) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static ReferenceType parse(InputStream var0) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static ReferenceType parse(Reader var0) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static ReferenceType parse(XMLStreamReader var0) throws XmlException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static ReferenceType parse(Node var0) throws XmlException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(Node var0, XmlOptions var1) throws XmlException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static ReferenceType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static ReferenceType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ReferenceType)POIXMLTypeLoader.parse(var0, ReferenceType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ReferenceType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ReferenceType.type, var1);
      }

   }
}
