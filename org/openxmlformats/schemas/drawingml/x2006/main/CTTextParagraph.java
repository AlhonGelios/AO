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
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextField;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.w3c.dom.Node;

public interface CTTextParagraph extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextParagraph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextparagraphcaf2type");


   CTTextParagraphProperties getPPr();

   boolean isSetPPr();

   void setPPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewPPr();

   void unsetPPr();

   List getRList();

   CTRegularTextRun[] getRArray();

   CTRegularTextRun getRArray(int var1);

   int sizeOfRArray();

   void setRArray(CTRegularTextRun[] var1);

   void setRArray(int var1, CTRegularTextRun var2);

   CTRegularTextRun insertNewR(int var1);

   CTRegularTextRun addNewR();

   void removeR(int var1);

   List getBrList();

   CTTextLineBreak[] getBrArray();

   CTTextLineBreak getBrArray(int var1);

   int sizeOfBrArray();

   void setBrArray(CTTextLineBreak[] var1);

   void setBrArray(int var1, CTTextLineBreak var2);

   CTTextLineBreak insertNewBr(int var1);

   CTTextLineBreak addNewBr();

   void removeBr(int var1);

   List getFldList();

   CTTextField[] getFldArray();

   CTTextField getFldArray(int var1);

   int sizeOfFldArray();

   void setFldArray(CTTextField[] var1);

   void setFldArray(int var1, CTTextField var2);

   CTTextField insertNewFld(int var1);

   CTTextField addNewFld();

   void removeFld(int var1);

   CTTextCharacterProperties getEndParaRPr();

   boolean isSetEndParaRPr();

   void setEndParaRPr(CTTextCharacterProperties var1);

   CTTextCharacterProperties addNewEndParaRPr();

   void unsetEndParaRPr();


   public static final class Factory {

      public static CTTextParagraph newInstance() {
         return (CTTextParagraph)POIXMLTypeLoader.newInstance(CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph newInstance(XmlOptions var0) {
         return (CTTextParagraph)POIXMLTypeLoader.newInstance(CTTextParagraph.type, var0);
      }

      public static CTTextParagraph parse(String var0) throws XmlException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static CTTextParagraph parse(File var0) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static CTTextParagraph parse(URL var0) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static CTTextParagraph parse(InputStream var0) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static CTTextParagraph parse(Reader var0) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static CTTextParagraph parse(XMLStreamReader var0) throws XmlException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static CTTextParagraph parse(Node var0) throws XmlException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static CTTextParagraph parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static CTTextParagraph parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextParagraph)POIXMLTypeLoader.parse(var0, CTTextParagraph.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextParagraph.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextParagraph.type, var1);
      }

   }
}
