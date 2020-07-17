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

public interface STCellStyleXfId extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCellStyleXfId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcellstylexfid70c7type");



   public static final class Factory {

      public static STCellStyleXfId newValue(Object var0) {
         return (STCellStyleXfId)STCellStyleXfId.type.newValue(var0);
      }

      public static STCellStyleXfId newInstance() {
         return (STCellStyleXfId)POIXMLTypeLoader.newInstance(STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId newInstance(XmlOptions var0) {
         return (STCellStyleXfId)POIXMLTypeLoader.newInstance(STCellStyleXfId.type, var0);
      }

      public static STCellStyleXfId parse(String var0) throws XmlException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(String var0, XmlOptions var1) throws XmlException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static STCellStyleXfId parse(File var0) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static STCellStyleXfId parse(URL var0) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static STCellStyleXfId parse(InputStream var0) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static STCellStyleXfId parse(Reader var0) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static STCellStyleXfId parse(XMLStreamReader var0) throws XmlException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static STCellStyleXfId parse(Node var0) throws XmlException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static STCellStyleXfId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static STCellStyleXfId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCellStyleXfId)POIXMLTypeLoader.parse(var0, STCellStyleXfId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellStyleXfId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellStyleXfId.type, var1);
      }

   }
}
