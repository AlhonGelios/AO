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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList;
import org.w3c.dom.Node;

public interface CTStyleMatrix extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStyleMatrix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstylematrix1903type");


   CTFillStyleList getFillStyleLst();

   void setFillStyleLst(CTFillStyleList var1);

   CTFillStyleList addNewFillStyleLst();

   CTLineStyleList getLnStyleLst();

   void setLnStyleLst(CTLineStyleList var1);

   CTLineStyleList addNewLnStyleLst();

   CTEffectStyleList getEffectStyleLst();

   void setEffectStyleLst(CTEffectStyleList var1);

   CTEffectStyleList addNewEffectStyleLst();

   CTBackgroundFillStyleList getBgFillStyleLst();

   void setBgFillStyleLst(CTBackgroundFillStyleList var1);

   CTBackgroundFillStyleList addNewBgFillStyleLst();

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();


   public static final class Factory {

      public static CTStyleMatrix newInstance() {
         return (CTStyleMatrix)POIXMLTypeLoader.newInstance(CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix newInstance(XmlOptions var0) {
         return (CTStyleMatrix)POIXMLTypeLoader.newInstance(CTStyleMatrix.type, var0);
      }

      public static CTStyleMatrix parse(String var0) throws XmlException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static CTStyleMatrix parse(File var0) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static CTStyleMatrix parse(URL var0) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static CTStyleMatrix parse(InputStream var0) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static CTStyleMatrix parse(Reader var0) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static CTStyleMatrix parse(XMLStreamReader var0) throws XmlException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static CTStyleMatrix parse(Node var0) throws XmlException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static CTStyleMatrix parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static CTStyleMatrix parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStyleMatrix)POIXMLTypeLoader.parse(var0, CTStyleMatrix.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyleMatrix.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyleMatrix.type, var1);
      }

   }
}
