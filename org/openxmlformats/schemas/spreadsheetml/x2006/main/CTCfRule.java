package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod$Enum;
import org.w3c.dom.Node;

public interface CTCfRule extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCfRule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcfrule3548type");


   List getFormulaList();

   String[] getFormulaArray();

   String getFormulaArray(int var1);

   List xgetFormulaList();

   STFormula[] xgetFormulaArray();

   STFormula xgetFormulaArray(int var1);

   int sizeOfFormulaArray();

   void setFormulaArray(String[] var1);

   void setFormulaArray(int var1, String var2);

   void xsetFormulaArray(STFormula[] var1);

   void xsetFormulaArray(int var1, STFormula var2);

   void insertFormula(int var1, String var2);

   void addFormula(String var1);

   STFormula insertNewFormula(int var1);

   STFormula addNewFormula();

   void removeFormula(int var1);

   CTColorScale getColorScale();

   boolean isSetColorScale();

   void setColorScale(CTColorScale var1);

   CTColorScale addNewColorScale();

   void unsetColorScale();

   CTDataBar getDataBar();

   boolean isSetDataBar();

   void setDataBar(CTDataBar var1);

   CTDataBar addNewDataBar();

   void unsetDataBar();

   CTIconSet getIconSet();

   boolean isSetIconSet();

   void setIconSet(CTIconSet var1);

   CTIconSet addNewIconSet();

   void unsetIconSet();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   STCfType.Enum getType();

   STCfType xgetType();

   boolean isSetType();

   void setType(STCfType.Enum var1);

   void xsetType(STCfType var1);

   void unsetType();

   long getDxfId();

   STDxfId xgetDxfId();

   boolean isSetDxfId();

   void setDxfId(long var1);

   void xsetDxfId(STDxfId var1);

   void unsetDxfId();

   int getPriority();

   XmlInt xgetPriority();

   void setPriority(int var1);

   void xsetPriority(XmlInt var1);

   boolean getStopIfTrue();

   XmlBoolean xgetStopIfTrue();

   boolean isSetStopIfTrue();

   void setStopIfTrue(boolean var1);

   void xsetStopIfTrue(XmlBoolean var1);

   void unsetStopIfTrue();

   boolean getAboveAverage();

   XmlBoolean xgetAboveAverage();

   boolean isSetAboveAverage();

   void setAboveAverage(boolean var1);

   void xsetAboveAverage(XmlBoolean var1);

   void unsetAboveAverage();

   boolean getPercent();

   XmlBoolean xgetPercent();

   boolean isSetPercent();

   void setPercent(boolean var1);

   void xsetPercent(XmlBoolean var1);

   void unsetPercent();

   boolean getBottom();

   XmlBoolean xgetBottom();

   boolean isSetBottom();

   void setBottom(boolean var1);

   void xsetBottom(XmlBoolean var1);

   void unsetBottom();

   STConditionalFormattingOperator.Enum getOperator();

   STConditionalFormattingOperator xgetOperator();

   boolean isSetOperator();

   void setOperator(STConditionalFormattingOperator.Enum var1);

   void xsetOperator(STConditionalFormattingOperator var1);

   void unsetOperator();

   String getText();

   XmlString xgetText();

   boolean isSetText();

   void setText(String var1);

   void xsetText(XmlString var1);

   void unsetText();

   STTimePeriod$Enum getTimePeriod();

   STTimePeriod xgetTimePeriod();

   boolean isSetTimePeriod();

   void setTimePeriod(STTimePeriod$Enum var1);

   void xsetTimePeriod(STTimePeriod var1);

   void unsetTimePeriod();

   long getRank();

   XmlUnsignedInt xgetRank();

   boolean isSetRank();

   void setRank(long var1);

   void xsetRank(XmlUnsignedInt var1);

   void unsetRank();

   int getStdDev();

   XmlInt xgetStdDev();

   boolean isSetStdDev();

   void setStdDev(int var1);

   void xsetStdDev(XmlInt var1);

   void unsetStdDev();

   boolean getEqualAverage();

   XmlBoolean xgetEqualAverage();

   boolean isSetEqualAverage();

   void setEqualAverage(boolean var1);

   void xsetEqualAverage(XmlBoolean var1);

   void unsetEqualAverage();


   public static final class Factory {

      public static CTCfRule newInstance() {
         return (CTCfRule)POIXMLTypeLoader.newInstance(CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule newInstance(XmlOptions var0) {
         return (CTCfRule)POIXMLTypeLoader.newInstance(CTCfRule.type, var0);
      }

      public static CTCfRule parse(String var0) throws XmlException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static CTCfRule parse(File var0) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static CTCfRule parse(URL var0) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static CTCfRule parse(InputStream var0) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static CTCfRule parse(Reader var0) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static CTCfRule parse(XMLStreamReader var0) throws XmlException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static CTCfRule parse(Node var0) throws XmlException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static CTCfRule parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static CTCfRule parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCfRule)POIXMLTypeLoader.parse(var0, CTCfRule.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCfRule.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCfRule.type, var1);
      }

   }
}
