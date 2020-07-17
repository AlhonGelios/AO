package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.w3c.dom.Node;

public interface CTRelativeRect extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRelativeRect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrelativerecta4ebtype");


   int getL();

   STPercentage xgetL();

   boolean isSetL();

   void setL(int var1);

   void xsetL(STPercentage var1);

   void unsetL();

   int getT();

   STPercentage xgetT();

   boolean isSetT();

   void setT(int var1);

   void xsetT(STPercentage var1);

   void unsetT();

   int getR();

   STPercentage xgetR();

   boolean isSetR();

   void setR(int var1);

   void xsetR(STPercentage var1);

   void unsetR();

   int getB();

   STPercentage xgetB();

   boolean isSetB();

   void setB(int var1);

   void xsetB(STPercentage var1);

   void unsetB();


   public static final class Factory {

      public static CTRelativeRect newInstance() {
         return (CTRelativeRect)POIXMLTypeLoader.newInstance(CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect newInstance(XmlOptions var0) {
         return (CTRelativeRect)POIXMLTypeLoader.newInstance(CTRelativeRect.type, var0);
      }

      public static CTRelativeRect parse(String var0) throws XmlException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static CTRelativeRect parse(File var0) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static CTRelativeRect parse(URL var0) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static CTRelativeRect parse(InputStream var0) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static CTRelativeRect parse(Reader var0) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static CTRelativeRect parse(XMLStreamReader var0) throws XmlException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static CTRelativeRect parse(Node var0) throws XmlException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static CTRelativeRect parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static CTRelativeRect parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRelativeRect)POIXMLTypeLoader.parse(var0, CTRelativeRect.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelativeRect.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRelativeRect.type, var1);
      }

   }
}
