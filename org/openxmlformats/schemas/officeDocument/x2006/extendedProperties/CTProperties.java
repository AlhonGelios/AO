package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant;
import org.w3c.dom.Node;

public interface CTProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctproperties3f10type");


   String getTemplate();

   XmlString xgetTemplate();

   boolean isSetTemplate();

   void setTemplate(String var1);

   void xsetTemplate(XmlString var1);

   void unsetTemplate();

   String getManager();

   XmlString xgetManager();

   boolean isSetManager();

   void setManager(String var1);

   void xsetManager(XmlString var1);

   void unsetManager();

   String getCompany();

   XmlString xgetCompany();

   boolean isSetCompany();

   void setCompany(String var1);

   void xsetCompany(XmlString var1);

   void unsetCompany();

   int getPages();

   XmlInt xgetPages();

   boolean isSetPages();

   void setPages(int var1);

   void xsetPages(XmlInt var1);

   void unsetPages();

   int getWords();

   XmlInt xgetWords();

   boolean isSetWords();

   void setWords(int var1);

   void xsetWords(XmlInt var1);

   void unsetWords();

   int getCharacters();

   XmlInt xgetCharacters();

   boolean isSetCharacters();

   void setCharacters(int var1);

   void xsetCharacters(XmlInt var1);

   void unsetCharacters();

   String getPresentationFormat();

   XmlString xgetPresentationFormat();

   boolean isSetPresentationFormat();

   void setPresentationFormat(String var1);

   void xsetPresentationFormat(XmlString var1);

   void unsetPresentationFormat();

   int getLines();

   XmlInt xgetLines();

   boolean isSetLines();

   void setLines(int var1);

   void xsetLines(XmlInt var1);

   void unsetLines();

   int getParagraphs();

   XmlInt xgetParagraphs();

   boolean isSetParagraphs();

   void setParagraphs(int var1);

   void xsetParagraphs(XmlInt var1);

   void unsetParagraphs();

   int getSlides();

   XmlInt xgetSlides();

   boolean isSetSlides();

   void setSlides(int var1);

   void xsetSlides(XmlInt var1);

   void unsetSlides();

   int getNotes();

   XmlInt xgetNotes();

   boolean isSetNotes();

   void setNotes(int var1);

   void xsetNotes(XmlInt var1);

   void unsetNotes();

   int getTotalTime();

   XmlInt xgetTotalTime();

   boolean isSetTotalTime();

   void setTotalTime(int var1);

   void xsetTotalTime(XmlInt var1);

   void unsetTotalTime();

   int getHiddenSlides();

   XmlInt xgetHiddenSlides();

   boolean isSetHiddenSlides();

   void setHiddenSlides(int var1);

   void xsetHiddenSlides(XmlInt var1);

   void unsetHiddenSlides();

   int getMMClips();

   XmlInt xgetMMClips();

   boolean isSetMMClips();

   void setMMClips(int var1);

   void xsetMMClips(XmlInt var1);

   void unsetMMClips();

   boolean getScaleCrop();

   XmlBoolean xgetScaleCrop();

   boolean isSetScaleCrop();

   void setScaleCrop(boolean var1);

   void xsetScaleCrop(XmlBoolean var1);

   void unsetScaleCrop();

   CTVectorVariant getHeadingPairs();

   boolean isSetHeadingPairs();

   void setHeadingPairs(CTVectorVariant var1);

   CTVectorVariant addNewHeadingPairs();

   void unsetHeadingPairs();

   CTVectorLpstr getTitlesOfParts();

   boolean isSetTitlesOfParts();

   void setTitlesOfParts(CTVectorLpstr var1);

   CTVectorLpstr addNewTitlesOfParts();

   void unsetTitlesOfParts();

   boolean getLinksUpToDate();

   XmlBoolean xgetLinksUpToDate();

   boolean isSetLinksUpToDate();

   void setLinksUpToDate(boolean var1);

   void xsetLinksUpToDate(XmlBoolean var1);

   void unsetLinksUpToDate();

   int getCharactersWithSpaces();

   XmlInt xgetCharactersWithSpaces();

   boolean isSetCharactersWithSpaces();

   void setCharactersWithSpaces(int var1);

   void xsetCharactersWithSpaces(XmlInt var1);

   void unsetCharactersWithSpaces();

   boolean getSharedDoc();

   XmlBoolean xgetSharedDoc();

   boolean isSetSharedDoc();

   void setSharedDoc(boolean var1);

   void xsetSharedDoc(XmlBoolean var1);

   void unsetSharedDoc();

   String getHyperlinkBase();

   XmlString xgetHyperlinkBase();

   boolean isSetHyperlinkBase();

   void setHyperlinkBase(String var1);

   void xsetHyperlinkBase(XmlString var1);

   void unsetHyperlinkBase();

   CTVectorVariant getHLinks();

   boolean isSetHLinks();

   void setHLinks(CTVectorVariant var1);

   CTVectorVariant addNewHLinks();

   void unsetHLinks();

   boolean getHyperlinksChanged();

   XmlBoolean xgetHyperlinksChanged();

   boolean isSetHyperlinksChanged();

   void setHyperlinksChanged(boolean var1);

   void xsetHyperlinksChanged(XmlBoolean var1);

   void unsetHyperlinksChanged();

   CTDigSigBlob getDigSig();

   boolean isSetDigSig();

   void setDigSig(CTDigSigBlob var1);

   CTDigSigBlob addNewDigSig();

   void unsetDigSig();

   String getApplication();

   XmlString xgetApplication();

   boolean isSetApplication();

   void setApplication(String var1);

   void xsetApplication(XmlString var1);

   void unsetApplication();

   String getAppVersion();

   XmlString xgetAppVersion();

   boolean isSetAppVersion();

   void setAppVersion(String var1);

   void xsetAppVersion(XmlString var1);

   void unsetAppVersion();

   int getDocSecurity();

   XmlInt xgetDocSecurity();

   boolean isSetDocSecurity();

   void setDocSecurity(int var1);

   void xsetDocSecurity(XmlInt var1);

   void unsetDocSecurity();


   public static final class Factory {

      public static CTProperties newInstance() {
         return (CTProperties)POIXMLTypeLoader.newInstance(CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties newInstance(XmlOptions var0) {
         return (CTProperties)POIXMLTypeLoader.newInstance(CTProperties.type, var0);
      }

      public static CTProperties parse(String var0) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(File var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(URL var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(Reader var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(Node var0) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProperties.type, var1);
      }

   }
}
