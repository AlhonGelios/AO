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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType;
import org.w3c.dom.Node;

public interface CTBr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbr7dd8type");


   STBrType.Enum getType();

   STBrType xgetType();

   boolean isSetType();

   void setType(STBrType.Enum var1);

   void xsetType(STBrType var1);

   void unsetType();

   STBrClear.Enum getClear();

   STBrClear xgetClear();

   boolean isSetClear();

   void setClear(STBrClear.Enum var1);

   void xsetClear(STBrClear var1);

   void unsetClear();


   public static final class Factory {

      public static CTBr newInstance() {
         return (CTBr)POIXMLTypeLoader.newInstance(CTBr.type, (XmlOptions)null);
      }

      public static CTBr newInstance(XmlOptions var0) {
         return (CTBr)POIXMLTypeLoader.newInstance(CTBr.type, var0);
      }

      public static CTBr parse(String var0) throws XmlException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static CTBr parse(File var0) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static CTBr parse(URL var0) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static CTBr parse(InputStream var0) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static CTBr parse(Reader var0) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static CTBr parse(XMLStreamReader var0) throws XmlException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static CTBr parse(Node var0) throws XmlException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static CTBr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, (XmlOptions)null);
      }

      public static CTBr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBr)POIXMLTypeLoader.parse(var0, CTBr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBr.type, var1);
      }

   }
}
