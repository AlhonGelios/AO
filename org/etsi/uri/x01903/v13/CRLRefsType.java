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
import org.etsi.uri.x01903.v13.CRLRefType;
import org.w3c.dom.Node;

public interface CRLRefsType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CRLRefsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("crlrefstype2a59type");


   List getCRLRefList();

   CRLRefType[] getCRLRefArray();

   CRLRefType getCRLRefArray(int var1);

   int sizeOfCRLRefArray();

   void setCRLRefArray(CRLRefType[] var1);

   void setCRLRefArray(int var1, CRLRefType var2);

   CRLRefType insertNewCRLRef(int var1);

   CRLRefType addNewCRLRef();

   void removeCRLRef(int var1);


   public static final class Factory {

      public static CRLRefsType newInstance() {
         return (CRLRefsType)POIXMLTypeLoader.newInstance(CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType newInstance(XmlOptions var0) {
         return (CRLRefsType)POIXMLTypeLoader.newInstance(CRLRefsType.type, var0);
      }

      public static CRLRefsType parse(String var0) throws XmlException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(String var0, XmlOptions var1) throws XmlException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static CRLRefsType parse(File var0) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static CRLRefsType parse(URL var0) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static CRLRefsType parse(InputStream var0) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static CRLRefsType parse(Reader var0) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static CRLRefsType parse(XMLStreamReader var0) throws XmlException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static CRLRefsType parse(Node var0) throws XmlException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static CRLRefsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static CRLRefsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CRLRefsType)POIXMLTypeLoader.parse(var0, CRLRefsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLRefsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLRefsType.type, var1);
      }

   }
}
