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
import org.etsi.uri.x01903.v13.CRLRefsType;
import org.etsi.uri.x01903.v13.OCSPRefsType;
import org.etsi.uri.x01903.v13.OtherCertStatusRefsType;
import org.w3c.dom.Node;

public interface CompleteRevocationRefsType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CompleteRevocationRefsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("completerevocationrefstyped8a5type");


   CRLRefsType getCRLRefs();

   boolean isSetCRLRefs();

   void setCRLRefs(CRLRefsType var1);

   CRLRefsType addNewCRLRefs();

   void unsetCRLRefs();

   OCSPRefsType getOCSPRefs();

   boolean isSetOCSPRefs();

   void setOCSPRefs(OCSPRefsType var1);

   OCSPRefsType addNewOCSPRefs();

   void unsetOCSPRefs();

   OtherCertStatusRefsType getOtherRefs();

   boolean isSetOtherRefs();

   void setOtherRefs(OtherCertStatusRefsType var1);

   OtherCertStatusRefsType addNewOtherRefs();

   void unsetOtherRefs();

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static CompleteRevocationRefsType newInstance() {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.newInstance(CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType newInstance(XmlOptions var0) {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.newInstance(CompleteRevocationRefsType.type, var0);
      }

      public static CompleteRevocationRefsType parse(String var0) throws XmlException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(String var0, XmlOptions var1) throws XmlException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static CompleteRevocationRefsType parse(File var0) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static CompleteRevocationRefsType parse(URL var0) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static CompleteRevocationRefsType parse(InputStream var0) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static CompleteRevocationRefsType parse(Reader var0) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static CompleteRevocationRefsType parse(XMLStreamReader var0) throws XmlException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static CompleteRevocationRefsType parse(Node var0) throws XmlException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static CompleteRevocationRefsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static CompleteRevocationRefsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CompleteRevocationRefsType)POIXMLTypeLoader.parse(var0, CompleteRevocationRefsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CompleteRevocationRefsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CompleteRevocationRefsType.type, var1);
      }

   }
}
