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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.w3c.dom.Node;

public interface CTSectPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSectPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsectpr1123type");


   List getHeaderReferenceList();

   CTHdrFtrRef[] getHeaderReferenceArray();

   CTHdrFtrRef getHeaderReferenceArray(int var1);

   int sizeOfHeaderReferenceArray();

   void setHeaderReferenceArray(CTHdrFtrRef[] var1);

   void setHeaderReferenceArray(int var1, CTHdrFtrRef var2);

   CTHdrFtrRef insertNewHeaderReference(int var1);

   CTHdrFtrRef addNewHeaderReference();

   void removeHeaderReference(int var1);

   List getFooterReferenceList();

   CTHdrFtrRef[] getFooterReferenceArray();

   CTHdrFtrRef getFooterReferenceArray(int var1);

   int sizeOfFooterReferenceArray();

   void setFooterReferenceArray(CTHdrFtrRef[] var1);

   void setFooterReferenceArray(int var1, CTHdrFtrRef var2);

   CTHdrFtrRef insertNewFooterReference(int var1);

   CTHdrFtrRef addNewFooterReference();

   void removeFooterReference(int var1);

   CTFtnProps getFootnotePr();

   boolean isSetFootnotePr();

   void setFootnotePr(CTFtnProps var1);

   CTFtnProps addNewFootnotePr();

   void unsetFootnotePr();

   CTEdnProps getEndnotePr();

   boolean isSetEndnotePr();

   void setEndnotePr(CTEdnProps var1);

   CTEdnProps addNewEndnotePr();

   void unsetEndnotePr();

   CTSectType getType();

   boolean isSetType();

   void setType(CTSectType var1);

   CTSectType addNewType();

   void unsetType();

   CTPageSz getPgSz();

   boolean isSetPgSz();

   void setPgSz(CTPageSz var1);

   CTPageSz addNewPgSz();

   void unsetPgSz();

   CTPageMar getPgMar();

   boolean isSetPgMar();

   void setPgMar(CTPageMar var1);

   CTPageMar addNewPgMar();

   void unsetPgMar();

   CTPaperSource getPaperSrc();

   boolean isSetPaperSrc();

   void setPaperSrc(CTPaperSource var1);

   CTPaperSource addNewPaperSrc();

   void unsetPaperSrc();

   CTPageBorders getPgBorders();

   boolean isSetPgBorders();

   void setPgBorders(CTPageBorders var1);

   CTPageBorders addNewPgBorders();

   void unsetPgBorders();

   CTLineNumber getLnNumType();

   boolean isSetLnNumType();

   void setLnNumType(CTLineNumber var1);

   CTLineNumber addNewLnNumType();

   void unsetLnNumType();

   CTPageNumber getPgNumType();

   boolean isSetPgNumType();

   void setPgNumType(CTPageNumber var1);

   CTPageNumber addNewPgNumType();

   void unsetPgNumType();

   CTColumns getCols();

   boolean isSetCols();

   void setCols(CTColumns var1);

   CTColumns addNewCols();

   void unsetCols();

   CTOnOff getFormProt();

   boolean isSetFormProt();

   void setFormProt(CTOnOff var1);

   CTOnOff addNewFormProt();

   void unsetFormProt();

   CTVerticalJc getVAlign();

   boolean isSetVAlign();

   void setVAlign(CTVerticalJc var1);

   CTVerticalJc addNewVAlign();

   void unsetVAlign();

   CTOnOff getNoEndnote();

   boolean isSetNoEndnote();

   void setNoEndnote(CTOnOff var1);

   CTOnOff addNewNoEndnote();

   void unsetNoEndnote();

   CTOnOff getTitlePg();

   boolean isSetTitlePg();

   void setTitlePg(CTOnOff var1);

   CTOnOff addNewTitlePg();

   void unsetTitlePg();

   CTTextDirection getTextDirection();

   boolean isSetTextDirection();

   void setTextDirection(CTTextDirection var1);

   CTTextDirection addNewTextDirection();

   void unsetTextDirection();

   CTOnOff getBidi();

   boolean isSetBidi();

   void setBidi(CTOnOff var1);

   CTOnOff addNewBidi();

   void unsetBidi();

   CTOnOff getRtlGutter();

   boolean isSetRtlGutter();

   void setRtlGutter(CTOnOff var1);

   CTOnOff addNewRtlGutter();

   void unsetRtlGutter();

   CTDocGrid getDocGrid();

   boolean isSetDocGrid();

   void setDocGrid(CTDocGrid var1);

   CTDocGrid addNewDocGrid();

   void unsetDocGrid();

   CTRel getPrinterSettings();

   boolean isSetPrinterSettings();

   void setPrinterSettings(CTRel var1);

   CTRel addNewPrinterSettings();

   void unsetPrinterSettings();

   CTSectPrChange getSectPrChange();

   boolean isSetSectPrChange();

   void setSectPrChange(CTSectPrChange var1);

   CTSectPrChange addNewSectPrChange();

   void unsetSectPrChange();

   byte[] getRsidRPr();

   STLongHexNumber xgetRsidRPr();

   boolean isSetRsidRPr();

   void setRsidRPr(byte[] var1);

   void xsetRsidRPr(STLongHexNumber var1);

   void unsetRsidRPr();

   byte[] getRsidDel();

   STLongHexNumber xgetRsidDel();

   boolean isSetRsidDel();

   void setRsidDel(byte[] var1);

   void xsetRsidDel(STLongHexNumber var1);

   void unsetRsidDel();

   byte[] getRsidR();

   STLongHexNumber xgetRsidR();

   boolean isSetRsidR();

   void setRsidR(byte[] var1);

   void xsetRsidR(STLongHexNumber var1);

   void unsetRsidR();

   byte[] getRsidSect();

   STLongHexNumber xgetRsidSect();

   boolean isSetRsidSect();

   void setRsidSect(byte[] var1);

   void xsetRsidSect(STLongHexNumber var1);

   void unsetRsidSect();


   public static final class Factory {

      public static CTSectPr newInstance() {
         return (CTSectPr)POIXMLTypeLoader.newInstance(CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr newInstance(XmlOptions var0) {
         return (CTSectPr)POIXMLTypeLoader.newInstance(CTSectPr.type, var0);
      }

      public static CTSectPr parse(String var0) throws XmlException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static CTSectPr parse(File var0) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static CTSectPr parse(URL var0) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static CTSectPr parse(InputStream var0) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static CTSectPr parse(Reader var0) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static CTSectPr parse(XMLStreamReader var0) throws XmlException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static CTSectPr parse(Node var0) throws XmlException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static CTSectPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static CTSectPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSectPr)POIXMLTypeLoader.parse(var0, CTSectPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSectPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSectPr.type, var1);
      }

   }
}
