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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline;
import org.w3c.dom.Node;

public interface CTUnderline extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTUnderline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctunderline8406type");


   STUnderline.Enum getVal();

   STUnderline xgetVal();

   boolean isSetVal();

   void setVal(STUnderline.Enum var1);

   void xsetVal(STUnderline var1);

   void unsetVal();

   Object getColor();

   STHexColor xgetColor();

   boolean isSetColor();

   void setColor(Object var1);

   void xsetColor(STHexColor var1);

   void unsetColor();

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

      public static CTUnderline newInstance() {
         return (CTUnderline)POIXMLTypeLoader.newInstance(CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline newInstance(XmlOptions var0) {
         return (CTUnderline)POIXMLTypeLoader.newInstance(CTUnderline.type, var0);
      }

      public static CTUnderline parse(String var0) throws XmlException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(String var0, XmlOptions var1) throws XmlException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static CTUnderline parse(File var0) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static CTUnderline parse(URL var0) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static CTUnderline parse(InputStream var0) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static CTUnderline parse(Reader var0) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static CTUnderline parse(XMLStreamReader var0) throws XmlException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static CTUnderline parse(Node var0) throws XmlException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static CTUnderline parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static CTUnderline parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTUnderline)POIXMLTypeLoader.parse(var0, CTUnderline.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTUnderline.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTUnderline.type, var1);
      }

   }
}
