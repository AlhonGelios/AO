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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo$Enum;
import org.w3c.dom.Node;

public interface CTPTab extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPTab.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctptaba283type");


   STPTabAlignment$Enum getAlignment();

   STPTabAlignment xgetAlignment();

   void setAlignment(STPTabAlignment$Enum var1);

   void xsetAlignment(STPTabAlignment var1);

   STPTabRelativeTo$Enum getRelativeTo();

   STPTabRelativeTo xgetRelativeTo();

   void setRelativeTo(STPTabRelativeTo$Enum var1);

   void xsetRelativeTo(STPTabRelativeTo var1);

   STPTabLeader$Enum getLeader();

   STPTabLeader xgetLeader();

   void setLeader(STPTabLeader$Enum var1);

   void xsetLeader(STPTabLeader var1);


   public static final class Factory {

      public static CTPTab newInstance() {
         return (CTPTab)POIXMLTypeLoader.newInstance(CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab newInstance(XmlOptions var0) {
         return (CTPTab)POIXMLTypeLoader.newInstance(CTPTab.type, var0);
      }

      public static CTPTab parse(String var0) throws XmlException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static CTPTab parse(File var0) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static CTPTab parse(URL var0) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static CTPTab parse(InputStream var0) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static CTPTab parse(Reader var0) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static CTPTab parse(XMLStreamReader var0) throws XmlException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static CTPTab parse(Node var0) throws XmlException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static CTPTab parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, (XmlOptions)null);
      }

      public static CTPTab parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPTab)POIXMLTypeLoader.parse(var0, CTPTab.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPTab.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPTab.type, var1);
      }

   }
}
