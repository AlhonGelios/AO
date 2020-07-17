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
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.w3c.dom.Node;

public interface CRLValuesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CRLValuesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("crlvaluestype0ebbtype");


   List getEncapsulatedCRLValueList();

   EncapsulatedPKIDataType[] getEncapsulatedCRLValueArray();

   EncapsulatedPKIDataType getEncapsulatedCRLValueArray(int var1);

   int sizeOfEncapsulatedCRLValueArray();

   void setEncapsulatedCRLValueArray(EncapsulatedPKIDataType[] var1);

   void setEncapsulatedCRLValueArray(int var1, EncapsulatedPKIDataType var2);

   EncapsulatedPKIDataType insertNewEncapsulatedCRLValue(int var1);

   EncapsulatedPKIDataType addNewEncapsulatedCRLValue();

   void removeEncapsulatedCRLValue(int var1);


   public static final class Factory {

      public static CRLValuesType newInstance() {
         return (CRLValuesType)POIXMLTypeLoader.newInstance(CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType newInstance(XmlOptions var0) {
         return (CRLValuesType)POIXMLTypeLoader.newInstance(CRLValuesType.type, var0);
      }

      public static CRLValuesType parse(String var0) throws XmlException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(String var0, XmlOptions var1) throws XmlException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static CRLValuesType parse(File var0) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static CRLValuesType parse(URL var0) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static CRLValuesType parse(InputStream var0) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static CRLValuesType parse(Reader var0) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static CRLValuesType parse(XMLStreamReader var0) throws XmlException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static CRLValuesType parse(Node var0) throws XmlException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static CRLValuesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static CRLValuesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CRLValuesType)POIXMLTypeLoader.parse(var0, CRLValuesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLValuesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLValuesType.type, var1);
      }

   }
}
