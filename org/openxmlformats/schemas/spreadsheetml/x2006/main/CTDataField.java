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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTDataField extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDataField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdatafield6f0ftype");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getName();

   STXstring xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   void unsetName();

   long getFld();

   XmlUnsignedInt xgetFld();

   void setFld(long var1);

   void xsetFld(XmlUnsignedInt var1);

   STDataConsolidateFunction.Enum getSubtotal();

   STDataConsolidateFunction xgetSubtotal();

   boolean isSetSubtotal();

   void setSubtotal(STDataConsolidateFunction.Enum var1);

   void xsetSubtotal(STDataConsolidateFunction var1);

   void unsetSubtotal();

   STShowDataAs$Enum getShowDataAs();

   STShowDataAs xgetShowDataAs();

   boolean isSetShowDataAs();

   void setShowDataAs(STShowDataAs$Enum var1);

   void xsetShowDataAs(STShowDataAs var1);

   void unsetShowDataAs();

   int getBaseField();

   XmlInt xgetBaseField();

   boolean isSetBaseField();

   void setBaseField(int var1);

   void xsetBaseField(XmlInt var1);

   void unsetBaseField();

   long getBaseItem();

   XmlUnsignedInt xgetBaseItem();

   boolean isSetBaseItem();

   void setBaseItem(long var1);

   void xsetBaseItem(XmlUnsignedInt var1);

   void unsetBaseItem();

   long getNumFmtId();

   STNumFmtId xgetNumFmtId();

   boolean isSetNumFmtId();

   void setNumFmtId(long var1);

   void xsetNumFmtId(STNumFmtId var1);

   void unsetNumFmtId();


   public static final class Factory {

      public static CTDataField newInstance() {
         return (CTDataField)POIXMLTypeLoader.newInstance(CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField newInstance(XmlOptions var0) {
         return (CTDataField)POIXMLTypeLoader.newInstance(CTDataField.type, var0);
      }

      public static CTDataField parse(String var0) throws XmlException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static CTDataField parse(File var0) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static CTDataField parse(URL var0) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static CTDataField parse(InputStream var0) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static CTDataField parse(Reader var0) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static CTDataField parse(XMLStreamReader var0) throws XmlException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static CTDataField parse(Node var0) throws XmlException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static CTDataField parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, (XmlOptions)null);
      }

      public static CTDataField parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDataField)POIXMLTypeLoader.parse(var0, CTDataField.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataField.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataField.type, var1);
      }

   }
}
