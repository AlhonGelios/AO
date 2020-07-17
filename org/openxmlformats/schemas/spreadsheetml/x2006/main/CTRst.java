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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTRst extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrsta472type");


   String getT();

   STXstring xgetT();

   boolean isSetT();

   void setT(String var1);

   void xsetT(STXstring var1);

   void unsetT();

   List getRList();

   CTRElt[] getRArray();

   CTRElt getRArray(int var1);

   int sizeOfRArray();

   void setRArray(CTRElt[] var1);

   void setRArray(int var1, CTRElt var2);

   CTRElt insertNewR(int var1);

   CTRElt addNewR();

   void removeR(int var1);

   List getRPhList();

   CTPhoneticRun[] getRPhArray();

   CTPhoneticRun getRPhArray(int var1);

   int sizeOfRPhArray();

   void setRPhArray(CTPhoneticRun[] var1);

   void setRPhArray(int var1, CTPhoneticRun var2);

   CTPhoneticRun insertNewRPh(int var1);

   CTPhoneticRun addNewRPh();

   void removeRPh(int var1);

   CTPhoneticPr getPhoneticPr();

   boolean isSetPhoneticPr();

   void setPhoneticPr(CTPhoneticPr var1);

   CTPhoneticPr addNewPhoneticPr();

   void unsetPhoneticPr();


   public static final class Factory {

      public static CTRst newInstance() {
         return (CTRst)POIXMLTypeLoader.newInstance(CTRst.type, (XmlOptions)null);
      }

      public static CTRst newInstance(XmlOptions var0) {
         return (CTRst)POIXMLTypeLoader.newInstance(CTRst.type, var0);
      }

      public static CTRst parse(String var0) throws XmlException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static CTRst parse(File var0) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static CTRst parse(URL var0) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static CTRst parse(InputStream var0) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static CTRst parse(Reader var0) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static CTRst parse(XMLStreamReader var0) throws XmlException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static CTRst parse(Node var0) throws XmlException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static CTRst parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, (XmlOptions)null);
      }

      public static CTRst parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRst)POIXMLTypeLoader.parse(var0, CTRst.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRst.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRst.type, var1);
      }

   }
}
