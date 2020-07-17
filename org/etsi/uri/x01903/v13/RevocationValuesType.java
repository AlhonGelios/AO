package org.etsi.uri.x01903.v13;

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
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.CRLValuesType;
import org.etsi.uri.x01903.v13.OCSPValuesType;
import org.etsi.uri.x01903.v13.OtherCertStatusValuesType;
import org.w3c.dom.Node;

public interface RevocationValuesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(RevocationValuesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("revocationvaluestype9a6etype");


   CRLValuesType getCRLValues();

   boolean isSetCRLValues();

   void setCRLValues(CRLValuesType var1);

   CRLValuesType addNewCRLValues();

   void unsetCRLValues();

   OCSPValuesType getOCSPValues();

   boolean isSetOCSPValues();

   void setOCSPValues(OCSPValuesType var1);

   OCSPValuesType addNewOCSPValues();

   void unsetOCSPValues();

   OtherCertStatusValuesType getOtherValues();

   boolean isSetOtherValues();

   void setOtherValues(OtherCertStatusValuesType var1);

   OtherCertStatusValuesType addNewOtherValues();

   void unsetOtherValues();

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static RevocationValuesType newInstance() {
         return (RevocationValuesType)POIXMLTypeLoader.newInstance(RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType newInstance(XmlOptions var0) {
         return (RevocationValuesType)POIXMLTypeLoader.newInstance(RevocationValuesType.type, var0);
      }

      public static RevocationValuesType parse(String var0) throws XmlException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(String var0, XmlOptions var1) throws XmlException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static RevocationValuesType parse(File var0) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static RevocationValuesType parse(URL var0) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static RevocationValuesType parse(InputStream var0) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static RevocationValuesType parse(Reader var0) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static RevocationValuesType parse(XMLStreamReader var0) throws XmlException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static RevocationValuesType parse(Node var0) throws XmlException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static RevocationValuesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static RevocationValuesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (RevocationValuesType)POIXMLTypeLoader.parse(var0, RevocationValuesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, RevocationValuesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, RevocationValuesType.type, var1);
      }

   }
}
