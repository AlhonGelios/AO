package org.etsi.uri.x01903.v13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CRLIdentifierType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CRLIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("crlidentifiertypeb702type");


   String getIssuer();

   XmlString xgetIssuer();

   void setIssuer(String var1);

   void xsetIssuer(XmlString var1);

   Calendar getIssueTime();

   XmlDateTime xgetIssueTime();

   void setIssueTime(Calendar var1);

   void xsetIssueTime(XmlDateTime var1);

   BigInteger getNumber();

   XmlInteger xgetNumber();

   boolean isSetNumber();

   void setNumber(BigInteger var1);

   void xsetNumber(XmlInteger var1);

   void unsetNumber();

   String getURI();

   XmlAnyURI xgetURI();

   boolean isSetURI();

   void setURI(String var1);

   void xsetURI(XmlAnyURI var1);

   void unsetURI();


   public static final class Factory {

      public static CRLIdentifierType newInstance() {
         return (CRLIdentifierType)POIXMLTypeLoader.newInstance(CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType newInstance(XmlOptions var0) {
         return (CRLIdentifierType)POIXMLTypeLoader.newInstance(CRLIdentifierType.type, var0);
      }

      public static CRLIdentifierType parse(String var0) throws XmlException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(String var0, XmlOptions var1) throws XmlException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static CRLIdentifierType parse(File var0) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static CRLIdentifierType parse(URL var0) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static CRLIdentifierType parse(InputStream var0) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static CRLIdentifierType parse(Reader var0) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static CRLIdentifierType parse(XMLStreamReader var0) throws XmlException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static CRLIdentifierType parse(Node var0) throws XmlException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static CRLIdentifierType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static CRLIdentifierType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CRLIdentifierType)POIXMLTypeLoader.parse(var0, CRLIdentifierType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLIdentifierType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLIdentifierType.type, var1);
      }

   }
}
