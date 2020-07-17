package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.w3c.dom.Node;

public interface CTTcPrInner extends CTTcPrBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTcPrInner.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttcprinnerc56dtype");


   CTTrackChange getCellIns();

   boolean isSetCellIns();

   void setCellIns(CTTrackChange var1);

   CTTrackChange addNewCellIns();

   void unsetCellIns();

   CTTrackChange getCellDel();

   boolean isSetCellDel();

   void setCellDel(CTTrackChange var1);

   CTTrackChange addNewCellDel();

   void unsetCellDel();

   CTCellMergeTrackChange getCellMerge();

   boolean isSetCellMerge();

   void setCellMerge(CTCellMergeTrackChange var1);

   CTCellMergeTrackChange addNewCellMerge();

   void unsetCellMerge();


   public static final class Factory {

      public static CTTcPrInner newInstance() {
         return (CTTcPrInner)POIXMLTypeLoader.newInstance(CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner newInstance(XmlOptions var0) {
         return (CTTcPrInner)POIXMLTypeLoader.newInstance(CTTcPrInner.type, var0);
      }

      public static CTTcPrInner parse(String var0) throws XmlException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static CTTcPrInner parse(File var0) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static CTTcPrInner parse(URL var0) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static CTTcPrInner parse(InputStream var0) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static CTTcPrInner parse(Reader var0) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static CTTcPrInner parse(XMLStreamReader var0) throws XmlException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static CTTcPrInner parse(Node var0) throws XmlException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static CTTcPrInner parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static CTTcPrInner parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTcPrInner)POIXMLTypeLoader.parse(var0, CTTcPrInner.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcPrInner.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcPrInner.type, var1);
      }

   }
}
