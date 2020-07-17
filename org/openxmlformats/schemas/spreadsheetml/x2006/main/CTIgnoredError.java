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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;
import org.w3c.dom.Node;

public interface CTIgnoredError extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTIgnoredError.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctignorederrorc51ftype");


   List getSqref();

   STSqref xgetSqref();

   void setSqref(List var1);

   void xsetSqref(STSqref var1);

   boolean getEvalError();

   XmlBoolean xgetEvalError();

   boolean isSetEvalError();

   void setEvalError(boolean var1);

   void xsetEvalError(XmlBoolean var1);

   void unsetEvalError();

   boolean getTwoDigitTextYear();

   XmlBoolean xgetTwoDigitTextYear();

   boolean isSetTwoDigitTextYear();

   void setTwoDigitTextYear(boolean var1);

   void xsetTwoDigitTextYear(XmlBoolean var1);

   void unsetTwoDigitTextYear();

   boolean getNumberStoredAsText();

   XmlBoolean xgetNumberStoredAsText();

   boolean isSetNumberStoredAsText();

   void setNumberStoredAsText(boolean var1);

   void xsetNumberStoredAsText(XmlBoolean var1);

   void unsetNumberStoredAsText();

   boolean getFormula();

   XmlBoolean xgetFormula();

   boolean isSetFormula();

   void setFormula(boolean var1);

   void xsetFormula(XmlBoolean var1);

   void unsetFormula();

   boolean getFormulaRange();

   XmlBoolean xgetFormulaRange();

   boolean isSetFormulaRange();

   void setFormulaRange(boolean var1);

   void xsetFormulaRange(XmlBoolean var1);

   void unsetFormulaRange();

   boolean getUnlockedFormula();

   XmlBoolean xgetUnlockedFormula();

   boolean isSetUnlockedFormula();

   void setUnlockedFormula(boolean var1);

   void xsetUnlockedFormula(XmlBoolean var1);

   void unsetUnlockedFormula();

   boolean getEmptyCellReference();

   XmlBoolean xgetEmptyCellReference();

   boolean isSetEmptyCellReference();

   void setEmptyCellReference(boolean var1);

   void xsetEmptyCellReference(XmlBoolean var1);

   void unsetEmptyCellReference();

   boolean getListDataValidation();

   XmlBoolean xgetListDataValidation();

   boolean isSetListDataValidation();

   void setListDataValidation(boolean var1);

   void xsetListDataValidation(XmlBoolean var1);

   void unsetListDataValidation();

   boolean getCalculatedColumn();

   XmlBoolean xgetCalculatedColumn();

   boolean isSetCalculatedColumn();

   void setCalculatedColumn(boolean var1);

   void xsetCalculatedColumn(XmlBoolean var1);

   void unsetCalculatedColumn();


   public static final class Factory {

      public static CTIgnoredError newInstance() {
         return (CTIgnoredError)POIXMLTypeLoader.newInstance(CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError newInstance(XmlOptions var0) {
         return (CTIgnoredError)POIXMLTypeLoader.newInstance(CTIgnoredError.type, var0);
      }

      public static CTIgnoredError parse(String var0) throws XmlException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(String var0, XmlOptions var1) throws XmlException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static CTIgnoredError parse(File var0) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static CTIgnoredError parse(URL var0) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static CTIgnoredError parse(InputStream var0) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static CTIgnoredError parse(Reader var0) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static CTIgnoredError parse(XMLStreamReader var0) throws XmlException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static CTIgnoredError parse(Node var0) throws XmlException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static CTIgnoredError parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static CTIgnoredError parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTIgnoredError)POIXMLTypeLoader.parse(var0, CTIgnoredError.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIgnoredError.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIgnoredError.type, var1);
      }

   }
}
