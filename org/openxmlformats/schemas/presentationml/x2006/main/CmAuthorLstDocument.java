package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList;
import org.w3c.dom.Node;

public interface CmAuthorLstDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CmAuthorLstDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cmauthorlst86abdoctype");


   CTCommentAuthorList getCmAuthorLst();

   void setCmAuthorLst(CTCommentAuthorList var1);

   CTCommentAuthorList addNewCmAuthorLst();


   public static final class Factory {

      public static CmAuthorLstDocument newInstance() {
         return (CmAuthorLstDocument)POIXMLTypeLoader.newInstance(CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument newInstance(XmlOptions var0) {
         return (CmAuthorLstDocument)POIXMLTypeLoader.newInstance(CmAuthorLstDocument.type, var0);
      }

      public static CmAuthorLstDocument parse(String var0) throws XmlException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static CmAuthorLstDocument parse(File var0) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static CmAuthorLstDocument parse(URL var0) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static CmAuthorLstDocument parse(InputStream var0) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static CmAuthorLstDocument parse(Reader var0) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static CmAuthorLstDocument parse(XMLStreamReader var0) throws XmlException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static CmAuthorLstDocument parse(Node var0) throws XmlException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static CmAuthorLstDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static CmAuthorLstDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CmAuthorLstDocument)POIXMLTypeLoader.parse(var0, CmAuthorLstDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CmAuthorLstDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CmAuthorLstDocument.type, var1);
      }

   }
}
