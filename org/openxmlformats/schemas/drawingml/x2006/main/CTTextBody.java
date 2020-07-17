package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.w3c.dom.Node;

public interface CTTextBody extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextBody.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextbodya3catype");


   CTTextBodyProperties getBodyPr();

   void setBodyPr(CTTextBodyProperties var1);

   CTTextBodyProperties addNewBodyPr();

   CTTextListStyle getLstStyle();

   boolean isSetLstStyle();

   void setLstStyle(CTTextListStyle var1);

   CTTextListStyle addNewLstStyle();

   void unsetLstStyle();

   List getPList();

   CTTextParagraph[] getPArray();

   CTTextParagraph getPArray(int var1);

   int sizeOfPArray();

   void setPArray(CTTextParagraph[] var1);

   void setPArray(int var1, CTTextParagraph var2);

   CTTextParagraph insertNewP(int var1);

   CTTextParagraph addNewP();

   void removeP(int var1);


   public static final class Factory {

      public static CTTextBody newInstance() {
         return (CTTextBody)POIXMLTypeLoader.newInstance(CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody newInstance(XmlOptions var0) {
         return (CTTextBody)POIXMLTypeLoader.newInstance(CTTextBody.type, var0);
      }

      public static CTTextBody parse(String var0) throws XmlException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static CTTextBody parse(File var0) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static CTTextBody parse(URL var0) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static CTTextBody parse(InputStream var0) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static CTTextBody parse(Reader var0) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static CTTextBody parse(XMLStreamReader var0) throws XmlException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static CTTextBody parse(Node var0) throws XmlException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static CTTextBody parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static CTTextBody parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextBody)POIXMLTypeLoader.parse(var0, CTTextBody.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBody.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBody.type, var1);
      }

   }
}
