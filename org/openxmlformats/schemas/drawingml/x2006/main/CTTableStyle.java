package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;
import org.w3c.dom.Node;

public interface CTTableStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablestyled59etype");


   CTTableBackgroundStyle getTblBg();

   boolean isSetTblBg();

   void setTblBg(CTTableBackgroundStyle var1);

   CTTableBackgroundStyle addNewTblBg();

   void unsetTblBg();

   CTTablePartStyle getWholeTbl();

   boolean isSetWholeTbl();

   void setWholeTbl(CTTablePartStyle var1);

   CTTablePartStyle addNewWholeTbl();

   void unsetWholeTbl();

   CTTablePartStyle getBand1H();

   boolean isSetBand1H();

   void setBand1H(CTTablePartStyle var1);

   CTTablePartStyle addNewBand1H();

   void unsetBand1H();

   CTTablePartStyle getBand2H();

   boolean isSetBand2H();

   void setBand2H(CTTablePartStyle var1);

   CTTablePartStyle addNewBand2H();

   void unsetBand2H();

   CTTablePartStyle getBand1V();

   boolean isSetBand1V();

   void setBand1V(CTTablePartStyle var1);

   CTTablePartStyle addNewBand1V();

   void unsetBand1V();

   CTTablePartStyle getBand2V();

   boolean isSetBand2V();

   void setBand2V(CTTablePartStyle var1);

   CTTablePartStyle addNewBand2V();

   void unsetBand2V();

   CTTablePartStyle getLastCol();

   boolean isSetLastCol();

   void setLastCol(CTTablePartStyle var1);

   CTTablePartStyle addNewLastCol();

   void unsetLastCol();

   CTTablePartStyle getFirstCol();

   boolean isSetFirstCol();

   void setFirstCol(CTTablePartStyle var1);

   CTTablePartStyle addNewFirstCol();

   void unsetFirstCol();

   CTTablePartStyle getLastRow();

   boolean isSetLastRow();

   void setLastRow(CTTablePartStyle var1);

   CTTablePartStyle addNewLastRow();

   void unsetLastRow();

   CTTablePartStyle getSeCell();

   boolean isSetSeCell();

   void setSeCell(CTTablePartStyle var1);

   CTTablePartStyle addNewSeCell();

   void unsetSeCell();

   CTTablePartStyle getSwCell();

   boolean isSetSwCell();

   void setSwCell(CTTablePartStyle var1);

   CTTablePartStyle addNewSwCell();

   void unsetSwCell();

   CTTablePartStyle getFirstRow();

   boolean isSetFirstRow();

   void setFirstRow(CTTablePartStyle var1);

   CTTablePartStyle addNewFirstRow();

   void unsetFirstRow();

   CTTablePartStyle getNeCell();

   boolean isSetNeCell();

   void setNeCell(CTTablePartStyle var1);

   CTTablePartStyle addNewNeCell();

   void unsetNeCell();

   CTTablePartStyle getNwCell();

   boolean isSetNwCell();

   void setNwCell(CTTablePartStyle var1);

   CTTablePartStyle addNewNwCell();

   void unsetNwCell();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   String getStyleId();

   STGuid xgetStyleId();

   void setStyleId(String var1);

   void xsetStyleId(STGuid var1);

   String getStyleName();

   XmlString xgetStyleName();

   void setStyleName(String var1);

   void xsetStyleName(XmlString var1);


   public static final class Factory {

      public static CTTableStyle newInstance() {
         return (CTTableStyle)POIXMLTypeLoader.newInstance(CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle newInstance(XmlOptions var0) {
         return (CTTableStyle)POIXMLTypeLoader.newInstance(CTTableStyle.type, var0);
      }

      public static CTTableStyle parse(String var0) throws XmlException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static CTTableStyle parse(File var0) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static CTTableStyle parse(URL var0) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static CTTableStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static CTTableStyle parse(Reader var0) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static CTTableStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static CTTableStyle parse(Node var0) throws XmlException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static CTTableStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static CTTableStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableStyle)POIXMLTypeLoader.parse(var0, CTTableStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyle.type, var1);
      }

   }
}
