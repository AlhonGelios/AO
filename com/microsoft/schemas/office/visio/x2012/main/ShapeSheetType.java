package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.DataType;
import com.microsoft.schemas.office.visio.x2012.main.ForeignDataType;
import com.microsoft.schemas.office.visio.x2012.main.ShapesType;
import com.microsoft.schemas.office.visio.x2012.main.SheetType;
import com.microsoft.schemas.office.visio.x2012.main.TextType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ShapeSheetType extends SheetType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ShapeSheetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("shapesheettype59bbtype");


   TextType getText();

   boolean isSetText();

   void setText(TextType var1);

   TextType addNewText();

   void unsetText();

   DataType getData1();

   boolean isSetData1();

   void setData1(DataType var1);

   DataType addNewData1();

   void unsetData1();

   DataType getData2();

   boolean isSetData2();

   void setData2(DataType var1);

   DataType addNewData2();

   void unsetData2();

   DataType getData3();

   boolean isSetData3();

   void setData3(DataType var1);

   DataType addNewData3();

   void unsetData3();

   ForeignDataType getForeignData();

   boolean isSetForeignData();

   void setForeignData(ForeignDataType var1);

   ForeignDataType addNewForeignData();

   void unsetForeignData();

   ShapesType getShapes();

   boolean isSetShapes();

   void setShapes(ShapesType var1);

   ShapesType addNewShapes();

   void unsetShapes();

   long getID();

   XmlUnsignedInt xgetID();

   void setID(long var1);

   void xsetID(XmlUnsignedInt var1);

   long getOriginalID();

   XmlUnsignedInt xgetOriginalID();

   boolean isSetOriginalID();

   void setOriginalID(long var1);

   void xsetOriginalID(XmlUnsignedInt var1);

   void unsetOriginalID();

   boolean getDel();

   XmlBoolean xgetDel();

   boolean isSetDel();

   void setDel(boolean var1);

   void xsetDel(XmlBoolean var1);

   void unsetDel();

   long getMasterShape();

   XmlUnsignedInt xgetMasterShape();

   boolean isSetMasterShape();

   void setMasterShape(long var1);

   void xsetMasterShape(XmlUnsignedInt var1);

   void unsetMasterShape();

   String getUniqueID();

   XmlString xgetUniqueID();

   boolean isSetUniqueID();

   void setUniqueID(String var1);

   void xsetUniqueID(XmlString var1);

   void unsetUniqueID();

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();

   String getNameU();

   XmlString xgetNameU();

   boolean isSetNameU();

   void setNameU(String var1);

   void xsetNameU(XmlString var1);

   void unsetNameU();

   boolean getIsCustomName();

   XmlBoolean xgetIsCustomName();

   boolean isSetIsCustomName();

   void setIsCustomName(boolean var1);

   void xsetIsCustomName(XmlBoolean var1);

   void unsetIsCustomName();

   boolean getIsCustomNameU();

   XmlBoolean xgetIsCustomNameU();

   boolean isSetIsCustomNameU();

   void setIsCustomNameU(boolean var1);

   void xsetIsCustomNameU(XmlBoolean var1);

   void unsetIsCustomNameU();

   long getMaster();

   XmlUnsignedInt xgetMaster();

   boolean isSetMaster();

   void setMaster(long var1);

   void xsetMaster(XmlUnsignedInt var1);

   void unsetMaster();

   String getType();

   XmlToken xgetType();

   boolean isSetType();

   void setType(String var1);

   void xsetType(XmlToken var1);

   void unsetType();


   public static final class Factory {

      public static ShapeSheetType newInstance() {
         return (ShapeSheetType)POIXMLTypeLoader.newInstance(ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType newInstance(XmlOptions var0) {
         return (ShapeSheetType)POIXMLTypeLoader.newInstance(ShapeSheetType.type, var0);
      }

      public static ShapeSheetType parse(String var0) throws XmlException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(String var0, XmlOptions var1) throws XmlException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static ShapeSheetType parse(File var0) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static ShapeSheetType parse(URL var0) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static ShapeSheetType parse(InputStream var0) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static ShapeSheetType parse(Reader var0) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static ShapeSheetType parse(XMLStreamReader var0) throws XmlException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static ShapeSheetType parse(Node var0) throws XmlException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(Node var0, XmlOptions var1) throws XmlException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static ShapeSheetType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static ShapeSheetType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ShapeSheetType)POIXMLTypeLoader.parse(var0, ShapeSheetType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ShapeSheetType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ShapeSheetType.type, var1);
      }

   }
}
