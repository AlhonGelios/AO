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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet;
import org.w3c.dom.Node;

public interface CTNumbering extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumbering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumberingfdf9type");


   List getNumPicBulletList();

   CTNumPicBullet[] getNumPicBulletArray();

   CTNumPicBullet getNumPicBulletArray(int var1);

   int sizeOfNumPicBulletArray();

   void setNumPicBulletArray(CTNumPicBullet[] var1);

   void setNumPicBulletArray(int var1, CTNumPicBullet var2);

   CTNumPicBullet insertNewNumPicBullet(int var1);

   CTNumPicBullet addNewNumPicBullet();

   void removeNumPicBullet(int var1);

   List getAbstractNumList();

   CTAbstractNum[] getAbstractNumArray();

   CTAbstractNum getAbstractNumArray(int var1);

   int sizeOfAbstractNumArray();

   void setAbstractNumArray(CTAbstractNum[] var1);

   void setAbstractNumArray(int var1, CTAbstractNum var2);

   CTAbstractNum insertNewAbstractNum(int var1);

   CTAbstractNum addNewAbstractNum();

   void removeAbstractNum(int var1);

   List getNumList();

   CTNum[] getNumArray();

   CTNum getNumArray(int var1);

   int sizeOfNumArray();

   void setNumArray(CTNum[] var1);

   void setNumArray(int var1, CTNum var2);

   CTNum insertNewNum(int var1);

   CTNum addNewNum();

   void removeNum(int var1);

   CTDecimalNumber getNumIdMacAtCleanup();

   boolean isSetNumIdMacAtCleanup();

   void setNumIdMacAtCleanup(CTDecimalNumber var1);

   CTDecimalNumber addNewNumIdMacAtCleanup();

   void unsetNumIdMacAtCleanup();


   public static final class Factory {

      public static CTNumbering newInstance() {
         return (CTNumbering)POIXMLTypeLoader.newInstance(CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering newInstance(XmlOptions var0) {
         return (CTNumbering)POIXMLTypeLoader.newInstance(CTNumbering.type, var0);
      }

      public static CTNumbering parse(String var0) throws XmlException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static CTNumbering parse(File var0) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static CTNumbering parse(URL var0) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static CTNumbering parse(InputStream var0) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static CTNumbering parse(Reader var0) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static CTNumbering parse(XMLStreamReader var0) throws XmlException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static CTNumbering parse(Node var0) throws XmlException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static CTNumbering parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static CTNumbering parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumbering)POIXMLTypeLoader.parse(var0, CTNumbering.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumbering.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumbering.type, var1);
      }

   }
}
