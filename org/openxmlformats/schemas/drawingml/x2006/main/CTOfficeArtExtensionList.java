package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension;
import org.w3c.dom.Node;

public interface CTOfficeArtExtensionList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOfficeArtExtensionList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctofficeartextensionlista211type");


   List getExtList();

   CTOfficeArtExtension[] getExtArray();

   CTOfficeArtExtension getExtArray(int var1);

   int sizeOfExtArray();

   void setExtArray(CTOfficeArtExtension[] var1);

   void setExtArray(int var1, CTOfficeArtExtension var2);

   CTOfficeArtExtension insertNewExt(int var1);

   CTOfficeArtExtension addNewExt();

   void removeExt(int var1);


   public static final class Factory {

      public static CTOfficeArtExtensionList newInstance() {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.newInstance(CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList newInstance(XmlOptions var0) {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.newInstance(CTOfficeArtExtensionList.type, var0);
      }

      public static CTOfficeArtExtensionList parse(String var0) throws XmlException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static CTOfficeArtExtensionList parse(File var0) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static CTOfficeArtExtensionList parse(URL var0) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static CTOfficeArtExtensionList parse(InputStream var0) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static CTOfficeArtExtensionList parse(Reader var0) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static CTOfficeArtExtensionList parse(XMLStreamReader var0) throws XmlException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static CTOfficeArtExtensionList parse(Node var0) throws XmlException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static CTOfficeArtExtensionList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtensionList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOfficeArtExtensionList)POIXMLTypeLoader.parse(var0, CTOfficeArtExtensionList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOfficeArtExtensionList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOfficeArtExtensionList.type, var1);
      }

   }
}
