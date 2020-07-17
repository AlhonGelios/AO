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
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.w3c.dom.Node;

public interface CTShapeStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTShapeStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshapestyle81ebtype");


   CTStyleMatrixReference getLnRef();

   void setLnRef(CTStyleMatrixReference var1);

   CTStyleMatrixReference addNewLnRef();

   CTStyleMatrixReference getFillRef();

   void setFillRef(CTStyleMatrixReference var1);

   CTStyleMatrixReference addNewFillRef();

   CTStyleMatrixReference getEffectRef();

   void setEffectRef(CTStyleMatrixReference var1);

   CTStyleMatrixReference addNewEffectRef();

   CTFontReference getFontRef();

   void setFontRef(CTFontReference var1);

   CTFontReference addNewFontRef();


   public static final class Factory {

      public static CTShapeStyle newInstance() {
         return (CTShapeStyle)POIXMLTypeLoader.newInstance(CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle newInstance(XmlOptions var0) {
         return (CTShapeStyle)POIXMLTypeLoader.newInstance(CTShapeStyle.type, var0);
      }

      public static CTShapeStyle parse(String var0) throws XmlException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static CTShapeStyle parse(File var0) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static CTShapeStyle parse(URL var0) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static CTShapeStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static CTShapeStyle parse(Reader var0) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static CTShapeStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static CTShapeStyle parse(Node var0) throws XmlException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static CTShapeStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static CTShapeStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTShapeStyle)POIXMLTypeLoader.parse(var0, CTShapeStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeStyle.type, var1);
      }

   }
}
