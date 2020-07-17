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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STProofErr$Enum;
import org.w3c.dom.Node;

public interface CTProofErr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTProofErr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctprooferr1e07type");


   STProofErr$Enum getType();

   STProofErr xgetType();

   void setType(STProofErr$Enum var1);

   void xsetType(STProofErr var1);


   public static final class Factory {

      public static CTProofErr newInstance() {
         return (CTProofErr)POIXMLTypeLoader.newInstance(CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr newInstance(XmlOptions var0) {
         return (CTProofErr)POIXMLTypeLoader.newInstance(CTProofErr.type, var0);
      }

      public static CTProofErr parse(String var0) throws XmlException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static CTProofErr parse(File var0) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static CTProofErr parse(URL var0) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static CTProofErr parse(InputStream var0) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static CTProofErr parse(Reader var0) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static CTProofErr parse(XMLStreamReader var0) throws XmlException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static CTProofErr parse(Node var0) throws XmlException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static CTProofErr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static CTProofErr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTProofErr)POIXMLTypeLoader.parse(var0, CTProofErr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProofErr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProofErr.type, var1);
      }

   }
}
