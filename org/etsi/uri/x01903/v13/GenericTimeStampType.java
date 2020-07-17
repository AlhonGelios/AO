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
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.AnyType;
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.etsi.uri.x01903.v13.IncludeType;
import org.etsi.uri.x01903.v13.ReferenceInfoType;
import org.w3.x2000.x09.xmldsig.CanonicalizationMethodType;
import org.w3c.dom.Node;

public interface GenericTimeStampType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(GenericTimeStampType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("generictimestamptypecdadtype");


   List getIncludeList();

   IncludeType[] getIncludeArray();

   IncludeType getIncludeArray(int var1);

   int sizeOfIncludeArray();

   void setIncludeArray(IncludeType[] var1);

   void setIncludeArray(int var1, IncludeType var2);

   IncludeType insertNewInclude(int var1);

   IncludeType addNewInclude();

   void removeInclude(int var1);

   List getReferenceInfoList();

   ReferenceInfoType[] getReferenceInfoArray();

   ReferenceInfoType getReferenceInfoArray(int var1);

   int sizeOfReferenceInfoArray();

   void setReferenceInfoArray(ReferenceInfoType[] var1);

   void setReferenceInfoArray(int var1, ReferenceInfoType var2);

   ReferenceInfoType insertNewReferenceInfo(int var1);

   ReferenceInfoType addNewReferenceInfo();

   void removeReferenceInfo(int var1);

   CanonicalizationMethodType getCanonicalizationMethod();

   boolean isSetCanonicalizationMethod();

   void setCanonicalizationMethod(CanonicalizationMethodType var1);

   CanonicalizationMethodType addNewCanonicalizationMethod();

   void unsetCanonicalizationMethod();

   List getEncapsulatedTimeStampList();

   EncapsulatedPKIDataType[] getEncapsulatedTimeStampArray();

   EncapsulatedPKIDataType getEncapsulatedTimeStampArray(int var1);

   int sizeOfEncapsulatedTimeStampArray();

   void setEncapsulatedTimeStampArray(EncapsulatedPKIDataType[] var1);

   void setEncapsulatedTimeStampArray(int var1, EncapsulatedPKIDataType var2);

   EncapsulatedPKIDataType insertNewEncapsulatedTimeStamp(int var1);

   EncapsulatedPKIDataType addNewEncapsulatedTimeStamp();

   void removeEncapsulatedTimeStamp(int var1);

   List getXMLTimeStampList();

   AnyType[] getXMLTimeStampArray();

   AnyType getXMLTimeStampArray(int var1);

   int sizeOfXMLTimeStampArray();

   void setXMLTimeStampArray(AnyType[] var1);

   void setXMLTimeStampArray(int var1, AnyType var2);

   AnyType insertNewXMLTimeStamp(int var1);

   AnyType addNewXMLTimeStamp();

   void removeXMLTimeStamp(int var1);

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static GenericTimeStampType newInstance() {
         return (GenericTimeStampType)POIXMLTypeLoader.newInstance(GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType newInstance(XmlOptions var0) {
         return (GenericTimeStampType)POIXMLTypeLoader.newInstance(GenericTimeStampType.type, var0);
      }

      public static GenericTimeStampType parse(String var0) throws XmlException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(String var0, XmlOptions var1) throws XmlException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static GenericTimeStampType parse(File var0) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static GenericTimeStampType parse(URL var0) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static GenericTimeStampType parse(InputStream var0) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static GenericTimeStampType parse(Reader var0) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static GenericTimeStampType parse(XMLStreamReader var0) throws XmlException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static GenericTimeStampType parse(Node var0) throws XmlException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(Node var0, XmlOptions var1) throws XmlException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static GenericTimeStampType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static GenericTimeStampType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (GenericTimeStampType)POIXMLTypeLoader.parse(var0, GenericTimeStampType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, GenericTimeStampType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, GenericTimeStampType.type, var1);
      }

   }
}
