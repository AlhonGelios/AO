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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMerge;
import org.w3c.dom.Node;

public interface CTHMerge extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHMerge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cthmerge1bf8type");


   STMerge.Enum getVal();

   STMerge xgetVal();

   boolean isSetVal();

   void setVal(STMerge.Enum var1);

   void xsetVal(STMerge var1);

   void unsetVal();


   public static final class Factory {

      public static CTHMerge newInstance() {
         return (CTHMerge)POIXMLTypeLoader.newInstance(CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge newInstance(XmlOptions var0) {
         return (CTHMerge)POIXMLTypeLoader.newInstance(CTHMerge.type, var0);
      }

      public static CTHMerge parse(String var0) throws XmlException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static CTHMerge parse(File var0) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static CTHMerge parse(URL var0) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static CTHMerge parse(InputStream var0) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static CTHMerge parse(Reader var0) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static CTHMerge parse(XMLStreamReader var0) throws XmlException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static CTHMerge parse(Node var0) throws XmlException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static CTHMerge parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static CTHMerge parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHMerge)POIXMLTypeLoader.parse(var0, CTHMerge.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHMerge.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHMerge.type, var1);
      }

   }
}
