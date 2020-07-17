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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.w3c.dom.Node;

public interface CTPBdr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPBdr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpbdre388type");


   CTBorder getTop();

   boolean isSetTop();

   void setTop(CTBorder var1);

   CTBorder addNewTop();

   void unsetTop();

   CTBorder getLeft();

   boolean isSetLeft();

   void setLeft(CTBorder var1);

   CTBorder addNewLeft();

   void unsetLeft();

   CTBorder getBottom();

   boolean isSetBottom();

   void setBottom(CTBorder var1);

   CTBorder addNewBottom();

   void unsetBottom();

   CTBorder getRight();

   boolean isSetRight();

   void setRight(CTBorder var1);

   CTBorder addNewRight();

   void unsetRight();

   CTBorder getBetween();

   boolean isSetBetween();

   void setBetween(CTBorder var1);

   CTBorder addNewBetween();

   void unsetBetween();

   CTBorder getBar();

   boolean isSetBar();

   void setBar(CTBorder var1);

   CTBorder addNewBar();

   void unsetBar();


   public static final class Factory {

      public static CTPBdr newInstance() {
         return (CTPBdr)POIXMLTypeLoader.newInstance(CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr newInstance(XmlOptions var0) {
         return (CTPBdr)POIXMLTypeLoader.newInstance(CTPBdr.type, var0);
      }

      public static CTPBdr parse(String var0) throws XmlException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static CTPBdr parse(File var0) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static CTPBdr parse(URL var0) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static CTPBdr parse(InputStream var0) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static CTPBdr parse(Reader var0) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static CTPBdr parse(XMLStreamReader var0) throws XmlException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static CTPBdr parse(Node var0) throws XmlException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static CTPBdr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static CTPBdr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPBdr)POIXMLTypeLoader.parse(var0, CTPBdr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPBdr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPBdr.type, var1);
      }

   }
}
