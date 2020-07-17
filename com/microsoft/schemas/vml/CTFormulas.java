package com.microsoft.schemas.vml;

import com.microsoft.schemas.vml.CTF;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTFormulas extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFormulas.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctformulas808btype");


   List getFList();

   CTF[] getFArray();

   CTF getFArray(int var1);

   int sizeOfFArray();

   void setFArray(CTF[] var1);

   void setFArray(int var1, CTF var2);

   CTF insertNewF(int var1);

   CTF addNewF();

   void removeF(int var1);


   public static final class Factory {

      public static CTFormulas newInstance() {
         return (CTFormulas)POIXMLTypeLoader.newInstance(CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas newInstance(XmlOptions var0) {
         return (CTFormulas)POIXMLTypeLoader.newInstance(CTFormulas.type, var0);
      }

      public static CTFormulas parse(String var0) throws XmlException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static CTFormulas parse(File var0) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static CTFormulas parse(URL var0) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static CTFormulas parse(InputStream var0) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static CTFormulas parse(Reader var0) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static CTFormulas parse(XMLStreamReader var0) throws XmlException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static CTFormulas parse(Node var0) throws XmlException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static CTFormulas parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static CTFormulas parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFormulas)POIXMLTypeLoader.parse(var0, CTFormulas.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFormulas.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFormulas.type, var1);
      }

   }
}
