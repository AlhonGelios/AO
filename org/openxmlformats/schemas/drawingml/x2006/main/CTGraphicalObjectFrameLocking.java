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

public interface CTGraphicalObjectFrameLocking extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGraphicalObjectFrameLocking.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgraphicalobjectframelocking42adtype");


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

   boolean getNoDrilldown();

   XmlBoolean xgetNoDrilldown();

   boolean isSetNoDrilldown();

   void setNoDrilldown(boolean var1);

   void xsetNoDrilldown(XmlBoolean var1);

   void unsetNoDrilldown();

   boolean getNoSelect();

   XmlBoolean xgetNoSelect();

   boolean isSetNoSelect();

   void setNoSelect(boolean var1);

   void xsetNoSelect(XmlBoolean var1);

   void unsetNoSelect();

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


   public static final class Factory {

      public static CTGraphicalObjectFrameLocking newInstance() {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.newInstance(CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking newInstance(XmlOptions var0) {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.newInstance(CTGraphicalObjectFrameLocking.type, var0);
      }

      public static CTGraphicalObjectFrameLocking parse(String var0) throws XmlException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static CTGraphicalObjectFrameLocking parse(File var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static CTGraphicalObjectFrameLocking parse(URL var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static CTGraphicalObjectFrameLocking parse(InputStream var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static CTGraphicalObjectFrameLocking parse(Reader var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static CTGraphicalObjectFrameLocking parse(XMLStreamReader var0) throws XmlException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static CTGraphicalObjectFrameLocking parse(Node var0) throws XmlException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static CTGraphicalObjectFrameLocking parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameLocking parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGraphicalObjectFrameLocking)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObjectFrameLocking.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObjectFrameLocking.type, var1);
      }

   }
}
