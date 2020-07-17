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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.w3c.dom.Node;

public interface CTLvl extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLvl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlvlf630type");


   CTDecimalNumber getStart();

   boolean isSetStart();

   void setStart(CTDecimalNumber var1);

   CTDecimalNumber addNewStart();

   void unsetStart();

   CTNumFmt getNumFmt();

   boolean isSetNumFmt();

   void setNumFmt(CTNumFmt var1);

   CTNumFmt addNewNumFmt();

   void unsetNumFmt();

   CTDecimalNumber getLvlRestart();

   boolean isSetLvlRestart();

   void setLvlRestart(CTDecimalNumber var1);

   CTDecimalNumber addNewLvlRestart();

   void unsetLvlRestart();

   CTString getPStyle();

   boolean isSetPStyle();

   void setPStyle(CTString var1);

   CTString addNewPStyle();

   void unsetPStyle();

   CTOnOff getIsLgl();

   boolean isSetIsLgl();

   void setIsLgl(CTOnOff var1);

   CTOnOff addNewIsLgl();

   void unsetIsLgl();

   CTLevelSuffix getSuff();

   boolean isSetSuff();

   void setSuff(CTLevelSuffix var1);

   CTLevelSuffix addNewSuff();

   void unsetSuff();

   CTLevelText getLvlText();

   boolean isSetLvlText();

   void setLvlText(CTLevelText var1);

   CTLevelText addNewLvlText();

   void unsetLvlText();

   CTDecimalNumber getLvlPicBulletId();

   boolean isSetLvlPicBulletId();

   void setLvlPicBulletId(CTDecimalNumber var1);

   CTDecimalNumber addNewLvlPicBulletId();

   void unsetLvlPicBulletId();

   CTLvlLegacy getLegacy();

   boolean isSetLegacy();

   void setLegacy(CTLvlLegacy var1);

   CTLvlLegacy addNewLegacy();

   void unsetLegacy();

   CTJc getLvlJc();

   boolean isSetLvlJc();

   void setLvlJc(CTJc var1);

   CTJc addNewLvlJc();

   void unsetLvlJc();

   CTPPr getPPr();

   boolean isSetPPr();

   void setPPr(CTPPr var1);

   CTPPr addNewPPr();

   void unsetPPr();

   CTRPr getRPr();

   boolean isSetRPr();

   void setRPr(CTRPr var1);

   CTRPr addNewRPr();

   void unsetRPr();

   BigInteger getIlvl();

   STDecimalNumber xgetIlvl();

   void setIlvl(BigInteger var1);

   void xsetIlvl(STDecimalNumber var1);

   byte[] getTplc();

   STLongHexNumber xgetTplc();

   boolean isSetTplc();

   void setTplc(byte[] var1);

   void xsetTplc(STLongHexNumber var1);

   void unsetTplc();

   STOnOff.Enum getTentative();

   STOnOff xgetTentative();

   boolean isSetTentative();

   void setTentative(STOnOff.Enum var1);

   void xsetTentative(STOnOff var1);

   void unsetTentative();


   public static final class Factory {

      public static CTLvl newInstance() {
         return (CTLvl)POIXMLTypeLoader.newInstance(CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl newInstance(XmlOptions var0) {
         return (CTLvl)POIXMLTypeLoader.newInstance(CTLvl.type, var0);
      }

      public static CTLvl parse(String var0) throws XmlException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static CTLvl parse(File var0) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static CTLvl parse(URL var0) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static CTLvl parse(InputStream var0) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static CTLvl parse(Reader var0) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static CTLvl parse(XMLStreamReader var0) throws XmlException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static CTLvl parse(Node var0) throws XmlException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static CTLvl parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, (XmlOptions)null);
      }

      public static CTLvl parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLvl)POIXMLTypeLoader.parse(var0, CTLvl.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLvl.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLvl.type, var1);
      }

   }
}
