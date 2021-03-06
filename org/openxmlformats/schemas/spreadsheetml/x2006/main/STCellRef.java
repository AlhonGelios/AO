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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STCellRef extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCellRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcellrefe4e0type");



   public static final class Factory {

      public static STCellRef newValue(Object var0) {
         return (STCellRef)STCellRef.type.newValue(var0);
      }

      public static STCellRef newInstance() {
         return (STCellRef)POIXMLTypeLoader.newInstance(STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef newInstance(XmlOptions var0) {
         return (STCellRef)POIXMLTypeLoader.newInstance(STCellRef.type, var0);
      }

      public static STCellRef parse(String var0) throws XmlException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(String var0, XmlOptions var1) throws XmlException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static STCellRef parse(File var0) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static STCellRef parse(URL var0) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static STCellRef parse(InputStream var0) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static STCellRef parse(Reader var0) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static STCellRef parse(XMLStreamReader var0) throws XmlException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static STCellRef parse(Node var0) throws XmlException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static STCellRef parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, (XmlOptions)null);
      }

      public static STCellRef parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCellRef)POIXMLTypeLoader.parse(var0, STCellRef.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellRef.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCellRef.type, var1);
      }

   }
}
