package org.openxmlformats.schemas.presentationml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STPlaceholderType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPlaceholderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stplaceholdertypeca72type");
   STPlaceholderType.Enum TITLE = STPlaceholderType.Enum.forString("title");
   STPlaceholderType.Enum BODY = STPlaceholderType.Enum.forString("body");
   STPlaceholderType.Enum CTR_TITLE = STPlaceholderType.Enum.forString("ctrTitle");
   STPlaceholderType.Enum SUB_TITLE = STPlaceholderType.Enum.forString("subTitle");
   STPlaceholderType.Enum DT = STPlaceholderType.Enum.forString("dt");
   STPlaceholderType.Enum SLD_NUM = STPlaceholderType.Enum.forString("sldNum");
   STPlaceholderType.Enum FTR = STPlaceholderType.Enum.forString("ftr");
   STPlaceholderType.Enum HDR = STPlaceholderType.Enum.forString("hdr");
   STPlaceholderType.Enum OBJ = STPlaceholderType.Enum.forString("obj");
   STPlaceholderType.Enum CHART = STPlaceholderType.Enum.forString("chart");
   STPlaceholderType.Enum TBL = STPlaceholderType.Enum.forString("tbl");
   STPlaceholderType.Enum CLIP_ART = STPlaceholderType.Enum.forString("clipArt");
   STPlaceholderType.Enum DGM = STPlaceholderType.Enum.forString("dgm");
   STPlaceholderType.Enum MEDIA = STPlaceholderType.Enum.forString("media");
   STPlaceholderType.Enum SLD_IMG = STPlaceholderType.Enum.forString("sldImg");
   STPlaceholderType.Enum PIC = STPlaceholderType.Enum.forString("pic");
   int INT_TITLE = 1;
   int INT_BODY = 2;
   int INT_CTR_TITLE = 3;
   int INT_SUB_TITLE = 4;
   int INT_DT = 5;
   int INT_SLD_NUM = 6;
   int INT_FTR = 7;
   int INT_HDR = 8;
   int INT_OBJ = 9;
   int INT_CHART = 10;
   int INT_TBL = 11;
   int INT_CLIP_ART = 12;
   int INT_DGM = 13;
   int INT_MEDIA = 14;
   int INT_SLD_IMG = 15;
   int INT_PIC = 16;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TITLE = 1;
      static final int INT_BODY = 2;
      static final int INT_CTR_TITLE = 3;
      static final int INT_SUB_TITLE = 4;
      static final int INT_DT = 5;
      static final int INT_SLD_NUM = 6;
      static final int INT_FTR = 7;
      static final int INT_HDR = 8;
      static final int INT_OBJ = 9;
      static final int INT_CHART = 10;
      static final int INT_TBL = 11;
      static final int INT_CLIP_ART = 12;
      static final int INT_DGM = 13;
      static final int INT_MEDIA = 14;
      static final int INT_SLD_IMG = 15;
      static final int INT_PIC = 16;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPlaceholderType.Enum[]{new STPlaceholderType.Enum("title", 1), new STPlaceholderType.Enum("body", 2), new STPlaceholderType.Enum("ctrTitle", 3), new STPlaceholderType.Enum("subTitle", 4), new STPlaceholderType.Enum("dt", 5), new STPlaceholderType.Enum("sldNum", 6), new STPlaceholderType.Enum("ftr", 7), new STPlaceholderType.Enum("hdr", 8), new STPlaceholderType.Enum("obj", 9), new STPlaceholderType.Enum("chart", 10), new STPlaceholderType.Enum("tbl", 11), new STPlaceholderType.Enum("clipArt", 12), new STPlaceholderType.Enum("dgm", 13), new STPlaceholderType.Enum("media", 14), new STPlaceholderType.Enum("sldImg", 15), new STPlaceholderType.Enum("pic", 16)});
      private static final long serialVersionUID = 1L;


      public static STPlaceholderType.Enum forString(String var0) {
         return (STPlaceholderType.Enum)table.forString(var0);
      }

      public static STPlaceholderType.Enum forInt(int var0) {
         return (STPlaceholderType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STPlaceholderType newValue(Object var0) {
         return (STPlaceholderType)STPlaceholderType.type.newValue(var0);
      }

      public static STPlaceholderType newInstance() {
         return (STPlaceholderType)POIXMLTypeLoader.newInstance(STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType newInstance(XmlOptions var0) {
         return (STPlaceholderType)POIXMLTypeLoader.newInstance(STPlaceholderType.type, var0);
      }

      public static STPlaceholderType parse(String var0) throws XmlException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(String var0, XmlOptions var1) throws XmlException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static STPlaceholderType parse(File var0) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static STPlaceholderType parse(URL var0) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static STPlaceholderType parse(InputStream var0) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static STPlaceholderType parse(Reader var0) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static STPlaceholderType parse(XMLStreamReader var0) throws XmlException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static STPlaceholderType parse(Node var0) throws XmlException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static STPlaceholderType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static STPlaceholderType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPlaceholderType)POIXMLTypeLoader.parse(var0, STPlaceholderType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPlaceholderType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPlaceholderType.type, var1);
      }

   }
}
