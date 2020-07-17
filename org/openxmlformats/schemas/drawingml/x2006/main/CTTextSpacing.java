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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint;
import org.w3c.dom.Node;

public interface CTTextSpacing extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextSpacing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextspacingef87type");


   CTTextSpacingPercent getSpcPct();

   boolean isSetSpcPct();

   void setSpcPct(CTTextSpacingPercent var1);

   CTTextSpacingPercent addNewSpcPct();

   void unsetSpcPct();

   CTTextSpacingPoint getSpcPts();

   boolean isSetSpcPts();

   void setSpcPts(CTTextSpacingPoint var1);

   CTTextSpacingPoint addNewSpcPts();

   void unsetSpcPts();


   public static final class Factory {

      public static CTTextSpacing newInstance() {
         return (CTTextSpacing)POIXMLTypeLoader.newInstance(CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing newInstance(XmlOptions var0) {
         return (CTTextSpacing)POIXMLTypeLoader.newInstance(CTTextSpacing.type, var0);
      }

      public static CTTextSpacing parse(String var0) throws XmlException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static CTTextSpacing parse(File var0) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static CTTextSpacing parse(URL var0) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static CTTextSpacing parse(InputStream var0) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static CTTextSpacing parse(Reader var0) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static CTTextSpacing parse(XMLStreamReader var0) throws XmlException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static CTTextSpacing parse(Node var0) throws XmlException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static CTTextSpacing parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static CTTextSpacing parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextSpacing)POIXMLTypeLoader.parse(var0, CTTextSpacing.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextSpacing.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextSpacing.type, var1);
      }

   }
}
