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

public interface CTVMerge extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTVMerge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctvmergee086type");


   STMerge.Enum getVal();

   STMerge xgetVal();

   boolean isSetVal();

   void setVal(STMerge.Enum var1);

   void xsetVal(STMerge var1);

   void unsetVal();


   public static final class Factory {

      public static CTVMerge newInstance() {
         return (CTVMerge)POIXMLTypeLoader.newInstance(CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge newInstance(XmlOptions var0) {
         return (CTVMerge)POIXMLTypeLoader.newInstance(CTVMerge.type, var0);
      }

      public static CTVMerge parse(String var0) throws XmlException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(String var0, XmlOptions var1) throws XmlException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static CTVMerge parse(File var0) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static CTVMerge parse(URL var0) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static CTVMerge parse(InputStream var0) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static CTVMerge parse(Reader var0) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static CTVMerge parse(XMLStreamReader var0) throws XmlException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static CTVMerge parse(Node var0) throws XmlException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static CTVMerge parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static CTVMerge parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTVMerge)POIXMLTypeLoader.parse(var0, CTVMerge.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVMerge.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVMerge.type, var1);
      }

   }
}
