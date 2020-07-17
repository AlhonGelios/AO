package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackground;
import org.openxmlformats.schemas.presentationml.x2006.main.CTControlList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.w3c.dom.Node;

public interface CTCommonSlideData extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCommonSlideData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcommonslidedata8c7ftype");


   CTBackground getBg();

   boolean isSetBg();

   void setBg(CTBackground var1);

   CTBackground addNewBg();

   void unsetBg();

   CTGroupShape getSpTree();

   void setSpTree(CTGroupShape var1);

   CTGroupShape addNewSpTree();

   CTCustomerDataList getCustDataLst();

   boolean isSetCustDataLst();

   void setCustDataLst(CTCustomerDataList var1);

   CTCustomerDataList addNewCustDataLst();

   void unsetCustDataLst();

   CTControlList getControls();

   boolean isSetControls();

   void setControls(CTControlList var1);

   CTControlList addNewControls();

   void unsetControls();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();


   public static final class Factory {

      public static CTCommonSlideData newInstance() {
         return (CTCommonSlideData)POIXMLTypeLoader.newInstance(CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData newInstance(XmlOptions var0) {
         return (CTCommonSlideData)POIXMLTypeLoader.newInstance(CTCommonSlideData.type, var0);
      }

      public static CTCommonSlideData parse(String var0) throws XmlException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static CTCommonSlideData parse(File var0) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static CTCommonSlideData parse(URL var0) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static CTCommonSlideData parse(InputStream var0) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static CTCommonSlideData parse(Reader var0) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static CTCommonSlideData parse(XMLStreamReader var0) throws XmlException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static CTCommonSlideData parse(Node var0) throws XmlException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static CTCommonSlideData parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static CTCommonSlideData parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCommonSlideData)POIXMLTypeLoader.parse(var0, CTCommonSlideData.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommonSlideData.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommonSlideData.type, var1);
      }

   }
}
