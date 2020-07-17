package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;
import org.w3c.dom.Node;

public interface CTTextField extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextfield187etype");


   CTTextCharacterProperties getRPr();

   boolean isSetRPr();

   void setRPr(CTTextCharacterProperties var1);

   CTTextCharacterProperties addNewRPr();

   void unsetRPr();

   CTTextParagraphProperties getPPr();

   boolean isSetPPr();

   void setPPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewPPr();

   void unsetPPr();

   String getT();

   XmlString xgetT();

   boolean isSetT();

   void setT(String var1);

   void xsetT(XmlString var1);

   void unsetT();

   String getId();

   STGuid xgetId();

   void setId(String var1);

   void xsetId(STGuid var1);

   String getType();

   XmlString xgetType();

   boolean isSetType();

   void setType(String var1);

   void xsetType(XmlString var1);

   void unsetType();


   public static final class Factory {

      public static CTTextField newInstance() {
         return (CTTextField)POIXMLTypeLoader.newInstance(CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField newInstance(XmlOptions var0) {
         return (CTTextField)POIXMLTypeLoader.newInstance(CTTextField.type, var0);
      }

      public static CTTextField parse(String var0) throws XmlException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static CTTextField parse(File var0) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static CTTextField parse(URL var0) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static CTTextField parse(InputStream var0) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static CTTextField parse(Reader var0) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static CTTextField parse(XMLStreamReader var0) throws XmlException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static CTTextField parse(Node var0) throws XmlException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static CTTextField parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, (XmlOptions)null);
      }

      public static CTTextField parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextField)POIXMLTypeLoader.parse(var0, CTTextField.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextField.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextField.type, var1);
      }

   }
}
