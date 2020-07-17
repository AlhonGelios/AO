package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType;
import org.w3c.dom.Node;

public interface CTStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstyle41c1type");


   CTString getName();

   boolean isSetName();

   void setName(CTString var1);

   CTString addNewName();

   void unsetName();

   CTString getAliases();

   boolean isSetAliases();

   void setAliases(CTString var1);

   CTString addNewAliases();

   void unsetAliases();

   CTString getBasedOn();

   boolean isSetBasedOn();

   void setBasedOn(CTString var1);

   CTString addNewBasedOn();

   void unsetBasedOn();

   CTString getNext();

   boolean isSetNext();

   void setNext(CTString var1);

   CTString addNewNext();

   void unsetNext();

   CTString getLink();

   boolean isSetLink();

   void setLink(CTString var1);

   CTString addNewLink();

   void unsetLink();

   CTOnOff getAutoRedefine();

   boolean isSetAutoRedefine();

   void setAutoRedefine(CTOnOff var1);

   CTOnOff addNewAutoRedefine();

   void unsetAutoRedefine();

   CTOnOff getHidden();

   boolean isSetHidden();

   void setHidden(CTOnOff var1);

   CTOnOff addNewHidden();

   void unsetHidden();

   CTDecimalNumber getUiPriority();

   boolean isSetUiPriority();

   void setUiPriority(CTDecimalNumber var1);

   CTDecimalNumber addNewUiPriority();

   void unsetUiPriority();

   CTOnOff getSemiHidden();

   boolean isSetSemiHidden();

   void setSemiHidden(CTOnOff var1);

   CTOnOff addNewSemiHidden();

   void unsetSemiHidden();

   CTOnOff getUnhideWhenUsed();

   boolean isSetUnhideWhenUsed();

   void setUnhideWhenUsed(CTOnOff var1);

   CTOnOff addNewUnhideWhenUsed();

   void unsetUnhideWhenUsed();

   CTOnOff getQFormat();

   boolean isSetQFormat();

   void setQFormat(CTOnOff var1);

   CTOnOff addNewQFormat();

   void unsetQFormat();

   CTOnOff getLocked();

   boolean isSetLocked();

   void setLocked(CTOnOff var1);

   CTOnOff addNewLocked();

   void unsetLocked();

   CTOnOff getPersonal();

   boolean isSetPersonal();

   void setPersonal(CTOnOff var1);

   CTOnOff addNewPersonal();

   void unsetPersonal();

   CTOnOff getPersonalCompose();

   boolean isSetPersonalCompose();

   void setPersonalCompose(CTOnOff var1);

   CTOnOff addNewPersonalCompose();

   void unsetPersonalCompose();

   CTOnOff getPersonalReply();

   boolean isSetPersonalReply();

   void setPersonalReply(CTOnOff var1);

   CTOnOff addNewPersonalReply();

   void unsetPersonalReply();

   CTLongHexNumber getRsid();

   boolean isSetRsid();

   void setRsid(CTLongHexNumber var1);

   CTLongHexNumber addNewRsid();

   void unsetRsid();

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

   CTTblPrBase getTblPr();

   boolean isSetTblPr();

   void setTblPr(CTTblPrBase var1);

   CTTblPrBase addNewTblPr();

   void unsetTblPr();

   CTTrPr getTrPr();

   boolean isSetTrPr();

   void setTrPr(CTTrPr var1);

   CTTrPr addNewTrPr();

   void unsetTrPr();

   CTTcPr getTcPr();

   boolean isSetTcPr();

   void setTcPr(CTTcPr var1);

   CTTcPr addNewTcPr();

   void unsetTcPr();

   List getTblStylePrList();

   CTTblStylePr[] getTblStylePrArray();

   CTTblStylePr getTblStylePrArray(int var1);

   int sizeOfTblStylePrArray();

   void setTblStylePrArray(CTTblStylePr[] var1);

   void setTblStylePrArray(int var1, CTTblStylePr var2);

   CTTblStylePr insertNewTblStylePr(int var1);

   CTTblStylePr addNewTblStylePr();

   void removeTblStylePr(int var1);

   STStyleType.Enum getType();

   STStyleType xgetType();

   boolean isSetType();

   void setType(STStyleType.Enum var1);

   void xsetType(STStyleType var1);

   void unsetType();

   String getStyleId();

   STString xgetStyleId();

   boolean isSetStyleId();

   void setStyleId(String var1);

   void xsetStyleId(STString var1);

   void unsetStyleId();

   STOnOff.Enum getDefault();

   STOnOff xgetDefault();

   boolean isSetDefault();

   void setDefault(STOnOff.Enum var1);

   void xsetDefault(STOnOff var1);

   void unsetDefault();

   STOnOff.Enum getCustomStyle();

   STOnOff xgetCustomStyle();

   boolean isSetCustomStyle();

   void setCustomStyle(STOnOff.Enum var1);

   void xsetCustomStyle(STOnOff var1);

   void unsetCustomStyle();


   public static final class Factory {

      public static CTStyle newInstance() {
         return (CTStyle)POIXMLTypeLoader.newInstance(CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle newInstance(XmlOptions var0) {
         return (CTStyle)POIXMLTypeLoader.newInstance(CTStyle.type, var0);
      }

      public static CTStyle parse(String var0) throws XmlException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static CTStyle parse(File var0) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static CTStyle parse(URL var0) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static CTStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static CTStyle parse(Reader var0) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static CTStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static CTStyle parse(Node var0) throws XmlException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static CTStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, (XmlOptions)null);
      }

      public static CTStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStyle)POIXMLTypeLoader.parse(var0, CTStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyle.type, var1);
      }

   }
}
