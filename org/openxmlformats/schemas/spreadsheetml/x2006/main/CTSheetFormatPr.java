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

public interface CTSheetFormatPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheetFormatPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheetformatprdef7type");


   long getBaseColWidth();

   XmlUnsignedInt xgetBaseColWidth();

   boolean isSetBaseColWidth();

   void setBaseColWidth(long var1);

   void xsetBaseColWidth(XmlUnsignedInt var1);

   void unsetBaseColWidth();

   double getDefaultColWidth();

   XmlDouble xgetDefaultColWidth();

   boolean isSetDefaultColWidth();

   void setDefaultColWidth(double var1);

   void xsetDefaultColWidth(XmlDouble var1);

   void unsetDefaultColWidth();

   double getDefaultRowHeight();

   XmlDouble xgetDefaultRowHeight();

   void setDefaultRowHeight(double var1);

   void xsetDefaultRowHeight(XmlDouble var1);

   boolean getCustomHeight();

   XmlBoolean xgetCustomHeight();

   boolean isSetCustomHeight();

   void setCustomHeight(boolean var1);

   void xsetCustomHeight(XmlBoolean var1);

   void unsetCustomHeight();

   boolean getZeroHeight();

   XmlBoolean xgetZeroHeight();

   boolean isSetZeroHeight();

   void setZeroHeight(boolean var1);

   void xsetZeroHeight(XmlBoolean var1);

   void unsetZeroHeight();

   boolean getThickTop();

   XmlBoolean xgetThickTop();

   boolean isSetThickTop();

   void setThickTop(boolean var1);

   void xsetThickTop(XmlBoolean var1);

   void unsetThickTop();

   boolean getThickBottom();

   XmlBoolean xgetThickBottom();

   boolean isSetThickBottom();

   void setThickBottom(boolean var1);

   void xsetThickBottom(XmlBoolean var1);

   void unsetThickBottom();

   short getOutlineLevelRow();

   XmlUnsignedByte xgetOutlineLevelRow();

   boolean isSetOutlineLevelRow();

   void setOutlineLevelRow(short var1);

   void xsetOutlineLevelRow(XmlUnsignedByte var1);

   void unsetOutlineLevelRow();

   short getOutlineLevelCol();

   XmlUnsignedByte xgetOutlineLevelCol();

   boolean isSetOutlineLevelCol();

   void setOutlineLevelCol(short var1);

   void xsetOutlineLevelCol(XmlUnsignedByte var1);

   void unsetOutlineLevelCol();


   public static final class Factory {

      public static CTSheetFormatPr newInstance() {
         return (CTSheetFormatPr)POIXMLTypeLoader.newInstance(CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr newInstance(XmlOptions var0) {
         return (CTSheetFormatPr)POIXMLTypeLoader.newInstance(CTSheetFormatPr.type, var0);
      }

      public static CTSheetFormatPr parse(String var0) throws XmlException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static CTSheetFormatPr parse(File var0) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static CTSheetFormatPr parse(URL var0) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static CTSheetFormatPr parse(InputStream var0) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static CTSheetFormatPr parse(Reader var0) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static CTSheetFormatPr parse(XMLStreamReader var0) throws XmlException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static CTSheetFormatPr parse(Node var0) throws XmlException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static CTSheetFormatPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static CTSheetFormatPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheetFormatPr)POIXMLTypeLoader.parse(var0, CTSheetFormatPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetFormatPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetFormatPr.type, var1);
      }

   }
}
