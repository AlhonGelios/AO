package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName;
import org.w3c.dom.Node;

public interface CTDefinedNames extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDefinedNames.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdefinednamesce48type");


   List getDefinedNameList();

   CTDefinedName[] getDefinedNameArray();

   CTDefinedName getDefinedNameArray(int var1);

   int sizeOfDefinedNameArray();

   void setDefinedNameArray(CTDefinedName[] var1);

   void setDefinedNameArray(int var1, CTDefinedName var2);

   CTDefinedName insertNewDefinedName(int var1);

   CTDefinedName addNewDefinedName();

   void removeDefinedName(int var1);


   public static final class Factory {

      public static CTDefinedNames newInstance() {
         return (CTDefinedNames)POIXMLTypeLoader.newInstance(CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames newInstance(XmlOptions var0) {
         return (CTDefinedNames)POIXMLTypeLoader.newInstance(CTDefinedNames.type, var0);
      }

      public static CTDefinedNames parse(String var0) throws XmlException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static CTDefinedNames parse(File var0) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static CTDefinedNames parse(URL var0) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static CTDefinedNames parse(InputStream var0) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static CTDefinedNames parse(Reader var0) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static CTDefinedNames parse(XMLStreamReader var0) throws XmlException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static CTDefinedNames parse(Node var0) throws XmlException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static CTDefinedNames parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static CTDefinedNames parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDefinedNames)POIXMLTypeLoader.parse(var0, CTDefinedNames.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDefinedNames.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDefinedNames.type, var1);
      }

   }
}
