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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell;
import org.w3c.dom.Node;

public interface CTMergeCells extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMergeCells.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmergecells1242type");


   List getMergeCellList();

   CTMergeCell[] getMergeCellArray();

   CTMergeCell getMergeCellArray(int var1);

   int sizeOfMergeCellArray();

   void setMergeCellArray(CTMergeCell[] var1);

   void setMergeCellArray(int var1, CTMergeCell var2);

   CTMergeCell insertNewMergeCell(int var1);

   CTMergeCell addNewMergeCell();

   void removeMergeCell(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTMergeCells newInstance() {
         return (CTMergeCells)POIXMLTypeLoader.newInstance(CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells newInstance(XmlOptions var0) {
         return (CTMergeCells)POIXMLTypeLoader.newInstance(CTMergeCells.type, var0);
      }

      public static CTMergeCells parse(String var0) throws XmlException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static CTMergeCells parse(File var0) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static CTMergeCells parse(URL var0) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static CTMergeCells parse(InputStream var0) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static CTMergeCells parse(Reader var0) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static CTMergeCells parse(XMLStreamReader var0) throws XmlException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static CTMergeCells parse(Node var0) throws XmlException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static CTMergeCells parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static CTMergeCells parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMergeCells)POIXMLTypeLoader.parse(var0, CTMergeCells.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMergeCells.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMergeCells.type, var1);
      }

   }
}
