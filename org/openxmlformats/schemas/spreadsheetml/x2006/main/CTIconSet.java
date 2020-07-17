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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;
import org.w3c.dom.Node;

public interface CTIconSet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTIconSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cticonset2648type");


   List getCfvoList();

   CTCfvo[] getCfvoArray();

   CTCfvo getCfvoArray(int var1);

   int sizeOfCfvoArray();

   void setCfvoArray(CTCfvo[] var1);

   void setCfvoArray(int var1, CTCfvo var2);

   CTCfvo insertNewCfvo(int var1);

   CTCfvo addNewCfvo();

   void removeCfvo(int var1);

   STIconSetType.Enum getIconSet();

   STIconSetType xgetIconSet();

   boolean isSetIconSet();

   void setIconSet(STIconSetType.Enum var1);

   void xsetIconSet(STIconSetType var1);

   void unsetIconSet();

   boolean getShowValue();

   XmlBoolean xgetShowValue();

   boolean isSetShowValue();

   void setShowValue(boolean var1);

   void xsetShowValue(XmlBoolean var1);

   void unsetShowValue();

   boolean getPercent();

   XmlBoolean xgetPercent();

   boolean isSetPercent();

   void setPercent(boolean var1);

   void xsetPercent(XmlBoolean var1);

   void unsetPercent();

   boolean getReverse();

   XmlBoolean xgetReverse();

   boolean isSetReverse();

   void setReverse(boolean var1);

   void xsetReverse(XmlBoolean var1);

   void unsetReverse();


   public static final class Factory {

      public static CTIconSet newInstance() {
         return (CTIconSet)POIXMLTypeLoader.newInstance(CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet newInstance(XmlOptions var0) {
         return (CTIconSet)POIXMLTypeLoader.newInstance(CTIconSet.type, var0);
      }

      public static CTIconSet parse(String var0) throws XmlException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static CTIconSet parse(File var0) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static CTIconSet parse(URL var0) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static CTIconSet parse(InputStream var0) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static CTIconSet parse(Reader var0) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static CTIconSet parse(XMLStreamReader var0) throws XmlException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static CTIconSet parse(Node var0) throws XmlException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static CTIconSet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static CTIconSet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTIconSet)POIXMLTypeLoader.parse(var0, CTIconSet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIconSet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIconSet.type, var1);
      }

   }
}
