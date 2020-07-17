package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnection;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.w3c.dom.Node;

public interface CTNonVisualConnectorProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNonVisualConnectorProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnonvisualconnectorproperties6f8etype");


   CTConnectorLocking getCxnSpLocks();

   boolean isSetCxnSpLocks();

   void setCxnSpLocks(CTConnectorLocking var1);

   CTConnectorLocking addNewCxnSpLocks();

   void unsetCxnSpLocks();

   CTConnection getStCxn();

   boolean isSetStCxn();

   void setStCxn(CTConnection var1);

   CTConnection addNewStCxn();

   void unsetStCxn();

   CTConnection getEndCxn();

   boolean isSetEndCxn();

   void setEndCxn(CTConnection var1);

   CTConnection addNewEndCxn();

   void unsetEndCxn();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTNonVisualConnectorProperties newInstance() {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.newInstance(CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties newInstance(XmlOptions var0) {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.newInstance(CTNonVisualConnectorProperties.type, var0);
      }

      public static CTNonVisualConnectorProperties parse(String var0) throws XmlException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static CTNonVisualConnectorProperties parse(File var0) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static CTNonVisualConnectorProperties parse(URL var0) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static CTNonVisualConnectorProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static CTNonVisualConnectorProperties parse(Reader var0) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static CTNonVisualConnectorProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static CTNonVisualConnectorProperties parse(Node var0) throws XmlException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static CTNonVisualConnectorProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualConnectorProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNonVisualConnectorProperties)POIXMLTypeLoader.parse(var0, CTNonVisualConnectorProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualConnectorProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualConnectorProperties.type, var1);
      }

   }
}
