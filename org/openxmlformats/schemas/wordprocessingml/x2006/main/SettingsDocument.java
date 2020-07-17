package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings;
import org.w3c.dom.Node;

public interface SettingsDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SettingsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("settings9dd1doctype");


   CTSettings getSettings();

   void setSettings(CTSettings var1);

   CTSettings addNewSettings();


   public static final class Factory {

      public static SettingsDocument newInstance() {
         return (SettingsDocument)POIXMLTypeLoader.newInstance(SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument newInstance(XmlOptions var0) {
         return (SettingsDocument)POIXMLTypeLoader.newInstance(SettingsDocument.type, var0);
      }

      public static SettingsDocument parse(String var0) throws XmlException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static SettingsDocument parse(File var0) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static SettingsDocument parse(URL var0) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static SettingsDocument parse(InputStream var0) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static SettingsDocument parse(Reader var0) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static SettingsDocument parse(XMLStreamReader var0) throws XmlException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static SettingsDocument parse(Node var0) throws XmlException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static SettingsDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static SettingsDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SettingsDocument)POIXMLTypeLoader.parse(var0, SettingsDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SettingsDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SettingsDocument.type, var1);
      }

   }
}
