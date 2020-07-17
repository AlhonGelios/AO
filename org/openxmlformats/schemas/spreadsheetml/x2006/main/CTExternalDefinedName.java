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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTExternalDefinedName extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTExternalDefinedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctexternaldefinedname9408type");


   String getName();

   STXstring xgetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   String getRefersTo();

   STXstring xgetRefersTo();

   boolean isSetRefersTo();

   void setRefersTo(String var1);

   void xsetRefersTo(STXstring var1);

   void unsetRefersTo();

   long getSheetId();

   XmlUnsignedInt xgetSheetId();

   boolean isSetSheetId();

   void setSheetId(long var1);

   void xsetSheetId(XmlUnsignedInt var1);

   void unsetSheetId();


   public static final class Factory {

      public static CTExternalDefinedName newInstance() {
         return (CTExternalDefinedName)POIXMLTypeLoader.newInstance(CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName newInstance(XmlOptions var0) {
         return (CTExternalDefinedName)POIXMLTypeLoader.newInstance(CTExternalDefinedName.type, var0);
      }

      public static CTExternalDefinedName parse(String var0) throws XmlException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(String var0, XmlOptions var1) throws XmlException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static CTExternalDefinedName parse(File var0) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static CTExternalDefinedName parse(URL var0) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static CTExternalDefinedName parse(InputStream var0) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static CTExternalDefinedName parse(Reader var0) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static CTExternalDefinedName parse(XMLStreamReader var0) throws XmlException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static CTExternalDefinedName parse(Node var0) throws XmlException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static CTExternalDefinedName parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static CTExternalDefinedName parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTExternalDefinedName)POIXMLTypeLoader.parse(var0, CTExternalDefinedName.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalDefinedName.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalDefinedName.type, var1);
      }

   }
}
