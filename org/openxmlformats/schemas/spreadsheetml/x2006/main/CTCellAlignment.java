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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment;
import org.w3c.dom.Node;

public interface CTCellAlignment extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCellAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcellalignmentb580type");


   STHorizontalAlignment.Enum getHorizontal();

   STHorizontalAlignment xgetHorizontal();

   boolean isSetHorizontal();

   void setHorizontal(STHorizontalAlignment.Enum var1);

   void xsetHorizontal(STHorizontalAlignment var1);

   void unsetHorizontal();

   STVerticalAlignment.Enum getVertical();

   STVerticalAlignment xgetVertical();

   boolean isSetVertical();

   void setVertical(STVerticalAlignment.Enum var1);

   void xsetVertical(STVerticalAlignment var1);

   void unsetVertical();

   long getTextRotation();

   XmlUnsignedInt xgetTextRotation();

   boolean isSetTextRotation();

   void setTextRotation(long var1);

   void xsetTextRotation(XmlUnsignedInt var1);

   void unsetTextRotation();

   boolean getWrapText();

   XmlBoolean xgetWrapText();

   boolean isSetWrapText();

   void setWrapText(boolean var1);

   void xsetWrapText(XmlBoolean var1);

   void unsetWrapText();

   long getIndent();

   XmlUnsignedInt xgetIndent();

   boolean isSetIndent();

   void setIndent(long var1);

   void xsetIndent(XmlUnsignedInt var1);

   void unsetIndent();

   int getRelativeIndent();

   XmlInt xgetRelativeIndent();

   boolean isSetRelativeIndent();

   void setRelativeIndent(int var1);

   void xsetRelativeIndent(XmlInt var1);

   void unsetRelativeIndent();

   boolean getJustifyLastLine();

   XmlBoolean xgetJustifyLastLine();

   boolean isSetJustifyLastLine();

   void setJustifyLastLine(boolean var1);

   void xsetJustifyLastLine(XmlBoolean var1);

   void unsetJustifyLastLine();

   boolean getShrinkToFit();

   XmlBoolean xgetShrinkToFit();

   boolean isSetShrinkToFit();

   void setShrinkToFit(boolean var1);

   void xsetShrinkToFit(XmlBoolean var1);

   void unsetShrinkToFit();

   long getReadingOrder();

   XmlUnsignedInt xgetReadingOrder();

   boolean isSetReadingOrder();

   void setReadingOrder(long var1);

   void xsetReadingOrder(XmlUnsignedInt var1);

   void unsetReadingOrder();


   public static final class Factory {

      public static CTCellAlignment newInstance() {
         return (CTCellAlignment)POIXMLTypeLoader.newInstance(CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment newInstance(XmlOptions var0) {
         return (CTCellAlignment)POIXMLTypeLoader.newInstance(CTCellAlignment.type, var0);
      }

      public static CTCellAlignment parse(String var0) throws XmlException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static CTCellAlignment parse(File var0) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static CTCellAlignment parse(URL var0) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static CTCellAlignment parse(InputStream var0) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static CTCellAlignment parse(Reader var0) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static CTCellAlignment parse(XMLStreamReader var0) throws XmlException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static CTCellAlignment parse(Node var0) throws XmlException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static CTCellAlignment parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static CTCellAlignment parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCellAlignment)POIXMLTypeLoader.parse(var0, CTCellAlignment.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellAlignment.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCellAlignment.type, var1);
      }

   }
}
