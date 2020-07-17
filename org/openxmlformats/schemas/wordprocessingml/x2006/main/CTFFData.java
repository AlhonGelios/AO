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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.w3c.dom.Node;

public interface CTFFData extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFFData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctffdataaa7etype");


   List getNameList();

   CTFFName[] getNameArray();

   CTFFName getNameArray(int var1);

   int sizeOfNameArray();

   void setNameArray(CTFFName[] var1);

   void setNameArray(int var1, CTFFName var2);

   CTFFName insertNewName(int var1);

   CTFFName addNewName();

   void removeName(int var1);

   List getEnabledList();

   CTOnOff[] getEnabledArray();

   CTOnOff getEnabledArray(int var1);

   int sizeOfEnabledArray();

   void setEnabledArray(CTOnOff[] var1);

   void setEnabledArray(int var1, CTOnOff var2);

   CTOnOff insertNewEnabled(int var1);

   CTOnOff addNewEnabled();

   void removeEnabled(int var1);

   List getCalcOnExitList();

   CTOnOff[] getCalcOnExitArray();

   CTOnOff getCalcOnExitArray(int var1);

   int sizeOfCalcOnExitArray();

   void setCalcOnExitArray(CTOnOff[] var1);

   void setCalcOnExitArray(int var1, CTOnOff var2);

   CTOnOff insertNewCalcOnExit(int var1);

   CTOnOff addNewCalcOnExit();

   void removeCalcOnExit(int var1);

   List getEntryMacroList();

   CTMacroName[] getEntryMacroArray();

   CTMacroName getEntryMacroArray(int var1);

   int sizeOfEntryMacroArray();

   void setEntryMacroArray(CTMacroName[] var1);

   void setEntryMacroArray(int var1, CTMacroName var2);

   CTMacroName insertNewEntryMacro(int var1);

   CTMacroName addNewEntryMacro();

   void removeEntryMacro(int var1);

   List getExitMacroList();

   CTMacroName[] getExitMacroArray();

   CTMacroName getExitMacroArray(int var1);

   int sizeOfExitMacroArray();

   void setExitMacroArray(CTMacroName[] var1);

   void setExitMacroArray(int var1, CTMacroName var2);

   CTMacroName insertNewExitMacro(int var1);

   CTMacroName addNewExitMacro();

   void removeExitMacro(int var1);

   List getHelpTextList();

   CTFFHelpText[] getHelpTextArray();

   CTFFHelpText getHelpTextArray(int var1);

   int sizeOfHelpTextArray();

   void setHelpTextArray(CTFFHelpText[] var1);

   void setHelpTextArray(int var1, CTFFHelpText var2);

   CTFFHelpText insertNewHelpText(int var1);

   CTFFHelpText addNewHelpText();

   void removeHelpText(int var1);

   List getStatusTextList();

   CTFFStatusText[] getStatusTextArray();

   CTFFStatusText getStatusTextArray(int var1);

   int sizeOfStatusTextArray();

   void setStatusTextArray(CTFFStatusText[] var1);

   void setStatusTextArray(int var1, CTFFStatusText var2);

   CTFFStatusText insertNewStatusText(int var1);

   CTFFStatusText addNewStatusText();

   void removeStatusText(int var1);

   List getCheckBoxList();

   CTFFCheckBox[] getCheckBoxArray();

   CTFFCheckBox getCheckBoxArray(int var1);

   int sizeOfCheckBoxArray();

   void setCheckBoxArray(CTFFCheckBox[] var1);

   void setCheckBoxArray(int var1, CTFFCheckBox var2);

   CTFFCheckBox insertNewCheckBox(int var1);

   CTFFCheckBox addNewCheckBox();

   void removeCheckBox(int var1);

   List getDdListList();

   CTFFDDList[] getDdListArray();

   CTFFDDList getDdListArray(int var1);

   int sizeOfDdListArray();

   void setDdListArray(CTFFDDList[] var1);

   void setDdListArray(int var1, CTFFDDList var2);

   CTFFDDList insertNewDdList(int var1);

   CTFFDDList addNewDdList();

   void removeDdList(int var1);

   List getTextInputList();

   CTFFTextInput[] getTextInputArray();

   CTFFTextInput getTextInputArray(int var1);

   int sizeOfTextInputArray();

   void setTextInputArray(CTFFTextInput[] var1);

   void setTextInputArray(int var1, CTFFTextInput var2);

   CTFFTextInput insertNewTextInput(int var1);

   CTFFTextInput addNewTextInput();

   void removeTextInput(int var1);


   public static final class Factory {

      public static CTFFData newInstance() {
         return (CTFFData)POIXMLTypeLoader.newInstance(CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData newInstance(XmlOptions var0) {
         return (CTFFData)POIXMLTypeLoader.newInstance(CTFFData.type, var0);
      }

      public static CTFFData parse(String var0) throws XmlException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static CTFFData parse(File var0) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static CTFFData parse(URL var0) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static CTFFData parse(InputStream var0) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static CTFFData parse(Reader var0) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static CTFFData parse(XMLStreamReader var0) throws XmlException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static CTFFData parse(Node var0) throws XmlException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static CTFFData parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, (XmlOptions)null);
      }

      public static CTFFData parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFFData)POIXMLTypeLoader.parse(var0, CTFFData.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFFData.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFFData.type, var1);
      }

   }
}
