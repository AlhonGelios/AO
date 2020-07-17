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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering;
import org.w3c.dom.Node;

public interface CTNumPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumpr16aatype");


   CTDecimalNumber getIlvl();

   boolean isSetIlvl();

   void setIlvl(CTDecimalNumber var1);

   CTDecimalNumber addNewIlvl();

   void unsetIlvl();

   CTDecimalNumber getNumId();

   boolean isSetNumId();

   void setNumId(CTDecimalNumber var1);

   CTDecimalNumber addNewNumId();

   void unsetNumId();

   CTTrackChangeNumbering getNumberingChange();

   boolean isSetNumberingChange();

   void setNumberingChange(CTTrackChangeNumbering var1);

   CTTrackChangeNumbering addNewNumberingChange();

   void unsetNumberingChange();

   CTTrackChange getIns();

   boolean isSetIns();

   void setIns(CTTrackChange var1);

   CTTrackChange addNewIns();

   void unsetIns();


   public static final class Factory {

      public static CTNumPr newInstance() {
         return (CTNumPr)POIXMLTypeLoader.newInstance(CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr newInstance(XmlOptions var0) {
         return (CTNumPr)POIXMLTypeLoader.newInstance(CTNumPr.type, var0);
      }

      public static CTNumPr parse(String var0) throws XmlException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static CTNumPr parse(File var0) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static CTNumPr parse(URL var0) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static CTNumPr parse(InputStream var0) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static CTNumPr parse(Reader var0) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static CTNumPr parse(XMLStreamReader var0) throws XmlException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static CTNumPr parse(Node var0) throws XmlException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static CTNumPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static CTNumPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumPr)POIXMLTypeLoader.parse(var0, CTNumPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumPr.type, var1);
      }

   }
}
