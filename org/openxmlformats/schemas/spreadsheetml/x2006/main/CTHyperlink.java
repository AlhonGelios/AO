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
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTHyperlink extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHyperlink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cthyperlink0c85type");


   String getRef();

   STRef xgetRef();

   void setRef(String var1);

   void xsetRef(STRef var1);

   String getId();

   STRelationshipId xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);

   void unsetId();

   String getLocation();

   STXstring xgetLocation();

   boolean isSetLocation();

   void setLocation(String var1);

   void xsetLocation(STXstring var1);

   void unsetLocation();

   String getTooltip();

   STXstring xgetTooltip();

   boolean isSetTooltip();

   void setTooltip(String var1);

   void xsetTooltip(STXstring var1);

   void unsetTooltip();

   String getDisplay();

   STXstring xgetDisplay();

   boolean isSetDisplay();

   void setDisplay(String var1);

   void xsetDisplay(STXstring var1);

   void unsetDisplay();


   public static final class Factory {

      public static CTHyperlink newInstance() {
         return (CTHyperlink)POIXMLTypeLoader.newInstance(CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink newInstance(XmlOptions var0) {
         return (CTHyperlink)POIXMLTypeLoader.newInstance(CTHyperlink.type, var0);
      }

      public static CTHyperlink parse(String var0) throws XmlException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static CTHyperlink parse(File var0) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static CTHyperlink parse(URL var0) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static CTHyperlink parse(InputStream var0) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static CTHyperlink parse(Reader var0) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static CTHyperlink parse(XMLStreamReader var0) throws XmlException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static CTHyperlink parse(Node var0) throws XmlException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static CTHyperlink parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static CTHyperlink parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHyperlink)POIXMLTypeLoader.parse(var0, CTHyperlink.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHyperlink.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHyperlink.type, var1);
      }

   }
}
