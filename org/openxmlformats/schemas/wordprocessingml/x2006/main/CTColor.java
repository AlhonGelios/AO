package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber;
import org.w3c.dom.Node;

public interface CTColor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTColor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcolor6d4ftype");


   Object getVal();

   STHexColor xgetVal();

   void setVal(Object var1);

   void xsetVal(STHexColor var1);

   STThemeColor$Enum getThemeColor();

   STThemeColor xgetThemeColor();

   boolean isSetThemeColor();

   void setThemeColor(STThemeColor$Enum var1);

   void xsetThemeColor(STThemeColor var1);

   void unsetThemeColor();

   byte[] getThemeTint();

   STUcharHexNumber xgetThemeTint();

   boolean isSetThemeTint();

   void setThemeTint(byte[] var1);

   void xsetThemeTint(STUcharHexNumber var1);

   void unsetThemeTint();

   byte[] getThemeShade();

   STUcharHexNumber xgetThemeShade();

   boolean isSetThemeShade();

   void setThemeShade(byte[] var1);

   void xsetThemeShade(STUcharHexNumber var1);

   void unsetThemeShade();


   public static final class Factory {

      public static CTColor newInstance() {
         return (CTColor)POIXMLTypeLoader.newInstance(CTColor.type, (XmlOptions)null);
      }

      public static CTColor newInstance(XmlOptions var0) {
         return (CTColor)POIXMLTypeLoader.newInstance(CTColor.type, var0);
      }

      public static CTColor parse(String var0) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(File var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(URL var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(InputStream var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(Reader var0) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(XMLStreamReader var0) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(Node var0) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static CTColor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, (XmlOptions)null);
      }

      public static CTColor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTColor)POIXMLTypeLoader.parse(var0, CTColor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColor.type, var1);
      }

   }
}
