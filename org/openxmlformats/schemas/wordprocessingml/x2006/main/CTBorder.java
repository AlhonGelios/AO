package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber;
import org.w3c.dom.Node;

public interface CTBorder extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBorder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbordercdfctype");


   STBorder.Enum getVal();

   STBorder xgetVal();

   void setVal(STBorder.Enum var1);

   void xsetVal(STBorder var1);

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

   BigInteger getSz();

   STEighthPointMeasure xgetSz();

   boolean isSetSz();

   void setSz(BigInteger var1);

   void xsetSz(STEighthPointMeasure var1);

   void unsetSz();

   BigInteger getSpace();

   STPointMeasure xgetSpace();

   boolean isSetSpace();

   void setSpace(BigInteger var1);

   void xsetSpace(STPointMeasure var1);

   void unsetSpace();

   STOnOff.Enum getShadow();

   STOnOff xgetShadow();

   boolean isSetShadow();

   void setShadow(STOnOff.Enum var1);

   void xsetShadow(STOnOff var1);

   void unsetShadow();

   STOnOff.Enum getFrame();

   STOnOff xgetFrame();

   boolean isSetFrame();

   void setFrame(STOnOff.Enum var1);

   void xsetFrame(STOnOff var1);

   void unsetFrame();


   public static final class Factory {

      public static CTBorder newInstance() {
         return (CTBorder)POIXMLTypeLoader.newInstance(CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder newInstance(XmlOptions var0) {
         return (CTBorder)POIXMLTypeLoader.newInstance(CTBorder.type, var0);
      }

      public static CTBorder parse(String var0) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(File var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(URL var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(InputStream var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(Reader var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(XMLStreamReader var0) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(Node var0) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorder.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorder.type, var1);
      }

   }
}
