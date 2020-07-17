package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface SectionType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sectiontype30a6type");


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

   List getRowList();

   RowType[] getRowArray();

   RowType getRowArray(int var1);

   int sizeOfRowArray();

   void setRowArray(RowType[] var1);

   void setRowArray(int var1, RowType var2);

   RowType insertNewRow(int var1);

   RowType addNewRow();

   void removeRow(int var1);

   String getN();

   XmlString xgetN();

   void setN(String var1);

   void xsetN(XmlString var1);

   boolean getDel();

   XmlBoolean xgetDel();

   boolean isSetDel();

   void setDel(boolean var1);

   void xsetDel(XmlBoolean var1);

   void unsetDel();

   long getIX();

   XmlUnsignedInt xgetIX();

   boolean isSetIX();

   void setIX(long var1);

   void xsetIX(XmlUnsignedInt var1);

   void unsetIX();


   public static final class Factory {

      public static SectionType newInstance() {
         return (SectionType)POIXMLTypeLoader.newInstance(SectionType.type, (XmlOptions)null);
      }

      public static SectionType newInstance(XmlOptions var0) {
         return (SectionType)POIXMLTypeLoader.newInstance(SectionType.type, var0);
      }

      public static SectionType parse(String var0) throws XmlException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(String var0, XmlOptions var1) throws XmlException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static SectionType parse(File var0) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static SectionType parse(URL var0) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static SectionType parse(InputStream var0) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static SectionType parse(Reader var0) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static SectionType parse(XMLStreamReader var0) throws XmlException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static SectionType parse(Node var0) throws XmlException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(Node var0, XmlOptions var1) throws XmlException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static SectionType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, (XmlOptions)null);
      }

      public static SectionType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SectionType)POIXMLTypeLoader.parse(var0, SectionType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SectionType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SectionType.type, var1);
      }

   }
}
