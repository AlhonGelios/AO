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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding;
import org.w3c.dom.Node;

public interface CTMap extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmap023btype");


   CTDataBinding getDataBinding();

   boolean isSetDataBinding();

   void setDataBinding(CTDataBinding var1);

   CTDataBinding addNewDataBinding();

   void unsetDataBinding();

   long getID();

   XmlUnsignedInt xgetID();

   void setID(long var1);

   void xsetID(XmlUnsignedInt var1);

   String getName();

   XmlString xgetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   String getRootElement();

   XmlString xgetRootElement();

   void setRootElement(String var1);

   void xsetRootElement(XmlString var1);

   String getSchemaID();

   XmlString xgetSchemaID();

   void setSchemaID(String var1);

   void xsetSchemaID(XmlString var1);

   boolean getShowImportExportValidationErrors();

   XmlBoolean xgetShowImportExportValidationErrors();

   void setShowImportExportValidationErrors(boolean var1);

   void xsetShowImportExportValidationErrors(XmlBoolean var1);

   boolean getAutoFit();

   XmlBoolean xgetAutoFit();

   void setAutoFit(boolean var1);

   void xsetAutoFit(XmlBoolean var1);

   boolean getAppend();

   XmlBoolean xgetAppend();

   void setAppend(boolean var1);

   void xsetAppend(XmlBoolean var1);

   boolean getPreserveSortAFLayout();

   XmlBoolean xgetPreserveSortAFLayout();

   void setPreserveSortAFLayout(boolean var1);

   void xsetPreserveSortAFLayout(XmlBoolean var1);

   boolean getPreserveFormat();

   XmlBoolean xgetPreserveFormat();

   void setPreserveFormat(boolean var1);

   void xsetPreserveFormat(XmlBoolean var1);


   public static final class Factory {

      public static CTMap newInstance() {
         return (CTMap)POIXMLTypeLoader.newInstance(CTMap.type, (XmlOptions)null);
      }

      public static CTMap newInstance(XmlOptions var0) {
         return (CTMap)POIXMLTypeLoader.newInstance(CTMap.type, var0);
      }

      public static CTMap parse(String var0) throws XmlException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static CTMap parse(File var0) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static CTMap parse(URL var0) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static CTMap parse(InputStream var0) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static CTMap parse(Reader var0) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static CTMap parse(XMLStreamReader var0) throws XmlException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static CTMap parse(Node var0) throws XmlException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static CTMap parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, (XmlOptions)null);
      }

      public static CTMap parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMap)POIXMLTypeLoader.parse(var0, CTMap.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMap.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMap.type, var1);
      }

   }
}
