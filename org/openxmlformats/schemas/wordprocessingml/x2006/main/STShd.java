package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STShd extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STShd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stshd14d3type");
   STShd.Enum NIL = STShd.Enum.forString("nil");
   STShd.Enum CLEAR = STShd.Enum.forString("clear");
   STShd.Enum SOLID = STShd.Enum.forString("solid");
   STShd.Enum HORZ_STRIPE = STShd.Enum.forString("horzStripe");
   STShd.Enum VERT_STRIPE = STShd.Enum.forString("vertStripe");
   STShd.Enum REVERSE_DIAG_STRIPE = STShd.Enum.forString("reverseDiagStripe");
   STShd.Enum DIAG_STRIPE = STShd.Enum.forString("diagStripe");
   STShd.Enum HORZ_CROSS = STShd.Enum.forString("horzCross");
   STShd.Enum DIAG_CROSS = STShd.Enum.forString("diagCross");
   STShd.Enum THIN_HORZ_STRIPE = STShd.Enum.forString("thinHorzStripe");
   STShd.Enum THIN_VERT_STRIPE = STShd.Enum.forString("thinVertStripe");
   STShd.Enum THIN_REVERSE_DIAG_STRIPE = STShd.Enum.forString("thinReverseDiagStripe");
   STShd.Enum THIN_DIAG_STRIPE = STShd.Enum.forString("thinDiagStripe");
   STShd.Enum THIN_HORZ_CROSS = STShd.Enum.forString("thinHorzCross");
   STShd.Enum THIN_DIAG_CROSS = STShd.Enum.forString("thinDiagCross");
   STShd.Enum PCT_5 = STShd.Enum.forString("pct5");
   STShd.Enum PCT_10 = STShd.Enum.forString("pct10");
   STShd.Enum PCT_12 = STShd.Enum.forString("pct12");
   STShd.Enum PCT_15 = STShd.Enum.forString("pct15");
   STShd.Enum PCT_20 = STShd.Enum.forString("pct20");
   STShd.Enum PCT_25 = STShd.Enum.forString("pct25");
   STShd.Enum PCT_30 = STShd.Enum.forString("pct30");
   STShd.Enum PCT_35 = STShd.Enum.forString("pct35");
   STShd.Enum PCT_37 = STShd.Enum.forString("pct37");
   STShd.Enum PCT_40 = STShd.Enum.forString("pct40");
   STShd.Enum PCT_45 = STShd.Enum.forString("pct45");
   STShd.Enum PCT_50 = STShd.Enum.forString("pct50");
   STShd.Enum PCT_55 = STShd.Enum.forString("pct55");
   STShd.Enum PCT_60 = STShd.Enum.forString("pct60");
   STShd.Enum PCT_62 = STShd.Enum.forString("pct62");
   STShd.Enum PCT_65 = STShd.Enum.forString("pct65");
   STShd.Enum PCT_70 = STShd.Enum.forString("pct70");
   STShd.Enum PCT_75 = STShd.Enum.forString("pct75");
   STShd.Enum PCT_80 = STShd.Enum.forString("pct80");
   STShd.Enum PCT_85 = STShd.Enum.forString("pct85");
   STShd.Enum PCT_87 = STShd.Enum.forString("pct87");
   STShd.Enum PCT_90 = STShd.Enum.forString("pct90");
   STShd.Enum PCT_95 = STShd.Enum.forString("pct95");
   int INT_NIL = 1;
   int INT_CLEAR = 2;
   int INT_SOLID = 3;
   int INT_HORZ_STRIPE = 4;
   int INT_VERT_STRIPE = 5;
   int INT_REVERSE_DIAG_STRIPE = 6;
   int INT_DIAG_STRIPE = 7;
   int INT_HORZ_CROSS = 8;
   int INT_DIAG_CROSS = 9;
   int INT_THIN_HORZ_STRIPE = 10;
   int INT_THIN_VERT_STRIPE = 11;
   int INT_THIN_REVERSE_DIAG_STRIPE = 12;
   int INT_THIN_DIAG_STRIPE = 13;
   int INT_THIN_HORZ_CROSS = 14;
   int INT_THIN_DIAG_CROSS = 15;
   int INT_PCT_5 = 16;
   int INT_PCT_10 = 17;
   int INT_PCT_12 = 18;
   int INT_PCT_15 = 19;
   int INT_PCT_20 = 20;
   int INT_PCT_25 = 21;
   int INT_PCT_30 = 22;
   int INT_PCT_35 = 23;
   int INT_PCT_37 = 24;
   int INT_PCT_40 = 25;
   int INT_PCT_45 = 26;
   int INT_PCT_50 = 27;
   int INT_PCT_55 = 28;
   int INT_PCT_60 = 29;
   int INT_PCT_62 = 30;
   int INT_PCT_65 = 31;
   int INT_PCT_70 = 32;
   int INT_PCT_75 = 33;
   int INT_PCT_80 = 34;
   int INT_PCT_85 = 35;
   int INT_PCT_87 = 36;
   int INT_PCT_90 = 37;
   int INT_PCT_95 = 38;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_NIL = 1;
      static final int INT_CLEAR = 2;
      static final int INT_SOLID = 3;
      static final int INT_HORZ_STRIPE = 4;
      static final int INT_VERT_STRIPE = 5;
      static final int INT_REVERSE_DIAG_STRIPE = 6;
      static final int INT_DIAG_STRIPE = 7;
      static final int INT_HORZ_CROSS = 8;
      static final int INT_DIAG_CROSS = 9;
      static final int INT_THIN_HORZ_STRIPE = 10;
      static final int INT_THIN_VERT_STRIPE = 11;
      static final int INT_THIN_REVERSE_DIAG_STRIPE = 12;
      static final int INT_THIN_DIAG_STRIPE = 13;
      static final int INT_THIN_HORZ_CROSS = 14;
      static final int INT_THIN_DIAG_CROSS = 15;
      static final int INT_PCT_5 = 16;
      static final int INT_PCT_10 = 17;
      static final int INT_PCT_12 = 18;
      static final int INT_PCT_15 = 19;
      static final int INT_PCT_20 = 20;
      static final int INT_PCT_25 = 21;
      static final int INT_PCT_30 = 22;
      static final int INT_PCT_35 = 23;
      static final int INT_PCT_37 = 24;
      static final int INT_PCT_40 = 25;
      static final int INT_PCT_45 = 26;
      static final int INT_PCT_50 = 27;
      static final int INT_PCT_55 = 28;
      static final int INT_PCT_60 = 29;
      static final int INT_PCT_62 = 30;
      static final int INT_PCT_65 = 31;
      static final int INT_PCT_70 = 32;
      static final int INT_PCT_75 = 33;
      static final int INT_PCT_80 = 34;
      static final int INT_PCT_85 = 35;
      static final int INT_PCT_87 = 36;
      static final int INT_PCT_90 = 37;
      static final int INT_PCT_95 = 38;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STShd.Enum[]{new STShd.Enum("nil", 1), new STShd.Enum("clear", 2), new STShd.Enum("solid", 3), new STShd.Enum("horzStripe", 4), new STShd.Enum("vertStripe", 5), new STShd.Enum("reverseDiagStripe", 6), new STShd.Enum("diagStripe", 7), new STShd.Enum("horzCross", 8), new STShd.Enum("diagCross", 9), new STShd.Enum("thinHorzStripe", 10), new STShd.Enum("thinVertStripe", 11), new STShd.Enum("thinReverseDiagStripe", 12), new STShd.Enum("thinDiagStripe", 13), new STShd.Enum("thinHorzCross", 14), new STShd.Enum("thinDiagCross", 15), new STShd.Enum("pct5", 16), new STShd.Enum("pct10", 17), new STShd.Enum("pct12", 18), new STShd.Enum("pct15", 19), new STShd.Enum("pct20", 20), new STShd.Enum("pct25", 21), new STShd.Enum("pct30", 22), new STShd.Enum("pct35", 23), new STShd.Enum("pct37", 24), new STShd.Enum("pct40", 25), new STShd.Enum("pct45", 26), new STShd.Enum("pct50", 27), new STShd.Enum("pct55", 28), new STShd.Enum("pct60", 29), new STShd.Enum("pct62", 30), new STShd.Enum("pct65", 31), new STShd.Enum("pct70", 32), new STShd.Enum("pct75", 33), new STShd.Enum("pct80", 34), new STShd.Enum("pct85", 35), new STShd.Enum("pct87", 36), new STShd.Enum("pct90", 37), new STShd.Enum("pct95", 38)});
      private static final long serialVersionUID = 1L;


      public static STShd.Enum forString(String var0) {
         return (STShd.Enum)table.forString(var0);
      }

      public static STShd.Enum forInt(int var0) {
         return (STShd.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STShd newValue(Object var0) {
         return (STShd)STShd.type.newValue(var0);
      }

      public static STShd newInstance() {
         return (STShd)POIXMLTypeLoader.newInstance(STShd.type, (XmlOptions)null);
      }

      public static STShd newInstance(XmlOptions var0) {
         return (STShd)POIXMLTypeLoader.newInstance(STShd.type, var0);
      }

      public static STShd parse(String var0) throws XmlException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(String var0, XmlOptions var1) throws XmlException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static STShd parse(File var0) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static STShd parse(URL var0) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static STShd parse(InputStream var0) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static STShd parse(Reader var0) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static STShd parse(XMLStreamReader var0) throws XmlException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static STShd parse(Node var0) throws XmlException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(Node var0, XmlOptions var1) throws XmlException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static STShd parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, (XmlOptions)null);
      }

      public static STShd parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STShd)POIXMLTypeLoader.parse(var0, STShd.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STShd.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STShd.type, var1);
      }

   }
}
