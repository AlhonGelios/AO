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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain;
import org.w3c.dom.Node;

public interface CalcChainDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CalcChainDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("calcchainfc37doctype");


   CTCalcChain getCalcChain();

   void setCalcChain(CTCalcChain var1);

   CTCalcChain addNewCalcChain();


   public static final class Factory {

      public static CalcChainDocument newInstance() {
         return (CalcChainDocument)POIXMLTypeLoader.newInstance(CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument newInstance(XmlOptions var0) {
         return (CalcChainDocument)POIXMLTypeLoader.newInstance(CalcChainDocument.type, var0);
      }

      public static CalcChainDocument parse(String var0) throws XmlException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static CalcChainDocument parse(File var0) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static CalcChainDocument parse(URL var0) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static CalcChainDocument parse(InputStream var0) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static CalcChainDocument parse(Reader var0) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static CalcChainDocument parse(XMLStreamReader var0) throws XmlException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static CalcChainDocument parse(Node var0) throws XmlException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static CalcChainDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static CalcChainDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CalcChainDocument)POIXMLTypeLoader.parse(var0, CalcChainDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CalcChainDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CalcChainDocument.type, var1);
      }

   }
}
