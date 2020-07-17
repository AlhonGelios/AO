package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.w3c.dom.Node;

public interface CTXf extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTXf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctxf97f7type");


   CTCellAlignment getAlignment();

   boolean isSetAlignment();

   void setAlignment(CTCellAlignment var1);

   CTCellAlignment addNewAlignment();

   void unsetAlignment();

   CTCellProtection getProtection();

   boolean isSetProtection();

   void setProtection(CTCellProtection var1);

   CTCellProtection addNewProtection();

   void unsetProtection();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getNumFmtId();

   STNumFmtId xgetNumFmtId();

   boolean isSetNumFmtId();

   void setNumFmtId(long var1);

   void xsetNumFmtId(STNumFmtId var1);

   void unsetNumFmtId();

   long getFontId();

   STFontId xgetFontId();

   boolean isSetFontId();

   void setFontId(long var1);

   void xsetFontId(STFontId var1);

   void unsetFontId();

   long getFillId();

   STFillId xgetFillId();

   boolean isSetFillId();

   void setFillId(long var1);

   void xsetFillId(STFillId var1);

   void unsetFillId();

   long getBorderId();

   STBorderId xgetBorderId();

   boolean isSetBorderId();

   void setBorderId(long var1);

   void xsetBorderId(STBorderId var1);

   void unsetBorderId();

   long getXfId();

   STCellStyleXfId xgetXfId();

   boolean isSetXfId();

   void setXfId(long var1);

   void xsetXfId(STCellStyleXfId var1);

   void unsetXfId();

   boolean getQuotePrefix();

   XmlBoolean xgetQuotePrefix();

   boolean isSetQuotePrefix();

   void setQuotePrefix(boolean var1);

   void xsetQuotePrefix(XmlBoolean var1);

   void unsetQuotePrefix();

   boolean getPivotButton();

   XmlBoolean xgetPivotButton();

   boolean isSetPivotButton();

   void setPivotButton(boolean var1);

   void xsetPivotButton(XmlBoolean var1);

   void unsetPivotButton();

   boolean getApplyNumberFormat();

   XmlBoolean xgetApplyNumberFormat();

   boolean isSetApplyNumberFormat();

   void setApplyNumberFormat(boolean var1);

   void xsetApplyNumberFormat(XmlBoolean var1);

   void unsetApplyNumberFormat();

   boolean getApplyFont();

   XmlBoolean xgetApplyFont();

   boolean isSetApplyFont();

   void setApplyFont(boolean var1);

   void xsetApplyFont(XmlBoolean var1);

   void unsetApplyFont();

   boolean getApplyFill();

   XmlBoolean xgetApplyFill();

   boolean isSetApplyFill();

   void setApplyFill(boolean var1);

   void xsetApplyFill(XmlBoolean var1);

   void unsetApplyFill();

   boolean getApplyBorder();

   XmlBoolean xgetApplyBorder();

   boolean isSetApplyBorder();

   void setApplyBorder(boolean var1);

   void xsetApplyBorder(XmlBoolean var1);

   void unsetApplyBorder();

   boolean getApplyAlignment();

   XmlBoolean xgetApplyAlignment();

   boolean isSetApplyAlignment();

   void setApplyAlignment(boolean var1);

   void xsetApplyAlignment(XmlBoolean var1);

   void unsetApplyAlignment();

   boolean getApplyProtection();

   XmlBoolean xgetApplyProtection();

   boolean isSetApplyProtection();

   void setApplyProtection(boolean var1);

   void xsetApplyProtection(XmlBoolean var1);

   void unsetApplyProtection();


   public static final class Factory {

      public static CTXf newInstance() {
         return (CTXf)POIXMLTypeLoader.newInstance(CTXf.type, (XmlOptions)null);
      }

      public static CTXf newInstance(XmlOptions var0) {
         return (CTXf)POIXMLTypeLoader.newInstance(CTXf.type, var0);
      }

      public static CTXf parse(String var0) throws XmlException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(String var0, XmlOptions var1) throws XmlException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static CTXf parse(File var0) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static CTXf parse(URL var0) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static CTXf parse(InputStream var0) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static CTXf parse(Reader var0) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static CTXf parse(XMLStreamReader var0) throws XmlException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static CTXf parse(Node var0) throws XmlException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static CTXf parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, (XmlOptions)null);
      }

      public static CTXf parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTXf)POIXMLTypeLoader.parse(var0, CTXf.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXf.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXf.type, var1);
      }

   }
}
