package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTTrackChange extends CTMarkup {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTrackChange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttrackchangec317type");


   String getAuthor();

   STString xgetAuthor();

   void setAuthor(String var1);

   void xsetAuthor(STString var1);

   Calendar getDate();

   STDateTime xgetDate();

   boolean isSetDate();

   void setDate(Calendar var1);

   void xsetDate(STDateTime var1);

   void unsetDate();


   public static final class Factory {

      public static CTTrackChange newInstance() {
         return (CTTrackChange)POIXMLTypeLoader.newInstance(CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange newInstance(XmlOptions var0) {
         return (CTTrackChange)POIXMLTypeLoader.newInstance(CTTrackChange.type, var0);
      }

      public static CTTrackChange parse(String var0) throws XmlException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static CTTrackChange parse(File var0) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static CTTrackChange parse(URL var0) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static CTTrackChange parse(InputStream var0) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static CTTrackChange parse(Reader var0) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static CTTrackChange parse(XMLStreamReader var0) throws XmlException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static CTTrackChange parse(Node var0) throws XmlException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static CTTrackChange parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static CTTrackChange parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTrackChange)POIXMLTypeLoader.parse(var0, CTTrackChange.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTrackChange.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTrackChange.type, var1);
      }

   }
}
