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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTCol extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcola95ftype");


   long getMin();

   XmlUnsignedInt xgetMin();

   void setMin(long var1);

   void xsetMin(XmlUnsignedInt var1);

   long getMax();

   XmlUnsignedInt xgetMax();

   void setMax(long var1);

   void xsetMax(XmlUnsignedInt var1);

   double getWidth();

   XmlDouble xgetWidth();

   boolean isSetWidth();

   void setWidth(double var1);

   void xsetWidth(XmlDouble var1);

   void unsetWidth();

   long getStyle();

   XmlUnsignedInt xgetStyle();

   boolean isSetStyle();

   void setStyle(long var1);

   void xsetStyle(XmlUnsignedInt var1);

   void unsetStyle();

   boolean getHidden();

   XmlBoolean xgetHidden();

   boolean isSetHidden();

   void setHidden(boolean var1);

   void xsetHidden(XmlBoolean var1);

   void unsetHidden();

   boolean getBestFit();

   XmlBoolean xgetBestFit();

   boolean isSetBestFit();

   void setBestFit(boolean var1);

   void xsetBestFit(XmlBoolean var1);

   void unsetBestFit();

   boolean getCustomWidth();

   XmlBoolean xgetCustomWidth();

   boolean isSetCustomWidth();

   void setCustomWidth(boolean var1);

   void xsetCustomWidth(XmlBoolean var1);

   void unsetCustomWidth();

   boolean getPhonetic();

   XmlBoolean xgetPhonetic();

   boolean isSetPhonetic();

   void setPhonetic(boolean var1);

   void xsetPhonetic(XmlBoolean var1);

   void unsetPhonetic();

   short getOutlineLevel();

   XmlUnsignedByte xgetOutlineLevel();

   boolean isSetOutlineLevel();

   void setOutlineLevel(short var1);

   void xsetOutlineLevel(XmlUnsignedByte var1);

   void unsetOutlineLevel();

   boolean getCollapsed();

   XmlBoolean xgetCollapsed();

   boolean isSetCollapsed();

   void setCollapsed(boolean var1);

   void xsetCollapsed(XmlBoolean var1);

   void unsetCollapsed();


   public static final class Factory {

      public static CTCol newInstance() {
         return (CTCol)POIXMLTypeLoader.newInstance(CTCol.type, (XmlOptions)null);
      }

      public static CTCol newInstance(XmlOptions var0) {
         return (CTCol)POIXMLTypeLoader.newInstance(CTCol.type, var0);
      }

      public static CTCol parse(String var0) throws XmlException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static CTCol parse(File var0) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static CTCol parse(URL var0) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static CTCol parse(InputStream var0) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static CTCol parse(Reader var0) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static CTCol parse(XMLStreamReader var0) throws XmlException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static CTCol parse(Node var0) throws XmlException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static CTCol parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, (XmlOptions)null);
      }

      public static CTCol parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCol)POIXMLTypeLoader.parse(var0, CTCol.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCol.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCol.type, var1);
      }

   }
}
