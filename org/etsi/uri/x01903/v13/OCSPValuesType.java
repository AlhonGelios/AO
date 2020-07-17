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

public interface OCSPValuesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(OCSPValuesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ocspvaluestypeb421type");


   List getEncapsulatedOCSPValueList();

   EncapsulatedPKIDataType[] getEncapsulatedOCSPValueArray();

   EncapsulatedPKIDataType getEncapsulatedOCSPValueArray(int var1);

   int sizeOfEncapsulatedOCSPValueArray();

   void setEncapsulatedOCSPValueArray(EncapsulatedPKIDataType[] var1);

   void setEncapsulatedOCSPValueArray(int var1, EncapsulatedPKIDataType var2);

   EncapsulatedPKIDataType insertNewEncapsulatedOCSPValue(int var1);

   EncapsulatedPKIDataType addNewEncapsulatedOCSPValue();

   void removeEncapsulatedOCSPValue(int var1);


   public static final class Factory {

      public static OCSPValuesType newInstance() {
         return (OCSPValuesType)POIXMLTypeLoader.newInstance(OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType newInstance(XmlOptions var0) {
         return (OCSPValuesType)POIXMLTypeLoader.newInstance(OCSPValuesType.type, var0);
      }

      public static OCSPValuesType parse(String var0) throws XmlException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(String var0, XmlOptions var1) throws XmlException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static OCSPValuesType parse(File var0) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static OCSPValuesType parse(URL var0) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static OCSPValuesType parse(InputStream var0) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static OCSPValuesType parse(Reader var0) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static OCSPValuesType parse(XMLStreamReader var0) throws XmlException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static OCSPValuesType parse(Node var0) throws XmlException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static OCSPValuesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static OCSPValuesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (OCSPValuesType)POIXMLTypeLoader.parse(var0, OCSPValuesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPValuesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPValuesType.type, var1);
      }

   }
}
