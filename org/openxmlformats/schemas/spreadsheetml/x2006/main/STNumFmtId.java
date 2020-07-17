package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STNumFmtId extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STNumFmtId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stnumfmtid76fbtype");



   public static final class Factory {

      public static STNumFmtId newValue(Object var0) {
         return (STNumFmtId)STNumFmtId.type.newValue(var0);
      }

      public static STNumFmtId newInstance() {
         return (STNumFmtId)POIXMLTypeLoader.newInstance(STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId newInstance(XmlOptions var0) {
         return (STNumFmtId)POIXMLTypeLoader.newInstance(STNumFmtId.type, var0);
      }

      public static STNumFmtId parse(String var0) throws XmlException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(String var0, XmlOptions var1) throws XmlException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static STNumFmtId parse(File var0) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static STNumFmtId parse(URL var0) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static STNumFmtId parse(InputStream var0) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static STNumFmtId parse(Reader var0) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static STNumFmtId parse(XMLStreamReader var0) throws XmlException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static STNumFmtId parse(Node var0) throws XmlException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static STNumFmtId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static STNumFmtId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STNumFmtId)POIXMLTypeLoader.parse(var0, STNumFmtId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STNumFmtId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STNumFmtId.type, var1);
      }

   }
}
