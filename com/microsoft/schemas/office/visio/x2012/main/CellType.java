package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.RefByType;
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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CellType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CellType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("celltyped857type");


   List getRefByList();

   RefByType[] getRefByArray();

   RefByType getRefByArray(int var1);

   int sizeOfRefByArray();

   void setRefByArray(RefByType[] var1);

   void setRefByArray(int var1, RefByType var2);

   RefByType insertNewRefBy(int var1);

   RefByType addNewRefBy();

   void removeRefBy(int var1);

   String getN();

   XmlString xgetN();

   void setN(String var1);

   void xsetN(XmlString var1);

   String getU();

   XmlString xgetU();

   boolean isSetU();

   void setU(String var1);

   void xsetU(XmlString var1);

   void unsetU();

   String getE();

   XmlString xgetE();

   boolean isSetE();

   void setE(String var1);

   void xsetE(XmlString var1);

   void unsetE();

   String getF();

   XmlString xgetF();

   boolean isSetF();

   void setF(String var1);

   void xsetF(XmlString var1);

   void unsetF();

   String getV();

   XmlString xgetV();

   boolean isSetV();

   void setV(String var1);

   void xsetV(XmlString var1);

   void unsetV();


   public static final class Factory {

      public static CellType newInstance() {
         return (CellType)POIXMLTypeLoader.newInstance(CellType.type, (XmlOptions)null);
      }

      public static CellType newInstance(XmlOptions var0) {
         return (CellType)POIXMLTypeLoader.newInstance(CellType.type, var0);
      }

      public static CellType parse(String var0) throws XmlException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(String var0, XmlOptions var1) throws XmlException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static CellType parse(File var0) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static CellType parse(URL var0) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static CellType parse(InputStream var0) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static CellType parse(Reader var0) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static CellType parse(XMLStreamReader var0) throws XmlException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static CellType parse(Node var0) throws XmlException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static CellType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, (XmlOptions)null);
      }

      public static CellType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CellType)POIXMLTypeLoader.parse(var0, CellType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CellType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CellType.type, var1);
      }

   }
}
