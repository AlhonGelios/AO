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
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTSheet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheet4dbetype");


   String getName();

   STXstring xgetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   long getSheetId();

   XmlUnsignedInt xgetSheetId();

   void setSheetId(long var1);

   void xsetSheetId(XmlUnsignedInt var1);

   STSheetState.Enum getState();

   STSheetState xgetState();

   boolean isSetState();

   void setState(STSheetState.Enum var1);

   void xsetState(STSheetState var1);

   void unsetState();

   String getId();

   STRelationshipId xgetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);


   public static final class Factory {

      public static CTSheet newInstance() {
         return (CTSheet)POIXMLTypeLoader.newInstance(CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet newInstance(XmlOptions var0) {
         return (CTSheet)POIXMLTypeLoader.newInstance(CTSheet.type, var0);
      }

      public static CTSheet parse(String var0) throws XmlException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static CTSheet parse(File var0) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static CTSheet parse(URL var0) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static CTSheet parse(InputStream var0) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static CTSheet parse(Reader var0) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static CTSheet parse(XMLStreamReader var0) throws XmlException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static CTSheet parse(Node var0) throws XmlException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static CTSheet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, (XmlOptions)null);
      }

      public static CTSheet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheet)POIXMLTypeLoader.parse(var0, CTSheet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheet.type, var1);
      }

   }
}
