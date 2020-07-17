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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.w3c.dom.Node;

public interface CTMergeCell extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMergeCell.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmergecelle8d9type");


   String getRef();

   STRef xgetRef();

   void setRef(String var1);

   void xsetRef(STRef var1);


   public static final class Factory {

      public static CTMergeCell newInstance() {
         return (CTMergeCell)POIXMLTypeLoader.newInstance(CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell newInstance(XmlOptions var0) {
         return (CTMergeCell)POIXMLTypeLoader.newInstance(CTMergeCell.type, var0);
      }

      public static CTMergeCell parse(String var0) throws XmlException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static CTMergeCell parse(File var0) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static CTMergeCell parse(URL var0) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static CTMergeCell parse(InputStream var0) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static CTMergeCell parse(Reader var0) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static CTMergeCell parse(XMLStreamReader var0) throws XmlException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static CTMergeCell parse(Node var0) throws XmlException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static CTMergeCell parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static CTMergeCell parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMergeCell)POIXMLTypeLoader.parse(var0, CTMergeCell.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMergeCell.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMergeCell.type, var1);
      }

   }
}
