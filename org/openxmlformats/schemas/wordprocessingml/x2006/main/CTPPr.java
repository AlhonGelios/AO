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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.w3c.dom.Node;

public interface CTPPr extends CTPPrBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctppr01c0type");


   CTParaRPr getRPr();

   boolean isSetRPr();

   void setRPr(CTParaRPr var1);

   CTParaRPr addNewRPr();

   void unsetRPr();

   CTSectPr getSectPr();

   boolean isSetSectPr();

   void setSectPr(CTSectPr var1);

   CTSectPr addNewSectPr();

   void unsetSectPr();

   CTPPrChange getPPrChange();

   boolean isSetPPrChange();

   void setPPrChange(CTPPrChange var1);

   CTPPrChange addNewPPrChange();

   void unsetPPrChange();


   public static final class Factory {

      public static CTPPr newInstance() {
         return (CTPPr)POIXMLTypeLoader.newInstance(CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr newInstance(XmlOptions var0) {
         return (CTPPr)POIXMLTypeLoader.newInstance(CTPPr.type, var0);
      }

      public static CTPPr parse(String var0) throws XmlException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static CTPPr parse(File var0) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static CTPPr parse(URL var0) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static CTPPr parse(InputStream var0) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static CTPPr parse(Reader var0) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static CTPPr parse(XMLStreamReader var0) throws XmlException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static CTPPr parse(Node var0) throws XmlException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static CTPPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, (XmlOptions)null);
      }

      public static CTPPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPPr)POIXMLTypeLoader.parse(var0, CTPPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPPr.type, var1);
      }

   }
}
