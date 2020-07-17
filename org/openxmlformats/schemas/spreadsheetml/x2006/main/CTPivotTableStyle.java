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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTPivotTableStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotTableStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivottablestyle0f84type");


   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();

   boolean getShowRowHeaders();

   XmlBoolean xgetShowRowHeaders();

   boolean isSetShowRowHeaders();

   void setShowRowHeaders(boolean var1);

   void xsetShowRowHeaders(XmlBoolean var1);

   void unsetShowRowHeaders();

   boolean getShowColHeaders();

   XmlBoolean xgetShowColHeaders();

   boolean isSetShowColHeaders();

   void setShowColHeaders(boolean var1);

   void xsetShowColHeaders(XmlBoolean var1);

   void unsetShowColHeaders();

   boolean getShowRowStripes();

   XmlBoolean xgetShowRowStripes();

   boolean isSetShowRowStripes();

   void setShowRowStripes(boolean var1);

   void xsetShowRowStripes(XmlBoolean var1);

   void unsetShowRowStripes();

   boolean getShowColStripes();

   XmlBoolean xgetShowColStripes();

   boolean isSetShowColStripes();

   void setShowColStripes(boolean var1);

   void xsetShowColStripes(XmlBoolean var1);

   void unsetShowColStripes();

   boolean getShowLastColumn();

   XmlBoolean xgetShowLastColumn();

   boolean isSetShowLastColumn();

   void setShowLastColumn(boolean var1);

   void xsetShowLastColumn(XmlBoolean var1);

   void unsetShowLastColumn();


   public static final class Factory {

      public static CTPivotTableStyle newInstance() {
         return (CTPivotTableStyle)POIXMLTypeLoader.newInstance(CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle newInstance(XmlOptions var0) {
         return (CTPivotTableStyle)POIXMLTypeLoader.newInstance(CTPivotTableStyle.type, var0);
      }

      public static CTPivotTableStyle parse(String var0) throws XmlException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static CTPivotTableStyle parse(File var0) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static CTPivotTableStyle parse(URL var0) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static CTPivotTableStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static CTPivotTableStyle parse(Reader var0) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static CTPivotTableStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static CTPivotTableStyle parse(Node var0) throws XmlException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static CTPivotTableStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static CTPivotTableStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotTableStyle)POIXMLTypeLoader.parse(var0, CTPivotTableStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotTableStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotTableStyle.type, var1);
      }

   }
}
