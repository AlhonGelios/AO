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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;
import org.w3c.dom.Node;

public interface CTConditionalFormatting extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTConditionalFormatting.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctconditionalformatting0deatype");


   List getCfRuleList();

   CTCfRule[] getCfRuleArray();

   CTCfRule getCfRuleArray(int var1);

   int sizeOfCfRuleArray();

   void setCfRuleArray(CTCfRule[] var1);

   void setCfRuleArray(int var1, CTCfRule var2);

   CTCfRule insertNewCfRule(int var1);

   CTCfRule addNewCfRule();

   void removeCfRule(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getPivot();

   XmlBoolean xgetPivot();

   boolean isSetPivot();

   void setPivot(boolean var1);

   void xsetPivot(XmlBoolean var1);

   void unsetPivot();

   List getSqref();

   STSqref xgetSqref();

   boolean isSetSqref();

   void setSqref(List var1);

   void xsetSqref(STSqref var1);

   void unsetSqref();


   public static final class Factory {

      public static CTConditionalFormatting newInstance() {
         return (CTConditionalFormatting)POIXMLTypeLoader.newInstance(CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting newInstance(XmlOptions var0) {
         return (CTConditionalFormatting)POIXMLTypeLoader.newInstance(CTConditionalFormatting.type, var0);
      }

      public static CTConditionalFormatting parse(String var0) throws XmlException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(String var0, XmlOptions var1) throws XmlException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static CTConditionalFormatting parse(File var0) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static CTConditionalFormatting parse(URL var0) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static CTConditionalFormatting parse(InputStream var0) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static CTConditionalFormatting parse(Reader var0) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static CTConditionalFormatting parse(XMLStreamReader var0) throws XmlException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static CTConditionalFormatting parse(Node var0) throws XmlException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static CTConditionalFormatting parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static CTConditionalFormatting parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTConditionalFormatting)POIXMLTypeLoader.parse(var0, CTConditionalFormatting.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConditionalFormatting.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConditionalFormatting.type, var1);
      }

   }
}
