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

public interface STSlideLayoutType extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSlideLayoutType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stslidelayouttype3aaatype");
   STSlideLayoutType.Enum TITLE = STSlideLayoutType.Enum.forString("title");
   STSlideLayoutType.Enum TX = STSlideLayoutType.Enum.forString("tx");
   STSlideLayoutType.Enum TWO_COL_TX = STSlideLayoutType.Enum.forString("twoColTx");
   STSlideLayoutType.Enum TBL = STSlideLayoutType.Enum.forString("tbl");
   STSlideLayoutType.Enum TX_AND_CHART = STSlideLayoutType.Enum.forString("txAndChart");
   STSlideLayoutType.Enum CHART_AND_TX = STSlideLayoutType.Enum.forString("chartAndTx");
   STSlideLayoutType.Enum DGM = STSlideLayoutType.Enum.forString("dgm");
   STSlideLayoutType.Enum CHART = STSlideLayoutType.Enum.forString("chart");
   STSlideLayoutType.Enum TX_AND_CLIP_ART = STSlideLayoutType.Enum.forString("txAndClipArt");
   STSlideLayoutType.Enum CLIP_ART_AND_TX = STSlideLayoutType.Enum.forString("clipArtAndTx");
   STSlideLayoutType.Enum TITLE_ONLY = STSlideLayoutType.Enum.forString("titleOnly");
   STSlideLayoutType.Enum BLANK = STSlideLayoutType.Enum.forString("blank");
   STSlideLayoutType.Enum TX_AND_OBJ = STSlideLayoutType.Enum.forString("txAndObj");
   STSlideLayoutType.Enum OBJ_AND_TX = STSlideLayoutType.Enum.forString("objAndTx");
   STSlideLayoutType.Enum OBJ_ONLY = STSlideLayoutType.Enum.forString("objOnly");
   STSlideLayoutType.Enum OBJ = STSlideLayoutType.Enum.forString("obj");
   STSlideLayoutType.Enum TX_AND_MEDIA = STSlideLayoutType.Enum.forString("txAndMedia");
   STSlideLayoutType.Enum MEDIA_AND_TX = STSlideLayoutType.Enum.forString("mediaAndTx");
   STSlideLayoutType.Enum OBJ_OVER_TX = STSlideLayoutType.Enum.forString("objOverTx");
   STSlideLayoutType.Enum TX_OVER_OBJ = STSlideLayoutType.Enum.forString("txOverObj");
   STSlideLayoutType.Enum TX_AND_TWO_OBJ = STSlideLayoutType.Enum.forString("txAndTwoObj");
   STSlideLayoutType.Enum TWO_OBJ_AND_TX = STSlideLayoutType.Enum.forString("twoObjAndTx");
   STSlideLayoutType.Enum TWO_OBJ_OVER_TX = STSlideLayoutType.Enum.forString("twoObjOverTx");
   STSlideLayoutType.Enum FOUR_OBJ = STSlideLayoutType.Enum.forString("fourObj");
   STSlideLayoutType.Enum VERT_TX = STSlideLayoutType.Enum.forString("vertTx");
   STSlideLayoutType.Enum CLIP_ART_AND_VERT_TX = STSlideLayoutType.Enum.forString("clipArtAndVertTx");
   STSlideLayoutType.Enum VERT_TITLE_AND_TX = STSlideLayoutType.Enum.forString("vertTitleAndTx");
   STSlideLayoutType.Enum VERT_TITLE_AND_TX_OVER_CHART = STSlideLayoutType.Enum.forString("vertTitleAndTxOverChart");
   STSlideLayoutType.Enum TWO_OBJ = STSlideLayoutType.Enum.forString("twoObj");
   STSlideLayoutType.Enum OBJ_AND_TWO_OBJ = STSlideLayoutType.Enum.forString("objAndTwoObj");
   STSlideLayoutType.Enum TWO_OBJ_AND_OBJ = STSlideLayoutType.Enum.forString("twoObjAndObj");
   STSlideLayoutType.Enum CUST = STSlideLayoutType.Enum.forString("cust");
   STSlideLayoutType.Enum SEC_HEAD = STSlideLayoutType.Enum.forString("secHead");
   STSlideLayoutType.Enum TWO_TX_TWO_OBJ = STSlideLayoutType.Enum.forString("twoTxTwoObj");
   STSlideLayoutType.Enum OBJ_TX = STSlideLayoutType.Enum.forString("objTx");
   STSlideLayoutType.Enum PIC_TX = STSlideLayoutType.Enum.forString("picTx");
   int INT_TITLE = 1;
   int INT_TX = 2;
   int INT_TWO_COL_TX = 3;
   int INT_TBL = 4;
   int INT_TX_AND_CHART = 5;
   int INT_CHART_AND_TX = 6;
   int INT_DGM = 7;
   int INT_CHART = 8;
   int INT_TX_AND_CLIP_ART = 9;
   int INT_CLIP_ART_AND_TX = 10;
   int INT_TITLE_ONLY = 11;
   int INT_BLANK = 12;
   int INT_TX_AND_OBJ = 13;
   int INT_OBJ_AND_TX = 14;
   int INT_OBJ_ONLY = 15;
   int INT_OBJ = 16;
   int INT_TX_AND_MEDIA = 17;
   int INT_MEDIA_AND_TX = 18;
   int INT_OBJ_OVER_TX = 19;
   int INT_TX_OVER_OBJ = 20;
   int INT_TX_AND_TWO_OBJ = 21;
   int INT_TWO_OBJ_AND_TX = 22;
   int INT_TWO_OBJ_OVER_TX = 23;
   int INT_FOUR_OBJ = 24;
   int INT_VERT_TX = 25;
   int INT_CLIP_ART_AND_VERT_TX = 26;
   int INT_VERT_TITLE_AND_TX = 27;
   int INT_VERT_TITLE_AND_TX_OVER_CHART = 28;
   int INT_TWO_OBJ = 29;
   int INT_OBJ_AND_TWO_OBJ = 30;
   int INT_TWO_OBJ_AND_OBJ = 31;
   int INT_CUST = 32;
   int INT_SEC_HEAD = 33;
   int INT_TWO_TX_TWO_OBJ = 34;
   int INT_OBJ_TX = 35;
   int INT_PIC_TX = 36;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_TITLE = 1;
      static final int INT_TX = 2;
      static final int INT_TWO_COL_TX = 3;
      static final int INT_TBL = 4;
      static final int INT_TX_AND_CHART = 5;
      static final int INT_CHART_AND_TX = 6;
      static final int INT_DGM = 7;
      static final int INT_CHART = 8;
      static final int INT_TX_AND_CLIP_ART = 9;
      static final int INT_CLIP_ART_AND_TX = 10;
      static final int INT_TITLE_ONLY = 11;
      static final int INT_BLANK = 12;
      static final int INT_TX_AND_OBJ = 13;
      static final int INT_OBJ_AND_TX = 14;
      static final int INT_OBJ_ONLY = 15;
      static final int INT_OBJ = 16;
      static final int INT_TX_AND_MEDIA = 17;
      static final int INT_MEDIA_AND_TX = 18;
      static final int INT_OBJ_OVER_TX = 19;
      static final int INT_TX_OVER_OBJ = 20;
      static final int INT_TX_AND_TWO_OBJ = 21;
      static final int INT_TWO_OBJ_AND_TX = 22;
      static final int INT_TWO_OBJ_OVER_TX = 23;
      static final int INT_FOUR_OBJ = 24;
      static final int INT_VERT_TX = 25;
      static final int INT_CLIP_ART_AND_VERT_TX = 26;
      static final int INT_VERT_TITLE_AND_TX = 27;
      static final int INT_VERT_TITLE_AND_TX_OVER_CHART = 28;
      static final int INT_TWO_OBJ = 29;
      static final int INT_OBJ_AND_TWO_OBJ = 30;
      static final int INT_TWO_OBJ_AND_OBJ = 31;
      static final int INT_CUST = 32;
      static final int INT_SEC_HEAD = 33;
      static final int INT_TWO_TX_TWO_OBJ = 34;
      static final int INT_OBJ_TX = 35;
      static final int INT_PIC_TX = 36;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STSlideLayoutType.Enum[]{new STSlideLayoutType.Enum("title", 1), new STSlideLayoutType.Enum("tx", 2), new STSlideLayoutType.Enum("twoColTx", 3), new STSlideLayoutType.Enum("tbl", 4), new STSlideLayoutType.Enum("txAndChart", 5), new STSlideLayoutType.Enum("chartAndTx", 6), new STSlideLayoutType.Enum("dgm", 7), new STSlideLayoutType.Enum("chart", 8), new STSlideLayoutType.Enum("txAndClipArt", 9), new STSlideLayoutType.Enum("clipArtAndTx", 10), new STSlideLayoutType.Enum("titleOnly", 11), new STSlideLayoutType.Enum("blank", 12), new STSlideLayoutType.Enum("txAndObj", 13), new STSlideLayoutType.Enum("objAndTx", 14), new STSlideLayoutType.Enum("objOnly", 15), new STSlideLayoutType.Enum("obj", 16), new STSlideLayoutType.Enum("txAndMedia", 17), new STSlideLayoutType.Enum("mediaAndTx", 18), new STSlideLayoutType.Enum("objOverTx", 19), new STSlideLayoutType.Enum("txOverObj", 20), new STSlideLayoutType.Enum("txAndTwoObj", 21), new STSlideLayoutType.Enum("twoObjAndTx", 22), new STSlideLayoutType.Enum("twoObjOverTx", 23), new STSlideLayoutType.Enum("fourObj", 24), new STSlideLayoutType.Enum("vertTx", 25), new STSlideLayoutType.Enum("clipArtAndVertTx", 26), new STSlideLayoutType.Enum("vertTitleAndTx", 27), new STSlideLayoutType.Enum("vertTitleAndTxOverChart", 28), new STSlideLayoutType.Enum("twoObj", 29), new STSlideLayoutType.Enum("objAndTwoObj", 30), new STSlideLayoutType.Enum("twoObjAndObj", 31), new STSlideLayoutType.Enum("cust", 32), new STSlideLayoutType.Enum("secHead", 33), new STSlideLayoutType.Enum("twoTxTwoObj", 34), new STSlideLayoutType.Enum("objTx", 35), new STSlideLayoutType.Enum("picTx", 36)});
      private static final long serialVersionUID = 1L;


      public static STSlideLayoutType.Enum forString(String var0) {
         return (STSlideLayoutType.Enum)table.forString(var0);
      }

      public static STSlideLayoutType.Enum forInt(int var0) {
         return (STSlideLayoutType.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STSlideLayoutType newValue(Object var0) {
         return (STSlideLayoutType)STSlideLayoutType.type.newValue(var0);
      }

      public static STSlideLayoutType newInstance() {
         return (STSlideLayoutType)POIXMLTypeLoader.newInstance(STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType newInstance(XmlOptions var0) {
         return (STSlideLayoutType)POIXMLTypeLoader.newInstance(STSlideLayoutType.type, var0);
      }

      public static STSlideLayoutType parse(String var0) throws XmlException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(String var0, XmlOptions var1) throws XmlException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static STSlideLayoutType parse(File var0) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static STSlideLayoutType parse(URL var0) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static STSlideLayoutType parse(InputStream var0) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static STSlideLayoutType parse(Reader var0) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static STSlideLayoutType parse(XMLStreamReader var0) throws XmlException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static STSlideLayoutType parse(Node var0) throws XmlException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static STSlideLayoutType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static STSlideLayoutType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSlideLayoutType)POIXMLTypeLoader.parse(var0, STSlideLayoutType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSlideLayoutType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSlideLayoutType.type, var1);
      }

   }
}
