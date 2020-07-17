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
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem;
import org.w3c.dom.Node;

public interface CTEffectStyleList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTEffectStyleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cteffectstylelistc50ftype");


   List getEffectStyleList();

   CTEffectStyleItem[] getEffectStyleArray();

   CTEffectStyleItem getEffectStyleArray(int var1);

   int sizeOfEffectStyleArray();

   void setEffectStyleArray(CTEffectStyleItem[] var1);

   void setEffectStyleArray(int var1, CTEffectStyleItem var2);

   CTEffectStyleItem insertNewEffectStyle(int var1);

   CTEffectStyleItem addNewEffectStyle();

   void removeEffectStyle(int var1);


   public static final class Factory {

      public static CTEffectStyleList newInstance() {
         return (CTEffectStyleList)POIXMLTypeLoader.newInstance(CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList newInstance(XmlOptions var0) {
         return (CTEffectStyleList)POIXMLTypeLoader.newInstance(CTEffectStyleList.type, var0);
      }

      public static CTEffectStyleList parse(String var0) throws XmlException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static CTEffectStyleList parse(File var0) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static CTEffectStyleList parse(URL var0) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static CTEffectStyleList parse(InputStream var0) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static CTEffectStyleList parse(Reader var0) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static CTEffectStyleList parse(XMLStreamReader var0) throws XmlException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static CTEffectStyleList parse(Node var0) throws XmlException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static CTEffectStyleList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static CTEffectStyleList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTEffectStyleList)POIXMLTypeLoader.parse(var0, CTEffectStyleList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEffectStyleList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEffectStyleList.type, var1);
      }

   }
}
