package com.microsoft.schemas.vml;

import com.microsoft.schemas.vml.STTrueFalse;
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
import org.w3c.dom.Node;

public interface CTTextPath extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextPath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextpath14f0type");


   String getId();

   XmlString xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlString var1);

   void unsetId();

   String getStyle();

   XmlString xgetStyle();

   boolean isSetStyle();

   void setStyle(String var1);

   void xsetStyle(XmlString var1);

   void unsetStyle();

   STTrueFalse.Enum getOn();

   STTrueFalse xgetOn();

   boolean isSetOn();

   void setOn(STTrueFalse.Enum var1);

   void xsetOn(STTrueFalse var1);

   void unsetOn();

   STTrueFalse.Enum getFitshape();

   STTrueFalse xgetFitshape();

   boolean isSetFitshape();

   void setFitshape(STTrueFalse.Enum var1);

   void xsetFitshape(STTrueFalse var1);

   void unsetFitshape();

   STTrueFalse.Enum getFitpath();

   STTrueFalse xgetFitpath();

   boolean isSetFitpath();

   void setFitpath(STTrueFalse.Enum var1);

   void xsetFitpath(STTrueFalse var1);

   void unsetFitpath();

   STTrueFalse.Enum getTrim();

   STTrueFalse xgetTrim();

   boolean isSetTrim();

   void setTrim(STTrueFalse.Enum var1);

   void xsetTrim(STTrueFalse var1);

   void unsetTrim();

   STTrueFalse.Enum getXscale();

   STTrueFalse xgetXscale();

   boolean isSetXscale();

   void setXscale(STTrueFalse.Enum var1);

   void xsetXscale(STTrueFalse var1);

   void unsetXscale();

   String getString();

   XmlString xgetString();

   boolean isSetString();

   void setString(String var1);

   void xsetString(XmlString var1);

   void unsetString();


   public static final class Factory {

      public static CTTextPath newInstance() {
         return (CTTextPath)POIXMLTypeLoader.newInstance(CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath newInstance(XmlOptions var0) {
         return (CTTextPath)POIXMLTypeLoader.newInstance(CTTextPath.type, var0);
      }

      public static CTTextPath parse(String var0) throws XmlException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static CTTextPath parse(File var0) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static CTTextPath parse(URL var0) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static CTTextPath parse(InputStream var0) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static CTTextPath parse(Reader var0) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static CTTextPath parse(XMLStreamReader var0) throws XmlException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static CTTextPath parse(Node var0) throws XmlException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static CTTextPath parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static CTTextPath parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextPath)POIXMLTypeLoader.parse(var0, CTTextPath.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextPath.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextPath.type, var1);
      }

   }
}
