package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference;
import org.w3c.dom.Node;

public interface CTExternalReferences extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTExternalReferences.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctexternalreferencesd77ctype");


   List getExternalReferenceList();

   CTExternalReference[] getExternalReferenceArray();

   CTExternalReference getExternalReferenceArray(int var1);

   int sizeOfExternalReferenceArray();

   void setExternalReferenceArray(CTExternalReference[] var1);

   void setExternalReferenceArray(int var1, CTExternalReference var2);

   CTExternalReference insertNewExternalReference(int var1);

   CTExternalReference addNewExternalReference();

   void removeExternalReference(int var1);


   public static final class Factory {

      public static CTExternalReferences newInstance() {
         return (CTExternalReferences)POIXMLTypeLoader.newInstance(CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences newInstance(XmlOptions var0) {
         return (CTExternalReferences)POIXMLTypeLoader.newInstance(CTExternalReferences.type, var0);
      }

      public static CTExternalReferences parse(String var0) throws XmlException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(String var0, XmlOptions var1) throws XmlException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static CTExternalReferences parse(File var0) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static CTExternalReferences parse(URL var0) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static CTExternalReferences parse(InputStream var0) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static CTExternalReferences parse(Reader var0) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static CTExternalReferences parse(XMLStreamReader var0) throws XmlException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static CTExternalReferences parse(Node var0) throws XmlException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static CTExternalReferences parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static CTExternalReferences parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTExternalReferences)POIXMLTypeLoader.parse(var0, CTExternalReferences.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalReferences.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalReferences.type, var1);
      }

   }
}
