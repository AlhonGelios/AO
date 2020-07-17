package com.microsoft.schemas.vml;

import com.microsoft.schemas.office.office.STInsetMode;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent;
import org.w3c.dom.Node;

public interface CTTextbox extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextbox.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextboxf712type");


   CTTxbxContent getTxbxContent();

   boolean isSetTxbxContent();

   void setTxbxContent(CTTxbxContent var1);

   CTTxbxContent addNewTxbxContent();

   void unsetTxbxContent();

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

   String getInset();

   XmlString xgetInset();

   boolean isSetInset();

   void setInset(String var1);

   void xsetInset(XmlString var1);

   void unsetInset();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getSingleclick();

   com.microsoft.schemas.office.office.STTrueFalse xgetSingleclick();

   boolean isSetSingleclick();

   void setSingleclick(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetSingleclick(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetSingleclick();

   STInsetMode.Enum getInsetmode();

   STInsetMode xgetInsetmode();

   boolean isSetInsetmode();

   void setInsetmode(STInsetMode.Enum var1);

   void xsetInsetmode(STInsetMode var1);

   void unsetInsetmode();


   public static final class Factory {

      public static CTTextbox newInstance() {
         return (CTTextbox)POIXMLTypeLoader.newInstance(CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox newInstance(XmlOptions var0) {
         return (CTTextbox)POIXMLTypeLoader.newInstance(CTTextbox.type, var0);
      }

      public static CTTextbox parse(String var0) throws XmlException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static CTTextbox parse(File var0) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static CTTextbox parse(URL var0) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static CTTextbox parse(InputStream var0) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static CTTextbox parse(Reader var0) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static CTTextbox parse(XMLStreamReader var0) throws XmlException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static CTTextbox parse(Node var0) throws XmlException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static CTTextbox parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static CTTextbox parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextbox)POIXMLTypeLoader.parse(var0, CTTextbox.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextbox.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextbox.type, var1);
      }

   }
}
