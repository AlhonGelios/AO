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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTTableColumn extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableColumn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablecolumn08a3type");


   CTTableFormula getCalculatedColumnFormula();

   boolean isSetCalculatedColumnFormula();

   void setCalculatedColumnFormula(CTTableFormula var1);

   CTTableFormula addNewCalculatedColumnFormula();

   void unsetCalculatedColumnFormula();

   CTTableFormula getTotalsRowFormula();

   boolean isSetTotalsRowFormula();

   void setTotalsRowFormula(CTTableFormula var1);

   CTTableFormula addNewTotalsRowFormula();

   void unsetTotalsRowFormula();

   CTXmlColumnPr getXmlColumnPr();

   boolean isSetXmlColumnPr();

   void setXmlColumnPr(CTXmlColumnPr var1);

   CTXmlColumnPr addNewXmlColumnPr();

   void unsetXmlColumnPr();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   XmlUnsignedInt xgetId();

   void setId(long var1);

   void xsetId(XmlUnsignedInt var1);

   String getUniqueName();

   STXstring xgetUniqueName();

   boolean isSetUniqueName();

   void setUniqueName(String var1);

   void xsetUniqueName(STXstring var1);

   void unsetUniqueName();

   String getName();

   STXstring xgetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   STTotalsRowFunction$Enum getTotalsRowFunction();

   STTotalsRowFunction xgetTotalsRowFunction();

   boolean isSetTotalsRowFunction();

   void setTotalsRowFunction(STTotalsRowFunction$Enum var1);

   void xsetTotalsRowFunction(STTotalsRowFunction var1);

   void unsetTotalsRowFunction();

   String getTotalsRowLabel();

   STXstring xgetTotalsRowLabel();

   boolean isSetTotalsRowLabel();

   void setTotalsRowLabel(String var1);

   void xsetTotalsRowLabel(STXstring var1);

   void unsetTotalsRowLabel();

   long getQueryTableFieldId();

   XmlUnsignedInt xgetQueryTableFieldId();

   boolean isSetQueryTableFieldId();

   void setQueryTableFieldId(long var1);

   void xsetQueryTableFieldId(XmlUnsignedInt var1);

   void unsetQueryTableFieldId();

   long getHeaderRowDxfId();

   STDxfId xgetHeaderRowDxfId();

   boolean isSetHeaderRowDxfId();

   void setHeaderRowDxfId(long var1);

   void xsetHeaderRowDxfId(STDxfId var1);

   void unsetHeaderRowDxfId();

   long getDataDxfId();

   STDxfId xgetDataDxfId();

   boolean isSetDataDxfId();

   void setDataDxfId(long var1);

   void xsetDataDxfId(STDxfId var1);

   void unsetDataDxfId();

   long getTotalsRowDxfId();

   STDxfId xgetTotalsRowDxfId();

   boolean isSetTotalsRowDxfId();

   void setTotalsRowDxfId(long var1);

   void xsetTotalsRowDxfId(STDxfId var1);

   void unsetTotalsRowDxfId();

   String getHeaderRowCellStyle();

   STXstring xgetHeaderRowCellStyle();

   boolean isSetHeaderRowCellStyle();

   void setHeaderRowCellStyle(String var1);

   void xsetHeaderRowCellStyle(STXstring var1);

   void unsetHeaderRowCellStyle();

   String getDataCellStyle();

   STXstring xgetDataCellStyle();

   boolean isSetDataCellStyle();

   void setDataCellStyle(String var1);

   void xsetDataCellStyle(STXstring var1);

   void unsetDataCellStyle();

   String getTotalsRowCellStyle();

   STXstring xgetTotalsRowCellStyle();

   boolean isSetTotalsRowCellStyle();

   void setTotalsRowCellStyle(String var1);

   void xsetTotalsRowCellStyle(STXstring var1);

   void unsetTotalsRowCellStyle();


   public static final class Factory {

      public static CTTableColumn newInstance() {
         return (CTTableColumn)POIXMLTypeLoader.newInstance(CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn newInstance(XmlOptions var0) {
         return (CTTableColumn)POIXMLTypeLoader.newInstance(CTTableColumn.type, var0);
      }

      public static CTTableColumn parse(String var0) throws XmlException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static CTTableColumn parse(File var0) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static CTTableColumn parse(URL var0) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static CTTableColumn parse(InputStream var0) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static CTTableColumn parse(Reader var0) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static CTTableColumn parse(XMLStreamReader var0) throws XmlException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static CTTableColumn parse(Node var0) throws XmlException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static CTTableColumn parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static CTTableColumn parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableColumn)POIXMLTypeLoader.parse(var0, CTTableColumn.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableColumn.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableColumn.type, var1);
      }

   }
}
