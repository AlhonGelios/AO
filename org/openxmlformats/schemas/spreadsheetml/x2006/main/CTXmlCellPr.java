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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTXmlCellPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTXmlCellPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctxmlcellprf1datype");


   CTXmlPr getXmlPr();

   void setXmlPr(CTXmlPr var1);

   CTXmlPr addNewXmlPr();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   XmlUnsignedInt xgetId();

   void setId(long var1);

   void xsetId(XmlUnsignedInt var1);

   String getUniqueName();

   STXstring xgetUniqueName();

   boolean isSetUniqueName();

   void setUniqueName(String var1);

   void xsetUniqueName(STXstring var1);

   void unsetUniqueName();


   public static final class Factory {

      public static CTXmlCellPr newInstance() {
         return (CTXmlCellPr)POIXMLTypeLoader.newInstance(CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr newInstance(XmlOptions var0) {
         return (CTXmlCellPr)POIXMLTypeLoader.newInstance(CTXmlCellPr.type, var0);
      }

      public static CTXmlCellPr parse(String var0) throws XmlException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static CTXmlCellPr parse(File var0) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static CTXmlCellPr parse(URL var0) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static CTXmlCellPr parse(InputStream var0) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static CTXmlCellPr parse(Reader var0) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static CTXmlCellPr parse(XMLStreamReader var0) throws XmlException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static CTXmlCellPr parse(Node var0) throws XmlException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static CTXmlCellPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static CTXmlCellPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTXmlCellPr)POIXMLTypeLoader.parse(var0, CTXmlCellPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXmlCellPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTXmlCellPr.type, var1);
      }

   }
}
