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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber;
import org.w3c.dom.Node;

public interface CTShd extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTShd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshd58c3type");


   STShd.Enum getVal();

   STShd xgetVal();

   void setVal(STShd.Enum var1);

   void xsetVal(STShd var1);

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

   Object getFill();

   STHexColor xgetFill();

   boolean isSetFill();

   void setFill(Object var1);

   void xsetFill(STHexColor var1);

   void unsetFill();

   STThemeColor$Enum getThemeFill();

   STThemeColor xgetThemeFill();

   boolean isSetThemeFill();

   void setThemeFill(STThemeColor$Enum var1);

   void xsetThemeFill(STThemeColor var1);

   void unsetThemeFill();

   byte[] getThemeFillTint();

   STUcharHexNumber xgetThemeFillTint();

   boolean isSetThemeFillTint();

   void setThemeFillTint(byte[] var1);

   void xsetThemeFillTint(STUcharHexNumber var1);

   void unsetThemeFillTint();

   byte[] getThemeFillShade();

   STUcharHexNumber xgetThemeFillShade();

   boolean isSetThemeFillShade();

   void setThemeFillShade(byte[] var1);

   void xsetThemeFillShade(STUcharHexNumber var1);

   void unsetThemeFillShade();


   public static final class Factory {

      public static CTShd newInstance() {
         return (CTShd)POIXMLTypeLoader.newInstance(CTShd.type, (XmlOptions)null);
      }

      public static CTShd newInstance(XmlOptions var0) {
         return (CTShd)POIXMLTypeLoader.newInstance(CTShd.type, var0);
      }

      public static CTShd parse(String var0) throws XmlException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(String var0, XmlOptions var1) throws XmlException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static CTShd parse(File var0) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static CTShd parse(URL var0) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static CTShd parse(InputStream var0) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static CTShd parse(Reader var0) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static CTShd parse(XMLStreamReader var0) throws XmlException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static CTShd parse(Node var0) throws XmlException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static CTShd parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, (XmlOptions)null);
      }

      public static CTShd parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTShd)POIXMLTypeLoader.parse(var0, CTShd.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShd.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShd.type, var1);
      }

   }
}
