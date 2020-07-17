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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHdrFtr;
import org.w3c.dom.Node;

public interface CTHdrFtrRef extends CTRel {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHdrFtrRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cthdrftrref224dtype");


   STHdrFtr.Enum getType();

   STHdrFtr xgetType();

   void setType(STHdrFtr.Enum var1);

   void xsetType(STHdrFtr var1);


   public static final class Factory {

      public static CTHdrFtrRef newInstance() {
         return (CTHdrFtrRef)POIXMLTypeLoader.newInstance(CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef newInstance(XmlOptions var0) {
         return (CTHdrFtrRef)POIXMLTypeLoader.newInstance(CTHdrFtrRef.type, var0);
      }

      public static CTHdrFtrRef parse(String var0) throws XmlException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static CTHdrFtrRef parse(File var0) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static CTHdrFtrRef parse(URL var0) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static CTHdrFtrRef parse(InputStream var0) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static CTHdrFtrRef parse(Reader var0) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static CTHdrFtrRef parse(XMLStreamReader var0) throws XmlException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static CTHdrFtrRef parse(Node var0) throws XmlException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static CTHdrFtrRef parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static CTHdrFtrRef parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHdrFtrRef)POIXMLTypeLoader.parse(var0, CTHdrFtrRef.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHdrFtrRef.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHdrFtrRef.type, var1);
      }

   }
}
