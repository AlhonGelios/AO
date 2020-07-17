package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline;
import org.w3c.dom.Node;

public interface CTDrawing extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDrawing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdrawing8d34type");


   List getAnchorList();

   CTAnchor[] getAnchorArray();

   CTAnchor getAnchorArray(int var1);

   int sizeOfAnchorArray();

   void setAnchorArray(CTAnchor[] var1);

   void setAnchorArray(int var1, CTAnchor var2);

   CTAnchor insertNewAnchor(int var1);

   CTAnchor addNewAnchor();

   void removeAnchor(int var1);

   List getInlineList();

   CTInline[] getInlineArray();

   CTInline getInlineArray(int var1);

   int sizeOfInlineArray();

   void setInlineArray(CTInline[] var1);

   void setInlineArray(int var1, CTInline var2);

   CTInline insertNewInline(int var1);

   CTInline addNewInline();

   void removeInline(int var1);


   public static final class Factory {

      public static CTDrawing newInstance() {
         return (CTDrawing)POIXMLTypeLoader.newInstance(CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing newInstance(XmlOptions var0) {
         return (CTDrawing)POIXMLTypeLoader.newInstance(CTDrawing.type, var0);
      }

      public static CTDrawing parse(String var0) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(File var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(URL var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(InputStream var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(Reader var0) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(XMLStreamReader var0) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(Node var0) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static CTDrawing parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static CTDrawing parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDrawing)POIXMLTypeLoader.parse(var0, CTDrawing.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDrawing.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDrawing.type, var1);
      }

   }
}
