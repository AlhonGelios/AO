package com.microsoft.schemas.vml;

import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STFillMethod;
import com.microsoft.schemas.vml.STFillMethod$Enum;
import com.microsoft.schemas.vml.STFillType;
import com.microsoft.schemas.vml.STFillType$Enum;
import com.microsoft.schemas.vml.STImageAspect;
import com.microsoft.schemas.vml.STImageAspect$Enum;
import com.microsoft.schemas.vml.STTrueFalse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlDecimal;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.w3c.dom.Node;

public interface CTFill extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFill.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfillb241type");


   com.microsoft.schemas.office.office.CTFill getFill();

   boolean isSetFill();

   void setFill(com.microsoft.schemas.office.office.CTFill var1);

   com.microsoft.schemas.office.office.CTFill addNewFill();

   void unsetFill();

   String getId();

   XmlString xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlString var1);

   void unsetId();

   STFillType$Enum getType();

   STFillType xgetType();

   boolean isSetType();

   void setType(STFillType$Enum var1);

   void xsetType(STFillType var1);

   void unsetType();

   STTrueFalse.Enum getOn();

   STTrueFalse xgetOn();

   boolean isSetOn();

   void setOn(STTrueFalse.Enum var1);

   void xsetOn(STTrueFalse var1);

   void unsetOn();

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

   String getColor2();

   STColorType xgetColor2();

   boolean isSetColor2();

   void setColor2(String var1);

   void xsetColor2(STColorType var1);

   void unsetColor2();

   String getSrc();

   XmlString xgetSrc();

   boolean isSetSrc();

   void setSrc(String var1);

   void xsetSrc(XmlString var1);

   void unsetSrc();

   String getHref();

   XmlString xgetHref();

   boolean isSetHref();

   void setHref(String var1);

   void xsetHref(XmlString var1);

   void unsetHref();

   String getAlthref();

   XmlString xgetAlthref();

   boolean isSetAlthref();

   void setAlthref(String var1);

   void xsetAlthref(XmlString var1);

   void unsetAlthref();

   String getSize();

   XmlString xgetSize();

   boolean isSetSize();

   void setSize(String var1);

   void xsetSize(XmlString var1);

   void unsetSize();

   String getOrigin();

   XmlString xgetOrigin();

   boolean isSetOrigin();

   void setOrigin(String var1);

   void xsetOrigin(XmlString var1);

   void unsetOrigin();

   String getPosition();

   XmlString xgetPosition();

   boolean isSetPosition();

   void setPosition(String var1);

   void xsetPosition(XmlString var1);

   void unsetPosition();

   STImageAspect$Enum getAspect();

   STImageAspect xgetAspect();

   boolean isSetAspect();

   void setAspect(STImageAspect$Enum var1);

   void xsetAspect(STImageAspect var1);

   void unsetAspect();

   String getColors();

   XmlString xgetColors();

   boolean isSetColors();

   void setColors(String var1);

   void xsetColors(XmlString var1);

   void unsetColors();

   BigDecimal getAngle();

   XmlDecimal xgetAngle();

   boolean isSetAngle();

   void setAngle(BigDecimal var1);

   void xsetAngle(XmlDecimal var1);

   void unsetAngle();

   STTrueFalse.Enum getAlignshape();

   STTrueFalse xgetAlignshape();

   boolean isSetAlignshape();

   void setAlignshape(STTrueFalse.Enum var1);

   void xsetAlignshape(STTrueFalse var1);

   void unsetAlignshape();

   String getFocus();

   XmlString xgetFocus();

   boolean isSetFocus();

   void setFocus(String var1);

   void xsetFocus(XmlString var1);

   void unsetFocus();

   String getFocussize();

   XmlString xgetFocussize();

   boolean isSetFocussize();

   void setFocussize(String var1);

   void xsetFocussize(XmlString var1);

   void unsetFocussize();

   String getFocusposition();

   XmlString xgetFocusposition();

   boolean isSetFocusposition();

   void setFocusposition(String var1);

   void xsetFocusposition(XmlString var1);

   void unsetFocusposition();

   STFillMethod$Enum getMethod();

   STFillMethod xgetMethod();

   boolean isSetMethod();

   void setMethod(STFillMethod$Enum var1);

   void xsetMethod(STFillMethod var1);

   void unsetMethod();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getDetectmouseclick();

   com.microsoft.schemas.office.office.STTrueFalse xgetDetectmouseclick();

   boolean isSetDetectmouseclick();

   void setDetectmouseclick(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetDetectmouseclick(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetDetectmouseclick();

   String getTitle();

   XmlString xgetTitle();

   boolean isSetTitle();

   void setTitle(String var1);

   void xsetTitle(XmlString var1);

   void unsetTitle();

   String getOpacity2();

   XmlString xgetOpacity2();

   boolean isSetOpacity2();

   void setOpacity2(String var1);

   void xsetOpacity2(XmlString var1);

   void unsetOpacity2();

   STTrueFalse.Enum getRecolor();

   STTrueFalse xgetRecolor();

   boolean isSetRecolor();

   void setRecolor(STTrueFalse.Enum var1);

   void xsetRecolor(STTrueFalse var1);

   void unsetRecolor();

   STTrueFalse.Enum getRotate();

   STTrueFalse xgetRotate();

   boolean isSetRotate();

   void setRotate(STTrueFalse.Enum var1);

   void xsetRotate(STTrueFalse var1);

   void unsetRotate();

   String getId2();

   STRelationshipId xgetId2();

   boolean isSetId2();

   void setId2(String var1);

   void xsetId2(STRelationshipId var1);

   void unsetId2();

   String getRelid();

   com.microsoft.schemas.office.office.STRelationshipId xgetRelid();

   boolean isSetRelid();

   void setRelid(String var1);

   void xsetRelid(com.microsoft.schemas.office.office.STRelationshipId var1);

   void unsetRelid();


   public static final class Factory {

      public static CTFill newInstance() {
         return (CTFill)POIXMLTypeLoader.newInstance(CTFill.type, (XmlOptions)null);
      }

      public static CTFill newInstance(XmlOptions var0) {
         return (CTFill)POIXMLTypeLoader.newInstance(CTFill.type, var0);
      }

      public static CTFill parse(String var0) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(File var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(URL var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(InputStream var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(Reader var0) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(XMLStreamReader var0) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(Node var0) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static CTFill parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, (XmlOptions)null);
      }

      public static CTFill parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFill)POIXMLTypeLoader.parse(var0, CTFill.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFill.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFill.type, var1);
      }

   }
}
