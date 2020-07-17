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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.w3c.dom.Node;

public interface CTDataBar extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDataBar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdatabar4128type");


   List getCfvoList();

   CTCfvo[] getCfvoArray();

   CTCfvo getCfvoArray(int var1);

   int sizeOfCfvoArray();

   void setCfvoArray(CTCfvo[] var1);

   void setCfvoArray(int var1, CTCfvo var2);

   CTCfvo insertNewCfvo(int var1);

   CTCfvo addNewCfvo();

   void removeCfvo(int var1);

   CTColor getColor();

   void setColor(CTColor var1);

   CTColor addNewColor();

   long getMinLength();

   XmlUnsignedInt xgetMinLength();

   boolean isSetMinLength();

   void setMinLength(long var1);

   void xsetMinLength(XmlUnsignedInt var1);

   void unsetMinLength();

   long getMaxLength();

   XmlUnsignedInt xgetMaxLength();

   boolean isSetMaxLength();

   void setMaxLength(long var1);

   void xsetMaxLength(XmlUnsignedInt var1);

   void unsetMaxLength();

   boolean getShowValue();

   XmlBoolean xgetShowValue();

   boolean isSetShowValue();

   void setShowValue(boolean var1);

   void xsetShowValue(XmlBoolean var1);

   void unsetShowValue();


   public static final class Factory {

      public static CTDataBar newInstance() {
         return (CTDataBar)POIXMLTypeLoader.newInstance(CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar newInstance(XmlOptions var0) {
         return (CTDataBar)POIXMLTypeLoader.newInstance(CTDataBar.type, var0);
      }

      public static CTDataBar parse(String var0) throws XmlException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static CTDataBar parse(File var0) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static CTDataBar parse(URL var0) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static CTDataBar parse(InputStream var0) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static CTDataBar parse(Reader var0) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static CTDataBar parse(XMLStreamReader var0) throws XmlException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static CTDataBar parse(Node var0) throws XmlException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static CTDataBar parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static CTDataBar parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDataBar)POIXMLTypeLoader.parse(var0, CTDataBar.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataBar.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataBar.type, var1);
      }

   }
}
