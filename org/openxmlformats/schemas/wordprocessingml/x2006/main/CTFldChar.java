package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.w3c.dom.Node;

public interface CTFldChar extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFldChar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfldchare83etype");


   CTText getFldData();

   boolean isSetFldData();

   void setFldData(CTText var1);

   CTText addNewFldData();

   void unsetFldData();

   CTFFData getFfData();

   boolean isSetFfData();

   void setFfData(CTFFData var1);

   CTFFData addNewFfData();

   void unsetFfData();

   CTTrackChangeNumbering getNumberingChange();

   boolean isSetNumberingChange();

   void setNumberingChange(CTTrackChangeNumbering var1);

   CTTrackChangeNumbering addNewNumberingChange();

   void unsetNumberingChange();

   STFldCharType.Enum getFldCharType();

   STFldCharType xgetFldCharType();

   void setFldCharType(STFldCharType.Enum var1);

   void xsetFldCharType(STFldCharType var1);

   STOnOff.Enum getFldLock();

   STOnOff xgetFldLock();

   boolean isSetFldLock();

   void setFldLock(STOnOff.Enum var1);

   void xsetFldLock(STOnOff var1);

   void unsetFldLock();

   STOnOff.Enum getDirty();

   STOnOff xgetDirty();

   boolean isSetDirty();

   void setDirty(STOnOff.Enum var1);

   void xsetDirty(STOnOff var1);

   void unsetDirty();


   public static final class Factory {

      public static CTFldChar newInstance() {
         return (CTFldChar)POIXMLTypeLoader.newInstance(CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar newInstance(XmlOptions var0) {
         return (CTFldChar)POIXMLTypeLoader.newInstance(CTFldChar.type, var0);
      }

      public static CTFldChar parse(String var0) throws XmlException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static CTFldChar parse(File var0) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static CTFldChar parse(URL var0) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static CTFldChar parse(InputStream var0) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static CTFldChar parse(Reader var0) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static CTFldChar parse(XMLStreamReader var0) throws XmlException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static CTFldChar parse(Node var0) throws XmlException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static CTFldChar parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static CTFldChar parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFldChar)POIXMLTypeLoader.parse(var0, CTFldChar.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFldChar.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFldChar.type, var1);
      }

   }
}
