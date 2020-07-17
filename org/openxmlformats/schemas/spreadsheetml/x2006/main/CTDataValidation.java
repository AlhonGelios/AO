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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTDataValidation extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDataValidation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdatavalidation9d0ctype");


   String getFormula1();

   STFormula xgetFormula1();

   boolean isSetFormula1();

   void setFormula1(String var1);

   void xsetFormula1(STFormula var1);

   void unsetFormula1();

   String getFormula2();

   STFormula xgetFormula2();

   boolean isSetFormula2();

   void setFormula2(String var1);

   void xsetFormula2(STFormula var1);

   void unsetFormula2();

   STDataValidationType.Enum getType();

   STDataValidationType xgetType();

   boolean isSetType();

   void setType(STDataValidationType.Enum var1);

   void xsetType(STDataValidationType var1);

   void unsetType();

   STDataValidationErrorStyle.Enum getErrorStyle();

   STDataValidationErrorStyle xgetErrorStyle();

   boolean isSetErrorStyle();

   void setErrorStyle(STDataValidationErrorStyle.Enum var1);

   void xsetErrorStyle(STDataValidationErrorStyle var1);

   void unsetErrorStyle();

   STDataValidationImeMode$Enum getImeMode();

   STDataValidationImeMode xgetImeMode();

   boolean isSetImeMode();

   void setImeMode(STDataValidationImeMode$Enum var1);

   void xsetImeMode(STDataValidationImeMode var1);

   void unsetImeMode();

   STDataValidationOperator.Enum getOperator();

   STDataValidationOperator xgetOperator();

   boolean isSetOperator();

   void setOperator(STDataValidationOperator.Enum var1);

   void xsetOperator(STDataValidationOperator var1);

   void unsetOperator();

   boolean getAllowBlank();

   XmlBoolean xgetAllowBlank();

   boolean isSetAllowBlank();

   void setAllowBlank(boolean var1);

   void xsetAllowBlank(XmlBoolean var1);

   void unsetAllowBlank();

   boolean getShowDropDown();

   XmlBoolean xgetShowDropDown();

   boolean isSetShowDropDown();

   void setShowDropDown(boolean var1);

   void xsetShowDropDown(XmlBoolean var1);

   void unsetShowDropDown();

   boolean getShowInputMessage();

   XmlBoolean xgetShowInputMessage();

   boolean isSetShowInputMessage();

   void setShowInputMessage(boolean var1);

   void xsetShowInputMessage(XmlBoolean var1);

   void unsetShowInputMessage();

   boolean getShowErrorMessage();

   XmlBoolean xgetShowErrorMessage();

   boolean isSetShowErrorMessage();

   void setShowErrorMessage(boolean var1);

   void xsetShowErrorMessage(XmlBoolean var1);

   void unsetShowErrorMessage();

   String getErrorTitle();

   STXstring xgetErrorTitle();

   boolean isSetErrorTitle();

   void setErrorTitle(String var1);

   void xsetErrorTitle(STXstring var1);

   void unsetErrorTitle();

   String getError();

   STXstring xgetError();

   boolean isSetError();

   void setError(String var1);

   void xsetError(STXstring var1);

   void unsetError();

   String getPromptTitle();

   STXstring xgetPromptTitle();

   boolean isSetPromptTitle();

   void setPromptTitle(String var1);

   void xsetPromptTitle(STXstring var1);

   void unsetPromptTitle();

   String getPrompt();

   STXstring xgetPrompt();

   boolean isSetPrompt();

   void setPrompt(String var1);

   void xsetPrompt(STXstring var1);

   void unsetPrompt();

   List getSqref();

   STSqref xgetSqref();

   void setSqref(List var1);

   void xsetSqref(STSqref var1);


   public static final class Factory {

      public static CTDataValidation newInstance() {
         return (CTDataValidation)POIXMLTypeLoader.newInstance(CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation newInstance(XmlOptions var0) {
         return (CTDataValidation)POIXMLTypeLoader.newInstance(CTDataValidation.type, var0);
      }

      public static CTDataValidation parse(String var0) throws XmlException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static CTDataValidation parse(File var0) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static CTDataValidation parse(URL var0) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static CTDataValidation parse(InputStream var0) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static CTDataValidation parse(Reader var0) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static CTDataValidation parse(XMLStreamReader var0) throws XmlException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static CTDataValidation parse(Node var0) throws XmlException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static CTDataValidation parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static CTDataValidation parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDataValidation)POIXMLTypeLoader.parse(var0, CTDataValidation.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataValidation.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataValidation.type, var1);
      }

   }
}
