package org.etsi.uri.x01903.v13;

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
import org.etsi.uri.x01903.v13.OCSPRefType;
import org.w3c.dom.Node;

public interface OCSPRefsType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(OCSPRefsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ocsprefstypef13ftype");


   List getOCSPRefList();

   OCSPRefType[] getOCSPRefArray();

   OCSPRefType getOCSPRefArray(int var1);

   int sizeOfOCSPRefArray();

   void setOCSPRefArray(OCSPRefType[] var1);

   void setOCSPRefArray(int var1, OCSPRefType var2);

   OCSPRefType insertNewOCSPRef(int var1);

   OCSPRefType addNewOCSPRef();

   void removeOCSPRef(int var1);


   public static final class Factory {

      public static OCSPRefsType newInstance() {
         return (OCSPRefsType)POIXMLTypeLoader.newInstance(OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType newInstance(XmlOptions var0) {
         return (OCSPRefsType)POIXMLTypeLoader.newInstance(OCSPRefsType.type, var0);
      }

      public static OCSPRefsType parse(String var0) throws XmlException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(String var0, XmlOptions var1) throws XmlException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static OCSPRefsType parse(File var0) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static OCSPRefsType parse(URL var0) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static OCSPRefsType parse(InputStream var0) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static OCSPRefsType parse(Reader var0) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static OCSPRefsType parse(XMLStreamReader var0) throws XmlException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static OCSPRefsType parse(Node var0) throws XmlException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static OCSPRefsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static OCSPRefsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (OCSPRefsType)POIXMLTypeLoader.parse(var0, OCSPRefsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPRefsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPRefsType.type, var1);
      }

   }
}
