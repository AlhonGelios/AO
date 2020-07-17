package com.microsoft.schemas.vml;

import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STShadowType;
import com.microsoft.schemas.vml.STShadowType$Enum;
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

public interface CTShadow extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTShadow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshadowdfdetype");


   String getId();

   XmlString xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlString var1);

   void unsetId();

   STTrueFalse.Enum getOn();

   STTrueFalse xgetOn();

   boolean isSetOn();

   void setOn(STTrueFalse.Enum var1);

   void xsetOn(STTrueFalse var1);

   void unsetOn();

   STShadowType$Enum getType();

   STShadowType xgetType();

   boolean isSetType();

   void setType(STShadowType$Enum var1);

   void xsetType(STShadowType var1);

   void unsetType();

   STTrueFalse.Enum getObscured();

   STTrueFalse xgetObscured();

   boolean isSetObscured();

   void setObscured(STTrueFalse.Enum var1);

   void xsetObscured(STTrueFalse var1);

   void unsetObscured();

   String getColor();

   STColorType xgetColor();

   boolean isSetColor();

   void setColor(String var1);

   void xsetColor(STColorType var1);

   void unsetColor();

   String getOpacity();

   XmlString xgetOpacity();

   boolean isSetOpacity();

   void setOpacity(String var1);

   void xsetOpacity(XmlString var1);

   void unsetOpacity();

   String getOffset();

   XmlString xgetOffset();

   boolean isSetOffset();

   void setOffset(String var1);

   void xsetOffset(XmlString var1);

   void unsetOffset();

   String getColor2();

   STColorType xgetColor2();

   boolean isSetColor2();

   void setColor2(String var1);

   void xsetColor2(STColorType var1);

   void unsetColor2();

   String getOffset2();

   XmlString xgetOffset2();

   boolean isSetOffset2();

   void setOffset2(String var1);

   void xsetOffset2(XmlString var1);

   void unsetOffset2();

   String getOrigin();

   XmlString xgetOrigin();

   boolean isSetOrigin();

   void setOrigin(String var1);

   void xsetOrigin(XmlString var1);

   void unsetOrigin();

   String getMatrix();

   XmlString xgetMatrix();

   boolean isSetMatrix();

   void setMatrix(String var1);

   void xsetMatrix(XmlString var1);

   void unsetMatrix();


   public static final class Factory {

      public static CTShadow newInstance() {
         return (CTShadow)POIXMLTypeLoader.newInstance(CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow newInstance(XmlOptions var0) {
         return (CTShadow)POIXMLTypeLoader.newInstance(CTShadow.type, var0);
      }

      public static CTShadow parse(String var0) throws XmlException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(String var0, XmlOptions var1) throws XmlException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static CTShadow parse(File var0) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static CTShadow parse(URL var0) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static CTShadow parse(InputStream var0) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static CTShadow parse(Reader var0) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static CTShadow parse(XMLStreamReader var0) throws XmlException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static CTShadow parse(Node var0) throws XmlException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static CTShadow parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, (XmlOptions)null);
      }

      public static CTShadow parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTShadow)POIXMLTypeLoader.parse(var0, CTShadow.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShadow.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShadow.type, var1);
      }

   }
}
