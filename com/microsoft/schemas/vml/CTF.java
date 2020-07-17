package com.microsoft.schemas.vml;

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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTF extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTF.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfbc3atype");


   String getEqn();

   XmlString xgetEqn();

   boolean isSetEqn();

   void setEqn(String var1);

   void xsetEqn(XmlString var1);

   void unsetEqn();


   public static final class Factory {

      public static CTF newInstance() {
         return (CTF)POIXMLTypeLoader.newInstance(CTF.type, (XmlOptions)null);
      }

      public static CTF newInstance(XmlOptions var0) {
         return (CTF)POIXMLTypeLoader.newInstance(CTF.type, var0);
      }

      public static CTF parse(String var0) throws XmlException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(String var0, XmlOptions var1) throws XmlException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static CTF parse(File var0) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static CTF parse(URL var0) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static CTF parse(InputStream var0) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static CTF parse(Reader var0) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static CTF parse(XMLStreamReader var0) throws XmlException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static CTF parse(Node var0) throws XmlException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static CTF parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, (XmlOptions)null);
      }

      public static CTF parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTF)POIXMLTypeLoader.parse(var0, CTF.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTF.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTF.type, var1);
      }

   }
}
