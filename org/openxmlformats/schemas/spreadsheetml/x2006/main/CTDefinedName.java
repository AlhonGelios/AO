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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTDefinedName extends STFormula {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDefinedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdefinedname9413type");


   String getName();

   STXstring xgetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   String getComment();

   STXstring xgetComment();

   boolean isSetComment();

   void setComment(String var1);

   void xsetComment(STXstring var1);

   void unsetComment();

   String getCustomMenu();

   STXstring xgetCustomMenu();

   boolean isSetCustomMenu();

   void setCustomMenu(String var1);

   void xsetCustomMenu(STXstring var1);

   void unsetCustomMenu();

   String getDescription();

   STXstring xgetDescription();

   boolean isSetDescription();

   void setDescription(String var1);

   void xsetDescription(STXstring var1);

   void unsetDescription();

   String getHelp();

   STXstring xgetHelp();

   boolean isSetHelp();

   void setHelp(String var1);

   void xsetHelp(STXstring var1);

   void unsetHelp();

   String getStatusBar();

   STXstring xgetStatusBar();

   boolean isSetStatusBar();

   void setStatusBar(String var1);

   void xsetStatusBar(STXstring var1);

   void unsetStatusBar();

   long getLocalSheetId();

   XmlUnsignedInt xgetLocalSheetId();

   boolean isSetLocalSheetId();

   void setLocalSheetId(long var1);

   void xsetLocalSheetId(XmlUnsignedInt var1);

   void unsetLocalSheetId();

   boolean getHidden();

   XmlBoolean xgetHidden();

   boolean isSetHidden();

   void setHidden(boolean var1);

   void xsetHidden(XmlBoolean var1);

   void unsetHidden();

   boolean getFunction();

   XmlBoolean xgetFunction();

   boolean isSetFunction();

   void setFunction(boolean var1);

   void xsetFunction(XmlBoolean var1);

   void unsetFunction();

   boolean getVbProcedure();

   XmlBoolean xgetVbProcedure();

   boolean isSetVbProcedure();

   void setVbProcedure(boolean var1);

   void xsetVbProcedure(XmlBoolean var1);

   void unsetVbProcedure();

   boolean getXlm();

   XmlBoolean xgetXlm();

   boolean isSetXlm();

   void setXlm(boolean var1);

   void xsetXlm(XmlBoolean var1);

   void unsetXlm();

   long getFunctionGroupId();

   XmlUnsignedInt xgetFunctionGroupId();

   boolean isSetFunctionGroupId();

   void setFunctionGroupId(long var1);

   void xsetFunctionGroupId(XmlUnsignedInt var1);

   void unsetFunctionGroupId();

   String getShortcutKey();

   STXstring xgetShortcutKey();

   boolean isSetShortcutKey();

   void setShortcutKey(String var1);

   void xsetShortcutKey(STXstring var1);

   void unsetShortcutKey();

   boolean getPublishToServer();

   XmlBoolean xgetPublishToServer();

   boolean isSetPublishToServer();

   void setPublishToServer(boolean var1);

   void xsetPublishToServer(XmlBoolean var1);

   void unsetPublishToServer();

   boolean getWorkbookParameter();

   XmlBoolean xgetWorkbookParameter();

   boolean isSetWorkbookParameter();

   void setWorkbookParameter(boolean var1);

   void xsetWorkbookParameter(XmlBoolean var1);

   void unsetWorkbookParameter();


   public static final class Factory {

      public static CTDefinedName newInstance() {
         return (CTDefinedName)POIXMLTypeLoader.newInstance(CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName newInstance(XmlOptions var0) {
         return (CTDefinedName)POIXMLTypeLoader.newInstance(CTDefinedName.type, var0);
      }

      public static CTDefinedName parse(String var0) throws XmlException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static CTDefinedName parse(File var0) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static CTDefinedName parse(URL var0) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static CTDefinedName parse(InputStream var0) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static CTDefinedName parse(Reader var0) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static CTDefinedName parse(XMLStreamReader var0) throws XmlException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static CTDefinedName parse(Node var0) throws XmlException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static CTDefinedName parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static CTDefinedName parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDefinedName)POIXMLTypeLoader.parse(var0, CTDefinedName.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDefinedName.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDefinedName.type, var1);
      }

   }
}
