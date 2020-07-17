package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.SectionType;
import com.microsoft.schemas.office.visio.x2012.main.TriggerType;
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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface SheetType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SheetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sheettype25actype");


   List getCellList();

   CellType[] getCellArray();

   CellType getCellArray(int var1);

   int sizeOfCellArray();

   void setCellArray(CellType[] var1);

   void setCellArray(int var1, CellType var2);

   CellType insertNewCell(int var1);

   CellType addNewCell();

   void removeCell(int var1);

   List getTriggerList();

   TriggerType[] getTriggerArray();

   TriggerType getTriggerArray(int var1);

   int sizeOfTriggerArray();

   void setTriggerArray(TriggerType[] var1);

   void setTriggerArray(int var1, TriggerType var2);

   TriggerType insertNewTrigger(int var1);

   TriggerType addNewTrigger();

   void removeTrigger(int var1);

   List getSectionList();

   SectionType[] getSectionArray();

   SectionType getSectionArray(int var1);

   int sizeOfSectionArray();

   void setSectionArray(SectionType[] var1);

   void setSectionArray(int var1, SectionType var2);

   SectionType insertNewSection(int var1);

   SectionType addNewSection();

   void removeSection(int var1);

   long getLineStyle();

   XmlUnsignedInt xgetLineStyle();

   boolean isSetLineStyle();

   void setLineStyle(long var1);

   void xsetLineStyle(XmlUnsignedInt var1);

   void unsetLineStyle();

   long getFillStyle();

   XmlUnsignedInt xgetFillStyle();

   boolean isSetFillStyle();

   void setFillStyle(long var1);

   void xsetFillStyle(XmlUnsignedInt var1);

   void unsetFillStyle();

   long getTextStyle();

   XmlUnsignedInt xgetTextStyle();

   boolean isSetTextStyle();

   void setTextStyle(long var1);

   void xsetTextStyle(XmlUnsignedInt var1);

   void unsetTextStyle();


   public static final class Factory {

      public static SheetType newInstance() {
         return (SheetType)POIXMLTypeLoader.newInstance(SheetType.type, (XmlOptions)null);
      }

      public static SheetType newInstance(XmlOptions var0) {
         return (SheetType)POIXMLTypeLoader.newInstance(SheetType.type, var0);
      }

      public static SheetType parse(String var0) throws XmlException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(String var0, XmlOptions var1) throws XmlException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static SheetType parse(File var0) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static SheetType parse(URL var0) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static SheetType parse(InputStream var0) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static SheetType parse(Reader var0) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static SheetType parse(XMLStreamReader var0) throws XmlException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static SheetType parse(Node var0) throws XmlException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(Node var0, XmlOptions var1) throws XmlException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static SheetType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, (XmlOptions)null);
      }

      public static SheetType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SheetType)POIXMLTypeLoader.parse(var0, SheetType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SheetType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SheetType.type, var1);
      }

   }
}
