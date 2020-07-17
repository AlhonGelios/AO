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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;
import org.w3c.dom.Node;

public interface CTTableStyleList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableStyleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablestylelist4bdctype");


   List getTblStyleList();

   CTTableStyle[] getTblStyleArray();

   CTTableStyle getTblStyleArray(int var1);

   int sizeOfTblStyleArray();

   void setTblStyleArray(CTTableStyle[] var1);

   void setTblStyleArray(int var1, CTTableStyle var2);

   CTTableStyle insertNewTblStyle(int var1);

   CTTableStyle addNewTblStyle();

   void removeTblStyle(int var1);

   String getDef();

   STGuid xgetDef();

   void setDef(String var1);

   void xsetDef(STGuid var1);


   public static final class Factory {

      public static CTTableStyleList newInstance() {
         return (CTTableStyleList)POIXMLTypeLoader.newInstance(CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList newInstance(XmlOptions var0) {
         return (CTTableStyleList)POIXMLTypeLoader.newInstance(CTTableStyleList.type, var0);
      }

      public static CTTableStyleList parse(String var0) throws XmlException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static CTTableStyleList parse(File var0) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static CTTableStyleList parse(URL var0) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static CTTableStyleList parse(InputStream var0) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static CTTableStyleList parse(Reader var0) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static CTTableStyleList parse(XMLStreamReader var0) throws XmlException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static CTTableStyleList parse(Node var0) throws XmlException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static CTTableStyleList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static CTTableStyleList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableStyleList)POIXMLTypeLoader.parse(var0, CTTableStyleList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleList.type, var1);
      }

   }
}
