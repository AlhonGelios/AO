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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty;
import org.w3c.dom.Node;

public interface CTRPrElt extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRPrElt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrpreltecc2type");


   List getRFontList();

   CTFontName[] getRFontArray();

   CTFontName getRFontArray(int var1);

   int sizeOfRFontArray();

   void setRFontArray(CTFontName[] var1);

   void setRFontArray(int var1, CTFontName var2);

   CTFontName insertNewRFont(int var1);

   CTFontName addNewRFont();

   void removeRFont(int var1);

   List getCharsetList();

   CTIntProperty[] getCharsetArray();

   CTIntProperty getCharsetArray(int var1);

   int sizeOfCharsetArray();

   void setCharsetArray(CTIntProperty[] var1);

   void setCharsetArray(int var1, CTIntProperty var2);

   CTIntProperty insertNewCharset(int var1);

   CTIntProperty addNewCharset();

   void removeCharset(int var1);

   List getFamilyList();

   CTIntProperty[] getFamilyArray();

   CTIntProperty getFamilyArray(int var1);

   int sizeOfFamilyArray();

   void setFamilyArray(CTIntProperty[] var1);

   void setFamilyArray(int var1, CTIntProperty var2);

   CTIntProperty insertNewFamily(int var1);

   CTIntProperty addNewFamily();

   void removeFamily(int var1);

   List getBList();

   CTBooleanProperty[] getBArray();

   CTBooleanProperty getBArray(int var1);

   int sizeOfBArray();

   void setBArray(CTBooleanProperty[] var1);

   void setBArray(int var1, CTBooleanProperty var2);

   CTBooleanProperty insertNewB(int var1);

   CTBooleanProperty addNewB();

   void removeB(int var1);

   List getIList();

   CTBooleanProperty[] getIArray();

   CTBooleanProperty getIArray(int var1);

   int sizeOfIArray();

   void setIArray(CTBooleanProperty[] var1);

   void setIArray(int var1, CTBooleanProperty var2);

   CTBooleanProperty insertNewI(int var1);

   CTBooleanProperty addNewI();

   void removeI(int var1);

   List getStrikeList();

   CTBooleanProperty[] getStrikeArray();

   CTBooleanProperty getStrikeArray(int var1);

   int sizeOfStrikeArray();

   void setStrikeArray(CTBooleanProperty[] var1);

   void setStrikeArray(int var1, CTBooleanProperty var2);

   CTBooleanProperty insertNewStrike(int var1);

   CTBooleanProperty addNewStrike();

   void removeStrike(int var1);

   List getOutlineList();

   CTBooleanProperty[] getOutlineArray();

   CTBooleanProperty getOutlineArray(int var1);

   int sizeOfOutlineArray();

   void setOutlineArray(CTBooleanProperty[] var1);

   void setOutlineArray(int var1, CTBooleanProperty var2);

   CTBooleanProperty insertNewOutline(int var1);

   CTBooleanProperty addNewOutline();

   void removeOutline(int var1);

   List getShadowList();

   CTBooleanProperty[] getShadowArray();

   CTBooleanProperty getShadowArray(int var1);

   int sizeOfShadowArray();

   void setShadowArray(CTBooleanProperty[] var1);

   void setShadowArray(int var1, CTBooleanProperty var2);

   CTBooleanProperty insertNewShadow(int var1);

   CTBooleanProperty addNewShadow();

   void removeShadow(int var1);

   List getCondenseList();

   CTBooleanProperty[] getCondenseArray();

   CTBooleanProperty getCondenseArray(int var1);

   int sizeOfCondenseArray();

   void setCondenseArray(CTBooleanProperty[] var1);

   void setCondenseArray(int var1, CTBooleanProperty var2);

   CTBooleanProperty insertNewCondense(int var1);

   CTBooleanProperty addNewCondense();

   void removeCondense(int var1);

   List getExtendList();

   CTBooleanProperty[] getExtendArray();

   CTBooleanProperty getExtendArray(int var1);

   int sizeOfExtendArray();

   void setExtendArray(CTBooleanProperty[] var1);

   void setExtendArray(int var1, CTBooleanProperty var2);

   CTBooleanProperty insertNewExtend(int var1);

   CTBooleanProperty addNewExtend();

   void removeExtend(int var1);

   List getColorList();

   CTColor[] getColorArray();

   CTColor getColorArray(int var1);

   int sizeOfColorArray();

   void setColorArray(CTColor[] var1);

   void setColorArray(int var1, CTColor var2);

   CTColor insertNewColor(int var1);

   CTColor addNewColor();

   void removeColor(int var1);

   List getSzList();

   CTFontSize[] getSzArray();

   CTFontSize getSzArray(int var1);

   int sizeOfSzArray();

   void setSzArray(CTFontSize[] var1);

   void setSzArray(int var1, CTFontSize var2);

   CTFontSize insertNewSz(int var1);

   CTFontSize addNewSz();

   void removeSz(int var1);

   List getUList();

   CTUnderlineProperty[] getUArray();

   CTUnderlineProperty getUArray(int var1);

   int sizeOfUArray();

   void setUArray(CTUnderlineProperty[] var1);

   void setUArray(int var1, CTUnderlineProperty var2);

   CTUnderlineProperty insertNewU(int var1);

   CTUnderlineProperty addNewU();

   void removeU(int var1);

   List getVertAlignList();

   CTVerticalAlignFontProperty[] getVertAlignArray();

   CTVerticalAlignFontProperty getVertAlignArray(int var1);

   int sizeOfVertAlignArray();

   void setVertAlignArray(CTVerticalAlignFontProperty[] var1);

   void setVertAlignArray(int var1, CTVerticalAlignFontProperty var2);

   CTVerticalAlignFontProperty insertNewVertAlign(int var1);

   CTVerticalAlignFontProperty addNewVertAlign();

   void removeVertAlign(int var1);

   List getSchemeList();

   CTFontScheme[] getSchemeArray();

   CTFontScheme getSchemeArray(int var1);

   int sizeOfSchemeArray();

   void setSchemeArray(CTFontScheme[] var1);

   void setSchemeArray(int var1, CTFontScheme var2);

   CTFontScheme insertNewScheme(int var1);

   CTFontScheme addNewScheme();

   void removeScheme(int var1);


   public static final class Factory {

      public static CTRPrElt newInstance() {
         return (CTRPrElt)POIXMLTypeLoader.newInstance(CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt newInstance(XmlOptions var0) {
         return (CTRPrElt)POIXMLTypeLoader.newInstance(CTRPrElt.type, var0);
      }

      public static CTRPrElt parse(String var0) throws XmlException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static CTRPrElt parse(File var0) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static CTRPrElt parse(URL var0) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static CTRPrElt parse(InputStream var0) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static CTRPrElt parse(Reader var0) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static CTRPrElt parse(XMLStreamReader var0) throws XmlException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static CTRPrElt parse(Node var0) throws XmlException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static CTRPrElt parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static CTRPrElt parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRPrElt)POIXMLTypeLoader.parse(var0, CTRPrElt.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRPrElt.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRPrElt.type, var1);
      }

   }
}
