package com.microsoft.schemas.vml;

import com.microsoft.schemas.office.office.CTStrokeChild;
import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STFillType;
import com.microsoft.schemas.vml.STFillType$Enum;
import com.microsoft.schemas.vml.STImageAspect;
import com.microsoft.schemas.vml.STImageAspect$Enum;
import com.microsoft.schemas.vml.STStrokeArrowLength;
import com.microsoft.schemas.vml.STStrokeArrowLength$Enum;
import com.microsoft.schemas.vml.STStrokeArrowType;
import com.microsoft.schemas.vml.STStrokeArrowType$Enum;
import com.microsoft.schemas.vml.STStrokeArrowWidth;
import com.microsoft.schemas.vml.STStrokeArrowWidth$Enum;
import com.microsoft.schemas.vml.STStrokeEndCap;
import com.microsoft.schemas.vml.STStrokeEndCap$Enum;
import com.microsoft.schemas.vml.STStrokeJoinStyle;
import com.microsoft.schemas.vml.STStrokeLineStyle;
import com.microsoft.schemas.vml.STStrokeLineStyle$Enum;
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

public interface CTStroke extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStroke.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstrokee2f6type");


   CTStrokeChild getLeft();

   boolean isSetLeft();

   void setLeft(CTStrokeChild var1);

   CTStrokeChild addNewLeft();

   void unsetLeft();

   CTStrokeChild getTop();

   boolean isSetTop();

   void setTop(CTStrokeChild var1);

   CTStrokeChild addNewTop();

   void unsetTop();

   CTStrokeChild getRight();

   boolean isSetRight();

   void setRight(CTStrokeChild var1);

   CTStrokeChild addNewRight();

   void unsetRight();

   CTStrokeChild getBottom();

   boolean isSetBottom();

   void setBottom(CTStrokeChild var1);

   CTStrokeChild addNewBottom();

   void unsetBottom();

   CTStrokeChild getColumn();

   boolean isSetColumn();

   void setColumn(CTStrokeChild var1);

   CTStrokeChild addNewColumn();

   void unsetColumn();

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

   String getWeight();

   XmlString xgetWeight();

   boolean isSetWeight();

   void setWeight(String var1);

   void xsetWeight(XmlString var1);

   void unsetWeight();

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

   STStrokeLineStyle$Enum getLinestyle();

   STStrokeLineStyle xgetLinestyle();

   boolean isSetLinestyle();

   void setLinestyle(STStrokeLineStyle$Enum var1);

   void xsetLinestyle(STStrokeLineStyle var1);

   void unsetLinestyle();

   BigDecimal getMiterlimit();

   XmlDecimal xgetMiterlimit();

   boolean isSetMiterlimit();

   void setMiterlimit(BigDecimal var1);

   void xsetMiterlimit(XmlDecimal var1);

   void unsetMiterlimit();

   STStrokeJoinStyle.Enum getJoinstyle();

   STStrokeJoinStyle xgetJoinstyle();

   boolean isSetJoinstyle();

   void setJoinstyle(STStrokeJoinStyle.Enum var1);

   void xsetJoinstyle(STStrokeJoinStyle var1);

   void unsetJoinstyle();

   STStrokeEndCap$Enum getEndcap();

   STStrokeEndCap xgetEndcap();

   boolean isSetEndcap();

   void setEndcap(STStrokeEndCap$Enum var1);

   void xsetEndcap(STStrokeEndCap var1);

   void unsetEndcap();

   String getDashstyle();

   XmlString xgetDashstyle();

   boolean isSetDashstyle();

   void setDashstyle(String var1);

   void xsetDashstyle(XmlString var1);

   void unsetDashstyle();

   STFillType$Enum getFilltype();

   STFillType xgetFilltype();

   boolean isSetFilltype();

   void setFilltype(STFillType$Enum var1);

   void xsetFilltype(STFillType var1);

   void unsetFilltype();

   String getSrc();

   XmlString xgetSrc();

   boolean isSetSrc();

   void setSrc(String var1);

   void xsetSrc(XmlString var1);

   void unsetSrc();

   STImageAspect$Enum getImageaspect();

   STImageAspect xgetImageaspect();

   boolean isSetImageaspect();

   void setImageaspect(STImageAspect$Enum var1);

   void xsetImageaspect(STImageAspect var1);

   void unsetImageaspect();

   String getImagesize();

   XmlString xgetImagesize();

   boolean isSetImagesize();

   void setImagesize(String var1);

   void xsetImagesize(XmlString var1);

   void unsetImagesize();

   STTrueFalse.Enum getImagealignshape();

   STTrueFalse xgetImagealignshape();

   boolean isSetImagealignshape();

   void setImagealignshape(STTrueFalse.Enum var1);

   void xsetImagealignshape(STTrueFalse var1);

   void unsetImagealignshape();

   String getColor2();

   STColorType xgetColor2();

   boolean isSetColor2();

   void setColor2(String var1);

   void xsetColor2(STColorType var1);

   void unsetColor2();

   STStrokeArrowType$Enum getStartarrow();

   STStrokeArrowType xgetStartarrow();

   boolean isSetStartarrow();

   void setStartarrow(STStrokeArrowType$Enum var1);

   void xsetStartarrow(STStrokeArrowType var1);

   void unsetStartarrow();

   STStrokeArrowWidth$Enum getStartarrowwidth();

   STStrokeArrowWidth xgetStartarrowwidth();

   boolean isSetStartarrowwidth();

   void setStartarrowwidth(STStrokeArrowWidth$Enum var1);

   void xsetStartarrowwidth(STStrokeArrowWidth var1);

   void unsetStartarrowwidth();

   STStrokeArrowLength$Enum getStartarrowlength();

   STStrokeArrowLength xgetStartarrowlength();

   boolean isSetStartarrowlength();

   void setStartarrowlength(STStrokeArrowLength$Enum var1);

   void xsetStartarrowlength(STStrokeArrowLength var1);

   void unsetStartarrowlength();

   STStrokeArrowType$Enum getEndarrow();

   STStrokeArrowType xgetEndarrow();

   boolean isSetEndarrow();

   void setEndarrow(STStrokeArrowType$Enum var1);

   void xsetEndarrow(STStrokeArrowType var1);

   void unsetEndarrow();

   STStrokeArrowWidth$Enum getEndarrowwidth();

   STStrokeArrowWidth xgetEndarrowwidth();

   boolean isSetEndarrowwidth();

   void setEndarrowwidth(STStrokeArrowWidth$Enum var1);

   void xsetEndarrowwidth(STStrokeArrowWidth var1);

   void unsetEndarrowwidth();

   STStrokeArrowLength$Enum getEndarrowlength();

   STStrokeArrowLength xgetEndarrowlength();

   boolean isSetEndarrowlength();

   void setEndarrowlength(STStrokeArrowLength$Enum var1);

   void xsetEndarrowlength(STStrokeArrowLength var1);

   void unsetEndarrowlength();

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

   String getTitle();

   XmlString xgetTitle();

   boolean isSetTitle();

   void setTitle(String var1);

   void xsetTitle(XmlString var1);

   void unsetTitle();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getForcedash();

   com.microsoft.schemas.office.office.STTrueFalse xgetForcedash();

   boolean isSetForcedash();

   void setForcedash(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetForcedash(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetForcedash();

   String getId2();

   STRelationshipId xgetId2();

   boolean isSetId2();

   void setId2(String var1);

   void xsetId2(STRelationshipId var1);

   void unsetId2();

   STTrueFalse.Enum getInsetpen();

   STTrueFalse xgetInsetpen();

   boolean isSetInsetpen();

   void setInsetpen(STTrueFalse.Enum var1);

   void xsetInsetpen(STTrueFalse var1);

   void unsetInsetpen();

   String getRelid();

   com.microsoft.schemas.office.office.STRelationshipId xgetRelid();

   boolean isSetRelid();

   void setRelid(String var1);

   void xsetRelid(com.microsoft.schemas.office.office.STRelationshipId var1);

   void unsetRelid();


   public static final class Factory {

      public static CTStroke newInstance() {
         return (CTStroke)POIXMLTypeLoader.newInstance(CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke newInstance(XmlOptions var0) {
         return (CTStroke)POIXMLTypeLoader.newInstance(CTStroke.type, var0);
      }

      public static CTStroke parse(String var0) throws XmlException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static CTStroke parse(File var0) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static CTStroke parse(URL var0) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static CTStroke parse(InputStream var0) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static CTStroke parse(Reader var0) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static CTStroke parse(XMLStreamReader var0) throws XmlException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static CTStroke parse(Node var0) throws XmlException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static CTStroke parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, (XmlOptions)null);
      }

      public static CTStroke parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStroke)POIXMLTypeLoader.parse(var0, CTStroke.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStroke.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStroke.type, var1);
      }

   }
}
