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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.w3c.dom.Node;

public interface CTPictureLocking extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPictureLocking.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpicturelockinga414type");


   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getNoGrp();

   XmlBoolean xgetNoGrp();

   boolean isSetNoGrp();

   void setNoGrp(boolean var1);

   void xsetNoGrp(XmlBoolean var1);

   void unsetNoGrp();

   boolean getNoSelect();

   XmlBoolean xgetNoSelect();

   boolean isSetNoSelect();

   void setNoSelect(boolean var1);

   void xsetNoSelect(XmlBoolean var1);

   void unsetNoSelect();

   boolean getNoRot();

   XmlBoolean xgetNoRot();

   boolean isSetNoRot();

   void setNoRot(boolean var1);

   void xsetNoRot(XmlBoolean var1);

   void unsetNoRot();

   boolean getNoChangeAspect();

   XmlBoolean xgetNoChangeAspect();

   boolean isSetNoChangeAspect();

   void setNoChangeAspect(boolean var1);

   void xsetNoChangeAspect(XmlBoolean var1);

   void unsetNoChangeAspect();

   boolean getNoMove();

   XmlBoolean xgetNoMove();

   boolean isSetNoMove();

   void setNoMove(boolean var1);

   void xsetNoMove(XmlBoolean var1);

   void unsetNoMove();

   boolean getNoResize();

   XmlBoolean xgetNoResize();

   boolean isSetNoResize();

   void setNoResize(boolean var1);

   void xsetNoResize(XmlBoolean var1);

   void unsetNoResize();

   boolean getNoEditPoints();

   XmlBoolean xgetNoEditPoints();

   boolean isSetNoEditPoints();

   void setNoEditPoints(boolean var1);

   void xsetNoEditPoints(XmlBoolean var1);

   void unsetNoEditPoints();

   boolean getNoAdjustHandles();

   XmlBoolean xgetNoAdjustHandles();

   boolean isSetNoAdjustHandles();

   void setNoAdjustHandles(boolean var1);

   void xsetNoAdjustHandles(XmlBoolean var1);

   void unsetNoAdjustHandles();

   boolean getNoChangeArrowheads();

   XmlBoolean xgetNoChangeArrowheads();

   boolean isSetNoChangeArrowheads();

   void setNoChangeArrowheads(boolean var1);

   void xsetNoChangeArrowheads(XmlBoolean var1);

   void unsetNoChangeArrowheads();

   boolean getNoChangeShapeType();

   XmlBoolean xgetNoChangeShapeType();

   boolean isSetNoChangeShapeType();

   void setNoChangeShapeType(boolean var1);

   void xsetNoChangeShapeType(XmlBoolean var1);

   void unsetNoChangeShapeType();

   boolean getNoCrop();

   XmlBoolean xgetNoCrop();

   boolean isSetNoCrop();

   void setNoCrop(boolean var1);

   void xsetNoCrop(XmlBoolean var1);

   void unsetNoCrop();


   public static final class Factory {

      public static CTPictureLocking newInstance() {
         return (CTPictureLocking)POIXMLTypeLoader.newInstance(CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking newInstance(XmlOptions var0) {
         return (CTPictureLocking)POIXMLTypeLoader.newInstance(CTPictureLocking.type, var0);
      }

      public static CTPictureLocking parse(String var0) throws XmlException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static CTPictureLocking parse(File var0) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static CTPictureLocking parse(URL var0) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static CTPictureLocking parse(InputStream var0) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static CTPictureLocking parse(Reader var0) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static CTPictureLocking parse(XMLStreamReader var0) throws XmlException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static CTPictureLocking parse(Node var0) throws XmlException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static CTPictureLocking parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static CTPictureLocking parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPictureLocking)POIXMLTypeLoader.parse(var0, CTPictureLocking.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPictureLocking.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPictureLocking.type, var1);
      }

   }
}
