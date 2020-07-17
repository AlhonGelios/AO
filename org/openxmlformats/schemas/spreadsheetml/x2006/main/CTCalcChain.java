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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.w3c.dom.Node;

public interface CTCalcChain extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCalcChain.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcalcchain5a0btype");


   List getCList();

   CTCalcCell[] getCArray();

   CTCalcCell getCArray(int var1);

   int sizeOfCArray();

   void setCArray(CTCalcCell[] var1);

   void setCArray(int var1, CTCalcCell var2);

   CTCalcCell insertNewC(int var1);

   CTCalcCell addNewC();

   void removeC(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTCalcChain newInstance() {
         return (CTCalcChain)POIXMLTypeLoader.newInstance(CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain newInstance(XmlOptions var0) {
         return (CTCalcChain)POIXMLTypeLoader.newInstance(CTCalcChain.type, var0);
      }

      public static CTCalcChain parse(String var0) throws XmlException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static CTCalcChain parse(File var0) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static CTCalcChain parse(URL var0) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static CTCalcChain parse(InputStream var0) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static CTCalcChain parse(Reader var0) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static CTCalcChain parse(XMLStreamReader var0) throws XmlException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static CTCalcChain parse(Node var0) throws XmlException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static CTCalcChain parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static CTCalcChain parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCalcChain)POIXMLTypeLoader.parse(var0, CTCalcChain.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCalcChain.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCalcChain.type, var1);
      }

   }
}
