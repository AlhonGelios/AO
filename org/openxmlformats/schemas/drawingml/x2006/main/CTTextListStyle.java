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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.w3c.dom.Node;

public interface CTTextListStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextListStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextliststyleab77type");


   CTTextParagraphProperties getDefPPr();

   boolean isSetDefPPr();

   void setDefPPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewDefPPr();

   void unsetDefPPr();

   CTTextParagraphProperties getLvl1PPr();

   boolean isSetLvl1PPr();

   void setLvl1PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl1PPr();

   void unsetLvl1PPr();

   CTTextParagraphProperties getLvl2PPr();

   boolean isSetLvl2PPr();

   void setLvl2PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl2PPr();

   void unsetLvl2PPr();

   CTTextParagraphProperties getLvl3PPr();

   boolean isSetLvl3PPr();

   void setLvl3PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl3PPr();

   void unsetLvl3PPr();

   CTTextParagraphProperties getLvl4PPr();

   boolean isSetLvl4PPr();

   void setLvl4PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl4PPr();

   void unsetLvl4PPr();

   CTTextParagraphProperties getLvl5PPr();

   boolean isSetLvl5PPr();

   void setLvl5PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl5PPr();

   void unsetLvl5PPr();

   CTTextParagraphProperties getLvl6PPr();

   boolean isSetLvl6PPr();

   void setLvl6PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl6PPr();

   void unsetLvl6PPr();

   CTTextParagraphProperties getLvl7PPr();

   boolean isSetLvl7PPr();

   void setLvl7PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl7PPr();

   void unsetLvl7PPr();

   CTTextParagraphProperties getLvl8PPr();

   boolean isSetLvl8PPr();

   void setLvl8PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl8PPr();

   void unsetLvl8PPr();

   CTTextParagraphProperties getLvl9PPr();

   boolean isSetLvl9PPr();

   void setLvl9PPr(CTTextParagraphProperties var1);

   CTTextParagraphProperties addNewLvl9PPr();

   void unsetLvl9PPr();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTTextListStyle newInstance() {
         return (CTTextListStyle)POIXMLTypeLoader.newInstance(CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle newInstance(XmlOptions var0) {
         return (CTTextListStyle)POIXMLTypeLoader.newInstance(CTTextListStyle.type, var0);
      }

      public static CTTextListStyle parse(String var0) throws XmlException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static CTTextListStyle parse(File var0) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static CTTextListStyle parse(URL var0) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static CTTextListStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static CTTextListStyle parse(Reader var0) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static CTTextListStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static CTTextListStyle parse(Node var0) throws XmlException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static CTTextListStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static CTTextListStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextListStyle)POIXMLTypeLoader.parse(var0, CTTextListStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextListStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextListStyle.type, var1);
      }

   }
}
