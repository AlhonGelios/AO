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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;
import org.w3c.dom.Node;

public interface CTSpacing extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSpacing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctspacingff2ftype");


   BigInteger getBefore();

   STTwipsMeasure xgetBefore();

   boolean isSetBefore();

   void setBefore(BigInteger var1);

   void xsetBefore(STTwipsMeasure var1);

   void unsetBefore();

   BigInteger getBeforeLines();

   STDecimalNumber xgetBeforeLines();

   boolean isSetBeforeLines();

   void setBeforeLines(BigInteger var1);

   void xsetBeforeLines(STDecimalNumber var1);

   void unsetBeforeLines();

   STOnOff.Enum getBeforeAutospacing();

   STOnOff xgetBeforeAutospacing();

   boolean isSetBeforeAutospacing();

   void setBeforeAutospacing(STOnOff.Enum var1);

   void xsetBeforeAutospacing(STOnOff var1);

   void unsetBeforeAutospacing();

   BigInteger getAfter();

   STTwipsMeasure xgetAfter();

   boolean isSetAfter();

   void setAfter(BigInteger var1);

   void xsetAfter(STTwipsMeasure var1);

   void unsetAfter();

   BigInteger getAfterLines();

   STDecimalNumber xgetAfterLines();

   boolean isSetAfterLines();

   void setAfterLines(BigInteger var1);

   void xsetAfterLines(STDecimalNumber var1);

   void unsetAfterLines();

   STOnOff.Enum getAfterAutospacing();

   STOnOff xgetAfterAutospacing();

   boolean isSetAfterAutospacing();

   void setAfterAutospacing(STOnOff.Enum var1);

   void xsetAfterAutospacing(STOnOff var1);

   void unsetAfterAutospacing();

   BigInteger getLine();

   STSignedTwipsMeasure xgetLine();

   boolean isSetLine();

   void setLine(BigInteger var1);

   void xsetLine(STSignedTwipsMeasure var1);

   void unsetLine();

   STLineSpacingRule.Enum getLineRule();

   STLineSpacingRule xgetLineRule();

   boolean isSetLineRule();

   void setLineRule(STLineSpacingRule.Enum var1);

   void xsetLineRule(STLineSpacingRule var1);

   void unsetLineRule();


   public static final class Factory {

      public static CTSpacing newInstance() {
         return (CTSpacing)POIXMLTypeLoader.newInstance(CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing newInstance(XmlOptions var0) {
         return (CTSpacing)POIXMLTypeLoader.newInstance(CTSpacing.type, var0);
      }

      public static CTSpacing parse(String var0) throws XmlException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static CTSpacing parse(File var0) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static CTSpacing parse(URL var0) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static CTSpacing parse(InputStream var0) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static CTSpacing parse(Reader var0) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static CTSpacing parse(XMLStreamReader var0) throws XmlException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static CTSpacing parse(Node var0) throws XmlException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static CTSpacing parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static CTSpacing parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSpacing)POIXMLTypeLoader.parse(var0, CTSpacing.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSpacing.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSpacing.type, var1);
      }

   }
}
