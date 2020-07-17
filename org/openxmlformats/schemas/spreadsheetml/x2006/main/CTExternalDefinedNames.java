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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName;
import org.w3c.dom.Node;

public interface CTExternalDefinedNames extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTExternalDefinedNames.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctexternaldefinednamesccf3type");


   List getDefinedNameList();

   CTExternalDefinedName[] getDefinedNameArray();

   CTExternalDefinedName getDefinedNameArray(int var1);

   int sizeOfDefinedNameArray();

   void setDefinedNameArray(CTExternalDefinedName[] var1);

   void setDefinedNameArray(int var1, CTExternalDefinedName var2);

   CTExternalDefinedName insertNewDefinedName(int var1);

   CTExternalDefinedName addNewDefinedName();

   void removeDefinedName(int var1);


   public static final class Factory {

      public static CTExternalDefinedNames newInstance() {
         return (CTExternalDefinedNames)POIXMLTypeLoader.newInstance(CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames newInstance(XmlOptions var0) {
         return (CTExternalDefinedNames)POIXMLTypeLoader.newInstance(CTExternalDefinedNames.type, var0);
      }

      public static CTExternalDefinedNames parse(String var0) throws XmlException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(String var0, XmlOptions var1) throws XmlException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static CTExternalDefinedNames parse(File var0) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static CTExternalDefinedNames parse(URL var0) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static CTExternalDefinedNames parse(InputStream var0) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static CTExternalDefinedNames parse(Reader var0) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static CTExternalDefinedNames parse(XMLStreamReader var0) throws XmlException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static CTExternalDefinedNames parse(Node var0) throws XmlException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static CTExternalDefinedNames parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static CTExternalDefinedNames parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTExternalDefinedNames)POIXMLTypeLoader.parse(var0, CTExternalDefinedNames.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalDefinedNames.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTExternalDefinedNames.type, var1);
      }

   }
}
