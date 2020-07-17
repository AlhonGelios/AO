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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId;
import org.w3c.dom.Node;

public interface CTNonVisualDrawingProps extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNonVisualDrawingProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnonvisualdrawingprops8fb0type");


   CTHyperlink getHlinkClick();

   boolean isSetHlinkClick();

   void setHlinkClick(CTHyperlink var1);

   CTHyperlink addNewHlinkClick();

   void unsetHlinkClick();

   CTHyperlink getHlinkHover();

   boolean isSetHlinkHover();

   void setHlinkHover(CTHyperlink var1);

   CTHyperlink addNewHlinkHover();

   void unsetHlinkHover();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   STDrawingElementId xgetId();

   void setId(long var1);

   void xsetId(STDrawingElementId var1);

   String getName();

   XmlString xgetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   String getDescr();

   XmlString xgetDescr();

   boolean isSetDescr();

   void setDescr(String var1);

   void xsetDescr(XmlString var1);

   void unsetDescr();

   boolean getHidden();

   XmlBoolean xgetHidden();

   boolean isSetHidden();

   void setHidden(boolean var1);

   void xsetHidden(XmlBoolean var1);

   void unsetHidden();


   public static final class Factory {

      public static CTNonVisualDrawingProps newInstance() {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.newInstance(CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps newInstance(XmlOptions var0) {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.newInstance(CTNonVisualDrawingProps.type, var0);
      }

      public static CTNonVisualDrawingProps parse(String var0) throws XmlException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static CTNonVisualDrawingProps parse(File var0) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static CTNonVisualDrawingProps parse(URL var0) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static CTNonVisualDrawingProps parse(InputStream var0) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static CTNonVisualDrawingProps parse(Reader var0) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static CTNonVisualDrawingProps parse(XMLStreamReader var0) throws XmlException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static CTNonVisualDrawingProps parse(Node var0) throws XmlException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static CTNonVisualDrawingProps parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingProps parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNonVisualDrawingProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingProps.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualDrawingProps.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualDrawingProps.type, var1);
      }

   }
}
