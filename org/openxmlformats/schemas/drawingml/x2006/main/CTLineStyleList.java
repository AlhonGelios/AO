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
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.w3c.dom.Node;

public interface CTLineStyleList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLineStyleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlinestylelist510ctype");


   List getLnList();

   CTLineProperties[] getLnArray();

   CTLineProperties getLnArray(int var1);

   int sizeOfLnArray();

   void setLnArray(CTLineProperties[] var1);

   void setLnArray(int var1, CTLineProperties var2);

   CTLineProperties insertNewLn(int var1);

   CTLineProperties addNewLn();

   void removeLn(int var1);


   public static final class Factory {

      public static CTLineStyleList newInstance() {
         return (CTLineStyleList)POIXMLTypeLoader.newInstance(CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList newInstance(XmlOptions var0) {
         return (CTLineStyleList)POIXMLTypeLoader.newInstance(CTLineStyleList.type, var0);
      }

      public static CTLineStyleList parse(String var0) throws XmlException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static CTLineStyleList parse(File var0) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static CTLineStyleList parse(URL var0) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static CTLineStyleList parse(InputStream var0) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static CTLineStyleList parse(Reader var0) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static CTLineStyleList parse(XMLStreamReader var0) throws XmlException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static CTLineStyleList parse(Node var0) throws XmlException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static CTLineStyleList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static CTLineStyleList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLineStyleList)POIXMLTypeLoader.parse(var0, CTLineStyleList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineStyleList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineStyleList.type, var1);
      }

   }
}
